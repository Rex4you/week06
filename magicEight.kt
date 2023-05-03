fun main() {
    val responses = arrayOf(
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes, definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes"
    )

    var keepPlaying = true
    while (keepPlaying) {
        println("Ask a yes or no question:")
        val question = readLine()
        val response = responses[Random.nextInt(responses.size)]
        println(response)

        println("Do you want to ask another question? (y/n)")
        val answer = readLine()
        keepPlaying = (answer?.toLowerCase() == "y")
    }

    println("Goodbye!")
}
