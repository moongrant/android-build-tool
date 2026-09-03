package p101o000oo;

import androidx.recyclerview.widget.RecyclerView;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOO00O<Object, RecyclerView.o0O0O00> f35507OooO00o;

    public o00O00(h3 h3Var) {
        this.f35507OooO00o = h3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onItemRangeInserted(int i, int i2) {
        oOO00O<Object, RecyclerView.o0O0O00> ooo00o = this.f35507OooO00o;
        if (ooo00o.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !ooo00o.f35582OooO00o) {
            ooo00o.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
        }
        ooo00o.unregisterAdapterDataObserver(this);
        super.onItemRangeInserted(i, i2);
    }
}
