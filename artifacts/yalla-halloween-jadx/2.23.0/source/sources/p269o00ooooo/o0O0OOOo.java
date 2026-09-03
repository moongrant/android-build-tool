package p269o00ooooo;

import java.util.HashSet;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0OOOo extends oOOO0O0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f41158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOO0 f41159OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public HashSet f41160OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Long f41161OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Long f41162OooO0oo;

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d OooO0OO(Integer num) {
        if (this.f41159OooO0o.containsKey(num)) {
            return (d) this.f41159OooO0o.getOrDefault(num, null);
        }
        d dVar = new d(this, this.f41158OooO0Oo);
        this.f41159OooO0o.put(num, dVar);
        return dVar;
    }
}
