package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import p190o00o0O.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class zaae extends zap {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0O<ApiKey<?>> f14336OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final GoogleApiManager f14337OooOO0;

    @VisibleForTesting
    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f14336OooO = new OooOO0O<>();
        this.f14337OooOO0 = googleApiManager;
        lifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @MainThread
    public static void zad(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zaae zaaeVar = (zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new zaae(fragment, googleApiManager, GoogleApiAvailability.getInstance());
        }
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaaeVar.f14336OooO.add(apiKey);
        googleApiManager.zaC(zaaeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0O0(ConnectionResult connectionResult, int i) {
        this.f14337OooOO0.zaz(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO() {
        this.f14337OooOO0.zaA();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f14336OooO.isEmpty()) {
            return;
        }
        this.f14337OooOO0.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        if (this.f14336OooO.isEmpty()) {
            return;
        }
        this.f14337OooOO0.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        GoogleApiManager googleApiManager = this.f14337OooOO0;
        googleApiManager.getClass();
        synchronized (GoogleApiManager.f14254OooOo00) {
            if (googleApiManager.f14264OooOOO == this) {
                googleApiManager.f14264OooOOO = null;
                googleApiManager.f14266OooOOOO.clear();
            }
        }
    }
}
