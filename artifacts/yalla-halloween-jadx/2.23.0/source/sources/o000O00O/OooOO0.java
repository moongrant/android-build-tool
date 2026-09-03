package o000O00O;

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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"next"}, s = {"L$0"})
public final class OooOO0 extends SuspendLambda implements Function3<o000000<Object>, o000000<Object>, Continuation<? super o000000<Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ o000000 f34448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ o000000 f34449OooO0o0;

    public OooOO0(Continuation<? super OooOO0> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(o000000<Object> o000000Var, o000000<Object> o000000Var2, Continuation<? super o000000<Object>> continuation) {
        OooOO0 oooOO1 = new OooOO0(continuation);
        oooOO1.f34449OooO0o0 = o000000Var;
        oooOO1.f34448OooO0o = o000000Var2;
        return oooOO1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34447OooO0Oo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000000 o000000Var = this.f34449OooO0o0;
            ResultKt.throwOnFailure(obj);
            return o000000Var;
        }
        ResultKt.throwOnFailure(obj);
        o000000 o000000Var2 = this.f34449OooO0o0;
        o000000 o000000Var3 = this.f34448OooO0o;
        this.f34449OooO0o0 = o000000Var3;
        this.f34447OooO0Oo = 1;
        Job.DefaultImpls.cancel$default(o000000Var2.f34490OooO0OO.f7099OooO0Oo, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE == coroutine_suspended ? coroutine_suspended : o000000Var3;
    }
}
