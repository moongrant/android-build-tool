package com.yalla.yalla.common.manager.googlepay;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.OooOOOO;
import p516o0o0O000.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/GooglePaySignOrMd5;", "", "()V", "SubscriptionHuaWeiKey", "", "extraKey", GooglePaySignOrMd5.md5, "bytesToHexStr", "byteArray", "", "encryptionObfuscatedAccountId", "content", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "signForOrder", "srcStr", "key", "signForRecharge", "signForSubscriptionHuaWei", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GooglePaySignOrMd5 {
    public static final int $stable = 0;

    @NotNull
    public static final GooglePaySignOrMd5 INSTANCE = new GooglePaySignOrMd5();

    @NotNull
    public static final String SubscriptionHuaWeiKey = "$Dc,,~/d_>";

    @NotNull
    public static final String extraKey = "@CQ+?>K&*N~";

    @NotNull
    public static final String md5 = "md5";

    private GooglePaySignOrMd5() {
    }

    private final String bytesToHexStr(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        ByteIterator it = ArrayIteratorsKt.iterator(byteArray);
        while (it.hasNext()) {
            String hexString = Integer.toHexString(it.next().byteValue() & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    @NotNull
    public final String encryptionObfuscatedAccountId(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        String strOooO0Oo = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), content);
        Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "encode(EncryptionUtil.k3(), content)");
        return strOooO0Oo;
    }

    @NotNull
    public final String md5(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(md5);
            byte[] bytes = message.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] byteArray = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
            return bytesToHexStr(byteArray);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @NotNull
    public final String signForOrder(@NotNull String srcStr, @NotNull String key) {
        Intrinsics.checkNotNullParameter(srcStr, "srcStr");
        Intrinsics.checkNotNullParameter(key, "key");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = srcStr.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(srcStr.toByteArray(), Base64.NO_WRAP)");
        return md5(md5(new String(bArrEncode, charset)) + key);
    }

    @NotNull
    public final String signForRecharge(@NotNull String srcStr, @NotNull String key) {
        Intrinsics.checkNotNullParameter(srcStr, "srcStr");
        Intrinsics.checkNotNullParameter(key, "key");
        String strMd5 = md5(srcStr + extraKey);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strMd5.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(md5Str.toByteArray(), Base64.NO_WRAP)");
        return md5(new String(bArrEncode, charset) + key);
    }

    @NotNull
    public final String signForSubscriptionHuaWei(@NotNull String srcStr, @NotNull String key) {
        Intrinsics.checkNotNullParameter(srcStr, "srcStr");
        Intrinsics.checkNotNullParameter(key, "key");
        String strMd5 = md5(srcStr + SubscriptionHuaWeiKey);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strMd5.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(md5Str.toByteArray(), Base64.NO_WRAP)");
        return md5(new String(bArrEncode, charset) + key);
    }
}
