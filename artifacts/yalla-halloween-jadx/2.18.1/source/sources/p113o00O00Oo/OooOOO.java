package p113o00O00Oo;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021OooOooo.o00O0O;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements OooO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Handler f30244OooO0o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f30245OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f30246OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30247OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final p021OooOooo.o0ooOOo<OooO00o> f30248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f30249OooO0o0;

    @VisibleForTesting
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final WeakReference<Bitmap> f30250OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f30251OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f30252OooO0OO;

        public OooO00o(@NotNull WeakReference bitmap, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f30250OooO00o = bitmap;
            this.f30251OooO0O0 = 0;
            this.f30252OooO0OO = z;
        }
    }

    public OooOOO(@NotNull o0ooOOo weakMemoryCache, @NotNull OooO0O0 bitmapPool) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.f30245OooO00o = weakMemoryCache;
        this.f30246OooO0O0 = bitmapPool;
        this.f30247OooO0OO = null;
        this.f30248OooO0Oo = new p021OooOooo.o0ooOOo<>();
    }

    @Override // p113o00O00Oo.OooO0o
    public final synchronized void OooO00o(@NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iIdentityHashCode = System.identityHashCode(bitmap);
        if (!z) {
            OooO0o0(iIdentityHashCode, bitmap).f30252OooO0OO = false;
        } else if (OooO0o(iIdentityHashCode, bitmap) == null) {
            this.f30248OooO0Oo.OooOO0O(iIdentityHashCode, new OooO00o(new WeakReference(bitmap), true));
        }
        OooO0Oo();
    }

    @Override // p113o00O00Oo.OooO0o
    public final synchronized boolean OooO0O0(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iIdentityHashCode = System.identityHashCode(bitmap);
        OooO00o oooO00oOooO0o = OooO0o(iIdentityHashCode, bitmap);
        if (oooO00oOooO0o == null) {
            o0OO00O o0oo00o2 = this.f30247OooO0OO;
            if (o0oo00o2 != null && o0oo00o2.getLevel() <= 2) {
                o0oo00o2.OooO00o();
            }
            return false;
        }
        oooO00oOooO0o.f30251OooO0O0--;
        o0OO00O o0oo00o3 = this.f30247OooO0OO;
        if (o0oo00o3 != null && o0oo00o3.getLevel() <= 2) {
            o0oo00o3.OooO00o();
        }
        boolean z = oooO00oOooO0o.f30251OooO0O0 <= 0 && oooO00oOooO0o.f30252OooO0OO;
        if (z) {
            p021OooOooo.o0ooOOo<OooO00o> o0ooooo2 = this.f30248OooO0Oo;
            int iOooO0O0 = o00O0O.OooO0O0(o0ooooo2.f437Oooo0oO, o0ooooo2.f435Oooo, iIdentityHashCode);
            if (iOooO0O0 >= 0) {
                Object[] objArr = o0ooooo2.f438Oooo0oo;
                Object obj = objArr[iOooO0O0];
                Object obj2 = p021OooOooo.o0ooOOo.f434OoooO00;
                if (obj != obj2) {
                    objArr[iOooO0O0] = obj2;
                    o0ooooo2.f436Oooo0o = true;
                }
            }
            this.f30245OooO00o.OooO0Oo(bitmap);
            f30244OooO0o.post(new OooOOO0(this, bitmap, 0));
        }
        OooO0Oo();
        return z;
    }

    @Override // p113o00O00Oo.OooO0o
    public final synchronized void OooO0OO(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        OooO0o0(System.identityHashCode(bitmap), bitmap).f30251OooO0O0++;
        o0OO00O o0oo00o2 = this.f30247OooO0OO;
        if (o0oo00o2 != null && o0oo00o2.getLevel() <= 2) {
            o0oo00o2.OooO00o();
        }
        OooO0Oo();
    }

    public final void OooO0Oo() {
        int i = this.f30249OooO0o0;
        this.f30249OooO0o0 = i + 1;
        if (i < 50) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int iOooOO0o = this.f30248OooO0Oo.OooOO0o();
        int i2 = 0;
        if (iOooOO0o > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (this.f30248OooO0Oo.OooOOO0(i3).f30250OooO00o.get() == null) {
                    arrayList.add(Integer.valueOf(i3));
                }
                if (i4 >= iOooOO0o) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        p021OooOooo.o0ooOOo<OooO00o> o0ooooo2 = this.f30248OooO0Oo;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i5 = i2 + 1;
            int iIntValue = ((Number) arrayList.get(i2)).intValue();
            Object[] objArr = o0ooooo2.f438Oooo0oo;
            Object obj = objArr[iIntValue];
            Object obj2 = p021OooOooo.o0ooOOo.f434OoooO00;
            if (obj != obj2) {
                objArr[iIntValue] = obj2;
                o0ooooo2.f436Oooo0o = true;
            }
            if (i5 > size) {
                return;
            } else {
                i2 = i5;
            }
        }
    }

    public final OooO00o OooO0o(int i, Bitmap bitmap) {
        OooO00o oooO00oOooO0oO = this.f30248OooO0Oo.OooO0oO(i, null);
        if (oooO00oOooO0oO == null) {
            return null;
        }
        if (oooO00oOooO0oO.f30250OooO00o.get() == bitmap) {
            return oooO00oOooO0oO;
        }
        return null;
    }

    public final OooO00o OooO0o0(int i, Bitmap bitmap) {
        OooO00o oooO00oOooO0o = OooO0o(i, bitmap);
        if (oooO00oOooO0o != null) {
            return oooO00oOooO0o;
        }
        OooO00o oooO00o = new OooO00o(new WeakReference(bitmap), false);
        this.f30248OooO0Oo.OooOO0O(i, oooO00o);
        return oooO00o;
    }
}
