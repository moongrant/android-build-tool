package o0O0oo00;

import com.google.android.exoplayer2.text.Cue;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o00000O0;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o0000O00 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO0O0 f36899Oooo0oO = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<Cue> f36900Oooo0o;

    public OooO0O0(Cue cue) {
        this.f36900Oooo0o = Collections.singletonList(cue);
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
        return j >= 0 ? this.f36900Oooo0o : Collections.emptyList();
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        return 1;
    }

    public OooO0O0() {
        this.f36900Oooo0o = Collections.emptyList();
    }
}
