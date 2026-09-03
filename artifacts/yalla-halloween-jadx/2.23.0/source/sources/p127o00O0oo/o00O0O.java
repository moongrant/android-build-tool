package p127o00O0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f36822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f36823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @VisibleForTesting
    public final HashMap f36824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ReferenceQueue<o00000<?>> f36825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f36826OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00000.OooO00o f36827OooO0o0;

    @VisibleForTesting
    public static final class OooO00o extends WeakReference<o00000<?>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo f36828OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f36829OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o0000<?> f36830OooO0OO;

        public OooO00o(@NonNull o000OOo o000ooo2, @NonNull o00000<?> o00000Var, @NonNull ReferenceQueue<? super o00000<?>> referenceQueue, boolean z) {
            o0000<?> o0000Var;
            super(o00000Var, referenceQueue);
            o0000O00.OooO0O0(o000ooo2);
            this.f36828OooO00o = o000ooo2;
            if (o00000Var.f36733OooO0Oo && z) {
                o0000Var = o00000Var.f36734OooO0o;
                o0000O00.OooO0O0(o0000Var);
            } else {
                o0000Var = null;
            }
            this.f36830OooO0OO = o0000Var;
            this.f36829OooO0O0 = o00000Var.f36733OooO0Oo;
        }
    }

    public o00O0O() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new o000oOoO());
        this.f36824OooO0OO = new HashMap();
        this.f36825OooO0Oo = new ReferenceQueue<>();
        this.f36822OooO00o = false;
        this.f36823OooO0O0 = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new o0OoOo0(this));
    }

    public final synchronized void OooO00o(o000OOo o000ooo2, o00000<?> o00000Var) {
        OooO00o oooO00o = (OooO00o) this.f36824OooO0OO.put(o000ooo2, new OooO00o(o000ooo2, o00000Var, this.f36825OooO0Oo, this.f36822OooO00o));
        if (oooO00o != null) {
            oooO00o.f36830OooO0OO = null;
            oooO00o.clear();
        }
    }

    public final void OooO0O0(@NonNull OooO00o oooO00o) {
        o0000<?> o0000Var;
        synchronized (this) {
            this.f36824OooO0OO.remove(oooO00o.f36828OooO00o);
            if (oooO00o.f36829OooO0O0 && (o0000Var = oooO00o.f36830OooO0OO) != null) {
                this.f36827OooO0o0.OooO00o(oooO00o.f36828OooO00o, new o00000<>(o0000Var, true, false, oooO00o.f36828OooO00o, this.f36827OooO0o0));
            }
        }
    }
}
