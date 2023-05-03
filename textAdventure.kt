fun main() {
    val map = mapOf(
        "dusty castle room" to listOf("north", "south"),
        "armory" to listOf("south"),
        "torch-lit hallway" to listOf("east", "west"),
        "bedroom" to listOf("west"),
        "kitchen" to listOf("east")
    )
    var currentRoom = "dusty castle room"
    println("You are in $currentRoom.")
    while (true) {
        print("Passages lead to ${map[currentRoom]?.joinToString(separator = " and ")}.\nWhat direction? ")
        val direction = readLine()?.toLowerCase()
        if (direction in map[currentRoom] ?: emptyList()) {
            when (direction) {
                "north" -> currentRoom = "dusty castle room"
                "south" -> currentRoom = if (currentRoom == "dusty castle room") "armory" else "torch-lit hallway"
                "east" -> currentRoom = if (currentRoom == "torch-lit hallway") "bedroom" else "kitchen"
                "west" -> currentRoom = if (currentRoom == "bedroom") "torch-lit hallway" else currentRoom
            }
            println("You are in $currentRoom.")
        } else {
            println("Can't go that way.")
        }
    }
}
