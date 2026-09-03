package p137o00OO0oo;

import o00OO0O0.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooO00o.InterfaceC0423OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.model.layer.OooO00o f37383OooO00o;

    public Oooo0(com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        this.f37383OooO00o = oooO00o;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f37383OooO00o;
        boolean z = oooO00o.f11947OooOOOo.OooOO0o() == 1.0f;
        if (z != oooO00o.f11954OooOo0O) {
            oooO00o.f11954OooOo0O = z;
            oooO00o.f11945OooOOO0.invalidateSelf();
        }
    }
}
