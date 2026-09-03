package p420o0OoO0OO;

import p423o0OoO0o0.Oooo0;
import p634o0ooO0oO.o00O00o0;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f45546OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f45547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Exception f45548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f45549OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f45550OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f45551OooO0oo;

    public o0O0O00(Oooo0 oooo0, oO0Oo0oo oo0oo0oo, Exception exc, int i, int i2, String str) {
        this.f45547OooO0Oo = oooo0;
        this.f45549OooO0o0 = oo0oo0oo;
        this.f45548OooO0o = exc;
        this.f45550OooO0oO = i;
        this.f45551OooO0oo = i2;
        this.f45546OooO = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Oooo0 oooo0 = this.f45547OooO0Oo;
        oooo0.OooO00o(this.f45548OooO0o);
        oooo0.OooO0OO(this.f45551OooO0oo, this.f45550OooO0oO, this.f45546OooO);
    }
}
