package p091o000o00o;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O<T> extends LiveData<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f29178OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Callable<T> f29180OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000 f29181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OO f29183OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f29182OooO0o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f29184OooO0oO = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f29185OooO0oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o f29177OooO = new OooO00o();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0 f29186OooOO0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f29179OooO0O0 = false;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0057 */
        @Override // java.lang.Runnable
        @WorkerThread
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z;
            if (o0000O0O.this.f29185OooO0oo.compareAndSet(false, true)) {
                o0000O0O o0000o0o2 = o0000O0O.this;
                o00000O0 o00000o1 = o0000o0o2.f29178OooO00o.f9295OooO0o0;
                o000OO o000oo2 = o0000o0o2.f29183OooO0o0;
                Objects.requireNonNull(o00000o1);
                o00000o1.OooO00o(new o00000O0.OooO(o00000o1, o000oo2));
            }
            do {
                if (o0000O0O.this.f29184OooO0oO.compareAndSet(false, true)) {
                    T tCall = null;
                    z = false;
                    while (o0000O0O.this.f29182OooO0o.compareAndSet(true, false)) {
                        try {
                            tCall = o0000O0O.this.f29180OooO0OO.call();
                            z = true;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    }
                    if (z) {
                        o0000O0O.this.postValue(tCall);
                    }
                    o0000O0O.this.f29184OooO0oO.set(false);
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (o0000O0O.this.f29182OooO0o.get());
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public final void run() {
            boolean zHasActiveObservers = o0000O0O.this.hasActiveObservers();
            if (o0000O0O.this.f29182OooO0o.compareAndSet(false, true) && zHasActiveObservers) {
                o0000O0O o0000o0o2 = o0000O0O.this;
                (o0000o0o2.f29179OooO0O0 ? o0000o0o2.f29178OooO00o.f9292OooO0OO : o0000o0o2.f29178OooO00o.f9291OooO0O0).execute(o0000o0o2.f29177OooO);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public o0000O0O(RoomDatabase roomDatabase, o00000 o00000Var, Callable callable, String[] strArr) {
        this.f29178OooO00o = roomDatabase;
        this.f29180OooO0OO = callable;
        this.f29181OooO0Oo = o00000Var;
        this.f29183OooO0o0 = new o000OO(this, strArr);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        this.f29181OooO0Oo.f29118OooO00o.add(this);
        (this.f29179OooO0O0 ? this.f29178OooO00o.f9292OooO0OO : this.f29178OooO00o.f9291OooO0O0).execute(this.f29177OooO);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        this.f29181OooO0Oo.f29118OooO00o.remove(this);
    }
}
