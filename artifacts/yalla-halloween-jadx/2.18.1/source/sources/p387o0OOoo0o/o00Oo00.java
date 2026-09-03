package p387o0OOoo0o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 extends oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f38910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f38911OooO0O0;

    public o00Oo00(Method method, int i) {
        this.f38910OooO00o = method;
        this.f38911OooO0O0 = i;
    }

    @Override // p387o0OOoo0o.oo00oO
    public final <T> T OooO0O0(Class<T> cls) throws Exception {
        oo00oO.OooO00o(cls);
        return (T) this.f38910OooO00o.invoke(null, cls, Integer.valueOf(this.f38911OooO0O0));
    }
}
