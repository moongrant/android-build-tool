package p540o0o0OoO0;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.gestures.OooO0OO;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.service.room.OooO00o;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p423o0OoO0OO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,374:1\n25#2:375\n25#2:386\n25#2:397\n50#2:404\n49#2:405\n456#2,8:429\n464#2,3:443\n36#2:447\n467#2,3:454\n1097#3,6:376\n1097#3,3:387\n1100#3,3:393\n1097#3,6:398\n1097#3,6:406\n1097#3,6:448\n486#4,4:382\n490#4,2:390\n494#4:396\n486#5:392\n66#6,6:412\n72#6:446\n76#6:458\n78#7,11:418\n91#7:457\n4144#8,6:437\n81#9:459\n107#9,2:460\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2\n*L\n140#1:375\n141#1:386\n142#1:397\n164#1:404\n164#1:405\n171#1:429,8\n171#1:443,3\n185#1:447\n171#1:454,3\n140#1:376,6\n141#1:387,3\n141#1:393,3\n142#1:398,6\n164#1:406,6\n185#1:448,6\n141#1:382,4\n141#1:390,2\n141#1:396\n141#1:392\n171#1:412,6\n171#1:446\n171#1:458\n171#1:418,11\n171#1:457\n171#1:437,6\n140#1:459\n140#1:460,2\n*E\n"})
public final class o00OOO00 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f54716OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(boolean z) {
        super(3);
        this.f54716OooO0Oo = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        int i;
        boolean z;
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1472316301, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomApplyMicListDialog.kt:138)");
            }
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objOooO00o = OooOo00.OooO00o(composer2, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composer2.endReplaceableGroup();
            final Ref.IntRef intRef = new Ref.IntRef();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = 0;
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            intRef.element = ((Number) objRememberedValue2).intValue();
            Observable<Object> observable = LiveEventBus.get("HAVE_NEW_APPLY_MIC");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o0OoO0.o00O0O00
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Pair it = (Pair) obj;
                    LazyListState state = lazyListStateRememberLazyListState;
                    Intrinsics.checkNotNullParameter(state, "$state");
                    Intrinsics.checkNotNullParameter(coroutineScope2, "$coroutineScope");
                    Ref.IntRef columnHeight = intRef;
                    Intrinsics.checkNotNullParameter(columnHeight, "$columnHeight");
                    MutableState haveNewApply$delegate = mutableState;
                    Intrinsics.checkNotNullParameter(haveNewApply$delegate, "$haveNewApply$delegate");
                    Intrinsics.checkNotNullParameter(it, "it");
                    LazyListLayoutInfo layoutInfo = state.getLayoutInfo();
                    if (!((Boolean) it.getSecond()).booleanValue()) {
                        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) layoutInfo.getVisibleItemsInfo());
                        Intrinsics.checkNotNull(objLastOrNull);
                        if (((LazyListItemInfo) objLastOrNull).getIndex() == OooO00o.f24517OooO0oO.OooO0oO() - 1) {
                            haveNewApply$delegate.setValue(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) it.getFirst()).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new o00O0O0O(state, null), 3, null);
                    } else {
                        if (layoutInfo.getVisibleItemsInfo().size() <= 1) {
                            return;
                        }
                        haveNewApply$delegate.setValue(Boolean.valueOf((((LazyListItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getOffset() != columnHeight.element ? (LazyListItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo()) : layoutInfo.getVisibleItemsInfo().get(layoutInfo.getVisibleItemsInfo().size() + (-2))).getIndex() < OooO00o.f24517OooO0oO.f48591OooOOo.size() - 1));
                    }
                }
            }, composer2, 72);
            Boolean boolValueOf = Boolean.valueOf(lazyListStateRememberLazyListState.isScrollInProgress());
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(lazyListStateRememberLazyListState) | composer2.changed(mutableState);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new o00O0OO0(lazyListStateRememberLazyListState, mutableState, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 64);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), new oo0o0O0(intRef));
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
            Function2 function2OooO00o = OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Observable<Object> observable2 = LiveEventBus.get("REFRESH_APPLY_MIC_LIST");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new Observer() { // from class: o0o0OoO0.o00O0O0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    CoroutineScope coroutineScope2 = coroutineScope;
                    ((Boolean) obj).booleanValue();
                    Intrinsics.checkNotNullParameter(coroutineScope2, "$coroutineScope");
                    LazyListState state = lazyListStateRememberLazyListState;
                    Intrinsics.checkNotNullParameter(state, "$state");
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new o00O0OO(state, null), 3, null);
                }
            }, composer2, 72);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            boolean z2 = this.f54716OooO0Oo;
            boolean zOooO00o = OooO0OO.OooO00o(z2, composer2, 1157296644);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zOooO00o || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new o00OO00O(z2);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, (Function1) objRememberedValue4, composer2, 6, 252);
            if (((Boolean) mutableState.getValue()).booleanValue() && z2) {
                i = 3;
                z = true;
            } else {
                i = 3;
                z = false;
            }
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, i, null);
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, i, null);
            AnimatedVisibilityKt.AnimatedVisibility(z, SemanticsModifierKt.semantics$default(boxScopeInstance.align(companion2, companion3.getBottomStart()), false, o00OO0O0.f54711OooO0Oo, 1, null), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composer2, -849822101, true, new o00OO(coroutineScope, lazyListStateRememberLazyListState, mutableState)), composer2, 200064, 16);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
