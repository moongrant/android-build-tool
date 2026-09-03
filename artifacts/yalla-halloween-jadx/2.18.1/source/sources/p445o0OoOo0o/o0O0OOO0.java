package p445o0OoOo0o;

import OooO00o.OooO00o;
import p450o0OoOoo.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f40244Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f40245Oooo0oO;

    public o0O0OOO0(o0O0OOOo o0o0oooo, boolean z) {
        this.f40245Oooo0oO = o0o0oooo;
        this.f40244Oooo0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("====== 耳机状态 耳机状态");
        sbOooO0o0.append(this.f40244Oooo0o);
        o00.OooO0OO(3, sbOooO0o0.toString());
        this.f40245Oooo0oO.f40251OooO0Oo.OooOo0o(!this.f40244Oooo0o);
    }
}
