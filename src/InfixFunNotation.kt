class InfixFunNotation {
    infix private fun add(s: String) {}
    fun standardLibraryInfixFun(){
        var a = 3
        var b = 8
        var c = 67
        var result = (a > b) and (a < c)
        println("the result os infix standard function :\n$result ")
        println(++a)
        println(--b)
        println(++c)
    }
    fun userDefinedInfixFun(){
        this add "this is infix function"
        add("user define infix function")
    }
}