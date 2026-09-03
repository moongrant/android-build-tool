package p225o00oOo;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0OO;
import p209o00o0oo0.o00O0OOO;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0o0O0;
import p209o00o0oo0.oo0oOO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000oOoO extends o00oO0o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public oo0oOO0 f39771OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO00o f39772OooOOOO;

    public static final class OooO00o implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0oOO0 f39773OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oo0oOO0.OooO00o f39774OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f39775OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f39776OooO0Oo = -1;

        public OooO00o(oo0oOO0 oo0ooo0, oo0oOO0.OooO00o oooO00o) {
            this.f39773OooO00o = oo0ooo0;
            this.f39774OooO0O0 = oooO00o;
        }

        @Override // p225o00oOo.o00Ooo
        public final o00OO0OO OooO00o() {
            o00O000o.OooO0Oo(this.f39775OooO0OO != -1);
            return new o00O0OOO(this.f39773OooO00o, this.f39775OooO0OO);
        }

        @Override // p225o00oOo.o00Ooo
        public final long OooO0O0(o00O00o0 o00o00o1) {
            long j = this.f39776OooO0Oo;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f39776OooO0Oo = -1L;
            return j2;
        }

        @Override // p225o00oOo.o00Ooo
        public final void OooO0OO(long j) {
            long[] jArr = this.f39774OooO0O0.f39590OooO00o;
            this.f39776OooO0Oo = jArr[o0O00.OooO0o(jArr, j, true)];
        }
    }

    @Override // p225o00oOo.o00oO0o
    public final long OooO0O0(o00Oo00 o00oo00) {
        byte[] bArr = o00oo00.f40591OooO00o;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            o00oo00.Oooo00o(4);
            o00oo00.OooOoo0();
        }
        int iOooO0O0 = oo0o0O0.OooO0O0(i, o00oo00);
        o00oo00.Oooo00O(0);
        return iOooO0O0;
    }

    @Override // p225o00oOo.o00oO0o
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean OooO0OO(o00Oo00 o00oo00, long j, o00oO0o.OooO00o oooO00o) {
        byte[] bArr = o00oo00.f40591OooO00o;
        oo0oOO0 oo0ooo0 = this.f39771OooOOO;
        if (oo0ooo0 == null) {
            oo0oOO0 oo0ooo1 = new oo0oOO0(bArr, 17);
            this.f39771OooOOO = oo0ooo1;
            oooO00o.f39802OooO00o = oo0ooo1.OooO0OO(Arrays.copyOfRange(bArr, 9, o00oo00.f40593OooO0OO), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & ByteCompanionObject.MAX_VALUE) == 3) {
            oo0oOO0.OooO00o OooO00o2 = o00O0OO.OooO00o(o00oo00);
            oo0oOO0 oo0ooo2 = new oo0oOO0(oo0ooo0.f39579OooO00o, oo0ooo0.f39580OooO0O0, oo0ooo0.f39581OooO0OO, oo0ooo0.f39582OooO0Oo, oo0ooo0.f39584OooO0o0, oo0ooo0.f39585OooO0oO, oo0ooo0.f39586OooO0oo, oo0ooo0.f39587OooOO0, OooO00o2, oo0ooo0.f39589OooOO0o);
            this.f39771OooOOO = oo0ooo2;
            this.f39772OooOOOO = new OooO00o(oo0ooo2, OooO00o2);
            return true;
        }
        if (!(b == -1)) {
            return true;
        }
        OooO00o oooO00o2 = this.f39772OooOOOO;
        if (oooO00o2 != null) {
            oooO00o2.f39775OooO0OO = j;
            oooO00o.f39803OooO0O0 = oooO00o2;
        }
        oooO00o.f39802OooO00o.getClass();
        return false;
    }

    @Override // p225o00oOo.o00oO0o
    public final void OooO0Oo(boolean z) {
        super.OooO0Oo(z);
        if (z) {
            this.f39771OooOOO = null;
            this.f39772OooOOOO = null;
        }
    }
}
