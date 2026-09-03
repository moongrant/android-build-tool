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
import p331o0O0oooO.o0OO0o;
import p331o0O0oooO.o0OOooO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final zaq f15430Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile boolean f15431Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final AtomicReference<o0OOooO0> f15432Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final GoogleApiAvailability f15433OoooO00;

    @VisibleForTesting
    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f15432Oooo0oo = new AtomicReference<>(null);
        this.f15430Oooo = new zaq(Looper.getMainLooper());
        this.f15433OoooO00 = googleApiAvailability;
    }

    public final void OooO0O0(ConnectionResult connectionResult, int i) {
        this.f15432Oooo0oo.set(null);
        OooO0OO(connectionResult, i);
    }

    public abstract void OooO0OO(ConnectionResult connectionResult, int i);

    public abstract void OooO0Oo();

    public final void OooO0o0() {
        this.f15432Oooo0oo.set(null);
        OooO0Oo();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        o0OOooO0 o0ooooo1 = this.f15432Oooo0oo.get();
        if (i != 1) {
            if (i == 2) {
                int iIsGooglePlayServicesAvailable = this.f15433OoooO00.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    OooO0o0();
                    return;
                } else {
                    if (o0ooooo1 == null) {
                        return;
                    }
                    if (o0ooooo1.f37142OooO0O0.getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            OooO0o0();
            return;
        } else if (i2 == 0) {
            if (o0ooooo1 == null) {
                return;
            }
            OooO0O0(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, o0ooooo1.f37142OooO0O0.toString()), o0ooooo1.f37141OooO00o);
            return;
        }
        if (o0ooooo1 != null) {
            OooO0O0(o0ooooo1.f37142OooO0O0, o0ooooo1.f37141OooO00o);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        o0OOooO0 o0ooooo1 = this.f15432Oooo0oo.get();
        OooO0O0(connectionResult, o0ooooo1 == null ? -1 : o0ooooo1.f37141OooO00o);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f15432Oooo0oo.set(bundle.getBoolean("resolving_error", false) ? new o0OOooO0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o0OOooO0 o0ooooo1 = this.f15432Oooo0oo.get();
        if (o0ooooo1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", o0ooooo1.f37141OooO00o);
        bundle.putInt("failed_status", o0ooooo1.f37142OooO0O0.getErrorCode());
        bundle.putParcelable("failed_resolution", o0ooooo1.f37142OooO0O0.getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f15431Oooo0oO = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f15431Oooo0oO = false;
    }

    public final void zah(ConnectionResult connectionResult, int i) {
        o0OOooO0 o0ooooo1 = new o0OOooO0(connectionResult, i);
        if (this.f15432Oooo0oo.compareAndSet(null, o0ooooo1)) {
            this.f15430Oooo.post(new o0OO0o(this, o0ooooo1));
        }
    }
}
