class MemberFun {
    private var funType = ""
    inline fun inlineFun(str: String, myFun: (String) -> Unit){
        myFun(str)
    }
    fun localFun(){
        funType = "this is a local function"
        fun printtype() {
            println(funType)

        }
        printtype()
    }
    fun lambdaFun(){
        var funType1 = { println("this is a lambda function") }
        funType = funType1().toString()
        println(funType)
    }
}