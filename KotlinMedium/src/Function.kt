/**
 * 函数
 * main方法是默认的入口
 */
// 返回值默认是Unit，类似于void，这里可以省略，其他的返回值就没有区别了
//fun function(): Unit {
fun function() {

}

// 参数可以有默认值，如果调用的时候不传参数就会用默认值
fun defaultParam(str: String = "default value") {
    // 传递的参数一般情况下是常量，无法修改
    // str = "can not change"
    println(str)
}

// 如果多个参数可以指定传入某个参数，如果传参不完整则按给定的参数按顺序传入
fun defaultParam2(
    str1: String = "default value",
    str2: String = "default value2",
    str3: String = "default value3",
) {
    println("$str1 -- $str2 -- $str3")
}

// 简单的函数不需要花括号，返回值也可以省略
//fun add(x: Int, y: Int): Int {
//    return x + y;
//}
fun add(x: Int, y: Int) = x + y
fun printNum() = println(add(1, 2))

// 函数还可以内部无限套娃，不过作用域限制在函数内部
fun outerFun() {
    fun inner1() {
        fun inner2() {}
        inner2() // 只能在inner1()中使用
    }
    inner1() // 只能在outerFun()中使用
}

fun main() {
    defaultParam() // 如果不传参数使用默认参数
    defaultParam2()
    defaultParam2("str1", "str2") // 多参数没有传所有的参数则按顺序传参
    defaultParam2(str2 = "str2") // 可以指定传参
}
