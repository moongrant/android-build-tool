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

/* JADX INFO: loaded from: classes2.dex */
public final class zacc extends zap {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TaskCompletionSource<Void> f15398OoooO0;

    public zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f15398OoooO0 = new TaskCompletionSource<>();
        lifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(@NonNull Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zacc zaccVar = (zacc) fragment.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if (zaccVar == null) {
            return new zacc(fragment);
        }
        if (zaccVar.f15398OoooO0.getTask().isComplete()) {
            zaccVar.f15398OoooO0 = new TaskCompletionSource<>();
        }
        return zaccVar;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO(ConnectionResult connectionResult, int i) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.f15398OoooO0.setException(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0Oo() {
        Activity lifecycleActivity = this.f15254Oooo0o.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.f15398OoooO0.trySetException(new ApiException(new Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.f15433OoooO00.isGooglePlayServicesAvailable(lifecycleActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.f15398OoooO0.trySetResult(null);
        } else {
            if (this.f15398OoooO0.getTask().isComplete()) {
                return;
            }
            zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.f15398OoooO0.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final Task<Void> zad() {
        return this.f15398OoooO0.getTask();
    }
}
