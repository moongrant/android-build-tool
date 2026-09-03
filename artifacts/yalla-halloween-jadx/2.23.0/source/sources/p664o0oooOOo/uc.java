package p664o0oooOOo;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p662o0oooOO.oO00O0o;
import p663o0oooOO0.ILoggerFactory;
import p663o0oooOO0.oO00o00;

/* JADX INFO: loaded from: classes5.dex */
public final class uc implements ILoggerFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f60324OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedBlockingQueue<oO00O0o> f60325OooO0O0 = new LinkedBlockingQueue<>();

    @Override // p663o0oooOO0.ILoggerFactory
    public final synchronized oO00o00 OooO00o(String str) {
        tc tcVar;
        tcVar = (tc) this.f60324OooO00o.get(str);
        if (tcVar == null) {
            tcVar = new tc(str);
            this.f60324OooO00o.put(str, tcVar);
        }
        return tcVar;
    }

    public final void OooO0O0() {
        this.f60324OooO00o.clear();
        this.f60325OooO0O0.clear();
    }
}
