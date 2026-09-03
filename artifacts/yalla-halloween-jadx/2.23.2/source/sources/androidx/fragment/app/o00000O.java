package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O extends ViewModel {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f5974OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f5978OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<String, Fragment> f5975OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<String, o00000O> f5976OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, ViewModelStore> f5977OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5980OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f5979OooO0o = false;

    public class OooO00o implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.Oooo000.OooO0O0(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
            return new o00000O(true);
        }
    }

    public o00000O(boolean z) {
        this.f5978OooO0Oo = z;
    }

    public final void OooO0O0(@NonNull Fragment fragment) {
        if (this.f5979OooO0o) {
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, Fragment> map = this.f5975OooO00o;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void OooO0OO(@NonNull Fragment fragment) {
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        OooO0Oo(fragment.mWho);
    }

    public final void OooO0Oo(@NonNull String str) {
        HashMap<String, o00000O> map = this.f5976OooO0O0;
        o00000O o00000o = map.get(str);
        if (o00000o != null) {
            o00000o.onCleared();
            map.remove(str);
        }
        HashMap<String, ViewModelStore> map2 = this.f5977OooO0OO;
        ViewModelStore viewModelStore = map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            map2.remove(str);
        }
    }

    public final void OooO0o0(@NonNull Fragment fragment) {
        if (this.f5979OooO0o) {
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if ((this.f5975OooO00o.remove(fragment.mWho) != null) && FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00000O.class != obj.getClass()) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return this.f5975OooO00o.equals(o00000o.f5975OooO00o) && this.f5976OooO0O0.equals(o00000o.f5976OooO0O0) && this.f5977OooO0OO.equals(o00000o.f5977OooO0OO);
    }

    public final int hashCode() {
        return this.f5977OooO0OO.hashCode() + ((this.f5976OooO0O0.hashCode() + (this.f5975OooO00o.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5980OooO0o0 = true;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f5975OooO00o.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f5976OooO0O0.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f5977OooO0OO.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
