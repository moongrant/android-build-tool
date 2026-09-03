package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO implements o0O0o00O.OooO0o, o0O0o00O.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f19359OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public ArrayDeque f19360OooO0O0 = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f19361OooO0OO;

    public o000oOoO(Executor executor) {
        this.f19361OooO0OO = executor;
    }

    @Override // o0O0o00O.OooO0o
    public final synchronized void OooO00o(Executor executor, o0O0o00O.OooO0O0 oooO0O0) {
        executor.getClass();
        if (!this.f19359OooO00o.containsKey(p626o0ooO.oo000o.class)) {
            this.f19359OooO00o.put(p626o0ooO.oo000o.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f19359OooO00o.get(p626o0ooO.oo000o.class)).put(oooO0O0, executor);
    }

    @Override // o0O0o00O.OooO0o
    public final void OooO0O0(com.google.firebase.messaging.o00O0O o00o0o2) {
        OooO00o(this.f19361OooO0OO, o00o0o2);
    }

    public final synchronized Set<Map.Entry<o0O0o00O.OooO0O0<Object>, Executor>> OooO0OO(o0O0o00O.OooO00o<?> oooO00o) {
        Map map;
        HashMap map2 = this.f19359OooO00o;
        oooO00o.getClass();
        map = (Map) map2.get(null);
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public final void OooO0Oo(final o0O0o00O.OooO00o<?> oooO00o) {
        oooO00o.getClass();
        synchronized (this) {
            ArrayDeque arrayDeque = this.f19360OooO0O0;
            if (arrayDeque != null) {
                arrayDeque.add(oooO00o);
                return;
            }
            for (final Map.Entry<o0O0o00O.OooO0O0<Object>, Executor> entry : OooO0OO(oooO00o)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.Oooo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((o0O0o00O.OooO0O0) entry.getKey()).OooO00o(oooO00o);
                    }
                });
            }
        }
    }
}
