package o000O0;

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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0o extends SuspendLambda implements Function2<o0OOO0o<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<Object> f34334OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f34335OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO0O0<Object> oooO0O0, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f34334OooO0o = oooO0O0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0o oooO0o = new OooO0o(this.f34334OooO0o, continuation);
        oooO0o.f34335OooO0o0 = obj;
        return oooO0o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0OOO0o<Object> o0ooo0o2, Continuation<? super Unit> continuation) {
        return ((OooO0o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34333OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OOO0o o0ooo0o2 = (o0OOO0o) this.f34335OooO0o0;
            OooOO0 oooOO1 = this.f34334OooO0o.f34329OooO0O0;
            this.f34333OooO0Oo = 1;
            oooOO1.getClass();
            Object objOooO00o = oooOO1.f7378OooO0oo.OooO00o(0, new oo0o0Oo(oooOO1, o0ooo0o2, null), this);
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
