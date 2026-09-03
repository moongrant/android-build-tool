package p679oooo00o;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import o000OOoO.OooOO0O;
import o000OOoO.o000000;
import o000OOoO.o00O0O;
import o000OOoO.o00Ooo;
import o000OOoO.oo000o;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo0000O extends oO0O00O {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public oo000o f60434OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO00o f60435OooOOOO;

    public static final class OooO00o implements oO0O000o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo000o f60436OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oo000o.OooO00o f60437OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f60438OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f60439OooO0Oo = -1;

        public OooO00o(oo000o oo000oVar, oo000o.OooO00o oooO00o) {
            this.f60436OooO00o = oo000oVar;
            this.f60437OooO0O0 = oooO00o;
        }

        @Override // p679oooo00o.oO0O000o
        public final o000000 OooO00o() {
            o00Oo0.OooO0Oo(this.f60438OooO0OO != -1);
            return new o00Ooo(this.f60436OooO00o, this.f60438OooO0OO);
        }

        @Override // p679oooo00o.oO0O000o
        public final void OooO0O0(long j) {
            long[] jArr = this.f60437OooO0O0.f34744OooO00o;
            this.f60439OooO0Oo = jArr[o00.OooO0o(jArr, j, true)];
        }

        @Override // p679oooo00o.oO0O000o
        public final long OooO0OO(OooOO0O oooOO0O) {
            long j = this.f60439OooO0Oo;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f60439OooO0Oo = -1L;
            return j2;
        }
    }

    @Override // p679oooo00o.oO0O00O
    public final long OooO0O0(o000O000 o000o001) {
        byte[] bArr = o000o001.f34962OooO00o;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            o000o001.Oooo00o(4);
            o000o001.OooOoo0();
        }
        int iOooO0O0 = o00O0O.OooO0O0(i, o000o001);
        o000o001.Oooo00O(0);
        return iOooO0O0;
    }

    @Override // p679oooo00o.oO0O00O
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean OooO0OO(o000O000 o000o001, long j, oO0O00O.OooO00o oooO00o) {
        byte[] bArr = o000o001.f34962OooO00o;
        oo000o oo000oVar = this.f60434OooOOO;
        if (oo000oVar == null) {
            oo000o oo000oVar2 = new oo000o(bArr, 17);
            this.f60434OooOOO = oo000oVar2;
            oooO00o.f60422OooO00o = oo000oVar2.OooO0OO(Arrays.copyOfRange(bArr, 9, o000o001.f34964OooO0OO), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & ByteCompanionObject.MAX_VALUE) == 3) {
            oo000o.OooO00o OooO00o2 = o000OOoO.o00Oo0.OooO00o(o000o001);
            oo000o oo000oVar3 = new oo000o(oo000oVar.f34733OooO00o, oo000oVar.f34734OooO0O0, oo000oVar.f34735OooO0OO, oo000oVar.f34736OooO0Oo, oo000oVar.f34738OooO0o0, oo000oVar.f34739OooO0oO, oo000oVar.f34740OooO0oo, oo000oVar.f34741OooOO0, OooO00o2, oo000oVar.f34743OooOO0o);
            this.f60434OooOOO = oo000oVar3;
            this.f60435OooOOOO = new OooO00o(oo000oVar3, OooO00o2);
            return true;
        }
        if (!(b == -1)) {
            return true;
        }
        OooO00o oooO00o2 = this.f60435OooOOOO;
        if (oooO00o2 != null) {
            oooO00o2.f60438OooO0OO = j;
            oooO00o.f60423OooO0O0 = oooO00o2;
        }
        oooO00o.f60422OooO00o.getClass();
        return false;
    }

    @Override // p679oooo00o.oO0O00O
    public final void OooO0Oo(boolean z) {
        super.OooO0Oo(z);
        if (z) {
            this.f60434OooOOO = null;
            this.f60435OooOOOO = null;
        }
    }
}
