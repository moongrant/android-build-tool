package p660o0ooo0o0;

import java.nio.charset.Charset;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 {
    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String OooO00o(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String encode = username + ':' + password;
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        Intrinsics.checkNotNullParameter(encode, "$this$encode");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = encode.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return OooOo00.OooO0Oo("Basic ", new ByteString(bytes).OooO00o());
    }
}
