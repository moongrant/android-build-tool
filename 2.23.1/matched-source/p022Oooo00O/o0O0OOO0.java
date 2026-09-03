package p022Oooo00O;

import p037OoooOo0.o000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f765OooO0o0;

    public /* synthetic */ o0O0OOO0(Object obj, int i) {
        this.f764OooO0Oo = i;
        this.f765OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f764OooO0Oo;
        Object obj = this.f765OooO0o0;
        switch (i) {
            case 0:
                o0O0OOOo o0o0oooo = (o0O0OOOo) obj;
                o0o0oooo.OooOOOo(o0o0oooo);
                break;
            default:
                o000 o000Var = (o000) obj;
                o000Var.f1483OooOOO0 = true;
                o000Var.OooO0oo();
                break;
        }
    }
}
