package p468o0OoooO0;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.yalla.yalla.module.media.music.OooOOO0;
import kotlin.jvm.internal.Intrinsics;
import o0OOo000.OooO0O0;
import o0OOo000.OooOOO;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00ooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @NotNull
    public static final OooO0O0 f46938OooO00o = new OooO0O0(o000O0.OooO00o());

    public static void OooO00o(String mPath, boolean z, Long l, Long l2, OooOOO0 oooOOO0, int i) {
        boolean z2 = (i & 2) != 0 ? true : z;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 0;
        Long l3 = (i & 8) != 0 ? null : l;
        Long l4 = (i & 16) != 0 ? null : l2;
        OooOOO0 oooOOO1 = (i & 32) != 0 ? null : oooOOO0;
        Intrinsics.checkNotNullParameter(mPath, "mPath");
        OooO0O0 oooO0O0 = f46938OooO00o;
        if (oooO0O0.isPlaying() && !Intrinsics.areEqual(oooO0O0.f43844OooO0oo.f43858OooO00o, mPath)) {
            oooO0O0.OooO0o(true);
        }
        String string = oOo00ooO.OooO00o(mPath).toString();
        Intrinsics.checkNotNullExpressionValue(string, "MediaUtils.getUriFormPath(mPath).toString()");
        if (l3 == null || l4 == null) {
            oooO0O0.OooO0O0(new OooOOO(string, false, 0L, 0L, 30));
            oooO0O0.OooO(string);
            oooO0O0.OooO00o(string);
        } else {
            oooO0O0.OooO0O0(new OooOOO(string, true, i2, l3.longValue(), l4.longValue()));
            oooO0O0.OooO(string);
            oooO0O0.OooO00o(string);
        }
        oooO0O0.f43836OooO = new o0OOOO0o(oooOOO1);
        if (z2) {
            oooO0O0.OooO0oO(1.0f);
        }
    }

    public static void OooO0O0() {
        f46938OooO00o.OooO0o(true);
    }
}
