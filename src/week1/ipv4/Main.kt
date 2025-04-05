package week1.ipv4

fun main(){
    println(ipv4Checker("0.1.30.20"))
}
// the chance - bijing squad
fun ipv4Checker(ipv4: String): Boolean{
    // Check if the string is empty or doesn't have exactly 3 dots
    if(ipv4.isEmpty() || ipv4.count{it == '.'} != 3) return false

    // Split the string by dots
    val segments = ipv4.split(".")           //{0, 1, 30, @}
    if(segments.size !=4) return false

    // Validate each segment
    for (segment in segments) {
        // Check for empty segments or non-numeric content
        if (!segment.all { it.isDigit() }) return false

        // Check for leading zeros (but allow "0" itself)
        if (segment.length > 1 && segment.startsWith("0")) return false

        // Convert to integer and check range
        val value = segment.toIntOrNull() ?: return false
        if (value !in 0..255) return false
    }
    return true
}