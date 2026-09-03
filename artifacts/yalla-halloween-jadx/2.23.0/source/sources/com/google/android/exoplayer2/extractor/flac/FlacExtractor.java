package com.google.android.exoplayer2.extractor.flac;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
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
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00O0OO;
import p209o00o0oo0.o00O0OOO;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.o00OOO00;
import p209o00o0oo0.oo0o0O0;
import p209o00o0oo0.oo0oOO0;
import p210o00o0ooo.o0O0O0Oo;
import p221o00oOOOo.o00O00O;
import p221o00oOOOo.oOO00O;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class FlacExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oo0oOO0 f11816OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TrackOutput f11821OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00O0O0 f11822OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Metadata f11824OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11825OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f11826OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0O0O0Oo f11827OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f11828OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f11829OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f11817OooO00o = new byte[42];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f11818OooO0O0 = new o00Oo00(new byte[ShareRequest.THUMB_DATA_SIZE_LIMIT], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f11819OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0O0.OooO00o f11820OooO0Oo = new oo0o0O0.OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f11823OooO0oO = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f11823OooO0oO = 0;
        } else {
            o0O0O0Oo o0o0o0oo = this.f11827OooOO0o;
            if (o0o0o0oo != null) {
                o0o0o0oo.OooO0OO(j2);
            }
        }
        this.f11828OooOOO = j2 != 0 ? -1L : 0L;
        this.f11829OooOOO0 = 0;
        this.f11818OooO0O0.OooOooO(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        o00O00O o00o00o2 = oOO00O.f39748OooO0O0;
        o00Oo00 o00oo00 = new o00Oo00(10);
        Metadata metadataOooO0OO = null;
        int i = 0;
        while (true) {
            try {
                o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 10, false);
                o00oo00.Oooo00O(0);
                if (o00oo00.OooOo() != 4801587) {
                    break;
                }
                o00oo00.Oooo00o(3);
                int iOooOo0 = o00oo00.OooOo0();
                int i2 = iOooOo0 + 10;
                if (metadataOooO0OO == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(o00oo00.f40591OooO00o, 0, bArr, 0, 10);
                    o00o00o1.OooO0Oo(bArr, 10, iOooOo0, false);
                    metadataOooO0OO = new oOO00O(o00o00o2).OooO0OO(i2, bArr);
                } else {
                    o00o00o1.OooOO0o(iOooOo0, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        o00o00o1.f39533OooO0o = 0;
        o00o00o1.OooOO0o(i, false);
        if (metadataOooO0OO != null) {
            int length = metadataOooO0OO.f12530OooO0Oo.length;
        }
        o00Oo00 o00oo01 = new o00Oo00(4);
        o00o00o1.OooO0Oo(o00oo01.f40591OooO00o, 0, 4, false);
        return o00oo01.OooOo0o() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        ?? r15;
        boolean z;
        oo0oOO0 oo0ooo0;
        Metadata metadata;
        o00OO0OO oooO0O0;
        long j;
        boolean zOooO00o;
        int i = this.f11823OooO0oO;
        Metadata metadata2 = null;
        boolean z2 = true;
        ?? r5 = 0;
        if (i == 0) {
            boolean z3 = !this.f11819OooO0OO;
            o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
            o00o00o1.f39533OooO0o = 0;
            long jOooO0oo = o00o00o1.OooO0oo();
            o00O00O o00o00o2 = z3 ? null : oOO00O.f39748OooO0O0;
            o00Oo00 o00oo00 = new o00Oo00(10);
            Metadata metadataOooO0OO = null;
            int i2 = 0;
            while (true) {
                try {
                    try {
                        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 10, false);
                        o00oo00.Oooo00O(0);
                        if (o00oo00.OooOo() != 4801587) {
                            break;
                        }
                        o00oo00.Oooo00o(3);
                        int iOooOo0 = o00oo00.OooOo0();
                        int i3 = iOooOo0 + 10;
                        if (metadataOooO0OO == null) {
                            byte[] bArr = new byte[i3];
                            System.arraycopy(o00oo00.f40591OooO00o, 0, bArr, 0, 10);
                            o00o00o1.OooO0Oo(bArr, 10, iOooOo0, false);
                            metadataOooO0OO = new oOO00O(o00o00o2).OooO0OO(i3, bArr);
                        } else {
                            o00o00o1.OooOO0o(iOooOo0, false);
                        }
                        i2 += i3;
                    } catch (EOFException unused) {
                        r15 = 0;
                    }
                } catch (EOFException unused2) {
                }
            }
            r15 = 0;
            o00o00o1.f39533OooO0o = r15;
            o00o00o1.OooOO0o(i2, r15);
            if (metadataOooO0OO != null && metadataOooO0OO.f12530OooO0Oo.length != 0) {
                metadata2 = metadataOooO0OO;
            }
            o00o00o1.OooOO0((int) (o00o00o1.OooO0oo() - jOooO0oo));
            this.f11824OooO0oo = metadata2;
            this.f11823OooO0oO = 1;
            return 0;
        }
        byte[] bArr2 = this.f11817OooO00o;
        if (i == 1) {
            o00O00o0 o00o00o3 = (o00O00o0) o00o0o01;
            o00o00o3.OooO0Oo(bArr2, 0, bArr2.length, false);
            o00o00o3.f39533OooO0o = 0;
            this.f11823OooO0oO = 2;
            return 0;
        }
        int i4 = 4;
        if (i == 2) {
            o00Oo00 o00oo01 = new o00Oo00(4);
            ((o00O00o0) o00o0o01).OooO0oO(o00oo01.f40591OooO00o, 0, 4, false);
            if (o00oo01.OooOo0o() != 1716281667) {
                throw ParserException.OooO00o("Failed to read FLAC stream marker.", null);
            }
            this.f11823OooO0oO = 3;
            return 0;
        }
        int i5 = 7;
        if (i == 3) {
            oo0oOO0 oo0ooo1 = this.f11816OooO;
            boolean z4 = false;
            while (!z4) {
                o00O00o0 o00o00o4 = (o00O00o0) o00o0o01;
                o00o00o4.f39533OooO0o = r5;
                o00OOOOo o00ooooo2 = new o00OOOOo(new byte[i4], i4);
                o00o00o4.OooO0Oo(o00ooooo2.f40584OooO00o, r5, i4, r5);
                boolean zOooO0o = o00ooooo2.OooO0o();
                int iOooO0oO = o00ooooo2.OooO0oO(i5);
                int iOooO0oO2 = o00ooooo2.OooO0oO(24) + i4;
                if (iOooO0oO == 0) {
                    byte[] bArr3 = new byte[38];
                    o00o00o4.OooO0oO(bArr3, r5, 38, r5);
                    oo0ooo1 = new oo0oOO0(bArr3, i4);
                    z = zOooO0o;
                } else {
                    if (oo0ooo1 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iOooO0oO == 3) {
                        o00Oo00 o00oo02 = new o00Oo00(iOooO0oO2);
                        o00o00o4.OooO0oO(o00oo02.f40591OooO00o, r5, iOooO0oO2, r5);
                        z = zOooO0o;
                        oo0ooo0 = new oo0oOO0(oo0ooo1.f39579OooO00o, oo0ooo1.f39580OooO0O0, oo0ooo1.f39581OooO0OO, oo0ooo1.f39582OooO0Oo, oo0ooo1.f39584OooO0o0, oo0ooo1.f39585OooO0oO, oo0ooo1.f39586OooO0oo, oo0ooo1.f39587OooOO0, o00O0OO.OooO00o(o00oo02), oo0ooo1.f39589OooOO0o);
                    } else {
                        z = zOooO0o;
                        Metadata metadataOooO00o = oo0ooo1.f39589OooOO0o;
                        if (iOooO0oO == i4) {
                            o00Oo00 o00oo03 = new o00Oo00(iOooO0oO2);
                            o00o00o4.OooO0oO(o00oo03.f40591OooO00o, 0, iOooO0oO2, false);
                            o00oo03.Oooo00o(i4);
                            Metadata metadataOooO00o2 = o00OOO00.OooO00o(Arrays.asList(o00OOO00.OooO0O0(o00oo03, false, false).f39553OooO00o));
                            if (metadataOooO00o == null) {
                                metadata = metadataOooO00o2;
                            } else {
                                if (metadataOooO00o2 != null) {
                                    metadataOooO00o = metadataOooO00o.OooO00o(metadataOooO00o2.f12530OooO0Oo);
                                }
                                metadata = metadataOooO00o;
                            }
                            oo0ooo0 = new oo0oOO0(oo0ooo1.f39579OooO00o, oo0ooo1.f39580OooO0O0, oo0ooo1.f39581OooO0OO, oo0ooo1.f39582OooO0Oo, oo0ooo1.f39584OooO0o0, oo0ooo1.f39585OooO0oO, oo0ooo1.f39586OooO0oo, oo0ooo1.f39587OooOO0, oo0ooo1.f39588OooOO0O, metadata);
                        } else if (iOooO0oO == 6) {
                            o00Oo00 o00oo04 = new o00Oo00(iOooO0oO2);
                            o00o00o4.OooO0oO(o00oo04.f40591OooO00o, 0, iOooO0oO2, false);
                            o00oo04.Oooo00o(4);
                            Metadata metadata3 = new Metadata(ImmutableList.OooOOOo(PictureFrame.OooO00o(o00oo04)));
                            if (metadataOooO00o != null) {
                                metadata3 = metadataOooO00o.OooO00o(metadata3.f12530OooO0Oo);
                            }
                            oo0ooo0 = new oo0oOO0(oo0ooo1.f39579OooO00o, oo0ooo1.f39580OooO0O0, oo0ooo1.f39581OooO0OO, oo0ooo1.f39582OooO0Oo, oo0ooo1.f39584OooO0o0, oo0ooo1.f39585OooO0oO, oo0ooo1.f39586OooO0oo, oo0ooo1.f39587OooOO0, oo0ooo1.f39588OooOO0O, metadata3);
                        } else {
                            o00o00o4.OooOO0(iOooO0oO2);
                        }
                    }
                    oo0ooo1 = oo0ooo0;
                }
                int i6 = o0O00.f40595OooO00o;
                this.f11816OooO = oo0ooo1;
                z4 = z;
                r5 = 0;
                i4 = 4;
                i5 = 7;
            }
            this.f11816OooO.getClass();
            this.f11825OooOO0 = Math.max(this.f11816OooO.f39581OooO0OO, 6);
            TrackOutput trackOutput = this.f11821OooO0o;
            int i7 = o0O00.f40595OooO00o;
            trackOutput.OooO0OO(this.f11816OooO.OooO0OO(bArr2, this.f11824OooO0oo));
            this.f11823OooO0oO = 4;
            return 0;
        }
        long jOooOoo0 = 0;
        if (i == 4) {
            o00O00o0 o00o00o5 = (o00O00o0) o00o0o01;
            o00o00o5.f39533OooO0o = 0;
            o00Oo00 o00oo05 = new o00Oo00(2);
            o00o00o5.OooO0Oo(o00oo05.f40591OooO00o, 0, 2, false);
            int iOooOoOO = o00oo05.OooOoOO();
            if ((iOooOoOO >> 2) != 16382) {
                o00o00o5.f39533OooO0o = 0;
                throw ParserException.OooO00o("First frame does not start with sync code.", null);
            }
            o00o00o5.f39533OooO0o = 0;
            this.f11826OooOO0O = iOooOoOO;
            o00O0O0 o00o0o0 = this.f11822OooO0o0;
            int i8 = o0O00.f40595OooO00o;
            long j2 = o00o00o5.f39532OooO0Oo;
            long j3 = o00o00o5.f39531OooO0OO;
            this.f11816OooO.getClass();
            oo0oOO0 oo0ooo2 = this.f11816OooO;
            if (oo0ooo2.f39588OooOO0O != null) {
                oooO0O0 = new o00O0OOO(oo0ooo2, j2);
            } else if (j3 == -1 || oo0ooo2.f39587OooOO0 <= 0) {
                oooO0O0 = new o00OO0OO.OooO0O0(oo0ooo2.OooO0O0());
            } else {
                o0O0O0Oo o0o0o0oo = new o0O0O0Oo(oo0ooo2, this.f11826OooOO0O, j2, j3);
                this.f11827OooOO0o = o0o0o0oo;
                oooO0O0 = o0o0o0oo.f39499OooO00o;
            }
            o00o0o0.OooO0O0(oooO0O0);
            this.f11823OooO0oO = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f11821OooO0o.getClass();
        this.f11816OooO.getClass();
        o0O0O0Oo o0o0o0oo2 = this.f11827OooOO0o;
        if (o0o0o0oo2 != null) {
            if (o0o0o0oo2.f39501OooO0OO != null) {
                return o0o0o0oo2.OooO00o((o00O00o0) o00o0o01, o00oo0o1);
            }
        }
        if (this.f11828OooOOO == -1) {
            oo0oOO0 oo0ooo3 = this.f11816OooO;
            o00O00o0 o00o00o6 = (o00O00o0) o00o0o01;
            o00o00o6.f39533OooO0o = 0;
            o00o00o6.OooOO0o(1, false);
            byte[] bArr4 = new byte[1];
            o00o00o6.OooO0Oo(bArr4, 0, 1, false);
            boolean z5 = (bArr4[0] & 1) == 1;
            o00o00o6.OooOO0o(2, false);
            i5 = z5 ? 7 : 6;
            o00Oo00 o00oo06 = new o00Oo00(i5);
            byte[] bArr5 = o00oo06.f40591OooO00o;
            int i9 = 0;
            while (i9 < i5) {
                int iOooOOO = o00o00o6.OooOOO(0 + i9, i5 - i9, bArr5);
                if (iOooOOO == -1) {
                    break;
                }
                i9 += iOooOOO;
            }
            o00oo06.Oooo000(i9);
            o00o00o6.f39533OooO0o = 0;
            try {
                jOooOoo0 = o00oo06.OooOoo0();
                if (!z5) {
                    jOooOoo0 *= (long) oo0ooo3.f39580OooO0O0;
                }
            } catch (NumberFormatException unused3) {
                z2 = false;
            }
            if (!z2) {
                throw ParserException.OooO00o(null, null);
            }
            this.f11828OooOOO = jOooOoo0;
            return 0;
        }
        o00Oo00 o00oo07 = this.f11818OooO0O0;
        int i10 = o00oo07.f40593OooO0OO;
        if (i10 < 32768) {
            int i11 = ((o00O00o0) o00o0o01).read(o00oo07.f40591OooO00o, i10, ShareRequest.THUMB_DATA_SIZE_LIMIT - i10);
            z2 = i11 == -1;
            if (!z2) {
                o00oo07.Oooo000(i10 + i11);
            } else if (o00oo07.f40593OooO0OO - o00oo07.f40592OooO0O0 == 0) {
                long j4 = this.f11828OooOOO * AnimationKt.MillisToNanos;
                oo0oOO0 oo0ooo4 = this.f11816OooO;
                int i12 = o0O00.f40595OooO00o;
                this.f11821OooO0o.OooO0o0(j4 / ((long) oo0ooo4.f39584OooO0o0), 1, this.f11829OooOOO0, 0, null);
                return -1;
            }
        } else {
            z2 = false;
        }
        int i13 = o00oo07.f40592OooO0O0;
        int i14 = this.f11829OooOOO0;
        int i15 = this.f11825OooOO0;
        if (i14 < i15) {
            o00oo07.Oooo00o(Math.min(i15 - i14, o00oo07.f40593OooO0OO - i13));
        }
        this.f11816OooO.getClass();
        int i16 = o00oo07.f40592OooO0O0;
        while (true) {
            int i17 = o00oo07.f40593OooO0OO - 16;
            oo0o0O0.OooO00o oooO00o = this.f11820OooO0Oo;
            if (i16 > i17) {
                if (z2) {
                    while (true) {
                        int i18 = o00oo07.f40593OooO0OO;
                        if (i16 <= i18 - this.f11825OooOO0) {
                            o00oo07.Oooo00O(i16);
                            try {
                                zOooO00o = oo0o0O0.OooO00o(o00oo07, this.f11816OooO, this.f11826OooOO0O, oooO00o);
                            } catch (IndexOutOfBoundsException unused4) {
                                zOooO00o = false;
                            }
                            if (o00oo07.f40592OooO0O0 > o00oo07.f40593OooO0OO) {
                                zOooO00o = false;
                            }
                            if (zOooO00o) {
                                o00oo07.Oooo00O(i16);
                                j = oooO00o.f39577OooO00o;
                                break;
                            }
                            i16++;
                        } else {
                            o00oo07.Oooo00O(i18);
                        }
                    }
                } else {
                    o00oo07.Oooo00O(i16);
                }
                j = -1;
                break;
            }
            o00oo07.Oooo00O(i16);
            if (oo0o0O0.OooO00o(o00oo07, this.f11816OooO, this.f11826OooOO0O, oooO00o)) {
                o00oo07.Oooo00O(i16);
                j = oooO00o.f39577OooO00o;
                break;
            }
            i16++;
        }
        int i19 = o00oo07.f40592OooO0O0 - i13;
        o00oo07.Oooo00O(i13);
        this.f11821OooO0o.OooO0O0(i19, o00oo07);
        int i20 = this.f11829OooOOO0 + i19;
        this.f11829OooOOO0 = i20;
        if (j != -1) {
            long j5 = this.f11828OooOOO * AnimationKt.MillisToNanos;
            oo0oOO0 oo0ooo5 = this.f11816OooO;
            int i21 = o0O00.f40595OooO00o;
            this.f11821OooO0o.OooO0o0(j5 / ((long) oo0ooo5.f39584OooO0o0), 1, i20, 0, null);
            this.f11829OooOOO0 = 0;
            this.f11828OooOOO = j;
        }
        int i22 = o00oo07.f40593OooO0OO;
        int i23 = o00oo07.f40592OooO0O0;
        int i24 = i22 - i23;
        if (i24 >= 16) {
            return 0;
        }
        byte[] bArr6 = o00oo07.f40591OooO00o;
        System.arraycopy(bArr6, i23, bArr6, 0, i24);
        o00oo07.Oooo00O(0);
        o00oo07.Oooo000(i24);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f11822OooO0o0 = o00o0o0;
        this.f11821OooO0o = o00o0o0.OooOOO(0, 1);
        o00o0o0.OooO00o();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
