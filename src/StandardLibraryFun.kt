class StandardLibraryFun {
    data class Person(var name: String, var age: Int, var city: String)

    fun apply(){
        Person("Hassan", 20, "Ibb").apply {
            println(this)
            this.city = "Kuala"
            this.age = 21
            println(this)
        }
    }
    fun let(){
        Person("Somiah", 20, "Ibb").let {
            println(it)
            it.city = "sana\'a"
            it.age = 23
            println(it)
        }
    }
    fun run(){
        Person("Salma", 20, "Ibb").run {
            println(this)
            this.city = "Sana\'a"
            this.age = 18
            println(this)
        }
    }
    fun with(){
        val p = Person("Salwa17", 20, "Ibb")
        with(p) {
            println("with function is called ${this.toString()}")
            p.city = "sana\'a"
            p.name = "salwa"
            println("with function is called ${this.toString()}")
        }
    }
    fun also(){
        Person("Mohammed", 20, "Ibb").also {
            println("also function is called befor : ${it.toString()}")
            it.city = "sana\'a"
            it.age = 12
            println("also  function is called after: ${it.toString()}")
        }
    }
    fun takeIf(){
        Person("Maryam", 20, "Ibb").takeIf {
            it.age == 9

        }
    }

}