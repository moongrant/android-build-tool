package o0OO0;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {
    public static int OooO00o(OooO0O0 oooO0O0, boolean z) {
        int i = oooO0O0.f42242OooO0OO;
        int i2 = oooO0O0.f42241OooO0O0;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte[][] bArr = oooO0O0.f42240OooO00o;
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

    public static int OooO0O0(Context context, double d) {
        return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + 0.5d);
    }
}
