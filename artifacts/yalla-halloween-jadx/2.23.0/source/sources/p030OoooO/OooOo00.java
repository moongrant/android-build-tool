package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import o000OO.OooOOO0;
import p022Oooo00O.o000O00O;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f1370OooO00o = new OooO00o();

    public class OooO00o implements Function<Object, Object> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }

    public static final class OooO0O0<V> implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Future<V> f1371OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooOOO0<? super V> f1372OooO0o0;

        public OooO0O0(Future<V> future, OooOOO0<? super V> oooOOO0) {
            this.f1371OooO0Oo = future;
            this.f1372OooO0o0 = oooOOO0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0<? super V> oooOOO0 = this.f1372OooO0o0;
            try {
                oooOOO0.onSuccess((Object) OooOo00.OooO0O0(this.f1371OooO0Oo));
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
            return OooO0O0.class.getSimpleName() + "," + this.f1372OooO0o0;
        }
    }

    @NonNull
    public static o00Oo0 OooO00o(@NonNull List list) {
        return new o00Oo0(new ArrayList(list), true, o00oO0o.OooO00o());
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
    public static Oooo0.OooO0OO OooO0Oo(@Nullable Object obj) {
        return obj == null ? Oooo0.OooO0OO.f1374OooO0o0 : new Oooo0.OooO0OO(obj);
    }

    public static void OooO0o(boolean z, @NonNull com.google.common.util.concurrent.OooO00o oooO00o, @NonNull o00O000.OooO00o oooO00o2, @NonNull o0ooOOo o0ooooo) {
        oooO00o.getClass();
        oooO00o2.getClass();
        o0ooooo.getClass();
        oooO00o.OooO(new OooO0O0(oooO00o, new OooOo(oooO00o2)), o0ooooo);
        if (z) {
            oooO00o2.OooO00o(new Oooo000(oooO00o), o00oO0o.OooO00o());
        }
    }

    @NonNull
    public static <V> com.google.common.util.concurrent.OooO00o<V> OooO0o0(@NonNull com.google.common.util.concurrent.OooO00o<V> oooO00o) {
        oooO00o.getClass();
        return oooO00o.isDone() ? oooO00o : o00O000.OooO00o(new o000O00O(oooO00o, 1));
    }

    @NonNull
    public static o00Oo0 OooO0oO(@NonNull List list) {
        return new o00Oo0(new ArrayList(list), false, o00oO0o.OooO00o());
    }

    @NonNull
    public static OooOO0O OooO0oo(@NonNull com.google.common.util.concurrent.OooO00o oooO00o, @NonNull Function function, @NonNull Executor executor) {
        OooOO0O oooOO0O = new OooOO0O(new OooOOOO(function), oooO00o);
        oooO00o.OooO(oooOO0O, executor);
        return oooOO0O;
    }
}
