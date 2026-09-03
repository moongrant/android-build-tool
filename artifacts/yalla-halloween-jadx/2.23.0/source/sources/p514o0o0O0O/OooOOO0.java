package p514o0o0O0O;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.refresh.SwipeRefreshState$dispatchScrollDelta$2", f = "SwipeState.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f51691OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f51692OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOO f51693OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOOO oooOOO, float f, Continuation<? super OooOOO0> continuation) {
        super(1, continuation);
        this.f51693OooO0o0 = oooOOO;
        this.f51692OooO0o = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new OooOOO0(this.f51693OooO0o0, this.f51692OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OooOOO0) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f51691OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOOO oooOOO = this.f51693OooO0o0;
            float fFloatValue = oooOOO.f51686OooO00o.getValue().floatValue() + this.f51692OooO0o;
            float fFloatValue2 = ((Number) oooOOO.f51688OooO0OO.getValue()).floatValue();
            oooOOO.getClass();
            float fMin = Math.min(1.0f, fFloatValue / fFloatValue2);
            float f = 2;
            float fMax = Math.max(0.0f, Math.min(Math.abs(fFloatValue) - fFloatValue2, fFloatValue2 * f) / fFloatValue2) / 4;
            float fPow = (fMax - ((float) Math.pow(fMax, 2))) * f * fFloatValue2 * f;
            Animatable<Float, AnimationVector1D> animatable = oooOOO.f51686OooO00o;
            Float fBoxFloat = Boxing.boxFloat((fFloatValue2 * fMin) + fPow);
            this.f51691OooO0Oo = 1;
            if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
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
