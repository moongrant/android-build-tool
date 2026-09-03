package p101o000oo;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"next"}, s = {"L$0"})
public final class oo000o extends SuspendLambda implements Function3<o0000OO0<Object>, o0000OO0<Object>, Continuation<? super o0000OO0<Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35586OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ o0000OO0 f35587OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ o0000OO0 f35588OooO0o0;

    public oo000o(Continuation<? super oo000o> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(o0000OO0<Object> o0000oo1, o0000OO0<Object> o0000oo2, Continuation<? super o0000OO0<Object>> continuation) {
        oo000o oo000oVar = new oo000o(continuation);
        oo000oVar.f35588OooO0o0 = o0000oo1;
        oo000oVar.f35587OooO0o = o0000oo2;
        return oo000oVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35586OooO0Oo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0000OO0 o0000oo1 = this.f35588OooO0o0;
            ResultKt.throwOnFailure(obj);
            return o0000oo1;
        }
        ResultKt.throwOnFailure(obj);
        o0000OO0 o0000oo2 = this.f35588OooO0o0;
        o0000OO0 o0000oo3 = this.f35587OooO0o;
        this.f35588OooO0o0 = o0000oo3;
        this.f35586OooO0Oo = 1;
        Job.DefaultImpls.cancel$default(o0000oo2.f35431OooO0OO.f10193OooO0Oo, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE == coroutine_suspended ? coroutine_suspended : o0000oo3;
    }
}
