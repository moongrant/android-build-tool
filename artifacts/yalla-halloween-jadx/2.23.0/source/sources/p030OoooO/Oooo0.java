package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class Oooo0<V> implements com.google.common.util.concurrent.OooO00o<V> {

    public static class OooO00o<V> extends Oooo0<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final Throwable f1373OooO0Oo;

        public OooO00o(@NonNull Throwable th) {
            this.f1373OooO0Oo = th;
        }

        @Override // java.util.concurrent.Future
        @Nullable
        public final V get() throws ExecutionException {
            throw new ExecutionException(this.f1373OooO0Oo);
        }

        @NonNull
        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f1373OooO0Oo + "]]";
        }
    }

    public static final class OooO0O0<V> extends OooO00o<V> implements ScheduledFuture<V> {
        public OooO0O0(@NonNull RejectedExecutionException rejectedExecutionException) {
            super(rejectedExecutionException);
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(@NonNull Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(@NonNull TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class OooO0OO<V> extends Oooo0<V> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO0OO f1374OooO0o0 = new OooO0OO(null);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final V f1375OooO0Oo;

        public OooO0OO(@Nullable V v) {
            this.f1375OooO0Oo = v;
        }

        @Override // java.util.concurrent.Future
        @Nullable
        public final V get() {
            return this.f1375OooO0Oo;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f1375OooO0Oo + "]]";
        }
    }

    @Override // com.google.common.util.concurrent.OooO00o
    public final void OooO(@NonNull Runnable runnable, @NonNull Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            o00O0O0.OooO0OO("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
