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
public final class o000000 extends ViewModel {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f8424OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f8428OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<String, Fragment> f8425OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<String, o000000> f8426OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, ViewModelStore> f8427OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f8430OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f8429OooO0o = false;

    public class OooO00o implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
            return new o000000(true);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.OooOOOO.OooO0O0(this, cls, creationExtras);
        }
    }

    public o000000(boolean z) {
        this.f8428OooO0Oo = z;
    }

    public final void OooO0O0(@NonNull Fragment fragment) {
        if (this.f8429OooO0o) {
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8425OooO00o.containsKey(fragment.mWho)) {
                return;
            }
            this.f8425OooO00o.put(fragment.mWho, fragment);
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public final void OooO0OO(@NonNull Fragment fragment) {
        if (FragmentManager.Oooo0oO(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        OooO0Oo(fragment.mWho);
    }

    public final void OooO0Oo(@NonNull String str) {
        o000000 o000000Var = this.f8426OooO0O0.get(str);
        if (o000000Var != null) {
            o000000Var.onCleared();
            this.f8426OooO0O0.remove(str);
        }
        ViewModelStore viewModelStore = this.f8427OooO0OO.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.f8427OooO0OO.remove(str);
        }
    }

    public final void OooO0o0(@NonNull Fragment fragment) {
        if (this.f8429OooO0o) {
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f8425OooO00o.remove(fragment.mWho) != null) && FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000000.class != obj.getClass()) {
            return false;
        }
        o000000 o000000Var = (o000000) obj;
        return this.f8425OooO00o.equals(o000000Var.f8425OooO00o) && this.f8426OooO0O0.equals(o000000Var.f8426OooO0O0) && this.f8427OooO0OO.equals(o000000Var.f8427OooO0OO);
    }

    public final int hashCode() {
        return this.f8427OooO0OO.hashCode() + ((this.f8426OooO0O0.hashCode() + (this.f8425OooO00o.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (FragmentManager.Oooo0oO(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f8430OooO0o0 = true;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f8425OooO00o.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f8426OooO0O0.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f8427OooO0OO.keySet().iterator();
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
