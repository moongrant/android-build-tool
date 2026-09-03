package p108o000ooOO;

import coil.memory.MemoryCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o0O0ooO.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 implements MemoryCache {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo0 f35810OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00 f35811OooO0O0;

    public o000O0O0(@NotNull o000OOo0 o000ooo1, @NotNull o00 o00Var) {
        this.f35810OooO00o = o000ooo1;
        this.f35811OooO0O0 = o00Var;
    }

    @Override // coil.memory.MemoryCache
    public final void OooO00o(int i) {
        this.f35810OooO00o.OooO00o(i);
        this.f35811OooO0O0.OooO00o(i);
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    public final MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        MemoryCache.OooO00o oooO00oOooO0O0 = this.f35810OooO00o.OooO0O0(key);
        return oooO00oOooO0O0 == null ? this.f35811OooO0O0.OooO0O0(key) : oooO00oOooO0O0;
    }

    @Override // coil.memory.MemoryCache
    public final void OooO0OO(@NotNull MemoryCache.Key key, @NotNull MemoryCache.OooO00o oooO00o) {
        this.f35810OooO00o.OooO0OO(new MemoryCache.Key(key.f8542OooO0Oo, o000.OooO0O0(key.f8543OooO0o0)), oooO00o.f8544OooO00o, o000.OooO0O0(oooO00o.f8545OooO0O0));
    }
}
