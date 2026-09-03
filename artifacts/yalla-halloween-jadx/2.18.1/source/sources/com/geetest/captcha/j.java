package com.geetest.captcha;

import java.security.MessageDigest;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME);
            messageDigest.update(bArr);
            return k.a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
