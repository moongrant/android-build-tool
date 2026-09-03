package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.o0000Ooo.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0000Ooo.OooO00o f7816OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00000O.OooO0o f7817OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.o0O0O00> f7818OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f7819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f7820OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f7821OooO0o0;

    public interface OooO0O0 {
    }

    public o0OOO0o(RecyclerView.Adapter adapter, OooO0O0 oooO0O0, o0000Ooo o0000ooo, o00000O.OooO0o oooO0o) {
        OooO00o oooO00o = new OooO00o();
        this.f7820OooO0o = oooO00o;
        this.f7818OooO0OO = adapter;
        this.f7819OooO0Oo = oooO0O0;
        o0000ooo.getClass();
        this.f7816OooO00o = o0000ooo.new OooO00o(this);
        this.f7817OooO0O0 = oooO0o;
        this.f7821OooO0o0 = adapter.getItemCount();
        adapter.registerAdapterDataObserver(oooO00o);
    }

    public class OooO00o extends RecyclerView.OooOOO {
        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onChanged() {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f7821OooO0o0 = o0ooo0o2.f7818OooO0OO.getItemCount();
            OooO oooO = (OooO) o0ooo0o2.f7819OooO0Oo;
            oooO.f7480OooO00o.notifyDataSetChanged();
            oooO.OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            OooO oooO = (OooO) o0ooo0o2.f7819OooO0Oo;
            oooO.f7480OooO00o.notifyItemRangeChanged(i + oooO.OooO0OO(o0ooo0o2), i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeInserted(int i, int i2) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f7821OooO0o0 += i2;
            OooO oooO = (OooO) o0ooo0o2.f7819OooO0Oo;
            oooO.f7480OooO00o.notifyItemRangeInserted(i + oooO.OooO0OO(o0ooo0o2), i2);
            if (o0ooo0o2.f7821OooO0o0 <= 0 || o0ooo0o2.f7818OooO0OO.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((OooO) o0ooo0o2.f7819OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            o000OO.OooOOO0.OooO0O0(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            OooO oooO = (OooO) o0ooo0o2.f7819OooO0Oo;
            int iOooO0OO = oooO.OooO0OO(o0ooo0o2);
            oooO.f7480OooO00o.notifyItemMoved(i + iOooO0OO, i2 + iOooO0OO);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeRemoved(int i, int i2) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f7821OooO0o0 -= i2;
            OooO oooO = (OooO) o0ooo0o2.f7819OooO0Oo;
            oooO.f7480OooO00o.notifyItemRangeRemoved(i + oooO.OooO0OO(o0ooo0o2), i2);
            if (o0ooo0o2.f7821OooO0o0 >= 1 || o0ooo0o2.f7818OooO0OO.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((OooO) o0ooo0o2.f7819OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onStateRestorationPolicyChanged() {
            ((OooO) o0OOO0o.this.f7819OooO0Oo).OooO0O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            OooO oooO = (OooO) o0ooo0o2.f7819OooO0Oo;
            oooO.f7480OooO00o.notifyItemRangeChanged(i + oooO.OooO0OO(o0ooo0o2), i2, obj);
        }
    }
}
