package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.container.Mp4LocationData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.OooO0OO;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import p101o000oo.Oooo000;
import p205o00o0oO0.o00000O0;
import p209o00o0oo0.o00O;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p214o00oO00o.o0000O;
import p214o00oO00o.o0000OO0;
import p214o00oO00o.o000O000;
import p214o00oO00o.o000O00O;
import p214o00oO00o.o000O0o;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Mp4Extractor implements Extractor, o00OO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f12023OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f12024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12025OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f12026OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo00 f12027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> f12028OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo00 f12029OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O000 f12030OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f12031OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12032OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f12033OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f12034OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f12035OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o00Oo00 f12036OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f12037OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f12038OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o00O0O0 f12039OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f12040OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO00o[] f12041OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f12042OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f12043OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long[][] f12044OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f12045OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f12046OooOo0o;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Track f12047OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O00O f12048OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TrackOutput f12049OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final OooO0OO f12050OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f12051OooO0o0;

        public OooO00o(Track track, o000O00O o000o00o2, TrackOutput trackOutput) {
            this.f12047OooO00o = track;
            this.f12048OooO0O0 = o000o00o2;
            this.f12049OooO0OO = trackOutput;
            this.f12050OooO0Oo = "audio/true-hd".equals(track.f12090OooO0o.f11211OooOOOO) ? new OooO0OO() : null;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f12045OooOo0O;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f12028OooO0o.clear();
        this.f12034OooOO0o = 0;
        this.f12035OooOOO = -1;
        this.f12037OooOOOO = 0;
        this.f12038OooOOOo = 0;
        this.f12040OooOOo0 = 0;
        if (j == 0) {
            if (this.f12023OooO != 3) {
                this.f12023OooO = 0;
                this.f12034OooOO0o = 0;
                return;
            } else {
                o000O000 o000o001 = this.f12030OooO0oO;
                o000o001.f39682OooO00o.clear();
                o000o001.f39683OooO0O0 = 0;
                this.f12031OooO0oo.clear();
                return;
            }
        }
        for (OooO00o oooO00o : this.f12041OooOOoo) {
            o000O00O o000o00o2 = oooO00o.f12048OooO0O0;
            int iOooO0o = o0O00.OooO0o(o000o00o2.f39691OooO0o, j2, false);
            while (true) {
                if (iOooO0o < 0) {
                    iOooO0o = -1;
                    break;
                } else if ((o000o00o2.f39693OooO0oO[iOooO0o] & 1) != 0) {
                    break;
                } else {
                    iOooO0o--;
                }
            }
            if (iOooO0o == -1) {
                iOooO0o = o000o00o2.OooO00o(j2);
            }
            oooO00o.f12051OooO0o0 = iOooO0o;
            OooO0OO oooO0OO = oooO00o.f12050OooO0Oo;
            if (oooO0OO != null) {
                oooO0OO.f11786OooO0O0 = false;
                oooO0OO.f11787OooO0OO = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[LOOP:2: B:35:0x0081->B:39:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[LOOP:3: B:49:0x00b2->B:53:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8 A[EDGE_INSN: B:70:0x00d8->B:62:0x00d8 BREAK  A[LOOP:1: B:30:0x006e->B:61:0x00d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0091 A[EDGE_INSN: B:76:0x0091->B:41:0x0091 BREAK  A[LOOP:2: B:35:0x0081->B:39:0x008c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00c1 A[EDGE_INSN: B:78:0x00c1->B:55:0x00c1 BREAK  A[LOOP:3: B:49:0x00b2->B:53:0x00bd], SYNTHETIC] */
    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        long jMin;
        long jMin2;
        long j2;
        long j3;
        int i;
        OooO00o[] oooO00oArr;
        oo0O oo0o;
        o00OO0OO.OooO00o oooO00o;
        o000O00O o000o00o2;
        int iOooO0o;
        int iOooO0o2;
        int iOooO00o;
        long j4 = j;
        OooO00o[] oooO00oArr2 = this.f12041OooOOoo;
        int length = oooO00oArr2.length;
        oo0O oo0o2 = oo0O.f39574OooO0OO;
        if (length == 0) {
            return new o00OO0OO.OooO00o(oo0o2, oo0o2);
        }
        int i2 = this.f12043OooOo0;
        boolean z = false;
        int i3 = -1;
        if (i2 != -1) {
            o000O00O o000o00o3 = oooO00oArr2[i2].f12048OooO0O0;
            int iOooO0o3 = o0O00.OooO0o(o000o00o3.f39691OooO0o, j4, false);
            while (true) {
                if (iOooO0o3 < 0) {
                    iOooO0o3 = -1;
                    break;
                }
                if ((o000o00o3.f39693OooO0oO[iOooO0o3] & 1) != 0) {
                    break;
                }
                iOooO0o3--;
            }
            if (iOooO0o3 == -1) {
                iOooO0o3 = o000o00o3.OooO00o(j4);
            }
            if (iOooO0o3 == -1) {
                return new o00OO0OO.OooO00o(oo0o2, oo0o2);
            }
            long[] jArr = o000o00o3.f39691OooO0o;
            j2 = jArr[iOooO0o3];
            long[] jArr2 = o000o00o3.f39689OooO0OO;
            jMin = jArr2[iOooO0o3];
            if (j2 >= j4 || iOooO0o3 >= o000o00o3.f39688OooO0O0 - 1 || (iOooO00o = o000o00o3.OooO00o(j4)) == -1 || iOooO00o == iOooO0o3) {
                j4 = j2;
            } else {
                j3 = jArr[iOooO00o];
                jMin2 = jArr2[iOooO00o];
            }
            i = 0;
            while (true) {
                oooO00oArr = this.f12041OooOOoo;
                if (i < oooO00oArr.length) {
                    break;
                }
                if (i != this.f12043OooOo0) {
                    o000o00o2 = oooO00oArr[i].f12048OooO0O0;
                    iOooO0o = o0O00.OooO0o(o000o00o2.f39691OooO0o, j2, z);
                    while (true) {
                        if (iOooO0o >= 0) {
                            iOooO0o = i3;
                            break;
                        }
                        if ((o000o00o2.f39693OooO0oO[iOooO0o] & 1) != 0) {
                            break;
                        }
                        iOooO0o--;
                    }
                    if (iOooO0o == i3) {
                        iOooO0o = o000o00o2.OooO00o(j2);
                    }
                    if (iOooO0o != i3) {
                        jMin = Math.min(o000o00o2.f39689OooO0OO[iOooO0o], jMin);
                    }
                    if (j3 != -9223372036854775807L) {
                        iOooO0o2 = o0O00.OooO0o(o000o00o2.f39691OooO0o, j3, false);
                        while (true) {
                            if (iOooO0o2 >= 0) {
                                iOooO0o2 = -1;
                                break;
                            }
                            if ((o000o00o2.f39693OooO0oO[iOooO0o2] & 1) != 0) {
                                break;
                            }
                            iOooO0o2--;
                        }
                        if (iOooO0o2 == -1) {
                            iOooO0o2 = o000o00o2.OooO00o(j3);
                        }
                        if (iOooO0o2 == -1) {
                            jMin2 = Math.min(o000o00o2.f39689OooO0OO[iOooO0o2], jMin2);
                        }
                    }
                }
                i++;
                z = false;
                i3 = -1;
            }
            oo0o = new oo0O(j2, jMin);
            if (j3 == -9223372036854775807L) {
                oooO00o = new o00OO0OO.OooO00o(oo0o, oo0o);
            } else {
                oooO00o = new o00OO0OO.OooO00o(oo0o, new oo0O(j3, jMin2));
            }
            return oooO00o;
        }
        jMin = LongCompanionObject.MAX_VALUE;
        jMin2 = -1;
        j2 = j4;
        j3 = -9223372036854775807L;
        i = 0;
        while (true) {
            oooO00oArr = this.f12041OooOOoo;
            if (i < oooO00oArr.length) {
                break;
                break;
            }
            if (i != this.f12043OooOo0) {
                o000o00o2 = oooO00oArr[i].f12048OooO0O0;
                iOooO0o = o0O00.OooO0o(o000o00o2.f39691OooO0o, j2, z);
                while (true) {
                    if (iOooO0o >= 0) {
                        iOooO0o = i3;
                        break;
                    }
                    if ((o000o00o2.f39693OooO0oO[iOooO0o] & 1) != 0) {
                        break;
                        break;
                    }
                    iOooO0o--;
                }
                if (iOooO0o == i3) {
                    iOooO0o = o000o00o2.OooO00o(j2);
                }
                if (iOooO0o != i3) {
                    jMin = Math.min(o000o00o2.f39689OooO0OO[iOooO0o], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    iOooO0o2 = o0O00.OooO0o(o000o00o2.f39691OooO0o, j3, false);
                    while (true) {
                        if (iOooO0o2 >= 0) {
                            iOooO0o2 = -1;
                            break;
                        }
                        if ((o000o00o2.f39693OooO0oO[iOooO0o2] & 1) != 0) {
                            break;
                            break;
                        }
                        iOooO0o2--;
                    }
                    if (iOooO0o2 == -1) {
                        iOooO0o2 = o000o00o2.OooO00o(j3);
                    }
                    if (iOooO0o2 == -1) {
                        jMin2 = Math.min(o000o00o2.f39689OooO0OO[iOooO0o2], jMin2);
                    }
                }
            }
            i++;
            z = false;
            i3 = -1;
        }
        oo0o = new oo0O(j2, jMin);
        if (j3 == -9223372036854775807L) {
            oooO00o = new o00OO0OO.OooO00o(oo0o, oo0o);
        } else {
            oooO00o = new o00OO0OO.OooO00o(oo0o, new oo0O(j3, jMin2));
        }
        return oooO00o;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        return o000O0o.OooO00o(o00o0o01, false, (this.f12024OooO00o & 2) != 0);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:239:0x046a  */
    /* JADX WARN: Code duplicated, block: B:260:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:270:0x0516  */
    /* JADX WARN: Code duplicated, block: B:273:0x052a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0552  */
    /* JADX WARN: Code duplicated, block: B:291:0x0558  */
    /* JADX WARN: Code duplicated, block: B:297:0x0584  */
    /* JADX WARN: Code duplicated, block: B:301:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:302:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:304:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:341:0x060a  */
    /* JADX WARN: Code duplicated, block: B:343:0x060d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0611  */
    /* JADX WARN: Code duplicated, block: B:346:0x0613  */
    /* JADX WARN: Code duplicated, block: B:349:0x0620  */
    /* JADX WARN: Code duplicated, block: B:350:0x0622  */
    /* JADX WARN: Code duplicated, block: B:352:0x063e  */
    /* JADX WARN: Code duplicated, block: B:354:0x064e  */
    /* JADX WARN: Code duplicated, block: B:366:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x066f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        int i;
        char c;
        boolean z;
        boolean z2;
        long j;
        long length;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00oPeek;
        long j2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        long j3;
        long j4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j5;
        long j6;
        long j7;
        int i4;
        while (true) {
            int i5 = this.f12023OooO;
            ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque = this.f12028OooO0o;
            int i6 = 4;
            o00Oo00 o00oo00 = this.f12027OooO0Oo;
            if (i5 == 0) {
                int i7 = this.f12034OooOO0o;
                o00Oo00 o00oo01 = this.f12029OooO0o0;
                if (i7 != 0) {
                    j = this.f12033OooOO0O;
                    if (j == 1) {
                        o00o0o01.readFully(o00oo01.f40591OooO00o, 8, 8);
                        this.f12034OooOO0o += 8;
                        this.f12033OooOO0O = o00oo01.OooOoO();
                    } else if (j == 0) {
                        length = o00o0o01.getLength();
                        if (length == -1 && (c0203OooO00oPeek = arrayDeque.peek()) != null) {
                            length = c0203OooO00oPeek.f12053OooO0O0;
                        }
                        if (length != -1) {
                            this.f12033OooOO0O = (length - o00o0o01.getPosition()) + ((long) this.f12034OooOO0o);
                        }
                    }
                    j2 = this.f12033OooOO0O;
                    i2 = this.f12034OooOO0o;
                    if (j2 >= i2) {
                        throw ParserException.OooO0OO("Atom size less than header length (unsupported).");
                    }
                    i3 = this.f12032OooOO0;
                    if (i3 != 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        long position = o00o0o01.getPosition();
                        j5 = this.f12033OooOO0O;
                        j6 = this.f12034OooOO0o;
                        j7 = (position + j5) - j6;
                        if (j5 != j6 && this.f12032OooOO0 == 1835365473) {
                            o00oo00.OooOooO(8);
                            o00o0o01.OooO0O0(0, 8, o00oo00.f40591OooO00o);
                            byte[] bArr = OooO0O0.f12057OooO00o;
                            i4 = o00oo00.f40592OooO0O0;
                            o00oo00.Oooo00o(4);
                            if (o00oo00.OooO0o() != 1751411826) {
                                i4 += 4;
                            }
                            o00oo00.Oooo00O(i4);
                            o00o0o01.OooOO0(o00oo00.f40592OooO0O0);
                            o00o0o01.OooO0o();
                        }
                        arrayDeque.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o(this.f12032OooOO0, j7));
                        if (this.f12033OooOO0O == this.f12034OooOO0o) {
                            OooOO0(j7);
                        } else {
                            this.f12023OooO = 0;
                            this.f12034OooOO0o = 0;
                        }
                        z5 = true;
                    } else {
                        if (i3 != 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            if (i2 == 8) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            o00O000o.OooO0Oo(z6);
                            if (this.f12033OooOO0O <= 2147483647L) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            o00O000o.OooO0Oo(z7);
                            o00Oo00 o00oo02 = new o00Oo00((int) this.f12033OooOO0O);
                            System.arraycopy(o00oo01.f40591OooO00o, 0, o00oo02.f40591OooO00o, 0, 8);
                            this.f12036OooOOO0 = o00oo02;
                            z5 = true;
                            this.f12023OooO = 1;
                        } else {
                            long position2 = o00o0o01.getPosition();
                            j3 = this.f12034OooOO0o;
                            j4 = position2 - j3;
                            if (this.f12032OooOO0 == 1836086884) {
                                this.f12042OooOo = new MotionPhotoMetadata(0L, j4, -9223372036854775807L, j4 + j3, this.f12033OooOO0O - j3);
                            }
                            this.f12036OooOOO0 = null;
                            z5 = true;
                            this.f12023OooO = 1;
                        }
                    }
                    z8 = z5;
                } else if (o00o0o01.OooO0oO(o00oo01.f40591OooO00o, 0, 8, true)) {
                    this.f12034OooOO0o = 8;
                    o00oo01.Oooo00O(0);
                    this.f12033OooOO0O = o00oo01.OooOo0o();
                    this.f12032OooOO0 = o00oo01.OooO0o();
                    j = this.f12033OooOO0O;
                    if (j == 1) {
                        o00o0o01.readFully(o00oo01.f40591OooO00o, 8, 8);
                        this.f12034OooOO0o += 8;
                        this.f12033OooOO0O = o00oo01.OooOoO();
                    } else if (j == 0) {
                        length = o00o0o01.getLength();
                        if (length == -1) {
                            length = c0203OooO00oPeek.f12053OooO0O0;
                        }
                        if (length != -1) {
                            this.f12033OooOO0O = (length - o00o0o01.getPosition()) + ((long) this.f12034OooOO0o);
                        }
                    }
                    j2 = this.f12033OooOO0O;
                    i2 = this.f12034OooOO0o;
                    if (j2 >= i2) {
                        throw ParserException.OooO0OO("Atom size less than header length (unsupported).");
                    }
                    i3 = this.f12032OooOO0;
                    if (i3 != 1836019574) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        long position3 = o00o0o01.getPosition();
                        j5 = this.f12033OooOO0O;
                        j6 = this.f12034OooOO0o;
                        j7 = (position3 + j5) - j6;
                        if (j5 != j6) {
                            o00oo00.OooOooO(8);
                            o00o0o01.OooO0O0(0, 8, o00oo00.f40591OooO00o);
                            byte[] bArr2 = OooO0O0.f12057OooO00o;
                            i4 = o00oo00.f40592OooO0O0;
                            o00oo00.Oooo00o(4);
                            if (o00oo00.OooO0o() != 1751411826) {
                                i4 += 4;
                            }
                            o00oo00.Oooo00O(i4);
                            o00o0o01.OooOO0(o00oo00.f40592OooO0O0);
                            o00o0o01.OooO0o();
                        }
                        arrayDeque.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o(this.f12032OooOO0, j7));
                        if (this.f12033OooOO0O == this.f12034OooOO0o) {
                            OooOO0(j7);
                        } else {
                            this.f12023OooO = 0;
                            this.f12034OooOO0o = 0;
                        }
                        z5 = true;
                    } else {
                        if (i3 != 1835296868) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            if (i2 == 8) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            o00O000o.OooO0Oo(z6);
                            if (this.f12033OooOO0O <= 2147483647L) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            o00O000o.OooO0Oo(z7);
                            o00Oo00 o00oo03 = new o00Oo00((int) this.f12033OooOO0O);
                            System.arraycopy(o00oo01.f40591OooO00o, 0, o00oo03.f40591OooO00o, 0, 8);
                            this.f12036OooOOO0 = o00oo03;
                            z5 = true;
                            this.f12023OooO = 1;
                        } else {
                            long position4 = o00o0o01.getPosition();
                            j3 = this.f12034OooOO0o;
                            j4 = position4 - j3;
                            if (this.f12032OooOO0 == 1836086884) {
                                this.f12042OooOo = new MotionPhotoMetadata(0L, j4, -9223372036854775807L, j4 + j3, this.f12033OooOO0O - j3);
                            }
                            this.f12036OooOOO0 = null;
                            z5 = true;
                            this.f12023OooO = 1;
                        }
                    }
                    z8 = z5;
                } else {
                    if (this.f12046OooOo0o == 2 && (this.f12024OooO00o & 2) != 0) {
                        TrackOutput trackOutputOooOOO = this.f12039OooOOo.OooOOO(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f12042OooOo;
                        Metadata metadata = motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata);
                        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
                        oooO00o.f11234OooO = metadata;
                        trackOutputOooOOO.OooO0OO(new OooOo(oooO00o));
                        this.f12039OooOOo.OooO00o();
                        this.f12039OooOOo.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
                    }
                    z8 = false;
                }
                if (!z8) {
                    return -1;
                }
            } else {
                if (i5 != 1) {
                    if (i5 == 2) {
                        long position5 = o00o0o01.getPosition();
                        if (this.f12035OooOOO == -1) {
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = 0;
                            boolean z9 = true;
                            boolean z10 = true;
                            long j8 = LongCompanionObject.MAX_VALUE;
                            long j9 = LongCompanionObject.MAX_VALUE;
                            long j10 = LongCompanionObject.MAX_VALUE;
                            while (true) {
                                OooO00o[] oooO00oArr = this.f12041OooOOoo;
                                if (i10 >= oooO00oArr.length) {
                                    break;
                                }
                                OooO00o oooO00o2 = oooO00oArr[i10];
                                int i11 = oooO00o2.f12051OooO0o0;
                                o000O00O o000o00o2 = oooO00o2.f12048OooO0O0;
                                if (i11 != o000o00o2.f39688OooO0O0) {
                                    long j11 = o000o00o2.f39689OooO0OO[i11];
                                    long[][] jArr = this.f12044OooOo00;
                                    int i12 = o0O00.f40595OooO00o;
                                    long j12 = jArr[i10][i11];
                                    long j13 = j11 - position5;
                                    boolean z11 = j13 < 0 || j13 >= 262144;
                                    if ((!z11 && z10) || (z11 == z10 && j13 < j10)) {
                                        z10 = z11;
                                        j9 = j12;
                                        i9 = i10;
                                        j10 = j13;
                                    }
                                    if (j12 < j8) {
                                        z9 = z11;
                                        j8 = j12;
                                        i8 = i10;
                                    }
                                }
                                i10++;
                            }
                            if (j8 == LongCompanionObject.MAX_VALUE || !z9 || j9 < j8 + 10485760) {
                                i8 = i9;
                            }
                            this.f12035OooOOO = i8;
                            if (i8 == -1) {
                                return -1;
                            }
                        }
                        OooO00o oooO00o3 = this.f12041OooOOoo[this.f12035OooOOO];
                        TrackOutput trackOutput = oooO00o3.f12049OooO0OO;
                        int i13 = oooO00o3.f12051OooO0o0;
                        o000O00O o000o00o3 = oooO00o3.f12048OooO0O0;
                        long j14 = o000o00o3.f39689OooO0OO[i13];
                        int i14 = o000o00o3.f39690OooO0Oo[i13];
                        long j15 = (j14 - position5) + ((long) this.f12037OooOOOO);
                        if (j15 < 0 || j15 >= 262144) {
                            o00oo0o1.f39548OooO00o = j14;
                            return 1;
                        }
                        Track track = oooO00o3.f12047OooO00o;
                        if (track.f12092OooO0oO == 1) {
                            j15 += 8;
                            i14 -= 8;
                        }
                        o00o0o01.OooOO0((int) j15);
                        int i15 = track.f12094OooOO0;
                        OooO0OO oooO0OO = oooO00o3.f12050OooO0Oo;
                        if (i15 == 0) {
                            if ("audio/ac4".equals(track.f12090OooO0o.f11211OooOOOO)) {
                                if (this.f12038OooOOOo == 0) {
                                    o00000O0.OooO00o(i14, o00oo00);
                                    trackOutput.OooO0O0(7, o00oo00);
                                    this.f12038OooOOOo += 7;
                                }
                                i14 += 7;
                            } else if (oooO0OO != null) {
                                oooO0OO.OooO0OO(o00o0o01);
                            }
                            while (true) {
                                int i16 = this.f12038OooOOOo;
                                if (i16 >= i14) {
                                    break;
                                }
                                int iOooO00o = trackOutput.OooO00o(o00o0o01, i14 - i16, false);
                                this.f12037OooOOOO += iOooO00o;
                                this.f12038OooOOOo += iOooO00o;
                                this.f12040OooOOo0 -= iOooO00o;
                            }
                        } else {
                            o00Oo00 o00oo04 = this.f12026OooO0OO;
                            byte[] bArr3 = o00oo04.f40591OooO00o;
                            bArr3[0] = 0;
                            bArr3[1] = 0;
                            bArr3[2] = 0;
                            int i17 = 4 - i15;
                            while (this.f12038OooOOOo < i14) {
                                int i18 = this.f12040OooOOo0;
                                if (i18 == 0) {
                                    o00o0o01.readFully(bArr3, i17, i15);
                                    this.f12037OooOOOO += i15;
                                    o00oo04.Oooo00O(0);
                                    int iOooO0o = o00oo04.OooO0o();
                                    if (iOooO0o < 0) {
                                        throw ParserException.OooO00o("Invalid NAL length", null);
                                    }
                                    this.f12040OooOOo0 = iOooO0o;
                                    o00Oo00 o00oo05 = this.f12025OooO0O0;
                                    o00oo05.Oooo00O(0);
                                    trackOutput.OooO0O0(4, o00oo05);
                                    this.f12038OooOOOo += 4;
                                    i14 += i17;
                                } else {
                                    int iOooO00o2 = trackOutput.OooO00o(o00o0o01, i18, false);
                                    this.f12037OooOOOO += iOooO00o2;
                                    this.f12038OooOOOo += iOooO00o2;
                                    this.f12040OooOOo0 -= iOooO00o2;
                                }
                            }
                        }
                        long j16 = o000o00o3.f39691OooO0o[i13];
                        int i19 = o000o00o3.f39693OooO0oO[i13];
                        if (oooO0OO != null) {
                            oooO0OO.OooO0O0(trackOutput, j16, i19, i14, 0, null);
                            if (i13 + 1 == o000o00o3.f39688OooO0O0) {
                                oooO0OO.OooO00o(trackOutput, null);
                            }
                        } else {
                            trackOutput.OooO0o0(j16, i19, i14, 0, null);
                        }
                        oooO00o3.f12051OooO0o0++;
                        this.f12035OooOOO = -1;
                        this.f12037OooOOOO = 0;
                        this.f12038OooOOOo = 0;
                        this.f12040OooOOo0 = 0;
                        return 0;
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.f12031OooO0oo;
                    o000O000 o000o001 = this.f12030OooO0oO;
                    int i20 = o000o001.f39683OooO0O0;
                    if (i20 == 0) {
                        long length2 = o00o0o01.getLength();
                        o00oo0o1.f39548OooO00o = (length2 == -1 || length2 < 8) ? 0L : length2 - 8;
                        o000o001.f39683OooO0O0 = 1;
                    } else if (i20 != 1) {
                        ArrayList arrayList2 = o000o001.f39682OooO00o;
                        short s = 2816;
                        if (i20 == 2) {
                            long length3 = o00o0o01.getLength();
                            int i21 = (o000o001.f39684OooO0OO - 12) - 8;
                            o00Oo00 o00oo06 = new o00Oo00(i21);
                            o00o0o01.readFully(o00oo06.f40591OooO00o, 0, i21);
                            int i22 = 0;
                            while (i22 < i21 / 12) {
                                o00oo06.Oooo00o(2);
                                short sOooOO0O = o00oo06.OooOO0O();
                                if (sOooOO0O != 2192 && sOooOO0O != s && sOooOO0O != 2817 && sOooOO0O != 2819) {
                                    if (sOooOO0O != 2820) {
                                        o00oo06.Oooo00o(8);
                                    }
                                    i22++;
                                    s = 2816;
                                }
                                arrayList2.add(new o000O000.OooO00o(o00oo06.OooO(), (length3 - ((long) o000o001.f39684OooO0OO)) - ((long) o00oo06.OooO())));
                                i22++;
                                s = 2816;
                            }
                            if (arrayList2.isEmpty()) {
                                o00oo0o1.f39548OooO00o = 0L;
                            } else {
                                o000o001.f39683OooO0O0 = 3;
                                o00oo0o1.f39548OooO00o = ((o000O000.OooO00o) arrayList2.get(0)).f39685OooO00o;
                            }
                        } else {
                            if (i20 != 3) {
                                throw new IllegalStateException();
                            }
                            long position6 = o00o0o01.getPosition();
                            int length4 = (int) ((o00o0o01.getLength() - o00o0o01.getPosition()) - ((long) o000o001.f39684OooO0OO));
                            o00Oo00 o00oo07 = new o00Oo00(length4);
                            o00o0o01.readFully(o00oo07.f40591OooO00o, 0, length4);
                            int i23 = 0;
                            while (i23 < arrayList2.size()) {
                                o000O000.OooO00o oooO00o4 = (o000O000.OooO00o) arrayList2.get(i23);
                                o00oo07.Oooo00O((int) (oooO00o4.f39685OooO00o - position6));
                                o00oo07.Oooo00o(i6);
                                int iOooO = o00oo07.OooO();
                                switch (o00oo07.OooOOoo(iOooO)) {
                                    case "SlowMotion_Data":
                                        i = 0;
                                        break;
                                    case "Super_SlowMotion_Edit_Data":
                                        i = 1;
                                        break;
                                    case "Super_SlowMotion_Data":
                                        i = 2;
                                        break;
                                    case "Super_SlowMotion_Deflickering_On":
                                        i = 3;
                                        break;
                                    case "Super_SlowMotion_BGM":
                                        i = i6;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                if (i == 0) {
                                    c = 2192;
                                } else if (i == 1) {
                                    c = 2819;
                                } else if (i == 2) {
                                    c = 2816;
                                } else if (i == 3) {
                                    c = 2820;
                                } else {
                                    if (i != i6) {
                                        throw ParserException.OooO00o("Invalid SEF name", null);
                                    }
                                    c = 2817;
                                }
                                int i24 = oooO00o4.f39686OooO0O0 - (iOooO + 8);
                                if (c == 2192) {
                                    ArrayList arrayList3 = new ArrayList();
                                    List<String> listOooO00o = o000O000.f39681OooO0o0.OooO00o(o00oo07.OooOOoo(i24));
                                    for (int i25 = 0; i25 < listOooO00o.size(); i25++) {
                                        List<String> listOooO00o2 = o000O000.f39680OooO0Oo.OooO00o(listOooO00o.get(i25));
                                        if (listOooO00o2.size() != 3) {
                                            throw ParserException.OooO00o(null, null);
                                        }
                                        try {
                                            arrayList3.add(new SlowMotionData.Segment(Long.parseLong(listOooO00o2.get(0)), Long.parseLong(listOooO00o2.get(1)), 1 << (Integer.parseInt(listOooO00o2.get(2)) - 1)));
                                        } catch (NumberFormatException e) {
                                            throw ParserException.OooO00o(null, e);
                                        }
                                    }
                                    arrayList.add(new SlowMotionData(arrayList3));
                                } else if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                                    throw new IllegalStateException();
                                }
                                i23++;
                                i6 = 4;
                            }
                            o00oo0o1.f39548OooO00o = 0L;
                        }
                    } else {
                        o00Oo00 o00oo08 = new o00Oo00(8);
                        o00o0o01.readFully(o00oo08.f40591OooO00o, 0, 8);
                        o000o001.f39684OooO0OO = o00oo08.OooO() + 8;
                        if (o00oo08.OooO0o() != 1397048916) {
                            o00oo0o1.f39548OooO00o = 0L;
                        } else {
                            o00oo0o1.f39548OooO00o = o00o0o01.getPosition() - ((long) (o000o001.f39684OooO0OO - 12));
                            o000o001.f39683OooO0O0 = 2;
                        }
                    }
                    if (o00oo0o1.f39548OooO00o != 0) {
                        return 1;
                    }
                    this.f12023OooO = 0;
                    this.f12034OooOO0o = 0;
                    return 1;
                }
                long j17 = this.f12033OooOO0O - ((long) this.f12034OooOO0o);
                long position7 = o00o0o01.getPosition() + j17;
                o00Oo00 o00oo09 = this.f12036OooOOO0;
                if (o00oo09 != null) {
                    o00o0o01.readFully(o00oo09.f40591OooO00o, this.f12034OooOO0o, (int) j17);
                    if (this.f12032OooOO0 == 1718909296) {
                        o00oo09.Oooo00O(8);
                        int iOooO0o2 = o00oo09.OooO0o();
                        int i26 = iOooO0o2 != 1751476579 ? iOooO0o2 != 1903435808 ? 0 : 1 : 2;
                        if (i26 == 0) {
                            o00oo09.Oooo00o(4);
                            do {
                                if (o00oo09.f40593OooO0OO - o00oo09.f40592OooO0O0 <= 0) {
                                    i26 = 0;
                                    break;
                                }
                                int iOooO0o3 = o00oo09.OooO0o();
                                i26 = iOooO0o3 != 1751476579 ? iOooO0o3 != 1903435808 ? 0 : 1 : 2;
                            } while (i26 == 0);
                        }
                        this.f12046OooOo0o = i26;
                    } else if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().f12054OooO0OO.add(new com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0(this.f12032OooOO0, o00oo09));
                    }
                } else {
                    if (j17 < 262144) {
                        o00o0o01.OooOO0((int) j17);
                    } else {
                        o00oo0o1.f39548OooO00o = o00o0o01.getPosition() + j17;
                        z = true;
                    }
                    OooOO0(position7);
                    if (z || this.f12023OooO == 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return 1;
                    }
                }
                z = false;
                OooOO0(position7);
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

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f12039OooOOo = o00o0o0;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x04d7  */
    public final void OooOO0(long j) throws ParserException {
        ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque;
        ArrayList arrayList;
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        Metadata metadata4;
        Metadata metadata5;
        ArrayList arrayList2;
        int i;
        Metadata metadata6;
        int i2;
        Metadata metadata7;
        int i3;
        ArrayList arrayList3;
        Metadata metadata8;
        Metadata metadataOooO00o;
        int i4;
        int i5;
        String[] strArr;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque2;
        ArrayList arrayList4;
        Metadata metadata9;
        Metadata metadata10;
        ArrayList arrayList5;
        Id3Frame id3FrameOooO0Oo;
        while (true) {
            ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque3 = this.f12028OooO0o;
            if (arrayDeque3.isEmpty() || arrayDeque3.peek().f12053OooO0O0 != j) {
                break;
            }
            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00oPop = arrayDeque3.pop();
            if (c0203OooO00oPop.f12052OooO00o == 1836019574) {
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.f12046OooOo0o == 1;
                o00O o00o2 = new o00O();
                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0203OooO00oPop.OooO0OO(1969517665);
                int i6 = 1768715124;
                int i7 = 1751411826;
                int i8 = 1835365473;
                int i9 = 4;
                int i10 = 8;
                if (oooO0O0OooO0OO != null) {
                    byte[] bArr = OooO0O0.f12057OooO00o;
                    o00Oo00 o00oo00 = oooO0O0OooO0OO.f12056OooO0O0;
                    o00oo00.Oooo00O(8);
                    Metadata metadata11 = null;
                    metadata2 = null;
                    Metadata metadata12 = null;
                    while (true) {
                        int i11 = o00oo00.f40593OooO0OO;
                        int i12 = i6;
                        int i13 = o00oo00.f40592OooO0O0;
                        if (i11 - i13 < i10) {
                            break;
                        }
                        int iOooO0o = o00oo00.OooO0o();
                        Metadata metadata13 = metadata11;
                        int iOooO0o2 = o00oo00.OooO0o();
                        if (iOooO0o2 == i8) {
                            o00oo00.Oooo00O(i13);
                            int i14 = i13 + iOooO0o;
                            o00oo00.Oooo00o(i10);
                            int i15 = o00oo00.f40592OooO0O0;
                            o00oo00.Oooo00o(i9);
                            if (o00oo00.OooO0o() != i7) {
                                i15 += 4;
                            }
                            o00oo00.Oooo00O(i15);
                            int i16 = i12;
                            while (true) {
                                int i17 = o00oo00.f40592OooO0O0;
                                if (i17 < i14) {
                                    int iOooO0o3 = o00oo00.OooO0o();
                                    if (o00oo00.OooO0o() == i16) {
                                        o00oo00.Oooo00O(i17);
                                        int i18 = i17 + iOooO0o3;
                                        o00oo00.Oooo00o(i10);
                                        ArrayList arrayList7 = new ArrayList();
                                        while (true) {
                                            int i19 = o00oo00.f40592OooO0O0;
                                            if (i19 >= i18) {
                                                break;
                                            }
                                            int iOooO0o4 = o00oo00.OooO0o() + i19;
                                            int iOooO0o5 = o00oo00.OooO0o();
                                            int i20 = (iOooO0o5 >> 24) & 255;
                                            int i21 = i18;
                                            Metadata metadata14 = metadata12;
                                            ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque4 = arrayDeque3;
                                            if (i20 == 169 || i20 == 253) {
                                                arrayList5 = arrayList6;
                                                int i22 = 16777215 & iOooO0o5;
                                                if (i22 == 6516084) {
                                                    id3FrameOooO0Oo = o0000O.OooO00o(iOooO0o5, o00oo00);
                                                } else if (i22 == 7233901 || i22 == 7631467) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TIT2");
                                                } else if (i22 == 6516589 || i22 == 7828084) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TCOM");
                                                } else if (i22 == 6578553) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TDRC");
                                                } else if (i22 == 4280916) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TPE1");
                                                } else if (i22 == 7630703) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TSSE");
                                                } else if (i22 == 6384738) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TALB");
                                                } else if (i22 == 7108978) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "USLT");
                                                } else if (i22 == 6776174) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TCON");
                                                } else if (i22 == 6779504) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TIT1");
                                                } else {
                                                    Log.OooO0O0("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO00o(iOooO0o5));
                                                    id3FrameOooO0Oo = null;
                                                }
                                            } else if (iOooO0o5 == 1735291493) {
                                                try {
                                                    int iOooO0o6 = o0000O.OooO0o(o00oo00);
                                                    String str = (iOooO0o6 <= 0 || iOooO0o6 > 192) ? null : o0000O.f39658OooO00o[iOooO0o6 - 1];
                                                    if (str != null) {
                                                        id3FrameOooO0Oo = new TextInformationFrame("TCON", null, ImmutableList.OooOOOo(str));
                                                        arrayList5 = arrayList6;
                                                    } else {
                                                        Log.OooO0o("MetadataUtil", "Failed to parse standard genre code");
                                                        arrayList5 = arrayList6;
                                                        id3FrameOooO0Oo = null;
                                                    }
                                                } catch (Throwable th) {
                                                    o00oo00.Oooo00O(iOooO0o4);
                                                    throw th;
                                                }
                                            } else {
                                                String strOooOOo0 = null;
                                                if (iOooO0o5 == 1684632427) {
                                                    id3FrameOooO0Oo = o0000O.OooO0OO(iOooO0o5, o00oo00, "TPOS");
                                                } else if (iOooO0o5 == 1953655662) {
                                                    id3FrameOooO0Oo = o0000O.OooO0OO(iOooO0o5, o00oo00, "TRCK");
                                                } else if (iOooO0o5 == 1953329263) {
                                                    id3FrameOooO0Oo = o0000O.OooO0o0(iOooO0o5, "TBPM", o00oo00, true, false);
                                                } else if (iOooO0o5 == 1668311404) {
                                                    id3FrameOooO0Oo = o0000O.OooO0o0(iOooO0o5, "TCMP", o00oo00, true, true);
                                                } else if (iOooO0o5 == 1668249202) {
                                                    id3FrameOooO0Oo = o0000O.OooO0O0(o00oo00);
                                                } else if (iOooO0o5 == 1631670868) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TPE2");
                                                } else if (iOooO0o5 == 1936682605) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TSOT");
                                                } else if (iOooO0o5 == 1936679276) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TSO2");
                                                } else if (iOooO0o5 == 1936679282) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TSOA");
                                                } else if (iOooO0o5 == 1936679265) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TSOP");
                                                } else if (iOooO0o5 == 1936679791) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TSOC");
                                                } else if (iOooO0o5 == 1920233063) {
                                                    id3FrameOooO0Oo = o0000O.OooO0o0(iOooO0o5, "ITUNESADVISORY", o00oo00, false, false);
                                                } else if (iOooO0o5 == 1885823344) {
                                                    id3FrameOooO0Oo = o0000O.OooO0o0(iOooO0o5, "ITUNESGAPLESS", o00oo00, false, true);
                                                } else if (iOooO0o5 == 1936683886) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TVSHOWSORT");
                                                } else if (iOooO0o5 == 1953919848) {
                                                    id3FrameOooO0Oo = o0000O.OooO0Oo(iOooO0o5, o00oo00, "TVSHOW");
                                                } else if (iOooO0o5 == 757935405) {
                                                    int i23 = -1;
                                                    int i24 = -1;
                                                    String strOooOOo1 = null;
                                                    while (true) {
                                                        int i25 = o00oo00.f40592OooO0O0;
                                                        if (i25 >= iOooO0o4) {
                                                            break;
                                                        }
                                                        int iOooO0o7 = o00oo00.OooO0o();
                                                        int iOooO0o8 = o00oo00.OooO0o();
                                                        ArrayList arrayList8 = arrayList6;
                                                        o00oo00.Oooo00o(4);
                                                        if (iOooO0o8 == 1835360622) {
                                                            strOooOOo0 = o00oo00.OooOOo0(iOooO0o7 - 12);
                                                        } else if (iOooO0o8 == 1851878757) {
                                                            strOooOOo1 = o00oo00.OooOOo0(iOooO0o7 - 12);
                                                        } else {
                                                            if (iOooO0o8 == 1684108385) {
                                                                i24 = iOooO0o7;
                                                                i23 = i25;
                                                            }
                                                            o00oo00.Oooo00o(iOooO0o7 - 12);
                                                        }
                                                        arrayList6 = arrayList8;
                                                    }
                                                    arrayList5 = arrayList6;
                                                    if (strOooOOo0 == null || strOooOOo1 == null || i23 == -1) {
                                                        id3FrameOooO0Oo = null;
                                                    } else {
                                                        o00oo00.Oooo00O(i23);
                                                        o00oo00.Oooo00o(16);
                                                        id3FrameOooO0Oo = new InternalFrame(strOooOOo0, strOooOOo1, o00oo00.OooOOo0(i24 - 16));
                                                    }
                                                } else {
                                                    arrayList5 = arrayList6;
                                                    Log.OooO0O0("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO00o(iOooO0o5));
                                                    id3FrameOooO0Oo = null;
                                                }
                                                arrayList5 = arrayList6;
                                            }
                                            o00oo00.Oooo00O(iOooO0o4);
                                            if (id3FrameOooO0Oo != null) {
                                                arrayList7.add(id3FrameOooO0Oo);
                                            }
                                            i18 = i21;
                                            metadata12 = metadata14;
                                            arrayDeque3 = arrayDeque4;
                                            arrayList6 = arrayList5;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                        arrayList4 = arrayList6;
                                        metadata9 = metadata12;
                                        if (!arrayList7.isEmpty()) {
                                            metadata10 = new Metadata(arrayList7);
                                            break;
                                        }
                                        break;
                                    }
                                    o00oo00.Oooo00O(i17 + iOooO0o3);
                                    i16 = 1768715124;
                                    i10 = 8;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    arrayList4 = arrayList6;
                                    metadata9 = metadata12;
                                }
                                metadata10 = null;
                                break;
                            }
                            metadata2 = metadata10;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            arrayList4 = arrayList6;
                            metadata9 = metadata12;
                            if (iOooO0o2 == 1936553057) {
                                o00oo00.Oooo00O(i13);
                                int i26 = i13 + iOooO0o;
                                o00oo00.Oooo00o(12);
                                while (true) {
                                    int i27 = o00oo00.f40592OooO0O0;
                                    if (i27 < i26) {
                                        int iOooO0o9 = o00oo00.OooO0o();
                                        if (o00oo00.OooO0o() == 1935766900) {
                                            if (iOooO0o9 < 14) {
                                                break;
                                            }
                                            o00oo00.Oooo00o(5);
                                            int iOooOo0O = o00oo00.OooOo0O();
                                            if (iOooOo0O == 12 || iOooOo0O == 13) {
                                                float f = iOooOo0O == 12 ? 240.0f : 120.0f;
                                                o00oo00.Oooo00o(1);
                                                metadata11 = new Metadata(new SmtaMetadataEntry(f, o00oo00.OooOo0O()));
                                                break;
                                            }
                                        } else {
                                            o00oo00.Oooo00O(i27 + iOooO0o9);
                                        }
                                    }
                                    metadata11 = null;
                                    break;
                                }
                                metadata12 = metadata9;
                            } else if (iOooO0o2 == -1451722374) {
                                short sOooOOo = o00oo00.OooOOo();
                                o00oo00.Oooo00o(2);
                                String strOooOOoo = o00oo00.OooOOoo(sOooOOo);
                                int iMax = Math.max(strOooOOoo.lastIndexOf(43), strOooOOoo.lastIndexOf(45));
                                try {
                                    metadata12 = new Metadata(new Mp4LocationData(Float.parseFloat(strOooOOoo.substring(0, iMax)), Float.parseFloat(strOooOOoo.substring(iMax, strOooOOoo.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    metadata12 = null;
                                }
                                metadata11 = metadata13;
                            }
                            o00oo00.Oooo00O(i13 + iOooO0o);
                            i9 = 4;
                            i6 = 1768715124;
                            i7 = 1751411826;
                            i8 = 1835365473;
                            i10 = 8;
                            arrayDeque3 = arrayDeque2;
                            arrayList6 = arrayList4;
                        }
                        metadata11 = metadata13;
                        metadata12 = metadata9;
                        o00oo00.Oooo00O(i13 + iOooO0o);
                        i9 = 4;
                        i6 = 1768715124;
                        i7 = 1751411826;
                        i8 = 1835365473;
                        i10 = 8;
                        arrayDeque3 = arrayDeque2;
                        arrayList6 = arrayList4;
                    }
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList6;
                    Metadata metadata15 = metadata11;
                    Metadata metadata16 = metadata12;
                    if (metadata2 != null) {
                        o00o2.OooO0O0(metadata2);
                    }
                    i8 = 1835365473;
                    metadata = metadata15;
                    metadata3 = metadata16;
                } else {
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList6;
                    metadata = null;
                    metadata2 = null;
                    metadata3 = null;
                }
                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00oOooO0O0 = c0203OooO00oPop.OooO0O0(i8);
                if (c0203OooO00oOooO0O0 != null) {
                    byte[] bArr2 = OooO0O0.f12057OooO00o;
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0203OooO00oOooO0O0.OooO0OO(1751411826);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0203OooO00oOooO0O0.OooO0OO(1801812339);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0203OooO00oOooO0O0.OooO0OO(1768715124);
                    if (oooO0O0OooO0OO2 == null || oooO0O0OooO0OO3 == null || oooO0O0OooO0OO4 == null) {
                        metadata4 = metadata2;
                        metadata5 = null;
                    } else {
                        o00Oo00 o00oo01 = oooO0O0OooO0OO2.f12056OooO0O0;
                        o00oo01.Oooo00O(16);
                        if (o00oo01.OooO0o() != 1835299937) {
                            metadata4 = metadata2;
                        } else {
                            o00Oo00 o00oo02 = oooO0O0OooO0OO3.f12056OooO0O0;
                            o00oo02.Oooo00O(12);
                            int iOooO0o10 = o00oo02.OooO0o();
                            String[] strArr2 = new String[iOooO0o10];
                            for (int i28 = 0; i28 < iOooO0o10; i28++) {
                                int iOooO0o11 = o00oo02.OooO0o();
                                o00oo02.Oooo00o(4);
                                strArr2[i28] = o00oo02.OooOOoo(iOooO0o11 - 8);
                            }
                            int i29 = 8;
                            o00Oo00 o00oo03 = oooO0O0OooO0OO4.f12056OooO0O0;
                            o00oo03.Oooo00O(8);
                            ArrayList arrayList9 = new ArrayList();
                            while (true) {
                                int i30 = o00oo03.f40593OooO0OO;
                                int i31 = o00oo03.f40592OooO0O0;
                                if (i30 - i31 <= i29) {
                                    break;
                                }
                                int iOooO0o12 = o00oo03.OooO0o();
                                int iOooO0o13 = o00oo03.OooO0o() - 1;
                                if (iOooO0o13 < 0 || iOooO0o13 >= iOooO0o10) {
                                    i5 = iOooO0o10;
                                    strArr = strArr2;
                                    metadata2 = metadata2;
                                    Oooo000.OooO0O0("Skipped metadata with unknown key index: ", iOooO0o13, "AtomParsers");
                                } else {
                                    String str2 = strArr2[iOooO0o13];
                                    int i32 = i31 + iOooO0o12;
                                    while (true) {
                                        int i33 = o00oo03.f40592OooO0O0;
                                        if (i33 >= i32) {
                                            i5 = iOooO0o10;
                                            strArr = strArr2;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iOooO0o14 = o00oo03.OooO0o();
                                        i5 = iOooO0o10;
                                        strArr = strArr2;
                                        if (o00oo03.OooO0o() == 1684108385) {
                                            int iOooO0o15 = o00oo03.OooO0o();
                                            int iOooO0o16 = o00oo03.OooO0o();
                                            int i34 = iOooO0o14 - 16;
                                            byte[] bArr3 = new byte[i34];
                                            o00oo03.OooO0Oo(0, i34, bArr3);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(bArr3, iOooO0o16, iOooO0o15, str2);
                                            break;
                                        }
                                        o00oo03.Oooo00O(i33 + iOooO0o14);
                                        iOooO0o10 = i5;
                                        strArr2 = strArr;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList9.add(mdtaMetadataEntry);
                                    }
                                }
                                o00oo03.Oooo00O(i31 + iOooO0o12);
                                i29 = 8;
                                iOooO0o10 = i5;
                                strArr2 = strArr;
                                metadata2 = metadata2;
                            }
                            metadata4 = metadata2;
                            if (!arrayList9.isEmpty()) {
                                metadata5 = new Metadata(arrayList9);
                            }
                        }
                        metadata5 = null;
                    }
                } else {
                    metadata4 = metadata2;
                    metadata5 = null;
                }
                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0203OooO00oPop.OooO0OO(1836476516);
                oooO0O0OooO0OO5.getClass();
                OooO0O0.OooO0OO OooO0OO2 = OooO0O0.OooO0OO(oooO0O0OooO0OO5.f12056OooO0O0);
                int size = -1;
                ArrayList arrayListOooO0o = OooO0O0.OooO0o(c0203OooO00oPop, o00o2, -9223372036854775807L, null, (this.f12024OooO00o & 1) != 0, z, new o0000OO0());
                int size2 = arrayListOooO0o.size();
                int i35 = 0;
                int i36 = -1;
                long j2 = -9223372036854775807L;
                while (i35 < size2) {
                    o000O00O o000o00o2 = (o000O00O) arrayListOooO0o.get(i35);
                    if (o000o00o2.f39688OooO0O0 == 0) {
                        metadata7 = metadata5;
                        arrayList2 = arrayListOooO0o;
                        i = size2;
                        arrayList3 = arrayList;
                    } else {
                        Track track = o000o00o2.f39687OooO00o;
                        ArrayList arrayList10 = arrayListOooO0o;
                        int i37 = size2;
                        long j3 = track.f12091OooO0o0;
                        if (j3 == -9223372036854775807L) {
                            j3 = o000o00o2.f39694OooO0oo;
                        }
                        long jMax = Math.max(j2, j3);
                        o00O0O0 o00o0o0 = this.f12039OooOOo;
                        arrayList2 = arrayList10;
                        int i38 = track.f12087OooO0O0;
                        OooO00o oooO00o = new OooO00o(track, o000o00o2, o00o0o0.OooOOO(i35, i38));
                        OooOo oooOo = track.f12090OooO0o;
                        i = i37;
                        boolean zEquals = "audio/true-hd".equals(oooOo.f11211OooOOOO);
                        int i39 = o000o00o2.f39692OooO0o0;
                        int i40 = zEquals ? i39 * 16 : i39 + 30;
                        OooOo.OooO00o oooO00o2 = new OooOo.OooO00o(oooOo);
                        oooO00o2.f11245OooOO0o = i40;
                        if (i38 == 2 && j3 > 0 && (i4 = o000o00o2.f39688OooO0O0) > 1) {
                            oooO00o2.f11250OooOOo = i4 / (j3 / 1000000.0f);
                        }
                        if (i38 == 1) {
                            int i41 = o00o2.f39497OooO00o;
                            if ((i41 == -1 || o00o2.f39498OooO0O0 == -1) ? false : true) {
                                oooO00o2.f11260OooOoOO = i41;
                                oooO00o2.f11262OooOoo0 = o00o2.f39498OooO0O0;
                            }
                        }
                        Metadata[] metadataArr = new Metadata[4];
                        metadataArr[0] = metadata;
                        ArrayList arrayList11 = this.f12031OooO0oo;
                        if (arrayList11.isEmpty()) {
                            i2 = 1;
                            metadata6 = null;
                        } else {
                            metadata6 = new Metadata(arrayList11);
                            i2 = 1;
                        }
                        metadataArr[i2] = metadata6;
                        metadataArr[2] = metadata3;
                        metadataArr[3] = OooO0OO2.f12075OooO00o;
                        Metadata metadata17 = new Metadata(new Metadata.Entry[0]);
                        if (i38 == i2 && metadata4 != null) {
                            metadata17 = metadata4;
                        }
                        if (metadata5 != null) {
                            int i42 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr = metadata5.f12530OooO0Oo;
                                if (i42 >= entryArr.length) {
                                    break;
                                }
                                Metadata.Entry entry = entryArr[i42];
                                if (entry instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                    metadata8 = metadata5;
                                    if (!mdtaMetadataEntry2.f12609OooO0Oo.equals("com.android.capture.fps")) {
                                        metadataOooO00o = metadata17.OooO00o(mdtaMetadataEntry2);
                                    } else if (i38 == 2) {
                                        metadataOooO00o = metadata17.OooO00o(mdtaMetadataEntry2);
                                    }
                                    metadata17 = metadataOooO00o;
                                } else {
                                    metadata8 = metadata5;
                                }
                                i42++;
                                metadata5 = metadata8;
                            }
                        }
                        metadata7 = metadata5;
                        for (int i43 = 0; i43 < 4; i43++) {
                            Metadata metadata18 = metadataArr[i43];
                            metadata17.getClass();
                            if (metadata18 != null) {
                                metadata17 = metadata17.OooO00o(metadata18.f12530OooO0Oo);
                            }
                        }
                        if (metadata17.f12530OooO0Oo.length > 0) {
                            oooO00o2.f11234OooO = metadata17;
                        }
                        oooO00o.f12049OooO0OO.OooO0OO(new OooOo(oooO00o2));
                        if (i38 == 2) {
                            i3 = -1;
                            if (size == -1) {
                                size = arrayList.size();
                            }
                        } else {
                            i3 = -1;
                        }
                        arrayList3 = arrayList;
                        arrayList3.add(oooO00o);
                        i36 = i3;
                        j2 = jMax;
                    }
                    i35++;
                    arrayList = arrayList3;
                    arrayListOooO0o = arrayList2;
                    size2 = i;
                    metadata5 = metadata7;
                }
                long j4 = 0;
                this.f12043OooOo0 = size;
                this.f12045OooOo0O = j2;
                OooO00o[] oooO00oArr = (OooO00o[]) arrayList.toArray(new OooO00o[0]);
                this.f12041OooOOoo = oooO00oArr;
                long[][] jArr = new long[oooO00oArr.length][];
                int[] iArr = new int[oooO00oArr.length];
                long[] jArr2 = new long[oooO00oArr.length];
                boolean[] zArr = new boolean[oooO00oArr.length];
                for (int i44 = 0; i44 < oooO00oArr.length; i44++) {
                    jArr[i44] = new long[oooO00oArr[i44].f12048OooO0O0.f39688OooO0O0];
                    jArr2[i44] = oooO00oArr[i44].f12048OooO0O0.f39691OooO0o[0];
                }
                int i45 = 0;
                while (i45 < oooO00oArr.length) {
                    long j5 = LongCompanionObject.MAX_VALUE;
                    int i46 = i36;
                    for (int i47 = 0; i47 < oooO00oArr.length; i47++) {
                        if (!zArr[i47]) {
                            long j6 = jArr2[i47];
                            if (j6 <= j5) {
                                i46 = i47;
                                j5 = j6;
                            }
                        }
                    }
                    int i48 = iArr[i46];
                    long[] jArr3 = jArr[i46];
                    jArr3[i48] = j4;
                    o000O00O o000o00o3 = oooO00oArr[i46].f12048OooO0O0;
                    j4 += (long) o000o00o3.f39690OooO0Oo[i48];
                    int i49 = i48 + 1;
                    iArr[i46] = i49;
                    if (i49 < jArr3.length) {
                        jArr2[i46] = o000o00o3.f39691OooO0o[i49];
                    } else {
                        zArr[i46] = true;
                        i45++;
                    }
                }
                this.f12044OooOo00 = jArr;
                this.f12039OooOOo.OooO00o();
                this.f12039OooOOo.OooO0O0(this);
                arrayDeque.clear();
                this.f12023OooO = 2;
            } else if (!arrayDeque3.isEmpty()) {
                arrayDeque3.peek().f12055OooO0Oo.add(c0203OooO00oPop);
            }
        }
        if (this.f12023OooO != 2) {
            this.f12023OooO = 0;
            this.f12034OooOO0o = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    public Mp4Extractor(int i) {
        this.f12024OooO00o = 0;
        this.f12023OooO = 0;
        this.f12030OooO0oO = new o000O000();
        this.f12031OooO0oo = new ArrayList();
        this.f12029OooO0o0 = new o00Oo00(16);
        this.f12028OooO0o = new ArrayDeque<>();
        this.f12025OooO0O0 = new o00Oo00(p245o00oo0o.oo0O.f40640OooO00o);
        this.f12026OooO0OO = new o00Oo00(4);
        this.f12027OooO0Oo = new o00Oo00();
        this.f12035OooOOO = -1;
        this.f12039OooOOo = o00O0O0.f39536OooO0OO;
        this.f12041OooOOoo = new OooO00o[0];
    }
}
