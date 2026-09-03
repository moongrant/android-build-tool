package p508o0o00oOo;

import Oooo000.o00oO0o;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import com.app.base.model.RoomModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomState;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooOo;
import o0000O0O.Oooo000;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000O00;
import p023Oooo00O.o000oOoO;
import p023Oooo00O.o0Oo0oo;
import p028Oooo0o0.o00OO000;
import p028Oooo0o0.oo0ooO;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
import p033OoooO00.o00O0O;
import p033OoooO00.o0OoOo0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p114o00O00o.OooOOOO;
import p114o00O00o.OooOo00;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OO;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0o;
import p254o00ooO0O.o000OO00;
import p261o00ooOoO.u;
import p418o0Oo0oo.o00000;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O0O0O;
import p512o0o00ooo.o00O00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Oooo0<Float, o0Oo0oo> f41827OooO00o = o000oOoO.OooO0o0(o000OO00.OooO00o(268));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ParcelableSnapshotMutableState f41828OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(o000OO00.OooO00o(468)));

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f41829Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager.INSTANCE.closeRoom();
            o00O00O.f42033OooO00o.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0000O0O.OooO, OooOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f41830Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooOo invoke(o0000O0O.OooO oooO) {
            o0000O0O.OooO offset = oooO;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return new OooOo(Oooo000.OooO00o(MathKt.roundToInt(o000O000.f41827OooO00o.OooO0o().floatValue()), MathKt.roundToInt(o000O000.OooO0Oo())));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f41831Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.ui.view.RoomHookFloatingWindowKt$RoomHookFloatingWindow$3$1", f = "RoomHookFloatingWindow.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f41832Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f41833Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f41834Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f41835Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ float f41836OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Float, o0Oo0oo> f41837OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f41838OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ float f41839OoooO0O;

        public static final class OooO00o extends Lambda implements Function1<o00O0O.OooO, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Oooo0<Float, o0Oo0oo> f41840Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f41841Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f41842Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f41843Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(CoroutineScope coroutineScope, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3, Oooo0<Float, o0Oo0oo> oooo0) {
                super(1);
                this.f41841Oooo0o = coroutineScope;
                this.f41842Oooo0oO = o0o00oo2;
                this.f41843Oooo0oo = o0o00oo3;
                this.f41840Oooo = oooo0;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o00O0O.OooO oooO) {
                long j = oooO.f30395OooO00o;
                o000O000.OooO0O0(this.f41842Oooo0oO, false);
                o000O000.OooO0OO(this.f41843Oooo0oo, false);
                BuildersKt__Builders_commonKt.launch$default(this.f41841Oooo0o, null, null, new o000O0o(this.f41840Oooo, null), 3, null);
                o00O00O.f42033OooO00o.OooO0O0();
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f41844Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f41845Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Oooo0<Float, o0Oo0oo> f41846Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f41847Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(CoroutineScope coroutineScope, Oooo0<Float, o0Oo0oo> oooo0, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3) {
                super(0);
                this.f41845Oooo0o = coroutineScope;
                this.f41846Oooo0oO = oooo0;
                this.f41847Oooo0oo = o0o00oo2;
                this.f41844Oooo = o0o00oo3;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                BuildersKt__Builders_commonKt.launch$default(this.f41845Oooo0o, null, null, new o000Oo0(this.f41846Oooo0oO, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(this.f41845Oooo0o, null, null, new o000O00(o000O000.f41827OooO00o.OooO0o().floatValue() > ((float) o000OO00.OooO00o((float) 124)) ? o000OO00.OooO00o(264) : -o000OO00.OooO00o(16), this.f41847Oooo0oo, this.f41844Oooo, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0o00oOo.o000O000$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public static final class C0398OooO0OO extends Lambda implements Function2<p418o0Oo0oo.o0Oo0oo, o00O0O.OooO, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ float f41848Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ float f41849Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f41850Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0398OooO0OO(float f, float f2, CoroutineScope coroutineScope) {
                super(2);
                this.f41848Oooo0o = f;
                this.f41849Oooo0oO = f2;
                this.f41850Oooo0oo = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(p418o0Oo0oo.o0Oo0oo o0oo0oo2, o00O0O.OooO oooO) {
                long j = oooO.f30395OooO00o;
                Intrinsics.checkNotNullParameter(o0oo0oo2, "<anonymous parameter 0>");
                float fFloatValue = oo000o.OooO0o0() ? o000O000.f41827OooO00o.OooO0o().floatValue() - o00O0O.OooO.OooO0OO(j) : o000O000.f41827OooO00o.OooO0o().floatValue() + o00O0O.OooO.OooO0OO(j);
                o000O000.f41828OooO0O0.setValue(Float.valueOf(RangesKt.coerceIn(o00O0O.OooO.OooO0Oo(j) + o000O000.OooO0Oo(), o000OO00.OooO00o(this.f41848Oooo0o) + o000OO00.OooO00o(50), (o000OO00.OooO00o(this.f41848Oooo0o) + this.f41849Oooo0oO) - o000OO00.OooO00o(80))));
                BuildersKt__Builders_commonKt.launch$default(this.f41850Oooo0oo, null, null, new o000O00O(fFloatValue, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(CoroutineScope coroutineScope, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3, Oooo0<Float, o0Oo0oo> oooo0, float f, float f2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f41835Oooo0oo = coroutineScope;
            this.f41832Oooo = o0o00oo2;
            this.f41838OoooO00 = o0o00oo3;
            this.f41837OoooO0 = oooo0;
            this.f41839OoooO0O = f;
            this.f41836OoooO = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f41835Oooo0oo, this.f41832Oooo, this.f41838OoooO00, this.f41837OoooO0, this.f41839OoooO0O, this.f41836OoooO, continuation);
            oooO0OO.f41834Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f41833Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00000 o00000Var = (o00000) this.f41834Oooo0oO;
                OooO00o oooO00o = new OooO00o(this.f41835Oooo0oo, this.f41832Oooo, this.f41838OoooO00, this.f41837OoooO0);
                OooO0O0 oooO0O0 = new OooO0O0(this.f41835Oooo0oo, this.f41837OoooO0, this.f41838OoooO00, this.f41832Oooo);
                C0398OooO0OO c0398OooO0OO = new C0398OooO0OO(this.f41839OoooO0O, this.f41836OoooO, this.f41835Oooo0oo);
                this.f41833Oooo0o = 1;
                if (p025Oooo0O0.OooOo.OooO0o(o00000Var, oooO00o, oooO0O0, p025Oooo0O0.o000oOoO.f1652Oooo0o, c0398OooO0OO, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f41851Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomModel roomModel = new RoomModel();
            Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
            if (value != null) {
                roomModel.setId(value.longValue());
                RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, roomModel, (EnterRoomParentPage) null, 2, (Object) null);
                o00O00O.f42033OooO00o.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f41852Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager.INSTANCE.closeRoom();
            o00O00O.f42033OooO00o.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f41853Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f41853Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o000O000.OooO00o(ooo00o, this.f41853Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v38, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        o00OOOO0.OooO00o oooO00o;
        oOO00O composer = ooo00o.OooOOo(1232856453);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OO00O.OooO00o oooO00o2 = o00OO00O.f43313OooooOo;
            oO0Oo oo0ooOooO0O0 = p044OooooOO.o00O00O.OooO0O0(oooO00o2.OooO00o().f43317OooO0O0, composer);
            oO0Oo oo0ooOooO0O1 = p044OooooOO.o00O00O.OooO0O0(oooO00o2.OooO00o().f43316OooO00o, composer);
            if (RoomStateManager.INSTANCE.getRoomState() == RoomState.Hook) {
                String str = (String) oo0ooOooO0O0.getValue();
                if (!(str == null || StringsKt.isBlank(str))) {
                    String str2 = (String) oo0ooOooO0O1.getValue();
                    if (!(str2 == null || StringsKt.isBlank(str2))) {
                        float fOooO00o = ((o00OO000) p028Oooo0o0.o0OO000o.OooO00o(oo0ooO.OooO00o(composer), composer)).OooO00o();
                        float fOooO00o2 = o000OO00.OooO00o(((Configuration) composer.OooOO0o(o0O0O00.f6590OooO00o)).screenHeightDp);
                        Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
                        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0O0 == c0323OooO00o) {
                            objOooO0O0 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
                        }
                        composer.Oooo0o0();
                        CoroutineScope coroutineScope = ((o00OO0OO) objOooO0O0).f29498Oooo0o;
                        composer.Oooo0o0();
                        composer.OooO0o0(-492369756);
                        Object objOooO0o = composer.OooO0o();
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.valueOf(f41827OooO00o.OooO0o().floatValue() > 124.0f));
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
                        composer.OooO0o0(-492369756);
                        Object objOooO0o2 = composer.OooO0o();
                        if (objOooO0o2 == c0323OooO00o) {
                            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.valueOf(f41827OooO00o.OooO0o().floatValue() <= 124.0f));
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
                        composer.OooO0o0(-492369756);
                        Object objOooO0o3 = composer.OooO0o();
                        if (objOooO0o3 == c0323OooO00o) {
                            objOooO0o3 = o000oOoO.OooO0o0(112.0f);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Oooo0 oooo0 = (Oooo0) objOooO0o3;
                        p048OoooooO.o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4175OooO0o;
                        o00OOOO0.OooO00o oooO00o3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(WindowInsetsPadding_androidKt.OooO0O0(oooO00o3), OooO00o.f41830Oooo0o), 112, 80), false, false, null, OooO0O0.f41831Oooo0o, 253);
                        o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
                        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
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
                        ?? r0 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r0);
                        ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r2);
                        ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r3);
                        ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
                        float f = 12;
                        o0OoOo0 o0oooo0OooO0OO = o00O0O.OooO0OO(f);
                        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                        long j = o0000O0.f41706OooOOo;
                        p028Oooo0o0.oOO00O.OooO00o(BorderKt.OooO0O0(BackgroundKt.OooO0O0(SizeKt.OooOO0o(p168o00Ooo0.OooOo.OooO0oO(SizeKt.OooO0Oo(boxScopeInstance.OooO00o(oooO00o3, o00oo0oo)), 10, o0oooo0OooO0OO, j, j, 4), ((Number) oooo0.OooO0o()).floatValue()), o0000O0.f41711OooOo00, o00O0O.OooO0OO(f)), 1, o0000O0.f41693OooO0OO, o00O0O.OooO0OO(f)), composer, 0);
                        float f2 = 8;
                        o00OOOO0 o00oooo0OooO0O1 = o000O0o.OooO0O0(SuspendingPointerInputFilterKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(PaddingKt.OooO0oO(boxScopeInstance.OooO00o(oooO00o3, o00oo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, 1), 64), o00O0O.OooO0OO(f2)), Unit.INSTANCE, new OooO0OO(coroutineScope, o0o00oo2, o0o00oo3, oooo0, fOooO00o, fOooO00o2, null)), false, false, null, OooO0o.f41851Oooo0o, 253);
                        composer.OooO0o0(733328855);
                        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0O1);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r0, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        String str3 = (String) oo0ooOooO0O1.getValue();
                        composer.OooO0o0(604400049);
                        oOO00O.OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, composer);
                        composer.OooO0o0(604401387);
                        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0));
                        c0072OooO00o.f9912OooO0OO = str3;
                        c0072OooO00o.OooO0O0(true);
                        OooOo00 oooOo00OooO00o = p114o00O00o.Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(oooOo00OooO00o, null, BackgroundKt.OooO0O0(SizeKt.OooO0o0(oooO00o3), o0000O0.f41784o0000oo, o000O0Oo.f32099OooO00o), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 48, 120);
                        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o3), 24);
                        p048OoooooO.o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4170OooO;
                        o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(boxScopeInstance.OooO00o(o00oooo0OooO0oO, o00oo0oo2), o00O0O.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, f2, 3));
                        List colors = CollectionsKt.listOf((Object[]) new o00000O0[]{new o00000O0(o0000O0.f41692OooO0O0), new o00000O0(o0000O0.f41704OooOOOO)});
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        long jOooO00o2 = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.POSITIVE_INFINITY);
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO00o(o00oooo0OooO00o, new o000OO(colors, jOooO00o, jOooO00o2, 0), null, 6), composer, 0);
                        float f3 = 15;
                        o0O0O0O.OooO00o("svga/anim_room_hook_live.svga", true, 0, null, boxScopeInstance.OooO00o(SizeKt.OooO0oO(SizeKt.OooOO0O(PaddingKt.OooO(oooO00o3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, 7), 45, f3), 50), o00oo0oo2), composer, 54, 12);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.OooO0o0(1589882728);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            oooO00o = oooO00o3;
                            o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icv_close, composer), null, o000O0o.OooO0O0(SizeKt.OooOO0(PaddingKt.OooO(boxScopeInstance.OooO00o(oooO00o, o00OO0O0.OooO00o.f4176OooO0o0), 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), f3), false, false, null, OooO.f41829Oooo0o, 253), u.OooO0O0(composer).OooO0oO(), composer, 56, 0);
                        } else {
                            oooO00o = oooO00o3;
                        }
                        composer.Oooo0o0();
                        composer.OooO0o0(-438763207);
                        if (((Boolean) o0o00oo3.getValue()).booleanValue()) {
                            o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icv_close, composer), null, o000O0o.OooO0O0(SizeKt.OooOO0(PaddingKt.OooO(boxScopeInstance.OooO00o(oooO00o, o00OO0O0.OooO00o.f4177OooO0oO), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), f3), false, false, null, OooOO0.f41852Oooo0o, 253), u.OooO0O0(composer).OooO0oO(), composer, 56, 0);
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00O00O.f42033OooO00o.OooO00o(OooO0Oo(), composer, 48);
                    }
                }
            }
        }
        p100o000oOoO.oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(i));
    }

    public static final void OooO0O0(o0O00OO o0o00oo2, boolean z) {
        o0o00oo2.setValue(Boolean.valueOf(z));
    }

    public static final void OooO0OO(o0O00OO o0o00oo2, boolean z) {
        o0o00oo2.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float OooO0Oo() {
        return ((Number) f41828OooO0O0.getValue()).floatValue();
    }
}
