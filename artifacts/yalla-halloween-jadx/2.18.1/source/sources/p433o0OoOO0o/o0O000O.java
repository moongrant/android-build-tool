package p433o0OoOO0o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p433o0OoOO0o.o0O00OO;
import p434o0OoOOO.o0000;
import p434o0OoOOO.o0000O00;
import p434o0OoOOO.o0000Ooo;
import p434o0OoOOO.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000O<T extends o0O00OO> implements o0O00OOO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000Ooo f39926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo<T> f39927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap<Long, T> f39928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentHashMap<Long, o0000O00<T>> f39929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicReference<T> f39930OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O00<T> f39931OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f39932OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f39933OooO0oo;

    public o0O000O(o0000Ooo o0000ooo, o0000oo<T> o0000ooVar, String str, String str2) {
        ConcurrentHashMap<Long, T> concurrentHashMap = new ConcurrentHashMap<>(1);
        ConcurrentHashMap<Long, o0000O00<T>> concurrentHashMap2 = new ConcurrentHashMap<>(1);
        o0000O00<T> o0000o00 = new o0000O00<>(o0000ooo, o0000ooVar, str);
        this.f39933OooO0oo = true;
        this.f39926OooO00o = o0000ooo;
        this.f39927OooO0O0 = o0000ooVar;
        this.f39928OooO0OO = concurrentHashMap;
        this.f39929OooO0Oo = concurrentHashMap2;
        this.f39931OooO0o0 = o0000o00;
        this.f39930OooO0o = new AtomicReference<>();
        this.f39932OooO0oO = str2;
    }

    public final void OooO00o() {
        OooO0o0();
        if (this.f39930OooO0o.get() != null) {
            OooO0O0(this.f39930OooO0o.get().OooO0O0());
        }
    }

    public final void OooO0O0(long j) {
        OooO0o0();
        if (this.f39930OooO0o.get() != null && this.f39930OooO0o.get().OooO0O0() == j) {
            synchronized (this) {
                this.f39930OooO0o.set(null);
                o0000O00<T> o0000o00 = this.f39931OooO0o0;
                ((o0000) o0000o00.f39968OooO00o).f39967OooO00o.edit().remove(o0000o00.f39970OooO0OO).commit();
            }
        }
        this.f39928OooO0OO.remove(Long.valueOf(j));
        o0000O00<T> o0000o00Remove = this.f39929OooO0Oo.remove(Long.valueOf(j));
        if (o0000o00Remove != null) {
            ((o0000) o0000o00Remove.f39968OooO00o).f39967OooO00o.edit().remove(o0000o00Remove.f39970OooO0OO).commit();
        }
    }

    public final T OooO0OO() {
        OooO0o0();
        return this.f39930OooO0o.get();
    }

    public final void OooO0Oo(long j, T t, boolean z) {
        this.f39928OooO0OO.put(Long.valueOf(j), t);
        o0000O00<T> o0000o00 = this.f39929OooO0Oo.get(Long.valueOf(j));
        if (o0000o00 == null) {
            o0000o00 = new o0000O00<>(this.f39926OooO00o, this.f39927OooO0O0, this.f39932OooO0oO + "_" + j);
            this.f39929OooO0Oo.putIfAbsent(Long.valueOf(j), o0000o00);
        }
        o0000o00.OooO00o(t);
        T t2 = this.f39930OooO0o.get();
        if (t2 == null || t2.OooO0O0() == j || z) {
            synchronized (this) {
                this.f39930OooO0o.compareAndSet(t2, t);
                this.f39931OooO0o0.OooO00o(t);
            }
        }
    }

    public final void OooO0o() {
        T tOooO00o;
        for (Map.Entry<String, ?> entry : ((o0000) this.f39926OooO00o).f39967OooO00o.getAll().entrySet()) {
            if (entry.getKey().startsWith(this.f39932OooO0oO) && (tOooO00o = this.f39927OooO0O0.OooO00o((String) entry.getValue())) != null) {
                OooO0Oo(tOooO00o.OooO0O0(), tOooO00o, false);
            }
        }
    }

    public final void OooO0o0() {
        if (this.f39933OooO0oo) {
            synchronized (this) {
                if (this.f39933OooO0oo) {
                    o0000O00<T> o0000o00 = this.f39931OooO0o0;
                    T tOooO00o = o0000o00.f39969OooO0O0.OooO00o(((o0000) o0000o00.f39968OooO00o).f39967OooO00o.getString(o0000o00.f39970OooO0OO, null));
                    if (tOooO00o != null) {
                        OooO0Oo(tOooO00o.OooO0O0(), tOooO00o, false);
                    }
                    OooO0o();
                    this.f39933OooO0oo = false;
                }
            }
        }
    }

    public final void OooO0oO(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Session must not be null!");
        }
        OooO0o0();
        OooO0Oo(t.OooO0O0(), t, true);
    }
}
