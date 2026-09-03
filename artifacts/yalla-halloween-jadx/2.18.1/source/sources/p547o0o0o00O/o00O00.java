package p547o0o0o00O;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O00 f44594OooO00o = new o00O00();

    @NotNull
    public final String OooO00o(@NotNull o00OOOOo responseBody) throws IOException {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Charset charset = Charset.forName("UTF-8");
        o0oOOo o0ooooOooO0oo = responseBody.OooO0oo();
        o0ooooOooO0oo.request(Long.MAX_VALUE);
        o0oOO o0oooOooO0o0 = o0ooooOooO0oo.OooO0o0();
        o00OO0O0 o00oo0o0OooO0o = responseBody.OooO0o();
        if (o00oo0o0OooO0o != null) {
            charset = o00oo0o0OooO0o.OooO00o(charset);
        }
        o0oOO o0oooClone = o0oooOooO0o0.clone();
        Intrinsics.checkNotNullExpressionValue(charset, "charset");
        return o0oooClone.OooooO0(charset);
    }
}
