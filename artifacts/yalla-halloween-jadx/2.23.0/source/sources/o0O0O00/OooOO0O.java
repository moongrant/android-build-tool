package o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0O extends OooOO0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f41871OooOOO0;

    public OooOO0O(o0OoOo0 o0oooo0) {
        super(o0oooo0);
        if (o0oooo0 instanceof OooOo) {
            this.f41865OooO0o0 = OooOO0.OooO00o.HORIZONTAL_DIMENSION;
        } else {
            this.f41865OooO0o0 = OooOO0.OooO00o.VERTICAL_DIMENSION;
        }
    }

    @Override // o0O0O00.OooOO0
    public final void OooO0Oo(int i) {
        if (this.f41868OooOO0) {
            return;
        }
        this.f41868OooOO0 = true;
        this.f41866OooO0oO = i;
        for (OooO0o oooO0o : this.f41869OooOO0O) {
            oooO0o.OooO00o(oooO0o);
        }
    }
}
