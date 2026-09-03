package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.messaging.o00oO0o;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 implements o0O0o000.OooO0o, o0O0o000.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f19827OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public ArrayDeque f19828OooO0O0 = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f19829OooO0OO;

    public Oooo0(Executor executor) {
        this.f19829OooO0OO = executor;
    }

    @Override // o0O0o000.OooO0o
    public final void OooO00o(o00oO0o o00oo0o2) {
        OooO0O0(this.f19829OooO0OO, o00oo0o2);
    }

    @Override // o0O0o000.OooO0o
    public final synchronized void OooO0O0(Executor executor, o0O0o000.OooO0O0 oooO0O0) {
        executor.getClass();
        if (!this.f19827OooO00o.containsKey(p281o0O0O0oO.OooO0OO.class)) {
            this.f19827OooO00o.put(p281o0O0O0oO.OooO0OO.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f19827OooO00o.get(p281o0O0O0oO.OooO0OO.class)).put(oooO0O0, executor);
    }

    public final synchronized Set<Map.Entry<o0O0o000.OooO0O0<Object>, Executor>> OooO0OO(o0O0o000.OooO00o<?> oooO00o) {
        Map map;
        HashMap map2 = this.f19827OooO00o;
        oooO00o.getClass();
        map = (Map) map2.get(null);
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public final void OooO0Oo(final o0O0o000.OooO00o<?> oooO00o) {
        oooO00o.getClass();
        synchronized (this) {
            ArrayDeque arrayDeque = this.f19828OooO0O0;
            if (arrayDeque != null) {
                arrayDeque.add(oooO00o);
                return;
            }
            for (final Map.Entry<o0O0o000.OooO0O0<Object>, Executor> entry : OooO0OO(oooO00o)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.Oooo000
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((o0O0o000.OooO0O0) entry.getKey()).OooO00o(oooO00o);
                    }
                });
            }
        }
    }
}
