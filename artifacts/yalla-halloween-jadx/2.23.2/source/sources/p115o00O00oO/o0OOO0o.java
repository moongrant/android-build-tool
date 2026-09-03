package p115o00O00oO;

import com.google.common.util.concurrent.OooOO0O;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import p117o00O0OOo.o00000;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o<R> implements OooOO0O<R> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Job f36155OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00000O<R> f36156OooO0o0;

    public o0OOO0o(CompletableJob job) {
        o00000O<R> underlying = new o00000O<>();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f36155OooO0Oo = job;
        this.f36156OooO0o0 = underlying;
        job.invokeOnCompletion(new o0ooOOo(this));
    }

    @Override // com.google.common.util.concurrent.OooOO0O
    public final void OooO0oo(Runnable runnable, Executor executor) {
        this.f36156OooO0o0.OooO0oo(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f36156OooO0o0.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f36156OooO0o0.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36156OooO0o0.f36334OooO0Oo instanceof o00000.OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f36156OooO0o0.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.f36156OooO0o0.get(j, timeUnit);
    }
}
