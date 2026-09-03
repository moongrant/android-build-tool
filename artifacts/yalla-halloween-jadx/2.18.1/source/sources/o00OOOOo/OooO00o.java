package o00OOOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o extends o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f31681OooO00o = new OooO00o();

    @NotNull
    public final String OooO00o(@Nullable Long l, @Nullable String str) {
        if ((l == null) || (l != null && l.longValue() == 0)) {
            return str == null ? "" : str;
        }
        Intrinsics.checkNotNull(l);
        String strOooO0oo = OooO0OO.OooO00o().OooOo0O().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), l.longValue());
        if (strOooO0oo == null) {
            strOooO0oo = "";
        }
        if (StringsKt.isBlank(strOooO0oo)) {
            return str == null ? "" : str;
        }
        return strOooO0oo;
    }
}
