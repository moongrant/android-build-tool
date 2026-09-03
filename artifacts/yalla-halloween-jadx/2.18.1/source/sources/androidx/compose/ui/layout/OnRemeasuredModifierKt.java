package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.o000oOoO;
import o0O0O00.o0000OO0;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    @Stable
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super o000oOoO, Unit> onSizeChanged) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0000OO0(onSizeChanged));
    }
}
