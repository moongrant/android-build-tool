package p175o00o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.flv.OooO00o;
import com.google.android.exoplayer2.extractor.flv.OooO0O0;
import java.io.IOException;
import net.sqlcipher.database.SQLiteDatabase;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO00O;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOo implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f38545OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O0O0 f38550OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f38553OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f38554OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f38555OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f38556OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f38557OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f38558OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO00o f38559OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0O0 f38560OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f38546OooO00o = new o00Oo00(4);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f38547OooO0O0 = new o00Oo00(9);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f38548OooO0OO = new o00Oo00(11);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo00 f38549OooO0Oo = new o00Oo00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo000 f38551OooO0o0 = new Oooo000();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38552OooO0oO = 1;

    public final o00Oo00 OooO00o(o00O00o0 o00o00o1) throws IOException {
        int i = this.f38556OooOO0o;
        o00Oo00 o00oo00 = this.f38549OooO0Oo;
        byte[] bArr = o00oo00.f40591OooO00o;
        if (i > bArr.length) {
            o00oo00.OooOooo(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            o00oo00.Oooo00O(0);
        }
        o00oo00.Oooo000(this.f38556OooOO0o);
        o00o00o1.OooO0oO(o00oo00.f40591OooO00o, 0, this.f38556OooOO0o, false);
        return o00oo00;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f38552OooO0oO = 1;
            this.f38553OooO0oo = false;
        } else {
            this.f38552OooO0oO = 3;
        }
        this.f38554OooOO0 = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00Oo00 o00oo00 = this.f38546OooO00o;
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 3, false);
        o00oo00.Oooo00O(0);
        if (o00oo00.OooOo() != 4607062) {
            return false;
        }
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 2, false);
        o00oo00.Oooo00O(0);
        if ((o00oo00.OooOoOO() & SQLiteDatabase.MAX_SQL_CACHE_SIZE) != 0) {
            return false;
        }
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, false);
        o00oo00.Oooo00O(0);
        int iOooO0o = o00oo00.OooO0o();
        o00o00o1.f39533OooO0o = 0;
        o00o00o1.OooOO0o(iOooO0o, false);
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, false);
        o00oo00.Oooo00O(0);
        return o00oo00.OooO0o() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        long j;
        boolean z;
        boolean z2;
        o00O000o.OooO0o0(this.f38550OooO0o);
        while (true) {
            int i = this.f38552OooO0oO;
            boolean z3 = false;
            if (i == 1) {
                o00Oo00 o00oo00 = this.f38547OooO0O0;
                if (((o00O00o0) o00o0o01).OooO0oO(o00oo00.f40591OooO00o, 0, 9, true)) {
                    o00oo00.Oooo00O(0);
                    o00oo00.Oooo00o(4);
                    int iOooOo0O = o00oo00.OooOo0O();
                    boolean z4 = (iOooOo0O & 4) != 0;
                    z3 = (iOooOo0O & 1) != 0;
                    if (z4 && this.f38559OooOOOO == null) {
                        this.f38559OooOOOO = new OooO00o(this.f38550OooO0o.OooOOO(8, 1));
                    }
                    if (z3 && this.f38560OooOOOo == null) {
                        this.f38560OooOOOo = new OooO0O0(this.f38550OooO0o.OooOOO(9, 2));
                    }
                    this.f38550OooO0o.OooO00o();
                    this.f38554OooOO0 = (o00oo00.OooO0o() - 9) + 4;
                    this.f38552OooO0oO = 2;
                    z3 = true;
                }
                if (!z3) {
                    return -1;
                }
            } else if (i == 2) {
                ((o00O00o0) o00o0o01).OooOO0(this.f38554OooOO0);
                this.f38554OooOO0 = 0;
                this.f38552OooO0oO = 3;
            } else if (i == 3) {
                o00Oo00 o00oo01 = this.f38548OooO0OO;
                if (((o00O00o0) o00o0o01).OooO0oO(o00oo01.f40591OooO00o, 0, 11, true)) {
                    o00oo01.Oooo00O(0);
                    this.f38555OooOO0O = o00oo01.OooOo0O();
                    this.f38556OooOO0o = o00oo01.OooOo();
                    this.f38558OooOOO0 = o00oo01.OooOo();
                    this.f38558OooOOO0 = (((long) (o00oo01.OooOo0O() << 24)) | this.f38558OooOOO0) * 1000;
                    o00oo01.Oooo00o(3);
                    this.f38552OooO0oO = 4;
                    z3 = true;
                }
                if (!z3) {
                    return -1;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z5 = this.f38553OooO0oo;
                Oooo000 oooo000 = this.f38551OooO0o0;
                if (z5) {
                    j = this.f38545OooO + this.f38558OooOOO0;
                } else {
                    j = oooo000.f38561OooO0O0 == -9223372036854775807L ? 0L : this.f38558OooOOO0;
                }
                int i2 = this.f38555OooOO0O;
                if (i2 != 8 || this.f38559OooOOOO == null) {
                    if (i2 == 9 && this.f38560OooOOOo != null) {
                        if (!this.f38557OooOOO) {
                            this.f38550OooO0o.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
                            this.f38557OooOOO = true;
                        }
                        OooO0O0 oooO0O0 = this.f38560OooOOOo;
                        o00Oo00 o00oo00OooO00o = OooO00o((o00O00o0) o00o0o01);
                        if (oooO0O0.OooO00o(o00oo00OooO00o) && oooO0O0.OooO0O0(j, o00oo00OooO00o)) {
                            z = true;
                        }
                        z2 = true;
                    } else if (i2 != 18 || this.f38557OooOOO) {
                        ((o00O00o0) o00o0o01).OooOO0(this.f38556OooOO0o);
                        z = false;
                        z2 = false;
                    } else {
                        o00Oo00 o00oo00OooO00o2 = OooO00o((o00O00o0) o00o0o01);
                        oooo000.getClass();
                        oooo000.OooO00o(j, o00oo00OooO00o2);
                        long j2 = oooo000.f38561OooO0O0;
                        if (j2 != -9223372036854775807L) {
                            this.f38550OooO0o.OooO0O0(new o00OO00O(j2, oooo000.f38563OooO0Oo, oooo000.f38562OooO0OO));
                            this.f38557OooOOO = true;
                        }
                    }
                    z = false;
                    z2 = true;
                } else {
                    if (!this.f38557OooOOO) {
                        this.f38550OooO0o.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
                        this.f38557OooOOO = true;
                    }
                    OooO00o oooO00o = this.f38559OooOOOO;
                    o00Oo00 o00oo00OooO00o3 = OooO00o((o00O00o0) o00o0o01);
                    oooO00o.OooO00o(o00oo00OooO00o3);
                    if (oooO00o.OooO0O0(j, o00oo00OooO00o3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = true;
                }
                if (!this.f38553OooO0oo && z) {
                    this.f38553OooO0oo = true;
                    this.f38545OooO = oooo000.f38561OooO0O0 == -9223372036854775807L ? -this.f38558OooOOO0 : 0L;
                }
                this.f38554OooOO0 = 4;
                this.f38552OooO0oO = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f38550OooO0o = o00o0o0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
