package p102o000oo;

import com.google.common.util.concurrent.OooO0OO;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import p236o00oOoo.o00OOO0O;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO<R> implements OooO0OO<R> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Job f29809Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o00OOOO0<R> f29810Oooo0oO;

    public o000oOoO(Job job) {
        o00OOOO0<R> underlying = new o00OOOO0<>();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f29809Oooo0o = job;
        this.f29810Oooo0oO = underlying;
        job.invokeOnCompletion(new Oooo0(this));
    }

    @Override // com.google.common.util.concurrent.OooO0OO
    public final void OooO00o(Runnable runnable, Executor executor) {
        this.f29810Oooo0oO.OooO00o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f29810Oooo0oO.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f29810Oooo0oO.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.f29810Oooo0oO.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f29810Oooo0oO.f34032Oooo0o instanceof o00OOO0O.OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f29810Oooo0oO.isDone();
    }
}
