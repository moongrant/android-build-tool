package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.o000oOoO;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O<T extends o000oOoO> implements o0OoOo0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p348o0OOOOo.OooOOO0 f21494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p348o0OOOOo.OooOo00<T> f21495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap<Long, T> f21496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentHashMap<Long, p348o0OOOOo.OooOOOO<T>> f21497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicReference<T> f21498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p348o0OOOOo.OooOOOO<T> f21499OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f21500OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f21501OooO0oo;

    public OooOO0O(p348o0OOOOo.OooOOO oooOOO, p348o0OOOOo.OooOo00 oooOo00, String str, String str2) {
        ConcurrentHashMap<Long, T> concurrentHashMap = new ConcurrentHashMap<>(1);
        ConcurrentHashMap<Long, p348o0OOOOo.OooOOOO<T>> concurrentHashMap2 = new ConcurrentHashMap<>(1);
        p348o0OOOOo.OooOOOO<T> oooOOOO = new p348o0OOOOo.OooOOOO<>(oooOOO, oooOo00, str);
        this.f21501OooO0oo = true;
        this.f21494OooO00o = oooOOO;
        this.f21495OooO0O0 = oooOo00;
        this.f21496OooO0OO = concurrentHashMap;
        this.f21497OooO0Oo = concurrentHashMap2;
        this.f21499OooO0o0 = oooOOOO;
        this.f21498OooO0o = new AtomicReference<>();
        this.f21500OooO0oO = str2;
    }

    public final void OooO00o() {
        OooO0o0();
        AtomicReference<T> atomicReference = this.f21498OooO0o;
        if (atomicReference.get() != null) {
            OooO0O0(atomicReference.get().OooO0O0());
        }
    }

    public final void OooO0O0(long j) {
        OooO0o0();
        if (this.f21498OooO0o.get() != null && this.f21498OooO0o.get().OooO0O0() == j) {
            synchronized (this) {
                this.f21498OooO0o.set(null);
                p348o0OOOOo.OooOOOO<T> oooOOOO = this.f21499OooO0o0;
                ((p348o0OOOOo.OooOOO) oooOOOO.f42847OooO00o).f42846OooO00o.edit().remove(oooOOOO.f42849OooO0OO).commit();
            }
        }
        this.f21496OooO0OO.remove(Long.valueOf(j));
        p348o0OOOOo.OooOOOO<T> oooOOOORemove = this.f21497OooO0Oo.remove(Long.valueOf(j));
        if (oooOOOORemove != null) {
            ((p348o0OOOOo.OooOOO) oooOOOORemove.f42847OooO00o).f42846OooO00o.edit().remove(oooOOOORemove.f42849OooO0OO).commit();
        }
    }

    public final T OooO0OO() {
        OooO0o0();
        return this.f21498OooO0o.get();
    }

    public final void OooO0Oo(long j, T t, boolean z) {
        this.f21496OooO0OO.put(Long.valueOf(j), t);
        p348o0OOOOo.OooOOOO<T> oooOOOO = this.f21497OooO0Oo.get(Long.valueOf(j));
        if (oooOOOO == null) {
            oooOOOO = new p348o0OOOOo.OooOOOO<>(this.f21494OooO00o, this.f21495OooO0O0, this.f21500OooO0oO + "_" + j);
            this.f21497OooO0Oo.putIfAbsent(Long.valueOf(j), oooOOOO);
        }
        oooOOOO.OooO00o(t);
        T t2 = this.f21498OooO0o.get();
        if (t2 == null || t2.OooO0O0() == j || z) {
            synchronized (this) {
                AtomicReference<T> atomicReference = this.f21498OooO0o;
                while (!atomicReference.compareAndSet(t2, t) && atomicReference.get() == t2) {
                }
                this.f21499OooO0o0.OooO00o(t);
            }
        }
    }

    public final void OooO0o() {
        for (Map.Entry<String, ?> entry : ((p348o0OOOOo.OooOOO) this.f21494OooO00o).f42846OooO00o.getAll().entrySet()) {
            if (entry.getKey().startsWith(this.f21500OooO0oO)) {
                T tOooO00o = this.f21495OooO0O0.OooO00o((String) entry.getValue());
                if (tOooO00o != null) {
                    OooO0Oo(tOooO00o.OooO0O0(), tOooO00o, false);
                }
            }
        }
    }

    public final void OooO0o0() {
        if (this.f21501OooO0oo) {
            synchronized (this) {
                if (this.f21501OooO0oo) {
                    p348o0OOOOo.OooOOOO<T> oooOOOO = this.f21499OooO0o0;
                    T tOooO00o = oooOOOO.f42848OooO0O0.OooO00o(((p348o0OOOOo.OooOOO) oooOOOO.f42847OooO00o).f42846OooO00o.getString(oooOOOO.f42849OooO0OO, null));
                    if (tOooO00o != null) {
                        OooO0Oo(tOooO00o.OooO0O0(), tOooO00o, false);
                    }
                    OooO0o();
                    this.f21501OooO0oo = false;
                }
            }
        }
    }
}
