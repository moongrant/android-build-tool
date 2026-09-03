package o00O00O;

import code.easy.refresh.RefreshState;
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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "code.easy.refresh.RefreshState$dispatchScrollDelta$2", f = "RefreshState.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class OooO extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f30177Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RefreshState f30178Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f30179Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(RefreshState refreshState, float f, Continuation<? super OooO> continuation) {
        super(1, continuation);
        this.f30178Oooo0oO = refreshState;
        this.f30179Oooo0oo = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new OooO(this.f30178Oooo0oO, this.f30179Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OooO) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f30177Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo0<Float, o0Oo0oo> oooo0 = this.f30178Oooo0oO.f9858OooO00o;
            Float fBoxFloat = Boxing.boxFloat(oooo0.OooO0o().floatValue() + this.f30179Oooo0oo);
            this.f30177Oooo0o = 1;
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
