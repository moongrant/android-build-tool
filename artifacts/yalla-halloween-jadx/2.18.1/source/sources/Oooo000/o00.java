package Oooo000;

import androidx.compose.animation.core.AnimationEndReason;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f826Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f827Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OOo0.OooO00o f828Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f829Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000OOo0.OooO00o oooO00o, long j, o000OOo0 o000ooo1, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f828Oooo0oO = oooO00o;
        this.f829Oooo0oo = j;
        this.f826Oooo = o000ooo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00(this.f828Oooo0oO, this.f829Oooo0oo, this.f826Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function2<? super o0000O0O.o000oOoO, ? super o0000O0O.o000oOoO, Unit> function2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f827Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            p023Oooo00O.Oooo0<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> oooo0 = this.f828Oooo0oO.f890OooO00o;
            o0000O0O.o000oOoO o000oooo2 = new o0000O0O.o000oOoO(this.f829Oooo0oo);
            p023Oooo00O.oo000o<o0000O0O.o000oOoO> oo000oVar = this.f826Oooo.f887Oooo0o;
            this.f827Oooo0o = 1;
            obj = p023Oooo00O.Oooo0.OooO0OO(oooo0, o000oooo2, oo000oVar, null, this, 12);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        p023Oooo00O.o00Oo0 o00oo1 = (p023Oooo00O.o00Oo0) obj;
        if (o00oo1.f1180OooO0O0 == AnimationEndReason.Finished && (function2 = this.f826Oooo.f889Oooo0oo) != null) {
            function2.invoke(new o0000O0O.o000oOoO(this.f828Oooo0oO.f891OooO0O0), o00oo1.f1179OooO00o.getValue());
        }
        return Unit.INSTANCE;
    }
}
