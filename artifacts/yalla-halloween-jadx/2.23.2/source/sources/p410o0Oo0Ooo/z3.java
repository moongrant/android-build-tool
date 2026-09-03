package p410o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.manager.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0Oo.o00O00OO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p475o0Ooooo0.oO0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class z3 extends oO0O00o0 {
    @NotNull
    public static String OooO00o(@Nullable String str, @Nullable Long l) {
        if ((l == null) || (l != null && l.longValue() == 0)) {
            return str == null ? "" : str;
        }
        Intrinsics.checkNotNull(l);
        long jLongValue = l.longValue();
        o00O00OO o00o00ooOooOo0 = o00Oo0.OooO00o().OooOo0();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strOooO00o = o00o00ooOooOo0.OooO00o(((Number) OooO00o.OooO00o()).longValue(), jLongValue);
        if (strOooO00o == null) {
            strOooO00o = "";
        }
        if (StringsKt.isBlank(strOooO00o)) {
            return str == null ? "" : str;
        }
        return strOooO00o;
    }
}
