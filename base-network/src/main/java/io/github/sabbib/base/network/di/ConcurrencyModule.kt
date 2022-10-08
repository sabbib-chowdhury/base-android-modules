package io.github.sabbib.base.network.di

import io.github.sabbib.base.network.concurrency.AndroidSchedulers
import io.github.sabbib.base.network.concurrency.SchedulersProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ConcurrencyModule {

    @Singleton
    @Provides
    fun provideSchedulersProvider(): SchedulersProvider = AndroidSchedulers()
}