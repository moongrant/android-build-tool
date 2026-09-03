package p193o00o0O0O;

import androidx.compose.runtime.Stable;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f38616OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f38617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f38618OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f38619OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f38620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f38621OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f38622OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f38623OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f38624OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f38625OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f38626OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f38627OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f38628OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f38629OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f38630OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final long f38631OooOOOo;

    public o0000O00(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            int i2 = o0000.f38614OooOo0o;
            j15 = z ? o0000.f38607OooOOOo : o0000.f38609OooOOo0;
        } else {
            j15 = j;
        }
        if ((i & 4) != 0) {
            int i3 = o0000.f38614OooOo0o;
            j16 = z ? o0000.f38593OooO00o : o0000.f38606OooOOOO;
        } else {
            j16 = j2;
        }
        if ((i & 8) != 0) {
            int i4 = o0000.f38614OooOo0o;
            j17 = z ? o0000.f38613OooOo0O : o0000.f38604OooOOO;
        } else {
            j17 = j3;
        }
        if ((i & 16) != 0) {
            int i5 = o0000.f38614OooOo0o;
            j18 = z ? o0000.f38613OooOo0O : o0000.f38604OooOOO;
        } else {
            j18 = j4;
        }
        if ((i & 32) != 0) {
            int i6 = o0000.f38614OooOo0o;
            j19 = z ? o0000.f38593OooO00o : o0000.f38612OooOo00;
        } else {
            j19 = j5;
        }
        if ((i & 64) != 0) {
            int i7 = o0000.f38614OooOo0o;
            j20 = z ? o0000.f38611OooOo0 : o0000.f38594OooO0O0;
        } else {
            j20 = j6;
        }
        if ((i & 128) != 0) {
            int i8 = o0000.f38614OooOo0o;
            j21 = z ? o0000.f38608OooOOo : o0000.f38610OooOOoo;
        } else {
            j21 = j7;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            int i9 = o0000.f38614OooOo0o;
            j22 = z ? o0000.f38593OooO00o : o0000.f38600OooO0oo;
        } else {
            j22 = j8;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            int i10 = o0000.f38614OooOo0o;
            j23 = z ? o0000.f38592OooO : o0000.f38599OooO0oO;
        } else {
            j23 = j9;
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            int i11 = o0000.f38614OooOo0o;
            j24 = z ? o0000.f38601OooOO0 : o0000.f38597OooO0o;
        } else {
            j24 = j10;
        }
        if ((i & 2048) != 0) {
            int i12 = o0000.f38614OooOo0o;
            j25 = z ? o0000.f38602OooOO0O : o0000.f38598OooO0o0;
        } else {
            j25 = j11;
        }
        if ((i & 4096) != 0) {
            int i13 = o0000.f38614OooOo0o;
            j26 = z ? o0000.f38603OooOO0o : o0000.f38596OooO0Oo;
        } else {
            j26 = j12;
        }
        if ((i & 8192) != 0) {
            int i14 = o0000.f38614OooOo0o;
            j27 = z ? o0000.f38605OooOOO0 : o0000.f38595OooO0OO;
        } else {
            j27 = j13;
        }
        long j30 = 0;
        if ((i & 16384) != 0) {
            int i15 = o0000.f38614OooOo0o;
            j28 = z ? o0000.f38593OooO00o : o0000.f38599OooO0oO;
        } else {
            j28 = 0;
        }
        if ((32768 & i) != 0) {
            int i16 = o0000.f38614OooOo0o;
            j30 = z ? o0000.f38593OooO00o : o0000.f38599OooO0oO;
        }
        long j31 = j30;
        if ((i & 65536) != 0) {
            int i17 = o0000.f38614OooOo0o;
            j29 = z ? o0000.f38607OooOOOo : o0000.f38606OooOOOO;
        } else {
            j29 = j14;
        }
        this.f38617OooO00o = j15;
        this.f38618OooO0O0 = j16;
        this.f38619OooO0OO = j17;
        this.f38620OooO0Oo = j18;
        this.f38622OooO0o0 = j19;
        this.f38621OooO0o = j20;
        this.f38623OooO0oO = j21;
        this.f38624OooO0oo = j22;
        this.f38616OooO = j23;
        this.f38625OooOO0 = j24;
        this.f38626OooOO0O = j25;
        this.f38627OooOO0o = j26;
        this.f38629OooOOO0 = j27;
        this.f38628OooOOO = j28;
        this.f38630OooOOOO = j31;
        this.f38631OooOOOo = j29;
    }

    public final long OooO00o() {
        return this.f38616OooO;
    }

    public final long OooO0O0() {
        return this.f38627OooOO0o;
    }
}
