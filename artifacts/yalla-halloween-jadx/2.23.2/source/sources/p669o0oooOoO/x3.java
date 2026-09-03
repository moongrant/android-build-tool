package p669o0oooOoO;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p667o0oooOo.oO00o000;
import p668o0oooOo0.ILoggerFactory;
import p668o0oooOo0.f1;

/* JADX INFO: loaded from: classes5.dex */
public final class x3 implements ILoggerFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f59905OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedBlockingQueue<oO00o000> f59906OooO0O0 = new LinkedBlockingQueue<>();

    @Override // p668o0oooOo0.ILoggerFactory
    public final synchronized f1 OooO00o(String str) {
        w3 w3Var;
        w3Var = (w3) this.f59905OooO00o.get(str);
        if (w3Var == null) {
            w3Var = new w3(str);
            this.f59905OooO00o.put(str, w3Var);
        }
        return w3Var;
    }

    public final void OooO0O0() {
        this.f59905OooO00o.clear();
        this.f59906OooO0O0.clear();
    }
}
