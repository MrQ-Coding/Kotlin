/**
 * 流程控制-条件
 * if when
 */
fun main() {
    // if的特殊用法，这种用法要求一定要有else块
    val temp = 3
    var result = if (temp > 2) "gt" else "lt" // kotlin没有三元运算符，可以用这个替代
    // 也可以带操作，默认最后一行作为返回带结果
    var res = if (temp > 4) {
        println("gt")
        "gt"
    } else {
        println("lt")
        "lt"
    }

    // when 类似于 switch,
    // when 也可以返回结果给变量，同样大部分时候也要else分支
    var which = when (temp) {
        1 -> println("input is 1")
        2 -> println("input is 2")
        3 -> println("input is 3")
        4, 5, 6 -> println("input is 4 or 5") // 结果相同的分支可以用逗号分隔
        else -> println("input not them")
    }

    // 少数可以不用else的情况
    // 1）Boolean两种情况都完整 2）枚举类全部枚举完整 3）判断的变量不为空 其他的后续看到了再提
    val temp2 = false
    var which2 = when (temp2) {
        true -> println("this is true")
        false -> println("this is false")
    }

    // 分支条件可用用表达式
    val temp3 = 1
    var which3 = when (temp3) {
        in 1..3 -> "this is in 1~3"
        in 4..8 -> "this is in 4~8"
        else -> "not in this range"
    }
}