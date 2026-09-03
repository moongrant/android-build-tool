package p305o0O0o0oo;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.OooOO0;
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
import o0O0oo00.OooOOO;
import p304o0O0o0oO.o0OoOo0;
import p307o0O0oO0.OooOOO0;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final OooOOO0 f42418OooOo0 = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static volatile o00Oo0 f42419OooOo0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashSet f42420OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<Activity, Boolean> f42421OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final WeakHashMap<Activity, oo000o> f42422OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final WeakHashMap<Activity, o00oO0o> f42423OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final WeakHashMap<Activity, Trace> f42424OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap f42425OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashSet f42426OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicInteger f42427OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOOO f42428OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final com.google.firebase.perf.util.OooO00o f42429OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0Oo0oo f42430OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f42431OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Timer f42432OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ApplicationProcessState f42433OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Timer f42434OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f42435OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f42436OooOo00;

    public interface OooO00o {
        void OooO00o();
    }

    public interface OooO0O0 {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public o00Oo0(OooOOO oooOOO, com.google.firebase.perf.util.OooO00o oooO00o) {
        o0Oo0oo o0oo0ooOooO0o0 = o0Oo0oo.OooO0o0();
        OooOOO0 oooOOO0 = o00oO0o.f42437OooO0o0;
        this.f42421OooO0Oo = new WeakHashMap<>();
        this.f42423OooO0o0 = new WeakHashMap<>();
        this.f42422OooO0o = new WeakHashMap<>();
        this.f42424OooO0oO = new WeakHashMap<>();
        this.f42425OooO0oo = new HashMap();
        this.f42420OooO = new HashSet();
        this.f42426OooOO0 = new HashSet();
        this.f42427OooOO0O = new AtomicInteger(0);
        this.f42433OooOOo = ApplicationProcessState.BACKGROUND;
        this.f42435OooOOoo = false;
        this.f42436OooOo00 = true;
        this.f42428OooOO0o = oooOOO;
        this.f42429OooOOO = oooO00o;
        this.f42430OooOOO0 = o0oo0ooOooO0o0;
        this.f42431OooOOOO = true;
    }

    public static o00Oo0 OooO00o() {
        if (f42419OooOo0O == null) {
            synchronized (o00Oo0.class) {
                if (f42419OooOo0O == null) {
                    f42419OooOo0O = new o00Oo0(OooOOO.f42635OooOo0O, new com.google.firebase.perf.util.OooO00o());
                }
            }
        }
        return f42419OooOo0O;
    }

    public final void OooO(ApplicationProcessState applicationProcessState) {
        this.f42433OooOOo = applicationProcessState;
        synchronized (this.f42420OooO) {
            Iterator it = this.f42420OooO.iterator();
            while (it.hasNext()) {
                OooO0O0 oooO0O0 = (OooO0O0) ((WeakReference) it.next()).get();
                if (oooO0O0 != null) {
                    oooO0O0.onUpdateAppState(this.f42433OooOOo);
                } else {
                    it.remove();
                }
            }
        }
    }

    public final void OooO0O0(@NonNull String str) {
        synchronized (this.f42425OooO0oo) {
            Long l = (Long) this.f42425OooO0oo.get(str);
            if (l == null) {
                this.f42425OooO0oo.put(str, 1L);
            } else {
                this.f42425OooO0oo.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    public final void OooO0OO(o0OoOo0 o0oooo0) {
        synchronized (this.f42426OooOO0) {
            this.f42426OooOO0.add(o0oooo0);
        }
    }

    public final void OooO0Oo(WeakReference<OooO0O0> weakReference) {
        synchronized (this.f42420OooO) {
            this.f42420OooO.add(weakReference);
        }
    }

    public final void OooO0o(Activity activity) {
        OooOO0<p308o0O0oO0O.o0OoOo0> oooOO1;
        WeakHashMap<Activity, Trace> weakHashMap = this.f42424OooO0oO;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        o00oO0o o00oo0o2 = this.f42423OooO0o0.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = o00oo0o2.f42439OooO0O0;
        boolean z = o00oo0o2.f42441OooO0Oo;
        OooOOO0 oooOOO0 = o00oO0o.f42437OooO0o0;
        if (z) {
            Map<Fragment, p308o0O0oO0O.o0OoOo0> map = o00oo0o2.f42440OooO0OO;
            if (!map.isEmpty()) {
                oooOOO0.OooO00o("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            OooOO0<p308o0O0oO0O.o0OoOo0> oooOO0OooO00o = o00oo0o2.OooO00o();
            try {
                frameMetricsAggregator.f5228OooO00o.OooO0OO(o00oo0o2.f42438OooO00o);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                oooOOO0.OooO0oO("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                oooOO0OooO00o = new OooOO0<>();
            }
            frameMetricsAggregator.f5228OooO00o.OooO0Oo();
            o00oo0o2.f42441OooO0Oo = false;
            oooOO1 = oooOO0OooO00o;
        } else {
            oooOOO0.OooO00o("Cannot stop because no recording was started");
            oooOO1 = new OooOO0<>();
        }
        if (!oooOO1.OooO0O0()) {
            f42418OooOo0.OooO0oO("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            com.google.firebase.perf.util.OooOOO.OooO00o(trace, oooOO1.OooO00o());
            trace.stop();
        }
    }

    public final void OooO0o0() {
        synchronized (this.f42426OooOO0) {
            for (OooO00o oooO00o : this.f42426OooOO0) {
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
            }
        }
    }

    public final void OooO0oO(String str, Timer timer, Timer timer2) {
        if (this.f42430OooOOO0.OooOo0()) {
            TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
            oooO0O0NewBuilder.OooOOO0(str);
            oooO0O0NewBuilder.OooOO0O(timer.f20477OooO0Oo);
            oooO0O0NewBuilder.OooOO0o(timer2.f20478OooO0o0 - timer.f20478OooO0o0);
            oooO0O0NewBuilder.OooO0o0(SessionManager.getInstance().perfSession().OooO00o());
            int andSet = this.f42427OooOO0O.getAndSet(0);
            synchronized (this.f42425OooO0oo) {
                oooO0O0NewBuilder.OooO0oO(this.f42425OooO0oo);
                if (andSet != 0) {
                    oooO0O0NewBuilder.OooO(andSet, Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString());
                }
                this.f42425OooO0oo.clear();
            }
            this.f42428OooOO0o.OooO0OO(oooO0O0NewBuilder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    public final void OooO0oo(Activity activity) {
        if (this.f42431OooOOOO && this.f42430OooOOO0.OooOo0()) {
            o00oO0o o00oo0o2 = new o00oO0o(activity);
            this.f42423OooO0o0.put(activity, o00oo0o2);
            if (activity instanceof FragmentActivity) {
                oo000o oo000oVar = new oo000o(this.f42429OooOOO, this.f42428OooOO0o, this, o00oo0o2);
                this.f42422OooO0o.put(activity, oo000oVar);
                ((FragmentActivity) activity).getSupportFragmentManager().OoooOO0(oo000oVar, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        OooO0oo(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f42423OooO0o0.remove(activity);
        WeakHashMap<Activity, oo000o> weakHashMap = this.f42422OooO0o;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().OoooooO(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f42421OooO0Oo.isEmpty()) {
            this.f42429OooOOO.getClass();
            this.f42432OooOOOo = new Timer();
            this.f42421OooO0Oo.put(activity, Boolean.TRUE);
            if (this.f42436OooOo00) {
                OooO(ApplicationProcessState.FOREGROUND);
                OooO0o0();
                this.f42436OooOo00 = false;
            } else {
                OooO0oO(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f42434OooOOo0, this.f42432OooOOOo);
                OooO(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.f42421OooO0Oo.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.f42431OooOOOO && this.f42430OooOOO0.OooOo0()) {
            if (!this.f42423OooO0o0.containsKey(activity)) {
                OooO0oo(activity);
            }
            o00oO0o o00oo0o2 = this.f42423OooO0o0.get(activity);
            boolean z = o00oo0o2.f42441OooO0Oo;
            Activity activity2 = o00oo0o2.f42438OooO00o;
            if (z) {
                o00oO0o.f42437OooO0o0.OooO0O0("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
            } else {
                o00oo0o2.f42439OooO0O0.f5228OooO00o.OooO00o(activity2);
                o00oo0o2.f42441OooO0Oo = true;
            }
            Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f42428OooOO0o, this.f42429OooOOO, this);
            trace.start();
            this.f42424OooO0oO.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        if (this.f42431OooOOOO) {
            OooO0o(activity);
        }
        if (this.f42421OooO0Oo.containsKey(activity)) {
            this.f42421OooO0Oo.remove(activity);
            if (this.f42421OooO0Oo.isEmpty()) {
                this.f42429OooOOO.getClass();
                this.f42434OooOOo0 = new Timer();
                OooO0oO(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f42432OooOOOo, this.f42434OooOOo0);
                OooO(ApplicationProcessState.BACKGROUND);
            }
        }
    }
}
