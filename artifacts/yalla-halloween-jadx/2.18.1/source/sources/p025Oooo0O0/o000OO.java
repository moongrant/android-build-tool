package p025Oooo0O0;

import androidx.compose.foundation.MutatePriority;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000OOo;
import p023Oooo00O.o00O00;
import p023Oooo00O.o00O00O;
import p023Oooo00O.o00O00o0;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o00OO0OO;
import p023Oooo00O.o0O0O00;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.o0ooOOo;
import p023Oooo00O.oo000o;
import p023Oooo00O.oo0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO {

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Ref.FloatRef f1539Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1540Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f1541Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1540Oooo0oO = obj;
            this.f1541Oooo0oo |= Integer.MIN_VALUE;
            return o000OO.OooO00o(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, this);
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oo000o<Float> f1542Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1543Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1544Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f1545Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f1546OoooO00;

        public static final class OooO00o extends Lambda implements Function2<Float, Float, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f1547Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o0000O f1548Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Ref.FloatRef floatRef, o0000O o0000o2) {
                super(2);
                this.f1547Oooo0o = floatRef;
                this.f1548Oooo0oO = o0000o2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Float f, Float f2) {
                float fFloatValue = f.floatValue();
                f2.floatValue();
                Ref.FloatRef floatRef = this.f1547Oooo0o;
                float f3 = floatRef.element;
                floatRef.element = this.f1548Oooo0oO.OooO00o(fFloatValue - f3) + f3;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, oo000o<Float> oo000oVar, Ref.FloatRef floatRef, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f1545Oooo0oo = f;
            this.f1542Oooo = oo000oVar;
            this.f1546OoooO00 = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f1545Oooo0oo, this.f1542Oooo, this.f1546OoooO00, continuation);
            oooO0O0.f1544Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0O0O00 o0o0o00OooO0O0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1543Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O o0000o2 = (o0000O) this.f1544Oooo0oO;
                float f = this.f1545Oooo0oo;
                oo000o<Float> oo000oVar = this.f1542Oooo;
                OooO00o oooO00o = new OooO00o(this.f1546OoooO00, o0000o2);
                this.f1543Oooo0o = 1;
                o00OO0O0<Float, o0Oo0oo> o00oo0o0OooO0O0 = oo0O.OooO0O0(FloatCompanionObject.INSTANCE);
                Object objBoxFloat = Boxing.boxFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                Float fBoxFloat = Boxing.boxFloat(f);
                Object objBoxFloat2 = Boxing.boxFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                if (objBoxFloat2 == null || (o0o0o00OooO0O0 = (o0O0O00) ((o00OO0OO) o00oo0o0OooO0O0).f1175OooO00o.invoke((T) objBoxFloat2)) == null) {
                    o0o0o00OooO0O0 = o000OOo.OooO0O0((o0O0O00) ((o00OO0OO) o00oo0o0OooO0O0).f1175OooO00o.invoke((T) objBoxFloat));
                }
                Object objOooO00o = o00O00O.OooO00o(new o0ooOOo(o00oo0o0OooO0O0, objBoxFloat, o0o0o00OooO0O0, 56), new o00O00o0(oo000oVar, o00oo0o0OooO0O0, objBoxFloat, fBoxFloat, o0o0o00OooO0O0), Long.MIN_VALUE, new o00O00(oooO00o, o00oo0o0OooO0O0), this);
                if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO00o = Unit.INSTANCE;
                }
                if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO00o = Unit.INSTANCE;
                }
                if (objOooO00o == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object OooO00o(@NotNull o000OO0O o000oo0o2, float f, @NotNull oo000o<Float> oo000oVar, @NotNull Continuation<? super Float> continuation) {
        OooO00o oooO00o;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f1541Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f1541Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f1540Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f1541Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<? super o0000O, ? super Continuation<? super Unit>, ? extends Object> oooO0O0 = new OooO0O0(f, oo000oVar, floatRef2, null);
            oooO00o.f1539Oooo0o = floatRef2;
            oooO00o.f1541Oooo0oo = 1;
            if (o000oo0o2.OooO0O0(MutatePriority.Default, oooO0O0, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO00o.f1539Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxFloat(floatRef.element);
    }
}
