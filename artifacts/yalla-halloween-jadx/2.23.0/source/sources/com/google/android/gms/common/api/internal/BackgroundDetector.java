package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final BackgroundDetector f14706OooO0oo = new BackgroundDetector();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f14707OooO0Oo = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f14709OooO0o0 = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("sInstance")
    public final ArrayList f14708OooO0o = new ArrayList();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("sInstance")
    public boolean f14710OooO0oO = false;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @KeepForSdk
    public BackgroundDetector() {
    }

    @NonNull
    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return f14706OooO0oo;
    }

    @KeepForSdk
    public static void initialize(@NonNull Application application) {
        BackgroundDetector backgroundDetector = f14706OooO0oo;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f14710OooO0oO) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f14710OooO0oO = true;
            }
        }
    }

    public final void OooO00o(boolean z) {
        synchronized (f14706OooO0oo) {
            Iterator it = this.f14708OooO0o.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z);
            }
        }
    }

    @KeepForSdk
    public void addListener(@NonNull BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f14706OooO0oo) {
            this.f14708OooO0o.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.f14707OooO0Oo.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean zCompareAndSet = this.f14707OooO0Oo.compareAndSet(true, false);
        this.f14709OooO0o0.set(true);
        if (zCompareAndSet) {
            OooO00o(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        boolean zCompareAndSet = this.f14707OooO0Oo.compareAndSet(true, false);
        this.f14709OooO0o0.set(true);
        if (zCompareAndSet) {
            OooO00o(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f14707OooO0Oo.compareAndSet(false, true)) {
            this.f14709OooO0o0.set(true);
            OooO00o(true);
        }
    }

    @KeepForSdk
    @TargetApi(16)
    public boolean readCurrentStateIfPossible(boolean z) {
        AtomicBoolean atomicBoolean = this.f14709OooO0o0;
        if (!atomicBoolean.get()) {
            if (!PlatformVersion.isAtLeastJellyBean()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f14707OooO0Oo.set(true);
            }
        }
        return isInBackground();
    }
}
