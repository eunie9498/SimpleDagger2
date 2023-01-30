package kong.droid.simpledagger2.di

import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideSimple(): String{
        return "의존성을 제공하는 메소드입니다"
    }
}