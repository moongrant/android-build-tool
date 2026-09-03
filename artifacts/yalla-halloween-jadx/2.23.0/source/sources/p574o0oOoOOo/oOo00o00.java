package p574o0oOoOOo;

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
import p403o0Oo0OOo.oO0O00o0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.message.SystemMessageVM$clearSystemMessages$1", f = "SystemMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOo00o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public oOo00o00(Continuation<? super oOo00o00> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo00o00(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new oOo00o00(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oO0O00o0 oo0o00o0Oooo000 = o000OOo.OooO00o().Oooo000();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        oo0o00o0Oooo000.OooO0oO((Long) o000000O.OooOOo0().getValue());
        return Unit.INSTANCE;
    }
}
