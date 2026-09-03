package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o0000O0O.OooOo;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o0O00;
import p028Oooo0o0.o0O000o0;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OffsetKt {
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super OooO, OooOo> offset) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0O00(offset));
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull o00OOOO0 offset, float f, float f2) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return offset.OooOOoo(new o0O000o0(f, f2));
    }

    public static o00OOOO0 OooO0OO(o00OOOO0 o00oooo1, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return OooO0O0(o00oooo1, f, f2);
    }
}
