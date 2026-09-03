package p380o0OOoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00oO0;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f43254OooO00o = new o00Ooo();

    @NotNull
    public static String OooO00o(@NotNull o0O00oO0 responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Charset charsetForName = Charset.forName("UTF-8");
        o0O0o0 o0o0o0OooOOo = responseBody.OooOOo();
        o0o0o0OooOOo.request(LongCompanionObject.MAX_VALUE);
        oo0OOoo oo0ooooOooO0O0 = o0o0o0OooOOo.OooO0O0();
        o0O000Oo o0o000ooOooO0oO = responseBody.OooO0oO();
        if (o0o000ooOooO0oO != null) {
            charsetForName = o0o000ooOooO0oO.OooO00o(charsetForName);
        }
        oo0OOoo oo0ooooClone = oo0ooooOooO0O0.clone();
        Intrinsics.checkNotNull(charsetForName);
        return oo0ooooClone.o000000o(charsetForName);
    }
}
