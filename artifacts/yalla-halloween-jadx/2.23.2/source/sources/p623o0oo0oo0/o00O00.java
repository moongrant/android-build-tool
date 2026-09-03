package p623o0oo0oo0;

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
import p230o00oOo0o.o0OO00O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class o00O00 implements FlingBehavior {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f57607OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final DecayAnimationSpec<Float> f57608OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<Float> f57609OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function3<o00O00o0, Integer, Integer, Integer> f57610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f57611OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<o00O00o0, Float> f57612OooO0o0;

    public static final class OooO extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57613OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57614OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f57615OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00 f57616OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f57617OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, o00O00 o00o01, int i) {
            super(1);
            this.f57613OooO0Oo = floatRef;
            this.f57615OooO0o0 = scrollScope;
            this.f57614OooO0o = floatRef2;
            this.f57616OooO0oO = o00o01;
            this.f57617OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.getValue().floatValue();
            Ref.FloatRef floatRef = this.f57613OooO0Oo;
            float f = fFloatValue - floatRef.element;
            ScrollScope scrollScope = this.f57615OooO0o0;
            float fScrollBy = scrollScope.scrollBy(f);
            floatRef.element = animateTo.getValue().floatValue();
            this.f57614OooO0o.element = animateTo.getVelocity().floatValue();
            o00O00 o00o01 = this.f57616OooO0oO;
            oo00o oo00oVarOooO0o0 = o00o01.f57607OooO00o.OooO0o0();
            if (oo00oVarOooO0o0 == null) {
                animateTo.cancelAnimation();
            } else {
                if (o00O00.OooO00o(o00o01, animateTo, oo00oVarOooO0o0, this.f57617OooO0oo, new oOO00O(scrollScope)) || Math.abs(f - fScrollBy) > 0.5f) {
                    animateTo.cancelAnimation();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0, 0, 0, 1}, l = {406, 416}, m = "flingToIndex", n = {"this", "$this$flingToIndex", "index", "initialVelocity", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O00 f57619OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f57620OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ScrollScope f57621OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f57622OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f57623OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f57624OooOO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57623OooO0oo = obj;
            this.f57624OooOO0 |= Integer.MIN_VALUE;
            return o00O00.this.OooO0OO(null, 0, 0.0f, this);
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {477}, m = "performDecayFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O00 f57625OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f57626OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Ref.FloatRef f57627OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f57629OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57626OooO0o = obj;
            this.f57629OooO0oo |= Integer.MIN_VALUE;
            return o00O00.this.OooO0Oo(null, null, 0, 0.0f, false, this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f57630OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57631OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f57632OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f57633OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00 f57634OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f57635OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, o00O00 o00o01, boolean z, int i) {
            super(1);
            this.f57631OooO0Oo = floatRef;
            this.f57633OooO0o0 = scrollScope;
            this.f57632OooO0o = floatRef2;
            this.f57634OooO0oO = o00o01;
            this.f57635OooO0oo = z;
            this.f57630OooO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animateDecay = animationScope;
            Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.getValue().floatValue();
            Ref.FloatRef floatRef = this.f57631OooO0Oo;
            float f = fFloatValue - floatRef.element;
            ScrollScope scrollScope = this.f57633OooO0o0;
            float fScrollBy = scrollScope.scrollBy(f);
            floatRef.element = animateDecay.getValue().floatValue();
            this.f57632OooO0o.element = animateDecay.getVelocity().floatValue();
            if (Math.abs(f - fScrollBy) > 0.5f) {
                animateDecay.cancelAnimation();
            }
            o00O00 o00o01 = this.f57634OooO0oO;
            oo00o oo00oVarOooO0o0 = o00o01.f57607OooO00o.OooO0o0();
            if (oo00oVarOooO0o0 == null) {
                animateDecay.cancelAnimation();
            } else {
                boolean zIsRunning = animateDecay.isRunning();
                int i = this.f57630OooO;
                if (zIsRunning && this.f57635OooO0oo) {
                    if (animateDecay.getVelocity().floatValue() > 0.0f && oo00oVarOooO0o0.OooO00o() == i - 1) {
                        animateDecay.cancelAnimation();
                    } else if (animateDecay.getVelocity().floatValue() < 0.0f && oo00oVarOooO0o0.OooO00o() == i) {
                        animateDecay.cancelAnimation();
                    }
                }
                if (animateDecay.isRunning() && o00O00.OooO00o(o00o01, animateDecay, oo00oVarOooO0o0, i, new o00O00O(scrollScope))) {
                    animateDecay.cancelAnimation();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {551}, m = "performSpringFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O00 f57636OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f57637OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Ref.FloatRef f57638OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f57640OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57637OooO0o = obj;
            this.f57640OooO0oo |= Integer.MIN_VALUE;
            return o00O00.this.OooO0o0(null, null, 0, 0.0f, this);
        }
    }

    public o00O00() {
        throw null;
    }

    public o00O00(@NotNull o00oOoo layoutInfo, @NotNull DecayAnimationSpec decayAnimationSpec, @NotNull AnimationSpec springAnimationSpec) {
        o0OO00O.OooO00o snapIndex = o0OO00O.f39788OooO00o;
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        o00O00OO.OooO00o oooO00o = o00O00OO.f57647OooO0O0;
        this.f57607OooO00o = layoutInfo;
        this.f57608OooO0O0 = decayAnimationSpec;
        this.f57609OooO0OO = springAnimationSpec;
        this.f57610OooO0Oo = snapIndex;
        this.f57612OooO0o0 = oooO00o;
        this.f57611OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final boolean OooO00o(o00O00 o00o01, AnimationScope animationScope, oo00o oo00oVar, int i, Function1 function1) {
        int iOooO0Oo;
        o00o01.getClass();
        float fFloatValue = ((Number) animationScope.getVelocity()).floatValue();
        o00O00o0 o00o00o1 = o00o01.f57607OooO00o;
        if (fFloatValue <= 0.0f || oo00oVar.OooO00o() < i) {
            iOooO0Oo = (fFloatValue >= 0.0f || oo00oVar.OooO00o() > i + (-1)) ? 0 : o00o00o1.OooO0Oo(oo00oVar.OooO00o() + 1);
        } else {
            iOooO0Oo = o00o00o1.OooO0Oo(oo00oVar.OooO00o());
        }
        if (iOooO0Oo == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iOooO0Oo));
        return true;
    }

    public final float OooO0O0(float f) {
        o00O00o0 o00o00o1 = this.f57607OooO00o;
        if (f < 0.0f && !o00o00o1.OooO0O0()) {
            return f;
        }
        if (f <= 0.0f || o00o00o1.OooO00o()) {
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
        o00O00 o00o01;
        o00O00 o00o02;
        oo00o oo00oVarOooO0o0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i3 = oooO00o.f57624OooOO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO00o.f57624OooOO0 = i3 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f57623OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO00o.f57624OooOO0;
        if (i4 != 0) {
            if (i4 == 1) {
                float f2 = oooO00o.f57622OooO0oO;
                i = oooO00o.f57620OooO0o;
                ScrollScope scrollScope3 = oooO00o.f57621OooO0o0;
                o00o02 = oooO00o.f57619OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
                f = f2;
                scrollScope = scrollScope3;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00o01 = oooO00o.f57619OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
            }
            fFloatValue = ((Number) objOooO0Oo).floatValue();
            return Boxing.boxFloat(o00o01.OooO0O0(fFloatValue));
        }
        ResultKt.throwOnFailure(objOooO0Oo);
        o00O00o0 o00o00o1 = this.f57607OooO00o;
        oo00o oo00oVarOooO0o1 = o00o00o1.OooO0o0();
        if (oo00oVarOooO0o1 == null) {
            return Boxing.boxFloat(f);
        }
        if (oo00oVarOooO0o1.OooO00o() == i && o00o00o1.OooO0Oo(oo00oVarOooO0o1.OooO00o()) == 0) {
            return Boxing.boxFloat(OooO0O0(f));
        }
        if (Math.abs(f) < 0.5f) {
            z = false;
        } else {
            float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(this.f57608OooO0O0, 0.0f, f);
            if (f >= 0.0f ? fCalculateTargetValue < o00o00o1.OooO0Oo(oo00oVarOooO0o1.OooO00o() + 1) : fCalculateTargetValue > o00o00o1.OooO0Oo(oo00oVarOooO0o1.OooO00o())) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            oooO00o.f57619OooO0Oo = this;
            oooO00o.f57621OooO0o0 = scrollScope;
            oooO00o.f57620OooO0o = i;
            oooO00o.f57622OooO0oO = f;
            oooO00o.f57624OooOO0 = 1;
            objOooO0Oo = OooO0Oo(scrollScope, oo00oVarOooO0o1, i, f, true, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o02 = this;
        } else {
            scrollScope2 = scrollScope;
            i2 = i;
            fFloatValue = f;
            o00o01 = this;
        }
        oo00oVarOooO0o0 = o00o01.f57607OooO00o.OooO0o0();
        if (oo00oVarOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        if (oo00oVarOooO0o0.OooO00o() == i2 || o00o01.f57607OooO00o.OooO0Oo(i2) != 0) {
            oooO00o.f57619OooO0Oo = o00o01;
            oooO00o.f57621OooO0o0 = null;
            oooO00o.f57624OooOO0 = 2;
            objOooO0Oo = o00o01.OooO0o0(scrollScope2, oo00oVarOooO0o0, i2, fFloatValue, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            fFloatValue = ((Number) objOooO0Oo).floatValue();
        }
        return Boxing.boxFloat(o00o01.OooO0O0(fFloatValue));
        scrollScope2 = scrollScope;
        i2 = i;
        fFloatValue = ((Number) objOooO0Oo).floatValue();
        o00o01 = o00o02;
        oo00oVarOooO0o0 = o00o01.f57607OooO00o.OooO0o0();
        if (oo00oVarOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        if (oo00oVarOooO0o0.OooO00o() == i2) {
        }
        oooO00o.f57619OooO0Oo = o00o01;
        oooO00o.f57621OooO0o0 = null;
        oooO00o.f57624OooOO0 = 2;
        objOooO0Oo = o00o01.OooO0o0(scrollScope2, oo00oVarOooO0o0, i2, fFloatValue, oooO00o);
        if (objOooO0Oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        fFloatValue = ((Number) objOooO0Oo).floatValue();
        return Boxing.boxFloat(o00o01.OooO0O0(fFloatValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object OooO0Oo(ScrollScope scrollScope, oo00o oo00oVar, int i, float f, boolean z, Continuation<? super Float> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        Integer num;
        o00O00 o00o01;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f57629OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f57629OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object obj = oooO0O1.f57626OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O1.f57629OooO0oo;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO0O1.f57627OooO0o0;
            o00o01 = oooO0O1.f57625OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
                num = null;
                o00o01.OooO0o(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th) {
                th = th;
                num = null;
                o00o01.OooO0o(num);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (oo00oVar.OooO00o() == i && this.f57607OooO00o.OooO0Oo(oo00oVar.OooO00o()) == 0) {
            return Boxing.boxFloat(OooO0O0(f));
        }
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = f;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        boolean z2 = z && Math.abs(i - oo00oVar.OooO00o()) >= 2;
        try {
            OooO0o(Boxing.boxInt(i));
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
            DecayAnimationSpec<Float> decayAnimationSpec = this.f57608OooO0O0;
            try {
                OooO0OO oooO0OO = new OooO0OO(floatRef3, scrollScope, floatRef2, this, z2, i);
                oooO0O1.f57625OooO0Oo = this;
                oooO0O1.f57627OooO0o0 = floatRef2;
                oooO0O1.f57629OooO0oo = 1;
                num = null;
                floatRef = floatRef2;
                try {
                    if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, oooO0OO, oooO0O1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o00o01 = this;
                    o00o01.OooO0o(num);
                    return Boxing.boxFloat(floatRef.element);
                } catch (Throwable th2) {
                    th = th2;
                    o00o01 = this;
                    o00o01.OooO0o(num);
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
        this.f57611OooO0o.setValue(num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object OooO0o0(ScrollScope scrollScope, oo00o oo00oVar, int i, float f, Continuation<? super Float> continuation) throws Throwable {
        OooO0o oooO0o;
        Integer num;
        o00O00 o00o01;
        Ref.FloatRef floatRef;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i2 = oooO0o.f57640OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0o.f57640OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        OooO0o oooO0o2 = oooO0o;
        Object obj = oooO0o2.f57637OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0o2.f57640OooO0oo;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = oooO0o2.f57638OooO0o0;
            o00o01 = oooO0o2.f57636OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
                num = null;
                o00o01.OooO0o(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th) {
                th = th;
                num = null;
                o00o01.OooO0o(num);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        float f2 = 0.0f;
        if ((i > oo00oVar.OooO00o() && f > 0.0f) || (i <= oo00oVar.OooO00o() && f < 0.0f)) {
            f2 = f;
        }
        floatRef2.element = f2;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        try {
            OooO0o(Boxing.boxInt(i));
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(floatRef3.element, floatRef2.element, 0L, 0L, false, 28, null);
            Float fBoxFloat = Boxing.boxFloat(this.f57607OooO00o.OooO0Oo(i));
            AnimationSpec<Float> animationSpec = this.f57609OooO0OO;
            OooO oooO = new OooO(floatRef3, scrollScope, floatRef2, this, i);
            oooO0o2.f57636OooO0Oo = this;
            oooO0o2.f57638OooO0o0 = floatRef2;
            oooO0o2.f57640OooO0oo = 1;
            num = null;
            try {
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, oooO, oooO0o2, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef = floatRef2;
                o00o01 = this;
                o00o01.OooO0o(num);
                return Boxing.boxFloat(floatRef.element);
            } catch (Throwable th2) {
                th = th2;
                o00o01 = this;
                o00o01.OooO0o(num);
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
        o00O00o0 o00o00o1 = this.f57607OooO00o;
        if (!o00o00o1.OooO0O0() || !o00o00o1.OooO00o()) {
            return Boxing.boxFloat(f);
        }
        float fFloatValue = this.f57612OooO0o0.invoke(o00o00o1).floatValue();
        if (!(fFloatValue > 0.0f)) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        oo00o oo00oVarOooO0o0 = o00o00o1.OooO0o0();
        if (oo00oVarOooO0o0 == null) {
            return Boxing.boxFloat(f);
        }
        int iIntValue = this.f57610OooO0Oo.invoke(o00o00o1, Boxing.boxInt(f < 0.0f ? oo00oVarOooO0o0.OooO00o() + 1 : oo00oVarOooO0o0.OooO00o()), Boxing.boxInt(o00o00o1.OooO0OO(this.f57608OooO0O0, f, fFloatValue))).intValue();
        if (iIntValue >= 0 && iIntValue < o00o00o1.OooO0oo()) {
            return OooO0OO(scrollScope, iIntValue, f, continuation);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
