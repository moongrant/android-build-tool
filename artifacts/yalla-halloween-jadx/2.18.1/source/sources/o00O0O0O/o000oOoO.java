package o00O0O0O;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f30520OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0o f30521OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30522OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f30523OooO0Oo;

    public static final class OooO00o implements Oooo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Bitmap f30524OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f30525OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f30526OooO0OO;

        public OooO00o(@NotNull Bitmap bitmap, boolean z, int i) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f30524OooO00o = bitmap;
            this.f30525OooO0O0 = z;
            this.f30526OooO0OO = i;
        }

        @Override // o00O0O0O.Oooo0.OooO00o
        public final boolean OooO00o() {
            return this.f30525OooO0O0;
        }

        @Override // o00O0O0O.Oooo0.OooO00o
        @NotNull
        public final Bitmap OooO0O0() {
            return this.f30524OooO00o;
        }
    }

    public o000oOoO(@NotNull o0ooOOo weakMemoryCache, @NotNull p113o00O00Oo.OooO0o referenceCounter, int i) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.f30520OooO00o = weakMemoryCache;
        this.f30521OooO0O0 = referenceCounter;
        this.f30522OooO0OO = null;
        this.f30523OooO0Oo = new o0OoOo0(this, i);
    }

    @Override // o00O0O0O.o00Ooo
    public final synchronized void OooO00o(int i) {
        o0OO00O o0oo00o2 = this.f30522OooO0OO;
        if (o0oo00o2 != null && o0oo00o2.getLevel() <= 2) {
            Intrinsics.stringPlus("trimMemory, level=", Integer.valueOf(i));
            o0oo00o2.OooO00o();
        }
        if (i >= 40) {
            synchronized (this) {
                o0OO00O o0oo00o3 = this.f30522OooO0OO;
                if (o0oo00o3 != null && o0oo00o3.getLevel() <= 2) {
                    o0oo00o3.OooO00o();
                }
                this.f30523OooO0Oo.trimToSize(-1);
            }
        } else {
            boolean z = false;
            if (10 <= i && i < 20) {
                z = true;
            }
            if (z) {
                o0OoOo0 o0oooo1 = this.f30523OooO0Oo;
                o0oooo1.trimToSize(o0oooo1.size() / 2);
            }
        }
    }

    @Override // o00O0O0O.o00Ooo
    @Nullable
    public final synchronized Oooo0.OooO00o OooO0O0(@NotNull MemoryCache$Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f30523OooO0Oo.get(key);
    }

    @Override // o00O0O0O.o00Ooo
    public final synchronized void OooO0OO(@NotNull MemoryCache$Key key, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iOooO00o = p119o00O0Oo0.Oooo000.OooO00o(bitmap);
        if (iOooO00o > this.f30523OooO0Oo.maxSize()) {
            if (this.f30523OooO0Oo.remove(key) == null) {
                this.f30520OooO00o.OooO0OO(key, bitmap, z, iOooO00o);
            }
        } else {
            this.f30521OooO0O0.OooO0OO(bitmap);
            this.f30523OooO0Oo.put(key, new OooO00o(bitmap, z, iOooO00o));
        }
    }
}
