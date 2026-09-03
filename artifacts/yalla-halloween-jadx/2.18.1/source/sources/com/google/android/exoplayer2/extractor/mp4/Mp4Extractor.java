package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.OooOO0O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import o00O00O.OooO0OO;
import o0OOOO0o.OooO;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.o0ooOOo;
import p296o0O0OoO0.oo0o0Oo;
import p300o0O0OooO.o000O00O;
import p300o0O0OooO.o000O0o;
import p300o0O0OooO.o000OO0O;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp4Extractor implements Extractor, oo0o0Oo {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f13970OooOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f13971OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13976OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13978OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f13979OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o000 f13980OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f13982OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13983OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f13984OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public o0OoOo0 f13985OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO00o[] f13986OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f13987OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long[][] f13988OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f13989OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f13990OooOo00;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000 f13975OooO0Oo = new o000(16);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o> f13977OooO0o0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f13972OooO00o = new o000(o0000O.f36673OooO00o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f13973OooO0O0 = new o000(4);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f13974OooO0OO = new o000();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13981OooOO0O = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Track f13991OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OO0O f13992OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TrackOutput f13993OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13994OooO0Oo;

        public OooO00o(Track track, o000OO0O o000oo0o2, TrackOutput trackOutput) {
            this.f13991OooO00o = track;
            this.f13992OooO0O0 = o000oo0o2;
            this.f13993OooO0OO = trackOutput;
        }
    }

    static {
        OooOO0O oooOO0O = OooOO0O.f12691OooO0o0;
    }

    public static long OooOO0O(o000OO0O o000oo0o2, long j, long j2) {
        int iOooO00o = o000oo0o2.OooO00o(j);
        if (iOooO00o == -1) {
            iOooO00o = o000oo0o2.OooO0O0(j);
        }
        return iOooO00o == -1 ? j2 : Math.min(o000oo0o2.f36031OooO0OO[iOooO00o], j2);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f13985OooOOOO = o0oooo1;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        this.f13977OooO0o0.clear();
        this.f13971OooO = 0;
        this.f13981OooOO0O = -1;
        this.f13982OooOO0o = 0;
        this.f13984OooOOO0 = 0;
        this.f13983OooOOO = 0;
        if (j == 0) {
            OooOO0();
            return;
        }
        OooO00o[] oooO00oArr = this.f13986OooOOOo;
        if (oooO00oArr != null) {
            for (OooO00o oooO00o : oooO00oArr) {
                o000OO0O o000oo0o2 = oooO00o.f13992OooO0O0;
                int iOooO00o = o000oo0o2.OooO00o(j2);
                if (iOooO00o == -1) {
                    iOooO00o = o000oo0o2.OooO0O0(j2);
                }
                oooO00o.f13994OooO0Oo = iOooO00o;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        return o000O00O.OooO00o(o000oooo2, false);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0255  */
    /* JADX WARN: Code duplicated, block: B:120:0x026a  */
    /* JADX WARN: Code duplicated, block: B:122:0x026e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:132:0x029c  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:160:0x0314  */
    /* JADX WARN: Code duplicated, block: B:161:0x0318  */
    /* JADX WARN: Code duplicated, block: B:163:0x031e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0375  */
    /* JADX WARN: Code duplicated, block: B:201:0x0378 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x037a  */
    /* JADX WARN: Code duplicated, block: B:203:0x037c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0389  */
    /* JADX WARN: Code duplicated, block: B:207:0x038b  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long jOooO00o;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oPeek;
        long j2;
        int i;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j3;
        long j4;
        long j5;
        while (true) {
            int i3 = this.f13976OooO0o;
            if (i3 == 0) {
                if (this.f13971OooO == 0) {
                    z8 = false;
                    if (o000oooo2.OooO0O0(this.f13975OooO0Oo.f36661OooO00o, 0, 8, true)) {
                        this.f13971OooO = 8;
                        this.f13975OooO0Oo.OooOoOO(0);
                        this.f13979OooO0oo = this.f13975OooO0Oo.OooOOo();
                        this.f13978OooO0oO = this.f13975OooO0Oo.OooO0Oo();
                        j = this.f13979OooO0oo;
                        if (j == 1) {
                            o000oooo2.readFully(this.f13975OooO0Oo.f36661OooO00o, 8, 8);
                            this.f13971OooO += 8;
                            this.f13979OooO0oo = this.f13975OooO0Oo.OooOo0();
                        } else if (j == 0) {
                            jOooO00o = o000oooo2.OooO00o();
                            if (jOooO00o == -1 && (c0100OooO00oPeek = this.f13977OooO0o0.peek()) != null) {
                                jOooO00o = c0100OooO00oPeek.f13996OooO0O0;
                            }
                            if (jOooO00o != -1) {
                                this.f13979OooO0oo = (jOooO00o - o000oooo2.getPosition()) + ((long) this.f13971OooO);
                            }
                        }
                        j2 = this.f13979OooO0oo;
                        i = this.f13971OooO;
                        if (j2 >= i) {
                            throw new ParserException("Atom size less than header length (unsupported).");
                        }
                        i2 = this.f13978OooO0oO;
                        if (i2 != 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            long position = o000oooo2.getPosition();
                            j3 = this.f13979OooO0oo;
                            j4 = this.f13971OooO;
                            j5 = (position + j3) - j4;
                            if (j3 != j4 && this.f13978OooO0oO == 1835365473) {
                                this.f13974OooO0OO.OooOo(8);
                                o000oooo2.OooOOO0(this.f13974OooO0OO.f36661OooO00o, 0, 8);
                                this.f13974OooO0OO.OooOoo0(4);
                                if (this.f13974OooO0OO.OooO0Oo() == 1751411826) {
                                    o000oooo2.OooO();
                                } else {
                                    o000oooo2.OooOO0(4);
                                }
                            }
                            this.f13977OooO0o0.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o(this.f13978OooO0oO, j5));
                            if (this.f13979OooO0oo == this.f13971OooO) {
                                OooOO0o(j5);
                            } else {
                                OooOO0();
                            }
                        } else {
                            if (i2 != 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (i == 8) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                o00000O0.OooO0Oo(z6);
                                if (this.f13979OooO0oo <= 2147483647L) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                o00000O0.OooO0Oo(z7);
                                o000 o000Var = new o000((int) this.f13979OooO0oo);
                                System.arraycopy(this.f13975OooO0Oo.f36661OooO00o, 0, o000Var.f36661OooO00o, 0, 8);
                                this.f13980OooOO0 = o000Var;
                                this.f13976OooO0o = 1;
                            } else {
                                this.f13980OooOO0 = null;
                                this.f13976OooO0o = 1;
                            }
                        }
                        z8 = true;
                    }
                } else {
                    j = this.f13979OooO0oo;
                    if (j == 1) {
                        o000oooo2.readFully(this.f13975OooO0Oo.f36661OooO00o, 8, 8);
                        this.f13971OooO += 8;
                        this.f13979OooO0oo = this.f13975OooO0Oo.OooOo0();
                    } else if (j == 0) {
                        jOooO00o = o000oooo2.OooO00o();
                        if (jOooO00o == -1) {
                            jOooO00o = c0100OooO00oPeek.f13996OooO0O0;
                        }
                        if (jOooO00o != -1) {
                            this.f13979OooO0oo = (jOooO00o - o000oooo2.getPosition()) + ((long) this.f13971OooO);
                        }
                    }
                    j2 = this.f13979OooO0oo;
                    i = this.f13971OooO;
                    if (j2 >= i) {
                        throw new ParserException("Atom size less than header length (unsupported).");
                    }
                    i2 = this.f13978OooO0oO;
                    if (i2 != 1836019574) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        long position2 = o000oooo2.getPosition();
                        j3 = this.f13979OooO0oo;
                        j4 = this.f13971OooO;
                        j5 = (position2 + j3) - j4;
                        if (j3 != j4) {
                            this.f13974OooO0OO.OooOo(8);
                            o000oooo2.OooOOO0(this.f13974OooO0OO.f36661OooO00o, 0, 8);
                            this.f13974OooO0OO.OooOoo0(4);
                            if (this.f13974OooO0OO.OooO0Oo() == 1751411826) {
                                o000oooo2.OooO();
                            } else {
                                o000oooo2.OooOO0(4);
                            }
                        }
                        this.f13977OooO0o0.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o(this.f13978OooO0oO, j5));
                        if (this.f13979OooO0oo == this.f13971OooO) {
                            OooOO0o(j5);
                        } else {
                            OooOO0();
                        }
                    } else {
                        if (i2 != 1835296868) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            if (i == 8) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            o00000O0.OooO0Oo(z6);
                            if (this.f13979OooO0oo <= 2147483647L) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            o00000O0.OooO0Oo(z7);
                            o000 o000Var2 = new o000((int) this.f13979OooO0oo);
                            System.arraycopy(this.f13975OooO0Oo.f36661OooO00o, 0, o000Var2.f36661OooO00o, 0, 8);
                            this.f13980OooOO0 = o000Var2;
                            this.f13976OooO0o = 1;
                        } else {
                            this.f13980OooOO0 = null;
                            this.f13976OooO0o = 1;
                        }
                    }
                    z8 = true;
                }
                if (!z8) {
                    return -1;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException();
                    }
                    long position3 = o000oooo2.getPosition();
                    if (this.f13981OooOO0O == -1) {
                        long j6 = Long.MAX_VALUE;
                        long j7 = Long.MAX_VALUE;
                        long j8 = Long.MAX_VALUE;
                        int i4 = 0;
                        boolean z9 = true;
                        boolean z10 = true;
                        int i5 = -1;
                        int i6 = -1;
                        while (true) {
                            OooO00o[] oooO00oArr = this.f13986OooOOOo;
                            int i7 = o000OOo0.f36740OooO00o;
                            if (i4 >= oooO00oArr.length) {
                                break;
                            }
                            OooO00o oooO00o = oooO00oArr[i4];
                            int i8 = oooO00o.f13994OooO0Oo;
                            o000OO0O o000oo0o2 = oooO00o.f13992OooO0O0;
                            if (i8 != o000oo0o2.f36030OooO0O0) {
                                long j9 = o000oo0o2.f36031OooO0OO[i8];
                                long j10 = this.f13988OooOOo0[i4][i8];
                                long j11 = j9 - position3;
                                boolean z11 = j11 < 0 || j11 >= 262144;
                                if ((!z11 && z9) || (z11 == z9 && j11 < j8)) {
                                    i6 = i4;
                                    z9 = z11;
                                    j7 = j10;
                                    j8 = j11;
                                }
                                if (j10 < j6) {
                                    i5 = i4;
                                    z10 = z11;
                                    j6 = j10;
                                }
                            }
                            i4++;
                        }
                        int i9 = (j6 == Long.MAX_VALUE || !z10 || j7 < j6 + 10485760) ? i6 : i5;
                        this.f13981OooOO0O = i9;
                        if (i9 == -1) {
                            return -1;
                        }
                    }
                    OooO00o[] oooO00oArr2 = this.f13986OooOOOo;
                    int i10 = o000OOo0.f36740OooO00o;
                    OooO00o oooO00o2 = oooO00oArr2[this.f13981OooOO0O];
                    TrackOutput trackOutput = oooO00o2.f13993OooO0OO;
                    int i11 = oooO00o2.f13994OooO0Oo;
                    o000OO0O o000oo0o3 = oooO00o2.f13992OooO0O0;
                    long j12 = o000oo0o3.f36031OooO0OO[i11];
                    int i12 = o000oo0o3.f36032OooO0Oo[i11];
                    long j13 = (j12 - position3) + ((long) this.f13982OooOO0o);
                    if (j13 < 0 || j13 >= 262144) {
                        o0oo00o2.f35929OooO00o = j12;
                        return 1;
                    }
                    if (oooO00o2.f13991OooO00o.f14025OooO0oO == 1) {
                        j13 += 8;
                        i12 -= 8;
                    }
                    o000oooo2.OooOO0((int) j13);
                    Track track = oooO00o2.f13991OooO00o;
                    int i13 = track.f14027OooOO0;
                    if (i13 == 0) {
                        if ("audio/ac4".equals(track.f14023OooO0o.f13131OoooOOo)) {
                            if (this.f13984OooOOO0 == 0) {
                                p293o0O0Oo0O.OooOO0O.OooO00o(i12, this.f13974OooO0OO);
                                trackOutput.OooO0OO(this.f13974OooO0OO, 7);
                                this.f13984OooOOO0 += 7;
                            }
                            i12 += 7;
                        }
                        while (true) {
                            int i14 = this.f13984OooOOO0;
                            if (i14 >= i12) {
                                break;
                            }
                            int iOooO0O0 = trackOutput.OooO0O0(o000oooo2, i12 - i14, false);
                            this.f13982OooOO0o += iOooO0O0;
                            this.f13984OooOOO0 += iOooO0O0;
                            this.f13983OooOOO -= iOooO0O0;
                        }
                    } else {
                        byte[] bArr = this.f13973OooO0O0.f36661OooO00o;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i15 = 4 - i13;
                        while (this.f13984OooOOO0 < i12) {
                            int i16 = this.f13983OooOOO;
                            if (i16 == 0) {
                                o000oooo2.readFully(bArr, i15, i13);
                                this.f13982OooOO0o += i13;
                                this.f13973OooO0O0.OooOoOO(0);
                                int iOooO0Oo = this.f13973OooO0O0.OooO0Oo();
                                if (iOooO0Oo < 0) {
                                    throw new ParserException("Invalid NAL length");
                                }
                                this.f13983OooOOO = iOooO0Oo;
                                this.f13972OooO00o.OooOoOO(0);
                                trackOutput.OooO0OO(this.f13972OooO00o, 4);
                                this.f13984OooOOO0 += 4;
                                i12 += i15;
                            } else {
                                int iOooO0O1 = trackOutput.OooO0O0(o000oooo2, i16, false);
                                this.f13982OooOO0o += iOooO0O1;
                                this.f13984OooOOO0 += iOooO0O1;
                                this.f13983OooOOO -= iOooO0O1;
                            }
                        }
                    }
                    o000OO0O o000oo0o4 = oooO00o2.f13992OooO0O0;
                    trackOutput.OooO0Oo(o000oo0o4.f36033OooO0o[i11], o000oo0o4.f36035OooO0oO[i11], i12, 0, null);
                    oooO00o2.f13994OooO0Oo++;
                    this.f13981OooOO0O = -1;
                    this.f13982OooOO0o = 0;
                    this.f13984OooOOO0 = 0;
                    this.f13983OooOOO = 0;
                    return 0;
                }
                long j14 = this.f13979OooO0oo - ((long) this.f13971OooO);
                long position4 = o000oooo2.getPosition() + j14;
                o000 o000Var3 = this.f13980OooOO0;
                if (o000Var3 != null) {
                    o000oooo2.readFully(o000Var3.f36661OooO00o, this.f13971OooO, (int) j14);
                    if (this.f13978OooO0oO == 1718909296) {
                        o000Var3.OooOoOO(8);
                        if (o000Var3.OooO0Oo() != 1903435808) {
                            o000Var3.OooOoo0(4);
                            while (true) {
                                if (o000Var3.f36663OooO0OO - o000Var3.f36662OooO0O0 <= 0) {
                                    z3 = false;
                                    break;
                                }
                                if (o000Var3.OooO0Oo() == 1903435808) {
                                    z3 = true;
                                    break;
                                }
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                        this.f13990OooOo00 = z3;
                    } else if (!this.f13977OooO0o0.isEmpty()) {
                        this.f13977OooO0o0.peek().f13997OooO0OO.add(new com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0(this.f13978OooO0oO, o000Var3));
                    }
                } else {
                    if (j14 < 262144) {
                        o000oooo2.OooOO0((int) j14);
                    } else {
                        o0oo00o2.f35929OooO00o = o000oooo2.getPosition() + j14;
                        z = true;
                    }
                    OooOO0o(position4);
                    if (z || this.f13976OooO0o == 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return 1;
                    }
                }
                z = false;
                OooOO0o(position4);
                if (z) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return 1;
                }
            }
        }
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        long j2;
        long jOooOO0O;
        long j3;
        long j4;
        int iOooO0O0;
        OooO00o[] oooO00oArr = this.f13986OooOOOo;
        Objects.requireNonNull(oooO00oArr);
        if (oooO00oArr.length == 0) {
            o0O0O00 o0o0o00 = o0O0O00.f35926OooO0OO;
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        int i = this.f13987OooOOo;
        if (i != -1) {
            o000OO0O o000oo0o2 = this.f13986OooOOOo[i].f13992OooO0O0;
            int iOooO00o = o000oo0o2.OooO00o(j);
            if (iOooO00o == -1) {
                iOooO00o = o000oo0o2.OooO0O0(j);
            }
            if (iOooO00o == -1) {
                o0O0O00 o0o0o01 = o0O0O00.f35926OooO0OO;
                return new oo0o0Oo.OooO00o(o0o0o01, o0o0o01);
            }
            long j5 = o000oo0o2.f36033OooO0o[iOooO00o];
            j2 = o000oo0o2.f36031OooO0OO[iOooO00o];
            if (j5 >= j || iOooO00o >= o000oo0o2.f36030OooO0O0 - 1 || (iOooO0O0 = o000oo0o2.OooO0O0(j)) == -1 || iOooO0O0 == iOooO00o) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = o000oo0o2.f36033OooO0o[iOooO0O0];
                j4 = o000oo0o2.f36031OooO0OO[iOooO0O0];
            }
            jOooOO0O = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jOooOO0O = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            OooO00o[] oooO00oArr2 = this.f13986OooOOOo;
            if (i2 >= oooO00oArr2.length) {
                break;
            }
            if (i2 != this.f13987OooOOo) {
                o000OO0O o000oo0o3 = oooO00oArr2[i2].f13992OooO0O0;
                long jOooOO0O2 = OooOO0O(o000oo0o3, j, j2);
                if (j3 != -9223372036854775807L) {
                    jOooOO0O = OooOO0O(o000oo0o3, j3, jOooOO0O);
                }
                j2 = jOooOO0O2;
            }
            i2++;
        }
        o0O0O00 o0o0o02 = new o0O0O00(j, j2);
        return j3 == -9223372036854775807L ? new oo0o0Oo.OooO00o(o0o0o02, o0o0o02) : new oo0o0Oo.OooO00o(o0o0o02, new o0O0O00(j3, jOooOO0O));
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f13989OooOOoo;
    }

    public final void OooOO0() {
        this.f13976OooO0o = 0;
        this.f13971OooO = 0;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0269 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:41:0x00bf, B:42:0x00c6, B:45:0x00d2, B:48:0x00df, B:51:0x00ec, B:54:0x00f9, B:57:0x0106, B:60:0x0111, B:63:0x011e, B:66:0x012b, B:69:0x0138, B:72:0x0145, B:75:0x0152, B:78:0x015f, B:81:0x016c, B:84:0x0179, B:87:0x0186, B:91:0x0197, B:93:0x019b, B:95:0x01ac, B:98:0x01b8, B:102:0x01c6, B:109:0x01d6, B:146:0x0269, B:148:0x0279, B:150:0x0283, B:149:0x027e, B:110:0x01ec, B:112:0x01f5, B:127:0x021b, B:130:0x0228, B:133:0x0234, B:136:0x0240, B:139:0x024c, B:142:0x0258, B:145:0x0262, B:152:0x0288, B:153:0x028f), top: B:282:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0279 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:41:0x00bf, B:42:0x00c6, B:45:0x00d2, B:48:0x00df, B:51:0x00ec, B:54:0x00f9, B:57:0x0106, B:60:0x0111, B:63:0x011e, B:66:0x012b, B:69:0x0138, B:72:0x0145, B:75:0x0152, B:78:0x015f, B:81:0x016c, B:84:0x0179, B:87:0x0186, B:91:0x0197, B:93:0x019b, B:95:0x01ac, B:98:0x01b8, B:102:0x01c6, B:109:0x01d6, B:146:0x0269, B:148:0x0279, B:150:0x0283, B:149:0x027e, B:110:0x01ec, B:112:0x01f5, B:127:0x021b, B:130:0x0228, B:133:0x0234, B:136:0x0240, B:139:0x024c, B:142:0x0258, B:145:0x0262, B:152:0x0288, B:153:0x028f), top: B:282:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:149:0x027e A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:41:0x00bf, B:42:0x00c6, B:45:0x00d2, B:48:0x00df, B:51:0x00ec, B:54:0x00f9, B:57:0x0106, B:60:0x0111, B:63:0x011e, B:66:0x012b, B:69:0x0138, B:72:0x0145, B:75:0x0152, B:78:0x015f, B:81:0x016c, B:84:0x0179, B:87:0x0186, B:91:0x0197, B:93:0x019b, B:95:0x01ac, B:98:0x01b8, B:102:0x01c6, B:109:0x01d6, B:146:0x0269, B:148:0x0279, B:150:0x0283, B:149:0x027e, B:110:0x01ec, B:112:0x01f5, B:127:0x021b, B:130:0x0228, B:133:0x0234, B:136:0x0240, B:139:0x024c, B:142:0x0258, B:145:0x0262, B:152:0x0288, B:153:0x028f), top: B:282:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:205:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
    public final void OooOO0o(long j) throws ParserException {
        int i;
        Metadata metadata;
        int i2;
        int i3;
        MdtaMetadataEntry mdtaMetadataEntry;
        String strValueOf;
        String str;
        Id3Frame internalFrame;
        String str2;
        Mp4Extractor mp4Extractor = this;
        while (!mp4Extractor.f13977OooO0o0.isEmpty() && mp4Extractor.f13977OooO0o0.peek().f13996OooO0O0 == j) {
            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oPop = mp4Extractor.f13977OooO0o0.pop();
            if (c0100OooO00oPop.f13995OooO00o == 1836019574) {
                ArrayList arrayList = new ArrayList();
                o0ooOOo o0ooooo2 = new o0ooOOo();
                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0100OooO00oPop.OooO0OO(1969517665);
                int i4 = 12;
                int i5 = 1768715124;
                int i6 = 1835365473;
                int i7 = 8;
                Metadata metadata2 = null;
                String strOooOOO0 = null;
                boolean z = true;
                boolean z2 = false;
                if (oooO0O0OooO0OO != null) {
                    boolean z3 = mp4Extractor.f13990OooOo00;
                    byte[] bArr = OooO0O0.f14000OooO00o;
                    if (!z3) {
                        o000 o000Var = oooO0O0OooO0OO.f13999OooO0O0;
                        o000Var.OooOoOO(8);
                        while (true) {
                            int i8 = o000Var.f36663OooO0OO;
                            int i9 = o000Var.f36662OooO0O0;
                            if (i8 - i9 >= i7) {
                                int iOooO0Oo = o000Var.OooO0Oo();
                                if (o000Var.OooO0Oo() == i6) {
                                    o000Var.OooOoOO(i9);
                                    int i10 = i9 + iOooO0Oo;
                                    o000Var.OooOoo0(i4);
                                    while (true) {
                                        int i11 = o000Var.f36662OooO0O0;
                                        if (i11 < i10) {
                                            int iOooO0Oo2 = o000Var.OooO0Oo();
                                            if (o000Var.OooO0Oo() == i5) {
                                                o000Var.OooOoOO(i11);
                                                int i12 = i11 + iOooO0Oo2;
                                                o000Var.OooOoo0(i7);
                                                ArrayList arrayList2 = new ArrayList();
                                                while (true) {
                                                    int i13 = o000Var.f36662OooO0O0;
                                                    if (i13 >= i12) {
                                                        break;
                                                    }
                                                    int iOooO0Oo3 = o000Var.OooO0Oo() + i13;
                                                    int iOooO0Oo4 = o000Var.OooO0Oo();
                                                    int i14 = (iOooO0Oo4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                                    if (i14 == 169 || i14 == 253) {
                                                        int i15 = 16777215 & iOooO0Oo4;
                                                        if (i15 == 6516084) {
                                                            internalFrame = o000O0o.OooO00o(iOooO0Oo4, o000Var);
                                                        } else if (i15 == 7233901 || i15 == 7631467) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TIT2", o000Var);
                                                        } else if (i15 == 6516589 || i15 == 7828084) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TCOM", o000Var);
                                                        } else if (i15 == 6578553) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TDRC", o000Var);
                                                        } else if (i15 == 4280916) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TPE1", o000Var);
                                                        } else if (i15 == 7630703) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TSSE", o000Var);
                                                        } else if (i15 == 6384738) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TALB", o000Var);
                                                        } else if (i15 == 7108978) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "USLT", o000Var);
                                                        } else if (i15 == 6776174) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TCON", o000Var);
                                                        } else if (i15 == 6779504) {
                                                            internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TIT1", o000Var);
                                                        } else {
                                                            strValueOf = String.valueOf(com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO00o(iOooO0Oo4));
                                                            if (strValueOf.length() != 0) {
                                                                str = "Skipped unknown metadata entry: ".concat(strValueOf);
                                                            } else {
                                                                str = new String("Skipped unknown metadata entry: ");
                                                            }
                                                            Log.d("MetadataUtil", str);
                                                            internalFrame = null;
                                                        }
                                                    } else if (iOooO0Oo4 == 1735291493) {
                                                        try {
                                                            int iOooO0o = o000O0o.OooO0o(o000Var);
                                                            if (iOooO0o > 0) {
                                                                String[] strArr = o000O0o.f36028OooO00o;
                                                                if (iOooO0o <= 192) {
                                                                    str2 = strArr[iOooO0o - 1];
                                                                } else {
                                                                    str2 = strOooOOO0;
                                                                }
                                                            } else {
                                                                str2 = strOooOOO0;
                                                            }
                                                            if (str2 != null) {
                                                                internalFrame = new TextInformationFrame("TCON", strOooOOO0, str2);
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                internalFrame = null;
                                                            }
                                                        } catch (Throwable th) {
                                                            o000Var.OooOoOO(iOooO0Oo3);
                                                            throw th;
                                                        }
                                                    } else if (iOooO0Oo4 == 1684632427) {
                                                        internalFrame = o000O0o.OooO0OO(iOooO0Oo4, "TPOS", o000Var);
                                                    } else if (iOooO0Oo4 == 1953655662) {
                                                        internalFrame = o000O0o.OooO0OO(iOooO0Oo4, "TRCK", o000Var);
                                                    } else if (iOooO0Oo4 == 1953329263) {
                                                        internalFrame = o000O0o.OooO0o0(iOooO0Oo4, "TBPM", o000Var, z, z2);
                                                    } else if (iOooO0Oo4 == 1668311404) {
                                                        internalFrame = o000O0o.OooO0o0(iOooO0Oo4, "TCMP", o000Var, z, z);
                                                    } else if (iOooO0Oo4 == 1668249202) {
                                                        internalFrame = o000O0o.OooO0O0(o000Var);
                                                    } else if (iOooO0Oo4 == 1631670868) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TPE2", o000Var);
                                                    } else if (iOooO0Oo4 == 1936682605) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TSOT", o000Var);
                                                    } else if (iOooO0Oo4 == 1936679276) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TSO2", o000Var);
                                                    } else if (iOooO0Oo4 == 1936679282) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TSOA", o000Var);
                                                    } else if (iOooO0Oo4 == 1936679265) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TSOP", o000Var);
                                                    } else if (iOooO0Oo4 == 1936679791) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TSOC", o000Var);
                                                    } else if (iOooO0Oo4 == 1920233063) {
                                                        internalFrame = o000O0o.OooO0o0(iOooO0Oo4, "ITUNESADVISORY", o000Var, z2, z2);
                                                    } else if (iOooO0Oo4 == 1885823344) {
                                                        internalFrame = o000O0o.OooO0o0(iOooO0Oo4, "ITUNESGAPLESS", o000Var, z2, z);
                                                    } else if (iOooO0Oo4 == 1936683886) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TVSHOWSORT", o000Var);
                                                    } else if (iOooO0Oo4 == 1953919848) {
                                                        internalFrame = o000O0o.OooO0Oo(iOooO0Oo4, "TVSHOW", o000Var);
                                                    } else {
                                                        if (iOooO0Oo4 == 757935405) {
                                                            int i16 = -1;
                                                            String strOooOOO1 = strOooOOO0;
                                                            int i17 = -1;
                                                            while (true) {
                                                                int i18 = o000Var.f36662OooO0O0;
                                                                if (i18 >= iOooO0Oo3) {
                                                                    break;
                                                                }
                                                                int iOooO0Oo5 = o000Var.OooO0Oo();
                                                                int iOooO0Oo6 = o000Var.OooO0Oo();
                                                                o000Var.OooOoo0(4);
                                                                if (iOooO0Oo6 == 1835360622) {
                                                                    strOooOOO0 = o000Var.OooOOO0(iOooO0Oo5 - 12);
                                                                } else if (iOooO0Oo6 == 1851878757) {
                                                                    strOooOOO1 = o000Var.OooOOO0(iOooO0Oo5 - 12);
                                                                } else {
                                                                    if (iOooO0Oo6 == 1684108385) {
                                                                        i16 = i18;
                                                                        i17 = iOooO0Oo5;
                                                                    }
                                                                    o000Var.OooOoo0(iOooO0Oo5 - 12);
                                                                }
                                                            }
                                                            if (strOooOOO0 != null && strOooOOO1 != null && i16 != -1) {
                                                                o000Var.OooOoOO(i16);
                                                                o000Var.OooOoo0(16);
                                                                internalFrame = new InternalFrame(strOooOOO0, strOooOOO1, o000Var.OooOOO0(i17 - 16));
                                                            }
                                                        } else {
                                                            strValueOf = String.valueOf(com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO00o(iOooO0Oo4));
                                                            if (strValueOf.length() != 0) {
                                                                str = "Skipped unknown metadata entry: ".concat(strValueOf);
                                                            } else {
                                                                str = new String("Skipped unknown metadata entry: ");
                                                            }
                                                            Log.d("MetadataUtil", str);
                                                        }
                                                        internalFrame = null;
                                                    }
                                                    o000Var.OooOoOO(iOooO0Oo3);
                                                    if (internalFrame != null) {
                                                        arrayList2.add(internalFrame);
                                                    }
                                                    strOooOOO0 = null;
                                                    z = true;
                                                    z2 = false;
                                                }
                                                if (!arrayList2.isEmpty()) {
                                                    metadata2 = new Metadata(arrayList2);
                                                    break;
                                                }
                                                break;
                                            }
                                            o000Var.OooOoOO(i11 + iOooO0Oo2);
                                            i5 = 1768715124;
                                            i7 = 8;
                                            strOooOOO0 = null;
                                            z = true;
                                            z2 = false;
                                        }
                                    }
                                } else {
                                    o000Var.OooOoOO(i9 + iOooO0Oo);
                                    i4 = 12;
                                    i5 = 1768715124;
                                    i6 = 1835365473;
                                    i7 = 8;
                                    strOooOOO0 = null;
                                    z = true;
                                    z2 = false;
                                }
                            }
                            metadata2 = null;
                            break;
                        }
                    }
                    if (metadata2 != null) {
                        o0ooooo2.OooO0O0(metadata2);
                    }
                    i = 1835365473;
                } else {
                    i = 1835365473;
                    metadata2 = null;
                }
                Metadata metadata3 = metadata2;
                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O0 = c0100OooO00oPop.OooO0O0(i);
                if (c0100OooO00oOooO0O0 != null) {
                    byte[] bArr2 = OooO0O0.f14000OooO00o;
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0100OooO00oOooO0O0.OooO0OO(1751411826);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0100OooO00oOooO0O0.OooO0OO(1801812339);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0100OooO00oOooO0O0.OooO0OO(1768715124);
                    if (oooO0O0OooO0OO2 == null || oooO0O0OooO0OO3 == null || oooO0O0OooO0OO4 == null) {
                        metadata = null;
                    } else {
                        o000 o000Var2 = oooO0O0OooO0OO2.f13999OooO0O0;
                        o000Var2.OooOoOO(16);
                        if (o000Var2.OooO0Oo() != 1835299937) {
                            metadata = null;
                        } else {
                            o000 o000Var3 = oooO0O0OooO0OO3.f13999OooO0O0;
                            o000Var3.OooOoOO(12);
                            int iOooO0Oo7 = o000Var3.OooO0Oo();
                            String[] strArr2 = new String[iOooO0Oo7];
                            for (int i19 = 0; i19 < iOooO0Oo7; i19++) {
                                int iOooO0Oo8 = o000Var3.OooO0Oo();
                                o000Var3.OooOoo0(4);
                                strArr2[i19] = o000Var3.OooOOO(iOooO0Oo8 - 8);
                            }
                            int i20 = 8;
                            o000 o000Var4 = oooO0O0OooO0OO4.f13999OooO0O0;
                            o000Var4.OooOoOO(8);
                            ArrayList arrayList3 = new ArrayList();
                            while (true) {
                                int i21 = o000Var4.f36663OooO0OO;
                                int i22 = o000Var4.f36662OooO0O0;
                                if (i21 - i22 <= i20) {
                                    break;
                                }
                                int iOooO0Oo9 = o000Var4.OooO0Oo();
                                int iOooO0Oo10 = o000Var4.OooO0Oo() - 1;
                                if (iOooO0Oo10 < 0 || iOooO0Oo10 >= iOooO0Oo7) {
                                    i3 = iOooO0Oo7;
                                    OooO0OO.OooO0O0(52, "Skipped metadata with unknown key index: ", iOooO0Oo10, "AtomParsers");
                                } else {
                                    String str3 = strArr2[iOooO0Oo10];
                                    int i23 = i22 + iOooO0Oo9;
                                    while (true) {
                                        int i24 = o000Var4.f36662OooO0O0;
                                        if (i24 >= i23) {
                                            i3 = iOooO0Oo7;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iOooO0Oo11 = o000Var4.OooO0Oo();
                                        i3 = iOooO0Oo7;
                                        if (o000Var4.OooO0Oo() == 1684108385) {
                                            int iOooO0Oo12 = o000Var4.OooO0Oo();
                                            int iOooO0Oo13 = o000Var4.OooO0Oo();
                                            int i25 = iOooO0Oo11 - 16;
                                            byte[] bArr3 = new byte[i25];
                                            o000Var4.OooO0OO(bArr3, 0, i25);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str3, bArr3, iOooO0Oo13, iOooO0Oo12);
                                            break;
                                        }
                                        o000Var4.OooOoOO(i24 + iOooO0Oo11);
                                        iOooO0Oo7 = i3;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList3.add(mdtaMetadataEntry);
                                    }
                                }
                                o000Var4.OooOoOO(i22 + iOooO0Oo9);
                                i20 = 8;
                                iOooO0Oo7 = i3;
                            }
                            if (arrayList3.isEmpty()) {
                                metadata = null;
                            } else {
                                metadata = new Metadata(arrayList3);
                            }
                        }
                    }
                } else {
                    metadata = null;
                }
                Metadata metadata4 = metadata;
                long j2 = -9223372036854775807L;
                List<o000OO0O> listOooO0o0 = OooO0O0.OooO0o0(c0100OooO00oPop, o0ooooo2, -9223372036854775807L, null, false, mp4Extractor.f13990OooOo00, new OooO() { // from class: o0O0OooO.o000Oo0
                    @Override // o0OOOO0o.OooO
                    public final Object apply(Object obj) {
                        Track track = (Track) obj;
                        int i26 = Mp4Extractor.f13970OooOo0;
                        return track;
                    }
                });
                o0OoOo0 o0oooo1 = mp4Extractor.f13985OooOOOO;
                Objects.requireNonNull(o0oooo1);
                ArrayList arrayList4 = (ArrayList) listOooO0o0;
                int size = -1;
                int i26 = 0;
                for (int size2 = arrayList4.size(); i26 < size2; size2 = size2) {
                    o000OO0O o000oo0o2 = (o000OO0O) arrayList4.get(i26);
                    if (o000oo0o2.f36030OooO0O0 != 0) {
                        Track track = o000oo0o2.f36029OooO00o;
                        ArrayList arrayList5 = arrayList;
                        long j3 = track.f14024OooO0o0;
                        if (j3 == -9223372036854775807L) {
                            j3 = o000oo0o2.f36036OooO0oo;
                        }
                        long jMax = Math.max(j2, j3);
                        OooO00o oooO00o = new OooO00o(track, o000oo0o2, o0oooo1.OooO00o(i26));
                        int i27 = o000oo0o2.f36034OooO0o0 + 30;
                        Format.OooO0O0 oooO0O0 = new Format.OooO0O0(track.f14023OooO0o);
                        oooO0O0.f13164OooOO0o = i27;
                        int i28 = track.f14020OooO0O0;
                        if (i28 == 2 && j3 > 0 && (i2 = o000oo0o2.f36030OooO0O0) > 1) {
                            oooO0O0.f13169OooOOo = i2 / (j3 / 1000000.0f);
                        }
                        if (i28 == 1) {
                            int i29 = o0ooooo2.f35937OooO00o;
                            if ((i29 == -1 || o0ooooo2.f35938OooO0O0 == -1) ? false : true) {
                                oooO0O0.f13179OooOoOO = i29;
                                oooO0O0.f13181OooOoo0 = o0ooooo2.f35938OooO0O0;
                            }
                            if (metadata3 != null) {
                                oooO0O0.f13153OooO = metadata3;
                            }
                        } else if (i28 == 2 && metadata4 != null) {
                            int i30 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr = metadata4.f14442Oooo0o;
                                if (i30 >= entryArr.length) {
                                    break;
                                }
                                Metadata.Entry entry = entryArr[i30];
                                if (entry instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                    if ("com.android.capture.fps".equals(mdtaMetadataEntry2.f13967Oooo0o)) {
                                        oooO0O0.f13153OooO = new Metadata(mdtaMetadataEntry2);
                                    }
                                }
                                i30++;
                            }
                        }
                        oooO00o.f13993OooO0OO.OooO0o0(new Format(oooO0O0));
                        if (track.f14020OooO0O0 == 2 && size == -1) {
                            size = arrayList5.size();
                        }
                        arrayList = arrayList5;
                        arrayList.add(oooO00o);
                        j2 = jMax;
                    }
                    i26++;
                    mp4Extractor = this;
                    arrayList4 = arrayList4;
                }
                long j4 = 0;
                mp4Extractor.f13987OooOOo = size;
                mp4Extractor.f13989OooOOoo = j2;
                OooO00o[] oooO00oArr = (OooO00o[]) arrayList.toArray(new OooO00o[0]);
                mp4Extractor.f13986OooOOOo = oooO00oArr;
                long[][] jArr = new long[oooO00oArr.length][];
                int[] iArr = new int[oooO00oArr.length];
                long[] jArr2 = new long[oooO00oArr.length];
                boolean[] zArr = new boolean[oooO00oArr.length];
                for (int i31 = 0; i31 < oooO00oArr.length; i31++) {
                    jArr[i31] = new long[oooO00oArr[i31].f13992OooO0O0.f36030OooO0O0];
                    jArr2[i31] = oooO00oArr[i31].f13992OooO0O0.f36033OooO0o[0];
                }
                int i32 = 0;
                while (i32 < oooO00oArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i33 = -1;
                    for (int i34 = 0; i34 < oooO00oArr.length; i34++) {
                        if (!zArr[i34] && jArr2[i34] <= j5) {
                            j5 = jArr2[i34];
                            i33 = i34;
                        }
                    }
                    int i35 = iArr[i33];
                    jArr[i33][i35] = j4;
                    j4 += (long) oooO00oArr[i33].f13992OooO0O0.f36032OooO0Oo[i35];
                    int i36 = i35 + 1;
                    iArr[i33] = i36;
                    if (i36 < jArr[i33].length) {
                        jArr2[i33] = oooO00oArr[i33].f13992OooO0O0.f36033OooO0o[i36];
                    } else {
                        zArr[i33] = true;
                        i32++;
                    }
                }
                mp4Extractor.f13988OooOOo0 = jArr;
                o0oooo1.OooOOO0();
                o0oooo1.OooOO0O(mp4Extractor);
                mp4Extractor.f13977OooO0o0.clear();
                mp4Extractor.f13976OooO0o = 2;
            } else if (!mp4Extractor.f13977OooO0o0.isEmpty()) {
                mp4Extractor.f13977OooO0o0.peek().f13998OooO0Oo.add(c0100OooO00oPop);
            }
        }
        if (mp4Extractor.f13976OooO0o != 2) {
            OooOO0();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
