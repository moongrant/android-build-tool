package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o000OO.OooOOO0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class OooOOO<V> implements com.google.common.util.concurrent.OooO00o<V> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<V> f1364OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00O000.OooO00o<V> f1365OooO0o0;

    public class OooO00o implements o00O000.OooO0OO<V> {
        public OooO00o() {
        }

        @Override // o0ooOO0.o00O000.OooO0OO
        public final Object OooO0o0(@NonNull o00O000.OooO00o<V> oooO00o) {
            OooOOO oooOOO = OooOOO.this;
            OooOOO0.OooO0o("The result can only set once!", oooOOO.f1365OooO0o0 == null);
            oooOOO.f1365OooO0o0 = oooO00o;
            return "FutureChain[" + oooOOO + "]";
        }
    }

    public OooOOO(@NonNull com.google.common.util.concurrent.OooO00o<V> oooO00o) {
        oooO00o.getClass();
        this.f1364OooO0Oo = oooO00o;
    }

    @NonNull
    public static <V> OooOOO<V> OooO00o(@NonNull com.google.common.util.concurrent.OooO00o<V> oooO00o) {
        return oooO00o instanceof OooOOO ? (OooOOO) oooO00o : new OooOOO<>(oooO00o);
    }

    @Override // com.google.common.util.concurrent.OooO00o
    public final void OooO(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f1364OooO0Oo.OooO(runnable, executor);
    }

    final boolean OooO0O0(@NonNull Throwable th) {
        o00O000.OooO00o<V> oooO00o = this.f1365OooO0o0;
        if (oooO00o != null) {
            return oooO00o.OooO0OO(th);
        }
        return false;
    }

    @NonNull
    public final <T> OooOOO<T> OooO0OO(@NonNull OooOO0<? super V, T> oooOO1, @NonNull Executor executor) {
        OooOO0O oooOO0O = new OooOO0O(oooOO1, this);
        OooO(oooOO0O, executor);
        return oooOO0O;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f1364OooO0Oo.cancel(z);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws ExecutionException, InterruptedException {
        return this.f1364OooO0Oo.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1364OooO0Oo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1364OooO0Oo.isDone();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f1364OooO0Oo.get(j, timeUnit);
    }

    public OooOOO() {
        this.f1364OooO0Oo = o00O000.OooO00o(new OooO00o());
    }
}
