package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class o00OO0OO<T> implements oo00o<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<Object> f3730OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3729OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3731OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f3732OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final HashMap f3734OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public final CopyOnWriteArraySet<OooO0O0<T>> f3733OooO0o = new CopyOnWriteArraySet<>();

    @AutoValue
    public static abstract class OooO00o {
        @NonNull
        public abstract Throwable OooO00o();
    }

    public static final class OooO0O0<T> implements Runnable {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final Object f3735OooOO0O = new Object();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Executor f3737OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final oo00o.OooO00o<? super T> f3739OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final AtomicReference<Object> f3740OooO0oO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AtomicBoolean f3738OooO0o = new AtomicBoolean(true);

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f3741OooO0oo = f3735OooOO0O;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @GuardedBy("this")
        public int f3736OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f3742OooOO0 = false;

        public OooO0O0(@NonNull AtomicReference<Object> atomicReference, @NonNull Executor executor, @NonNull oo00o.OooO00o<? super T> oooO00o) {
            this.f3740OooO0oO = atomicReference;
            this.f3737OooO0Oo = executor;
            this.f3739OooO0o0 = oooO00o;
        }

        public final void OooO00o(int i) {
            synchronized (this) {
                if (this.f3738OooO0o.get()) {
                    if (i <= this.f3736OooO) {
                        return;
                    }
                    this.f3736OooO = i;
                    if (this.f3742OooOO0) {
                        return;
                    }
                    this.f3742OooOO0 = true;
                    try {
                        this.f3737OooO0Oo.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f3742OooOO0 = false;
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                if (!this.f3738OooO0o.get()) {
                    this.f3742OooOO0 = false;
                    return;
                }
                Object obj = this.f3740OooO0oO.get();
                int i = this.f3736OooO;
                while (true) {
                    if (!Objects.equals(this.f3741OooO0oo, obj)) {
                        this.f3741OooO0oo = obj;
                        if (obj instanceof OooO00o) {
                            this.f3739OooO0o0.onError(((OooO00o) obj).OooO00o());
                        } else {
                            this.f3739OooO0o0.OooO00o(obj);
                        }
                    }
                    synchronized (this) {
                        if (i == this.f3736OooO || !this.f3738OooO0o.get()) {
                            break;
                            break;
                        } else {
                            obj = this.f3740OooO0oO.get();
                            i = this.f3736OooO;
                        }
                    }
                }
                this.f3742OooOO0 = false;
            }
        }
    }

    public o00OO0OO(@Nullable Object obj) {
        this.f3730OooO0O0 = new AtomicReference<>(obj);
    }

    @Override // androidx.camera.core.impl.oo00o
    public final void OooO00o(@NonNull oo00o.OooO00o oooO00o, @NonNull Executor executor) {
        OooO0O0<T> oooO0O0;
        synchronized (this.f3729OooO00o) {
            try {
                OooO0O0 oooO0O1 = (OooO0O0) this.f3734OooO0o0.remove(oooO00o);
                if (oooO0O1 != null) {
                    oooO0O1.f3738OooO0o.set(false);
                    this.f3733OooO0o.remove(oooO0O1);
                }
                oooO0O0 = new OooO0O0<>(this.f3730OooO0O0, executor, oooO00o);
                this.f3734OooO0o0.put(oooO00o, oooO0O0);
                this.f3733OooO0o.add(oooO0O0);
            } catch (Throwable th) {
                throw th;
            }
        }
        oooO0O0.OooO00o(0);
    }

    @Override // androidx.camera.core.impl.oo00o
    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<T> OooO0O0() {
        Object obj = this.f3730OooO0O0.get();
        return obj instanceof OooO00o ? new OoooO.o000oOoO.OooO00o(((OooO00o) obj).OooO00o()) : p030OoooO.OooOo.OooO0Oo(obj);
    }

    @Override // androidx.camera.core.impl.oo00o
    public final void OooO0OO(@NonNull oo00o.OooO00o<? super T> oooO00o) {
        synchronized (this.f3729OooO00o) {
            OooO0O0 oooO0O0 = (OooO0O0) this.f3734OooO0o0.remove(oooO00o);
            if (oooO0O0 != null) {
                oooO0O0.f3738OooO0o.set(false);
                this.f3733OooO0o.remove(oooO0O0);
            }
        }
    }
}
