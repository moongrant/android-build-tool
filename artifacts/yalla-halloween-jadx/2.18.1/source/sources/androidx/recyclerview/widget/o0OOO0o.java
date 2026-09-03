package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.o0000Ooo.OooO00o.C0064OooO00o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0000Ooo.OooO00o.C0064OooO00o f9199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00000O.OooO0o f9200OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.oo0o0Oo> f9201OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f9202OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f9203OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f9204OooO0o0;

    public interface OooO0O0 {
    }

    public o0OOO0o(RecyclerView.Adapter<RecyclerView.oo0o0Oo> adapter, OooO0O0 oooO0O0, o0000Ooo o0000ooo, o00000O.OooO0o oooO0o) {
        this.f9201OooO0OO = adapter;
        this.f9202OooO0Oo = oooO0O0;
        o0000Ooo.OooO00o oooO00o = (o0000Ooo.OooO00o) o0000ooo;
        Objects.requireNonNull(oooO00o);
        this.f9199OooO00o = oooO00o.new C0064OooO00o(this);
        this.f9200OooO0O0 = oooO0o;
        this.f9204OooO0o0 = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.f9203OooO0o);
    }

    public class OooO00o extends RecyclerView.OooOOO {
        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onChanged() {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f9204OooO0o0 = o0ooo0o2.f9201OooO0OO.getItemCount();
            OooO oooO = (OooO) o0OOO0o.this.f9202OooO0Oo;
            oooO.f8862OooO00o.notifyDataSetChanged();
            oooO.OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            OooO oooO = (OooO) o0ooo0o2.f9202OooO0Oo;
            oooO.f8862OooO00o.notifyItemRangeChanged(i + oooO.OooO0OO(o0ooo0o2), i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeInserted(int i, int i2) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f9204OooO0o0 += i2;
            OooO oooO = (OooO) o0ooo0o2.f9202OooO0Oo;
            oooO.f8862OooO00o.notifyItemRangeInserted(i + oooO.OooO0OO(o0ooo0o2), i2);
            o0OOO0o o0ooo0o3 = o0OOO0o.this;
            if (o0ooo0o3.f9204OooO0o0 <= 0 || o0ooo0o3.f9201OooO0OO.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((OooO) o0OOO0o.this.f9202OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            o000OO0O.OooOOO0.OooO00o(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            OooO oooO = (OooO) o0ooo0o2.f9202OooO0Oo;
            int iOooO0OO = oooO.OooO0OO(o0ooo0o2);
            oooO.f8862OooO00o.notifyItemMoved(i + iOooO0OO, i2 + iOooO0OO);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeRemoved(int i, int i2) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f9204OooO0o0 -= i2;
            OooO oooO = (OooO) o0ooo0o2.f9202OooO0Oo;
            oooO.f8862OooO00o.notifyItemRangeRemoved(i + oooO.OooO0OO(o0ooo0o2), i2);
            o0OOO0o o0ooo0o3 = o0OOO0o.this;
            if (o0ooo0o3.f9204OooO0o0 >= 1 || o0ooo0o3.f9201OooO0OO.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((OooO) o0OOO0o.this.f9202OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onStateRestorationPolicyChanged() {
            ((OooO) o0OOO0o.this.f9202OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            OooO oooO = (OooO) o0ooo0o2.f9202OooO0Oo;
            oooO.f8862OooO00o.notifyItemRangeChanged(i + oooO.OooO0OO(o0ooo0o2), i2, obj);
        }
    }
}
