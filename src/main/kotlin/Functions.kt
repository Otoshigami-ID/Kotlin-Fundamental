fun main(){
    val user = setUser("Rifqi Maheswara Karuniyawan", 16,"Nonton Anime")
    println(user)
}
fun setUser(name: String, age: Int, hobby: String) = "My name is $name, I like $hobby, and I'm $age years old"