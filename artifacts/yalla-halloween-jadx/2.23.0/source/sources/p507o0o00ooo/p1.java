package p507o0o00ooo;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.material.TabPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,326:1\n51#2:327\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/TabPosition\n*L\n144#1:327\n*E\n"})
public final class p1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f50173OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f50174OooO0O0;

    public p1(float f, float f2) {
        this.f50173OooO00o = f;
        this.f50174OooO0O0 = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m3770equalsimpl0(this.f50173OooO00o, tabPosition.getLeft()) && Dp.m3770equalsimpl0(this.f50174OooO0O0, tabPosition.getWidth());
    }

    public final int hashCode() {
        return Dp.m3771hashCodeimpl(this.f50174OooO0O0) + (Dp.m3771hashCodeimpl(this.f50173OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        float f = this.f50173OooO00o;
        String strM3776toStringimpl = Dp.m3776toStringimpl(f);
        float f2 = this.f50174OooO0O0;
        String strM3776toStringimpl2 = Dp.m3776toStringimpl(Dp.m3765constructorimpl(f + f2));
        return o0O00o0.OooO0O0(OooO0o.OooO0OO("TabPosition(left=", strM3776toStringimpl, ", right=", strM3776toStringimpl2, ", width="), Dp.m3776toStringimpl(f2), ")");
    }
}
