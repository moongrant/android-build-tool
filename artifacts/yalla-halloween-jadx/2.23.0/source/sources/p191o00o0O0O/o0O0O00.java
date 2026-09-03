package p191o00o0O0O;

import java.util.HashMap;
import p176o00o0.OooOo;
import p176o00o0.OooOo00;
import p176o00o0.Oooo0;
import p176o00o0.Oooo000;
import p176o00o0.o000oOoO;
import p176o00o0.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00<T> implements o000oOoO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f38937OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38938OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo f38939OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo0<T, byte[]> f38940OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OOo f38941OooO0o0;

    public o0O0O00(o0Oo0oo o0oo0oo2, String str, OooOo oooOo, Oooo0<T, byte[]> oooo0, o000OOo o000ooo2) {
        this.f38937OooO00o = o0oo0oo2;
        this.f38938OooO0O0 = str;
        this.f38939OooO0OO = oooOo;
        this.f38940OooO0Oo = oooo0;
        this.f38941OooO0o0 = o000ooo2;
    }

    public final void OooO00o(OooOo00 oooOo00, o00O0O o00o0o2) {
        o0Oo0oo o0oo0oo2 = this.f38937OooO00o;
        if (o0oo0oo2 == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = this.f38938OooO0O0;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        Oooo0<T, byte[]> oooo0 = this.f38940OooO0Oo;
        if (oooo0 == null) {
            throw new NullPointerException("Null transformer");
        }
        OooOo oooOo = this.f38939OooO0OO;
        if (oooOo == null) {
            throw new NullPointerException("Null encoding");
        }
        Oooo000 oooo000 = new Oooo000(o0oo0oo2, str, oooOo00, oooo0, oooOo);
        o000000 o000000Var = (o000000) this.f38941OooO0o0;
        o000000Var.getClass();
        Oooo000<?> oooo001 = oooo000.f38915OooO0OO;
        Oooo0 oooo0OooO0o0 = oooo000.f38913OooO00o.OooO0o0(oooo001.OooO0OO());
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f38902OooO0o = new HashMap();
        oooO00o.f38901OooO0Oo = Long.valueOf(o000000Var.f38924OooO00o.getTime());
        oooO00o.f38903OooO0o0 = Long.valueOf(o000000Var.f38925OooO0O0.getTime());
        oooO00o.OooO0Oo(oooo000.f38914OooO0O0);
        oooO00o.OooO0OO(new o00O0O(oooo000.f38917OooO0o0, oooo000.f38916OooO0Oo.apply(oooo001.OooO0O0())));
        oooO00o.f38899OooO0O0 = oooo001.OooO00o();
        o000000Var.f38926OooO0OO.OooO00o(o00o0o2, oooO00o.OooO0O0(), oooo0OooO0o0);
    }
}
