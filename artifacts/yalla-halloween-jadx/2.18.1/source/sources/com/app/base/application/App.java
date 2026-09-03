package com.app.base.application;

import android.app.Application;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.multidex.MultiDexApplication;
import com.bumptech.glide.OooO0OO;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import p031OoooO.o0000O;
import p137o00OO0oo.OooOO0O;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o00000OO;
import p254o00ooO0O.o00O000;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000000;
import p617o0oo0o.o00000O;
import p640o0ooO0oO.o000O0O0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class App extends MultiDexApplication {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static int f11456Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static boolean f11457Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static App f11458Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static Handler f11459Oooo0oo;

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o00O000.f34347OooO0O0 = context;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o0000O.f2657OooO00o = context;
        oo000o.OooO0o(f11458Oooo0oO);
        super.attachBaseContext(context);
        o00000O.f48475OooO00o = System.currentTimeMillis();
        String text = o000O0O0.OooO00o(-40612382613008L);
        Intrinsics.checkNotNullParameter(text, "text");
        o00O00.OooO0OO("TaskDispatcher", text + "  " + (System.currentTimeMillis() - o00000O.f48475OooO00o));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oo000o.OooO0o(this);
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        if (o000000.OooO00o(getApplicationContext())) {
            f11459Oooo0oo = new Handler(Looper.getMainLooper());
            oo000o.OooO0o(this);
            f11458Oooo0oO = this;
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Intrinsics.checkNotNullParameter(this, "applicationContext");
            Intrinsics.checkNotNullParameter(this, "<set-?>");
            o00O000.f34347OooO0O0 = this;
            p254o00ooO0O.o00000O o00000o = p254o00ooO0O.o00000O.f34254OooO00o;
            Context context = o00O000.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            ((Application) context).registerActivityLifecycleCallbacks(new o00000OO());
            String text = o000O0O0.OooO00o(-40556548038160L);
            Intrinsics.checkNotNullParameter(text, "text");
            StringBuilder sbOooO00o = Oooo0.OooO00o(text, "  ");
            sbOooO00o.append(System.currentTimeMillis() - o00000O.f48475OooO00o);
            o00O00.OooO0OO("TaskDispatcher", sbOooO00o.toString());
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        try {
            OooO0OO.OooO0O0(f11458Oooo0oO).OooO00o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        ExecutorService executorService = OooOO0O.f31655OooO0O0;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = OooOO0O.f31656OooO0OO;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
        ExecutorService executorService3 = OooOO0O.f31657OooO0Oo;
        if (executorService3 != null) {
            executorService3.shutdown();
        }
        ExecutorService executorService4 = OooOO0O.f31659OooO0o0;
        if (executorService4 != null) {
            executorService4.shutdown();
        }
        ExecutorService executorService5 = OooOO0O.f31658OooO0o;
        if (executorService5 != null) {
            executorService5.shutdown();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        try {
            OooO0OO.OooO0O0(f11458Oooo0oO).onTrimMemory(i);
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
