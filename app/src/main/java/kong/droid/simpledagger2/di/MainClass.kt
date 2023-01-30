package kong.droid.simpledagger2.di

import javax.inject.Inject

class MainClass {
    @Inject
    lateinit var str : String

    init {
        str = "simple"
    }
    fun getSimple(): String {
        return str
    }
}