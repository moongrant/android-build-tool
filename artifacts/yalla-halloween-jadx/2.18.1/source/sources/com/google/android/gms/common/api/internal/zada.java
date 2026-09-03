package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import p331o0O0oooO.o0OO00OO;
import p331o0O0oooO.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final WeakReference<GoogleApiClient> f15416OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OO00OO f15417OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ResultTransform<? super R, ? extends Result> f15410OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public zada<? extends Result> f15411OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public volatile ResultCallbacks<? super R> f15412OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public PendingResult<R> f15413OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f15415OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Status f15414OooO0o = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f15409OooO = false;

    public zada(WeakReference<GoogleApiClient> weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.f15416OooO0oO = weakReference;
        GoogleApiClient googleApiClient = weakReference.get();
        this.f15417OooO0oo = new o0OO00OO(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    public static final void OooO0Oo(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    public final void OooO00o(Status status) {
        synchronized (this.f15415OooO0o0) {
            this.f15414OooO0o = status;
            OooO0OO(status);
        }
    }

    @GuardedBy("mSyncToken")
    public final void OooO0O0() {
        if (this.f15410OooO00o == null && this.f15412OooO0OO == null) {
            return;
        }
        GoogleApiClient googleApiClient = this.f15416OooO0oO.get();
        if (!this.f15409OooO && this.f15410OooO00o != null && googleApiClient != null) {
            googleApiClient.zao(this);
            this.f15409OooO = true;
        }
        Status status = this.f15414OooO0o;
        if (status != null) {
            OooO0OO(status);
            return;
        }
        PendingResult<R> pendingResult = this.f15413OooO0Oo;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    public final void OooO0OO(Status status) {
        synchronized (this.f15415OooO0o0) {
            ResultTransform<? super R, ? extends Result> resultTransform = this.f15410OooO00o;
            if (resultTransform != null) {
                ((zada) Preconditions.checkNotNull(this.f15411OooO0O0)).OooO00o((Status) Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
            } else {
                if ((this.f15412OooO0OO == null || this.f15416OooO0oO.get() == null) ? false : true) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.f15412OooO0OO)).onFailure(status);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.f15415OooO0o0) {
            boolean z = true;
            Preconditions.checkState(this.f15412OooO0OO == null, "Cannot call andFinally() twice.");
            if (this.f15410OooO00o != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f15412OooO0OO = resultCallbacks;
            OooO0O0();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        synchronized (this.f15415OooO0o0) {
            try {
                if (!r.getStatus().isSuccess()) {
                    OooO00o(r.getStatus());
                    OooO0Oo(r);
                } else if (this.f15410OooO00o != null) {
                    zaco.zaa().submit(new oo0ooO(this, r));
                } else {
                    if ((this.f15412OooO0OO == null || this.f15416OooO0oO.get() == null) ? false : true) {
                        ((ResultCallbacks) Preconditions.checkNotNull(this.f15412OooO0OO)).onSuccess(r);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zada<? extends Result> zadaVar;
        synchronized (this.f15415OooO0o0) {
            boolean z = true;
            Preconditions.checkState(this.f15410OooO00o == null, "Cannot call then() twice.");
            if (this.f15412OooO0OO != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f15410OooO00o = resultTransform;
            zadaVar = new zada<>(this.f15416OooO0oO);
            this.f15411OooO0O0 = zadaVar;
            OooO0O0();
        }
        return zadaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zai(PendingResult<?> pendingResult) {
        synchronized (this.f15415OooO0o0) {
            this.f15413OooO0Oo = pendingResult;
            OooO0O0();
        }
    }
}
