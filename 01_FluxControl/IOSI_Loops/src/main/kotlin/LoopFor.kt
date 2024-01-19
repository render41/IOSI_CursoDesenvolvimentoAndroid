fun main() {
    for (i: Int in 1..10) {
       print("$i / ")
    }

    print("\n\n")

    for (i: Int in 1 downTo -20) {
        print("$i ")
    }

    print("\n\n")

    for (i: Int in 2 .. 20 step 2) {
        print("$i ")
    }
}