package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O<T> implements p301o0O0o0O.OooO0o<Set<T>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Set<T> f19363OooO0O0 = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Set<p301o0O0o0O.OooO0o<T>> f19362OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());

    public o00O0O(Collection<p301o0O0o0O.OooO0o<T>> collection) {
        this.f19362OooO00o.addAll(collection);
    }

    public final synchronized void OooO00o() {
        Iterator<p301o0O0o0O.OooO0o<T>> it = this.f19362OooO00o.iterator();
        while (it.hasNext()) {
            this.f19363OooO0O0.add(it.next().get());
        }
        this.f19362OooO00o = null;
    }

    @Override // p301o0O0o0O.OooO0o
    public final Object get() {
        if (this.f19363OooO0O0 == null) {
            synchronized (this) {
                if (this.f19363OooO0O0 == null) {
                    this.f19363OooO0O0 = Collections.newSetFromMap(new ConcurrentHashMap());
                    OooO00o();
                }
            }
        }
        return Collections.unmodifiableSet(this.f19363OooO0O0);
    }
}
