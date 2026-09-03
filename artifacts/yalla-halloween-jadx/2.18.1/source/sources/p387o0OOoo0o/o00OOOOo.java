package p387o0OOoo0o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo extends oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f38908OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f38909OooO0O0;

    public o00OOOOo(Method method, Object obj) {
        this.f38908OooO00o = method;
        this.f38909OooO0O0 = obj;
    }

    @Override // p387o0OOoo0o.oo00oO
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        oo00oO.OooO00o(cls);
        return (T) this.f38908OooO00o.invoke(this.f38909OooO0O0, cls);
    }
}
