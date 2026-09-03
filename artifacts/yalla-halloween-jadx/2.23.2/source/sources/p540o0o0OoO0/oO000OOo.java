package p540o0o0OoO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p022Oooo00O.o0O00oO0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00O0O;
import p194o00o0OO.oo00o;
import p230o00oOo0o.o0O0O00;
import p523o0o0O0oo.oO000Oo;
import p523o0o0O0oo.oO0OoOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomMemberUserRankDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberUserRankDialog$onDialog$2$2$3$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,508:1\n66#2,6:509\n72#2:543\n76#2:589\n78#3,11:515\n78#3,11:550\n91#3:582\n91#3:588\n456#4,8:526\n464#4,3:540\n456#4,8:561\n464#4,3:575\n467#4,3:579\n467#4,3:585\n4144#5,6:534\n4144#5,6:569\n72#6,6:544\n78#6:578\n82#6:583\n154#7:584\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberUserRankDialog$onDialog$2$2$3$2\n*L\n180#1:509,6\n180#1:543\n180#1:589\n180#1:515,11\n182#1:550,11\n182#1:582\n180#1:588\n180#1:526,8\n180#1:540,3\n182#1:561,8\n182#1:575,3\n182#1:579,3\n180#1:585,3\n180#1:534,6\n182#1:569,6\n182#1:544,6\n182#1:578\n182#1:583\n221#1:584\n*E\n"})
public final class oO000OOo extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LiveRoomMemberUserRankVM f54923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54924OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM, MutableState<Boolean> mutableState) {
        super(4);
        this.f54923OooO0Oo = liveRoomMemberUserRankVM;
        this.f54924OooO0o0 = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01df  */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        o0O0O00 HorizontalPager = o0o0o00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541210560, iIntValue2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.onDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberUserRankDialog.kt:179)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean z = iIntValue == 0;
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = this.f54923OooO0Oo;
            OooOOOO oooOOOOOooO00o = o00O0O.OooO00o(liveRoomMemberUserRankVM.getCurrentRankList(z).f38501OooO0oo, composer2);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            RefreshState refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composer2);
            RefreshState.State stateOooO0OO = refreshStateOooO0OO.OooO0OO();
            MutableState<Boolean> mutableState = this.f54924OooO0o0;
            EffectsKt.LaunchedEffect(stateOooO0OO, new oO0o0o(refreshStateOooO0OO, mutableState, null), composer2, 64);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1688051862, true, new oO0OoOO0(z));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1366356328, true, new oO0Oo0oo(z, oooOOOOOooO00o, lazyListStateRememberLazyListState, mutableState));
            int i = OooOOOO.f35803OooO0o0;
            oo00o.OooO00o(oooOOOOOooO00o, modifierOooO00o, lazyListStateRememberLazyListState, refreshStateOooO0OO, false, null, composableLambda, null, composableLambda2, composer2, 102240264, 176);
            composer2.startReplaceableGroup(444801995);
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            if (oooO00o.OooO00o().OooOO0o()) {
                oO000Oo.f53142OooO00o.OooO00o(liveRoomMemberUserRankVM, z, composer2, 392);
            } else {
                Integer value = oooO00o.OooO00o().f24546OooOO0o.getValue();
                if (value != null && value.intValue() == 3) {
                    oO000Oo.f53142OooO00o.OooO00o(liveRoomMemberUserRankVM, z, composer2, 392);
                }
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(55867723);
            if (!oooO00o.OooO00o().OooOO0O()) {
                oO0OoOO0.f53184OooO00o.OooO00o(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(12), 7, null), composer2, 48);
            }
            if (OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
