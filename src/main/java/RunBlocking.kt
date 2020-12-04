import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("Hello")
    println("Running in ${Thread.currentThread().name}")
    runBlocking(Dispatchers.Default) {
        delay(500)
        println("World")
        println("Running in ${Thread.currentThread().name}")
    }
    println("Done")
}

suspend fun doWork(){
    delay(500)
    println("Done working")
}

