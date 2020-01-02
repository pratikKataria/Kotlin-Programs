fun main(argser : Array<String>) {
    for (i in 1..100) {
        var value = true
        for (j in 2..100) {
            if (j == i) {
                break
            }
            else if (j < i && i%j == 0) {
                value = false
            }
        }
        if (value) {
            print("   "+i)
        }
    }
}