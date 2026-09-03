package com.common.support.crypto;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a.\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a$\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a$\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a$\u0010\u000e\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"AES_DEFAULT_MODE", "", "generateAesKey", "getKey", "Ljavax/crypto/spec/SecretKeySpec;", "password", "", "aesDecrypt", "keyBytes", "iv", "mode", "keyString", "isBase64String", "", "aesEncrypt", "crypto_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AESKt {

    @NotNull
    private static final String AES_DEFAULT_MODE = "AES/CBC/PKCS7Padding";

    @NotNull
    public static final byte[] aesDecrypt(@NotNull byte[] bArr, @NotNull byte[] keyBytes, @NotNull byte[] iv, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (!(!(keyBytes.length == 0))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        try {
            SecretKeySpec key = getKey(keyBytes);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance(mode);
            cipher.init(2, key, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(this)");
            return bArrDoFinal;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new byte[0];
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e3) {
            e3.printStackTrace();
            return new byte[0];
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return new byte[0];
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return new byte[0];
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            return new byte[0];
        } catch (IllegalBlockSizeException e7) {
            e7.printStackTrace();
            return new byte[0];
        } catch (NoSuchPaddingException e8) {
            e8.printStackTrace();
            return new byte[0];
        }
    }

    public static /* synthetic */ byte[] aesDecrypt$default(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = AES_DEFAULT_MODE;
        }
        return aesDecrypt(bArr, bArr2, bArr3, str);
    }

    @NotNull
    public static final byte[] aesEncrypt(@NotNull byte[] bArr, @NotNull byte[] keyBytes, @NotNull byte[] iv, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (!(!(keyBytes.length == 0))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        try {
            SecretKeySpec key = getKey(keyBytes);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance(mode);
            cipher.init(1, key, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(this)");
            return bArrDoFinal;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new byte[0];
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e3) {
            e3.printStackTrace();
            return new byte[0];
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return new byte[0];
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return new byte[0];
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            return new byte[0];
        } catch (IllegalBlockSizeException e7) {
            e7.printStackTrace();
            return new byte[0];
        } catch (NoSuchPaddingException e8) {
            e8.printStackTrace();
            return new byte[0];
        }
    }

    public static /* synthetic */ byte[] aesEncrypt$default(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = AES_DEFAULT_MODE;
        }
        return aesEncrypt(bArr, bArr2, bArr3, str);
    }

    @NotNull
    public static final String generateAesKey() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt.OooOoO(string, "-", "");
    }

    private static final SecretKeySpec getKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        return new SecretKeySpec(bArr2, "AES");
    }

    public static /* synthetic */ byte[] aesDecrypt$default(byte[] bArr, String str, byte[] bArr2, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = AES_DEFAULT_MODE;
        }
        return aesDecrypt(bArr, str, bArr2, str2);
    }

    public static /* synthetic */ byte[] aesEncrypt$default(byte[] bArr, String str, byte[] bArr2, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = AES_DEFAULT_MODE;
        }
        return aesEncrypt(bArr, str, bArr2, str2);
    }

    public static /* synthetic */ byte[] aesDecrypt$default(String str, String str2, byte[] bArr, boolean z, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str3 = AES_DEFAULT_MODE;
        }
        return aesDecrypt(str, str2, bArr, z, str3);
    }

    public static /* synthetic */ byte[] aesEncrypt$default(String str, String str2, byte[] bArr, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = AES_DEFAULT_MODE;
        }
        return aesEncrypt(str, str2, bArr, str3);
    }

    @NotNull
    public static final byte[] aesDecrypt(@NotNull byte[] bArr, @NotNull String keyString, @NotNull byte[] iv, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keyString, "keyString");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(mode, "mode");
        byte[] bytes = keyString.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return aesDecrypt(bArr, bytes, iv, mode);
    }

    @NotNull
    public static final byte[] aesEncrypt(@NotNull byte[] bArr, @NotNull String keyString, @NotNull byte[] iv, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keyString, "keyString");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(mode, "mode");
        byte[] bytes = keyString.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return aesEncrypt(bArr, bytes, iv, mode);
    }

    @NotNull
    public static final byte[] aesDecrypt(@NotNull String str, @NotNull String keyString, @NotNull byte[] iv, boolean z, @NotNull String mode) {
        byte[] bytes;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(keyString, "keyString");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (z) {
            bytes = Base64ExtensionsKt.base64Decode(str);
        } else {
            bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        }
        return aesDecrypt(bytes, keyString, iv, mode);
    }

    @NotNull
    public static final byte[] aesEncrypt(@NotNull String str, @NotNull String keyString, @NotNull byte[] iv, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(keyString, "keyString");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(mode, "mode");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return aesEncrypt(bytes, keyString, iv, mode);
    }
}
