package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO extends oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f4513o0OO00O = 0;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f4514oo0o0Oo = 0;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f4512o0O0O00 = 0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f4511o000OOo = 0;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public int f4505o000000 = 0;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f4506o000000O = 0;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f4507o000000o = false;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public int f4504o00000 = 0;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f4509o00000O0 = 0;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final o0O0O00.OooO0O0.OooO00o f4508o00000O = new o0O0O00.OooO0O0.OooO00o();

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public o0O0O00.OooO0O0.InterfaceC0449OooO0O0 f4510o00000OO = null;

    @Override // oo0o0Oo.OooO0O0, oo0o0Oo.OooO00o
    public final void OooO0OO() {
        for (int i = 0; i < this.f60904o0Oo0oo; i++) {
            ConstraintWidget constraintWidget = this.f60903o0OOO0o[i];
            if (constraintWidget != null) {
                constraintWidget.f4366Oooo0 = true;
            }
        }
    }

    public void OoooOoO(int i, int i2, int i3, int i4) {
    }

    public final void OoooOoo(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O0;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC0449OooO0O0 = this.f4510o00000OO;
            if (interfaceC0449OooO0O0 != null || (constraintWidget2 = this.f4382OoooOOo) == null) {
                break;
            } else {
                this.f4510o00000OO = ((OooO0o) constraintWidget2).f4492o0O0O00;
            }
        }
        o0O0O00.OooO0O0.OooO00o oooO00o = this.f4508o00000O;
        oooO00o.f41848OooO00o = dimensionBehaviour;
        oooO00o.f41849OooO0O0 = dimensionBehaviour2;
        oooO00o.f41850OooO0OO = i;
        oooO00o.f41851OooO0Oo = i2;
        interfaceC0449OooO0O0.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.o000oOoO(oooO00o.f41853OooO0o0);
        constraintWidget.OoooO00(oooO00o.f41852OooO0o);
        constraintWidget.f4368Oooo00O = oooO00o.f41855OooO0oo;
        int i3 = oooO00o.f41854OooO0oO;
        constraintWidget.f4389OooooOO = i3;
        constraintWidget.f4368Oooo00O = i3 > 0;
    }
}
