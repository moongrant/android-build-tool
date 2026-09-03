package p226o00oOo00;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0o extends oo0o0Oo {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Object f39878OooOOo = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f39879OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f39880OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f39881OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f39882OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f39883OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f39884OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f39885OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final Object f39886OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final o000oOoO f39887OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o000oOoO.OooOO0 f39888OooOOo0;

    static {
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        oooO0O0.f12703OooO00o = "SinglePeriodTimeline";
        oooO0O0.f12704OooO0O0 = Uri.EMPTY;
        oooO0O0.OooO00o();
    }

    public o000O0o(long j, boolean z, boolean z2, o000oOoO o000oooo2) {
        o000oOoO.OooOO0 oooOO1 = z2 ? o000oooo2.f12669OooO0o : null;
        this.f39880OooO0oo = -9223372036854775807L;
        this.f39879OooO = -9223372036854775807L;
        this.f39881OooOO0 = -9223372036854775807L;
        this.f39882OooOO0O = j;
        this.f39883OooOO0o = j;
        this.f39885OooOOO0 = z;
        this.f39884OooOOO = false;
        this.f39886OooOOOO = null;
        o000oooo2.getClass();
        this.f39887OooOOOo = o000oooo2;
        this.f39888OooOOo0 = oooOO1;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO0O0(Object obj) {
        return f39878OooOOo.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
        o00O000o.OooO0OO(i, 1);
        Object obj = z ? f39878OooOOo : null;
        long j = this.f39882OooOO0O;
        oooO0O0.getClass();
        oooO0O0.OooOO0(null, obj, 0, j, 0L, AdPlaybackState.f13125OooOO0, false);
        return oooO0O0;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final Object OooOOO0(int i) {
        o00O000o.OooO0OO(i, 1);
        return f39878OooOOo;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[PHI: r1
      0x0026: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
        long j2;
        o00O000o.OooO0OO(i, 1);
        boolean z = this.f39884OooOOO;
        long j3 = 0;
        if (!z || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f39883OooOO0o;
            if (j4 != -9223372036854775807L) {
                j3 = 0 + j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        oooO0OO.OooO0O0(oo0o0Oo.OooO0OO.f12912OooOo0, this.f39887OooOOOo, this.f39886OooOOOO, this.f39880OooO0oo, this.f39879OooO, this.f39881OooOO0, this.f39885OooOOO0, z, this.f39888OooOOo0, j2, this.f39883OooOO0o, 0, 0, 0L);
        return oooO0OO;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooOOOo() {
        return 1;
    }
}
