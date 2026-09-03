package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.o0000.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0000.OooO00o f10935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00000OO.OooO0o f10936OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.o0O0O00> f10937OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f10938OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f10939OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f10940OooO0o0;

    public interface OooO0O0 {
    }

    public o0Oo0oo(RecyclerView.Adapter adapter, OooO0O0 oooO0O0, o0000 o0000Var, o00000OO.OooO0o oooO0o) {
        OooO00o oooO00o = new OooO00o();
        this.f10939OooO0o = oooO00o;
        this.f10937OooO0OO = adapter;
        this.f10938OooO0Oo = oooO0O0;
        o0000Var.getClass();
        this.f10935OooO00o = o0000Var.new OooO00o(this);
        this.f10936OooO0O0 = oooO0o;
        this.f10940OooO0o0 = adapter.getItemCount();
        adapter.registerAdapterDataObserver(oooO00o);
    }

    public class OooO00o extends RecyclerView.OooOOO {
        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onChanged() {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            o0oo0oo2.f10940OooO0o0 = o0oo0oo2.f10937OooO0OO.getItemCount();
            OooOO0 oooOO1 = (OooOO0) o0oo0oo2.f10938OooO0Oo;
            oooOO1.f10595OooO00o.notifyDataSetChanged();
            oooOO1.OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            OooOO0 oooOO1 = (OooOO0) o0oo0oo2.f10938OooO0Oo;
            oooOO1.f10595OooO00o.notifyItemRangeChanged(i + oooOO1.OooO0OO(o0oo0oo2), i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeInserted(int i, int i2) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            o0oo0oo2.f10940OooO0o0 += i2;
            OooOO0 oooOO1 = (OooOO0) o0oo0oo2.f10938OooO0Oo;
            oooOO1.f10595OooO00o.notifyItemRangeInserted(i + oooOO1.OooO0OO(o0oo0oo2), i2);
            if (o0oo0oo2.f10940OooO0o0 <= 0 || o0oo0oo2.f10937OooO0OO.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((OooOO0) o0oo0oo2.f10938OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            o000OO.OooOOO0.OooO0O0(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            OooOO0 oooOO1 = (OooOO0) o0oo0oo2.f10938OooO0Oo;
            int iOooO0OO = oooOO1.OooO0OO(o0oo0oo2);
            oooOO1.f10595OooO00o.notifyItemMoved(i + iOooO0OO, i2 + iOooO0OO);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeRemoved(int i, int i2) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            o0oo0oo2.f10940OooO0o0 -= i2;
            OooOO0 oooOO1 = (OooOO0) o0oo0oo2.f10938OooO0Oo;
            oooOO1.f10595OooO00o.notifyItemRangeRemoved(i + oooOO1.OooO0OO(o0oo0oo2), i2);
            if (o0oo0oo2.f10940OooO0o0 >= 1 || o0oo0oo2.f10937OooO0OO.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((OooOO0) o0oo0oo2.f10938OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onStateRestorationPolicyChanged() {
            ((OooOO0) o0Oo0oo.this.f10938OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            OooOO0 oooOO1 = (OooOO0) o0oo0oo2.f10938OooO0Oo;
            oooOO1.f10595OooO00o.notifyItemRangeChanged(i + oooOO1.OooO0OO(o0oo0oo2), i2, obj);
        }
    }
}
