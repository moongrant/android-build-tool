package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.oo0o0Oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f8823OooO00o;

    public static final class Config {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public static final Config f8824OooO0O0 = new Config(StableIdMode.NO_STABLE_IDS);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final StableIdMode f8825OooO00o;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public Config(@NonNull StableIdMode stableIdMode) {
            this.f8825OooO00o = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.oo0o0Oo>... adapterArr) {
        Config config = Config.f8824OooO0O0;
        List listAsList = Arrays.asList(adapterArr);
        this.f8823OooO00o = new OooO(this, config);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            OooO0O0((RecyclerView.Adapter) it.next());
        }
        super.setHasStableIds(this.f8823OooO00o.f8868OooO0oO != Config.StableIdMode.NO_STABLE_IDS);
    }

    public final boolean OooO00o(int i, @NonNull RecyclerView.Adapter<? extends RecyclerView.oo0o0Oo> adapter) {
        return this.f8823OooO00o.OooO00o(i, adapter);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    public final boolean OooO0O0(@NonNull RecyclerView.Adapter<? extends RecyclerView.oo0o0Oo> adapter) {
        OooO oooO = this.f8823OooO00o;
        return oooO.OooO00o(oooO.f8867OooO0o0.size(), adapter);
    }

    public final void OooO0OO(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    public final boolean OooO0Oo(@NonNull RecyclerView.Adapter<? extends RecyclerView.oo0o0Oo> adapter) {
        OooO oooO = this.f8823OooO00o;
        int iOooO0o = oooO.OooO0o(adapter);
        if (iOooO0o == -1) {
            return false;
        }
        o0OOO0o o0ooo0o2 = (o0OOO0o) oooO.f8867OooO0o0.get(iOooO0o);
        int iOooO0OO = oooO.OooO0OO(o0ooo0o2);
        oooO.f8867OooO0o0.remove(iOooO0o);
        oooO.f8862OooO00o.notifyItemRangeRemoved(iOooO0OO, o0ooo0o2.f9204OooO0o0);
        Iterator it = oooO.f8864OooO0OO.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        o0ooo0o2.f9201OooO0OO.unregisterAdapterDataObserver(o0ooo0o2.f9203OooO0o);
        o0000Ooo.OooO00o.C0064OooO00o c0064OooO00o = o0ooo0o2.f9199OooO00o;
        o0000Ooo.OooO00o oooO00o = o0000Ooo.OooO00o.this;
        o0OOO0o o0ooo0o3 = c0064OooO00o.f9163OooO0OO;
        int size = oooO00o.f9159OooO00o.size();
        while (true) {
            size--;
            if (size < 0) {
                oooO.OooO0O0();
                return true;
            }
            if (oooO00o.f9159OooO00o.valueAt(size) == o0ooo0o3) {
                oooO00o.f9159OooO00o.removeAt(size);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.oo0o0Oo> adapter, @NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO oooO = this.f8823OooO00o;
        o0OOO0o o0ooo0o2 = oooO.f8865OooO0Oo.get(oo0o0oo);
        if (o0ooo0o2 == null) {
            return -1;
        }
        int iOooO0OO = i - oooO.OooO0OO(o0ooo0o2);
        int itemCount = o0ooo0o2.f9201OooO0OO.getItemCount();
        if (iOooO0OO >= 0 && iOooO0OO < itemCount) {
            return o0ooo0o2.f9201OooO0OO.findRelativeAdapterPositionIn(adapter, oo0o0oo, iOooO0OO);
        }
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Detected inconsistent adapter updates. The local position of the view holder maps to ", iOooO0OO, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbOooO0O0.append(oo0o0oo);
        sbOooO0O0.append("adapter:");
        sbOooO0O0.append(adapter);
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator it = this.f8823OooO00o.f8867OooO0o0.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((o0OOO0o) it.next()).f9204OooO0o0;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        OooO oooO = this.f8823OooO00o;
        OooO.OooO00o oooO00oOooO0Oo = oooO.OooO0Oo(i);
        o0OOO0o o0ooo0o2 = oooO00oOooO0Oo.f8870OooO00o;
        long jOooO00o = o0ooo0o2.f9200OooO0O0.OooO00o(o0ooo0o2.f9201OooO0OO.getItemId(oooO00oOooO0Oo.f8871OooO0O0));
        oooO.OooO0oO(oooO00oOooO0Oo);
        return jOooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int iValueAt;
        OooO oooO = this.f8823OooO00o;
        OooO.OooO00o oooO00oOooO0Oo = oooO.OooO0Oo(i);
        o0OOO0o o0ooo0o2 = oooO00oOooO0Oo.f8870OooO00o;
        int i2 = oooO00oOooO0Oo.f8871OooO0O0;
        o0000Ooo.OooO00o.C0064OooO00o c0064OooO00o = o0ooo0o2.f9199OooO00o;
        int itemViewType = o0ooo0o2.f9201OooO0OO.getItemViewType(i2);
        int iIndexOfKey = c0064OooO00o.f9161OooO00o.indexOfKey(itemViewType);
        if (iIndexOfKey > -1) {
            iValueAt = c0064OooO00o.f9161OooO00o.valueAt(iIndexOfKey);
        } else {
            o0000Ooo.OooO00o oooO00o = o0000Ooo.OooO00o.this;
            o0OOO0o o0ooo0o3 = c0064OooO00o.f9163OooO0OO;
            int i3 = oooO00o.f9160OooO0O0;
            oooO00o.f9160OooO0O0 = i3 + 1;
            oooO00o.f9159OooO00o.put(i3, o0ooo0o3);
            c0064OooO00o.f9161OooO00o.put(itemViewType, i3);
            c0064OooO00o.f9162OooO0O0.put(i3, itemViewType);
            iValueAt = i3;
        }
        oooO.OooO0oO(oooO00oOooO0Oo);
        return iValueAt;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        boolean z;
        OooO oooO = this.f8823OooO00o;
        Iterator<WeakReference<RecyclerView>> it = oooO.f8864OooO0OO.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().get() == recyclerView) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        oooO.f8864OooO0OO.add(new WeakReference<>(recyclerView));
        Iterator<o0OOO0o> it2 = oooO.f8867OooO0o0.iterator();
        while (it2.hasNext()) {
            it2.next().f9201OooO0OO.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO oooO = this.f8823OooO00o;
        OooO.OooO00o oooO00oOooO0Oo = oooO.OooO0Oo(i);
        oooO.f8865OooO0Oo.put(oo0o0oo, oooO00oOooO0Oo.f8870OooO00o);
        o0OOO0o o0ooo0o2 = oooO00oOooO0Oo.f8870OooO00o;
        o0ooo0o2.f9201OooO0OO.bindViewHolder(oo0o0oo, oooO00oOooO0Oo.f8871OooO0O0);
        oooO.OooO0oO(oooO00oOooO0Oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.oo0o0Oo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        o0OOO0o o0ooo0o2 = this.f8823OooO00o.f8863OooO0O0.f9159OooO00o.get(i);
        if (o0ooo0o2 == null) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot find the wrapper for global view type ", i));
        }
        o0000Ooo.OooO00o.C0064OooO00o c0064OooO00o = o0ooo0o2.f9199OooO00o;
        int iIndexOfKey = c0064OooO00o.f9162OooO0O0.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return o0ooo0o2.f9201OooO0OO.onCreateViewHolder(viewGroup, c0064OooO00o.f9162OooO0O0.valueAt(iIndexOfKey));
        }
        StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("requested global type ", i, " does not belong to the adapter:");
        sbOooO00o.append(c0064OooO00o.f9163OooO0OO.f9201OooO0OO);
        throw new IllegalStateException(sbOooO00o.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>>] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        OooO oooO = this.f8823OooO00o;
        int size = oooO.f8864OooO0OO.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) oooO.f8864OooO0OO.get(size);
            if (weakReference.get() == null) {
                oooO.f8864OooO0OO.remove(size);
            } else if (weakReference.get() == recyclerView) {
                oooO.f8864OooO0OO.remove(size);
                break;
            }
        }
        Iterator it = oooO.f8867OooO0o0.iterator();
        while (it.hasNext()) {
            ((o0OOO0o) it.next()).f9201OooO0OO.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.oo0o0Oo oo0o0oo) {
        OooO oooO = this.f8823OooO00o;
        o0OOO0o o0ooo0o2 = oooO.f8865OooO0Oo.get(oo0o0oo);
        if (o0ooo0o2 != null) {
            boolean zOnFailedToRecycleView = o0ooo0o2.f9201OooO0OO.onFailedToRecycleView(oo0o0oo);
            oooO.f8865OooO0Oo.remove(oo0o0oo);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + oo0o0oo + ", seems like it is not bound by this adapter: " + oooO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.oo0o0Oo oo0o0oo) {
        this.f8823OooO00o.OooO0o0(oo0o0oo).f9201OooO0OO.onViewAttachedToWindow(oo0o0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.oo0o0Oo oo0o0oo) {
        this.f8823OooO00o.OooO0o0(oo0o0oo).f9201OooO0OO.onViewDetachedFromWindow(oo0o0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull RecyclerView.oo0o0Oo oo0o0oo) {
        OooO oooO = this.f8823OooO00o;
        o0OOO0o o0ooo0o2 = oooO.f8865OooO0Oo.get(oo0o0oo);
        if (o0ooo0o2 != null) {
            o0ooo0o2.f9201OooO0OO.onViewRecycled(oo0o0oo);
            oooO.f8865OooO0Oo.remove(oo0o0oo);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + oo0o0oo + ", seems like it is not bound by this adapter: " + oooO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setStateRestorationPolicy(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
