package o000OOO;

import androidx.compose.animation.core.AnimationKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f34540OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f34542OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C0400OooO00o f34538OooO00o = new C0400OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C0400OooO00o f34539OooO0O0 = new C0400OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f34541OooO0Oo = -9223372036854775807L;

    /* JADX INFO: renamed from: o000OOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0400OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f34543OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f34544OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f34545OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f34546OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f34547OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f34548OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean[] f34549OooO0oO = new boolean[15];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f34550OooO0oo;

        public final boolean OooO00o() {
            return this.f34546OooO0Oo > 15 && this.f34550OooO0oo == 0;
        }

        public final void OooO0O0(long j) {
            long j2 = this.f34546OooO0Oo;
            if (j2 == 0) {
                this.f34543OooO00o = j;
            } else if (j2 == 1) {
                long j3 = j - this.f34543OooO00o;
                this.f34544OooO0O0 = j3;
                this.f34547OooO0o = j3;
                this.f34548OooO0o0 = 1L;
            } else {
                long j4 = j - this.f34545OooO0OO;
                int i = (int) (j2 % 15);
                long jAbs = Math.abs(j4 - this.f34544OooO0O0);
                boolean[] zArr = this.f34549OooO0oO;
                if (jAbs <= AnimationKt.MillisToNanos) {
                    this.f34548OooO0o0++;
                    this.f34547OooO0o += j4;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f34550OooO0oo--;
                    }
                } else if (!zArr[i]) {
                    zArr[i] = true;
                    this.f34550OooO0oo++;
                }
            }
            this.f34546OooO0Oo++;
            this.f34545OooO0OO = j;
        }

        public final void OooO0OO() {
            this.f34546OooO0Oo = 0L;
            this.f34548OooO0o0 = 0L;
            this.f34547OooO0o = 0L;
            this.f34550OooO0oo = 0;
            Arrays.fill(this.f34549OooO0oO, false);
        }
    }

    public final boolean OooO00o() {
        return this.f34538OooO00o.OooO00o();
    }
}
