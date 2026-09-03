package p405o0Oo0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p403o0Oo0OOo.o0O0oo00;
import p464o0Oooo.o000000O;
import p464o0Oooo.o0O0oo0o;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO000o extends o0O0oo0o {
    @NotNull
    public static String OooO00o(@Nullable String str, @Nullable Long l) {
        if ((l == null) || (l != null && l.longValue() == 0)) {
            return str == null ? "" : str;
        }
        Intrinsics.checkNotNull(l);
        long jLongValue = l.longValue();
        o0O0oo00 o0o0oo00OooOo00 = o000OOo.OooO00o().OooOo00();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strOooO00o = o0o0oo00OooOo00.OooO00o(((Number) OooO0OO.OooO0O0()).longValue(), jLongValue);
        if (strOooO00o == null) {
            strOooO00o = "";
        }
        if (StringsKt.isBlank(strOooO00o)) {
            return str == null ? "" : str;
        }
        return strOooO00o;
    }
}
