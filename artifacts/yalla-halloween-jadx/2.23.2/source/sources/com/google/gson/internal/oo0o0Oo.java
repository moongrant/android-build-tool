package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f20232OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f20233OooO0O0;

    public oo0o0Oo(int i, Method method) {
        this.f20232OooO00o = method;
        this.f20233OooO0O0 = i;
    }

    @Override // com.google.gson.internal.o000000
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        o000000.OooO00o(cls);
        return (T) this.f20232OooO00o.invoke(null, cls, Integer.valueOf(this.f20233OooO0O0));
    }
}
