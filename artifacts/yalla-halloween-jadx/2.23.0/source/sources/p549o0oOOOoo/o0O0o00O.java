package p549o0oOOOoo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p455o0Ooo0O0.oo0o0Oo;
import p468o0OoooO0.o0OOo000;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMediaVideoTestComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaVideoTestComp.kt\ncom/yalla/yalla/module/media/test/MediaVideoTestCompKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,88:1\n66#2,6:89\n72#2:123\n76#2:159\n78#3,11:95\n91#3:158\n456#4,8:106\n464#4,3:120\n25#4:130\n25#4:141\n36#4:148\n467#4,3:155\n4144#5,6:114\n154#6:124\n154#6:125\n486#7,4:126\n490#7,2:134\n494#7:140\n1097#8,3:131\n1100#8,3:137\n1097#8,6:142\n1097#8,6:149\n486#9:136\n*S KotlinDebug\n*F\n+ 1 MediaVideoTestComp.kt\ncom/yalla/yalla/module/media/test/MediaVideoTestCompKt\n*L\n28#1:89,6\n28#1:123\n28#1:159\n28#1:95,11\n28#1:158\n28#1:106,8\n28#1:120,3\n67#1:130\n77#1:141\n80#1:148\n28#1:155,3\n28#1:114,6\n40#1:124\n62#1:125\n67#1:126,4\n67#1:134,2\n67#1:140\n67#1:131,3\n67#1:137,3\n77#1:142,6\n80#1:149,6\n67#1:136\n*E\n"})
public final class o0O0o00O {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f55891OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55892OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo0o0Oo oo0o0oo, int i) {
            super(2);
            this.f55891OooO0Oo = oo0o0oo;
            this.f55892OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55892OooO0o0 | 1);
            o0O0o00O.OooO00o(this.f55891OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f55893OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f55894OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CoroutineScope coroutineScope, oo0o0Oo oo0o0oo) {
            super(0);
            this.f55893OooO0Oo = coroutineScope;
            this.f55894OooO0o0 = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOOO.OooO0OO(this.f55893OooO0Oo, new o0O0o0(this.f55894OooO0o0, null));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55895OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState) {
            super(0);
            this.f55895OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55895OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f55896OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55897OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(oo0o0Oo oo0o0oo, int i) {
            super(2);
            this.f55896OooO0Oo = oo0o0oo;
            this.f55897OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55897OooO0o0 | 1);
            o0O0o00O.OooO00o(this.f55896OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull oo0o0Oo previewViewModel, @Nullable Composer composer, int i) {
        Composer composer2;
        BoxScopeInstance boxScopeInstance;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2094338729);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2094338729, i, -1, "com.yalla.yalla.module.media.test.MediaVideoTestComp (MediaVideoTestComp.kt:22)");
        }
        if (!((Boolean) o0O0o000.f55889OooO00o.getValue()).booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(previewViewModel, i));
            return;
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        float f = previewViewModel.f46614OooOOo / 1000.0f;
        float longValue = previewViewModel.f46615OooOOo0.getLongValue() / 1000.0f;
        float floatValue = previewViewModel.f46608OooOO0O.getFloatValue();
        int iOooO0oO = previewViewModel.OooO0oO();
        MediaVideoInfo videoInfo = previewViewModel.OooO0Oo().getVideoInfo();
        Long lValueOf2 = videoInfo != null ? Long.valueOf(videoInfo.getVideoPlayRangeStart()) : null;
        MediaVideoInfo videoInfo2 = previewViewModel.OooO0Oo().getVideoInfo();
        String str = "video length: " + f + "s \ntime:" + longValue + "s \npercent: " + floatValue + " \noriginal voice: " + iOooO0oO + " \nrange start: " + lValueOf2 + " \nrange end: " + (videoInfo2 != null ? Long.valueOf(videoInfo2.getVideoPlayRangeEnd()) : null);
        long j = o0oO0O0o.f47093o000ooO;
        float f2 = 80;
        float f3 = 5;
        TextKt.m1251Text4IGK_g(str, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f2), 0.0f, 0.0f, 12, null), j, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        MutableState<SelectMusicModel> mutableState = previewViewModel.f46603OooO0o;
        SelectMusicModel value = mutableState.getValue();
        composerStartRestartGroup.startReplaceableGroup(1100293278);
        if (value != null) {
            if (previewViewModel.OooO0OO().f46589OooO00o.getValue().booleanValue()) {
                lValueOf = Long.valueOf(previewViewModel.OooO0OO().f46590OooO0O0.getLongValue());
            } else {
                SelectMusicModel value2 = mutableState.getValue();
                lValueOf = value2 != null ? Long.valueOf(value2.getStartPosition()) : null;
            }
            long durationMs = value.getDurationMs();
            int iOooO0O0 = previewViewModel.OooO0O0();
            long j2 = previewViewModel.f46606OooO0oo;
            o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
            boxScopeInstance = boxScopeInstance2;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g("music length: " + durationMs + "  \nmusic voice: " + iOooO0O0 + " \nrange start: " + lValueOf + " \nrange end: " + j2 + " \ncurrent AudioPlay volume: " + (oooO0O0.f43840OooO0Oo ? 0.0f : oooO0O0.f43839OooO0OO) + " \n", boxScopeInstance2.align(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f3), 0.0f, 9, null), companion2.getTopEnd()), j, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
            boxScopeInstance = boxScopeInstance2;
        }
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(773894976);
        composer3.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer3.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3), composer3);
        }
        composer3.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer3.endReplaceableGroup();
        BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
        ButtonKt.Button(new OooO0O0(coroutineScope, previewViewModel), boxScopeInstance3.align(companion, companion2.getBottomEnd()), false, null, null, null, null, null, null, oo0OOoo.f55901OooO00o, composer3, 805306368, 508);
        composer3.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer3.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer3.updateRememberedValue(objRememberedValue2);
        }
        composer3.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        o0OO000.OooO00o(6, composer3, mutableState2, previewViewModel.OooO0Oo().getRealFilePath());
        composer3.startReplaceableGroup(1157296644);
        boolean zChanged = composer3.changed(mutableState2);
        Object objRememberedValue3 = composer3.rememberedValue();
        if (zChanged || objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new OooO0OO(mutableState2);
            composer3.updateRememberedValue(objRememberedValue3);
        }
        composer3.endReplaceableGroup();
        ButtonKt.Button((Function0) objRememberedValue3, boxScopeInstance3.align(companion, companion2.getBottomStart()), false, null, null, null, null, null, null, oo0OOoo.f55902OooO0O0, composer3, 805306368, 508);
        if (androidx.compose.material.OooOO0.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(previewViewModel, i));
    }
}
