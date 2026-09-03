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
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.OooO0OO;
import com.google.firebase.perf.util.OooO0o;
import com.google.firebase.perf.util.OooOO0O;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0O0OOO0.OooOo;
import o0O0oo00.OooOOO;
import p037OoooOo0.o0000O0;
import p037OoooOo0.o0000oo;
import p281o0O0O0oO.OooOO0;
import p307o0O0oO0.OooOOO0;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NonNull
    public static final Timer f20410OooOoO = new Timer();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final long f20411OooOoOO = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static ExecutorService f20412OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static volatile AppStartTrace f20413OooOoo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Context f20414OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.google.firebase.perf.util.OooO00o f20416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f20417OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0Oo0oo f20418OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TraceMetric.OooO0O0 f20419OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Timer f20421OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Timer f20422OooOO0o;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public PerfSession f20431OooOo0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f20415OooO0Oo = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f20420OooOO0 = false;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Timer f20424OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Timer f20423OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Timer f20425OooOOOO = null;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Timer f20426OooOOOo = null;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Timer f20428OooOOo0 = null;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Timer f20427OooOOo = null;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Timer f20429OooOOoo = null;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Timer f20432OooOo00 = null;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f20433OooOo0O = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f20434OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f20430OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f20435OooOoO0 = false;

    public final class OooO00o implements ViewTreeObserver.OnDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.f20434OooOo0o++;
        }
    }

    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AppStartTrace f20437OooO0Oo;

        public OooO0O0(AppStartTrace appStartTrace) {
            this.f20437OooO0Oo = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.f20437OooO0Oo;
            if (appStartTrace.f20424OooOOO0 == null) {
                appStartTrace.f20433OooOo0O = true;
            }
        }
    }

    public AppStartTrace(@NonNull OooOOO oooOOO, @NonNull com.google.firebase.perf.util.OooO00o oooO00o, @NonNull o0Oo0oo o0oo0oo2, @NonNull ThreadPoolExecutor threadPoolExecutor) {
        Timer timer;
        Timer timer2 = null;
        this.f20417OooO0o0 = oooOOO;
        this.f20416OooO0o = oooO00o;
        this.f20418OooO0oO = o0oo0oo2;
        f20412OooOoo = threadPoolExecutor;
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0("_experiment_app_start_ttid");
        this.f20419OooO0oo = oooO0O0NewBuilder;
        if (Build.VERSION.SDK_INT >= 24) {
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(startElapsedRealtime);
            timer = new Timer((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            timer = null;
        }
        this.f20421OooOO0O = timer;
        p281o0O0O0oO.OooOOO oooOOO2 = (p281o0O0O0oO.OooOOO) OooOO0.OooO0OO().OooO0O0(p281o0O0O0oO.OooOOO.class);
        if (oooOOO2 != null) {
            long jOooO00o = oooOOO2.OooO00o();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(jOooO00o);
            timer2 = new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.f20422OooOO0o = timer2;
    }

    public static AppStartTrace OooO0O0() {
        if (f20413OooOoo0 != null) {
            return f20413OooOoo0;
        }
        OooOOO oooOOO = OooOOO.f42635OooOo0O;
        com.google.firebase.perf.util.OooO00o oooO00o = new com.google.firebase.perf.util.OooO00o();
        if (f20413OooOoo0 == null) {
            synchronized (AppStartTrace.class) {
                if (f20413OooOoo0 == null) {
                    f20413OooOoo0 = new AppStartTrace(oooOOO, oooO00o, o0Oo0oo.OooO0o0(), new ThreadPoolExecutor(0, 1, f20411OooOoOO + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return f20413OooOoo0;
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
        Timer timer = this.f20422OooOO0o;
        return timer != null ? timer : f20410OooOoO;
    }

    @NonNull
    public final Timer OooO0OO() {
        Timer timer = this.f20421OooOO0O;
        return timer != null ? timer : OooO00o();
    }

    public final synchronized void OooO0o(@NonNull Context context) {
        if (this.f20415OooO0Oo) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f20435OooOoO0 = this.f20435OooOoO0 || OooO0Oo(applicationContext);
            this.f20415OooO0Oo = true;
            this.f20414OooO = applicationContext;
        }
    }

    public final void OooO0o0(TraceMetric.OooO0O0 oooO0O0) {
        if (this.f20427OooOOo == null || this.f20429OooOOoo == null || this.f20432OooOo00 == null) {
            return;
        }
        f20412OooOoo.execute(new OooOo(1, this, oooO0O0));
        OooO0oO();
    }

    public final synchronized void OooO0oO() {
        if (this.f20415OooO0Oo) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
            ((Application) this.f20414OooO).unregisterActivityLifecycleCallbacks(this);
            this.f20415OooO0Oo = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f20433OooOo0O && this.f20424OooOOO0 == null) {
            this.f20435OooOoO0 = this.f20435OooOoO0 || OooO0Oo(this.f20414OooO);
            new WeakReference(activity);
            this.f20416OooO0o.getClass();
            this.f20424OooOOO0 = new Timer();
            Timer timerOooO0OO = OooO0OO();
            Timer timer = this.f20424OooOOO0;
            timerOooO0OO.getClass();
            if (timer.f20478OooO0o0 - timerOooO0OO.f20478OooO0o0 > f20411OooOoOO) {
                this.f20420OooOO0 = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f20433OooOo0O || this.f20420OooOO0 || !this.f20418OooO0oO.OooO0o()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f20430OooOo);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x0015, B:13:0x0036, B:15:0x0040, B:20:0x004b, B:22:0x005b, B:21:0x0054, B:23:0x0072, B:27:0x0078, B:29:0x00d5), top: B:37:0x0003 }] */
    /* JADX WARN: Type inference failed for: r3v2, types: [o0O0oO0O.Oooo0] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (!this.f20433OooOo0O && !this.f20420OooOO0) {
            boolean zOooO0o = this.f20418OooO0oO.OooO0o();
            if (zOooO0o) {
                View viewFindViewById = activity.findViewById(R.id.content);
                viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f20430OooOo);
                OooO0o oooO0o = new OooO0o(viewFindViewById, new Runnable() { // from class: o0O0oO0O.Oooo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace appStartTrace = this.f42479OooO0Oo;
                        if (appStartTrace.f20432OooOo00 != null) {
                            return;
                        }
                        appStartTrace.f20416OooO0o.getClass();
                        appStartTrace.f20432OooOo00 = new Timer();
                        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
                        oooO0O0NewBuilder.OooOOO0("_experiment_onDrawFoQ");
                        oooO0O0NewBuilder.OooOO0O(appStartTrace.OooO0OO().f20477OooO0Oo);
                        Timer timerOooO0OO = appStartTrace.OooO0OO();
                        Timer timer = appStartTrace.f20432OooOo00;
                        timerOooO0OO.getClass();
                        oooO0O0NewBuilder.OooOO0o(timer.f20478OooO0o0 - timerOooO0OO.f20478OooO0o0);
                        TraceMetric traceMetricBuild = oooO0O0NewBuilder.build();
                        TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f20419OooO0oo;
                        oooO0O0.OooO0o(traceMetricBuild);
                        if (appStartTrace.f20421OooOO0O != null) {
                            TraceMetric.OooO0O0 oooO0O0NewBuilder2 = TraceMetric.newBuilder();
                            oooO0O0NewBuilder2.OooOOO0("_experiment_procStart_to_classLoad");
                            oooO0O0NewBuilder2.OooOO0O(appStartTrace.OooO0OO().f20477OooO0Oo);
                            Timer timerOooO0OO2 = appStartTrace.OooO0OO();
                            Timer timerOooO00o = appStartTrace.OooO00o();
                            timerOooO0OO2.getClass();
                            oooO0O0NewBuilder2.OooOO0o(timerOooO00o.f20478OooO0o0 - timerOooO0OO2.f20478OooO0o0);
                            oooO0O0.OooO0o(oooO0O0NewBuilder2.build());
                        }
                        oooO0O0.OooOO0(appStartTrace.f20435OooOoO0 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                        oooO0O0.OooO(appStartTrace.f20434OooOo0o, "onDrawCount");
                        oooO0O0.OooO0o0(appStartTrace.f20431OooOo0.OooO00o());
                        appStartTrace.OooO0o0(oooO0O0);
                    }
                });
                if (Build.VERSION.SDK_INT >= 26) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(oooO0o);
                } else {
                    if (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow()) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(oooO0o);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new OooO0OO(oooO0o));
                    }
                }
                viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new OooOO0O(viewFindViewById, new o0000oo(this, 2), new o0000O0(this, 1)));
            }
            if (this.f20425OooOOOO != null) {
                return;
            }
            new WeakReference(activity);
            this.f20416OooO0o.getClass();
            this.f20425OooOOOO = new Timer();
            this.f20431OooOo0 = SessionManager.getInstance().perfSession();
            OooOOO0 oooOOO0OooO0Oo = OooOOO0.OooO0Oo();
            StringBuilder sb = new StringBuilder("onResume(): ");
            sb.append(activity.getClass().getName());
            sb.append(": ");
            Timer timerOooO00o = OooO00o();
            Timer timer = this.f20425OooOOOO;
            timerOooO00o.getClass();
            sb.append(timer.f20478OooO0o0 - timerOooO00o.f20478OooO0o0);
            sb.append(" microseconds");
            oooOOO0OooO0Oo.OooO00o(sb.toString());
            f20412OooOoo.execute(new Runnable() { // from class: o0O0oO0O.o000oOoO
                @Override // java.lang.Runnable
                public final void run() {
                    Timer timer2 = AppStartTrace.f20410OooOoO;
                    AppStartTrace appStartTrace = this.f42480OooO0Oo;
                    appStartTrace.getClass();
                    TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
                    oooO0O0NewBuilder.OooOOO0(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                    oooO0O0NewBuilder.OooOO0O(appStartTrace.OooO00o().f20477OooO0Oo);
                    Timer timerOooO00o2 = appStartTrace.OooO00o();
                    Timer timer3 = appStartTrace.f20425OooOOOO;
                    timerOooO00o2.getClass();
                    oooO0O0NewBuilder.OooOO0o(timer3.f20478OooO0o0 - timerOooO00o2.f20478OooO0o0);
                    ArrayList arrayList = new ArrayList(3);
                    TraceMetric.OooO0O0 oooO0O0NewBuilder2 = TraceMetric.newBuilder();
                    oooO0O0NewBuilder2.OooOOO0(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                    oooO0O0NewBuilder2.OooOO0O(appStartTrace.OooO00o().f20477OooO0Oo);
                    Timer timerOooO00o3 = appStartTrace.OooO00o();
                    Timer timer4 = appStartTrace.f20424OooOOO0;
                    timerOooO00o3.getClass();
                    oooO0O0NewBuilder2.OooOO0o(timer4.f20478OooO0o0 - timerOooO00o3.f20478OooO0o0);
                    arrayList.add(oooO0O0NewBuilder2.build());
                    if (appStartTrace.f20423OooOOO != null) {
                        TraceMetric.OooO0O0 oooO0O0NewBuilder3 = TraceMetric.newBuilder();
                        oooO0O0NewBuilder3.OooOOO0(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                        oooO0O0NewBuilder3.OooOO0O(appStartTrace.f20424OooOOO0.f20477OooO0Oo);
                        Timer timer5 = appStartTrace.f20424OooOOO0;
                        Timer timer6 = appStartTrace.f20423OooOOO;
                        timer5.getClass();
                        oooO0O0NewBuilder3.OooOO0o(timer6.f20478OooO0o0 - timer5.f20478OooO0o0);
                        arrayList.add(oooO0O0NewBuilder3.build());
                        TraceMetric.OooO0O0 oooO0O0NewBuilder4 = TraceMetric.newBuilder();
                        oooO0O0NewBuilder4.OooOOO0(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                        oooO0O0NewBuilder4.OooOO0O(appStartTrace.f20423OooOOO.f20477OooO0Oo);
                        Timer timer7 = appStartTrace.f20423OooOOO;
                        Timer timer8 = appStartTrace.f20425OooOOOO;
                        timer7.getClass();
                        oooO0O0NewBuilder4.OooOO0o(timer8.f20478OooO0o0 - timer7.f20478OooO0o0);
                        arrayList.add(oooO0O0NewBuilder4.build());
                    }
                    oooO0O0NewBuilder.OooO0Oo(arrayList);
                    oooO0O0NewBuilder.OooO0o0(appStartTrace.f20431OooOo0.OooO00o());
                    appStartTrace.f20417OooO0o0.OooO0OO(oooO0O0NewBuilder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                }
            });
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
        if (!this.f20433OooOo0O && this.f20423OooOOO == null && !this.f20420OooOO0) {
            this.f20416OooO0o.getClass();
            this.f20423OooOOO = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f20433OooOo0O || this.f20420OooOO0 || this.f20428OooOOo0 != null) {
            return;
        }
        this.f20416OooO0o.getClass();
        this.f20428OooOOo0 = new Timer();
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0("_experiment_firstBackgrounding");
        oooO0O0NewBuilder.OooOO0O(OooO0OO().f20477OooO0Oo);
        Timer timerOooO0OO = OooO0OO();
        Timer timer = this.f20428OooOOo0;
        timerOooO0OO.getClass();
        oooO0O0NewBuilder.OooOO0o(timer.f20478OooO0o0 - timerOooO0OO.f20478OooO0o0);
        this.f20419OooO0oo.OooO0o(oooO0O0NewBuilder.build());
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.f20433OooOo0O || this.f20420OooOO0 || this.f20426OooOOOo != null) {
            return;
        }
        this.f20416OooO0o.getClass();
        this.f20426OooOOOo = new Timer();
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0("_experiment_firstForegrounding");
        oooO0O0NewBuilder.OooOO0O(OooO0OO().f20477OooO0Oo);
        Timer timerOooO0OO = OooO0OO();
        Timer timer = this.f20426OooOOOo;
        timerOooO0OO.getClass();
        oooO0O0NewBuilder.OooOO0o(timer.f20478OooO0o0 - timerOooO0OO.f20478OooO0o0);
        this.f20419OooO0oo.OooO0o(oooO0O0NewBuilder.build());
    }
}
