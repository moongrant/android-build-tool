package p678oooOO0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.o0000Ooo;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOOO0;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p308o0O0oO.OooO0o;
import p309o0O0oO0.o000OOo0;
import p311o0O0oO0o.o0O0O00;
import p316o0O0oOo0.o0OO00O;
import p321o0O0oo0O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final o0O0O00 f60375OooOo0 = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static volatile oo0o0Oo f60376OooOo0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashSet f60377OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<Activity, Boolean> f60378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final WeakHashMap<Activity, o000OOo> f60379OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final WeakHashMap<Activity, o000000> f60380OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final WeakHashMap<Activity, Trace> f60381OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap f60382OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashSet f60383OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicInteger f60384OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0OO00O f60385OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o0000Ooo f60386OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000OOo0 f60387OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f60388OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Timer f60389OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ApplicationProcessState f60390OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Timer f60391OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f60392OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f60393OooOo00;

    public interface OooO00o {
        void OooO00o();
    }

    public interface OooO0O0 {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public oo0o0Oo(o0OO00O o0oo00o2, o0000Ooo o0000ooo) {
        o000OOo0 o000ooo0OooO0o0 = o000OOo0.OooO0o0();
        o0O0O00 o0o0o00 = o000000.f60364OooO0o0;
        this.f60378OooO0Oo = new WeakHashMap<>();
        this.f60380OooO0o0 = new WeakHashMap<>();
        this.f60379OooO0o = new WeakHashMap<>();
        this.f60381OooO0oO = new WeakHashMap<>();
        this.f60382OooO0oo = new HashMap();
        this.f60377OooO = new HashSet();
        this.f60383OooOO0 = new HashSet();
        this.f60384OooOO0O = new AtomicInteger(0);
        this.f60390OooOOo = ApplicationProcessState.BACKGROUND;
        this.f60392OooOOoo = false;
        this.f60393OooOo00 = true;
        this.f60385OooOO0o = o0oo00o2;
        this.f60386OooOOO = o0000ooo;
        this.f60387OooOOO0 = o000ooo0OooO0o0;
        this.f60388OooOOOO = true;
    }

    public static oo0o0Oo OooO00o() {
        if (f60376OooOo0O == null) {
            synchronized (oo0o0Oo.class) {
                if (f60376OooOo0O == null) {
                    f60376OooOo0O = new oo0o0Oo(o0OO00O.f41914OooOo0O, new o0000Ooo());
                }
            }
        }
        return f60376OooOo0O;
    }

    public final void OooO(ApplicationProcessState applicationProcessState) {
        this.f60390OooOOo = applicationProcessState;
        synchronized (this.f60377OooO) {
            Iterator it = this.f60377OooO.iterator();
            while (it.hasNext()) {
                OooO0O0 oooO0O0 = (OooO0O0) ((WeakReference) it.next()).get();
                if (oooO0O0 != null) {
                    oooO0O0.onUpdateAppState(this.f60390OooOOo);
                } else {
                    it.remove();
                }
            }
        }
    }

    public final void OooO0O0(@NonNull String str) {
        synchronized (this.f60382OooO0oo) {
            Long l = (Long) this.f60382OooO0oo.get(str);
            if (l == null) {
                this.f60382OooO0oo.put(str, 1L);
            } else {
                this.f60382OooO0oo.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    public final void OooO0OO(o00000O0 o00000o1) {
        synchronized (this.f60383OooOO0) {
            this.f60383OooOO0.add(o00000o1);
        }
    }

    public final void OooO0Oo(WeakReference<OooO0O0> weakReference) {
        synchronized (this.f60377OooO) {
            this.f60377OooO.add(weakReference);
        }
    }

    public final void OooO0o(Activity activity) {
        OooO<OooO0o> oooO;
        WeakHashMap<Activity, Trace> weakHashMap = this.f60381OooO0oO;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        o000000 o000000Var = this.f60380OooO0o0.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = o000000Var.f60366OooO0O0;
        boolean z = o000000Var.f60368OooO0Oo;
        o0O0O00 o0o0o00 = o000000.f60364OooO0o0;
        if (z) {
            Map<Fragment, OooO0o> map = o000000Var.f60367OooO0OO;
            if (!map.isEmpty()) {
                o0o0o00.OooO00o("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            OooO<OooO0o> oooOOooO00o = o000000Var.OooO00o();
            try {
                frameMetricsAggregator.f5234OooO00o.OooO0OO(o000000Var.f60365OooO00o);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                o0o0o00.OooO0oO("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                oooOOooO00o = new OooO<>();
            }
            frameMetricsAggregator.f5234OooO00o.OooO0Oo();
            o000000Var.f60368OooO0Oo = false;
            oooO = oooOOooO00o;
        } else {
            o0o0o00.OooO00o("Cannot stop because no recording was started");
            oooO = new OooO<>();
        }
        if (!oooO.OooO0O0()) {
            f60375OooOo0.OooO0oO("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            OooOOO0.OooO00o(trace, oooO.OooO00o());
            trace.stop();
        }
    }

    public final void OooO0o0() {
        synchronized (this.f60383OooOO0) {
            for (OooO00o oooO00o : this.f60383OooOO0) {
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
            }
        }
    }

    public final void OooO0oO(String str, Timer timer, Timer timer2) {
        if (this.f60387OooOOO0.OooOo0()) {
            TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
            oooO0O0NewBuilder.OooOOO0(str);
            oooO0O0NewBuilder.OooOO0O(timer.f20004OooO0Oo);
            oooO0O0NewBuilder.OooOO0o(timer2.f20005OooO0o0 - timer.f20005OooO0o0);
            oooO0O0NewBuilder.OooO0o0(SessionManager.getInstance().perfSession().OooO00o());
            int andSet = this.f60384OooOO0O.getAndSet(0);
            synchronized (this.f60382OooO0oo) {
                oooO0O0NewBuilder.OooO0oO(this.f60382OooO0oo);
                if (andSet != 0) {
                    oooO0O0NewBuilder.OooO(andSet, Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString());
                }
                this.f60382OooO0oo.clear();
            }
            this.f60385OooOO0o.OooO0OO(oooO0O0NewBuilder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    public final void OooO0oo(Activity activity) {
        if (this.f60388OooOOOO && this.f60387OooOOO0.OooOo0()) {
            o000000 o000000Var = new o000000(activity);
            this.f60380OooO0o0.put(activity, o000000Var);
            if (activity instanceof FragmentActivity) {
                o000OOo o000ooo2 = new o000OOo(this.f60386OooOOO, this.f60385OooOO0o, this, o000000Var);
                this.f60379OooO0o.put(activity, o000ooo2);
                ((FragmentActivity) activity).getSupportFragmentManager().OoooOO0(o000ooo2, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        OooO0oo(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f60380OooO0o0.remove(activity);
        WeakHashMap<Activity, o000OOo> weakHashMap = this.f60379OooO0o;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().OoooooO(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f60378OooO0Oo.isEmpty()) {
            this.f60386OooOOO.getClass();
            this.f60389OooOOOo = new Timer();
            this.f60378OooO0Oo.put(activity, Boolean.TRUE);
            if (this.f60393OooOo00) {
                OooO(ApplicationProcessState.FOREGROUND);
                OooO0o0();
                this.f60393OooOo00 = false;
            } else {
                OooO0oO(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f60391OooOOo0, this.f60389OooOOOo);
                OooO(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.f60378OooO0Oo.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.f60388OooOOOO && this.f60387OooOOO0.OooOo0()) {
            if (!this.f60380OooO0o0.containsKey(activity)) {
                OooO0oo(activity);
            }
            o000000 o000000Var = this.f60380OooO0o0.get(activity);
            boolean z = o000000Var.f60368OooO0Oo;
            Activity activity2 = o000000Var.f60365OooO00o;
            if (z) {
                o000000.f60364OooO0o0.OooO0O0("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
            } else {
                o000000Var.f60366OooO0O0.f5234OooO00o.OooO00o(activity2);
                o000000Var.f60368OooO0Oo = true;
            }
            Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f60385OooOO0o, this.f60386OooOOO, this);
            trace.start();
            this.f60381OooO0oO.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        if (this.f60388OooOOOO) {
            OooO0o(activity);
        }
        if (this.f60378OooO0Oo.containsKey(activity)) {
            this.f60378OooO0Oo.remove(activity);
            if (this.f60378OooO0Oo.isEmpty()) {
                this.f60386OooOOO.getClass();
                this.f60391OooOOo0 = new Timer();
                OooO0oO(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f60389OooOOOo, this.f60391OooOOo0);
                OooO(ApplicationProcessState.BACKGROUND);
            }
        }
    }
}
