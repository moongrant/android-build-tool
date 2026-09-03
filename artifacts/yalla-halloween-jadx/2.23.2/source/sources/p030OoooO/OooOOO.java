package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooOO0O;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o000OO.OooOOO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class OooOOO<V> implements OooOO0O<V> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooOO0O<V> f1334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000Oo0.OooO00o<V> f1335OooO0o0;

    public class OooO00o implements o000Oo0.OooO0OO<V> {
        public OooO00o() {
        }

        @Override // o0ooOO0.o000Oo0.OooO0OO
        public final Object OooO0o0(@NonNull o000Oo0.OooO00o<V> oooO00o) {
            OooOOO oooOOO = OooOOO.this;
            OooOOO0.OooO0o("The result can only set once!", oooOOO.f1335OooO0o0 == null);
            oooOOO.f1335OooO0o0 = oooO00o;
            return "FutureChain[" + oooOOO + "]";
        }
    }

    public OooOOO(@NonNull OooOO0O<V> oooOO0O) {
        oooOO0O.getClass();
        this.f1334OooO0Oo = oooOO0O;
    }

    @NonNull
    public static <V> OooOOO<V> OooO00o(@NonNull OooOO0O<V> oooOO0O) {
        return oooOO0O instanceof OooOOO ? (OooOOO) oooOO0O : new OooOOO<>(oooOO0O);
    }

    final boolean OooO0O0(@NonNull Throwable th) {
        o000Oo0.OooO00o<V> oooO00o = this.f1335OooO0o0;
        if (oooO00o != null) {
            return oooO00o.OooO0OO(th);
        }
        return false;
    }

    @NonNull
    public final <T> OooOOO<T> OooO0OO(@NonNull OooOO0<? super V, T> oooOO1, @NonNull Executor executor) {
        OooOO0O oooOO0O = new OooOO0O(oooOO1, this);
        OooO0oo(oooOO0O, executor);
        return oooOO0O;
    }

    @Override // com.google.common.util.concurrent.OooOO0O
    public final void OooO0oo(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f1334OooO0Oo.OooO0oo(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f1334OooO0Oo.cancel(z);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws ExecutionException, InterruptedException {
        return this.f1334OooO0Oo.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1334OooO0Oo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1334OooO0Oo.isDone();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f1334OooO0Oo.get(j, timeUnit);
    }

    public OooOOO() {
        this.f1334OooO0Oo = o000Oo0.OooO00o(new OooO00o());
    }
}
