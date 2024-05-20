package se.typelias.htmxtest.web.pages.components

import kotlinx.html.*

fun footerComponent() = Component {
    footer {
        classes = setOf("fixed", "bottom-0", "w-full", "bg-gray-800", "text-center", "p-4")
        a {
            classes = setOf("text-white", "hover:text-gray-300")
            target = "_blank"
            href = "https://github.com/Typelias/htmx-spring-test"
            +"Source code"
        }
    }
}