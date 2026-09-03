package p147o00Oo0Oo;

import androidx.compose.runtime.Stable;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f37701OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f37702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f37703OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f37704OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f37705OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f37706OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f37707OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f37708OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f37709OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f37710OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f37711OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f37712OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f37713OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f37714OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f37715OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final long f37716OooOOOo;

    public o0O0O00(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i) {
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
            int i2 = oo0o0Oo.f37739OooOo0o;
            j15 = z ? oo0o0Oo.f37732OooOOOo : oo0o0Oo.f37734OooOOo0;
        } else {
            j15 = j;
        }
        if ((i & 4) != 0) {
            int i3 = oo0o0Oo.f37739OooOo0o;
            j16 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37731OooOOOO;
        } else {
            j16 = j2;
        }
        if ((i & 8) != 0) {
            int i4 = oo0o0Oo.f37739OooOo0o;
            j17 = z ? oo0o0Oo.f37738OooOo0O : oo0o0Oo.f37729OooOOO;
        } else {
            j17 = j3;
        }
        if ((i & 16) != 0) {
            int i5 = oo0o0Oo.f37739OooOo0o;
            j18 = z ? oo0o0Oo.f37738OooOo0O : oo0o0Oo.f37729OooOOO;
        } else {
            j18 = j4;
        }
        if ((i & 32) != 0) {
            int i6 = oo0o0Oo.f37739OooOo0o;
            j19 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37737OooOo00;
        } else {
            j19 = j5;
        }
        if ((i & 64) != 0) {
            int i7 = oo0o0Oo.f37739OooOo0o;
            j20 = z ? oo0o0Oo.f37736OooOo0 : oo0o0Oo.f37719OooO0O0;
        } else {
            j20 = j6;
        }
        if ((i & 128) != 0) {
            int i8 = oo0o0Oo.f37739OooOo0o;
            j21 = z ? oo0o0Oo.f37733OooOOo : oo0o0Oo.f37735OooOOoo;
        } else {
            j21 = j7;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            int i9 = oo0o0Oo.f37739OooOo0o;
            j22 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37725OooO0oo;
        } else {
            j22 = j8;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            int i10 = oo0o0Oo.f37739OooOo0o;
            j23 = z ? oo0o0Oo.f37717OooO : oo0o0Oo.f37724OooO0oO;
        } else {
            j23 = j9;
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            int i11 = oo0o0Oo.f37739OooOo0o;
            j24 = z ? oo0o0Oo.f37726OooOO0 : oo0o0Oo.f37722OooO0o;
        } else {
            j24 = j10;
        }
        if ((i & 2048) != 0) {
            int i12 = oo0o0Oo.f37739OooOo0o;
            j25 = z ? oo0o0Oo.f37727OooOO0O : oo0o0Oo.f37723OooO0o0;
        } else {
            j25 = j11;
        }
        if ((i & 4096) != 0) {
            int i13 = oo0o0Oo.f37739OooOo0o;
            j26 = z ? oo0o0Oo.f37728OooOO0o : oo0o0Oo.f37721OooO0Oo;
        } else {
            j26 = j12;
        }
        if ((i & 8192) != 0) {
            int i14 = oo0o0Oo.f37739OooOo0o;
            j27 = z ? oo0o0Oo.f37730OooOOO0 : oo0o0Oo.f37720OooO0OO;
        } else {
            j27 = j13;
        }
        long j30 = 0;
        if ((i & 16384) != 0) {
            int i15 = oo0o0Oo.f37739OooOo0o;
            j28 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37724OooO0oO;
        } else {
            j28 = 0;
        }
        if ((32768 & i) != 0) {
            int i16 = oo0o0Oo.f37739OooOo0o;
            j30 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37724OooO0oO;
        }
        long j31 = j30;
        if ((i & 65536) != 0) {
            int i17 = oo0o0Oo.f37739OooOo0o;
            j29 = z ? oo0o0Oo.f37732OooOOOo : oo0o0Oo.f37731OooOOOO;
        } else {
            j29 = j14;
        }
        this.f37702OooO00o = j15;
        this.f37703OooO0O0 = j16;
        this.f37704OooO0OO = j17;
        this.f37705OooO0Oo = j18;
        this.f37707OooO0o0 = j19;
        this.f37706OooO0o = j20;
        this.f37708OooO0oO = j21;
        this.f37709OooO0oo = j22;
        this.f37701OooO = j23;
        this.f37710OooOO0 = j24;
        this.f37711OooOO0O = j25;
        this.f37712OooOO0o = j26;
        this.f37714OooOOO0 = j27;
        this.f37713OooOOO = j28;
        this.f37715OooOOOO = j31;
        this.f37716OooOOOo = j29;
    }

    public final long OooO00o() {
        return this.f37701OooO;
    }

    public final long OooO0O0() {
        return this.f37712OooOO0o;
    }
}
