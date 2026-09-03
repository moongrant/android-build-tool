package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f20703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f20704OooO0O0;

    public o0OOO0o(Method method, Object obj) {
        this.f20703OooO00o = method;
        this.f20704OooO0O0 = obj;
    }

    @Override // com.google.gson.internal.o0O0O00
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        o0O0O00.OooO00o(cls);
        return (T) this.f20703OooO00o.invoke(this.f20704OooO0O0, cls);
    }
}
