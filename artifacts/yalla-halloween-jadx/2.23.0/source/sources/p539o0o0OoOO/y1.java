package p539o0o0OoOO;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public final class y1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f55759OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f55760OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f55761OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function1<Color, Color> f55762OooO0Oo;

    public y1() {
        throw null;
    }

    public y1(int i) {
        long jM1706getUnspecified0d7_KjU = Color.INSTANCE.m1706getUnspecified0d7_KjU();
        boolean z = ColorKt.m1722luminance8_81llA(jM1706getUnspecified0d7_KjU) > 0.5f;
        d0.OooO00o transformColorForLightContent = d0.f55510OooO0O0;
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        this.f55759OooO00o = jM1706getUnspecified0d7_KjU;
        this.f55760OooO0O0 = z;
        this.f55761OooO0OO = true;
        this.f55762OooO0Oo = transformColorForLightContent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Color.m1671equalsimpl0(this.f55759OooO00o, y1Var.f55759OooO00o) && this.f55760OooO0O0 == y1Var.f55760OooO0O0 && this.f55761OooO0OO == y1Var.f55761OooO0OO && Intrinsics.areEqual(this.f55762OooO0Oo, y1Var.f55762OooO0Oo);
    }

    public final int hashCode() {
        return (((Color.m1677hashCodeimpl(this.f55759OooO00o) * 31) + (this.f55760OooO0O0 ? 1231 : 1237)) * 31) + (this.f55761OooO0OO ? 1231 : 1237);
    }
}
