package o00O0O0O;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Ooo f30499OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f30500OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0o f30501OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0O0 f30502OooO0Oo;

    public interface OooO00o {
        boolean OooO00o();

        @NotNull
        Bitmap OooO0O0();
    }

    public Oooo0(@NotNull o00Ooo strongMemoryCache, @NotNull o0ooOOo weakMemoryCache, @NotNull p113o00O00Oo.OooO0o referenceCounter, @NotNull p113o00O00Oo.OooO0O0 bitmapPool) {
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.f30499OooO00o = strongMemoryCache;
        this.f30500OooO0O0 = weakMemoryCache;
        this.f30501OooO0OO = referenceCounter;
        this.f30502OooO0Oo = bitmapPool;
    }
}
