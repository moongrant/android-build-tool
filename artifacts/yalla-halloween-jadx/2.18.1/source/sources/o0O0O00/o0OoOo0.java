package o0O0O00;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {
    @Nullable
    public static final Object OooO00o(@NotNull o0O0O00 o0o0o00) {
        Intrinsics.checkNotNullParameter(o0o0o00, "<this>");
        Object objOooo0o = o0o0o00.Oooo0o();
        o00O0O o00o0o2 = objOooo0o instanceof o00O0O ? (o00O0O) objOooo0o : null;
        if (o00o0o2 != null) {
            return o00o0o2.OooO00o();
        }
        return null;
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull Object layoutId) {
        Intrinsics.checkNotNullParameter(o00OOOO0.OooO00o.f4198Oooo0o, "<this>");
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o000oOoO other = new o000oOoO(layoutId);
        Intrinsics.checkNotNullParameter(other, "other");
        return other;
    }
}
