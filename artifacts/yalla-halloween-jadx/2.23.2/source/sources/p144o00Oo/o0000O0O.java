package p144o00Oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p154o00Oo0oo.o0OOO0o;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f37545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f37546OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @VisibleForTesting
    public final HashMap f37547OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ReferenceQueue<o000OO00<?>> f37548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f37549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000OO00.OooO00o f37550OooO0o0;

    @VisibleForTesting
    public static final class OooO00o extends WeakReference<o000OO00<?>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OOO0o f37551OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f37552OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00oOoo<?> f37553OooO0OO;

        public OooO00o(@NonNull o0OOO0o o0ooo0o2, @NonNull o000OO00<?> o000oo01, @NonNull ReferenceQueue<? super o000OO00<?>> referenceQueue, boolean z) {
            o00oOoo<?> o00oooo2;
            super(o000oo01, referenceQueue);
            o00OO00O.OooO0O0(o0ooo0o2);
            this.f37551OooO00o = o0ooo0o2;
            if (o000oo01.f37653OooO0Oo && z) {
                o00oooo2 = o000oo01.f37654OooO0o;
                o00OO00O.OooO0O0(o00oooo2);
            } else {
                o00oooo2 = null;
            }
            this.f37553OooO0OO = o00oooo2;
            this.f37552OooO0O0 = o000oo01.f37653OooO0Oo;
        }
    }

    public o0000O0O() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new o0000oo());
        this.f37547OooO0OO = new HashMap();
        this.f37548OooO0Oo = new ReferenceQueue<>();
        this.f37545OooO00o = false;
        this.f37546OooO0O0 = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new o0000O0(this));
    }

    public final synchronized void OooO00o(o0OOO0o o0ooo0o2, o000OO00<?> o000oo01) {
        OooO00o oooO00o = (OooO00o) this.f37547OooO0OO.put(o0ooo0o2, new OooO00o(o0ooo0o2, o000oo01, this.f37548OooO0Oo, this.f37545OooO00o));
        if (oooO00o != null) {
            oooO00o.f37553OooO0OO = null;
            oooO00o.clear();
        }
    }

    public final void OooO0O0(@NonNull OooO00o oooO00o) {
        o00oOoo<?> o00oooo2;
        synchronized (this) {
            this.f37547OooO0OO.remove(oooO00o.f37551OooO00o);
            if (oooO00o.f37552OooO0O0 && (o00oooo2 = oooO00o.f37553OooO0OO) != null) {
                this.f37550OooO0o0.OooO00o(oooO00o.f37551OooO00o, new o000OO00<>(o00oooo2, true, false, oooO00o.f37551OooO00o, this.f37550OooO0o0));
            }
        }
    }
}
