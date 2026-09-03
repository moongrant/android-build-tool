package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends o0OoOo0 {
    public OooOOOO(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f4344OooO0Oo.OooO0o();
        constraintWidget.f4346OooO0o0.OooO0o();
        this.f41144OooO0o = ((androidx.constraintlayout.core.widgets.OooOO0) constraintWidget).f4503o0O0O00;
    }

    @Override // o0O0O00.o0OoOo0, o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        OooOO0 oooOO1 = this.f41147OooO0oo;
        if (oooOO1.f41115OooO0OO && !oooOO1.f41121OooOO0) {
            oooOO1.OooO0Oo((int) ((((OooOO0) oooOO1.f41123OooOO0o.get(0)).f41119OooO0oO * ((androidx.constraintlayout.core.widgets.OooOO0) this.f41141OooO0O0).f4505o0OOO0o) + 0.5f));
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget = this.f41141OooO0O0;
        androidx.constraintlayout.core.widgets.OooOO0 oooOO1 = (androidx.constraintlayout.core.widgets.OooOO0) constraintWidget;
        int i = oooOO1.f4506o0Oo0oo;
        int i2 = oooOO1.f4504o0OO00O;
        int i3 = oooOO1.f4503o0O0O00;
        OooOO0 oooOO2 = this.f41147OooO0oo;
        if (i3 == 1) {
            if (i != -1) {
                oooOO2.f41123OooOO0o.add(constraintWidget.f4388OoooOOo.f4344OooO0Oo.f41147OooO0oo);
                this.f41141OooO0O0.f4388OoooOOo.f4344OooO0Oo.f41147OooO0oo.f41122OooOO0O.add(oooOO2);
                oooOO2.f41117OooO0o = i;
            } else if (i2 != -1) {
                oooOO2.f41123OooOO0o.add(constraintWidget.f4388OoooOOo.f4344OooO0Oo.f41139OooO);
                this.f41141OooO0O0.f4388OoooOOo.f4344OooO0Oo.f41139OooO.f41122OooOO0O.add(oooOO2);
                oooOO2.f41117OooO0o = -i2;
            } else {
                oooOO2.f41114OooO0O0 = true;
                oooOO2.f41123OooOO0o.add(constraintWidget.f4388OoooOOo.f4344OooO0Oo.f41139OooO);
                this.f41141OooO0O0.f4388OoooOOo.f4344OooO0Oo.f41139OooO.f41122OooOO0O.add(oooOO2);
            }
            OooOOO0(this.f41141OooO0O0.f4344OooO0Oo.f41147OooO0oo);
            OooOOO0(this.f41141OooO0O0.f4344OooO0Oo.f41139OooO);
            return;
        }
        if (i != -1) {
            oooOO2.f41123OooOO0o.add(constraintWidget.f4388OoooOOo.f4346OooO0o0.f41147OooO0oo);
            this.f41141OooO0O0.f4388OoooOOo.f4346OooO0o0.f41147OooO0oo.f41122OooOO0O.add(oooOO2);
            oooOO2.f41117OooO0o = i;
        } else if (i2 != -1) {
            oooOO2.f41123OooOO0o.add(constraintWidget.f4388OoooOOo.f4346OooO0o0.f41139OooO);
            this.f41141OooO0O0.f4388OoooOOo.f4346OooO0o0.f41139OooO.f41122OooOO0O.add(oooOO2);
            oooOO2.f41117OooO0o = -i2;
        } else {
            oooOO2.f41114OooO0O0 = true;
            oooOO2.f41123OooOO0o.add(constraintWidget.f4388OoooOOo.f4346OooO0o0.f41139OooO);
            this.f41141OooO0O0.f4388OoooOOo.f4346OooO0o0.f41139OooO.f41122OooOO0O.add(oooOO2);
        }
        OooOOO0(this.f41141OooO0O0.f4346OooO0o0.f41147OooO0oo);
        OooOOO0(this.f41141OooO0O0.f4346OooO0o0.f41139OooO);
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o() {
        this.f41147OooO0oo.OooO0OO();
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o0() {
        ConstraintWidget constraintWidget = this.f41141OooO0O0;
        int i = ((androidx.constraintlayout.core.widgets.OooOO0) constraintWidget).f4503o0O0O00;
        OooOO0 oooOO1 = this.f41147OooO0oo;
        if (i == 1) {
            constraintWidget.f4393Ooooo0o = oooOO1.f41119OooO0oO;
        } else {
            constraintWidget.f4394OooooO0 = oooOO1.f41119OooO0oO;
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(OooOO0 oooOO1) {
        OooOO0 oooOO2 = this.f41147OooO0oo;
        oooOO2.f41122OooOO0O.add(oooOO1);
        oooOO1.f41123OooOO0o.add(oooOO2);
    }
}
