package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean[] f7069OooO00o = new boolean[3];

    public static void OooO00o(OooO0o oooO0o, androidx.constraintlayout.core.OooO0OO oooO0OO, ConstraintWidget constraintWidget) {
        constraintWidget.f6917OooOOo0 = -1;
        constraintWidget.f6916OooOOo = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = oooO0o.f6947OoooOOO[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f6947OoooOOO[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f6939Oooo0o0.f6897OooO0oO;
            int iOooOoO0 = oooO0o.OooOoO0() - constraintWidget.f6940Oooo0oO.f6897OooO0oO;
            ConstraintAnchor constraintAnchor = constraintWidget.f6939Oooo0o0;
            constraintAnchor.f6890OooO = oooO0OO.OooOO0o(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f6940Oooo0oO;
            constraintAnchor2.f6890OooO = oooO0OO.OooOO0o(constraintAnchor2);
            oooO0OO.OooO0o0(constraintWidget.f6939Oooo0o0.f6890OooO, i);
            oooO0OO.OooO0o0(constraintWidget.f6940Oooo0oO.f6890OooO, iOooOoO0);
            constraintWidget.f6917OooOOo0 = 2;
            constraintWidget.f6953Ooooo0o = i;
            int i2 = iOooOoO0 - i;
            constraintWidget.f6949OoooOo0 = i2;
            int i3 = constraintWidget.f6956OooooOo;
            if (i2 < i3) {
                constraintWidget.f6949OoooOo0 = i3;
            }
        }
        if (oooO0o.f6947OoooOOO[1] == dimensionBehaviour2 || constraintWidget.f6947OoooOOO[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i4 = constraintWidget.f6938Oooo0o.f6897OooO0oO;
        int iOooOOo = oooO0o.OooOOo() - constraintWidget.f6941Oooo0oo.f6897OooO0oO;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f6938Oooo0o;
        constraintAnchor3.f6890OooO = oooO0OO.OooOO0o(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f6941Oooo0oo;
        constraintAnchor4.f6890OooO = oooO0OO.OooOO0o(constraintAnchor4);
        oooO0OO.OooO0o0(constraintWidget.f6938Oooo0o.f6890OooO, i4);
        oooO0OO.OooO0o0(constraintWidget.f6941Oooo0oo.f6890OooO, iOooOOo);
        if (constraintWidget.f6955OooooOO > 0 || constraintWidget.f6969o0OoOo0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f6931Oooo;
            constraintAnchor5.f6890OooO = oooO0OO.OooOO0o(constraintAnchor5);
            oooO0OO.OooO0o0(constraintWidget.f6931Oooo.f6890OooO, constraintWidget.f6955OooooOO + i4);
        }
        constraintWidget.f6916OooOOo = 2;
        constraintWidget.f6954OooooO0 = i4;
        int i5 = iOooOOo - i4;
        constraintWidget.f6950OoooOoO = i5;
        int i6 = constraintWidget.f6958Oooooo0;
        if (i5 < i6) {
            constraintWidget.f6950OoooOoO = i6;
        }
    }

    public static final boolean OooO0O0(int i, int i2) {
        return (i & i2) == i2;
    }
}
