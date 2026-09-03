package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends ConstraintWidget {

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f7062o000OOo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public float f7065o0OOO0o = -1.0f;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f7066o0Oo0oo = -1;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f7064o0OO00O = -1;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public ConstraintAnchor f7067oo0o0Oo = this.f6938Oooo0o;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f7063o0O0O00 = 0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f7068OooO00o;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f7068OooO00o = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7068OooO00o[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public OooOO0() {
        this.f6946OoooOO0.clear();
        this.f6946OoooOO0.add(this.f7067oo0o0Oo);
        int length = this.f6942OoooO.length;
        for (int i = 0; i < length; i++) {
            this.f6942OoooO[i] = this.f7067oo0o0Oo;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooO0oO(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        OooO0o oooO0o = (OooO0o) this.f6948OoooOOo;
        if (oooO0o == null) {
            return;
        }
        Object objOooOOOO = oooO0o.OooOOOO(ConstraintAnchor.Type.LEFT);
        Object objOooOOOO2 = oooO0o.OooOOOO(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f6948OoooOOo;
        boolean z2 = constraintWidget != null && constraintWidget.f6947OoooOOO[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f7063o0O0O00 == 0) {
            objOooOOOO = oooO0o.OooOOOO(ConstraintAnchor.Type.TOP);
            objOooOOOO2 = oooO0o.OooOOOO(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f6948OoooOOo;
            z2 = constraintWidget2 != null && constraintWidget2.f6947OoooOOO[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f7062o000OOo) {
            ConstraintAnchor constraintAnchor = this.f7067oo0o0Oo;
            if (constraintAnchor.f6893OooO0OO) {
                SolverVariable solverVariableOooOO0o = oooO0OO.OooOO0o(constraintAnchor);
                oooO0OO.OooO0o0(solverVariableOooOO0o, this.f7067oo0o0Oo.OooO0Oo());
                if (this.f7066o0Oo0oo != -1) {
                    if (z2) {
                        oooO0OO.OooO0o(oooO0OO.OooOO0o(objOooOOOO2), solverVariableOooOO0o, 0, 5);
                    }
                } else if (this.f7064o0OO00O != -1 && z2) {
                    SolverVariable solverVariableOooOO0o2 = oooO0OO.OooOO0o(objOooOOOO2);
                    oooO0OO.OooO0o(solverVariableOooOO0o, oooO0OO.OooOO0o(objOooOOOO), 0, 5);
                    oooO0OO.OooO0o(solverVariableOooOO0o2, solverVariableOooOO0o, 0, 5);
                }
                this.f7062o000OOo = false;
                return;
            }
        }
        if (this.f7066o0Oo0oo != -1) {
            SolverVariable solverVariableOooOO0o3 = oooO0OO.OooOO0o(this.f7067oo0o0Oo);
            oooO0OO.OooO0Oo(solverVariableOooOO0o3, oooO0OO.OooOO0o(objOooOOOO), this.f7066o0Oo0oo, 8);
            if (z2) {
                oooO0OO.OooO0o(oooO0OO.OooOO0o(objOooOOOO2), solverVariableOooOO0o3, 0, 5);
                return;
            }
            return;
        }
        if (this.f7064o0OO00O != -1) {
            SolverVariable solverVariableOooOO0o4 = oooO0OO.OooOO0o(this.f7067oo0o0Oo);
            SolverVariable solverVariableOooOO0o5 = oooO0OO.OooOO0o(objOooOOOO2);
            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o5, -this.f7064o0OO00O, 8);
            if (z2) {
                oooO0OO.OooO0o(solverVariableOooOO0o4, oooO0OO.OooOO0o(objOooOOOO), 0, 5);
                oooO0OO.OooO0o(solverVariableOooOO0o5, solverVariableOooOO0o4, 0, 5);
                return;
            }
            return;
        }
        if (this.f7065o0OOO0o != -1.0f) {
            SolverVariable solverVariableOooOO0o6 = oooO0OO.OooOO0o(this.f7067oo0o0Oo);
            SolverVariable solverVariableOooOO0o7 = oooO0OO.OooOO0o(objOooOOOO2);
            float f = this.f7065o0OOO0o;
            androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO0 = oooO0OO.OooOOO0();
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariableOooOO0o6, -1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariableOooOO0o7, f);
            oooO0OO.OooO0OO(oooO0O0OooOOO0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean OooO0oo() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooOO0o(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.OooOO0o(constraintWidget, map);
        OooOO0 oooOO1 = (OooOO0) constraintWidget;
        this.f7065o0OOO0o = oooOO1.f7065o0OOO0o;
        this.f7066o0Oo0oo = oooOO1.f7066o0Oo0oo;
        this.f7064o0OO00O = oooOO1.f7064o0OO00O;
        OooooOo(oooOO1.f7063o0O0O00);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor OooOOOO(ConstraintAnchor.Type type) {
        int i = OooO00o.f7068OooO00o[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f7063o0O0O00 == 1) {
                return this.f7067oo0o0Oo;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f7063o0O0O00 == 0) {
            return this.f7067oo0o0Oo;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo0() {
        return this.f7062o000OOo;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo0O0() {
        return this.f7062o000OOo;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooooO0(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        if (this.f6948OoooOOo == null) {
            return;
        }
        int iOooOOOO = oooO0OO.OooOOOO(this.f7067oo0o0Oo);
        if (this.f7063o0O0O00 == 1) {
            this.f6953Ooooo0o = iOooOOOO;
            this.f6954OooooO0 = 0;
            OoooOO0(this.f6948OoooOOo.OooOOo());
            Ooooo00(0);
            return;
        }
        this.f6953Ooooo0o = 0;
        this.f6954OooooO0 = iOooOOOO;
        Ooooo00(this.f6948OoooOOo.OooOoO0());
        OoooOO0(0);
    }

    public final void OooooOO(int i) {
        this.f7067oo0o0Oo.OooOOO0(i);
        this.f7062o000OOo = true;
    }

    public final void OooooOo(int i) {
        if (this.f7063o0O0O00 == i) {
            return;
        }
        this.f7063o0O0O00 = i;
        this.f6946OoooOO0.clear();
        if (this.f7063o0O0O00 == 1) {
            this.f7067oo0o0Oo = this.f6939Oooo0o0;
        } else {
            this.f7067oo0o0Oo = this.f6938Oooo0o;
        }
        this.f6946OoooOO0.add(this.f7067oo0o0Oo);
        int length = this.f6942OoooO.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f6942OoooO[i2] = this.f7067oo0o0Oo;
        }
    }
}
