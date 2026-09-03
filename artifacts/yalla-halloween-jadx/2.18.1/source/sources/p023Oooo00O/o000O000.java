package p023Oooo00O;

import androidx.compose.ui.platform.o00;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1061Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f1062Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Long, ? extends R> function1, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f1062Oooo0oO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new OooO00o(this.f1062Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((OooO00o) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1061Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Long, R> function1 = this.f1062Oooo0oO;
                this.f1061Oooo0o = 1;
                obj = o0O00.OooO0O0(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Nullable
    public static final <R> Object OooO00o(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        o00 o00Var = (o00) continuation.get$context().get(o00.OooO00o.f6349Oooo0o);
        if (o00Var == null) {
            return o0O00.OooO0O0(function1, continuation);
        }
        new OooO00o(function1, null);
        return o00Var.OooO0Oo();
    }
}
