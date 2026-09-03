package p510o0o0O00;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p153o00OoO0.OooOO0;
import p510o0o0O00.o00000;
import p579o0oOoo.oO0OOo0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$EmojiFaceList$1$1$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,301:1\n477#2,14:302\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$EmojiFaceList$1$1$1\n*L\n258#1:302,14\n*E\n"})
public final class o00000O0 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f51384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f51385OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000O0(Function1<? super String, Unit> function1, int i) {
        super(1);
        this.f51384OooO0Oo = function1;
        this.f51385OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List<Pair<String, Integer>> list = oO0OOo0o.f56613OooO0O0;
        int size = list.size();
        Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.composable.face_panel.FacePanelKt$EmojiFaceList$1$1$1$invoke$$inlined$itemsIndexed$default$3
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
        final int i = this.f51385OooO0o0;
        final Function1<String, Unit> function2 = this.f51384OooO0Oo;
        LazyVerticalGrid.items(size, null, null, function1, ComposableLambdaKt.composableLambdaInstance(1229287273, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>(list, i, function2) { // from class: com.yalla.yalla.ui.composable.face_panel.FacePanelKt$EmojiFaceList$1$1$1$invoke$$inlined$itemsIndexed$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ List f27794OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Function1 f27795OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
                this.f27795OooO0o0 = function2;
            }

            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                int i2;
                LazyGridItemScope items = lazyGridItemScope;
                int iIntValue = num.intValue();
                Composer composer2 = composer;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i2 = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i2 |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if ((i2 & 731) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1229287273, i2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:487)");
                    }
                    Pair pair = (Pair) this.f27794OooO0Oo.get(iIntValue);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierOooO00o = OooOO0.OooO00o(48, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer2, 733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
                    Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(((Number) pair.getSecond()).intValue(), composer2, 0);
                    float f = 6;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(36)), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
                    composer2.startReplaceableGroup(511388516);
                    Function1 function3 = this.f27795OooO0o0;
                    boolean zChanged = composer2.changed(function3) | composer2.changed(pair);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new o00000(function3, pair);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource, "", PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(modifierClip, false, false, 100L, false, null, null, null, (Function0) objRememberedValue, 251), Dp.m3765constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }
}
