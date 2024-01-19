fun main() {
    var i = 0
    while (i < 1000) {
        if (i == 20) {
            // Stop interaction
            break
        }
        print("$i ")
        i++
    }

    println("\n")

    val str = "Test Profile"
    var j = 0
    while (j < str.length) {
        if ((str[j] == 'p') || (str[j] == 'P')) {
            break
        }
        print("${str[j]} ")
        j++
    }

    println("\n")

    for (i in 0..20) {
        if (i % 2 == 1) {
            continue
        }
        print("Pair numbers: $i ")
    }

    println("\n")

    println("Type your Text:")
    val yourText = readlnOrNull() ?: ""
    val arrayVowel = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    print("Without vowels: ")
    for (index in yourText.indices) {
        var isVowel = false
        for (element in arrayVowel) {
            if (yourText[index] == element) {
                isVowel = true
                break
            }
        }
        if (!isVowel) print("${yourText[index]} ")
    }
}