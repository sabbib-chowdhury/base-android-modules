package io.github.sabbib.chowdhury.base.network.concurrency

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

open class TestSchedulersProvider : SchedulersProvider {
    override fun mainUiThread(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun computation(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun immediate(): Scheduler {
        return Schedulers.trampoline()
    }
}
