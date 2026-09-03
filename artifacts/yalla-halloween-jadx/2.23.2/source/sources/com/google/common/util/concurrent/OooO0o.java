package com.google.common.util.concurrent;

import androidx.media3.session.o0O0ooO;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Oooo000;
import com.google.common.base.o0OoOo0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p284o0O0O0oo.o00000OO;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class OooO0o extends OooO {

    public static final class OooO00o<V> implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Future<V> f19309OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0OO<? super V> f19310OooO0o0;

        public OooO00o(Future future, o0O0ooO o0o0ooo) {
            this.f19309OooO0Oo = future;
            this.f19310OooO0o0 = o0o0ooo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thOooO00o;
            Future<V> future = this.f19309OooO0Oo;
            boolean z = future instanceof o00000OO;
            OooO0OO<? super V> oooO0OO = this.f19310OooO0o0;
            if (z && (thOooO00o = ((o00000OO) future).OooO00o()) != null) {
                oooO0OO.OooO00o(thOooO00o);
                return;
            }
            try {
                oooO0OO.onSuccess((Object) OooO0o.OooO00o(future));
            } catch (Error e) {
                e = e;
                oooO0OO.OooO00o(e);
            } catch (RuntimeException e2) {
                e = e2;
                oooO0OO.OooO00o(e);
            } catch (ExecutionException e3) {
                oooO0OO.OooO00o(e3.getCause());
            }
        }

        public final String toString() {
            Oooo000.OooO00o oooO00oOooO0O0 = Oooo000.OooO0O0(this);
            Oooo000.OooO00o.OooO0O0 oooO0O0 = new Oooo000.OooO00o.OooO0O0();
            oooO00oOooO0O0.f18603OooO0OO.f18606OooO0OO = oooO0O0;
            oooO00oOooO0O0.f18603OooO0OO = oooO0O0;
            oooO0O0.f18605OooO0O0 = this.f19310OooO0o0;
            return oooO00oOooO0O0.toString();
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V OooO00o(Future<V> future) throws ExecutionException {
        V v;
        o0OoOo0.OooOO0o("Future was expected to be done: %s", future, future.isDone());
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
}
