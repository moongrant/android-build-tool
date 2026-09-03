package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.share.internal.ShareConstants;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aq\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0001\u0010\u001f\u001a\u00020\n2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\n0!¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\b\u00172\u001e\b\u0002\u0010#\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001ae\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0080\b\u001a,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0-2\u0006\u0010.\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010/\u001a\u00020)H\u0000\u001a\u0011\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)H\u0082\b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"AppBarHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AppBarHorizontalPadding", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "TitleIconModifier", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "AppBar", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", ShareConstants.WEB_DIALOG_PARAM_TITLE, "Lkotlin/Function0;", "navigationIcon", "actions", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateCutoutCircleYIntercept", "", "cutoutRadius", "verticalOffset", "calculateRoundedEdgeIntercept", "Lkotlin/Pair;", "controlPointX", "radius", "square", "x", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,547:1\n400#1:549\n400#1:550\n400#1:551\n400#1:552\n400#1:553\n400#1:554\n76#2:548\n154#3:555\n154#3:556\n154#3:557\n154#3:559\n154#3:561\n154#3:562\n58#4:558\n58#4:560\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n426#1:549\n458#1:550\n459#1:551\n461#1:552\n468#1:553\n469#1:554\n224#1:548\n534#1:555\n536#1:556\n538#1:557\n541#1:559\n544#1:561\n546#1:562\n538#1:558\n541#1:560\n*E\n"})
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m3765constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;

    @NotNull
    private static final Modifier TitleIconModifier;

    @NotNull
    private static final Modifier TitleInsetWithoutIcon;

    static {
        float f = 4;
        float fM3765constructorimpl = Dp.m3765constructorimpl(f);
        AppBarHorizontalPadding = fM3765constructorimpl;
        Modifier.Companion companion = Modifier.INSTANCE;
        TitleInsetWithoutIcon = SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(Dp.m3765constructorimpl(16) - fM3765constructorimpl));
        TitleIconModifier = SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(Dp.m3765constructorimpl(72) - fM3765constructorimpl));
        BottomAppBarCutoutOffset = Dp.m3765constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m3765constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AppBar-celAv9A, reason: not valid java name */
    public static final void m953AppBarcelAv9A(final long j, final long j2, final float f, final PaddingValues paddingValues, final Shape shape, Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249680788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i4 = 2048;
                } else {
                    i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(shape)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((i & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((2995931 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i9 = i3 << 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1027830352, i10, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final PaddingValues paddingValues2 = paddingValues;
                            final Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            final int i11 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1296061040, i12, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                                    }
                                    Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                                    int i13 = ((i11 >> 9) & 7168) | 432;
                                    composer3.startReplaceableGroup(693286680);
                                    int i14 = i13 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i14 & 112) | (i14 & 14));
                                    Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                                    int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i15 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                                    function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i9 & 896) | (i9 & 7168) | ((i3 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        AppBarKt.m953AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((2995931 & i3) == 599186) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i10 = i3 << 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                    public final void invoke(@Nullable Composer composer2, int i11) {
                        if ((i11 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1027830352, i11, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i12 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i13) {
                                if ((i13 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1296061040, i13, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                                }
                                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                                int i14 = ((i12 >> 9) & 7168) | 432;
                                composer3.startReplaceableGroup(693286680);
                                int i15 = i14 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i15 & 112) | (i15 & 14));
                                Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                                int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                                function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i14 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i10 & 896) | (i10 & 7168) | ((i3 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11 = i3 << 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            ComposerKt.traceEventStart(-1027830352, i12, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i13 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1296061040, i14, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                                }
                                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                                int i15 = ((i13 >> 9) & 7168) | 432;
                                composer3.startReplaceableGroup(693286680);
                                int i16 = i15 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i16 & 112) | (i16 & 14));
                                Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                                int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i17 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                                function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i15 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i11 & 896) | (i11 & 7168) | ((i3 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AppBarKt.m953AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier5, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i4 = 2048;
            } else {
                i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i4;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(shape)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((i & 458752) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((2995931 & i3) == 599186) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i12 = i3 << 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            ComposerKt.traceEventStart(-1027830352, i13, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i14 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i15) {
                                if ((i15 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1296061040, i15, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                                }
                                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                                int i16 = ((i14 >> 9) & 7168) | 432;
                                composer3.startReplaceableGroup(693286680);
                                int i17 = i16 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i17 & 112) | (i17 & 14));
                                Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                                int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i18 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                                function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i12 & 896) | (i12 & 7168) | ((i3 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i13 = i3 << 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            ComposerKt.traceEventStart(-1027830352, i14, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i15 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i16) {
                                if ((i16 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1296061040, i16, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                                }
                                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                                int i17 = ((i15 >> 9) & 7168) | 432;
                                composer3.startReplaceableGroup(693286680);
                                int i18 = i17 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i18 & 112) | (i18 & 14));
                                Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                                int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                                function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i17 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i13 & 896) | (i13 & 7168) | ((i3 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier6 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                    AppBarKt.m953AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier6, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((2995931 & i3) == 599186) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
            }
            int i14 = i3 << 6;
            SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        ComposerKt.traceEventStart(-1027830352, i15, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final PaddingValues paddingValues2 = paddingValues;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                    final int i16 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i17) {
                            if ((i17 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1296061040, i17, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                            }
                            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                            int i18 = ((i16 >> 9) & 7168) | 432;
                            composer3.startReplaceableGroup(693286680);
                            int i19 = i18 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i19 & 112) | (i19 & 14));
                            Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                            int i110 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                            androidx.compose.animation.OooOO0.OooO00o((i110 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                            function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i18 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i14 & 896) | (i14 & 7168) | ((i3 << 9) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
            }
            int i15 = i3 << 6;
            SurfaceKt.m1185SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        ComposerKt.traceEventStart(-1027830352, i16, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final PaddingValues paddingValues2 = paddingValues;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                    final int i17 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i18) {
                            if ((i18 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1296061040, i18, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                            }
                            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function5 = function4;
                            int i19 = ((i17 >> 9) & 7168) | 432;
                            composer3.startReplaceableGroup(693286680);
                            int i110 = i19 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, (i110 & 112) | (i110 & 14));
                            Density density = (Density) OooO00o.OooO00o(composer3, -1323940314);
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM509height3ABfNKs);
                            int i111 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                            androidx.compose.animation.OooOO0.OooO00o((i111 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                            function5.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i19 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i15 & 896) | (i15 & 7168) | ((i3 << 9) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier7 = modifier3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                AppBarKt.m953AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier7, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x0159  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:114:0x0170  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    public static final void m954BottomAppBarY1yfwus(@Nullable Modifier modifier, long j, long j2, @Nullable Shape shape, float f, @Nullable PaddingValues paddingValues, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        long primarySurface;
        long j3;
        Shape shape2;
        int i4;
        float fM951getBottomAppBarElevationD9Ej5fM;
        int i5;
        int i6;
        int i7;
        int i8;
        Modifier modifier2;
        PaddingValues contentPadding;
        Modifier modifier3;
        Shape shape3;
        FabPlacement fabPlacement;
        Shape rectangleShape;
        final Modifier modifier4;
        final Shape shape4;
        final float f2;
        final long j4;
        final long j5;
        final PaddingValues paddingValues2;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651948973);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                primarySurface = j;
                int i10 = composerStartRestartGroup.changed(primarySurface) ? 32 : 16;
                i3 |= i10;
            } else {
                primarySurface = j;
            }
            i3 |= i10;
        } else {
            primarySurface = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j2;
                int i11 = composerStartRestartGroup.changed(j3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i11;
            } else {
                j3 = j2;
            }
            i3 |= i11;
        } else {
            j3 = j2;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 7168) == 0) {
                shape2 = shape;
                i3 |= composerStartRestartGroup.changed(shape2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    fM951getBottomAppBarElevationD9Ej5fM = f;
                    if (composerStartRestartGroup.changed(fM951getBottomAppBarElevationD9Ej5fM)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i8 = 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            }
                            if ((i2 & 4) != 0) {
                                long jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                                j3 = jM1041contentColorForek8zF_U;
                            }
                            if (i12 != 0) {
                                shape2 = null;
                            }
                            if (i4 != 0) {
                                fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                            }
                            if (i6 != 0) {
                                modifier3 = modifier2;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            } else {
                                contentPadding = paddingValues;
                                modifier3 = modifier2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier3 = modifier;
                            contentPadding = paddingValues;
                        }
                        long j6 = primarySurface;
                        long j7 = j3;
                        float f3 = fM951getBottomAppBarElevationD9Ej5fM;
                        shape3 = shape2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                        }
                        fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                        if (shape3 != null) {
                            z = false;
                            if (fabPlacement != null && fabPlacement.getIsDocked()) {
                                z = true;
                            }
                            if (z) {
                                rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                            } else {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        int i13 = i3 >> 3;
                        int i14 = i3 >> 6;
                        m953AppBarcelAv9A(j6, j7, f3, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i13 & 112) | (i13 & 14) | (i14 & 896) | (i14 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape4 = shape3;
                        f2 = f3;
                        j4 = j6;
                        j5 = j7;
                        paddingValues2 = contentPadding;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        paddingValues2 = paddingValues;
                        j4 = primarySurface;
                        j5 = j3;
                        shape4 = shape2;
                        f2 = fM951getBottomAppBarElevationD9Ej5fM;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                            AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 1572864;
                i3 |= i8;
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U2 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U2;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U3 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U3;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j8 = primarySurface;
                    long j9 = j3;
                    float f4 = fM951getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 != null) {
                        z = false;
                        if (fabPlacement != null) {
                            z = true;
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i15 = i3 >> 3;
                    int i16 = i3 >> 6;
                    m953AppBarcelAv9A(j8, j9, f4, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i15 & 112) | (i15 & 14) | (i16 & 896) | (i16 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f2 = f4;
                    j4 = j8;
                    j5 = j9;
                    paddingValues2 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U4 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U4;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U5 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U5;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j10 = primarySurface;
                    long j11 = j3;
                    float f5 = fM951getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 != null) {
                        z = false;
                        if (fabPlacement != null) {
                            z = true;
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i17 = i3 >> 3;
                    int i18 = i3 >> 6;
                    m953AppBarcelAv9A(j10, j11, f5, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f2 = f5;
                    j4 = j10;
                    j5 = j11;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                        AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            fM951getBottomAppBarElevationD9Ej5fM = f;
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U6 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U6;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U7 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U7;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j12 = primarySurface;
                    long j13 = j3;
                    float f6 = fM951getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 != null) {
                        z = false;
                        if (fabPlacement != null) {
                            z = true;
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i19 = i3 >> 3;
                    int i110 = i3 >> 6;
                    m953AppBarcelAv9A(j12, j13, f6, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i19 & 112) | (i19 & 14) | (i110 & 896) | (i110 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f2 = f6;
                    j4 = j12;
                    j5 = j13;
                    paddingValues2 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U8 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U8;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U9 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U9;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j14 = primarySurface;
                    long j15 = j3;
                    float f7 = fM951getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 != null) {
                        z = false;
                        if (fabPlacement != null) {
                            z = true;
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i111 = i3 >> 3;
                    int i112 = i3 >> 6;
                    m953AppBarcelAv9A(j14, j15, f7, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i111 & 112) | (i111 & 14) | (i112 & 896) | (i112 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f2 = f7;
                    j4 = j14;
                    j5 = j15;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                        AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 1572864;
            i3 |= i8;
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U10 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U10;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U11 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U11;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j16 = primarySurface;
                long j17 = j3;
                float f8 = fM951getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 != null) {
                    z = false;
                    if (fabPlacement != null) {
                        z = true;
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i113 = i3 >> 3;
                int i114 = i3 >> 6;
                m953AppBarcelAv9A(j16, j17, f8, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i113 & 112) | (i113 & 14) | (i114 & 896) | (i114 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f2 = f8;
                j4 = j16;
                j5 = j17;
                paddingValues2 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U12 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U12;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U13 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U13;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j18 = primarySurface;
                long j19 = j3;
                float f9 = fM951getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 != null) {
                    z = false;
                    if (fabPlacement != null) {
                        z = true;
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i115 = i3 >> 3;
                int i116 = i3 >> 6;
                m953AppBarcelAv9A(j18, j19, f9, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i115 & 112) | (i115 & 14) | (i116 & 896) | (i116 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f2 = f9;
                j4 = j18;
                j5 = j19;
                paddingValues2 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                    AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        shape2 = shape;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                fM951getBottomAppBarElevationD9Ej5fM = f;
                if (composerStartRestartGroup.changed(fM951getBottomAppBarElevationD9Ej5fM)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U14 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U14;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U15 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U15;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j110 = primarySurface;
                    long j111 = j3;
                    float f10 = fM951getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 != null) {
                        z = false;
                        if (fabPlacement != null) {
                            z = true;
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i117 = i3 >> 3;
                    int i118 = i3 >> 6;
                    m953AppBarcelAv9A(j110, j111, f10, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i117 & 112) | (i117 & 14) | (i118 & 896) | (i118 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f2 = f10;
                    j4 = j110;
                    j5 = j111;
                    paddingValues2 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U16 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U16;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U17 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j3 = jM1041contentColorForek8zF_U17;
                        }
                        if (i12 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i6 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j112 = primarySurface;
                    long j113 = j3;
                    float f11 = fM951getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 != null) {
                        z = false;
                        if (fabPlacement != null) {
                            z = true;
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i119 = i3 >> 3;
                    int i1110 = i3 >> 6;
                    m953AppBarcelAv9A(j112, j113, f11, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i119 & 112) | (i119 & 14) | (i1110 & 896) | (i1110 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f2 = f11;
                    j4 = j112;
                    j5 = j113;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                        AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 1572864;
            i3 |= i8;
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U18 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U18;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U19 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U19;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j114 = primarySurface;
                long j115 = j3;
                float f12 = fM951getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 != null) {
                    z = false;
                    if (fabPlacement != null) {
                        z = true;
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i1111 = i3 >> 3;
                int i1112 = i3 >> 6;
                m953AppBarcelAv9A(j114, j115, f12, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i1111 & 112) | (i1111 & 14) | (i1112 & 896) | (i1112 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f2 = f12;
                j4 = j114;
                j5 = j115;
                paddingValues2 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U110 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U110;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U111 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U111;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j116 = primarySurface;
                long j117 = j3;
                float f13 = fM951getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 != null) {
                    z = false;
                    if (fabPlacement != null) {
                        z = true;
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i1113 = i3 >> 3;
                int i1114 = i3 >> 6;
                m953AppBarcelAv9A(j116, j117, f13, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i1113 & 112) | (i1113 & 14) | (i1114 & 896) | (i1114 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f2 = f13;
                j4 = j116;
                j5 = j117;
                paddingValues2 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

                public final void invoke(@Nullable Composer composer2, int i1115) {
                    AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        fM951getBottomAppBarElevationD9Ej5fM = f;
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((i2 & 64) != 0) {
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i8 = 524288;
                }
            }
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U112 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U112;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U113 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U113;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j118 = primarySurface;
                long j119 = j3;
                float f14 = fM951getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 != null) {
                    z = false;
                    if (fabPlacement != null) {
                        z = true;
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i1115 = i3 >> 3;
                int i1116 = i3 >> 6;
                m953AppBarcelAv9A(j118, j119, f14, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i1115 & 112) | (i1115 & 14) | (i1116 & 896) | (i1116 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f2 = f14;
                j4 = j118;
                j5 = j119;
                paddingValues2 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U114 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U114;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U115 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j3 = jM1041contentColorForek8zF_U115;
                    }
                    if (i12 != 0) {
                        shape2 = null;
                    }
                    if (i4 != 0) {
                        fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i6 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j1110 = primarySurface;
                long j1111 = j3;
                float f15 = fM951getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 != null) {
                    z = false;
                    if (fabPlacement != null) {
                        z = true;
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i1117 = i3 >> 3;
                int i1118 = i3 >> 6;
                m953AppBarcelAv9A(j1110, j1111, f15, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i1117 & 112) | (i1117 & 14) | (i1118 & 896) | (i1118 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f2 = f15;
                j4 = j1110;
                j5 = j1111;
                paddingValues2 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i8 = 1572864;
        i3 |= i8;
        if ((i3 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U116 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U116;
                }
                if (i12 != 0) {
                    shape2 = null;
                }
                if (i4 != 0) {
                    fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                }
                if (i6 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            } else {
                if (i9 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U117 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U117;
                }
                if (i12 != 0) {
                    shape2 = null;
                }
                if (i4 != 0) {
                    fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                }
                if (i6 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            }
            long j1112 = primarySurface;
            long j1113 = j3;
            float f16 = fM951getBottomAppBarElevationD9Ej5fM;
            shape3 = shape2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
            }
            fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape3 != null) {
                z = false;
                if (fabPlacement != null) {
                    z = true;
                }
                if (z) {
                    rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
            } else {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            int i1119 = i3 >> 3;
            int i11110 = i3 >> 6;
            m953AppBarcelAv9A(j1112, j1113, f16, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i1119 & 112) | (i1119 & 14) | (i11110 & 896) | (i11110 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape4 = shape3;
            f2 = f16;
            j4 = j1112;
            j5 = j1113;
            paddingValues2 = contentPadding;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U118 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U118;
                }
                if (i12 != 0) {
                    shape2 = null;
                }
                if (i4 != 0) {
                    fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                }
                if (i6 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            } else {
                if (i9 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U119 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j3 = jM1041contentColorForek8zF_U119;
                }
                if (i12 != 0) {
                    shape2 = null;
                }
                if (i4 != 0) {
                    fM951getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m951getBottomAppBarElevationD9Ej5fM();
                }
                if (i6 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            }
            long j1114 = primarySurface;
            long j1115 = j3;
            float f17 = fM951getBottomAppBarElevationD9Ej5fM;
            shape3 = shape2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
            }
            fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape3 != null) {
                z = false;
                if (fabPlacement != null) {
                    z = true;
                }
                if (z) {
                    rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
            } else {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            int i11111 = i3 >> 3;
            int i11112 = i3 >> 6;
            m953AppBarcelAv9A(j1114, j1115, f17, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i11111 & 112) | (i11111 & 14) | (i11112 & 896) | (i11112 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape4 = shape3;
            f2 = f17;
            j4 = j1114;
            j5 = j1115;
            paddingValues2 = contentPadding;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

            public final void invoke(@Nullable Composer composer2, int i11113) {
                AppBarKt.m954BottomAppBarY1yfwus(modifier4, j4, j5, shape4, f2, paddingValues2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0189  */
    /* JADX WARN: Code duplicated, block: B:111:0x019c  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    public static final void m955TopAppBarHsRjFd4(@Nullable Modifier modifier, long j, long j2, float f, @Nullable PaddingValues paddingValues, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float fM952getTopAppBarElevationD9Ej5fM;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        Modifier modifier3;
        long primarySurface;
        Modifier modifier4;
        long j5;
        PaddingValues contentPadding;
        long j6;
        float f2;
        final Modifier modifier5;
        final long j7;
        final long j8;
        final float f3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1897058582);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                j3 = j;
                int i8 = composerStartRestartGroup.changed(j3) ? 32 : 16;
                i3 |= i8;
            } else {
                j3 = j;
            }
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                int i9 = composerStartRestartGroup.changed(j4) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i9;
            } else {
                j4 = j2;
            }
            i3 |= i9;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 7168) == 0) {
                fM952getTopAppBarElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM952getTopAppBarElevationD9Ej5fM) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
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
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 2) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i3 &= -113;
                            } else {
                                primarySurface = j3;
                            }
                            if ((i2 & 4) != 0) {
                                long jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                                j4 = jM1041contentColorForek8zF_U;
                            }
                            if (i10 != 0) {
                                fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                modifier4 = modifier3;
                                j5 = primarySurface;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                j6 = j4;
                                f2 = fM952getTopAppBarElevationD9Ej5fM;
                            } else {
                                modifier4 = modifier3;
                                j5 = primarySurface;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                            }
                            int i11 = i3 >> 3;
                            m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i11 & 7168) | (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier4;
                            j7 = j5;
                            j8 = j6;
                            f3 = f2;
                            paddingValues3 = contentPadding;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier4 = modifier2;
                            j5 = j3;
                        }
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                        }
                        int i12 = i3 >> 3;
                        m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i12 & 7168) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j7 = j5;
                        j8 = j6;
                        f3 = f2;
                        paddingValues3 = contentPadding;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        j7 = j3;
                        j8 = j4;
                        f3 = fM952getTopAppBarElevationD9Ej5fM;
                        paddingValues3 = paddingValues2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                            AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i6 = 196608;
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U2 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U2;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U3 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U3;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i13 = i3 >> 3;
                    m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i13 & 7168) | (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                    paddingValues3 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U4 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U4;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U5 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U5;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i14 = i3 >> 3;
                    m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i14 & 7168) | (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                    paddingValues3 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                        AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            paddingValues2 = paddingValues;
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
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U6 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U6;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U7 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U7;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i15 = i3 >> 3;
                    m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i15 & 7168) | (i15 & 14) | 24576 | (i15 & 112) | (i15 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                    paddingValues3 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U8 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U8;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U9 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U9;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i16 = i3 >> 3;
                    m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i16 & 7168) | (i16 & 14) | 24576 | (i16 & 112) | (i16 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                    paddingValues3 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                        AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i6 = 196608;
            i3 |= i6;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U10 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U10;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U11 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U11;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i17 = i3 >> 3;
                m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i17 & 7168) | (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j7 = j5;
                j8 = j6;
                f3 = f2;
                paddingValues3 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U12 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U12;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U13 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U13;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i18 = i3 >> 3;
                m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i18 & 7168) | (i18 & 14) | 24576 | (i18 & 112) | (i18 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j7 = j5;
                j8 = j6;
                f3 = f2;
                paddingValues3 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                    AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        fM952getTopAppBarElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
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
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U14 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U14;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U15 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U15;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i19 = i3 >> 3;
                    m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i19 & 7168) | (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                    paddingValues3 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U16 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U16;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -113;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 4) != 0) {
                            long jM1041contentColorForek8zF_U17 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                            j4 = jM1041contentColorForek8zF_U17;
                        }
                        if (i10 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j5 = primarySurface;
                            j6 = j4;
                            f2 = fM952getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i110 = i3 >> 3;
                    m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i110 & 7168) | (i110 & 14) | 24576 | (i110 & 112) | (i110 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                    paddingValues3 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                        AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i6 = 196608;
            i3 |= i6;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U18 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U18;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U19 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U19;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i111 = i3 >> 3;
                m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i111 & 7168) | (i111 & 14) | 24576 | (i111 & 112) | (i111 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j7 = j5;
                j8 = j6;
                f3 = f2;
                paddingValues3 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U110 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U110;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U111 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U111;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i112 = i3 >> 3;
                m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i112 & 7168) | (i112 & 14) | 24576 | (i112 & 112) | (i112 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j7 = j5;
                j8 = j6;
                f3 = f2;
                paddingValues3 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                    AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        paddingValues2 = paddingValues;
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
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U112 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U112;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U113 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U113;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i113 = i3 >> 3;
                m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i113 & 7168) | (i113 & 14) | 24576 | (i113 & 112) | (i113 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j7 = j5;
                j8 = j6;
                f3 = f2;
                paddingValues3 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U114 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U114;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -113;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 4) != 0) {
                        long jM1041contentColorForek8zF_U115 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                        j4 = jM1041contentColorForek8zF_U115;
                    }
                    if (i10 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    }
                    if (i4 != 0) {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j5 = primarySurface;
                        j6 = j4;
                        f2 = fM952getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i114 = i3 >> 3;
                m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i114 & 7168) | (i114 & 14) | 24576 | (i114 & 112) | (i114 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j7 = j5;
                j8 = j6;
                f3 = f2;
                paddingValues3 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                    AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i6 = 196608;
        i3 |= i6;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -113;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U116 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j4 = jM1041contentColorForek8zF_U116;
                }
                if (i10 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -113;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U117 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j4 = jM1041contentColorForek8zF_U117;
                }
                if (i10 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
            }
            int i115 = i3 >> 3;
            m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i115 & 7168) | (i115 & 14) | 24576 | (i115 & 112) | (i115 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j7 = j5;
            j8 = j6;
            f3 = f2;
            paddingValues3 = contentPadding;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -113;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U118 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j4 = jM1041contentColorForek8zF_U118;
                }
                if (i10 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -113;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 4) != 0) {
                    long jM1041contentColorForek8zF_U119 = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                    j4 = jM1041contentColorForek8zF_U119;
                }
                if (i10 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                }
                if (i4 != 0) {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j5 = primarySurface;
                    j6 = j4;
                    f2 = fM952getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
            }
            int i116 = i3 >> 3;
            m953AppBarcelAv9A(j5, j6, f2, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i116 & 7168) | (i116 & 14) | 24576 | (i116 & 112) | (i116 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j7 = j5;
            j8 = j6;
            f3 = f2;
            paddingValues3 = contentPadding;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                AppBarKt.m955TopAppBarHsRjFd4(modifier5, j7, j8, f3, paddingValues3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    public static final void m956TopAppBarxWeB9s(@NotNull final Function2<? super Composer, ? super Integer, Unit> title, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, long j, long j2, float f, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i5;
        int i6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        int i7;
        long j3;
        long j4;
        int i8;
        float f2;
        int i9;
        Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1046getLambda1$material_release;
        long primarySurface;
        long jM1041contentColorForek8zF_U;
        long j5;
        float fM952getTopAppBarElevationD9Ej5fM;
        Modifier modifier3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2087748139);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    if ((57344 & i) == 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            int i11 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                            i3 |= i11;
                        } else {
                            j3 = j;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            int i12 = composerStartRestartGroup.changed(j4) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            j4 = j2;
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(f2)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            } else {
                                function6 = function4;
                            }
                            if (i6 != 0) {
                                function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                            } else {
                                function3M1046getLambda1$material_release = function5;
                            }
                            if ((i2 & 16) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i3 &= -57345;
                            } else {
                                primarySurface = j3;
                            }
                            if ((i2 & 32) != 0) {
                                jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            } else {
                                jM1041contentColorForek8zF_U = j4;
                            }
                            if (i8 != 0) {
                                fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                                j5 = jM1041contentColorForek8zF_U;
                            } else {
                                j5 = jM1041contentColorForek8zF_U;
                                fM952getTopAppBarElevationD9Ej5fM = f2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            function6 = function4;
                            function3M1046getLambda1$material_release = function5;
                            primarySurface = j3;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                            j5 = j4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                        }
                        int i13 = i3 >> 12;
                        m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i14) {
                                int i15;
                                int i16;
                                Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                                if ((i14 & 14) == 0) {
                                    i15 = (composer2.changed(AppBar) ? 4 : 2) | i14;
                                } else {
                                    i15 = i14;
                                }
                                if ((i15 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1484077694, i14, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                                }
                                if (function6 == null) {
                                    composer2.startReplaceableGroup(-512812651);
                                    SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                    composer2.endReplaceableGroup();
                                    i16 = 1;
                                } else {
                                    composer2.startReplaceableGroup(-512812592);
                                    Modifier modifier4 = AppBarKt.TitleIconModifier;
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function7 = function6;
                                    int i17 = i3;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    i16 = 1;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function7, composer2, ((i17 >> 3) & 112) | 8);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i16, null), 1.0f, false, 2, null);
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                final Function2<Composer, Integer, Unit> function8 = title;
                                final int i18 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i19) {
                                        if ((i19 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2021518195, i19, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                        }
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function8, composer3, ((i18 << 3) & 112) | 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 48);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                                final Function3<RowScope, Composer, Integer, Unit> function9 = function3M1046getLambda1$material_release;
                                final int i19 = i3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i20) {
                                        if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                        }
                                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function10 = function9;
                                        int i21 = (i19 & 7168) | 438;
                                        composer3.startReplaceableGroup(693286680);
                                        int i22 = i21 >> 3;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                        Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                        LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                        int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                        androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                        function10.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i13 & 896) | (i13 & 14) | 1600512 | (i13 & 112) | ((i3 << 12) & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        f3 = fM952getTopAppBarElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function6 = function4;
                        function3M1046getLambda1$material_release = function5;
                        primarySurface = j3;
                        f3 = f2;
                        j5 = j4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = modifier3;
                    final Function2<? super Composer, ? super Integer, Unit> function7 = function6;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function8 = function3M1046getLambda1$material_release;
                    final long j6 = primarySurface;
                    final long j7 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                            AppBarKt.m956TopAppBarxWeB9s(title, modifier4, function7, function8, j6, j7, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                function5 = function3;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (composerStartRestartGroup.changed(j3)) {
                        }
                        i3 |= i11;
                    } else {
                        j3 = j;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (composerStartRestartGroup.changed(j4)) {
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i14 = i3 >> 12;
                    m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i15) {
                            int i16;
                            int i17;
                            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                            if ((i15 & 14) == 0) {
                                i16 = (composer2.changed(AppBar) ? 4 : 2) | i15;
                            } else {
                                i16 = i15;
                            }
                            if ((i16 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1484077694, i15, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                            }
                            if (function6 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                                i17 = 1;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier5 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function9 = function6;
                                int i18 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier5);
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
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                i17 = 1;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function9, composer2, ((i18 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i17, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function10 = title;
                            final int i19 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i110) {
                                    if ((i110 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2021518195, i110, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function10, composer3, ((i19 << 3) & 112) | 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function11 = function3M1046getLambda1$material_release;
                            final int i110 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                    }
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function12 = function11;
                                    int i21 = (i110 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    int i22 = i21 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                    Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                    function12.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i14 & 896) | (i14 & 14) | 1600512 | (i14 & 112) | ((i3 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f3 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i15 = i3 >> 12;
                    m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i16) {
                            int i17;
                            int i18;
                            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                            if ((i16 & 14) == 0) {
                                i17 = (composer2.changed(AppBar) ? 4 : 2) | i16;
                            } else {
                                i17 = i16;
                            }
                            if ((i17 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1484077694, i16, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                            }
                            if (function6 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                                i18 = 1;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier5 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function9 = function6;
                                int i19 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier5);
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
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                i18 = 1;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function9, composer2, ((i19 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i18, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function10 = title;
                            final int i110 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i111) {
                                    if ((i111 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2021518195, i111, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function10, composer3, ((i110 << 3) & 112) | 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function11 = function3M1046getLambda1$material_release;
                            final int i111 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                    }
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function12 = function11;
                                    int i21 = (i111 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    int i22 = i21 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                    Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                    function12.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i15 & 896) | (i15 & 14) | 1600512 | (i15 & 112) | ((i3 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f3 = fM952getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function9 = function6;
                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M1046getLambda1$material_release;
                final long j8 = primarySurface;
                final long j9 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                        AppBarKt.m956TopAppBarxWeB9s(title, modifier5, function9, function10, j8, j9, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            function4 = function2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (composerStartRestartGroup.changed(j3)) {
                        }
                        i3 |= i11;
                    } else {
                        j3 = j;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (composerStartRestartGroup.changed(j4)) {
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i16 = i3 >> 12;
                    m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i17) {
                            int i18;
                            int i19;
                            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                            if ((i17 & 14) == 0) {
                                i18 = (composer2.changed(AppBar) ? 4 : 2) | i17;
                            } else {
                                i18 = i17;
                            }
                            if ((i18 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1484077694, i17, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                            }
                            if (function6 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                                i19 = 1;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier6 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function11 = function6;
                                int i110 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier6);
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
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                i19 = 1;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function11, composer2, ((i110 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i19, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function12 = title;
                            final int i111 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i112) {
                                    if ((i112 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2021518195, i112, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function12, composer3, ((i111 << 3) & 112) | 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function13 = function3M1046getLambda1$material_release;
                            final int i112 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                    }
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function14 = function13;
                                    int i21 = (i112 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    int i22 = i21 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                    Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                    function14.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i16 & 896) | (i16 & 14) | 1600512 | (i16 & 112) | ((i3 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f3 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i17 = i3 >> 12;
                    m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i18) {
                            int i19;
                            int i110;
                            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                            if ((i18 & 14) == 0) {
                                i19 = (composer2.changed(AppBar) ? 4 : 2) | i18;
                            } else {
                                i19 = i18;
                            }
                            if ((i19 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1484077694, i18, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                            }
                            if (function6 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                                i110 = 1;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier6 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function11 = function6;
                                int i111 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier6);
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
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                i110 = 1;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function11, composer2, ((i111 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i110, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function12 = title;
                            final int i112 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i113) {
                                    if ((i113 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2021518195, i113, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function12, composer3, ((i112 << 3) & 112) | 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function13 = function3M1046getLambda1$material_release;
                            final int i113 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                    }
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function14 = function13;
                                    int i21 = (i113 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    int i22 = i21 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                    Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                    function14.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i17 & 896) | (i17 & 14) | 1600512 | (i17 & 112) | ((i3 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f3 = fM952getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function11 = function6;
                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function12 = function3M1046getLambda1$material_release;
                final long j10 = primarySurface;
                final long j11 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                        AppBarKt.m956TopAppBarxWeB9s(title, modifier6, function11, function12, j10, j11, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function5 = function3;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i18 = i3 >> 12;
                m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i19) {
                        int i110;
                        int i111;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i19 & 14) == 0) {
                            i110 = (composer2.changed(AppBar) ? 4 : 2) | i19;
                        } else {
                            i110 = i19;
                        }
                        if ((i110 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1484077694, i19, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                        }
                        if (function6 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                            i111 = 1;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier7 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function13 = function6;
                            int i112 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier7);
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
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            i111 = 1;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function13, composer2, ((i112 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i111, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function14 = title;
                        final int i113 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i114) {
                                if ((i114 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021518195, i114, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                }
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function14, composer3, ((i113 << 3) & 112) | 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function15 = function3M1046getLambda1$material_release;
                        final int i114 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i20) {
                                if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                }
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function16 = function15;
                                int i21 = (i114 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                int i22 = i21 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                function16.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i18 & 896) | (i18 & 14) | 1600512 | (i18 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f3 = fM952getTopAppBarElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i19 = i3 >> 12;
                m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i110) {
                        int i111;
                        int i112;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i110 & 14) == 0) {
                            i111 = (composer2.changed(AppBar) ? 4 : 2) | i110;
                        } else {
                            i111 = i110;
                        }
                        if ((i111 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1484077694, i110, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                        }
                        if (function6 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                            i112 = 1;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier7 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function13 = function6;
                            int i113 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier7);
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
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            i112 = 1;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function13, composer2, ((i113 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i112, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function14 = title;
                        final int i114 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i115) {
                                if ((i115 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021518195, i115, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                }
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function14, composer3, ((i114 << 3) & 112) | 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function15 = function3M1046getLambda1$material_release;
                        final int i115 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i20) {
                                if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                }
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function16 = function15;
                                int i21 = (i115 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                int i22 = i21 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                function16.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i19 & 896) | (i19 & 14) | 1600512 | (i19 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f3 = fM952getTopAppBarElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function13 = function6;
            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function14 = function3M1046getLambda1$material_release;
            final long j12 = primarySurface;
            final long j13 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                    AppBarKt.m956TopAppBarxWeB9s(title, modifier7, function13, function14, j12, j13, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (composerStartRestartGroup.changed(j3)) {
                        }
                        i3 |= i11;
                    } else {
                        j3 = j;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (composerStartRestartGroup.changed(j4)) {
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i110 = i3 >> 12;
                    m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i111) {
                            int i112;
                            int i113;
                            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                            if ((i111 & 14) == 0) {
                                i112 = (composer2.changed(AppBar) ? 4 : 2) | i111;
                            } else {
                                i112 = i111;
                            }
                            if ((i112 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1484077694, i111, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                            }
                            if (function6 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                                i113 = 1;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier8 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function15 = function6;
                                int i114 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier8);
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
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                i113 = 1;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function15, composer2, ((i114 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i113, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function16 = title;
                            final int i115 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i116) {
                                    if ((i116 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2021518195, i116, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function16, composer3, ((i115 << 3) & 112) | 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function17 = function3M1046getLambda1$material_release;
                            final int i116 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                    }
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function18 = function17;
                                    int i21 = (i116 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    int i22 = i21 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                    Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                    function18.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i110 & 896) | (i110 & 14) | 1600512 | (i110 & 112) | ((i3 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f3 = fM952getTopAppBarElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i6 != 0) {
                            function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                        } else {
                            function3M1046getLambda1$material_release = function5;
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i3 &= -57345;
                        } else {
                            primarySurface = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        } else {
                            jM1041contentColorForek8zF_U = j4;
                        }
                        if (i8 != 0) {
                            fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                            j5 = jM1041contentColorForek8zF_U;
                        } else {
                            j5 = jM1041contentColorForek8zF_U;
                            fM952getTopAppBarElevationD9Ej5fM = f2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i111 = i3 >> 12;
                    m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i112) {
                            int i113;
                            int i114;
                            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                            if ((i112 & 14) == 0) {
                                i113 = (composer2.changed(AppBar) ? 4 : 2) | i112;
                            } else {
                                i113 = i112;
                            }
                            if ((i113 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1484077694, i112, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                            }
                            if (function6 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                                i114 = 1;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier8 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function15 = function6;
                                int i115 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier8);
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
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                i114 = 1;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function15, composer2, ((i115 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i114, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function16 = title;
                            final int i116 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i117) {
                                    if ((i117 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2021518195, i117, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function16, composer3, ((i116 << 3) & 112) | 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function17 = function3M1046getLambda1$material_release;
                            final int i117 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                    }
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function18 = function17;
                                    int i21 = (i117 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    int i22 = i21 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                    Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                    androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                    function18.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i111 & 896) | (i111 & 14) | 1600512 | (i111 & 112) | ((i3 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f3 = fM952getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function15 = function6;
                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function16 = function3M1046getLambda1$material_release;
                final long j14 = primarySurface;
                final long j15 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                        AppBarKt.m956TopAppBarxWeB9s(title, modifier8, function15, function16, j14, j15, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function5 = function3;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i112 = i3 >> 12;
                m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i113) {
                        int i114;
                        int i115;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i113 & 14) == 0) {
                            i114 = (composer2.changed(AppBar) ? 4 : 2) | i113;
                        } else {
                            i114 = i113;
                        }
                        if ((i114 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1484077694, i113, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                        }
                        if (function6 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                            i115 = 1;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier9 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function17 = function6;
                            int i116 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier9);
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
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            i115 = 1;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function17, composer2, ((i116 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i115, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function18 = title;
                        final int i117 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i118) {
                                if ((i118 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021518195, i118, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                }
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function18, composer3, ((i117 << 3) & 112) | 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function19 = function3M1046getLambda1$material_release;
                        final int i118 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i20) {
                                if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                }
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function110 = function19;
                                int i21 = (i118 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                int i22 = i21 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                function110.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i112 & 896) | (i112 & 14) | 1600512 | (i112 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f3 = fM952getTopAppBarElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i113 = i3 >> 12;
                m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i114) {
                        int i115;
                        int i116;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i114 & 14) == 0) {
                            i115 = (composer2.changed(AppBar) ? 4 : 2) | i114;
                        } else {
                            i115 = i114;
                        }
                        if ((i115 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1484077694, i114, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                        }
                        if (function6 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                            i116 = 1;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier9 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function17 = function6;
                            int i117 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier9);
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
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            i116 = 1;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function17, composer2, ((i117 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i116, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function18 = title;
                        final int i118 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i119) {
                                if ((i119 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021518195, i119, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                }
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function18, composer3, ((i118 << 3) & 112) | 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function19 = function3M1046getLambda1$material_release;
                        final int i119 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i20) {
                                if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                }
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function110 = function19;
                                int i21 = (i119 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                int i22 = i21 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                function110.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i113 & 896) | (i113 & 14) | 1600512 | (i113 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f3 = fM952getTopAppBarElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function17 = function6;
            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function18 = function3M1046getLambda1$material_release;
            final long j16 = primarySurface;
            final long j17 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                    AppBarKt.m956TopAppBarxWeB9s(title, modifier9, function17, function18, j16, j17, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        function4 = function2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i114 = i3 >> 12;
                m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i115) {
                        int i116;
                        int i117;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i115 & 14) == 0) {
                            i116 = (composer2.changed(AppBar) ? 4 : 2) | i115;
                        } else {
                            i116 = i115;
                        }
                        if ((i116 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1484077694, i115, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                        }
                        if (function6 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                            i117 = 1;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier10 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function19 = function6;
                            int i118 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier10);
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
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            i117 = 1;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function19, composer2, ((i118 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i117, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function110 = title;
                        final int i119 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1110) {
                                if ((i1110 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021518195, i1110, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                }
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function110, composer3, ((i119 << 3) & 112) | 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function111 = function3M1046getLambda1$material_release;
                        final int i1110 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i20) {
                                if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                }
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function112 = function111;
                                int i21 = (i1110 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                int i22 = i21 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                function112.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i114 & 896) | (i114 & 14) | 1600512 | (i114 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f3 = fM952getTopAppBarElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i6 != 0) {
                        function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                    } else {
                        function3M1046getLambda1$material_release = function5;
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i3 &= -57345;
                    } else {
                        primarySurface = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    } else {
                        jM1041contentColorForek8zF_U = j4;
                    }
                    if (i8 != 0) {
                        fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                        j5 = jM1041contentColorForek8zF_U;
                    } else {
                        j5 = jM1041contentColorForek8zF_U;
                        fM952getTopAppBarElevationD9Ej5fM = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i115 = i3 >> 12;
                m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i116) {
                        int i117;
                        int i118;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i116 & 14) == 0) {
                            i117 = (composer2.changed(AppBar) ? 4 : 2) | i116;
                        } else {
                            i117 = i116;
                        }
                        if ((i117 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1484077694, i116, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                        }
                        if (function6 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                            i118 = 1;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier10 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function19 = function6;
                            int i119 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier10);
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
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            i118 = 1;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function19, composer2, ((i119 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i118, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function110 = title;
                        final int i1110 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1111) {
                                if ((i1111 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021518195, i1111, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                                }
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function110, composer3, ((i1110 << 3) & 112) | 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function111 = function3M1046getLambda1$material_release;
                        final int i1111 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i20) {
                                if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                                }
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function112 = function111;
                                int i21 = (i1111 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                int i22 = i21 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                                Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                                androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                                function112.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i115 & 896) | (i115 & 14) | 1600512 | (i115 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f3 = fM952getTopAppBarElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function19 = function6;
            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function110 = function3M1046getLambda1$material_release;
            final long j18 = primarySurface;
            final long j19 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                    AppBarKt.m956TopAppBarxWeB9s(title, modifier10, function19, function110, j18, j19, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function5 = function3;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            i3 |= i11;
        } else {
            j3 = j;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i3 |= i12;
        } else {
            j4 = j2;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        if ((i3 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i6 != 0) {
                    function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                } else {
                    function3M1046getLambda1$material_release = function5;
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -57345;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                } else {
                    jM1041contentColorForek8zF_U = j4;
                }
                if (i8 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    j5 = jM1041contentColorForek8zF_U;
                } else {
                    j5 = jM1041contentColorForek8zF_U;
                    fM952getTopAppBarElevationD9Ej5fM = f2;
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i6 != 0) {
                    function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                } else {
                    function3M1046getLambda1$material_release = function5;
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -57345;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                } else {
                    jM1041contentColorForek8zF_U = j4;
                }
                if (i8 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    j5 = jM1041contentColorForek8zF_U;
                } else {
                    j5 = jM1041contentColorForek8zF_U;
                    fM952getTopAppBarElevationD9Ej5fM = f2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
            }
            int i116 = i3 >> 12;
            m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i117) {
                    int i118;
                    int i119;
                    Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                    if ((i117 & 14) == 0) {
                        i118 = (composer2.changed(AppBar) ? 4 : 2) | i117;
                    } else {
                        i118 = i117;
                    }
                    if ((i118 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1484077694, i117, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                    }
                    if (function6 == null) {
                        composer2.startReplaceableGroup(-512812651);
                        SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                        composer2.endReplaceableGroup();
                        i119 = 1;
                    } else {
                        composer2.startReplaceableGroup(-512812592);
                        Modifier modifier11 = AppBarKt.TitleIconModifier;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function111 = function6;
                        int i1110 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier11);
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
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        i119 = 1;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function111, composer2, ((i1110 >> 3) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i119, null), 1.0f, false, 2, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    final Function2<? super Composer, ? super Integer, Unit> function112 = title;
                    final int i1111 = i3;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i1112) {
                            if ((i1112 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2021518195, i1112, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                            }
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function112, composer3, ((i1111 << 3) & 112) | 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function113 = function3M1046getLambda1$material_release;
                    final int i1112 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i20) {
                            if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                            }
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function114 = function113;
                            int i21 = (i1112 & 7168) | 438;
                            composer3.startReplaceableGroup(693286680);
                            int i22 = i21 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                            Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                            int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                            androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                            function114.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i116 & 896) | (i116 & 14) | 1600512 | (i116 & 112) | ((i3 << 12) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            f3 = fM952getTopAppBarElevationD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i6 != 0) {
                    function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                } else {
                    function3M1046getLambda1$material_release = function5;
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -57345;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                } else {
                    jM1041contentColorForek8zF_U = j4;
                }
                if (i8 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    j5 = jM1041contentColorForek8zF_U;
                } else {
                    j5 = jM1041contentColorForek8zF_U;
                    fM952getTopAppBarElevationD9Ej5fM = f2;
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i6 != 0) {
                    function3M1046getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m1046getLambda1$material_release();
                } else {
                    function3M1046getLambda1$material_release = function5;
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i3 &= -57345;
                } else {
                    primarySurface = j3;
                }
                if ((i2 & 32) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                } else {
                    jM1041contentColorForek8zF_U = j4;
                }
                if (i8 != 0) {
                    fM952getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m952getTopAppBarElevationD9Ej5fM();
                    j5 = jM1041contentColorForek8zF_U;
                } else {
                    j5 = jM1041contentColorForek8zF_U;
                    fM952getTopAppBarElevationD9Ej5fM = f2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
            }
            int i117 = i3 >> 12;
            m953AppBarcelAv9A(primarySurface, j5, fM952getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i118) {
                    int i119;
                    int i1110;
                    Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                    if ((i118 & 14) == 0) {
                        i119 = (composer2.changed(AppBar) ? 4 : 2) | i118;
                    } else {
                        i119 = i118;
                    }
                    if ((i119 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1484077694, i118, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                    }
                    if (function6 == null) {
                        composer2.startReplaceableGroup(-512812651);
                        SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                        composer2.endReplaceableGroup();
                        i1110 = 1;
                    } else {
                        composer2.startReplaceableGroup(-512812592);
                        Modifier modifier11 = AppBarKt.TitleIconModifier;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function111 = function6;
                        int i1111 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier11);
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
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        i1110 = 1;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function111, composer2, ((i1111 >> 3) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, i1110, null), 1.0f, false, 2, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    final Function2<? super Composer, ? super Integer, Unit> function112 = title;
                    final int i1112 = i3;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composer2, 48, -1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOooO00o);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i1113) {
                            if ((i1113 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2021518195, i1113, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:108)");
                            }
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function112, composer3, ((i1112 << 3) & 112) | 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function113 = function3M1046getLambda1$material_release;
                    final int i1113 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i20) {
                            if ((i20 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1157662914, i20, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                            }
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function114 = function113;
                            int i21 = (i1113 & 7168) | 438;
                            composer3.startReplaceableGroup(693286680);
                            int i22 = i21 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i22 & 112) | (i22 & 14));
                            Density density3 = (Density) OooO00o.OooO00o(composer3, -1323940314);
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                            int i23 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                            androidx.compose.animation.OooOO0.OooO00o((i23 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                            function114.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i21 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i117 & 896) | (i117 & 14) | 1600512 | (i117 & 112) | ((i3 << 12) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            f3 = fM952getTopAppBarElevationD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function111 = function6;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function112 = function3M1046getLambda1$material_release;
        final long j110 = primarySurface;
        final long j111 = j5;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                AppBarKt.m956TopAppBarxWeB9s(title, modifier11, function111, function112, j110, j111, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final float calculateCutoutCircleYIntercept(float f, float f2) {
        return -((float) Math.sqrt((f * f) - (f2 * f2)));
    }

    @NotNull
    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        Float fValueOf;
        Float fValueOf2;
        Pair pair;
        Float fValueOf3;
        Float fValueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f * f5;
        double d = (f6 - f5) * f4 * f5;
        float fSqrt = (f7 - ((float) Math.sqrt(d))) / f6;
        float fSqrt2 = (f7 + ((float) Math.sqrt(d))) / f6;
        float fSqrt3 = (float) Math.sqrt(f5 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f5 - (fSqrt2 * fSqrt2));
        if (f2 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        if (fFloatValue < f) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }

    private static final float square(float f) {
        return f * f;
    }
}
