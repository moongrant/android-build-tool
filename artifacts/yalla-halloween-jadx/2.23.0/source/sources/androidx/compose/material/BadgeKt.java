package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aS\u0010\u001e\u001a\u00020\u00112\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0002\u0010!\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\"\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\"\u0019\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\"\u0019\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\"\u0019\u0010\u000e\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"BadgeContentFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "BadgeHorizontalOffset", "Landroidx/compose/ui/unit/Dp;", "getBadgeHorizontalOffset", "()F", "F", "BadgeRadius", "getBadgeRadius", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Badge", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgedBox", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,187:1\n74#2:188\n75#2,11:190\n75#2:217\n76#2,11:219\n89#2:247\n75#2:255\n76#2,11:257\n89#2:285\n88#2:290\n75#2:294\n76#2,11:296\n89#2:324\n76#3:189\n76#3:218\n76#3:256\n76#3:295\n456#4,11:201\n460#4,13:230\n473#4,3:244\n460#4,13:268\n473#4,3:282\n467#4,3:287\n460#4,13:307\n473#4,3:321\n68#5,5:212\n73#5:243\n77#5:248\n67#5,6:249\n73#5:281\n77#5:286\n92#6:291\n64#6:330\n64#6:332\n79#7,2:292\n81#7:320\n85#7:325\n154#8:326\n154#8:327\n154#8:328\n154#8:329\n154#8:331\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n64#1:188\n64#1:190,11\n66#1:217\n66#1:219,11\n66#1:247\n71#1:255\n71#1:257,11\n71#1:285\n64#1:290\n140#1:294\n140#1:296,11\n140#1:324\n64#1:189\n66#1:218\n71#1:256\n140#1:295\n64#1:201,11\n66#1:230,13\n66#1:244,3\n71#1:268,13\n71#1:282,3\n64#1:287,3\n140#1:307,13\n140#1:321,3\n66#1:212,5\n66#1:243\n66#1:248\n71#1:249,6\n71#1:281\n71#1:286\n142#1:291\n182#1:330\n186#1:332\n140#1:292,2\n140#1:320\n140#1:325\n169#1:326\n172#1:327\n178#1:328\n182#1:329\n186#1:331\n*E\n"})
public final class BadgeKt {
    private static final float BadgeHorizontalOffset;
    private static final float BadgeRadius;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentRadius = Dp.m3765constructorimpl(8);
    private static final long BadgeContentFontSize = TextUnitKt.getSp(10);
    private static final float BadgeWithContentHorizontalOffset = Dp.m3765constructorimpl(-Dp.m3765constructorimpl(6));

    static {
        float f = 4;
        BadgeRadius = Dp.m3765constructorimpl(f);
        BadgeWithContentHorizontalPadding = Dp.m3765constructorimpl(f);
        BadgeHorizontalOffset = Dp.m3765constructorimpl(-Dp.m3765constructorimpl(f));
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[PHI: r2 r4 r15 r19
      0x00b0: PHI (r2v8 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v11 androidx.compose.ui.Modifier) binds: [B:73:0x00db, B:61:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r4v14 long) = (r4v6 long), (r4v15 long) binds: [B:73:0x00db, B:61:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r15v4 int) = (r15v1 int), (r15v5 int) binds: [B:73:0x00db, B:61:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r19v2 long) = (r19v0 long), (r19v3 long) binds: [B:73:0x00db, B:61:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0170  */
    /* JADX WARN: Code duplicated, block: B:90:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m969BadgeeopBjH0(@Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM1017getError0d7_KjU;
        long jM1041contentColorForek8zF_U;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4;
        Modifier modifier3;
        int i4;
        long j3;
        long j4;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        float f;
        Function0<ComposeUiNode> constructor;
        final int i5;
        final RowScopeInstance rowScopeInstance;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133484502);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            jM1017getError0d7_KjU = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(jM1017getError0d7_KjU)) ? 32 : 16;
        } else {
            jM1017getError0d7_KjU = j;
        }
        if ((i & 896) == 0) {
            jM1041contentColorForek8zF_U = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM1041contentColorForek8zF_U)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            jM1041contentColorForek8zF_U = j2;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 7168) == 0) {
                function4 = function3;
                i3 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1017getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1017getError0d7_KjU();
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1017getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    i4 = i3;
                    j3 = jM1017getError0d7_KjU;
                    j4 = jM1041contentColorForek8zF_U;
                    if (i7 != 0) {
                        function5 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1133484502, i4, -1, "androidx.compose.material.Badge (Badge.kt:129)");
                    }
                    if (function5 != null) {
                        f = BadgeWithContentRadius;
                    } else {
                        f = BadgeRadius;
                    }
                    RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(f);
                    float f2 = f * 2;
                    Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m168backgroundbw27NRU(SizeKt.m507defaultMinSizeVpY3zN4(modifier3, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)), j3, roundedCornerShapeM727RoundedCornerShape0680j_4), roundedCornerShapeM727RoundedCornerShape0680j_4), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                    Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM478paddingVpY3zN4$default);
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
                    Modifier modifier4 = modifier3;
                    i5 = i4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(521574215);
                    if (function5 != null) {
                        final int i8 = 6;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1660boximpl(j4))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                            public final void invoke(@Nullable Composer composer2, int i9) {
                                if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1784526485, i9, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                                TextStyle textStyleM3324copyCXVQc50 = button.m3324copyCXVQc50((4194271 & 1) != 0 ? button.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? button.spanStyle.getFontSize() : BadgeKt.BadgeContentFontSize, (4194271 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? button.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? button.paragraphStyle.getTextAlign() : null, (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? button.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? button.platformStyle : null, (4194271 & 524288) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? button.paragraphStyle.getHyphens() : null);
                                final Function3<RowScope, Composer, Integer, Unit> function6 = function5;
                                final RowScope rowScope = rowScopeInstance;
                                final int i10 = i8;
                                final int i11 = i5;
                                TextKt.ProvideTextStyle(textStyleM3324copyCXVQc50, ComposableLambdaKt.composableLambda(composer2, 915155142, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                                            ComposerKt.traceEventStart(915155142, i12, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
                                        }
                                        function6.invoke(rowScope, composer3, Integer.valueOf((i10 & 14) | ((i11 >> 6) & 112)));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, 56);
                    }
                    if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = j3;
                    jM1041contentColorForek8zF_U = j4;
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    i4 = i3;
                    j3 = jM1017getError0d7_KjU;
                    j4 = jM1041contentColorForek8zF_U;
                }
                function5 = function4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1133484502, i4, -1, "androidx.compose.material.Badge (Badge.kt:129)");
                }
                if (function5 != null) {
                    f = BadgeWithContentRadius;
                } else {
                    f = BadgeRadius;
                }
                RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(f);
                float f3 = f * 2;
                Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m168backgroundbw27NRU(SizeKt.m507defaultMinSizeVpY3zN4(modifier3, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f3)), j3, roundedCornerShapeM727RoundedCornerShape0680j_5), roundedCornerShapeM727RoundedCornerShape0680j_5), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
                Density density2 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM478paddingVpY3zN4$default2);
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
                Modifier modifier5 = modifier3;
                i5 = i4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(521574215);
                if (function5 != null) {
                    final int i9 = 6;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1660boximpl(j4))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                                ComposerKt.traceEventStart(1784526485, i10, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                            TextStyle textStyleM3324copyCXVQc50 = button.m3324copyCXVQc50((4194271 & 1) != 0 ? button.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? button.spanStyle.getFontSize() : BadgeKt.BadgeContentFontSize, (4194271 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? button.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? button.paragraphStyle.getTextAlign() : null, (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? button.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? button.platformStyle : null, (4194271 & 524288) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? button.paragraphStyle.getHyphens() : null);
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6 = function5;
                            final RowScope rowScope = rowScopeInstance;
                            final int i11 = i9;
                            final int i12 = i5;
                            TextKt.ProvideTextStyle(textStyleM3324copyCXVQc50, ComposableLambdaKt.composableLambda(composer2, 915155142, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                                        ComposerKt.traceEventStart(915155142, i13, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
                                    }
                                    function6.invoke(rowScope, composer3, Integer.valueOf((i11 & 14) | ((i12 >> 6) & 112)));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, 56);
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                j5 = j3;
                jM1041contentColorForek8zF_U = j4;
                modifier2 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j5 = jM1017getError0d7_KjU;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier6 = modifier2;
            final long j6 = jM1041contentColorForek8zF_U;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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
                    BadgeKt.m969BadgeeopBjH0(modifier6, j5, j6, function5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function4 = function3;
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1017getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1017getError0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1017getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                i4 = i3;
                j3 = jM1017getError0d7_KjU;
                j4 = jM1041contentColorForek8zF_U;
                if (i7 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1017getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1017getError0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1017getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                i4 = i3;
                j3 = jM1017getError0d7_KjU;
                j4 = jM1041contentColorForek8zF_U;
                if (i7 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133484502, i4, -1, "androidx.compose.material.Badge (Badge.kt:129)");
            }
            if (function5 != null) {
                f = BadgeWithContentRadius;
            } else {
                f = BadgeRadius;
            }
            RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(f);
            float f4 = f * 2;
            Modifier modifierM478paddingVpY3zN4$default3 = PaddingKt.m478paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m168backgroundbw27NRU(SizeKt.m507defaultMinSizeVpY3zN4(modifier3, Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(f4)), j3, roundedCornerShapeM727RoundedCornerShape0680j_6), roundedCornerShapeM727RoundedCornerShape0680j_6), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically3, composerStartRestartGroup, 54);
            Density density3 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM478paddingVpY3zN4$default3);
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
            Modifier modifier7 = modifier3;
            i5 = i4;
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy3, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(521574215);
            if (function5 != null) {
                final int i10 = 6;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1660boximpl(j4))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                            ComposerKt.traceEventStart(1784526485, i11, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextStyle textStyleM3324copyCXVQc50 = button.m3324copyCXVQc50((4194271 & 1) != 0 ? button.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? button.spanStyle.getFontSize() : BadgeKt.BadgeContentFontSize, (4194271 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? button.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? button.paragraphStyle.getTextAlign() : null, (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? button.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? button.platformStyle : null, (4194271 & 524288) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? button.paragraphStyle.getHyphens() : null);
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6 = function5;
                        final RowScope rowScope = rowScopeInstance;
                        final int i12 = i10;
                        final int i13 = i5;
                        TextKt.ProvideTextStyle(textStyleM3324copyCXVQc50, ComposableLambdaKt.composableLambda(composer2, 915155142, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                                    ComposerKt.traceEventStart(915155142, i14, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
                                }
                                function6.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 6) & 112)));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 56);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            j5 = j3;
            jM1041contentColorForek8zF_U = j4;
            modifier2 = modifier7;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1017getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1017getError0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1017getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                i4 = i3;
                j3 = jM1017getError0d7_KjU;
                j4 = jM1041contentColorForek8zF_U;
                if (i7 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1017getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1017getError0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1017getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                i4 = i3;
                j3 = jM1017getError0d7_KjU;
                j4 = jM1041contentColorForek8zF_U;
                if (i7 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133484502, i4, -1, "androidx.compose.material.Badge (Badge.kt:129)");
            }
            if (function5 != null) {
                f = BadgeWithContentRadius;
            } else {
                f = BadgeRadius;
            }
            RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(f);
            float f5 = f * 2;
            Modifier modifierM478paddingVpY3zN4$default4 = PaddingKt.m478paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m168backgroundbw27NRU(SizeKt.m507defaultMinSizeVpY3zN4(modifier3, Dp.m3765constructorimpl(f5), Dp.m3765constructorimpl(f5)), j3, roundedCornerShapeM727RoundedCornerShape0680j_7), roundedCornerShapeM727RoundedCornerShape0680j_7), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center4 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(center4, centerVertically4, composerStartRestartGroup, 54);
            Density density4 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM478paddingVpY3zN4$default4);
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
            Modifier modifier8 = modifier3;
            i5 = i4;
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf4, OooO0OO.OooO00o(companion4, composerM1309constructorimpl4, measurePolicyRowMeasurePolicy4, composerM1309constructorimpl4, density4, composerM1309constructorimpl4, layoutDirection4, composerM1309constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(521574215);
            if (function5 != null) {
                final int i11 = 6;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1660boximpl(j4))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                            ComposerKt.traceEventStart(1784526485, i12, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                        TextStyle textStyleM3324copyCXVQc50 = button.m3324copyCXVQc50((4194271 & 1) != 0 ? button.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? button.spanStyle.getFontSize() : BadgeKt.BadgeContentFontSize, (4194271 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (4194271 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? button.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? button.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? button.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? button.paragraphStyle.getTextAlign() : null, (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? button.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? button.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? button.platformStyle : null, (4194271 & 524288) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? button.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? button.paragraphStyle.getHyphens() : null);
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6 = function5;
                        final RowScope rowScope = rowScopeInstance;
                        final int i13 = i11;
                        final int i14 = i5;
                        TextKt.ProvideTextStyle(textStyleM3324copyCXVQc50, ComposableLambdaKt.composableLambda(composer2, 915155142, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                                    ComposerKt.traceEventStart(915155142, i15, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
                                }
                                function6.invoke(rowScope, composer3, Integer.valueOf((i13 & 14) | ((i14 >> 6) & 112)));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 56);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            j5 = j3;
            jM1041contentColorForek8zF_U = j4;
            modifier2 = modifier8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier9 = modifier2;
        final long j7 = jM1041contentColorForek8zF_U;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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
                BadgeKt.m969BadgeeopBjH0(modifier9, j5, j7, function5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0218  */
    /* JADX WARN: Code duplicated, block: B:65:0x0224  */
    /* JADX WARN: Code duplicated, block: B:66:0x0228  */
    /* JADX WARN: Code duplicated, block: B:69:0x0272  */
    /* JADX WARN: Code duplicated, block: B:74:0x027e  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BadgedBox(@NotNull final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> badge, @Nullable Modifier modifier, @NotNull final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Modifier modifier3;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> constructor3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(859805272);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(badge) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(859805272, i5, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
                }
                AnonymousClass2 anonymousClass2 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt.BadgedBox.2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                        return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i7);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                        return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i7);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo3measure3p2s80s(@NotNull final MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        for (Measurable measurable : measurables) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                                final Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                for (Measurable measurable2 : measurables) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                        final Placeable placeableMo2794measureBRTryo1 = measurable2.mo2794measureBRTryo0(j);
                                        return Layout.layout(placeableMo2794measureBRTryo1.getWidth(), placeableMo2794measureBRTryo1.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(placeableMo2794measureBRTryo1.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(placeableMo2794measureBRTryo1.get(AlignmentLineKt.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                                float badgeWithContentHorizontalOffset = placeableMo2794measureBRTryo0.getWidth() > Layout.mo318roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo1, 0, 0, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, Layout.mo318roundToPx0680j_4(badgeWithContentHorizontalOffset) + placeableMo2794measureBRTryo1.getWidth(), (-placeableMo2794measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                        return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i7);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                        return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i7);
                    }
                };
                Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                int i7 = (((i5 & 112) << 9) & 7168) | 6;
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
                Updater.m1316setimpl(composerM1309constructorimpl, anonymousClass2, companion.getSetMeasurePolicy());
                Updater.m1316setimpl(composerM1309constructorimpl, density, companion.getSetDensity());
                Updater.m1316setimpl(composerM1309constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1316setimpl(composerM1309constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                androidx.compose.animation.OooOO0.OooO00o((i7 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment center = companion3.getCenter();
                int i8 = ((i5 << 3) & 7168) | 54;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i9 = i8 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, (i9 & 112) | (i9 & 14));
                Density density2 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
                int i10 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
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
                androidx.compose.animation.OooOO0.OooO00o((i10 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i8 >> 6) & 112) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion2, "badge");
                int i11 = ((i5 << 9) & 7168) | 6;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i12 = i11 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
                Density density3 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId2);
                int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
                androidx.compose.animation.OooOO0.OooO00o((i13 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composer2, 2058660585);
                badge.invoke(boxScopeInstance, composer2, Integer.valueOf(((i11 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt.BadgedBox.3
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

                public final void invoke(@Nullable Composer composer3, int i14) {
                    BadgeKt.BadgedBox(badge, modifier4, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859805272, i5, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
            }
            AnonymousClass2 anonymousClass3 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt.BadgedBox.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo3measure3p2s80s(@NotNull final MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                            final Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            for (Measurable measurable2 : measurables) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                    final Placeable placeableMo2794measureBRTryo1 = measurable2.mo2794measureBRTryo0(j);
                                    return Layout.layout(placeableMo2794measureBRTryo1.getWidth(), placeableMo2794measureBRTryo1.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(placeableMo2794measureBRTryo1.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(placeableMo2794measureBRTryo1.get(AlignmentLineKt.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                            float badgeWithContentHorizontalOffset = placeableMo2794measureBRTryo0.getWidth() > Layout.mo318roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo1, 0, 0, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, Layout.mo318roundToPx0680j_4(badgeWithContentHorizontalOffset) + placeableMo2794measureBRTryo1.getWidth(), (-placeableMo2794measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i14);
                }
            };
            Density density4 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifier3);
            int i14 = (((i5 & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Updater.m1316setimpl(composerM1309constructorimpl4, anonymousClass3, companion4.getSetMeasurePolicy());
            Updater.m1316setimpl(composerM1309constructorimpl4, density4, companion4.getSetDensity());
            Updater.m1316setimpl(composerM1309constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
            Updater.m1316setimpl(composerM1309constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
            androidx.compose.animation.OooOO0.OooO00o((i14 >> 3) & 112, function3MaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion5, "anchor");
            Alignment.Companion companion6 = Alignment.INSTANCE;
            Alignment center2 = companion6.getCenter();
            int i15 = ((i5 << 3) & 7168) | 54;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i16 = i15 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
            Density density5 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId3);
            int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o((i17 >> 3) & 112, function3MaterializerOf5, OooO0OO.OooO00o(companion4, composerM1309constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl5, density5, composerM1309constructorimpl5, layoutDirection5, composerM1309constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            content.invoke(boxScopeInstance2, composerStartRestartGroup, Integer.valueOf(((i15 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId4 = LayoutIdKt.layoutId(companion5, "badge");
            int i18 = ((i5 << 9) & 7168) | 6;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i19 = i18 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion6.getTopStart(), false, composerStartRestartGroup, (i19 & 112) | (i19 & 14));
            Density density6 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierLayoutId4);
            int i110 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            androidx.compose.animation.OooOO0.OooO00o((i110 >> 3) & 112, function3MaterializerOf6, OooO0OO.OooO00o(companion4, composerM1309constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl6, density6, composerM1309constructorimpl6, layoutDirection6, composerM1309constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composer2, 2058660585);
            badge.invoke(boxScopeInstance2, composer2, Integer.valueOf(((i18 >> 6) & 112) | 6));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859805272, i5, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
            }
            AnonymousClass2 anonymousClass4 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt.BadgedBox.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i111) {
                    return androidx.compose.ui.layout.OooO.OooO00o(this, intrinsicMeasureScope, list, i111);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i111) {
                    return androidx.compose.ui.layout.OooO.OooO0O0(this, intrinsicMeasureScope, list, i111);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo3measure3p2s80s(@NotNull final MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                            final Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            for (Measurable measurable2 : measurables) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                    final Placeable placeableMo2794measureBRTryo1 = measurable2.mo2794measureBRTryo0(j);
                                    return Layout.layout(placeableMo2794measureBRTryo1.getWidth(), placeableMo2794measureBRTryo1.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(placeableMo2794measureBRTryo1.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(placeableMo2794measureBRTryo1.get(AlignmentLineKt.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                            float badgeWithContentHorizontalOffset = placeableMo2794measureBRTryo0.getWidth() > Layout.mo318roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo1, 0, 0, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, Layout.mo318roundToPx0680j_4(badgeWithContentHorizontalOffset) + placeableMo2794measureBRTryo1.getWidth(), (-placeableMo2794measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i111) {
                    return androidx.compose.ui.layout.OooO.OooO0OO(this, intrinsicMeasureScope, list, i111);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i111) {
                    return androidx.compose.ui.layout.OooO.OooO0Oo(this, intrinsicMeasureScope, list, i111);
                }
            };
            Density density7 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifier3);
            int i111 = (((i5 & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl7 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Updater.m1316setimpl(composerM1309constructorimpl7, anonymousClass4, companion7.getSetMeasurePolicy());
            Updater.m1316setimpl(composerM1309constructorimpl7, density7, companion7.getSetDensity());
            Updater.m1316setimpl(composerM1309constructorimpl7, layoutDirection7, companion7.getSetLayoutDirection());
            Updater.m1316setimpl(composerM1309constructorimpl7, viewConfiguration7, companion7.getSetViewConfiguration());
            androidx.compose.animation.OooOO0.OooO00o((i111 >> 3) & 112, function3MaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier.Companion companion8 = Modifier.INSTANCE;
            Modifier modifierLayoutId5 = LayoutIdKt.layoutId(companion8, "anchor");
            Alignment.Companion companion9 = Alignment.INSTANCE;
            Alignment center3 = companion9.getCenter();
            int i112 = ((i5 << 3) & 7168) | 54;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i113 = i112 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, (i113 & 112) | (i113 & 14));
            Density density8 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierLayoutId5);
            int i114 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM1309constructorimpl8 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o((i114 >> 3) & 112, function3MaterializerOf8, OooO0OO.OooO00o(companion7, composerM1309constructorimpl8, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl8, density8, composerM1309constructorimpl8, layoutDirection8, composerM1309constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            content.invoke(boxScopeInstance3, composerStartRestartGroup, Integer.valueOf(((i112 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId6 = LayoutIdKt.layoutId(companion8, "badge");
            int i115 = ((i5 << 9) & 7168) | 6;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i116 = i115 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion9.getTopStart(), false, composerStartRestartGroup, (i116 & 112) | (i116 & 14));
            Density density9 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierLayoutId6);
            int i117 = ((((i115 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM1309constructorimpl9 = Updater.m1309constructorimpl(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            androidx.compose.animation.OooOO0.OooO00o((i117 >> 3) & 112, function3MaterializerOf9, OooO0OO.OooO00o(companion7, composerM1309constructorimpl9, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl9, density9, composerM1309constructorimpl9, layoutDirection9, composerM1309constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composer2, 2058660585);
            badge.invoke(boxScopeInstance3, composer2, Integer.valueOf(((i115 >> 6) & 112) | 6));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt.BadgedBox.3
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

            public final void invoke(@Nullable Composer composer3, int i118) {
                BadgeKt.BadgedBox(badge, modifier4, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeWithContentRadius;
    }
}
