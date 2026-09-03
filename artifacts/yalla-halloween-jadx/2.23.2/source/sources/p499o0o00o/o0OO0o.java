package p499o0o00o;

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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o00O0000;
import p475o0Ooooo0.o0O00oO0;
import p516o0o0O00o.o0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMessageBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,82:1\n76#2:83\n25#3:84\n36#3:91\n36#3:98\n1097#4,6:85\n1097#4,6:92\n1097#4,6:99\n81#5:105\n107#5,2:106\n*S KotlinDebug\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager\n*L\n42#1:83\n44#1:84\n46#1:91\n51#1:98\n44#1:85,6\n46#1:92,6\n51#1:99,6\n44#1:105\n44#1:106,2\n*E\n"})
public final class o0OO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO0o f49964OooO00o = new o0OO0o();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49966OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f49966OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49966OooO0o0 | 1);
            o0OO0o.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MessageBoxFragment> f49967OooO0Oo;

        public OooO00o(MutableState<MessageBoxFragment> mutableState) {
            this.f49967OooO0Oo = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            boolean z;
            MessageBoxFragment value;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<MessageBoxFragment> mutableState = this.f49967OooO0Oo;
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

    public static final class OooO0O0<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MessageBoxFragment> f49968OooO0Oo;

        public OooO0O0(MutableState<MessageBoxFragment> mutableState) {
            this.f49968OooO0Oo = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            boolean z;
            MessageBoxFragment value;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<MessageBoxFragment> mutableState = this.f49968OooO0Oo;
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

    public static final class OooO0OO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f49969OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomMessageBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager$Content$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,82:1\n154#2:83\n*S KotlinDebug\n*F\n+ 1 RoomMessageBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMessageBoxManager$Content$4\n*L\n71#1:83\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<MessageBoxFragment> f49971OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49972OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, MixedRoomActivity mixedRoomActivity, MutableState<MessageBoxFragment> mutableState) {
            super(3);
            this.f49970OooO0Oo = i;
            this.f49972OooO0o0 = mixedRoomActivity;
            this.f49971OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1371200213, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMessageBoxManager.Content.<anonymous> (RoomMessageBoxManager.kt:65)");
            }
            o0.OooO00o(o0O0O00.OooO0O0(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), false, false, 0L, false, null, null, null, new o0OO0oO0(this.f49971OooO0o, this.f49972OooO0o0), 253), Integer.valueOf(p562o0oOo000.o0O0O00.icon_room_side_message), null, StringResources_androidKt.stringResource(o000000.nav_title_message, composer2, 0), Integer.valueOf(this.f49970OooO0Oo), 0.0f, null, false, composer2, 0, 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49974OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f49974OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49974OooO0o0 | 1);
            o0OO0o.this.OooO00o(composer, iUpdateChangedFlags);
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
                ComposerKt.traceEventStart(1724974851, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomMessageBoxManager.Content (RoomMessageBoxManager.kt:40)");
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
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
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
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO00o(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable, (Observer) objRememberedValue2, composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("RoomMessageBox_Dismiss");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO0O0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable2, (Observer) objRememberedValue3, composerStartRestartGroup, 72);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Boolean bool = (Boolean) LiveDataAdapterKt.observeAsState(o0O00oO0.OooOo0O(), composerStartRestartGroup, 8).getValue();
            MediatorLiveData<Integer> unreadMessageCount = SharedMessageVM.INSTANCE.getUnreadMessageCount();
            composerStartRestartGroup.startReplaceableGroup(-625564405);
            State stateObserveAsState = unreadMessageCount == null ? null : LiveDataAdapterKt.observeAsState(unreadMessageCount, composerStartRestartGroup, 8);
            composerStartRestartGroup.endReplaceableGroup();
            int iIntValue = (stateObserveAsState == null || (num = (Integer) stateObserveAsState.getValue()) == null) ? 0 : num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) && iIntValue > 0, SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO0OO.f49969OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1371200213, true, new OooO0o(iIntValue, mixedRoomActivity, mutableState)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO(i));
    }
}
