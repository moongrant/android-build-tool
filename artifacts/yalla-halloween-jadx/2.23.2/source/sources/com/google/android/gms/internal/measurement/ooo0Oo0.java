package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ooo0Oo0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean OooO00o(int i, int i2, byte[] bArr) {
        int iOooO00o;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iOooO00o = 0;
            break;
        }
        while (true) {
            if (i >= i2) {
                iOooO00o = 0;
                break;
            }
            int i3 = i + 1;
            iOooO00o = bArr[i];
            if (iOooO00o < 0) {
                if (iOooO00o >= -32) {
                    if (iOooO00o >= -16) {
                        if (i3 < i2 - 2) {
                            int i4 = i3 + 1;
                            int i5 = bArr[i3];
                            if (i5 <= -65) {
                                if ((((i5 + 112) + (iOooO00o << 28)) >> 30) == 0) {
                                    int i6 = i4 + 1;
                                    if (bArr[i4] <= -65) {
                                        i3 = i6 + 1;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                            iOooO00o = -1;
                            break;
                        }
                        iOooO00o = oO00000o.OooO00o(i3, i2, bArr);
                        break;
                    }
                    if (i3 < i2 - 1) {
                        int i7 = i3 + 1;
                        char c = bArr[i3];
                        if (c <= -65 && ((iOooO00o != -32 || c >= -96) && (iOooO00o != -19 || c < -96))) {
                            i = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                        iOooO00o = -1;
                        break;
                    }
                    iOooO00o = oO00000o.OooO00o(i3, i2, bArr);
                    break;
                }
                if (i3 >= i2) {
                    break;
                }
                if (iOooO00o >= -62) {
                    i = i3 + 1;
                    if (bArr[i3] > -65) {
                    }
                }
                iOooO00o = -1;
                break;
            }
            i = i3;
        }
        return iOooO00o == 0;
    }
}
