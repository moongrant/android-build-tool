package p089o000o000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O000o<Object, RecyclerView.oo0o0Oo> f29060OooO00o;

    public o00oOoo(o00O000o<Object, RecyclerView.oo0o0Oo> o00o000o2) {
        this.f29060OooO00o = o00o000o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onItemRangeInserted(int i, int i2) {
        o00O000o<Object, RecyclerView.oo0o0Oo> o00o000o2 = this.f29060OooO00o;
        if (o00o000o2.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !o00o000o2.f28931OooO00o) {
            o00o000o2.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
        }
        this.f29060OooO00o.unregisterAdapterDataObserver(this);
        super.onItemRangeInserted(i, i2);
    }
}
