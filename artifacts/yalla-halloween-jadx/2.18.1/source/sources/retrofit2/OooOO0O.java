package retrofit2;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O implements OooO0OO<Object, OooO0O0<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Type f53740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Executor f53741OooO0O0;

    public OooOO0O(Type type, Executor executor) {
        this.f53740OooO00o = type;
        this.f53741OooO0O0 = executor;
    }

    @Override // retrofit2.OooO0OO
    public final OooO0O0<?> OooO00o(OooO0O0<Object> oooO0O0) {
        Executor executor = this.f53741OooO0O0;
        return executor == null ? oooO0O0 : new OooOOOO.OooO00o(executor, oooO0O0);
    }

    @Override // retrofit2.OooO0OO
    public final Type responseType() {
        return this.f53740OooO00o;
    }
}
