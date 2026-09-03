package androidx.camera.core;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.OooOOO;
import androidx.camera.core.impl.o000O0O0;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p028Oooo0oO.o000O00O;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o00O0O0O;
import p028Oooo0oO.o00OO00O;
import p028Oooo0oO.oo00o;
import p034OoooOO0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOO implements o000O0O0, OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LongSparseArray<oo00o> f3450OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3451OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f3452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3453OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O0O f3454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public final o000O0O0 f3455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f3456OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public o000O0O0.OooO00o f3457OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public Executor f3458OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LongSparseArray<OooOOO0> f3459OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3460OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayList f3461OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayList f3462OooOOO0;

    public class OooO00o extends o000oOoO {
        public OooO00o() {
        }

        @Override // androidx.camera.core.impl.o000oOoO
        public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
            OooOOO oooOOO = OooOOO.this;
            synchronized (oooOOO.f3451OooO00o) {
                if (oooOOO.f3456OooO0o0) {
                    return;
                }
                oooOOO.f3450OooO.put(o00oo1.OooO0OO(), new o0OoOo0(o00oo1));
                oooOOO.OooOO0O();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Oooo0oO.o00O0O0O] */
    public OooOOO(int i, int i2, int i3, int i4) {
        o000O00O o000o00o2 = new o000O00O(ImageReader.newInstance(i, i2, i3, i4));
        this.f3451OooO00o = new Object();
        this.f3452OooO0O0 = new OooO00o();
        this.f3453OooO0OO = 0;
        this.f3454OooO0Oo = new o000O0O0.OooO00o() { // from class: Oooo0oO.o00O0O0O
            @Override // androidx.camera.core.impl.o000O0O0.OooO00o
            public final void OooO00o(o000O0O0 o000o0o1) {
                OooOOO oooOOO = this.f1130OooO00o;
                synchronized (oooOOO.f3451OooO00o) {
                    oooOOO.f3453OooO0OO++;
                }
                oooOOO.OooOO0(o000o0o1);
            }
        };
        this.f3456OooO0o0 = false;
        this.f3450OooO = new LongSparseArray<>();
        this.f3459OooOO0 = new LongSparseArray<>();
        this.f3462OooOOO0 = new ArrayList();
        this.f3455OooO0o = o000o00o2;
        this.f3460OooOO0O = 0;
        this.f3461OooOO0o = new ArrayList(OooO0o0());
    }

    public final void OooO(o00OO00O o00oo00o) {
        final o000O0O0.OooO00o oooO00o;
        Executor executor;
        synchronized (this.f3451OooO00o) {
            if (this.f3461OooOO0o.size() < OooO0o0()) {
                o00oo00o.OooO00o(this);
                this.f3461OooOO0o.add(o00oo00o);
                oooO00o = this.f3457OooO0oO;
                executor = this.f3458OooO0oo;
            } else {
                o00O0O0.OooO00o("TAG", "Maximum image number reached.");
                o00oo00o.close();
                oooO00o = null;
                executor = null;
            }
        }
        if (oooO00o != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: Oooo0oO.o00O0OO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOO oooOOO = this.f1132OooO0Oo;
                        oooOOO.getClass();
                        oooO00o.OooO00o(oooOOO);
                    }
                });
            } else {
                oooO00o.OooO00o(this);
            }
        }
    }

    @Override // androidx.camera.core.OooOO0O.OooO00o
    public final void OooO00o(@NonNull OooOOO0 oooOOO0) {
        synchronized (this.f3451OooO00o) {
            OooO0oo(oooOOO0);
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0O0() {
        synchronized (this.f3451OooO00o) {
            if (this.f3461OooOO0o.isEmpty()) {
                return null;
            }
            if (this.f3460OooOO0O >= this.f3461OooOO0o.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f3461OooOO0o.size() - 1; i++) {
                if (!this.f3462OooOOO0.contains(this.f3461OooOO0o.get(i))) {
                    arrayList.add((OooOOO0) this.f3461OooOO0o.get(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OooOOO0) it.next()).close();
            }
            int size = this.f3461OooOO0o.size() - 1;
            ArrayList arrayList2 = this.f3461OooOO0o;
            this.f3460OooOO0O = size + 1;
            OooOOO0 oooOOO0 = (OooOOO0) arrayList2.get(size);
            this.f3462OooOOO0.add(oooOOO0);
            return oooOOO0;
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0OO() {
        int iOooO0OO;
        synchronized (this.f3451OooO00o) {
            iOooO0OO = this.f3455OooO0o.OooO0OO();
        }
        return iOooO0OO;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0Oo() {
        synchronized (this.f3451OooO00o) {
            this.f3455OooO0o.OooO0Oo();
            this.f3457OooO0oO = null;
            this.f3458OooO0oo = null;
            this.f3453OooO0OO = 0;
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0o(@NonNull o000O0O0.OooO00o oooO00o, @NonNull Executor executor) {
        synchronized (this.f3451OooO00o) {
            oooO00o.getClass();
            this.f3457OooO0oO = oooO00o;
            executor.getClass();
            this.f3458OooO0oo = executor;
            this.f3455OooO0o.OooO0o(this.f3454OooO0Oo, executor);
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0o0() {
        int iOooO0o0;
        synchronized (this.f3451OooO00o) {
            iOooO0o0 = this.f3455OooO0o.OooO0o0();
        }
        return iOooO0o0;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0oO() {
        synchronized (this.f3451OooO00o) {
            if (this.f3461OooOO0o.isEmpty()) {
                return null;
            }
            if (this.f3460OooOO0O >= this.f3461OooOO0o.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = this.f3461OooOO0o;
            int i = this.f3460OooOO0O;
            this.f3460OooOO0O = i + 1;
            OooOOO0 oooOOO0 = (OooOOO0) arrayList.get(i);
            this.f3462OooOOO0.add(oooOOO0);
            return oooOOO0;
        }
    }

    public final void OooO0oo(OooOOO0 oooOOO0) {
        synchronized (this.f3451OooO00o) {
            int iIndexOf = this.f3461OooOO0o.indexOf(oooOOO0);
            if (iIndexOf >= 0) {
                this.f3461OooOO0o.remove(iIndexOf);
                int i = this.f3460OooOO0O;
                if (iIndexOf <= i) {
                    this.f3460OooOO0O = i - 1;
                }
            }
            this.f3462OooOOO0.remove(oooOOO0);
            if (this.f3453OooO0OO > 0) {
                OooOO0(this.f3455OooO0o);
            }
        }
    }

    public final void OooOO0(o000O0O0 o000o0o1) {
        OooOOO0 oooOOO0OooO0oO;
        synchronized (this.f3451OooO00o) {
            if (this.f3456OooO0o0) {
                return;
            }
            int size = this.f3459OooOO0.size() + this.f3461OooOO0o.size();
            if (size >= o000o0o1.OooO0o0()) {
                o00O0O0.OooO00o("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    oooOOO0OooO0oO = o000o0o1.OooO0oO();
                    if (oooOOO0OooO0oO != null) {
                        this.f3453OooO0OO--;
                        size++;
                        this.f3459OooOO0.put(oooOOO0OooO0oO.o00000Oo().OooO0OO(), oooOOO0OooO0oO);
                        OooOO0O();
                    }
                } catch (IllegalStateException e) {
                    String strOooO0oO = o00O0O0.OooO0oO("MetadataImageReader");
                    if (o00O0O0.OooO0o(3, strOooO0oO)) {
                        Log.d(strOooO0oO, "Failed to acquire next image.", e);
                    }
                    oooOOO0OooO0oO = null;
                }
                if (oooOOO0OooO0oO == null || this.f3453OooO0OO <= 0) {
                    break;
                }
            } while (size < o000o0o1.OooO0o0());
        }
    }

    public final void OooOO0O() {
        synchronized (this.f3451OooO00o) {
            for (int size = this.f3450OooO.size() - 1; size >= 0; size--) {
                oo00o oo00oVarValueAt = this.f3450OooO.valueAt(size);
                long jOooO0OO = oo00oVarValueAt.OooO0OO();
                OooOOO0 oooOOO0 = this.f3459OooOO0.get(jOooO0OO);
                if (oooOOO0 != null) {
                    this.f3459OooOO0.remove(jOooO0OO);
                    this.f3450OooO.removeAt(size);
                    OooO(new o00OO00O(oooOOO0, null, oo00oVarValueAt));
                }
            }
            OooOO0o();
        }
    }

    public final void OooOO0o() {
        synchronized (this.f3451OooO00o) {
            if (this.f3459OooOO0.size() != 0 && this.f3450OooO.size() != 0) {
                Long lValueOf = Long.valueOf(this.f3459OooOO0.keyAt(0));
                Long lValueOf2 = Long.valueOf(this.f3450OooO.keyAt(0));
                o000OO.OooOOO0.OooO00o(lValueOf2.equals(lValueOf) ? false : true);
                if (lValueOf2.longValue() > lValueOf.longValue()) {
                    for (int size = this.f3459OooOO0.size() - 1; size >= 0; size--) {
                        if (this.f3459OooOO0.keyAt(size) < lValueOf2.longValue()) {
                            this.f3459OooOO0.valueAt(size).close();
                            this.f3459OooOO0.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f3450OooO.size() - 1; size2 >= 0; size2--) {
                        if (this.f3450OooO.keyAt(size2) < lValueOf.longValue()) {
                            this.f3450OooO.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void close() {
        synchronized (this.f3451OooO00o) {
            if (this.f3456OooO0o0) {
                return;
            }
            Iterator it = new ArrayList(this.f3461OooOO0o).iterator();
            while (it.hasNext()) {
                ((OooOOO0) it.next()).close();
            }
            this.f3461OooOO0o.clear();
            this.f3455OooO0o.close();
            this.f3456OooO0o0 = true;
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getHeight() {
        int height;
        synchronized (this.f3451OooO00o) {
            height = this.f3455OooO0o.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f3451OooO00o) {
            surface = this.f3455OooO0o.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getWidth() {
        int width;
        synchronized (this.f3451OooO00o) {
            width = this.f3455OooO0o.getWidth();
        }
        return width;
    }
}
