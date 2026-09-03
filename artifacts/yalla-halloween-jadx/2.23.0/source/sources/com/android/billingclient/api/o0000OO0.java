package com.android.billingclient.api;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static p480o0o000Oo.o0OOO0o f9721OooO00o;

    public static int OooO00o(p328o0OO00o.OooO0o oooO0o, boolean z) {
        int i = oooO0o.f43059OooO0OO;
        int i2 = oooO0o.f43058OooO0O0;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte[][] bArr = oooO0o.f43057OooO00o;
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += (i6 - 5) + 3;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 5) + 3 + i4;
            }
        }
        return i4;
    }

    public static p480o0o000Oo.o0OOO0o OooO0O0() {
        if (f9721OooO00o == null) {
            f9721OooO00o = new p480o0o000Oo.o0OOO0o();
        }
        return f9721OooO00o;
    }
}
