package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f20702OooO00o;

    public o0OO00O(Method method) {
        this.f20702OooO00o = method;
    }

    @Override // com.google.gson.internal.o0O0O00
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        o0O0O00.OooO00o(cls);
        return (T) this.f20702OooO00o.invoke(null, cls, Object.class);
    }
}
