package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends o0O0O00 {
    public o00oO0o(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f6904OooO0Oo.OooO0o();
        constraintWidget.f6906OooO0o0.OooO0o();
        this.f27876OooO0o = ((OooOO0) constraintWidget).f7063o0O0O00;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    @Override // p061o0000o0.o0O0O00, p061o0000o0.Oooo0
    public final void OooO00o(Oooo0 oooo0) {
        o00O0O o00o0o2 = this.f27879OooO0oo;
        if (o00o0o2.f27860OooO0OO && !o00o0o2.f27866OooOO0) {
            this.f27879OooO0oo.OooO0Oo((int) ((((o00O0O) o00o0o2.f27868OooOO0o.get(0)).f27864OooO0oO * ((OooOO0) this.f27873OooO0O0).f7065o0OOO0o) + 0.5f));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p061o0000o0.o0O0O00
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget = this.f27873OooO0O0;
        OooOO0 oooOO1 = (OooOO0) constraintWidget;
        int i = oooOO1.f7066o0Oo0oo;
        int i2 = oooOO1.f7064o0OO00O;
        if (oooOO1.f7063o0O0O00 == 1) {
            if (i != -1) {
                this.f27879OooO0oo.f27868OooOO0o.add(constraintWidget.f6948OoooOOo.f6904OooO0Oo.f27879OooO0oo);
                this.f27873OooO0O0.f6948OoooOOo.f6904OooO0Oo.f27879OooO0oo.f27867OooOO0O.add(this.f27879OooO0oo);
                this.f27879OooO0oo.f27862OooO0o = i;
            } else if (i2 != -1) {
                this.f27879OooO0oo.f27868OooOO0o.add(constraintWidget.f6948OoooOOo.f6904OooO0Oo.f27871OooO);
                this.f27873OooO0O0.f6948OoooOOo.f6904OooO0Oo.f27871OooO.f27867OooOO0O.add(this.f27879OooO0oo);
                this.f27879OooO0oo.f27862OooO0o = -i2;
            } else {
                o00O0O o00o0o2 = this.f27879OooO0oo;
                o00o0o2.f27859OooO0O0 = true;
                o00o0o2.f27868OooOO0o.add(constraintWidget.f6948OoooOOo.f6904OooO0Oo.f27871OooO);
                this.f27873OooO0O0.f6948OoooOOo.f6904OooO0Oo.f27871OooO.f27867OooOO0O.add(this.f27879OooO0oo);
            }
            OooOOO0(this.f27873OooO0O0.f6904OooO0Oo.f27879OooO0oo);
            OooOOO0(this.f27873OooO0O0.f6904OooO0Oo.f27871OooO);
            return;
        }
        if (i != -1) {
            this.f27879OooO0oo.f27868OooOO0o.add(constraintWidget.f6948OoooOOo.f6906OooO0o0.f27879OooO0oo);
            this.f27873OooO0O0.f6948OoooOOo.f6906OooO0o0.f27879OooO0oo.f27867OooOO0O.add(this.f27879OooO0oo);
            this.f27879OooO0oo.f27862OooO0o = i;
        } else if (i2 != -1) {
            this.f27879OooO0oo.f27868OooOO0o.add(constraintWidget.f6948OoooOOo.f6906OooO0o0.f27871OooO);
            this.f27873OooO0O0.f6948OoooOOo.f6906OooO0o0.f27871OooO.f27867OooOO0O.add(this.f27879OooO0oo);
            this.f27879OooO0oo.f27862OooO0o = -i2;
        } else {
            o00O0O o00o0o3 = this.f27879OooO0oo;
            o00o0o3.f27859OooO0O0 = true;
            o00o0o3.f27868OooOO0o.add(constraintWidget.f6948OoooOOo.f6906OooO0o0.f27871OooO);
            this.f27873OooO0O0.f6948OoooOOo.f6906OooO0o0.f27871OooO.f27867OooOO0O.add(this.f27879OooO0oo);
        }
        OooOOO0(this.f27873OooO0O0.f6906OooO0o0.f27879OooO0oo);
        OooOOO0(this.f27873OooO0O0.f6906OooO0o0.f27871OooO);
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o() {
        this.f27879OooO0oo.OooO0OO();
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o0() {
        ConstraintWidget constraintWidget = this.f27873OooO0O0;
        if (((OooOO0) constraintWidget).f7063o0O0O00 == 1) {
            constraintWidget.f6953Ooooo0o = this.f27879OooO0oo.f27864OooO0oO;
        } else {
            constraintWidget.f6954OooooO0 = this.f27879OooO0oo.f27864OooO0oO;
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
