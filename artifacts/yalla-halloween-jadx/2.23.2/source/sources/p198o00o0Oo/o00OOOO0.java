package p198o00o0Oo;

import androidx.compose.material.OooO;
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
public final class o00OOOO0 implements o00Oo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f39156OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39157OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39158OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39159OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39161OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39162OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f39163OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f39164OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f39165OooOO0;

    public o00OOOO0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f39157OooO00o = j;
        this.f39158OooO0O0 = j2;
        this.f39159OooO0OO = j3;
        this.f39160OooO0Oo = j4;
        this.f39162OooO0o0 = j5;
        this.f39161OooO0o = j6;
        this.f39163OooO0oO = j7;
        this.f39164OooO0oo = j8;
        this.f39156OooO = j9;
        this.f39165OooOO0 = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00OOOO0.class != obj.getClass()) {
            return false;
        }
        o00OOOO0 o00oooo1 = (o00OOOO0) obj;
        return Color.m1682equalsimpl0(this.f39157OooO00o, o00oooo1.f39157OooO00o) && Color.m1682equalsimpl0(this.f39158OooO0O0, o00oooo1.f39158OooO0O0) && Color.m1682equalsimpl0(this.f39159OooO0OO, o00oooo1.f39159OooO0OO) && Color.m1682equalsimpl0(this.f39160OooO0Oo, o00oooo1.f39160OooO0Oo) && Color.m1682equalsimpl0(this.f39162OooO0o0, o00oooo1.f39162OooO0o0) && Color.m1682equalsimpl0(this.f39161OooO0o, o00oooo1.f39161OooO0o) && Color.m1682equalsimpl0(this.f39163OooO0oO, o00oooo1.f39163OooO0oO) && Color.m1682equalsimpl0(this.f39164OooO0oo, o00oooo1.f39164OooO0oo) && Color.m1682equalsimpl0(this.f39156OooO, o00oooo1.f39156OooO) && Color.m1682equalsimpl0(this.f39165OooOO0, o00oooo1.f39165OooOO0);
    }

    public final int hashCode() {
        return Color.m1688hashCodeimpl(this.f39165OooOO0) + OooO.OooO00o(this.f39156OooO, OooO.OooO00o(this.f39164OooO0oo, OooO.OooO00o(this.f39163OooO0oO, OooO.OooO00o(this.f39161OooO0o, OooO.OooO00o(this.f39162OooO0o0, OooO.OooO00o(this.f39160OooO0Oo, OooO.OooO00o(this.f39159OooO0OO, OooO.OooO00o(this.f39158OooO0O0, Color.m1688hashCodeimpl(this.f39157OooO00o) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // p198o00o0Oo.o00Oo00
    @Composable
    @NotNull
    public final State<Color> thumbColor(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-747625769);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747625769, i, -1, "com.code.android.uikit.slider.core.DefaultSliderColors.thumbColor (CustomSlider.kt:1155)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1671boximpl(z ? this.f39157OooO00o : this.f39158OooO0O0), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // p198o00o0Oo.o00Oo00
    @Composable
    @NotNull
    public final State<Color> tickColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-112019088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112019088, i, -1, "com.code.android.uikit.slider.core.DefaultSliderColors.tickColor (CustomSlider.kt:1171)");
        }
        if (z) {
            j = z2 ? this.f39163OooO0oO : this.f39164OooO0oo;
        } else {
            j = z2 ? this.f39156OooO : this.f39165OooOO0;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1671boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // p198o00o0Oo.o00Oo00
    @Composable
    @NotNull
    public final State<Color> trackColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(228590942);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(228590942, i, -1, "com.code.android.uikit.slider.core.DefaultSliderColors.trackColor (CustomSlider.kt:1160)");
        }
        if (z) {
            j = z2 ? this.f39159OooO0OO : this.f39160OooO0Oo;
        } else {
            j = z2 ? this.f39162OooO0o0 : this.f39161OooO0o;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1671boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
