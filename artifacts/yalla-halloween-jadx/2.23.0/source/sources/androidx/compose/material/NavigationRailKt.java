package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0091\u0001\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u001d2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a=\u0010*\u001a\u00020\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\u0006\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010,\u001aU\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a)\u00105\u001a\u000206*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a9\u0010>\u001a\u000206*\u0002072\u0006\u0010?\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010+\u001a\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", "label", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,405:1\n25#2:406\n460#2,13:432\n473#2,3:446\n456#2,11:467\n460#2,13:497\n473#2,3:511\n460#2,13:535\n473#2,3:549\n467#2,3:554\n1114#3,6:407\n76#4:413\n76#4:420\n76#4:455\n76#4:485\n76#4:523\n68#5,5:414\n73#5:445\n77#5:450\n67#5,6:478\n73#5:510\n77#5:515\n67#5,6:516\n73#5:548\n77#5:553\n75#6:419\n76#6,11:421\n89#6:449\n71#6,4:451\n75#6,11:456\n75#6:484\n76#6,11:486\n89#6:514\n75#6:522\n76#6,11:524\n89#6:552\n88#6:557\n76#7:558\n154#8:559\n154#8:560\n154#8:561\n154#8:562\n154#8:563\n154#8:564\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n155#1:406\n176#1:432,13\n176#1:446,3\n265#1:467,11\n267#1:497,13\n267#1:511,3\n269#1:535,13\n269#1:549,3\n265#1:554,3\n155#1:407,6\n157#1:413\n176#1:420\n265#1:455\n267#1:485\n269#1:523\n176#1:414,5\n176#1:445\n176#1:450\n267#1:478,6\n267#1:510\n267#1:515\n269#1:516,6\n269#1:548\n269#1:553\n176#1:419\n176#1:421,11\n176#1:449\n265#1:451,4\n265#1:456,11\n267#1:484\n267#1:486,11\n267#1:514\n269#1:522\n269#1:524,11\n269#1:552\n265#1:557\n233#1:558\n379#1:559\n384#1:560\n389#1:561\n395#1:562\n400#1:563\n405#1:564\n*E\n"})
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;

    @NotNull
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m3765constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m3765constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m3765constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m3765constructorimpl(14);

    static {
        float f = 8;
        NavigationRailPadding = Dp.m3765constructorimpl(f);
        HeaderPadding = Dp.m3765constructorimpl(f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x016f  */
    /* JADX WARN: Code duplicated, block: B:109:0x017c  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed A[PHI: r0 r4 r5 r10 r12
      0x00ed: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v12 androidx.compose.ui.Modifier) binds: [B:97:0x0121, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r4v20 int) = (r4v15 int), (r4v22 int) binds: [B:97:0x0121, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:97:0x0121, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r10v10 long) = (r10v2 long), (r10v1 long) binds: [B:97:0x0121, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r12v14 float) = (r12v3 float), (r12v2 float) binds: [B:97:0x0121, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    public static final void m1122NavigationRailHsRjFd4(@Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM1027getSurface0d7_KjU;
        long j3;
        float fM1121getElevationD9Ej5fM;
        int i4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4;
        int i5;
        int i6;
        Modifier modifier3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5;
        long j4;
        final int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1790971523);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                jM1027getSurface0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM1027getSurface0d7_KjU) ? 32 : 16;
                i3 |= i9;
            } else {
                jM1027getSurface0d7_KjU = j;
            }
            i3 |= i9;
        } else {
            jM1027getSurface0d7_KjU = j;
        }
        if ((i & 896) == 0) {
            j3 = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j3)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            j3 = j2;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 7168) == 0) {
                fM1121getElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM1121getElevationD9Ej5fM) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            }
                            if ((i2 & 4) != 0) {
                                long jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                                j3 = jM1041contentColorForek8zF_U;
                            }
                            if (i10 != 0) {
                                fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                function5 = null;
                                j4 = j3;
                            }
                            i7 = i3;
                            float f2 = fM1121getElevationD9Ej5fM;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                            }
                            int i11 = i7 << 3;
                            SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1571506489, i12, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i13 = i7;
                                    Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                                    composer2.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(65525382);
                                    if (function6 != null) {
                                        function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                                        SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                                    }
                                    composer2.endReplaceableGroup();
                                    function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i13 >> 12) & 112)));
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i11 & 896) | (i11 & 7168) | ((i7 << 6) & 458752), 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j3 = j4;
                            fM1121getElevationD9Ej5fM = f2;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier3 = modifier2;
                        }
                        j4 = j3;
                        function5 = function4;
                        i7 = i3;
                        float f3 = fM1121getElevationD9Ej5fM;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                        }
                        int i12 = i7 << 3;
                        SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i13) {
                                if ((i13 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1571506489, i13, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i14 = i7;
                                Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                                composer2.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(65525382);
                                if (function6 != null) {
                                    function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i14 >> 9) & 112) | 6));
                                    SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                                }
                                composer2.endReplaceableGroup();
                                function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i14 >> 12) & 112)));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i7 << 6) & 458752), 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = j4;
                        fM1121getElevationD9Ej5fM = f3;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = modifier2;
                    final long j5 = jM1027getSurface0d7_KjU;
                    final long j6 = j3;
                    final float f4 = fM1121getElevationD9Ej5fM;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i13) {
                            NavigationRailKt.m1122NavigationRailHsRjFd4(modifier4, j5, j6, f4, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i6 = 196608;
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U2 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U2;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U3 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U3;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    }
                    i7 = i3;
                    float f5 = fM1121getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i13 = i7 << 3;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i14) {
                            if ((i14 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571506489, i14, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i15 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i15 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i15 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i13 & 896) | (i13 & 7168) | ((i7 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    fM1121getElevationD9Ej5fM = f5;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U4 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U4;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U5 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U5;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    }
                    i7 = i3;
                    float f6 = fM1121getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i14 = i7 << 3;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i15) {
                            if ((i15 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571506489, i15, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i16 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i16 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i16 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i14 & 896) | (i14 & 7168) | ((i7 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    fM1121getElevationD9Ej5fM = f6;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier2;
                final long j7 = jM1027getSurface0d7_KjU;
                final long j8 = j3;
                final float f7 = fM1121getElevationD9Ej5fM;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        NavigationRailKt.m1122NavigationRailHsRjFd4(modifier5, j7, j8, f7, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function4 = function3;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U6 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U6;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U7 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U7;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    }
                    i7 = i3;
                    float f8 = fM1121getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i15 = i7 << 3;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i16) {
                            if ((i16 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571506489, i16, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i17 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i17 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i17 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i15 & 896) | (i15 & 7168) | ((i7 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    fM1121getElevationD9Ej5fM = f8;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U8 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U8;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U9 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U9;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    }
                    i7 = i3;
                    float f9 = fM1121getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i16 = i7 << 3;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i17) {
                            if ((i17 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571506489, i17, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i18 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i18 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i18 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i16 & 896) | (i16 & 7168) | ((i7 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    fM1121getElevationD9Ej5fM = f9;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier2;
                final long j9 = jM1027getSurface0d7_KjU;
                final long j10 = j3;
                final float f10 = fM1121getElevationD9Ej5fM;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i17) {
                        NavigationRailKt.m1122NavigationRailHsRjFd4(modifier6, j9, j10, f10, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i6 = 196608;
            i3 |= i6;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U10 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U10;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U11 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U11;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                }
                i7 = i3;
                float f11 = fM1121getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i17 = i7 << 3;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i18) {
                        if ((i18 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1571506489, i18, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i19 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i19 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i19 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i17 & 896) | (i17 & 7168) | ((i7 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
                fM1121getElevationD9Ej5fM = f11;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U12 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U12;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U13 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U13;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                }
                i7 = i3;
                float f12 = fM1121getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i18 = i7 << 3;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i19) {
                        if ((i19 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1571506489, i19, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i110 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i110 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i110 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i18 & 896) | (i18 & 7168) | ((i7 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
                fM1121getElevationD9Ej5fM = f12;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier2;
            final long j11 = jM1027getSurface0d7_KjU;
            final long j12 = j3;
            final float f13 = fM1121getElevationD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i19) {
                    NavigationRailKt.m1122NavigationRailHsRjFd4(modifier7, j11, j12, f13, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        fM1121getElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U14 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U14;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U15 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U15;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    }
                    i7 = i3;
                    float f14 = fM1121getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i19 = i7 << 3;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i110) {
                            if ((i110 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571506489, i110, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i111 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i111 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i111 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i19 & 896) | (i19 & 7168) | ((i7 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    fM1121getElevationD9Ej5fM = f14;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U16 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U16;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U17 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U17;
                        }
                        if (i10 != 0) {
                            fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            function5 = null;
                            j4 = j3;
                        } else {
                            j4 = j3;
                            function5 = function4;
                        }
                    }
                    i7 = i3;
                    float f15 = fM1121getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i110 = i7 << 3;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i111) {
                            if ((i111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571506489, i111, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i112 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i112 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i112 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i110 & 896) | (i110 & 7168) | ((i7 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    fM1121getElevationD9Ej5fM = f15;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier2;
                final long j13 = jM1027getSurface0d7_KjU;
                final long j14 = j3;
                final float f16 = fM1121getElevationD9Ej5fM;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i111) {
                        NavigationRailKt.m1122NavigationRailHsRjFd4(modifier8, j13, j14, f16, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i6 = 196608;
            i3 |= i6;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U18 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U18;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U19 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U19;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                }
                i7 = i3;
                float f17 = fM1121getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i111 = i7 << 3;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i112) {
                        if ((i112 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1571506489, i112, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i113 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i113 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i113 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i111 & 896) | (i111 & 7168) | ((i7 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
                fM1121getElevationD9Ej5fM = f17;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U110 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U110;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U111 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U111;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                }
                i7 = i3;
                float f18 = fM1121getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i112 = i7 << 3;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i113) {
                        if ((i113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1571506489, i113, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i114 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i114 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i114 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i112 & 896) | (i112 & 7168) | ((i7 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
                fM1121getElevationD9Ej5fM = f18;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier2;
            final long j15 = jM1027getSurface0d7_KjU;
            final long j16 = j3;
            final float f19 = fM1121getElevationD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i113) {
                    NavigationRailKt.m1122NavigationRailHsRjFd4(modifier9, j15, j16, f19, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        function4 = function3;
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U112 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U112;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U113 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U113;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                }
                i7 = i3;
                float f110 = fM1121getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i113 = i7 << 3;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i114) {
                        if ((i114 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1571506489, i114, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i115 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i115 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i115 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i113 & 896) | (i113 & 7168) | ((i7 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
                fM1121getElevationD9Ej5fM = f110;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U114 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U114;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U115 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U115;
                    }
                    if (i10 != 0) {
                        fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        function5 = null;
                        j4 = j3;
                    } else {
                        j4 = j3;
                        function5 = function4;
                    }
                }
                i7 = i3;
                float f111 = fM1121getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i114 = i7 << 3;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i115) {
                        if ((i115 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1571506489, i115, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i116 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i116 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i116 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i114 & 896) | (i114 & 7168) | ((i7 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
                fM1121getElevationD9Ej5fM = f111;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier2;
            final long j17 = jM1027getSurface0d7_KjU;
            final long j18 = j3;
            final float f112 = fM1121getElevationD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i115) {
                    NavigationRailKt.m1122NavigationRailHsRjFd4(modifier10, j17, j18, f112, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i6 = 196608;
        i3 |= i6;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U116 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U116;
                }
                if (i10 != 0) {
                    fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    function5 = null;
                    j4 = j3;
                } else {
                    j4 = j3;
                    function5 = function4;
                }
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U117 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U117;
                }
                if (i10 != 0) {
                    fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    function5 = null;
                    j4 = j3;
                } else {
                    j4 = j3;
                    function5 = function4;
                }
            }
            i7 = i3;
            float f113 = fM1121getElevationD9Ej5fM;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
            }
            int i115 = i7 << 3;
            SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i116) {
                    if ((i116 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1571506489, i116, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                    int i117 = i7;
                    Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(65525382);
                    if (function6 != null) {
                        function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i117 >> 9) & 112) | 6));
                        SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i117 >> 12) & 112)));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i115 & 896) | (i115 & 7168) | ((i7 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j4;
            fM1121getElevationD9Ej5fM = f113;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U118 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U118;
                }
                if (i10 != 0) {
                    fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    function5 = null;
                    j4 = j3;
                } else {
                    j4 = j3;
                    function5 = function4;
                }
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U119 = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U119;
                }
                if (i10 != 0) {
                    fM1121getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1121getElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    function5 = null;
                    j4 = j3;
                } else {
                    j4 = j3;
                    function5 = function4;
                }
            }
            i7 = i3;
            float f114 = fM1121getElevationD9Ej5fM;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
            }
            int i116 = i7 << 3;
            SurfaceKt.m1185SurfaceFjzlyU(modifier3, null, jM1027getSurface0d7_KjU, j4, null, f114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i117) {
                    if ((i117 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1571506489, i117, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                    int i118 = i7;
                    Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(65525382);
                    if (function6 != null) {
                        function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i118 >> 9) & 112) | 6));
                        SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function7.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i118 >> 12) & 112)));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i7 & 14) | 1572864 | (i116 & 896) | (i116 & 7168) | ((i7 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j4;
            fM1121getElevationD9Ej5fM = f114;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier2;
        final long j19 = jM1027getSurface0d7_KjU;
        final long j110 = j3;
        final float f115 = fM1121getElevationD9Ej5fM;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i117) {
                NavigationRailKt.m1122NavigationRailHsRjFd4(modifier11, j19, j110, f115, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:127:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0190  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x0206  */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:154:0x021c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0229  */
    /* JADX WARN: Code duplicated, block: B:157:0x022c  */
    /* JADX WARN: Code duplicated, block: B:158:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:168:0x0315  */
    /* JADX WARN: Code duplicated, block: B:173:0x032e  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    public static final void m1123NavigationRailItem0S3VyRs(final boolean z, @NotNull final Function0<Unit> onClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, @Nullable MutableInteractionSource mutableInteractionSource, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function3;
        int i7;
        int i8;
        final boolean z5;
        int i9;
        int i10;
        int i11;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        long jM1023getPrimary0d7_KjU;
        long jM1669copywmQWz5c$default;
        Object objRememberedValue;
        final ComposableLambda composableLambda;
        float f;
        Function0<ComposeUiNode> constructor;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        final long j3;
        final boolean z7;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1813548445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(icon) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((458752 & i) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((3670016 & i) == 0) {
                            z5 = z3;
                            if (composerStartRestartGroup.changed(z5)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        if ((i & 234881024) != 0) {
                            i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                        }
                        if ((i & 1879048192) != 0) {
                            i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                        }
                        if ((i3 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function3 = null;
                                }
                                if (i8 != 0) {
                                    z5 = true;
                                }
                                if (i10 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                    i3 &= -234881025;
                                } else {
                                    jM1023getPrimary0d7_KjU = j;
                                }
                                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                    i3 &= -1879048193;
                                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                } else {
                                    jM1669copywmQWz5c$default = j2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    i3 &= -234881025;
                                }
                                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                    i3 &= -1879048193;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                jM1669copywmQWz5c$default = j2;
                                modifier3 = modifier2;
                                jM1023getPrimary0d7_KjU = j;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                            }
                            if (function3 != null) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i13) {
                                        if ((i13 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-180398615, i13, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                        }
                                        TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                        TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                            } else {
                                composableLambda = null;
                            }
                            if (function3 == null) {
                                f = NavigationRailItemCompactSize;
                            } else {
                                f = NavigationRailItemSize;
                            }
                            Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Modifier modifier5 = modifier3;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM523size3ABfNKs);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerStartRestartGroup.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                    invoke(f2.floatValue(), composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(float f2, @Nullable Composer composer2, int i13) {
                                    int i14;
                                    if ((i13 & 14) == 0) {
                                        i14 = (composer2.changed(f2) ? 4 : 2) | i13;
                                    } else {
                                        i14 = i13;
                                    }
                                    if ((i14 & 91) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(670576792, i13, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                    }
                                    if (z5) {
                                        f2 = 1.0f;
                                    }
                                    NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i13 = i3 >> 24;
                            m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda2, composerStartRestartGroup, (i13 & 112) | (i13 & 14) | 3072 | ((i3 << 6) & 896));
                            if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            boolean z8 = z4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z6 = z8;
                            long j5 = jM1023getPrimary0d7_KjU;
                            function4 = function3;
                            j3 = j5;
                            z7 = z5;
                            j4 = jM1669copywmQWz5c$default;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z6 = z4;
                            function4 = function3;
                            z7 = z5;
                            mutableInteractionSource3 = mutableInteractionSource;
                            j3 = j;
                            j4 = j2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i14) {
                                NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= 1572864;
                    z5 = z3;
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) != 0) {
                        i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                    }
                    if ((i & 1879048192) != 0) {
                        i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i3 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    if ((i14 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i14, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs2 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier6 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        Density density2 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM523size3ABfNKs2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i14) {
                                int i15;
                                if ((i14 & 14) == 0) {
                                    i15 = (composer2.changed(f2) ? 4 : 2) | i14;
                                } else {
                                    i15 = i14;
                                }
                                if ((i15 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i14, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i14 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda3, composerStartRestartGroup, (i14 & 112) | (i14 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier6;
                        boolean z9 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z9;
                        long j6 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j6;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    if ((i15 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i15, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs3 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier7 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        Density density3 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM523size3ABfNKs3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i15) {
                                int i16;
                                if ((i15 & 14) == 0) {
                                    i16 = (composer2.changed(f2) ? 4 : 2) | i15;
                                } else {
                                    i16 = i15;
                                }
                                if ((i16 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i15, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i15 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda4, composerStartRestartGroup, (i15 & 112) | (i15 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier7;
                        boolean z10 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z10;
                        long j7 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j7;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i16) {
                            NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 196608;
                function3 = function2;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        z5 = z3;
                        if (composerStartRestartGroup.changed(z5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) != 0) {
                        i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                    }
                    if ((i & 1879048192) != 0) {
                        i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i3 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i16) {
                                    if ((i16 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i16, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs4 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier8 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        Density density4 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM523size3ABfNKs4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf4, OooO0OO.OooO00o(companion4, composerM1309constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl4, density4, composerM1309constructorimpl4, layoutDirection4, composerM1309constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i16) {
                                int i17;
                                if ((i16 & 14) == 0) {
                                    i17 = (composer2.changed(f2) ? 4 : 2) | i16;
                                } else {
                                    i17 = i16;
                                }
                                if ((i17 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i16, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i16 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda5, composerStartRestartGroup, (i16 & 112) | (i16 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier8;
                        boolean z11 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z11;
                        long j8 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j8;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i17) {
                                    if ((i17 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i17, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs5 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier9 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        Density density5 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM523size3ABfNKs5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf5, OooO0OO.OooO00o(companion5, composerM1309constructorimpl5, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl5, density5, composerM1309constructorimpl5, layoutDirection5, composerM1309constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i17) {
                                int i18;
                                if ((i17 & 14) == 0) {
                                    i18 = (composer2.changed(f2) ? 4 : 2) | i17;
                                } else {
                                    i18 = i17;
                                }
                                if ((i18 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i17, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i17 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda6, composerStartRestartGroup, (i17 & 112) | (i17 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier9;
                        boolean z12 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z12;
                        long j9 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j9;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i18) {
                            NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 1572864;
                z5 = z3;
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) != 0) {
                    i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                }
                if ((i & 1879048192) != 0) {
                    i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i18) {
                                if ((i18 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i18, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs6 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier10 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    Density density6 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM523size3ABfNKs6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf6, OooO0OO.OooO00o(companion6, composerM1309constructorimpl6, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl6, density6, composerM1309constructorimpl6, layoutDirection6, composerM1309constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i18) {
                            int i19;
                            if ((i18 & 14) == 0) {
                                i19 = (composer2.changed(f2) ? 4 : 2) | i18;
                            } else {
                                i19 = i18;
                            }
                            if ((i19 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i18, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i18 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda7, composerStartRestartGroup, (i18 & 112) | (i18 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier10;
                    boolean z13 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z13;
                    long j10 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j10;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i19) {
                                if ((i19 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i19, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs7 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier11 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    Density density7 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM523size3ABfNKs7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl7 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf7, OooO0OO.OooO00o(companion7, composerM1309constructorimpl7, measurePolicyRememberBoxMeasurePolicy7, composerM1309constructorimpl7, density7, composerM1309constructorimpl7, layoutDirection7, composerM1309constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i19) {
                            int i110;
                            if ((i19 & 14) == 0) {
                                i110 = (composer2.changed(f2) ? 4 : 2) | i19;
                            } else {
                                i110 = i19;
                            }
                            if ((i110 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i19, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i19 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda8, composerStartRestartGroup, (i19 & 112) | (i19 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier11;
                    boolean z14 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z14;
                    long j11 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j11;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i110) {
                        NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        z5 = z3;
                        if (composerStartRestartGroup.changed(z5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) != 0) {
                        i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                    }
                    if ((i & 1879048192) != 0) {
                        i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i3 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i110) {
                                    if ((i110 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i110, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs8 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier12 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        Density density8 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierM523size3ABfNKs8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl8 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf8, OooO0OO.OooO00o(companion8, composerM1309constructorimpl8, measurePolicyRememberBoxMeasurePolicy8, composerM1309constructorimpl8, density8, composerM1309constructorimpl8, layoutDirection8, composerM1309constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i110) {
                                int i111;
                                if ((i110 & 14) == 0) {
                                    i111 = (composer2.changed(f2) ? 4 : 2) | i110;
                                } else {
                                    i111 = i110;
                                }
                                if ((i111 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i110, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i110 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda9, composerStartRestartGroup, (i110 & 112) | (i110 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier12;
                        boolean z15 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z15;
                        long j12 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j12;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i111) {
                                    if ((i111 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i111, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs9 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier13 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        Density density9 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM523size3ABfNKs9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl9 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf9, OooO0OO.OooO00o(companion9, composerM1309constructorimpl9, measurePolicyRememberBoxMeasurePolicy9, composerM1309constructorimpl9, density9, composerM1309constructorimpl9, layoutDirection9, composerM1309constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i111) {
                                int i112;
                                if ((i111 & 14) == 0) {
                                    i112 = (composer2.changed(f2) ? 4 : 2) | i111;
                                } else {
                                    i112 = i111;
                                }
                                if ((i112 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i111, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i111 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda10, composerStartRestartGroup, (i111 & 112) | (i111 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier13;
                        boolean z16 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z16;
                        long j13 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j13;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i112) {
                            NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 1572864;
                z5 = z3;
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) != 0) {
                    i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                }
                if ((i & 1879048192) != 0) {
                    i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i112) {
                                if ((i112 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i112, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs10 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier14 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    Density density10 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM523size3ABfNKs10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl10 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf10, OooO0OO.OooO00o(companion10, composerM1309constructorimpl10, measurePolicyRememberBoxMeasurePolicy10, composerM1309constructorimpl10, density10, composerM1309constructorimpl10, layoutDirection10, composerM1309constructorimpl10, viewConfiguration10, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i112) {
                            int i113;
                            if ((i112 & 14) == 0) {
                                i113 = (composer2.changed(f2) ? 4 : 2) | i112;
                            } else {
                                i113 = i112;
                            }
                            if ((i113 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i112, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i112 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda11, composerStartRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier14;
                    boolean z17 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z17;
                    long j14 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j14;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i113) {
                                if ((i113 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i113, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs11 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier15 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    Density density11 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM523size3ABfNKs11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl11 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf11, OooO0OO.OooO00o(companion11, composerM1309constructorimpl11, measurePolicyRememberBoxMeasurePolicy11, composerM1309constructorimpl11, density11, composerM1309constructorimpl11, layoutDirection11, composerM1309constructorimpl11, viewConfiguration11, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i113) {
                            int i114;
                            if ((i113 & 14) == 0) {
                                i114 = (composer2.changed(f2) ? 4 : 2) | i113;
                            } else {
                                i114 = i113;
                            }
                            if ((i114 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i113, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i113 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda12, composerStartRestartGroup, (i113 & 112) | (i113 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier15;
                    boolean z18 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z18;
                    long j15 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j15;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i114) {
                        NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 196608;
            function3 = function2;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    z5 = z3;
                    if (composerStartRestartGroup.changed(z5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) != 0) {
                    i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                }
                if ((i & 1879048192) != 0) {
                    i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i114) {
                                if ((i114 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i114, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs12 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier16 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    Density density12 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierM523size3ABfNKs12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl12 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf12, OooO0OO.OooO00o(companion12, composerM1309constructorimpl12, measurePolicyRememberBoxMeasurePolicy12, composerM1309constructorimpl12, density12, composerM1309constructorimpl12, layoutDirection12, composerM1309constructorimpl12, viewConfiguration12, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i114) {
                            int i115;
                            if ((i114 & 14) == 0) {
                                i115 = (composer2.changed(f2) ? 4 : 2) | i114;
                            } else {
                                i115 = i114;
                            }
                            if ((i115 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i114, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i114 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda13, composerStartRestartGroup, (i114 & 112) | (i114 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier16;
                    boolean z19 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z19;
                    long j16 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j16;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i115) {
                                if ((i115 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i115, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs13 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier17 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    Density density13 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM523size3ABfNKs13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl13 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf13, OooO0OO.OooO00o(companion13, composerM1309constructorimpl13, measurePolicyRememberBoxMeasurePolicy13, composerM1309constructorimpl13, density13, composerM1309constructorimpl13, layoutDirection13, composerM1309constructorimpl13, viewConfiguration13, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i115) {
                            int i116;
                            if ((i115 & 14) == 0) {
                                i116 = (composer2.changed(f2) ? 4 : 2) | i115;
                            } else {
                                i116 = i115;
                            }
                            if ((i116 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i115, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i115 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda14, composerStartRestartGroup, (i115 & 112) | (i115 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier17;
                    boolean z110 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z110;
                    long j17 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j17;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i116) {
                        NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 1572864;
            z5 = z3;
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            if ((i & 234881024) != 0) {
                i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
            }
            if ((i & 1879048192) != 0) {
                i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i116) {
                            if ((i116 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i116, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs14 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier18 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                Density density14 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierM523size3ABfNKs14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl14 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf14, OooO0OO.OooO00o(companion14, composerM1309constructorimpl14, measurePolicyRememberBoxMeasurePolicy14, composerM1309constructorimpl14, density14, composerM1309constructorimpl14, layoutDirection14, composerM1309constructorimpl14, viewConfiguration14, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i116) {
                        int i117;
                        if ((i116 & 14) == 0) {
                            i117 = (composer2.changed(f2) ? 4 : 2) | i116;
                        } else {
                            i117 = i116;
                        }
                        if ((i117 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i116, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i116 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda15, composerStartRestartGroup, (i116 & 112) | (i116 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier18;
                boolean z111 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z111;
                long j18 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j18;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i117) {
                            if ((i117 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i117, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs15 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier19 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                Density density15 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierM523size3ABfNKs15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl15 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf15, OooO0OO.OooO00o(companion15, composerM1309constructorimpl15, measurePolicyRememberBoxMeasurePolicy15, composerM1309constructorimpl15, density15, composerM1309constructorimpl15, layoutDirection15, composerM1309constructorimpl15, viewConfiguration15, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i117) {
                        int i118;
                        if ((i117 & 14) == 0) {
                            i118 = (composer2.changed(f2) ? 4 : 2) | i117;
                        } else {
                            i118 = i117;
                        }
                        if ((i118 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i117, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i117 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda16, composerStartRestartGroup, (i117 & 112) | (i117 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier19;
                boolean z112 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z112;
                long j19 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j19;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i118) {
                    NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        z5 = z3;
                        if (composerStartRestartGroup.changed(z5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) != 0) {
                        i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                    }
                    if ((i & 1879048192) != 0) {
                        i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i3 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i118) {
                                    if ((i118 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i118, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs16 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center16 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier110 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composerStartRestartGroup, 6);
                        Density density16 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierM523size3ABfNKs16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl16 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf16, OooO0OO.OooO00o(companion16, composerM1309constructorimpl16, measurePolicyRememberBoxMeasurePolicy16, composerM1309constructorimpl16, density16, composerM1309constructorimpl16, layoutDirection16, composerM1309constructorimpl16, viewConfiguration16, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i118) {
                                int i119;
                                if ((i118 & 14) == 0) {
                                    i119 = (composer2.changed(f2) ? 4 : 2) | i118;
                                } else {
                                    i119 = i118;
                                }
                                if ((i119 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i118, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i118 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda17, composerStartRestartGroup, (i118 & 112) | (i118 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier110;
                        boolean z113 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z113;
                        long j110 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j110;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function3 = null;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1023getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i3 &= -1879048193;
                                jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM1669copywmQWz5c$default = j2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i119) {
                                    if ((i119 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-180398615, i119, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                    }
                                    TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                    TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function3 == null) {
                            f = NavigationRailItemCompactSize;
                        } else {
                            f = NavigationRailItemSize;
                        }
                        Modifier modifierM523size3ABfNKs17 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                        Alignment center17 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier modifier111 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composerStartRestartGroup, 6);
                        Density density17 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                        LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierM523size3ABfNKs17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl17 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf17, OooO0OO.OooO00o(companion17, composerM1309constructorimpl17, measurePolicyRememberBoxMeasurePolicy17, composerM1309constructorimpl17, density17, composerM1309constructorimpl17, layoutDirection17, composerM1309constructorimpl17, viewConfiguration17, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                                invoke(f2.floatValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(float f2, @Nullable Composer composer2, int i119) {
                                int i1110;
                                if ((i119 & 14) == 0) {
                                    i1110 = (composer2.changed(f2) ? 4 : 2) | i119;
                                } else {
                                    i1110 = i119;
                                }
                                if ((i1110 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670576792, i119, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                                }
                                if (z5) {
                                    f2 = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i119 = i3 >> 24;
                        m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda18, composerStartRestartGroup, (i119 & 112) | (i119 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier111;
                        boolean z114 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z6 = z114;
                        long j111 = jM1023getPrimary0d7_KjU;
                        function4 = function3;
                        j3 = j111;
                        z7 = z5;
                        j4 = jM1669copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i1110) {
                            NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 1572864;
                z5 = z3;
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) != 0) {
                    i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                }
                if ((i & 1879048192) != 0) {
                    i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1110) {
                                if ((i1110 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i1110, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs18 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center18 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier112 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composerStartRestartGroup, 6);
                    Density density18 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierM523size3ABfNKs18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl18 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf18, OooO0OO.OooO00o(companion18, composerM1309constructorimpl18, measurePolicyRememberBoxMeasurePolicy18, composerM1309constructorimpl18, density18, composerM1309constructorimpl18, layoutDirection18, composerM1309constructorimpl18, viewConfiguration18, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i1110) {
                            int i1111;
                            if ((i1110 & 14) == 0) {
                                i1111 = (composer2.changed(f2) ? 4 : 2) | i1110;
                            } else {
                                i1111 = i1110;
                            }
                            if ((i1111 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i1110, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1110 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda19, composerStartRestartGroup, (i1110 & 112) | (i1110 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier112;
                    boolean z115 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z115;
                    long j112 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j112;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1111) {
                                if ((i1111 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i1111, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs19 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center19 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier113 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composerStartRestartGroup, 6);
                    Density density19 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierM523size3ABfNKs19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl19 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf19, OooO0OO.OooO00o(companion19, composerM1309constructorimpl19, measurePolicyRememberBoxMeasurePolicy19, composerM1309constructorimpl19, density19, composerM1309constructorimpl19, layoutDirection19, composerM1309constructorimpl19, viewConfiguration19, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i1111) {
                            int i1112;
                            if ((i1111 & 14) == 0) {
                                i1112 = (composer2.changed(f2) ? 4 : 2) | i1111;
                            } else {
                                i1112 = i1111;
                            }
                            if ((i1112 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i1111, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1111 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda110, composerStartRestartGroup, (i1111 & 112) | (i1111 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier113;
                    boolean z116 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z116;
                    long j113 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j113;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1112) {
                        NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 196608;
            function3 = function2;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    z5 = z3;
                    if (composerStartRestartGroup.changed(z5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) != 0) {
                    i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                }
                if ((i & 1879048192) != 0) {
                    i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1112) {
                                if ((i1112 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i1112, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs110 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center110 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier114 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composerStartRestartGroup, 6);
                    Density density110 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(modifierM523size3ABfNKs110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl110 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf110, OooO0OO.OooO00o(companion110, composerM1309constructorimpl110, measurePolicyRememberBoxMeasurePolicy110, composerM1309constructorimpl110, density110, composerM1309constructorimpl110, layoutDirection110, composerM1309constructorimpl110, viewConfiguration110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i1112) {
                            int i1113;
                            if ((i1112 & 14) == 0) {
                                i1113 = (composer2.changed(f2) ? 4 : 2) | i1112;
                            } else {
                                i1113 = i1112;
                            }
                            if ((i1113 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i1112, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1112 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda111, composerStartRestartGroup, (i1112 & 112) | (i1112 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier114;
                    boolean z117 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z117;
                    long j114 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j114;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1113) {
                                if ((i1113 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i1113, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs111 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center111 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier115 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composerStartRestartGroup, 6);
                    Density density111 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierM523size3ABfNKs111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl111 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf111, OooO0OO.OooO00o(companion111, composerM1309constructorimpl111, measurePolicyRememberBoxMeasurePolicy111, composerM1309constructorimpl111, density111, composerM1309constructorimpl111, layoutDirection111, composerM1309constructorimpl111, viewConfiguration111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i1113) {
                            int i1114;
                            if ((i1113 & 14) == 0) {
                                i1114 = (composer2.changed(f2) ? 4 : 2) | i1113;
                            } else {
                                i1114 = i1113;
                            }
                            if ((i1114 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i1113, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1113 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda112, composerStartRestartGroup, (i1113 & 112) | (i1113 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier115;
                    boolean z118 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z118;
                    long j115 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j115;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1114) {
                        NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 1572864;
            z5 = z3;
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            if ((i & 234881024) != 0) {
                i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
            }
            if ((i & 1879048192) != 0) {
                i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1114) {
                            if ((i1114 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i1114, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs112 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center112 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier116 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composerStartRestartGroup, 6);
                Density density112 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierM523size3ABfNKs112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl112 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf112, OooO0OO.OooO00o(companion112, composerM1309constructorimpl112, measurePolicyRememberBoxMeasurePolicy112, composerM1309constructorimpl112, density112, composerM1309constructorimpl112, layoutDirection112, composerM1309constructorimpl112, viewConfiguration112, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i1114) {
                        int i1115;
                        if ((i1114 & 14) == 0) {
                            i1115 = (composer2.changed(f2) ? 4 : 2) | i1114;
                        } else {
                            i1115 = i1114;
                        }
                        if ((i1115 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i1114, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1114 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda113, composerStartRestartGroup, (i1114 & 112) | (i1114 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier116;
                boolean z119 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z119;
                long j116 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j116;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1115) {
                            if ((i1115 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i1115, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs113 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center113 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier117 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composerStartRestartGroup, 6);
                Density density113 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierM523size3ABfNKs113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl113 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf113, OooO0OO.OooO00o(companion113, composerM1309constructorimpl113, measurePolicyRememberBoxMeasurePolicy113, composerM1309constructorimpl113, density113, composerM1309constructorimpl113, layoutDirection113, composerM1309constructorimpl113, viewConfiguration113, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i1115) {
                        int i1116;
                        if ((i1115 & 14) == 0) {
                            i1116 = (composer2.changed(f2) ? 4 : 2) | i1115;
                        } else {
                            i1116 = i1115;
                        }
                        if ((i1116 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i1115, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1115 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda114, composerStartRestartGroup, (i1115 & 112) | (i1115 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier117;
                boolean z1110 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z1110;
                long j117 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j117;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1116) {
                    NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z4 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((458752 & i) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    z5 = z3;
                    if (composerStartRestartGroup.changed(z5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) != 0) {
                    i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
                }
                if ((i & 1879048192) != 0) {
                    i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1116) {
                                if ((i1116 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i1116, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs114 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center114 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier118 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composerStartRestartGroup, 6);
                    Density density114 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierM523size3ABfNKs114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl114 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf114, OooO0OO.OooO00o(companion114, composerM1309constructorimpl114, measurePolicyRememberBoxMeasurePolicy114, composerM1309constructorimpl114, density114, composerM1309constructorimpl114, layoutDirection114, composerM1309constructorimpl114, viewConfiguration114, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i1116) {
                            int i1117;
                            if ((i1116 & 14) == 0) {
                                i1117 = (composer2.changed(f2) ? 4 : 2) | i1116;
                            } else {
                                i1117 = i1116;
                            }
                            if ((i1117 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i1116, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1116 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda115, composerStartRestartGroup, (i1116 & 112) | (i1116 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier118;
                    boolean z1111 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z1111;
                    long j118 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j118;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1023getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i3 &= -1879048193;
                            jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1669copywmQWz5c$default = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1117) {
                                if ((i1117 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-180398615, i1117, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                                }
                                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                                TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    if (function3 == null) {
                        f = NavigationRailItemCompactSize;
                    } else {
                        f = NavigationRailItemSize;
                    }
                    Modifier modifierM523size3ABfNKs115 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                    Alignment center115 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier modifier119 = modifier3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composerStartRestartGroup, 6);
                    Density density115 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierM523size3ABfNKs115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl115 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf115, OooO0OO.OooO00o(companion115, composerM1309constructorimpl115, measurePolicyRememberBoxMeasurePolicy115, composerM1309constructorimpl115, density115, composerM1309constructorimpl115, layoutDirection115, composerM1309constructorimpl115, viewConfiguration115, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                            invoke(f2.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(float f2, @Nullable Composer composer2, int i1117) {
                            int i1118;
                            if ((i1117 & 14) == 0) {
                                i1118 = (composer2.changed(f2) ? 4 : 2) | i1117;
                            } else {
                                i1118 = i1117;
                            }
                            if ((i1118 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670576792, i1117, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                            }
                            if (z5) {
                                f2 = 1.0f;
                            }
                            NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1117 = i3 >> 24;
                    m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda116, composerStartRestartGroup, (i1117 & 112) | (i1117 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier119;
                    boolean z1112 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z6 = z1112;
                    long j119 = jM1023getPrimary0d7_KjU;
                    function4 = function3;
                    j3 = j119;
                    z7 = z5;
                    j4 = jM1669copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1118) {
                        NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 1572864;
            z5 = z3;
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            if ((i & 234881024) != 0) {
                i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
            }
            if ((i & 1879048192) != 0) {
                i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1118) {
                            if ((i1118 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i1118, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs116 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center116 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier1110 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composerStartRestartGroup, 6);
                Density density116 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(modifierM523size3ABfNKs116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl116 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf116, OooO0OO.OooO00o(companion116, composerM1309constructorimpl116, measurePolicyRememberBoxMeasurePolicy116, composerM1309constructorimpl116, density116, composerM1309constructorimpl116, layoutDirection116, composerM1309constructorimpl116, viewConfiguration116, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i1118) {
                        int i1119;
                        if ((i1118 & 14) == 0) {
                            i1119 = (composer2.changed(f2) ? 4 : 2) | i1118;
                        } else {
                            i1119 = i1118;
                        }
                        if ((i1119 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i1118, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1118 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda117, composerStartRestartGroup, (i1118 & 112) | (i1118 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1110;
                boolean z1113 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z1113;
                long j1110 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j1110;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1119) {
                            if ((i1119 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i1119, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs117 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center117 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier1111 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composerStartRestartGroup, 6);
                Density density117 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierM523size3ABfNKs117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl117 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf117, OooO0OO.OooO00o(companion117, composerM1309constructorimpl117, measurePolicyRememberBoxMeasurePolicy117, composerM1309constructorimpl117, density117, composerM1309constructorimpl117, layoutDirection117, composerM1309constructorimpl117, viewConfiguration117, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i1119) {
                        int i11110;
                        if ((i1119 & 14) == 0) {
                            i11110 = (composer2.changed(f2) ? 4 : 2) | i1119;
                        } else {
                            i11110 = i1119;
                        }
                        if ((i11110 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i1119, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1119 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda118, composerStartRestartGroup, (i1119 & 112) | (i1119 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1111;
                boolean z1114 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z1114;
                long j1111 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j1111;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11110) {
                    NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 196608;
        function3 = function2;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((3670016 & i) == 0) {
                z5 = z3;
                if (composerStartRestartGroup.changed(z5)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            if ((i & 234881024) != 0) {
                i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
            }
            if ((i & 1879048192) != 0) {
                i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11110) {
                            if ((i11110 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i11110, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs118 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center118 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier1112 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composerStartRestartGroup, 6);
                Density density118 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierM523size3ABfNKs118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl118 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf118, OooO0OO.OooO00o(companion118, composerM1309constructorimpl118, measurePolicyRememberBoxMeasurePolicy118, composerM1309constructorimpl118, density118, composerM1309constructorimpl118, layoutDirection118, composerM1309constructorimpl118, viewConfiguration118, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i11110) {
                        int i11111;
                        if ((i11110 & 14) == 0) {
                            i11111 = (composer2.changed(f2) ? 4 : 2) | i11110;
                        } else {
                            i11111 = i11110;
                        }
                        if ((i11111 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i11110, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11110 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda119, composerStartRestartGroup, (i11110 & 112) | (i11110 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1112;
                boolean z1115 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z1115;
                long j1112 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j1112;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1023getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i3 &= -1879048193;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1669copywmQWz5c$default = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11111) {
                            if ((i11111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180398615, i11111, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                            }
                            TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                            TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                if (function3 == null) {
                    f = NavigationRailItemCompactSize;
                } else {
                    f = NavigationRailItemSize;
                }
                Modifier modifierM523size3ABfNKs119 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
                Alignment center119 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier modifier1113 = modifier3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composerStartRestartGroup, 6);
                Density density119 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifierM523size3ABfNKs119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl119 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf119, OooO0OO.OooO00o(companion119, composerM1309constructorimpl119, measurePolicyRememberBoxMeasurePolicy119, composerM1309constructorimpl119, density119, composerM1309constructorimpl119, layoutDirection119, composerM1309constructorimpl119, viewConfiguration119, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                        invoke(f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(float f2, @Nullable Composer composer2, int i11111) {
                        int i11112;
                        if ((i11111 & 14) == 0) {
                            i11112 = (composer2.changed(f2) ? 4 : 2) | i11111;
                        } else {
                            i11112 = i11111;
                        }
                        if ((i11112 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670576792, i11111, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                        }
                        if (z5) {
                            f2 = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11111 = i3 >> 24;
                m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda1110, composerStartRestartGroup, (i11111 & 112) | (i11111 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1113;
                boolean z1116 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z1116;
                long j1113 = jM1023getPrimary0d7_KjU;
                function4 = function3;
                j3 = j1113;
                z7 = z5;
                j4 = jM1669copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11112) {
                    NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 1572864;
        z5 = z3;
        i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i11 = 8388608;
            } else {
                i11 = Configuration.BLOCK_SIZE;
            }
            i3 |= i11;
        }
        if ((i & 234881024) != 0) {
            i3 |= ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j)) ? 33554432 : 67108864;
        }
        if ((i & 1879048192) != 0) {
            i3 |= ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(j2)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
        }
        if ((i3 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i3 &= -1879048193;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j2;
                }
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i3 &= -1879048193;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
            }
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11112) {
                        if ((i11112 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180398615, i11112, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                        }
                        TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                        TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
            } else {
                composableLambda = null;
            }
            if (function3 == null) {
                f = NavigationRailItemCompactSize;
            } else {
                f = NavigationRailItemSize;
            }
            Modifier modifierM523size3ABfNKs1110 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
            Alignment center1110 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier modifier1114 = modifier3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composerStartRestartGroup, 6);
            Density density1110 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierM523size3ABfNKs1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl1110 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf1110, OooO0OO.OooO00o(companion1110, composerM1309constructorimpl1110, measurePolicyRememberBoxMeasurePolicy1110, composerM1309constructorimpl1110, density1110, composerM1309constructorimpl1110, layoutDirection1110, composerM1309constructorimpl1110, viewConfiguration1110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                    invoke(f2.floatValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(float f2, @Nullable Composer composer2, int i11112) {
                    int i11113;
                    if ((i11112 & 14) == 0) {
                        i11113 = (composer2.changed(f2) ? 4 : 2) | i11112;
                    } else {
                        i11113 = i11112;
                    }
                    if ((i11113 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670576792, i11112, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                    }
                    if (z5) {
                        f2 = 1.0f;
                    }
                    NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11112 = i3 >> 24;
            m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda1111, composerStartRestartGroup, (i11112 & 112) | (i11112 & 14) | 3072 | ((i3 << 6) & 896));
            if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier1114;
            boolean z1117 = z4;
            mutableInteractionSource3 = mutableInteractionSource2;
            z6 = z1117;
            long j1114 = jM1023getPrimary0d7_KjU;
            function4 = function3;
            j3 = j1114;
            z7 = z5;
            j4 = jM1669copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i3 &= -1879048193;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j2;
                }
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i3 &= -1879048193;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1680unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
            }
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if ((i11113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180398615, i11113, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                        }
                        TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                        TextKt.ProvideTextStyle(caption.m3324copyCXVQc50((4194271 & 1) != 0 ? caption.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? caption.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? caption.platformStyle : null, (4194271 & 524288) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? caption.paragraphStyle.getHyphens() : null), function3, composer2, (i3 >> 12) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
            } else {
                composableLambda = null;
            }
            if (function3 == null) {
                f = NavigationRailItemCompactSize;
            } else {
                f = NavigationRailItemSize;
            }
            Modifier modifierM523size3ABfNKs1111 = SizeKt.m523size3ABfNKs(SelectableKt.m698selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, jM1023getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3148boximpl(Role.INSTANCE.m3161getTabo7Vup1c()), onClick), f);
            Alignment center1111 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier modifier1115 = modifier3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composerStartRestartGroup, 6);
            Density density1111 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection1111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = LayoutKt.materializerOf(modifierM523size3ABfNKs1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl1111 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf1111, OooO0OO.OooO00o(companion1111, composerM1309constructorimpl1111, measurePolicyRememberBoxMeasurePolicy1111, composerM1309constructorimpl1111, density1111, composerM1309constructorimpl1111, layoutDirection1111, composerM1309constructorimpl1111, viewConfiguration1111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            ComposableLambda composableLambda1112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer2, Integer num) {
                    invoke(f2.floatValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(float f2, @Nullable Composer composer2, int i11113) {
                    int i11114;
                    if ((i11113 & 14) == 0) {
                        i11114 = (composer2.changed(f2) ? 4 : 2) | i11113;
                    } else {
                        i11114 = i11113;
                    }
                    if ((i11114 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670576792, i11113, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                    }
                    if (z5) {
                        f2 = 1.0f;
                    }
                    NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f2, composer2, (i3 >> 6) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11113 = i3 >> 24;
            m1124NavigationRailTransitionKlgxPg(jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, z, composableLambda1112, composerStartRestartGroup, (i11113 & 112) | (i11113 & 14) | 3072 | ((i3 << 6) & 896));
            if (OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier1115;
            boolean z1118 = z4;
            mutableInteractionSource3 = mutableInteractionSource2;
            z6 = z1118;
            long j1115 = jM1023getPrimary0d7_KjU;
            function4 = function3;
            j3 = j1115;
            z7 = z5;
            j4 = jM1669copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11114) {
                NavigationRailKt.m1123NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z6, function4, z7, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, final float f, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1903861684);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903861684, i3, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:258)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    Placeable placeableMo2794measureBRTryo0;
                    Measurable measurable;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable2 : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                            Placeable placeableMo2794measureBRTryo1 = measurable2.mo2794measureBRTryo0(j);
                            if (function3 != null) {
                                Iterator<T> it = measurables.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    measurable = (Measurable) it.next();
                                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "label"));
                                placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            } else {
                                placeableMo2794measureBRTryo0 = null;
                            }
                            if (function3 == null) {
                                return NavigationRailKt.m1128placeIcon3p2s80s(Layout, placeableMo2794measureBRTryo1, j);
                            }
                            Intrinsics.checkNotNull(placeableMo2794measureBRTryo0);
                            return NavigationRailKt.m1129placeLabelAndIconDIyivk0(Layout, placeableMo2794measureBRTryo0, placeableMo2794measureBRTryo1, j, f);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                    return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i4);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Updater.m1316setimpl(composerM1309constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1316setimpl(composerM1309constructorimpl, density, companion2.getSetDensity());
            Updater.m1316setimpl(composerM1309constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1316setimpl(composerM1309constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(286683862);
            if (function3 != null) {
                Modifier modifierAlpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlpha);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion2, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composer2, 2058660585);
                OooO0O0.OooO00o((i3 >> 3) & 14, function3, composer2);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i4) {
                NavigationRailKt.NavigationRailItemBaselineLayout(function2, function3, f, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* JADX INFO: renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1124NavigationRailTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-207161906);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        final int i3 = i2;
        if ((i3 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, i3, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:226)");
            }
            final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, composerStartRestartGroup, 48, 12);
            long jM1721lerpjxsXWHM = ColorKt.m1721lerpjxsXWHM(j2, j, NavigationRailTransition_Klgx_Pg$lambda$3(stateAnimateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1660boximpl(Color.m1669copywmQWz5c$default(jM1721lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1672getAlphaimpl(jM1721lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1688205042, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1688205042, i4, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:242)");
                    }
                    function3.invoke(Float.valueOf(NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$3(stateAnimateFloatAsState)), composer2, Integer.valueOf((i3 >> 6) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                NavigationRailKt.m1124NavigationRailTransitionKlgxPg(j, j2, z, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1128placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        final int iMax = Math.max(0, (Constraints.m3733getMaxWidthimpl(j) - placeable.getWidth()) / 2);
        final int iMax2 = Math.max(0, (Constraints.m3732getMaxHeightimpl(j) - placeable.getHeight()) / 2);
        return MeasureScope.CC.OooOOo0(measureScope, Constraints.m3733getMaxWidthimpl(j), Constraints.m3732getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeable, iMax, iMax2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1129placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        final int iM3732getMaxHeightimpl = (Constraints.m3732getMaxHeightimpl(j) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo318roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int iM3733getMaxWidthimpl = (Constraints.m3733getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        final int iMo318roundToPx0680j_4 = measureScope.mo318roundToPx0680j_4(ItemIconTopOffset);
        int iM3732getMaxHeightimpl2 = (Constraints.m3732getMaxHeightimpl(j) - placeable2.getHeight()) / 2;
        final int iM3733getMaxWidthimpl2 = (Constraints.m3733getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        final int iRoundToInt = MathKt.roundToInt((1 - f) * (iM3732getMaxHeightimpl2 - iMo318roundToPx0680j_4));
        return MeasureScope.CC.OooOOo0(measureScope, Constraints.m3733getMaxWidthimpl(j), Constraints.m3732getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (!(f == 0.0f)) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, iM3733getMaxWidthimpl, iM3732getMaxHeightimpl + iRoundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, iM3733getMaxWidthimpl2, iMo318roundToPx0680j_4 + iRoundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
