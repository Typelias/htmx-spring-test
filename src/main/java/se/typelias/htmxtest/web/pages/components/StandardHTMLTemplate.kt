package se.typelias.htmxtest.web.pages.components

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun standardHTMLTemplate(title: String, bodyContent: BODY.() -> Unit): String = createHTML().html {
    head {
        // <meta name="viewport" content="width=device-width, initial-scale=1">
        meta {
            name = "viewport"
            content = "width=device-width, initial-scale=1"
        }
        title(title)
        unsafe {
            raw("""<script src="https://unpkg.com/htmx.org@1.9.12" integrity="sha384-ujb1lZYygJmzgSwoxRggbCHcjc0rB2XoQrxeTUQyRjrOnlCoYta87iKBWq3EsdM2" crossorigin="anonymous"></script>""")
        }
        script { src = "https://cdn.tailwindcss.com" }
    }
    body {
        classes = setOf("pb-16", "bg-gray-200", "text-gray-800")
        navbar().render()
        bodyContent()
        footerComponent().render()

    }
}