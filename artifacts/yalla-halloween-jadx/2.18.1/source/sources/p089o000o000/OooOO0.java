package p089o000o000;

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
@DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"next"}, s = {"L$0"})
public final class OooOO0 extends SuspendLambda implements Function3<o00000O<Object>, o00000O<Object>, Continuation<? super o00000O<Object>>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f28670Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ o00000O f28671Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ o00000O f28672Oooo0oo;

    public OooOO0(Continuation<? super OooOO0> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(o00000O<Object> o00000o, o00000O<Object> o00000o2, Continuation<? super o00000O<Object>> continuation) {
        OooOO0 oooOO1 = new OooOO0(continuation);
        oooOO1.f28671Oooo0oO = o00000o;
        oooOO1.f28672Oooo0oo = o00000o2;
        return oooOO1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f28670Oooo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00000O o00000o = this.f28671Oooo0oO;
            ResultKt.throwOnFailure(obj);
            return o00000o;
        }
        ResultKt.throwOnFailure(obj);
        o00000O o00000o2 = this.f28671Oooo0oO;
        o00000O o00000o3 = this.f28672Oooo0oo;
        this.f28671Oooo0oO = o00000o3;
        this.f28670Oooo0o = 1;
        Job.DefaultImpls.cancel$default(o00000o2.f28708OooO0Oo.f28620OooO0Oo, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE == coroutine_suspended ? coroutine_suspended : o00000o3;
    }
}
