package p244o00oo0Oo;

import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O000o implements o000OO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40482OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40483OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f40480OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40481OooO0O0 = 65536;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40485OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000O0Oo[] f40484OooO0o = new o000O0Oo[100];

    public final synchronized void OooO00o(int i) {
        boolean z = i < this.f40482OooO0OO;
        this.f40482OooO0OO = i;
        if (z) {
            OooO0O0();
        }
    }

    public final synchronized void OooO0O0() {
        int i = this.f40482OooO0OO;
        int i2 = this.f40481OooO0O0;
        int i3 = o0O00.f40595OooO00o;
        int iMax = Math.max(0, (((i + i2) - 1) / i2) - this.f40483OooO0Oo);
        int i4 = this.f40485OooO0o0;
        if (iMax >= i4) {
            return;
        }
        Arrays.fill(this.f40484OooO0o, iMax, i4, (Object) null);
        this.f40485OooO0o0 = iMax;
    }
}
