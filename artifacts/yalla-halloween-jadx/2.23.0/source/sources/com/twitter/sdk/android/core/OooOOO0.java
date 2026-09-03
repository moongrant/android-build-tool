package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.o0OoOo0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0<T extends o0OoOo0> implements o00O0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p344o0OOOOOo.OooOO0O f21967OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p344o0OOOOOo.OooOOOO<T> f21968OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap<Long, T> f21969OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentHashMap<Long, p344o0OOOOOo.OooOOO<T>> f21970OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicReference<T> f21971OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p344o0OOOOOo.OooOOO<T> f21972OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f21973OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f21974OooO0oo;

    public OooOOO0(p344o0OOOOOo.OooOOO0 oooOOO0, p344o0OOOOOo.OooOOOO oooOOOO, String str, String str2) {
        ConcurrentHashMap<Long, T> concurrentHashMap = new ConcurrentHashMap<>(1);
        ConcurrentHashMap<Long, p344o0OOOOOo.OooOOO<T>> concurrentHashMap2 = new ConcurrentHashMap<>(1);
        p344o0OOOOOo.OooOOO<T> oooOOO = new p344o0OOOOOo.OooOOO<>(oooOOO0, oooOOOO, str);
        this.f21974OooO0oo = true;
        this.f21967OooO00o = oooOOO0;
        this.f21968OooO0O0 = oooOOOO;
        this.f21969OooO0OO = concurrentHashMap;
        this.f21970OooO0Oo = concurrentHashMap2;
        this.f21972OooO0o0 = oooOOO;
        this.f21971OooO0o = new AtomicReference<>();
        this.f21973OooO0oO = str2;
    }

    public final void OooO00o() {
        OooO0o0();
        AtomicReference<T> atomicReference = this.f21971OooO0o;
        if (atomicReference.get() != null) {
            OooO0O0(atomicReference.get().OooO0O0());
        }
    }

    public final void OooO0O0(long j) {
        OooO0o0();
        if (this.f21971OooO0o.get() != null && this.f21971OooO0o.get().OooO0O0() == j) {
            synchronized (this) {
                this.f21971OooO0o.set(null);
                p344o0OOOOOo.OooOOO<T> oooOOO = this.f21972OooO0o0;
                ((p344o0OOOOOo.OooOOO0) oooOOO.f43657OooO00o).f43660OooO00o.edit().remove(oooOOO.f43659OooO0OO).commit();
            }
        }
        this.f21969OooO0OO.remove(Long.valueOf(j));
        p344o0OOOOOo.OooOOO<T> oooOOORemove = this.f21970OooO0Oo.remove(Long.valueOf(j));
        if (oooOOORemove != null) {
            ((p344o0OOOOOo.OooOOO0) oooOOORemove.f43657OooO00o).f43660OooO00o.edit().remove(oooOOORemove.f43659OooO0OO).commit();
        }
    }

    public final T OooO0OO() {
        OooO0o0();
        return this.f21971OooO0o.get();
    }

    public final void OooO0Oo(long j, T t, boolean z) {
        this.f21969OooO0OO.put(Long.valueOf(j), t);
        p344o0OOOOOo.OooOOO<T> oooOOO = this.f21970OooO0Oo.get(Long.valueOf(j));
        if (oooOOO == null) {
            oooOOO = new p344o0OOOOOo.OooOOO<>(this.f21967OooO00o, this.f21968OooO0O0, this.f21973OooO0oO + "_" + j);
            this.f21970OooO0Oo.putIfAbsent(Long.valueOf(j), oooOOO);
        }
        oooOOO.OooO00o(t);
        T t2 = this.f21971OooO0o.get();
        if (t2 == null || t2.OooO0O0() == j || z) {
            synchronized (this) {
                AtomicReference<T> atomicReference = this.f21971OooO0o;
                while (!atomicReference.compareAndSet(t2, t) && atomicReference.get() == t2) {
                }
                this.f21972OooO0o0.OooO00o(t);
            }
        }
    }

    public final void OooO0o() {
        for (Map.Entry<String, ?> entry : ((p344o0OOOOOo.OooOOO0) this.f21967OooO00o).f43660OooO00o.getAll().entrySet()) {
            if (entry.getKey().startsWith(this.f21973OooO0oO)) {
                T tOooO00o = this.f21968OooO0O0.OooO00o((String) entry.getValue());
                if (tOooO00o != null) {
                    OooO0Oo(tOooO00o.OooO0O0(), tOooO00o, false);
                }
            }
        }
    }

    public final void OooO0o0() {
        if (this.f21974OooO0oo) {
            synchronized (this) {
                if (this.f21974OooO0oo) {
                    p344o0OOOOOo.OooOOO<T> oooOOO = this.f21972OooO0o0;
                    T tOooO00o = oooOOO.f43658OooO0O0.OooO00o(((p344o0OOOOOo.OooOOO0) oooOOO.f43657OooO00o).f43660OooO00o.getString(oooOOO.f43659OooO0OO, null));
                    if (tOooO00o != null) {
                        OooO0Oo(tOooO00o.OooO0O0(), tOooO00o, false);
                    }
                    OooO0o();
                    this.f21974OooO0oo = false;
                }
            }
        }
    }
}
