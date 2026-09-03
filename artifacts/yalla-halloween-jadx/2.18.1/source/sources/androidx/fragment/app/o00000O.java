package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<Fragment> f8431OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<String, o00000O0> f8432OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, FragmentState> f8433OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000000 f8434OooO0Oo;

    public final void OooO(@NonNull o00000O0 o00000o1) {
        Fragment fragment = o00000o1.f8437OooO0OO;
        if (this.f8432OooO0O0.get(fragment.mWho) != null) {
            return;
        }
        this.f8432OooO0O0.put(fragment.mWho, o00000o1);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f8434OooO0Oo.OooO0O0(fragment);
            } else {
                this.f8434OooO0Oo.OooO0o0(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void OooO00o(@NonNull Fragment fragment) {
        if (this.f8431OooO00o.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f8431OooO00o) {
            this.f8431OooO00o.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final void OooO0O0() {
        this.f8432OooO0O0.values().removeAll(Collections.singleton(null));
    }

    @Nullable
    public final Fragment OooO0OO(@NonNull String str) {
        o00000O0 o00000o1 = this.f8432OooO0O0.get(str);
        if (o00000o1 != null) {
            return o00000o1.f8437OooO0OO;
        }
        return null;
    }

    @Nullable
    public final Fragment OooO0Oo(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (o00000O0 o00000o1 : this.f8432OooO0O0.values()) {
            if (o00000o1 != null && (fragmentFindFragmentByWho = o00000o1.f8437OooO0OO.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    @NonNull
    public final List<Fragment> OooO0o() {
        ArrayList arrayList = new ArrayList();
        for (o00000O0 o00000o1 : this.f8432OooO0O0.values()) {
            if (o00000o1 != null) {
                arrayList.add(o00000o1.f8437OooO0OO);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<o00000O0> OooO0o0() {
        ArrayList arrayList = new ArrayList();
        for (o00000O0 o00000o1 : this.f8432OooO0O0.values()) {
            if (o00000o1 != null) {
                arrayList.add(o00000o1);
            }
        }
        return arrayList;
    }

    @Nullable
    public final o00000O0 OooO0oO(@NonNull String str) {
        return this.f8432OooO0O0.get(str);
    }

    @NonNull
    public final List<Fragment> OooO0oo() {
        ArrayList arrayList;
        if (this.f8431OooO00o.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f8431OooO00o) {
            arrayList = new ArrayList(this.f8431OooO00o);
        }
        return arrayList;
    }

    public final void OooOO0(@NonNull o00000O0 o00000o1) {
        Fragment fragment = o00000o1.f8437OooO0OO;
        if (fragment.mRetainInstance) {
            this.f8434OooO0Oo.OooO0o0(fragment);
        }
        if (this.f8432OooO0O0.put(fragment.mWho, null) != null && FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    @Nullable
    public final FragmentState OooOO0O(@NonNull String str, @Nullable FragmentState fragmentState) {
        return fragmentState != null ? this.f8433OooO0OO.put(str, fragmentState) : this.f8433OooO0OO.remove(str);
    }
}
