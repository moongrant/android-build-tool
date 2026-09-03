package p582o0oOoo0;

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
import p407o0Oo0Oo.o0OO0o00;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.message.SystemMessageVM$clearSystemMessages$1", f = "SystemMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0000OO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public o0000OO0(Continuation<? super o0000OO0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000OO0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0000OO0(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0OO0o00 o0oo0o00Oooo00O = o00Oo0.OooO00o().Oooo00O();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0oo0o00Oooo00O.OooO0oO((Long) o0O00oO0.OooOOo0().getValue());
        return Unit.INSTANCE;
    }
}
