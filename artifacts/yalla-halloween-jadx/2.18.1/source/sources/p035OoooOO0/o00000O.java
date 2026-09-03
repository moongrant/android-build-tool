package p035OoooOO0;

import kotlin.jvm.internal.Intrinsics;
import o000000.o00O0O;
import o0000O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f3599OooO00o = 10;

    public static final float OooO00o(@NotNull OooO getRippleEndRadius, boolean z, long j) {
        Intrinsics.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float fOooO0O0 = o00O0O.OooO.OooO0O0(OooOO0.OooO00o(OooOo00.OooO0Oo(j), OooOo00.OooO0O0(j))) / 2.0f;
        if (!z) {
            return fOooO0O0;
        }
        return fOooO0O0 + ((o00O0O) getRippleEndRadius).OoooOoo(f3599OooO00o);
    }
}
