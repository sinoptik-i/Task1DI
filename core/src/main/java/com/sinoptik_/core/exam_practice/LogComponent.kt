package com.sinoptik_.core.exam_practice

import dagger.Binds
import dagger.Component
import dagger.Module


@Module
abstract class LogModule {

    @Binds
    abstract fun bindsLogger(logger: LogProviderImpl): LogProvider
}

@Component(modules = [LogModule::class])
interface LogComponent {
    fun getLogger(): LogProvider

}