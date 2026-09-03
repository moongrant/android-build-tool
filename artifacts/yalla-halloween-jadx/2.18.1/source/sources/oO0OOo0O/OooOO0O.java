package oO0OOo0O;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<OooOO0O> f52825OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f52826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo f52827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOO0O f52828OooO0OO;

    public OooOO0O(Object obj, OooOo oooOo) {
        this.f52826OooO00o = obj;
        this.f52827OooO0O0 = oooOo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<oO0OOo0O.OooOO0O>] */
    public static OooOO0O OooO00o(OooOo oooOo, Object obj) {
        ?? r0 = f52825OooO0Oo;
        synchronized (r0) {
            int size = r0.size();
            if (size <= 0) {
                return new OooOO0O(obj, oooOo);
            }
            OooOO0O oooOO0O = (OooOO0O) r0.remove(size - 1);
            oooOO0O.f52826OooO00o = obj;
            oooOO0O.f52827OooO0O0 = oooOo;
            oooOO0O.f52828OooO0OO = null;
            return oooOO0O;
        }
    }
}
