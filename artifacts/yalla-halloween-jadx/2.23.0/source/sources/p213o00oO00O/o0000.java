package p213o00oO00O;

import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o00OO000;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39638OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO000 f39639OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OO000 f39640OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f39641OooO0Oo;

    public o0000(long j, long j2, long j3) {
        this.f39641OooO0Oo = j;
        this.f39638OooO00o = j3;
        o00OO000 o00oo001 = new o00OO000();
        this.f39639OooO0O0 = o00oo001;
        o00OO000 o00oo002 = new o00OO000();
        this.f39640OooO0OO = o00oo002;
        o00oo001.OooO00o(0L);
        o00oo002.OooO00o(j2);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39641OooO0Oo;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o(long j) {
        return this.f39639OooO0O0.OooO0O0(o0O00.OooO0Oo(this.f39640OooO0OO, j));
    }

    public final boolean OooO0O0(long j) {
        o00OO000 o00oo001 = this.f39639OooO0O0;
        return j - o00oo001.OooO0O0(o00oo001.f40572OooO00o - 1) < 100000;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        o00OO000 o00oo001 = this.f39639OooO0O0;
        int iOooO0Oo = o0O00.OooO0Oo(o00oo001, j);
        long jOooO0O0 = o00oo001.OooO0O0(iOooO0Oo);
        o00OO000 o00oo002 = this.f39640OooO0OO;
        oo0O oo0o = new oo0O(jOooO0O0, o00oo002.OooO0O0(iOooO0Oo));
        if (jOooO0O0 == j || iOooO0Oo == o00oo001.f40572OooO00o - 1) {
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        int i = iOooO0Oo + 1;
        return new o00OO0OO.OooO00o(oo0o, new oo0O(o00oo001.OooO0O0(i), o00oo002.OooO0O0(i)));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return this.f39638OooO00o;
    }
}
