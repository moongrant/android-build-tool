package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O extends o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f20230OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f20231OooO0O0;

    public o0OO00O(Method method, Object obj) {
        this.f20230OooO00o = method;
        this.f20231OooO0O0 = obj;
    }

    @Override // com.google.gson.internal.o000000
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        o000000.OooO00o(cls);
        return (T) this.f20230OooO00o.invoke(this.f20231OooO0O0, cls);
    }
}
