case class Person(name: String, age: Int)

object ForExpression extends App {

    val persons =  List(Person("Ellen", 28),
                        Person("Mary", 65),
                        Person("Charlotte", 15),
                        Person("Cory", 48),
                        Person("Carla", 25),
                        Person("Victoria", 69),
                        Person("Michael", 3),
                        Person("Claire", 63),
                        Person("Adam", 56),
                        Person("Victor", 39),
                        Person("Ernest", 32))

    // Names starting with C
    for (p <- persons; n = p.name; if n startsWith "C")
        yield print(n + ", ") // Charlotte, Cory, Carla, Claire, 

    println()

    // Names ending with y
    for (p <- persons; n = p.name; if n endsWith "y")
        yield print(n + ", ") // Mary, Cory, 

    println()

    // Person under 35 years old
    for (p <- persons; n = p.age; if n < 35)
        yield print(p.name + ":" + n.toString + ", ") // Ellen:28, Charlotte:15, Carla:25, Michael:3, Ernest:32, 

    println()

    // Person upper 35 years old
    for (p <- persons; n = p.age; if n > 35)
        yield print(p.name + ":" + n.toString + ", ") // Mary:65, Cory:48, Victoria:69, Claire:63, Adam:56, Victor:39, 

    println()

    // For expression using curly brackets
    for {
        p <- persons          // Generator
        n = p.name            // Definition
        if n startsWith "C"   // Filter
    } yield print(n + ", ") // Charlotte, Cory, Carla, Claire, 

    println()
}


// =====================================
//         Output Sample
// =====================================
// $ scalac ForExpression.scala 
// $ scala ForExpression
// Charlotte, Cory, Carla, Claire, 
// Mary, Cory, 
// Ellen:28, Charlotte:15, Carla:25, Michael:3, Ernest:32, 
// Mary:65, Cory:48, Victoria:69, Claire:63, Adam:56, Victor:39, 
// Charlotte, Cory, Carla, Claire, 