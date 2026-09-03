package retrofit2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f53865OooO00o;

    public o0OoOo0(CancellableContinuation cancellableContinuation) {
        this.f53865OooO00o = cancellableContinuation;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        CancellableContinuation cancellableContinuation = this.f53865OooO00o;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull oo0o0Oo<Object> oo0o0oo) {
        CancellableContinuation cancellableContinuation = this.f53865OooO00o;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(oo0o0oo));
    }
}
