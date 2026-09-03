package com.google.android.exoplayer2.extractor.flac;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
import o0OOOO0o.OooO0o;
import p295o0O0OoO.oo000o;
import p296o0O0OoO0.Oooo000;
import p296o0O0OoO0.o000000;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o00Oo0;
import p296o0O0OoO0.o00Ooo;
import p296o0O0OoO0.o00oO0o;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00oO0o f13756OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TrackOutput f13761OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0OoOo0 f13762OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Metadata f13764OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f13765OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13766OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public oo000o f13767OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f13768OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f13769OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f13757OooO00o = new byte[42];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f13758OooO0O0 = new o000(new byte[ShareRequest.THUMB_DATA_SIZE_LIMIT], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f13759OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0.OooO00o f13760OooO0Oo = new o00Oo0.OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13763OooO0oO = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f13762OooO0o0 = o0oooo1;
        this.f13761OooO0o = o0oooo1.OooO00o(0);
        o0oooo1.OooOOO0();
    }

    public final void OooO00o() {
        long j = this.f13768OooOOO * 1000000;
        o00oO0o o00oo0o2 = this.f13756OooO;
        int i = o000OOo0.f36740OooO00o;
        this.f13761OooO0o.OooO0Oo(j / ((long) o00oo0o2.f35918OooO0o0), 1, this.f13769OooOOO0, 0, null);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        if (j == 0) {
            this.f13763OooO0oO = 0;
        } else {
            oo000o oo000oVar = this.f13767OooOO0o;
            if (oo000oVar != null) {
                oo000oVar.OooO0o0(j2);
            }
        }
        this.f13768OooOOO = j2 != 0 ? -1L : 0L;
        this.f13769OooOOO0 = 0;
        this.f13758OooO0O0.OooOo(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        o00Ooo.OooO00o(o000oooo2, false);
        byte[] bArr = new byte[4];
        ((Oooo000) o000oooo2).OooO0OO(bArr, 0, 4, false);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        o000oOoO o000oooo3;
        o00oO0o o00oo0o2;
        oo0o0Oo oooO0O0;
        long j;
        boolean zOooO00o;
        FlacExtractor flacExtractor = this;
        o000oOoO o000oooo4 = o000oooo2;
        int i = flacExtractor.f13763OooO0oO;
        boolean z = true;
        if (i == 0) {
            boolean z2 = !flacExtractor.f13759OooO0OO;
            o000oooo2.OooO();
            long jOooO0Oo = o000oooo2.OooO0Oo();
            Metadata metadataOooO00o = o00Ooo.OooO00o(o000oooo4, z2);
            o000oooo4.OooOO0((int) (o000oooo2.OooO0Oo() - jOooO0Oo));
            flacExtractor.f13764OooO0oo = metadataOooO00o;
            flacExtractor.f13763OooO0oO = 1;
            return 0;
        }
        if (i == 1) {
            byte[] bArr = flacExtractor.f13757OooO00o;
            o000oooo4.OooOOO0(bArr, 0, bArr.length);
            o000oooo2.OooO();
            flacExtractor.f13763OooO0oO = 2;
            return 0;
        }
        int i2 = 24;
        int i3 = 3;
        if (i == 2) {
            byte[] bArr2 = new byte[4];
            o000oooo4.readFully(bArr2, 0, 4);
            if (((((long) bArr2[3]) & 255) | ((((long) bArr2[2]) & 255) << 8) | ((((long) bArr2[0]) & 255) << 24) | ((((long) bArr2[1]) & 255) << 16)) != 1716281667) {
                throw new ParserException("Failed to read FLAC stream marker.");
            }
            flacExtractor.f13763OooO0oO = 3;
            return 0;
        }
        if (i == 3) {
            o00oO0o o00oo0oOooO0O0 = flacExtractor.f13756OooO;
            boolean z3 = false;
            while (!z3) {
                o000oooo2.OooO();
                o0000OO0 o0000oo1 = new o0000OO0(new byte[4], 4);
                o000oooo4.OooOOO0(o0000oo1.f36700OooO00o, 0, 4);
                boolean zOooO0o = o0000oo1.OooO0o();
                int iOooO0oO = o0000oo1.OooO0oO(7);
                int iOooO0oO2 = o0000oo1.OooO0oO(i2) + 4;
                if (iOooO0oO == 0) {
                    byte[] bArr3 = new byte[38];
                    o000oooo4.readFully(bArr3, 0, 38);
                    o00oo0oOooO0O0 = new o00oO0o(bArr3, 4);
                } else {
                    if (o00oo0oOooO0O0 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iOooO0oO == i3) {
                        o000 o000Var = new o000(iOooO0oO2);
                        o000oooo4.readFully(o000Var.f36661OooO00o, 0, iOooO0oO2);
                        o00oo0oOooO0O0 = o00oo0oOooO0O0.OooO0O0(o00Ooo.OooO0O0(o000Var));
                    } else {
                        if (iOooO0oO == 4) {
                            o000 o000Var2 = new o000(iOooO0oO2);
                            o000oooo4.readFully(o000Var2.f36661OooO00o, 0, iOooO0oO2);
                            o000Var2.OooOoo0(4);
                            o00oo0o2 = new o00oO0o(o00oo0oOooO0O0.f35913OooO00o, o00oo0oOooO0O0.f35914OooO0O0, o00oo0oOooO0O0.f35915OooO0OO, o00oo0oOooO0O0.f35916OooO0Oo, o00oo0oOooO0O0.f35918OooO0o0, o00oo0oOooO0O0.f35919OooO0oO, o00oo0oOooO0O0.f35920OooO0oo, o00oo0oOooO0O0.f35921OooOO0, o00oo0oOooO0O0.f35922OooOO0O, o00oo0oOooO0O0.OooO0o(o00oO0o.OooO00o(Arrays.asList(o000000.OooO0O0(o000Var2, false, false).f35898OooO00o), Collections.emptyList())));
                        } else if (iOooO0oO == 6) {
                            o000 o000Var3 = new o000(iOooO0oO2);
                            o000oooo4.readFully(o000Var3.f36661OooO00o, 0, iOooO0oO2);
                            o000Var3.OooOoo0(4);
                            int iOooO0Oo = o000Var3.OooO0Oo();
                            String strOooOOOO = o000Var3.OooOOOO(o000Var3.OooO0Oo(), OooO0o.f38230OooO00o);
                            String strOooOOO = o000Var3.OooOOO(o000Var3.OooO0Oo());
                            int iOooO0Oo2 = o000Var3.OooO0Oo();
                            int iOooO0Oo3 = o000Var3.OooO0Oo();
                            int iOooO0Oo4 = o000Var3.OooO0Oo();
                            int iOooO0Oo5 = o000Var3.OooO0Oo();
                            int iOooO0Oo6 = o000Var3.OooO0Oo();
                            byte[] bArr4 = new byte[iOooO0Oo6];
                            o000Var3.OooO0OO(bArr4, 0, iOooO0Oo6);
                            o00oo0o2 = new o00oO0o(o00oo0oOooO0O0.f35913OooO00o, o00oo0oOooO0O0.f35914OooO0O0, o00oo0oOooO0O0.f35915OooO0OO, o00oo0oOooO0O0.f35916OooO0Oo, o00oo0oOooO0O0.f35918OooO0o0, o00oo0oOooO0O0.f35919OooO0oO, o00oo0oOooO0O0.f35920OooO0oo, o00oo0oOooO0O0.f35921OooOO0, o00oo0oOooO0O0.f35922OooOO0O, o00oo0oOooO0O0.OooO0o(o00oO0o.OooO00o(Collections.emptyList(), Collections.singletonList(new PictureFrame(iOooO0Oo, strOooOOOO, strOooOOO, iOooO0Oo2, iOooO0Oo3, iOooO0Oo4, iOooO0Oo5, bArr4)))));
                        } else {
                            o000oooo3 = o000oooo4;
                            o000oooo3.OooOO0(iOooO0oO2);
                        }
                        o000oooo3 = o000oooo2;
                        o00oo0oOooO0O0 = o00oo0o2;
                    }
                    int i4 = o000OOo0.f36740OooO00o;
                    this.f13756OooO = o00oo0oOooO0O0;
                    z3 = zOooO0o;
                    i2 = 24;
                    i3 = 3;
                    o000oooo4 = o000oooo3;
                    flacExtractor = this;
                }
                o000oooo3 = o000oooo4;
                int i5 = o000OOo0.f36740OooO00o;
                this.f13756OooO = o00oo0oOooO0O0;
                z3 = zOooO0o;
                i2 = 24;
                i3 = 3;
                o000oooo4 = o000oooo3;
                flacExtractor = this;
            }
            FlacExtractor flacExtractor2 = flacExtractor;
            Objects.requireNonNull(flacExtractor2.f13756OooO);
            flacExtractor2.f13765OooOO0 = Math.max(flacExtractor2.f13756OooO.f35915OooO0OO, 6);
            TrackOutput trackOutput = flacExtractor2.f13761OooO0o;
            int i6 = o000OOo0.f36740OooO00o;
            trackOutput.OooO0o0(flacExtractor2.f13756OooO.OooO0o0(flacExtractor2.f13757OooO00o, flacExtractor2.f13764OooO0oo));
            flacExtractor2.f13763OooO0oO = 4;
            return 0;
        }
        long jOooOo0o = 0;
        if (i == 4) {
            o000oooo2.OooO();
            byte[] bArr5 = new byte[2];
            o000oooo4.OooOOO0(bArr5, 0, 2);
            int i7 = (bArr5[1] & UByte.MAX_VALUE) | ((bArr5[0] & UByte.MAX_VALUE) << 8);
            if ((i7 >> 2) != 16382) {
                o000oooo2.OooO();
                throw new ParserException("First frame does not start with sync code.");
            }
            o000oooo2.OooO();
            flacExtractor.f13766OooOO0O = i7;
            o0OoOo0 o0oooo1 = flacExtractor.f13762OooO0o0;
            int i8 = o000OOo0.f36740OooO00o;
            long position = o000oooo2.getPosition();
            long jOooO00o = o000oooo2.OooO00o();
            Objects.requireNonNull(flacExtractor.f13756OooO);
            o00oO0o o00oo0o3 = flacExtractor.f13756OooO;
            if (o00oo0o3.f35922OooOO0O != null) {
                oooO0O0 = new p296o0O0OoO0.oo000o(o00oo0o3, position);
            } else if (jOooO00o == -1 || o00oo0o3.f35921OooOO0 <= 0) {
                oooO0O0 = new oo0o0Oo.OooO0O0(o00oo0o3.OooO0Oo());
            } else {
                oo000o oo000oVar = new oo000o(o00oo0o3, flacExtractor.f13766OooOO0O, position, jOooO00o);
                flacExtractor.f13767OooOO0o = oo000oVar;
                oooO0O0 = oo000oVar.f35854OooO00o;
            }
            o0oooo1.OooOO0O(oooO0O0);
            flacExtractor.f13763OooO0oO = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        Objects.requireNonNull(flacExtractor.f13761OooO0o);
        Objects.requireNonNull(flacExtractor.f13756OooO);
        oo000o oo000oVar2 = flacExtractor.f13767OooOO0o;
        if (oo000oVar2 != null && oo000oVar2.OooO0O0()) {
            return flacExtractor.f13767OooOO0o.OooO00o(o000oooo4, o0oo00o2);
        }
        if (flacExtractor.f13768OooOOO == -1) {
            o00oO0o o00oo0o4 = flacExtractor.f13756OooO;
            o000oooo2.OooO();
            o000oooo4.OooO0o0(1);
            byte[] bArr6 = new byte[1];
            o000oooo4.OooOOO0(bArr6, 0, 1);
            boolean z4 = (bArr6[0] & 1) == 1;
            o000oooo4.OooO0o0(2);
            int i9 = z4 ? 7 : 6;
            o000 o000Var4 = new o000(i9);
            byte[] bArr7 = o000Var4.f36661OooO00o;
            int i10 = 0;
            while (i10 < i9) {
                int iOooO0oO3 = o000oooo4.OooO0oO(bArr7, 0 + i10, i9 - i10);
                if (iOooO0oO3 == -1) {
                    break;
                }
                i10 += iOooO0oO3;
            }
            o000Var4.OooOoO(i10);
            o000oooo2.OooO();
            try {
                jOooOo0o = o000Var4.OooOo0o();
                if (!z4) {
                    jOooOo0o *= (long) o00oo0o4.f35914OooO0O0;
                }
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw new ParserException();
            }
            flacExtractor.f13768OooOOO = jOooOo0o;
            return 0;
        }
        o000 o000Var5 = flacExtractor.f13758OooO0O0;
        int i11 = o000Var5.f36663OooO0OO;
        if (i11 < 32768) {
            int i12 = o000oooo4.read(o000Var5.f36661OooO00o, i11, ShareRequest.THUMB_DATA_SIZE_LIMIT - i11);
            z = i12 == -1;
            if (z) {
                o000 o000Var6 = flacExtractor.f13758OooO0O0;
                if (o000Var6.f36663OooO0OO - o000Var6.f36662OooO0O0 == 0) {
                    OooO00o();
                    return -1;
                }
            } else {
                flacExtractor.f13758OooO0O0.OooOoO(i11 + i12);
            }
        } else {
            z = false;
        }
        o000 o000Var7 = flacExtractor.f13758OooO0O0;
        int i13 = o000Var7.f36662OooO0O0;
        int i14 = flacExtractor.f13769OooOOO0;
        int i15 = flacExtractor.f13765OooOO0;
        if (i14 < i15) {
            o000Var7.OooOoo0(Math.min(i15 - i14, o000Var7.f36663OooO0OO - i13));
        }
        o000 o000Var8 = flacExtractor.f13758OooO0O0;
        Objects.requireNonNull(flacExtractor.f13756OooO);
        int i16 = o000Var8.f36662OooO0O0;
        while (true) {
            if (i16 > o000Var8.f36663OooO0OO - 16) {
                if (z) {
                    while (true) {
                        int i17 = o000Var8.f36663OooO0OO;
                        if (i16 <= i17 - flacExtractor.f13765OooOO0) {
                            o000Var8.OooOoOO(i16);
                            try {
                                zOooO00o = o00Oo0.OooO00o(o000Var8, flacExtractor.f13756OooO, flacExtractor.f13766OooOO0O, flacExtractor.f13760OooO0Oo);
                            } catch (IndexOutOfBoundsException unused2) {
                                zOooO00o = false;
                            }
                            if (o000Var8.f36662OooO0O0 > o000Var8.f36663OooO0OO) {
                                zOooO00o = false;
                            }
                            if (zOooO00o) {
                                o000Var8.OooOoOO(i16);
                                j = flacExtractor.f13760OooO0Oo.f35911OooO00o;
                                break;
                            }
                            i16++;
                        } else {
                            o000Var8.OooOoOO(i17);
                        }
                    }
                } else {
                    o000Var8.OooOoOO(i16);
                }
                j = -1;
                break;
            }
            o000Var8.OooOoOO(i16);
            if (o00Oo0.OooO00o(o000Var8, flacExtractor.f13756OooO, flacExtractor.f13766OooOO0O, flacExtractor.f13760OooO0Oo)) {
                o000Var8.OooOoOO(i16);
                j = flacExtractor.f13760OooO0Oo.f35911OooO00o;
                break;
            }
            i16++;
        }
        o000 o000Var9 = flacExtractor.f13758OooO0O0;
        int i18 = o000Var9.f36662OooO0O0 - i13;
        o000Var9.OooOoOO(i13);
        flacExtractor.f13761OooO0o.OooO0OO(flacExtractor.f13758OooO0O0, i18);
        flacExtractor.f13769OooOOO0 += i18;
        if (j != -1) {
            OooO00o();
            flacExtractor.f13769OooOOO0 = 0;
            flacExtractor.f13768OooOOO = j;
        }
        o000 o000Var10 = flacExtractor.f13758OooO0O0;
        int i19 = o000Var10.f36663OooO0OO;
        int i20 = o000Var10.f36662OooO0O0;
        int i21 = i19 - i20;
        if (i21 >= 16) {
            return 0;
        }
        byte[] bArr8 = o000Var10.f36661OooO00o;
        System.arraycopy(bArr8, i20, bArr8, 0, i21);
        o000 o000Var11 = flacExtractor.f13758OooO0O0;
        o000Var11.OooOo(o000Var11.f36663OooO0OO - o000Var11.f36662OooO0O0);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
