package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooOOO {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooO0o(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        super.OooO0o(oooO0OO, z);
        if (this.f60341o0Oo0oo > 0) {
            ConstraintWidget constraintWidget = this.f60340o0OOO0o[0];
            constraintWidget.Oooo0();
            constraintWidget.f4399OoooooO = 0.5f;
            constraintWidget.f4397Oooooo = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.OooO(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.OooO(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.OooO(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.OooO(type4, this, type4, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.OooOOO
    public final void OoooOoO(int i, int i2, int i3, int i4) {
        int iOooOo0O = this.f4511o000000 + this.f4512o000000O + 0;
        int iOooOOOo = this.f4519o0OO00O + this.f4520oo0o0Oo + 0;
        if (this.f60341o0Oo0oo > 0) {
            iOooOo0O += this.f60340o0OOO0o[0].OooOo0O();
            iOooOOOo += this.f60340o0OOO0o[0].OooOOOo();
        }
        int iMax = Math.max(this.f4396OooooOo, iOooOo0O);
        int iMax2 = Math.max(this.f4398Oooooo0, iOooOOOo);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.f4510o00000 = i2;
        this.f4515o00000O0 = i4;
        o000oOoO(i2);
        OoooO00(i4);
        this.f4513o000000o = this.f60341o0Oo0oo > 0;
    }
}
