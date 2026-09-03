package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O000o<T> implements oo00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MutableLiveData<OooO0O0<T>> f3714OooO00o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mObservers")
    public final HashMap f3715OooO0O0 = new HashMap();

    public static final class OooO00o<T> implements Observer<OooO0O0<T>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicBoolean f3716OooO0Oo = new AtomicBoolean(true);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Executor f3717OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final oo00o.OooO00o<? super T> f3718OooO0o0;

        public OooO00o(@NonNull oo00o.OooO00o oooO00o, @NonNull Executor executor) {
            this.f3717OooO0o = executor;
            this.f3718OooO0o0 = oooO00o;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NonNull Object obj) {
            this.f3717OooO0o.execute(new o00O000(0, this, (OooO0O0) obj));
        }
    }

    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final T f3719OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Throwable f3720OooO0O0 = null;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(@Nullable CameraInternal.State state) {
            this.f3719OooO00o = state;
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[Result: <");
            Throwable th = this.f3720OooO0O0;
            if (th == null) {
                str = "Value: " + this.f3719OooO00o;
            } else {
                str = "Error: " + th;
            }
            return o0oOO.OooO0O0(sb, str, ">]");
        }
    }

    @Override // androidx.camera.core.impl.oo00o
    public final void OooO00o(@NonNull oo00o.OooO00o oooO00o, @NonNull Executor executor) {
        synchronized (this.f3715OooO0O0) {
            final OooO00o oooO00o2 = (OooO00o) this.f3715OooO0O0.get(oooO00o);
            if (oooO00o2 != null) {
                oooO00o2.f3716OooO0Oo.set(false);
            }
            final OooO00o oooO00o3 = new OooO00o(oooO00o, executor);
            this.f3715OooO0O0.put(oooO00o, oooO00o3);
            p033OoooO0O.o00oO0o.OooO0OO().execute(new Runnable() { // from class: androidx.camera.core.impl.o00O0000
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // java.lang.Runnable
                public final void run() {
                    MutableLiveData<o00O000o.OooO0O0<T>> mutableLiveData = this.f3711OooO0Oo.f3714OooO00o;
                    o00O000o.OooO00o oooO00o4 = oooO00o2;
                    if (oooO00o4 != null) {
                        mutableLiveData.removeObserver(oooO00o4);
                    }
                    mutableLiveData.observeForever(oooO00o3);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.oo00o
    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<T> OooO0O0() {
        return p639o0ooOO0.o000Oo0.OooO00o(new o000OOo0(this));
    }

    @Override // androidx.camera.core.impl.oo00o
    public final void OooO0OO(@NonNull oo00o.OooO00o<? super T> oooO00o) {
        synchronized (this.f3715OooO0O0) {
            final OooO00o oooO00o2 = (OooO00o) this.f3715OooO0O0.remove(oooO00o);
            if (oooO00o2 != null) {
                oooO00o2.f3716OooO0Oo.set(false);
                p033OoooO0O.o00oO0o.OooO0OO().execute(new Runnable() { // from class: androidx.camera.core.impl.o00
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3635OooO0Oo.f3714OooO00o.removeObserver(oooO00o2);
                    }
                });
            }
        }
    }
}
