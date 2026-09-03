package com.google.android.exoplayer2.extractor.mp3;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.OooOOO;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.OooO0O0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p293o0O0Oo0O.o0ooOOo;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OOO0o;
import p296o0O0OoO0.o0OoOo0;
import p298o0O0Ooo.o00oO0o;
import p298o0O0Ooo.o0Oo0oo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp3Extractor implements Extractor {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final OooOOO f13898OooOo0 = OooOOO.f12693OooO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TrackOutput f13899OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f13900OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f13901OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f13902OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0ooOOo.OooO00o f13903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f13904OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p296o0O0OoO0.o0ooOOo f13905OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f13906OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0OoOo0 f13907OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TrackOutput f13908OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13909OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Metadata f13910OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f13911OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f13912OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f13913OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13914OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f13915OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO00o f13916OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f13917OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13918OooOo00;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    public static long OooO0OO(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int length = metadata.f14442Oooo0o.length;
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.f14442Oooo0o[i];
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f14506Oooo0o.equals("TLEN")) {
                    return C.OooO00o(Long.parseLong(textInformationFrame.f14518Oooo0oo));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f13907OooO0oo = o0oooo1;
        TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(0);
        this.f13899OooO = trackOutputOooO00o;
        this.f13908OooOO0 = trackOutputOooO00o;
        this.f13907OooO0oo.OooOOO0();
    }

    public final long OooO00o(long j) {
        return ((j * 1000000) / ((long) this.f13903OooO0Oo.f35817OooO0Oo)) + this.f13912OooOOO0;
    }

    public final OooO00o OooO0O0(o000oOoO o000oooo2) throws IOException {
        o000oooo2.OooOOO0(this.f13902OooO0OO.f36661OooO00o, 0, 4);
        this.f13902OooO0OO.OooOoOO(0);
        this.f13903OooO0Oo.OooO00o(this.f13902OooO0OO.OooO0Oo());
        return new o00oO0o(o000oooo2.OooO00o(), o000oooo2.getPosition(), this.f13903OooO0Oo);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        this.f13909OooOO0O = 0;
        this.f13912OooOOO0 = -9223372036854775807L;
        this.f13911OooOOO = 0L;
        this.f13914OooOOOo = 0;
        this.f13918OooOo00 = j2;
        OooO00o oooO00o = this.f13916OooOOo0;
        if (!(oooO00o instanceof p298o0O0Ooo.o0ooOOo) || ((p298o0O0Ooo.o0ooOOo) oooO00o).OooO0Oo(j2)) {
            return;
        }
        this.f13917OooOOoo = true;
        this.f13908OooOO0 = this.f13906OooO0oO;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        return OooO0oo(o000oooo2, true);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x035b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0366  */
    /* JADX WARN: Code duplicated, block: B:158:0x0382  */
    /* JADX WARN: Code duplicated, block: B:159:0x0384  */
    /* JADX WARN: Code duplicated, block: B:181:0x0411  */
    /* JADX WARN: Code duplicated, block: B:183:0x041d  */
    /* JADX WARN: Code duplicated, block: B:184:0x041f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0426  */
    /* JADX WARN: Code duplicated, block: B:187:0x0428  */
    /* JADX WARN: Code duplicated, block: B:195:0x0462  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        Mp3Extractor mp3Extractor;
        int i;
        int i2;
        long jOooO00o;
        o000oOoO o000oooo3;
        int iOooO0O0;
        int i3;
        int i4;
        int iOooO0Oo;
        boolean z;
        int iOooO0Oo2;
        OooO00o oooO00oOooO0O0;
        int iOooOo00;
        p298o0O0Ooo.o0OO00O o0oo00o3;
        p298o0O0Ooo.o0OOO0o o0ooo0o2;
        long jOooO0OO;
        int iOooOOo0;
        o00000O0.OooO0o(this.f13899OooO);
        int i5 = o000OOo0.f36740OooO00o;
        if (this.f13909OooOO0O == 0) {
            try {
                OooO0oo(o000oooo2, false);
            } catch (EOFException unused) {
                mp3Extractor = this;
                i = -1;
                i2 = -1;
            }
        }
        if (this.f13916OooOOo0 != null) {
            mp3Extractor = this;
            if (mp3Extractor.f13913OooOOOO != 0) {
                long position = o000oooo2.getPosition();
                long j = mp3Extractor.f13913OooOOOO;
                if (position < j) {
                    int i6 = (int) (j - position);
                    o000oooo3 = o000oooo2;
                    o000oooo3.OooOO0(i6);
                }
            }
            if (mp3Extractor.f13914OooOOOo == 0) {
                o000oooo2.OooO();
                if (OooO0oO(o000oooo2)) {
                    i4 = -1;
                } else {
                    mp3Extractor.f13902OooO0OO.OooOoOO(0);
                    iOooO0Oo = mp3Extractor.f13902OooO0OO.OooO0Oo();
                    if (((-128000) & iOooO0Oo) == (((long) mp3Extractor.f13909OooOO0O) & (-128000))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || o0ooOOo.OooO00o(iOooO0Oo) == -1) {
                        o000oooo3.OooOO0(1);
                        mp3Extractor.f13909OooOO0O = 0;
                    } else {
                        mp3Extractor.f13903OooO0Oo.OooO00o(iOooO0Oo);
                        if (mp3Extractor.f13912OooOOO0 == -9223372036854775807L) {
                            mp3Extractor.f13912OooOOO0 = mp3Extractor.f13916OooOOo0.OooO0OO(o000oooo2.getPosition());
                            if (mp3Extractor.f13901OooO0O0 != -9223372036854775807L) {
                                mp3Extractor.f13912OooOOO0 = (mp3Extractor.f13901OooO0O0 - mp3Extractor.f13916OooOOo0.OooO0OO(0L)) + mp3Extractor.f13912OooOOO0;
                            }
                        }
                        o0ooOOo.OooO00o oooO00o = mp3Extractor.f13903OooO0Oo;
                        mp3Extractor.f13914OooOOOo = oooO00o.f35816OooO0OO;
                        OooO00o oooO00o2 = mp3Extractor.f13916OooOOo0;
                        if (oooO00o2 instanceof p298o0O0Ooo.o0ooOOo) {
                            p298o0O0Ooo.o0ooOOo o0ooooo2 = (p298o0O0Ooo.o0ooOOo) oooO00o2;
                            long jOooO00o2 = mp3Extractor.OooO00o(mp3Extractor.f13911OooOOO + ((long) oooO00o.f35820OooO0oO));
                            long position2 = o000oooo2.getPosition() + ((long) mp3Extractor.f13903OooO0Oo.f35816OooO0OO);
                            if (!o0ooooo2.OooO0Oo(jOooO00o2)) {
                                o0ooooo2.f35978OooO0O0.OooO00o(jOooO00o2);
                                o0ooooo2.f35979OooO0OO.OooO00o(position2);
                            }
                            if (mp3Extractor.f13917OooOOoo && o0ooooo2.OooO0Oo(mp3Extractor.f13918OooOo00)) {
                                mp3Extractor.f13917OooOOoo = false;
                                mp3Extractor.f13908OooOO0 = mp3Extractor.f13899OooO;
                            }
                        }
                        iOooO0O0 = mp3Extractor.f13908OooOO0.OooO0O0(o000oooo3, mp3Extractor.f13914OooOOOo, true);
                        if (iOooO0O0 == -1) {
                            i4 = -1;
                        } else {
                            i3 = mp3Extractor.f13914OooOOOo - iOooO0O0;
                            mp3Extractor.f13914OooOOOo = i3;
                            if (i3 <= 0) {
                                mp3Extractor.f13908OooOO0.OooO0Oo(mp3Extractor.OooO00o(mp3Extractor.f13911OooOOO), 1, mp3Extractor.f13903OooO0Oo.f35816OooO0OO, 0, null);
                                mp3Extractor.f13911OooOOO += (long) mp3Extractor.f13903OooO0Oo.f35820OooO0oO;
                                mp3Extractor.f13914OooOOOo = 0;
                            }
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
                i = -1;
            } else {
                iOooO0O0 = mp3Extractor.f13908OooOO0.OooO0O0(o000oooo3, mp3Extractor.f13914OooOOOo, true);
                if (iOooO0O0 == -1) {
                    i4 = -1;
                } else {
                    i3 = mp3Extractor.f13914OooOOOo - iOooO0O0;
                    mp3Extractor.f13914OooOOOo = i3;
                    if (i3 <= 0) {
                        mp3Extractor.f13908OooOO0.OooO0Oo(mp3Extractor.OooO00o(mp3Extractor.f13911OooOOO), 1, mp3Extractor.f13903OooO0Oo.f35816OooO0OO, 0, null);
                        mp3Extractor.f13911OooOOO += (long) mp3Extractor.f13903OooO0Oo.f35820OooO0oO;
                        mp3Extractor.f13914OooOOOo = 0;
                    }
                    i4 = 0;
                }
                i2 = i4;
                i = -1;
            }
            if (i2 == i && (mp3Extractor.f13916OooOOo0 instanceof p298o0O0Ooo.o0ooOOo)) {
                jOooO00o = mp3Extractor.OooO00o(mp3Extractor.f13911OooOOO);
                if (mp3Extractor.f13916OooOOo0.OooO0oo() != jOooO00o) {
                    OooO00o oooO00o3 = mp3Extractor.f13916OooOOo0;
                    ((p298o0O0Ooo.o0ooOOo) oooO00o3).f35980OooO0Oo = jOooO00o;
                    mp3Extractor.f13907OooO0oo.OooOO0O(oooO00o3);
                }
            }
            return i2;
        }
        o000 o000Var = new o000(this.f13903OooO0Oo.f35816OooO0OO);
        o000oooo2.OooOOO0(o000Var.f36661OooO00o, 0, this.f13903OooO0Oo.f35816OooO0OO);
        o0ooOOo.OooO00o oooO00o4 = this.f13903OooO0Oo;
        int i7 = 21;
        if ((oooO00o4.f35814OooO00o & 1) != 0) {
            if (oooO00o4.f35819OooO0o0 != 1) {
                i7 = 36;
            }
        } else if (oooO00o4.f35819OooO0o0 == 1) {
            i7 = 13;
        }
        if (o000Var.f36663OooO0OO >= i7 + 4) {
            o000Var.OooOoOO(i7);
            iOooO0Oo2 = o000Var.OooO0Oo();
            if (iOooO0Oo2 != 1483304551 && iOooO0Oo2 != 1231971951) {
                if (o000Var.f36663OooO0OO >= 40) {
                    o000Var.OooOoOO(36);
                    if (o000Var.OooO0Oo() == 1447187017) {
                        iOooO0Oo2 = 1447187017;
                    } else {
                        iOooO0Oo2 = 0;
                    }
                } else {
                    iOooO0Oo2 = 0;
                }
            }
        } else if (o000Var.f36663OooO0OO >= 40) {
            o000Var.OooOoOO(36);
            if (o000Var.OooO0Oo() == 1447187017) {
                iOooO0Oo2 = 1447187017;
            } else {
                iOooO0Oo2 = 0;
            }
        } else {
            iOooO0Oo2 = 0;
        }
        long jOooO00o3 = -1;
        if (iOooO0Oo2 == 1483304551 || iOooO0Oo2 == 1231971951) {
            mp3Extractor = this;
            long jOooO00o4 = o000oooo2.OooO00o();
            long position3 = o000oooo2.getPosition();
            o0ooOOo.OooO00o oooO00o5 = mp3Extractor.f13903OooO0Oo;
            int i8 = oooO00o5.f35820OooO0oO;
            int i9 = oooO00o5.f35817OooO0Oo;
            int iOooO0Oo3 = o000Var.OooO0Oo();
            if ((iOooO0Oo3 & 1) != 1 || (iOooOo00 = o000Var.OooOo00()) == 0) {
                oooO00oOooO0O0 = null;
            } else {
                long jOooOooo = o000OOo0.OooOooo(iOooOo00, ((long) i8) * 1000000, i9);
                if ((iOooO0Oo3 & 6) != 6) {
                    o0oo00o3 = new p298o0O0Ooo.o0OO00O(position3, oooO00o5.f35816OooO0OO, jOooOooo, -1L, null);
                } else {
                    long jOooOOo = o000Var.OooOOo();
                    long[] jArr = new long[100];
                    for (int i10 = 0; i10 < 100; i10++) {
                        jArr[i10] = o000Var.OooOOo0();
                    }
                    if (jOooO00o4 != -1) {
                        long j2 = position3 + jOooOOo;
                        if (jOooO00o4 != j2) {
                            StringBuilder sb = new StringBuilder(67);
                            sb.append("XING data size mismatch: ");
                            sb.append(jOooO00o4);
                            sb.append(", ");
                            sb.append(j2);
                            Log.w("XingSeeker", sb.toString());
                        }
                    }
                    o0oo00o3 = new p298o0O0Ooo.o0OO00O(position3, oooO00o5.f35816OooO0OO, jOooOooo, jOooOOo, jArr);
                }
                oooO00oOooO0O0 = o0oo00o3;
            }
            if (oooO00oOooO0O0 != null) {
                p296o0O0OoO0.o0ooOOo o0ooooo3 = mp3Extractor.f13905OooO0o0;
                if (!((o0ooooo3.f35937OooO00o == -1 || o0ooooo3.f35938OooO0O0 == -1) ? false : true)) {
                    o000oooo2.OooO();
                    o000oooo2.OooO0o0(i7 + ZegoConstants.RoomError.SessionError);
                    o000oooo2.OooOOO0(mp3Extractor.f13902OooO0OO.f36661OooO00o, 0, 3);
                    mp3Extractor.f13902OooO0OO.OooOoOO(0);
                    p296o0O0OoO0.o0ooOOo o0ooooo4 = mp3Extractor.f13905OooO0o0;
                    int iOooOOoo = mp3Extractor.f13902OooO0OO.OooOOoo();
                    Objects.requireNonNull(o0ooooo4);
                    int i11 = iOooOOoo >> 12;
                    int i12 = iOooOOoo & 4095;
                    if (i11 > 0 || i12 > 0) {
                        o0ooooo4.f35937OooO00o = i11;
                        o0ooooo4.f35938OooO0O0 = i12;
                    }
                }
            }
            o000oooo2.OooOO0(mp3Extractor.f13903OooO0Oo.f35816OooO0OO);
            if (oooO00oOooO0O0 != null && !oooO00oOooO0O0.OooO0O0() && iOooO0Oo2 == 1231971951) {
                oooO00oOooO0O0 = OooO0O0(o000oooo2);
            }
        } else if (iOooO0Oo2 == 1447187017) {
            long jOooO00o5 = o000oooo2.OooO00o();
            long position4 = o000oooo2.getPosition();
            o0ooOOo.OooO00o oooO00o6 = this.f13903OooO0Oo;
            o000Var.OooOoo0(10);
            int iOooO0Oo4 = o000Var.OooO0Oo();
            if (iOooO0Oo4 <= 0) {
                oooO00oOooO0O0 = null;
                break;
            }
            int i13 = oooO00o6.f35817OooO0Oo;
            long jOooOooo2 = o000OOo0.OooOooo(iOooO0Oo4, ((long) (i13 >= 32000 ? 1152 : 576)) * 1000000, i13);
            int iOooOo0O = o000Var.OooOo0O();
            int iOooOo0O2 = o000Var.OooOo0O();
            int iOooOo0O3 = o000Var.OooOo0O();
            o000Var.OooOoo0(2);
            long j3 = ((long) oooO00o6.f35816OooO0OO) + position4;
            long[] jArr2 = new long[iOooOo0O];
            long[] jArr3 = new long[iOooOo0O];
            long j4 = position4;
            int i14 = 0;
            while (true) {
                if (i14 >= iOooOo0O) {
                    long[] jArr4 = jArr3;
                    if (jOooO00o5 != -1 && jOooO00o5 != j4) {
                        StringBuilder sb2 = new StringBuilder(67);
                        sb2.append("VBRI data size mismatch: ");
                        sb2.append(jOooO00o5);
                        sb2.append(", ");
                        sb2.append(j4);
                        Log.w("VbriSeeker", sb2.toString());
                    }
                    oooO00oOooO0O0 = new o0Oo0oo(jArr2, jArr4, jOooOooo2, j4);
                    break;
                }
                long[] jArr5 = jArr3;
                jArr2[i14] = (((long) i14) * jOooOooo2) / ((long) iOooOo0O);
                jArr5[i14] = Math.max(j4, j3);
                if (iOooOo0O3 == 1) {
                    iOooOOo0 = o000Var.OooOOo0();
                } else if (iOooOo0O3 == 2) {
                    iOooOOo0 = o000Var.OooOo0O();
                } else if (iOooOo0O3 == 3) {
                    iOooOOo0 = o000Var.OooOOoo();
                } else {
                    if (iOooOo0O3 != 4) {
                        oooO00oOooO0O0 = null;
                        break;
                    }
                    iOooOOo0 = o000Var.OooOo00();
                }
                j4 += (long) (iOooOOo0 * iOooOo0O2);
                i14++;
                jArr3 = jArr5;
            }
            mp3Extractor = this;
            o000oooo2.OooOO0(mp3Extractor.f13903OooO0Oo.f35816OooO0OO);
        } else {
            mp3Extractor = this;
            o000oooo2.OooO();
            oooO00oOooO0O0 = null;
        }
        Metadata metadata = mp3Extractor.f13910OooOO0o;
        long position5 = o000oooo2.getPosition();
        if (metadata == null) {
            o0ooo0o2 = null;
            break;
        }
        int length = metadata.f14442Oooo0o.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                o0ooo0o2 = null;
                break;
            }
            Metadata.Entry entry = metadata.f14442Oooo0o[i15];
            if (entry instanceof MlltFrame) {
                MlltFrame mlltFrame = (MlltFrame) entry;
                long jOooO0OO2 = OooO0OO(metadata);
                int length2 = mlltFrame.f14514OoooO00.length;
                int i16 = length2 + 1;
                long[] jArr6 = new long[i16];
                long[] jArr7 = new long[i16];
                jArr6[0] = position5;
                jArr7[0] = 0;
                long j5 = 0;
                int i17 = 1;
                while (i17 <= length2) {
                    int i18 = i17 - 1;
                    position5 += (long) (mlltFrame.f14512Oooo0oo + mlltFrame.f14514OoooO00[i18]);
                    j5 += (long) (mlltFrame.f14510Oooo + mlltFrame.f14513OoooO0[i18]);
                    jArr6[i17] = position5;
                    jArr7[i17] = j5;
                    i17++;
                    length2 = length2;
                }
                o0ooo0o2 = new p298o0O0Ooo.o0OOO0o(jArr6, jArr7, jOooO0OO2);
                break;
            }
            i15++;
        }
        if (mp3Extractor.f13915OooOOo) {
            oooO00oOooO0O0 = new OooO00o.C0099OooO00o();
        } else {
            if ((mp3Extractor.f13900OooO00o & 2) != 0) {
                if (o0ooo0o2 != null) {
                    jOooO0OO = o0ooo0o2.f35972OooO0OO;
                } else if (oooO00oOooO0O0 != null) {
                    jOooO0OO = oooO00oOooO0O0.OooO0oo();
                    jOooO00o3 = oooO00oOooO0O0.OooO00o();
                } else {
                    jOooO0OO = OooO0OO(mp3Extractor.f13910OooOO0o);
                }
                oooO00oOooO0O0 = new p298o0O0Ooo.o0ooOOo(jOooO0OO, o000oooo2.getPosition(), jOooO00o3);
            } else if (o0ooo0o2 != null) {
                oooO00oOooO0O0 = o0ooo0o2;
            } else if (oooO00oOooO0O0 == null) {
                oooO00oOooO0O0 = null;
            }
            if (oooO00oOooO0O0 == null || (!oooO00oOooO0O0.OooO0O0() && (mp3Extractor.f13900OooO00o & 1) != 0)) {
                oooO00oOooO0O0 = OooO0O0(o000oooo2);
            }
        }
        mp3Extractor.f13916OooOOo0 = oooO00oOooO0O0;
        mp3Extractor.f13907OooO0oo.OooOO0O(oooO00oOooO0O0);
        TrackOutput trackOutput = mp3Extractor.f13908OooOO0;
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        o0ooOOo.OooO00o oooO00o7 = mp3Extractor.f13903OooO0Oo;
        oooO0O0.f13163OooOO0O = oooO00o7.f35815OooO0O0;
        oooO0O0.f13164OooOO0o = 4096;
        oooO0O0.f13172OooOo = oooO00o7.f35819OooO0o0;
        oooO0O0.f13178OooOoO0 = oooO00o7.f35817OooO0Oo;
        p296o0O0OoO0.o0ooOOo o0ooooo5 = mp3Extractor.f13905OooO0o0;
        oooO0O0.f13179OooOoOO = o0ooooo5.f35937OooO00o;
        oooO0O0.f13181OooOoo0 = o0ooooo5.f35938OooO0O0;
        oooO0O0.f13153OooO = (mp3Extractor.f13900OooO00o & 4) != 0 ? null : mp3Extractor.f13910OooOO0o;
        trackOutput.OooO0o0(new Format(oooO0O0));
        mp3Extractor.f13913OooOOOO = o000oooo2.getPosition();
        o000oooo3 = o000oooo2;
        if (mp3Extractor.f13914OooOOOo == 0) {
            o000oooo2.OooO();
            if (OooO0oO(o000oooo2)) {
                i4 = -1;
            } else {
                mp3Extractor.f13902OooO0OO.OooOoOO(0);
                iOooO0Oo = mp3Extractor.f13902OooO0OO.OooO0Oo();
                if (((-128000) & iOooO0Oo) == (((long) mp3Extractor.f13909OooOO0O) & (-128000))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                }
                o000oooo3.OooOO0(1);
                mp3Extractor.f13909OooOO0O = 0;
                i4 = 0;
            }
            i2 = i4;
            i = -1;
        } else {
            iOooO0O0 = mp3Extractor.f13908OooOO0.OooO0O0(o000oooo3, mp3Extractor.f13914OooOOOo, true);
            if (iOooO0O0 == -1) {
                i4 = -1;
            } else {
                i3 = mp3Extractor.f13914OooOOOo - iOooO0O0;
                mp3Extractor.f13914OooOOOo = i3;
                if (i3 <= 0) {
                    mp3Extractor.f13908OooOO0.OooO0Oo(mp3Extractor.OooO00o(mp3Extractor.f13911OooOOO), 1, mp3Extractor.f13903OooO0Oo.f35816OooO0OO, 0, null);
                    mp3Extractor.f13911OooOOO += (long) mp3Extractor.f13903OooO0Oo.f35820OooO0oO;
                    mp3Extractor.f13914OooOOOo = 0;
                }
                i4 = 0;
            }
            i2 = i4;
            i = -1;
        }
        if (i2 == i) {
            jOooO00o = mp3Extractor.OooO00o(mp3Extractor.f13911OooOOO);
            if (mp3Extractor.f13916OooOOo0.OooO0oo() != jOooO00o) {
                OooO00o oooO00o8 = mp3Extractor.f13916OooOOo0;
                ((p298o0O0Ooo.o0ooOOo) oooO00o8).f35980OooO0Oo = jOooO00o;
                mp3Extractor.f13907OooO0oo.OooOO0O(oooO00o8);
            }
        }
        return i2;
    }

    public final boolean OooO0oO(o000oOoO o000oooo2) throws IOException {
        OooO00o oooO00o = this.f13916OooOOo0;
        if (oooO00o != null) {
            long jOooO00o = oooO00o.OooO00o();
            if (jOooO00o != -1 && o000oooo2.OooO0Oo() > jOooO00o - 4) {
                return true;
            }
        }
        try {
            return !o000oooo2.OooO0OO(this.f13902OooO0OO.f36661OooO00o, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[EDGE_INSN: B:63:0x00ac->B:52:0x00ac BREAK  A[LOOP:0: B:23:0x0048->B:64:0x0048], SYNTHETIC] */
    public final boolean OooO0oo(o000oOoO o000oooo2, boolean z) throws IOException {
        int iOooO0Oo;
        int iOooO00o;
        int i;
        int i2 = z ? ShareRequest.THUMB_DATA_SIZE_LIMIT : 131072;
        o000oooo2.OooO();
        if (o000oooo2.getPosition() == 0) {
            Metadata metadataOooO00o = this.f13904OooO0o.OooO00o(o000oooo2, (this.f13900OooO00o & 4) == 0 ? null : f13898OooOo0);
            this.f13910OooOO0o = metadataOooO00o;
            if (metadataOooO00o != null) {
                this.f13905OooO0o0.OooO0O0(metadataOooO00o);
            }
            iOooO0Oo = (int) o000oooo2.OooO0Oo();
            if (!z) {
                o000oooo2.OooOO0(iOooO0Oo);
            }
        } else {
            iOooO0Oo = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (OooO0oO(o000oooo2)) {
                if (i4 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f13902OooO0OO.OooOoOO(0);
            int iOooO0Oo2 = this.f13902OooO0OO.OooO0Oo();
            if (i3 == 0) {
                iOooO00o = o0ooOOo.OooO00o(iOooO0Oo2);
                if (iOooO00o != -1) {
                    i = i5 + 1;
                    if (i5 == i2) {
                        if (z) {
                            return false;
                        }
                        throw new ParserException("Searched too many bytes.");
                    }
                    if (z) {
                        o000oooo2.OooO();
                        o000oooo2.OooO0o0(iOooO0Oo + i);
                    } else {
                        o000oooo2.OooOO0(1);
                    }
                    i5 = i;
                    i3 = 0;
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f13903OooO0Oo.OooO00o(iOooO0Oo2);
                        i3 = iOooO0Oo2;
                    }
                    o000oooo2.OooO0o0(iOooO00o - 4);
                }
            } else {
                if (((long) ((-128000) & iOooO0Oo2)) == (((long) i3) & (-128000))) {
                    iOooO00o = o0ooOOo.OooO00o(iOooO0Oo2);
                    if (iOooO00o != -1) {
                        i4++;
                        if (i4 == 1) {
                            if (i4 == 4) {
                                break;
                                break;
                            }
                        } else {
                            this.f13903OooO0Oo.OooO00o(iOooO0Oo2);
                            i3 = iOooO0Oo2;
                        }
                        o000oooo2.OooO0o0(iOooO00o - 4);
                    }
                }
                i = i5 + 1;
                if (i5 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new ParserException("Searched too many bytes.");
                }
                if (z) {
                    o000oooo2.OooO();
                    o000oooo2.OooO0o0(iOooO0Oo + i);
                } else {
                    o000oooo2.OooOO0(1);
                }
                i5 = i;
                i3 = 0;
                i4 = 0;
            }
        }
        if (z) {
            o000oooo2.OooOO0(iOooO0Oo + i5);
        } else {
            o000oooo2.OooO();
        }
        this.f13909OooOO0O = i3;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    public Mp3Extractor(int i) {
        this.f13900OooO00o = 0;
        this.f13901OooO0O0 = -9223372036854775807L;
        this.f13902OooO0OO = new o000(10);
        this.f13903OooO0Oo = new o0ooOOo.OooO00o();
        this.f13905OooO0o0 = new p296o0O0OoO0.o0ooOOo();
        this.f13912OooOOO0 = -9223372036854775807L;
        this.f13904OooO0o = new o0OOO0o();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f13906OooO0oO = oooO0O0;
        this.f13908OooOO0 = oooO0O0;
    }
}
