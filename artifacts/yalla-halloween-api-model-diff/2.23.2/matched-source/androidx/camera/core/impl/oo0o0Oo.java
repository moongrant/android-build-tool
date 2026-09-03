package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3783OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f3782OooO0Oo = i;
        this.f3783OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3782OooO0Oo) {
            case 0:
                Oooo00O.o000OO.OooO0OO oooO0OO = (Oooo00O.o000OO.OooO0OO) ((o0O0O00.OooO0OO) this.f3783OooO0o0);
                if (p022Oooo00O.o000OO.this.f553OooO0oo == Oooo00O.o000OO.OooOO0.PENDING_OPEN) {
                    p022Oooo00O.o000OO.this.Oooo0OO(false);
                }
                break;
            default:
                p045Oooooo.o0000Ooo o0000ooo = (p045Oooooo.o0000Ooo) this.f3783OooO0o0;
                if (o0000ooo.f1909OooOo0o) {
                    p028Oooo0oO.o00O0O0.OooO0oo(o0000ooo.f1887OooO00o, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    o0000ooo.f1905OooOo = null;
                    o0000ooo.OooOOO0();
                    o0000ooo.f1909OooOo0o = false;
                }
                break;
        }
    }
}
