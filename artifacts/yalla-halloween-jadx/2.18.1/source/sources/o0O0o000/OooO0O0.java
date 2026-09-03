package o0O0o000;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o00Oo0;
import p296o0O0OoO0.o00Ooo;
import p296o0O0OoO0.o00oO0o;
import p296o0O0OoO0.oo000o;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooOOO0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o00oO0o f36118OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO00o f36119OooOOOO;

    public static final class OooO00o implements OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o00oO0o f36120OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00oO0o.OooO00o f36121OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f36122OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f36123OooO0Oo = -1;

        public OooO00o(o00oO0o o00oo0o2, o00oO0o.OooO00o oooO00o) {
            this.f36120OooO00o = o00oo0o2;
            this.f36121OooO0O0 = oooO00o;
        }

        @Override // o0O0o000.OooOO0
        public final long OooO00o(o000oOoO o000oooo2) {
            long j = this.f36123OooO0Oo;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f36123OooO0Oo = -1L;
            return j2;
        }

        @Override // o0O0o000.OooOO0
        public final oo0o0Oo OooO0O0() {
            o00000O0.OooO0Oo(this.f36122OooO0OO != -1);
            return new oo000o(this.f36120OooO00o, this.f36122OooO0OO);
        }

        @Override // o0O0o000.OooOO0
        public final void OooO0OO(long j) {
            long[] jArr = this.f36121OooO0O0.f35924OooO00o;
            this.f36123OooO0Oo = jArr[o000OOo0.OooO0o0(jArr, j, true)];
        }
    }

    @Override // o0O0o000.OooOOO0
    public final long OooO0OO(o000 o000Var) {
        byte[] bArr = o000Var.f36661OooO00o;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            o000Var.OooOoo0(4);
            o000Var.OooOo0o();
        }
        int iOooO0O0 = o00Oo0.OooO0O0(o000Var, i);
        o000Var.OooOoOO(0);
        return iOooO0O0;
    }

    @Override // o0O0o000.OooOOO0
    public final boolean OooO0Oo(o000 o000Var, long j, OooOOO0.OooO00o oooO00o) {
        byte[] bArr = o000Var.f36661OooO00o;
        o00oO0o o00oo0o2 = this.f36118OooOOO;
        if (o00oo0o2 == null) {
            o00oO0o o00oo0o3 = new o00oO0o(bArr, 17);
            this.f36118OooOOO = o00oo0o3;
            oooO00o.f36156OooO00o = o00oo0o3.OooO0o0(Arrays.copyOfRange(bArr, 9, o000Var.f36663OooO0OO), null);
        } else if ((bArr[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            o00oO0o.OooO00o oooO00oOooO0O0 = o00Ooo.OooO0O0(o000Var);
            o00oO0o o00oo0oOooO0O0 = o00oo0o2.OooO0O0(oooO00oOooO0O0);
            this.f36118OooOOO = o00oo0oOooO0O0;
            this.f36119OooOOOO = new OooO00o(o00oo0oOooO0O0, oooO00oOooO0O0);
        } else {
            if (bArr[0] == -1) {
                OooO00o oooO00o2 = this.f36119OooOOOO;
                if (oooO00o2 != null) {
                    oooO00o2.f36122OooO0OO = j;
                    oooO00o.f36157OooO0O0 = oooO00o2;
                }
                return false;
            }
        }
        return true;
    }

    @Override // o0O0o000.OooOOO0
    public final void OooO0o0(boolean z) {
        super.OooO0o0(z);
        if (z) {
            this.f36118OooOOO = null;
            this.f36119OooOOOO = null;
        }
    }
}
