package p029Oooo0oO;

import androidx.compose.foundation.MutatePriority;
import java.util.Objects;
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
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1$2", f = "LazySemantics.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class o0O000o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f2424Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2425Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f2426Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(o00OOOOo o00ooooo2, int i, Continuation<? super o0O000o0> continuation) {
        super(2, continuation);
        this.f2425Oooo0oO = o00ooooo2;
        this.f2426Oooo0oo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O000o0(this.f2425Oooo0oO, this.f2426Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O000o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2424Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00OOOOo o00ooooo2 = this.f2425Oooo0oO;
            int i2 = this.f2426Oooo0oo;
            this.f2424Oooo0o = 1;
            o00OOOOo.OooO0OO oooO0OO = o00OOOOo.f2377OooOo0;
            Objects.requireNonNull(o00ooooo2);
            Object objOooO0O0 = o00ooooo2.OooO0O0(MutatePriority.Default, new o00Oo00(o00ooooo2, i2, 0, null), this);
            if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO0O0 = Unit.INSTANCE;
            }
            if (objOooO0O0 == coroutine_suspended) {
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
