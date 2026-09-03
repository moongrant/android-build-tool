package p520o0o0O0O0;

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
import p490o0o00O0.OooOOO;
import p490o0o00O0.OooOo00;
import p491o0o00O00.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo$updateMessageStateFailed$1", f = "ChatMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public OooOo(Continuation<? super OooOo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new OooOo(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooOOO OooOOo2 = OooO0OO.OooO00o().OooOOo();
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        OooOOo2.OooO0o(value == null ? 0L : value.longValue());
        OooOo00 oooOo00OooOOoo = OooO0OO.OooO00o().OooOOoo();
        Long value2 = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        oooOo00OooOOoo.OooO0o(value2 != null ? value2.longValue() : 0L);
        return Unit.INSTANCE;
    }
}
