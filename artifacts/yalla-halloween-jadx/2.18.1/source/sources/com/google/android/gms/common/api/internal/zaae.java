package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Objects;
import p021OooOooo.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zaae extends zap {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0OoOo0<ApiKey<?>> f15313OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final GoogleApiManager f15314OoooO0O;

    @VisibleForTesting
    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f15313OoooO0 = new o0OoOo0<>(0);
        this.f15314OoooO0O = googleApiManager;
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
        zaaeVar.f15313OoooO0.add(apiKey);
        googleApiManager.zaC(zaaeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO(ConnectionResult connectionResult, int i) {
        this.f15314OoooO0O.zaz(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0Oo() {
        this.f15314OoooO0O.zaA();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f15313OoooO0.isEmpty()) {
            return;
        }
        this.f15314OoooO0O.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        if (this.f15313OoooO0.isEmpty()) {
            return;
        }
        this.f15314OoooO0O.zaC(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [OooOooo.o0OoOo0, java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>>] */
    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        GoogleApiManager googleApiManager = this.f15314OoooO0O;
        Objects.requireNonNull(googleApiManager);
        synchronized (GoogleApiManager.f15230Ooooo0o) {
            if (googleApiManager.f15241OoooOOO == this) {
                googleApiManager.f15241OoooOOO = null;
                googleApiManager.f15242OoooOOo.clear();
            }
        }
    }
}
