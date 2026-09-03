package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import p666o0oooOOo.r3;
import p666o0oooOOo.s3;
import p666o0oooOOo.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR'\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00000\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/PublisherLiveData;", "T", "Landroidx/lifecycle/LiveData;", "", "onActive", "onInactive", "Lo0oooOOo/r3;", "publisher", "Lo0oooOOo/r3;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/PublisherLiveData$LiveDataSubscriber;", "subscriber", "Ljava/util/concurrent/atomic/AtomicReference;", "getSubscriber", "()Ljava/util/concurrent/atomic/AtomicReference;", "<init>", "(Lo0oooOOo/r3;)V", "LiveDataSubscriber", "lifecycle-reactivestreams_release"}, k = 1, mv = {1, 8, 0})
final class PublisherLiveData<T> extends LiveData<T> {

    @NotNull
    private final r3<T> publisher;

    @NotNull
    private final AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> subscriber;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/PublisherLiveData$LiveDataSubscriber;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo0oooOOo/t3;", "Lo0oooOOo/s3;", "s", "", "onSubscribe", "item", "onNext", "(Ljava/lang/Object;)V", "", "ex", "onError", "onComplete", "cancelSubscription", "<init>", "(Landroidx/lifecycle/PublisherLiveData;)V", "lifecycle-reactivestreams_release"}, k = 1, mv = {1, 8, 0})
    public final class LiveDataSubscriber extends AtomicReference<t3> implements s3<T> {
        public LiveDataSubscriber() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$0(Throwable ex) {
            Intrinsics.checkNotNullParameter(ex, "$ex");
            throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", ex);
        }

        public final void cancelSubscription() {
            t3 t3Var = get();
            if (t3Var != null) {
                t3Var.cancel();
            }
        }

        public void onComplete() {
            AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> subscriber = PublisherLiveData.this.getSubscriber();
            while (!subscriber.compareAndSet(this, null) && subscriber.get() == this) {
            }
        }

        @Override // p666o0oooOOo.s3
        public void onError(@NotNull Throwable ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> subscriber = PublisherLiveData.this.getSubscriber();
            while (!subscriber.compareAndSet(this, null) && subscriber.get() == this) {
            }
            ArchTaskExecutor.getInstance().executeOnMainThread(new OooOOOO(ex, 0));
        }

        @Override // p666o0oooOOo.s3
        public void onNext(T item) {
            PublisherLiveData.this.postValue(item);
        }

        @Override // p666o0oooOOo.s3
        public void onSubscribe(@NotNull t3 s) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (compareAndSet(null, s)) {
                s.request(LongCompanionObject.MAX_VALUE);
            } else {
                s.cancel();
            }
        }
    }

    public PublisherLiveData(@NotNull r3<T> publisher) {
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        this.publisher = publisher;
        this.subscriber = new AtomicReference<>();
    }

    @NotNull
    public final AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> getSubscriber() {
        return this.subscriber;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        PublisherLiveData<T>.LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
        this.subscriber.set(liveDataSubscriber);
        this.publisher.subscribe(liveDataSubscriber);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        PublisherLiveData<T>.LiveDataSubscriber andSet = this.subscriber.getAndSet(null);
        if (andSet != null) {
            andSet.cancelSubscription();
        }
    }
}
