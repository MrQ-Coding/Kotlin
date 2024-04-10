/**
 * 变量和常量
 */
fun main(args: Array<String>) {
    // 1.变量定义
    // 自动类型推断，所以可以不用定义类型
    var variable : Int = 10
    var variable1 = 10

    // 2.常量定义（常量和Java一致，只能赋一次值）
    val constant = "CONSTANT CAN NOT BE CHANGED"

    // 3.指定范围，range的范围是[1,5]
    // inRange会自动推断为Boolean类型，in则是判断是否在范围中
    var range : IntRange = 1..5
    var inRange = 3 in range

    // 4.变量是否可为空
    var emptyStr : String? // 类型带问好表示可以为空
}