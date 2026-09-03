package p324o0O0oo0O;

import com.yalla.yalla.ui.fragment.PostDetailGiftFragment;
import p294o0O0Oo0o.o000OOo;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements o000OOo.OooO00o, oO00OO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f36902OooO0Oo;

    public /* synthetic */ o00000OO(Object obj) {
        this.f36902OooO0Oo = obj;
    }

    @Override // o0O0Oo0o.o000OOo.OooO00o
    public final void OooO0O0(o000OOo o000ooo2) {
        o0000Ooo o0000ooo = (o0000Ooo) this.f36902OooO0Oo;
        o000OO o000oo2 = (o000OO) o000ooo2;
        synchronized (o0000ooo.f35824OooO0O0) {
            o000oo2.clear();
            O[] oArr = o0000ooo.f35827OooO0o;
            int i = o0000ooo.f35830OooO0oo;
            o0000ooo.f35830OooO0oo = i + 1;
            oArr[i] = o000oo2;
            o0000ooo.OooO0oO();
        }
    }

    @Override // p417o0Oo0oOo.oO00OO0O
    public final void OooO0OO(oO000Oo oo000oo) {
        PostDetailGiftFragment.m393init$lambda1((PostDetailGiftFragment) this.f36902OooO0Oo, oo000oo);
    }
}
