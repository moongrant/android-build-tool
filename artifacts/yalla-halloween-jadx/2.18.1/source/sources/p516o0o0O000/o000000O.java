package p516o0o0O000;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000000O {
    public static final byte[] OooO00o(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(content, Base64.DEFAULT)");
        return bArrDecode;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String content, @NotNull String privateKey) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        byte[] byteArray = OooO00o(content);
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(OooO00o(privateKey)));
        Intrinsics.checkNotNullExpressionValue(privateKeyGeneratePrivate, "keyFactory.generatePrivate(keySpec)");
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKeyGeneratePrivate);
        byte[] bArrDoFinal = cipher.doFinal(byteArray);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(byteArray)");
        return new String(bArrDoFinal, Charsets.UTF_8);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String content, @NotNull String publicKey) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        byte[] byteArray = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byteArray, "this as java.lang.String).getBytes(charset)");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(OooO00o(publicKey)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(keySpec)");
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKeyGeneratePublic);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = 0;
        while (byteArray.length - length > 0) {
            if (byteArray.length - length >= 117) {
                bArrDoFinal = cipher.doFinal(byteArray, length, 117);
                length += 117;
            } else {
                bArrDoFinal = cipher.doFinal(byteArray, length, byteArray.length - length);
                length = byteArray.length;
            }
            byteArrayOutputStream.write(bArrDoFinal);
        }
        byteArrayOutputStream.close();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "outputStream.toByteArray()");
        String strEncodeToString = Base64.encodeToString(byteArray2, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
        return strEncodeToString;
    }
}
