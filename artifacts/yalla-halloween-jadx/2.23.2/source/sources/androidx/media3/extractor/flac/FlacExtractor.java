package androidx.media3.extractor.flac;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o00000O0;
import o000OOoO.o00O0O;
import o000OOoO.o00Oo0;
import o000OOoO.o00Ooo;
import o000OOoO.oo000o;
import p078o000Oo0O.o000OOo;
import p080o000OoO.o00;
import p080o000OoO.o000;
import p080o000OoO.o000O000;
import p086o000Oooo.o0000O0;
import p086o000Oooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class FlacExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oo000o f8396OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TrackOutput f8401OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Oooo0 f8402OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Metadata f8404OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8405OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8406OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o000OOo f8407OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f8408OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f8409OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f8397OooO00o = new byte[42];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8398OooO0O0 = new o000O000(new byte[ShareRequest.THUMB_DATA_SIZE_LIMIT], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f8399OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O.OooO00o f8400OooO0Oo = new o00O0O.OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8403OooO0oO = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOoO.o000OOo o000ooo2) throws IOException {
        ?? r15;
        boolean z;
        oo000o oo000oVar;
        Metadata metadata;
        o000000 oooO0O0;
        long j;
        boolean zOooO00o;
        int i = this.f8403OooO0oO;
        Metadata metadata2 = null;
        boolean z2 = true;
        ?? r5 = 0;
        if (i == 0) {
            boolean z3 = !this.f8399OooO0OO;
            OooOO0O oooOO0O = (OooOO0O) oooo000;
            oooOO0O.f34679OooO0o = 0;
            long jOooO0oo = oooOO0O.OooO0oo();
            o0000oo o0000ooVar = z3 ? null : o0000O0.f35008OooO0O0;
            o000O000 o000o001 = new o000O000(10);
            Metadata metadataOooO0OO = null;
            int i2 = 0;
            while (true) {
                try {
                    try {
                        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 10, false);
                        o000o001.Oooo00O(0);
                        if (o000o001.OooOo() != 4801587) {
                            break;
                        }
                        o000o001.Oooo00o(3);
                        int iOooOo0 = o000o001.OooOo0();
                        int i3 = iOooOo0 + 10;
                        if (metadataOooO0OO == null) {
                            byte[] bArr = new byte[i3];
                            System.arraycopy(o000o001.f34962OooO00o, 0, bArr, 0, 10);
                            oooOO0O.OooO0OO(bArr, 10, iOooOo0, false);
                            metadataOooO0OO = new o0000O0(o0000ooVar).OooO0OO(i3, bArr);
                        } else {
                            oooOO0O.OooOO0o(iOooOo0, false);
                        }
                        i2 += i3;
                    } catch (EOFException unused) {
                        r15 = 0;
                    }
                } catch (EOFException unused2) {
                }
            }
            r15 = 0;
            oooOO0O.f34679OooO0o = r15;
            oooOO0O.OooOO0o(i2, r15);
            if (metadataOooO0OO != null && metadataOooO0OO.f6336OooO0Oo.length != 0) {
                metadata2 = metadataOooO0OO;
            }
            oooOO0O.OooOO0((int) (oooOO0O.OooO0oo() - jOooO0oo));
            this.f8404OooO0oo = metadata2;
            this.f8403OooO0oO = 1;
            return 0;
        }
        byte[] bArr2 = this.f8397OooO00o;
        if (i == 1) {
            OooOO0O oooOO0O2 = (OooOO0O) oooo000;
            oooOO0O2.OooO0OO(bArr2, 0, bArr2.length, false);
            oooOO0O2.f34679OooO0o = 0;
            this.f8403OooO0oO = 2;
            return 0;
        }
        int i4 = 4;
        if (i == 2) {
            o000O000 o000o002 = new o000O000(4);
            ((OooOO0O) oooo000).OooO0o(o000o002.f34962OooO00o, 0, 4, false);
            if (o000o002.OooOo0o() != 1716281667) {
                throw ParserException.OooO00o("Failed to read FLAC stream marker.", null);
            }
            this.f8403OooO0oO = 3;
            return 0;
        }
        int i5 = 7;
        if (i == 3) {
            oo000o oo000oVar2 = this.f8396OooO;
            boolean z4 = false;
            while (!z4) {
                OooOO0O oooOO0O3 = (OooOO0O) oooo000;
                oooOO0O3.f34679OooO0o = r5;
                o000 o000Var = new o000(new byte[i4], i4);
                oooOO0O3.OooO0OO(o000Var.f34922OooO00o, r5, i4, r5);
                boolean zOooO0o = o000Var.OooO0o();
                int iOooO0oO = o000Var.OooO0oO(i5);
                int iOooO0oO2 = o000Var.OooO0oO(24) + i4;
                if (iOooO0oO == 0) {
                    byte[] bArr3 = new byte[38];
                    oooOO0O3.OooO0o(bArr3, r5, 38, r5);
                    oo000oVar2 = new oo000o(bArr3, i4);
                    z = zOooO0o;
                } else {
                    if (oo000oVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iOooO0oO == 3) {
                        o000O000 o000o003 = new o000O000(iOooO0oO2);
                        oooOO0O3.OooO0o(o000o003.f34962OooO00o, r5, iOooO0oO2, r5);
                        z = zOooO0o;
                        oo000oVar = new oo000o(oo000oVar2.f34733OooO00o, oo000oVar2.f34734OooO0O0, oo000oVar2.f34735OooO0OO, oo000oVar2.f34736OooO0Oo, oo000oVar2.f34738OooO0o0, oo000oVar2.f34739OooO0oO, oo000oVar2.f34740OooO0oo, oo000oVar2.f34741OooOO0, o00Oo0.OooO00o(o000o003), oo000oVar2.f34743OooOO0o);
                    } else {
                        z = zOooO0o;
                        Metadata metadataOooO00o = oo000oVar2.f34743OooOO0o;
                        if (iOooO0oO == i4) {
                            o000O000 o000o004 = new o000O000(iOooO0oO2);
                            oooOO0O3.OooO0o(o000o004.f34962OooO00o, 0, iOooO0oO2, false);
                            o000o004.Oooo00o(i4);
                            Metadata metadataOooO00o2 = o00000O0.OooO00o(Arrays.asList(o00000O0.OooO0O0(o000o004, false, false).f34704OooO00o));
                            if (metadataOooO00o == null) {
                                metadata = metadataOooO00o2;
                            } else {
                                if (metadataOooO00o2 != null) {
                                    metadataOooO00o = metadataOooO00o.OooO00o(metadataOooO00o2.f6336OooO0Oo);
                                }
                                metadata = metadataOooO00o;
                            }
                            oo000oVar = new oo000o(oo000oVar2.f34733OooO00o, oo000oVar2.f34734OooO0O0, oo000oVar2.f34735OooO0OO, oo000oVar2.f34736OooO0Oo, oo000oVar2.f34738OooO0o0, oo000oVar2.f34739OooO0oO, oo000oVar2.f34740OooO0oo, oo000oVar2.f34741OooOO0, oo000oVar2.f34742OooOO0O, metadata);
                        } else if (iOooO0oO == 6) {
                            o000O000 o000o005 = new o000O000(iOooO0oO2);
                            oooOO0O3.OooO0o(o000o005.f34962OooO00o, 0, iOooO0oO2, false);
                            o000o005.Oooo00o(4);
                            Metadata metadata3 = new Metadata(ImmutableList.OooOOOo(PictureFrame.OooO00o(o000o005)));
                            if (metadataOooO00o != null) {
                                metadata3 = metadataOooO00o.OooO00o(metadata3.f6336OooO0Oo);
                            }
                            oo000oVar = new oo000o(oo000oVar2.f34733OooO00o, oo000oVar2.f34734OooO0O0, oo000oVar2.f34735OooO0OO, oo000oVar2.f34736OooO0Oo, oo000oVar2.f34738OooO0o0, oo000oVar2.f34739OooO0oO, oo000oVar2.f34740OooO0oo, oo000oVar2.f34741OooOO0, oo000oVar2.f34742OooOO0O, metadata3);
                        } else {
                            oooOO0O3.OooOO0(iOooO0oO2);
                        }
                    }
                    oo000oVar2 = oo000oVar;
                }
                int i6 = o00.f34910OooO00o;
                this.f8396OooO = oo000oVar2;
                z4 = z;
                r5 = 0;
                i4 = 4;
                i5 = 7;
            }
            this.f8396OooO.getClass();
            this.f8405OooOO0 = Math.max(this.f8396OooO.f34735OooO0OO, 6);
            TrackOutput trackOutput = this.f8401OooO0o;
            int i7 = o00.f34910OooO00o;
            trackOutput.OooO0O0(this.f8396OooO.OooO0OO(bArr2, this.f8404OooO0oo));
            this.f8403OooO0oO = 4;
            return 0;
        }
        long jOooOoo0 = 0;
        if (i == 4) {
            OooOO0O oooOO0O4 = (OooOO0O) oooo000;
            oooOO0O4.f34679OooO0o = 0;
            o000O000 o000o006 = new o000O000(2);
            oooOO0O4.OooO0OO(o000o006.f34962OooO00o, 0, 2, false);
            int iOooOoOO = o000o006.OooOoOO();
            if ((iOooOoOO >> 2) != 16382) {
                oooOO0O4.f34679OooO0o = 0;
                throw ParserException.OooO00o("First frame does not start with sync code.", null);
            }
            oooOO0O4.f34679OooO0o = 0;
            this.f8406OooOO0O = iOooOoOO;
            Oooo0 oooo0 = this.f8402OooO0o0;
            int i8 = o00.f34910OooO00o;
            long j2 = oooOO0O4.f34678OooO0Oo;
            long j3 = oooOO0O4.f34677OooO0OO;
            this.f8396OooO.getClass();
            oo000o oo000oVar3 = this.f8396OooO;
            if (oo000oVar3.f34742OooOO0O != null) {
                oooO0O0 = new o00Ooo(oo000oVar3, j2);
            } else if (j3 == -1 || oo000oVar3.f34741OooOO0 <= 0) {
                oooO0O0 = new o000000.OooO0O0(oo000oVar3.OooO0O0());
            } else {
                o000OOo o000ooo3 = new o000OOo(oo000oVar3, this.f8406OooOO0O, j2, j3);
                this.f8407OooOO0o = o000ooo3;
                oooO0O0 = o000ooo3.f34645OooO00o;
            }
            oooo0.OooO(oooO0O0);
            this.f8403OooO0oO = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f8401OooO0o.getClass();
        this.f8396OooO.getClass();
        o000OOo o000ooo4 = this.f8407OooOO0o;
        if (o000ooo4 != null) {
            if (o000ooo4.f34647OooO0OO != null) {
                return o000ooo4.OooO00o((OooOO0O) oooo000, o000ooo2);
            }
        }
        if (this.f8408OooOOO == -1) {
            oo000o oo000oVar4 = this.f8396OooO;
            OooOO0O oooOO0O5 = (OooOO0O) oooo000;
            oooOO0O5.f34679OooO0o = 0;
            oooOO0O5.OooOO0o(1, false);
            byte[] bArr4 = new byte[1];
            oooOO0O5.OooO0OO(bArr4, 0, 1, false);
            boolean z5 = (bArr4[0] & 1) == 1;
            oooOO0O5.OooOO0o(2, false);
            i5 = z5 ? 7 : 6;
            o000O000 o000o007 = new o000O000(i5);
            byte[] bArr5 = o000o007.f34962OooO00o;
            int i9 = 0;
            while (i9 < i5) {
                int iOooOOO = oooOO0O5.OooOOO(0 + i9, i5 - i9, bArr5);
                if (iOooOOO == -1) {
                    break;
                }
                i9 += iOooOOO;
            }
            o000o007.Oooo000(i9);
            oooOO0O5.f34679OooO0o = 0;
            try {
                jOooOoo0 = o000o007.OooOoo0();
                if (!z5) {
                    jOooOoo0 *= (long) oo000oVar4.f34734OooO0O0;
                }
            } catch (NumberFormatException unused3) {
                z2 = false;
            }
            if (!z2) {
                throw ParserException.OooO00o(null, null);
            }
            this.f8408OooOOO = jOooOoo0;
            return 0;
        }
        o000O000 o000o008 = this.f8398OooO0O0;
        int i10 = o000o008.f34964OooO0OO;
        if (i10 < 32768) {
            int i11 = ((OooOO0O) oooo000).read(o000o008.f34962OooO00o, i10, ShareRequest.THUMB_DATA_SIZE_LIMIT - i10);
            z2 = i11 == -1;
            if (!z2) {
                o000o008.Oooo000(i10 + i11);
            } else if (o000o008.f34964OooO0OO - o000o008.f34963OooO0O0 == 0) {
                long j4 = this.f8408OooOOO * AnimationKt.MillisToNanos;
                oo000o oo000oVar5 = this.f8396OooO;
                int i12 = o00.f34910OooO00o;
                this.f8401OooO0o.OooO0o0(j4 / ((long) oo000oVar5.f34738OooO0o0), 1, this.f8409OooOOO0, 0, null);
                return -1;
            }
        } else {
            z2 = false;
        }
        int i13 = o000o008.f34963OooO0O0;
        int i14 = this.f8409OooOOO0;
        int i15 = this.f8405OooOO0;
        if (i14 < i15) {
            o000o008.Oooo00o(Math.min(i15 - i14, o000o008.f34964OooO0OO - i13));
        }
        this.f8396OooO.getClass();
        int i16 = o000o008.f34963OooO0O0;
        while (true) {
            int i17 = o000o008.f34964OooO0OO - 16;
            o00O0O.OooO00o oooO00o = this.f8400OooO0Oo;
            if (i16 > i17) {
                if (z2) {
                    while (true) {
                        int i18 = o000o008.f34964OooO0OO;
                        if (i16 <= i18 - this.f8405OooOO0) {
                            o000o008.Oooo00O(i16);
                            try {
                                zOooO00o = o00O0O.OooO00o(o000o008, this.f8396OooO, this.f8406OooOO0O, oooO00o);
                            } catch (IndexOutOfBoundsException unused4) {
                                zOooO00o = false;
                            }
                            if (o000o008.f34963OooO0O0 > o000o008.f34964OooO0OO) {
                                zOooO00o = false;
                            }
                            if (zOooO00o) {
                                o000o008.Oooo00O(i16);
                                j = oooO00o.f34714OooO00o;
                                break;
                            }
                            i16++;
                        } else {
                            o000o008.Oooo00O(i18);
                        }
                    }
                } else {
                    o000o008.Oooo00O(i16);
                }
                j = -1;
                break;
            }
            o000o008.Oooo00O(i16);
            if (o00O0O.OooO00o(o000o008, this.f8396OooO, this.f8406OooOO0O, oooO00o)) {
                o000o008.Oooo00O(i16);
                j = oooO00o.f34714OooO00o;
                break;
            }
            i16++;
        }
        int i19 = o000o008.f34963OooO0O0 - i13;
        o000o008.Oooo00O(i13);
        this.f8401OooO0o.OooO0OO(i19, o000o008);
        int i20 = this.f8409OooOOO0 + i19;
        this.f8409OooOOO0 = i20;
        if (j != -1) {
            long j5 = this.f8408OooOOO * AnimationKt.MillisToNanos;
            oo000o oo000oVar6 = this.f8396OooO;
            int i21 = o00.f34910OooO00o;
            this.f8401OooO0o.OooO0o0(j5 / ((long) oo000oVar6.f34738OooO0o0), 1, i20, 0, null);
            this.f8409OooOOO0 = 0;
            this.f8408OooOOO = j;
        }
        int i22 = o000o008.f34964OooO0OO;
        int i23 = o000o008.f34963OooO0O0;
        int i24 = i22 - i23;
        if (i24 >= 16) {
            return 0;
        }
        byte[] bArr6 = o000o008.f34962OooO00o;
        System.arraycopy(bArr6, i23, bArr6, 0, i24);
        o000o008.Oooo00O(0);
        o000o008.Oooo000(i24);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f8403OooO0oO = 0;
        } else {
            o000OOo o000ooo2 = this.f8407OooOO0o;
            if (o000ooo2 != null) {
                o000ooo2.OooO0OO(j2);
            }
        }
        this.f8408OooOOO = j2 != 0 ? -1L : 0L;
        this.f8409OooOOO0 = 0;
        this.f8398OooO0O0.OooOooO(0);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f8402OooO0o0 = oooo0;
        this.f8401OooO0o = oooo0.OooOOOO(0, 1);
        oooo0.OooOO0O();
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        OooOO0O oooOO0O = (OooOO0O) oooo000;
        o0000oo o0000ooVar = o0000O0.f35008OooO0O0;
        o000O000 o000o001 = new o000O000(10);
        Metadata metadataOooO0OO = null;
        int i = 0;
        while (true) {
            try {
                oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 10, false);
                o000o001.Oooo00O(0);
                if (o000o001.OooOo() != 4801587) {
                    break;
                }
                o000o001.Oooo00o(3);
                int iOooOo0 = o000o001.OooOo0();
                int i2 = iOooOo0 + 10;
                if (metadataOooO0OO == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(o000o001.f34962OooO00o, 0, bArr, 0, 10);
                    oooOO0O.OooO0OO(bArr, 10, iOooOo0, false);
                    metadataOooO0OO = new o0000O0(o0000ooVar).OooO0OO(i2, bArr);
                } else {
                    oooOO0O.OooOO0o(iOooOo0, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        oooOO0O.f34679OooO0o = 0;
        oooOO0O.OooOO0o(i, false);
        if (metadataOooO0OO != null) {
            int length = metadataOooO0OO.f6336OooO0Oo.length;
        }
        o000O000 o000o002 = new o000O000(4);
        oooOO0O.OooO0OO(o000o002.f34962OooO00o, 0, 4, false);
        return o000o002.OooOo0o() == 1716281667;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
