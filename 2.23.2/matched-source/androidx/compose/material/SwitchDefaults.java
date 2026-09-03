package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwitchDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1213colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, @Nullable Composer composer, int i, int i2, int i3) {
        long jM1726compositeOverOWjLjI;
        long jM1726compositeOverOWjLjI2;
        int i4;
        long jM1726compositeOverOWjLjI3;
        long jM1726compositeOverOWjLjI4;
        composer.startReplaceableGroup(-1032127534);
        long jM1042getSecondaryVariant0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1042getSecondaryVariant0d7_KjU() : j;
        long j9 = (i3 & 2) != 0 ? jM1042getSecondaryVariant0d7_KjU : j2;
        float f3 = (i3 & 4) != 0 ? 0.54f : f;
        long jM1043getSurface0d7_KjU = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1043getSurface0d7_KjU() : j3;
        long jM1038getOnSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1038getOnSurface0d7_KjU() : j4;
        float f4 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            jM1726compositeOverOWjLjI = ColorKt.m1726compositeOverOWjLjI(Color.m1680copywmQWz5c$default(jM1042getSecondaryVariant0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1043getSurface0d7_KjU());
        } else {
            jM1726compositeOverOWjLjI = j5;
        }
        if ((i3 & 128) != 0) {
            jM1726compositeOverOWjLjI2 = ColorKt.m1726compositeOverOWjLjI(Color.m1680copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1043getSurface0d7_KjU());
        } else {
            jM1726compositeOverOWjLjI2 = j6;
        }
        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            i4 = 6;
            jM1726compositeOverOWjLjI3 = ColorKt.m1726compositeOverOWjLjI(Color.m1680copywmQWz5c$default(jM1043getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1043getSurface0d7_KjU());
        } else {
            i4 = 6;
            jM1726compositeOverOWjLjI3 = j7;
        }
        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            jM1726compositeOverOWjLjI4 = ColorKt.m1726compositeOverOWjLjI(Color.m1680copywmQWz5c$default(jM1038getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1043getSurface0d7_KjU());
        } else {
            jM1726compositeOverOWjLjI4 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:320)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(jM1042getSecondaryVariant0d7_KjU, Color.m1680copywmQWz5c$default(j9, f3, 0.0f, 0.0f, 0.0f, 14, null), jM1043getSurface0d7_KjU, Color.m1680copywmQWz5c$default(jM1038getOnSurface0d7_KjU, f4, 0.0f, 0.0f, 0.0f, 14, null), jM1726compositeOverOWjLjI, Color.m1680copywmQWz5c$default(jM1726compositeOverOWjLjI2, f3, 0.0f, 0.0f, 0.0f, 14, null), jM1726compositeOverOWjLjI3, Color.m1680copywmQWz5c$default(jM1726compositeOverOWjLjI4, f4, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
