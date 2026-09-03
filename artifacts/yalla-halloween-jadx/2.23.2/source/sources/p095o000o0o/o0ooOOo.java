package p095o000o0o;

import androidx.media3.common.text.Cue;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Cue[] f35275OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f35276OooO0o0;

    public o0ooOOo(Cue[] cueArr, long[] jArr) {
        this.f35275OooO0Oo = cueArr;
        this.f35276OooO0o0 = jArr;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO00o(long j) {
        long[] jArr = this.f35276OooO0o0;
        int iOooO0O0 = o00.OooO0O0(jArr, j, false);
        if (iOooO0O0 < jArr.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p092o000o0O0.o0OO00O
    public final List<Cue> OooO0O0(long j) {
        Cue cue;
        int iOooO0o = o00.OooO0o(this.f35276OooO0o0, j, false);
        return (iOooO0o == -1 || (cue = this.f35275OooO0Oo[iOooO0o]) == Cue.f6879OooOo0) ? Collections.emptyList() : Collections.singletonList(cue);
    }

    @Override // p092o000o0O0.o0OO00O
    public final long OooO0OO(int i) {
        o00Oo0.OooO00o(i >= 0);
        long[] jArr = this.f35276OooO0o0;
        o00Oo0.OooO00o(i < jArr.length);
        return jArr[i];
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO0Oo() {
        return this.f35276OooO0o0.length;
    }
}
