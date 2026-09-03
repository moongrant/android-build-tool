package p424o0OoO0Oo;

import p428o0OoO0oo.o00OOOO0;
import p641o0ooOO0o.o00OO;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f46738OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f46739OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Exception f46740OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO f46741OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f46742OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f46743OooO0oo;

    public oo0O(o00OOOO0 o00oooo1, o0000O0 o0000o1, Exception exc, int i, int i2, String str) {
        this.f46739OooO0Oo = o00oooo1;
        this.f46741OooO0o0 = o0000o1;
        this.f46740OooO0o = exc;
        this.f46742OooO0oO = i;
        this.f46743OooO0oo = i2;
        this.f46738OooO = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00OOOO0 o00oooo1 = this.f46739OooO0Oo;
        o00oooo1.OooO00o(this.f46740OooO0o);
        o00oooo1.OooO0OO(this.f46743OooO0oo, this.f46742OooO0oO, this.f46738OooO);
    }
}
