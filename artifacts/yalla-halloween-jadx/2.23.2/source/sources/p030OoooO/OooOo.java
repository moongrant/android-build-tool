package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import o000OO.OooOOO0;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f1338OooO00o = new OooO00o();

    public class OooO00o implements Function<Object, Object> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }

    public static final class OooO0O0<V> implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Future<V> f1339OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooOOO0<? super V> f1340OooO0o0;

        public OooO0O0(Future<V> future, OooOOO0<? super V> oooOOO0) {
            this.f1339OooO0Oo = future;
            this.f1340OooO0o0 = oooOOO0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0<? super V> oooOOO0 = this.f1340OooO0o0;
            try {
                oooOOO0.onSuccess((Object) OooOo.OooO0O0(this.f1339OooO0Oo));
            } catch (Error e) {
                e = e;
                oooOOO0.OooO00o(e);
            } catch (RuntimeException e2) {
                e = e2;
                oooOOO0.OooO00o(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    oooOOO0.OooO00o(e3);
                } else {
                    oooOOO0.OooO00o(cause);
                }
            }
        }

        public final String toString() {
            return OooO0O0.class.getSimpleName() + "," + this.f1340OooO0o0;
        }
    }

    @NonNull
    public static o00Ooo OooO00o(@NonNull List list) {
        return new o00Ooo(new ArrayList(list), true, o00oO0o.OooO00o());
    }

    @Nullable
    public static <V> V OooO0O0(@NonNull Future<V> future) throws ExecutionException {
        OooOOO0.OooO0o("Future was expected to be done, " + future, future.isDone());
        return (V) OooO0OO(future);
    }

    @Nullable
    public static <V> V OooO0OO(@NonNull Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @NonNull
    public static o000oOoO.OooO0OO OooO0Oo(@Nullable Object obj) {
        return obj == null ? o000oOoO.OooO0OO.f1346OooO0o0 : new o000oOoO.OooO0OO(obj);
    }

    public static void OooO0o(boolean z, @NonNull OooOO0O oooOO0O, @NonNull o000Oo0.OooO00o oooO00o, @NonNull o0ooOOo o0ooooo) {
        oooOO0O.getClass();
        oooO00o.getClass();
        o0ooooo.getClass();
        oooOO0O.OooO0oo(new OooO0O0(oooOO0O, new Oooo000(oooO00o)), o0ooooo);
        if (z) {
            oooO00o.OooO00o(new Oooo0(oooOO0O), o00oO0o.OooO00o());
        }
    }

    @NonNull
    public static <V> OooOO0O<V> OooO0o0(@NonNull OooOO0O<V> oooOO0O) {
        oooOO0O.getClass();
        return oooOO0O.isDone() ? oooOO0O : o000Oo0.OooO00o(new OooOOOO(oooOO0O));
    }

    @NonNull
    public static o00Ooo OooO0oO(@NonNull List list) {
        return new o00Ooo(new ArrayList(list), false, o00oO0o.OooO00o());
    }

    @NonNull
    public static OooOO0O OooO0oo(@NonNull OooOO0O oooOO0O, @NonNull Function function, @NonNull Executor executor) {
        OooOO0O oooOO0O2 = new OooOO0O(new OooOo00(function), oooOO0O);
        oooOO0O.OooO0oo(oooOO0O2, executor);
        return oooOO0O2;
    }
}
