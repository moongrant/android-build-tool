package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jo\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)JQ\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010 Jo\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,753:1\n154#2:754\n154#2:755\n154#2:756\n154#2:757\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n370#1:754\n565#1:755\n570#1:756\n575#1:757\n*E\n"})
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;

    @NotNull
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m3765constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m3765constructorimpl(1);
    private static final float LeadingIconSize = Dp.m3765constructorimpl(20);
    private static final float SelectedIconSize = Dp.m3765constructorimpl(18);

    private ChipDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1006chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        long jM1715compositeOverOWjLjI;
        long jM1715compositeOverOWjLjI2;
        long jM1669copywmQWz5c$default;
        long jM1669copywmQWz5c$default2;
        composer.startReplaceableGroup(1838505436);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1715compositeOverOWjLjI = ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(materialTheme.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1027getSurface0d7_KjU());
        } else {
            jM1715compositeOverOWjLjI = j;
        }
        long jM1669copywmQWz5c$default3 = (i2 & 2) != 0 ? Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM1669copywmQWz5c$default4 = (i2 & 4) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM1715compositeOverOWjLjI2 = ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1022getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1027getSurface0d7_KjU());
        } else {
            jM1715compositeOverOWjLjI2 = j4;
        }
        if ((i2 & 16) != 0) {
            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default = j5;
        }
        if ((i2 & 32) != 0) {
            jM1669copywmQWz5c$default2 = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default2 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:384)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(jM1715compositeOverOWjLjI, jM1669copywmQWz5c$default3, jM1669copywmQWz5c$default4, jM1715compositeOverOWjLjI2, jM1669copywmQWz5c$default, jM1669copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1007filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i, int i2) {
        long jM1715compositeOverOWjLjI;
        long jM1715compositeOverOWjLjI2;
        long jM1669copywmQWz5c$default;
        long jM1669copywmQWz5c$default2;
        composer.startReplaceableGroup(830140629);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1715compositeOverOWjLjI = ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(materialTheme.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1027getSurface0d7_KjU());
        } else {
            jM1715compositeOverOWjLjI = j;
        }
        long jM1669copywmQWz5c$default3 = (i2 & 2) != 0 ? Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM1669copywmQWz5c$default4 = (i2 & 4) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM1715compositeOverOWjLjI2 = ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1022getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1027getSurface0d7_KjU());
        } else {
            jM1715compositeOverOWjLjI2 = j4;
        }
        if ((i2 & 16) != 0) {
            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default = j5;
        }
        if ((i2 & 32) != 0) {
            jM1669copywmQWz5c$default2 = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default2 = j6;
        }
        long jM1715compositeOverOWjLjI3 = (i2 & 64) != 0 ? ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM1715compositeOverOWjLjI) : j7;
        long jM1715compositeOverOWjLjI4 = (i2 & 128) != 0 ? ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1669copywmQWz5c$default3) : j8;
        long jM1715compositeOverOWjLjI5 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1669copywmQWz5c$default4) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:454)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM1715compositeOverOWjLjI, jM1669copywmQWz5c$default3, jM1669copywmQWz5c$default4, jM1715compositeOverOWjLjI2, jM1669copywmQWz5c$default, jM1669copywmQWz5c$default2, jM1715compositeOverOWjLjI3, jM1715compositeOverOWjLjI4, jM1715compositeOverOWjLjI5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1008getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1009getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:542)");
        }
        BorderStroke borderStrokeM196BorderStrokecXLIe8U = BorderStrokeKt.m196BorderStrokecXLIe8U(OutlinedBorderSize, Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM196BorderStrokecXLIe8U;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1010getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* JADX INFO: renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1011getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1012outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        long jM1669copywmQWz5c$default;
        long jM1669copywmQWz5c$default2;
        composer.startReplaceableGroup(-1763922662);
        long jM1027getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1027getSurface0d7_KjU() : j;
        long jM1669copywmQWz5c$default3 = (i2 & 2) != 0 ? Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM1669copywmQWz5c$default4 = (i2 & 4) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j7 = (i2 & 8) != 0 ? jM1027getSurface0d7_KjU : j4;
        if ((i2 & 16) != 0) {
            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default = j5;
        }
        if ((i2 & 32) != 0) {
            jM1669copywmQWz5c$default2 = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default2 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:420)");
        }
        ChipColors chipColorsM1006chipColors5tl4gsc = m1006chipColors5tl4gsc(jM1027getSurface0d7_KjU, jM1669copywmQWz5c$default3, jM1669copywmQWz5c$default4, j7, jM1669copywmQWz5c$default, jM1669copywmQWz5c$default2, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColorsM1006chipColors5tl4gsc;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1013outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i, int i2) {
        long jM1669copywmQWz5c$default;
        long jM1669copywmQWz5c$default2;
        composer.startReplaceableGroup(346878099);
        long jM1027getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1027getSurface0d7_KjU() : j;
        long jM1669copywmQWz5c$default3 = (i2 & 2) != 0 ? Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM1669copywmQWz5c$default4 = (i2 & 4) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j10 = (i2 & 8) != 0 ? jM1027getSurface0d7_KjU : j4;
        if ((i2 & 16) != 0) {
            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default = j5;
        }
        if ((i2 & 32) != 0) {
            jM1669copywmQWz5c$default2 = Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1669copywmQWz5c$default2 = j6;
        }
        long jM1715compositeOverOWjLjI = (i2 & 64) != 0 ? ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1027getSurface0d7_KjU) : j7;
        long jM1715compositeOverOWjLjI2 = (i2 & 128) != 0 ? ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1669copywmQWz5c$default3) : j8;
        long jM1715compositeOverOWjLjI3 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1022getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1669copywmQWz5c$default4) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:505)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM1027getSurface0d7_KjU, jM1669copywmQWz5c$default3, jM1669copywmQWz5c$default4, j10, jM1669copywmQWz5c$default, jM1669copywmQWz5c$default2, jM1715compositeOverOWjLjI, jM1715compositeOverOWjLjI2, jM1715compositeOverOWjLjI3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }
}
