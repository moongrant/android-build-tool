package retrofit2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00Ooo implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f60620OooO00o;

    public o00Ooo(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f60620OooO00o = cancellableContinuationImpl;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        this.f60620OooO00o.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull o0000O0<Object> o0000o1) {
        boolean zOooO0oO = o0000o1.f60546OooO00o.OooO0oO();
        CancellableContinuation cancellableContinuation = this.f60620OooO00o;
        if (zOooO0oO) {
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(o0000o1.f60547OooO0O0));
            return;
        }
        HttpException httpException = new HttpException(o0000o1);
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(httpException)));
    }
}
