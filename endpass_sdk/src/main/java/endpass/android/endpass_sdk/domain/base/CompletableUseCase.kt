package endpass.android.endpass_sdk.domain.base

import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

abstract class CompletableUseCase<in Params> : UseCase() {

    abstract fun buildUseCaseCompletable(params: Params): Completable

    fun execute(onComplete: (() -> Unit), onError: ((t: Throwable) -> Unit), params: Params) {
        disposeLatest()
        val disposable = buildUseCaseCompletable(params)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(onComplete, onError)
        disposables.add(disposable)

        lastDisposable = disposable
    }
}