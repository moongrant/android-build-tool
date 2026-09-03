package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J|\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001bR\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ThreeLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconThreeLineVerticalPadding", "MinHeight", "ThreeLineBaselineFirstOffset", "ThreeLineBaselineSecondOffset", "ThreeLineBaselineThirdOffset", "ThreeLineTrailingTopPadding", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ViewHierarchyConstants.TEXT_KEY, "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n75#2,6:430\n81#2:462\n85#2:506\n75#3:436\n76#3,11:438\n75#3:469\n76#3,11:471\n89#3:499\n89#3:505\n76#4:437\n76#4:470\n460#5,13:449\n460#5,13:482\n473#5,3:496\n473#5,3:502\n51#6:463\n58#6:501\n68#7,5:464\n73#7:495\n77#7:500\n154#8:507\n154#8:508\n154#8:509\n154#8:510\n154#8:511\n154#8:512\n154#8:513\n154#8:514\n154#8:515\n154#8:516\n154#8:517\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n*L\n303#1:430,6\n303#1:462\n303#1:506\n303#1:436\n303#1:438,11\n306#1:469\n306#1:471,11\n306#1:499\n303#1:505\n303#1:437\n306#1:470\n303#1:449,13\n306#1:482,13\n306#1:496,3\n303#1:502,3\n305#1:463\n332#1:501\n306#1:464,5\n306#1:495\n306#1:500\n276#1:507\n279#1:508\n280#1:509\n281#1:510\n284#1:511\n285#1:512\n286#1:513\n287#1:514\n288#1:515\n289#1:516\n292#1:517\n*E\n"})
final class ThreeLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconThreeLineVerticalPadding;
    private static final float ThreeLineBaselineSecondOffset;
    private static final float ThreeLineBaselineThirdOffset;
    private static final float ThreeLineTrailingTopPadding;
    private static final float TrailingRightPadding;

    @NotNull
    public static final ThreeLine INSTANCE = new ThreeLine();
    private static final float MinHeight = Dp.m3765constructorimpl(88);
    private static final float IconMinPaddedWidth = Dp.m3765constructorimpl(40);
    private static final float ThreeLineBaselineFirstOffset = Dp.m3765constructorimpl(28);

    static {
        float f = 16;
        IconLeftPadding = Dp.m3765constructorimpl(f);
        IconThreeLineVerticalPadding = Dp.m3765constructorimpl(f);
        ContentLeftPadding = Dp.m3765constructorimpl(f);
        ContentRightPadding = Dp.m3765constructorimpl(f);
        float f2 = 20;
        ThreeLineBaselineSecondOffset = Dp.m3765constructorimpl(f2);
        ThreeLineBaselineThirdOffset = Dp.m3765constructorimpl(f2);
        ThreeLineTrailingTopPadding = Dp.m3765constructorimpl(f);
        TrailingRightPadding = Dp.m3765constructorimpl(f);
    }

    private ThreeLine() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0203  */
    /* JADX WARN: Code duplicated, block: B:104:0x0294  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ff  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void ListItem(@Nullable Modifier modifier, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> text, @NotNull final Function2<? super Composer, ? super Integer, Unit> secondaryText, @Nullable final Function2<? super Composer, ? super Integer, Unit> function3, @Nullable final Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        final int i6;
        final Modifier modifier3;
        Alignment.Companion companion;
        ComposeUiNode.Companion companion2;
        Function0<ComposeUiNode> constructor;
        float f;
        Modifier.Companion companion3;
        Function0<ComposeUiNode> constructor2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1749738797);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(text) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(secondaryText) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i5 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((2995931 & i6) == 599186 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1749738797, i6, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)");
                }
                Modifier modifierM511heightInVpY3zN4$default = SizeKt.m511heightInVpY3zN4$default(modifier3, MinHeight, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion, start, composerStartRestartGroup, 0, -1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM511heightInVpY3zN4$default);
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
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-280382992);
                if (function2 != null) {
                    float f2 = IconLeftPadding;
                    float fM3765constructorimpl = Dp.m3765constructorimpl(f2 + IconMinPaddedWidth);
                    Modifier modifierM527sizeInqDBjuR0$default = SizeKt.m527sizeInqDBjuR0$default(Modifier.INSTANCE, fM3765constructorimpl, fM3765constructorimpl, 0.0f, 0.0f, 12, null);
                    float f3 = IconThreeLineVerticalPadding;
                    Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(modifierM527sizeInqDBjuR0$default, f2, f3, 0.0f, f3, 4, null);
                    Alignment centerStart = companion.getCenterStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                    Density density2 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
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
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    OooO0O0.OooO00o((i6 >> 3) & 14, function2, composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                f = ThreeLineBaselineFirstOffset;
                List listListOf = CollectionsKt.listOf((Object[]) new Dp[]{Dp.m3763boximpl(f), Dp.m3763boximpl(ThreeLineBaselineSecondOffset), Dp.m3763boximpl(ThreeLineBaselineThirdOffset)});
                companion3 = Modifier.INSTANCE;
                ListItemKt.BaselinesOffsetColumn(listListOf, PaddingKt.m480paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318094245, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
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
                    public final void invoke(@Nullable Composer composer2, int i8) {
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-318094245, i8, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
                        }
                        composer2.startReplaceableGroup(-755940677);
                        Function2<Composer, Integer, Unit> function5 = function3;
                        if (function5 != null) {
                            function5.invoke(composer2, Integer.valueOf((i6 >> 12) & 14));
                        }
                        composer2.endReplaceableGroup();
                        text.invoke(composer2, Integer.valueOf((i6 >> 6) & 14));
                        if (androidx.compose.animation.OooOO0O.OooO00o((i6 >> 9) & 14, secondaryText, composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 390, 0);
                composerStartRestartGroup.startReplaceableGroup(-678936717);
                if (function4 != null) {
                    float f4 = ThreeLineTrailingTopPadding;
                    ListItemKt.m1106OffsetToBaselineOrCenterKz89ssw(Dp.m3765constructorimpl(f - f4), PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, f4, TrailingRightPadding, 0.0f, 9, null), function4, composerStartRestartGroup, ((i6 >> 9) & 896) | 54, 0);
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine.ListItem.2
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

                public final void invoke(@Nullable Composer composer2, int i8) {
                    ThreeLine.this.ListItem(modifier3, function2, text, secondaryText, function3, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i4 = 196608;
        i3 |= i4;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i5 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        i6 = i3;
        if ((2995931 & i6) == 599186) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749738797, i6, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)");
            }
            Modifier modifierM511heightInVpY3zN4$default2 = SizeKt.m511heightInVpY3zN4$default(modifier3, MinHeight, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion, start2, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM511heightInVpY3zN4$default2);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion2, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-280382992);
            if (function2 != null) {
                float f5 = IconLeftPadding;
                float fM3765constructorimpl2 = Dp.m3765constructorimpl(f5 + IconMinPaddedWidth);
                Modifier modifierM527sizeInqDBjuR0$default2 = SizeKt.m527sizeInqDBjuR0$default(Modifier.INSTANCE, fM3765constructorimpl2, fM3765constructorimpl2, 0.0f, 0.0f, 12, null);
                float f6 = IconThreeLineVerticalPadding;
                Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(modifierM527sizeInqDBjuR0$default2, f5, f6, 0.0f, f6, 4, null);
                Alignment centerStart2 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
                Density density4 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default2);
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
                Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf4, OooO0OO.OooO00o(companion2, composerM1309constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl4, density4, composerM1309constructorimpl4, layoutDirection4, composerM1309constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                OooO0O0.OooO00o((i6 >> 3) & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            f = ThreeLineBaselineFirstOffset;
            List listListOf2 = CollectionsKt.listOf((Object[]) new Dp[]{Dp.m3763boximpl(f), Dp.m3763boximpl(ThreeLineBaselineSecondOffset), Dp.m3763boximpl(ThreeLineBaselineThirdOffset)});
            companion3 = Modifier.INSTANCE;
            ListItemKt.BaselinesOffsetColumn(listListOf2, PaddingKt.m480paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318094245, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
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
                public final void invoke(@Nullable Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-318094245, i8, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
                    }
                    composer2.startReplaceableGroup(-755940677);
                    Function2<Composer, Integer, Unit> function5 = function3;
                    if (function5 != null) {
                        function5.invoke(composer2, Integer.valueOf((i6 >> 12) & 14));
                    }
                    composer2.endReplaceableGroup();
                    text.invoke(composer2, Integer.valueOf((i6 >> 6) & 14));
                    if (androidx.compose.animation.OooOO0O.OooO00o((i6 >> 9) & 14, secondaryText, composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 390, 0);
            composerStartRestartGroup.startReplaceableGroup(-678936717);
            if (function4 != null) {
                float f7 = ThreeLineTrailingTopPadding;
                ListItemKt.m1106OffsetToBaselineOrCenterKz89ssw(Dp.m3765constructorimpl(f - f7), PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, f7, TrailingRightPadding, 0.0f, 9, null), function4, composerStartRestartGroup, ((i6 >> 9) & 896) | 54, 0);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749738797, i6, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)");
            }
            Modifier modifierM511heightInVpY3zN4$default3 = SizeKt.m511heightInVpY3zN4$default(modifier3, MinHeight, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start3 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(companion, start3, composerStartRestartGroup, 0, -1323940314);
            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM511heightInVpY3zN4$default3);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf5, OooO0OO.OooO00o(companion2, composerM1309constructorimpl5, measurePolicyOooO00o3, composerM1309constructorimpl5, density5, composerM1309constructorimpl5, layoutDirection5, composerM1309constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-280382992);
            if (function2 != null) {
                float f8 = IconLeftPadding;
                float fM3765constructorimpl3 = Dp.m3765constructorimpl(f8 + IconMinPaddedWidth);
                Modifier modifierM527sizeInqDBjuR0$default3 = SizeKt.m527sizeInqDBjuR0$default(Modifier.INSTANCE, fM3765constructorimpl3, fM3765constructorimpl3, 0.0f, 0.0f, 12, null);
                float f9 = IconThreeLineVerticalPadding;
                Modifier modifierM480paddingqDBjuR0$default3 = PaddingKt.m480paddingqDBjuR0$default(modifierM527sizeInqDBjuR0$default3, f8, f9, 0.0f, f9, 4, null);
                Alignment centerStart3 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart3, false, composerStartRestartGroup, 6);
                Density density6 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default3);
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
                Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf6, OooO0OO.OooO00o(companion2, composerM1309constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl6, density6, composerM1309constructorimpl6, layoutDirection6, composerM1309constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                OooO0O0.OooO00o((i6 >> 3) & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            f = ThreeLineBaselineFirstOffset;
            List listListOf3 = CollectionsKt.listOf((Object[]) new Dp[]{Dp.m3763boximpl(f), Dp.m3763boximpl(ThreeLineBaselineSecondOffset), Dp.m3763boximpl(ThreeLineBaselineThirdOffset)});
            companion3 = Modifier.INSTANCE;
            ListItemKt.BaselinesOffsetColumn(listListOf3, PaddingKt.m480paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance3, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318094245, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
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
                public final void invoke(@Nullable Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-318094245, i8, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
                    }
                    composer2.startReplaceableGroup(-755940677);
                    Function2<Composer, Integer, Unit> function5 = function3;
                    if (function5 != null) {
                        function5.invoke(composer2, Integer.valueOf((i6 >> 12) & 14));
                    }
                    composer2.endReplaceableGroup();
                    text.invoke(composer2, Integer.valueOf((i6 >> 6) & 14));
                    if (androidx.compose.animation.OooOO0O.OooO00o((i6 >> 9) & 14, secondaryText, composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 390, 0);
            composerStartRestartGroup.startReplaceableGroup(-678936717);
            if (function4 != null) {
                float f10 = ThreeLineTrailingTopPadding;
                ListItemKt.m1106OffsetToBaselineOrCenterKz89ssw(Dp.m3765constructorimpl(f - f10), PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, f10, TrailingRightPadding, 0.0f, 9, null), function4, composerStartRestartGroup, ((i6 >> 9) & 896) | 54, 0);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine.ListItem.2
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

            public final void invoke(@Nullable Composer composer2, int i8) {
                ThreeLine.this.ListItem(modifier3, function2, text, secondaryText, function3, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
