package p271o00ooooo;

import java.util.HashSet;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000Oo extends j0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f40536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO f40537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public HashSet f40538OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Long f40539OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Long f40540OooO0oo;

    @Override // p271o00ooooo.j0
    public final void OooO0O0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a1 OooO0OO(Integer num) {
        if (this.f40537OooO0o.containsKey(num)) {
            return (a1) this.f40537OooO0o.getOrDefault(num, null);
        }
        a1 a1Var = new a1(this, this.f40536OooO0Oo);
        this.f40537OooO0o.put(num, a1Var);
        return a1Var;
    }
}
