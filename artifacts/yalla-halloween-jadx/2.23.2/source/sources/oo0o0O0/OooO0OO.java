package oo0o0O0;

import o00O0OO.o00Ooo;
import o00O0OO.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f60335OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.OooO00o f60336OooO0o0;

    public OooO0OO(androidx.work.impl.foreground.OooO00o oooO00o, String str) {
        this.f60336OooO0o0 = oooO00o;
        this.f60335OooO0Oo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Ooo o00oooOooO0O0 = this.f60336OooO0o0.f11557OooO0Oo.f60223OooO0o.OooO0O0(this.f60335OooO0Oo);
        if (o00oooOooO0O0 == null || !o00oooOooO0O0.OooO0O0()) {
            return;
        }
        synchronized (this.f60336OooO0o0.f11558OooO0o) {
            this.f60336OooO0o0.f11556OooO.put(o0ooOOo.OooO00o(o00oooOooO0O0), o00oooOooO0O0);
            this.f60336OooO0o0.f11562OooOO0.add(o00oooOooO0O0);
            androidx.work.impl.foreground.OooO00o oooO00o = this.f60336OooO0o0;
            oooO00o.f11563OooOO0O.OooO0Oo(oooO00o.f11562OooOO0);
        }
    }
}
