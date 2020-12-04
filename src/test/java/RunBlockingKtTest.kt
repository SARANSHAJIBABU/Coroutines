import kotlinx.coroutines.runBlocking
import org.junit.Test

class RunBlockingKtTest{
    @Test
    fun firstTest() = runBlocking {
        doWork()
    }
}