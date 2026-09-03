package p442o0OoOoO0;

import android.content.Context;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.model.SquareEventRoomModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o0ooOOo;
import p417o0OoO0.o00Oo0;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventSquarePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage$EventSquareRoomsList$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,404:1\n154#2:405\n164#2:437\n154#2:438\n154#2:473\n154#2:474\n154#2:475\n164#2:476\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n154#2:486\n154#2:487\n76#3,2:406\n78#3:436\n82#3:492\n78#4,11:408\n78#4,11:444\n91#4:484\n91#4:491\n456#5,8:419\n464#5,3:433\n456#5,8:455\n464#5,3:469\n467#5,3:481\n467#5,3:488\n4144#6,6:427\n4144#6,6:463\n67#7,5:439\n72#7:472\n76#7:485\n*S KotlinDebug\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage$EventSquareRoomsList$3$1\n*L\n319#1:405\n332#1:437\n339#1:438\n349#1:473\n351#1:474\n352#1:475\n359#1:476\n360#1:477\n361#1:478\n367#1:479\n368#1:480\n378#1:486\n387#1:487\n317#1:406,2\n317#1:436\n317#1:492\n317#1:408,11\n341#1:444,11\n341#1:484\n317#1:491\n317#1:419,8\n317#1:433,3\n341#1:455,8\n341#1:469,3\n341#1:481,3\n317#1:488,3\n317#1:427,6\n341#1:463,6\n341#1:439,5\n341#1:472\n341#1:485\n*E\n"})
public final class o0O000o0 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList<SquareEventRoomModel> f46230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f46231OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(SnapshotStateList<SquareEventRoomModel> snapshotStateList, Context context) {
        super(4);
        this.f46230OooO0Oo = snapshotStateList;
        this.f46231OooO0o0 = context;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x02ab  */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        int i2;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1669635785, iIntValue2, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.EventSquareRoomsList.<anonymous>.<anonymous> (EventSquarePage.kt:314)");
            }
            SnapshotStateList<SquareEventRoomModel> snapshotStateList = this.f46230OooO0Oo;
            SquareEventRoomModel squareEventRoomModel = snapshotStateList.get(iIntValue);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m525sizeVpY3zN4(companion, Dp.m3765constructorimpl(77), Dp.m3765constructorimpl(93)), false, false, 0L, false, null, null, null, new o0O000O(squareEventRoomModel, snapshotStateList), 253);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM182borderziNgDLE = squareEventRoomModel.getIsNewRoomEvent() ? BorderKt.m182borderziNgDLE(companion, Dp.m3765constructorimpl((float) 1.5d), Brush.Companion.m1627linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f47020o0000O0), Color.m1660boximpl(o0oO0O0o.f47019o0000O)}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(10))) : companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment center2 = companion2.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f = 8;
            ImageKt.Image(o00Oo0.OooO0OO(squareEventRoomModel.getRoomPic(), o0OoOoOo.f46285OooO0Oo, composer2, 48, 0), (String) null, OooOo.OooO0O0(f, PaddingKt.m476padding3ABfNKs(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(46)).then(modifierM182borderziNgDLE), Dp.m3765constructorimpl(3))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
            composer2.startReplaceableGroup(-2015744450);
            if (squareEventRoomModel.getIsStarting()) {
                Context context = this.f46231OooO0o0;
                if (context instanceof FragmentActivity) {
                    i2 = 4;
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_preview_bg, composer2, 0), (String) null, boxScopeInstance.align(ClipKt.clip(SizeKt.m525sizeVpY3zN4(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl((float) 2.5d), 7, null), Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(14)), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 3, null)), companion2.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                    AndroidView_androidKt.AndroidView(new o0O000Oo(context), boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(4), 7, null), Dp.m3765constructorimpl(12)), companion2.getBottomCenter()), null, composer2, 0, 4);
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 4;
            }
            o0ooOOo.OooO00o(composer2);
            float f2 = i2;
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composer2, 6);
            TextKt.m1251Text4IGK_g(squareEventRoomModel.getRoomName(), SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null), 0.0f, 1, null), o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120304);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
