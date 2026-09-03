package p518o0o0O0O0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0O0O00;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;
import p518o0o0O0O0.o00Ooo;
import p518o0o0O0O0.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$5$2$1$4\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,302:1\n171#2,12:303\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$5$2$1$4\n*L\n200#1:303,12\n*E\n"})
public final class o00O0O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<o00Ooo> f51894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51895OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PagerState f51896OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(List<o00Ooo> list, PagerState pagerState, CoroutineScope coroutineScope) {
        super(1);
        this.f51894OooO0Oo = list;
        this.f51896OooO0o0 = pagerState;
        this.f51895OooO0o = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyRow = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List<o00Ooo> list = this.f51894OooO0Oo;
        int size = list.size();
        Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$5$2$1$4$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                list.get(num.intValue());
                return null;
            }
        };
        final PagerState pagerState = this.f51896OooO0o0;
        final CoroutineScope coroutineScope = this.f51895OooO0o;
        LazyRow.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$5$2$1$4$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                int i;
                Painter painterPainterResource;
                LazyItemScope items = lazyItemScope;
                int iIntValue = num.intValue();
                Composer composer2 = composer;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if ((i & 731) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    o00Ooo o00ooo2 = (o00Ooo) list.get(iIntValue);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(58)), 0.0f, 1, null);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    PagerState pagerState2 = pagerState;
                    Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(PaddingKt.m479paddingVpY3zN4(o0O0O00.OooO0O0(modifierFillMaxHeight$default, false, false, 0L, false, null, null, null, new o0OoOo0(coroutineScope2, pagerState2, iIntValue), 253), Dp.m3775constructorimpl(5), Dp.m3775constructorimpl(4)), pagerState2.getCurrentPage() == iIntValue ? o0OOo000.f48177OoooO00 : o0OOo000.f48134OooO00o, RoundedCornerShapeKt.getCircleShape());
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM170backgroundbw27NRU);
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
                    Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i2 = o00ooo2.f51898OooO00o;
                    if (i2 == -2) {
                        composer2.startReplaceableGroup(-200464323);
                        painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_new_face_sticker, composer2, 0);
                        composer2.endReplaceableGroup();
                    } else if (i2 != -1) {
                        composer2.startReplaceableGroup(-200464219);
                        painterPainterResource = o000OO.OooO0OO(o00ooo2.f51899OooO0O0, null, composer2, 0, 1);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-200464409);
                        painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_new_emoji, composer2, 0);
                        composer2.endReplaceableGroup();
                    }
                    ImageKt.Image(painterPainterResource, (String) null, o00O0O0.OooO00o(6, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(27)), companion2.getCenter())), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }
}
