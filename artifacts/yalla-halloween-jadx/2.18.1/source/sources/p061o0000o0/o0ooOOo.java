package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO00o;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends o0O0O00 {
    public o0ooOOo(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    @Override // p061o0000o0.o0O0O00, p061o0000o0.Oooo0
    public final void OooO00o(Oooo0 oooo0) {
        OooO00o oooO00o = (OooO00o) this.f27873OooO0O0;
        int i = oooO00o.f7022o0OO00O;
        Iterator it = this.f27879OooO0oo.f27868OooOO0o.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((o00O0O) it.next()).f27864OooO0oO;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f27879OooO0oo.OooO0Oo(i3 + oooO00o.f7021o0O0O00);
        } else {
            this.f27879OooO0oo.OooO0Oo(i2 + oooO00o.f7021o0O0O00);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p061o0000o0.o0O0O00
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget = this.f27873OooO0O0;
        if (constraintWidget instanceof OooO00o) {
            o00O0O o00o0o2 = this.f27879OooO0oo;
            o00o0o2.f27859OooO0O0 = true;
            OooO00o oooO00o = (OooO00o) constraintWidget;
            int i = oooO00o.f7022o0OO00O;
            boolean z = oooO00o.f7023oo0o0Oo;
            int i2 = 0;
            if (i == 0) {
                o00o0o2.f27863OooO0o0 = 4;
                while (i2 < oooO00o.f27655o0Oo0oo) {
                    ConstraintWidget constraintWidget2 = oooO00o.f27654o0OOO0o[i2];
                    if (z || constraintWidget2.f6969o0OoOo0 != 8) {
                        o00O0O o00o0o3 = constraintWidget2.f6904OooO0Oo.f27879OooO0oo;
                        o00o0o3.f27867OooOO0O.add(this.f27879OooO0oo);
                        this.f27879OooO0oo.f27868OooOO0o.add(o00o0o3);
                    }
                    i2++;
                }
                OooOOO0(this.f27873OooO0O0.f6904OooO0Oo.f27879OooO0oo);
                OooOOO0(this.f27873OooO0O0.f6904OooO0Oo.f27871OooO);
                return;
            }
            if (i == 1) {
                o00o0o2.f27863OooO0o0 = 5;
                while (i2 < oooO00o.f27655o0Oo0oo) {
                    ConstraintWidget constraintWidget3 = oooO00o.f27654o0OOO0o[i2];
                    if (z || constraintWidget3.f6969o0OoOo0 != 8) {
                        o00O0O o00o0o4 = constraintWidget3.f6904OooO0Oo.f27871OooO;
                        o00o0o4.f27867OooOO0O.add(this.f27879OooO0oo);
                        this.f27879OooO0oo.f27868OooOO0o.add(o00o0o4);
                    }
                    i2++;
                }
                OooOOO0(this.f27873OooO0O0.f6904OooO0Oo.f27879OooO0oo);
                OooOOO0(this.f27873OooO0O0.f6904OooO0Oo.f27871OooO);
                return;
            }
            if (i == 2) {
                o00o0o2.f27863OooO0o0 = 6;
                while (i2 < oooO00o.f27655o0Oo0oo) {
                    ConstraintWidget constraintWidget4 = oooO00o.f27654o0OOO0o[i2];
                    if (z || constraintWidget4.f6969o0OoOo0 != 8) {
                        o00O0O o00o0o5 = constraintWidget4.f6906OooO0o0.f27879OooO0oo;
                        o00o0o5.f27867OooOO0O.add(this.f27879OooO0oo);
                        this.f27879OooO0oo.f27868OooOO0o.add(o00o0o5);
                    }
                    i2++;
                }
                OooOOO0(this.f27873OooO0O0.f6906OooO0o0.f27879OooO0oo);
                OooOOO0(this.f27873OooO0O0.f6906OooO0o0.f27871OooO);
                return;
            }
            if (i != 3) {
                return;
            }
            o00o0o2.f27863OooO0o0 = 7;
            while (i2 < oooO00o.f27655o0Oo0oo) {
                ConstraintWidget constraintWidget5 = oooO00o.f27654o0OOO0o[i2];
                if (z || constraintWidget5.f6969o0OoOo0 != 8) {
                    o00O0O o00o0o6 = constraintWidget5.f6906OooO0o0.f27871OooO;
                    o00o0o6.f27867OooOO0O.add(this.f27879OooO0oo);
                    this.f27879OooO0oo.f27868OooOO0o.add(o00o0o6);
                }
                i2++;
            }
            OooOOO0(this.f27873OooO0O0.f6906OooO0o0.f27879OooO0oo);
            OooOOO0(this.f27873OooO0O0.f6906OooO0o0.f27871OooO);
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o() {
        this.f27874OooO0OO = null;
        this.f27879OooO0oo.OooO0OO();
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o0() {
        ConstraintWidget constraintWidget = this.f27873OooO0O0;
        if (constraintWidget instanceof OooO00o) {
            int i = ((OooO00o) constraintWidget).f7022o0OO00O;
            if (i == 0 || i == 1) {
                constraintWidget.f6953Ooooo0o = this.f27879OooO0oo.f27864OooO0oO;
            } else {
                constraintWidget.f6954OooooO0 = this.f27879OooO0oo.f27864OooO0oO;
            }
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final boolean OooOO0O() {
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOOO0(o00O0O o00o0o2) {
        this.f27879OooO0oo.f27867OooOO0O.add(o00o0o2);
        o00o0o2.f27868OooOO0o.add(this.f27879OooO0oo);
    }
}
