package retrofit2;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo00 implements OooO0OO<Object, OooO0O0<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Type f61018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Executor f61019OooO0O0;

    public OooOo00(Type type, Executor executor) {
        this.f61018OooO00o = type;
        this.f61019OooO0O0 = executor;
    }

    @Override // retrofit2.OooO0OO
    public final Object OooO00o(o0Oo0oo o0oo0oo2) {
        Executor executor = this.f61019OooO0O0;
        return executor == null ? o0oo0oo2 : new Oooo0.OooO00o(executor, o0oo0oo2);
    }

    @Override // retrofit2.OooO0OO
    public final Type responseType() {
        return this.f61018OooO00o;
    }
}
