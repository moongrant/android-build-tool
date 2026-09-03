package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ViewGroup f8485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0OO> f8486OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<OooO0OO> f8487OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f8488OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f8489OooO0o0 = false;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8490OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f8491OooO0O0;

        static {
            int[] iArr = new int[p418o0Oo0oo.o00000O0.OooO0OO(3).length];
            f8491OooO0O0 = iArr;
            try {
                iArr[p418o0Oo0oo.o00000O0.OooO0O0(2)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8491OooO0O0[p418o0Oo0oo.o00000O0.OooO0O0(3)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8491OooO0O0[p418o0Oo0oo.o00000O0.OooO0O0(1)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[p418o0Oo0oo.o00000O0.OooO0OO(4).length];
            f8490OooO00o = iArr2;
            try {
                iArr2[p418o0Oo0oo.o00000O0.OooO0O0(1)] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8490OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(2)] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8490OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(3)] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8490OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(4)] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public final o00000O0 f8492OooO0oo;

        public OooO0O0(@NonNull int i, @NonNull int i2, @NonNull o00000O0 o00000o1, @NonNull o000O00O.OooO0o oooO0o) {
            super(i, i2, o00000o1.f8437OooO0OO, oooO0o);
            this.f8492OooO0oo = o00000o1;
        }

        @Override // androidx.fragment.app.o000O0o.OooO0OO
        public final void OooO0OO() {
            super.OooO0OO();
            this.f8492OooO0oo.OooOO0O();
        }

        @Override // androidx.fragment.app.o000O0o.OooO0OO
        public final void OooO0o0() {
            int i = this.f8494OooO0O0;
            if (i != 2) {
                if (i == 3) {
                    Fragment fragment = this.f8492OooO0oo.f8437OooO0OO;
                    View viewRequireView = fragment.requireView();
                    if (FragmentManager.Oooo0oO(2)) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Clearing focus ");
                        sbOooO0o0.append(viewRequireView.findFocus());
                        sbOooO0o0.append(" on view ");
                        sbOooO0o0.append(viewRequireView);
                        sbOooO0o0.append(" for Fragment ");
                        sbOooO0o0.append(fragment);
                        Log.v("FragmentManager", sbOooO0o0.toString());
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.f8492OooO0oo.f8437OooO0OO;
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = this.f8495OooO0OO.requireView();
            if (viewRequireView2.getParent() == null) {
                this.f8492OooO0oo.OooO0O0();
                viewRequireView2.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            if (viewRequireView2.getAlpha() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public int f8493OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public int f8494OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final Fragment f8495OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final List<Runnable> f8496OooO0Oo = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final HashSet<o000O00O.OooO0o> f8498OooO0o0 = new HashSet<>();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f8497OooO0o = false;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f8499OooO0oO = false;

        public OooO0OO(@NonNull int i, @NonNull int i2, @NonNull Fragment fragment, @NonNull o000O00O.OooO0o oooO0o) {
            this.f8493OooO00o = i;
            this.f8494OooO0O0 = i2;
            this.f8495OooO0OO = fragment;
            oooO0o.OooO0O0(new o000Oo0(this));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.Runnable>] */
        public final void OooO00o(@NonNull Runnable runnable) {
            this.f8496OooO0Oo.add(runnable);
        }

        public final void OooO0O0() {
            if (this.f8497OooO0o) {
                return;
            }
            this.f8497OooO0o = true;
            if (this.f8498OooO0o0.isEmpty()) {
                OooO0OO();
                return;
            }
            Iterator it = new ArrayList(this.f8498OooO0o0).iterator();
            while (it.hasNext()) {
                ((o000O00O.OooO0o) it.next()).OooO00o();
            }
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.lang.Runnable>] */
        @CallSuper
        public void OooO0OO() {
            if (this.f8499OooO0oO) {
                return;
            }
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f8499OooO0oO = true;
            Iterator it = this.f8496OooO0Oo.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void OooO0Oo(@NonNull int i, @NonNull int i2) {
            int[] iArr = OooO00o.f8491OooO0O0;
            if (i2 == 0) {
                throw null;
            }
            int i3 = iArr[i2 - 1];
            if (i3 == 1) {
                if (this.f8493OooO00o == 1) {
                    if (FragmentManager.Oooo0oO(2)) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SpecialEffectsController: For fragment ");
                        sbOooO0o0.append(this.f8495OooO0OO);
                        sbOooO0o0.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sbOooO0o0.append(o000O00.OooO00o(this.f8494OooO0O0));
                        sbOooO0o0.append(" to ADDING.");
                        Log.v("FragmentManager", sbOooO0o0.toString());
                    }
                    this.f8493OooO00o = 2;
                    this.f8494OooO0O0 = 2;
                    return;
                }
                return;
            }
            if (i3 == 2) {
                if (FragmentManager.Oooo0oO(2)) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("SpecialEffectsController: For fragment ");
                    sbOooO0o1.append(this.f8495OooO0OO);
                    sbOooO0o1.append(" mFinalState = ");
                    sbOooO0o1.append(p016OooOoO0.OooOo00.OooO0o0(this.f8493OooO00o));
                    sbOooO0o1.append(" -> REMOVED. mLifecycleImpact  = ");
                    sbOooO0o1.append(o000O00.OooO00o(this.f8494OooO0O0));
                    sbOooO0o1.append(" to REMOVING.");
                    Log.v("FragmentManager", sbOooO0o1.toString());
                }
                this.f8493OooO00o = 1;
                this.f8494OooO0O0 = 3;
                return;
            }
            if (i3 == 3 && this.f8493OooO00o != 1) {
                if (FragmentManager.Oooo0oO(2)) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("SpecialEffectsController: For fragment ");
                    sbOooO0o2.append(this.f8495OooO0OO);
                    sbOooO0o2.append(" mFinalState = ");
                    sbOooO0o2.append(p016OooOoO0.OooOo00.OooO0o0(this.f8493OooO00o));
                    sbOooO0o2.append(" -> ");
                    sbOooO0o2.append(p016OooOoO0.OooOo00.OooO0o0(i));
                    sbOooO0o2.append(". ");
                    Log.v("FragmentManager", sbOooO0o2.toString());
                }
                this.f8493OooO00o = i;
            }
        }

        public void OooO0o0() {
        }

        @NonNull
        public final String toString() {
            StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o("Operation ", "{");
            sbOooO00o.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO00o.append("} ");
            sbOooO00o.append("{");
            sbOooO00o.append("mFinalState = ");
            sbOooO00o.append(p016OooOoO0.OooOo00.OooO0o0(this.f8493OooO00o));
            sbOooO00o.append("} ");
            sbOooO00o.append("{");
            sbOooO00o.append("mLifecycleImpact = ");
            sbOooO00o.append(o000O00.OooO00o(this.f8494OooO0O0));
            sbOooO00o.append("} ");
            sbOooO00o.append("{");
            sbOooO00o.append("mFragment = ");
            sbOooO00o.append(this.f8495OooO0OO);
            sbOooO00o.append("}");
            return sbOooO00o.toString();
        }
    }

    public o000O0o(@NonNull ViewGroup viewGroup) {
        this.f8485OooO00o = viewGroup;
    }

    @NonNull
    public static o000O0o OooO0o(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return OooO0oO(viewGroup, fragmentManager.Oooo0o0());
    }

    @NonNull
    public static o000O0o OooO0oO(@NonNull ViewGroup viewGroup, @NonNull o000O00O o000o00o2) {
        int i = p079o000Oo0O.Oooo000.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof o000O0o) {
            return (o000O0o) tag;
        }
        Objects.requireNonNull((FragmentManager.OooO) o000o00o2);
        androidx.fragment.app.OooO0O0 oooO0O0 = new androidx.fragment.app.OooO0O0(viewGroup);
        viewGroup.setTag(i, oooO0O0);
        return oooO0O0;
    }

    public final void OooO() {
        for (OooO0OO oooO0OO : this.f8486OooO0O0) {
            if (oooO0OO.f8494OooO0O0 == 2) {
                oooO0OO.OooO0Oo(p016OooOoO0.OooOo00.OooO0O0(oooO0OO.f8495OooO0OO.requireView().getVisibility()), 1);
            }
        }
    }

    public final void OooO00o(@NonNull int i, @NonNull int i2, @NonNull o00000O0 o00000o1) {
        synchronized (this.f8486OooO0O0) {
            o000O00O.OooO0o oooO0o = new o000O00O.OooO0o();
            OooO0OO OooO0Oo2 = OooO0Oo(o00000o1.f8437OooO0OO);
            if (OooO0Oo2 != null) {
                OooO0Oo2.OooO0Oo(i, i2);
                return;
            }
            OooO0O0 oooO0O0 = new OooO0O0(i, i2, o00000o1, oooO0o);
            this.f8486OooO0O0.add(oooO0O0);
            oooO0O0.OooO00o(new o000(this, oooO0O0));
            oooO0O0.OooO00o(new o000O000(this, oooO0O0));
        }
    }

    public abstract void OooO0O0(@NonNull List<OooO0OO> list, boolean z);

    public final void OooO0OO() {
        if (this.f8489OooO0o0) {
            return;
        }
        ViewGroup viewGroup = this.f8485OooO00o;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooOO0O.OooO0O0(viewGroup)) {
            OooO0o0();
            this.f8488OooO0Oo = false;
            return;
        }
        synchronized (this.f8486OooO0O0) {
            if (!this.f8486OooO0O0.isEmpty()) {
                ArrayList<OooO0OO> arrayList = new ArrayList(this.f8487OooO0OO);
                this.f8487OooO0OO.clear();
                for (OooO0OO oooO0OO : arrayList) {
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + oooO0OO);
                    }
                    oooO0OO.OooO0O0();
                    if (!oooO0OO.f8499OooO0oO) {
                        this.f8487OooO0OO.add(oooO0OO);
                    }
                }
                OooO();
                ArrayList arrayList2 = new ArrayList(this.f8486OooO0O0);
                this.f8486OooO0O0.clear();
                this.f8487OooO0OO.addAll(arrayList2);
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((OooO0OO) it.next()).OooO0o0();
                }
                OooO0O0(arrayList2, this.f8488OooO0Oo);
                this.f8488OooO0Oo = false;
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    @Nullable
    public final OooO0OO OooO0Oo(@NonNull Fragment fragment) {
        for (OooO0OO oooO0OO : this.f8486OooO0O0) {
            if (oooO0OO.f8495OooO0OO.equals(fragment) && !oooO0OO.f8497OooO0o) {
                return oooO0OO;
            }
        }
        return null;
    }

    public final void OooO0o0() {
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f8485OooO00o;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean zOooO0O0 = ViewCompat.OooOO0O.OooO0O0(viewGroup);
        synchronized (this.f8486OooO0O0) {
            OooO();
            Iterator<OooO0OO> it = this.f8486OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().OooO0o0();
            }
            for (OooO0OO oooO0OO : new ArrayList(this.f8487OooO0OO)) {
                if (FragmentManager.Oooo0oO(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zOooO0O0 ? "" : "Container " + this.f8485OooO00o + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(oooO0OO);
                    Log.v("FragmentManager", sb.toString());
                }
                oooO0OO.OooO0O0();
            }
            for (OooO0OO oooO0OO2 : new ArrayList(this.f8486OooO0O0)) {
                if (FragmentManager.Oooo0oO(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zOooO0O0 ? "" : "Container " + this.f8485OooO00o + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(oooO0OO2);
                    Log.v("FragmentManager", sb2.toString());
                }
                oooO0OO2.OooO0O0();
            }
        }
    }

    public final void OooO0oo() {
        synchronized (this.f8486OooO0O0) {
            OooO();
            this.f8489OooO0o0 = false;
            int size = this.f8486OooO0O0.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                OooO0OO oooO0OO = this.f8486OooO0O0.get(size);
                int iOooO0OO = p016OooOoO0.OooOo00.OooO0OO(oooO0OO.f8495OooO0OO.mView);
                if (oooO0OO.f8493OooO00o == 2 && iOooO0OO != 2) {
                    this.f8489OooO0o0 = oooO0OO.f8495OooO0OO.isPostponed();
                    break;
                }
            }
        }
    }
}
