package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<OooO00o>>> f7723OooO00o;

    public interface OooO00o {
    }

    public OooO0O0() {
        new SparseIntArray();
        this.f7723OooO00o = new HashMap<>();
    }

    public final void OooO00o(int i, OooO00o oooO00o) {
        HashSet<WeakReference<OooO00o>> hashSet = this.f7723OooO00o.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f7723OooO00o.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(oooO00o));
    }
}
