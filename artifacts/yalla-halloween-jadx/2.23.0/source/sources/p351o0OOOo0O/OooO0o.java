package p351o0OOOo0O;

import p353o0OOOoO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f43710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO f43711OooO0o0;

    public OooO0o(OooO oooO, boolean z) {
        this.f43711OooO0o0 = oooO;
        this.f43710OooO0Oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("====== 耳机状态 耳机状态");
        boolean z = this.f43710OooO0Oo;
        sb.append(z);
        o0OOO0o.OooO0OO(3, sb.toString());
        this.f43711OooO0o0.f43704OooO0Oo.OooO0oO(!z);
    }
}
