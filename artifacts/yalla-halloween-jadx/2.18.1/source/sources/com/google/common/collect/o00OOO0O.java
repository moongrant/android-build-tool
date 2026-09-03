package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O extends o000<Class<Object>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f18555Oooo0o;

    public o00OOO0O(Map.Entry entry) {
        this.f18555Oooo0o = entry;
    }

    @Override // com.google.common.collect.o000O0o
    public final Object OooO00o() {
        return this.f18555Oooo0o;
    }

    @Override // com.google.common.collect.o000
    public final Map.Entry<Class<Object>, Object> OooO0O0() {
        return this.f18555Oooo0o;
    }

    @Override // com.google.common.collect.o000, java.util.Map.Entry
    public final Object setValue(Object obj) {
        return super.setValue(MutableClassToInstanceMap.OooO0OO(getKey(), obj));
    }
}
