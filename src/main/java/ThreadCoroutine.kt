import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

fun main() {
    //threadTest()
    coroutineTest()
}

fun threadTest(){
    val integer = AtomicInteger()
    for(i in 1..1_000_000){
        thread(start = true){
            integer.getAndIncrement()
        }
    }
    Thread.sleep(1000)
    println(integer.get())
}

fun coroutineTest(){
    val integer = AtomicInteger()
    for(i in 1..1_000_000){
        GlobalScope.launch{
            integer.getAndIncrement()
        }
    }
    Thread.sleep(1000)
    println(integer.get())
}