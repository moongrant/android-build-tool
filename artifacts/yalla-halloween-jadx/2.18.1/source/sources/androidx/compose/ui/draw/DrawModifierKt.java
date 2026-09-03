package androidx.compose.ui.draw;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p191o00o0O.o00oO0o;
import p191o00o0O.o0Oo0oo;
import p442o0OoOo0.Oooo0;
import p442o0OoOo0.o00Oo0;
import p442o0OoOo0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class DrawModifierKt {
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super o0Oo0oo, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new Oooo0(onDraw));
    }

    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull Function1 onBuildDrawCache) {
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(oooO00o, o00oOoo.f6560OooO00o, new o00Oo0(onBuildDrawCache));
    }

    @NotNull
    public static final o00OOOO0 OooO0OO(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super o00oO0o, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new oo000o(onDraw));
    }
}
