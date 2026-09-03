package o000Oo0;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.Cache;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Oooo0 implements androidx.media3.datasource.cache.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TreeSet<OooO> f34836OooO00o = new TreeSet<>(new Oooo000());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f34837OooO0O0;

    @Override // androidx.media3.datasource.cache.Cache.OooO00o
    public final void OooO00o(Cache cache, OooO oooO) {
        this.f34836OooO00o.add(oooO);
        this.f34837OooO0O0 += oooO.f34786OooO0o;
        OooO0o(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.OooO00o
    public final void OooO0O0(OooO oooO) {
        this.f34836OooO00o.remove(oooO);
        this.f34837OooO0O0 -= oooO.f34786OooO0o;
    }

    @Override // androidx.media3.datasource.cache.OooO00o
    public final void OooO0OO(Cache cache, long j) {
        if (j != -1) {
            OooO0o(cache, j);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.OooO00o
    public final void OooO0Oo(Cache cache, OooO oooO, o00Oo0 o00oo1) {
        OooO0O0(oooO);
        OooO00o(cache, o00oo1);
    }

    public final void OooO0o(Cache cache, long j) {
        while (this.f34837OooO0O0 + j > 1073741824) {
            TreeSet<OooO> treeSet = this.f34836OooO00o;
            if (treeSet.isEmpty()) {
                return;
            } else {
                cache.OooO(treeSet.first());
            }
        }
    }

    @Override // androidx.media3.datasource.cache.OooO00o
    public final void OooO0o0() {
    }
}
