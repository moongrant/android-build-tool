package androidx.compose.ui.input.pointer;

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
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o000OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function2<o00000, Continuation<? super Unit>, Object> f6092Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f6093Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f6094Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f6095Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(o000OO o000oo2, Function2<? super o00000, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f6095Oooo0oo = o000oo2;
        this.f6092Oooo = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f6095Oooo0oo, this.f6092Oooo, continuation);
        oooO0O0.f6094Oooo0oO = obj;
        return oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6093Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f6095Oooo0oo.o000OOo((CoroutineScope) this.f6094Oooo0oO);
            Function2<o00000, Continuation<? super Unit>, Object> function2 = this.f6092Oooo;
            o000OO o000oo2 = this.f6095Oooo0oo;
            this.f6093Oooo0o = 1;
            if (function2.invoke(o000oo2, this) == coroutine_suspended) {
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
