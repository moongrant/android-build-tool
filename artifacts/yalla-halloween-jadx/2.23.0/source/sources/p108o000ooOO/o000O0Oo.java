package p108o000ooOO;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o0O0ooO.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo implements o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00 f35812OooO00o;

    public o000O0Oo(@NotNull o00 o00Var) {
        this.f35812OooO00o = o00Var;
    }

    @Override // p108o000ooOO.o000OOo0
    public final void OooO00o(int i) {
    }

    @Override // p108o000ooOO.o000OOo0
    @Nullable
    public final MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override // p108o000ooOO.o000OOo0
    public final void OooO0OO(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        this.f35812OooO00o.OooO0OO(key, bitmap, map, o0000OO0.OooO00o(bitmap));
    }
}
