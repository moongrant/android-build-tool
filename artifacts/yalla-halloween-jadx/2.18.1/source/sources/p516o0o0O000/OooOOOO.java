package p516o0o0O000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {
    public static byte[] OooO00o(byte[] bArr, byte[] key, byte[] bArr2) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter("AES/CBC/PKCS7Padding", "algorithm");
        byte[] bArrDoFinal = OooO0O0(2, key, bArr2, "AES/CBC/PKCS7Padding").doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(this)");
        return bArrDoFinal;
    }

    @NotNull
    public static final Cipher OooO0O0(int i, @NotNull byte[] key, @Nullable byte[] bArr, @NotNull String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(algorithm);
        String upperCase = algorithm.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        if (StringsKt__StringsKt.contains$default(upperCase, "CFB", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(upperCase, "CBC", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(upperCase, "CTR", false, 2, (Object) null)) {
            cipher.init(i, secretKeySpec, new IvParameterSpec(bArr));
        } else {
            cipher.init(i, secretKeySpec);
        }
        Intrinsics.checkNotNullExpressionValue(cipher, "cipher");
        return cipher;
    }
}
