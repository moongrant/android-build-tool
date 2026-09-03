package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Integer, HashSet<WeakReference<OooO00o>>> f5163OooO00o;

    public interface OooO00o {
    }

    public OooOO0() {
        new SparseIntArray();
        this.f5163OooO00o = new HashMap<>();
    }

    public final void OooO00o(int i, OooO00o oooO00o) {
        HashMap<Integer, HashSet<WeakReference<OooO00o>>> map = this.f5163OooO00o;
        HashSet<WeakReference<OooO00o>> hashSet = map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(oooO00o));
    }
}
