package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u008b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n76#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
public final class ColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Colors invoke() {
            return ColorsKt.m1060lightColors2qZNXz8((4095 & 1) != 0 ? ColorKt.Color(4284612846L) : 0L, (4095 & 2) != 0 ? ColorKt.Color(4281794739L) : 0L, (4095 & 4) != 0 ? ColorKt.Color(4278442694L) : 0L, (4095 & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (4095 & 16) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L, (4095 & 32) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L, (4095 & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (4095 & 128) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L, (4095 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Color.INSTANCE.m1707getBlack0d7_KjU() : 0L, (4095 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Color.INSTANCE.m1707getBlack0d7_KjU() : 0L, (4095 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? Color.INSTANCE.m1707getBlack0d7_KjU() : 0L, (4095 & 2048) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L);
        }
    });

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1056contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (Color.m1682equalsimpl0(j, contentColorFor.m1039getPrimary0d7_KjU())) {
            return contentColorFor.m1036getOnPrimary0d7_KjU();
        }
        if (Color.m1682equalsimpl0(j, contentColorFor.m1040getPrimaryVariant0d7_KjU())) {
            return contentColorFor.m1036getOnPrimary0d7_KjU();
        }
        if (Color.m1682equalsimpl0(j, contentColorFor.m1041getSecondary0d7_KjU())) {
            return contentColorFor.m1037getOnSecondary0d7_KjU();
        }
        if (Color.m1682equalsimpl0(j, contentColorFor.m1042getSecondaryVariant0d7_KjU())) {
            return contentColorFor.m1037getOnSecondary0d7_KjU();
        }
        if (Color.m1682equalsimpl0(j, contentColorFor.m1032getBackground0d7_KjU())) {
            return contentColorFor.m1034getOnBackground0d7_KjU();
        }
        if (Color.m1682equalsimpl0(j, contentColorFor.m1043getSurface0d7_KjU())) {
            return contentColorFor.m1038getOnSurface0d7_KjU();
        }
        return Color.m1682equalsimpl0(j, contentColorFor.m1033getError0d7_KjU()) ? contentColorFor.m1035getOnError0d7_KjU() : Color.INSTANCE.m1717getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1057contentColorForek8zF_U(long j, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long jM1056contentColorFor4WTKRHQ = m1056contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (!(jM1056contentColorFor4WTKRHQ != Color.INSTANCE.m1717getUnspecified0d7_KjU())) {
            jM1056contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1056contentColorFor4WTKRHQ;
    }

    @NotNull
    /* JADX INFO: renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1058darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1059darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long jColor = (i & 1) != 0 ? ColorKt.Color(4290479868L) : j;
        long jColor2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long jColor3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        return m1058darkColors2qZNXz8(jColor, jColor2, jColor3, (i & 8) != 0 ? jColor3 : j4, (i & 16) != 0 ? ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? Color.INSTANCE.m1707getBlack0d7_KjU() : j8, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Color.INSTANCE.m1707getBlack0d7_KjU() : j9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : j10, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : j11, (i & 2048) != 0 ? Color.INSTANCE.m1707getBlack0d7_KjU() : j12);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m1039getPrimary0d7_KjU() : colors.m1043getSurface0d7_KjU();
    }

    @NotNull
    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1060lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m1051setPrimary8_81llA$material_release(other.m1039getPrimary0d7_KjU());
        colors.m1052setPrimaryVariant8_81llA$material_release(other.m1040getPrimaryVariant0d7_KjU());
        colors.m1053setSecondary8_81llA$material_release(other.m1041getSecondary0d7_KjU());
        colors.m1054setSecondaryVariant8_81llA$material_release(other.m1042getSecondaryVariant0d7_KjU());
        colors.m1044setBackground8_81llA$material_release(other.m1032getBackground0d7_KjU());
        colors.m1055setSurface8_81llA$material_release(other.m1043getSurface0d7_KjU());
        colors.m1045setError8_81llA$material_release(other.m1033getError0d7_KjU());
        colors.m1048setOnPrimary8_81llA$material_release(other.m1036getOnPrimary0d7_KjU());
        colors.m1049setOnSecondary8_81llA$material_release(other.m1037getOnSecondary0d7_KjU());
        colors.m1046setOnBackground8_81llA$material_release(other.m1034getOnBackground0d7_KjU());
        colors.m1050setOnSurface8_81llA$material_release(other.m1038getOnSurface0d7_KjU());
        colors.m1047setOnError8_81llA$material_release(other.m1035getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
