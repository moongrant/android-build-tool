package com.google.common.collect;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0Oo extends o000<Object, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f18621Oooo0o;

    public o0O0O0Oo(Map.Entry entry) {
        this.f18621Oooo0o = entry;
    }

    @Override // com.google.common.collect.o000O0o
    public final Object OooO00o() {
        return this.f18621Oooo0o;
    }

    @Override // com.google.common.collect.o000
    public final Map.Entry<Object, Object> OooO0O0() {
        return this.f18621Oooo0o;
    }

    @Override // com.google.common.collect.o000, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return o0OOOO0o.OooOOO.OooO00o(getKey(), entry.getKey()) && o0OOOO0o.OooOOO.OooO00o(getValue(), entry.getValue());
    }

    @Override // com.google.common.collect.o000, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Objects.requireNonNull(obj);
        return super.setValue(obj);
    }
}
