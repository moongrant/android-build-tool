package p025Oooo0O0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p418o0Oo0oo.o00Oo0;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO f1353OooO00o = new OooO();

    @Override // p025Oooo0O0.o0000O0
    public final long OooO00o(@NotNull o0000O0O.OooO calculateMouseWheelScroll, @NotNull o00Oo0 event) {
        Intrinsics.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(event, "event");
        List<o0Oo0oo> list = event.f39723OooO00o;
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        o00O0O.OooO oooO = new o00O0O.OooO(o00O0O.OooO.f30392OooO0OO);
        int size = list.size();
        int i = 0;
        while (i < size) {
            o0Oo0oo o0oo0oo2 = list.get(i);
            i++;
            oooO = new o00O0O.OooO(o00O0O.OooO.OooO0oO(oooO.f30395OooO00o, o0oo0oo2.f39741OooO));
        }
        return o00O0O.OooO.OooO0oo(oooO.f30395OooO00o, -calculateMouseWheelScroll.OoooOoo(64));
    }
}
