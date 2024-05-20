package se.typelias.htmxtest.web.pages
import kotlinx.html.*
import se.typelias.htmxtest.web.pages.components.card
import se.typelias.htmxtest.web.pages.components.navbar
import se.typelias.htmxtest.web.pages.components.standardHTMLTemplate

fun createIndexPage(): String = standardHTMLTemplate("My very good blog or something") {
    classes = setOf("bg-gray-200", "text-gray-800")
    navbar().render()
    div {
        classes = setOf("grid", "grid-flow-col", "auto-cols-max", "gap-4", "m-4", "justify-center")
        card(
            "This page",
            """
                This is a mashup of diferent technologies that I wanted to try out.
                It uses both Java and Kotlin, and is built with Spring Boot/Jersey.
                The "Web" part of the application uses kotlin HTML templating and HTMX for frontend logic.
            """.trimIndent()
            ).render()

        card(
            "Spring Boot",
            """
                Spring Boot is used as a base for the application.
                It provides a robust range of features and plugins to simplify the backend development process.
            """.trimIndent()
        ).render()
        card(
            "Jersey",
            """
                Jersey is a implementation of the Jakarta REST-ful Web Services specification.
                Here it is used by Spring Boot to provide REST-ful services.
                This was chosen instead of Spring MVC as I am more used to it, and as it can use spring boot features such as spring security.
            """.trimIndent()
        ).render()
        card(
            "Kotlinx-html",
            """
                Kotlinx-html is used as the templating language for this application.
                I saw that Ktor had this as an option and I wanted to try it.
                It allows for type-safe HTML in kotlin and can be used to create component like structures.
                For example, the navbar is a component that is reused on every page.
                It also allows for easy use of a component for both response from the API and for the initial template
            """.trimIndent()
        ).render()
        card(
            "HTMX",
            """
                For "logic" in the frontend, HTMX is used.
                Instead of writing JavaScript to convert a typical JSON response to HTML, the backend just responds with pure HTML.
                HTMX uses takes this response and replaces the desired element with the new HTML.
                With this, we can create a SPA like experience without any large JavaScript framework.
            """.trimIndent()
        ).render()
    }
}