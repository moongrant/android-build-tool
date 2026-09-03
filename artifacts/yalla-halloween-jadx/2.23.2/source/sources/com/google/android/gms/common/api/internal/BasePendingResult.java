package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p256o00ooOO0.o0O000;
import p256o00ooOO0.o0O000O;
import p256o00ooOO0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o0O000 f14237OooOOOO = new o0O000();
    public static final /* synthetic */ int zad = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Status f14238OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f14239OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CallbackHandler<R> f14240OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final WeakReference<GoogleApiClient> f14241OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CountDownLatch f14242OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ResultCallback<? super R> f14243OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<PendingResult.StatusListener> f14244OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicReference<o0oOOo> f14245OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public R f14246OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile boolean f14247OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14248OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14249OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f14250OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile zada<R> f14251OooOOO0;

    @KeepName
    private o0O000O mResultGuardian;

    @Deprecated
    public BasePendingResult() {
        this.f14239OooO00o = new Object();
        this.f14242OooO0Oo = new CountDownLatch(1);
        this.f14244OooO0o0 = new ArrayList<>();
        this.f14245OooO0oO = new AtomicReference<>();
        this.f14250OooOOO = false;
        this.f14240OooO0O0 = new CallbackHandler<>(Looper.getMainLooper());
        this.f14241OooO0OO = new WeakReference<>(null);
    }

    public static void zal(@Nullable Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    public final R OooO00o() {
        R r;
        synchronized (this.f14239OooO00o) {
            Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.f14246OooO0oo;
            this.f14246OooO0oo = null;
            this.f14243OooO0o = null;
            this.f14247OooOO0 = true;
        }
        o0oOOo andSet = this.f14245OooO0oO.getAndSet(null);
        if (andSet != null) {
            andSet.f40342OooO00o.f14440OooO00o.remove(this);
        }
        return (R) Preconditions.checkNotNull(r);
    }

    public final void OooO0O0(R r) {
        this.f14246OooO0oo = r;
        this.f14238OooO = r.getStatus();
        this.f14242OooO0Oo.countDown();
        if (this.f14248OooOO0O) {
            this.f14243OooO0o = null;
        } else {
            ResultCallback<? super R> resultCallback = this.f14243OooO0o;
            if (resultCallback != null) {
                CallbackHandler<R> callbackHandler = this.f14240OooO0O0;
                callbackHandler.removeMessages(2);
                callbackHandler.zaa(resultCallback, OooO00o());
            } else if (this.f14246OooO0oo instanceof Releasable) {
                this.mResultGuardian = new o0O000O(this);
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f14244OooO0o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).onComplete(this.f14238OooO);
        }
        arrayList.clear();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.f14239OooO00o) {
            if (isReady()) {
                statusListener.onComplete(this.f14238OooO);
            } else {
                this.f14244OooO0o0.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed");
        Preconditions.checkState(this.f14251OooOOO0 == null, "Cannot await if then() has been called.");
        try {
            this.f14242OooO0Oo.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) OooO00o();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.f14239OooO00o) {
            if (!this.f14248OooOO0O && !this.f14247OooOO0) {
                zal(this.f14246OooO0oo);
                this.f14248OooOO0O = true;
                OooO0O0(createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public abstract R createFailedResult(@NonNull Status status);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status) {
        synchronized (this.f14239OooO00o) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.f14249OooOO0o = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.f14239OooO00o) {
            z = this.f14248OooOO0O;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.f14242OooO0Oo.getCount() == 0;
    }

    @KeepForSdk
    public final void setResult(@NonNull R r) {
        synchronized (this.f14239OooO00o) {
            if (this.f14249OooOO0o || this.f14248OooOO0O) {
                zal(r);
                return;
            }
            isReady();
            Preconditions.checkState(!isReady(), "Results have already been set");
            Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed");
            OooO0O0(r);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@Nullable ResultCallback<? super R> resultCallback) {
        synchronized (this.f14239OooO00o) {
            try {
                if (resultCallback == null) {
                    this.f14243OooO0o = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed.");
                if (this.f14251OooOOO0 != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f14240OooO0O0.zaa(resultCallback, OooO00o());
                } else {
                    this.f14243OooO0o = resultCallback;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> transformedResultThen;
        Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed.");
        synchronized (this.f14239OooO00o) {
            Preconditions.checkState(this.f14251OooOOO0 == null, "Cannot call then() twice.");
            Preconditions.checkState(this.f14243OooO0o == null, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(!this.f14248OooOO0O, "Cannot call then() if result was canceled.");
            this.f14250OooOOO = true;
            this.f14251OooOOO0 = new zada<>(this.f14241OooO0OO);
            transformedResultThen = this.f14251OooOOO0.then(resultTransform);
            if (isReady()) {
                this.f14240OooO0O0.zaa(this.f14251OooOOO0, OooO00o());
            } else {
                this.f14243OooO0o = this.f14251OooOOO0;
            }
        }
        return transformedResultThen;
    }

    public final void zak() {
        this.f14250OooOOO = this.f14250OooOOO || f14237OooOOOO.get().booleanValue();
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.f14239OooO00o) {
            if (this.f14241OooO0OO.get() == null || !this.f14250OooOOO) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    public final void zan(@Nullable o0oOOo o0oooo) {
        this.f14245OooO0oO.set(o0oooo);
    }

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zaq {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.zal(result);
                    throw e;
                }
            }
            if (i == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }

        public final void zaa(@NonNull ResultCallback<? super R> resultCallback, @NonNull R r) {
            o0O000 o0o001 = BasePendingResult.f14237OooOOOO;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), r)));
        }

        public CallbackHandler(@NonNull Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(@NonNull Looper looper) {
        this.f14239OooO00o = new Object();
        this.f14242OooO0Oo = new CountDownLatch(1);
        this.f14244OooO0o0 = new ArrayList<>();
        this.f14245OooO0oO = new AtomicReference<>();
        this.f14250OooOOO = false;
        this.f14240OooO0O0 = new CallbackHandler<>(looper);
        this.f14241OooO0OO = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed.");
        Preconditions.checkState(this.f14251OooOOO0 == null, "Cannot await if then() has been called.");
        try {
            if (!this.f14242OooO0Oo.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) OooO00o();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@NonNull ResultCallback<? super R> resultCallback, long j, @NonNull TimeUnit timeUnit) {
        synchronized (this.f14239OooO00o) {
            try {
                if (resultCallback == null) {
                    this.f14243OooO0o = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.f14247OooOO0, "Result has already been consumed.");
                if (this.f14251OooOOO0 != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f14240OooO0O0.zaa(resultCallback, OooO00o());
                } else {
                    this.f14243OooO0o = resultCallback;
                    CallbackHandler<R> callbackHandler = this.f14240OooO0O0;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public BasePendingResult(@Nullable GoogleApiClient googleApiClient) {
        this.f14239OooO00o = new Object();
        this.f14242OooO0Oo = new CountDownLatch(1);
        this.f14244OooO0o0 = new ArrayList<>();
        this.f14245OooO0oO = new AtomicReference<>();
        this.f14250OooOOO = false;
        this.f14240OooO0O0 = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.f14241OooO0OO = new WeakReference<>(googleApiClient);
    }
}
