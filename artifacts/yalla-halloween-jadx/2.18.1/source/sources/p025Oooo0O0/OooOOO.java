package p025Oooo0O0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00000OO;
import p023Oooo00O.o00O00O;
import p023Oooo00O.o00Ooo;
import p023Oooo00O.o0OOO0o;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000OO<Float> f1367OooO00o;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", i = {0}, l = {496}, m = "performFling", n = {"velocityLeft"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f1368Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Ref.FloatRef f1369Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1370Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1370Oooo0oO = obj;
            this.f1368Oooo |= Integer.MIN_VALUE;
            return OooOOO.this.OooO00o(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o00Ooo<Float, o0Oo0oo>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f1372Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O f1373Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f1374Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.FloatRef floatRef, o0000O o0000o2, Ref.FloatRef floatRef2) {
            super(1);
            this.f1372Oooo0o = floatRef;
            this.f1373Oooo0oO = o0000o2;
            this.f1374Oooo0oo = floatRef2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00Ooo<Float, o0Oo0oo> o00ooo2) {
            o00Ooo<Float, o0Oo0oo> animateDecay = o00ooo2;
            Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.OooO0O0().floatValue() - this.f1372Oooo0o.element;
            float fOooO00o = this.f1373Oooo0oO.OooO00o(fFloatValue);
            this.f1372Oooo0o.element = animateDecay.OooO0O0().floatValue();
            this.f1374Oooo0oo.element = animateDecay.OooO0OO().floatValue();
            if (Math.abs(fFloatValue - fOooO00o) > 0.5f) {
                animateDecay.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public OooOOO(@NotNull o00000OO<Float> flingDecay) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        this.f1367OooO00o = flingDecay;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p025Oooo0O0.o000000O
    @Nullable
    public final Object OooO00o(@NotNull o0000O o0000o2, float f, @NotNull Continuation<? super Float> continuation) {
        OooO00o oooO00o;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f1368Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f1368Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f1370Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f1368Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Math.abs(f) > 1.0f) {
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = f;
                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                o0ooOOo o0oooooOooO00o = o0OOO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 28);
                o00000OO<Float> o00000oo2 = this.f1367OooO00o;
                OooO0O0 oooO0O0 = new OooO0O0(floatRef3, o0000o2, floatRef2);
                oooO00o.f1369Oooo0o = floatRef2;
                oooO00o.f1368Oooo = 1;
                if (o00O00O.OooO0O0(o0oooooOooO00o, o00000oo2, oooO0O0, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef = floatRef2;
            }
            return Boxing.boxFloat(f);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        floatRef = oooO00o.f1369Oooo0o;
        ResultKt.throwOnFailure(obj);
        f = floatRef.element;
        return Boxing.boxFloat(f);
    }
}
