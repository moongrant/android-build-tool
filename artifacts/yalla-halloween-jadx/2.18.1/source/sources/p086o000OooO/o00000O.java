package p086o000OooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {
    @NotNull
    public static final o00000 OooO00o(@NotNull Function1<? super o00000O0, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        o00000O0 o00000o1 = new o00000O0();
        optionsBuilder.invoke(o00000o1);
        o00000.OooO00o oooO00o = o00000o1.f28428OooO00o;
        oooO00o.f28419OooO00o = o00000o1.f28429OooO0O0;
        oooO00o.f28420OooO0O0 = false;
        String str = o00000o1.f28431OooO0Oo;
        if (str != null) {
            boolean z = o00000o1.f28432OooO0o0;
            oooO00o.f28422OooO0Oo = str;
            oooO00o.f28421OooO0OO = -1;
            oooO00o.f28424OooO0o0 = false;
            oooO00o.f28423OooO0o = z;
        } else {
            int i = o00000o1.f28430OooO0OO;
            boolean z2 = o00000o1.f28432OooO0o0;
            oooO00o.f28421OooO0OO = i;
            oooO00o.f28422OooO0Oo = null;
            oooO00o.f28424OooO0o0 = false;
            oooO00o.f28423OooO0o = z2;
        }
        return oooO00o.OooO00o();
    }
}
