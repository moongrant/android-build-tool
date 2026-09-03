package p080o000OoO;

import androidx.annotation.GuardedBy;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.util.UnstableApi;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public long f34968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public long f34969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public long f34970OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadLocal<Long> f34971OooO0Oo = new ThreadLocal<>();

    public o000O0Oo(long j) {
        OooO0o(j);
    }

    public final synchronized long OooO00o(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!OooO0o0()) {
            long jLongValue = this.f34968OooO00o;
            if (jLongValue == 9223372036854775806L) {
                Long l = this.f34971OooO0Oo.get();
                l.getClass();
                jLongValue = l.longValue();
            }
            this.f34969OooO0O0 = jLongValue - j;
            notifyAll();
        }
        this.f34970OooO0OO = j;
        return j + this.f34969OooO0O0;
    }

    public final synchronized long OooO0O0(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f34970OooO0OO;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / AnimationKt.MillisToNanos;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            long j6 = (j4 * 8589934592L) + j;
            j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
        }
        return OooO00o((j * AnimationKt.MillisToNanos) / 90000);
    }

    public final synchronized long OooO0OO() {
        long j;
        j = this.f34968OooO00o;
        if (j == LongCompanionObject.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long OooO0Oo() {
        return this.f34969OooO0O0;
    }

    public final synchronized void OooO0o(long j) {
        this.f34968OooO00o = j;
        this.f34969OooO0O0 = j == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f34970OooO0OO = -9223372036854775807L;
    }

    public final synchronized boolean OooO0o0() {
        return this.f34969OooO0O0 != -9223372036854775807L;
    }
}
