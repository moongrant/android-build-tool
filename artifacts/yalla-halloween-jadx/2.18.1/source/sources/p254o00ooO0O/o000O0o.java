package p254o00ooO0O;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOOO0;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o {
    public static o00OOOO0 OooO00o(o00OOOO0 addAroundCircle, float f, long j, OooOOO0 oooOOO0) {
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        long j2 = OooO.f30392OooO0OO;
        Intrinsics.checkNotNullParameter(addAroundCircle, "$this$addAroundCircle");
        return DrawModifierKt.OooO0OO(addAroundCircle, new o000OO(f, oooOOO0, j, j2));
    }

    public static o00OOOO0 OooO0O0(o00OOOO0 avoidFastClick, boolean z, boolean z2, Function0 function0, Function0 onClick, int i) {
        boolean z3 = (i & 1) != 0 ? true : z;
        boolean z4 = (i & 2) != 0 ? true : z2;
        long j = (i & 4) != 0 ? 500L : 0L;
        boolean z5 = (i & 8) != 0;
        Function0 function1 = (i & 64) != 0 ? null : function0;
        Intrinsics.checkNotNullParameter(avoidFastClick, "$this$avoidFastClick");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return o00OOO0O.OooO0O0(avoidFastClick, new o0000OO0(z4, z3, null, null, function1, null, z5, j, onClick));
    }

    @Composable
    @NotNull
    public static final o00OOOO0 OooO0OO(@NotNull o00OOOO0 o00oooo1, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        ooo00o.OooO0o0(-1896558232);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0 o00oooo0OooO0O0 = o00OOO0O.OooO0O0(o00oooo1, o000O000.f34300Oooo0o);
        ooo00o.Oooo0o0();
        return o00oooo0OooO0O0;
    }
}
