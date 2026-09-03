package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes.dex */
public class Md5Utils {
    public static byte[] OooO00o(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 16384);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e) {
                        LogFactory.OooO00o(Md5Utils.class).OooO00o("Unable to close input stream of hash candidate: " + e);
                    }
                    throw th;
                }
                byte[] bArrDigest = messageDigest.digest();
                try {
                    bufferedInputStream.close();
                } catch (Exception e2) {
                    LogFactory.OooO00o(Md5Utils.class).OooO00o("Unable to close input stream of hash candidate: " + e2);
                }
                return bArrDigest;
            } catch (NoSuchAlgorithmException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public static byte[] OooO0O0(byte[] bArr) {
        try {
            return MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
