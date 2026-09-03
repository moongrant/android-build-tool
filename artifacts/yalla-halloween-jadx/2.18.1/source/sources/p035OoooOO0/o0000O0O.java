package p035OoooOO0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.oo000o;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oo000o<Float> f3616Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3617Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O f3618Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f3619Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o0000O o0000o2, float f, oo000o<Float> oo000oVar, Continuation<? super o0000O0O> continuation) {
        super(2, continuation);
        this.f3618Oooo0oO = o0000o2;
        this.f3619Oooo0oo = f;
        this.f3616Oooo = oo000oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O0O(this.f3618Oooo0oO, this.f3619Oooo0oo, this.f3616Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3617Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo0<Float, o0Oo0oo> oooo0 = this.f3618Oooo0oO.f3608OooO0OO;
            Float fBoxFloat = Boxing.boxFloat(this.f3619Oooo0oo);
            oo000o<Float> oo000oVar = this.f3616Oooo;
            this.f3617Oooo0o = 1;
            if (Oooo0.OooO0OO(oooo0, fBoxFloat, oo000oVar, null, this, 12) == coroutine_suspended) {
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
