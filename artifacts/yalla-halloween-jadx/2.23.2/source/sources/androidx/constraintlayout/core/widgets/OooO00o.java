package androidx.constraintlayout.core.widgets;

import androidx.camera.core.impl.OooOOOO;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;
import p028Oooo0oO.o0oOO;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f4462o0OO00O = 0;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f4463oo0o0Oo = true;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f4461o0O0O00 = 0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f4460o000OOo = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooO0o(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        boolean z2;
        int i;
        int i2;
        ConstraintAnchor[] constraintAnchorArr = this.f4382OoooO;
        ConstraintAnchor constraintAnchor = this.f4379Oooo0o0;
        constraintAnchorArr[0] = constraintAnchor;
        int i3 = 2;
        ConstraintAnchor constraintAnchor2 = this.f4378Oooo0o;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.f4380Oooo0oO;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.f4381Oooo0oo;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.f4330OooO = oooO0OO.OooOO0O(constraintAnchor5);
        }
        int i4 = this.f4462o0OO00O;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i4];
        if (!this.f4460o000OOo) {
            OoooOoO();
        }
        if (this.f4460o000OOo) {
            this.f4460o000OOo = false;
            int i5 = this.f4462o0OO00O;
            if (i5 == 0 || i5 == 1) {
                oooO0OO.OooO0Oo(constraintAnchor.f4330OooO, this.f4393Ooooo0o);
                oooO0OO.OooO0Oo(constraintAnchor3.f4330OooO, this.f4393Ooooo0o);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    oooO0OO.OooO0Oo(constraintAnchor2.f4330OooO, this.f4394OooooO0);
                    oooO0OO.OooO0Oo(constraintAnchor4.f4330OooO, this.f4394OooooO0);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f60341o0Oo0oo) {
                z2 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f60340o0OOO0o[i6];
            if ((this.f4463oo0o0Oo || constraintWidget.OooO0oO()) && ((((i2 = this.f4462o0OO00O) == 0 || i2 == 1) && constraintWidget.f4387OoooOOO[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f4379Oooo0o0.f4335OooO0o != null && constraintWidget.f4380Oooo0oO.f4335OooO0o != null) || ((i2 == 2 || i2 == 3) && constraintWidget.f4387OoooOOO[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f4378Oooo0o.f4335OooO0o != null && constraintWidget.f4381Oooo0oo.f4335OooO0o != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = constraintAnchor.OooO0oO() || constraintAnchor3.OooO0oO();
        boolean z4 = constraintAnchor2.OooO0oO() || constraintAnchor4.OooO0oO();
        int i7 = !(!z2 && (((i = this.f4462o0OO00O) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f60341o0Oo0oo) {
            ConstraintWidget constraintWidget2 = this.f60340o0OOO0o[i8];
            if (this.f4463oo0o0Oo || constraintWidget2.OooO0oO()) {
                SolverVariable solverVariableOooOO0O = oooO0OO.OooOO0O(constraintWidget2.f4382OoooO[this.f4462o0OO00O]);
                int i9 = this.f4462o0OO00O;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f4382OoooO[i9];
                constraintAnchor7.f4330OooO = solverVariableOooOO0O;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f4335OooO0o;
                int i10 = (constraintAnchor8 == null || constraintAnchor8.f4334OooO0Oo != this) ? 0 : constraintAnchor7.f4337OooO0oO + 0;
                if (i9 == 0 || i9 == i3) {
                    SolverVariable solverVariable = constraintAnchor6.f4330OooO;
                    int i11 = this.f4461o0O0O00 - i10;
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o = oooO0OO.OooOO0o();
                    SolverVariable solverVariableOooOOO0 = oooO0OO.OooOOO0();
                    solverVariableOooOOO0.f4266OooO0oO = 0;
                    oooO0O0OooOO0o.OooO0Oo(solverVariable, solverVariableOooOO0O, solverVariableOooOOO0, i11);
                    oooO0OO.OooO0OO(oooO0O0OooOO0o);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.f4330OooO;
                    int i12 = this.f4461o0O0O00 + i10;
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o2 = oooO0OO.OooOO0o();
                    SolverVariable solverVariableOooOOO1 = oooO0OO.OooOOO0();
                    solverVariableOooOOO1.f4266OooO0oO = 0;
                    oooO0O0OooOO0o2.OooO0OO(solverVariable2, solverVariableOooOO0O, solverVariableOooOOO1, i12);
                    oooO0OO.OooO0OO(oooO0O0OooOO0o2);
                }
                oooO0OO.OooO0o0(constraintAnchor6.f4330OooO, solverVariableOooOO0O, this.f4461o0O0O00 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f4462o0OO00O;
        if (i13 == 0) {
            oooO0OO.OooO0o0(constraintAnchor3.f4330OooO, constraintAnchor.f4330OooO, 0, 8);
            oooO0OO.OooO0o0(constraintAnchor.f4330OooO, this.f4388OoooOOo.f4380Oooo0oO.f4330OooO, 0, 4);
            oooO0OO.OooO0o0(constraintAnchor.f4330OooO, this.f4388OoooOOo.f4379Oooo0o0.f4330OooO, 0, 0);
            return;
        }
        if (i13 == 1) {
            oooO0OO.OooO0o0(constraintAnchor.f4330OooO, constraintAnchor3.f4330OooO, 0, 8);
            oooO0OO.OooO0o0(constraintAnchor.f4330OooO, this.f4388OoooOOo.f4379Oooo0o0.f4330OooO, 0, 4);
            oooO0OO.OooO0o0(constraintAnchor.f4330OooO, this.f4388OoooOOo.f4380Oooo0oO.f4330OooO, 0, 0);
        } else if (i13 == 2) {
            oooO0OO.OooO0o0(constraintAnchor4.f4330OooO, constraintAnchor2.f4330OooO, 0, 8);
            oooO0OO.OooO0o0(constraintAnchor2.f4330OooO, this.f4388OoooOOo.f4381Oooo0oo.f4330OooO, 0, 4);
            oooO0OO.OooO0o0(constraintAnchor2.f4330OooO, this.f4388OoooOOo.f4378Oooo0o.f4330OooO, 0, 0);
        } else if (i13 == 3) {
            oooO0OO.OooO0o0(constraintAnchor2.f4330OooO, constraintAnchor4.f4330OooO, 0, 8);
            oooO0OO.OooO0o0(constraintAnchor2.f4330OooO, this.f4388OoooOOo.f4378Oooo0o.f4330OooO, 0, 4);
            oooO0OO.OooO0o0(constraintAnchor2.f4330OooO, this.f4388OoooOOo.f4381Oooo0oo.f4330OooO, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean OooO0oO() {
        return true;
    }

    @Override // oo0o0Oo.OooO0O0, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooOO0O(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.OooOO0O(constraintWidget, map);
        OooO00o oooO00o = (OooO00o) constraintWidget;
        this.f4462o0OO00O = oooO00o.f4462o0OO00O;
        this.f4463oo0o0Oo = oooO00o.f4463oo0o0Oo;
        this.f4461o0O0O00 = oooO00o.f4461o0O0O00;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo000() {
        return this.f4460o000OOo;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean Oooo00O() {
        return this.f4460o000OOo;
    }

    public final boolean OoooOoO() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f60341o0Oo0oo;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f60340o0OOO0o[i4];
            if ((this.f4463oo0o0Oo || constraintWidget.OooO0oO()) && ((((i2 = this.f4462o0OO00O) == 0 || i2 == 1) && !constraintWidget.Oooo000()) || (((i3 = this.f4462o0OO00O) == 2 || i3 == 3) && !constraintWidget.Oooo00O()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f60341o0Oo0oo; i5++) {
            ConstraintWidget constraintWidget2 = this.f60340o0OOO0o[i5];
            if (this.f4463oo0o0Oo || constraintWidget2.OooO0oO()) {
                if (!z2) {
                    int i6 = this.f4462o0OO00O;
                    if (i6 == 0) {
                        iMax = constraintWidget2.OooOOO(ConstraintAnchor.Type.LEFT).OooO0Oo();
                    } else if (i6 == 1) {
                        iMax = constraintWidget2.OooOOO(ConstraintAnchor.Type.RIGHT).OooO0Oo();
                    } else if (i6 == 2) {
                        iMax = constraintWidget2.OooOOO(ConstraintAnchor.Type.TOP).OooO0Oo();
                    } else if (i6 == 3) {
                        iMax = constraintWidget2.OooOOO(ConstraintAnchor.Type.BOTTOM).OooO0Oo();
                    }
                    z2 = true;
                }
                int i7 = this.f4462o0OO00O;
                if (i7 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.OooOOO(ConstraintAnchor.Type.LEFT).OooO0Oo());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.OooOOO(ConstraintAnchor.Type.RIGHT).OooO0Oo());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.OooOOO(ConstraintAnchor.Type.TOP).OooO0Oo());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.OooOOO(ConstraintAnchor.Type.BOTTOM).OooO0Oo());
                }
            }
        }
        int i8 = iMax + this.f4461o0O0O00;
        int i9 = this.f4462o0OO00O;
        if (i9 == 0 || i9 == 1) {
            Oooo0oo(i8, i8);
        } else {
            Oooo(i8, i8);
        }
        this.f4460o000OOo = true;
        return true;
    }

    public final int OoooOoo() {
        int i = this.f4462o0OO00O;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strOooO0O0 = o0oOO.OooO0O0(new StringBuilder("[Barrier] "), this.f4402o00O0O, " {");
        for (int i = 0; i < this.f60341o0Oo0oo; i++) {
            ConstraintWidget constraintWidget = this.f60340o0OOO0o[i];
            if (i > 0) {
                strOooO0O0 = OooOOOO.OooO00o(strOooO0O0, ", ");
            }
            StringBuilder sbOooO00o = o0o0Oo.OooO00o(strOooO0O0);
            sbOooO00o.append(constraintWidget.f4402o00O0O);
            strOooO0O0 = sbOooO00o.toString();
        }
        return OooOOOO.OooO00o(strOooO0O0, "}");
    }
}
