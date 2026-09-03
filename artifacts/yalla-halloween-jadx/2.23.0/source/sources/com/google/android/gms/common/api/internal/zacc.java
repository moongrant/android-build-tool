package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class zacc extends zap {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TaskCompletionSource<Void> f14896OooO;

    public zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f14896OooO = new TaskCompletionSource<>();
        lifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(@NonNull Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zacc zaccVar = (zacc) fragment.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if (zaccVar == null) {
            return new zacc(fragment);
        }
        if (zaccVar.f14896OooO.getTask().isComplete()) {
            zaccVar.f14896OooO = new TaskCompletionSource<>();
        }
        return zaccVar;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0O0(ConnectionResult connectionResult, int i) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.f14896OooO.setException(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO() {
        Activity lifecycleActivity = this.f14753OooO0Oo.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.f14896OooO.trySetException(new ApiException(new Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.f14931OooO0oo.isGooglePlayServicesAvailable(lifecycleActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.f14896OooO.trySetResult(null);
        } else {
            if (this.f14896OooO.getTask().isComplete()) {
                return;
            }
            zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.f14896OooO.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final Task<Void> zad() {
        return this.f14896OooO.getTask();
    }
}
