package o0O000o0;

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
@DebugMetadata(c = "com.common.support.longlink.receiver.ReceiverImpl$doTask$2", f = "ReceiverImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o<Object> f35086Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f35087Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO0o<Object> oooO0o, Object obj, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f35086Oooo0o = oooO0o;
        this.f35087Oooo0oO = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0OO(this.f35086Oooo0o, this.f35087Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f35086Oooo0o.f35088Oooo.OooO0OO(this.f35087Oooo0oO)) {
            OooO00o<Object> oooO00o = this.f35086Oooo0o.f35091OoooO0O;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            this.f35086Oooo0o.f35090OoooO00.OooO00o(this.f35087Oooo0oO);
        } else {
            this.f35086Oooo0o.f35090OoooO00.OooO0OO(this.f35087Oooo0oO);
        }
        return Unit.INSTANCE;
    }
}
