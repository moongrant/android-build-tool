package retrofit2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class oo000o implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f61185OooO00o;

    public oo000o(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f61185OooO00o = cancellableContinuationImpl;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        this.f61185OooO00o.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull o0000O0O<Object> o0000o0o2) {
        boolean zOooO0oO = o0000o0o2.f61108OooO00o.OooO0oO();
        CancellableContinuation cancellableContinuation = this.f61185OooO00o;
        if (zOooO0oO) {
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(o0000o0o2.f61109OooO0O0));
            return;
        }
        HttpException httpException = new HttpException(o0000o0o2);
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(httpException)));
    }
}
