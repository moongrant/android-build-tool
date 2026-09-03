package o000O;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0OOO0o extends androidx.media3.common.Oooo0 {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Object f33870OooOOoo = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f33871OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f33872OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f33873OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f33874OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f33875OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f33876OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f33877OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final Object f33878OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final androidx.media3.common.OooOOO0.OooOO0 f33879OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final androidx.media3.common.OooOOO0 f33880OooOOo0;

    static {
        androidx.media3.common.OooOOO0.OooO0O0 oooO0O0 = new androidx.media3.common.OooOOO0.OooO0O0();
        oooO0O0.f6519OooO00o = "SinglePeriodTimeline";
        oooO0O0.f6520OooO0O0 = Uri.EMPTY;
        oooO0O0.OooO00o();
    }

    public o0OOO0o(long j, boolean z, boolean z2, androidx.media3.common.OooOOO0 oooOOO0) {
        androidx.media3.common.OooOOO0.OooOO0 oooOO1 = z2 ? oooOOO0.f6485OooO0o : null;
        this.f33871OooO = -9223372036854775807L;
        this.f33872OooOO0 = -9223372036854775807L;
        this.f33873OooOO0O = -9223372036854775807L;
        this.f33874OooOO0o = j;
        this.f33876OooOOO0 = j;
        this.f33875OooOOO = z;
        this.f33877OooOOOO = false;
        this.f33878OooOOOo = null;
        oooOOO0.getClass();
        this.f33880OooOOo0 = oooOOO0;
        this.f33879OooOOo = oooOO1;
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooO0o0(Object obj) {
        return f33870OooOOoo.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Oooo0
    public final androidx.media3.common.Oooo0.OooO0O0 OooOO0(int i, androidx.media3.common.Oooo0.OooO0O0 oooO0O0, boolean z) {
        p080o000OoO.o00Oo0.OooO0OO(i, 1);
        Object obj = z ? f33870OooOOoo : null;
        long j = this.f33874OooOO0o;
        oooO0O0.getClass();
        oooO0O0.OooOOO0(null, obj, 0, j, 0L, AdPlaybackState.f6176OooOO0, false);
        return oooO0O0;
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooOO0o() {
        return 1;
    }

    @Override // androidx.media3.common.Oooo0
    public final Object OooOOOo(int i) {
        p080o000OoO.o00Oo0.OooO0OO(i, 1);
        return f33870OooOOoo;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[PHI: r1
      0x0026: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.Oooo0
    public final androidx.media3.common.Oooo0.OooO0o OooOOo(int i, androidx.media3.common.Oooo0.OooO0o oooO0o, long j) {
        long j2;
        p080o000OoO.o00Oo0.OooO0OO(i, 1);
        boolean z = this.f33877OooOOOO;
        long j3 = 0;
        if (!z || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f33876OooOOO0;
            if (j4 != -9223372036854775807L) {
                j3 = 0 + j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        oooO0o.OooO0o0(androidx.media3.common.Oooo0.OooO0o.f6652OooOo0, this.f33880OooOOo0, this.f33878OooOOOo, this.f33871OooO, this.f33872OooOO0, this.f33873OooOO0O, this.f33875OooOOO, z, this.f33879OooOOo, j2, this.f33876OooOOO0, 0, 0, 0L);
        return oooO0o;
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooOOoo() {
        return 1;
    }
}
