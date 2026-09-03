package com.geetest.captcha;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return k.a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
