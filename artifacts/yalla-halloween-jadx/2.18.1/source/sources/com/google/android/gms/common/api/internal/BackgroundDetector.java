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

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final BackgroundDetector f15207OoooO00 = new BackgroundDetector();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final AtomicBoolean f15209Oooo0o = new AtomicBoolean();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final AtomicBoolean f15210Oooo0oO = new AtomicBoolean();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @GuardedBy("sInstance")
    public final ArrayList f15211Oooo0oo = new ArrayList();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @GuardedBy("sInstance")
    public boolean f15208Oooo = false;

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
        return f15207OoooO00;
    }

    @KeepForSdk
    public static void initialize(@NonNull Application application) {
        BackgroundDetector backgroundDetector = f15207OoooO00;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f15208Oooo) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f15208Oooo = true;
            }
        }
    }

    public final void OooO00o(boolean z) {
        synchronized (f15207OoooO00) {
            Iterator it = this.f15211Oooo0oo.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z);
            }
        }
    }

    @KeepForSdk
    public void addListener(@NonNull BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f15207OoooO00) {
            this.f15211Oooo0oo.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.f15209Oooo0o.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean zCompareAndSet = this.f15209Oooo0o.compareAndSet(true, false);
        this.f15210Oooo0oO.set(true);
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
        boolean zCompareAndSet = this.f15209Oooo0o.compareAndSet(true, false);
        this.f15210Oooo0oO.set(true);
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
        if (i == 20 && this.f15209Oooo0o.compareAndSet(false, true)) {
            this.f15210Oooo0oO.set(true);
            OooO00o(true);
        }
    }

    @KeepForSdk
    @TargetApi(16)
    public boolean readCurrentStateIfPossible(boolean z) {
        if (!this.f15210Oooo0oO.get()) {
            if (!PlatformVersion.isAtLeastJellyBean()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f15210Oooo0oO.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f15209Oooo0o.set(true);
            }
        }
        return isInBackground();
    }
}
