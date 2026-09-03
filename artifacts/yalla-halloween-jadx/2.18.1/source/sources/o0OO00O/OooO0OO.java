package o0OO00O;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p418o0Oo0oo.OooOo00;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static final float OooO00o(float f) {
        return Math.signum(f) * ((float) Math.sqrt(Math.abs(f) * 2));
    }

    public static final void OooO0O0(@NotNull OooO0O0 oooO0O0, @NotNull o0Oo0oo event) {
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        List<OooOo00> listOooO0O0 = event.OooO0O0();
        int size = listOooO0O0.size();
        for (int i = 0; i < size; i++) {
            OooOo00 oooOo00 = listOooO0O0.get(i);
            oooO0O0.OooO00o(oooOo00.f39657OooO00o, oooOo00.f39658OooO0O0);
        }
        oooO0O0.OooO00o(event.f39743OooO0O0, event.f39744OooO0OO);
    }
}
