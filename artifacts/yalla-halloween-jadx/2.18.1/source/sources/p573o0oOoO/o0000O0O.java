package p573o0oOoO;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.refresh.SwipeRefreshState$dispatchScrollDelta$2", f = "SwipeState.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O0O extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f45656Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OO f45657Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f45658Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o000OO o000oo2, float f, Continuation<? super o0000O0O> continuation) {
        super(1, continuation);
        this.f45657Oooo0oO = o000oo2;
        this.f45658Oooo0oo = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new o0000O0O(this.f45657Oooo0oO, this.f45658Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((o0000O0O) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45656Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float fFloatValue = this.f45657Oooo0oO.f45666OooO00o.OooO0o().floatValue() + this.f45658Oooo0oo;
            float fFloatValue2 = ((Number) this.f45657Oooo0oO.f45668OooO0OO.getValue()).floatValue();
            float fMin = Math.min(1.0f, fFloatValue / fFloatValue2);
            float f = 2;
            float fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(Math.abs(fFloatValue) - fFloatValue2, fFloatValue2 * f) / fFloatValue2) / 4;
            float fPow = (fFloatValue2 * fMin) + ((fMax - ((float) Math.pow(fMax, 2))) * f * fFloatValue2 * f);
            Oooo0<Float, o0Oo0oo> oooo0 = this.f45657Oooo0oO.f45666OooO00o;
            Float fBoxFloat = Boxing.boxFloat(fPow);
            this.f45656Oooo0o = 1;
            if (oooo0.OooO0oO(fBoxFloat, this) == coroutine_suspended) {
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
