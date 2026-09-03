package androidx.recyclerview.widget;

import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements o0OOO0o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcatAdapter f8862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo.OooO00o f8863OooO0O0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ConcatAdapter.Config.StableIdMode f8868OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O f8869OooO0oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<WeakReference<RecyclerView>> f8864OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.oo0o0Oo, o0OOO0o> f8865OooO0Oo = new IdentityHashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<o0OOO0o> f8867OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f8866OooO0o = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0OOO0o f8870OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8871OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f8872OooO0OO;
    }

    public OooO(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f8862OooO00o = concatAdapter;
        Objects.requireNonNull(config);
        this.f8863OooO0O0 = new o0000Ooo.OooO00o();
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f8825OooO00o;
        this.f8868OooO0oO = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f8869OooO0oo = new o00000O.OooO0O0();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f8869OooO0oo = new o00000O.OooO00o();
        } else {
            if (stableIdMode != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f8869OooO0oo = new o00000O.OooO0OO();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>>] */
    public final boolean OooO00o(int i, RecyclerView.Adapter<RecyclerView.oo0o0Oo> adapter) {
        if (i < 0 || i > this.f8867OooO0o0.size()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Index must be between 0 and ");
            sbOooO0o0.append(this.f8867OooO0o0.size());
            sbOooO0o0.append(". Given:");
            sbOooO0o0.append(i);
            throw new IndexOutOfBoundsException(sbOooO0o0.toString());
        }
        if (this.f8868OooO0oO != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            o000OO0O.OooOOO0.OooO00o(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (adapter.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iOooO0o = OooO0o(adapter);
        if ((iOooO0o == -1 ? null : (o0OOO0o) this.f8867OooO0o0.get(iOooO0o)) != null) {
            return false;
        }
        o0OOO0o o0ooo0o2 = new o0OOO0o(adapter, this, this.f8863OooO0O0, this.f8869OooO0oo.OooO00o());
        this.f8867OooO0o0.add(i, o0ooo0o2);
        Iterator it = this.f8864OooO0OO.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (o0ooo0o2.f9204OooO0o0 > 0) {
            this.f8862OooO00o.notifyItemRangeInserted(OooO0OO(o0ooo0o2), o0ooo0o2.f9204OooO0o0);
        }
        OooO0O0();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    public final void OooO0O0() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.f8867OooO0o0.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                break;
            }
            o0OOO0o o0ooo0o2 = (o0OOO0o) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = o0ooo0o2.f9201OooO0OO.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && o0ooo0o2.f9204OooO0o0 == 0)) {
                break;
            }
        }
        if (stateRestorationPolicy != this.f8862OooO00o.getStateRestorationPolicy()) {
            this.f8862OooO00o.OooO0OO(stateRestorationPolicy);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    public final int OooO0OO(o0OOO0o o0ooo0o2) {
        o0OOO0o o0ooo0o3;
        Iterator it = this.f8867OooO0o0.iterator();
        int i = 0;
        while (it.hasNext() && (o0ooo0o3 = (o0OOO0o) it.next()) != o0ooo0o2) {
            i += o0ooo0o3.f9204OooO0o0;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    @NonNull
    public final OooO00o OooO0Oo(int i) {
        OooO00o oooO00o = this.f8866OooO0o;
        if (oooO00o.f8872OooO0OO) {
            oooO00o = new OooO00o();
        } else {
            oooO00o.f8872OooO0OO = true;
        }
        int i2 = i;
        for (o0OOO0o o0ooo0o2 : this.f8867OooO0o0) {
            int i3 = o0ooo0o2.f9204OooO0o0;
            if (i3 > i2) {
                oooO00o.f8870OooO00o = o0ooo0o2;
                oooO00o.f8871OooO0O0 = i2;
                break;
            }
            i2 -= i3;
        }
        if (oooO00o.f8870OooO00o != null) {
            return oooO00o;
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot find wrapper for ", i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    public final int OooO0o(RecyclerView.Adapter<RecyclerView.oo0o0Oo> adapter) {
        int size = this.f8867OooO0o0.size();
        for (int i = 0; i < size; i++) {
            if (((o0OOO0o) this.f8867OooO0o0.get(i)).f9201OooO0OO == adapter) {
                return i;
            }
        }
        return -1;
    }

    @NonNull
    public final o0OOO0o OooO0o0(RecyclerView.oo0o0Oo oo0o0oo) {
        o0OOO0o o0ooo0o2 = this.f8865OooO0Oo.get(oo0o0oo);
        if (o0ooo0o2 != null) {
            return o0ooo0o2;
        }
        throw new IllegalStateException("Cannot find wrapper for " + oo0o0oo + ", seems like it is not bound by this adapter: " + this);
    }

    public final void OooO0oO(OooO00o oooO00o) {
        oooO00o.f8872OooO0OO = false;
        oooO00o.f8870OooO00o = null;
        oooO00o.f8871OooO0O0 = -1;
        this.f8866OooO0o = oooO00o;
    }
}
