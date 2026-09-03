package o00O0;

import o00O0OO.o00Ooo;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f35986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f35987OooO0o0;

    public OooO00o(OooO0O0 oooO0O0, o00Ooo o00ooo2) {
        this.f35987OooO0o0 = oooO0O0;
        this.f35986OooO0Oo = o00ooo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
        String str = OooO0O0.f35988OooO0Oo;
        StringBuilder sb = new StringBuilder("Scheduling work ");
        o00Ooo o00ooo2 = this.f35986OooO0Oo;
        sb.append(o00ooo2.f36216OooO00o);
        o0oo0ooOooO0Oo.OooO00o(str, sb.toString());
        this.f35987OooO0o0.f35989OooO00o.OooO00o(o00ooo2);
    }
}
