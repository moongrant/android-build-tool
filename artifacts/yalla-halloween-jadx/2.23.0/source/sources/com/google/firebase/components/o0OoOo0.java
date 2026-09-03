package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0<T> implements p298o0O0o00o.OooO0OO<Set<T>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Set<T> f19844OooO0O0 = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Set<p298o0O0o00o.OooO0OO<T>> f19843OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());

    public o0OoOo0(Collection<p298o0O0o00o.OooO0OO<T>> collection) {
        this.f19843OooO00o.addAll(collection);
    }

    public final synchronized void OooO00o() {
        Iterator<p298o0O0o00o.OooO0OO<T>> it = this.f19843OooO00o.iterator();
        while (it.hasNext()) {
            this.f19844OooO0O0.add(it.next().get());
        }
        this.f19843OooO00o = null;
    }

    @Override // p298o0O0o00o.OooO0OO
    public final Object get() {
        if (this.f19844OooO0O0 == null) {
            synchronized (this) {
                if (this.f19844OooO0O0 == null) {
                    this.f19844OooO0O0 = Collections.newSetFromMap(new ConcurrentHashMap());
                    OooO00o();
                }
            }
        }
        return Collections.unmodifiableSet(this.f19844OooO0O0);
    }
}
