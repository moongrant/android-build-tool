package p495o0o00Ooo;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p507o0o00ooo.a1;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMessageBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,72:1\n76#2:73\n25#3:74\n1097#4,6:75\n81#5:81\n107#5,2:82\n*S KotlinDebug\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager\n*L\n33#1:73\n35#1:74\n35#1:75,6\n35#1:81\n35#1:82,2\n*E\n"})
public final class o0O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O00O f48802OooO00o = new o0O00O();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48804OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f48804OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48804OooO0o0 | 1);
            o0O00O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MessageBoxFragment> f48805OooO0Oo;

        public OooO00o(MutableState<MessageBoxFragment> mutableState) {
            this.f48805OooO0Oo = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            boolean z;
            MessageBoxFragment value;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<MessageBoxFragment> mutableState = this.f48805OooO0Oo;
            MessageBoxFragment value2 = mutableState.getValue();
            if (value2 != null) {
                z = value2.isVisible();
            }
            if (!z || (value = mutableState.getValue()) == null) {
                return;
            }
            value.dismiss();
        }
    }

    public static final class OooO0O0 implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MessageBoxFragment> f48806OooO0Oo;

        public OooO0O0(MutableState<MessageBoxFragment> mutableState) {
            this.f48806OooO0Oo = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            boolean z;
            MessageBoxFragment value;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<MessageBoxFragment> mutableState = this.f48806OooO0Oo;
            MessageBoxFragment value2 = mutableState.getValue();
            if (value2 != null) {
                z = value2.isVisible();
            }
            if (!z || (value = mutableState.getValue()) == null) {
                return;
            }
            value.dismiss();
        }
    }

    @SourceDebugExtension({"SMAP\nRoomMessageBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager$Content$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,72:1\n154#2:73\n*S KotlinDebug\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager$Content$3\n*L\n61#1:73\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f48807OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<MessageBoxFragment> f48808OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48809OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, MixedRoomActivity mixedRoomActivity, MutableState<MessageBoxFragment> mutableState) {
            super(3);
            this.f48807OooO0Oo = i;
            this.f48809OooO0o0 = mixedRoomActivity;
            this.f48808OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1371200213, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMessageBoxManager.Content.<anonymous> (RoomMessageBoxManager.kt:54)");
            }
            a1.OooO00o(o0O0O00.OooO0O0(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), false, false, 0L, false, null, null, null, new o0O00OO(this.f48808OooO0o, this.f48809OooO0o0), 253), Integer.valueOf(oO00OOO.icon_room_side_message), null, StringResources_androidKt.stringResource(oO00OOo0.nav_title_message, composer2, 0), Integer.valueOf(this.f48807OooO0Oo), 0.0f, null, false, composer2, 0, 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48811OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f48811OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48811OooO0o0 | 1);
            o0O00O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Integer num;
        Composer composerStartRestartGroup = composer.startRestartGroup(1724974851);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1724974851, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMessageBoxManager.Content (RoomMessageBoxManager.kt:31)");
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
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Observable<Object> observable = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(RoomEventKey.RESET_ROOM)");
            o00000O.OooO00o(observable, new OooO00o(mutableState), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("RoomMessageBox_Dismiss");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.RoomMessageBox_Dismiss)");
            o00000O.OooO00o(observable2, new OooO0O0(mutableState), composerStartRestartGroup, 8);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Boolean bool = (Boolean) LiveDataAdapterKt.observeAsState(o000000O.OooOo0O(), composerStartRestartGroup, 8).getValue();
            MediatorLiveData<Integer> unreadMessageCount = SharedMessageVM.INSTANCE.getUnreadMessageCount();
            composerStartRestartGroup.startReplaceableGroup(-625564833);
            State stateObserveAsState = unreadMessageCount == null ? null : LiveDataAdapterKt.observeAsState(unreadMessageCount, composerStartRestartGroup, 8);
            composerStartRestartGroup.endReplaceableGroup();
            boolean z = false;
            int iIntValue = (stateObserveAsState == null || (num = (Integer) stateObserveAsState.getValue()) == null) ? 0 : num.intValue();
            if (Intrinsics.areEqual(bool, Boolean.TRUE) && iIntValue > 0) {
                z = true;
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1371200213, true, new OooO0OO(iIntValue, mixedRoomActivity, mutableState)), composerStartRestartGroup, 200064, 18);
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
