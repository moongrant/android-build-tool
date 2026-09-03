package p490o0o00OOO;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000Ooo;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000OO;
import p464o0Oooo.o000000O;
import p475o0o000.o00Ooo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomGiftIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,268:1\n76#2:269\n76#2:308\n154#3:270\n154#3:271\n154#3:272\n154#3:273\n67#4,5:274\n72#4:307\n76#4:313\n78#5,11:279\n91#5:312\n456#6,8:290\n464#6,3:304\n467#6,3:309\n4144#7,6:298\n*S KotlinDebug\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManager\n*L\n56#1:269\n93#1:308\n60#1:270\n63#1:271\n64#1:272\n65#1:273\n58#1:274,5\n58#1:307\n58#1:313\n58#1:279,11\n58#1:312\n58#1:290,8\n58#1:304,3\n58#1:309,3\n58#1:298,6\n*E\n"})
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OOo f48620OooO00o = new o000OOo();

    @SourceDebugExtension({"SMAP\nRoomGiftIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManager$Content$1$5\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,268:1\n63#2,5:269\n*S KotlinDebug\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManager$Content$1$5\n*L\n105#1:269,5\n*E\n"})
    public static final class OooO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f48621OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(LifecycleOwner lifecycleOwner) {
            super(1);
            this.f48621OooO0Oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            o000000O o000000o2 = o000000O.f48567OooO0Oo;
            LiveEventBus.get("Room_Show_Gift_Dialog").observeSticky(this.f48621OooO0Oo, new o0000O0O.OooO00o(o000000o2));
            return new o000000(o000000o2);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<RoomGameConfig.NewGift> f48622OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(List<RoomGameConfig.NewGift> list) {
            super(1);
            this.f48622OooO0Oo = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            OooOOO0.OooO0O0("UpdateNewGiftList loopingListener it = " + iIntValue);
            if (iIntValue == this.f48622OooO0Oo.size() - 1) {
                com.yalla.yalla.service.room.OooO00o.f24989OooOOo0.f47450OooO0OO.setValue(0);
                o00Oo0.OooOO0O().OooOOO(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48623OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MixedRoomActivity mixedRoomActivity) {
            super(1);
            this.f48623OooO0Oo = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            num.intValue();
            o0000O0O.OooO0OO(this.f48623OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomGiftIconManager$Content$1$3", f = "RoomGiftIconManager.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48624OooO0Oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48624OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f48624OooO0Oo = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.yalla.yalla.service.room.OooO00o.f24989OooOOo0.f47450OooO0OO.setValue(1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48625OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MixedRoomActivity mixedRoomActivity) {
            super(0);
            this.f48625OooO0Oo = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000O0O.OooO0OO(this.f48625OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48627OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f48627OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48627OooO0o0 | 1);
            o000OOo.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1097377505);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1097377505, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomGiftIconManager.Content (RoomGiftIconManager.kt:54)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            o00Ooo o00ooo2 = com.yalla.yalla.service.room.OooO00o.f24989OooOOo0;
            List list = (List) o00ooo2.f47449OooO0O0.getValue();
            Modifier modifierOooO00o = o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(58)), ((Boolean) o00ooo2.f47451OooO0Oo.getValue()).booleanValue(), 0L, Dp.m3765constructorimpl(3), false, false, Dp.m3765constructorimpl(42), Dp.m3765constructorimpl(12), 0.0f, 826);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = !list.isEmpty();
            MutableState mutableState = o00ooo2.f47450OooO0OO;
            if (z && ((Number) mutableState.getValue()).intValue() == 1) {
                composerStartRestartGroup.startReplaceableGroup(2091058898);
                o0000O0O.OooO0O0(list, new OooO00o(list), new OooO0O0(mixedRoomActivity), composerStartRestartGroup, 8, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2091059426);
                composerStartRestartGroup.startReplaceableGroup(2091059444);
                if (!list.isEmpty()) {
                    o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
                    o00000ooOooOO0O.getClass();
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O.OooO0O0("roomGiftIconLoopStartForEverydayFirstShow" + o000000O.OooOOo0().getValue(), false) && ((Number) mutableState.getValue()).intValue() == -1) {
                        EffectsKt.LaunchedEffect(Integer.valueOf(list.hashCode()), new OooO0OO(null), composerStartRestartGroup, 64);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                o0000O0O.OooO00o(mixedRoomActivity, new OooO0o(mixedRoomActivity), composerStartRestartGroup, 8, 0);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                if (Intrinsics.areEqual(com.yalla.yalla.service.room.OooO00o.OooO0OO(), com.yalla.yalla.service.room.OooO0OO.OooO0o.f25055OooO00o)) {
                    EffectsKt.DisposableEffect(Unit.INSTANCE, new OooO(lifecycleOwner), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
    }
}
