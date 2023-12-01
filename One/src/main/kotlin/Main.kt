import java.io.File

fun main(args: Array<String>) {
    val parser = Parser()
    val entries = mutableListOf<Int>()
    var result = 0

    File("calibration.txt").forEachLine { entries += parser.parseRow(it) }

    for(entry in entries){
        result += entry
    }

    println("The calibration number is...: $result")
}