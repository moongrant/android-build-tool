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

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.o0O0O00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f10535OooO00o;

    public static final class Config {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public static final Config f10536OooO0O0 = new Config(StableIdMode.NO_STABLE_IDS);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final StableIdMode f10537OooO00o;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public Config(@NonNull StableIdMode stableIdMode) {
            this.f10537OooO00o = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter() {
        throw null;
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.o0O0O00>... adapterArr) {
        Config config = Config.f10536OooO0O0;
        List listAsList = Arrays.asList(adapterArr);
        this.f10535OooO00o = new OooOO0(this, config);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            OooO0O0((RecyclerView.Adapter) it.next());
        }
        super.setHasStableIds(this.f10535OooO00o.f10601OooO0oO != Config.StableIdMode.NO_STABLE_IDS);
    }

    public final void OooO00o(int i, @NonNull RecyclerView.Adapter adapter) {
        this.f10535OooO00o.OooO00o(i, adapter);
    }

    public final void OooO0O0(@NonNull RecyclerView.Adapter adapter) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        oooOO1.OooO00o(oooOO1.f10600OooO0o0.size(), adapter);
    }

    public final void OooO0OO(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public final void OooO0Oo(@NonNull RecyclerView.Adapter adapter) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        int iOooO0o = oooOO1.OooO0o(adapter);
        if (iOooO0o == -1) {
            return;
        }
        ArrayList arrayList = oooOO1.f10600OooO0o0;
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) arrayList.get(iOooO0o);
        int iOooO0OO = oooOO1.OooO0OO(o0oo0oo2);
        arrayList.remove(iOooO0o);
        oooOO1.f10595OooO00o.notifyItemRangeRemoved(iOooO0OO, o0oo0oo2.f10940OooO0o0);
        Iterator it = oooOO1.f10597OooO0OO.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        o0oo0oo2.f10937OooO0OO.unregisterAdapterDataObserver(o0oo0oo2.f10939OooO0o);
        o0000.OooO00o oooO00o = o0oo0oo2.f10935OooO00o;
        SparseArray<o0Oo0oo> sparseArray = o0000.this.f10817OooO00o;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                oooOO1.OooO0O0();
                return;
            } else if (sparseArray.valueAt(size) == oooO00o.f10821OooO0OO) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.o0O0O00> adapter, @NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        o0Oo0oo o0oo0oo2 = oooOO1.f10598OooO0Oo.get(o0o0o00);
        if (o0oo0oo2 == null) {
            return -1;
        }
        int iOooO0OO = i - oooOO1.OooO0OO(o0oo0oo2);
        RecyclerView.Adapter<RecyclerView.o0O0O00> adapter2 = o0oo0oo2.f10937OooO0OO;
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
        Iterator it = this.f10535OooO00o.f10600OooO0o0.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((o0Oo0oo) it.next()).f10940OooO0o0;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        OooOO0.OooO00o oooO00oOooO0Oo = oooOO1.OooO0Oo(i);
        o0Oo0oo o0oo0oo2 = oooO00oOooO0Oo.f10603OooO00o;
        long jOooO00o = o0oo0oo2.f10936OooO0O0.OooO00o(o0oo0oo2.f10937OooO0OO.getItemId(oooO00oOooO0Oo.f10604OooO0O0));
        oooO00oOooO0Oo.f10605OooO0OO = false;
        oooO00oOooO0Oo.f10603OooO00o = null;
        oooO00oOooO0Oo.f10604OooO0O0 = -1;
        oooOO1.f10599OooO0o = oooO00oOooO0Oo;
        return jOooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int iValueAt;
        OooOO0 oooOO1 = this.f10535OooO00o;
        OooOO0.OooO00o oooO00oOooO0Oo = oooOO1.OooO0Oo(i);
        o0Oo0oo o0oo0oo2 = oooO00oOooO0Oo.f10603OooO00o;
        int i2 = oooO00oOooO0Oo.f10604OooO0O0;
        o0000.OooO00o oooO00o = o0oo0oo2.f10935OooO00o;
        int itemViewType = o0oo0oo2.f10937OooO0OO.getItemViewType(i2);
        SparseIntArray sparseIntArray = oooO00o.f10819OooO00o;
        int iIndexOfKey = sparseIntArray.indexOfKey(itemViewType);
        if (iIndexOfKey > -1) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            o0000 o0000Var = o0000.this;
            int i3 = o0000Var.f10818OooO0O0;
            o0000Var.f10818OooO0O0 = i3 + 1;
            o0000Var.f10817OooO00o.put(i3, oooO00o.f10821OooO0OO);
            sparseIntArray.put(itemViewType, i3);
            oooO00o.f10820OooO0O0.put(i3, itemViewType);
            iValueAt = i3;
        }
        oooO00oOooO0Oo.f10605OooO0OO = false;
        oooO00oOooO0Oo.f10603OooO00o = null;
        oooO00oOooO0Oo.f10604OooO0O0 = -1;
        oooOO1.f10599OooO0o = oooO00oOooO0Oo;
        return iValueAt;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        boolean z;
        OooOO0 oooOO1 = this.f10535OooO00o;
        ArrayList arrayList = oooOO1.f10597OooO0OO;
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
        Iterator it2 = oooOO1.f10600OooO0o0.iterator();
        while (it2.hasNext()) {
            ((o0Oo0oo) it2.next()).f10937OooO0OO.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        OooOO0.OooO00o oooO00oOooO0Oo = oooOO1.OooO0Oo(i);
        oooOO1.f10598OooO0Oo.put(o0o0o00, oooO00oOooO0Oo.f10603OooO00o);
        o0Oo0oo o0oo0oo2 = oooO00oOooO0Oo.f10603OooO00o;
        o0oo0oo2.f10937OooO0OO.bindViewHolder(o0o0o00, oooO00oOooO0Oo.f10604OooO0O0);
        oooO00oOooO0Oo.f10605OooO0OO = false;
        oooO00oOooO0Oo.f10603OooO00o = null;
        oooO00oOooO0Oo.f10604OooO0O0 = -1;
        oooOO1.f10599OooO0o = oooO00oOooO0Oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.o0O0O00 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        o0Oo0oo o0oo0oo2 = this.f10535OooO00o.f10596OooO0O0.f10817OooO00o.get(i);
        if (o0oo0oo2 == null) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot find the wrapper for global view type ", i));
        }
        o0000.OooO00o oooO00o = o0oo0oo2.f10935OooO00o;
        SparseIntArray sparseIntArray = oooO00o.f10820OooO0O0;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return o0oo0oo2.f10937OooO0OO.onCreateViewHolder(viewGroup, sparseIntArray.valueAt(iIndexOfKey));
        }
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("requested global type ", i, " does not belong to the adapter:");
        sbOooO0O0.append(oooO00o.f10821OooO0OO.f10937OooO0OO);
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        ArrayList arrayList = oooOO1.f10597OooO0OO;
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
        Iterator it = oooOO1.f10600OooO0o0.iterator();
        while (it.hasNext()) {
            ((o0Oo0oo) it.next()).f10937OooO0OO.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        IdentityHashMap<RecyclerView.o0O0O00, o0Oo0oo> identityHashMap = oooOO1.f10598OooO0Oo;
        o0Oo0oo o0oo0oo2 = identityHashMap.get(o0o0o00);
        if (o0oo0oo2 != null) {
            boolean zOnFailedToRecycleView = o0oo0oo2.f10937OooO0OO.onFailedToRecycleView(o0o0o00);
            identityHashMap.remove(o0o0o00);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + o0o0o00 + ", seems like it is not bound by this adapter: " + oooOO1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        this.f10535OooO00o.OooO0o0(o0o0o00).f10937OooO0OO.onViewAttachedToWindow(o0o0o00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        this.f10535OooO00o.OooO0o0(o0o0o00).f10937OooO0OO.onViewDetachedFromWindow(o0o0o00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        OooOO0 oooOO1 = this.f10535OooO00o;
        IdentityHashMap<RecyclerView.o0O0O00, o0Oo0oo> identityHashMap = oooOO1.f10598OooO0Oo;
        o0Oo0oo o0oo0oo2 = identityHashMap.get(o0o0o00);
        if (o0oo0oo2 != null) {
            o0oo0oo2.f10937OooO0OO.onViewRecycled(o0o0o00);
            identityHashMap.remove(o0o0o00);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + o0o0o00 + ", seems like it is not bound by this adapter: " + oooOO1);
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
