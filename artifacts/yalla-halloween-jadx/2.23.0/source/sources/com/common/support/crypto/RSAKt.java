package com.common.support.crypto;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003\u001a\u0012\u0010\r\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003\u001a\u0012\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003\u001a\u0012\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ENCRYPT_MAX_SIZE", "", "TRANSFORMATION", "", "string2PrivateKey", "Ljava/security/PrivateKey;", "privateKeyString", "string2PublicKey", "Ljava/security/PublicKey;", "publicKeyString", "rsaDecrypt", "", "privateKey", "rsaDecryptRaw", "rsaEncrypt", "publicKey", "crypto_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RSAKt {
    private static final int ENCRYPT_MAX_SIZE = 117;

    @NotNull
    private static final String TRANSFORMATION = "RSA/ECB/PKCS1Padding";

    @NotNull
    public static final String rsaDecrypt(@NotNull String str, @NotNull String privateKey) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64ExtensionsKt.base64EncodeToString(rsaDecrypt(bytes, privateKey));
    }

    @NotNull
    public static final byte[] rsaDecryptRaw(@NotNull String str, @NotNull String privateKey) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return rsaDecrypt(bytes, privateKey);
    }

    @NotNull
    public static final String rsaEncrypt(@NotNull String str, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64ExtensionsKt.base64EncodeToString(rsaEncrypt(bytes, publicKey));
    }

    private static final PrivateKey string2PrivateKey(String str) throws InvalidKeySpecException {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64ExtensionsKt.base64Decode(str)));
        Intrinsics.checkNotNullExpressionValue(privateKeyGeneratePrivate, "keyFactory.generatePrivate(keySpec)");
        return privateKeyGeneratePrivate;
    }

    private static final PublicKey string2PublicKey(String str) throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64ExtensionsKt.base64Decode(str)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(keySpec)");
        return publicKeyGeneratePublic;
    }

    @NotNull
    public static final byte[] rsaDecrypt(@NotNull byte[] bArr, @NotNull String privateKey) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        if (bArr.length == 0) {
            return new byte[0];
        }
        try {
            PrivateKey privateKeyString2PrivateKey = string2PrivateKey(privateKey);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(2, privateKeyString2PrivateKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "{\n    val key = string2P… cipher.doFinal(this)\n  }");
            return bArrDoFinal;
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    @NotNull
    public static final byte[] rsaEncrypt(@NotNull byte[] bArr, @NotNull String publicKey) {
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        try {
            PublicKey publicKeyString2PublicKey = string2PublicKey(publicKey);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(1, publicKeyString2PublicKey);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = 0;
            while (bArr.length - length > 0) {
                if (bArr.length - length >= 117) {
                    bArrDoFinal = cipher.doFinal(bArr, length, 117);
                    length += 117;
                } else {
                    bArrDoFinal = cipher.doFinal(bArr, length, bArr.length - length);
                    length = bArr.length;
                }
                byteArrayOutputStream.write(bArrDoFinal);
            }
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
            return byteArray;
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }
}
