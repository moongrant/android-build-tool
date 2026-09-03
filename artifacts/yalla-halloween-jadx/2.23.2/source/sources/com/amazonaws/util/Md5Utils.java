package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class Md5Utils {
    public static String OooO00o(File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 16384);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                byte[] bArrDigest = messageDigest.digest();
                try {
                    bufferedInputStream.close();
                } catch (Exception e) {
                    LogFactory.OooO00o(Md5Utils.class).OooO0oO("Unable to close input stream of hash candidate: " + e);
                }
                return Base64.OooO0O0(bArrDigest);
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Exception e3) {
                LogFactory.OooO00o(Md5Utils.class).OooO0oO("Unable to close input stream of hash candidate: " + e3);
            }
            throw th;
        }
    }
}
