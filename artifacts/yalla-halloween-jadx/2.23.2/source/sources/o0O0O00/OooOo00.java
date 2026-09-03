package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends o0OoOo0 {
    @Override // o0O0O00.o0OoOo0, o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        androidx.constraintlayout.core.widgets.OooO00o oooO00o = (androidx.constraintlayout.core.widgets.OooO00o) this.f41141OooO0O0;
        int i = oooO00o.f4462o0OO00O;
        OooOO0 oooOO1 = this.f41147OooO0oo;
        Iterator it = oooOO1.f41123OooOO0o.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((OooOO0) it.next()).f41119OooO0oO;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            oooOO1.OooO0Oo(i3 + oooO00o.f4461o0O0O00);
        } else {
            oooOO1.OooO0Oo(i2 + oooO00o.f4461o0O0O00);
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget = this.f41141OooO0O0;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
            OooOO0 oooOO1 = this.f41147OooO0oo;
            oooOO1.f41114OooO0O0 = true;
            androidx.constraintlayout.core.widgets.OooO00o oooO00o = (androidx.constraintlayout.core.widgets.OooO00o) constraintWidget;
            int i = oooO00o.f4462o0OO00O;
            boolean z = oooO00o.f4463oo0o0Oo;
            ArrayList arrayList = oooOO1.f41123OooOO0o;
            int i2 = 0;
            if (i == 0) {
                oooOO1.f41118OooO0o0 = OooOO0.OooO00o.LEFT;
                while (i2 < oooO00o.f60341o0Oo0oo) {
                    ConstraintWidget constraintWidget2 = oooO00o.f60340o0OOO0o[i2];
                    if (z || constraintWidget2.f4409o0OoOo0 != 8) {
                        OooOO0 oooOO2 = constraintWidget2.f4344OooO0Oo.f41147OooO0oo;
                        oooOO2.f41122OooOO0O.add(oooOO1);
                        arrayList.add(oooOO2);
                    }
                    i2++;
                }
                OooOOO0(this.f41141OooO0O0.f4344OooO0Oo.f41147OooO0oo);
                OooOOO0(this.f41141OooO0O0.f4344OooO0Oo.f41139OooO);
                return;
            }
            if (i == 1) {
                oooOO1.f41118OooO0o0 = OooOO0.OooO00o.RIGHT;
                while (i2 < oooO00o.f60341o0Oo0oo) {
                    ConstraintWidget constraintWidget3 = oooO00o.f60340o0OOO0o[i2];
                    if (z || constraintWidget3.f4409o0OoOo0 != 8) {
                        OooOO0 oooOO3 = constraintWidget3.f4344OooO0Oo.f41139OooO;
                        oooOO3.f41122OooOO0O.add(oooOO1);
                        arrayList.add(oooOO3);
                    }
                    i2++;
                }
                OooOOO0(this.f41141OooO0O0.f4344OooO0Oo.f41147OooO0oo);
                OooOOO0(this.f41141OooO0O0.f4344OooO0Oo.f41139OooO);
                return;
            }
            if (i == 2) {
                oooOO1.f41118OooO0o0 = OooOO0.OooO00o.TOP;
                while (i2 < oooO00o.f60341o0Oo0oo) {
                    ConstraintWidget constraintWidget4 = oooO00o.f60340o0OOO0o[i2];
                    if (z || constraintWidget4.f4409o0OoOo0 != 8) {
                        OooOO0 oooOO4 = constraintWidget4.f4346OooO0o0.f41147OooO0oo;
                        oooOO4.f41122OooOO0O.add(oooOO1);
                        arrayList.add(oooOO4);
                    }
                    i2++;
                }
                OooOOO0(this.f41141OooO0O0.f4346OooO0o0.f41147OooO0oo);
                OooOOO0(this.f41141OooO0O0.f4346OooO0o0.f41139OooO);
                return;
            }
            if (i != 3) {
                return;
            }
            oooOO1.f41118OooO0o0 = OooOO0.OooO00o.BOTTOM;
            while (i2 < oooO00o.f60341o0Oo0oo) {
                ConstraintWidget constraintWidget5 = oooO00o.f60340o0OOO0o[i2];
                if (z || constraintWidget5.f4409o0OoOo0 != 8) {
                    OooOO0 oooOO5 = constraintWidget5.f4346OooO0o0.f41139OooO;
                    oooOO5.f41122OooOO0O.add(oooOO1);
                    arrayList.add(oooOO5);
                }
                i2++;
            }
            OooOOO0(this.f41141OooO0O0.f4346OooO0o0.f41147OooO0oo);
            OooOOO0(this.f41141OooO0O0.f4346OooO0o0.f41139OooO);
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o() {
        this.f41142OooO0OO = null;
        this.f41147OooO0oo.OooO0OO();
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o0() {
        ConstraintWidget constraintWidget = this.f41141OooO0O0;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
            int i = ((androidx.constraintlayout.core.widgets.OooO00o) constraintWidget).f4462o0OO00O;
            OooOO0 oooOO1 = this.f41147OooO0oo;
            if (i == 0 || i == 1) {
                constraintWidget.f4393Ooooo0o = oooOO1.f41119OooO0oO;
            } else {
                constraintWidget.f4394OooooO0 = oooOO1.f41119OooO0oO;
            }
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
