package p246o00oo0o0;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.OooO00o;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00oOoo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TreeSet<o000OO0O> f40731OooO00o = new TreeSet<>(new o0O0ooO());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f40732OooO0O0;

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.OooO00o
    public final void OooO00o(Cache cache, o000OO0O o000oo0o2) {
        this.f40731OooO00o.add(o000oo0o2);
        this.f40732OooO0O0 += o000oo0o2.f40718OooO0o;
        OooO0o(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.OooO00o
    public final void OooO0O0(Cache cache, long j) {
        if (j != -1) {
            OooO0o(cache, j);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.OooO00o
    public final void OooO0OO(Cache cache, o000OO0O o000oo0o2, o00O00 o00o01) {
        OooO0Oo(o000oo0o2);
        OooO00o(cache, o00o01);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.OooO00o
    public final void OooO0Oo(o000OO0O o000oo0o2) {
        this.f40731OooO00o.remove(o000oo0o2);
        this.f40732OooO0O0 -= o000oo0o2.f40718OooO0o;
    }

    public final void OooO0o(Cache cache, long j) {
        while (this.f40732OooO0O0 + j > 1073741824) {
            TreeSet<o000OO0O> treeSet = this.f40731OooO00o;
            if (treeSet.isEmpty()) {
                return;
            } else {
                cache.OooOO0(treeSet.first());
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.OooO00o
    public final void OooO0o0() {
    }
}
