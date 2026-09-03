package com.common.support.crypto;

import OooO0O0.OooO0O0;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u001a\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"SHA_TYPE", "", "encrypt", "string", "type", "bytes2Hex", "", "hmacsha256", "key", "hmacsha256AndBase64", "md5", "sha256", "crypto_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HashKt {

    @NotNull
    private static final String SHA_TYPE = "HmacSHA256";

    @NotNull
    public static final String bytes2Hex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.common.support.crypto.HashKt.bytes2Hex.1
            @NotNull
            public final CharSequence invoke(byte b) {
                return OooO0O0.OooO00o(new Object[]{Byte.valueOf(b)}, 1, "%02x", "format(this, *args)");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
    }

    private static final String encrypt(String str, String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(type)");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bytes2, "bytes");
            return bytes2Hex(bytes2);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @NotNull
    public static final String hmacsha256(@NotNull String str, @NotNull String key) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return hmacsha256AndBase64(bytes, key);
    }

    @NotNull
    public static final String hmacsha256AndBase64(@NotNull byte[] bArr, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return Base64ExtensionsKt.base64EncodeToString(hmacsha256(bArr, key));
    }

    @NotNull
    public static final String md5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encrypt(str, "MD5");
    }

    @NotNull
    public static final String sha256(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encrypt(str, "SHA-256");
    }

    @NotNull
    public static final byte[] hmacsha256(@NotNull byte[] bArr, @NotNull String key) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Mac mac = Mac.getInstance(SHA_TYPE);
        Charset utf8 = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(utf8, "utf8");
        byte[] bytes = key.getBytes(utf8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        mac.init(new SecretKeySpec(bytes, SHA_TYPE));
        byte[] bArrDoFinal = mac.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "mac.doFinal(this)");
        return bArrDoFinal;
    }
}
