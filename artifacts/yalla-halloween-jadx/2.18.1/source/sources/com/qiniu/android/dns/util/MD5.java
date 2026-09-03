package com.qiniu.android.dns.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes2.dex */
public class MD5 {
    public static String encrypt(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
            messageDigest.update(str.getBytes());
            return Hex.encodeHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
