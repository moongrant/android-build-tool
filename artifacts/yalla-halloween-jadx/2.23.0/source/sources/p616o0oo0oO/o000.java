package p616o0oo0oO;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
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
import p184o00o00o.OooOOO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class o000 implements FlingBehavior {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O00 f57063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final DecayAnimationSpec<Float> f57064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<Float> f57065OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function3<o000O00, Integer, Integer, Integer> f57066OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f57067OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<o000O00, Float> f57068OooO0o0;

    public static final class OooO extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57069OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57070OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f57071OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o000 f57072OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f57073OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, o000 o000Var, int i) {
            super(1);
            this.f57069OooO0Oo = floatRef;
            this.f57071OooO0o0 = scrollScope;
            this.f57070OooO0o = floatRef2;
            this.f57072OooO0oO = o000Var;
            this.f57073OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.getValue().floatValue();
            Ref.FloatRef floatRef = this.f57069OooO0Oo;
            float f = fFloatValue - floatRef.element;
            ScrollScope scrollScope = this.f57071OooO0o0;
            float fScrollBy = scrollScope.scrollBy(f);
            floatRef.element = animateTo.getValue().floatValue();
            this.f57070OooO0o.element = animateTo.getVelocity().floatValue();
            o000 o000Var = this.f57072OooO0oO;
            o000O00O o000o00oOooO0o0 = o000Var.f57063OooO00o.OooO0o0();
            if (o000o00oOooO0o0 == null) {
                animateTo.cancelAnimation();
            } else {
                if (o000.OooO00o(o000Var, animateTo, o000o00oOooO0o0, this.f57073OooO0oo, new o000O0o(scrollScope)) || Math.abs(f - fScrollBy) > 0.5f) {
                    animateTo.cancelAnimation();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0, 0, 0, 1}, l = {406, 416}, m = "flingToIndex", n = {"this", "$this$flingToIndex", "index", "initialVelocity", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000 f57075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f57076OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ScrollScope f57077OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f57078OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f57079OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f57080OooOO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57079OooO0oo = obj;
            this.f57080OooOO0 |= Integer.MIN_VALUE;
            return o000.this.OooO0OO(null, 0, 0.0f, this);
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {477}, m = "performDecayFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000 f57081OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f57082OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Ref.FloatRef f57083OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f57085OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57082OooO0o = obj;
            this.f57085OooO0oo |= Integer.MIN_VALUE;
            return o000.this.OooO0Oo(null, null, 0, 0.0f, false, this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f57086OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57087OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57088OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f57089OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o000 f57090OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f57091OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, o000 o000Var, boolean z, int i) {
            super(1);
            this.f57087OooO0Oo = floatRef;
            this.f57089OooO0o0 = scrollScope;
            this.f57088OooO0o = floatRef2;
            this.f57090OooO0oO = o000Var;
            this.f57091OooO0oo = z;
            this.f57086OooO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animateDecay = animationScope;
            Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.getValue().floatValue();
            Ref.FloatRef floatRef = this.f57087OooO0Oo;
            float f = fFloatValue - floatRef.element;
            ScrollScope scrollScope = this.f57089OooO0o0;
            float fScrollBy = scrollScope.scrollBy(f);
            floatRef.element = animateDecay.getValue().floatValue();
            this.f57088OooO0o.element = animateDecay.getVelocity().floatValue();
            if (Math.abs(f - fScrollBy) > 0.5f) {
                animateDecay.cancelAnimation();
            }
            o000 o000Var = this.f57090OooO0oO;
            o000O00O o000o00oOooO0o0 = o000Var.f57063OooO00o.OooO0o0();
            if (o000o00oOooO0o0 == null) {
                animateDecay.cancelAnimation();
            } else {
                boolean zIsRunning = animateDecay.isRunning();
                int i = this.f57086OooO;
                if (zIsRunning && this.f57091OooO0oo) {
                    if (animateDecay.getVelocity().floatValue() > 0.0f && o000o00oOooO0o0.OooO00o() == i - 1) {
                        animateDecay.cancelAnimation();
                    } else if (animateDecay.getVelocity().floatValue() < 0.0f && o000o00oOooO0o0.OooO00o() == i) {
                        animateDecay.cancelAnimation();
                    }
                }
                if (animateDecay.isRunning() && o000.OooO00o(o000Var, animateDecay, o000o00oOooO0o0, i, new o000O000(scrollScope))) {
                    animateDecay.cancelAnimation();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {551}, m = "performSpringFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000 f57092OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f57093OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Ref.FloatRef f57094OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f57096OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57093OooO0o = obj;
            this.f57096OooO0oo |= Integer.MIN_VALUE;
            return o000.this.OooO0o0(null, null, 0, 0.0f, this);
        }
    }

    public o000() {
        throw null;
    }

    public o000(@NotNull o000OO layoutInfo, @NotNull DecayAnimationSpec decayAnimationSpec, @NotNull AnimationSpec springAnimationSpec) {
        OooOOO.OooO00o snapIndex = OooOOO.f38604OooO00o;
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        o000Oo0.OooO00o oooO00o = o000Oo0.f57108OooO0O0;
        this.f57063OooO00o = layoutInfo;
        this.f57064OooO0O0 = decayAnimationSpec;
        this.f57065OooO0OO = springAnimationSpec;
        this.f57066OooO0Oo = snapIndex;
        this.f57068OooO0o0 = oooO00o;
        this.f57067OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final boolean OooO00o(o000 o000Var, AnimationScope animationScope, o000O00O o000o00o2, int i, Function1 function1) {
        int iOooO0Oo;
        o000Var.getClass();
        float fFloatValue = ((Number) animationScope.getVelocity()).floatValue();
        o000O00 o000o01 = o000Var.f57063OooO00o;
        if (fFloatValue <= 0.0f || o000o00o2.OooO00o() < i) {
            iOooO0Oo = (fFloatValue >= 0.0f || o000o00o2.OooO00o() > i + (-1)) ? 0 : o000o01.OooO0Oo(o000o00o2.OooO00o() + 1);
        } else {
            iOooO0Oo = o000o01.OooO0Oo(o000o00o2.OooO00o());
        }
        if (iOooO0Oo == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iOooO0Oo));
        return true;
    }

    public final float OooO0O0(float f) {
        o000O00 o000o01 = this.f57063OooO00o;
        if (f < 0.0f && !o000o01.OooO0O0()) {
            return f;
        }
        if (f <= 0.0f || o000o01.OooO00o()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0OO(ScrollScope scrollScope, int i, float f, Continuation<? super Float> continuation) throws Throwable {
        OooO00o oooO00o;
        boolean z;
        ScrollScope scrollScope2;
        int i2;
        float fFloatValue;
        o000 o000Var;
        o000 o000Var2;
        o000O00O o000o00oOooO0o0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i3 = oooO00o.f57080OooOO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO00o.f57080OooOO0 = i3 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f57079OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO00o.f57080OooOO0;
        if (i4 != 0) {
            if (i4 == 1) {
                float f2 = oooO00o.f57078OooO0oO;
                i = oooO00o.f57076OooO0o;
                ScrollScope scrollScope3 = oooO00o.f57077OooO0o0;
                o000Var2 = oooO00o.f57075OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
                f = f2;
                scrollScope = scrollScope3;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000Var = oooO00o.f57075OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
            }
            fFloatValue = ((Number) objOooO0Oo).floatValue();
            return Boxing.boxFloat(o000Var.OooO0O0(fFloatValue));
        }
        ResultKt.throwOnFailure(objOooO0Oo);
        o000O00 o000o01 = this.f57063OooO00o;
        o000O00O o000o00oOooO0o1 = o000o01.OooO0o0();
        if (o000o00oOooO0o1 == null) {
            return Boxing.boxFloat(f);
        }
        if (o000o00oOooO0o1.OooO00o() == i && o000o01.OooO0Oo(o000o00oOooO0o1.OooO00o()) == 0) {
            return Boxing.boxFloat(OooO0O0(f));
        }
        if (Math.abs(f) < 0.5f) {
            z = false;
        } else {
            float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(this.f57064OooO0O0, 0.0f, f);
            if (f >= 0.0f ? fCalculateTargetValue < o000o01.OooO0Oo(o000o00oOooO0o1.OooO00o() + 1) : fCalculateTargetValue > o000o01.OooO0Oo(o000o00oOooO0o1.OooO00o())) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            oooO00o.f57075OooO0Oo = this;
            oooO00o.f57077OooO0o0 = scrollScope;
            oooO00o.f57076OooO0o = i;
            oooO00o.f57078OooO0oO = f;
            oooO00o.f57080OooOO0 = 1;
            objOooO0Oo = OooO0Oo(scrollScope, o000o00oOooO0o1, i, f, true, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000Var2 = this;
        } else {
            scrollScope2 = scrollScope;
            i2 = i;
            fFloatValue = f;
            o000Var = this;
        }
        o000o00oOooO0o0 = o000Var.f57063OooO00o.OooO0o0();
        if (o000o00oOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        if (o000o00oOooO0o0.OooO00o() == i2 || o000Var.f57063OooO00o.OooO0Oo(i2) != 0) {
            oooO00o.f57075OooO0Oo = o000Var;
            oooO00o.f57077OooO0o0 = null;
            oooO00o.f57080OooOO0 = 2;
            objOooO0Oo = o000Var.OooO0o0(scrollScope2, o000o00oOooO0o0, i2, fFloatValue, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            fFloatValue = ((Number) objOooO0Oo).floatValue();
        }
        return Boxing.boxFloat(o000Var.OooO0O0(fFloatValue));
        scrollScope2 = scrollScope;
        i2 = i;
        fFloatValue = ((Number) objOooO0Oo).floatValue();
        o000Var = o000Var2;
        o000o00oOooO0o0 = o000Var.f57063OooO00o.OooO0o0();
        if (o000o00oOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        if (o000o00oOooO0o0.OooO00o() == i2) {
        }
        oooO00o.f57075OooO0Oo = o000Var;
        oooO00o.f57077OooO0o0 = null;
        oooO00o.f57080OooOO0 = 2;
        objOooO0Oo = o000Var.OooO0o0(scrollScope2, o000o00oOooO0o0, i2, fFloatValue, oooO00o);
        if (objOooO0Oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        fFloatValue = ((Number) objOooO0Oo).floatValue();
        return Boxing.boxFloat(o000Var.OooO0O0(fFloatValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object OooO0Oo(ScrollScope scrollScope, o000O00O o000o00o2, int i, float f, boolean z, Continuation<? super Float> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        Integer num;
        o000 o000Var;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f57085OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f57085OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object obj = oooO0O1.f57082OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O1.f57085OooO0oo;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO0O1.f57083OooO0o0;
            o000Var = oooO0O1.f57081OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
                num = null;
                o000Var.OooO0o(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th) {
                th = th;
                num = null;
                o000Var.OooO0o(num);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (o000o00o2.OooO00o() == i && this.f57063OooO00o.OooO0Oo(o000o00o2.OooO00o()) == 0) {
            return Boxing.boxFloat(OooO0O0(f));
        }
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = f;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        boolean z2 = z && Math.abs(i - o000o00o2.OooO00o()) >= 2;
        try {
            OooO0o(Boxing.boxInt(i));
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
            DecayAnimationSpec<Float> decayAnimationSpec = this.f57064OooO0O0;
            try {
                OooO0OO oooO0OO = new OooO0OO(floatRef3, scrollScope, floatRef2, this, z2, i);
                oooO0O1.f57081OooO0Oo = this;
                oooO0O1.f57083OooO0o0 = floatRef2;
                oooO0O1.f57085OooO0oo = 1;
                num = null;
                floatRef = floatRef2;
                try {
                    if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, oooO0OO, oooO0O1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o000Var = this;
                    o000Var.OooO0o(num);
                    return Boxing.boxFloat(floatRef.element);
                } catch (Throwable th2) {
                    th = th2;
                    o000Var = this;
                    o000Var.OooO0o(num);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                num = null;
            }
        } catch (Throwable th4) {
            th = th4;
            num = null;
        }
    }

    public final void OooO0o(Integer num) {
        this.f57067OooO0o.setValue(num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object OooO0o0(ScrollScope scrollScope, o000O00O o000o00o2, int i, float f, Continuation<? super Float> continuation) throws Throwable {
        OooO0o oooO0o;
        Integer num;
        o000 o000Var;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i2 = oooO0o.f57096OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0o.f57096OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        OooO0o oooO0o2 = oooO0o;
        Object obj = oooO0o2.f57093OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0o2.f57096OooO0oo;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO0o2.f57094OooO0o0;
            o000Var = oooO0o2.f57092OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
                num = null;
                o000Var.OooO0o(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th) {
                th = th;
                num = null;
                o000Var.OooO0o(num);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        float f2 = 0.0f;
        if ((i > o000o00o2.OooO00o() && f > 0.0f) || (i <= o000o00o2.OooO00o() && f < 0.0f)) {
            f2 = f;
        }
        floatRef2.element = f2;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        try {
            OooO0o(Boxing.boxInt(i));
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(floatRef3.element, floatRef2.element, 0L, 0L, false, 28, null);
            Float fBoxFloat = Boxing.boxFloat(this.f57063OooO00o.OooO0Oo(i));
            AnimationSpec<Float> animationSpec = this.f57065OooO0OO;
            OooO oooO = new OooO(floatRef3, scrollScope, floatRef2, this, i);
            oooO0o2.f57092OooO0Oo = this;
            oooO0o2.f57094OooO0o0 = floatRef2;
            oooO0o2.f57096OooO0oo = 1;
            num = null;
            try {
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, oooO, oooO0o2, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef = floatRef2;
                o000Var = this;
                o000Var.OooO0o(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th2) {
                th = th2;
                o000Var = this;
                o000Var.OooO0o(num);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public final Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull Continuation<? super Float> continuation) {
        o000O00 o000o01 = this.f57063OooO00o;
        if (!o000o01.OooO0O0() || !o000o01.OooO00o()) {
            return Boxing.boxFloat(f);
        }
        float fFloatValue = this.f57068OooO0o0.invoke(o000o01).floatValue();
        if (!(fFloatValue > 0.0f)) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        o000O00O o000o00oOooO0o0 = o000o01.OooO0o0();
        if (o000o00oOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        int iIntValue = this.f57066OooO0Oo.invoke(o000o01, Boxing.boxInt(f < 0.0f ? o000o00oOooO0o0.OooO00o() + 1 : o000o00oOooO0o0.OooO00o()), Boxing.boxInt(o000o01.OooO0OO(this.f57064OooO0O0, f, fFloatValue))).intValue();
        if (iIntValue >= 0 && iIntValue < o000o01.OooO0oo()) {
            return OooO0OO(scrollScope, iIntValue, f, continuation);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
