package p669oO0Oo;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.gestures.OooO0OO;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.Unit;
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
import kotlinx.coroutines.CoroutineScope;
import p018OooOoo0.OooOOO;
import p417o0OoO0.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomApplyMicListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n25#2:370\n25#2:381\n25#2:392\n50#2:399\n49#2:400\n456#2,8:424\n464#2,3:438\n36#2:442\n467#2,3:449\n1097#3,6:371\n1097#3,3:382\n1100#3,3:388\n1097#3,6:393\n1097#3,6:401\n1097#3,6:443\n486#4,4:377\n490#4,2:385\n494#4:391\n486#5:387\n66#6,6:407\n72#6:441\n76#6:453\n78#7,11:413\n91#7:452\n4144#8,6:432\n81#9:454\n107#9,2:455\n*S KotlinDebug\n*F\n+ 1 LiveRoomApplyMicListDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2\n*L\n139#1:370\n140#1:381\n141#1:392\n163#1:399\n163#1:400\n170#1:424,8\n170#1:438,3\n184#1:442\n170#1:449,3\n139#1:371,6\n140#1:382,3\n140#1:388,3\n141#1:393,6\n163#1:401,6\n184#1:443,6\n140#1:377,4\n140#1:385,2\n140#1:391\n140#1:387\n170#1:407,6\n170#1:441\n170#1:453\n170#1:413,11\n170#1:452\n170#1:432,6\n139#1:454\n139#1:455,2\n*E\n"})
public final class oo0o0Oo extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f60824OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(boolean z) {
        super(3);
        this.f60824OooO0Oo = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        float f;
        boolean z;
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1472316301, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomApplyMicListDialog.kt:136)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objOooO00o = OooOo00.OooO00o(composer2, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composer2.endReplaceableGroup();
            Ref.IntRef intRef = new Ref.IntRef();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = 0;
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            intRef.element = ((Number) objRememberedValue2).intValue();
            Observable<Object> observable = LiveEventBus.get("HAVE_NEW_APPLY_MIC");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.HAVE_NEW_APPLY_MIC)");
            o00000O.OooO00o(observable, new Oooo000(lazyListStateRememberLazyListState, coroutineScope, intRef, mutableState), composer2, 8);
            Boolean boolValueOf = Boolean.valueOf(lazyListStateRememberLazyListState.isScrollInProgress());
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(lazyListStateRememberLazyListState) | composer2.changed(mutableState);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Oooo0(lazyListStateRememberLazyListState, mutableState, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 64);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), new o000oOoO(intRef));
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion3, false, composer2, 0, -1323940314);
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Observable<Object> observable2 = LiveEventBus.get("REFRESH_APPLY_MIC_LIST");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.REFRESH_APPLY_MIC_LIST)");
            o00000O.OooO00o(observable2, new o00O0O(lazyListStateRememberLazyListState, coroutineScope), composer2, 8);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            boolean z2 = this.f60824OooO0Oo;
            boolean zOooO00o = OooO0OO.OooO00o(z2, composer2, 1157296644);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zOooO00o || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new o0ooOOo(z2);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, (Function1) objRememberedValue4, composer2, 6, 252);
            if (((Boolean) mutableState.getValue()).booleanValue() && z2) {
                f = 0.0f;
                z = true;
            } else {
                f = 0.0f;
                z = false;
            }
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, f, 3, null);
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, f, 3, null);
            AnimatedVisibilityKt.AnimatedVisibility(z, boxScopeInstance.align(companion2, companion3.getBottomStart()), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composer2, -849822101, true, new o0OO00O(coroutineScope, lazyListStateRememberLazyListState, mutableState)), composer2, 200064, 16);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
