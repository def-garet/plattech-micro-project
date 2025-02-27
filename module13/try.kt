fun main() {
    print("\n survey form for ABC Telco internet performance")

    println("\nEnter respondents name: ")
    val name = readLine()

    println("\n your name is $name ")

    print("\n")
    print("\n From 1 to 5 rate the following service")
    val i = readLine()?.toIntOrNull() ?: 0
    print("\n")
    print("\n How you satisfied with our website usability?")
    val y = readLine()?.toIntOrNull() ?: 0

    print("\n This is your survey data?")
    print("\n")
    print("\n Service: $1")
    print("\n Usability: $y")
}
