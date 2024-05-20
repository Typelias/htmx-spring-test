package se.typelias.htmxtest.web.pages.components

import kotlinx.html.*

fun card(title: String, content: String) = Component {
    div {
        classes = setOf("max-w-sm", "rounded", "bg-white", "shadow-lg", "p-4")
        div {
            classes = setOf("font-bold", "text-xl", "mb-2", "mr-4")
            +title
        }
        p {
            classes = setOf("text-gray-700", "text-base", "mb-4")
            +content
        }
    }
}