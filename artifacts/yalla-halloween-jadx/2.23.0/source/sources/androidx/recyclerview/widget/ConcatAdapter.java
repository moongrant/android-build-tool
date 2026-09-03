package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.o0000O0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.o0O0O00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f7441OooO00o;

    public static final class Config {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public static final Config f7442OooO0O0 = new Config(StableIdMode.NO_STABLE_IDS);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final StableIdMode f7443OooO00o;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public Config(@NonNull StableIdMode stableIdMode) {
            this.f7443OooO00o = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter() {
        throw null;
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.o0O0O00>... adapterArr) {
        Config config = Config.f7442OooO0O0;
        List listAsList = Arrays.asList(adapterArr);
        this.f7441OooO00o = new OooO(this, config);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            OooO0O0((RecyclerView.Adapter) it.next());
        }
        super.setHasStableIds(this.f7441OooO00o.f7486OooO0oO != Config.StableIdMode.NO_STABLE_IDS);
    }

    public final void OooO00o(int i, @NonNull RecyclerView.Adapter adapter) {
        this.f7441OooO00o.OooO00o(i, adapter);
    }

    public final void OooO0O0(@NonNull RecyclerView.Adapter adapter) {
        OooO oooO = this.f7441OooO00o;
        oooO.OooO00o(oooO.f7485OooO0o0.size(), adapter);
    }

    public final void OooO0OO(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public final void OooO0Oo(@NonNull RecyclerView.Adapter adapter) {
        OooO oooO = this.f7441OooO00o;
        int iOooO0o = oooO.OooO0o(adapter);
        if (iOooO0o == -1) {
            return;
        }
        ArrayList arrayList = oooO.f7485OooO0o0;
        o0OOO0o o0ooo0o2 = (o0OOO0o) arrayList.get(iOooO0o);
        int iOooO0OO = oooO.OooO0OO(o0ooo0o2);
        arrayList.remove(iOooO0o);
        oooO.f7480OooO00o.notifyItemRangeRemoved(iOooO0OO, o0ooo0o2.f7821OooO0o0);
        Iterator it = oooO.f7482OooO0OO.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        o0ooo0o2.f7818OooO0OO.unregisterAdapterDataObserver(o0ooo0o2.f7820OooO0o);
        o0000Ooo.OooO00o oooO00o = o0ooo0o2.f7816OooO00o;
        SparseArray<o0OOO0o> sparseArray = o0000Ooo.this.f7777OooO00o;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                oooO.OooO0O0();
                return;
            } else if (sparseArray.valueAt(size) == oooO00o.f7781OooO0OO) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.o0O0O00> adapter, @NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        OooO oooO = this.f7441OooO00o;
        o0OOO0o o0ooo0o2 = oooO.f7483OooO0Oo.get(o0o0o00);
        if (o0ooo0o2 == null) {
            return -1;
        }
        int iOooO0OO = i - oooO.OooO0OO(o0ooo0o2);
        RecyclerView.Adapter<RecyclerView.o0O0O00> adapter2 = o0ooo0o2.f7818OooO0OO;
        int itemCount = adapter2.getItemCount();
        if (iOooO0OO >= 0 && iOooO0OO < itemCount) {
            return adapter2.findRelativeAdapterPositionIn(adapter, o0o0o00, iOooO0OO);
        }
        StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("Detected inconsistent adapter updates. The local position of the view holder maps to ", iOooO0OO, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbOooO00o.append(o0o0o00);
        sbOooO00o.append("adapter:");
        sbOooO00o.append(adapter);
        throw new IllegalStateException(sbOooO00o.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator it = this.f7441OooO00o.f7485OooO0o0.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((o0OOO0o) it.next()).f7821OooO0o0;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        OooO oooO = this.f7441OooO00o;
        OooO.OooO00o oooO00oOooO0Oo = oooO.OooO0Oo(i);
        o0OOO0o o0ooo0o2 = oooO00oOooO0Oo.f7488OooO00o;
        long jOooO00o = o0ooo0o2.f7817OooO0O0.OooO00o(o0ooo0o2.f7818OooO0OO.getItemId(oooO00oOooO0Oo.f7489OooO0O0));
        oooO00oOooO0Oo.f7490OooO0OO = false;
        oooO00oOooO0Oo.f7488OooO00o = null;
        oooO00oOooO0Oo.f7489OooO0O0 = -1;
        oooO.f7484OooO0o = oooO00oOooO0Oo;
        return jOooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int iValueAt;
        OooO oooO = this.f7441OooO00o;
        OooO.OooO00o oooO00oOooO0Oo = oooO.OooO0Oo(i);
        o0OOO0o o0ooo0o2 = oooO00oOooO0Oo.f7488OooO00o;
        int i2 = oooO00oOooO0Oo.f7489OooO0O0;
        o0000Ooo.OooO00o oooO00o = o0ooo0o2.f7816OooO00o;
        int itemViewType = o0ooo0o2.f7818OooO0OO.getItemViewType(i2);
        SparseIntArray sparseIntArray = oooO00o.f7779OooO00o;
        int iIndexOfKey = sparseIntArray.indexOfKey(itemViewType);
        if (iIndexOfKey > -1) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            o0000Ooo o0000ooo = o0000Ooo.this;
            int i3 = o0000ooo.f7778OooO0O0;
            o0000ooo.f7778OooO0O0 = i3 + 1;
            o0000ooo.f7777OooO00o.put(i3, oooO00o.f7781OooO0OO);
            sparseIntArray.put(itemViewType, i3);
            oooO00o.f7780OooO0O0.put(i3, itemViewType);
            iValueAt = i3;
        }
        oooO00oOooO0Oo.f7490OooO0OO = false;
        oooO00oOooO0Oo.f7488OooO00o = null;
        oooO00oOooO0Oo.f7489OooO0O0 = -1;
        oooO.f7484OooO0o = oooO00oOooO0Oo;
        return iValueAt;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        boolean z;
        OooO oooO = this.f7441OooO00o;
        ArrayList arrayList = oooO.f7482OooO0OO;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((WeakReference) it.next()).get() == recyclerView) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = oooO.f7485OooO0o0.iterator();
        while (it2.hasNext()) {
            ((o0OOO0o) it2.next()).f7818OooO0OO.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        OooO oooO = this.f7441OooO00o;
        OooO.OooO00o oooO00oOooO0Oo = oooO.OooO0Oo(i);
        oooO.f7483OooO0Oo.put(o0o0o00, oooO00oOooO0Oo.f7488OooO00o);
        o0OOO0o o0ooo0o2 = oooO00oOooO0Oo.f7488OooO00o;
        o0ooo0o2.f7818OooO0OO.bindViewHolder(o0o0o00, oooO00oOooO0Oo.f7489OooO0O0);
        oooO00oOooO0Oo.f7490OooO0OO = false;
        oooO00oOooO0Oo.f7488OooO00o = null;
        oooO00oOooO0Oo.f7489OooO0O0 = -1;
        oooO.f7484OooO0o = oooO00oOooO0Oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.o0O0O00 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        o0OOO0o o0ooo0o2 = this.f7441OooO00o.f7481OooO0O0.f7777OooO00o.get(i);
        if (o0ooo0o2 == null) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot find the wrapper for global view type ", i));
        }
        o0000Ooo.OooO00o oooO00o = o0ooo0o2.f7816OooO00o;
        SparseIntArray sparseIntArray = oooO00o.f7780OooO0O0;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return o0ooo0o2.f7818OooO0OO.onCreateViewHolder(viewGroup, sparseIntArray.valueAt(iIndexOfKey));
        }
        StringBuilder sbOooO00o = o0000O0.OooO00o("requested global type ", i, " does not belong to the adapter:");
        sbOooO00o.append(oooO00o.f7781OooO0OO.f7818OooO0OO);
        throw new IllegalStateException(sbOooO00o.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        OooO oooO = this.f7441OooO00o;
        ArrayList arrayList = oooO.f7482OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
        }
        Iterator it = oooO.f7485OooO0o0.iterator();
        while (it.hasNext()) {
            ((o0OOO0o) it.next()).f7818OooO0OO.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        OooO oooO = this.f7441OooO00o;
        IdentityHashMap<RecyclerView.o0O0O00, o0OOO0o> identityHashMap = oooO.f7483OooO0Oo;
        o0OOO0o o0ooo0o2 = identityHashMap.get(o0o0o00);
        if (o0ooo0o2 != null) {
            boolean zOnFailedToRecycleView = o0ooo0o2.f7818OooO0OO.onFailedToRecycleView(o0o0o00);
            identityHashMap.remove(o0o0o00);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + o0o0o00 + ", seems like it is not bound by this adapter: " + oooO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        this.f7441OooO00o.OooO0o0(o0o0o00).f7818OooO0OO.onViewAttachedToWindow(o0o0o00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        this.f7441OooO00o.OooO0o0(o0o0o00).f7818OooO0OO.onViewDetachedFromWindow(o0o0o00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        OooO oooO = this.f7441OooO00o;
        IdentityHashMap<RecyclerView.o0O0O00, o0OOO0o> identityHashMap = oooO.f7483OooO0Oo;
        o0OOO0o o0ooo0o2 = identityHashMap.get(o0o0o00);
        if (o0ooo0o2 != null) {
            o0ooo0o2.f7818OooO0OO.onViewRecycled(o0o0o00);
            identityHashMap.remove(o0o0o00);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + o0o0o00 + ", seems like it is not bound by this adapter: " + oooO);
        }
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
