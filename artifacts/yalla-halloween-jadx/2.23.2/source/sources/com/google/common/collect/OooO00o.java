package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements Iterator<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public Map.Entry<Object, Object> f18810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f18811OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterator f18812OooO0o0;

    public OooO00o(OooO0O0 oooO0O0, Iterator it) {
        this.f18811OooO0o = oooO0O0;
        this.f18812OooO0o0 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18812OooO0o0.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> entry = (Map.Entry) this.f18812OooO0o0.next();
        this.f18810OooO0Oo = entry;
        return new OooO0O0.OooO00o(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry<Object, Object> entry = this.f18810OooO0Oo;
        if (entry == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Object value = entry.getValue();
        this.f18812OooO0o0.remove();
        this.f18811OooO0o.f18815OooO0o0.f18813OooO0Oo.remove(value);
        this.f18810OooO0Oo = null;
    }
}
