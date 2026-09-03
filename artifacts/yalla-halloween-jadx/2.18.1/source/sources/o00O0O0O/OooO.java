package o00O0O0O;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f30468OooO00o;

    public OooO(@NotNull o0ooOOo weakMemoryCache) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        this.f30468OooO00o = weakMemoryCache;
    }

    @Override // o00O0O0O.o00Ooo
    public final void OooO00o(int i) {
    }

    @Override // o00O0O0O.o00Ooo
    @Nullable
    public final Oooo0.OooO00o OooO0O0(@NotNull MemoryCache$Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // o00O0O0O.o00Ooo
    public final void OooO0OO(@NotNull MemoryCache$Key key, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f30468OooO00o.OooO0OO(key, bitmap, z, p119o00O0Oo0.Oooo000.OooO00o(bitmap));
    }
}
