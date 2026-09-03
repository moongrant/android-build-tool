package coil;

import coil.request.OooO00o;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o00O0O00.OooO0OO;
import o00O0OO0.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lo00O0OO0/OooOOO0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "coil.RealImageLoader$executeChain$2", f = "RealImageLoader.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class RealImageLoader$executeChain$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OooOOO0>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f9861Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f9862Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f9863Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeChain$2(OooO0OO oooO0OO, OooO00o oooO00o, Continuation<? super RealImageLoader$executeChain$2> continuation) {
        super(2, continuation);
        this.f9862Oooo0oO = oooO0OO;
        this.f9863Oooo0oo = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RealImageLoader$executeChain$2(this.f9862Oooo0oO, this.f9863Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OooOOO0> continuation) {
        return ((RealImageLoader$executeChain$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f9861Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO0OO oooO0OO = this.f9862Oooo0oO;
            OooO00o oooO00o = this.f9863Oooo0oo;
            this.f9861Oooo0o = 1;
            obj = oooO0OO.OooO0O0(oooO00o, this);
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
