package p242o00oo0O0;

import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p230o00oOoO0.o000;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O0 implements o000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Cue> f40415OooO0Oo;

    public o0000O0(ArrayList arrayList) {
        this.f40415OooO0Oo = Collections.unmodifiableList(arrayList);
    }

    @Override // p230o00oOoO0.o000
    public final int OooO00o(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p230o00oOoO0.o000
    public final List<Cue> OooO0O0(long j) {
        return j >= 0 ? this.f40415OooO0Oo : Collections.emptyList();
    }

    @Override // p230o00oOoO0.o000
    public final long OooO0OO(int i) {
        o00O000o.OooO00o(i == 0);
        return 0L;
    }

    @Override // p230o00oOoO0.o000
    public final int OooO0Oo() {
        return 1;
    }
}
