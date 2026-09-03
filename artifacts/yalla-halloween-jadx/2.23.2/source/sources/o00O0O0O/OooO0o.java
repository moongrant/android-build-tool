package o00O0O0O;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.o00Ooo;
import o00O0OO0.OooOO0O;
import o00O0OO0.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.o0Oo0oo;
import p116o00O0O0o.OooOO0;
import p116o00O0O0o.OooOOO;
import p116o00O0O0o.OooOOO0;
import p116o00O0O0o.OooOOOO;
import p116o00O0O0o.OooOo;
import p116o00O0O0o.OooOo00;
import p116o00O0O0o.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooOOO0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO0OO f36181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOO0<?>[] f36182OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Object f36183OooO0OO;

    public OooO0o(@NotNull o000oOoO trackers, @Nullable OooO0OO oooO0OO) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        OooOO0O<OooO0O0> oooOO0O = trackers.f36270OooO0OO;
        OooOOO0<?>[] constraintControllers = {new OooOO0(trackers.f36268OooO00o), new p116o00O0O0o.OooOO0O(trackers.f36269OooO0O0), new Oooo000(trackers.f36271OooO0Oo), new OooOOO(oooOO0O), new OooOo(oooOO0O), new OooOo00(oooOO0O), new OooOOOO(oooOO0O)};
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.f36181OooO00o = oooO0OO;
        this.f36182OooO0O0 = constraintControllers;
        this.f36183OooO0OO = new Object();
    }

    @Override // o00O0O0o.OooOOO0.OooO00o
    public final void OooO00o(@NotNull ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f36183OooO0OO) {
            OooO0OO oooO0OO = this.f36181OooO00o;
            if (oooO0OO != null) {
                oooO0OO.OooO0OO(workSpecs);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // o00O0O0o.OooOOO0.OooO00o
    public final void OooO0O0(@NotNull ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f36183OooO0OO) {
            ArrayList<o00Ooo> arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (OooO0OO(((o00Ooo) obj).f36216OooO00o)) {
                    arrayList.add(obj);
                }
            }
            for (o00Ooo o00ooo2 : arrayList) {
                o0Oo0oo.OooO0Oo().OooO00o(OooO.f36176OooO00o, "Constraints met for " + o00ooo2);
            }
            OooO0OO oooO0OO = this.f36181OooO00o;
            if (oooO0OO != null) {
                oooO0OO.OooO0o(arrayList);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean OooO0OO(@NotNull String workSpecId) {
        OooOOO0<?> oooOOO0;
        boolean z;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f36183OooO0OO) {
            OooOOO0<?>[] oooOOO0Arr = this.f36182OooO0O0;
            int length = oooOOO0Arr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    oooOOO0 = null;
                    break;
                }
                oooOOO0 = oooOOO0Arr[i];
                oooOOO0.getClass();
                Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                Object obj = oooOOO0.f36187OooO0Oo;
                if (obj != null && oooOOO0.OooO0OO(obj) && oooOOO0.f36186OooO0OO.contains(workSpecId)) {
                    break;
                }
                i++;
            }
            if (oooOOO0 != null) {
                o0Oo0oo.OooO0Oo().OooO00o(OooO.f36176OooO00o, "Work " + workSpecId + " constrained by " + oooOOO0.getClass().getSimpleName());
            }
            z = oooOOO0 == null;
        }
        return z;
    }

    public final void OooO0Oo(@NotNull Collection workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f36183OooO0OO) {
            for (OooOOO0<?> oooOOO0 : this.f36182OooO0O0) {
                if (oooOOO0.f36188OooO0o0 != null) {
                    oooOOO0.f36188OooO0o0 = null;
                    oooOOO0.OooO0o0(null, oooOOO0.f36187OooO0Oo);
                }
            }
            for (OooOOO0<?> oooOOO1 : this.f36182OooO0O0) {
                oooOOO1.OooO0Oo(workSpecs);
            }
            for (OooOOO0<?> oooOOO2 : this.f36182OooO0O0) {
                if (oooOOO2.f36188OooO0o0 != this) {
                    oooOOO2.f36188OooO0o0 = this;
                    oooOOO2.OooO0o0(this, oooOOO2.f36187OooO0Oo);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void OooO0o0() {
        synchronized (this.f36183OooO0OO) {
            for (OooOOO0<?> oooOOO0 : this.f36182OooO0O0) {
                ArrayList arrayList = oooOOO0.f36185OooO0O0;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    oooOOO0.f36184OooO00o.OooO0O0(oooOOO0);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
