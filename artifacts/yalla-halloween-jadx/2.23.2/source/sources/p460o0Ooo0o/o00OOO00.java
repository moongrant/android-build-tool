package p460o0Ooo0o;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.yalla.yalla.module.media.music.OooOOO;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p363o0OOo00O.OooO0o;
import p363o0OOo00O.OooOo;
import p590o0oOooo0.O0OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @NotNull
    public static final OooO0o f47803OooO00o = new OooO0o(o000O00O.OooO00o());

    public static void OooO00o(String mPath, boolean z, Long l, Long l2, OooOOO oooOOO, int i) {
        boolean z2 = (i & 2) != 0 ? true : z;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 0;
        Long l3 = (i & 8) != 0 ? null : l;
        Long l4 = (i & 16) != 0 ? null : l2;
        OooOOO oooOOO2 = (i & 32) != 0 ? null : oooOOO;
        Intrinsics.checkNotNullParameter(mPath, "mPath");
        OooO0o oooO0o = f47803OooO00o;
        if (oooO0o.isPlaying() && !Intrinsics.areEqual(oooO0o.f43019OooO0oo.f43056OooO00o, mPath)) {
            oooO0o.OooO0o(false);
        }
        String string = O0OO00.OooO00o(mPath).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (l3 == null || l4 == null) {
            OooOo oooOo = new OooOo(string, false, 0L, 0L, 30);
            Intrinsics.checkNotNullParameter(oooOo, "<set-?>");
            oooO0o.f43019OooO0oo = oooOo;
            oooO0o.OooO(string);
            oooO0o.OooO00o(string);
        } else {
            OooOo oooOo2 = new OooOo(string, true, i2, l3.longValue(), l4.longValue());
            Intrinsics.checkNotNullParameter(oooOo2, "<set-?>");
            oooO0o.f43019OooO0oo = oooOo2;
            oooO0o.OooO(string);
            oooO0o.OooO00o(string);
        }
        oooO0o.f43011OooO = new o00OO(oooOOO2);
        if (z2) {
            oooO0o.OooO0oO(1.0f);
        }
    }

    public static void OooO0O0() {
        f47803OooO00o.OooO0o(true);
    }
}
