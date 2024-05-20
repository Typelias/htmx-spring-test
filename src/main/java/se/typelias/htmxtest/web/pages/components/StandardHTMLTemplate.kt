package se.typelias.htmxtest.web.pages.components

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun standardHTMLTemplate(title: String, content: BODY.() -> Unit): String = createHTML().html {
    head {
        title(title)
        unsafe {
            raw("""<script src="https://unpkg.com/htmx.org@1.9.12" integrity="sha384-ujb1lZYygJmzgSwoxRggbCHcjc0rB2XoQrxeTUQyRjrOnlCoYta87iKBWq3EsdM2" crossorigin="anonymous"></script>""")
        }
        script { src = "https://cdn.tailwindcss.com" }
    }
    body {
        content()
    }
}