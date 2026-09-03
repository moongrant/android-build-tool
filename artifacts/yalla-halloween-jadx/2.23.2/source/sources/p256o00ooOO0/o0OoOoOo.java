package p256o00ooOO0;

import com.google.android.gms.common.api.internal.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOoOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f40335OooO0Oo;

    public o0OoOoOo(OooO00o oooO00o) {
        this.f40335OooO0Oo = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO00o oooO00o = this.f40335OooO0Oo;
        oooO00o.f14307OooOOOo.lock();
        try {
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14307OooOOOo.unlock();
        }
    }
}
