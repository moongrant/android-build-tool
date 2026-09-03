package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Iterator<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NullableDecl
    public Map.Entry<Object, Object> f18294Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Iterator f18295Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f18296Oooo0oo;

    public OooO00o(OooO0O0 oooO0O0, Iterator it) {
        this.f18296Oooo0oo = oooO0O0;
        this.f18295Oooo0oO = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18295Oooo0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> entry = (Map.Entry) this.f18295Oooo0oO.next();
        this.f18294Oooo0o = entry;
        return new OooO0O0.OooO00o(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        oo000o.OooO0Oo(this.f18294Oooo0o != null);
        Object value = this.f18294Oooo0o.getValue();
        this.f18295Oooo0oO.remove();
        this.f18296Oooo0oo.OooO0oO(value);
        this.f18294Oooo0o = null;
    }
}
