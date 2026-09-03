package p091o000o0O;

import androidx.media3.common.text.Cue;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Cue> f35189OooO0Oo;

    public oo000o(List<Cue> list) {
        this.f35189OooO0Oo = list;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO00o(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p092o000o0O0.o0OO00O
    public final List<Cue> OooO0O0(long j) {
        return j >= 0 ? this.f35189OooO0Oo : Collections.emptyList();
    }

    @Override // p092o000o0O0.o0OO00O
    public final long OooO0OO(int i) {
        o00Oo0.OooO00o(i == 0);
        return 0L;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO0Oo() {
        return 1;
    }
}
