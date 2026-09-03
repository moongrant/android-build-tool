package retrofit2;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO implements OooO0OO<Object, OooO0O0<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Type f60476OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Executor f60477OooO0O0;

    public OooOOOO(Type type, Executor executor) {
        this.f60476OooO00o = type;
        this.f60477OooO0O0 = executor;
    }

    @Override // retrofit2.OooO0OO
    public final Object OooO00o(o0OOO0o o0ooo0o2) {
        Executor executor = this.f60477OooO0O0;
        return executor == null ? o0ooo0o2 : new Oooo000.OooO00o(executor, o0ooo0o2);
    }

    @Override // retrofit2.OooO0OO
    public final Type responseType() {
        return this.f60476OooO00o;
    }
}
