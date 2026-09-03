package com.qiniu.android.utils;

import com.qiniu.android.dns.util.Hex;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class MD5 {
    public static String encrypt(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return Hex.encodeHexString(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
