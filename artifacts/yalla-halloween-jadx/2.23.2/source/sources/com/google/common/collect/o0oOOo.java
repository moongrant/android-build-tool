package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOOo extends o000O000<Class<Object>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f19172OooO0Oo;

    public o0oOOo(Map.Entry entry) {
        this.f19172OooO0Oo = entry;
    }

    @Override // com.google.common.collect.o000Oo0
    public final Object OooO00o() {
        return this.f19172OooO0Oo;
    }

    @Override // com.google.common.collect.o000O000
    public final Map.Entry<Class<Object>, Object> OooO0O0() {
        return this.f19172OooO0Oo;
    }

    @Override // com.google.common.collect.o000O000, java.util.Map.Entry
    public final Object setValue(Object obj) {
        return super.setValue(MutableClassToInstanceMap.OooO0OO(getKey(), obj));
    }
}
