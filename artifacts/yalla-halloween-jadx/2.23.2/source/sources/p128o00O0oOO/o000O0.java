package p128o00O0oOO;

import coil.memory.MemoryCache;
import o00OO00O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements MemoryCache {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O0O0 f36721OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000O f36722OooO0O0;

    public o000O0(@NotNull o000O0O0 o000o0o1, @NotNull o000O o000o) {
        this.f36721OooO00o = o000o0o1;
        this.f36722OooO0O0 = o000o;
    }

    @Override // coil.memory.MemoryCache
    public final void OooO00o(int i) {
        this.f36721OooO00o.OooO00o(i);
        this.f36722OooO0O0.OooO00o(i);
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    public final MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        MemoryCache.OooO00o oooO00oOooO0O0 = this.f36721OooO00o.OooO0O0(key);
        return oooO00oOooO0O0 == null ? this.f36722OooO0O0.OooO0O0(key) : oooO00oOooO0O0;
    }

    @Override // coil.memory.MemoryCache
    public final void OooO0OO(@NotNull MemoryCache.Key key, @NotNull MemoryCache.OooO00o oooO00o) {
        this.f36721OooO00o.OooO0OO(new MemoryCache.Key(key.f11632OooO0Oo, OooO0O0.OooO0O0(key.f11633OooO0o0)), oooO00o.f11634OooO00o, OooO0O0.OooO0O0(oooO00o.f11635OooO0O0));
    }
}
