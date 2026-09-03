package androidx.compose.material;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a¢\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n154#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n508#1:518\n*E\n"})
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m3775constructorimpl(90);

    @NotNull
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(SQLiteDatabase.MAX_SQL_CACHE_SIZE, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Code duplicated, block: B:105:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:118:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0184  */
    /* JADX WARN: Code duplicated, block: B:126:0x0194  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m1230ScrollableTabRowsKfQg0A(final int i, @Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primarySurface;
        long jM1057contentColorForek8zF_U;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        float fM1229getScrollableTabRowPaddingD9Ej5fM;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M1071getLambda2$material_release;
        int i12;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473476840);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i15 = composerStartRestartGroup.changed(primarySurface) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i4 |= i15;
                } else {
                    primarySurface = j;
                }
                i4 |= i15;
            } else {
                primarySurface = j;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    jM1057contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM1057contentColorForek8zF_U)) {
                        i13 = 2048;
                    }
                    i4 |= i13;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                i13 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i4 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i3 & 128) != 0) {
                    if ((29360128 & i2) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i4) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i3 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            if (i5 != 0) {
                                fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                            } else {
                                fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                            }
                            if (i7 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                        invoke((List<TabPosition>) list, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i16) {
                                        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-655609869, i16, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                            } else {
                                function3ComposableLambda = function3;
                            }
                            if (i9 != 0) {
                                function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                            } else {
                                function2M1071getLambda2$material_release = function2;
                            }
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function6 = function3ComposableLambda;
                            i12 = i4;
                            function4 = function6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier2 = modifier;
                            function2M1071getLambda2$material_release = function2;
                            i12 = i4;
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                            function4 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                        }
                        final float f3 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function2M1071getLambda2$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function8 = function4;
                        final int i16 = i12;
                        SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                    ComposerKt.traceEventStart(1455860572, i17, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                                }
                                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                composer2.startReplaceableGroup(773894976);
                                composer2.startReplaceableGroup(-492369756);
                                Object objRememberedValue = composer2.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                                }
                                composer2.endReplaceableGroup();
                                CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                                boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                final float f4 = f3;
                                final Function2<Composer, Integer, Unit> function9 = tabs;
                                final Function2<Composer, Integer, Unit> function10 = function7;
                                final int i18 = i;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function11 = function8;
                                final int i19 = i16;
                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j3) {
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                        final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f4);
                                        long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j3, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function9);
                                        final ArrayList<Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                        }
                                        final Ref.IntRef intRef = new Ref.IntRef();
                                        intRef.element = iMo320roundToPx0680j_5 * 2;
                                        final Ref.IntRef intRef2 = new Ref.IntRef();
                                        for (Placeable placeable : arrayList) {
                                            intRef.element = placeable.getWidth() + intRef.element;
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        }
                                        int i20 = intRef.element;
                                        int i21 = intRef2.element;
                                        final Function2<Composer, Integer, Unit> function12 = function10;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i22 = i18;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function13 = function11;
                                        final int i23 = i19;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                final ArrayList arrayList2 = new ArrayList();
                                                int i24 = iMo320roundToPx0680j_5;
                                                List<Placeable> list = arrayList;
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                int width = i24;
                                                for (Placeable placeable2 : list) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function12);
                                                long j4 = j3;
                                                Ref.IntRef intRef3 = intRef;
                                                Ref.IntRef intRef4 = intRef2;
                                                for (Measurable measurable : listSubcompose2) {
                                                    int i25 = intRef3.element;
                                                    Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j4, i25, i25, 0, 0, 8, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    intRef3 = intRef3;
                                                    intRef4 = intRef4;
                                                    j4 = j4;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function14 = function13;
                                                final int i26 = i23;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i27) {
                                                        if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                        }
                                                        function14.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                Ref.IntRef intRef5 = intRef;
                                                Ref.IntRef intRef6 = intRef2;
                                                Iterator<T> it2 = listSubcompose3.iterator();
                                                while (it2.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                            }
                                        }, 4, null);
                                    }
                                }, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function4;
                        f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function5 = function3;
                        function2M1071getLambda2$material_release = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = modifier3;
                    final long j3 = primarySurface;
                    final long j4 = jM1057contentColorForek8zF_U;
                    final float f4 = f2;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function9 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function10 = function2M1071getLambda2$material_release;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                            TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f4, function9, function10, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
                i11 = 12582912;
                i4 |= i11;
                if ((23967451 & i4) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i17) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i17, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function11;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i17) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i17, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function12 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    final float f5 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function13 = function2M1071getLambda2$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function14 = function4;
                    final int i17 = i12;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.traceEventStart(1455860572, i18, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f6 = f5;
                            final Function2<? super Composer, ? super Integer, Unit> function15 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function16 = function13;
                            final int i19 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function14;
                            final int i110 = i17;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j5) {
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f6);
                                    long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j5, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function15);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo320roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList) {
                                        intRef.element = placeable.getWidth() + intRef.element;
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i20 = intRef.element;
                                    int i21 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function18 = function16;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i22 = i19;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function17;
                                    final int i23 = i110;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i24 = iMo320roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int width = i24;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function18);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            for (Measurable measurable : listSubcompose2) {
                                                int i25 = intRef3.element;
                                                Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j6, i25, i25, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j6 = j6;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function110 = function19;
                                            final int i26 = i23;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                public final void invoke(@Nullable Composer composer3, int i27) {
                                                    if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                    }
                                                    function110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it2 = listSubcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i18) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i18, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function15;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i18) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i18, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function16 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function16;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    final float f6 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function17 = function2M1071getLambda2$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function18 = function4;
                    final int i18 = i12;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.traceEventStart(1455860572, i19, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f7 = f6;
                            final Function2<? super Composer, ? super Integer, Unit> function19 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function110 = function17;
                            final int i110 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function18;
                            final int i111 = i18;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j5) {
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f7);
                                    long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j5, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function19);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo320roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList) {
                                        intRef.element = placeable.getWidth() + intRef.element;
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i20 = intRef.element;
                                    int i21 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function112 = function110;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i22 = i110;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function111;
                                    final int i23 = i111;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i24 = iMo320roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int width = i24;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function112);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            for (Measurable measurable : listSubcompose2) {
                                                int i25 = intRef3.element;
                                                Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j6, i25, i25, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j6 = j6;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function113;
                                            final int i26 = i23;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                public final void invoke(@Nullable Composer composer3, int i27) {
                                                    if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                    }
                                                    function114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it2 = listSubcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier3;
                final long j5 = primarySurface;
                final long j6 = jM1057contentColorForek8zF_U;
                final float f7 = f2;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function110 = function2M1071getLambda2$material_release;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                        TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier5, j5, j6, f7, function19, function110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 24576;
            f2 = f;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i19) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i19, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function111;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i19) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i19, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function112 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    final float f8 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function113 = function2M1071getLambda2$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function4;
                    final int i19 = i12;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.traceEventStart(1455860572, i110, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f9 = f8;
                            final Function2<? super Composer, ? super Integer, Unit> function115 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function116 = function113;
                            final int i111 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function117 = function114;
                            final int i112 = i19;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f9);
                                    long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j7, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function115);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo320roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList) {
                                        intRef.element = placeable.getWidth() + intRef.element;
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i20 = intRef.element;
                                    int i21 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function118 = function116;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i22 = i111;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function119 = function117;
                                    final int i23 = i112;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i24 = iMo320roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int width = i24;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function118);
                                            long j8 = j7;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            for (Measurable measurable : listSubcompose2) {
                                                int i25 = intRef3.element;
                                                Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j8, i25, i25, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j8 = j8;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1110 = function119;
                                            final int i26 = i23;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                public final void invoke(@Nullable Composer composer3, int i27) {
                                                    if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                    }
                                                    function1110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it2 = listSubcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i110) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i110, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function115 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function115;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i110) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i110, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function116 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    final float f9 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function117 = function2M1071getLambda2$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function118 = function4;
                    final int i110 = i12;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.traceEventStart(1455860572, i111, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f10 = f9;
                            final Function2<? super Composer, ? super Integer, Unit> function119 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function1110 = function117;
                            final int i112 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111 = function118;
                            final int i113 = i110;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f10);
                                    long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j7, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function119);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo320roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList) {
                                        intRef.element = placeable.getWidth() + intRef.element;
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i20 = intRef.element;
                                    int i21 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function1112 = function1110;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i22 = i112;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1113 = function1111;
                                    final int i23 = i113;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i24 = iMo320roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int width = i24;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function1112);
                                            long j8 = j7;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            for (Measurable measurable : listSubcompose2) {
                                                int i25 = intRef3.element;
                                                Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j8, i25, i25, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j8 = j8;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1114 = function1113;
                                            final int i26 = i23;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                public final void invoke(@Nullable Composer composer3, int i27) {
                                                    if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                    }
                                                    function1114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it2 = listSubcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier3;
                final long j7 = primarySurface;
                final long j8 = jM1057contentColorForek8zF_U;
                final float f10 = f2;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function119 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function1110 = function2M1071getLambda2$material_release;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                        TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier6, j7, j8, f10, function119, function1110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i111) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i111, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1111;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i111) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i111, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1112 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                final float f11 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function1113 = function2M1071getLambda2$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1114 = function4;
                final int i111 = i12;
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.traceEventStart(1455860572, i112, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f12 = f11;
                        final Function2<? super Composer, ? super Integer, Unit> function1115 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function1116 = function1113;
                        final int i113 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1117 = function1114;
                        final int i114 = i111;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f12);
                                long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j9, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function1115);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo320roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList) {
                                    intRef.element = placeable.getWidth() + intRef.element;
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i20 = intRef.element;
                                int i21 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function1118 = function1116;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i22 = i113;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1119 = function1117;
                                final int i23 = i114;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i24 = iMo320roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int width = i24;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function1118);
                                        long j10 = j9;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        for (Measurable measurable : listSubcompose2) {
                                            int i25 = intRef3.element;
                                            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j10, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j10 = j10;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11110 = function1119;
                                        final int i26 = i23;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                            public final void invoke(@Nullable Composer composer3, int i27) {
                                                if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                }
                                                function11110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it2 = listSubcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i112) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i112, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1115 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1115;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i112) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i112, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1116 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                final float f12 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function1117 = function2M1071getLambda2$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1118 = function4;
                final int i112 = i12;
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.traceEventStart(1455860572, i113, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f13 = f12;
                        final Function2<? super Composer, ? super Integer, Unit> function1119 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function11110 = function1117;
                        final int i114 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111 = function1118;
                        final int i115 = i112;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f13);
                                long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j9, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function1119);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo320roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList) {
                                    intRef.element = placeable.getWidth() + intRef.element;
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i20 = intRef.element;
                                int i21 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function11112 = function11110;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i22 = i114;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11113 = function11111;
                                final int i23 = i115;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i24 = iMo320roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int width = i24;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function11112);
                                        long j10 = j9;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        for (Measurable measurable : listSubcompose2) {
                                            int i25 = intRef3.element;
                                            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j10, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j10 = j10;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11114 = function11113;
                                        final int i26 = i23;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                            public final void invoke(@Nullable Composer composer3, int i27) {
                                                if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                }
                                                function11114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it2 = listSubcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier3;
            final long j9 = primarySurface;
            final long j10 = jM1057contentColorForek8zF_U;
            final float f13 = f2;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1119 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function11110 = function2M1071getLambda2$material_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                    TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier7, j9, j10, f13, function1119, function11110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                primarySurface = j;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i4 |= i15;
            } else {
                primarySurface = j;
            }
            i4 |= i15;
        } else {
            primarySurface = j;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                jM1057contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM1057contentColorForek8zF_U)) {
                    i13 = 2048;
                }
                i4 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i13 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i4 |= i13;
        } else {
            jM1057contentColorForek8zF_U = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((57344 & i2) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i113) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i113, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function11111;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i113) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i113, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11112 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function11112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    final float f14 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function11113 = function2M1071getLambda2$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11114 = function4;
                    final int i113 = i12;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.traceEventStart(1455860572, i114, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f15 = f14;
                            final Function2<? super Composer, ? super Integer, Unit> function11115 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function11116 = function11113;
                            final int i115 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11117 = function11114;
                            final int i116 = i113;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j11) {
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f15);
                                    long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j11, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function11115);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo320roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList) {
                                        intRef.element = placeable.getWidth() + intRef.element;
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i20 = intRef.element;
                                    int i21 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function11118 = function11116;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i22 = i115;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11119 = function11117;
                                    final int i23 = i116;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i24 = iMo320roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int width = i24;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function11118);
                                            long j12 = j11;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            for (Measurable measurable : listSubcompose2) {
                                                int i25 = intRef3.element;
                                                Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j12, i25, i25, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j12 = j12;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111110 = function11119;
                                            final int i26 = i23;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                public final void invoke(@Nullable Composer composer3, int i27) {
                                                    if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                    }
                                                    function111110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it2 = listSubcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i114) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i114, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11115 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function11115;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i114) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-655609869, i114, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i9 != 0) {
                            function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                        } else {
                            function2M1071getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11116 = function3ComposableLambda;
                        i12 = i4;
                        function4 = function11116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    final float f15 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function11117 = function2M1071getLambda2$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11118 = function4;
                    final int i114 = i12;
                    SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.traceEventStart(1455860572, i115, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f16 = f15;
                            final Function2<? super Composer, ? super Integer, Unit> function11119 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function111110 = function11117;
                            final int i116 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111 = function11118;
                            final int i117 = i114;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j11) {
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f16);
                                    long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j11, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function11119);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo320roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList) {
                                        intRef.element = placeable.getWidth() + intRef.element;
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i20 = intRef.element;
                                    int i21 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function111112 = function111110;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i22 = i116;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111113 = function111111;
                                    final int i23 = i117;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i24 = iMo320roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int width = i24;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function111112);
                                            long j12 = j11;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            for (Measurable measurable : listSubcompose2) {
                                                int i25 = intRef3.element;
                                                Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j12, i25, i25, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j12 = j12;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111114 = function111113;
                                            final int i26 = i23;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                                public final void invoke(@Nullable Composer composer3, int i27) {
                                                    if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                    }
                                                    function111114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it2 = listSubcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier3;
                final long j11 = primarySurface;
                final long j12 = jM1057contentColorForek8zF_U;
                final float f16 = f2;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11119 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function111110 = function2M1071getLambda2$material_release;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                        TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier8, j11, j12, f16, function11119, function111110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i115) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i115, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function111111;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i115) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i115, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111112 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function111112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                final float f17 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function111113 = function2M1071getLambda2$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111114 = function4;
                final int i115 = i12;
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.traceEventStart(1455860572, i116, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f18 = f17;
                        final Function2<? super Composer, ? super Integer, Unit> function111115 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function111116 = function111113;
                        final int i117 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111117 = function111114;
                        final int i118 = i115;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j13) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f18);
                                long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j13, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function111115);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo320roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList) {
                                    intRef.element = placeable.getWidth() + intRef.element;
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i20 = intRef.element;
                                int i21 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function111118 = function111116;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i22 = i117;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111119 = function111117;
                                final int i23 = i118;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i24 = iMo320roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int width = i24;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function111118);
                                        long j14 = j13;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        for (Measurable measurable : listSubcompose2) {
                                            int i25 = intRef3.element;
                                            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j14, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j14 = j14;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111110 = function111119;
                                        final int i26 = i23;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                            public final void invoke(@Nullable Composer composer3, int i27) {
                                                if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                }
                                                function1111110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it2 = listSubcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i116) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i116, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111115 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function111115;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i116) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i116, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111116 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function111116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                final float f18 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function111117 = function2M1071getLambda2$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111118 = function4;
                final int i116 = i12;
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.traceEventStart(1455860572, i117, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f19 = f18;
                        final Function2<? super Composer, ? super Integer, Unit> function111119 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function1111110 = function111117;
                        final int i118 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111111 = function111118;
                        final int i119 = i116;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j13) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f19);
                                long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j13, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function111119);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo320roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList) {
                                    intRef.element = placeable.getWidth() + intRef.element;
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i20 = intRef.element;
                                int i21 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function1111112 = function1111110;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i22 = i118;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111113 = function1111111;
                                final int i23 = i119;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i24 = iMo320roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int width = i24;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function1111112);
                                        long j14 = j13;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        for (Measurable measurable : listSubcompose2) {
                                            int i25 = intRef3.element;
                                            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j14, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j14 = j14;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111114 = function1111113;
                                        final int i26 = i23;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                            public final void invoke(@Nullable Composer composer3, int i27) {
                                                if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                }
                                                function1111114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it2 = listSubcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier3;
            final long j13 = primarySurface;
            final long j14 = jM1057contentColorForek8zF_U;
            final float f19 = f2;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111119 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function1111110 = function2M1071getLambda2$material_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                    TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier9, j13, j14, f19, function111119, function1111110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 24576;
        f2 = f;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i2 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        if ((i3 & 128) != 0) {
            if ((29360128 & i2) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i4) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i117) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i117, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111111 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1111111;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i117) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i117, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111112 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1111112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                final float f110 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function1111113 = function2M1071getLambda2$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111114 = function4;
                final int i117 = i12;
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.traceEventStart(1455860572, i118, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f111 = f110;
                        final Function2<? super Composer, ? super Integer, Unit> function1111115 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function1111116 = function1111113;
                        final int i119 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111117 = function1111114;
                        final int i1110 = i117;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j15) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f111);
                                long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j15, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function1111115);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo320roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList) {
                                    intRef.element = placeable.getWidth() + intRef.element;
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i20 = intRef.element;
                                int i21 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function1111118 = function1111116;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i22 = i119;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111119 = function1111117;
                                final int i23 = i1110;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i24 = iMo320roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int width = i24;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function1111118);
                                        long j16 = j15;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        for (Measurable measurable : listSubcompose2) {
                                            int i25 = intRef3.element;
                                            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j16, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j16 = j16;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111110 = function1111119;
                                        final int i26 = i23;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                            public final void invoke(@Nullable Composer composer3, int i27) {
                                                if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                }
                                                function11111110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it2 = listSubcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i118) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i118, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111115 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1111115;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i118) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-655609869, i118, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i9 != 0) {
                        function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                    } else {
                        function2M1071getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111116 = function3ComposableLambda;
                    i12 = i4;
                    function4 = function1111116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                final float f111 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function1111117 = function2M1071getLambda2$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111118 = function4;
                final int i118 = i12;
                SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.traceEventStart(1455860572, i119, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f112 = f111;
                        final Function2<? super Composer, ? super Integer, Unit> function1111119 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function11111110 = function1111117;
                        final int i1110 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111111 = function1111118;
                        final int i1111 = i118;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j15) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f112);
                                long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j15, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function1111119);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo320roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList) {
                                    intRef.element = placeable.getWidth() + intRef.element;
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i20 = intRef.element;
                                int i21 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function11111112 = function11111110;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i22 = i1110;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111113 = function11111111;
                                final int i23 = i1111;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i24 = iMo320roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int width = i24;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function11111112);
                                        long j16 = j15;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        for (Measurable measurable : listSubcompose2) {
                                            int i25 = intRef3.element;
                                            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j16, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j16 = j16;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111114 = function11111113;
                                        final int i26 = i23;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                            public final void invoke(@Nullable Composer composer3, int i27) {
                                                if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                                }
                                                function11111114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it2 = listSubcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier3;
            final long j15 = primarySurface;
            final long j16 = jM1057contentColorForek8zF_U;
            final float f112 = f2;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111119 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function11111110 = function2M1071getLambda2$material_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                public final void invoke(@Nullable Composer composer2, int i119) {
                    TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier10, j15, j16, f112, function1111119, function11111110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i11 = 12582912;
        i4 |= i11;
        if ((23967451 & i4) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i119) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-655609869, i119, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                } else {
                    function2M1071getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111111 = function3ComposableLambda;
                i12 = i4;
                function4 = function11111111;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i119) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-655609869, i119, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                } else {
                    function2M1071getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111112 = function3ComposableLambda;
                i12 = i4;
                function4 = function11111112;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
            }
            final float f113 = fM1229getScrollableTabRowPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function11111113 = function2M1071getLambda2$material_release;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111114 = function4;
            final int i119 = i12;
            SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        ComposerKt.traceEventStart(1455860572, i1110, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                    }
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    composer2.startReplaceableGroup(773894976);
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                    }
                    composer2.endReplaceableGroup();
                    CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                    boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                    final float f114 = f113;
                    final Function2<? super Composer, ? super Integer, Unit> function11111115 = tabs;
                    final Function2<? super Composer, ? super Integer, Unit> function11111116 = function11111113;
                    final int i1111 = i;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111117 = function11111114;
                    final int i1112 = i119;
                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j17) {
                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                            int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                            final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f114);
                            long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j17, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                            List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function11111115);
                            final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                            Iterator<T> it = listSubcompose.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                            }
                            final Ref.IntRef intRef = new Ref.IntRef();
                            intRef.element = iMo320roundToPx0680j_5 * 2;
                            final Ref.IntRef intRef2 = new Ref.IntRef();
                            for (Placeable placeable : arrayList) {
                                intRef.element = placeable.getWidth() + intRef.element;
                                intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                            }
                            int i20 = intRef.element;
                            int i21 = intRef2.element;
                            final Function2<? super Composer, ? super Integer, Unit> function11111118 = function11111116;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i22 = i1111;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111119 = function11111117;
                            final int i23 = i1112;
                            return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int i24 = iMo320roundToPx0680j_5;
                                    List<Placeable> list = arrayList;
                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                    int width = i24;
                                    for (Placeable placeable2 : list) {
                                        Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                        arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                        width += placeable2.getWidth();
                                    }
                                    List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function11111118);
                                    long j18 = j17;
                                    Ref.IntRef intRef3 = intRef;
                                    Ref.IntRef intRef4 = intRef2;
                                    for (Measurable measurable : listSubcompose2) {
                                        int i25 = intRef3.element;
                                        Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j18, i25, i25, 0, 0, 8, null));
                                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        intRef3 = intRef3;
                                        intRef4 = intRef4;
                                        j18 = j18;
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111110 = function11111119;
                                    final int i26 = i23;
                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                        public final void invoke(@Nullable Composer composer3, int i27) {
                                            if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                            }
                                            function111111110.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    Ref.IntRef intRef5 = intRef;
                                    Ref.IntRef intRef6 = intRef2;
                                    Iterator<T> it2 = listSubcompose3.iterator();
                                    while (it2.hasNext()) {
                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                }
                            }, 4, null);
                        }
                    }, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function4;
            f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i1110) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-655609869, i1110, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                } else {
                    function2M1071getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111115 = function3ComposableLambda;
                i12 = i4;
                function4 = function11111115;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m1229getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM1229getScrollableTabRowPaddingD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i1110) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-655609869, i1110, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function3;
                }
                if (i9 != 0) {
                    function2M1071getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1071getLambda2$material_release();
                } else {
                    function2M1071getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111116 = function3ComposableLambda;
                i12 = i4;
                function4 = function11111116;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473476840, i12, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
            }
            final float f114 = fM1229getScrollableTabRowPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function11111117 = function2M1071getLambda2$material_release;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111118 = function4;
            final int i1110 = i12;
            SurfaceKt.m1201SurfaceFjzlyU(modifier2, null, primarySurface, jM1057contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        ComposerKt.traceEventStart(1455860572, i1111, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                    }
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    composer2.startReplaceableGroup(773894976);
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                    }
                    composer2.endReplaceableGroup();
                    CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue, composer2, 511388516);
                    boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScopeOooO00o);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScopeOooO00o);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                    final float f115 = f114;
                    final Function2<? super Composer, ? super Integer, Unit> function11111119 = tabs;
                    final Function2<? super Composer, ? super Integer, Unit> function111111110 = function11111117;
                    final int i1112 = i;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111111 = function11111118;
                    final int i1113 = i1110;
                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m1232invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m1232invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j17) {
                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                            int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                            final int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(f115);
                            long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j17, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
                            List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function11111119);
                            final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                            Iterator<T> it = listSubcompose.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
                            }
                            final Ref.IntRef intRef = new Ref.IntRef();
                            intRef.element = iMo320roundToPx0680j_5 * 2;
                            final Ref.IntRef intRef2 = new Ref.IntRef();
                            for (Placeable placeable : arrayList) {
                                intRef.element = placeable.getWidth() + intRef.element;
                                intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                            }
                            int i20 = intRef.element;
                            int i21 = intRef2.element;
                            final Function2<? super Composer, ? super Integer, Unit> function111111112 = function111111110;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i22 = i1112;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111113 = function111111111;
                            final int i23 = i1113;
                            return MeasureScope.CC.OooOOo0(SubcomposeLayout, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int i24 = iMo320roundToPx0680j_5;
                                    List<Placeable> list = arrayList;
                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                    int width = i24;
                                    for (Placeable placeable2 : list) {
                                        Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, 0, 0.0f, 4, null);
                                        arrayList2.add(new TabPosition(subcomposeMeasureScope.mo323toDpu2uoSUM(width), subcomposeMeasureScope.mo323toDpu2uoSUM(placeable2.getWidth()), null));
                                        width += placeable2.getWidth();
                                    }
                                    List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function111111112);
                                    long j18 = j17;
                                    Ref.IntRef intRef3 = intRef;
                                    Ref.IntRef intRef4 = intRef2;
                                    for (Measurable measurable : listSubcompose2) {
                                        int i25 = intRef3.element;
                                        Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j18, i25, i25, 0, 0, 8, null));
                                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef4.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        intRef3 = intRef3;
                                        intRef4 = intRef4;
                                        j18 = j18;
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111114 = function111111113;
                                    final int i26 = i23;
                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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
                                        public final void invoke(@Nullable Composer composer3, int i27) {
                                            if ((i27 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(230769237, i27, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                                            }
                                            function111111114.invoke(arrayList2, composer3, Integer.valueOf(((i26 >> 12) & 112) | 8));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    Ref.IntRef intRef5 = intRef;
                                    Ref.IntRef intRef6 = intRef2;
                                    Iterator<T> it2 = listSubcompose3.iterator();
                                    while (it2.hasNext()) {
                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.onLaidOut(SubcomposeLayout, iMo320roundToPx0680j_5, arrayList2, i22);
                                }
                            }, 4, null);
                        }
                    }, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function4;
            f2 = fM1229getScrollableTabRowPaddingD9Ej5fM;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier3;
        final long j17 = primarySurface;
        final long j18 = jM1057contentColorForek8zF_U;
        final float f115 = f2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111119 = function5;
        final Function2<? super Composer, ? super Integer, Unit> function111111110 = function2M1071getLambda2$material_release;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

            public final void invoke(@Nullable Composer composer2, int i1111) {
                TabRowKt.m1230ScrollableTabRowsKfQg0A(i, modifier11, j17, j18, f115, function11111119, function111111110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x014b  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m1231TabRowpAZo6Ak(final int i, @Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primarySurface;
        long jM1057contentColorForek8zF_U;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4;
        int i6;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function2M1070getLambda1$material_release;
        int i8;
        int i9;
        Modifier modifier2;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        final int i10;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-249175289);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i13 = composerStartRestartGroup.changed(primarySurface) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i4 |= i13;
                } else {
                    primarySurface = j;
                }
                i4 |= i13;
            } else {
                primarySurface = j;
            }
            if ((i2 & 7168) == 0) {
                jM1057contentColorForek8zF_U = j2;
                if ((i3 & 8) == 0 || !composerStartRestartGroup.changed(jM1057contentColorForek8zF_U)) {
                    i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                } else {
                    i11 = 2048;
                }
                i4 |= i11;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        function2M1070getLambda1$material_release = function2;
                        if (composerStartRestartGroup.changedInstance(function2M1070getLambda1$material_release)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 64) != 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i3 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            if (i5 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                        invoke((List<TabPosition>) list, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i7 != 0) {
                                function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                            }
                            function5 = function3ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier2 = modifier;
                            function5 = function4;
                        }
                        long j3 = jM1057contentColorForek8zF_U;
                        i10 = i4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                        }
                        function6 = function2M1070getLambda1$material_release;
                        SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j3, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                    ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                final Function2<Composer, Integer, Unit> function7 = tabs;
                                final Function2<Composer, Integer, Unit> function8 = function2M1070getLambda1$material_release;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function9 = function5;
                                final int i15 = i10;
                                composer2.startReplaceableGroup(1618982084);
                                boolean zChanged = composer2.changed(function7) | composer2.changed(function8) | composer2.changed(function9);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        @NotNull
                                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j4) {
                                            Object next;
                                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                            final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j4);
                                            List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function7);
                                            int size = listSubcompose.size();
                                            final int i16 = iM3743getMaxWidthimpl / size;
                                            final ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                            Iterator<T> it = listSubcompose.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j4, i16, i16, 0, 0, 12, null)));
                                            }
                                            Iterator it2 = arrayList.iterator();
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (it2.hasNext()) {
                                                    int height = ((Placeable) next).getHeight();
                                                    do {
                                                        Object next2 = it2.next();
                                                        int height2 = ((Placeable) next2).getHeight();
                                                        if (height < height2) {
                                                            next = next2;
                                                            height = height2;
                                                        }
                                                    } while (it2.hasNext());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            Placeable placeable = (Placeable) next;
                                            int height3 = placeable != null ? placeable.getHeight() : 0;
                                            final ArrayList arrayList2 = new ArrayList(size);
                                            for (int i17 = 0; i17 < size; i17++) {
                                                arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                            }
                                            final Function2<Composer, Integer, Unit> function10 = function8;
                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function11 = function9;
                                            final int i18 = i15;
                                            final int i19 = height3;
                                            return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
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
                                                    List<Placeable> list = arrayList;
                                                    int i20 = i16;
                                                    int i21 = 0;
                                                    for (Object obj : list) {
                                                        int i22 = i21 + 1;
                                                        if (i21 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                        i21 = i22;
                                                    }
                                                    List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function10);
                                                    long j5 = j4;
                                                    int i23 = i19;
                                                    Iterator<T> it3 = listSubcompose2.iterator();
                                                    while (it3.hasNext()) {
                                                        Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        i23 = i23;
                                                        j5 = j5;
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function12 = function11;
                                                    final List<TabPosition> list2 = arrayList2;
                                                    final int i24 = i18;
                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                        public final void invoke(@Nullable Composer composer3, int i25) {
                                                            if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                            }
                                                            function12.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i25 = iM3743getMaxWidthimpl;
                                                    int i26 = i19;
                                                    Iterator<T> it4 = listSubcompose3.iterator();
                                                    while (it4.hasNext()) {
                                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM1057contentColorForek8zF_U = j3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function5 = function4;
                        function6 = function2M1070getLambda1$material_release;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = modifier3;
                    final long j4 = primarySurface;
                    final long j5 = jM1057contentColorForek8zF_U;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function7 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function8 = function6;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                            TabRowKt.m1231TabRowpAZo6Ak(i, modifier4, j4, j5, function7, function8, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
                i4 |= 196608;
                function2M1070getLambda1$material_release = function2;
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i4 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j6 = jM1057contentColorForek8zF_U;
                    i10 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M1070getLambda1$material_release;
                    SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j6, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function9 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function2M1070getLambda1$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11 = function5;
                            final int i15 = i10;
                            composer2.startReplaceableGroup(1618982084);
                            boolean zChanged = composer2.changed(function9) | composer2.changed(function10) | composer2.changed(function11);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                        Object next;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j7);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function9);
                                        int size = listSubcompose.size();
                                        final int i16 = iM3743getMaxWidthimpl / size;
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j7, i16, i16, 0, 0, 12, null)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                int height = ((Placeable) next).getHeight();
                                                do {
                                                    Object next2 = it2.next();
                                                    int height2 = ((Placeable) next2).getHeight();
                                                    if (height < height2) {
                                                        next = next2;
                                                        height = height2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Placeable placeable = (Placeable) next;
                                        int height3 = placeable != null ? placeable.getHeight() : 0;
                                        final List<TabPosition> arrayList2 = new ArrayList(size);
                                        for (int i17 = 0; i17 < size; i17++) {
                                            arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function11;
                                        final int i18 = i15;
                                        final int i19 = height3;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                List<Placeable> list = arrayList;
                                                int i20 = i16;
                                                int i21 = 0;
                                                for (Object obj : list) {
                                                    int i22 = i21 + 1;
                                                    if (i21 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                    i21 = i22;
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function12);
                                                long j8 = j7;
                                                int i23 = i19;
                                                Iterator<T> it3 = listSubcompose2.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i23 = i23;
                                                    j8 = j8;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function14 = function13;
                                                final List<TabPosition> list2 = arrayList2;
                                                final int i24 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                        }
                                                        function14.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i25 = iM3743getMaxWidthimpl;
                                                int i26 = i19;
                                                Iterator<T> it4 = listSubcompose3.iterator();
                                                while (it4.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM1057contentColorForek8zF_U = j6;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j7 = jM1057contentColorForek8zF_U;
                    i10 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M1070getLambda1$material_release;
                    SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j7, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function9 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function2M1070getLambda1$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11 = function5;
                            final int i15 = i10;
                            composer2.startReplaceableGroup(1618982084);
                            boolean zChanged = composer2.changed(function9) | composer2.changed(function10) | composer2.changed(function11);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j8) {
                                        Object next;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j8);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function9);
                                        int size = listSubcompose.size();
                                        final int i16 = iM3743getMaxWidthimpl / size;
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j8, i16, i16, 0, 0, 12, null)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                int height = ((Placeable) next).getHeight();
                                                do {
                                                    Object next2 = it2.next();
                                                    int height2 = ((Placeable) next2).getHeight();
                                                    if (height < height2) {
                                                        next = next2;
                                                        height = height2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Placeable placeable = (Placeable) next;
                                        int height3 = placeable != null ? placeable.getHeight() : 0;
                                        final List<TabPosition> arrayList2 = new ArrayList(size);
                                        for (int i17 = 0; i17 < size; i17++) {
                                            arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function11;
                                        final int i18 = i15;
                                        final int i19 = height3;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                List<Placeable> list = arrayList;
                                                int i20 = i16;
                                                int i21 = 0;
                                                for (Object obj : list) {
                                                    int i22 = i21 + 1;
                                                    if (i21 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                    i21 = i22;
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function12);
                                                long j9 = j8;
                                                int i23 = i19;
                                                Iterator<T> it3 = listSubcompose2.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j9, 0, 0, 0, 0, 11, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i23 = i23;
                                                    j9 = j9;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function14 = function13;
                                                final List<TabPosition> list2 = arrayList2;
                                                final int i24 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                        }
                                                        function14.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i25 = iM3743getMaxWidthimpl;
                                                int i26 = i19;
                                                Iterator<T> it4 = listSubcompose3.iterator();
                                                while (it4.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM1057contentColorForek8zF_U = j7;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier3;
                final long j8 = primarySurface;
                final long j9 = jM1057contentColorForek8zF_U;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function9 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                        TabRowKt.m1231TabRowpAZo6Ak(i, modifier5, j8, j9, function9, function10, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 24576;
            function4 = function3;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    function2M1070getLambda1$material_release = function2;
                    if (composerStartRestartGroup.changedInstance(function2M1070getLambda1$material_release)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i4 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j10 = jM1057contentColorForek8zF_U;
                    i10 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M1070getLambda1$material_release;
                    SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j10, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function11 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function2M1070getLambda1$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function5;
                            final int i15 = i10;
                            composer2.startReplaceableGroup(1618982084);
                            boolean zChanged = composer2.changed(function11) | composer2.changed(function12) | composer2.changed(function13);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j11) {
                                        Object next;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j11);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function11);
                                        int size = listSubcompose.size();
                                        final int i16 = iM3743getMaxWidthimpl / size;
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j11, i16, i16, 0, 0, 12, null)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                int height = ((Placeable) next).getHeight();
                                                do {
                                                    Object next2 = it2.next();
                                                    int height2 = ((Placeable) next2).getHeight();
                                                    if (height < height2) {
                                                        next = next2;
                                                        height = height2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Placeable placeable = (Placeable) next;
                                        int height3 = placeable != null ? placeable.getHeight() : 0;
                                        final List<TabPosition> arrayList2 = new ArrayList(size);
                                        for (int i17 = 0; i17 < size; i17++) {
                                            arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function14 = function12;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function13;
                                        final int i18 = i15;
                                        final int i19 = height3;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                List<Placeable> list = arrayList;
                                                int i20 = i16;
                                                int i21 = 0;
                                                for (Object obj : list) {
                                                    int i22 = i21 + 1;
                                                    if (i21 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                    i21 = i22;
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function14);
                                                long j12 = j11;
                                                int i23 = i19;
                                                Iterator<T> it3 = listSubcompose2.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j12, 0, 0, 0, 0, 11, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i23 = i23;
                                                    j12 = j12;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function16 = function15;
                                                final List<TabPosition> list2 = arrayList2;
                                                final int i24 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                        }
                                                        function16.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i25 = iM3743getMaxWidthimpl;
                                                int i26 = i19;
                                                Iterator<T> it4 = listSubcompose3.iterator();
                                                while (it4.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM1057contentColorForek8zF_U = j10;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j11 = jM1057contentColorForek8zF_U;
                    i10 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M1070getLambda1$material_release;
                    SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j11, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function11 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function2M1070getLambda1$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function5;
                            final int i15 = i10;
                            composer2.startReplaceableGroup(1618982084);
                            boolean zChanged = composer2.changed(function11) | composer2.changed(function12) | composer2.changed(function13);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j12) {
                                        Object next;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j12);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function11);
                                        int size = listSubcompose.size();
                                        final int i16 = iM3743getMaxWidthimpl / size;
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j12, i16, i16, 0, 0, 12, null)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                int height = ((Placeable) next).getHeight();
                                                do {
                                                    Object next2 = it2.next();
                                                    int height2 = ((Placeable) next2).getHeight();
                                                    if (height < height2) {
                                                        next = next2;
                                                        height = height2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Placeable placeable = (Placeable) next;
                                        int height3 = placeable != null ? placeable.getHeight() : 0;
                                        final List<TabPosition> arrayList2 = new ArrayList(size);
                                        for (int i17 = 0; i17 < size; i17++) {
                                            arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function14 = function12;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function13;
                                        final int i18 = i15;
                                        final int i19 = height3;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                List<Placeable> list = arrayList;
                                                int i20 = i16;
                                                int i21 = 0;
                                                for (Object obj : list) {
                                                    int i22 = i21 + 1;
                                                    if (i21 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                    i21 = i22;
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function14);
                                                long j13 = j12;
                                                int i23 = i19;
                                                Iterator<T> it3 = listSubcompose2.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j13, 0, 0, 0, 0, 11, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i23 = i23;
                                                    j13 = j13;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function16 = function15;
                                                final List<TabPosition> list2 = arrayList2;
                                                final int i24 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                        }
                                                        function16.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i25 = iM3743getMaxWidthimpl;
                                                int i26 = i19;
                                                Iterator<T> it4 = listSubcompose3.iterator();
                                                while (it4.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM1057contentColorForek8zF_U = j11;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier3;
                final long j12 = primarySurface;
                final long j13 = jM1057contentColorForek8zF_U;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function12 = function6;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                        TabRowKt.m1231TabRowpAZo6Ak(i, modifier6, j12, j13, function11, function12, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 196608;
            function2M1070getLambda1$material_release = function2;
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i4 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j14 = jM1057contentColorForek8zF_U;
                i10 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M1070getLambda1$material_release;
                SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function13 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function2M1070getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function5;
                        final int i15 = i10;
                        composer2.startReplaceableGroup(1618982084);
                        boolean zChanged = composer2.changed(function13) | composer2.changed(function14) | composer2.changed(function15);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j15) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j15);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function13);
                                    int size = listSubcompose.size();
                                    final int i16 = iM3743getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j15, i16, i16, 0, 0, 12, null)));
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    for (int i17 = 0; i17 < size; i17++) {
                                        arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function16 = function14;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function15;
                                    final int i18 = i15;
                                    final int i19 = height3;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            List<Placeable> list = arrayList;
                                            int i20 = i16;
                                            int i21 = 0;
                                            for (Object obj : list) {
                                                int i22 = i21 + 1;
                                                if (i21 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                i21 = i22;
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function16);
                                            long j16 = j15;
                                            int i23 = i19;
                                            Iterator<T> it3 = listSubcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j16, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i23 = i23;
                                                j16 = j16;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function18 = function17;
                                            final List<TabPosition> list2 = arrayList2;
                                            final int i24 = i18;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                    }
                                                    function18.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i25 = iM3743getMaxWidthimpl;
                                            int i26 = i19;
                                            Iterator<T> it4 = listSubcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM1057contentColorForek8zF_U = j14;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j15 = jM1057contentColorForek8zF_U;
                i10 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M1070getLambda1$material_release;
                SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function13 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function2M1070getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function5;
                        final int i15 = i10;
                        composer2.startReplaceableGroup(1618982084);
                        boolean zChanged = composer2.changed(function13) | composer2.changed(function14) | composer2.changed(function15);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j16) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j16);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function13);
                                    int size = listSubcompose.size();
                                    final int i16 = iM3743getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j16, i16, i16, 0, 0, 12, null)));
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    for (int i17 = 0; i17 < size; i17++) {
                                        arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function16 = function14;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function15;
                                    final int i18 = i15;
                                    final int i19 = height3;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            List<Placeable> list = arrayList;
                                            int i20 = i16;
                                            int i21 = 0;
                                            for (Object obj : list) {
                                                int i22 = i21 + 1;
                                                if (i21 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                i21 = i22;
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function16);
                                            long j17 = j16;
                                            int i23 = i19;
                                            Iterator<T> it3 = listSubcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j17, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i23 = i23;
                                                j17 = j17;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function18 = function17;
                                            final List<TabPosition> list2 = arrayList2;
                                            final int i24 = i18;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                    }
                                                    function18.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i25 = iM3743getMaxWidthimpl;
                                            int i26 = i19;
                                            Iterator<T> it4 = listSubcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM1057contentColorForek8zF_U = j15;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier3;
            final long j16 = primarySurface;
            final long j17 = jM1057contentColorForek8zF_U;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function14 = function6;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                    TabRowKt.m1231TabRowpAZo6Ak(i, modifier7, j16, j17, function13, function14, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                primarySurface = j;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i4 |= i13;
            } else {
                primarySurface = j;
            }
            i4 |= i13;
        } else {
            primarySurface = j;
        }
        if ((i2 & 7168) == 0) {
            jM1057contentColorForek8zF_U = j2;
            if ((i3 & 8) == 0) {
                i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else {
                i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 |= i11;
        } else {
            jM1057contentColorForek8zF_U = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((57344 & i2) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    function2M1070getLambda1$material_release = function2;
                    if (composerStartRestartGroup.changedInstance(function2M1070getLambda1$material_release)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i4 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j18 = jM1057contentColorForek8zF_U;
                    i10 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M1070getLambda1$material_release;
                    SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function15 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function16 = function2M1070getLambda1$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function5;
                            final int i15 = i10;
                            composer2.startReplaceableGroup(1618982084);
                            boolean zChanged = composer2.changed(function15) | composer2.changed(function16) | composer2.changed(function17);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j19) {
                                        Object next;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j19);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function15);
                                        int size = listSubcompose.size();
                                        final int i16 = iM3743getMaxWidthimpl / size;
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j19, i16, i16, 0, 0, 12, null)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                int height = ((Placeable) next).getHeight();
                                                do {
                                                    Object next2 = it2.next();
                                                    int height2 = ((Placeable) next2).getHeight();
                                                    if (height < height2) {
                                                        next = next2;
                                                        height = height2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Placeable placeable = (Placeable) next;
                                        int height3 = placeable != null ? placeable.getHeight() : 0;
                                        final List<TabPosition> arrayList2 = new ArrayList(size);
                                        for (int i17 = 0; i17 < size; i17++) {
                                            arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function18 = function16;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function17;
                                        final int i18 = i15;
                                        final int i19 = height3;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                List<Placeable> list = arrayList;
                                                int i20 = i16;
                                                int i21 = 0;
                                                for (Object obj : list) {
                                                    int i22 = i21 + 1;
                                                    if (i21 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                    i21 = i22;
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function18);
                                                long j110 = j19;
                                                int i23 = i19;
                                                Iterator<T> it3 = listSubcompose2.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j110, 0, 0, 0, 0, 11, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i23 = i23;
                                                    j110 = j110;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function110 = function19;
                                                final List<TabPosition> list2 = arrayList2;
                                                final int i24 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                        }
                                                        function110.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i25 = iM3743getMaxWidthimpl;
                                                int i26 = i19;
                                                Iterator<T> it4 = listSubcompose3.iterator();
                                                while (it4.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM1057contentColorForek8zF_U = j18;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i7 != 0) {
                            function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j19 = jM1057contentColorForek8zF_U;
                    i10 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M1070getLambda1$material_release;
                    SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j19, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function15 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function16 = function2M1070getLambda1$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function5;
                            final int i15 = i10;
                            composer2.startReplaceableGroup(1618982084);
                            boolean zChanged = composer2.changed(function15) | composer2.changed(function16) | composer2.changed(function17);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j110) {
                                        Object next;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j110);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function15);
                                        int size = listSubcompose.size();
                                        final int i16 = iM3743getMaxWidthimpl / size;
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                        Iterator<T> it = listSubcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j110, i16, i16, 0, 0, 12, null)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                int height = ((Placeable) next).getHeight();
                                                do {
                                                    Object next2 = it2.next();
                                                    int height2 = ((Placeable) next2).getHeight();
                                                    if (height < height2) {
                                                        next = next2;
                                                        height = height2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Placeable placeable = (Placeable) next;
                                        int height3 = placeable != null ? placeable.getHeight() : 0;
                                        final List<TabPosition> arrayList2 = new ArrayList(size);
                                        for (int i17 = 0; i17 < size; i17++) {
                                            arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function18 = function16;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function17;
                                        final int i18 = i15;
                                        final int i19 = height3;
                                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                List<Placeable> list = arrayList;
                                                int i20 = i16;
                                                int i21 = 0;
                                                for (Object obj : list) {
                                                    int i22 = i21 + 1;
                                                    if (i21 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                    i21 = i22;
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function18);
                                                long j111 = j110;
                                                int i23 = i19;
                                                Iterator<T> it3 = listSubcompose2.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j111, 0, 0, 0, 0, 11, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i23 = i23;
                                                    j111 = j111;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function110 = function19;
                                                final List<TabPosition> list2 = arrayList2;
                                                final int i24 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                        }
                                                        function110.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i25 = iM3743getMaxWidthimpl;
                                                int i26 = i19;
                                                Iterator<T> it4 = listSubcompose3.iterator();
                                                while (it4.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM1057contentColorForek8zF_U = j19;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier3;
                final long j110 = primarySurface;
                final long j111 = jM1057contentColorForek8zF_U;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                        TabRowKt.m1231TabRowpAZo6Ak(i, modifier8, j110, j111, function15, function16, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 196608;
            function2M1070getLambda1$material_release = function2;
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i4 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j112 = jM1057contentColorForek8zF_U;
                i10 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M1070getLambda1$material_release;
                SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j112, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function17 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function18 = function2M1070getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function5;
                        final int i15 = i10;
                        composer2.startReplaceableGroup(1618982084);
                        boolean zChanged = composer2.changed(function17) | composer2.changed(function18) | composer2.changed(function19);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j113) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j113);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function17);
                                    int size = listSubcompose.size();
                                    final int i16 = iM3743getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j113, i16, i16, 0, 0, 12, null)));
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    for (int i17 = 0; i17 < size; i17++) {
                                        arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function110 = function18;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function19;
                                    final int i18 = i15;
                                    final int i19 = height3;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            List<Placeable> list = arrayList;
                                            int i20 = i16;
                                            int i21 = 0;
                                            for (Object obj : list) {
                                                int i22 = i21 + 1;
                                                if (i21 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                i21 = i22;
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function110);
                                            long j114 = j113;
                                            int i23 = i19;
                                            Iterator<T> it3 = listSubcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j114, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i23 = i23;
                                                j114 = j114;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function112 = function111;
                                            final List<TabPosition> list2 = arrayList2;
                                            final int i24 = i18;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                    }
                                                    function112.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i25 = iM3743getMaxWidthimpl;
                                            int i26 = i19;
                                            Iterator<T> it4 = listSubcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM1057contentColorForek8zF_U = j112;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j113 = jM1057contentColorForek8zF_U;
                i10 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M1070getLambda1$material_release;
                SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j113, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function17 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function18 = function2M1070getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function5;
                        final int i15 = i10;
                        composer2.startReplaceableGroup(1618982084);
                        boolean zChanged = composer2.changed(function17) | composer2.changed(function18) | composer2.changed(function19);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j114) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j114);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function17);
                                    int size = listSubcompose.size();
                                    final int i16 = iM3743getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j114, i16, i16, 0, 0, 12, null)));
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    for (int i17 = 0; i17 < size; i17++) {
                                        arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function110 = function18;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function19;
                                    final int i18 = i15;
                                    final int i19 = height3;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            List<Placeable> list = arrayList;
                                            int i20 = i16;
                                            int i21 = 0;
                                            for (Object obj : list) {
                                                int i22 = i21 + 1;
                                                if (i21 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                i21 = i22;
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function110);
                                            long j115 = j114;
                                            int i23 = i19;
                                            Iterator<T> it3 = listSubcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j115, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i23 = i23;
                                                j115 = j115;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function112 = function111;
                                            final List<TabPosition> list2 = arrayList2;
                                            final int i24 = i18;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                    }
                                                    function112.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i25 = iM3743getMaxWidthimpl;
                                            int i26 = i19;
                                            Iterator<T> it4 = listSubcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM1057contentColorForek8zF_U = j113;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier3;
            final long j114 = primarySurface;
            final long j115 = jM1057contentColorForek8zF_U;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function18 = function6;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                    TabRowKt.m1231TabRowpAZo6Ak(i, modifier9, j114, j115, function17, function18, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 24576;
        function4 = function3;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                function2M1070getLambda1$material_release = function2;
                if (composerStartRestartGroup.changedInstance(function2M1070getLambda1$material_release)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i4 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j116 = jM1057contentColorForek8zF_U;
                i10 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M1070getLambda1$material_release;
                SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j116, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function19 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function2M1070getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function5;
                        final int i15 = i10;
                        composer2.startReplaceableGroup(1618982084);
                        boolean zChanged = composer2.changed(function19) | composer2.changed(function110) | composer2.changed(function111);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j117) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j117);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function19);
                                    int size = listSubcompose.size();
                                    final int i16 = iM3743getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j117, i16, i16, 0, 0, 12, null)));
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    for (int i17 = 0; i17 < size; i17++) {
                                        arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function112 = function110;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function111;
                                    final int i18 = i15;
                                    final int i19 = height3;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            List<Placeable> list = arrayList;
                                            int i20 = i16;
                                            int i21 = 0;
                                            for (Object obj : list) {
                                                int i22 = i21 + 1;
                                                if (i21 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                i21 = i22;
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function112);
                                            long j118 = j117;
                                            int i23 = i19;
                                            Iterator<T> it3 = listSubcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j118, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i23 = i23;
                                                j118 = j118;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function113;
                                            final List<TabPosition> list2 = arrayList2;
                                            final int i24 = i18;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                    }
                                                    function114.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i25 = iM3743getMaxWidthimpl;
                                            int i26 = i19;
                                            Iterator<T> it4 = listSubcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM1057contentColorForek8zF_U = j116;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i7 != 0) {
                        function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j117 = jM1057contentColorForek8zF_U;
                i10 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M1070getLambda1$material_release;
                SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j117, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function19 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function2M1070getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function5;
                        final int i15 = i10;
                        composer2.startReplaceableGroup(1618982084);
                        boolean zChanged = composer2.changed(function19) | composer2.changed(function110) | composer2.changed(function111);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j118) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j118);
                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function19);
                                    int size = listSubcompose.size();
                                    final int i16 = iM3743getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                    Iterator<T> it = listSubcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j118, i16, i16, 0, 0, 12, null)));
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    for (int i17 = 0; i17 < size; i17++) {
                                        arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function112 = function110;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function111;
                                    final int i18 = i15;
                                    final int i19 = height3;
                                    return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            List<Placeable> list = arrayList;
                                            int i20 = i16;
                                            int i21 = 0;
                                            for (Object obj : list) {
                                                int i22 = i21 + 1;
                                                if (i21 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                                i21 = i22;
                                            }
                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function112);
                                            long j119 = j118;
                                            int i23 = i19;
                                            Iterator<T> it3 = listSubcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j119, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i23 = i23;
                                                j119 = j119;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function113;
                                            final List<TabPosition> list2 = arrayList2;
                                            final int i24 = i18;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                    }
                                                    function114.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i25 = iM3743getMaxWidthimpl;
                                            int i26 = i19;
                                            Iterator<T> it4 = listSubcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM1057contentColorForek8zF_U = j117;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier3;
            final long j118 = primarySurface;
            final long j119 = jM1057contentColorForek8zF_U;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function110 = function6;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                    TabRowKt.m1231TabRowpAZo6Ak(i, modifier10, j118, j119, function19, function110, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 196608;
        function2M1070getLambda1$material_release = function2;
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(tabs)) {
                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        if ((i4 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function4;
                }
                if (i7 != 0) {
                    function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function4;
                }
                if (i7 != 0) {
                    function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            }
            long j1110 = jM1057contentColorForek8zF_U;
            i10 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
            }
            function6 = function2M1070getLambda1$material_release;
            SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j1110, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                        ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final Function2<? super Composer, ? super Integer, Unit> function111 = tabs;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function2M1070getLambda1$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function5;
                    final int i15 = i10;
                    composer2.startReplaceableGroup(1618982084);
                    boolean zChanged = composer2.changed(function111) | composer2.changed(function112) | composer2.changed(function113);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j1111) {
                                Object next;
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j1111);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function111);
                                int size = listSubcompose.size();
                                final int i16 = iM3743getMaxWidthimpl / size;
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j1111, i16, i16, 0, 0, 12, null)));
                                }
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((Placeable) next).getHeight();
                                        do {
                                            Object next2 = it2.next();
                                            int height2 = ((Placeable) next2).getHeight();
                                            if (height < height2) {
                                                next = next2;
                                                height = height2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                Placeable placeable = (Placeable) next;
                                int height3 = placeable != null ? placeable.getHeight() : 0;
                                final List<TabPosition> arrayList2 = new ArrayList(size);
                                for (int i17 = 0; i17 < size; i17++) {
                                    arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function114 = function112;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function115 = function113;
                                final int i18 = i15;
                                final int i19 = height3;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        List<Placeable> list = arrayList;
                                        int i20 = i16;
                                        int i21 = 0;
                                        for (Object obj : list) {
                                            int i22 = i21 + 1;
                                            if (i21 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                            i21 = i22;
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function114);
                                        long j1112 = j1111;
                                        int i23 = i19;
                                        Iterator<T> it3 = listSubcompose2.iterator();
                                        while (it3.hasNext()) {
                                            Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j1112, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            i23 = i23;
                                            j1112 = j1112;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function116 = function115;
                                        final List<TabPosition> list2 = arrayList2;
                                        final int i24 = i18;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                            public final void invoke(@Nullable Composer composer3, int i25) {
                                                if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                }
                                                function116.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i25 = iM3743getMaxWidthimpl;
                                        int i26 = i19;
                                        Iterator<T> it4 = listSubcompose3.iterator();
                                        while (it4.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM1057contentColorForek8zF_U = j1110;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function4;
                }
                if (i7 != 0) {
                    function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i14) {
                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-553782708, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m1226Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    function3ComposableLambda = function4;
                }
                if (i7 != 0) {
                    function2M1070getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1070getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            }
            long j1111 = jM1057contentColorForek8zF_U;
            i10 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
            }
            function6 = function2M1070getLambda1$material_release;
            SurfaceKt.m1201SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j1111, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                        ComposerKt.traceEventStart(-1961746365, i14, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final Function2<? super Composer, ? super Integer, Unit> function111 = tabs;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function2M1070getLambda1$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function5;
                    final int i15 = i10;
                    composer2.startReplaceableGroup(1618982084);
                    boolean zChanged = composer2.changed(function111) | composer2.changed(function112) | composer2.changed(function113);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1233invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1233invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j1112) {
                                Object next;
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j1112);
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function111);
                                int size = listSubcompose.size();
                                final int i16 = iM3743getMaxWidthimpl / size;
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.OooO0oo(listSubcompose));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j1112, i16, i16, 0, 0, 12, null)));
                                }
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((Placeable) next).getHeight();
                                        do {
                                            Object next2 = it2.next();
                                            int height2 = ((Placeable) next2).getHeight();
                                            if (height < height2) {
                                                next = next2;
                                                height = height2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                Placeable placeable = (Placeable) next;
                                int height3 = placeable != null ? placeable.getHeight() : 0;
                                final List<TabPosition> arrayList2 = new ArrayList(size);
                                for (int i17 = 0; i17 < size; i17++) {
                                    arrayList2.add(new TabPosition(Dp.m3775constructorimpl(SubcomposeLayout.mo323toDpu2uoSUM(i16) * i17), SubcomposeLayout.mo323toDpu2uoSUM(i16), null));
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function114 = function112;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function115 = function113;
                                final int i18 = i15;
                                final int i19 = height3;
                                return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        List<Placeable> list = arrayList;
                                        int i20 = i16;
                                        int i21 = 0;
                                        for (Object obj : list) {
                                            int i22 = i21 + 1;
                                            if (i21 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i21 * i20, 0, 0.0f, 4, null);
                                            i21 = i22;
                                        }
                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function114);
                                        long j1113 = j1112;
                                        int i23 = i19;
                                        Iterator<T> it3 = listSubcompose2.iterator();
                                        while (it3.hasNext()) {
                                            Placeable placeableMo2804measureBRTryo0 = ((Measurable) it3.next()).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j1113, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, i23 - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            i23 = i23;
                                            j1113 = j1113;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function116 = function115;
                                        final List<TabPosition> list2 = arrayList2;
                                        final int i24 = i18;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                            public final void invoke(@Nullable Composer composer3, int i25) {
                                                if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1341594997, i25, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                                                }
                                                function116.invoke(list2, composer3, Integer.valueOf(((i24 >> 9) & 112) | 8));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i25 = iM3743getMaxWidthimpl;
                                        int i26 = i19;
                                        Iterator<T> it4 = listSubcompose3.iterator();
                                        while (it4.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(i25, i26)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM1057contentColorForek8zF_U = j1111;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier3;
        final long j1112 = primarySurface;
        final long j1113 = jM1057contentColorForek8zF_U;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function5;
        final Function2<? super Composer, ? super Integer, Unit> function112 = function6;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                TabRowKt.m1231TabRowpAZo6Ak(i, modifier11, j1112, j1113, function111, function112, tabs, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }
}
