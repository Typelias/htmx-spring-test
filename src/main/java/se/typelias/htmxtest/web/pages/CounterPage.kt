package se.typelias.htmxtest.web.pages

import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.p
import se.typelias.htmxtest.web.pages.components.counter
import se.typelias.htmxtest.web.pages.components.navbar
import se.typelias.htmxtest.web.pages.components.standardHTMLTemplate

fun createCounterPage(): String = standardHTMLTemplate("Counter") {
    classes = setOf("bg-gray-200", "text-gray-800")
    navbar().render()
    div {
        classes = setOf("flex", "justify-center", "mt-4")
        div {
            classes = setOf("max-w-sm","rounded", "bg-white", "shadow-lg", "p-4")
            div {
                classes = setOf("font-bold", "text-xl", "mb-2", "mr-4")
                +"Counter"
            }
            p {
                classes = setOf("text-gray-700", "text-base", "mb-4")
                +"""
                    This counter is implemented with HTMX.
                    Whenever a button is pressed, it will send an api request to the server.
                    It can either increment or decrement the counter, and will send the current value as a query parameter to the controller.
                    The server will respond with HTML and replace the current counter HTML, this is done by the HTMX library
                """.trimIndent()
            }
            div {
                // Center this horizontally
                classes = setOf("flex", "justify-center")
                counter().render()
            }
        }
    }
}