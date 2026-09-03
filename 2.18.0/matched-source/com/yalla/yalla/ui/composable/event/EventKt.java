package com.yalla.yalla.ui.composable.event;

import Oooo0.o00O0000;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import coil.annotation.ExperimentalCoilApi;
import com.app.base.model.RoomModel;
import com.code.android.util.ToastUtil;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.EventModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.CoroutineScope;
import o00000O0.o0OO00O;
import o0000O0O.o00Oo0;
import o0000OO.o00000O;
import o0000OO.o00000O0;
import o0O0O00.o000000;
import o0O0O00.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0OO;
import p028Oooo0o0.o0O000;
import p028Oooo0o0.o0O00oO0;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0oO0Ooo;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
import p033OoooO00.o00O0O;
import p035OoooOO0.o0000O00;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p115o00O00o.OooOOOO;
import p115o00O00o.OooOo00;
import p115o00O00o.Oooo0;
import p115o00O00o.o000oOoO;
import p146o00Oo0.o000O0Oo;
import p146o00Oo0.o000OO;
import p255o00ooO0O.o000O0o;
import p256o00ooO0o.oo0oOO0;
import p258o00ooOO0.o0O00O0o;
import p262o00ooOoO.x;
import p264o00ooo.o000OO0O;
import p445o0OoOo0.Oooo000;
import p508o0o00oO0.oo00oO;
import p509o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class EventKt {

    public static final class OooO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23677Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23677Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f = 12;
            o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, this.f23677Oooo.f27385OooO0O0, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27383OooO0oO, this.f23677Oooo.f27388OooO0o0, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23678Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23678Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27382OooO0o0, this.f23678Oooo.f27386OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27383OooO0oO, this.f23678Oooo.f27388OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, this.f23678Oooo.f27385OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, this.f23678Oooo.f27387OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0O0 f23679Oooo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27382OooO0o0, constrainAs.f27379OooO0OO.f27386OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27383OooO0oO, constrainAs.f27379OooO0OO.f27388OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            float f = 12;
            o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, constrainAs.f27379OooO0OO.f27385OooO0O0, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, constrainAs.f27379OooO0OO.f27387OooO0Oo, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23680Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23680Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, this.f23680Oooo.f27385OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, this.f23680Oooo.f27387OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27383OooO0oO, this.f23680Oooo.f27388OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23681Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23681Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f = 12;
            o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, this.f23681Oooo.f27385OooO0O0, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27382OooO0o0, this.f23681Oooo.f27386OooO0OO, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.event.EventKt$EventContent$1$8$1", f = "Event.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23682Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23683OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(EventModel eventModel, o0O00O<Boolean> o0o00o2, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f23682Oooo = eventModel;
            this.f23683OoooO00 = o0o00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f23682Oooo, this.f23683OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f23683OoooO00.setValue(Boolean.valueOf(this.f23682Oooo.getEventState() == EventModel.State.INSTANCE.getInProgress()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23684Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23684Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f = 12;
            o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, this.f23684Oooo.f27387OooO0Oo, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o0O0O00.OooO00o.OooO00o(constrainAs.f27383OooO0oO, this.f23684Oooo.f27388OooO0o0, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23685Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23686OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EventModel eventModel, int i) {
            super(2);
            this.f23685Oooo = eventModel;
            this.f23686OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0O0(this.f23685Oooo, ooo00o, this.f23686OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23687Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23688OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventModel eventModel, int i) {
            super(2);
            this.f23687Oooo = eventModel;
            this.f23688OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO00o(this.f23687Oooo, ooo00o, this.f23688OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23689Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(EventModel eventModel) {
            super(0);
            this.f23689Oooo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager roomStateManager = RoomStateManager.INSTANCE;
            RoomModel roomModel = new RoomModel();
            EventModel eventModel = this.f23689Oooo;
            roomModel.setId(eventModel.getRoomId());
            roomModel.setImage(eventModel.getRoomImage());
            roomModel.setName(eventModel.getRoomName());
            roomModel.setRoomIp(eventModel.getRoomServerIP());
            roomStateManager.enterRoom(roomModel, EnterRoomParentPage.EventList);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f23690Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i) {
            super(2);
            this.f23690Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0Oo(ooo00o, this.f23690Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23691Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23692OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(EventModel eventModel, int i) {
            super(2);
            this.f23691Oooo = eventModel;
            this.f23692OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0OO(this.f23691Oooo, ooo00o, this.f23692OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<EventModel, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final Oooo0 f23693Oooo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EventModel eventModel) {
            EventModel it = eventModel;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<EventModel, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final Oooo000 f23694Oooo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EventModel eventModel) {
            EventModel it = eventModel;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23695Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23696OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Context f23697OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(o0O00O<Boolean> o0o00o2, int i, Context context, EventModel eventModel) {
            super(2);
            this.f23695Oooo = o0o00o2;
            this.f23697OoooO00 = context;
            this.f23696OoooO0 = eventModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        /* JADX WARN: Type inference failed for: r61v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            Function0<o000000.OooO00o> function0;
            o0O00O o0o00o2;
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o;
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
                o0000O0 o0000o1 = o0000O0.f41710OooO00o;
                long j = o0000O0.f41712OooO0OO;
                float f = 15;
                o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO0o, j, p033OoooO00.o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12));
                o0O00O<Boolean> o0o00o3 = this.f23695Oooo;
                Context context = this.f23697OoooO00;
                EventModel eventModel = this.f23696OoooO0;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
                o0O0O00.o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2042OooO0Oo, o00OO0O0.OooO00o.f4199OooOOO, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6371OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6375OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6379OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
                Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r10 = o000000.OooO00o.C0279OooO00o.f26600OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r10);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26598OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r3);
                ?? r4 = o000000.OooO00o.C0279OooO00o.f26599OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r4);
                ?? r61 = o000000.OooO00o.C0279OooO00o.f26601OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r61, composer, "composer", composer), composer, 0);
                o000OO0O o000oo0oOooO00o = com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -1163856341, R.drawable.icon_dialog_close, composer);
                float f2 = 14;
                float f3 = 23;
                o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 9), f3);
                o00OO0OO.OooO00o alignment = o00OO0O0.OooO00o.f4202OooOOOo;
                Intrinsics.checkNotNullParameter(o00oooo0OooOO0, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function2 = o00oOoo.f6585OooO00o;
                Function1<o00O000o, Unit> function4 = o00oOoo.f6585OooO00o;
                o00OOOO0 o00oooo0OooOOoo = o00oooo0OooOO0.OooOOoo(new o00O0OO(alignment));
                composer.OooO0o0(1157296644);
                boolean zOooo0oo = composer.Oooo0oo(o0o00o3);
                Object objOooO0o = composer.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
                    objOooO0o = new com.yalla.yalla.ui.composable.event.OooO00o(o0o00o3);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0O0(o00oooo0OooOOoo, false, false, null, (Function0) objOooO0o, 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                o000OO0O o000oo0oOooO00o2 = o00000.OooO0O0.OooO00o(R.drawable.ic_event_calendar, composer);
                o00OOOO0 o00oooo0OooOO1 = SizeKt.OooOO0(PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 9, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), 115);
                o00OO0OO.OooO00o alignment2 = o00OO0O0.OooO00o.f4201OooOOOO;
                Intrinsics.checkNotNullParameter(o00oooo0OooOO1, "<this>");
                Intrinsics.checkNotNullParameter(alignment2, "alignment");
                Oooo0.o00.OooO00o(o000oo0oOooO00o2, null, o00oooo0OooOO1.OooOOoo(new o00O0OO(alignment2)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, f3), composer, 6);
                float f4 = 31;
                o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_subscribe_successful, composer), PaddingKt.OooO0oO(oooO00o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), x.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(17), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3120, 0, 65520);
                float f5 = 8;
                int i = 6;
                o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, f5), composer, 6);
                o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_subscribe_successful_desc, composer), PaddingKt.OooO0oO(oooO00o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), x.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(13), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3120, 0, 65520);
                o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, f4), composer, 6);
                composer.OooO0o0(-492369756);
                Object objOooO0o2 = composer.OooO0o();
                oOO00O.OooO00o.C0323OooO00o c0323OooO00o2 = oOO00O.OooO00o.f29707OooO0O0;
                if (objOooO0o2 == c0323OooO00o2) {
                    Boolean value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOoo0().getValue();
                    if (value == null) {
                        value = Boolean.FALSE;
                    }
                    objOooO0o2 = o0OOO00.OooO0Oo(value);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o0O00O o0o00o4 = (o0O00O) objOooO0o2;
                Observable<Object> observable = LiveEventBus.get("UPDATE_AUTO_ADD_TO_CALENDAR_STATE");
                Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.UPDATE_AUTO_ADD_TO_CALENDAR_STATE)");
                composer.OooO0o0(1157296644);
                boolean zOooo0oo2 = composer.Oooo0oo(o0o00o4);
                Object objOooO0o3 = composer.OooO0o();
                if (zOooo0oo2 || objOooO0o3 == c0323OooO00o2) {
                    objOooO0o3 = new com.yalla.yalla.ui.composable.event.OooO0O0(o0o00o4);
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                p524o0o0O0o.o00O000o.OooO00o(observable, new p144o00OOooo.o00OOOO0((Function1) objOooO0o3, i), composer, 72);
                o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0o(oooO00o), f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
                composer.OooO0o0(693286680);
                o0O0O00.o000000 o000000VarOooO00o2 = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, oooO0O0, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0oO);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    function0 = function1;
                    composer.OooOoO0(function0);
                } else {
                    function0 = function1;
                    composer.Oooo00O();
                }
                Function0<o000000.OooO00o> function5 = function0;
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r10, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r61, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                Boolean autoAddCalendar = (Boolean) o0o00o4.getValue();
                Intrinsics.checkNotNullExpressionValue(autoAddCalendar, "autoAddCalendar");
                if (autoAddCalendar.booleanValue()) {
                    composer.OooO0o0(-1226746217);
                    o000OO0O o000oo0oOooO00o3 = o00000.OooO0O0.OooO00o(R.mipmap.account_delete_selected, composer);
                    o00OOOO0 o00oooo0OooOO2 = SizeKt.OooOO0(oooO00o, f);
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo3 = composer.Oooo0oo(o0o00o2);
                    Object objOooO0o4 = composer.OooO0o();
                    c0323OooO00o = c0323OooO00o2;
                    if (zOooo0oo3 || objOooO0o4 == c0323OooO00o) {
                        o0o00o2 = o0o00o4;
                        objOooO0o4 = new com.yalla.yalla.ui.composable.event.OooO0OO(o0o00o2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o000oo0oOooO00o3, null, o000O0o.OooO0O0(o00oooo0OooOO2, false, false, null, (Function0) objOooO0o4, 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                    composer.Oooo0o0();
                } else {
                    c0323OooO00o = c0323OooO00o2;
                    composer.OooO0o0(-1226745729);
                    o00OOOO0 o00oooo0OooO0O1 = BorderKt.OooO0O0(SizeKt.OooOO0(oooO00o, f), (float) 0.5d, o0000O0.f41828o0ooOoO, p033OoooO00.o00O0O.f3445OooO00o);
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo4 = composer.Oooo0oo(o0o00o2);
                    Object objOooO0o5 = composer.OooO0o();
                    if (zOooo0oo4 || objOooO0o5 == c0323OooO00o) {
                        o0o00o2 = o0o00o4;
                        objOooO0o5 = new com.yalla.yalla.ui.composable.event.OooO0o(o0o00o2);
                        composer.Oooo00o(objOooO0o5);
                    }
                    composer.Oooo0o0();
                    o0O0OO0.OooO00o(o000O0o.OooO0O0(o00oooo0OooO0O1, false, false, null, (Function0) objOooO0o5, 253), composer, 0);
                    composer.Oooo0o0();
                }
                o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f5), composer, 6);
                String strOooO00o = o00000.OooO0OO.OooO00o(R.string.message_theme_view_more, composer);
                composer.OooO0o0(-1226745006);
                o00000O.OooO00o.C0282OooO00o c0282OooO00o = new o00000O.OooO00o.C0282OooO00o();
                int iOooO0oO = c0282OooO00o.OooO0oO(new o00000O.o00Oo0(x.OooO0O0(composer).OooO0oO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16380));
                try {
                    c0282OooO00o.OooO0O0(o00000.OooO0OO.OooO00o(R.string.event_auto_add_calendar, composer));
                    Unit unit = Unit.INSTANCE;
                    c0282OooO00o.OooO0o0(iOooO0oO);
                    c0282OooO00o.OooO0o(strOooO00o, "");
                    long j2 = o0000O0.f41729OooOo0;
                    int iOooO0oO2 = c0282OooO00o.OooO0oO(new o00000O.o00Oo0(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382));
                    try {
                        c0282OooO00o.OooO0O0(strOooO00o);
                        c0282OooO00o.OooO0o0(iOooO0oO2);
                        o00000O.OooO00o oooO00oOooO0oo = c0282OooO00o.OooO0oo();
                        composer.Oooo0o0();
                        composer.OooO0o0(511388516);
                        boolean zOooo0oo5 = composer.Oooo0oo(oooO00oOooO0oo) | composer.Oooo0oo(strOooO00o);
                        Object objOooO0o6 = composer.OooO0o();
                        if (zOooo0oo5 || objOooO0o6 == c0323OooO00o) {
                            objOooO0o6 = new com.yalla.yalla.ui.composable.event.OooO(oooO00oOooO0oo, strOooO00o);
                            composer.Oooo00o(objOooO0o6);
                        }
                        composer.Oooo0o0();
                        p032OoooO0.o000oOoO.OooO00o(oooO00oOooO0oo, null, null, false, 0, 0, null, (Function1) objOooO0o6, composer, 0, 126);
                        p028Oooo0o0.o0O0O0o0.OooO00o(composer);
                        o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, 12), composer, 6);
                        o00OOOO0 o00oooo0OooO0O2 = o000O0o.OooO0O0(BackgroundKt.OooO0O0(PaddingKt.OooO0oO(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 41), f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), j2, p033OoooO00.o00O0O.OooO00o()), false, false, null, new com.yalla.yalla.ui.composable.event.OooOOO0(context, eventModel, o0o00o2, o0o00o3), 253);
                        o0O0O00.o000000 o000000VarOooO00o3 = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00OO0O0.OooO00o.f4192OooO0o, false, composer, -1323940314);
                        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O2);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function5);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r10, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r61, composer, "composer", composer), composer, 0);
                        o000O0O0.OooO0OO(p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -2137368960, R.string.event_subscribe_add_to_calendar, composer), null, j, o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3456, 0, 65010);
                        p028Oooo0o0.o0O0O0o0.OooO00o(composer);
                        o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, 25), composer, 6);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    } catch (Throwable th) {
                        c0282OooO00o.OooO0o0(iOooO0oO2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0282OooO00o.OooO0o0(iOooO0oO);
                    throw th2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23698Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(Function0<Unit> function0) {
            super(0);
            this.f23698Oooo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23698Oooo.invoke();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.event.EventKt$showAddToCalendarDialog$1", f = "Event.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23699Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23700OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Context f23701OoooO00;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public static final OooO00o f23702Oooo = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                bool.booleanValue();
                ToastUtil.f12582OooO00o.OooO0O0(p255o00ooO0O.o000O0O0.OooO0OO(R.string.event_add_calendar_success));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(o0O00O<Boolean> o0o00o2, Context context, EventModel eventModel, Continuation<? super o000000O> continuation) {
            super(2, continuation);
            this.f23699Oooo = o0o00o2;
            this.f23701OoooO00 = context;
            this.f23700OoooO0 = eventModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000000O(this.f23699Oooo, this.f23701OoooO00, this.f23700OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f23699Oooo.getValue().booleanValue()) {
                Context context = this.f23701OoooO00;
                String eventName = this.f23700OoooO0.getEventName();
                String eventDesc = this.f23700OoooO0.getEventDesc();
                long eventStartTime = this.f23700OoooO0.getEventStartTime();
                if (p498o0o00OOo.o000oOoO.OooO00o(eventStartTime, p280o0O00OoO.OooO.OooO00o()) == 3) {
                    eventStartTime *= (long) 1000;
                }
                long eventEndTime = this.f23700OoooO0.getEventEndTime();
                if (p498o0o00OOo.o000oOoO.OooO00o(eventEndTime, p280o0O00OoO.OooO.OooO00o()) == 3) {
                    eventEndTime *= (long) 1000;
                }
                p518o0o0O000.OooOo00.OooO00o(context, eventName, eventDesc, eventStartTime, eventEndTime, OooO00o.f23702Oooo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23703Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23704OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Context f23705OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f23706OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(o0O00O<Boolean> o0o00o2, Context context, EventModel eventModel, int i) {
            super(2);
            this.f23703Oooo = o0o00o2;
            this.f23705OoooO00 = context;
            this.f23704OoooO0 = eventModel;
            this.f23706OoooO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooOOO0(this.f23703Oooo, this.f23705OoooO00, this.f23704OoooO0, ooo00o, this.f23706OoooO0O | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f23707Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23708OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f23709OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f23710OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(o0O00oO0 o0o00oo1, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f23707Oooo = o0o00oo1;
            this.f23709OoooO00 = z;
            this.f23708OoooO0 = function0;
            this.f23710OoooO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO(this.f23707Oooo, this.f23709OoooO00, this.f23708OoooO0, ooo00o, this.f23710OoooO0O | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23711Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ EventModel f23712OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o000oOoO(Function1<? super EventModel, Unit> function1, EventModel eventModel) {
            super(0);
            this.f23711Oooo = function1;
            this.f23712OoooO00 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23711Oooo.invoke(this.f23712OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23713Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(EventModel eventModel) {
            super(0);
            this.f23713Oooo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager roomStateManager = RoomStateManager.INSTANCE;
            RoomModel roomModel = new RoomModel();
            EventModel eventModel = this.f23713Oooo;
            roomModel.setId(eventModel.getRoomId());
            roomModel.setImage(eventModel.getRoomImage());
            roomModel.setName(eventModel.getRoomName());
            roomModel.setRoomIp(eventModel.getRoomServerIP());
            roomStateManager.enterRoom(roomModel, EnterRoomParentPage.EventList);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23714Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ EventModel f23715OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Oo0(Function1<? super EventModel, Unit> function1, EventModel eventModel) {
            super(0);
            this.f23714Oooo = function1;
            this.f23715OoooO00 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23714Oooo.invoke(this.f23715OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23716Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f23717OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23718OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23719OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f23720OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Ooo(EventModel eventModel, Function1<? super EventModel, Unit> function1, Function1<? super EventModel, Unit> function2, int i, int i2) {
            super(2);
            this.f23716Oooo = eventModel;
            this.f23719OoooO00 = function1;
            this.f23718OoooO0 = function2;
            this.f23720OoooO0O = i;
            this.f23717OoooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0o0(this.f23716Oooo, this.f23719OoooO00, this.f23718OoooO0, ooo00o, this.f23720OoooO0O | 1, this.f23717OoooO);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Context f23721Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(Context context) {
            super(1);
            this.f23721Oooo = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            SVGAView sVGAView = new SVGAView(it, null, 0, 6, null);
            sVGAView.OooO0oo("svga/event_ongoing.svga", (LifecycleOwner) this.f23721Oooo);
            sVGAView.OooO();
            return sVGAView;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23722Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(Function0<Unit> function0) {
            super(0);
            this.f23722Oooo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23722Oooo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23723Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(Function0<Unit> function0) {
            super(0);
            this.f23723Oooo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23723Oooo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23724Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(Function0<Unit> function0) {
            super(0);
            this.f23724Oooo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23724Oooo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f23725Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23726OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23727OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f23728OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(o0O00oO0 o0o00oo1, int i, Function0<Unit> function0, int i2) {
            super(2);
            this.f23725Oooo = o0o00oo1;
            this.f23727OoooO00 = i;
            this.f23726OoooO0 = function0;
            this.f23728OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0oO(this.f23725Oooo, this.f23727OoooO00, this.f23726OoooO0, ooo00o, this.f23728OoooO0O | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23729Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ EventModel f23730OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOo0(Function1<? super EventModel, Unit> function1, EventModel eventModel) {
            super(0);
            this.f23729Oooo = function1;
            this.f23730OoooO00 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23729Oooo.invoke(this.f23730OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f23731Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f23732OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23733OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(o0O00oO0 o0o00oo1, Function0<Unit> function0, int i) {
            super(2);
            this.f23731Oooo = o0o00oo1;
            this.f23733OoooO00 = function0;
            this.f23732OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0o(this.f23731Oooo, this.f23733OoooO00, ooo00o, this.f23732OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23734Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(Function0<Unit> function0) {
            super(0);
            this.f23734Oooo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23734Oooo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23735Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23736OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(Function0<Unit> function0, int i) {
            super(2);
            this.f23735Oooo = function0;
            this.f23736OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            EventKt.OooO0oo(this.f23735Oooo, ooo00o, this.f23736OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO(@NotNull o0O00oO0 o0o00oo1, boolean z, @NotNull Function0<Unit> subscribeRequest, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(o0o00oo1, "<this>");
        Intrinsics.checkNotNullParameter(subscribeRequest, "subscribeRequest");
        oOO00O composer = ooo00o.OooOOo(-25505852);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(o0o00oo1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.OooO0OO(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composer.Oooo0oo(subscribeRequest) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
            float f = 18;
            o00OOOO0 o00oooo0OooO00o = p445o0OoOo0.Oooo000.OooO00o(o0o00oo1.OooO00o(SizeKt.OooO0oO(oooO00o, 35), true), p033OoooO00.o00O0O.OooO0OO(f));
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o, z ? o0000O0.f41747Oooo0o : o0000O0.f41729OooOo0, p033OoooO00.o00O0O.OooO0OO(f));
            o00O0000 o00o0000OooO00o = o0000O00.OooO00o(false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o0000O0.f41718OooOO0, composer, 384, 3);
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = Oooo0.o00Oo0.OooO00o(composer);
            }
            composer.Oooo0o0();
            p026Oooo0OO.o000 o000Var = (p026Oooo0OO.o000) objOooO0o;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(subscribeRequest);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new o0O0O00(subscribeRequest);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O1 = ClickableKt.OooO0O0(o00oooo0OooO0O0, o000Var, o00o0000OooO00o, (28 & 4) != 0, null, (28 & 16) != 0 ? null : null, (Function0) objOooO0o2);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
            o0O0O00.o000000 o000000VarOooO0O0 = p140o00OOOo0.o000OOo.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2043OooO0o, oooO0O0, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O1);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(z ? R.drawable.ic_event_has_subscribe : R.drawable.ic_event_not_subscribe, composer), null, SizeKt.OooOO0(oooO00o, 15), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, 8), composer, 6);
            String strOooO00o = o00000.OooO0OO.OooO00o(z ? R.string.event_has_subscribe : R.string.event_not_subscribe, composer);
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(15);
            composer.OooO0o0(1195535321);
            long jOooO0oO = z ? x.OooO0O0(composer).OooO0oO() : o0000O0.f41712OooO0OO;
            composer.Oooo0o0();
            o000O0O0.OooO0OO(strOooO00o, null, jOooO0oO, jOooO0OO, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            p028Oooo0o0.o0O0O0o0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o000OOo(o0o00oo1, z, subscribeRequest, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull final EventModel eventModel, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-791624562);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(o00OOOO0.OooO00o.f4215Oooo);
        ooo00oOooOOo.OooO0o0(-270267587);
        ooo00oOooOOo.OooO0o0(-3687241);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new o0000OO.o000OOo();
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        final o0000OO.o000OOo o000ooo2 = (o0000OO.o000OOo) objOooO0o;
        ooo00oOooOOo.OooO0o0(-3687241);
        Object objOooO0o2 = ooo00oOooOOo.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new ConstraintLayoutScope();
            ooo00oOooOOo.Oooo00o(objOooO0o2);
        }
        ooo00oOooOOo.Oooo0o0();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objOooO0o2;
        ooo00oOooOOo.OooO0o0(-3687241);
        Object objOooO0o3 = ooo00oOooOOo.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00oOooOOo.Oooo00o(objOooO0o3);
        }
        ooo00oOooOOo.Oooo0o0();
        Pair pairOooO0O0 = o0000OO.Oooo000.OooO0O0(constraintLayoutScope, (o0O00O) objOooO0o3, o000ooo2, ooo00oOooOOo);
        o0O0O00.o000000 o000000Var = (o0O0O00.o000000) pairOooO0O0.component1();
        final Function0 function0 = (Function0) pairOooO0O0.component2();
        o0O0O00.o00Ooo.OooO00o(SemanticsModifierKt.OooO00o(o00oooo0OooO0o, false, new Function1<o00000O0.o0OO00O, Unit>() { // from class: com.yalla.yalla.ui.composable.event.EventKt$EventContent$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0OO00O o0oo00o2) {
                o0OO00O semantics = o0oo00o2;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                o00000O0.OooO00o(semantics, o000ooo2);
                return Unit.INSTANCE;
            }
        }), p043OooooO0.o00O0000.OooO00o(ooo00oOooOOo, -819894182, new Function2<oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.composable.event.EventKt$EventContent$$inlined$ConstraintLayout$2

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ int f23673Oooo = 6;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
            /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
            /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
            /* JADX WARN: Type inference failed for: r3v21, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(oOO00O ooo00o2, Integer num) {
                Function0<o000000.OooO00o> function1;
                EventKt$EventContent$$inlined$ConstraintLayout$2 eventKt$EventContent$$inlined$ConstraintLayout$2 = this;
                oOO00O composer = ooo00o2;
                if (((num.intValue() & 11) ^ 2) == 0 && composer.OooOo0()) {
                    composer.OooOoo0();
                } else {
                    Objects.requireNonNull(constraintLayoutScope);
                    constraintLayoutScope.OooO0Oo();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    int i2 = ((eventKt$EventContent$$inlined$ConstraintLayout$2.f23673Oooo >> 3) & 112) | 8;
                    if ((i2 & 14) == 0) {
                        i2 |= composer.Oooo0oo(constraintLayoutScope2) ? 4 : 2;
                    }
                    if ((i2 & 91) == 18 && composer.OooOo0()) {
                        composer.OooOoo0();
                    } else {
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0000OO.OooOO0O oooOO0OOooO00o = oooO00oOooO0OO.OooO00o();
                        o0000OO.OooOO0O oooOO0OOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0000OO.OooOO0O oooOO0OOooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0000OO.OooOO0O oooOO0OOooO0O1 = oooO00oOooO0OO.f6790OooO00o.OooO0O0();
                        o0000OO.OooOO0O oooOO0OOooO0O2 = oooO00oOooO0OO.f6790OooO00o.OooO0O0();
                        o0000OO.OooOO0O oooOO0OOooO0O3 = oooO00oOooO0OO.f6790OooO00o.OooO0O0();
                        composer.OooO0o0(-780913300);
                        if (eventModel.getEventState() == 1) {
                            o00OOOO0 o00oooo0OooOO0O = SizeKt.OooOO0O(o00OOOO0.OooO00o.f4215Oooo, 347, 200);
                            float f = 3;
                            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
                            o00OOOO0 o00oooo0OooO0O0 = BorderKt.OooO0O0(PaddingKt.OooO0o0(BorderKt.OooO0O0(o00oooo0OooOO0O, f, o0000O0.f41764OooooOO, o00O0O.OooO0OO(16)), f), 2, o0000O0.f41762Ooooo0o, o00O0O.OooO0OO(14));
                            composer.OooO0o0(1157296644);
                            boolean zOooo0oo = composer.Oooo0oo(oooOO0OOooO0O0);
                            Object objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo || objOooO0o4 == oOO00O.OooO00o.f29707OooO0O0) {
                                objOooO0o4 = new EventKt.OooO00o(oooOO0OOooO0O0);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            o0O0OO0.OooO00o(constraintLayoutScope2.OooO00o(o00oooo0OooO0O0, oooOO0OOooO0O2, (Function1) objOooO0o4), composer, 0);
                        }
                        composer.Oooo0o0();
                        String eventImage = eventModel.getEventImage();
                        composer.OooO0o0(604400049);
                        o0O0O0o0<oOO00O.OooOO0> o0o0o0o0 = o000oOoO.f30345OooO00o;
                        oOO00O.OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(o0o0o0o0, composer);
                        composer.OooO0o0(604401387);
                        o0O0O0o0<Context> o0o0o0o1 = o0O0O00.f6616OooO0O0;
                        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o1));
                        c0072OooO00o.f9928OooO0OO = eventImage;
                        c0072OooO00o.OooO0O0(true);
                        OooOo00 oooOo00OooO00o = Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o0O0O00.OooOO0.OooO00o.C0361OooO00o c0361OooO00o = o0O0O00.OooOO0.OooO00o.f35259OooO0O0;
                        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
                        float f2 = 12;
                        float f3 = 337;
                        Oooo0.o00.OooO00o(oooOo00OooO00o, null, constraintLayoutScope2.OooO00o(SizeKt.OooOO0O(SizeKt.OooO0Oo(Oooo000.OooO00o(oooO00o, o00O0O.OooO0OO(f2))), f3, FacebookRequestErrorClassification.EC_INVALID_TOKEN), oooOO0OOooO0O0, EventKt.OooO0O0.f23679Oooo), null, c0361OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24624, 104);
                        o00OOOO0 o00oooo0OooOO0O2 = SizeKt.OooOO0O(oooO00o, f3, 38);
                        o0000O0 o0000o2 = o0000O0.f41710OooO00o;
                        List colors = CollectionsKt.mutableListOf(new p146o00Oo0.o00000O0(o0000O0.f41711OooO0O0), new p146o00Oo0.o00000O0(o0000O0.f41726OooOOo0));
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        long jOooO00o2 = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.POSITIVE_INFINITY);
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        o00OOOO0 o00oooo0OooO00o = BackgroundKt.OooO00o(o00oooo0OooOO0O2, new o000OO(colors, jOooO00o, jOooO00o2, 0), o00O0O.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, f2, 3), 4);
                        composer.OooO0o0(1157296644);
                        boolean zOooo0oo2 = composer.Oooo0oo(oooOO0OOooO0O0);
                        Object objOooO0o5 = composer.OooO0o();
                        if (zOooo0oo2 || objOooO0o5 == oOO00O.OooO00o.f29707OooO0O0) {
                            objOooO0o5 = new EventKt.OooO0OO(oooOO0OOooO0O0);
                            composer.Oooo00o(objOooO0o5);
                        }
                        composer.Oooo0o0();
                        o0O0OO0.OooO00o(constraintLayoutScope2.OooO00o(o00oooo0OooO00o, oooOO0OOooO0O3, (Function1) objOooO0o5), composer, 0);
                        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
                        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(BorderKt.OooO0O0(BackgroundKt.OooO0O0(SizeKt.OooO0oO(oooO00o, 23), o0000O0.f41721OooOOO, o00O0O.OooO0OO(f2)), (float) 0.5d, o0000O0.f41714OooO0o, o00O0O.OooO0OO(f2)), 6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                        composer.OooO0o0(1157296644);
                        boolean zOooo0oo3 = composer.Oooo0oo(oooOO0OOooO0O0);
                        Object objOooO0o6 = composer.OooO0o();
                        if (zOooo0oo3 || objOooO0o6 == oOO00O.OooO00o.f29707OooO0O0) {
                            objOooO0o6 = new EventKt.OooO0o(oooOO0OOooO0O0);
                            composer.Oooo00o(objOooO0o6);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO00o2 = constraintLayoutScope2.OooO00o(o00oooo0OooO0oO, oooOO0OOooO00o, (Function1) objOooO0o6);
                        composer.OooO0o0(693286680);
                        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
                        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2040OooO0O0;
                        o000000 o000000VarOooO00o = o0oO0Ooo.OooO00o(oooOOOO, oooO0O0, composer);
                        composer.OooO0o0(-1323940314);
                        o0O0O0o0<o0000O0O.OooO> o0o0o0o2 = o000.f6371OooO0o0;
                        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
                        o0O0O0o0<LayoutDirection> o0o0o0o3 = o000.f6375OooOO0O;
                        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
                        o0O0O0o0<o00OOOOo> o0o0o0o4 = o000.f6379OooOOOO;
                        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
                        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
                        Function0<o000000.OooO00o> function2 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(o00oooo0OooO00o2);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function2);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        ?? r15 = o000000.OooO00o.C0279OooO00o.f26600OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r15);
                        ?? r2 = o000000.OooO00o.C0279OooO00o.f26598OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r2);
                        ?? r3 = o000000.OooO00o.C0279OooO00o.f26599OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r3);
                        ?? r26 = o000000.OooO00o.C0279OooO00o.f26601OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r26, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        String eventTagIcon = eventModel.getEventTagIcon();
                        composer.OooO0o0(604400049);
                        oOO00O.OooOO0 oooOO0OooO00o2 = OooOOOO.OooO00o(o0o0o0o0, composer);
                        composer.OooO0o0(604401387);
                        coil.request.OooO00o.C0072OooO00o c0072OooO00o2 = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o1));
                        c0072OooO00o2.f9928OooO0OO = eventTagIcon;
                        c0072OooO00o2.OooO0O0(true);
                        OooOo00 oooOo00OooO00o2 = Oooo0.OooO00o(c0072OooO00o2.OooO00o(), oooOO0OooO00o2, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(oooOo00OooO00o2, null, SizeKt.OooOO0(oooO00o, f2), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 432, 120);
                        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, 2), composer, 6);
                        String eventTag = eventModel.getEventTag();
                        long j = o0000O0.f41712OooO0OO;
                        o000O0O0.OooO0OO(eventTag, null, j, o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3456, 0, 65010);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.OooO0o0(1157296644);
                        boolean zOooo0oo4 = composer.Oooo0oo(oooOO0OOooO0O0);
                        Object objOooO0o7 = composer.OooO0o();
                        if (zOooo0oo4 || objOooO0o7 == oOO00O.OooO00o.f29707OooO0O0) {
                            objOooO0o7 = new EventKt.OooO(oooOO0OOooO0O0);
                            composer.Oooo00o(objOooO0o7);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO00o3 = constraintLayoutScope2.OooO00o(oooO00o, oooOO0OOooO0OO, (Function1) objOooO0o7);
                        o000000 o000000VarOooO00o2 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
                        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
                        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Ooo.OooO0O0(o00oooo0OooO00o3);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            function1 = function2;
                            composer.OooOoO0(function1);
                        } else {
                            function1 = function2;
                            composer.Oooo00O();
                        }
                        Function0<o000000.OooO00o> function4 = function1;
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r15, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r26, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        composer.OooO0o0(-492369756);
                        Object objOooO0o8 = composer.OooO0o();
                        oOO00O.OooO00o.C0323OooO00o c0323OooO00o2 = oOO00O.OooO00o.f29707OooO0O0;
                        if (objOooO0o8 == c0323OooO00o2) {
                            objOooO0o8 = o0OOO00.OooO0Oo(Boolean.valueOf(eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()));
                            composer.Oooo00o(objOooO0o8);
                        }
                        composer.Oooo0o0();
                        o0O00O o0o00o2 = (o0O00O) objOooO0o8;
                        o00Oo00.OooO0o0(Integer.valueOf(eventModel.getEventState()), new EventKt.OooOO0(eventModel, o0o00o2, null), composer);
                        o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(EventKt.OooOO0(o0o00o2) ? R.drawable.ic_explore_event_live : R.drawable.ic_event_time, composer), null, SizeKt.OooOO0(oooO00o, f2), EventKt.OooOO0(o0o00o2) ? o0000O0.f41762Ooooo0o : j, composer, 440, 0);
                        float f4 = 4;
                        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f4), composer, 6);
                        composer.OooO0o0(-780909385);
                        String strOooO00o = EventKt.OooOO0(o0o00o2) ? o00000.OooO0OO.OooO00o(R.string.Room_Event_Live_Now, composer) : p623o0oo0o0o.oo00o.f48643OooO00o.OooO0oO(eventModel.getEventStartTime());
                        composer.Oooo0o0();
                        o000O0O0.OooO0OO(strOooO00o, null, EventKt.OooOO0(o0o00o2) ? o0000O0.f41762Ooooo0o : j, o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3072, 0, 65010);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.OooO0o0(1157296644);
                        boolean zOooo0oo5 = composer.Oooo0oo(oooOO0OOooO0O0);
                        Object objOooO0o9 = composer.OooO0o();
                        if (zOooo0oo5 || objOooO0o9 == c0323OooO00o2) {
                            objOooO0o9 = new EventKt.OooOO0O(oooOO0OOooO0O0);
                            composer.Oooo00o(objOooO0o9);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO00o4 = constraintLayoutScope2.OooO00o(oooO00o, oooOO0OOooO0O1, (Function1) objOooO0o9);
                        o000000 o000000VarOooO00o3 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
                        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
                        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
                        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Ooo.OooO0O0(o00oooo0OooO00o4);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function4);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r15, composer, oooO3, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r26, composer, "composer", composer), composer, 0);
                        Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_event_time_remind, composer), null, SizeKt.OooOO0(oooO00o, f2), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f4), composer, 6);
                        eventKt$EventContent$$inlined$ConstraintLayout$2 = this;
                        o000O0O0.OooO0OO(String.valueOf(eventModel.getEventNumber()), null, j, o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3456, 0, 65010);
                        p028Oooo0o0.o0O0O0o0.OooO00o(composer);
                    }
                    Objects.requireNonNull(constraintLayoutScope);
                }
                return Unit.INSTANCE;
            }
        }), o000000Var, ooo00oOooOOo, 48, 0);
        ooo00oOooOOo.Oooo0o0();
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(eventModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull EventModel eventModel, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-811056072);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        o000O0O0.OooO0OO(eventModel.getEventName(), PaddingKt.OooO0oO(p445o0OoOo0.Oooo000.OooO00o(o00OOOO0.OooO00o.f4215Oooo, p033OoooO00.o00O0O.OooO0OO(3)), 12, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), x.OooO0O0(ooo00oOooOOo).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 2, false, 2, null, null, ooo00oOooOOo, 3072, 3120, 55280);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(eventModel, i));
    }

    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalCoilApi
    public static final void OooO0OO(@NotNull EventModel eventModel, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        oOO00O composer = ooo00o.OooOOo(-1218031997);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooO0o(oooO00o), false, false, null, new OooOOOO(eventModel), 253);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
        Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2042OooO0Oo;
        o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4199OooOOO;
        o0O0O00.o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6371OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6375OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6379OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O0);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26600OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r7);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26598OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26599OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r21 = o000000.OooO00o.C0279OooO00o.f26601OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r21, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        float f = (float) 6.5d;
        o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
        o00OOOO0 o00oooo0OooO00o = p445o0OoOo0.Oooo000.OooO00o(PaddingKt.OooO0oO(SizeKt.OooO0o(oooO00o), 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), p033OoooO00.o00O0O.OooO0OO(3));
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
        composer.OooO0o0(693286680);
        o0O0O00.o000000 o000000VarOooO00o2 = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r7, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r21, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        float f2 = 2;
        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f2), composer, 6);
        String roomImage = eventModel.getRoomImage();
        composer.OooO0o0(604400049);
        oOO00O.OooOO0 oooOO0OooO00o = p115o00O00o.OooOOOO.OooO00o(p115o00O00o.o000oOoO.f30345OooO00o, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6616OooO0O0));
        c0072OooO00o.f9928OooO0OO = roomImage;
        c0072OooO00o.OooO0O0(true);
        p115o00O00o.OooOo00 oooOo00OooO00o = p115o00O00o.Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
        composer.Oooo0o0();
        composer.Oooo0o0();
        float f3 = 8;
        Oooo0.o00.OooO00o(oooOo00OooO00o, null, SizeKt.OooOO0(p445o0OoOo0.Oooo000.OooO00o(oooO00o, p033OoooO00.o00O0O.OooO0OO(f3)), 31), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 48, 120);
        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f3), composer, 6);
        Oooo0o0.o00O000.OooO0O0 oooO0O1 = p028Oooo0o0.o00O000.f2043OooO0o;
        composer.OooO0o0(-483455358);
        o0O0O00.o000000 o000000VarOooO00o3 = oo00o.OooO00o(oooO0O1, oooO00o2, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Ooo.OooO0O0(oooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r7, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r21, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o000O0O0.OooO0OO(eventModel.getRoomName(), SizeKt.OooOOO0(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR, 1), x.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, new o0000O0.OooO0o(1), 0L, 2, false, 1, null, null, composer, 3120, 3120, 54640);
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("ID:");
        sbOooO0O0.append(eventModel.getRoomIdx());
        o000O0O0.OooO0OO(sbOooO0O0.toString(), null, x.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(11), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3072, 0, 64882);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6585OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6585OooO00o;
        o0O000 o0o001 = new o0O000(true);
        oooO00o.OooOOoo(o0o001);
        o0O0OO0.OooO00o(o0o001, composer, 0);
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.ic_event_number, composer), null, SizeKt.OooOO0(oooO00o, 12), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, 4), composer, 6);
        o000O0O0.OooO0OO(String.valueOf(eventModel.getRoomOnLineNumber()), null, x.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3072, 0, 65010);
        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f2), composer, 6);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
        OooO0Oo(composer, 0);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo00(eventModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1524013704);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4215Oooo), (float) 0.5d);
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            o0O0OO0.OooO00o(BackgroundKt.OooO0O0(o00oooo0OooO0oO, o0000O0.f41747Oooo0o, o000O0Oo.f32120OooO00o), ooo00oOooOOo, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo(i));
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(@NotNull o0O00oO0 o0o00oo1, @NotNull Function0<Unit> joinRequest, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(o0o00oo1, "<this>");
        Intrinsics.checkNotNullParameter(joinRequest, "joinRequest");
        oOO00O composer = ooo00o.OooOOo(-1671658804);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(o0o00oo1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.Oooo0oo(joinRequest) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            Context context = (Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6616OooO0O0);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
            o00OOOO0 o00oooo0OooO00o = p445o0OoOo0.Oooo000.OooO00o(o0o00oo1.OooO00o(SizeKt.OooO0oO(oooO00o, 35), true), p033OoooO00.o00O0O.OooO0OO(18));
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41762Ooooo0o, p033OoooO00.o00O0O.OooO0OO(17));
            o00O0000 o00o0000OooO00o = o0000O00.OooO00o(false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o0000O0.f41718OooOO0, composer, 384, 3);
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = Oooo0.o00Oo0.OooO00o(composer);
            }
            composer.Oooo0o0();
            p026Oooo0OO.o000 o000Var = (p026Oooo0OO.o000) objOooO0o;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(joinRequest);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new oo000o(joinRequest);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O1 = ClickableKt.OooO0O0(o00oooo0OooO0O0, o000Var, o00o0000OooO00o, (28 & 4) != 0, null, (28 & 16) != 0 ? null : null, (Function0) objOooO0o2);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
            o0O0O00.o000000 o000000VarOooO0O0 = p140o00OOOo0.o000OOo.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2043OooO0o, oooO0O0, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O1);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
            p031OoooO.o000000O.OooO00o(composer, 2058660585, -678309503, 1736657825);
            if (context instanceof FragmentActivity) {
                AndroidView_androidKt.OooO00o(new o00oO0o(context), SizeKt.OooOO0(oooO00o, 15), null, composer, 48, 4);
                o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, 8), composer, 6);
            }
            composer.Oooo0o0();
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_join, composer), null, o0000O0.f41712OooO0OO, o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3456, 0, 65522);
            p028Oooo0o0.o0O0O0o0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0ooOOo(o0o00oo1, joinRequest, i));
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnrememberedMutableState"})
    public static final void OooO0o0(@NotNull EventModel eventModel, @Nullable Function1<? super EventModel, Unit> function1, @Nullable Function1<? super EventModel, Unit> function2, @Nullable oOO00O ooo00o, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        oOO00O composer = ooo00o.OooOOo(-713729787);
        Function1<? super EventModel, Unit> function3 = (i2 & 2) != 0 ? Oooo000.f23694Oooo : function1;
        Function1<? super EventModel, Unit> function4 = (i2 & 4) != 0 ? Oooo0.f23693Oooo : function2;
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29723OooO00o;
        long creatorUserId = eventModel.getCreatorUserId();
        Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
        boolean z = value != null && creatorUserId == value.longValue();
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
        o0O0O00.o000000 o000000VarOooO00o = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, o00OO0O0.OooO00o.f4197OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5773OooO00o;
        float f = 12;
        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        composer.OooO0o0(1007233474);
        if (!z || (z && eventModel.getEventState() == 1)) {
            OooO0oo(new o000oOoO(function3, eventModel), composer, 0);
            o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        }
        composer.Oooo0o0();
        if (z && eventModel.getEventState() == 0) {
            composer.OooO0o0(1007233767);
            OooO0oO(rowScopeInstance, eventModel.getEventState(), new o0OoOo0(function3, eventModel), composer, 6);
            composer.Oooo0o0();
        } else if (eventModel.getEventState() == 1) {
            composer.OooO0o0(1007233946);
            OooO0o(rowScopeInstance, new o00O0O(eventModel), composer, 6);
            composer.Oooo0o0();
        } else if (z || eventModel.getEventState() != 0) {
            composer.OooO0o0(1007234559);
            composer.Oooo0o0();
        } else {
            composer.OooO0o0(1007234403);
            OooO(rowScopeInstance, eventModel.getHasSubscribe(), new o00Oo0(function4, eventModel), composer, 6);
            composer.Oooo0o0();
        }
        o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Ooo(eventModel, function3, function4, i, i2));
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(@NotNull o0O00oO0 o0o00oo1, int i, @NotNull Function0<Unit> shareRequest, @Nullable oOO00O ooo00o, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(o0o00oo1, "<this>");
        Intrinsics.checkNotNullParameter(shareRequest, "shareRequest");
        oOO00O composer = ooo00o.OooOOo(-493651086);
        if ((i2 & 14) == 0) {
            i3 = (composer.Oooo0oo(o0o00oo1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.OooO(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composer.Oooo0oo(shareRequest) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            long j = i == 1 ? o0000O0.f41762Ooooo0o : o0000O0.f41729OooOo0;
            long j2 = i == 1 ? o0000O0.f41763OooooO0 : o0000O0.f41731OooOo0O;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
            float f = 18;
            o00OOOO0 o00oooo0OooO0O0 = BorderKt.OooO0O0(p445o0OoOo0.Oooo000.OooO00o(o0o00oo1.OooO00o(SizeKt.OooO0oO(oooO00o, 35), true), p033OoooO00.o00O0O.OooO0OO(f)), 1, j, p033OoooO00.o00O0O.OooO0OO(f));
            o00O0000 o00o0000OooO00o = o0000O00.OooO00o(false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j2, composer, 0, 3);
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = Oooo0.o00Oo0.OooO00o(composer);
            }
            composer.Oooo0o0();
            p026Oooo0OO.o000 o000Var = (p026Oooo0OO.o000) objOooO0o;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(shareRequest);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new o0OOO0o(shareRequest);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O1 = ClickableKt.OooO0O0(o00oooo0OooO0O0, o000Var, o00o0000OooO00o, (28 & 4) != 0, null, (28 & 16) != 0 ? null : null, (Function0) objOooO0o2);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
            o0O0O00.o000000 o000000VarOooO0O0 = p140o00OOOo0.o000OOo.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2043OooO0o, oooO0O0, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O1);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
            p031OoooO.o0OOO0o.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_event_share_mine, composer), null, SizeKt.OooOO0(oooO00o, 19), j, composer, 440, 0);
            o0O0OO0.OooO00o(SizeKt.OooOO0o(oooO00o, 8), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.share, composer), null, j, o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            p028Oooo0o0.o0O0O0o0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0Oo0oo(o0o00oo1, i, shareRequest, i2));
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(@NotNull Function0<Unit> shareRequest, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(shareRequest, "shareRequest");
        oOO00O composer = ooo00o.OooOOo(-753458442);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(shareRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
            float f = 18;
            o00OOOO0 o00oooo0OooO0O0 = BorderKt.OooO0O0(p445o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(oooO00o, 35), p033OoooO00.o00O0O.OooO0OO(f)), 1, x.OooO0O0(composer).OooOO0o(), p033OoooO00.o00O0O.OooO0OO(f));
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            o00O0000 o00o0000OooO00o = o0000O00.OooO00o(false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o0000O0.f41721OooOOO, composer, 384, 3);
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = Oooo0.o00Oo0.OooO00o(composer);
            }
            composer.Oooo0o0();
            p026Oooo0OO.o000 o000Var = (p026Oooo0OO.o000) objOooO0o;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(shareRequest);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new o0OO00O(shareRequest);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O1 = ClickableKt.OooO0O0(o00oooo0OooO0O0, o000Var, o00o0000OooO00o, (28 & 4) != 0, null, (28 & 16) != 0 ? null : null, (Function0) objOooO0o2);
            o0O0O00.o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00OO0O0.OooO00o.f4192OooO0o, false, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0O1);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -2137368960, R.drawable.ic_event_share, composer), null, SizeKt.OooOO0(oooO00o, 23), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            p028Oooo0o0.o0O0O0o0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo0o0Oo(shareRequest, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean OooOO0(o0O00O o0o00o2) {
        return ((Boolean) o0o00o2.getValue()).booleanValue();
    }

    public static final void OooOO0O(@NotNull Context context, boolean z, @NotNull Function0<Unit> subscribeRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subscribeRequest, "subscribeRequest");
        if (!z) {
            subscribeRequest.invoke();
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
        oo0ooo0.OooOo0O(p255o00ooO0O.o000O0O0.OooO0OO(R.string.event_unSubscribe_content));
        oo0ooo0.OooOoOO(true);
        oo0ooo0.OooOOOo(R.string.event_unSubscribe_confirm);
        oo0ooo0.OooOo0o(new o000000(subscribeRequest));
        oo0ooo0.OooOOO0();
    }

    public static final void OooOO0o(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
        Activity activityOooO0O0 = p255o00ooO0O.o00O000.OooO0O0();
        if (activityOooO0O0 != null) {
            ShareType shareType = ShareType.Events;
            oo00oO oo00oo = new oo00oO((FragmentActivity) activityOooO0O0, shareType);
            ShareModel shareModel = new ShareModel(shareType);
            shareModel.setEvent(eventModel);
            oo00oo.f41705OooooO0 = shareModel;
            oo00oo.OooOO0();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOOO0(@NotNull o0O00O<Boolean> isShow, @NotNull Context context, @NotNull EventModel eventModel, @Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00o2;
        Intrinsics.checkNotNullParameter(isShow, "isShow");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1342497220);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOoo0().getValue(), Boolean.TRUE) && isShow.getValue().booleanValue()) {
            ooo00oOooOOo.OooO0o0(-803241390);
            if (Build.VERSION.SDK_INT >= 24) {
                o00Oo00.OooO0o0(isShow.getValue(), new o000000O(isShow, context, eventModel, null), ooo00oOooOOo);
            }
            ooo00oOooOOo.Oooo0o0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            ooo00oOooOOo.OooO0o0(-803240673);
            ooo00o2 = ooo00oOooOOo;
            o0O00O0o.OooO00o(isShow, false, false, null, null, 80, R.style.WindowAnimBottomWithAlpha, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, p043OooooO0.o00O0000.OooO00o(ooo00oOooOOo, 712646730, new o00000(isShow, i, context, eventModel)), ooo00oOooOOo, (i & 14) | 100663296, 158);
            ooo00o2.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00000O0(isShow, context, eventModel, i));
    }
}
