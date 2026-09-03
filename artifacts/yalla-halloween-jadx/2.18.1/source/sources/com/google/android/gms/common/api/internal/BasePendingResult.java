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
import p331o0O0oooO.o0OO;
import p331o0O0oooO.o0OO0;
import p331o0O0oooO.o0OO0oO0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ThreadLocal<Boolean> f15214OooOOOO = new o0OO0oO0();
    public static final /* synthetic */ int zad = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Status f15215OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f15216OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CallbackHandler<R> f15217OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final WeakReference<GoogleApiClient> f15218OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CountDownLatch f15219OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ResultCallback<? super R> f15220OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<PendingResult.StatusListener> f15221OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicReference<o0OO0> f15222OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public R f15223OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile boolean f15224OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f15225OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f15226OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f15227OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile zada<R> f15228OooOOO0;

    @KeepName
    private o0OO mResultGuardian;

    @Deprecated
    public BasePendingResult() {
        this.f15216OooO00o = new Object();
        this.f15219OooO0Oo = new CountDownLatch(1);
        this.f15221OooO0o0 = new ArrayList<>();
        this.f15222OooO0oO = new AtomicReference<>();
        this.f15227OooOOO = false;
        this.f15217OooO0O0 = new CallbackHandler<>(Looper.getMainLooper());
        this.f15218OooO0OO = new WeakReference<>(null);
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
        synchronized (this.f15216OooO00o) {
            Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.f15223OooO0oo;
            this.f15223OooO0oo = null;
            this.f15220OooO0o = null;
            this.f15224OooOO0 = true;
        }
        o0OO0 andSet = this.f15222OooO0oO.getAndSet(null);
        if (andSet != null) {
            andSet.f37116OooO00o.f15418OooO00o.remove(this);
        }
        return (R) Preconditions.checkNotNull(r);
    }

    public final void OooO0O0(R r) {
        this.f15223OooO0oo = r;
        this.f15215OooO = r.getStatus();
        this.f15219OooO0Oo.countDown();
        if (this.f15225OooOO0O) {
            this.f15220OooO0o = null;
        } else {
            ResultCallback<? super R> resultCallback = this.f15220OooO0o;
            if (resultCallback != null) {
                this.f15217OooO0O0.removeMessages(2);
                this.f15217OooO0O0.zaa(resultCallback, OooO00o());
            } else if (this.f15223OooO0oo instanceof Releasable) {
                this.mResultGuardian = new o0OO(this);
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f15221OooO0o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).onComplete(this.f15215OooO);
        }
        this.f15221OooO0o0.clear();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.f15216OooO00o) {
            if (isReady()) {
                statusListener.onComplete(this.f15215OooO);
            } else {
                this.f15221OooO0o0.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed");
        Preconditions.checkState(this.f15228OooOOO0 == null, "Cannot await if then() has been called.");
        try {
            this.f15219OooO0Oo.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) OooO00o();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.f15216OooO00o) {
            if (!this.f15225OooOO0O && !this.f15224OooOO0) {
                zal(this.f15223OooO0oo);
                this.f15225OooOO0O = true;
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
        synchronized (this.f15216OooO00o) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.f15226OooOO0o = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.f15216OooO00o) {
            z = this.f15225OooOO0O;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.f15219OooO0Oo.getCount() == 0;
    }

    @KeepForSdk
    public final void setResult(@NonNull R r) {
        synchronized (this.f15216OooO00o) {
            if (this.f15226OooOO0o || this.f15225OooOO0O) {
                zal(r);
                return;
            }
            isReady();
            Preconditions.checkState(!isReady(), "Results have already been set");
            Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed");
            OooO0O0(r);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@Nullable ResultCallback<? super R> resultCallback) {
        synchronized (this.f15216OooO00o) {
            try {
                if (resultCallback == null) {
                    this.f15220OooO0o = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed.");
                if (this.f15228OooOOO0 != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f15217OooO0O0.zaa(resultCallback, OooO00o());
                } else {
                    this.f15220OooO0o = resultCallback;
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
        Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed.");
        synchronized (this.f15216OooO00o) {
            Preconditions.checkState(this.f15228OooOOO0 == null, "Cannot call then() twice.");
            Preconditions.checkState(this.f15220OooO0o == null, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(!this.f15225OooOO0O, "Cannot call then() if result was canceled.");
            this.f15227OooOOO = true;
            this.f15228OooOOO0 = new zada<>(this.f15218OooO0OO);
            transformedResultThen = this.f15228OooOOO0.then(resultTransform);
            if (isReady()) {
                this.f15217OooO0O0.zaa(this.f15228OooOOO0, OooO00o());
            } else {
                this.f15220OooO0o = this.f15228OooOOO0;
            }
        }
        return transformedResultThen;
    }

    public final void zak() {
        this.f15227OooOOO = this.f15227OooOOO || f15214OooOOOO.get().booleanValue();
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.f15216OooO00o) {
            if (this.f15218OooO0OO.get() == null || !this.f15227OooOOO) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    public final void zan(@Nullable o0OO0 o0oo1) {
        this.f15222OooO0oO.set(o0oo1);
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
            int i = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), r)));
        }

        public CallbackHandler(@NonNull Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(@NonNull Looper looper) {
        this.f15216OooO00o = new Object();
        this.f15219OooO0Oo = new CountDownLatch(1);
        this.f15221OooO0o0 = new ArrayList<>();
        this.f15222OooO0oO = new AtomicReference<>();
        this.f15227OooOOO = false;
        this.f15217OooO0O0 = new CallbackHandler<>(looper);
        this.f15218OooO0OO = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed.");
        Preconditions.checkState(this.f15228OooOOO0 == null, "Cannot await if then() has been called.");
        try {
            if (!this.f15219OooO0Oo.await(j, timeUnit)) {
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
        synchronized (this.f15216OooO00o) {
            try {
                if (resultCallback == null) {
                    this.f15220OooO0o = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.f15224OooOO0, "Result has already been consumed.");
                if (this.f15228OooOOO0 != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f15217OooO0O0.zaa(resultCallback, OooO00o());
                } else {
                    this.f15220OooO0o = resultCallback;
                    CallbackHandler<R> callbackHandler = this.f15217OooO0O0;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public BasePendingResult(@Nullable GoogleApiClient googleApiClient) {
        this.f15216OooO00o = new Object();
        this.f15219OooO0Oo = new CountDownLatch(1);
        this.f15221OooO0o0 = new ArrayList<>();
        this.f15222OooO0oO = new AtomicReference<>();
        this.f15227OooOOO = false;
        this.f15217OooO0O0 = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.f15218OooO0OO = new WeakReference<>(googleApiClient);
    }
}
