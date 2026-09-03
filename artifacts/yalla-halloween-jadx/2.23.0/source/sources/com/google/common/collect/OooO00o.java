package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements Iterator<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public Map.Entry<Object, Object> f19286OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f19287OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterator f19288OooO0o0;

    public OooO00o(OooO0O0 oooO0O0, Iterator it) {
        this.f19287OooO0o = oooO0O0;
        this.f19288OooO0o0 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19288OooO0o0.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> entry = (Map.Entry) this.f19288OooO0o0.next();
        this.f19286OooO0Oo = entry;
        return new OooO0O0.OooO00o(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry<Object, Object> entry = this.f19286OooO0Oo;
        if (entry == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Object value = entry.getValue();
        this.f19288OooO0o0.remove();
        this.f19287OooO0o.f19291OooO0o0.f19289OooO0Oo.remove(value);
        this.f19286OooO0Oo = null;
    }
}
