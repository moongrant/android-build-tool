package p310o0O0o0oo;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;
import p318o0O0oOo.o000;
import p709oo0oOOo.OooO0O0;
import p709oo0oOOo.OooO0OO;
import p709oo0oOOo.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f36351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36352OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f36353OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f36354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f36355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f36356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f36357OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f36358OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f36359OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f36360OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooO0O0 f36361OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public OooO00o f36362OooO0o0;

        public OooO00o(long j, int i) {
            this.f36358OooO00o = j;
            this.f36359OooO0O0 = j + ((long) i);
        }

        public final int OooO00o(long j) {
            return ((int) (j - this.f36358OooO00o)) + this.f36361OooO0Oo.f53368OooO0O0;
        }
    }

    public o00O0OO(OooO0OO oooO0OO) {
        this.f36351OooO00o = oooO0OO;
        int i = ((OooOOOO) oooO0OO).f53387OooO0O0;
        this.f36352OooO0O0 = i;
        this.f36353OooO0OO = new o000(32);
        OooO00o oooO00o = new OooO00o(0L, i);
        this.f36354OooO0Oo = oooO00o;
        this.f36356OooO0o0 = oooO00o;
        this.f36355OooO0o = oooO00o;
    }

    public final void OooO00o(long j) {
        OooO00o oooO00o;
        if (j == -1) {
            return;
        }
        while (true) {
            oooO00o = this.f36354OooO0Oo;
            if (j < oooO00o.f36359OooO0O0) {
                break;
            }
            OooO0OO oooO0OO = this.f36351OooO00o;
            OooO0O0 oooO0O0 = oooO00o.f36361OooO0Oo;
            OooOOOO oooOOOO = (OooOOOO) oooO0OO;
            synchronized (oooOOOO) {
                OooO0O0[] oooO0O0Arr = oooOOOO.f53388OooO0OO;
                oooO0O0Arr[0] = oooO0O0;
                oooOOOO.OooO00o(oooO0O0Arr);
            }
            OooO00o oooO00o2 = this.f36354OooO0Oo;
            oooO00o2.f36361OooO0Oo = null;
            OooO00o oooO00o3 = oooO00o2.f36362OooO0o0;
            oooO00o2.f36362OooO0o0 = null;
            this.f36354OooO0Oo = oooO00o3;
        }
        if (this.f36356OooO0o0.f36358OooO00o < oooO00o.f36358OooO00o) {
            this.f36356OooO0o0 = oooO00o;
        }
    }

    public final int OooO0O0(int i) {
        OooO0O0 oooO0O0;
        OooO00o oooO00o = this.f36355OooO0o;
        if (!oooO00o.f36360OooO0OO) {
            OooOOOO oooOOOO = (OooOOOO) this.f36351OooO00o;
            synchronized (oooOOOO) {
                oooOOOO.f53391OooO0o0++;
                int i2 = oooOOOO.f53390OooO0o;
                if (i2 > 0) {
                    OooO0O0[] oooO0O0Arr = oooOOOO.f53392OooO0oO;
                    int i3 = i2 - 1;
                    oooOOOO.f53390OooO0o = i3;
                    oooO0O0 = oooO0O0Arr[i3];
                    Objects.requireNonNull(oooO0O0);
                    oooOOOO.f53392OooO0oO[oooOOOO.f53390OooO0o] = null;
                } else {
                    oooO0O0 = new OooO0O0(new byte[oooOOOO.f53387OooO0O0], 0);
                }
            }
            OooO00o oooO00o2 = new OooO00o(this.f36355OooO0o.f36359OooO0O0, this.f36352OooO0O0);
            oooO00o.f36361OooO0Oo = oooO0O0;
            oooO00o.f36362OooO0o0 = oooO00o2;
            oooO00o.f36360OooO0OO = true;
        }
        return Math.min(i, (int) (this.f36355OooO0o.f36359OooO0O0 - this.f36357OooO0oO));
    }

    public final void OooO0OO(long j, ByteBuffer byteBuffer, int i) {
        while (true) {
            OooO00o oooO00o = this.f36356OooO0o0;
            if (j < oooO00o.f36359OooO0O0) {
                break;
            } else {
                this.f36356OooO0o0 = oooO00o.f36362OooO0o0;
            }
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (this.f36356OooO0o0.f36359OooO0O0 - j));
            OooO00o oooO00o2 = this.f36356OooO0o0;
            byteBuffer.put(oooO00o2.f36361OooO0Oo.f53367OooO00o, oooO00o2.OooO00o(j), iMin);
            i -= iMin;
            j += (long) iMin;
            OooO00o oooO00o3 = this.f36356OooO0o0;
            if (j == oooO00o3.f36359OooO0O0) {
                this.f36356OooO0o0 = oooO00o3.f36362OooO0o0;
            }
        }
    }

    public final void OooO0Oo(long j, byte[] bArr, int i) {
        while (true) {
            OooO00o oooO00o = this.f36356OooO0o0;
            if (j < oooO00o.f36359OooO0O0) {
                break;
            } else {
                this.f36356OooO0o0 = oooO00o.f36362OooO0o0;
            }
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.f36356OooO0o0.f36359OooO0O0 - j));
            OooO00o oooO00o2 = this.f36356OooO0o0;
            System.arraycopy(oooO00o2.f36361OooO0Oo.f53367OooO00o, oooO00o2.OooO00o(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            OooO00o oooO00o3 = this.f36356OooO0o0;
            if (j == oooO00o3.f36359OooO0O0) {
                this.f36356OooO0o0 = oooO00o3.f36362OooO0o0;
            }
        }
    }
}
