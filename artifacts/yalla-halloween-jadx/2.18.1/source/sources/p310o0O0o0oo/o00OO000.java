package p310o0O0o0oo;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.Objects;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f36459OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f36460OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f36461OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f36462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final OooOOO f36463OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36464OooO0o0;

    static {
        OooOOO.OooO0O0 oooO0O0 = new OooOOO.OooO0O0();
        oooO0O0.f13272OooO00o = "com.google.android.exoplayer2.source.SinglePeriodTimeline";
        oooO0O0.f13273OooO0O0 = Uri.EMPTY;
        oooO0O0.OooO00o();
    }

    public o00OO000(long j, boolean z, boolean z2, OooOOO oooOOO) {
        this.f36460OooO0O0 = j;
        this.f36461OooO0OO = j;
        this.f36462OooO0Oo = z;
        this.f36464OooO0o0 = z2;
        Objects.requireNonNull(oooOOO);
        this.f36463OooO0o = oooOOO;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO0O0(Object obj) {
        return f36459OooO0oO.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final o000oOoO.OooO0O0 OooO0o(int i, o000oOoO.OooO0O0 oooO0O0, boolean z) {
        o00000O0.OooO0OO(i, 1);
        Object obj = z ? f36459OooO0oO : null;
        long j = this.f36460OooO0O0;
        Objects.requireNonNull(oooO0O0);
        AdPlaybackState adPlaybackState = AdPlaybackState.f14608OooO0o0;
        oooO0O0.f14557OooO00o = null;
        oooO0O0.f14558OooO0O0 = obj;
        oooO0O0.f14559OooO0OO = 0;
        oooO0O0.f14560OooO0Oo = j;
        oooO0O0.f14562OooO0o0 = 0L;
        oooO0O0.f14561OooO0o = adPlaybackState;
        return oooO0O0;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO0oo() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final Object OooOO0O(int i) {
        o00000O0.OooO0OO(i, 1);
        return f36459OooO0oO;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooOOO() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final o000oOoO.OooO0OO OooOOO0(int i, o000oOoO.OooO0OO oooO0OO, long j) {
        o00000O0.OooO0OO(i, 1);
        Object obj = o000oOoO.OooO0OO.f14564OooOOo0;
        oooO0OO.OooO0O0(this.f36463OooO0o, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f36462OooO0Oo, false, this.f36464OooO0o0, 0L, this.f36461OooO0OO, 0L);
        return oooO0OO;
    }
}
