package kong.droid.simpledagger2.di

import dagger.Component

@Component(modules = [MainModule::class])
interface MainComponent {
    fun getString(): String
}