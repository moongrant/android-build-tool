package p376o0OOoOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o0O0o;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OO00 f44059OooO00o = new o000OO00();

    @NotNull
    public static String OooO00o(@NotNull o0O0o responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Charset charset = Charset.forName("UTF-8");
        o0000 o0000VarOooOOo0 = responseBody.OooOOo0();
        o0000VarOooOOo0.request(LongCompanionObject.MAX_VALUE);
        o00000O o00000oOooO0O0 = o0000VarOooOOo0.OooO0O0();
        o00OOO0 o00ooo0OooO0oO = responseBody.OooO0oO();
        if (o00ooo0OooO0oO != null) {
            charset = o00ooo0OooO0oO.OooO00o(charset);
        }
        o00000O o00000oClone = o00000oOooO0O0.clone();
        Intrinsics.checkNotNullExpressionValue(charset, "charset");
        return o00000oClone.o000000(charset);
    }
}
