package p086o000Oooo;

import p084o000Ooo0.o000oOoO;
import p091o000o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f35210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f35211OooO0o0;

    public o0O0O00(o000OOo o000ooo2, o0Oo0oo o0oo0oo2) {
        this.f35211OooO0o0 = o000ooo2;
        this.f35210OooO0Oo = o0oo0oo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
        String str = o000OOo.f35206OooO0Oo;
        o0Oo0oo o0oo0oo2 = this.f35210OooO0Oo;
        o000ooooOooO0OO.OooO00o(str, String.format("Scheduling work %s", o0oo0oo2.f35262OooO00o), new Throwable[0]);
        this.f35211OooO0o0.f35207OooO00o.OooO0OO(o0oo0oo2);
    }
}
