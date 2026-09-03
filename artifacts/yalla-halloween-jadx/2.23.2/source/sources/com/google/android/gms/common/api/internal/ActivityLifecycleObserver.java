package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p256o00ooOO0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@NonNull Activity activity) {
        o00O0000 o00o0001;
        synchronized (activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            o00o0001 = (o00O0000) fragment.getCallbackOrNull("LifecycleObserverOnStop", o00O0000.class);
            if (o00o0001 == null) {
                o00o0001 = new o00O0000(fragment);
            }
        }
        return new zab(o00o0001);
    }

    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable runnable);
}
