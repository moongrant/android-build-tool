package o0O0o000;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36143OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f36144OooO00o = new OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f36145OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0OoOo0 f36146OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOO0 f36147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f36148OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f36149OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f36150OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f36151OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public OooO00o f36152OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f36153OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f36154OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f36155OooOOO0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Format f36156OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0O0o000.OooO0O0.OooO00o f36157OooO0O0;
    }

    public static final class OooO0O0 implements OooOO0 {
        @Override // o0O0o000.OooOO0
        public final long OooO00o(o000oOoO o000oooo2) {
            return -1L;
        }

        @Override // o0O0o000.OooOO0
        public final oo0o0Oo OooO0O0() {
            return new oo0o0Oo.OooO0O0(-9223372036854775807L);
        }

        @Override // o0O0o000.OooOO0
        public final void OooO0OO(long j) {
        }
    }

    public final long OooO00o(long j) {
        return (((long) this.f36143OooO) * j) / 1000000;
    }

    public void OooO0O0(long j) {
        this.f36150OooO0oO = j;
    }

    public abstract long OooO0OO(o000 o000Var);

    public abstract boolean OooO0Oo(o000 o000Var, long j, OooO00o oooO00o) throws IOException;

    public void OooO0o0(boolean z) {
        if (z) {
            this.f36152OooOO0 = new OooO00o();
            this.f36148OooO0o = 0L;
            this.f36151OooO0oo = 0;
        } else {
            this.f36151OooO0oo = 1;
        }
        this.f36149OooO0o0 = -1L;
        this.f36150OooO0oO = 0L;
    }
}
