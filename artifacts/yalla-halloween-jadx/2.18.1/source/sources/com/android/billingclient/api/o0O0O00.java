package com.android.billingclient.api;

import com.facebook.internal.security.CertificateUtil;
import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class o0O0O00 implements p684oO0000o.OooO0O0 {
    public static String OooO00o(String str, String str2) {
        try {
            return "Basic " + ByteString.OooO((str + CertificateUtil.DELIMITER + str2).getBytes("ISO-8859-1")).OooO00o();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public static int OooO0O0(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
