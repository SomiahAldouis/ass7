class UserDefinedFun {
    var funType=""

    fun anonymousFun(){
        var s:()-> String={
            funType="Anonymous Function"
            funType
        }
        println("this is an  explicit type  anonymous function")
    }

    fun anonymousInfFin(){
        var s={"anonymous function"}
    }

    fun userDefine(type: String) {
        funType = "user define function with no return value"
        println(funType)
    }

    fun userDefine1(): String {
        funType = "user define function with no return value"
        return funType
    }
}