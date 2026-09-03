package p191o00o0O0O;

import java.util.Set;
import p176o00o0.OooOo;
import p176o00o0.Oooo0;
import p176o00o0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<OooOo> f38942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f38943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f38944OooO0OO;

    public o0OO00O(Set set, Oooo0 oooo0, o000OOo o000ooo2) {
        this.f38942OooO00o = set;
        this.f38943OooO0O0 = oooo0;
        this.f38944OooO0OO = o000ooo2;
    }

    @Override // p176o00o0.o0OoOo0
    public final o0O0O00 OooO00o(String str, OooOo oooOo, Oooo0 oooo0) {
        Set<OooOo> set = this.f38942OooO00o;
        if (set.contains(oooOo)) {
            return new o0O0O00(this.f38943OooO0O0, str, oooOo, oooo0, this.f38944OooO0OO);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", oooOo, set));
    }
}
