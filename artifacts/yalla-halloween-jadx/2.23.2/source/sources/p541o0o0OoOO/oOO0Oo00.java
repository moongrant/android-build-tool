package p541o0o0OoOO;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.compose.FlowExtKt;
import com.code.android.util.o000000;
import com.code.android.util.o0000O0;
import com.code.android.util.o00Oo0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.composable.common.BeatGuideAlignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000o;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o000O0O0;
import p423o0OoO0OO.o00O0000;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;
import p516o0o0O00o.o000O0Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,696:1\n76#2:697\n25#3:698\n25#3:705\n25#3:716\n456#3,8:746\n464#3,3:760\n36#3:764\n467#3,3:771\n456#3,8:794\n464#3,3:808\n467#3,3:812\n1097#4,6:699\n1097#4,6:706\n1097#4,3:717\n1100#4,3:723\n1097#4,6:765\n486#5,4:712\n490#5,2:720\n494#5:726\n486#6:722\n1#7:727\n154#8:728\n154#8:776\n73#9,6:729\n79#9:763\n83#9:775\n73#9,6:777\n79#9:811\n83#9:816\n78#10,11:735\n91#10:774\n78#10,11:783\n91#10:815\n4144#11,6:754\n4144#11,6:802\n81#12:817\n81#12:818\n81#12:819\n107#12,2:820\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList\n*L\n102#1:697\n108#1:698\n110#1:705\n111#1:716\n128#1:746,8\n128#1:760,3\n134#1:764\n128#1:771,3\n148#1:794,8\n148#1:808,3\n148#1:812,3\n108#1:699,6\n110#1:706,6\n111#1:717,3\n111#1:723,3\n134#1:765,6\n111#1:712,4\n111#1:720,2\n111#1:726\n111#1:722\n128#1:728\n148#1:776\n128#1:729,6\n128#1:763\n128#1:775\n148#1:777,6\n148#1:811\n148#1:816\n128#1:735,11\n128#1:774\n148#1:783,11\n148#1:815\n128#1:754,6\n148#1:802,6\n104#1:817\n105#1:818\n108#1:819\n108#1:820,2\n*E\n"})
public final class oOO0Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0Oo00 f55250OooO00o = new oOO0Oo00();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55251OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f55252OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, Context context) {
            super(0);
            this.f55251OooO0Oo = i;
            this.f55252OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<oo00> list = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O;
            int i = this.f55251OooO0Oo + 5;
            oOO0Oo00.OooO0O0(list.get(i), this.f55252OooO0o0, i);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopMicList$Content$1$1", f = "LiveRoomScreenMicList.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55253OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f55254OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<MutableLongState> f55255OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Ref.ObjectRef<MutableLongState> objectRef, long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f55255OooO0o0 = objectRef;
            this.f55254OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55255OooO0o0, this.f55254OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55253OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f55253OooO0Oo = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f55255OooO0o0.element.setValue(this.f55254OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<MutableLongState> f55256OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<MutableLongState> objectRef) {
            super(0);
            this.f55256OooO0Oo = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55256OooO0Oo.element.setValue(-1L);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Offset> f55257OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Offset> mutableState) {
            super(1);
            this.f55257OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f55257OooO0Oo.setValue(Offset.m1436boximpl(it.mo2814localToWindowMKHz9U(Offset.INSTANCE.m1463getZeroF1C5BW0())));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55258OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f55259OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, Context context) {
            super(0);
            this.f55258OooO0Oo = i;
            this.f55259OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<oo00> list = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O;
            int i = this.f55258OooO0Oo;
            oOO0Oo00.OooO0O0(list.get(i), this.f55259OooO0o0, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55260OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0000O0O.OooO0O0("room", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48583OooO0oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList$Content$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,696:1\n350#2,7:697\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList$Content$6\n*L\n185#1:697,7\n*E\n"})
    public static final class OooOO0O<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O<T> f55261OooO0Oo = new OooOO0O<>();

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Pair pair = (Pair) obj;
            long jLongValue = ((Number) pair.getFirst()).longValue();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue() && !com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48576OooO00o.getValue().booleanValue()) {
                return Unit.INSTANCE;
            }
            Iterator<oo00> it = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().f55307OooO0OO.getValue().longValue() == ((Number) pair.getFirst()).longValue()) {
                    break;
                }
                i++;
            }
            if (i > -1) {
                if (((Number) pair.getSecond()).intValue() < 30) {
                    return Unit.INSTANCE;
                }
                Object objEmit = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.get(i).f55310OooO0o0.emit(Boxing.boxBoolean(true), continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
            }
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                long jLongValue2 = ((Number) pair.getFirst()).longValue();
                o0000O00.OooO0OO("RoomLiveService", "muteRemoteAudio userId = " + jLongValue2 + ", mute = true");
                p355o0OOOo0o.OooO oooO = roomLiveService.f24601OooO0oO;
                if (oooO != null) {
                    oooO.OooO0o(o000000.OooO0OO(Long.valueOf(jLongValue2)), true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55263OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i) {
            super(2);
            this.f55263OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55263OooO0o0 | 1);
            oOO0Oo00.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oo00 oo00Var, Context context, int i) {
        if (oo00Var.f55306OooO0O0.getValue().booleanValue()) {
            ooooO0O0 onLogin = new ooooO0O0(context, i);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i2 = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                return;
            }
            return;
        }
        MutableStateFlow<Boolean> mutableStateFlow = oo00Var.f55306OooO0O0;
        boolean zBooleanValue = mutableStateFlow.getValue().booleanValue();
        MutableStateFlow<Long> mutableStateFlow2 = oo00Var.f55307OooO0OO;
        if (!zBooleanValue && mutableStateFlow2.getValue().longValue() > 0) {
            oOOO000o onLogin2 = new oOOO000o(oo00Var, context);
            Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin2.invoke();
                return;
            }
            Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O1 != null) {
                int i3 = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O1);
                return;
            }
            return;
        }
        if (mutableStateFlow.getValue().booleanValue() || mutableStateFlow2.getValue().longValue() != 0) {
            return;
        }
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.mixedroom.MixedRoomActivity");
        MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) context;
        RoomFrameUIController roomFrameUIController = mixedRoomActivity.f22981Oooo0oO;
        oOOO0OO0 onLogin3 = new oOOO0OO0(i, mixedRoomActivity);
        Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
        o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin3.invoke();
            return;
        }
        Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O2 != null) {
            int i4 = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x036a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Object next;
        int i2;
        int i3;
        BeatGuideAlignment beatGuideAlignment;
        Modifier modifierOnGloballyPositioned;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1841739794);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1841739794, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopMicList.Content (LiveRoomScreenMicList.kt:100)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            State stateCollectAsState = SnapshotStateKt.collectAsState(o0000ooVar.f48583OooO0oo, null, composerStartRestartGroup, 8, 1);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24542OooO0oO, Boolean.FALSE, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 56, 14);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1436boximpl(OffsetKt.Offset(0.0f, 0.0f)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            T t = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                MutableLongState mutableLongStateMutableLongStateOf = SnapshotLongStateKt.mutableLongStateOf(-1L);
                composerStartRestartGroup.updateRememberedValue(mutableLongStateMutableLongStateOf);
                t = mutableLongStateMutableLongStateOf;
            }
            composerStartRestartGroup.endReplaceableGroup();
            objectRef.element = t;
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, 1118032570);
            if (((Boolean) stateCollectAsStateWithLifecycle.getValue()).booleanValue()) {
                Observable<Object> observable = LiveEventBus.get("VIDEO_FEED_HERE_USER");
                Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                o00O0000.OooO0O0(observable, new Observer() { // from class: o0o0OoOO.oOO0OOO
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        CoroutineScope scope = coroutineScopeOooO00o;
                        long jLongValue = ((Long) obj).longValue();
                        Intrinsics.checkNotNullParameter(scope, "$scope");
                        Ref.ObjectRef showHereId = objectRef;
                        Intrinsics.checkNotNullParameter(showHereId, "$showHereId");
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new oOO0Oo00.OooO00o(showHereId, jLongValue, null), 3, null);
                    }
                }, composerStartRestartGroup, 72);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new OooO0O0(objectRef), composerStartRestartGroup, 6);
            Iterator<T> it = o0000ooVar.f48585OooOO0O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oo00) next).f55307OooO0OO.getValue().longValue() == ((MutableLongState) objectRef.element).getValue().longValue()));
            oo00 oo00Var = (oo00) next;
            int i4 = oo00Var != null ? oo00Var.f55305OooO00o : -1;
            float f = 7;
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(f), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1118033142);
            int i5 = 0;
            while (true) {
                i2 = 5;
                if (i5 >= 5) {
                    break;
                }
                oo00 oo00Var2 = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.get(i5);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1801535979);
                if (((Boolean) stateCollectAsState.getValue()).booleanValue() && i5 == 0) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(mutableState);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new OooO0OO(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) objRememberedValue3);
                } else {
                    modifierOnGloballyPositioned = companion3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                oO0Oo0o0.OooOO0O(rowScopeInstance, oo00Var2, o0O0O00.OooO0O0(companion3.then(modifierOnGloballyPositioned), false, false, 0L, false, null, null, null, new OooO0o(i5, context), 253), i4, composerStartRestartGroup, 70);
                i5++;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1118033874);
            if (com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooOO0o()) {
                Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(f), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1118033985);
                int i6 = 0;
                while (i6 < i2) {
                    oO0Oo0o0.OooOO0O(rowScopeInstance2, com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.get(i6 + 5), o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new OooO(i6, context), 253), i4, composerStartRestartGroup, 70);
                    i6++;
                    i2 = i2;
                }
                i3 = i2;
                o00O000o.OooO00o(composerStartRestartGroup);
            } else {
                i3 = 5;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1118034458);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            if (Intrinsics.areEqual(com.yalla.yalla.service.room.OooO00o.OooO0OO(), com.yalla.yalla.service.room.OooO0OO.OooO0o.f24593OooO00o) && ((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                int iOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooO0o0();
                o000O0Oo o000o0oo2 = o000O0Oo.f51205OooO00o;
                String strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.tips_pick_up_mic, composerStartRestartGroup, 0);
                float f2 = 69;
                float f3 = 85;
                long jIntSize = IntSizeKt.IntSize(o0000O0.OooO00o(f2), o0000O0.OooO00o(f3));
                int i7 = (iOooO0o0 + 1) % i3;
                if (i7 == 0) {
                    beatGuideAlignment = BeatGuideAlignment.End;
                } else if (i7 == 1 || i7 == 2) {
                    beatGuideAlignment = BeatGuideAlignment.Start;
                } else if (i7 != 4) {
                    beatGuideAlignment = BeatGuideAlignment.Center;
                } else {
                    beatGuideAlignment = BeatGuideAlignment.End;
                }
                o000o0oo2.OooO00o(strStringResource, jIntSize, OffsetKt.Offset(Offset.m1447getXimpl(((Offset) mutableState.getValue()).getPackedValue()) + ((iOooO0o0 % 5) * o0000O0.OooO00o(f2)), Offset.m1448getYimpl(((Offset) mutableState.getValue()).getPackedValue()) + (iOooO0o0 >= i3 ? o0000O0.OooO00o(f3) : 0)), true, beatGuideAlignment, OooOO0.f55260OooO0Oo, composerStartRestartGroup, 1772544, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o000O0O0.OooO0O0(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48582OooO0oO, null, OooOO0O.f55261OooO0Oo, composerStartRestartGroup, 520, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(i));
    }
}
