package o00O0O0O;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import coil.memory.MemoryCache$Key;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30527OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final HashMap<MemoryCache$Key, ArrayList<OooO0O0>> f30528OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f30529OooO0OO;

    public static final class OooO00o implements Oooo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Bitmap f30530OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f30531OooO0O0;

        public OooO00o(@NotNull Bitmap bitmap, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f30530OooO00o = bitmap;
            this.f30531OooO0O0 = z;
        }

        @Override // o00O0O0O.Oooo0.OooO00o
        public final boolean OooO00o() {
            return this.f30531OooO0O0;
        }

        @Override // o00O0O0O.Oooo0.OooO00o
        @NotNull
        public final Bitmap OooO0O0() {
            return this.f30530OooO00o;
        }
    }

    @VisibleForTesting
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f30532OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final WeakReference<Bitmap> f30533OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f30534OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f30535OooO0Oo;

        public OooO0O0(int i, @NotNull WeakReference<Bitmap> bitmap, boolean z, int i2) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f30532OooO00o = i;
            this.f30533OooO0O0 = bitmap;
            this.f30534OooO0OO = z;
            this.f30535OooO0Oo = i2;
        }
    }

    @Override // o00O0O0O.o0ooOOo
    public final synchronized void OooO00o(int i) {
        o0OO00O o0oo00o2 = this.f30527OooO00o;
        if (o0oo00o2 != null && o0oo00o2.getLevel() <= 2) {
            Intrinsics.stringPlus("trimMemory, level=", Integer.valueOf(i));
            o0oo00o2.OooO00o();
        }
        if (i >= 10 && i != 20) {
            OooO0o0();
        }
    }

    @Override // o00O0O0O.o0ooOOo
    @Nullable
    public final synchronized Oooo0.OooO00o OooO0O0(@NotNull MemoryCache$Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<OooO0O0> arrayList = this.f30528OooO0O0.get(key);
        OooO00o oooO00o = null;
        if (arrayList == null) {
            return null;
        }
        int i = 0;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                OooO0O0 oooO0O0 = arrayList.get(i);
                Bitmap bitmap = oooO0O0.f30533OooO0O0.get();
                OooO00o oooO00o2 = bitmap == null ? null : new OooO00o(bitmap, oooO0O0.f30534OooO0OO);
                if (oooO00o2 != null) {
                    oooO00o = oooO00o2;
                    break;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        OooO0o();
        return oooO00o;
    }

    @Override // o00O0O0O.o0ooOOo
    public final synchronized void OooO0OO(@NotNull MemoryCache$Key key, @NotNull Bitmap bitmap, boolean z, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        HashMap<MemoryCache$Key, ArrayList<OooO0O0>> map = this.f30528OooO0O0;
        ArrayList<OooO0O0> arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(key, arrayList);
        }
        ArrayList<OooO0O0> arrayList2 = arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        OooO0O0 oooO0O0 = new OooO0O0(iIdentityHashCode, new WeakReference(bitmap), z, i);
        int i2 = 0;
        int size = arrayList2.size() - 1;
        if (size < 0) {
            arrayList2.add(oooO0O0);
            break;
        }
        while (true) {
            int i3 = i2 + 1;
            OooO0O0 oooO0O1 = arrayList2.get(i2);
            Intrinsics.checkNotNullExpressionValue(oooO0O1, "values[index]");
            OooO0O0 oooO0O2 = oooO0O1;
            if (i >= oooO0O2.f30535OooO0Oo) {
                if (oooO0O2.f30532OooO00o != iIdentityHashCode || oooO0O2.f30533OooO0O0.get() != bitmap) {
                    arrayList2.add(i2, oooO0O0);
                    break;
                } else {
                    arrayList2.set(i2, oooO0O0);
                    break;
                }
            }
            if (i3 > size) {
                arrayList2.add(oooO0O0);
                break;
            }
            i2 = i3;
        }
        OooO0o();
    }

    @Override // o00O0O0O.o0ooOOo
    public final synchronized boolean OooO0Oo(@NotNull Bitmap bitmap) {
        boolean z;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iIdentityHashCode = System.identityHashCode(bitmap);
        Collection<ArrayList<OooO0O0>> collectionValues = this.f30528OooO0O0.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "cache.values");
        Iterator<T> it = collectionValues.iterator();
        loop0: while (true) {
            z = false;
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            ArrayList arrayList = (ArrayList) it.next();
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    if (((OooO0O0) arrayList.get(i)).f30532OooO00o == iIdentityHashCode) {
                        arrayList.remove(i);
                        z = true;
                        break loop0;
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        OooO0o();
        return z;
    }

    public final void OooO0o() {
        int i = this.f30529OooO0OO;
        this.f30529OooO0OO = i + 1;
        if (i >= 10) {
            OooO0o0();
        }
    }

    @VisibleForTesting
    public final void OooO0o0() {
        this.f30529OooO0OO = 0;
        Iterator<ArrayList<OooO0O0>> it = this.f30528OooO0O0.values().iterator();
        while (it.hasNext()) {
            ArrayList<OooO0O0> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            ArrayList<OooO0O0> arrayList = next;
            if (arrayList.size() <= 1) {
                OooO0O0 oooO0O0 = (OooO0O0) CollectionsKt.firstOrNull((List) arrayList);
                if ((oooO0O0 == null ? null : oooO0O0.f30533OooO0O0.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = i + 1;
                        int i4 = i - i2;
                        if (arrayList.get(i4).f30533OooO0O0.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                        if (i3 > size) {
                            break;
                        } else {
                            i = i3;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
