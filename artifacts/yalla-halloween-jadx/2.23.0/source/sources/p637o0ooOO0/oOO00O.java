package p637o0ooOO0;

import com.google.common.util.concurrent.OooO00o;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p030OoooO.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O<T> implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o<T> f57429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CancellableContinuation<T> f57430OooO0o0;

    public oOO00O(@NotNull OooOO0O oooOO0O, @NotNull CancellableContinuationImpl cancellableContinuationImpl) {
        this.f57429OooO0Oo = oooOO0O;
        this.f57430OooO0o0 = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO00o<T> oooO00o = this.f57429OooO0Oo;
        boolean zIsCancelled = oooO00o.isCancelled();
        CancellableContinuation<T> cancellableContinuation = this.f57430OooO0o0;
        if (zIsCancelled) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(o00oOoo.OooO0o(oooO00o)));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.throwNpe();
            }
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(cause)));
        }
    }
}
