package com.ishumei.l111l1111llIl;

import android.util.Base64;
import com.qiniu.android.common.Constants;
import java.io.IOException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class l1111l111111Il {
    private static String l1111l111111Il(String str, byte[] bArr) throws IOException {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, secretKeyGenerateSecret);
            return Base64.encodeToString(cipher.doFinal(bArr), 0);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static String l1111l111111Il(String str, byte[] bArr, int i) throws IOException {
        try {
            return new String(l111l11111lIl(str, bArr, i), Constants.UTF_8);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static Key l1111l111111Il(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(str.getBytes(Constants.UTF_8));
        keyGenerator.init(64, secureRandom);
        return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "DES");
    }

    private static byte[] l111l11111I1l(String str, byte[] bArr) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(2, new SecretKeySpec(str.getBytes(Constants.UTF_8), "DES"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static String l111l11111lIl(String str, byte[] bArr) throws IOException {
        try {
            return new String(l111l11111I1l(str, bArr), Constants.UTF_8);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static byte[] l111l11111lIl(String str, byte[] bArr, int i) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(2, new SecretKeySpec(str.getBytes(Constants.UTF_8), "DES"));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, i);
            return bArr2;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
