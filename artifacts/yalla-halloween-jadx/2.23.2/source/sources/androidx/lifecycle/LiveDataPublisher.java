package androidx.lifecycle;

import androidx.appcompat.widget.o000OO00;
import androidx.arch.core.executor.ArchTaskExecutor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p666o0oooOOo.r3;
import p666o0oooOOo.s3;
import p666o0oooOOo.t3;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/LiveDataPublisher;", "T", "Lo0oooOOo/r3;", "Lo0oooOOo/s3;", "subscriber", "", "subscribe", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycle", "()Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LiveData;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LiveData;)V", "LiveDataSubscription", "lifecycle-reactivestreams_release"}, k = 1, mv = {1, 8, 0})
public final class LiveDataPublisher<T> implements r3<T> {

    @NotNull
    private final LifecycleOwner lifecycle;

    @NotNull
    private final LiveData<T> liveData;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003B-\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b0\u00101J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u001f\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00018\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0007¨\u00062"}, d2 = {"Landroidx/lifecycle/LiveDataPublisher$LiveDataSubscription;", "T", "Lo0oooOOo/t3;", "Landroidx/lifecycle/Observer;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "onChanged", "(Ljava/lang/Object;)V", "", "n", "request", "cancel", "Lo0oooOOo/s3;", "subscriber", "Lo0oooOOo/s3;", "getSubscriber", "()Lo0oooOOo/s3;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycle", "()Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LiveData;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "", "canceled", "Z", "getCanceled", "()Z", "setCanceled", "(Z)V", "observing", "getObserving", "setObserving", "requested", "J", "getRequested", "()J", "setRequested", "(J)V", "latest", "Ljava/lang/Object;", "getLatest", "()Ljava/lang/Object;", "setLatest", "<init>", "(Lo0oooOOo/s3;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LiveData;)V", "lifecycle-reactivestreams_release"}, k = 1, mv = {1, 8, 0})
    public static final class LiveDataSubscription<T> implements t3, Observer<T> {
        private volatile boolean canceled;

        @Nullable
        private T latest;

        @NotNull
        private final LifecycleOwner lifecycle;

        @NotNull
        private final LiveData<T> liveData;
        private boolean observing;
        private long requested;

        @NotNull
        private final s3<? super T> subscriber;

        public LiveDataSubscription(@NotNull s3<? super T> subscriber, @NotNull LifecycleOwner lifecycle, @NotNull LiveData<T> liveData) {
            Intrinsics.checkNotNullParameter(subscriber, "subscriber");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(liveData, "liveData");
            this.subscriber = subscriber;
            this.lifecycle = lifecycle;
            this.liveData = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void cancel$lambda$1(LiveDataSubscription this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.observing) {
                this$0.liveData.removeObserver(this$0);
                this$0.observing = false;
            }
            this$0.latest = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void request$lambda$0(LiveDataSubscription this$0, long j) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.canceled) {
                return;
            }
            if (j <= 0) {
                this$0.canceled = true;
                if (this$0.observing) {
                    this$0.liveData.removeObserver(this$0);
                    this$0.observing = false;
                }
                this$0.latest = null;
                this$0.subscriber.onError(new IllegalArgumentException("Non-positive request"));
                return;
            }
            long j2 = this$0.requested;
            this$0.requested = j2 + j >= j2 ? j2 + j : LongCompanionObject.MAX_VALUE;
            if (!this$0.observing) {
                this$0.observing = true;
                this$0.liveData.observe(this$0.lifecycle, this$0);
                return;
            }
            T t = this$0.latest;
            if (t != null) {
                this$0.onChanged(t);
                this$0.latest = null;
            }
        }

        @Override // p666o0oooOOo.t3
        public void cancel() {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            ArchTaskExecutor.getInstance().executeOnMainThread(new o000OO00(this, 1));
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        @Nullable
        public final T getLatest() {
            return this.latest;
        }

        @NotNull
        public final LifecycleOwner getLifecycle() {
            return this.lifecycle;
        }

        @NotNull
        public final LiveData<T> getLiveData() {
            return this.liveData;
        }

        public final boolean getObserving() {
            return this.observing;
        }

        public final long getRequested() {
            return this.requested;
        }

        @NotNull
        public final s3<? super T> getSubscriber() {
            return this.subscriber;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable T value) {
            if (this.canceled) {
                return;
            }
            if (this.requested <= 0) {
                this.latest = value;
                return;
            }
            this.latest = null;
            this.subscriber.onNext(value);
            long j = this.requested;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.requested = j - 1;
            }
        }

        @Override // p666o0oooOOo.t3
        public void request(final long n) {
            if (this.canceled) {
                return;
            }
            ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.OooOOO
                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataPublisher.LiveDataSubscription.request$lambda$0(this.f6083OooO0Oo, n);
                }
            });
        }

        public final void setCanceled(boolean z) {
            this.canceled = z;
        }

        public final void setLatest(@Nullable T t) {
            this.latest = t;
        }

        public final void setObserving(boolean z) {
            this.observing = z;
        }

        public final void setRequested(long j) {
            this.requested = j;
        }
    }

    public LiveDataPublisher(@NotNull LifecycleOwner lifecycle, @NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.lifecycle = lifecycle;
        this.liveData = liveData;
    }

    @NotNull
    public final LifecycleOwner getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    public final LiveData<T> getLiveData() {
        return this.liveData;
    }

    @Override // p666o0oooOOo.r3
    public void subscribe(@NotNull s3<? super T> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        subscriber.onSubscribe(new LiveDataSubscription(subscriber, this.lifecycle, this.liveData));
    }
}
