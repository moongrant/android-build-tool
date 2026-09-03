package p499o0o00o;

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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o00O0000;
import p516o0o0O00o.o0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.d2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMoraGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,106:1\n25#2:107\n1097#3,6:108\n76#4:114\n81#5:115\n107#5,2:116\n*S KotlinDebug\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager\n*L\n45#1:107\n45#1:108,6\n46#1:114\n45#1:115\n45#1:116,2\n*E\n"})
public final class o0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0 f49978OooO00o = new o0OOO0();

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.side.RoomMoraGameManager$Content$1", f = "RoomMoraGameManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49979OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomMoraGameListDialog> f49980OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MixedRoomActivity mixedRoomActivity, MutableState<RoomMoraGameListDialog> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f49979OooO0Oo = mixedRoomActivity;
            this.f49980OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f49979OooO0Oo, this.f49980OooO0o0, continuation);
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
            if (com.yalla.yalla.service.room.OooO00o.f24522OooOOO.f48633OooO00o.getValue().booleanValue() && (mixedRoomActivity = this.f49979OooO0Oo) != null) {
                MutableState<RoomMoraGameListDialog> mutableState = this.f49980OooO0o0;
                RoomMoraGameListDialog value = mutableState.getValue();
                if (value != null) {
                    z = value.isShowing();
                }
                if (!z) {
                    o0oo0000.OooO00o.OooO0O0("102127");
                    RoomMoraGameListDialog roomMoraGameListDialog = new RoomMoraGameListDialog(mixedRoomActivity);
                    roomMoraGameListDialog.setOnDismissListener(new o0OOO00());
                    roomMoraGameListDialog.show();
                    mutableState.setValue(roomMoraGameListDialog);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f49981OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomMoraGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager$Content$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,106:1\n154#2:107\n*S KotlinDebug\n*F\n+ 1 RoomMoraGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMoraGameManager$Content$4\n*L\n80#1:107\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Integer f49982OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49983OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MixedRoomActivity mixedRoomActivity, Integer num) {
            super(3);
            this.f49982OooO0Oo = num;
            this.f49983OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1972714775, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMoraGameManager.Content.<anonymous> (RoomMoraGameManager.kt:69)");
            }
            o0.OooO00o(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0OOOO00(this.f49983OooO0o0), 253), 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), Integer.valueOf(o0Oo0oo.icon_room_bottom_game_box_mora), null, StringResources_androidKt.stringResource(o000000.mora, composer2, 0), this.f49982OooO0Oo, 0.0f, null, false, composer2, 0, 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49985OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f49985OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49985OooO0o0 | 1);
            o0OOO0.this.OooO00o(composer, iUpdateChangedFlags);
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
                ComposerKt.traceEventStart(-1088335679, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMoraGameManager.Content (RoomMoraGameManager.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            p483o0o000Oo.o0O0O00 o0o0o00 = com.yalla.yalla.service.room.OooO00o.f24522OooOOO;
            EffectsKt.LaunchedEffect(SnapshotStateKt.collectAsState(o0o0o00.f48633OooO00o, null, composerStartRestartGroup, 8, 1).getValue(), new OooO00o(mixedRoomActivity, mutableState, null), composerStartRestartGroup, 64);
            Observable<Object> observable = LiveEventBus.get("MORA_GAME_ANIM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o00o.o0OO
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Room.MoraStartPkRequestReply data = (Room.MoraStartPkRequestReply) obj;
                    MutableState moraGameListDialog$delegate = mutableState;
                    Intrinsics.checkNotNullParameter(moraGameListDialog$delegate, "$moraGameListDialog$delegate");
                    Intrinsics.checkNotNullParameter(data, "data");
                    MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                    if (mixedRoomActivity2 != null) {
                        new d2(mixedRoomActivity2, data).show();
                        RoomMoraGameListDialog roomMoraGameListDialog = (RoomMoraGameListDialog) moraGameListDialog$delegate.getValue();
                        if (roomMoraGameListDialog == null || !roomMoraGameListDialog.isShowing()) {
                            return;
                        }
                        roomMoraGameListDialog.dismiss();
                    }
                }
            }, composerStartRestartGroup, 72);
            Integer num = (Integer) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24557OooOo0O, composerStartRestartGroup, 8).getValue();
            composerStartRestartGroup.startReplaceableGroup(-2131620512);
            boolean z = (num != null ? num.intValue() : 0) > 0 && !((Boolean) SnapshotStateKt.collectAsState(o0o0o00.f48633OooO00o, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue();
            composerStartRestartGroup.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO0O0.f49981OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1972714775, true, new OooO0OO(mixedRoomActivity, num)), composerStartRestartGroup, 200064, 16);
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
