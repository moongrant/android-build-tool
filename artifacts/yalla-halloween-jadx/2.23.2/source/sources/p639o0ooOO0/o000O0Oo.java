package p639o0ooOO0;

import com.google.common.util.concurrent.OooOO0O;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo<T> implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0O<T> f57710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CancellableContinuation<T> f57711OooO0o0;

    public o000O0Oo(@NotNull p030OoooO.OooOO0O oooOO0O, @NotNull CancellableContinuationImpl cancellableContinuationImpl) {
        this.f57710OooO0Oo = oooOO0O;
        this.f57711OooO0o0 = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOO0O<T> oooOO0O = this.f57710OooO0Oo;
        boolean zIsCancelled = oooOO0O.isCancelled();
        CancellableContinuation<T> cancellableContinuation = this.f57711OooO0o0;
        if (zIsCancelled) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(o000O0o.OooO0o(oooOO0O)));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.throwNpe();
            }
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(cause)));
        }
    }
}
