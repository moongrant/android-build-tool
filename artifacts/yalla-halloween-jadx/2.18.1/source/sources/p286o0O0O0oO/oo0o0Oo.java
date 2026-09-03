package p286o0O0O0oO;

import java.util.Set;
import o0O0O0Oo.OooO;
import o0O0O0Oo.OooO0O0;
import o0O0O0Oo.OooO0o;
import o0O0O0Oo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<OooO0O0> f35512OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00O f35513OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f35514OooO0OO;

    public oo0o0Oo(Set<OooO0O0> set, o0OO00O o0oo00o2, o000OOo o000ooo2) {
        this.f35512OooO00o = set;
        this.f35513OooO0O0 = o0oo00o2;
        this.f35514OooO0OO = o000ooo2;
    }

    @Override // o0O0O0Oo.OooOO0
    public final OooO OooO00o(String str, OooO0O0 oooO0O0, OooO0o oooO0o) {
        if (this.f35512OooO00o.contains(oooO0O0)) {
            return new o0O0O00(this.f35513OooO0O0, str, oooO0O0, oooO0o, this.f35514OooO0OO);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", oooO0O0, this.f35512OooO00o));
    }
}
