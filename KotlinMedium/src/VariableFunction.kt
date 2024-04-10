fun main() {
    println(fib(6))
}

/**
 * get() and set()
 * field字段是这个string的默认值
 */
var str = "test"
    get() = field + "some operations"

var str1 = "test1"
    get() {
        // some operations
        println("xxx")
        return "this str is $field"
    }

/**
 * tailrec 编译器会自动优化递归变成循环
 * @param n number index
 * @return fib number
 */
tailrec fun fib(n: Int): Int {
    if (n <= 2) return 1
    return fib(n - 2) + fib(n - 1)
}