package p084o000Ooo0;

import com.google.common.util.concurrent.OooO00o;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import p094o000o0Oo.o0000O00;
import p094o000o0Oo.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0<R> implements OooO00o<R> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Job f35106OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000O00<R> f35107OooO0o0;

    public Oooo0(CompletableJob job) {
        o0000O00<R> underlying = new o0000O00<>();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f35106OooO0Oo = job;
        this.f35107OooO0o0 = underlying;
        job.invokeOnCompletion(new Oooo000(this));
    }

    @Override // com.google.common.util.concurrent.OooO00o
    public final void OooO(Runnable runnable, Executor executor) {
        this.f35107OooO0o0.OooO(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f35107OooO0o0.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f35107OooO0o0.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f35107OooO0o0.f35363OooO0Oo instanceof o0000Ooo.OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f35107OooO0o0.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.f35107OooO0o0.get(j, timeUnit);
    }
}
