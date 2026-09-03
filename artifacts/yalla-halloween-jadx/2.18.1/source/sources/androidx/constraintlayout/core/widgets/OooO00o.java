package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends p058o0000OoO.OooOO0O {

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f7022o0OO00O = 0;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f7023oo0o0Oo = true;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f7021o0O0O00 = 0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f7020o000OOo = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooO0oO(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i;
        int i2;
        ConstraintAnchor[] constraintAnchorArr2 = this.f6942OoooO;
        constraintAnchorArr2[0] = this.f6939Oooo0o0;
        constraintAnchorArr2[2] = this.f6938Oooo0o;
        constraintAnchorArr2[1] = this.f6940Oooo0oO;
        constraintAnchorArr2[3] = this.f6941Oooo0oo;
        int i3 = 0;
        while (true) {
            constraintAnchorArr = this.f6942OoooO;
            if (i3 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i3].f6890OooO = oooO0OO.OooOO0o(constraintAnchorArr[i3]);
            i3++;
        }
        int i4 = this.f7022o0OO00O;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor = constraintAnchorArr[i4];
        if (!this.f7020o000OOo) {
            OooooOo();
        }
        if (this.f7020o000OOo) {
            this.f7020o000OOo = false;
            int i5 = this.f7022o0OO00O;
            if (i5 == 0 || i5 == 1) {
                oooO0OO.OooO0o0(this.f6939Oooo0o0.f6890OooO, this.f6953Ooooo0o);
                oooO0OO.OooO0o0(this.f6940Oooo0oO.f6890OooO, this.f6953Ooooo0o);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    oooO0OO.OooO0o0(this.f6938Oooo0o.f6890OooO, this.f6954OooooO0);
                    oooO0OO.OooO0o0(this.f6941Oooo0oo.f6890OooO, this.f6954OooooO0);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f27655o0Oo0oo) {
                z2 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f27654o0OOO0o[i6];
            if ((this.f7023oo0o0Oo || constraintWidget.OooO0oo()) && ((((i2 = this.f7022o0OO00O) == 0 || i2 == 1) && constraintWidget.f6947OoooOOO[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f6939Oooo0o0.f6895OooO0o != null && constraintWidget.f6940Oooo0oO.f6895OooO0o != null) || ((i2 == 2 || i2 == 3) && constraintWidget.f6947OoooOOO[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f6938Oooo0o.f6895OooO0o != null && constraintWidget.f6941Oooo0oo.f6895OooO0o != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = this.f6939Oooo0o0.OooO0oO() || this.f6940Oooo0oO.OooO0oO();
        boolean z4 = this.f6938Oooo0o.OooO0oO() || this.f6941Oooo0oo.OooO0oO();
        int i7 = !z2 && (((i = this.f7022o0OO00O) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.f27655o0Oo0oo; i8++) {
            ConstraintWidget constraintWidget2 = this.f27654o0OOO0o[i8];
            if (this.f7023oo0o0Oo || constraintWidget2.OooO0oo()) {
                SolverVariable solverVariableOooOO0o = oooO0OO.OooOO0o(constraintWidget2.f6942OoooO[this.f7022o0OO00O]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f6942OoooO;
                int i9 = this.f7022o0OO00O;
                constraintAnchorArr3[i9].f6890OooO = solverVariableOooOO0o;
                int i10 = (constraintAnchorArr3[i9].f6895OooO0o == null || constraintAnchorArr3[i9].f6895OooO0o.f6894OooO0Oo != this) ? 0 : constraintAnchorArr3[i9].f6897OooO0oO + 0;
                if (i9 == 0 || i9 == 2) {
                    SolverVariable solverVariable = constraintAnchor.f6890OooO;
                    int i11 = this.f7021o0O0O00 - i10;
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO0 = oooO0OO.OooOOO0();
                    SolverVariable solverVariableOooOOO = oooO0OO.OooOOO();
                    solverVariableOooOOO.f6823Oooo = 0;
                    oooO0O0OooOOO0.OooO0o0(solverVariable, solverVariableOooOO0o, solverVariableOooOOO, i11);
                    oooO0OO.OooO0OO(oooO0O0OooOOO0);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor.f6890OooO;
                    int i12 = this.f7021o0O0O00 + i10;
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO1 = oooO0OO.OooOOO0();
                    SolverVariable solverVariableOooOOO2 = oooO0OO.OooOOO();
                    solverVariableOooOOO2.f6823Oooo = 0;
                    oooO0O0OooOOO1.OooO0Oo(solverVariable2, solverVariableOooOO0o, solverVariableOooOOO2, i12);
                    oooO0OO.OooO0OO(oooO0O0OooOOO1);
                }
                oooO0OO.OooO0Oo(constraintAnchor.f6890OooO, solverVariableOooOO0o, this.f7021o0O0O00 + i10, i7);
            }
        }
        int i13 = this.f7022o0OO00O;
        if (i13 == 0) {
            oooO0OO.OooO0Oo(this.f6940Oooo0oO.f6890OooO, this.f6939Oooo0o0.f6890OooO, 0, 8);
            oooO0OO.OooO0Oo(this.f6939Oooo0o0.f6890OooO, this.f6948OoooOOo.f6940Oooo0oO.f6890OooO, 0, 4);
            oooO0OO.OooO0Oo(this.f6939Oooo0o0.f6890OooO, this.f6948OoooOOo.f6939Oooo0o0.f6890OooO, 0, 0);
            return;
        }
        if (i13 == 1) {
            oooO0OO.OooO0Oo(this.f6939Oooo0o0.f6890OooO, this.f6940Oooo0oO.f6890OooO, 0, 8);
            oooO0OO.OooO0Oo(this.f6939Oooo0o0.f6890OooO, this.f6948OoooOOo.f6939Oooo0o0.f6890OooO, 0, 4);
            oooO0OO.OooO0Oo(this.f6939Oooo0o0.f6890OooO, this.f6948OoooOOo.f6940Oooo0oO.f6890OooO, 0, 0);
        } else if (i13 == 2) {
            oooO0OO.OooO0Oo(this.f6941Oooo0oo.f6890OooO, this.f6938Oooo0o.f6890OooO, 0, 8);
            oooO0OO.OooO0Oo(this.f6938Oooo0o.f6890OooO, this.f6948OoooOOo.f6941Oooo0oo.f6890OooO, 0, 4);
            oooO0OO.OooO0Oo(this.f6938Oooo0o.f6890OooO, this.f6948OoooOOo.f6938Oooo0o.f6890OooO, 0, 0);
        } else if (i13 == 3) {
            oooO0OO.OooO0Oo(this.f6938Oooo0o.f6890OooO, this.f6941Oooo0oo.f6890OooO, 0, 8);
            oooO0OO.OooO0Oo(this.f6938Oooo0o.f6890OooO, this.f6948OoooOOo.f6938Oooo0o.f6890OooO, 0, 4);
            oooO0OO.OooO0Oo(this.f6938Oooo0o.f6890OooO, this.f6948OoooOOo.f6941Oooo0oo.f6890OooO, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean OooO0oo() {
        return true;
    }

    @Override // p058o0000OoO.OooOO0O, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooOO0o(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.OooOO0o(constraintWidget, map);
        OooO00o oooO00o = (OooO00o) constraintWidget;
        this.f7022o0OO00O = oooO00o.f7022o0OO00O;
        this.f7023oo0o0Oo = oooO00o.f7023oo0o0Oo;
        this.f7021o0O0O00 = oooO00o.f7021o0O0O00;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo0() {
        return this.f7020o000OOo;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo0O0() {
        return this.f7020o000OOo;
    }

    public final boolean OooooOo() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f27655o0Oo0oo;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f27654o0OOO0o[i4];
            if ((this.f7023oo0o0Oo || constraintWidget.OooO0oo()) && ((((i2 = this.f7022o0OO00O) == 0 || i2 == 1) && !constraintWidget.Oooo0()) || (((i3 = this.f7022o0OO00O) == 2 || i3 == 3) && !constraintWidget.Oooo0O0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f27655o0Oo0oo; i5++) {
            ConstraintWidget constraintWidget2 = this.f27654o0OOO0o[i5];
            if (this.f7023oo0o0Oo || constraintWidget2.OooO0oo()) {
                if (!z2) {
                    int i6 = this.f7022o0OO00O;
                    if (i6 == 0) {
                        iMax = constraintWidget2.OooOOOO(ConstraintAnchor.Type.LEFT).OooO0Oo();
                    } else if (i6 == 1) {
                        iMax = constraintWidget2.OooOOOO(ConstraintAnchor.Type.RIGHT).OooO0Oo();
                    } else if (i6 == 2) {
                        iMax = constraintWidget2.OooOOOO(ConstraintAnchor.Type.TOP).OooO0Oo();
                    } else if (i6 == 3) {
                        iMax = constraintWidget2.OooOOOO(ConstraintAnchor.Type.BOTTOM).OooO0Oo();
                    }
                    z2 = true;
                }
                int i7 = this.f7022o0OO00O;
                if (i7 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.OooOOOO(ConstraintAnchor.Type.LEFT).OooO0Oo());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.OooOOOO(ConstraintAnchor.Type.RIGHT).OooO0Oo());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.OooOOOO(ConstraintAnchor.Type.TOP).OooO0Oo());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.OooOOOO(ConstraintAnchor.Type.BOTTOM).OooO0Oo());
                }
            }
        }
        int i8 = iMax + this.f7021o0O0O00;
        int i9 = this.f7022o0OO00O;
        if (i9 == 0 || i9 == 1) {
            OoooO0O(i8, i8);
        } else {
            OoooO(i8, i8);
        }
        this.f7020o000OOo = true;
        return true;
    }

    public final int Oooooo0() {
        int i = this.f7022o0OO00O;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strOooO00o = p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("[Barrier] "), this.f6962o00O0O, " {");
        for (int i = 0; i < this.f27655o0Oo0oo; i++) {
            ConstraintWidget constraintWidget = this.f27654o0OOO0o[i];
            if (i > 0) {
                strOooO00o = OooOo00.OooO0Oo(strOooO00o, ", ");
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(strOooO00o);
            sbOooO0o0.append(constraintWidget.f6962o00O0O);
            strOooO00o = sbOooO0o0.toString();
        }
        return OooOo00.OooO0Oo(strOooO00o, "}");
    }
}
