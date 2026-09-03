package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p254o00ooOO0.o000OOo0;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@NonNull Activity activity) {
        o000OOo0 o000ooo1;
        synchronized (activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            o000ooo1 = (o000OOo0) fragment.getCallbackOrNull("LifecycleObserverOnStop", o000OOo0.class);
            if (o000ooo1 == null) {
                o000ooo1 = new o000OOo0(fragment);
            }
        }
        return new zab(o000ooo1);
    }

    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable runnable);
}
