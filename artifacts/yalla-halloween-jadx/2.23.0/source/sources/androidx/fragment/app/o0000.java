package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<Fragment> f5941OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<String, o0000Ooo> f5942OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, Bundle> f5943OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00000O0 f5944OooO0Oo;

    @Nullable
    public final Bundle OooO(@Nullable Bundle bundle, @NonNull String str) {
        HashMap<String, Bundle> map = this.f5943OooO0OO;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }

    public final void OooO00o(@NonNull Fragment fragment) {
        if (this.f5941OooO00o.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f5941OooO00o) {
            this.f5941OooO00o.add(fragment);
        }
        fragment.mAdded = true;
    }

    @Nullable
    public final Fragment OooO0O0(@NonNull String str) {
        o0000Ooo o0000ooo = this.f5942OooO0O0.get(str);
        if (o0000ooo != null) {
            return o0000ooo.f5995OooO0OO;
        }
        return null;
    }

    @Nullable
    public final Fragment OooO0OO(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (o0000Ooo o0000ooo : this.f5942OooO0O0.values()) {
            if (o0000ooo != null && (fragmentFindFragmentByWho = o0000ooo.f5995OooO0OO.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        for (o0000Ooo o0000ooo : this.f5942OooO0O0.values()) {
            if (o0000ooo != null) {
                arrayList.add(o0000ooo);
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<Fragment> OooO0o() {
        ArrayList arrayList;
        if (this.f5941OooO00o.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f5941OooO00o) {
            arrayList = new ArrayList(this.f5941OooO00o);
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList OooO0o0() {
        ArrayList arrayList = new ArrayList();
        for (o0000Ooo o0000ooo : this.f5942OooO0O0.values()) {
            if (o0000ooo != null) {
                arrayList.add(o0000ooo.f5995OooO0OO);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final void OooO0oO(@NonNull o0000Ooo o0000ooo) {
        Fragment fragment = o0000ooo.f5995OooO0OO;
        String str = fragment.mWho;
        HashMap<String, o0000Ooo> map = this.f5942OooO0O0;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, o0000ooo);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f5944OooO0Oo.OooO0O0(fragment);
            } else {
                this.f5944OooO0Oo.OooO0o0(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void OooO0oo(@NonNull o0000Ooo o0000ooo) {
        Fragment fragment = o0000ooo.f5995OooO0OO;
        if (fragment.mRetainInstance) {
            this.f5944OooO0Oo.OooO0o0(fragment);
        }
        HashMap<String, o0000Ooo> map = this.f5942OooO0O0;
        if (map.get(fragment.mWho) == o0000ooo && map.put(fragment.mWho, null) != null && FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }
}
