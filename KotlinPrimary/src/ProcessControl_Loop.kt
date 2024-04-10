/**
 * 流程控制-循环
 * for while
 */
fun main() {
    // for可以遍历很多目标
    // 1）数组 2）区间 3）集合？实现了迭代器的类，遇到了再提
    for (x in 1..10) {
        println("$x") // 和println(x)是一样的
    }

    // for还可以自己控制步长
    for (x in 1..10 step 2) {
        println(x)
    }

    // 区间的另一个用法，倒序
    for (x in 10 downTo 1) {
        println(x)
    }

    // break和continue的用法还是一样
    // 这里要提到一个新的概念：标记（字符加上@，后面使用的时候就是@加上字符）
    out@for (x in 1..10) {
        inner@for (y in 1..10) {
            if (x == y) break@out // 如果x==y这里会直接结束整个外部循环
            println("three $x,$y")
        }
    }

    // while 同样可以使用标记来控制循环的流程
    var x = 10
    out@while (x > 0) {
        if (x < 5) break@out
        println("$x")
        x -= 2;
    }
}