package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends o0OoOo0 {
    public OooOOOO(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f4338OooO0Oo.OooO0o();
        constraintWidget.f4340OooO0o0.OooO0o();
        this.f41891OooO0o = ((androidx.constraintlayout.core.widgets.OooOO0) constraintWidget).f4497o0O0O00;
    }

    @Override // o0O0O00.o0OoOo0, o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        OooOO0 oooOO1 = this.f41894OooO0oo;
        if (oooOO1.f41862OooO0OO && !oooOO1.f41868OooOO0) {
            oooOO1.OooO0Oo((int) ((((OooOO0) oooOO1.f41870OooOO0o.get(0)).f41866OooO0oO * ((androidx.constraintlayout.core.widgets.OooOO0) this.f41888OooO0O0).f4499o0OOO0o) + 0.5f));
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget = this.f41888OooO0O0;
        androidx.constraintlayout.core.widgets.OooOO0 oooOO1 = (androidx.constraintlayout.core.widgets.OooOO0) constraintWidget;
        int i = oooOO1.f4500o0Oo0oo;
        int i2 = oooOO1.f4498o0OO00O;
        int i3 = oooOO1.f4497o0O0O00;
        OooOO0 oooOO2 = this.f41894OooO0oo;
        if (i3 == 1) {
            if (i != -1) {
                oooOO2.f41870OooOO0o.add(constraintWidget.f4382OoooOOo.f4338OooO0Oo.f41894OooO0oo);
                this.f41888OooO0O0.f4382OoooOOo.f4338OooO0Oo.f41894OooO0oo.f41869OooOO0O.add(oooOO2);
                oooOO2.f41864OooO0o = i;
            } else if (i2 != -1) {
                oooOO2.f41870OooOO0o.add(constraintWidget.f4382OoooOOo.f4338OooO0Oo.f41886OooO);
                this.f41888OooO0O0.f4382OoooOOo.f4338OooO0Oo.f41886OooO.f41869OooOO0O.add(oooOO2);
                oooOO2.f41864OooO0o = -i2;
            } else {
                oooOO2.f41861OooO0O0 = true;
                oooOO2.f41870OooOO0o.add(constraintWidget.f4382OoooOOo.f4338OooO0Oo.f41886OooO);
                this.f41888OooO0O0.f4382OoooOOo.f4338OooO0Oo.f41886OooO.f41869OooOO0O.add(oooOO2);
            }
            OooOOO0(this.f41888OooO0O0.f4338OooO0Oo.f41894OooO0oo);
            OooOOO0(this.f41888OooO0O0.f4338OooO0Oo.f41886OooO);
            return;
        }
        if (i != -1) {
            oooOO2.f41870OooOO0o.add(constraintWidget.f4382OoooOOo.f4340OooO0o0.f41894OooO0oo);
            this.f41888OooO0O0.f4382OoooOOo.f4340OooO0o0.f41894OooO0oo.f41869OooOO0O.add(oooOO2);
            oooOO2.f41864OooO0o = i;
        } else if (i2 != -1) {
            oooOO2.f41870OooOO0o.add(constraintWidget.f4382OoooOOo.f4340OooO0o0.f41886OooO);
            this.f41888OooO0O0.f4382OoooOOo.f4340OooO0o0.f41886OooO.f41869OooOO0O.add(oooOO2);
            oooOO2.f41864OooO0o = -i2;
        } else {
            oooOO2.f41861OooO0O0 = true;
            oooOO2.f41870OooOO0o.add(constraintWidget.f4382OoooOOo.f4340OooO0o0.f41886OooO);
            this.f41888OooO0O0.f4382OoooOOo.f4340OooO0o0.f41886OooO.f41869OooOO0O.add(oooOO2);
        }
        OooOOO0(this.f41888OooO0O0.f4340OooO0o0.f41894OooO0oo);
        OooOOO0(this.f41888OooO0O0.f4340OooO0o0.f41886OooO);
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o() {
        this.f41894OooO0oo.OooO0OO();
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o0() {
        ConstraintWidget constraintWidget = this.f41888OooO0O0;
        int i = ((androidx.constraintlayout.core.widgets.OooOO0) constraintWidget).f4497o0O0O00;
        OooOO0 oooOO1 = this.f41894OooO0oo;
        if (i == 1) {
            constraintWidget.f4387Ooooo0o = oooOO1.f41866OooO0oO;
        } else {
            constraintWidget.f4388OooooO0 = oooOO1.f41866OooO0oO;
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(OooOO0 oooOO1) {
        OooOO0 oooOO2 = this.f41894OooO0oo;
        oooOO2.f41869OooOO0O.add(oooOO1);
        oooOO1.f41870OooOO0o.add(oooOO2);
    }
}
