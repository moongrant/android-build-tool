package p061o0000o0;

/* JADX INFO: loaded from: classes.dex */
public class o00Oo0 extends o00O0O {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f27869OooOOO0;

    public o00Oo0(o0O0O00 o0o0o00) {
        super(o0o0o00);
        if (o0o0o00 instanceof o0OOO0o) {
            this.f27863OooO0o0 = 2;
        } else {
            this.f27863OooO0o0 = 3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    @Override // p061o0000o0.o00O0O
    public final void OooO0Oo(int i) {
        if (this.f27866OooOO0) {
            return;
        }
        this.f27866OooOO0 = true;
        this.f27864OooO0oO = i;
        for (Oooo0 oooo0 : this.f27867OooOO0O) {
            oooo0.OooO00o(oooo0);
        }
    }
}
