package p324o0O0oo0O;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.util.List;
import java.util.Objects;
import p294o0O0Oo0o.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000OO extends o000OOo implements o0000O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public o0000O00 f36919Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f36920Oooo0oO;

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO00o(long j) {
        o0000O00 o0000o00 = this.f36919Oooo0o;
        Objects.requireNonNull(o0000o00);
        return o0000o00.OooO00o(j - this.f36920Oooo0oO);
    }

    @Override // p324o0O0oo0O.o0000O00
    public final long OooO0O0(int i) {
        o0000O00 o0000o00 = this.f36919Oooo0o;
        Objects.requireNonNull(o0000o00);
        return o0000o00.OooO0O0(i) + this.f36920Oooo0oO;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final List<Cue> OooO0Oo(long j) {
        o0000O00 o0000o00 = this.f36919Oooo0o;
        Objects.requireNonNull(o0000o00);
        return o0000o00.OooO0Oo(j - this.f36920Oooo0oO);
    }

    public final void OooO0o(long j, o0000O00 o0000o00, long j2) {
        this.timeUs = j;
        this.f36919Oooo0o = o0000o00;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f36920Oooo0oO = j;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        o0000O00 o0000o00 = this.f36919Oooo0o;
        Objects.requireNonNull(o0000o00);
        return o0000o00.OooO0o0();
    }

    @Override // p294o0O0Oo0o.o0Oo0oo
    public final void clear() {
        super.clear();
        this.f36919Oooo0o = null;
    }
}
