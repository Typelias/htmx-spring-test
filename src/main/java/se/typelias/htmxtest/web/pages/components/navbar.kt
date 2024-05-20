package se.typelias.htmxtest.web.pages.components

import kotlinx.html.*

fun navbar() = Component {
    nav {
        classes = setOf("bg-gray-800", "text-white", "p-4", "flex", "space-x-4")
        a {
            classes = setOf("hover:text-gray-300")
            href = "/"
            +"Home"
        }
        a {
            classes = setOf("hover:text-gray-300")
            href = "/counter"
            +"Counter"
        }
    }
}