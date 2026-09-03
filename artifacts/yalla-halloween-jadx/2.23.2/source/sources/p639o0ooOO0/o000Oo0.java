package p639o0ooOO0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.OooOO0O;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 {

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f57736OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0o<T> f57737OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000O0<Void> f57738OooO0OO = new o000O0<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f57739OooO0Oo;

        public final void OooO00o(@NonNull Runnable runnable, @NonNull Executor executor) {
            o000O0<Void> o000o0 = this.f57738OooO0OO;
            if (o000o0 != null) {
                o000o0.OooO0oo(runnable, executor);
            }
        }

        public final boolean OooO0O0(T t) {
            this.f57739OooO0Oo = true;
            OooO0o<T> oooO0o = this.f57737OooO0O0;
            boolean z = oooO0o != null && oooO0o.f57741OooO0o0.OooOO0(t);
            if (z) {
                this.f57736OooO00o = null;
                this.f57737OooO0O0 = null;
                this.f57738OooO0OO = null;
            }
            return z;
        }

        public final boolean OooO0OO(@NonNull Throwable th) {
            this.f57739OooO0Oo = true;
            OooO0o<T> oooO0o = this.f57737OooO0O0;
            boolean z = oooO0o != null && oooO0o.f57741OooO0o0.OooOO0O(th);
            if (z) {
                this.f57736OooO00o = null;
                this.f57737OooO0O0 = null;
                this.f57738OooO0OO = null;
            }
            return z;
        }

        public final void finalize() {
            o000O0<Void> o000o0;
            OooO0o<T> oooO0o = this.f57737OooO0O0;
            if (oooO0o != null && !oooO0o.isDone()) {
                oooO0o.f57741OooO0o0.OooOO0O(new OooO0O0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f57736OooO00o));
            }
            if (this.f57739OooO0Oo || (o000o0 = this.f57738OooO0OO) == null) {
                return;
            }
            o000o0.OooOO0(null);
        }
    }

    public static final class OooO0O0 extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface OooO0OO<T> {
        @Nullable
        Object OooO0o0(@NonNull OooO00o<T> oooO00o) throws Exception;
    }

    public static final class OooO0o<T> implements OooOO0O<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference<OooO00o<T>> f57740OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO00o f57741OooO0o0 = new OooO00o();

        public class OooO00o extends o000O0o<T> {
            public OooO00o() {
            }

            @Override // p639o0ooOO0.o000O0o
            public final String OooO0oO() {
                OooO00o<T> oooO00o = OooO0o.this.f57740OooO0Oo.get();
                if (oooO00o == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + oooO00o.f57736OooO00o + "]";
            }
        }

        public OooO0o(OooO00o<T> oooO00o) {
            this.f57740OooO0Oo = new WeakReference<>(oooO00o);
        }

        @Override // com.google.common.util.concurrent.OooOO0O
        public final void OooO0oo(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f57741OooO0o0.OooO0oo(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            OooO00o<T> oooO00o = this.f57740OooO0Oo.get();
            boolean zCancel = this.f57741OooO0o0.cancel(z);
            if (zCancel && oooO00o != null) {
                oooO00o.f57736OooO00o = null;
                oooO00o.f57737OooO0O0 = null;
                oooO00o.f57738OooO0OO.OooOO0(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() throws ExecutionException, InterruptedException {
            return this.f57741OooO0o0.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f57741OooO0o0.f57716OooO0Oo instanceof o000O0o.OooO0O0;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f57741OooO0o0.isDone();
        }

        public final String toString() {
            return this.f57741OooO0o0.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f57741OooO0o0.get(j, timeUnit);
        }
    }

    @NonNull
    public static OooO0o OooO00o(@NonNull OooO0OO oooO0OO) {
        OooO00o oooO00o = new OooO00o();
        OooO0o<T> oooO0o = new OooO0o<>(oooO00o);
        oooO00o.f57737OooO0O0 = oooO0o;
        oooO00o.f57736OooO00o = oooO0OO.getClass();
        try {
            Object objOooO0o0 = oooO0OO.OooO0o0(oooO00o);
            if (objOooO0o0 != null) {
                oooO00o.f57736OooO00o = objOooO0o0;
            }
        } catch (Exception e) {
            oooO0o.f57741OooO0o0.OooOO0O(e);
        }
        return oooO0o;
    }
}
