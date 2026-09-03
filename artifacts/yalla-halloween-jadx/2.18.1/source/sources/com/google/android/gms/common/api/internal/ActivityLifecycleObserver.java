package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p331o0O0oooO.o0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@NonNull Activity activity) {
        o0 o0Var;
        synchronized (activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            o0Var = (o0) fragment.getCallbackOrNull("LifecycleObserverOnStop", o0.class);
            if (o0Var == null) {
                o0Var = new o0(fragment);
            }
        }
        return new zab(o0Var);
    }

    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable runnable);
}
