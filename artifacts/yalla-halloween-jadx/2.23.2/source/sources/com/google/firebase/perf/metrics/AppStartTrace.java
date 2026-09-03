package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.OooOOO0;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import androidx.core.widget.OooO0o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.android.billingclient.api.o0000Ooo;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.OooO0OO;
import com.google.firebase.perf.util.OooOO0;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o000O0Oo.o000oOoO;
import p039OoooOoo.o00O0O0O;
import p309o0O0oO0.o000OOo0;
import p316o0O0oOo0.o0OO00O;
import p626o0ooO.o0O0O00;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NonNull
    public static final Timer f19938OooOoO = new Timer();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final long f19939OooOoOO = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static ExecutorService f19940OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static volatile AppStartTrace f19941OooOoo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Context f19942OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000Ooo f19944OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO00O f19945OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000OOo0 f19946OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TraceMetric.OooO0O0 f19947OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Timer f19949OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Timer f19950OooOO0o;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public PerfSession f19959OooOo0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f19943OooO0Oo = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f19948OooOO0 = false;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Timer f19952OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Timer f19951OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Timer f19953OooOOOO = null;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Timer f19954OooOOOo = null;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Timer f19956OooOOo0 = null;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Timer f19955OooOOo = null;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Timer f19957OooOOoo = null;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Timer f19960OooOo00 = null;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f19961OooOo0O = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f19962OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f19958OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f19963OooOoO0 = false;

    public final class OooO00o implements ViewTreeObserver.OnDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.f19962OooOo0o++;
        }
    }

    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AppStartTrace f19965OooO0Oo;

        public OooO0O0(AppStartTrace appStartTrace) {
            this.f19965OooO0Oo = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.f19965OooO0Oo;
            if (appStartTrace.f19952OooOOO0 == null) {
                appStartTrace.f19961OooOo0O = true;
            }
        }
    }

    public AppStartTrace(@NonNull o0OO00O o0oo00o2, @NonNull o0000Ooo o0000ooo, @NonNull o000OOo0 o000ooo1, @NonNull ThreadPoolExecutor threadPoolExecutor) {
        Timer timer;
        Timer timer2 = null;
        this.f19945OooO0o0 = o0oo00o2;
        this.f19944OooO0o = o0000ooo;
        this.f19946OooO0oO = o000ooo1;
        f19940OooOoo = threadPoolExecutor;
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0("_experiment_app_start_ttid");
        this.f19947OooO0oo = oooO0O0NewBuilder;
        if (Build.VERSION.SDK_INT >= 24) {
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(startElapsedRealtime);
            timer = new Timer((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            timer = null;
        }
        this.f19949OooOO0O = timer;
        o0O0O00 o0o0o00 = (o0O0O00) o0OOO0o.OooO0OO().OooO0O0(o0O0O00.class);
        if (o0o0o00 != null) {
            long jOooO00o = o0o0o00.OooO00o();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(jOooO00o);
            timer2 = new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.f19950OooOO0o = timer2;
    }

    public static AppStartTrace OooO0O0() {
        if (f19941OooOoo0 != null) {
            return f19941OooOoo0;
        }
        o0OO00O o0oo00o2 = o0OO00O.f41914OooOo0O;
        o0000Ooo o0000ooo = new o0000Ooo();
        if (f19941OooOoo0 == null) {
            synchronized (AppStartTrace.class) {
                if (f19941OooOoo0 == null) {
                    f19941OooOoo0 = new AppStartTrace(o0oo00o2, o0000ooo, o000OOo0.OooO0o0(), new ThreadPoolExecutor(0, 1, f19939OooOoOO + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return f19941OooOoo0;
    }

    public static boolean OooO0Oo(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String strOooO00o = OooOOOO.OooO00o(packageName, CertificateUtil.DELIMITER);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strOooO00o))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @NonNull
    public final Timer OooO00o() {
        Timer timer = this.f19950OooOO0o;
        return timer != null ? timer : f19938OooOoO;
    }

    @NonNull
    public final Timer OooO0OO() {
        Timer timer = this.f19949OooOO0O;
        return timer != null ? timer : OooO00o();
    }

    public final synchronized void OooO0o(@NonNull Context context) {
        if (this.f19943OooO0Oo) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f19963OooOoO0 = this.f19963OooOoO0 || OooO0Oo(applicationContext);
            this.f19943OooO0Oo = true;
            this.f19942OooO = applicationContext;
        }
    }

    public final void OooO0o0(TraceMetric.OooO0O0 oooO0O0) {
        if (this.f19955OooOOo == null || this.f19957OooOOoo == null || this.f19960OooOo00 == null) {
            return;
        }
        f19940OooOoo.execute(new o000oOoO(1, this, oooO0O0));
        OooO0oO();
    }

    public final synchronized void OooO0oO() {
        if (this.f19943OooO0Oo) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
            ((Application) this.f19942OooO).unregisterActivityLifecycleCallbacks(this);
            this.f19943OooO0Oo = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f19961OooOo0O && this.f19952OooOOO0 == null) {
            this.f19963OooOoO0 = this.f19963OooOoO0 || OooO0Oo(this.f19942OooO);
            new WeakReference(activity);
            this.f19944OooO0o.getClass();
            this.f19952OooOOO0 = new Timer();
            Timer timerOooO0OO = OooO0OO();
            Timer timer = this.f19952OooOOO0;
            timerOooO0OO.getClass();
            if (timer.f20005OooO0o0 - timerOooO0OO.f20005OooO0o0 > f19939OooOoOO) {
                this.f19948OooOO0 = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f19961OooOo0O || this.f19948OooOO0 || !this.f19946OooO0oO.OooO0o()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f19958OooOo);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x0016, B:13:0x0037, B:15:0x0041, B:20:0x004c, B:22:0x005c, B:21:0x0055, B:23:0x0072, B:27:0x0078, B:29:0x00d5), top: B:37:0x0003 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (!this.f19961OooOo0O && !this.f19948OooOO0) {
            boolean zOooO0o = this.f19946OooO0oO.OooO0o();
            int i = 3;
            if (zOooO0o) {
                View viewFindViewById = activity.findViewById(R.id.content);
                viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f19958OooOo);
                OooO0OO oooO0OO = new OooO0OO(viewFindViewById, new o00O0O0O(this, 2));
                if (Build.VERSION.SDK_INT >= 26) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(oooO0OO);
                } else {
                    if (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow()) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(oooO0OO);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new com.google.firebase.perf.util.OooO0O0(oooO0OO));
                    }
                }
                viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new OooOO0(viewFindViewById, new OooOOO0(this, 3), new OooO0o(this, 2)));
            }
            if (this.f19953OooOOOO != null) {
                return;
            }
            new WeakReference(activity);
            this.f19944OooO0o.getClass();
            this.f19953OooOOOO = new Timer();
            this.f19959OooOo0 = SessionManager.getInstance().perfSession();
            p311o0O0oO0o.o0O0O00 o0o0o00OooO0Oo = p311o0O0oO0o.o0O0O00.OooO0Oo();
            StringBuilder sb = new StringBuilder("onResume(): ");
            sb.append(activity.getClass().getName());
            sb.append(": ");
            Timer timerOooO00o = OooO00o();
            Timer timer = this.f19953OooOOOO;
            timerOooO00o.getClass();
            sb.append(timer.f20005OooO0o0 - timerOooO00o.f20005OooO0o0);
            sb.append(" microseconds");
            o0o0o00OooO0Oo.OooO00o(sb.toString());
            f19940OooOoo.execute(new androidx.activity.OooOOOO(this, i));
            if (!zOooO0o) {
                OooO0oO();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f19961OooOo0O && this.f19951OooOOO == null && !this.f19948OooOO0) {
            this.f19944OooO0o.getClass();
            this.f19951OooOOO = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f19961OooOo0O || this.f19948OooOO0 || this.f19956OooOOo0 != null) {
            return;
        }
        this.f19944OooO0o.getClass();
        this.f19956OooOOo0 = new Timer();
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0("_experiment_firstBackgrounding");
        oooO0O0NewBuilder.OooOO0O(OooO0OO().f20004OooO0Oo);
        Timer timerOooO0OO = OooO0OO();
        Timer timer = this.f19956OooOOo0;
        timerOooO0OO.getClass();
        oooO0O0NewBuilder.OooOO0o(timer.f20005OooO0o0 - timerOooO0OO.f20005OooO0o0);
        this.f19947OooO0oo.OooO0o(oooO0O0NewBuilder.build());
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.f19961OooOo0O || this.f19948OooOO0 || this.f19954OooOOOo != null) {
            return;
        }
        this.f19944OooO0o.getClass();
        this.f19954OooOOOo = new Timer();
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0("_experiment_firstForegrounding");
        oooO0O0NewBuilder.OooOO0O(OooO0OO().f20004OooO0Oo);
        Timer timerOooO0OO = OooO0OO();
        Timer timer = this.f19954OooOOOo;
        timerOooO0OO.getClass();
        oooO0O0NewBuilder.OooOO0o(timer.f20005OooO0o0 - timerOooO0OO.f20005OooO0o0);
        this.f19947OooO0oo.OooO0o(oooO0O0NewBuilder.build());
    }
}
