package p214o00oO0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f33401OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f33402OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @VisibleForTesting
    public final Map<o000000, OooO00o> f33403OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ReferenceQueue<o00OO<?>> f33404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f33405OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00OO.OooO00o f33406OooO0o0;

    @VisibleForTesting
    public static final class OooO00o extends WeakReference<o00OO<?>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000 f33407OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f33408OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00OOOO0<?> f33409OooO0OO;

        public OooO00o(@NonNull o000000 o000000Var, @NonNull o00OO<?> o00oo2, @NonNull ReferenceQueue<? super o00OO<?>> referenceQueue, boolean z) {
            o00OOOO0<?> o00oooo1;
            super(o00oo2, referenceQueue);
            Objects.requireNonNull(o000000Var, "Argument must not be null");
            this.f33407OooO00o = o000000Var;
            if (o00oo2.f33434Oooo0o && z) {
                o00oooo1 = o00oo2.f33436Oooo0oo;
                Objects.requireNonNull(o00oooo1, "Argument must not be null");
            } else {
                o00oooo1 = null;
            }
            this.f33409OooO0OO = o00oooo1;
            this.f33408OooO0O0 = o00oo2.f33434Oooo0o;
        }
    }

    public o00O00o0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new oOO00O());
        this.f33403OooO0OO = new HashMap();
        this.f33404OooO0Oo = new ReferenceQueue<>();
        this.f33401OooO00o = false;
        this.f33402OooO0O0 = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new o00O00OO(this));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<o00oO00o.o000000, o00oO0.o00O00o0$OooO00o>] */
    public final synchronized void OooO00o(o000000 o000000Var, o00OO<?> o00oo2) {
        OooO00o oooO00o = (OooO00o) this.f33403OooO0OO.put(o000000Var, new OooO00o(o000000Var, o00oo2, this.f33404OooO0Oo, this.f33401OooO00o));
        if (oooO00o != null) {
            oooO00o.f33409OooO0OO = null;
            oooO00o.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<o00oO00o.o000000, o00oO0.o00O00o0$OooO00o>] */
    public final void OooO0O0(@NonNull OooO00o oooO00o) {
        o00OOOO0<?> o00oooo1;
        synchronized (this) {
            this.f33403OooO0OO.remove(oooO00o.f33407OooO00o);
            if (oooO00o.f33408OooO0O0 && (o00oooo1 = oooO00o.f33409OooO0OO) != null) {
                this.f33406OooO0o0.OooO00o(oooO00o.f33407OooO00o, new o00OO<>(o00oooo1, true, false, oooO00o.f33407OooO00o, this.f33406OooO0o0));
            }
        }
    }
}
