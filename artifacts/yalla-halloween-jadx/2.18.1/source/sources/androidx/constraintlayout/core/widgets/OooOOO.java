package androidx.constraintlayout.core.widgets;

import p061o0000o0.OooOo;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO extends p058o0000OoO.OooOO0O {

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f7079o0OO00O = 0;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f7080oo0o0Oo = 0;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f7078o0O0O00 = 0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f7077o000OOo = 0;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public int f7071o000000 = 0;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f7072o000000O = 0;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f7073o000000o = false;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public int f7070o00000 = 0;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f7075o00000O0 = 0;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public OooOo.OooO00o f7074o00000O = new OooOo.OooO00o();

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public OooOo.OooO0O0 f7076o00000OO = null;

    @Override // p058o0000OoO.OooOO0O, p058o0000OoO.OooOO0
    public final void OooO0OO() {
        for (int i = 0; i < this.f27655o0Oo0oo; i++) {
            ConstraintWidget constraintWidget = this.f27654o0OOO0o[i];
            if (constraintWidget != null) {
                constraintWidget.f6932Oooo0 = true;
            }
        }
    }

    public void OooooOo(int i, int i2, int i3, int i4) {
    }

    public final void Oooooo0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        OooOo.OooO0O0 oooO0O0;
        ConstraintWidget constraintWidget2;
        while (true) {
            oooO0O0 = this.f7076o00000OO;
            if (oooO0O0 != null || (constraintWidget2 = this.f6948OoooOOo) == null) {
                break;
            } else {
                this.f7076o00000OO = ((OooO0o) constraintWidget2).f7058o0O0O00;
            }
        }
        OooOo.OooO00o oooO00o = this.f7074o00000O;
        oooO00o.f27838OooO00o = dimensionBehaviour;
        oooO00o.f27839OooO0O0 = dimensionBehaviour2;
        oooO00o.f27840OooO0OO = i;
        oooO00o.f27841OooO0Oo = i2;
        oooO0O0.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.Ooooo00(this.f7074o00000O.f27843OooO0o0);
        constraintWidget.OoooOO0(this.f7074o00000O.f27842OooO0o);
        OooOo.OooO00o oooO00o2 = this.f7074o00000O;
        constraintWidget.f6934Oooo00O = oooO00o2.f27845OooO0oo;
        constraintWidget.OoooO00(oooO00o2.f27844OooO0oO);
    }
}
