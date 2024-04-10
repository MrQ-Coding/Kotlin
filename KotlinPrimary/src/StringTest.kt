fun main() {
    // 字符和字符串
    var ch1 : Char = 'A'
    var ch = 'A'

    var str1 : String = "String"
    var str = "String"
    println(str)

    // """三引号可以表示带缩进和换行的原始字符串，转义字符会失效
    var strNewLine = """
        new line
        new line
        new line
        \n 无效
    """/*.trimIndent()*/ // trimIndent()方法会去除缩进
    println(strNewLine)


    var str2 = str1 + 2 // 字符串拼接
    // 不允许的拼接，只允许String类型在前面拼接其他类型
    // var str3 = 2 + str1

    //字符串模板
    var strTemp = "$str template" // 不用花括号要有空格
    var strTemp1 = "${str}template" // 用花括号可以不用隔开

    // $符号的输出
    var strTemp2 = "\$template" // 普通字符串
    var strTemp3 = """${'$'}template""" // 原始字符串
}