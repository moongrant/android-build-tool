package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;
import p254o00ooOO0.o0;
import p254o00ooOO0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicReference<o0oOOo> f14928OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile boolean f14929OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zaq f14930OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final GoogleApiAvailability f14931OooO0oo;

    @VisibleForTesting
    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f14928OooO0o = new AtomicReference<>(null);
        this.f14930OooO0oO = new zaq(Looper.getMainLooper());
        this.f14931OooO0oo = googleApiAvailability;
    }

    public abstract void OooO0O0(ConnectionResult connectionResult, int i);

    public abstract void OooO0OO();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        AtomicReference<o0oOOo> atomicReference = this.f14928OooO0o;
        o0oOOo o0oooo = atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int iIsGooglePlayServicesAvailable = this.f14931OooO0oo.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    atomicReference.set(null);
                    OooO0OO();
                    return;
                } else {
                    if (o0oooo == null) {
                        return;
                    }
                    if (o0oooo.f41009OooO0O0.getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            OooO0OO();
            return;
        } else if (i2 == 0) {
            if (o0oooo == null) {
                return;
            }
            ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, o0oooo.f41009OooO0O0.toString());
            atomicReference.set(null);
            OooO0O0(connectionResult, o0oooo.f41008OooO00o);
            return;
        }
        if (o0oooo != null) {
            atomicReference.set(null);
            OooO0O0(o0oooo.f41009OooO0O0, o0oooo.f41008OooO00o);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference<o0oOOo> atomicReference = this.f14928OooO0o;
        o0oOOo o0oooo = atomicReference.get();
        int i = o0oooo == null ? -1 : o0oooo.f41008OooO00o;
        atomicReference.set(null);
        OooO0O0(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14928OooO0o.set(bundle.getBoolean("resolving_error", false) ? new o0oOOo(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o0oOOo o0oooo = this.f14928OooO0o.get();
        if (o0oooo == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", o0oooo.f41008OooO00o);
        ConnectionResult connectionResult = o0oooo.f41009OooO0O0;
        bundle.putInt("failed_status", connectionResult.getErrorCode());
        bundle.putParcelable("failed_resolution", connectionResult.getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f14929OooO0o0 = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f14929OooO0o0 = false;
    }

    public final void zah(ConnectionResult connectionResult, int i) {
        boolean z;
        o0oOOo o0oooo = new o0oOOo(connectionResult, i);
        AtomicReference<o0oOOo> atomicReference = this.f14928OooO0o;
        while (true) {
            if (atomicReference.compareAndSet(null, o0oooo)) {
                z = true;
                break;
            } else if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            this.f14930OooO0oO.post(new o0(this, o0oooo));
        }
    }
}
