package se.typelias.htmxtest.web.pages.components
import kotlinx.html.*

fun counter (count: Int = 0) = Component {
    div {
        classes = setOf("inline-flex", "space-x-2", "items-center")
        id = "counter"
        button {
            classes = setOf("bg-gray-300 hover:bg-gray-400 text-gray-800 font-bold py-1 px-4 rounded")
            attributes["hx-post"] = "/api/counter/decrement?counterValue=$count"
            attributes["hx-target"] = "#counter"
            +"-"
        }
        p {
            classes = setOf("font-bold", "text-xl", "min-w-5", "text-center")
            +"$count"
        }
        button {
            classes = setOf("bg-gray-300 hover:bg-gray-400 text-gray-800 font-bold py-1 px-4 rounded")
            attributes["hx-post"] = "/api/counter/increment?counterValue=$count"
            attributes["hx-target"] = "#counter"
            +"+"
        }
    }
}