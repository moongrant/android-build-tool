package androidx.compose.ui.layout;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO0O0;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o00oO0o;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutModifierKt {
    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function3<? super o00000O0, ? super o0O0O00, ? super OooO0O0, ? extends o000000O> measure) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(measure, "measure");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o00oO0o(measure));
    }
}
