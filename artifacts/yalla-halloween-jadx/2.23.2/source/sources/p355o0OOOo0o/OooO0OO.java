package p355o0OOOo0o;

import com.android.billingclient.api.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f42896OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f42897OooO0o0;

    public OooO0OO(OooO0o oooO0o, boolean z) {
        this.f42897OooO0o0 = oooO0o;
        this.f42896OooO0Oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("====== 耳机状态 耳机状态");
        boolean z = this.f42896OooO0Oo;
        sb.append(z);
        o0000O0O.OooO0o0(3, sb.toString());
        this.f42897OooO0o0.f42903OooO0Oo.OooO0oO(!z);
    }
}
