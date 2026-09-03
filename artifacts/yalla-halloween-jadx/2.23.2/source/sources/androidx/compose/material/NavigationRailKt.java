package androidx.compose.material;

import androidx.compose.animation.Oooo000;
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
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
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
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0091\u0001\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u001d2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a=\u0010*\u001a\u00020\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\u0006\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010,\u001aU\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a)\u00105\u001a\u000206*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a9\u0010>\u001a\u000206*\u0002072\u0006\u0010?\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010+\u001a\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\n\u00102\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", "label", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,405:1\n25#2:406\n456#2,8:430\n464#2,3:444\n467#2,3:448\n456#2,8:467\n464#2,3:481\n456#2,8:501\n464#2,3:515\n467#2,3:519\n456#2,8:541\n464#2,3:555\n467#2,3:559\n467#2,3:564\n1097#3,6:407\n76#4:413\n67#5,5:414\n72#5:447\n76#5:452\n66#5,6:484\n72#5:518\n76#5:523\n66#5,6:524\n72#5:558\n76#5:563\n78#6,11:419\n91#6:451\n75#6,14:453\n78#6,11:490\n91#6:522\n78#6,11:530\n91#6:562\n91#6:567\n4144#7,6:438\n4144#7,6:475\n4144#7,6:509\n4144#7,6:549\n81#8:568\n154#9:569\n154#9:570\n154#9:571\n154#9:572\n154#9:573\n154#9:574\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n155#1:406\n176#1:430,8\n176#1:444,3\n176#1:448,3\n265#1:467,8\n265#1:481,3\n267#1:501,8\n267#1:515,3\n267#1:519,3\n269#1:541,8\n269#1:555,3\n269#1:559,3\n265#1:564,3\n155#1:407,6\n157#1:413\n176#1:414,5\n176#1:447\n176#1:452\n267#1:484,6\n267#1:518\n267#1:523\n269#1:524,6\n269#1:558\n269#1:563\n176#1:419,11\n176#1:451\n265#1:453,14\n267#1:490,11\n267#1:522\n269#1:530,11\n269#1:562\n265#1:567\n176#1:438,6\n265#1:475,6\n267#1:509,6\n269#1:549,6\n233#1:568\n379#1:569\n384#1:570\n389#1:571\n395#1:572\n400#1:573\n405#1:574\n*E\n"})
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;

    @NotNull
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m3775constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m3775constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m3775constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m3775constructorimpl(14);

    static {
        float f = 8;
        NavigationRailPadding = Dp.m3775constructorimpl(f);
        HeaderPadding = Dp.m3775constructorimpl(f);
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
    public static final void m1138NavigationRailHsRjFd4(@Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM1043getSurface0d7_KjU;
        long j3;
        float fM1137getElevationD9Ej5fM;
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
                jM1043getSurface0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM1043getSurface0d7_KjU) ? 32 : 16;
                i3 |= i9;
            } else {
                jM1043getSurface0d7_KjU = j;
            }
            i3 |= i9;
        } else {
            jM1043getSurface0d7_KjU = j;
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
                fM1137getElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM1137getElevationD9Ej5fM) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
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
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            }
                            if ((i2 & 4) != 0) {
                                long jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                                j3 = jM1057contentColorForek8zF_U;
                            }
                            if (i10 != 0) {
                                fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                function5 = null;
                                j4 = j3;
                            }
                            i7 = i3;
                            float f2 = fM1137getElevationD9Ej5fM;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                            }
                            int i11 = i7 << 3;
                            SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i13 = i7;
                                    Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                                    composer2.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                    }
                                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(65525382);
                                    if (function6 != null) {
                                        function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                                        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                                    }
                                    composer2.endReplaceableGroup();
                                    function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 12) & 112) | 6));
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
                            fM1137getElevationD9Ej5fM = f2;
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
                        float f3 = fM1137getElevationD9Ej5fM;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                        }
                        int i12 = i7 << 3;
                        SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                                Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i14 = i7;
                                Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                                composer2.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(65525382);
                                if (function6 != null) {
                                    function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i14 >> 9) & 112) | 6));
                                    SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                                }
                                composer2.endReplaceableGroup();
                                function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i14 >> 12) & 112) | 6));
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
                        fM1137getElevationD9Ej5fM = f3;
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
                    final long j5 = jM1043getSurface0d7_KjU;
                    final long j6 = j3;
                    final float f4 = fM1137getElevationD9Ej5fM;
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
                            NavigationRailKt.m1138NavigationRailHsRjFd4(modifier4, j5, j6, f4, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U2;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U3 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U3;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    float f5 = fM1137getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i13 = i7 << 3;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i15 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i15 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i15 >> 12) & 112) | 6));
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
                    fM1137getElevationD9Ej5fM = f5;
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U4 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U4;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U5 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U5;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    float f6 = fM1137getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i14 = i7 << 3;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i16 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i16 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i16 >> 12) & 112) | 6));
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
                    fM1137getElevationD9Ej5fM = f6;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier2;
                final long j7 = jM1043getSurface0d7_KjU;
                final long j8 = j3;
                final float f7 = fM1137getElevationD9Ej5fM;
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
                        NavigationRailKt.m1138NavigationRailHsRjFd4(modifier5, j7, j8, f7, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U6 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U6;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U7 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U7;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    float f8 = fM1137getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i15 = i7 << 3;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i17 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i17 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i17 >> 12) & 112) | 6));
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
                    fM1137getElevationD9Ej5fM = f8;
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U8 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U8;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U9 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U9;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    float f9 = fM1137getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i16 = i7 << 3;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i18 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i18 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i18 >> 12) & 112) | 6));
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
                    fM1137getElevationD9Ej5fM = f9;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier2;
                final long j9 = jM1043getSurface0d7_KjU;
                final long j10 = j3;
                final float f10 = fM1137getElevationD9Ej5fM;
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
                        NavigationRailKt.m1138NavigationRailHsRjFd4(modifier6, j9, j10, f10, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U10 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U10;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U11 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U11;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                float f11 = fM1137getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i17 = i7 << 3;
                SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i19 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i19 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i19 >> 12) & 112) | 6));
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
                fM1137getElevationD9Ej5fM = f11;
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U12 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U12;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U13 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U13;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                float f12 = fM1137getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i18 = i7 << 3;
                SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i110 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i110 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i110 >> 12) & 112) | 6));
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
                fM1137getElevationD9Ej5fM = f12;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier2;
            final long j11 = jM1043getSurface0d7_KjU;
            final long j12 = j3;
            final float f13 = fM1137getElevationD9Ej5fM;
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
                    NavigationRailKt.m1138NavigationRailHsRjFd4(modifier7, j11, j12, f13, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        fM1137getElevationD9Ej5fM = f;
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U14 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U14;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U15 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U15;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    float f14 = fM1137getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i19 = i7 << 3;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i111 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i111 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i111 >> 12) & 112) | 6));
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
                    fM1137getElevationD9Ej5fM = f14;
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U16 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U16;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        }
                        if ((i2 & 4) != 0) {
                            long jM1057contentColorForek8zF_U17 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1057contentColorForek8zF_U17;
                        }
                        if (i10 != 0) {
                            fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    float f15 = fM1137getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i110 = i7 << 3;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i112 = i7;
                            Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(65525382);
                            if (function6 != null) {
                                function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i112 >> 9) & 112) | 6));
                                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i112 >> 12) & 112) | 6));
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
                    fM1137getElevationD9Ej5fM = f15;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier2;
                final long j13 = jM1043getSurface0d7_KjU;
                final long j14 = j3;
                final float f16 = fM1137getElevationD9Ej5fM;
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
                        NavigationRailKt.m1138NavigationRailHsRjFd4(modifier8, j13, j14, f16, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U18 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U18;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U19 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U19;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                float f17 = fM1137getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i111 = i7 << 3;
                SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i113 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i113 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i113 >> 12) & 112) | 6));
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
                fM1137getElevationD9Ej5fM = f17;
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U110 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U110;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U111 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U111;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                float f18 = fM1137getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i112 = i7 << 3;
                SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i114 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i114 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i114 >> 12) & 112) | 6));
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
                fM1137getElevationD9Ej5fM = f18;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier2;
            final long j15 = jM1043getSurface0d7_KjU;
            final long j16 = j3;
            final float f19 = fM1137getElevationD9Ej5fM;
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
                    NavigationRailKt.m1138NavigationRailHsRjFd4(modifier9, j15, j16, f19, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U112 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U112;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U113 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U113;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                float f110 = fM1137getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i113 = i7 << 3;
                SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i115 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i115 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i115 >> 12) & 112) | 6));
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
                fM1137getElevationD9Ej5fM = f110;
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U114 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U114;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    }
                    if ((i2 & 4) != 0) {
                        long jM1057contentColorForek8zF_U115 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1057contentColorForek8zF_U115;
                    }
                    if (i10 != 0) {
                        fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                float f111 = fM1137getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i114 = i7 << 3;
                SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                        int i116 = i7;
                        Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(65525382);
                        if (function6 != null) {
                            function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i116 >> 9) & 112) | 6));
                            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i116 >> 12) & 112) | 6));
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
                fM1137getElevationD9Ej5fM = f111;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier2;
            final long j17 = jM1043getSurface0d7_KjU;
            final long j18 = j3;
            final float f112 = fM1137getElevationD9Ej5fM;
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
                    NavigationRailKt.m1138NavigationRailHsRjFd4(modifier10, j17, j18, f112, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1057contentColorForek8zF_U116 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1057contentColorForek8zF_U116;
                }
                if (i10 != 0) {
                    fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1057contentColorForek8zF_U117 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1057contentColorForek8zF_U117;
                }
                if (i10 != 0) {
                    fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
            float f113 = fM1137getElevationD9Ej5fM;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
            }
            int i115 = i7 << 3;
            SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                    int i117 = i7;
                    Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(65525382);
                    if (function6 != null) {
                        function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i117 >> 9) & 112) | 6));
                        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i117 >> 12) & 112) | 6));
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
            fM1137getElevationD9Ej5fM = f113;
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
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1057contentColorForek8zF_U118 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1057contentColorForek8zF_U118;
                }
                if (i10 != 0) {
                    fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                }
                if ((i2 & 4) != 0) {
                    long jM1057contentColorForek8zF_U119 = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1057contentColorForek8zF_U119;
                }
                if (i10 != 0) {
                    fM1137getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m1137getElevationD9Ej5fM();
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
            float f114 = fM1137getElevationD9Ej5fM;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790971523, i7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
            }
            int i116 = i7 << 3;
            SurfaceKt.m1201SurfaceFjzlyU(modifier3, null, jM1043getSurface0d7_KjU, j4, null, f114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                    Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.NavigationRailPadding, 1, null));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                    int i118 = i7;
                    Function3<ColumnScope, Composer, Integer, Unit> function7 = content;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(65525382);
                    if (function6 != null) {
                        function6.invoke(columnScopeInstance, composer2, Integer.valueOf(((i118 >> 9) & 112) | 6));
                        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, NavigationRailKt.HeaderPadding), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function7.invoke(columnScopeInstance, composer2, Integer.valueOf(((i118 >> 12) & 112) | 6));
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
            fM1137getElevationD9Ej5fM = f114;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier2;
        final long j19 = jM1043getSurface0d7_KjU;
        final long j110 = j3;
        final float f115 = fM1137getElevationD9Ej5fM;
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
                NavigationRailKt.m1138NavigationRailHsRjFd4(modifier11, j19, j110, f115, function5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x018c  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x0203  */
    /* JADX WARN: Code duplicated, block: B:152:0x020e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0219  */
    /* JADX WARN: Code duplicated, block: B:155:0x0227  */
    /* JADX WARN: Code duplicated, block: B:157:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x022d  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x0318  */
    /* JADX WARN: Code duplicated, block: B:178:0x032d  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
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
    public static final void m1139NavigationRailItem0S3VyRs(final boolean z, @NotNull final Function0<Unit> onClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, @Nullable MutableInteractionSource mutableInteractionSource, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
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
        long jM1039getPrimary0d7_KjU;
        long jM1680copywmQWz5c$default;
        Object objRememberedValue;
        final ComposableLambda composableLambda;
        float f;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource3;
        final long j3;
        final boolean z6;
        final long j4;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function4;
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
                                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                    i3 &= -234881025;
                                } else {
                                    jM1039getPrimary0d7_KjU = j;
                                }
                                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i3 &= -1879048193;
                                } else {
                                    jM1680copywmQWz5c$default = j2;
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
                                jM1680copywmQWz5c$default = j2;
                                modifier3 = modifier2;
                                jM1039getPrimary0d7_KjU = j;
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
                                        TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                            Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            Modifier modifier5 = modifier3;
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            boolean z8 = z4;
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                            m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda2, composerStartRestartGroup, (i13 & 112) | (i13 & 14) | 3072 | ((i3 << 6) & 896));
                            if (OooO0o.OooO00o(composerStartRestartGroup)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            j3 = jM1039getPrimary0d7_KjU;
                            z6 = z5;
                            j4 = jM1680copywmQWz5c$default;
                            z7 = z8;
                            function4 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z7 = z4;
                            function4 = function3;
                            z6 = z5;
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
                                NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs2 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        Modifier modifier6 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z9 = z4;
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function6 = function3;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda3, composerStartRestartGroup, (i14 & 112) | (i14 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier6;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z9;
                        function4 = function6;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs3 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        Modifier modifier7 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z10 = z4;
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function7 = function3;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda4, composerStartRestartGroup, (i15 & 112) | (i15 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier7;
                        mutableInteractionSource3 = mutableInteractionSource6;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z10;
                        function4 = function7;
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
                            NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs4 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        Modifier modifier8 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z11 = z4;
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function8 = function3;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1320constructorimpl, currentCompositionLocalMap4);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda5, composerStartRestartGroup, (i16 & 112) | (i16 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier8;
                        mutableInteractionSource3 = mutableInteractionSource7;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z11;
                        function4 = function8;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs5 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        Modifier modifier9 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z12 = z4;
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function9 = function3;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1320constructorimpl, currentCompositionLocalMap5);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda6, composerStartRestartGroup, (i17 & 112) | (i17 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier9;
                        mutableInteractionSource3 = mutableInteractionSource8;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z12;
                        function4 = function9;
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
                            NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs6 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    Modifier modifier10 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z13 = z4;
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function10 = function3;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1320constructorimpl, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda7, composerStartRestartGroup, (i18 & 112) | (i18 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier10;
                    mutableInteractionSource3 = mutableInteractionSource9;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z13;
                    function4 = function10;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs7 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    Modifier modifier11 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z14 = z4;
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function11 = function3;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1320constructorimpl, currentCompositionLocalMap7);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda8, composerStartRestartGroup, (i19 & 112) | (i19 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier11;
                    mutableInteractionSource3 = mutableInteractionSource10;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z14;
                    function4 = function11;
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
                        NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs8 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        Modifier modifier12 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z15 = z4;
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function12 = function3;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM1320constructorimpl, currentCompositionLocalMap8);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda9, composerStartRestartGroup, (i110 & 112) | (i110 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier12;
                        mutableInteractionSource3 = mutableInteractionSource11;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z15;
                        function4 = function12;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs9 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        Modifier modifier13 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z16 = z4;
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function13 = function3;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM1320constructorimpl, currentCompositionLocalMap9);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda10, composerStartRestartGroup, (i111 & 112) | (i111 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier13;
                        mutableInteractionSource3 = mutableInteractionSource12;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z16;
                        function4 = function13;
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
                            NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs10 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    Modifier modifier14 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z17 = z4;
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function14 = function3;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda11, composerStartRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier14;
                    mutableInteractionSource3 = mutableInteractionSource13;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z17;
                    function4 = function14;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs11 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    Modifier modifier15 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z18 = z4;
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function3;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM1320constructorimpl, currentCompositionLocalMap11);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda12, composerStartRestartGroup, (i113 & 112) | (i113 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier15;
                    mutableInteractionSource3 = mutableInteractionSource14;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z18;
                    function4 = function15;
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
                        NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs12 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    Modifier modifier16 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z19 = z4;
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function3;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM1320constructorimpl, currentCompositionLocalMap12);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda13, composerStartRestartGroup, (i114 & 112) | (i114 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier16;
                    mutableInteractionSource3 = mutableInteractionSource15;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z19;
                    function4 = function16;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs13 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    Modifier modifier17 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z110 = z4;
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function17 = function3;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM1320constructorimpl, currentCompositionLocalMap13);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda14, composerStartRestartGroup, (i115 & 112) | (i115 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier17;
                    mutableInteractionSource3 = mutableInteractionSource16;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z110;
                    function4 = function17;
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
                        NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs14 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                Modifier modifier18 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z111 = z4;
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function18 = function3;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion14, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM1320constructorimpl, currentCompositionLocalMap14);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda15, composerStartRestartGroup, (i116 & 112) | (i116 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier18;
                mutableInteractionSource3 = mutableInteractionSource17;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z111;
                function4 = function18;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs15 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                Modifier modifier19 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z112 = z4;
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function19 = function3;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM1320constructorimpl, currentCompositionLocalMap15);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda16, composerStartRestartGroup, (i117 & 112) | (i117 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier19;
                mutableInteractionSource3 = mutableInteractionSource18;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z112;
                function4 = function19;
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
                    NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs16 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center16 = Alignment.INSTANCE.getCenter();
                        Modifier modifier110 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z113 = z4;
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function110 = function3;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion16, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy16, composerM1320constructorimpl, currentCompositionLocalMap16);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda17, composerStartRestartGroup, (i118 & 112) | (i118 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier110;
                        mutableInteractionSource3 = mutableInteractionSource19;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z113;
                        function4 = function110;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                                i3 &= -234881025;
                            } else {
                                jM1039getPrimary0d7_KjU = j;
                            }
                            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i3 &= -1879048193;
                            } else {
                                jM1680copywmQWz5c$default = j2;
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
                                    TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                        Modifier modifierM525size3ABfNKs17 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                        Alignment center17 = Alignment.INSTANCE.getCenter();
                        Modifier modifier111 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        boolean z114 = z4;
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        Function2<? super Composer, ? super Integer, Unit> function111 = function3;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion17, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy17, composerM1320constructorimpl, currentCompositionLocalMap17);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                        m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda18, composerStartRestartGroup, (i119 & 112) | (i119 & 14) | 3072 | ((i3 << 6) & 896));
                        if (OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier111;
                        mutableInteractionSource3 = mutableInteractionSource110;
                        j3 = jM1039getPrimary0d7_KjU;
                        z6 = z5;
                        j4 = jM1680copywmQWz5c$default;
                        z7 = z114;
                        function4 = function111;
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
                            NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs18 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center18 = Alignment.INSTANCE.getCenter();
                    Modifier modifier112 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource111 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z115 = z4;
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function112 = function3;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion18, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy18, composerM1320constructorimpl, currentCompositionLocalMap18);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda19, composerStartRestartGroup, (i1110 & 112) | (i1110 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier112;
                    mutableInteractionSource3 = mutableInteractionSource111;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z115;
                    function4 = function112;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs19 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center19 = Alignment.INSTANCE.getCenter();
                    Modifier modifier113 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource112 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z116 = z4;
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function113 = function3;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy19, composerM1320constructorimpl, currentCompositionLocalMap19);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda110, composerStartRestartGroup, (i1111 & 112) | (i1111 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier113;
                    mutableInteractionSource3 = mutableInteractionSource112;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z116;
                    function4 = function113;
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
                        NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs110 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center110 = Alignment.INSTANCE.getCenter();
                    Modifier modifier114 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource113 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z117 = z4;
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function3;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion110, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy110, composerM1320constructorimpl, currentCompositionLocalMap110);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda111, composerStartRestartGroup, (i1112 & 112) | (i1112 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier114;
                    mutableInteractionSource3 = mutableInteractionSource113;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z117;
                    function4 = function114;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs111 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center111 = Alignment.INSTANCE.getCenter();
                    Modifier modifier115 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource114 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z118 = z4;
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function115 = function3;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy111, composerM1320constructorimpl, currentCompositionLocalMap111);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda112, composerStartRestartGroup, (i1113 & 112) | (i1113 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier115;
                    mutableInteractionSource3 = mutableInteractionSource114;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z118;
                    function4 = function115;
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
                        NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs112 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center112 = Alignment.INSTANCE.getCenter();
                Modifier modifier116 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource115 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z119 = z4;
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function116 = function3;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion112, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy112, composerM1320constructorimpl, currentCompositionLocalMap112);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda113, composerStartRestartGroup, (i1114 & 112) | (i1114 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier116;
                mutableInteractionSource3 = mutableInteractionSource115;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z119;
                function4 = function116;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs113 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center113 = Alignment.INSTANCE.getCenter();
                Modifier modifier117 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource116 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z1110 = z4;
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function117 = function3;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy113, composerM1320constructorimpl, currentCompositionLocalMap113);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda114, composerStartRestartGroup, (i1115 & 112) | (i1115 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier117;
                mutableInteractionSource3 = mutableInteractionSource116;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z1110;
                function4 = function117;
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
                    NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs114 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center114 = Alignment.INSTANCE.getCenter();
                    Modifier modifier118 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource117 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z1111 = z4;
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function118 = function3;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion114, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy114, composerM1320constructorimpl, currentCompositionLocalMap114);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda115, composerStartRestartGroup, (i1116 & 112) | (i1116 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier118;
                    mutableInteractionSource3 = mutableInteractionSource117;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z1111;
                    function4 = function118;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                            jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            jM1039getPrimary0d7_KjU = j;
                        }
                        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                        } else {
                            jM1680copywmQWz5c$default = j2;
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
                                TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                    Modifier modifierM525size3ABfNKs115 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                    Alignment center115 = Alignment.INSTANCE.getCenter();
                    Modifier modifier119 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource118 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    boolean z1112 = z4;
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    Function2<? super Composer, ? super Integer, Unit> function119 = function3;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion115, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy115, composerM1320constructorimpl, currentCompositionLocalMap115);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                    m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda116, composerStartRestartGroup, (i1117 & 112) | (i1117 & 14) | 3072 | ((i3 << 6) & 896));
                    if (OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier119;
                    mutableInteractionSource3 = mutableInteractionSource118;
                    j3 = jM1039getPrimary0d7_KjU;
                    z6 = z5;
                    j4 = jM1680copywmQWz5c$default;
                    z7 = z1112;
                    function4 = function119;
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
                        NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs116 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center116 = Alignment.INSTANCE.getCenter();
                Modifier modifier1110 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource119 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z1113 = z4;
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function1110 = function3;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion116, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy116, composerM1320constructorimpl, currentCompositionLocalMap116);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda117, composerStartRestartGroup, (i1118 & 112) | (i1118 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1110;
                mutableInteractionSource3 = mutableInteractionSource119;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z1113;
                function4 = function1110;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs117 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center117 = Alignment.INSTANCE.getCenter();
                Modifier modifier1111 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource1110 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z1114 = z4;
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function1111 = function3;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy117, composerM1320constructorimpl, currentCompositionLocalMap117);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda118, composerStartRestartGroup, (i1119 & 112) | (i1119 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1111;
                mutableInteractionSource3 = mutableInteractionSource1110;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z1114;
                function4 = function1111;
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
                    NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs118 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center118 = Alignment.INSTANCE.getCenter();
                Modifier modifier1112 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource1111 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z1115 = z4;
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function1112 = function3;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion118, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy118, composerM1320constructorimpl, currentCompositionLocalMap118);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda119, composerStartRestartGroup, (i11110 & 112) | (i11110 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1112;
                mutableInteractionSource3 = mutableInteractionSource1111;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z1115;
                function4 = function1112;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                        jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                        i3 &= -234881025;
                    } else {
                        jM1039getPrimary0d7_KjU = j;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -1879048193;
                    } else {
                        jM1680copywmQWz5c$default = j2;
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
                            TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
                Modifier modifierM525size3ABfNKs119 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
                Alignment center119 = Alignment.INSTANCE.getCenter();
                Modifier modifier1113 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource1112 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                boolean z1116 = z4;
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                Function2<? super Composer, ? super Integer, Unit> function1113 = function3;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion119, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy119, composerM1320constructorimpl, currentCompositionLocalMap119);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
                m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda1110, composerStartRestartGroup, (i11111 & 112) | (i11111 & 14) | 3072 | ((i3 << 6) & 896));
                if (OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1113;
                mutableInteractionSource3 = mutableInteractionSource1112;
                j3 = jM1039getPrimary0d7_KjU;
                z6 = z5;
                j4 = jM1680copywmQWz5c$default;
                z7 = z1116;
                function4 = function1113;
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
                    NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1039getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -1879048193;
                } else {
                    jM1680copywmQWz5c$default = j2;
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
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1039getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -1879048193;
                } else {
                    jM1680copywmQWz5c$default = j2;
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
                        TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
            Modifier modifierM525size3ABfNKs1110 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
            Alignment center1110 = Alignment.INSTANCE.getCenter();
            Modifier modifier1114 = modifier3;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MutableInteractionSource mutableInteractionSource1113 = mutableInteractionSource2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            boolean z1117 = z4;
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            Function2<? super Composer, ? super Integer, Unit> function1114 = function3;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1110, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy1110, composerM1320constructorimpl, currentCompositionLocalMap1110);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
            m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda1111, composerStartRestartGroup, (i11112 & 112) | (i11112 & 14) | 3072 | ((i3 << 6) & 896));
            if (OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier1114;
            mutableInteractionSource3 = mutableInteractionSource1113;
            j3 = jM1039getPrimary0d7_KjU;
            z6 = z5;
            j4 = jM1680copywmQWz5c$default;
            z7 = z1117;
            function4 = function1114;
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
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1039getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -1879048193;
                } else {
                    jM1680copywmQWz5c$default = j2;
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
                    jM1039getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1039getPrimary0d7_KjU();
                    i3 &= -234881025;
                } else {
                    jM1039getPrimary0d7_KjU = j;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -1879048193;
                } else {
                    jM1680copywmQWz5c$default = j2;
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
                        TextKt.ProvideTextStyle(caption.m3338copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), function3, composer2, (i3 >> 12) & 112);
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
            Modifier modifierM525size3ABfNKs1111 = SizeKt.m525size3ABfNKs(SelectableKt.m700selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, jM1039getPrimary0d7_KjU, composerStartRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m3158boximpl(Role.INSTANCE.m3171getTabo7Vup1c()), onClick), f);
            Alignment center1111 = Alignment.INSTANCE.getCenter();
            Modifier modifier1115 = modifier3;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MutableInteractionSource mutableInteractionSource1114 = mutableInteractionSource2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            boolean z1118 = z4;
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            Function2<? super Composer, ? super Integer, Unit> function1115 = function3;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy1111, composerM1320constructorimpl, currentCompositionLocalMap1111);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
            m1140NavigationRailTransitionKlgxPg(jM1039getPrimary0d7_KjU, jM1680copywmQWz5c$default, z, composableLambda1112, composerStartRestartGroup, (i11113 & 112) | (i11113 & 14) | 3072 | ((i3 << 6) & 896));
            if (OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier1115;
            mutableInteractionSource3 = mutableInteractionSource1114;
            j3 = jM1039getPrimary0d7_KjU;
            z6 = z5;
            j4 = jM1680copywmQWz5c$default;
            z7 = z1118;
            function4 = function1115;
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
                NavigationRailKt.m1139NavigationRailItem0S3VyRs(z, onClick, icon, modifier4, z7, function4, z6, mutableInteractionSource3, j3, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, final float f, Composer composer, final int i) {
        int i2;
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
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903861684, i2, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:258)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    Placeable placeableMo2804measureBRTryo0;
                    Measurable measurable;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable2 : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                            Placeable placeableMo2804measureBRTryo1 = measurable2.mo2804measureBRTryo0(j);
                            if (function3 != null) {
                                Iterator<T> it = measurables.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    measurable = (Measurable) it.next();
                                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "label"));
                                placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            } else {
                                placeableMo2804measureBRTryo0 = null;
                            }
                            if (function3 == null) {
                                return NavigationRailKt.m1144placeIcon3p2s80s(Layout, placeableMo2804measureBRTryo1, j);
                            }
                            Intrinsics.checkNotNull(placeableMo2804measureBRTryo0);
                            return NavigationRailKt.m1145placeLabelAndIconDIyivk0(Layout, placeableMo2804measureBRTryo0, placeableMo2804measureBRTryo1, j, f);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i3);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(286683862);
            if (function3 != null) {
                Modifier modifierAlpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlpha);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                OooO00o.OooO00o((i2 >> 3) & 14, function3, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                NavigationRailKt.NavigationRailItemBaselineLayout(function2, function3, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* JADX INFO: renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1140NavigationRailTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
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
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, i3, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:226)");
            }
            composer2 = composerStartRestartGroup;
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            long jM1732lerpjxsXWHM = ColorKt.m1732lerpjxsXWHM(j2, j, NavigationRailTransition_Klgx_Pg$lambda$3(stateAnimateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1671boximpl(Color.m1680copywmQWz5c$default(jM1732lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1683getAlphaimpl(jM1732lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -1688205042, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
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

                @Composable
                public final void invoke(@Nullable Composer composer3, int i4) {
                    if ((i4 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1688205042, i4, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:242)");
                    }
                    function3.invoke(Float.valueOf(NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$3(stateAnimateFloatAsState)), composer3, Integer.valueOf((i3 >> 6) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i4) {
                NavigationRailKt.m1140NavigationRailTransitionKlgxPg(j, j2, z, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1144placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        final int iMax = Math.max(0, (Constraints.m3743getMaxWidthimpl(j) - placeable.getWidth()) / 2);
        final int iMax2 = Math.max(0, (Constraints.m3742getMaxHeightimpl(j) - placeable.getHeight()) / 2);
        return MeasureScope.CC.OooOOo0(measureScope, Constraints.m3743getMaxWidthimpl(j), Constraints.m3742getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
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
    public static final MeasureResult m1145placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        final int iM3742getMaxHeightimpl = (Constraints.m3742getMaxHeightimpl(j) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo320roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int iM3743getMaxWidthimpl = (Constraints.m3743getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        final int iMo320roundToPx0680j_4 = measureScope.mo320roundToPx0680j_4(ItemIconTopOffset);
        int iM3742getMaxHeightimpl2 = (Constraints.m3742getMaxHeightimpl(j) - placeable2.getHeight()) / 2;
        final int iM3743getMaxWidthimpl2 = (Constraints.m3743getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        final int iRoundToInt = MathKt.roundToInt((1 - f) * (iM3742getMaxHeightimpl2 - iMo320roundToPx0680j_4));
        return MeasureScope.CC.OooOOo0(measureScope, Constraints.m3743getMaxWidthimpl(j), Constraints.m3742getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
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
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, iM3743getMaxWidthimpl, iM3742getMaxHeightimpl + iRoundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, iM3743getMaxWidthimpl2, iMo320roundToPx0680j_4 + iRoundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
