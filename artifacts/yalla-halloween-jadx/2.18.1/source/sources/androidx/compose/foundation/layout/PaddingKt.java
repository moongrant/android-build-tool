package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00O0o;
import p028Oooo0o0.o0O00OO;
import p028Oooo0o0.o0OoO00O;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class PaddingKt {
    public static o00OOOO0 OooO(o00OOOO0 o00oooo1, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return OooO0oo(o00oooo1, f, f2, f3, f4);
    }

    @Stable
    @NotNull
    public static final o0O00O0o OooO00o(float f, float f2) {
        return new o0O00O(f, f2, f, f2);
    }

    @Stable
    public static final float OooO0O0(@NotNull o0O00O0o o0o00o0o, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(o0o00o0o, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? o0o00o0o.OooO0OO(layoutDirection) : o0o00o0o.OooO0O0(layoutDirection);
    }

    @Stable
    public static final float OooO0OO(@NotNull o0O00O0o o0o00o0o, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(o0o00o0o, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? o0o00o0o.OooO0O0(layoutDirection) : o0o00o0o.OooO0OO(layoutDirection);
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0Oo(@NotNull o00OOOO0 o00oooo1, @NotNull o0O00O0o paddingValues) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0O00OO(paddingValues));
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0o(@NotNull o00OOOO0 padding, float f, float f2) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return padding.OooOOoo(new o0OoO00O(f, f2, f, f2));
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0o0(@NotNull o00OOOO0 padding, float f) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return padding.OooOOoo(new o0OoO00O(f, f, f, f));
    }

    public static o00OOOO0 OooO0oO(o00OOOO0 o00oooo1, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return OooO0o(o00oooo1, f, f2);
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0oo(@NotNull o00OOOO0 padding, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return padding.OooOOoo(new o0OoO00O(f, f2, f3, f4));
    }
}
