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
import com.code.android.util.ProcessLifecycleObserver;
import com.code.android.util.o000O00O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import p190o00o0O.OooOO0O;
import p388o0OOooOO.o00O00o0;
import p590o0oOooo0.j0;
import p590o0oOooo0.oO;
import p590o0oOooo0.oOo0o00;
import p595o0oo00O.OooOo00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public class App extends MultiDexApplication {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static App f22232OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f22233OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Handler f22234OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ProcessLifecycleObserver f22235OooO0Oo;

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context context2 = o000O00O.f13421OooO00o;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o000O00O.f13421OooO00o = context;
        OooOo00.OooO0o(context);
        super.attachBaseContext(context);
        oOo0o00.f57239OooO00o = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("App attachBaseContext", ViewHierarchyConstants.TEXT_KEY);
        o0000O00.OooO0OO("TaskDispatcher", "App attachBaseContext  " + (System.currentTimeMillis() - oOo0o00.f57239OooO00o));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOo00.OooO0o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        o0000O00.OooO0O0("ApponCreate");
        f22232OooO0o = this;
        if (j0.OooO00o(getApplicationContext()) && oO.OooO00o()) {
            f22234OooO0oO = new Handler(Looper.getMainLooper());
            OooOo00.OooO0o(this);
            Intrinsics.checkNotNullParameter("App onCreate", ViewHierarchyConstants.TEXT_KEY);
            o0000O00.OooO0OO("TaskDispatcher", "App onCreate  " + (System.currentTimeMillis() - oOo0o00.f57239OooO00o));
            if (AppCompatDelegate.f2289OooO0o0 != 1) {
                AppCompatDelegate.f2289OooO0o0 = 1;
                synchronized (AppCompatDelegate.f2293OooOO0O) {
                    OooOO0O<WeakReference<AppCompatDelegate>> oooOO0O = AppCompatDelegate.f2292OooOO0;
                    oooOO0O.getClass();
                    OooOO0O.OooO00o oooO00o = new OooOO0O.OooO00o();
                    while (oooO00o.hasNext()) {
                        AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) oooO00o.next()).get();
                        if (appCompatDelegate != null) {
                            appCompatDelegate.OooO0Oo();
                        }
                    }
                }
            }
            this.f22235OooO0Oo = new ProcessLifecycleObserver();
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this.f22235OooO0Oo);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        try {
            OooO0OO.OooO0O0(f22232OooO0o).OooO00o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        ExecutorService executorService = o00O00o0.f43547OooO0O0;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = o00O00o0.f43548OooO0OO;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
        ExecutorService executorService3 = o00O00o0.f43549OooO0Oo;
        if (executorService3 != null) {
            executorService3.shutdown();
        }
        ExecutorService executorService4 = o00O00o0.f43551OooO0o0;
        if (executorService4 != null) {
            executorService4.shutdown();
        }
        ExecutorService executorService5 = o00O00o0.f43550OooO0o;
        if (executorService5 != null) {
            executorService5.shutdown();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        try {
            OooO0OO.OooO0O0(f22232OooO0o).onTrimMemory(i);
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
