package androidx.recyclerview.widget;

import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements o0OOO0o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcatAdapter f7480OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f7481OooO0O0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ConcatAdapter.Config.StableIdMode f7486OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O f7487OooO0oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f7482OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.o0O0O00, o0OOO0o> f7483OooO0Oo = new IdentityHashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f7485OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f7484OooO0o = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0OOO0o f7488OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7489OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f7490OooO0OO;
    }

    public OooO(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f7480OooO00o = concatAdapter;
        config.getClass();
        this.f7481OooO0O0 = new o0000Ooo();
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f7443OooO00o;
        this.f7486OooO0oO = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f7487OooO0oo = new o00000O.OooO0O0();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f7487OooO0oo = new o00000O.OooO00o();
        } else {
            if (stableIdMode != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f7487OooO0oo = new o00000O.OooO0OO();
        }
    }

    public final boolean OooO00o(int i, RecyclerView.Adapter<RecyclerView.o0O0O00> adapter) {
        ArrayList arrayList = this.f7485OooO0o0;
        if (i < 0 || i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i);
        }
        if (this.f7486OooO0oO != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            o000OO.OooOOO0.OooO0O0(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (adapter.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iOooO0o = OooO0o(adapter);
        if ((iOooO0o == -1 ? null : (o0OOO0o) arrayList.get(iOooO0o)) != null) {
            return false;
        }
        o0OOO0o o0ooo0o2 = new o0OOO0o(adapter, this, this.f7481OooO0O0, this.f7487OooO0oo.OooO00o());
        arrayList.add(i, o0ooo0o2);
        Iterator it = this.f7482OooO0OO.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (o0ooo0o2.f7821OooO0o0 > 0) {
            this.f7480OooO00o.notifyItemRangeInserted(OooO0OO(o0ooo0o2), o0ooo0o2.f7821OooO0o0);
        }
        OooO0O0();
        return true;
    }

    public final void OooO0O0() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.f7485OooO0o0.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                break;
            }
            o0OOO0o o0ooo0o2 = (o0OOO0o) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = o0ooo0o2.f7818OooO0OO.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && o0ooo0o2.f7821OooO0o0 == 0)) {
                break;
            }
        }
        ConcatAdapter concatAdapter = this.f7480OooO00o;
        if (stateRestorationPolicy != concatAdapter.getStateRestorationPolicy()) {
            concatAdapter.OooO0OO(stateRestorationPolicy);
        }
    }

    public final int OooO0OO(o0OOO0o o0ooo0o2) {
        o0OOO0o o0ooo0o3;
        Iterator it = this.f7485OooO0o0.iterator();
        int i = 0;
        while (it.hasNext() && (o0ooo0o3 = (o0OOO0o) it.next()) != o0ooo0o2) {
            i += o0ooo0o3.f7821OooO0o0;
        }
        return i;
    }

    @NonNull
    public final OooO00o OooO0Oo(int i) {
        OooO00o oooO00o = this.f7484OooO0o;
        if (oooO00o.f7490OooO0OO) {
            oooO00o = new OooO00o();
        } else {
            oooO00o.f7490OooO0OO = true;
        }
        int i2 = i;
        for (o0OOO0o o0ooo0o2 : this.f7485OooO0o0) {
            int i3 = o0ooo0o2.f7821OooO0o0;
            if (i3 > i2) {
                oooO00o.f7488OooO00o = o0ooo0o2;
                oooO00o.f7489OooO0O0 = i2;
                break;
            }
            i2 -= i3;
        }
        if (oooO00o.f7488OooO00o != null) {
            return oooO00o;
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot find wrapper for ", i));
    }

    public final int OooO0o(RecyclerView.Adapter<RecyclerView.o0O0O00> adapter) {
        ArrayList arrayList = this.f7485OooO0o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o0OOO0o) arrayList.get(i)).f7818OooO0OO == adapter) {
                return i;
            }
        }
        return -1;
    }

    @NonNull
    public final o0OOO0o OooO0o0(RecyclerView.o0O0O00 o0o0o00) {
        o0OOO0o o0ooo0o2 = this.f7483OooO0Oo.get(o0o0o00);
        if (o0ooo0o2 != null) {
            return o0ooo0o2;
        }
        throw new IllegalStateException("Cannot find wrapper for " + o0o0o00 + ", seems like it is not bound by this adapter: " + this);
    }
}
