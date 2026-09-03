package p247o00oo0oO;

import androidx.compose.animation.core.AnimationKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f40881OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40883OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f40879OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f40880OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f40882OooO0Oo = -9223372036854775807L;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f40884OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f40885OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f40886OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f40887OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f40888OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f40889OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean[] f40890OooO0oO = new boolean[15];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f40891OooO0oo;

        public final boolean OooO00o() {
            return this.f40887OooO0Oo > 15 && this.f40891OooO0oo == 0;
        }

        public final void OooO0O0(long j) {
            long j2 = this.f40887OooO0Oo;
            if (j2 == 0) {
                this.f40884OooO00o = j;
            } else if (j2 == 1) {
                long j3 = j - this.f40884OooO00o;
                this.f40885OooO0O0 = j3;
                this.f40888OooO0o = j3;
                this.f40889OooO0o0 = 1L;
            } else {
                long j4 = j - this.f40886OooO0OO;
                int i = (int) (j2 % 15);
                long jAbs = Math.abs(j4 - this.f40885OooO0O0);
                boolean[] zArr = this.f40890OooO0oO;
                if (jAbs <= AnimationKt.MillisToNanos) {
                    this.f40889OooO0o0++;
                    this.f40888OooO0o += j4;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f40891OooO0oo--;
                    }
                } else if (!zArr[i]) {
                    zArr[i] = true;
                    this.f40891OooO0oo++;
                }
            }
            this.f40887OooO0Oo++;
            this.f40886OooO0OO = j;
        }

        public final void OooO0OO() {
            this.f40887OooO0Oo = 0L;
            this.f40889OooO0o0 = 0L;
            this.f40888OooO0o = 0L;
            this.f40891OooO0oo = 0;
            Arrays.fill(this.f40890OooO0oO, false);
        }
    }

    public final boolean OooO00o() {
        return this.f40879OooO00o.OooO00o();
    }
}
