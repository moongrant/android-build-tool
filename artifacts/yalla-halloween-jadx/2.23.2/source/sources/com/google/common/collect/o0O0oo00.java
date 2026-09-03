package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo00 extends o000O000<Object, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f19117OooO0Oo;

    public o0O0oo00(Map.Entry entry) {
        this.f19117OooO0Oo = entry;
    }

    @Override // com.google.common.collect.o000Oo0
    public final Object OooO00o() {
        return this.f19117OooO0Oo;
    }

    @Override // com.google.common.collect.o000O000
    public final Map.Entry<Object, Object> OooO0O0() {
        return this.f19117OooO0Oo;
    }

    @Override // com.google.common.collect.o000O000, java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (com.google.common.base.Oooo0.OooO00o(getKey(), entry.getKey()) && com.google.common.base.Oooo0.OooO00o(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.o000O000, java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return super.setValue(obj);
    }
}
