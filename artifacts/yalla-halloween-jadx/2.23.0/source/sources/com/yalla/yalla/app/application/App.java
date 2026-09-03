package com.yalla.yalla.app.application;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDexApplication;
import com.bumptech.glide.OooO0OO;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import p379o0OOoo.OooOOOO;
import p579o0oOoo.o0oo0000;
import p579o0oOoo.oO00o00;
import p579o0oOoo.oOO0OO0O;
import p591o0oo000O.OooO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public class App extends MultiDexApplication {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static App f22702OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f22703OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Handler f22704OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ProcessLifecycleObserver f22705OooO0Oo;

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context context2 = o000O0.f10354OooO00o;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o000O0.f10354OooO00o = context;
        OooO.OooO0o(context);
        super.attachBaseContext(context);
        oO00o00.f56562OooO00o = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("App attachBaseContext", ViewHierarchyConstants.TEXT_KEY);
        OooOOO0.OooO0OO("TaskDispatcher", "App attachBaseContext  " + (System.currentTimeMillis() - oO00o00.f56562OooO00o));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooO.OooO0o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        OooOOO0.OooO0O0("ApponCreate");
        f22702OooO0o = this;
        if (oOO0OO0O.OooO00o(getApplicationContext()) && o0oo0000.OooO00o()) {
            f22704OooO0oO = new Handler(Looper.getMainLooper());
            OooO.OooO0o(this);
            Intrinsics.checkNotNullParameter("App onCreate", ViewHierarchyConstants.TEXT_KEY);
            OooOOO0.OooO0OO("TaskDispatcher", "App onCreate  " + (System.currentTimeMillis() - oO00o00.f56562OooO00o));
            if (AppCompatDelegate.f2291OooO0o0 != 1) {
                AppCompatDelegate.f2291OooO0o0 = 1;
                synchronized (AppCompatDelegate.f2295OooOO0O) {
                    p188o00o0O.OooOOO0<WeakReference<AppCompatDelegate>> oooOOO0 = AppCompatDelegate.f2294OooOO0;
                    oooOOO0.getClass();
                    o00o0O.OooOOO0.OooO00o oooO00o = new o00o0O.OooOOO0.OooO00o();
                    while (oooO00o.hasNext()) {
                        AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) oooO00o.next()).get();
                        if (appCompatDelegate != null) {
                            appCompatDelegate.OooO0Oo();
                        }
                    }
                }
            }
            this.f22705OooO0Oo = new ProcessLifecycleObserver();
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this.f22705OooO0Oo);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        try {
            OooO0OO.OooO0O0(f22702OooO0o).OooO00o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        ExecutorService executorService = OooOOOO.f44241OooO0O0;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = OooOOOO.f44242OooO0OO;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
        ExecutorService executorService3 = OooOOOO.f44243OooO0Oo;
        if (executorService3 != null) {
            executorService3.shutdown();
        }
        ExecutorService executorService4 = OooOOOO.f44245OooO0o0;
        if (executorService4 != null) {
            executorService4.shutdown();
        }
        ExecutorService executorService5 = OooOOOO.f44244OooO0o;
        if (executorService5 != null) {
            executorService5.shutdown();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        try {
            OooO0OO.OooO0O0(f22702OooO0o).onTrimMemory(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }
}
