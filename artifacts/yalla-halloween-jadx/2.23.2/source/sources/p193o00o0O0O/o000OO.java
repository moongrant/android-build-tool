package p193o00o0O0O;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements RippleTheme {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OO f38642OooO00o = new o000OO();

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* JADX INFO: renamed from: defaultColor-WaAFU9c */
    public final long mo1124defaultColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1289684327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1289684327, i, -1, "com.code.android.theme.YLRippleTheme.defaultColor (Themes.kt:35)");
        }
        long jM1290defaultRippleColor5vOe2sY = RippleTheme.INSTANCE.m1290defaultRippleColor5vOe2sY(o0000oo.OooO0OO(composer).f38616OooO, true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM1290defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @NotNull
    public final RippleAlpha rippleAlpha(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-507564236);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507564236, i, -1, "com.code.android.theme.YLRippleTheme.rippleAlpha (Themes.kt:38)");
        }
        RippleAlpha rippleAlpha = new RippleAlpha(0.07f, 0.07f, 0.07f, 0.07f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleAlpha;
    }
}
