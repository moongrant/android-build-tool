package com.bumptech.glide.manager;

import com.facebook.internal.security.CertificateUtil;
import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements o000oOoO {
    public static String OooO00o(String str, String str2) {
        try {
            return "Basic " + ByteString.OooOOO0((str + CertificateUtil.DELIMITER + str2).getBytes("ISO-8859-1")).OooO00o();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
