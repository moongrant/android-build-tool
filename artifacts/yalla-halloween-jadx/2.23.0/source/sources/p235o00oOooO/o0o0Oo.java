package p235o00oOooO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.o00O0O;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p244o00oo0Oo.o00O000;
import p244o00oo0Oo.o00O0O0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0o0Oo extends oo0o0O0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f40297OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooOo f40298OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f40299OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f40300OooOOo0;

    public o0o0Oo(OooO00o oooO00o, DataSpec dataSpec, OooOo oooOo, int i, @Nullable Object obj, long j, long j2, long j3, int i2, OooOo oooOo2) {
        super(oooO00o, dataSpec, oooOo, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f40297OooOOOO = i2;
        this.f40298OooOOOo = oooOo2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO00o() throws IOException {
        o00O0O0 o00o0o0 = this.f40252OooO;
        o00O0OOO o00o0ooo2 = this.f40304OooOOO0;
        o00O000o.OooO0o0(o00o0ooo2);
        for (o00O0O o00o0o2 : o00o0ooo2.f40245OooO0O0) {
            if (o00o0o2.f13330OooOooo != 0) {
                o00o0o2.f13330OooOooo = 0L;
                o00o0o2.f13324OooOoO = true;
            }
        }
        TrackOutput trackOutputOooO00o = o00o0ooo2.OooO00o(this.f40297OooOOOO);
        trackOutputOooO00o.OooO0OO(this.f40298OooOOOo);
        try {
            DataSpec dataSpec = this.f40254OooO0O0;
            long j = this.f40300OooOOo0;
            long j2 = dataSpec.f14167OooO0oO;
            long jOooO00o = o00o0o0.OooO00o(dataSpec.OooO00o(j, j2 == -1 ? -1L : j2 - j));
            if (jOooO00o != -1) {
                jOooO00o += this.f40300OooOOo0;
            }
            o00O00o0 o00o00o1 = new o00O00o0(this.f40252OooO, this.f40300OooOOo0, jOooO00o);
            for (int iOooO00o = 0; iOooO00o != -1; iOooO00o = trackOutputOooO00o.OooO00o(o00o00o1, Integer.MAX_VALUE, true)) {
                this.f40300OooOOo0 += (long) iOooO00o;
            }
            trackOutputOooO00o.OooO0o0(this.f40259OooO0oO, 1, (int) this.f40300OooOOo0, 0, null);
            o00O000.OooO00o(o00o0o0);
            this.f40299OooOOo = true;
        } catch (Throwable th) {
            o00O000.OooO00o(o00o0o0);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO0O0() {
    }

    @Override // p235o00oOooO.o00OOO0
    public final boolean OooO0Oo() {
        return this.f40299OooOOo;
    }
}
