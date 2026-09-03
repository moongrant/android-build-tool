package Oooo000;

import android.view.ViewConfiguration;
import androidx.compose.runtime.Composable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f998OooO00o = ViewConfiguration.getScrollFriction();

    @Composable
    @NotNull
    public static final p023Oooo00O.o00000OO OooO00o(@Nullable p100o000oOoO.oOO00O ooo00o) {
        ooo00o.OooO0o0(904445851);
        o0000O0O.OooO oooO = (o0000O0O.OooO) ooo00o.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
        Float fValueOf = Float.valueOf(oooO.getDensity());
        ooo00o.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o.Oooo0oo(fValueOf);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
            o00O00O o00o00o2 = new o00O00O(oooO);
            Intrinsics.checkNotNullParameter(o00o00o2, "<this>");
            objOooO0o = new p023Oooo00O.o0000Ooo(o00o00o2);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        p023Oooo00O.o00000OO o00000oo2 = (p023Oooo00O.o00000OO) objOooO0o;
        ooo00o.Oooo0o0();
        return o00000oo2;
    }
}
