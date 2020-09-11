fun main(){
    val objStandardLibraryFun= StandardLibraryFun()
    val objInfixFunNotation= InfixFunNotation()
    val objMemberFun= MemberFun()
    val objUserDefinedFun= UserDefinedFun()

    println("************************** StandardLibraryFun **************************")
    objStandardLibraryFun.also()
    objStandardLibraryFun.apply()
    objStandardLibraryFun.let()
    objStandardLibraryFun.run()
    objStandardLibraryFun.takeIf()
    objStandardLibraryFun.with()

    println("************************** InfixFunNotation **************************")
    objInfixFunNotation.userDefinedInfixFun()
    objInfixFunNotation.standardLibraryInfixFun()

    println("************************** MemberFun **************************")
    objMemberFun.inlineFun("somiah jamal", ::print)
    objMemberFun.lambdaFun()
    objMemberFun.localFun()

    println("************************** UserDefinedFun **************************")
    objUserDefinedFun.anonymousFun()
    objUserDefinedFun.anonymousInfFin()
    objUserDefinedFun.userDefine("user define fun")
    println(objUserDefinedFun.userDefine1())

    println("************************** Class & Data Class **************************")

    var objPlayers1= Players1()
    println(objPlayers1.task())

    var objPlayers2= Players2("Hassan", "Barcelona", 9)
    println(objPlayers2.task())


}