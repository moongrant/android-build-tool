package p587o0oOooOO;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
public final class v0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f56995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f56996OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f56997OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function1<Color, Color> f56998OooO0Oo;

    public v0() {
        throw null;
    }

    public v0(int i) {
        long jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
        boolean z = ColorKt.m1733luminance8_81llA(jM1717getUnspecified0d7_KjU) > 0.5f;
        O0000000.OooO00o transformColorForLightContent = O0000000.f56719OooO0O0;
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        this.f56995OooO00o = jM1717getUnspecified0d7_KjU;
        this.f56996OooO0O0 = z;
        this.f56997OooO0OO = true;
        this.f56998OooO0Oo = transformColorForLightContent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Color.m1682equalsimpl0(this.f56995OooO00o, v0Var.f56995OooO00o) && this.f56996OooO0O0 == v0Var.f56996OooO0O0 && this.f56997OooO0OO == v0Var.f56997OooO0OO && Intrinsics.areEqual(this.f56998OooO0Oo, v0Var.f56998OooO0Oo);
    }

    public final int hashCode() {
        return (((Color.m1688hashCodeimpl(this.f56995OooO00o) * 31) + (this.f56996OooO0O0 ? 1231 : 1237)) * 31) + (this.f56997OooO0OO ? 1231 : 1237);
    }
}
