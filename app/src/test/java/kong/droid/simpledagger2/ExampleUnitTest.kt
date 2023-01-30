package kong.droid.simpledagger2

import dagger.android.AndroidInjection.inject
import kong.droid.simpledagger2.di.DaggerMainComponent
import kong.droid.simpledagger2.di.MainClass
import kong.droid.simpledagger2.di.MainComponent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testSimple() {
        val act = MainClass()
        val component = DaggerMainComponent.create()
        component.inject(act)
        var test = act.getSimple()
        assertEquals("simple", test)
    }
}