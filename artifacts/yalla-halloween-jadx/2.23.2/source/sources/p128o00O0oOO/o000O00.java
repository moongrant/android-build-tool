package p128o00O0oOO;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import o00OO00O.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 implements o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O f36723OooO00o;

    public o000O00(@NotNull o000O o000o) {
        this.f36723OooO00o = o000o;
    }

    @Override // p128o00O0oOO.o000O0O0
    public final void OooO00o(int i) {
    }

    @Override // p128o00O0oOO.o000O0O0
    @Nullable
    public final MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override // p128o00O0oOO.o000O0O0
    public final void OooO0OO(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        this.f36723OooO00o.OooO0OO(key, bitmap, map, OooO00o.OooO00o(bitmap));
    }
}
