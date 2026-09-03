package p254o00ooOO0;

import com.google.android.gms.common.api.internal.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f40990OooO0Oo;

    public o0O000(OooO00o oooO00o) {
        this.f40990OooO0Oo = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO00o oooO00o = this.f40990OooO0Oo;
        oooO00o.f14783OooOOOo.lock();
        try {
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14783OooOOOo.unlock();
        }
    }
}
