package p431o0OoOOOO;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.UByte;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGooglePaySignOrMd5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePaySignOrMd5.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePaySignOrMd5\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,80:1\n32#2,2:81\n*S KotlinDebug\n*F\n+ 1 GooglePaySignOrMd5.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePaySignOrMd5\n*L\n64#1:81,2\n*E\n"})
public final class oo0O {
    public static String OooO00o(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        ByteIterator it = ArrayIteratorsKt.iterator(bArr);
        while (it.hasNext()) {
            String hexString = Integer.toHexString(it.next().byteValue() & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(hexString);
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    @NotNull
    public static String OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            byte[] bytes = message.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] byteArray = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
            return OooO00o(byteArray);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @NotNull
    public static String OooO0OO(@NotNull String srcStr, @NotNull String key) {
        Intrinsics.checkNotNullParameter(srcStr, "srcStr");
        Intrinsics.checkNotNullParameter(key, "key");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = srcStr.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(srcStr.toByteArray(), Base64.NO_WRAP)");
        return OooO0O0(OooO0O0(new String(bArrEncode, charset)) + key);
    }

    @NotNull
    public static String OooO0Oo(@NotNull String srcStr) {
        Intrinsics.checkNotNullParameter(srcStr, "srcStr");
        Intrinsics.checkNotNullParameter("", "key");
        String strOooO0O0 = OooO0O0(srcStr + "@CQ+?>K&*N~");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strOooO0O0.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(md5Str.toByteArray(), Base64.NO_WRAP)");
        return OooO0O0(new String(bArrEncode, charset).concat(""));
    }

    @NotNull
    public static String OooO0o0(@NotNull String srcStr) {
        Intrinsics.checkNotNullParameter(srcStr, "srcStr");
        Intrinsics.checkNotNullParameter("", "key");
        String strOooO0O0 = OooO0O0(srcStr + "$Dc,,~/d_>");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strOooO0O0.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(md5Str.toByteArray(), Base64.NO_WRAP)");
        return OooO0O0(new String(bArrEncode, charset).concat(""));
    }
}
