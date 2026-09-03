package p023Oooo00O;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Stable;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {
    public static o000O0o OooO00o(o0000O00 animation, RepeatMode repeatMode, int i) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        RepeatMode repeatMode2 = repeatMode;
        long j = (i & 4) != 0 ? 0 : 0L;
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode2, "repeatMode");
        return new o000O0o(animation, repeatMode2, j, null);
    }

    @Stable
    @NotNull
    public static final <T> o000O0O0<T> OooO0O0(@NotNull Function1<? super o000O0O0.OooO0O0<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        o000O0O0.OooO0O0 oooO0O0 = new o000O0O0.OooO0O0();
        init.invoke(oooO0O0);
        return new o000O0O0<>(oooO0O0);
    }

    public static o00O000o OooO0OO(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new o00O000o(f, f2, obj);
    }

    public static o00OO00O OooO0Oo(int i, int i2, o0000oo easing, int i3) {
        if ((i3 & 1) != 0) {
            i = ShopVehicleListModel.VehicleTagType_Vip300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = o0000O0.f1051OooO00o;
        }
        Intrinsics.checkNotNullParameter(easing, "easing");
        return new o00OO00O(i, i2, easing);
    }
}
