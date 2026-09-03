package p317o0O0oOOO;

import com.google.android.exoplayer2.text.Cue;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o00000O0;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 implements o0000O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<Cue> f36624Oooo0o;

    public o00O00(List<Cue> list) {
        this.f36624Oooo0o = Collections.unmodifiableList(list);
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO00o(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final long OooO0O0(int i) {
        o00000O0.OooO00o(i == 0);
        return 0L;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final List<Cue> OooO0Oo(long j) {
        return j >= 0 ? this.f36624Oooo0o : Collections.emptyList();
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        return 1;
    }
}
