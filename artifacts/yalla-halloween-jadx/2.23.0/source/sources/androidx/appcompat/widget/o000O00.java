package androidx.appcompat.widget;

import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3263OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3264OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f3263OooO0Oo = i;
        this.f3264OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3263OooO0Oo;
        Object obj = this.f3264OooO0o0;
        switch (i) {
            case 0:
                ((Toolbar) obj).OooOO0o();
                break;
            default:
                p045Oooooo.o0000Ooo o0000ooo = (p045Oooooo.o0000Ooo) obj;
                if (o0000ooo.f1920OooOo0o) {
                    o00O0O0.OooO0oo(o0000ooo.f1898OooO00o, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    o0000ooo.f1916OooOo = null;
                    o0000ooo.OooOOO0();
                    o0000ooo.f1920OooOo0o = false;
                }
                break;
        }
    }
}
