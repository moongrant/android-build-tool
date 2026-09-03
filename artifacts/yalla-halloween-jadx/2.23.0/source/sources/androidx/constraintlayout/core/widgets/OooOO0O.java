package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean[] f4503OooO00o = new boolean[3];

    public static void OooO00o(OooO0o oooO0o, androidx.constraintlayout.core.OooO0OO oooO0OO, ConstraintWidget constraintWidget) {
        constraintWidget.f4351OooOOo0 = -1;
        constraintWidget.f4350OooOOo = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = oooO0o.f4381OoooOOO[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f4381OoooOOO[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            ConstraintAnchor constraintAnchor = constraintWidget.f4373Oooo0o0;
            int i = constraintAnchor.f4331OooO0oO;
            int iOooOo0O = oooO0o.OooOo0O();
            ConstraintAnchor constraintAnchor2 = constraintWidget.f4374Oooo0oO;
            int i2 = iOooOo0O - constraintAnchor2.f4331OooO0oO;
            constraintAnchor.f4324OooO = oooO0OO.OooOO0O(constraintAnchor);
            constraintAnchor2.f4324OooO = oooO0OO.OooOO0O(constraintAnchor2);
            oooO0OO.OooO0Oo(constraintAnchor.f4324OooO, i);
            oooO0OO.OooO0Oo(constraintAnchor2.f4324OooO, i2);
            constraintWidget.f4351OooOOo0 = 2;
            constraintWidget.f4387Ooooo0o = i;
            int i3 = i2 - i;
            constraintWidget.f4383OoooOo0 = i3;
            int i4 = constraintWidget.f4390OooooOo;
            if (i3 < i4) {
                constraintWidget.f4383OoooOo0 = i4;
            }
        }
        if (oooO0o.f4381OoooOOO[1] == dimensionBehaviour2 || constraintWidget.f4381OoooOOO[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f4372Oooo0o;
        int i5 = constraintAnchor3.f4331OooO0oO;
        int iOooOOOo = oooO0o.OooOOOo();
        ConstraintAnchor constraintAnchor4 = constraintWidget.f4375Oooo0oo;
        int i6 = iOooOOOo - constraintAnchor4.f4331OooO0oO;
        constraintAnchor3.f4324OooO = oooO0OO.OooOO0O(constraintAnchor3);
        constraintAnchor4.f4324OooO = oooO0OO.OooOO0O(constraintAnchor4);
        oooO0OO.OooO0Oo(constraintAnchor3.f4324OooO, i5);
        oooO0OO.OooO0Oo(constraintAnchor4.f4324OooO, i6);
        if (constraintWidget.f4389OooooOO > 0 || constraintWidget.f4403o0OoOo0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f4365Oooo;
            constraintAnchor5.f4324OooO = oooO0OO.OooOO0O(constraintAnchor5);
            oooO0OO.OooO0Oo(constraintAnchor5.f4324OooO, constraintWidget.f4389OooooOO + i5);
        }
        constraintWidget.f4350OooOOo = 2;
        constraintWidget.f4388OooooO0 = i5;
        int i7 = i6 - i5;
        constraintWidget.f4384OoooOoO = i7;
        int i8 = constraintWidget.f4392Oooooo0;
        if (i7 < i8) {
            constraintWidget.f4384OoooOoO = i8;
        }
    }

    public static final boolean OooO0O0(int i, int i2) {
        return (i & i2) == i2;
    }
}
