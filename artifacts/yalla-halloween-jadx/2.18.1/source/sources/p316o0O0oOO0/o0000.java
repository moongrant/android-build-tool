package p316o0O0oOO0;

import com.google.android.exoplayer2.text.Cue;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements o0000O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Cue[] f36617Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long[] f36618Oooo0oO;

    public o0000(Cue[] cueArr, long[] jArr) {
        this.f36617Oooo0o = cueArr;
        this.f36618Oooo0oO = jArr;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO00o(long j) {
        int iOooO0O0 = o000OOo0.OooO0O0(this.f36618Oooo0oO, j, false);
        if (iOooO0O0 < this.f36618Oooo0oO.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final long OooO0O0(int i) {
        o00000O0.OooO00o(i >= 0);
        o00000O0.OooO00o(i < this.f36618Oooo0oO.length);
        return this.f36618Oooo0oO[i];
    }

    @Override // p324o0O0oo0O.o0000O00
    public final List<Cue> OooO0Oo(long j) {
        int iOooO0o0 = o000OOo0.OooO0o0(this.f36618Oooo0oO, j, false);
        if (iOooO0o0 != -1) {
            Cue[] cueArr = this.f36617Oooo0o;
            if (cueArr[iOooO0o0] != Cue.f14617OooOOOo) {
                return Collections.singletonList(cueArr[iOooO0o0]);
            }
        }
        return Collections.emptyList();
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        return this.f36618Oooo0oO.length;
    }
}
