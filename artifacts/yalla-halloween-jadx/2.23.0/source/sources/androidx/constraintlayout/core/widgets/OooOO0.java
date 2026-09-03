package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends ConstraintWidget {

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f4496o000OOo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public float f4499o0OOO0o = -1.0f;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f4500o0Oo0oo = -1;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f4498o0OO00O = -1;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public ConstraintAnchor f4501oo0o0Oo = this.f4372Oooo0o;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f4497o0O0O00 = 0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4502OooO00o;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f4502OooO00o = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4502OooO00o[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public OooOO0() {
        this.f4380OoooOO0.clear();
        this.f4380OoooOO0.add(this.f4501oo0o0Oo);
        int length = this.f4376OoooO.length;
        for (int i = 0; i < length; i++) {
            this.f4376OoooO[i] = this.f4501oo0o0Oo;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooO0o(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        OooO0o oooO0o = (OooO0o) this.f4382OoooOOo;
        if (oooO0o == null) {
            return;
        }
        Object objOooOOO = oooO0o.OooOOO(ConstraintAnchor.Type.LEFT);
        Object objOooOOO2 = oooO0o.OooOOO(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f4382OoooOOo;
        boolean z2 = constraintWidget != null && constraintWidget.f4381OoooOOO[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f4497o0O0O00 == 0) {
            objOooOOO = oooO0o.OooOOO(ConstraintAnchor.Type.TOP);
            objOooOOO2 = oooO0o.OooOOO(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f4382OoooOOo;
            z2 = constraintWidget2 != null && constraintWidget2.f4381OoooOOO[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f4496o000OOo) {
            ConstraintAnchor constraintAnchor = this.f4501oo0o0Oo;
            if (constraintAnchor.f4327OooO0OO) {
                SolverVariable solverVariableOooOO0O = oooO0OO.OooOO0O(constraintAnchor);
                oooO0OO.OooO0Oo(solverVariableOooOO0O, this.f4501oo0o0Oo.OooO0Oo());
                if (this.f4500o0Oo0oo != -1) {
                    if (z2) {
                        oooO0OO.OooO0o(oooO0OO.OooOO0O(objOooOOO2), solverVariableOooOO0O, 0, 5);
                    }
                } else if (this.f4498o0OO00O != -1 && z2) {
                    SolverVariable solverVariableOooOO0O2 = oooO0OO.OooOO0O(objOooOOO2);
                    oooO0OO.OooO0o(solverVariableOooOO0O, oooO0OO.OooOO0O(objOooOOO), 0, 5);
                    oooO0OO.OooO0o(solverVariableOooOO0O2, solverVariableOooOO0O, 0, 5);
                }
                this.f4496o000OOo = false;
                return;
            }
        }
        if (this.f4500o0Oo0oo != -1) {
            SolverVariable solverVariableOooOO0O3 = oooO0OO.OooOO0O(this.f4501oo0o0Oo);
            oooO0OO.OooO0o0(solverVariableOooOO0O3, oooO0OO.OooOO0O(objOooOOO), this.f4500o0Oo0oo, 8);
            if (z2) {
                oooO0OO.OooO0o(oooO0OO.OooOO0O(objOooOOO2), solverVariableOooOO0O3, 0, 5);
                return;
            }
            return;
        }
        if (this.f4498o0OO00O != -1) {
            SolverVariable solverVariableOooOO0O4 = oooO0OO.OooOO0O(this.f4501oo0o0Oo);
            SolverVariable solverVariableOooOO0O5 = oooO0OO.OooOO0O(objOooOOO2);
            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O5, -this.f4498o0OO00O, 8);
            if (z2) {
                oooO0OO.OooO0o(solverVariableOooOO0O4, oooO0OO.OooOO0O(objOooOOO), 0, 5);
                oooO0OO.OooO0o(solverVariableOooOO0O5, solverVariableOooOO0O4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4499o0OOO0o != -1.0f) {
            SolverVariable solverVariableOooOO0O6 = oooO0OO.OooOO0O(this.f4501oo0o0Oo);
            SolverVariable solverVariableOooOO0O7 = oooO0OO.OooOO0O(objOooOOO2);
            float f = this.f4499o0OOO0o;
            androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o = oooO0OO.OooOO0o();
            oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O6, -1.0f);
            oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O7, f);
            oooO0OO.OooO0OO(oooO0O0OooOO0o);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean OooO0oO() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooOO0O(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.OooOO0O(constraintWidget, map);
        OooOO0 oooOO1 = (OooOO0) constraintWidget;
        this.f4499o0OOO0o = oooOO1.f4499o0OOO0o;
        this.f4500o0Oo0oo = oooOO1.f4500o0Oo0oo;
        this.f4498o0OO00O = oooOO1.f4498o0OO00O;
        OoooOoO(oooOO1.f4497o0O0O00);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor OooOOO(ConstraintAnchor.Type type) {
        int i = OooO00o.f4502OooO00o[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f4497o0O0O00 == 1) {
                return this.f4501oo0o0Oo;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f4497o0O0O00 == 0) {
            return this.f4501oo0o0Oo;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo000() {
        return this.f4496o000OOo;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo00O() {
        return this.f4496o000OOo;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OoooOOo(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        if (this.f4382OoooOOo == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f4501oo0o0Oo;
        oooO0OO.getClass();
        int iOooOOO = androidx.constraintlayout.core.OooO0OO.OooOOO(constraintAnchor);
        if (this.f4497o0O0O00 == 1) {
            this.f4387Ooooo0o = iOooOOO;
            this.f4388OooooO0 = 0;
            OoooO00(this.f4382OoooOOo.OooOOOo());
            o000oOoO(0);
            return;
        }
        this.f4387Ooooo0o = 0;
        this.f4388OooooO0 = iOooOOO;
        o000oOoO(this.f4382OoooOOo.OooOo0O());
        OoooO00(0);
    }

    public final void OoooOo0(int i) {
        this.f4501oo0o0Oo.OooOO0o(i);
        this.f4496o000OOo = true;
    }

    public final void OoooOoO(int i) {
        if (this.f4497o0O0O00 == i) {
            return;
        }
        this.f4497o0O0O00 = i;
        ArrayList<ConstraintAnchor> arrayList = this.f4380OoooOO0;
        arrayList.clear();
        if (this.f4497o0O0O00 == 1) {
            this.f4501oo0o0Oo = this.f4373Oooo0o0;
        } else {
            this.f4501oo0o0Oo = this.f4372Oooo0o;
        }
        arrayList.add(this.f4501oo0o0Oo);
        ConstraintAnchor[] constraintAnchorArr = this.f4376OoooO;
        int length = constraintAnchorArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            constraintAnchorArr[i2] = this.f4501oo0o0Oo;
        }
    }
}
