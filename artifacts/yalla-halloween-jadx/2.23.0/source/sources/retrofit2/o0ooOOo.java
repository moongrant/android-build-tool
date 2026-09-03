package retrofit2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0ooOOo implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f61184OooO00o;

    public o0ooOOo(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f61184OooO00o = cancellableContinuationImpl;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        this.f61184OooO00o.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull o0000O0O<Object> o0000o0o2) {
        this.f61184OooO00o.resumeWith(Result.m4213constructorimpl(o0000o0o2));
    }
}
