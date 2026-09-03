package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooOOO {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooO0oO(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        super.OooO0oO(oooO0OO, z);
        if (this.f27655o0Oo0oo > 0) {
            ConstraintWidget constraintWidget = this.f27654o0OOO0o[0];
            constraintWidget.Oooo0o0();
            constraintWidget.f6959OoooooO = 0.5f;
            constraintWidget.f6957Oooooo = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.OooOO0(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.OooOO0(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.OooOO0(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.OooOO0(type4, this, type4, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.OooOOO
    public final void OooooOo(int i, int i2, int i3, int i4) {
        int iOooOoO0 = this.f7071o000000 + this.f7072o000000O + 0;
        int iOooOOo = this.f7079o0OO00O + this.f7080oo0o0Oo + 0;
        if (this.f27655o0Oo0oo > 0) {
            iOooOoO0 += this.f27654o0OOO0o[0].OooOoO0();
            iOooOOo += this.f27654o0OOO0o[0].OooOOo();
        }
        int iMax = Math.max(this.f6956OooooOo, iOooOoO0);
        int iMax2 = Math.max(this.f6958Oooooo0, iOooOOo);
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
        this.f7070o00000 = i2;
        this.f7075o00000O0 = i4;
        Ooooo00(i2);
        OoooOO0(i4);
        this.f7073o000000o = this.f27655o0Oo0oo > 0;
    }
}
