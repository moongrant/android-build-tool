package p533o0o0Oo0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.OooOOO;
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
import com.google.firebase.messaging.o0OO00O;
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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o0ooOOo;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p507o0o00ooo.f;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,695:1\n76#2:696\n25#3:697\n25#3:704\n25#3:715\n456#3,8:745\n464#3,3:759\n36#3:763\n467#3,3:770\n456#3,8:793\n464#3,3:807\n467#3,3:811\n1097#4,6:698\n1097#4,6:705\n1097#4,3:716\n1100#4,3:722\n1097#4,6:764\n486#5,4:711\n490#5,2:719\n494#5:725\n486#6:721\n1#7:726\n154#8:727\n154#8:775\n73#9,6:728\n79#9:762\n83#9:774\n73#9,6:776\n79#9:810\n83#9:815\n78#10,11:734\n91#10:773\n78#10,11:782\n91#10:814\n4144#11,6:753\n4144#11,6:801\n81#12:816\n81#12:817\n81#12:818\n107#12,2:819\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList\n*L\n101#1:696\n107#1:697\n109#1:704\n110#1:715\n127#1:745,8\n127#1:759,3\n133#1:763\n127#1:770,3\n147#1:793,8\n147#1:807,3\n147#1:811,3\n107#1:698,6\n109#1:705,6\n110#1:716,3\n110#1:722,3\n133#1:764,6\n110#1:711,4\n110#1:719,2\n110#1:725\n110#1:721\n127#1:727\n147#1:775\n127#1:728,6\n127#1:762\n127#1:774\n147#1:776,6\n147#1:810\n147#1:815\n127#1:734,11\n127#1:773\n147#1:782,11\n147#1:814\n127#1:753,6\n147#1:801,6\n103#1:816\n104#1:817\n107#1:818\n107#1:819,2\n*E\n"})
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O00OO f54750OooO00o = new o00O00OO();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54751OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f54752OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, Context context) {
            super(0);
            this.f54751OooO0Oo = i;
            this.f54752OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<oo0O> list = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O;
            int i = this.f54751OooO0Oo + 5;
            o00O00OO.OooO0O0(list.get(i), this.f54752OooO0o0, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f54753OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<MutableLongState> f54754OooO0o0;

        public OooO00o(CoroutineScope coroutineScope, Ref.ObjectRef<MutableLongState> objectRef) {
            this.f54753OooO0Oo = coroutineScope;
            this.f54754OooO0o0 = objectRef;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            BuildersKt__Builders_commonKt.launch$default(this.f54753OooO0Oo, null, null, new oOO00O(this.f54754OooO0o0, l.longValue(), null), 3, null);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<MutableLongState> f54755OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<MutableLongState> objectRef) {
            super(0);
            this.f54755OooO0Oo = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54755OooO0Oo.element.setValue(-1L);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Offset> f54756OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Offset> mutableState) {
            super(1);
            this.f54756OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54756OooO0Oo.setValue(Offset.m1425boximpl(it.mo2804localToWindowMKHz9U(Offset.INSTANCE.m1452getZeroF1C5BW0())));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54757OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f54758OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, Context context) {
            super(0);
            this.f54757OooO0Oo = i;
            this.f54758OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<oo0O> list = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O;
            int i = this.f54757OooO0Oo;
            o00O00OO.OooO0O0(list.get(i), this.f54758OooO0o0, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f54759OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o0OO00O.OooO00o("room", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47378OooO0oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList$Content$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,695:1\n350#2,7:696\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMicList$Content$6\n*L\n184#1:696,7\n*E\n"})
    public static final class OooOO0O implements FlowCollector<Pair<? extends Long, ? extends Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f54760OooO0Oo = new OooOO0O();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Pair<? extends Long, ? extends Integer> pair, Continuation continuation) {
            Pair<? extends Long, ? extends Integer> pair2 = pair;
            long jLongValue = pair2.getFirst().longValue();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue() && !com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47371OooO00o.getValue().booleanValue()) {
                return Unit.INSTANCE;
            }
            Iterator<oo0O> it = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().f54838OooO0OO.getValue().longValue() == pair2.getFirst().longValue()) {
                    break;
                }
                i++;
            }
            if (i > -1) {
                if (pair2.getSecond().intValue() < 30) {
                    return Unit.INSTANCE;
                }
                Object objEmit = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O.get(i).f54841OooO0o0.emit(Boxing.boxBoolean(true), continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
            }
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                long jLongValue2 = pair2.getFirst().longValue();
                p592o0oo00O.OooOOO0.OooO0OO("RoomLiveService", "muteRemoteAudio userId = " + jLongValue2 + ", mute = true");
                p351o0OOOo0O.OooOO0 oooOO1 = roomLiveService.f25063OooO0oO;
                if (oooOO1 != null) {
                    oooOO1.OooO0o(o000000.OooO0OO(Long.valueOf(jLongValue2)), true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54762OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i) {
            super(2);
            this.f54762OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54762OooO0o0 | 1);
            o00O00OO.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oo0O oo0o, Context context, int i) {
        if (oo0o.f54837OooO0O0.getValue().booleanValue()) {
            oo00o onLogin = new oo00o(context, i);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i2 = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                return;
            }
            return;
        }
        MutableStateFlow<Boolean> mutableStateFlow = oo0o.f54837OooO0O0;
        boolean zBooleanValue = mutableStateFlow.getValue().booleanValue();
        MutableStateFlow<Long> mutableStateFlow2 = oo0o.f54838OooO0OO;
        if (!zBooleanValue && mutableStateFlow2.getValue().longValue() > 0) {
            o00O0O00 onLogin2 = new o00O0O00(oo0o, context);
            Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
            o000000O o000000o3 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin2.invoke();
                return;
            }
            Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O1 != null) {
                int i3 = LoginActivity.f25186OooOo0O;
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
        RoomFrameUIController roomFrameUIController = mixedRoomActivity.f23450Oooo0oO;
        o00O0OO onLogin3 = new o00O0OO(i, mixedRoomActivity);
        Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
        o000000O o000000o4 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin3.invoke();
            return;
        }
        Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O2 != null) {
            int i4 = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x036c  */
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
                ComposerKt.traceEventStart(-1841739794, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopMicList.Content (LiveRoomScreenMicList.kt:99)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            p475o0o000.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
            State stateCollectAsState = SnapshotStateKt.collectAsState(o000000Var.f47378OooO0oo, null, composerStartRestartGroup, 8, 1);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25004OooO0oO, Boolean.FALSE, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 56, 14);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1425boximpl(OffsetKt.Offset(0.0f, 0.0f)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
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
            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, 1118032523);
            if (((Boolean) stateCollectAsStateWithLifecycle.getValue()).booleanValue()) {
                Observable<Object> observable = LiveEventBus.get("VIDEO_FEED_HERE_USER");
                Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.VIDEO_FEED_HERE_USER)");
                o00000O.OooO0O0(observable, new OooO00o(coroutineScopeOooO00o, objectRef), composerStartRestartGroup, 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new OooO0O0(objectRef), composerStartRestartGroup, 6);
            Iterator<T> it = o000000Var.f47380OooOO0O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oo0O) next).f54838OooO0OO.getValue().longValue() == ((MutableLongState) objectRef.element).getValue().longValue()));
            oo0O oo0o = (oo0O) next;
            int i4 = oo0o != null ? oo0o.f54836OooO00o : -1;
            float f = 7;
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1118033095);
            int i5 = 0;
            while (true) {
                i2 = 5;
                if (i5 >= 5) {
                    break;
                }
                oo0O oo0o2 = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O.get(i5);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1801535932);
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
                o000.OooOO0O(rowScopeInstance, oo0o2, com.code.android.util.o0O0O00.OooO0O0(companion3.then(modifierOnGloballyPositioned), false, false, 0L, false, null, null, null, new OooO0o(i5, context), 253), i4, composerStartRestartGroup, 70);
                i5++;
                mutableState = mutableState;
            }
            MutableState mutableState2 = mutableState;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1118033827);
            if (com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.OooOO0o()) {
                Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1118033938);
                int i6 = 0;
                while (i6 < i2) {
                    o000.OooOO0O(rowScopeInstance2, com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O.get(i6 + 5), com.code.android.util.o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new OooO(i6, context), 253), i4, composerStartRestartGroup, 70);
                    i6++;
                    i2 = i2;
                }
                i3 = i2;
                o0ooOOo.OooO00o(composerStartRestartGroup);
            } else {
                i3 = 5;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1118034411);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            if (Intrinsics.areEqual(com.yalla.yalla.service.room.OooO00o.OooO0OO(), com.yalla.yalla.service.room.OooO0OO.OooO0o.f25055OooO00o) && ((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                int iOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.OooO0o0();
                f fVar = f.f49836OooO00o;
                String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.tips_pick_up_mic, composerStartRestartGroup, 0);
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
                fVar.OooO00o(strStringResource, jIntSize, OffsetKt.Offset(Offset.m1436getXimpl(((Offset) mutableState2.getValue()).getPackedValue()) + ((iOooO0o0 % 5) * o0000O0.OooO00o(f2)), Offset.m1437getYimpl(((Offset) mutableState2.getValue()).getPackedValue()) + (iOooO0o0 >= i3 ? o0000O0.OooO00o(f3) : 0)), true, beatGuideAlignment, OooOO0.f54759OooO0Oo, composerStartRestartGroup, 1772544, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p417o0OoO0.o000000.OooO0O0(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47377OooO0oO, null, OooOO0O.f54760OooO0Oo, composerStartRestartGroup, 8, 1);
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
