package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class LiveDataReactiveStreams {

    public static final class LiveDataPublisher<T> implements oO000o00.OooO00o<T> {
        public final LifecycleOwner mLifecycle;
        public final LiveData<T> mLiveData;

        public static final class LiveDataSubscription<T> implements oO000o00.OooO0OO, Observer<T> {
            public volatile boolean mCanceled;

            @Nullable
            public T mLatest;
            public final LifecycleOwner mLifecycle;
            public final LiveData<T> mLiveData;
            public boolean mObserving;
            public long mRequested;
            public final oO000o00.OooO0O0<? super T> mSubscriber;

            public LiveDataSubscription(oO000o00.OooO0O0<? super T> oooO0O0, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.mSubscriber = oooO0O0;
                this.mLifecycle = lifecycleOwner;
                this.mLiveData = liveData;
            }

            @Override // oO000o00.OooO0OO
            public void cancel() {
                if (this.mCanceled) {
                    return;
                }
                this.mCanceled = true;
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.2
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                        if (liveDataSubscription.mObserving) {
                            liveDataSubscription.mLiveData.removeObserver(liveDataSubscription);
                            LiveDataSubscription.this.mObserving = false;
                        }
                        LiveDataSubscription.this.mLatest = null;
                    }
                });
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable T t) {
                if (this.mCanceled) {
                    return;
                }
                if (this.mRequested <= 0) {
                    this.mLatest = t;
                    return;
                }
                this.mLatest = null;
                this.mSubscriber.onNext(t);
                long j = this.mRequested;
                if (j != Long.MAX_VALUE) {
                    this.mRequested = j - 1;
                }
            }

            @Override // oO000o00.OooO0OO
            public void request(final long j) {
                if (this.mCanceled) {
                    return;
                }
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (LiveDataSubscription.this.mCanceled) {
                            return;
                        }
                        long j2 = j;
                        if (j2 <= 0) {
                            LiveDataSubscription.this.mCanceled = true;
                            LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                            if (liveDataSubscription.mObserving) {
                                liveDataSubscription.mLiveData.removeObserver(liveDataSubscription);
                                LiveDataSubscription.this.mObserving = false;
                            }
                            LiveDataSubscription liveDataSubscription2 = LiveDataSubscription.this;
                            liveDataSubscription2.mLatest = null;
                            liveDataSubscription2.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
                            return;
                        }
                        LiveDataSubscription liveDataSubscription3 = LiveDataSubscription.this;
                        long j3 = liveDataSubscription3.mRequested;
                        liveDataSubscription3.mRequested = j3 + j2 >= j3 ? j3 + j2 : Long.MAX_VALUE;
                        if (!liveDataSubscription3.mObserving) {
                            liveDataSubscription3.mObserving = true;
                            liveDataSubscription3.mLiveData.observe(liveDataSubscription3.mLifecycle, liveDataSubscription3);
                            return;
                        }
                        T t = liveDataSubscription3.mLatest;
                        if (t != null) {
                            liveDataSubscription3.onChanged(t);
                            LiveDataSubscription.this.mLatest = null;
                        }
                    }
                });
            }
        }

        public LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.mLifecycle = lifecycleOwner;
            this.mLiveData = liveData;
        }

        @Override // oO000o00.OooO00o
        public void subscribe(oO000o00.OooO0O0<? super T> oooO0O0) {
            oooO0O0.onSubscribe(new LiveDataSubscription(oooO0O0, this.mLifecycle, this.mLiveData));
        }
    }

    public static class PublisherLiveData<T> extends LiveData<T> {
        private final oO000o00.OooO00o<T> mPublisher;
        public final AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> mSubscriber = new AtomicReference<>();

        public final class LiveDataSubscriber extends AtomicReference<oO000o00.OooO0OO> implements oO000o00.OooO0O0<T> {
            public LiveDataSubscriber() {
            }

            public void cancelSubscription() {
                oO000o00.OooO0OO oooO0OO = get();
                if (oooO0OO != null) {
                    oooO0OO.cancel();
                }
            }

            public void onComplete() {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
            }

            @Override // oO000o00.OooO0O0
            public void onError(final Throwable th) {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.PublisherLiveData.LiveDataSubscriber.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }
                });
            }

            @Override // oO000o00.OooO0O0
            public void onNext(T t) {
                PublisherLiveData.this.postValue(t);
            }

            @Override // oO000o00.OooO0O0
            public void onSubscribe(oO000o00.OooO0OO oooO0OO) {
                if (compareAndSet(null, oooO0OO)) {
                    oooO0OO.request(Long.MAX_VALUE);
                } else {
                    oooO0OO.cancel();
                }
            }
        }

        public PublisherLiveData(@NonNull oO000o00.OooO00o<T> oooO00o) {
            this.mPublisher = oooO00o;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            super.onActive();
            PublisherLiveData<T>.LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
            this.mSubscriber.set(liveDataSubscriber);
            this.mPublisher.subscribe(liveDataSubscriber);
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            PublisherLiveData<T>.LiveDataSubscriber andSet = this.mSubscriber.getAndSet(null);
            if (andSet != null) {
                andSet.cancelSubscription();
            }
        }
    }

    private LiveDataReactiveStreams() {
    }

    @NonNull
    public static <T> LiveData<T> fromPublisher(@NonNull oO000o00.OooO00o<T> oooO00o) {
        return new PublisherLiveData(oooO00o);
    }

    @NonNull
    public static <T> oO000o00.OooO00o<T> toPublisher(@NonNull LifecycleOwner lifecycleOwner, @NonNull LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }
}
