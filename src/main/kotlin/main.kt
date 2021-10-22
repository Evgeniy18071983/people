fun main() {
    var likes =211
    var lastNumber = likes % 10
    var penultimateNumber = likes % 100
    if (lastNumber == 1 && likes!=11 && penultimateNumber != 11) {
        println("Понравилось $likes человеку")
        }
        else {
            println("Понравилось $likes людям")

        }
    }
