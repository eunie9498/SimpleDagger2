package kong.droid.simpledagger2.di

import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideAct(): String{
        return "simple"
    }
}