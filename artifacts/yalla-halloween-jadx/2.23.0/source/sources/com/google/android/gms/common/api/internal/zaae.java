package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import p188o00o0O.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zaae extends zap {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO0<ApiKey<?>> f14812OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final GoogleApiManager f14813OooOO0;

    @VisibleForTesting
    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f14812OooO = new OooOOO0<>();
        this.f14813OooOO0 = googleApiManager;
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
        zaaeVar.f14812OooO.add(apiKey);
        googleApiManager.zaC(zaaeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0O0(ConnectionResult connectionResult, int i) {
        this.f14813OooOO0.zaz(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO() {
        this.f14813OooOO0.zaA();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f14812OooO.isEmpty()) {
            return;
        }
        this.f14813OooOO0.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        if (this.f14812OooO.isEmpty()) {
            return;
        }
        this.f14813OooOO0.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        GoogleApiManager googleApiManager = this.f14813OooOO0;
        googleApiManager.getClass();
        synchronized (GoogleApiManager.f14730OooOo00) {
            if (googleApiManager.f14740OooOOO == this) {
                googleApiManager.f14740OooOOO = null;
                googleApiManager.f14742OooOOOO.clear();
            }
        }
    }
}
