package p633o0ooO00o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0000;
import p023Oooo00O.o00000OO;
import p023Oooo00O.o00O00O;
import p023Oooo00O.o00Ooo;
import p023Oooo00O.o0OOO0o;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.o0ooOOo;
import p023Oooo00O.oo000o;
import p025Oooo0O0.o000000O;
import p025Oooo0O0.o0000O;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class oO00o0 implements o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oOo000Oo f48792OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00000OO<Float> f48793OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oo000o<Float> f48794OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function3<oOo000Oo, Integer, Integer, Integer> f48795OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48796OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<oOo000Oo, Float> f48797OooO0o0;

    public static final class OooO extends Lambda implements Function1<o00Ooo<Float, o0Oo0oo>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oO00o0 f48798Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f48799Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O f48800Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f48801Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f48802OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Ref.FloatRef floatRef, o0000O o0000o2, Ref.FloatRef floatRef2, oO00o0 oo00o0, int i) {
            super(1);
            this.f48799Oooo0o = floatRef;
            this.f48800Oooo0oO = o0000o2;
            this.f48801Oooo0oo = floatRef2;
            this.f48798Oooo = oo00o0;
            this.f48802OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00Ooo<Float, o0Oo0oo> o00ooo2) {
            o00Ooo<Float, o0Oo0oo> animateTo = o00ooo2;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.OooO0O0().floatValue() - this.f48799Oooo0o.element;
            float fOooO00o = this.f48800Oooo0oO.OooO00o(fFloatValue);
            this.f48799Oooo0o.element = animateTo.OooO0O0().floatValue();
            this.f48801Oooo0oo.element = animateTo.OooO0OO().floatValue();
            oOo0000O ooo0000oOooO0o0 = this.f48798Oooo.f48792OooO00o.OooO0o0();
            if (ooo0000oOooO0o0 == null || oO00o0.OooO0O0(this.f48798Oooo, animateTo, ooo0000oOooO0o0, this.f48802OoooO00, new oOo00ooO(this.f48800Oooo0oO)) || Math.abs(fFloatValue - fOooO00o) > 0.5f) {
                animateTo.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0, 0, 0, 1}, l = {406, 416}, m = "flingToIndex", n = {"this", "$this$flingToIndex", "index", "initialVelocity", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public float f48803Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public oO00o0 f48804Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o0000O f48805Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f48806Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f48808OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f48809OoooO0O;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48808OoooO00 = obj;
            this.f48809OoooO0O |= Integer.MIN_VALUE;
            return oO00o0.this.OooO0Oo(null, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this);
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {477}, m = "performDecayFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public oO00o0 f48811Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Ref.FloatRef f48812Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f48813Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f48814OoooO00;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48813Oooo0oo = obj;
            this.f48814OoooO00 |= Integer.MIN_VALUE;
            return oO00o0.this.OooO0o0(null, null, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o00Ooo<Float, o0Oo0oo>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oO00o0 f48815Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f48816Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O f48817Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f48818Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f48819OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f48820OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.FloatRef floatRef, o0000O o0000o2, Ref.FloatRef floatRef2, oO00o0 oo00o0, boolean z, int i) {
            super(1);
            this.f48816Oooo0o = floatRef;
            this.f48817Oooo0oO = o0000o2;
            this.f48818Oooo0oo = floatRef2;
            this.f48815Oooo = oo00o0;
            this.f48820OoooO00 = z;
            this.f48819OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00Ooo<Float, o0Oo0oo> o00ooo2) {
            o00Ooo<Float, o0Oo0oo> animateDecay = o00ooo2;
            Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.OooO0O0().floatValue() - this.f48816Oooo0o.element;
            float fOooO00o = this.f48817Oooo0oO.OooO00o(fFloatValue);
            this.f48816Oooo0o.element = animateDecay.OooO0O0().floatValue();
            this.f48818Oooo0oo.element = animateDecay.OooO0OO().floatValue();
            if (Math.abs(fFloatValue - fOooO00o) > 0.5f) {
                animateDecay.OooO00o();
            }
            oOo0000O ooo0000oOooO0o0 = this.f48815Oooo.f48792OooO00o.OooO0o0();
            if (ooo0000oOooO0o0 == null) {
                animateDecay.OooO00o();
            } else {
                if (animateDecay.OooO0Oo() && this.f48820OoooO00) {
                    if (animateDecay.OooO0OO().floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ooo0000oOooO0o0.OooO00o() == this.f48819OoooO0 - 1) {
                        animateDecay.OooO00o();
                    } else if (animateDecay.OooO0OO().floatValue() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ooo0000oOooO0o0.OooO00o() == this.f48819OoooO0) {
                        animateDecay.OooO00o();
                    }
                }
                if (animateDecay.OooO0Oo() && oO00o0.OooO0O0(this.f48815Oooo, animateDecay, ooo0000oOooO0o0, this.f48819OoooO0, new oOo00o0o(this.f48817Oooo0oO))) {
                    animateDecay.OooO00o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {551}, m = "performSpringFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public oO00o0 f48822Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Ref.FloatRef f48823Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f48824Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f48825OoooO00;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48824Oooo0oo = obj;
            this.f48825OoooO00 |= Integer.MIN_VALUE;
            return oO00o0.this.OooO0o(null, null, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this);
        }
    }

    public oO00o0(@NotNull oOo000Oo layoutInfo, @NotNull o00000OO decayAnimationSpec, @NotNull oo000o springAnimationSpec) {
        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex = o0O0O0O.OooO0O0.f35331OooO0O0;
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        oO0OO00o oo0oo00o = oO0OO00o.f48837OooO00o;
        Function1<oOo000Oo, Float> function1 = oO0OO00o.f48839OooO0OO;
        this.f48792OooO00o = layoutInfo;
        this.f48793OooO0O0 = decayAnimationSpec;
        this.f48794OooO0OO = springAnimationSpec;
        this.f48795OooO0Oo = snapIndex;
        this.f48797OooO0o0 = function1;
        this.f48796OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
    }

    public static final boolean OooO0O0(oO00o0 oo00o0, o00Ooo o00ooo2, oOo0000O ooo0000o, int i, Function1 function1) {
        int iOooO0Oo;
        Objects.requireNonNull(oo00o0);
        float fFloatValue = ((Number) o00ooo2.OooO0OO()).floatValue();
        if (fFloatValue <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || ooo0000o.OooO00o() < i) {
            iOooO0Oo = (fFloatValue >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || ooo0000o.OooO00o() > i + (-1)) ? 0 : oo00o0.f48792OooO00o.OooO0Oo(ooo0000o.OooO00o() + 1);
        } else {
            iOooO0Oo = oo00o0.f48792OooO00o.OooO0Oo(ooo0000o.OooO00o());
        }
        if (iOooO0Oo == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iOooO0Oo));
        return true;
    }

    @Override // p025Oooo0O0.o000000O
    @Nullable
    public final Object OooO00o(@NotNull o0000O o0000o2, float f, @NotNull Continuation<? super Float> continuation) {
        if (!this.f48792OooO00o.OooO0O0() || !this.f48792OooO00o.OooO00o()) {
            return Boxing.boxFloat(f);
        }
        float fFloatValue = this.f48797OooO0o0.invoke(this.f48792OooO00o).floatValue();
        boolean z = false;
        if (!(fFloatValue > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        oOo0000O ooo0000oOooO0o0 = this.f48792OooO00o.OooO0o0();
        if (ooo0000oOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        int iIntValue = this.f48795OooO0Oo.invoke(this.f48792OooO00o, Boxing.boxInt(f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? ooo0000oOooO0o0.OooO00o() + 1 : ooo0000oOooO0o0.OooO00o()), Boxing.boxInt(this.f48792OooO00o.OooO0OO(f, this.f48793OooO0O0, fFloatValue))).intValue();
        if (iIntValue >= 0 && iIntValue < this.f48792OooO00o.OooO0oo()) {
            z = true;
        }
        if (z) {
            return OooO0Oo(o0000o2, iIntValue, f, continuation);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final float OooO0OO(float f) {
        if (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || this.f48792OooO00o.OooO0O0()) {
            return (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || this.f48792OooO00o.OooO00o()) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0Oo(o0000O o0000o2, int i, float f, Continuation<? super Float> continuation) throws Throwable {
        OooO00o oooO00o;
        o0000O o0000o3;
        int i2;
        float fFloatValue;
        oO00o0 oo00o0;
        oO00o0 oo00o1;
        oOo0000O ooo0000oOooO0o0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i3 = oooO00o.f48809OoooO0O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO00o.f48809OoooO0O = i3 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0o0 = oooO00o.f48808OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO00o.f48809OoooO0O;
        if (i4 != 0) {
            if (i4 == 1) {
                float f2 = oooO00o.f48803Oooo;
                i = oooO00o.f48806Oooo0oo;
                o0000O o0000o4 = oooO00o.f48805Oooo0oO;
                oo00o1 = oooO00o.f48804Oooo0o;
                ResultKt.throwOnFailure(objOooO0o0);
                f = f2;
                o0000o2 = o0000o4;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oo00o0 = oooO00o.f48804Oooo0o;
                ResultKt.throwOnFailure(objOooO0o0);
            }
            fFloatValue = ((Number) objOooO0o0).floatValue();
            return Boxing.boxFloat(oo00o0.OooO0OO(fFloatValue));
        }
        ResultKt.throwOnFailure(objOooO0o0);
        oOo0000O ooo0000oOooO0o1 = this.f48792OooO00o.OooO0o0();
        if (ooo0000oOooO0o1 == null) {
            return Boxing.boxFloat(f);
        }
        if (ooo0000oOooO0o1.OooO00o() == i && this.f48792OooO00o.OooO0Oo(ooo0000oOooO0o1.OooO00o()) == 0) {
            return Boxing.boxFloat(OooO0OO(f));
        }
        o00000OO<Float> o00000oo2 = this.f48793OooO0O0;
        boolean z = false;
        if (Math.abs(f) >= 0.5f) {
            float fOooO00o = o0000.OooO00o(o00000oo2, f);
            if (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? fOooO00o >= this.f48792OooO00o.OooO0Oo(ooo0000oOooO0o1.OooO00o() + 1) : fOooO00o <= this.f48792OooO00o.OooO0Oo(ooo0000oOooO0o1.OooO00o())) {
                z = true;
            }
        }
        if (z) {
            oooO00o.f48804Oooo0o = this;
            oooO00o.f48805Oooo0oO = o0000o2;
            oooO00o.f48806Oooo0oo = i;
            oooO00o.f48803Oooo = f;
            oooO00o.f48809OoooO0O = 1;
            objOooO0o0 = OooO0o0(o0000o2, ooo0000oOooO0o1, i, f, true, oooO00o);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            oo00o1 = this;
        } else {
            o0000o3 = o0000o2;
            i2 = i;
            fFloatValue = f;
            oo00o0 = this;
        }
        ooo0000oOooO0o0 = oo00o0.f48792OooO00o.OooO0o0();
        if (ooo0000oOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        if (ooo0000oOooO0o0.OooO00o() == i2 || oo00o0.f48792OooO00o.OooO0Oo(i2) != 0) {
            oooO00o.f48804Oooo0o = oo00o0;
            oooO00o.f48805Oooo0oO = null;
            oooO00o.f48809OoooO0O = 2;
            objOooO0o0 = oo00o0.OooO0o(o0000o3, ooo0000oOooO0o0, i2, fFloatValue, oooO00o);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            fFloatValue = ((Number) objOooO0o0).floatValue();
        }
        return Boxing.boxFloat(oo00o0.OooO0OO(fFloatValue));
        o0000o3 = o0000o2;
        i2 = i;
        fFloatValue = ((Number) objOooO0o0).floatValue();
        oo00o0 = oo00o1;
        ooo0000oOooO0o0 = oo00o0.f48792OooO00o.OooO0o0();
        if (ooo0000oOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        if (ooo0000oOooO0o0.OooO00o() == i2) {
        }
        oooO00o.f48804Oooo0o = oo00o0;
        oooO00o.f48805Oooo0oO = null;
        oooO00o.f48809OoooO0O = 2;
        objOooO0o0 = oo00o0.OooO0o(o0000o3, ooo0000oOooO0o0, i2, fFloatValue, oooO00o);
        if (objOooO0o0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        fFloatValue = ((Number) objOooO0o0).floatValue();
        return Boxing.boxFloat(oo00o0.OooO0OO(fFloatValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object OooO0o(o0000O o0000o2, oOo0000O ooo0000o, int i, float f, Continuation<? super Float> continuation) throws Throwable {
        OooO0o oooO0o;
        Integer num;
        oO00o0 oo00o0;
        Ref.FloatRef floatRef;
        oO00o0 oo00o1;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i2 = oooO0o.f48825OoooO00;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0o.f48825OoooO00 = i2 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        OooO0o oooO0o2 = oooO0o;
        Object obj = oooO0o2.f48824Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0o2.f48825OoooO00;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO0o2.f48823Oooo0oO;
            oO00o0 oo00o2 = oooO0o2.f48822Oooo0o;
            try {
                ResultKt.throwOnFailure(obj);
                oo00o1 = oo00o2;
                num = null;
                oo00o1.OooO0oO(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th) {
                th = th;
                oo00o0 = oo00o2;
                num = null;
                oo00o0.OooO0oO(num);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        int iOooO00o = ooo0000o.OooO00o();
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if ((i > iOooO00o && f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) || (i <= ooo0000o.OooO00o() && f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            f2 = f;
        }
        floatRef2.element = f2;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        try {
            OooO0oO(Boxing.boxInt(i));
            o0ooOOo o0oooooOooO00o = o0OOO0o.OooO00o(floatRef3.element, floatRef2.element, 28);
            Float fBoxFloat = Boxing.boxFloat(this.f48792OooO00o.OooO0Oo(i));
            oo000o<Float> oo000oVar = this.f48794OooO0OO;
            OooO oooO = new OooO(floatRef3, o0000o2, floatRef2, this, i);
            oooO0o2.f48822Oooo0o = this;
            oooO0o2.f48823Oooo0oO = floatRef2;
            oooO0o2.f48825OoooO00 = 1;
            num = null;
            try {
                if (o00O00O.OooO0OO(o0oooooOooO00o, fBoxFloat, oo000oVar, false, oooO, oooO0o2, 4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef = floatRef2;
                oo00o1 = this;
                oo00o1.OooO0oO(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th2) {
                th = th2;
                oo00o0 = this;
                oo00o0.OooO0oO(num);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object OooO0o0(o0000O o0000o2, oOo0000O ooo0000o, int i, float f, boolean z, Continuation<? super Float> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        oO00o0 oo00o0;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f48814OoooO00;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f48814OoooO00 = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object obj = oooO0O1.f48813Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O1.f48814OoooO00;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO0O1.f48812Oooo0oO;
            oo00o0 = oooO0O1.f48811Oooo0o;
            try {
                ResultKt.throwOnFailure(obj);
                oo00o0.OooO0oO(null);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th) {
                th = th;
                oo00o0.OooO0oO(null);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (ooo0000o.OooO00o() == i && this.f48792OooO00o.OooO0Oo(ooo0000o.OooO00o()) == 0) {
            return Boxing.boxFloat(OooO0OO(f));
        }
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = f;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        boolean z2 = z && Math.abs(i - ooo0000o.OooO00o()) >= 2;
        try {
            OooO0oO(Boxing.boxInt(i));
            o0ooOOo o0oooooOooO00o = o0OOO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 28);
            o00000OO<Float> o00000oo2 = this.f48793OooO0O0;
            OooO0OO oooO0OO = new OooO0OO(floatRef3, o0000o2, floatRef2, this, z2, i);
            oooO0O1.f48811Oooo0o = this;
            oooO0O1.f48812Oooo0oO = floatRef2;
            oooO0O1.f48814OoooO00 = 1;
            if (o00O00O.OooO0O0(o0oooooOooO00o, o00000oo2, oooO0OO, oooO0O1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oo00o0 = this;
            floatRef = floatRef2;
            oo00o0.OooO0oO(null);
            return Boxing.boxFloat(floatRef.element);
        } catch (Throwable th2) {
            th = th2;
            oo00o0 = this;
            oo00o0.OooO0oO(null);
            throw th;
        }
    }

    public final void OooO0oO(Integer num) {
        this.f48796OooO0o.setValue(num);
    }
}
