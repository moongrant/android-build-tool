package p678oooOO0;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.billingclient.api.o0000Ooo;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOOO0;
import java.util.Map;
import java.util.WeakHashMap;
import p308o0O0oO.OooO0o;
import p311o0O0oO0o.o0O0O00;
import p316o0O0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends FragmentManager.OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0O0O00 f60369OooO0o = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakHashMap<Fragment, Trace> f60370OooO00o = new WeakHashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f60371OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO00O f60372OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo f60373OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000000 f60374OooO0o0;

    public o000OOo(o0000Ooo o0000ooo, o0OO00O o0oo00o2, oo0o0Oo oo0o0oo, o000000 o000000Var) {
        this.f60371OooO0O0 = o0000ooo;
        this.f60372OooO0OO = o0oo00o2;
        this.f60373OooO0Oo = oo0o0oo;
        this.f60374OooO0o0 = o000000Var;
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo00
    public final void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        OooO oooO;
        super.onFragmentPaused(fragmentManager, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        o0O0O00 o0o0o00 = f60369OooO0o;
        o0o0o00.OooO0O0("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.f60370OooO00o;
        if (!weakHashMap.containsKey(fragment)) {
            o0o0o00.OooO0oO("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        o000000 o000000Var = this.f60374OooO0o0;
        boolean z = o000000Var.f60368OooO0Oo;
        o0O0O00 o0o0o01 = o000000.f60364OooO0o0;
        if (z) {
            Map<Fragment, OooO0o> map = o000000Var.f60367OooO0OO;
            if (map.containsKey(fragment)) {
                OooO0o oooO0oRemove = map.remove(fragment);
                OooO<OooO0o> oooOOooO00o = o000000Var.OooO00o();
                if (oooOOooO00o.OooO0O0()) {
                    OooO0o oooO0oOooO00o = oooOOooO00o.OooO00o();
                    oooO0oOooO00o.getClass();
                    oooO = new OooO(new OooO0o(oooO0oOooO00o.f41778OooO00o - oooO0oRemove.f41778OooO00o, oooO0oOooO00o.f41779OooO0O0 - oooO0oRemove.f41779OooO0O0, oooO0oOooO00o.f41780OooO0OO - oooO0oRemove.f41780OooO0OO));
                } else {
                    o0o0o01.OooO0O0("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    oooO = new OooO();
                }
            } else {
                o0o0o01.OooO0O0("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                oooO = new OooO();
            }
        } else {
            o0o0o01.OooO00o("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            oooO = new OooO();
        }
        if (!oooO.OooO0O0()) {
            o0o0o00.OooO0oO("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            OooOOO0.OooO00o(trace, (OooO0o) oooO.OooO00o());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo00
    public final void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        f60369OooO0o.OooO0O0("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.f60372OooO0OO, this.f60371OooO0O0, this.f60373OooO0Oo);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f60370OooO00o.put(fragment, trace);
        o000000 o000000Var = this.f60374OooO0o0;
        boolean z = o000000Var.f60368OooO0Oo;
        o0O0O00 o0o0o00 = o000000.f60364OooO0o0;
        if (!z) {
            o0o0o00.OooO00o("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Map<Fragment, OooO0o> map = o000000Var.f60367OooO0OO;
        if (map.containsKey(fragment)) {
            o0o0o00.OooO0O0("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        OooO<OooO0o> oooOOooO00o = o000000Var.OooO00o();
        if (oooOOooO00o.OooO0O0()) {
            map.put(fragment, oooOOooO00o.OooO00o());
        } else {
            o0o0o00.OooO0O0("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
