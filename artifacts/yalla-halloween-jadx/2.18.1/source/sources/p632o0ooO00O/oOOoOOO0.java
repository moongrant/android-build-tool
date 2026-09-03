package p632o0ooO00O;

import come.code.android.easyrefreshcontentstatus.RefreshState;
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
@DebugMetadata(c = "come.code.android.easyrefreshcontentstatus.RefreshState$dispatchScrollDelta$2", f = "RefreshState.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class oOOoOOO0 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48783Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RefreshState f48784Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f48785Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(RefreshState refreshState, float f, Continuation<? super oOOoOOO0> continuation) {
        super(1, continuation);
        this.f48784Oooo0oO = refreshState;
        this.f48785Oooo0oo = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new oOOoOOO0(this.f48784Oooo0oO, this.f48785Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((oOOoOOO0) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48783Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo0<Float, o0Oo0oo> oooo0 = this.f48784Oooo0oO.f26333OooO00o;
            Float fBoxFloat = Boxing.boxFloat(oooo0.OooO0o().floatValue() + this.f48785Oooo0oo);
            this.f48783Oooo0o = 1;
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
