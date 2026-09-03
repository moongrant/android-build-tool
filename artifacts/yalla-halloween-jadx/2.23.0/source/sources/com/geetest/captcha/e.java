package com.geetest.captcha;

import android.util.Base64;
import com.qiniu.android.common.Constants;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
final class e {
    public static byte[] a(byte[] bArr, String str) throws Exception {
        return a(bArr, str.getBytes(Constants.UTF_8), a());
    }

    public static byte[] a(byte[] bArr, String str, String str2) throws Exception {
        return a(bArr, str.getBytes(Constants.UTF_8), str2.getBytes(Constants.UTF_8));
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        Object objNewInstance = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(bArr3);
        Object objNewInstance2 = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bArr2, "AES");
        Class<?> cls = Class.forName(a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 2, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bArr);
    }

    public static byte[] a() {
        return k.a(new String(Base64.decode("MzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzA=", 0)));
    }

    public static String a(String str) {
        return new String(Base64.decode(str, 0));
    }
}
