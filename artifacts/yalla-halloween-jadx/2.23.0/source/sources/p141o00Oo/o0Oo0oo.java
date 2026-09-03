package p141o00Oo;

import androidx.compose.material.OooOO0O;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class o0Oo0oo implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f37562OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f37563OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f37564OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f37565OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f37566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f37567OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f37568OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f37569OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f37570OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f37571OooOO0;

    public o0Oo0oo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f37563OooO00o = j;
        this.f37564OooO0O0 = j2;
        this.f37565OooO0OO = j3;
        this.f37566OooO0Oo = j4;
        this.f37568OooO0o0 = j5;
        this.f37567OooO0o = j6;
        this.f37569OooO0oO = j7;
        this.f37570OooO0oo = j8;
        this.f37562OooO = j9;
        this.f37571OooOO0 = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0Oo0oo.class != obj.getClass()) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return Color.m1671equalsimpl0(this.f37563OooO00o, o0oo0oo2.f37563OooO00o) && Color.m1671equalsimpl0(this.f37564OooO0O0, o0oo0oo2.f37564OooO0O0) && Color.m1671equalsimpl0(this.f37565OooO0OO, o0oo0oo2.f37565OooO0OO) && Color.m1671equalsimpl0(this.f37566OooO0Oo, o0oo0oo2.f37566OooO0Oo) && Color.m1671equalsimpl0(this.f37568OooO0o0, o0oo0oo2.f37568OooO0o0) && Color.m1671equalsimpl0(this.f37567OooO0o, o0oo0oo2.f37567OooO0o) && Color.m1671equalsimpl0(this.f37569OooO0oO, o0oo0oo2.f37569OooO0oO) && Color.m1671equalsimpl0(this.f37570OooO0oo, o0oo0oo2.f37570OooO0oo) && Color.m1671equalsimpl0(this.f37562OooO, o0oo0oo2.f37562OooO) && Color.m1671equalsimpl0(this.f37571OooOO0, o0oo0oo2.f37571OooOO0);
    }

    public final int hashCode() {
        return Color.m1677hashCodeimpl(this.f37571OooOO0) + OooOO0O.OooO0O0(this.f37562OooO, OooOO0O.OooO0O0(this.f37570OooO0oo, OooOO0O.OooO0O0(this.f37569OooO0oO, OooOO0O.OooO0O0(this.f37567OooO0o, OooOO0O.OooO0O0(this.f37568OooO0o0, OooOO0O.OooO0O0(this.f37566OooO0Oo, OooOO0O.OooO0O0(this.f37565OooO0OO, OooOO0O.OooO0O0(this.f37564OooO0O0, Color.m1677hashCodeimpl(this.f37563OooO00o) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // p141o00Oo.oo0o0Oo
    @Composable
    @NotNull
    public final State<Color> thumbColor(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-747625769);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747625769, i, -1, "com.code.android.uikit.slider.core.DefaultSliderColors.thumbColor (CustomSlider.kt:1155)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1660boximpl(z ? this.f37563OooO00o : this.f37564OooO0O0), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // p141o00Oo.oo0o0Oo
    @Composable
    @NotNull
    public final State<Color> tickColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-112019088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112019088, i, -1, "com.code.android.uikit.slider.core.DefaultSliderColors.tickColor (CustomSlider.kt:1171)");
        }
        if (z) {
            j = z2 ? this.f37569OooO0oO : this.f37570OooO0oo;
        } else {
            j = z2 ? this.f37562OooO : this.f37571OooOO0;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1660boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // p141o00Oo.oo0o0Oo
    @Composable
    @NotNull
    public final State<Color> trackColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(228590942);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(228590942, i, -1, "com.code.android.uikit.slider.core.DefaultSliderColors.trackColor (CustomSlider.kt:1160)");
        }
        if (z) {
            j = z2 ? this.f37565OooO0OO : this.f37566OooO0Oo;
        } else {
            j = z2 ? this.f37568OooO0o0 : this.f37567OooO0o;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1660boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
