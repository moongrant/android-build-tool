package p141o00Oo;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$animateToTarget$2", f = "CustomSlider.kt", i = {}, l = {LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY}, m = "invokeSuspend", n = {}, s = {})
public final class o00Oo0 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37515OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f37516OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f37517OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f37518OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f37519OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ DragScope f37520OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f37521OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(DragScope dragScope, Ref.FloatRef floatRef) {
            super(1);
            this.f37520OooO0Oo = dragScope;
            this.f37521OooO0o0 = floatRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
            Animatable<Float, AnimationVector1D> animateTo = animatable;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.getValue().floatValue();
            Ref.FloatRef floatRef = this.f37521OooO0o0;
            this.f37520OooO0Oo.dragBy(fFloatValue - floatRef.element);
            floatRef.element = animateTo.getValue().floatValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(float f, float f2, float f3, Continuation<? super o00Oo0> continuation) {
        super(2, continuation);
        this.f37516OooO0o = f;
        this.f37518OooO0oO = f2;
        this.f37519OooO0oo = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00Oo0 o00oo1 = new o00Oo0(this.f37516OooO0o, this.f37518OooO0oO, this.f37519OooO0oo, continuation);
        o00oo1.f37517OooO0o0 = obj;
        return o00oo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
        return ((o00Oo0) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37515OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DragScope dragScope = (DragScope) this.f37517OooO0o0;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float f = this.f37516OooO0o;
            floatRef.element = f;
            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
            Float fBoxFloat = Boxing.boxFloat(this.f37518OooO0oO);
            TweenSpec<Float> tweenSpec = o0OoOo0.f37574OooO0OO;
            Float fBoxFloat2 = Boxing.boxFloat(this.f37519OooO0oo);
            OooO00o oooO00o = new OooO00o(dragScope, floatRef);
            this.f37515OooO0Oo = 1;
            if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, oooO00o, this) == coroutine_suspended) {
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
