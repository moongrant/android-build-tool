package p128o00O0oOO;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p190o00o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo implements o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O f36726OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f36727OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Bitmap f36728OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Map<String, Object> f36729OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36730OooO0OO;

        public OooO00o(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
            this.f36728OooO00o = bitmap;
            this.f36729OooO0O0 = map;
            this.f36730OooO0OO = i;
        }
    }

    public static final class OooO0O0 extends OooOo00<MemoryCache.Key, OooO00o> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o000O0Oo f36731OooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, o000O0Oo o000o0oo2) {
            super(i);
            this.f36731OooO = o000o0oo2;
        }

        @Override // p190o00o0O.OooOo00
        public final void OooO0O0(Object obj, Object obj2, Object obj3) {
            OooO00o oooO00o = (OooO00o) obj2;
            this.f36731OooO.f36726OooO00o.OooO0OO((MemoryCache.Key) obj, oooO00o.f36728OooO00o, oooO00o.f36729OooO0O0, oooO00o.f36730OooO0OO);
        }

        @Override // p190o00o0O.OooOo00
        public final int OooO0Oo(MemoryCache.Key key, OooO00o oooO00o) {
            return oooO00o.f36730OooO0OO;
        }
    }

    public o000O0Oo(int i, @NotNull o000O o000o) {
        this.f36726OooO00o = o000o;
        this.f36727OooO0O0 = new OooO0O0(i, this);
    }

    @Override // p128o00O0oOO.o000O0O0
    public final void OooO00o(int i) {
        OooO0O0 oooO0O0 = this.f36727OooO0O0;
        if (i >= 40) {
            oooO0O0.evictAll();
            return;
        }
        if (10 <= i && i < 20) {
            oooO0O0.trimToSize(oooO0O0.size() / 2);
        }
    }

    @Override // p128o00O0oOO.o000O0O0
    @Nullable
    public final MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        OooO00o oooO00o = this.f36727OooO0O0.get(key);
        if (oooO00o != null) {
            return new MemoryCache.OooO00o(oooO00o.f36728OooO00o, oooO00o.f36729OooO0O0);
        }
        return null;
    }

    @Override // p128o00O0oOO.o000O0O0
    public final void OooO0OO(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int iOooO00o = o00OO00O.OooO00o.OooO00o(bitmap);
        OooO0O0 oooO0O0 = this.f36727OooO0O0;
        if (iOooO00o <= oooO0O0.maxSize()) {
            oooO0O0.put(key, new OooO00o(bitmap, map, iOooO00o));
        } else {
            oooO0O0.remove(key);
            this.f36726OooO00o.OooO0OO(key, bitmap, map, iOooO00o);
        }
    }
}
