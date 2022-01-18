import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

class CatalogoLibrosXML() {
    init {
        fun readXml(pathName: String): Document {
            val xmlFile = File(pathName)
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile)
        }
    }
}

fun constructor(cargador: String) {

    return
}
fun obtenerListaNodosPorNombre(doc: Document, tagName: String): MutableList<Node>
{
    val bookList: NodeList = doc.getElementsByTagName(tagName)
    val lista = mutableListOf<Node>()
    for (i in 0..bookList.length - 1)
        lista.add(bookList.item(i))
    return lista
}
fun existeLibro(idLibro: String,): Boolean {
    val l = obtenerListaNodosPorNombre(i)

}

/*fun infoLibro(idLibro: String): Map<String, Any> {

}*/



fun main(){

}