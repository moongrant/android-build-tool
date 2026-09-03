package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0 extends o00OOO0O.OooO0OO<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Comparator f19525OooO00o;

    public o00OOO0(o0O0o o0o0o) {
        this.f19525OooO00o = o0o0o;
    }

    @Override // com.google.common.collect.o00OOO0O.OooO0OO
    public final <K, V> Map<K, Collection<V>> OooO0O0() {
        return new TreeMap(this.f19525OooO00o);
    }
}
