package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
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
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a3\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001ac\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a{\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00012\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a \u0010&\u001a\u00020\f2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010'\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"HeightToFirstLine", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", ViewHierarchyConstants.TEXT_KEY, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", NativeProtocol.WEB_DIALOG_ACTION, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "Snackbar", "snackbarData", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "actionColor", "elevation", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,364:1\n154#2:365\n154#2:366\n154#2:367\n154#2:655\n154#2:656\n154#2:657\n154#2:658\n154#2:659\n154#2:660\n154#2:661\n154#2:662\n154#2:663\n71#3,4:368\n75#3,11:373\n75#3:401\n76#3,11:403\n89#3:431\n88#3:436\n75#3:443\n76#3,11:445\n75#3:476\n76#3,11:478\n89#3:506\n75#3:514\n76#3,11:516\n89#3:544\n89#3:549\n74#3:551\n75#3,11:553\n75#3:581\n76#3,11:583\n89#3:611\n75#3:619\n76#3,11:621\n89#3:649\n88#3:654\n76#4:372\n76#4:402\n76#4:444\n76#4:477\n76#4:515\n76#4:552\n76#4:582\n76#4:620\n456#5,11:384\n460#5,13:414\n473#5,3:428\n467#5,3:433\n460#5,13:456\n460#5,13:489\n473#5,3:503\n460#5,13:527\n473#5,3:541\n473#5,3:546\n456#5,11:564\n460#5,13:594\n473#5,3:608\n460#5,13:632\n473#5,3:646\n467#5,3:651\n67#6,6:395\n73#6:427\n77#6:432\n67#6,6:470\n73#6:502\n77#6:507\n67#6,6:508\n73#6:540\n77#6:545\n67#6,6:575\n73#6:607\n77#6:612\n67#6,6:613\n73#6:645\n77#6:650\n74#7,6:437\n80#7:469\n84#7:550\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n88#1:365\n160#1:366\n175#1:367\n355#1:655\n356#1:656\n357#1:657\n358#1:658\n359#1:659\n360#1:660\n361#1:661\n362#1:662\n363#1:663\n237#1:368,4\n237#1:373,11\n238#1:401\n238#1:403,11\n238#1:431\n237#1:436\n275#1:443\n275#1:445,11\n283#1:476\n283#1:478,11\n283#1:506\n287#1:514\n287#1:516,11\n287#1:544\n275#1:549\n298#1:551\n298#1:553,11\n300#1:581\n300#1:583,11\n300#1:611\n301#1:619\n301#1:621,11\n301#1:649\n298#1:654\n237#1:372\n238#1:402\n275#1:444\n283#1:477\n287#1:515\n298#1:552\n300#1:582\n301#1:620\n237#1:384,11\n238#1:414,13\n238#1:428,3\n237#1:433,3\n275#1:456,13\n283#1:489,13\n283#1:503,3\n287#1:527,13\n287#1:541,3\n275#1:546,3\n298#1:564,11\n300#1:594,13\n300#1:608,3\n301#1:632,13\n301#1:646,3\n298#1:651,3\n238#1:395,6\n238#1:427\n238#1:432\n283#1:470,6\n283#1:502\n283#1:507\n287#1:508,6\n287#1:540\n287#1:545\n300#1:575,6\n300#1:607\n300#1:612\n301#1:613,6\n301#1:645\n301#1:650\n275#1:437,6\n275#1:469\n275#1:550\n*E\n"})
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m3765constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m3765constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m3765constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m3765constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m3765constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m3765constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m3765constructorimpl(68);

    static {
        float f = 8;
        HorizontalSpacingButtonSide = Dp.m3765constructorimpl(f);
        TextEndExtraSpacing = Dp.m3765constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NewLineButtonSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function4 = function3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i3, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:270)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(modifierFillMaxWidth$default, f, 0.0f, f2, SeparateButtonExtraY, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(AlignmentLineKt.m364paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f2, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default2);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlign);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            function4 = function3;
            function4.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.NewLineButtonSnackbar.2
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
                SnackbarKt.NewLineButtonSnackbar(function2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OneRowSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-534813202);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function4 = function3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i3, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            final String str = NativeProtocol.WEB_DIALOG_ACTION;
            final String str2 = ViewHierarchyConstants.TEXT_KEY;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt.OneRowSnackbar.2
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
                    int iMax;
                    final int i4;
                    final int height;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    String str3 = str;
                    for (Measurable measurable : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str3)) {
                            final Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(j);
                            int iCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m3733getMaxWidthimpl(j) - placeableMo2794measureBRTryo0.getWidth()) - Layout.mo318roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing), Constraints.m3735getMinWidthimpl(j));
                            String str4 = str2;
                            for (Measurable measurable2 : measurables) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                    final Placeable placeableMo2794measureBRTryo1 = measurable2.mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, 0, iCoerceAtLeast, 0, 0, 9, null));
                                    int i5 = placeableMo2794measureBRTryo1.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                    if (!(i5 != Integer.MIN_VALUE)) {
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                    int i6 = placeableMo2794measureBRTryo1.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                    if (!(i6 != Integer.MIN_VALUE)) {
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                    boolean z = i5 == i6;
                                    final int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(j) - placeableMo2794measureBRTryo0.getWidth();
                                    if (z) {
                                        int iMax2 = Math.max(Layout.mo318roundToPx0680j_4(SnackbarKt.SnackbarMinHeightOneLine), placeableMo2794measureBRTryo0.getHeight());
                                        int height2 = (iMax2 - placeableMo2794measureBRTryo1.getHeight()) / 2;
                                        int i7 = placeableMo2794measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                        int i8 = i7 != Integer.MIN_VALUE ? (i5 + height2) - i7 : 0;
                                        iMax = iMax2;
                                        height = i8;
                                        i4 = height2;
                                    } else {
                                        int iMo318roundToPx0680j_4 = Layout.mo318roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i5;
                                        iMax = Math.max(Layout.mo318roundToPx0680j_4(SnackbarKt.SnackbarMinHeightTwoLines), placeableMo2794measureBRTryo1.getHeight() + iMo318roundToPx0680j_4);
                                        i4 = iMo318roundToPx0680j_4;
                                        height = (iMax - placeableMo2794measureBRTryo0.getHeight()) / 2;
                                    }
                                    return MeasureScope.CC.OooOOo0(Layout, Constraints.m3733getMaxWidthimpl(j), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$measure$4
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
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo1, 0, i4, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, iM3733getMaxWidthimpl, height, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM480paddingqDBjuR0$default);
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
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, ViewHierarchyConstants.TEXT_KEY), 0.0f, SnackbarVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM478paddingVpY3zN4$default);
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
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, NativeProtocol.WEB_DIALOG_ACTION);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion2, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            function4 = function3;
            function4.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.OneRowSnackbar.3
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
                SnackbarKt.OneRowSnackbar(function2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0142 A[PHI: r0 r2 r4 r5 r6 r8 r13
      0x0142: PHI (r0v15 androidx.compose.ui.Modifier) = (r0v12 androidx.compose.ui.Modifier), (r0v20 androidx.compose.ui.Modifier) binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r2v7 boolean) = (r2v2 boolean), (r2v8 boolean) binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r4v25 int) = (r4v19 int), (r4v28 int) binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r5v8 androidx.compose.ui.graphics.Shape) = (r5v3 androidx.compose.ui.graphics.Shape), (r5v9 androidx.compose.ui.graphics.Shape) binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r6v6 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r6v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r6v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r8v9 long) = (r8v4 long), (r8v3 long) binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r13v13 long) = (r13v4 long), (r13v3 long) binds: [B:128:0x018a, B:107:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x01de  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Snackbar-7zSek6w, reason: not valid java name */
    public static final void m1167Snackbar7zSek6w(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z, @Nullable Shape shape, long j, long j2, float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function3;
        int i4;
        int i5;
        long backgroundColor;
        long jM1027getSurface0d7_KjU;
        int i6;
        float f2;
        int i7;
        int i8;
        Modifier modifier2;
        final boolean z2;
        Shape small;
        float fM3765constructorimpl;
        final int i9;
        final Shape shape2;
        final boolean z3;
        Modifier modifier3;
        final float f3;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-558258760);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 112) == 0) {
                function3 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 7168) != 0) {
                    i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        backgroundColor = j;
                        int i13 = composerStartRestartGroup.changed(backgroundColor) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        backgroundColor = j;
                    }
                    i3 |= i13;
                } else {
                    backgroundColor = j;
                }
                if ((i & 458752) == 0) {
                    jM1027getSurface0d7_KjU = j2;
                    if ((i2 & 32) == 0 || !composerStartRestartGroup.changed(jM1027getSurface0d7_KjU)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i3 |= i10;
                } else {
                    jM1027getSurface0d7_KjU = j2;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = 8388608;
                        } else {
                            i8 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i12 != 0) {
                                function3 = null;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i3 &= -7169;
                            } else {
                                small = shape;
                            }
                            if ((i2 & 16) != 0) {
                                backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                                i3 = (-458753) & i3;
                            }
                            if (i6 != 0) {
                                fM3765constructorimpl = Dp.m3765constructorimpl(6);
                            }
                            long j4 = backgroundColor;
                            i9 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                            }
                            int i14 = i9 >> 6;
                            SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j4, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                        ComposerKt.traceEventStart(-2084221700, i15, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                                    }
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                                    final Function2<Composer, Integer, Unit> function4 = function3;
                                    final Function2<Composer, Integer, Unit> function5 = content;
                                    final int i16 = i9;
                                    final boolean z4 = z2;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                                ComposerKt.traceEventStart(1939362236, i17, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                            }
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                            final Function2<Composer, Integer, Unit> function6 = function4;
                                            final Function2<Composer, Integer, Unit> function7 = function5;
                                            final int i18 = i16;
                                            final boolean z5 = z4;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(225114541, i19, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                                    }
                                                    if (function6 == null) {
                                                        composer4.startReplaceableGroup(59708346);
                                                        SnackbarKt.TextOnlySnackbar(function7, composer4, (i18 >> 21) & 14);
                                                        composer4.endReplaceableGroup();
                                                    } else if (z5) {
                                                        composer4.startReplaceableGroup(59708411);
                                                        Function2<Composer, Integer, Unit> function8 = function7;
                                                        Function2<Composer, Integer, Unit> function9 = function6;
                                                        int i20 = i18;
                                                        SnackbarKt.NewLineButtonSnackbar(function8, function9, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer4.startReplaceableGroup(59708478);
                                                        Function2<Composer, Integer, Unit> function10 = function7;
                                                        Function2<Composer, Integer, Unit> function11 = function6;
                                                        int i21 = i18;
                                                        SnackbarKt.OneRowSnackbar(function10, function11, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), composer3, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | ((i9 >> 3) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            backgroundColor = j4;
                            shape2 = small;
                            z3 = z2;
                            modifier3 = modifier2;
                            f3 = fM3765constructorimpl;
                            j3 = jM1027getSurface0d7_KjU;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            z2 = z;
                            small = shape;
                        }
                        fM3765constructorimpl = f2;
                        long j5 = backgroundColor;
                        i9 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                        }
                        int i15 = i9 >> 6;
                        SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j5, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                    ComposerKt.traceEventStart(-2084221700, i16, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final Function2<? super Composer, ? super Integer, Unit> function5 = content;
                                final int i17 = i9;
                                final boolean z4 = z2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                            ComposerKt.traceEventStart(1939362236, i18, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                        }
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                        final Function2<? super Composer, ? super Integer, Unit> function6 = function4;
                                        final Function2<? super Composer, ? super Integer, Unit> function7 = function5;
                                        final int i19 = i17;
                                        final boolean z5 = z4;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i110) {
                                                if ((i110 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(225114541, i110, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                                }
                                                if (function6 == null) {
                                                    composer4.startReplaceableGroup(59708346);
                                                    SnackbarKt.TextOnlySnackbar(function7, composer4, (i19 >> 21) & 14);
                                                    composer4.endReplaceableGroup();
                                                } else if (z5) {
                                                    composer4.startReplaceableGroup(59708411);
                                                    Function2<Composer, Integer, Unit> function8 = function7;
                                                    Function2<Composer, Integer, Unit> function9 = function6;
                                                    int i20 = i19;
                                                    SnackbarKt.NewLineButtonSnackbar(function8, function9, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer4.startReplaceableGroup(59708478);
                                                    Function2<Composer, Integer, Unit> function10 = function7;
                                                    Function2<Composer, Integer, Unit> function11 = function6;
                                                    int i21 = i19;
                                                    SnackbarKt.OneRowSnackbar(function10, function11, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer3, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | ((i9 >> 3) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        backgroundColor = j5;
                        shape2 = small;
                        z3 = z2;
                        modifier3 = modifier2;
                        f3 = fM3765constructorimpl;
                        j3 = jM1027getSurface0d7_KjU;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z3 = z;
                        shape2 = shape;
                        j3 = jM1027getSurface0d7_KjU;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = modifier3;
                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                    final long j6 = backgroundColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                            SnackbarKt.m1167Snackbar7zSek6w(modifier4, function4, z3, shape2, j6, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 12582912;
                i3 |= i8;
                if ((23967451 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    }
                    long j7 = backgroundColor;
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i16 = i9 >> 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j7, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                ComposerKt.traceEventStart(-2084221700, i17, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                            final Function2<? super Composer, ? super Integer, Unit> function6 = content;
                            final int i18 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                        ComposerKt.traceEventStart(1939362236, i19, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function7 = function5;
                                    final Function2<? super Composer, ? super Integer, Unit> function8 = function6;
                                    final int i110 = i18;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i111) {
                                            if ((i111 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(225114541, i111, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                            }
                                            if (function7 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function8, composer4, (i110 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                            } else if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function9 = function8;
                                                Function2<Composer, Integer, Unit> function10 = function7;
                                                int i20 = i110;
                                                SnackbarKt.NewLineButtonSnackbar(function9, function10, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer4.startReplaceableGroup(59708478);
                                                Function2<Composer, Integer, Unit> function11 = function8;
                                                Function2<Composer, Integer, Unit> function12 = function7;
                                                int i21 = i110;
                                                SnackbarKt.OneRowSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | ((i9 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j7;
                    shape2 = small;
                    z3 = z2;
                    modifier3 = modifier2;
                    f3 = fM3765constructorimpl;
                    j3 = jM1027getSurface0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    }
                    long j8 = backgroundColor;
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i17 = i9 >> 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j8, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                ComposerKt.traceEventStart(-2084221700, i18, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                            final Function2<? super Composer, ? super Integer, Unit> function6 = content;
                            final int i19 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                        ComposerKt.traceEventStart(1939362236, i110, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function7 = function5;
                                    final Function2<? super Composer, ? super Integer, Unit> function8 = function6;
                                    final int i111 = i19;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i112) {
                                            if ((i112 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(225114541, i112, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                            }
                                            if (function7 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function8, composer4, (i111 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                            } else if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function9 = function8;
                                                Function2<Composer, Integer, Unit> function10 = function7;
                                                int i20 = i111;
                                                SnackbarKt.NewLineButtonSnackbar(function9, function10, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer4.startReplaceableGroup(59708478);
                                                Function2<Composer, Integer, Unit> function11 = function8;
                                                Function2<Composer, Integer, Unit> function12 = function7;
                                                int i21 = i111;
                                                SnackbarKt.OneRowSnackbar(function11, function12, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | ((i9 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j8;
                    shape2 = small;
                    z3 = z2;
                    modifier3 = modifier2;
                    f3 = fM3765constructorimpl;
                    j3 = jM1027getSurface0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                final long j9 = backgroundColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                        SnackbarKt.m1167Snackbar7zSek6w(modifier5, function5, z3, shape2, j9, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            if ((i & 7168) != 0) {
                i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    backgroundColor = j;
                    if (composerStartRestartGroup.changed(backgroundColor)) {
                    }
                    i3 |= i13;
                } else {
                    backgroundColor = j;
                }
                i3 |= i13;
            } else {
                backgroundColor = j;
            }
            if ((i & 458752) == 0) {
                jM1027getSurface0d7_KjU = j2;
                if ((i2 & 32) == 0) {
                    i10 = 65536;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            } else {
                jM1027getSurface0d7_KjU = j2;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    }
                    long j10 = backgroundColor;
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i18 = i9 >> 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j10, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                ComposerKt.traceEventStart(-2084221700, i19, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function6 = function3;
                            final Function2<? super Composer, ? super Integer, Unit> function7 = content;
                            final int i110 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                        ComposerKt.traceEventStart(1939362236, i111, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function8 = function6;
                                    final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                    final int i112 = i110;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i113) {
                                            if ((i113 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(225114541, i113, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                            }
                                            if (function8 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function9, composer4, (i112 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                            } else if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function10 = function9;
                                                Function2<Composer, Integer, Unit> function11 = function8;
                                                int i20 = i112;
                                                SnackbarKt.NewLineButtonSnackbar(function10, function11, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer4.startReplaceableGroup(59708478);
                                                Function2<Composer, Integer, Unit> function12 = function9;
                                                Function2<Composer, Integer, Unit> function13 = function8;
                                                int i21 = i112;
                                                SnackbarKt.OneRowSnackbar(function12, function13, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | ((i9 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j10;
                    shape2 = small;
                    z3 = z2;
                    modifier3 = modifier2;
                    f3 = fM3765constructorimpl;
                    j3 = jM1027getSurface0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    }
                    long j11 = backgroundColor;
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i19 = i9 >> 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j11, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                ComposerKt.traceEventStart(-2084221700, i110, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function6 = function3;
                            final Function2<? super Composer, ? super Integer, Unit> function7 = content;
                            final int i111 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                        ComposerKt.traceEventStart(1939362236, i112, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function8 = function6;
                                    final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                    final int i113 = i111;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i114) {
                                            if ((i114 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(225114541, i114, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                            }
                                            if (function8 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function9, composer4, (i113 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                            } else if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function10 = function9;
                                                Function2<Composer, Integer, Unit> function11 = function8;
                                                int i20 = i113;
                                                SnackbarKt.NewLineButtonSnackbar(function10, function11, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer4.startReplaceableGroup(59708478);
                                                Function2<Composer, Integer, Unit> function12 = function9;
                                                Function2<Composer, Integer, Unit> function13 = function8;
                                                int i21 = i113;
                                                SnackbarKt.OneRowSnackbar(function12, function13, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | ((i9 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j11;
                    shape2 = small;
                    z3 = z2;
                    modifier3 = modifier2;
                    f3 = fM3765constructorimpl;
                    j3 = jM1027getSurface0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function6 = function3;
                final long j12 = backgroundColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                        SnackbarKt.m1167Snackbar7zSek6w(modifier6, function6, z3, shape2, j12, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 12582912;
            i3 |= i8;
            if ((23967451 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                }
                long j13 = backgroundColor;
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i110 = i9 >> 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j13, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                            ComposerKt.traceEventStart(-2084221700, i111, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function3;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = content;
                        final int i112 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    ComposerKt.traceEventStart(1939362236, i113, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                final int i114 = i112;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i115) {
                                        if ((i115 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(225114541, i115, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                        }
                                        if (function9 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function10, composer4, (i114 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                        } else if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function11 = function10;
                                            Function2<Composer, Integer, Unit> function12 = function9;
                                            int i20 = i114;
                                            SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        } else {
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function13 = function10;
                                            Function2<Composer, Integer, Unit> function14 = function9;
                                            int i21 = i114;
                                            SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i110 & 112) | (i110 & 896) | (i110 & 7168) | ((i9 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j13;
                shape2 = small;
                z3 = z2;
                modifier3 = modifier2;
                f3 = fM3765constructorimpl;
                j3 = jM1027getSurface0d7_KjU;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                }
                long j14 = backgroundColor;
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i111 = i9 >> 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j14, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                            ComposerKt.traceEventStart(-2084221700, i112, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function3;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = content;
                        final int i113 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    ComposerKt.traceEventStart(1939362236, i114, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function9 = function7;
                                final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                final int i115 = i113;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i116) {
                                        if ((i116 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(225114541, i116, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                        }
                                        if (function9 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function10, composer4, (i115 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                        } else if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function11 = function10;
                                            Function2<Composer, Integer, Unit> function12 = function9;
                                            int i20 = i115;
                                            SnackbarKt.NewLineButtonSnackbar(function11, function12, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        } else {
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function13 = function10;
                                            Function2<Composer, Integer, Unit> function14 = function9;
                                            int i21 = i115;
                                            SnackbarKt.OneRowSnackbar(function13, function14, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i111 & 112) | (i111 & 896) | (i111 & 7168) | ((i9 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j14;
                shape2 = small;
                z3 = z2;
                modifier3 = modifier2;
                f3 = fM3765constructorimpl;
                j3 = jM1027getSurface0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function7 = function3;
            final long j15 = backgroundColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                    SnackbarKt.m1167Snackbar7zSek6w(modifier7, function7, z3, shape2, j15, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        function3 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 7168) != 0) {
                i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    backgroundColor = j;
                    if (composerStartRestartGroup.changed(backgroundColor)) {
                    }
                    i3 |= i13;
                } else {
                    backgroundColor = j;
                }
                i3 |= i13;
            } else {
                backgroundColor = j;
            }
            if ((i & 458752) == 0) {
                jM1027getSurface0d7_KjU = j2;
                if ((i2 & 32) == 0) {
                    i10 = 65536;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            } else {
                jM1027getSurface0d7_KjU = j2;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    }
                    long j16 = backgroundColor;
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i112 = i9 >> 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j16, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                ComposerKt.traceEventStart(-2084221700, i113, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function8 = function3;
                            final Function2<? super Composer, ? super Integer, Unit> function9 = content;
                            final int i114 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                        ComposerKt.traceEventStart(1939362236, i115, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                    final Function2<? super Composer, ? super Integer, Unit> function11 = function9;
                                    final int i116 = i114;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i117) {
                                            if ((i117 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(225114541, i117, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                            }
                                            if (function10 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function11, composer4, (i116 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                            } else if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function12 = function11;
                                                Function2<Composer, Integer, Unit> function13 = function10;
                                                int i20 = i116;
                                                SnackbarKt.NewLineButtonSnackbar(function12, function13, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer4.startReplaceableGroup(59708478);
                                                Function2<Composer, Integer, Unit> function14 = function11;
                                                Function2<Composer, Integer, Unit> function15 = function10;
                                                int i21 = i116;
                                                SnackbarKt.OneRowSnackbar(function14, function15, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | ((i9 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j16;
                    shape2 = small;
                    z3 = z2;
                    modifier3 = modifier2;
                    f3 = fM3765constructorimpl;
                    j3 = jM1027getSurface0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 = (-458753) & i3;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                    }
                    long j17 = backgroundColor;
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i113 = i9 >> 6;
                    SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j17, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                                ComposerKt.traceEventStart(-2084221700, i114, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function8 = function3;
                            final Function2<? super Composer, ? super Integer, Unit> function9 = content;
                            final int i115 = i9;
                            final boolean z4 = z2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                        ComposerKt.traceEventStart(1939362236, i116, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                    }
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function10 = function8;
                                    final Function2<? super Composer, ? super Integer, Unit> function11 = function9;
                                    final int i117 = i115;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i118) {
                                            if ((i118 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(225114541, i118, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                            }
                                            if (function10 == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function11, composer4, (i117 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                            } else if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2<Composer, Integer, Unit> function12 = function11;
                                                Function2<Composer, Integer, Unit> function13 = function10;
                                                int i20 = i117;
                                                SnackbarKt.NewLineButtonSnackbar(function12, function13, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer4.startReplaceableGroup(59708478);
                                                Function2<Composer, Integer, Unit> function14 = function11;
                                                Function2<Composer, Integer, Unit> function15 = function10;
                                                int i21 = i117;
                                                SnackbarKt.OneRowSnackbar(function14, function15, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i113 & 112) | (i113 & 896) | (i113 & 7168) | ((i9 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j17;
                    shape2 = small;
                    z3 = z2;
                    modifier3 = modifier2;
                    f3 = fM3765constructorimpl;
                    j3 = jM1027getSurface0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function8 = function3;
                final long j18 = backgroundColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                        SnackbarKt.m1167Snackbar7zSek6w(modifier8, function8, z3, shape2, j18, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 12582912;
            i3 |= i8;
            if ((23967451 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                }
                long j19 = backgroundColor;
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i114 = i9 >> 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j19, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                            ComposerKt.traceEventStart(-2084221700, i115, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function3;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = content;
                        final int i116 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    ComposerKt.traceEventStart(1939362236, i117, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function11 = function9;
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i118 = i116;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i119) {
                                        if ((i119 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(225114541, i119, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                        }
                                        if (function11 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function12, composer4, (i118 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                        } else if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function13 = function12;
                                            Function2<Composer, Integer, Unit> function14 = function11;
                                            int i20 = i118;
                                            SnackbarKt.NewLineButtonSnackbar(function13, function14, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        } else {
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function15 = function12;
                                            Function2<Composer, Integer, Unit> function16 = function11;
                                            int i21 = i118;
                                            SnackbarKt.OneRowSnackbar(function15, function16, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i114 & 112) | (i114 & 896) | (i114 & 7168) | ((i9 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j19;
                shape2 = small;
                z3 = z2;
                modifier3 = modifier2;
                f3 = fM3765constructorimpl;
                j3 = jM1027getSurface0d7_KjU;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                }
                long j110 = backgroundColor;
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i115 = i9 >> 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j110, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                            ComposerKt.traceEventStart(-2084221700, i116, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function3;
                        final Function2<? super Composer, ? super Integer, Unit> function10 = content;
                        final int i117 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    ComposerKt.traceEventStart(1939362236, i118, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function11 = function9;
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final int i119 = i117;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i1110) {
                                        if ((i1110 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(225114541, i1110, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                        }
                                        if (function11 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function12, composer4, (i119 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                        } else if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function13 = function12;
                                            Function2<Composer, Integer, Unit> function14 = function11;
                                            int i20 = i119;
                                            SnackbarKt.NewLineButtonSnackbar(function13, function14, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        } else {
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function15 = function12;
                                            Function2<Composer, Integer, Unit> function16 = function11;
                                            int i21 = i119;
                                            SnackbarKt.OneRowSnackbar(function15, function16, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i115 & 112) | (i115 & 896) | (i115 & 7168) | ((i9 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j110;
                shape2 = small;
                z3 = z2;
                modifier3 = modifier2;
                f3 = fM3765constructorimpl;
                j3 = jM1027getSurface0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function9 = function3;
            final long j111 = backgroundColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                    SnackbarKt.m1167Snackbar7zSek6w(modifier9, function9, z3, shape2, j111, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        if ((i & 7168) != 0) {
            i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                backgroundColor = j;
                if (composerStartRestartGroup.changed(backgroundColor)) {
                }
                i3 |= i13;
            } else {
                backgroundColor = j;
            }
            i3 |= i13;
        } else {
            backgroundColor = j;
        }
        if ((i & 458752) == 0) {
            jM1027getSurface0d7_KjU = j2;
            if ((i2 & 32) == 0) {
                i10 = 65536;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        } else {
            jM1027getSurface0d7_KjU = j2;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        if ((i2 & 128) != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                }
                long j112 = backgroundColor;
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i116 = i9 >> 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j112, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                            ComposerKt.traceEventStart(-2084221700, i117, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function3;
                        final Function2<? super Composer, ? super Integer, Unit> function11 = content;
                        final int i118 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    ComposerKt.traceEventStart(1939362236, i119, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final Function2<? super Composer, ? super Integer, Unit> function13 = function11;
                                final int i1110 = i118;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i1111) {
                                        if ((i1111 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(225114541, i1111, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                        }
                                        if (function12 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function13, composer4, (i1110 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                        } else if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function14 = function13;
                                            Function2<Composer, Integer, Unit> function15 = function12;
                                            int i20 = i1110;
                                            SnackbarKt.NewLineButtonSnackbar(function14, function15, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        } else {
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function16 = function13;
                                            Function2<Composer, Integer, Unit> function17 = function12;
                                            int i21 = i1110;
                                            SnackbarKt.OneRowSnackbar(function16, function17, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i116 & 112) | (i116 & 896) | (i116 & 7168) | ((i9 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j112;
                shape2 = small;
                z3 = z2;
                modifier3 = modifier2;
                f3 = fM3765constructorimpl;
                j3 = jM1027getSurface0d7_KjU;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 = (-458753) & i3;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                }
                long j113 = backgroundColor;
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i117 = i9 >> 6;
                SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j113, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                            ComposerKt.traceEventStart(-2084221700, i118, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function10 = function3;
                        final Function2<? super Composer, ? super Integer, Unit> function11 = content;
                        final int i119 = i9;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    ComposerKt.traceEventStart(1939362236, i1110, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                                final Function2<? super Composer, ? super Integer, Unit> function13 = function11;
                                final int i1111 = i119;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i1112) {
                                        if ((i1112 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(225114541, i1112, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                        }
                                        if (function12 == null) {
                                            composer4.startReplaceableGroup(59708346);
                                            SnackbarKt.TextOnlySnackbar(function13, composer4, (i1111 >> 21) & 14);
                                            composer4.endReplaceableGroup();
                                        } else if (z5) {
                                            composer4.startReplaceableGroup(59708411);
                                            Function2<Composer, Integer, Unit> function14 = function13;
                                            Function2<Composer, Integer, Unit> function15 = function12;
                                            int i20 = i1111;
                                            SnackbarKt.NewLineButtonSnackbar(function14, function15, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        } else {
                                            composer4.startReplaceableGroup(59708478);
                                            Function2<Composer, Integer, Unit> function16 = function13;
                                            Function2<Composer, Integer, Unit> function17 = function12;
                                            int i21 = i1111;
                                            SnackbarKt.OneRowSnackbar(function16, function17, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i117 & 112) | (i117 & 896) | (i117 & 7168) | ((i9 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j113;
                shape2 = small;
                z3 = z2;
                modifier3 = modifier2;
                f3 = fM3765constructorimpl;
                j3 = jM1027getSurface0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function10 = function3;
            final long j114 = backgroundColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                    SnackbarKt.m1167Snackbar7zSek6w(modifier10, function10, z3, shape2, j114, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i8 = 12582912;
        i3 |= i8;
        if ((23967451 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i12 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 = (-458753) & i3;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f2;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i12 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 = (-458753) & i3;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f2;
                }
            }
            long j115 = backgroundColor;
            i9 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
            }
            int i118 = i9 >> 6;
            SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j115, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                        ComposerKt.traceEventStart(-2084221700, i119, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                    final Function2<? super Composer, ? super Integer, Unit> function11 = function3;
                    final Function2<? super Composer, ? super Integer, Unit> function12 = content;
                    final int i1110 = i9;
                    final boolean z4 = z2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                ComposerKt.traceEventStart(1939362236, i1111, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                            }
                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                            final Function2<? super Composer, ? super Integer, Unit> function13 = function11;
                            final Function2<? super Composer, ? super Integer, Unit> function14 = function12;
                            final int i1112 = i1110;
                            final boolean z5 = z4;
                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i1113) {
                                    if ((i1113 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(225114541, i1113, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                    }
                                    if (function13 == null) {
                                        composer4.startReplaceableGroup(59708346);
                                        SnackbarKt.TextOnlySnackbar(function14, composer4, (i1112 >> 21) & 14);
                                        composer4.endReplaceableGroup();
                                    } else if (z5) {
                                        composer4.startReplaceableGroup(59708411);
                                        Function2<Composer, Integer, Unit> function15 = function14;
                                        Function2<Composer, Integer, Unit> function16 = function13;
                                        int i20 = i1112;
                                        SnackbarKt.NewLineButtonSnackbar(function15, function16, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    } else {
                                        composer4.startReplaceableGroup(59708478);
                                        Function2<Composer, Integer, Unit> function17 = function14;
                                        Function2<Composer, Integer, Unit> function18 = function13;
                                        int i21 = i1112;
                                        SnackbarKt.OneRowSnackbar(function17, function18, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i118 & 112) | (i118 & 896) | (i118 & 7168) | ((i9 >> 3) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            backgroundColor = j115;
            shape2 = small;
            z3 = z2;
            modifier3 = modifier2;
            f3 = fM3765constructorimpl;
            j3 = jM1027getSurface0d7_KjU;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i12 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 = (-458753) & i3;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f2;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i12 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 = (-458753) & i3;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f2;
                }
            }
            long j116 = backgroundColor;
            i9 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558258760, i9, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
            }
            int i119 = i9 >> 6;
            SurfaceKt.m1185SurfaceFjzlyU(modifier2, small, j116, jM1027getSurface0d7_KjU, null, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                        ComposerKt.traceEventStart(-2084221700, i1110, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                    final Function2<? super Composer, ? super Integer, Unit> function11 = function3;
                    final Function2<? super Composer, ? super Integer, Unit> function12 = content;
                    final int i1111 = i9;
                    final boolean z4 = z2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                ComposerKt.traceEventStart(1939362236, i1112, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                            }
                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                            final Function2<? super Composer, ? super Integer, Unit> function13 = function11;
                            final Function2<? super Composer, ? super Integer, Unit> function14 = function12;
                            final int i1113 = i1111;
                            final boolean z5 = z4;
                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i1114) {
                                    if ((i1114 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(225114541, i1114, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                    }
                                    if (function13 == null) {
                                        composer4.startReplaceableGroup(59708346);
                                        SnackbarKt.TextOnlySnackbar(function14, composer4, (i1113 >> 21) & 14);
                                        composer4.endReplaceableGroup();
                                    } else if (z5) {
                                        composer4.startReplaceableGroup(59708411);
                                        Function2<Composer, Integer, Unit> function15 = function14;
                                        Function2<Composer, Integer, Unit> function16 = function13;
                                        int i20 = i1113;
                                        SnackbarKt.NewLineButtonSnackbar(function15, function16, composer4, (i20 & 112) | ((i20 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    } else {
                                        composer4.startReplaceableGroup(59708478);
                                        Function2<Composer, Integer, Unit> function17 = function14;
                                        Function2<Composer, Integer, Unit> function18 = function13;
                                        int i21 = i1113;
                                        SnackbarKt.OneRowSnackbar(function17, function18, composer4, (i21 & 112) | ((i21 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i9 & 14) | 1572864 | (i119 & 112) | (i119 & 896) | (i119 & 7168) | ((i9 >> 3) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            backgroundColor = j116;
            shape2 = small;
            z3 = z2;
            modifier3 = modifier2;
            f3 = fM3765constructorimpl;
            j3 = jM1027getSurface0d7_KjU;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function11 = function3;
        final long j117 = backgroundColor;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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
                SnackbarKt.m1167Snackbar7zSek6w(modifier11, function11, z3, shape2, j117, j3, f3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:146:0x0227  */
    /* JADX WARN: Code duplicated, block: B:151:0x0234  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    public static final void m1168SnackbarsPrSdHI(@NotNull final SnackbarData snackbarData, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, long j, long j2, long j3, float f, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        long jM1027getSurface0d7_KjU;
        long j4;
        int i6;
        int i7;
        Modifier modifier2;
        boolean z3;
        Shape small;
        long backgroundColor;
        long primaryActionColor;
        float fM3765constructorimpl;
        long j5;
        long j6;
        long j7;
        final String actionLabel;
        ComposableLambda composableLambda;
        Modifier modifier3;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        Composer composerStartRestartGroup = composer.startRestartGroup(258660814);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i;
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
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                            i9 = 2048;
                        }
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((i & 57344) != 0) {
                    i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        jM1027getSurface0d7_KjU = j2;
                        int i11 = composerStartRestartGroup.changed(jM1027getSurface0d7_KjU) ? 131072 : 65536;
                        i3 |= i11;
                    } else {
                        jM1027getSurface0d7_KjU = j2;
                    }
                    i3 |= i11;
                } else {
                    jM1027getSurface0d7_KjU = j2;
                }
                if ((i & 3670016) == 0) {
                    j4 = j3;
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j4)) {
                        i8 = 524288;
                    } else {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i3 |= i8;
                } else {
                    j4 = j3;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i7 = 8388608;
                    } else {
                        i7 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            small = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            backgroundColor = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            primaryActionColor = j4;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl = f;
                        }
                        j5 = primaryActionColor;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = backgroundColor;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        fM3765constructorimpl = f;
                        z3 = z2;
                        small = shape2;
                        j5 = j4;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = j;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                    }
                    actionLabel = snackbarData.getActionLabel();
                    if (actionLabel != null) {
                        final long j8 = j5;
                        final int i12 = i3;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    ComposerKt.traceEventStart(1843479216, i13, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                                }
                                ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j8, 0L, composer2, ((i12 >> 15) & 112) | 3072, 5);
                                final SnackbarData snackbarData2 = snackbarData;
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snackbarData2.performAction();
                                    }
                                };
                                final String str = actionLabel;
                                ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i14) {
                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                        if ((i14 & 81) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-929149933, i14, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                        }
                                        TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 805306368, 382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifier4 = modifier2;
                    m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                                ComposerKt.traceEventStart(-261845785, i13, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                            }
                            TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    f2 = fM3765constructorimpl;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    f2 = f;
                    z3 = z2;
                    small = shape2;
                    j5 = j4;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = j;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier3;
                final boolean z4 = z3;
                final Shape shape3 = small;
                final long j9 = j7;
                final long j10 = j6;
                final long j11 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        SnackbarKt.m1168SnackbarsPrSdHI(snackbarData, modifier5, z4, shape3, j9, j10, j11, f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            z2 = z;
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i9 = 2048;
                    }
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 57344) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    jM1027getSurface0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM1027getSurface0d7_KjU)) {
                    }
                    i3 |= i11;
                } else {
                    jM1027getSurface0d7_KjU = j2;
                }
                i3 |= i11;
            } else {
                jM1027getSurface0d7_KjU = j2;
            }
            if ((i & 3670016) == 0) {
                j4 = j3;
                if ((i2 & 64) == 0) {
                    i8 = 524288;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            } else {
                j4 = j3;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i7 = 8388608;
                } else {
                    i7 = Configuration.BLOCK_SIZE;
                }
                i3 |= i7;
            }
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j12 = j5;
                    final int i13 = i3;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.traceEventStart(1843479216, i14, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                            }
                            ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j12, 0L, composer2, ((i13 >> 15) & 112) | 3072, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i15) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i15 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-929149933, i15, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                    }
                                    TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 805306368, 382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                Modifier modifier6 = modifier2;
                m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                            ComposerKt.traceEventStart(-261845785, i14, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                        }
                        TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                f2 = fM3765constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j13 = j5;
                    final int i14 = i3;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.traceEventStart(1843479216, i15, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                            }
                            ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j13, 0L, composer2, ((i14 >> 15) & 112) | 3072, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i16) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i16 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-929149933, i16, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                    }
                                    TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 805306368, 382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                Modifier modifier7 = modifier2;
                m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                            ComposerKt.traceEventStart(-261845785, i15, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                        }
                        TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                f2 = fM3765constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier8 = modifier3;
            final boolean z5 = z3;
            final Shape shape4 = small;
            final long j14 = j7;
            final long j15 = j6;
            final long j16 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    SnackbarKt.m1168SnackbarsPrSdHI(snackbarData, modifier8, z5, shape4, j14, j15, j16, f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i9 = 2048;
                    }
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 57344) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    jM1027getSurface0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM1027getSurface0d7_KjU)) {
                    }
                    i3 |= i11;
                } else {
                    jM1027getSurface0d7_KjU = j2;
                }
                i3 |= i11;
            } else {
                jM1027getSurface0d7_KjU = j2;
            }
            if ((i & 3670016) == 0) {
                j4 = j3;
                if ((i2 & 64) == 0) {
                    i8 = 524288;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            } else {
                j4 = j3;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i7 = 8388608;
                } else {
                    i7 = Configuration.BLOCK_SIZE;
                }
                i3 |= i7;
            }
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j17 = j5;
                    final int i15 = i3;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.traceEventStart(1843479216, i16, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                            }
                            ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j17, 0L, composer2, ((i15 >> 15) & 112) | 3072, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i17) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i17 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-929149933, i17, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                    }
                                    TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 805306368, 382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                Modifier modifier9 = modifier2;
                m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                            ComposerKt.traceEventStart(-261845785, i16, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                        }
                        TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier9;
                f2 = fM3765constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i3 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        backgroundColor = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        primaryActionColor = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl = f;
                    }
                    j5 = primaryActionColor;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    final long j18 = j5;
                    final int i16 = i3;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.traceEventStart(1843479216, i17, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                            }
                            ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j18, 0L, composer2, ((i16 >> 15) & 112) | 3072, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i18) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i18 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-929149933, i18, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                    }
                                    TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 805306368, 382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                } else {
                    composableLambda = null;
                }
                Modifier modifier10 = modifier2;
                m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                            ComposerKt.traceEventStart(-261845785, i17, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                        }
                        TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier10;
                f2 = fM3765constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier3;
            final boolean z6 = z3;
            final Shape shape5 = small;
            final long j19 = j7;
            final long j110 = j6;
            final long j111 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i17) {
                    SnackbarKt.m1168SnackbarsPrSdHI(snackbarData, modifier11, z6, shape5, j19, j110, j111, f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        z2 = z;
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                    i9 = 2048;
                }
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i9;
        } else {
            shape2 = shape;
        }
        if ((i & 57344) != 0) {
            i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                jM1027getSurface0d7_KjU = j2;
                if (composerStartRestartGroup.changed(jM1027getSurface0d7_KjU)) {
                }
                i3 |= i11;
            } else {
                jM1027getSurface0d7_KjU = j2;
            }
            i3 |= i11;
        } else {
            jM1027getSurface0d7_KjU = j2;
        }
        if ((i & 3670016) == 0) {
            j4 = j3;
            if ((i2 & 64) == 0) {
                i8 = 524288;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        } else {
            j4 = j3;
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i7 = 8388608;
            } else {
                i7 = Configuration.BLOCK_SIZE;
            }
            i3 |= i7;
        }
        if ((i3 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f;
                }
                j5 = primaryActionColor;
                j6 = jM1027getSurface0d7_KjU;
                j7 = backgroundColor;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f;
                }
                j5 = primaryActionColor;
                j6 = jM1027getSurface0d7_KjU;
                j7 = backgroundColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
            }
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
                final long j112 = j5;
                final int i17 = i3;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(1843479216, i18, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                        }
                        ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j112, 0L, composer2, ((i17 >> 15) & 112) | 3072, 5);
                        final SnackbarData snackbarData2 = snackbarData;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snackbarData2.performAction();
                            }
                        };
                        final String str = actionLabel;
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i19) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i19 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-929149933, i19, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                }
                                TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 805306368, 382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
            } else {
                composableLambda = null;
            }
            Modifier modifier12 = modifier2;
            m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                        ComposerKt.traceEventStart(-261845785, i18, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                    }
                    TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier12;
            f2 = fM3765constructorimpl;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f;
                }
                j5 = primaryActionColor;
                j6 = jM1027getSurface0d7_KjU;
                j7 = backgroundColor;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i3 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i2 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    backgroundColor = j;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    primaryActionColor = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl = f;
                }
                j5 = primaryActionColor;
                j6 = jM1027getSurface0d7_KjU;
                j7 = backgroundColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(258660814, i3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
            }
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
                final long j113 = j5;
                final int i18 = i3;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(1843479216, i19, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                        }
                        ButtonColors buttonColorsM997textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m997textButtonColorsRGew2ao(0L, j113, 0L, composer2, ((i18 >> 15) & 112) | 3072, 5);
                        final SnackbarData snackbarData2 = snackbarData;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snackbarData2.performAction();
                            }
                        };
                        final String str = actionLabel;
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, buttonColorsM997textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i110) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i110 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-929149933, i110, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                                }
                                TextKt.m1251Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 805306368, 382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
            } else {
                composableLambda = null;
            }
            Modifier modifier13 = modifier2;
            m1167Snackbar7zSek6w(PaddingKt.m476padding3ABfNKs(modifier2, Dp.m3765constructorimpl(12)), composableLambda, z3, small, j7, j6, fM3765constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                        ComposerKt.traceEventStart(-261845785, i19, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                    }
                    TextKt.m1251Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier13;
            f2 = fM3765constructorimpl;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier14 = modifier3;
        final boolean z7 = z3;
        final Shape shape6 = small;
        final long j114 = j7;
        final long j115 = j6;
        final long j116 = j5;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i19) {
                SnackbarKt.m1168SnackbarsPrSdHI(snackbarData, modifier14, z7, shape6, j114, j115, j116, f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TextOnlySnackbar(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(917397959);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function3 = function2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917397959, i2, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            C07712 c07712 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt.TextOnlySnackbar.2
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
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (!(measurables.size() == 1)) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
                    }
                    final Placeable placeableMo2794measureBRTryo0 = ((Measurable) CollectionsKt.first((List) measurables)).mo2794measureBRTryo0(j);
                    int i3 = placeableMo2794measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                    int i4 = placeableMo2794measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                    if (!(i3 != Integer.MIN_VALUE)) {
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    if (!(i4 != Integer.MIN_VALUE)) {
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    final int iMax = Math.max(Layout.mo318roundToPx0680j_4(i3 == i4 ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), placeableMo2794measureBRTryo0.getHeight());
                    return MeasureScope.CC.OooOOo0(Layout, Constraints.m3733getMaxWidthimpl(j), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$measure$4
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
                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, 0, (iMax - placeableMo2794measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
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
            Updater.m1316setimpl(composerM1309constructorimpl, c07712, companion2.getSetMeasurePolicy());
            Updater.m1316setimpl(composerM1309constructorimpl, density, companion2.getSetDensity());
            Updater.m1316setimpl(composerM1309constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1316setimpl(composerM1309constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM477paddingVpY3zN4);
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
            function3 = function2;
            function3.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.TextOnlySnackbar.3
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
                SnackbarKt.TextOnlySnackbar(function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}
