package p107o000ooO0;

import androidx.paging.o0OOO0o;
import androidx.paging.oo0o0Oo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<o0OOO0o<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35808OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<Object> f35809OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f35810OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(OooOOOO<Object> oooOOOO, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f35809OooO0o = oooOOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooOo oooOo = new OooOo(this.f35809OooO0o, continuation);
        oooOo.f35810OooO0o0 = obj;
        return oooOo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0OOO0o<Object> o0ooo0o2, Continuation<? super Unit> continuation) {
        return ((OooOo) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35808OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OOO0o o0ooo0o2 = (o0OOO0o) this.f35810OooO0o0;
            Oooo0 oooo0 = this.f35809OooO0o.f35805OooO0O0;
            this.f35808OooO0Oo = 1;
            oooo0.getClass();
            Object objOooO00o = oooo0.f10472OooO0oo.OooO00o(0, new oo0o0Oo(oooo0, o0ooo0o2, null), this);
            if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO00o = Unit.INSTANCE;
            }
            if (objOooO00o == coroutine_suspended) {
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
