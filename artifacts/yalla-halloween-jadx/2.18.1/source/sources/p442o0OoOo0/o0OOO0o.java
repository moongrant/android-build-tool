package p442o0OoOo0;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.OooOO0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p145o00Oo0.o00000O;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {
    public static o00OOOO0 OooO00o(o00OOOO0 o00oooo1, o000OO0O painter, o00OO0O0 o00oo0o1, OooOO0 oooOO1, float f, o00000O o00000o, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            o00oo0o1 = o00OO0O0.OooO00o.f4175OooO0o;
        }
        o00OO0O0 alignment = o00oo0o1;
        if ((i & 8) != 0) {
            oooOO1 = OooOO0.OooO00o.f35241OooO0o;
        }
        OooOO0 contentScale = oooOO1;
        float f2 = (i & 16) != 0 ? 1.0f : f;
        if ((i & 32) != 0) {
            o00000o = null;
        }
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0ooOOo(painter, z, alignment, contentScale, f2, o00000o));
    }
}
