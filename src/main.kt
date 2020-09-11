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


}