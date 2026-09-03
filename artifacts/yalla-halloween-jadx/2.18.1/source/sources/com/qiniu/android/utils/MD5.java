package com.qiniu.android.utils;

import com.qiniu.android.dns.util.Hex;
import java.security.MessageDigest;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes2.dex */
public class MD5 {
    public static String encrypt(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
            messageDigest.update(bArr);
            return Hex.encodeHexString(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
