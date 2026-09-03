package o00O0O0O;

import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0o f30492OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f30493OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f30494OooO0OO;

    public OooOo(@NotNull p113o00O00Oo.OooO0o referenceCounter, @NotNull o00Ooo strongMemoryCache, @NotNull o0ooOOo weakMemoryCache) {
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        this.f30492OooO00o = referenceCounter;
        this.f30493OooO0O0 = strongMemoryCache;
        this.f30494OooO0OO = weakMemoryCache;
    }

    @Nullable
    public final Oooo0.OooO00o OooO00o(@Nullable MemoryCache$Key memoryCache$Key) {
        if (memoryCache$Key == null) {
            return null;
        }
        Oooo0.OooO00o oooO00oOooO0O0 = this.f30493OooO0O0.OooO0O0(memoryCache$Key);
        if (oooO00oOooO0O0 == null) {
            oooO00oOooO0O0 = this.f30494OooO0OO.OooO0O0(memoryCache$Key);
        }
        if (oooO00oOooO0O0 != null) {
            this.f30492OooO00o.OooO0OO(oooO00oOooO0O0.OooO0O0());
        }
        return oooO00oOooO0O0;
    }
}
