package p495o0o00Ooo;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Observer;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o00000O;
import p507o0o00ooo.a1;
import p519o0o0O0oO.o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomFruitGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,80:1\n76#2:81\n25#3:82\n36#3:89\n1097#4,6:83\n1097#4,6:90\n*S KotlinDebug\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager\n*L\n31#1:81\n33#1:82\n39#1:89\n33#1:83,6\n39#1:90,6\n*E\n"})
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000 f48776OooO00o = new o0O000();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48778OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f48778OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48778OooO0o0 | 1);
            o0O000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomFruitGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o> f48779OooO0Oo;

        public OooO00o(MutableState<o> mutableState) {
            this.f48779OooO0Oo = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            o value = this.f48779OooO0Oo.getValue();
            if (value == null || !value.OooO0OO()) {
                return;
            }
            value.OooO0O0();
        }
    }

    @SourceDebugExtension({"SMAP\nRoomFruitGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,80:1\n63#2,5:81\n*S KotlinDebug\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$2$1\n*L\n40#1:81,5\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o> f48780OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<o> mutableState) {
            super(1);
            this.f48780OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O000O(this.f48780OooO0Oo);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomFruitGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,80:1\n154#2:81\n*S KotlinDebug\n*F\n+ 1 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$3\n*L\n58#1:81\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o> f48781OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48782OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<o> mutableState, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f48781OooO0Oo = mutableState;
            this.f48782OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1439094049, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomFruitGameManager.Content.<anonymous> (RoomFruitGameManager.kt:51)");
            }
            a1.OooO00o(o0O0O00.OooO0O0(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(10), 1, null), false, false, 0L, false, null, null, null, new o0O000Oo(this.f48781OooO0Oo, this.f48782OooO0o0), 253), Integer.valueOf(oOo00OO0.ic_room_game_fruit), null, StringResources_androidKt.stringResource(oO00OOo0.room_fruit, composer2, 0), null, 0.0f, null, false, composer2, 24576, 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48784OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f48784OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48784OooO0o0 | 1);
            o0O000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1954307401);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1954307401, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomFruitGameManager.Content (RoomFruitGameManager.kt:29)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            if (mixedRoomActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Observable<Object> observable = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(RoomEventKey.RESET_ROOM)");
            o00000O.OooO00o(observable, new OooO00o(mutableState), composerStartRestartGroup, 8);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO0O0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(Intrinsics.areEqual((Boolean) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25035Oooo0o, composerStartRestartGroup, 8).getValue(), Boolean.TRUE), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1439094049, true, new OooO0OO(mutableState, mixedRoomActivity)), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(i));
    }
}
