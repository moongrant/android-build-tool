package p108o000ooOO;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<OooO00o>> f35813OooO00o = new LinkedHashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35814OooO0O0;

    @VisibleForTesting
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35815OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final WeakReference<Bitmap> f35816OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Map<String, Object> f35817OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f35818OooO0Oo;

        public OooO00o(int i, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i2) {
            this.f35815OooO00o = i;
            this.f35816OooO0O0 = weakReference;
            this.f35817OooO0OO = map;
            this.f35818OooO0Oo = i2;
        }
    }

    @Override // p108o000ooOO.o00
    public final synchronized void OooO00o(int i) {
        if (i >= 10 && i != 20) {
            OooO0Oo();
        }
    }

    @Override // p108o000ooOO.o00
    @Nullable
    public final synchronized MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        ArrayList<OooO00o> arrayList = this.f35813OooO00o.get(key);
        MemoryCache.OooO00o oooO00o = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooO00o oooO00o2 = arrayList.get(i);
            Bitmap bitmap = oooO00o2.f35816OooO0O0.get();
            MemoryCache.OooO00o oooO00o3 = bitmap != null ? new MemoryCache.OooO00o(bitmap, oooO00o2.f35817OooO0OO) : null;
            if (oooO00o3 != null) {
                oooO00o = oooO00o3;
                break;
            }
        }
        int i2 = this.f35814OooO0O0;
        this.f35814OooO0O0 = i2 + 1;
        if (i2 >= 10) {
            OooO0Oo();
        }
        return oooO00o;
    }

    @Override // p108o000ooOO.o00
    public final synchronized void OooO0OO(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
        LinkedHashMap<MemoryCache.Key, ArrayList<OooO00o>> linkedHashMap = this.f35813OooO00o;
        ArrayList<OooO00o> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<OooO00o> arrayList2 = arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        OooO00o oooO00o = new OooO00o(iIdentityHashCode, new WeakReference(bitmap), map, i);
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                arrayList2.add(oooO00o);
                break;
            }
            OooO00o oooO00o2 = arrayList2.get(i2);
            if (i >= oooO00o2.f35818OooO0Oo) {
                if (oooO00o2.f35815OooO00o != iIdentityHashCode || oooO00o2.f35816OooO0O0.get() != bitmap) {
                    arrayList2.add(i2, oooO00o);
                    break;
                } else {
                    arrayList2.set(i2, oooO00o);
                    break;
                }
            }
            i2++;
        }
        int i3 = this.f35814OooO0O0;
        this.f35814OooO0O0 = i3 + 1;
        if (i3 >= 10) {
            OooO0Oo();
        }
    }

    @VisibleForTesting
    public final void OooO0Oo() {
        WeakReference<Bitmap> weakReference;
        this.f35814OooO0O0 = 0;
        Iterator<ArrayList<OooO00o>> it = this.f35813OooO00o.values().iterator();
        while (it.hasNext()) {
            ArrayList<OooO00o> next = it.next();
            if (next.size() <= 1) {
                OooO00o oooO00o = (OooO00o) CollectionsKt.firstOrNull((List) next);
                if (((oooO00o == null || (weakReference = oooO00o.f35816OooO0O0) == null) ? null : weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).f35816OooO0O0.get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
