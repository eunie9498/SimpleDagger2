package kong.droid.simpledagger2.di

import dagger.Component
import kong.droid.simpledagger2.MainActivity

@Component(modules = [MainModule::class])
interface MainComponent {

    fun inject(main: MainClass) //member-injection

}