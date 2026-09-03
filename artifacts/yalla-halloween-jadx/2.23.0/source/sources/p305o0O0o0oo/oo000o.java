package p305o0O0o0oo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.OooO00o;
import com.google.firebase.perf.util.OooOO0;
import java.util.Map;
import java.util.WeakHashMap;
import o0O0oo00.OooOOO;
import p307o0O0oO0.OooOOO0;
import p308o0O0oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends FragmentManager.OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOOO0 f42442OooO0o = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakHashMap<Fragment, Trace> f42443OooO00o = new WeakHashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f42444OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO f42445OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0 f42446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00oO0o f42447OooO0o0;

    public oo000o(OooO00o oooO00o, OooOOO oooOOO, o00Oo0 o00oo1, o00oO0o o00oo0o2) {
        this.f42444OooO0O0 = oooO00o;
        this.f42445OooO0OO = oooOOO;
        this.f42446OooO0Oo = o00oo1;
        this.f42447OooO0o0 = o00oo0o2;
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo00
    public final void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        OooOO0 oooOO1;
        super.onFragmentPaused(fragmentManager, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        OooOOO0 oooOOO0 = f42442OooO0o;
        oooOOO0.OooO0O0("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.f42443OooO00o;
        if (!weakHashMap.containsKey(fragment)) {
            oooOOO0.OooO0oO("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        o00oO0o o00oo0o2 = this.f42447OooO0o0;
        boolean z = o00oo0o2.f42441OooO0Oo;
        OooOOO0 oooOOO1 = o00oO0o.f42437OooO0o0;
        if (z) {
            Map<Fragment, o0OoOo0> map = o00oo0o2.f42440OooO0OO;
            if (map.containsKey(fragment)) {
                o0OoOo0 o0oooo0Remove = map.remove(fragment);
                OooOO0<o0OoOo0> oooOO0OooO00o = o00oo0o2.OooO00o();
                if (oooOO0OooO00o.OooO0O0()) {
                    o0OoOo0 o0oooo0OooO00o = oooOO0OooO00o.OooO00o();
                    o0oooo0OooO00o.getClass();
                    oooOO1 = new OooOO0(new o0OoOo0(o0oooo0OooO00o.f42490OooO00o - o0oooo0Remove.f42490OooO00o, o0oooo0OooO00o.f42491OooO0O0 - o0oooo0Remove.f42491OooO0O0, o0oooo0OooO00o.f42492OooO0OO - o0oooo0Remove.f42492OooO0OO));
                } else {
                    oooOOO1.OooO0O0("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    oooOO1 = new OooOO0();
                }
            } else {
                oooOOO1.OooO0O0("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                oooOO1 = new OooOO0();
            }
        } else {
            oooOOO1.OooO00o("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            oooOO1 = new OooOO0();
        }
        if (!oooOO1.OooO0O0()) {
            oooOOO0.OooO0oO("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            com.google.firebase.perf.util.OooOOO.OooO00o(trace, (o0OoOo0) oooOO1.OooO00o());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo00
    public final void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        f42442OooO0o.OooO0O0("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.f42445OooO0OO, this.f42444OooO0O0, this.f42446OooO0Oo);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f42443OooO00o.put(fragment, trace);
        o00oO0o o00oo0o2 = this.f42447OooO0o0;
        boolean z = o00oo0o2.f42441OooO0Oo;
        OooOOO0 oooOOO0 = o00oO0o.f42437OooO0o0;
        if (!z) {
            oooOOO0.OooO00o("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Map<Fragment, o0OoOo0> map = o00oo0o2.f42440OooO0OO;
        if (map.containsKey(fragment)) {
            oooOOO0.OooO0O0("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        OooOO0<o0OoOo0> oooOO0OooO00o = o00oo0o2.OooO00o();
        if (oooOO0OooO00o.OooO0O0()) {
            map.put(fragment, oooOO0OooO00o.OooO00o());
        } else {
            oooOOO0.OooO0O0("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
