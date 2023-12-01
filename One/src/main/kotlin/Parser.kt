class Parser {
    fun parseRow(input: String): Int {
        val digits = mutableListOf<Int>()
        for(ch in input.toList()){
            if(ch.isDigit()){
                digits += ch.digitToInt()
            }
        }

        if (digits.size == 1){
            digits += digits[0]
        }

        return (digits[0] * 10) + digits[digits.size - 1]
    }
}