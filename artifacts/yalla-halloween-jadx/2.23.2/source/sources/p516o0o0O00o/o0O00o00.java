package p516o0o0O00o;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.material.TabPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,326:1\n51#2:327\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/TabPosition\n*L\n144#1:327\n*E\n"})
public final class o0O00o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f51521OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f51522OooO0O0;

    public o0O00o00(float f, float f2) {
        this.f51521OooO00o = f;
        this.f51522OooO0O0 = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m3780equalsimpl0(this.f51521OooO00o, tabPosition.getLeft()) && Dp.m3780equalsimpl0(this.f51522OooO0O0, tabPosition.getWidth());
    }

    public final int hashCode() {
        return Dp.m3781hashCodeimpl(this.f51522OooO0O0) + (Dp.m3781hashCodeimpl(this.f51521OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        float f = this.f51521OooO00o;
        String strM3786toStringimpl = Dp.m3786toStringimpl(f);
        float f2 = this.f51522OooO0O0;
        String strM3786toStringimpl2 = Dp.m3786toStringimpl(Dp.m3775constructorimpl(f + f2));
        return o0oOO.OooO0O0(OooO0OO.OooO00o("TabPosition(left=", strM3786toStringimpl, ", right=", strM3786toStringimpl2, ", width="), Dp.m3786toStringimpl(f2), ")");
    }
}
