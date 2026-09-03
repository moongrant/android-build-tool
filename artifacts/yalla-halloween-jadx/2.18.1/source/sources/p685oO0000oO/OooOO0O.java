package p685oO0000oO;

import oO000Oo.OooO0OO;
import p684oO0000o.OooO0o;
import p684oO0000o.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOO0O implements OooO0o, OooO0OO {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final long[] f52489OooOOOO = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f52490OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f52491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f52492OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f52493OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f52494OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f52495OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f52496OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f52497OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f52498OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f52499OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f52500OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f52501OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f52502OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long[] f52503OooOOO0;

    public OooOO0O() {
        this.f52491OooO00o = new byte[8];
        this.f52503OooOOO0 = new long[80];
        this.f52492OooO0O0 = 0;
        OooO00o();
    }

    public OooOO0O(OooOO0O oooOO0O) {
        this.f52491OooO00o = new byte[8];
        this.f52503OooOOO0 = new long[80];
        OooOOO(oooOO0O);
    }

    @Override // p684oO0000o.OooO0OO
    public abstract void OooO00o();

    @Override // p684oO0000o.OooO0OO
    public final void OooO0Oo(byte[] bArr, int i, int i2) {
        while (this.f52492OooO0O0 != 0 && i2 > 0) {
            OooO0o0(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f52491OooO00o.length) {
            OooOOOo(bArr, i);
            byte[] bArr2 = this.f52491OooO00o;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f52493OooO0OO += (long) bArr2.length;
        }
        while (i2 > 0) {
            OooO0o0(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // p684oO0000o.OooO0o
    public final void OooO0o() {
    }

    @Override // p684oO0000o.OooO0OO
    public final void OooO0o0(byte b) {
        byte[] bArr = this.f52491OooO00o;
        int i = this.f52492OooO0O0;
        int i2 = i + 1;
        this.f52492OooO0O0 = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            OooOOOo(bArr, 0);
            this.f52492OooO0O0 = 0;
        }
        this.f52493OooO0OO++;
    }

    public final long OooOO0(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public final long OooOO0O(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public final long OooOO0o(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    public final void OooOOO(OooOO0O oooOO0O) {
        byte[] bArr = oooOO0O.f52491OooO00o;
        System.arraycopy(bArr, 0, this.f52491OooO00o, 0, bArr.length);
        this.f52492OooO0O0 = oooOO0O.f52492OooO0O0;
        this.f52493OooO0OO = oooOO0O.f52493OooO0OO;
        this.f52494OooO0Oo = oooOO0O.f52494OooO0Oo;
        this.f52496OooO0o0 = oooOO0O.f52496OooO0o0;
        this.f52495OooO0o = oooOO0O.f52495OooO0o;
        this.f52497OooO0oO = oooOO0O.f52497OooO0oO;
        this.f52498OooO0oo = oooOO0O.f52498OooO0oo;
        this.f52490OooO = oooOO0O.f52490OooO;
        this.f52499OooOO0 = oooOO0O.f52499OooOO0;
        this.f52500OooOO0O = oooOO0O.f52500OooOO0O;
        this.f52501OooOO0o = oooOO0O.f52501OooOO0o;
        long[] jArr = oooOO0O.f52503OooOOO0;
        System.arraycopy(jArr, 0, this.f52503OooOOO0, 0, jArr.length);
        this.f52502OooOOO = oooOO0O.f52502OooOOO;
    }

    public final void OooOOO0() {
        long j = this.f52493OooO0OO;
        if (j > 2305843009213693951L) {
            this.f52494OooO0Oo += j >>> 61;
            this.f52493OooO0OO = j & 2305843009213693951L;
        }
    }

    public final void OooOOOO() {
        OooOOO0();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f52503OooOOO0;
            long j = jArr[i - 2];
            long j2 = ((j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)))) + jArr[i - 7];
            long j3 = jArr[i - 15];
            jArr[i] = j2 + ((j3 >>> 7) ^ (((j3 << 63) | (j3 >>> 1)) ^ ((j3 << 56) | (j3 >>> 8)))) + jArr[i - 16];
        }
        long j4 = this.f52496OooO0o0;
        long j5 = this.f52495OooO0o;
        long j6 = this.f52497OooO0oO;
        long j7 = this.f52498OooO0oo;
        long j8 = this.f52490OooO;
        long j9 = this.f52499OooOO0;
        long j10 = this.f52500OooOO0O;
        long j11 = this.f52501OooOO0o;
        int i2 = 0;
        int i3 = 0;
        long j12 = j8;
        long j13 = j5;
        long j14 = j7;
        long j15 = j10;
        long j16 = j4;
        long j17 = j9;
        long j18 = j6;
        while (i3 < 10) {
            long j19 = j13;
            long jOooOO0o = OooOO0o(j12) + (((~j12) & j15) ^ (j17 & j12));
            long[] jArr2 = f52489OooOOOO;
            int i4 = i2 + 1;
            long j20 = jOooOO0o + jArr2[i2] + this.f52503OooOOO0[i2] + j11;
            long j21 = j14 + j20;
            long j22 = j12;
            long jOooOO0O = OooOO0O(j16) + OooOO0(j16, j19, j18) + j20;
            long j23 = j16;
            int i5 = i4 + 1;
            long jOooOO0o2 = OooOO0o(j21) + ((j22 & j21) ^ ((~j21) & j17)) + jArr2[i4] + this.f52503OooOOO0[i4] + j15;
            long j24 = j18 + jOooOO0o2;
            long jOooOO0O2 = OooOO0O(jOooOO0O) + OooOO0(jOooOO0O, j23, j19) + jOooOO0o2;
            int i6 = i5 + 1;
            long jOooOO0o3 = OooOO0o(j24) + ((j21 & j24) ^ ((~j24) & j22)) + jArr2[i5] + this.f52503OooOOO0[i5] + j17;
            long j25 = j19 + jOooOO0o3;
            long jOooOO0O3 = OooOO0O(jOooOO0O2) + OooOO0(jOooOO0O2, jOooOO0O, j23) + jOooOO0o3;
            int i7 = i6 + 1;
            long jOooOO0o4 = OooOO0o(j25) + ((j24 & j25) ^ ((~j25) & j21)) + jArr2[i6] + this.f52503OooOOO0[i6] + j22;
            long j26 = j23 + jOooOO0o4;
            long jOooOO0O4 = OooOO0O(jOooOO0O3) + OooOO0(jOooOO0O3, jOooOO0O2, jOooOO0O) + jOooOO0o4;
            int i8 = i7 + 1;
            long jOooOO0o5 = OooOO0o(j26) + ((j25 & j26) ^ ((~j26) & j24)) + jArr2[i7] + this.f52503OooOOO0[i7] + j21;
            long j27 = jOooOO0O + jOooOO0o5;
            long jOooOO0O5 = OooOO0O(jOooOO0O4) + OooOO0(jOooOO0O4, jOooOO0O3, jOooOO0O2) + jOooOO0o5;
            int i9 = i8 + 1;
            long jOooOO0o6 = OooOO0o(j27) + ((j26 & j27) ^ ((~j27) & j25)) + jArr2[i8] + this.f52503OooOOO0[i8] + j24;
            long j28 = jOooOO0O2 + jOooOO0o6;
            long jOooOO0O6 = OooOO0O(jOooOO0O5) + OooOO0(jOooOO0O5, jOooOO0O4, jOooOO0O3) + jOooOO0o6;
            int i10 = i9 + 1;
            long jOooOO0o7 = OooOO0o(j28) + ((j27 & j28) ^ ((~j28) & j26)) + jArr2[i9] + this.f52503OooOOO0[i9] + j25;
            long j29 = jOooOO0O3 + jOooOO0o7;
            long jOooOO0O7 = OooOO0O(jOooOO0O6) + OooOO0(jOooOO0O6, jOooOO0O5, jOooOO0O4) + jOooOO0o7;
            i2 = i10 + 1;
            long jOooOO0o8 = OooOO0o(j29) + ((j28 & j29) ^ ((~j29) & j27)) + jArr2[i10] + this.f52503OooOOO0[i10] + j26;
            long jOooOO0O8 = OooOO0O(jOooOO0O7) + OooOO0(jOooOO0O7, jOooOO0O6, jOooOO0O5) + jOooOO0o8;
            i3++;
            j13 = jOooOO0O7;
            j12 = jOooOO0O4 + jOooOO0o8;
            j14 = jOooOO0O5;
            j18 = jOooOO0O6;
            j17 = j29;
            j16 = jOooOO0O8;
            j11 = j27;
            j15 = j28;
        }
        this.f52496OooO0o0 += j16;
        this.f52495OooO0o += j13;
        this.f52497OooO0oO += j18;
        this.f52498OooO0oo += j14;
        this.f52490OooO += j12;
        this.f52499OooOO0 += j17;
        this.f52500OooOO0O += j15;
        this.f52501OooOO0o += j11;
        this.f52502OooOOO = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.f52503OooOOO0[i11] = 0;
        }
    }

    public final void OooOOOo(byte[] bArr, int i) {
        long[] jArr = this.f52503OooOOO0;
        int i2 = this.f52502OooOOO;
        int iOooO00o = OooOO0.OooO00o(bArr, i);
        jArr[i2] = (((long) OooOO0.OooO00o(bArr, i + 4)) & 4294967295L) | ((((long) iOooO00o) & 4294967295L) << 32);
        int i3 = this.f52502OooOOO + 1;
        this.f52502OooOOO = i3;
        if (i3 == 16) {
            OooOOOO();
        }
    }
}
