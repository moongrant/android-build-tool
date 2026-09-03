package androidx.media3.extractor.mp4;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.OooO0OO;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
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
import o0000O0O.OooO0o;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import o000OOoO.o000OOo;
import o000OOoO.o00oO0o;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;
import p090o000o00o.o0;
import p090o000o00o.o0O000;
import p090o000o00o.o0O0o;
import p090o000o00o.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Mp4Extractor implements Extractor, o000000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8715OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f8718OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000 f8719OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> f8720OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O000 f8721OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0o f8722OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f8723OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8724OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f8725OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f8726OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f8727OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o000O000 f8728OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f8729OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8730OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Oooo0 f8731OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8732OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO00o[] f8733OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f8734OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f8735OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long[][] f8736OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f8737OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f8738OooOo0o;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Track f8739OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O000 f8740OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TrackOutput f8741OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final OooO0OO f8742OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8743OooO0o0;

        public OooO00o(Track track, o0O000 o0o001, TrackOutput trackOutput) {
            this.f8739OooO00o = track;
            this.f8740OooO0O0 = o0o001;
            this.f8741OooO0OO = trackOutput;
            this.f8742OooO0Oo = "audio/true-hd".equals(track.f8782OooO0o.f6412OooOOOO) ? new OooO0OO() : null;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f8737OooOo0O;
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
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        int i;
        char c;
        boolean z;
        boolean z2;
        long j;
        long length;
        androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00oPeek;
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
            int i5 = this.f8715OooO;
            ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque = this.f8720OooO0o;
            int i6 = 4;
            o000O000 o000o001 = this.f8719OooO0Oo;
            if (i5 == 0) {
                int i7 = this.f8726OooOO0o;
                o000O000 o000o002 = this.f8721OooO0o0;
                if (i7 != 0) {
                    j = this.f8725OooOO0O;
                    if (j == 1) {
                        oooo000.readFully(o000o002.f34962OooO00o, 8, 8);
                        this.f8726OooOO0o += 8;
                        this.f8725OooOO0O = o000o002.OooOoO();
                    } else if (j == 0) {
                        length = oooo000.getLength();
                        if (length == -1 && (c0156OooO00oPeek = arrayDeque.peek()) != null) {
                            length = c0156OooO00oPeek.f8745OooO0O0;
                        }
                        if (length != -1) {
                            this.f8725OooOO0O = (length - oooo000.getPosition()) + ((long) this.f8726OooOO0o);
                        }
                    }
                    j2 = this.f8725OooOO0O;
                    i2 = this.f8726OooOO0o;
                    if (j2 >= i2) {
                        throw ParserException.OooO0O0("Atom size less than header length (unsupported).");
                    }
                    i3 = this.f8724OooOO0;
                    if (i3 != 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        long position = oooo000.getPosition();
                        j5 = this.f8725OooOO0O;
                        j6 = this.f8726OooOO0o;
                        j7 = (position + j5) - j6;
                        if (j5 != j6 && this.f8724OooOO0 == 1835365473) {
                            o000o001.OooOooO(8);
                            oooo000.OooO0O0(0, 8, o000o001.f34962OooO00o);
                            byte[] bArr = OooO0O0.f8749OooO00o;
                            i4 = o000o001.f34963OooO0O0;
                            o000o001.Oooo00o(4);
                            if (o000o001.OooO0o() != 1751411826) {
                                i4 += 4;
                            }
                            o000o001.Oooo00O(i4);
                            oooo000.OooOO0(o000o001.f34963OooO0O0);
                            oooo000.OooO0o0();
                        }
                        arrayDeque.push(new androidx.media3.extractor.mp4.OooO00o.C0156OooO00o(this.f8724OooOO0, j7));
                        if (this.f8725OooOO0O == this.f8726OooOO0o) {
                            OooOO0(j7);
                        } else {
                            this.f8715OooO = 0;
                            this.f8726OooOO0o = 0;
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
                            o00Oo0.OooO0Oo(z6);
                            if (this.f8725OooOO0O <= 2147483647L) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            o00Oo0.OooO0Oo(z7);
                            o000O000 o000o003 = new o000O000((int) this.f8725OooOO0O);
                            System.arraycopy(o000o002.f34962OooO00o, 0, o000o003.f34962OooO00o, 0, 8);
                            this.f8728OooOOO0 = o000o003;
                            z5 = true;
                            this.f8715OooO = 1;
                        } else {
                            long position2 = oooo000.getPosition();
                            j3 = this.f8726OooOO0o;
                            j4 = position2 - j3;
                            if (this.f8724OooOO0 == 1836086884) {
                                this.f8734OooOo = new MotionPhotoMetadata(0L, j4, -9223372036854775807L, j4 + j3, this.f8725OooOO0O - j3);
                            }
                            this.f8728OooOOO0 = null;
                            z5 = true;
                            this.f8715OooO = 1;
                        }
                    }
                    z8 = z5;
                } else if (oooo000.OooO0o(o000o002.f34962OooO00o, 0, 8, true)) {
                    this.f8726OooOO0o = 8;
                    o000o002.Oooo00O(0);
                    this.f8725OooOO0O = o000o002.OooOo0o();
                    this.f8724OooOO0 = o000o002.OooO0o();
                    j = this.f8725OooOO0O;
                    if (j == 1) {
                        oooo000.readFully(o000o002.f34962OooO00o, 8, 8);
                        this.f8726OooOO0o += 8;
                        this.f8725OooOO0O = o000o002.OooOoO();
                    } else if (j == 0) {
                        length = oooo000.getLength();
                        if (length == -1) {
                            length = c0156OooO00oPeek.f8745OooO0O0;
                        }
                        if (length != -1) {
                            this.f8725OooOO0O = (length - oooo000.getPosition()) + ((long) this.f8726OooOO0o);
                        }
                    }
                    j2 = this.f8725OooOO0O;
                    i2 = this.f8726OooOO0o;
                    if (j2 >= i2) {
                        throw ParserException.OooO0O0("Atom size less than header length (unsupported).");
                    }
                    i3 = this.f8724OooOO0;
                    if (i3 != 1836019574) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        long position3 = oooo000.getPosition();
                        j5 = this.f8725OooOO0O;
                        j6 = this.f8726OooOO0o;
                        j7 = (position3 + j5) - j6;
                        if (j5 != j6) {
                            o000o001.OooOooO(8);
                            oooo000.OooO0O0(0, 8, o000o001.f34962OooO00o);
                            byte[] bArr2 = OooO0O0.f8749OooO00o;
                            i4 = o000o001.f34963OooO0O0;
                            o000o001.Oooo00o(4);
                            if (o000o001.OooO0o() != 1751411826) {
                                i4 += 4;
                            }
                            o000o001.Oooo00O(i4);
                            oooo000.OooOO0(o000o001.f34963OooO0O0);
                            oooo000.OooO0o0();
                        }
                        arrayDeque.push(new androidx.media3.extractor.mp4.OooO00o.C0156OooO00o(this.f8724OooOO0, j7));
                        if (this.f8725OooOO0O == this.f8726OooOO0o) {
                            OooOO0(j7);
                        } else {
                            this.f8715OooO = 0;
                            this.f8726OooOO0o = 0;
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
                            o00Oo0.OooO0Oo(z6);
                            if (this.f8725OooOO0O <= 2147483647L) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            o00Oo0.OooO0Oo(z7);
                            o000O000 o000o004 = new o000O000((int) this.f8725OooOO0O);
                            System.arraycopy(o000o002.f34962OooO00o, 0, o000o004.f34962OooO00o, 0, 8);
                            this.f8728OooOOO0 = o000o004;
                            z5 = true;
                            this.f8715OooO = 1;
                        } else {
                            long position4 = oooo000.getPosition();
                            j3 = this.f8726OooOO0o;
                            j4 = position4 - j3;
                            if (this.f8724OooOO0 == 1836086884) {
                                this.f8734OooOo = new MotionPhotoMetadata(0L, j4, -9223372036854775807L, j4 + j3, this.f8725OooOO0O - j3);
                            }
                            this.f8728OooOOO0 = null;
                            z5 = true;
                            this.f8715OooO = 1;
                        }
                    }
                    z8 = z5;
                } else {
                    if (this.f8738OooOo0o == 2 && (this.f8716OooO00o & 2) != 0) {
                        TrackOutput trackOutputOooOOOO = this.f8731OooOOo.OooOOOO(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f8734OooOo;
                        Metadata metadata = motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata);
                        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
                        oooO00o.f6435OooO = metadata;
                        trackOutputOooOOOO.OooO0O0(new OooOO0(oooO00o));
                        this.f8731OooOOo.OooOO0O();
                        this.f8731OooOOo.OooO(new o000000.OooO0O0(-9223372036854775807L));
                    }
                    z8 = false;
                }
                if (!z8) {
                    return -1;
                }
            } else {
                if (i5 != 1) {
                    if (i5 == 2) {
                        long position5 = oooo000.getPosition();
                        if (this.f8727OooOOO == -1) {
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = 0;
                            boolean z9 = true;
                            boolean z10 = true;
                            long j8 = LongCompanionObject.MAX_VALUE;
                            long j9 = LongCompanionObject.MAX_VALUE;
                            long j10 = LongCompanionObject.MAX_VALUE;
                            while (true) {
                                OooO00o[] oooO00oArr = this.f8733OooOOoo;
                                if (i10 >= oooO00oArr.length) {
                                    break;
                                }
                                OooO00o oooO00o2 = oooO00oArr[i10];
                                int i11 = oooO00o2.f8743OooO0o0;
                                o0O000 o0o001 = oooO00o2.f8740OooO0O0;
                                if (i11 != o0o001.f35050OooO0O0) {
                                    long j11 = o0o001.f35051OooO0OO[i11];
                                    long[][] jArr = this.f8736OooOo00;
                                    int i12 = o00.f34910OooO00o;
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
                            this.f8727OooOOO = i8;
                            if (i8 == -1) {
                                return -1;
                            }
                        }
                        OooO00o oooO00o3 = this.f8733OooOOoo[this.f8727OooOOO];
                        TrackOutput trackOutput = oooO00o3.f8741OooO0OO;
                        int i13 = oooO00o3.f8743OooO0o0;
                        o0O000 o0o002 = oooO00o3.f8740OooO0O0;
                        long j14 = o0o002.f35051OooO0OO[i13];
                        int i14 = o0o002.f35052OooO0Oo[i13];
                        long j15 = (j14 - position5) + ((long) this.f8729OooOOOO);
                        if (j15 < 0 || j15 >= 262144) {
                            o000ooo2.f34713OooO00o = j14;
                            return 1;
                        }
                        Track track = oooO00o3.f8739OooO00o;
                        if (track.f8784OooO0oO == 1) {
                            j15 += 8;
                            i14 -= 8;
                        }
                        oooo000.OooOO0((int) j15);
                        int i15 = track.f8786OooOO0;
                        OooO0OO oooO0OO = oooO00o3.f8742OooO0Oo;
                        if (i15 == 0) {
                            if ("audio/ac4".equals(track.f8782OooO0o.f6412OooOOOO)) {
                                if (this.f8730OooOOOo == 0) {
                                    o000OOoO.OooO0O0.OooO00o(i14, o000o001);
                                    trackOutput.OooO0OO(7, o000o001);
                                    this.f8730OooOOOo += 7;
                                }
                                i14 += 7;
                            } else if (oooO0OO != null) {
                                oooO0OO.OooO0OO(oooo000);
                            }
                            while (true) {
                                int i16 = this.f8730OooOOOo;
                                if (i16 >= i14) {
                                    break;
                                }
                                int iOooO00o = trackOutput.OooO00o(oooo000, i14 - i16, false);
                                this.f8729OooOOOO += iOooO00o;
                                this.f8730OooOOOo += iOooO00o;
                                this.f8732OooOOo0 -= iOooO00o;
                            }
                        } else {
                            o000O000 o000o005 = this.f8718OooO0OO;
                            byte[] bArr3 = o000o005.f34962OooO00o;
                            bArr3[0] = 0;
                            bArr3[1] = 0;
                            bArr3[2] = 0;
                            int i17 = 4 - i15;
                            while (this.f8730OooOOOo < i14) {
                                int i18 = this.f8732OooOOo0;
                                if (i18 == 0) {
                                    oooo000.readFully(bArr3, i17, i15);
                                    this.f8729OooOOOO += i15;
                                    o000o005.Oooo00O(0);
                                    int iOooO0o = o000o005.OooO0o();
                                    if (iOooO0o < 0) {
                                        throw ParserException.OooO00o("Invalid NAL length", null);
                                    }
                                    this.f8732OooOOo0 = iOooO0o;
                                    o000O000 o000o006 = this.f8717OooO0O0;
                                    o000o006.Oooo00O(0);
                                    trackOutput.OooO0OO(4, o000o006);
                                    this.f8730OooOOOo += 4;
                                    i14 += i17;
                                } else {
                                    int iOooO00o2 = trackOutput.OooO00o(oooo000, i18, false);
                                    this.f8729OooOOOO += iOooO00o2;
                                    this.f8730OooOOOo += iOooO00o2;
                                    this.f8732OooOOo0 -= iOooO00o2;
                                }
                            }
                        }
                        long j16 = o0o002.f35053OooO0o[i13];
                        int i19 = o0o002.f35055OooO0oO[i13];
                        if (oooO0OO != null) {
                            oooO0OO.OooO0O0(trackOutput, j16, i19, i14, 0, null);
                            if (i13 + 1 == o0o002.f35050OooO0O0) {
                                oooO0OO.OooO00o(trackOutput, null);
                            }
                        } else {
                            trackOutput.OooO0o0(j16, i19, i14, 0, null);
                        }
                        oooO00o3.f8743OooO0o0++;
                        this.f8727OooOOO = -1;
                        this.f8729OooOOOO = 0;
                        this.f8730OooOOOo = 0;
                        this.f8732OooOOo0 = 0;
                        return 0;
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.f8723OooO0oo;
                    o0O0o o0o0o = this.f8722OooO0oO;
                    int i20 = o0o0o.f35083OooO0O0;
                    if (i20 == 0) {
                        long length2 = oooo000.getLength();
                        o000ooo2.f34713OooO00o = (length2 == -1 || length2 < 8) ? 0L : length2 - 8;
                        o0o0o.f35083OooO0O0 = 1;
                    } else if (i20 != 1) {
                        ArrayList arrayList2 = o0o0o.f35082OooO00o;
                        short s = 2816;
                        if (i20 == 2) {
                            long length3 = oooo000.getLength();
                            int i21 = (o0o0o.f35084OooO0OO - 12) - 8;
                            o000O000 o000o007 = new o000O000(i21);
                            oooo000.readFully(o000o007.f34962OooO00o, 0, i21);
                            int i22 = 0;
                            while (i22 < i21 / 12) {
                                o000o007.Oooo00o(2);
                                short sOooOO0O = o000o007.OooOO0O();
                                if (sOooOO0O != 2192 && sOooOO0O != s && sOooOO0O != 2817 && sOooOO0O != 2819) {
                                    if (sOooOO0O != 2820) {
                                        o000o007.Oooo00o(8);
                                    }
                                    i22++;
                                    s = 2816;
                                }
                                arrayList2.add(new o0O0o.OooO00o(o000o007.OooO(), (length3 - ((long) o0o0o.f35084OooO0OO)) - ((long) o000o007.OooO())));
                                i22++;
                                s = 2816;
                            }
                            if (arrayList2.isEmpty()) {
                                o000ooo2.f34713OooO00o = 0L;
                            } else {
                                o0o0o.f35083OooO0O0 = 3;
                                o000ooo2.f34713OooO00o = ((o0O0o.OooO00o) arrayList2.get(0)).f35085OooO00o;
                            }
                        } else {
                            if (i20 != 3) {
                                throw new IllegalStateException();
                            }
                            long position6 = oooo000.getPosition();
                            int length4 = (int) ((oooo000.getLength() - oooo000.getPosition()) - ((long) o0o0o.f35084OooO0OO));
                            o000O000 o000o008 = new o000O000(length4);
                            oooo000.readFully(o000o008.f34962OooO00o, 0, length4);
                            int i23 = 0;
                            while (i23 < arrayList2.size()) {
                                o0O0o.OooO00o oooO00o4 = (o0O0o.OooO00o) arrayList2.get(i23);
                                o000o008.Oooo00O((int) (oooO00o4.f35085OooO00o - position6));
                                o000o008.Oooo00o(i6);
                                int iOooO = o000o008.OooO();
                                switch (o000o008.OooOOoo(iOooO)) {
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
                                int i24 = oooO00o4.f35086OooO0O0 - (iOooO + 8);
                                if (c == 2192) {
                                    ArrayList arrayList3 = new ArrayList();
                                    List<String> listOooO00o = o0O0o.f35081OooO0o0.OooO00o(o000o008.OooOOoo(i24));
                                    for (int i25 = 0; i25 < listOooO00o.size(); i25++) {
                                        List<String> listOooO00o2 = o0O0o.f35080OooO0Oo.OooO00o(listOooO00o.get(i25));
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
                            o000ooo2.f34713OooO00o = 0L;
                        }
                    } else {
                        o000O000 o000o009 = new o000O000(8);
                        oooo000.readFully(o000o009.f34962OooO00o, 0, 8);
                        o0o0o.f35084OooO0OO = o000o009.OooO() + 8;
                        if (o000o009.OooO0o() != 1397048916) {
                            o000ooo2.f34713OooO00o = 0L;
                        } else {
                            o000ooo2.f34713OooO00o = oooo000.getPosition() - ((long) (o0o0o.f35084OooO0OO - 12));
                            o0o0o.f35083OooO0O0 = 2;
                        }
                    }
                    if (o000ooo2.f34713OooO00o != 0) {
                        return 1;
                    }
                    this.f8715OooO = 0;
                    this.f8726OooOO0o = 0;
                    return 1;
                }
                long j17 = this.f8725OooOO0O - ((long) this.f8726OooOO0o);
                long position7 = oooo000.getPosition() + j17;
                o000O000 o000o0010 = this.f8728OooOOO0;
                if (o000o0010 != null) {
                    oooo000.readFully(o000o0010.f34962OooO00o, this.f8726OooOO0o, (int) j17);
                    if (this.f8724OooOO0 == 1718909296) {
                        o000o0010.Oooo00O(8);
                        int iOooO0o2 = o000o0010.OooO0o();
                        int i26 = iOooO0o2 != 1751476579 ? iOooO0o2 != 1903435808 ? 0 : 1 : 2;
                        if (i26 == 0) {
                            o000o0010.Oooo00o(4);
                            do {
                                if (o000o0010.f34964OooO0OO - o000o0010.f34963OooO0O0 <= 0) {
                                    i26 = 0;
                                    break;
                                }
                                int iOooO0o3 = o000o0010.OooO0o();
                                i26 = iOooO0o3 != 1751476579 ? iOooO0o3 != 1903435808 ? 0 : 1 : 2;
                            } while (i26 == 0);
                        }
                        this.f8738OooOo0o = i26;
                    } else if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().f8746OooO0OO.add(new androidx.media3.extractor.mp4.OooO00o.OooO0O0(this.f8724OooOO0, o000o0010));
                    }
                } else {
                    if (j17 < 262144) {
                        oooo000.OooOO0((int) j17);
                    } else {
                        o000ooo2.f34713OooO00o = oooo000.getPosition() + j17;
                        z = true;
                    }
                    OooOO0(position7);
                    if (z || this.f8715OooO == 2) {
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

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f8720OooO0o.clear();
        this.f8726OooOO0o = 0;
        this.f8727OooOOO = -1;
        this.f8729OooOOOO = 0;
        this.f8730OooOOOo = 0;
        this.f8732OooOOo0 = 0;
        if (j == 0) {
            if (this.f8715OooO != 3) {
                this.f8715OooO = 0;
                this.f8726OooOO0o = 0;
                return;
            } else {
                o0O0o o0o0o = this.f8722OooO0oO;
                o0o0o.f35082OooO00o.clear();
                o0o0o.f35083OooO0O0 = 0;
                this.f8723OooO0oo.clear();
                return;
            }
        }
        for (OooO00o oooO00o : this.f8733OooOOoo) {
            o0O000 o0o001 = oooO00o.f8740OooO0O0;
            int iOooO0o = o00.OooO0o(o0o001.f35053OooO0o, j2, false);
            while (true) {
                if (iOooO0o < 0) {
                    iOooO0o = -1;
                    break;
                } else if ((o0o001.f35055OooO0oO[iOooO0o] & 1) != 0) {
                    break;
                } else {
                    iOooO0o--;
                }
            }
            if (iOooO0o == -1) {
                iOooO0o = o0o001.OooO00o(j2);
            }
            oooO00o.f8743OooO0o0 = iOooO0o;
            OooO0OO oooO0OO = oooO00o.f8742OooO0Oo;
            if (oooO0OO != null) {
                oooO0OO.f8366OooO0O0 = false;
                oooO0OO.f8367OooO0OO = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f8731OooOOo = oooo0;
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
    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        long jMin;
        long jMin2;
        long j2;
        long j3;
        int i;
        OooO00o[] oooO00oArr;
        o000000O o000000o2;
        o000000.OooO00o oooO00o;
        o0O000 o0o001;
        int iOooO0o;
        int iOooO0o2;
        int iOooO00o;
        long j4 = j;
        OooO00o[] oooO00oArr2 = this.f8733OooOOoo;
        int length = oooO00oArr2.length;
        o000000O o000000o3 = o000000O.f34701OooO0OO;
        if (length == 0) {
            return new o000000.OooO00o(o000000o3, o000000o3);
        }
        int i2 = this.f8735OooOo0;
        boolean z = false;
        int i3 = -1;
        if (i2 != -1) {
            o0O000 o0o002 = oooO00oArr2[i2].f8740OooO0O0;
            int iOooO0o3 = o00.OooO0o(o0o002.f35053OooO0o, j4, false);
            while (true) {
                if (iOooO0o3 < 0) {
                    iOooO0o3 = -1;
                    break;
                }
                if ((o0o002.f35055OooO0oO[iOooO0o3] & 1) != 0) {
                    break;
                }
                iOooO0o3--;
            }
            if (iOooO0o3 == -1) {
                iOooO0o3 = o0o002.OooO00o(j4);
            }
            if (iOooO0o3 == -1) {
                return new o000000.OooO00o(o000000o3, o000000o3);
            }
            long[] jArr = o0o002.f35053OooO0o;
            j2 = jArr[iOooO0o3];
            long[] jArr2 = o0o002.f35051OooO0OO;
            jMin = jArr2[iOooO0o3];
            if (j2 >= j4 || iOooO0o3 >= o0o002.f35050OooO0O0 - 1 || (iOooO00o = o0o002.OooO00o(j4)) == -1 || iOooO00o == iOooO0o3) {
                j4 = j2;
            } else {
                j3 = jArr[iOooO00o];
                jMin2 = jArr2[iOooO00o];
            }
            i = 0;
            while (true) {
                oooO00oArr = this.f8733OooOOoo;
                if (i < oooO00oArr.length) {
                    break;
                }
                if (i != this.f8735OooOo0) {
                    o0o001 = oooO00oArr[i].f8740OooO0O0;
                    iOooO0o = o00.OooO0o(o0o001.f35053OooO0o, j2, z);
                    while (true) {
                        if (iOooO0o >= 0) {
                            iOooO0o = i3;
                            break;
                        }
                        if ((o0o001.f35055OooO0oO[iOooO0o] & 1) != 0) {
                            break;
                        }
                        iOooO0o--;
                    }
                    if (iOooO0o == i3) {
                        iOooO0o = o0o001.OooO00o(j2);
                    }
                    if (iOooO0o != i3) {
                        jMin = Math.min(o0o001.f35051OooO0OO[iOooO0o], jMin);
                    }
                    if (j3 != -9223372036854775807L) {
                        iOooO0o2 = o00.OooO0o(o0o001.f35053OooO0o, j3, false);
                        while (true) {
                            if (iOooO0o2 >= 0) {
                                iOooO0o2 = -1;
                                break;
                            }
                            if ((o0o001.f35055OooO0oO[iOooO0o2] & 1) != 0) {
                                break;
                            }
                            iOooO0o2--;
                        }
                        if (iOooO0o2 == -1) {
                            iOooO0o2 = o0o001.OooO00o(j3);
                        }
                        if (iOooO0o2 == -1) {
                            jMin2 = Math.min(o0o001.f35051OooO0OO[iOooO0o2], jMin2);
                        }
                    }
                }
                i++;
                z = false;
                i3 = -1;
            }
            o000000o2 = new o000000O(j2, jMin);
            if (j3 == -9223372036854775807L) {
                oooO00o = new o000000.OooO00o(o000000o2, o000000o2);
            } else {
                oooO00o = new o000000.OooO00o(o000000o2, new o000000O(j3, jMin2));
            }
            return oooO00o;
        }
        jMin = LongCompanionObject.MAX_VALUE;
        jMin2 = -1;
        j2 = j4;
        j3 = -9223372036854775807L;
        i = 0;
        while (true) {
            oooO00oArr = this.f8733OooOOoo;
            if (i < oooO00oArr.length) {
                break;
                break;
            }
            if (i != this.f8735OooOo0) {
                o0o001 = oooO00oArr[i].f8740OooO0O0;
                iOooO0o = o00.OooO0o(o0o001.f35053OooO0o, j2, z);
                while (true) {
                    if (iOooO0o >= 0) {
                        iOooO0o = i3;
                        break;
                    }
                    if ((o0o001.f35055OooO0oO[iOooO0o] & 1) != 0) {
                        break;
                        break;
                    }
                    iOooO0o--;
                }
                if (iOooO0o == i3) {
                    iOooO0o = o0o001.OooO00o(j2);
                }
                if (iOooO0o != i3) {
                    jMin = Math.min(o0o001.f35051OooO0OO[iOooO0o], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    iOooO0o2 = o00.OooO0o(o0o001.f35053OooO0o, j3, false);
                    while (true) {
                        if (iOooO0o2 >= 0) {
                            iOooO0o2 = -1;
                            break;
                        }
                        if ((o0o001.f35055OooO0oO[iOooO0o2] & 1) != 0) {
                            break;
                            break;
                        }
                        iOooO0o2--;
                    }
                    if (iOooO0o2 == -1) {
                        iOooO0o2 = o0o001.OooO00o(j3);
                    }
                    if (iOooO0o2 == -1) {
                        jMin2 = Math.min(o0o001.f35051OooO0OO[iOooO0o2], jMin2);
                    }
                }
            }
            i++;
            z = false;
            i3 = -1;
        }
        o000000o2 = new o000000O(j2, jMin);
        if (j3 == -9223372036854775807L) {
            oooO00o = new o000000.OooO00o(o000000o2, o000000o2);
        } else {
            oooO00o = new o000000.OooO00o(o000000o2, new o000000O(j3, jMin2));
        }
        return oooO00o;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        return o0.OooO00o(oooo000, false, (this.f8716OooO00o & 2) != 0);
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x04d7  */
    public final void OooOO0(long j) throws ParserException {
        ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque;
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
        ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque2;
        ArrayList arrayList4;
        Metadata metadata9;
        Metadata metadata10;
        ArrayList arrayList5;
        Parcelable parcelableOooO0Oo;
        while (true) {
            ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque3 = this.f8720OooO0o;
            if (arrayDeque3.isEmpty() || arrayDeque3.peek().f8745OooO0O0 != j) {
                break;
            }
            androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00oPop = arrayDeque3.pop();
            if (c0156OooO00oPop.f8744OooO00o == 1836019574) {
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.f8738OooOo0o == 1;
                o00oO0o o00oo0o2 = new o00oO0o();
                androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0156OooO00oPop.OooO0OO(1969517665);
                int i6 = 1768715124;
                int i7 = 1751411826;
                int i8 = 1835365473;
                int i9 = 4;
                int i10 = 8;
                if (oooO0O0OooO0OO != null) {
                    byte[] bArr = OooO0O0.f8749OooO00o;
                    o000O000 o000o001 = oooO0O0OooO0OO.f8748OooO0O0;
                    o000o001.Oooo00O(8);
                    Metadata metadata11 = null;
                    metadata2 = null;
                    Metadata metadata12 = null;
                    while (true) {
                        int i11 = o000o001.f34964OooO0OO;
                        int i12 = i6;
                        int i13 = o000o001.f34963OooO0O0;
                        if (i11 - i13 < i10) {
                            break;
                        }
                        int iOooO0o = o000o001.OooO0o();
                        Metadata metadata13 = metadata11;
                        int iOooO0o2 = o000o001.OooO0o();
                        if (iOooO0o2 == i8) {
                            o000o001.Oooo00O(i13);
                            int i14 = i13 + iOooO0o;
                            o000o001.Oooo00o(i10);
                            int i15 = o000o001.f34963OooO0O0;
                            o000o001.Oooo00o(i9);
                            if (o000o001.OooO0o() != i7) {
                                i15 += 4;
                            }
                            o000o001.Oooo00O(i15);
                            int i16 = i12;
                            while (true) {
                                int i17 = o000o001.f34963OooO0O0;
                                if (i17 < i14) {
                                    int iOooO0o3 = o000o001.OooO0o();
                                    if (o000o001.OooO0o() == i16) {
                                        o000o001.Oooo00O(i17);
                                        int i18 = i17 + iOooO0o3;
                                        o000o001.Oooo00o(i10);
                                        ArrayList arrayList7 = new ArrayList();
                                        while (true) {
                                            int i19 = o000o001.f34963OooO0O0;
                                            if (i19 >= i18) {
                                                break;
                                            }
                                            int iOooO0o4 = o000o001.OooO0o() + i19;
                                            int iOooO0o5 = o000o001.OooO0o();
                                            int i20 = (iOooO0o5 >> 24) & 255;
                                            int i21 = i18;
                                            Metadata metadata14 = metadata12;
                                            ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque4 = arrayDeque3;
                                            if (i20 == 169 || i20 == 253) {
                                                arrayList5 = arrayList6;
                                                int i22 = 16777215 & iOooO0o5;
                                                if (i22 == 6516084) {
                                                    parcelableOooO0Oo = oo00oO.OooO00o(iOooO0o5, o000o001);
                                                } else if (i22 == 7233901 || i22 == 7631467) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TIT2");
                                                } else if (i22 == 6516589 || i22 == 7828084) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TCOM");
                                                } else if (i22 == 6578553) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TDRC");
                                                } else if (i22 == 4280916) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TPE1");
                                                } else if (i22 == 7630703) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TSSE");
                                                } else if (i22 == 6384738) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TALB");
                                                } else if (i22 == 7108978) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "USLT");
                                                } else if (i22 == 6776174) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TCON");
                                                } else if (i22 == 6779504) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TIT1");
                                                } else {
                                                    Log.OooO0O0("MetadataUtil", "Skipped unknown metadata entry: " + androidx.media3.extractor.mp4.OooO00o.OooO00o(iOooO0o5));
                                                    parcelableOooO0Oo = null;
                                                }
                                            } else if (iOooO0o5 == 1735291493) {
                                                try {
                                                    int iOooO0o6 = oo00oO.OooO0o(o000o001);
                                                    String str = (iOooO0o6 <= 0 || iOooO0o6 > 192) ? null : oo00oO.f35094OooO00o[iOooO0o6 - 1];
                                                    if (str != null) {
                                                        parcelableOooO0Oo = new TextInformationFrame("TCON", null, ImmutableList.OooOOOo(str));
                                                        arrayList5 = arrayList6;
                                                    } else {
                                                        Log.OooO0o("MetadataUtil", "Failed to parse standard genre code");
                                                        arrayList5 = arrayList6;
                                                        parcelableOooO0Oo = null;
                                                    }
                                                } catch (Throwable th) {
                                                    o000o001.Oooo00O(iOooO0o4);
                                                    throw th;
                                                }
                                            } else {
                                                String strOooOOo0 = null;
                                                if (iOooO0o5 == 1684632427) {
                                                    parcelableOooO0Oo = oo00oO.OooO0OO(iOooO0o5, o000o001, "TPOS");
                                                } else if (iOooO0o5 == 1953655662) {
                                                    parcelableOooO0Oo = oo00oO.OooO0OO(iOooO0o5, o000o001, "TRCK");
                                                } else if (iOooO0o5 == 1953329263) {
                                                    parcelableOooO0Oo = oo00oO.OooO0o0(iOooO0o5, "TBPM", o000o001, true, false);
                                                } else if (iOooO0o5 == 1668311404) {
                                                    parcelableOooO0Oo = oo00oO.OooO0o0(iOooO0o5, "TCMP", o000o001, true, true);
                                                } else if (iOooO0o5 == 1668249202) {
                                                    parcelableOooO0Oo = oo00oO.OooO0O0(o000o001);
                                                } else if (iOooO0o5 == 1631670868) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TPE2");
                                                } else if (iOooO0o5 == 1936682605) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TSOT");
                                                } else if (iOooO0o5 == 1936679276) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TSO2");
                                                } else if (iOooO0o5 == 1936679282) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TSOA");
                                                } else if (iOooO0o5 == 1936679265) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TSOP");
                                                } else if (iOooO0o5 == 1936679791) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TSOC");
                                                } else if (iOooO0o5 == 1920233063) {
                                                    parcelableOooO0Oo = oo00oO.OooO0o0(iOooO0o5, "ITUNESADVISORY", o000o001, false, false);
                                                } else if (iOooO0o5 == 1885823344) {
                                                    parcelableOooO0Oo = oo00oO.OooO0o0(iOooO0o5, "ITUNESGAPLESS", o000o001, false, true);
                                                } else if (iOooO0o5 == 1936683886) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TVSHOWSORT");
                                                } else if (iOooO0o5 == 1953919848) {
                                                    parcelableOooO0Oo = oo00oO.OooO0Oo(iOooO0o5, o000o001, "TVSHOW");
                                                } else if (iOooO0o5 == 757935405) {
                                                    int i23 = -1;
                                                    int i24 = -1;
                                                    String strOooOOo1 = null;
                                                    while (true) {
                                                        int i25 = o000o001.f34963OooO0O0;
                                                        if (i25 >= iOooO0o4) {
                                                            break;
                                                        }
                                                        int iOooO0o7 = o000o001.OooO0o();
                                                        int iOooO0o8 = o000o001.OooO0o();
                                                        ArrayList arrayList8 = arrayList6;
                                                        o000o001.Oooo00o(4);
                                                        if (iOooO0o8 == 1835360622) {
                                                            strOooOOo0 = o000o001.OooOOo0(iOooO0o7 - 12);
                                                        } else if (iOooO0o8 == 1851878757) {
                                                            strOooOOo1 = o000o001.OooOOo0(iOooO0o7 - 12);
                                                        } else {
                                                            if (iOooO0o8 == 1684108385) {
                                                                i24 = iOooO0o7;
                                                                i23 = i25;
                                                            }
                                                            o000o001.Oooo00o(iOooO0o7 - 12);
                                                        }
                                                        arrayList6 = arrayList8;
                                                    }
                                                    arrayList5 = arrayList6;
                                                    if (strOooOOo0 == null || strOooOOo1 == null || i23 == -1) {
                                                        parcelableOooO0Oo = null;
                                                    } else {
                                                        o000o001.Oooo00O(i23);
                                                        o000o001.Oooo00o(16);
                                                        parcelableOooO0Oo = new InternalFrame(strOooOOo0, strOooOOo1, o000o001.OooOOo0(i24 - 16));
                                                    }
                                                } else {
                                                    arrayList5 = arrayList6;
                                                    Log.OooO0O0("MetadataUtil", "Skipped unknown metadata entry: " + androidx.media3.extractor.mp4.OooO00o.OooO00o(iOooO0o5));
                                                    parcelableOooO0Oo = null;
                                                }
                                                arrayList5 = arrayList6;
                                            }
                                            o000o001.Oooo00O(iOooO0o4);
                                            if (parcelableOooO0Oo != null) {
                                                arrayList7.add(parcelableOooO0Oo);
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
                                    o000o001.Oooo00O(i17 + iOooO0o3);
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
                                o000o001.Oooo00O(i13);
                                int i26 = i13 + iOooO0o;
                                o000o001.Oooo00o(12);
                                while (true) {
                                    int i27 = o000o001.f34963OooO0O0;
                                    if (i27 < i26) {
                                        int iOooO0o9 = o000o001.OooO0o();
                                        if (o000o001.OooO0o() == 1935766900) {
                                            if (iOooO0o9 < 14) {
                                                break;
                                            }
                                            o000o001.Oooo00o(5);
                                            int iOooOo0O = o000o001.OooOo0O();
                                            if (iOooOo0O == 12 || iOooOo0O == 13) {
                                                float f = iOooOo0O == 12 ? 240.0f : 120.0f;
                                                o000o001.Oooo00o(1);
                                                metadata11 = new Metadata(new SmtaMetadataEntry(f, o000o001.OooOo0O()));
                                                break;
                                            }
                                        } else {
                                            o000o001.Oooo00O(i27 + iOooO0o9);
                                        }
                                    }
                                    metadata11 = null;
                                    break;
                                }
                                metadata12 = metadata9;
                            } else if (iOooO0o2 == -1451722374) {
                                short sOooOOo = o000o001.OooOOo();
                                o000o001.Oooo00o(2);
                                String strOooOOoo = o000o001.OooOOoo(sOooOOo);
                                int iMax = Math.max(strOooOOoo.lastIndexOf(43), strOooOOoo.lastIndexOf(45));
                                try {
                                    metadata12 = new Metadata(new Mp4LocationData(Float.parseFloat(strOooOOoo.substring(0, iMax)), Float.parseFloat(strOooOOoo.substring(iMax, strOooOOoo.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    metadata12 = null;
                                }
                                metadata11 = metadata13;
                            }
                            o000o001.Oooo00O(i13 + iOooO0o);
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
                        o000o001.Oooo00O(i13 + iOooO0o);
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
                        o00oo0o2.OooO0O0(metadata2);
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
                androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00oOooO0O0 = c0156OooO00oPop.OooO0O0(i8);
                if (c0156OooO00oOooO0O0 != null) {
                    byte[] bArr2 = OooO0O0.f8749OooO00o;
                    androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0156OooO00oOooO0O0.OooO0OO(1751411826);
                    androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0156OooO00oOooO0O0.OooO0OO(1801812339);
                    androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0156OooO00oOooO0O0.OooO0OO(1768715124);
                    if (oooO0O0OooO0OO2 == null || oooO0O0OooO0OO3 == null || oooO0O0OooO0OO4 == null) {
                        metadata4 = metadata2;
                        metadata5 = null;
                    } else {
                        o000O000 o000o002 = oooO0O0OooO0OO2.f8748OooO0O0;
                        o000o002.Oooo00O(16);
                        if (o000o002.OooO0o() != 1835299937) {
                            metadata4 = metadata2;
                        } else {
                            o000O000 o000o003 = oooO0O0OooO0OO3.f8748OooO0O0;
                            o000o003.Oooo00O(12);
                            int iOooO0o10 = o000o003.OooO0o();
                            String[] strArr2 = new String[iOooO0o10];
                            for (int i28 = 0; i28 < iOooO0o10; i28++) {
                                int iOooO0o11 = o000o003.OooO0o();
                                o000o003.Oooo00o(4);
                                strArr2[i28] = o000o003.OooOOoo(iOooO0o11 - 8);
                            }
                            int i29 = 8;
                            o000O000 o000o004 = oooO0O0OooO0OO4.f8748OooO0O0;
                            o000o004.Oooo00O(8);
                            ArrayList arrayList9 = new ArrayList();
                            while (true) {
                                int i30 = o000o004.f34964OooO0OO;
                                int i31 = o000o004.f34963OooO0O0;
                                if (i30 - i31 <= i29) {
                                    break;
                                }
                                int iOooO0o12 = o000o004.OooO0o();
                                int iOooO0o13 = o000o004.OooO0o() - 1;
                                if (iOooO0o13 < 0 || iOooO0o13 >= iOooO0o10) {
                                    i5 = iOooO0o10;
                                    strArr = strArr2;
                                    metadata2 = metadata2;
                                    p070o000O0o.Oooo000.OooO00o("Skipped metadata with unknown key index: ", iOooO0o13, "AtomParsers");
                                } else {
                                    String str2 = strArr2[iOooO0o13];
                                    int i32 = i31 + iOooO0o12;
                                    while (true) {
                                        int i33 = o000o004.f34963OooO0O0;
                                        if (i33 >= i32) {
                                            i5 = iOooO0o10;
                                            strArr = strArr2;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iOooO0o14 = o000o004.OooO0o();
                                        i5 = iOooO0o10;
                                        strArr = strArr2;
                                        if (o000o004.OooO0o() == 1684108385) {
                                            int iOooO0o15 = o000o004.OooO0o();
                                            int iOooO0o16 = o000o004.OooO0o();
                                            int i34 = iOooO0o14 - 16;
                                            byte[] bArr3 = new byte[i34];
                                            o000o004.OooO0Oo(0, i34, bArr3);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(bArr3, iOooO0o16, iOooO0o15, str2);
                                            break;
                                        }
                                        o000o004.Oooo00O(i33 + iOooO0o14);
                                        iOooO0o10 = i5;
                                        strArr2 = strArr;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList9.add(mdtaMetadataEntry);
                                    }
                                }
                                o000o004.Oooo00O(i31 + iOooO0o12);
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
                androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0156OooO00oPop.OooO0OO(1836476516);
                oooO0O0OooO0OO5.getClass();
                OooO0O0.OooO0OO OooO0OO2 = OooO0O0.OooO0OO(oooO0O0OooO0OO5.f8748OooO0O0);
                int size = -1;
                ArrayList arrayListOooO0o = OooO0O0.OooO0o(c0156OooO00oPop, o00oo0o2, -9223372036854775807L, null, (this.f8716OooO00o & 1) != 0, z, new OooO0o());
                int size2 = arrayListOooO0o.size();
                int i35 = 0;
                int i36 = -1;
                long j2 = -9223372036854775807L;
                while (i35 < size2) {
                    o0O000 o0o001 = (o0O000) arrayListOooO0o.get(i35);
                    if (o0o001.f35050OooO0O0 == 0) {
                        metadata7 = metadata5;
                        arrayList2 = arrayListOooO0o;
                        i = size2;
                        arrayList3 = arrayList;
                    } else {
                        Track track = o0o001.f35049OooO00o;
                        ArrayList arrayList10 = arrayListOooO0o;
                        int i37 = size2;
                        long j3 = track.f8783OooO0o0;
                        if (j3 == -9223372036854775807L) {
                            j3 = o0o001.f35056OooO0oo;
                        }
                        long jMax = Math.max(j2, j3);
                        Oooo0 oooo0 = this.f8731OooOOo;
                        arrayList2 = arrayList10;
                        int i38 = track.f8779OooO0O0;
                        OooO00o oooO00o = new OooO00o(track, o0o001, oooo0.OooOOOO(i35, i38));
                        OooOO0 oooOO1 = track.f8782OooO0o;
                        i = i37;
                        boolean zEquals = "audio/true-hd".equals(oooOO1.f6412OooOOOO);
                        int i39 = o0o001.f35054OooO0o0;
                        int i40 = zEquals ? i39 * 16 : i39 + 30;
                        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(oooOO1);
                        oooO00o2.f6446OooOO0o = i40;
                        if (i38 == 2 && j3 > 0 && (i4 = o0o001.f35050OooO0O0) > 1) {
                            oooO00o2.f6451OooOOo = i4 / (j3 / 1000000.0f);
                        }
                        if (i38 == 1) {
                            int i41 = o00oo0o2.f34718OooO00o;
                            if ((i41 == -1 || o00oo0o2.f34719OooO0O0 == -1) ? false : true) {
                                oooO00o2.f6461OooOoOO = i41;
                                oooO00o2.f6463OooOoo0 = o00oo0o2.f34719OooO0O0;
                            }
                        }
                        Metadata[] metadataArr = new Metadata[4];
                        metadataArr[0] = metadata;
                        ArrayList arrayList11 = this.f8723OooO0oo;
                        if (arrayList11.isEmpty()) {
                            i2 = 1;
                            metadata6 = null;
                        } else {
                            metadata6 = new Metadata(arrayList11);
                            i2 = 1;
                        }
                        metadataArr[i2] = metadata6;
                        metadataArr[2] = metadata3;
                        metadataArr[3] = OooO0OO2.f8767OooO00o;
                        Metadata metadata17 = new Metadata(new Metadata.Entry[0]);
                        if (i38 == i2 && metadata4 != null) {
                            metadata17 = metadata4;
                        }
                        if (metadata5 != null) {
                            int i42 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr = metadata5.f6336OooO0Oo;
                                if (i42 >= entryArr.length) {
                                    break;
                                }
                                Metadata.Entry entry = entryArr[i42];
                                if (entry instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                    metadata8 = metadata5;
                                    if (!mdtaMetadataEntry2.f6948OooO0Oo.equals("com.android.capture.fps")) {
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
                                metadata17 = metadata17.OooO00o(metadata18.f6336OooO0Oo);
                            }
                        }
                        if (metadata17.f6336OooO0Oo.length > 0) {
                            oooO00o2.f6435OooO = metadata17;
                        }
                        oooO00o.f8741OooO0OO.OooO0O0(new OooOO0(oooO00o2));
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
                this.f8735OooOo0 = size;
                this.f8737OooOo0O = j2;
                OooO00o[] oooO00oArr = (OooO00o[]) arrayList.toArray(new OooO00o[0]);
                this.f8733OooOOoo = oooO00oArr;
                long[][] jArr = new long[oooO00oArr.length][];
                int[] iArr = new int[oooO00oArr.length];
                long[] jArr2 = new long[oooO00oArr.length];
                boolean[] zArr = new boolean[oooO00oArr.length];
                for (int i44 = 0; i44 < oooO00oArr.length; i44++) {
                    jArr[i44] = new long[oooO00oArr[i44].f8740OooO0O0.f35050OooO0O0];
                    jArr2[i44] = oooO00oArr[i44].f8740OooO0O0.f35053OooO0o[0];
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
                    o0O000 o0o002 = oooO00oArr[i46].f8740OooO0O0;
                    j4 += (long) o0o002.f35052OooO0Oo[i48];
                    int i49 = i48 + 1;
                    iArr[i46] = i49;
                    if (i49 < jArr3.length) {
                        jArr2[i46] = o0o002.f35053OooO0o[i49];
                    } else {
                        zArr[i46] = true;
                        i45++;
                    }
                }
                this.f8736OooOo00 = jArr;
                this.f8731OooOOo.OooOO0O();
                this.f8731OooOOo.OooO(this);
                arrayDeque.clear();
                this.f8715OooO = 2;
            } else if (!arrayDeque3.isEmpty()) {
                arrayDeque3.peek().f8747OooO0Oo.add(c0156OooO00oPop);
            }
        }
        if (this.f8715OooO != 2) {
            this.f8715OooO = 0;
            this.f8726OooOO0o = 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    public Mp4Extractor(int i) {
        this.f8716OooO00o = 0;
        this.f8715OooO = 0;
        this.f8722OooO0oO = new o0O0o();
        this.f8723OooO0oo = new ArrayList();
        this.f8721OooO0o0 = new o000O000(16);
        this.f8720OooO0o = new ArrayDeque<>();
        this.f8717OooO0O0 = new o000O000(p070o000O0o.Oooo0.f34301OooO00o);
        this.f8718OooO0OO = new o000O000(4);
        this.f8719OooO0Oo = new o000O000();
        this.f8727OooOOO = -1;
        this.f8731OooOOo = Oooo0.f34692OooO0OO;
        this.f8733OooOOoo = new OooO00o[0];
    }
}
