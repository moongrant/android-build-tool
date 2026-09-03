package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f41097OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f41098OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.OooO0o f41099OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f41100OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f41101OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f41102OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f41103OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f41104OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f41105OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f41106OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f41107OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f41108OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f41109OooOO0;
    }

    /* JADX INFO: renamed from: o0O0O00.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0442OooO0O0 {
        void OooO00o();

        void OooO0O0(ConstraintWidget constraintWidget, OooO00o oooO00o);
    }

    public OooO0O0(androidx.constraintlayout.core.widgets.OooO0o oooO0o) {
        this.f41099OooO0OO = oooO0o;
    }

    public final boolean OooO00o(int i, ConstraintWidget constraintWidget, InterfaceC0442OooO0O0 interfaceC0442OooO0O0) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4387OoooOOO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        OooO00o oooO00o = this.f41098OooO0O0;
        oooO00o.f41101OooO00o = dimensionBehaviour;
        oooO00o.f41102OooO0O0 = dimensionBehaviourArr[1];
        oooO00o.f41103OooO0OO = constraintWidget.OooOo0O();
        oooO00o.f41104OooO0Oo = constraintWidget.OooOOOo();
        oooO00o.f41100OooO = false;
        oooO00o.f41109OooOO0 = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = oooO00o.f41101OooO00o;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = oooO00o.f41102OooO0O0 == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.f4391OoooOoo > 0.0f;
        boolean z4 = z2 && constraintWidget.f4391OoooOoo > 0.0f;
        int[] iArr = constraintWidget.f4362OooOo0O;
        if (z3 && iArr[0] == 4) {
            oooO00o.f41101OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            oooO00o.f41102OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0442OooO0O0.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.o000oOoO(oooO00o.f41106OooO0o0);
        constraintWidget.OoooO00(oooO00o.f41105OooO0o);
        constraintWidget.f4374Oooo00O = oooO00o.f41108OooO0oo;
        int i2 = oooO00o.f41107OooO0oO;
        constraintWidget.f4395OooooOO = i2;
        constraintWidget.f4374Oooo00O = i2 > 0;
        oooO00o.f41109OooOO0 = 0;
        return oooO00o.f41100OooO;
    }

    public final void OooO0O0(androidx.constraintlayout.core.widgets.OooO0o oooO0o, int i, int i2, int i3) {
        int i4 = oooO0o.f4396OooooOo;
        int i5 = oooO0o.f4398Oooooo0;
        oooO0o.f4396OooooOo = 0;
        oooO0o.f4398Oooooo0 = 0;
        oooO0o.o000oOoO(i2);
        oooO0o.OoooO00(i3);
        if (i4 < 0) {
            oooO0o.f4396OooooOo = 0;
        } else {
            oooO0o.f4396OooooOo = i4;
        }
        if (i5 < 0) {
            oooO0o.f4398Oooooo0 = 0;
        } else {
            oooO0o.f4398Oooooo0 = i5;
        }
        androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f41099OooO0OO;
        oooO0o2.f4501oo0o0Oo = i;
        oooO0o2.OoooOo0();
    }

    public final void OooO0OO(androidx.constraintlayout.core.widgets.OooO0o oooO0o) {
        ArrayList<ConstraintWidget> arrayList = this.f41097OooO00o;
        arrayList.clear();
        int size = oooO0o.f60342o0OOO0o.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = oooO0o.f60342o0OOO0o.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4387OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        oooO0o.f4499o0OO00O.f41090OooO0O0 = true;
    }
}
