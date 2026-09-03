package o000O00O;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo<Object, RecyclerView.o0O0O00> f34522OooO00o;

    public o000O00O(p400o0Oo0OO.OooOO0O oooOO0O) {
        this.f34522OooO00o = oooOO0O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onItemRangeInserted(int i, int i2) {
        o000O0Oo<Object, RecyclerView.o0O0O00> o000o0oo2 = this.f34522OooO00o;
        if (o000o0oo2.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !o000o0oo2.f34532OooO00o) {
            o000o0oo2.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
        }
        o000o0oo2.unregisterAdapterDataObserver(this);
        super.onItemRangeInserted(i, i2);
    }
}
