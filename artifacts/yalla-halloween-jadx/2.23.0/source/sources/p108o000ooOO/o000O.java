package p108o000ooOO;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o0O.OooOo;
import p321o0O0ooO.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O implements o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00 f35804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f35805OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Bitmap f35806OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Map<String, Object> f35807OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f35808OooO0OO;

        public OooO00o(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
            this.f35806OooO00o = bitmap;
            this.f35807OooO0O0 = map;
            this.f35808OooO0OO = i;
        }
    }

    public static final class OooO0O0 extends OooOo<MemoryCache.Key, OooO00o> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o000O f35809OooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, o000O o000o) {
            super(i);
            this.f35809OooO = o000o;
        }

        @Override // p188o00o0O.OooOo
        public final void OooO0O0(Object obj, Object obj2, Object obj3) {
            OooO00o oooO00o = (OooO00o) obj2;
            this.f35809OooO.f35804OooO00o.OooO0OO((MemoryCache.Key) obj, oooO00o.f35806OooO00o, oooO00o.f35807OooO0O0, oooO00o.f35808OooO0OO);
        }

        @Override // p188o00o0O.OooOo
        public final int OooO0Oo(MemoryCache.Key key, OooO00o oooO00o) {
            return oooO00o.f35808OooO0OO;
        }
    }

    public o000O(int i, @NotNull o00 o00Var) {
        this.f35804OooO00o = o00Var;
        this.f35805OooO0O0 = new OooO0O0(i, this);
    }

    @Override // p108o000ooOO.o000OOo0
    public final void OooO00o(int i) {
        OooO0O0 oooO0O0 = this.f35805OooO0O0;
        if (i >= 40) {
            oooO0O0.evictAll();
            return;
        }
        if (10 <= i && i < 20) {
            oooO0O0.trimToSize(oooO0O0.size() / 2);
        }
    }

    @Override // p108o000ooOO.o000OOo0
    @Nullable
    public final MemoryCache.OooO00o OooO0O0(@NotNull MemoryCache.Key key) {
        OooO00o oooO00o = this.f35805OooO0O0.get(key);
        if (oooO00o != null) {
            return new MemoryCache.OooO00o(oooO00o.f35806OooO00o, oooO00o.f35807OooO0O0);
        }
        return null;
    }

    @Override // p108o000ooOO.o000OOo0
    public final void OooO0OO(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int iOooO00o = o0000OO0.OooO00o(bitmap);
        OooO0O0 oooO0O0 = this.f35805OooO0O0;
        if (iOooO00o <= oooO0O0.maxSize()) {
            oooO0O0.put(key, new OooO00o(bitmap, map, iOooO00o));
        } else {
            oooO0O0.remove(key);
            this.f35804OooO00o.OooO0OO(key, bitmap, map, iOooO00o);
        }
    }
}
