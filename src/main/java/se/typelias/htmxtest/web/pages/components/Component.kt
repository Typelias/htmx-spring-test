package se.typelias.htmxtest.web.pages.components

import kotlinx.html.FlowContent
import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML
import java.io.ByteArrayOutputStream

data class Component(val block: TagConsumer<*>.() -> Unit) {
    context(FlowContent)
    fun render() = block.invoke(consumer)

    override fun toString(): String {
        val baos = ByteArrayOutputStream()
        val writer = baos.writer()
        writer.appendHTML().block()
        writer.close()
        return baos.toString()
    }
}