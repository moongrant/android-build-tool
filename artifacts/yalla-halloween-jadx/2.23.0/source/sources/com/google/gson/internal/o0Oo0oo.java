package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f20705OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f20706OooO0O0;

    public o0Oo0oo(int i, Method method) {
        this.f20705OooO00o = method;
        this.f20706OooO0O0 = i;
    }

    @Override // com.google.gson.internal.o0O0O00
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        o0O0O00.OooO00o(cls);
        return (T) this.f20705OooO00o.invoke(null, cls, Integer.valueOf(this.f20706OooO0O0));
    }
}
