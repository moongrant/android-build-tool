package p240o00oo00O;

import com.google.android.exoplayer2.text.Cue;
import java.util.Collections;
import java.util.List;
import p230o00oOoO0.o000;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0Oo implements o000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Cue[] f40386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f40387OooO0o0;

    public o000O0Oo(Cue[] cueArr, long[] jArr) {
        this.f40386OooO0Oo = cueArr;
        this.f40387OooO0o0 = jArr;
    }

    @Override // p230o00oOoO0.o000
    public final int OooO00o(long j) {
        long[] jArr = this.f40387OooO0o0;
        int iOooO0O0 = o0O00.OooO0O0(jArr, j, false);
        if (iOooO0O0 < jArr.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p230o00oOoO0.o000
    public final List<Cue> OooO0O0(long j) {
        Cue cue;
        int iOooO0o = o0O00.OooO0o(this.f40387OooO0o0, j, false);
        return (iOooO0o == -1 || (cue = this.f40386OooO0Oo[iOooO0o]) == Cue.f13383OooOo0) ? Collections.emptyList() : Collections.singletonList(cue);
    }

    @Override // p230o00oOoO0.o000
    public final long OooO0OO(int i) {
        o00O000o.OooO00o(i >= 0);
        long[] jArr = this.f40387OooO0o0;
        o00O000o.OooO00o(i < jArr.length);
        return jArr[i];
    }

    @Override // p230o00oOoO0.o000
    public final int OooO0Oo() {
        return this.f40387OooO0o0.length;
    }
}
