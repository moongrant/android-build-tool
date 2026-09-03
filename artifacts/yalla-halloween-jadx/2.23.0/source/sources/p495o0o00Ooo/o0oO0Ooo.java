package p495o0o00Ooo;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o00000O;
import p475o0o000.o00Oo0;
import p507o0o00ooo.a1;
import p519o0o0O0oO.d2;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMoraGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,104:1\n25#2:105\n1097#3,6:106\n76#4:112\n81#5:113\n107#5,2:114\n*S KotlinDebug\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager\n*L\n44#1:105\n44#1:106,6\n45#1:112\n44#1:113\n44#1:114,2\n*E\n"})
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0oO0Ooo f48950OooO00o = new o0oO0Ooo();

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.side.RoomMoraGameManager$Content$1", f = "RoomMoraGameManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48951OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomMoraGameListDialog> f48952OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MixedRoomActivity mixedRoomActivity, MutableState<RoomMoraGameListDialog> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48951OooO0Oo = mixedRoomActivity;
            this.f48952OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48951OooO0Oo, this.f48952OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MixedRoomActivity mixedRoomActivity;
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (com.yalla.yalla.service.room.OooO00o.f24984OooOOO.f47444OooO00o.getValue().booleanValue() && (mixedRoomActivity = this.f48951OooO0Oo) != null) {
                MutableState<RoomMoraGameListDialog> mutableState = this.f48952OooO0o0;
                RoomMoraGameListDialog value = mutableState.getValue();
                if (value != null) {
                    z = value.isShowing();
                }
                if (!z) {
                    o0OO000.OooO00o("102127");
                    RoomMoraGameListDialog roomMoraGameListDialog = new RoomMoraGameListDialog(mixedRoomActivity);
                    roomMoraGameListDialog.setOnDismissListener(new o0O00OOO());
                    roomMoraGameListDialog.show();
                    mutableState.setValue(roomMoraGameListDialog);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Room.MoraStartPkRequestReply> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48953OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomMoraGameListDialog> f48954OooO0o0;

        public OooO0O0(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
            this.f48953OooO0Oo = mixedRoomActivity;
            this.f48954OooO0o0 = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Room.MoraStartPkRequestReply moraStartPkRequestReply) {
            Room.MoraStartPkRequestReply data = moraStartPkRequestReply;
            Intrinsics.checkNotNullParameter(data, "data");
            MixedRoomActivity mixedRoomActivity = this.f48953OooO0Oo;
            if (mixedRoomActivity != null) {
                new d2(mixedRoomActivity, data).show();
                RoomMoraGameListDialog value = this.f48954OooO0o0.getValue();
                if (value == null || !value.isShowing()) {
                    return;
                }
                value.dismiss();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nRoomMoraGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager$Content$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,104:1\n154#2:105\n*S KotlinDebug\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager$Content$3\n*L\n78#1:105\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Integer f48955OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48956OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MixedRoomActivity mixedRoomActivity, Integer num) {
            super(3);
            this.f48955OooO0Oo = num;
            this.f48956OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1972714775, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMoraGameManager.Content.<anonymous> (RoomMoraGameManager.kt:66)");
            }
            a1.OooO00o(PaddingKt.m480paddingqDBjuR0$default(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0O00oO0(this.f48956OooO0o0), 253), 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), Integer.valueOf(oOo00OO0.icon_room_bottom_game_box_mora), null, StringResources_androidKt.stringResource(oO00OOo0.mora, composer2, 0), this.f48955OooO0Oo, 0.0f, null, false, composer2, 0, 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48958OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f48958OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48958OooO0o0 | 1);
            o0oO0Ooo.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1088335679);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088335679, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMoraGameManager.Content (RoomMoraGameManager.kt:42)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            o00Oo0 o00oo1 = com.yalla.yalla.service.room.OooO00o.f24984OooOOO;
            EffectsKt.LaunchedEffect(SnapshotStateKt.collectAsState(o00oo1.f47444OooO00o, null, composerStartRestartGroup, 8, 1).getValue(), new OooO00o(mixedRoomActivity, mutableState, null), composerStartRestartGroup, 64);
            Observable<Object> observable = LiveEventBus.get("MORA_GAME_ANIM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.MORA_GAME_ANIM)");
            o00000O.OooO00o(observable, new OooO0O0(mutableState, mixedRoomActivity), composerStartRestartGroup, 8);
            Integer num = (Integer) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25019OooOo0O, composerStartRestartGroup, 8).getValue();
            composerStartRestartGroup.startReplaceableGroup(-2131620559);
            boolean z = false;
            if ((num != null ? num.intValue() : 0) > 0 && !((Boolean) SnapshotStateKt.collectAsState(o00oo1.f47444OooO00o, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                z = true;
            }
            composerStartRestartGroup.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1972714775, true, new OooO0OO(mixedRoomActivity, num)), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }
}
