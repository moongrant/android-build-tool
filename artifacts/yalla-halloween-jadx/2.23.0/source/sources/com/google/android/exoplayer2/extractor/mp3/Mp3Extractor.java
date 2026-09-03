package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.OooO0O0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.Log;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p028Oooo0oO.o00O0000;
import p205o00o0oO0.o00oOoo;
import p209o00o0oo0.o00O;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO000;
import p209o00o0oo0.o00OO0O0;
import p213o00oO00O.o0000;
import p213o00oO00O.o0000O0;
import p213o00oO00O.o0000O00;
import p213o00oO00O.o0000Ooo;
import p213o00oO00O.o0000oo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Mp3Extractor implements Extractor {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final com.app.base.protobuf.room.OooO00o f11953OooOo0 = new com.app.base.protobuf.room.OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TrackOutput f11954OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f11955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f11956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f11957OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00oOoo.OooO00o f11958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OO000 f11959OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O f11960OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f11961OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00O0O0 f11962OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TrackOutput f11963OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f11964OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Metadata f11965OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f11966OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f11967OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f11968OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f11969OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f11970OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO00o f11971OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f11972OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f11973OooOo00;

    @Target({ElementType.TYPE_USE})
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
        int iOooO0OO = metadata.OooO0OO();
        for (int i = 0; i < iOooO0OO; i++) {
            Metadata.Entry entryOooO0O0 = metadata.OooO0O0(i);
            if (entryOooO0O0 instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryOooO0O0;
                if (textInformationFrame.f12594OooO0Oo.equals("TLEN")) {
                    return o0O00.Oooo0O0(Long.parseLong(textInformationFrame.f12605OooO0o.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final o0000Ooo OooO00o(o00O00o0 o00o00o1, boolean z) throws IOException {
        o00Oo00 o00oo00 = this.f11957OooO0OO;
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, false);
        o00oo00.Oooo00O(0);
        this.f11958OooO0Oo.OooO00o(o00oo00.OooO0o());
        return new o0000Ooo(o00o00o1.f39531OooO0OO, o00o00o1.f39532OooO0Oo, this.f11958OooO0Oo, z);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f11964OooOO0O = 0;
        this.f11967OooOOO0 = -9223372036854775807L;
        this.f11966OooOOO = 0L;
        this.f11969OooOOOo = 0;
        this.f11973OooOo00 = j2;
        OooO00o oooO00o = this.f11971OooOOo0;
        if (!(oooO00o instanceof o0000) || ((o0000) oooO00o).OooO0O0(j2)) {
            return;
        }
        this.f11972OooOOoo = true;
        this.f11963OooOO0 = this.f11961OooO0oO;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        return OooO0o((o00O00o0) o00o0o01, true);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7 A[EDGE_INSN: B:64:0x00a7->B:53:0x00a7 BREAK  A[LOOP:0: B:23:0x0046->B:65:0x0046], SYNTHETIC] */
    public final boolean OooO0o(o00O00o0 o00o00o1, boolean z) throws IOException {
        int iOooO0oo;
        int iOooO00o;
        int i;
        int i2 = z ? ShareRequest.THUMB_DATA_SIZE_LIMIT : 131072;
        o00o00o1.f39533OooO0o = 0;
        if (o00o00o1.f39532OooO0Oo == 0) {
            Metadata metadataOooO00o = this.f11959OooO0o.OooO00o(o00o00o1, (this.f11955OooO00o & 8) == 0 ? null : f11953OooOo0);
            this.f11965OooOO0o = metadataOooO00o;
            if (metadataOooO00o != null) {
                this.f11960OooO0o0.OooO0O0(metadataOooO00o);
            }
            iOooO0oo = (int) o00o00o1.OooO0oo();
            if (!z) {
                o00o00o1.OooOO0(iOooO0oo);
            }
        } else {
            iOooO0oo = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (OooO0o0(o00o00o1)) {
                if (i4 > 0) {
                    break;
                }
                throw new EOFException();
            }
            o00Oo00 o00oo00 = this.f11957OooO0OO;
            o00oo00.Oooo00O(0);
            int iOooO0o = o00oo00.OooO0o();
            if (i3 == 0) {
                iOooO00o = o00oOoo.OooO00o(iOooO0o);
                if (iOooO00o != -1) {
                    i = i5 + 1;
                    if (i5 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ParserException.OooO00o("Searched too many bytes.", null);
                    }
                    if (z) {
                        o00o00o1.f39533OooO0o = 0;
                        o00o00o1.OooOO0o(iOooO0oo + i, false);
                    } else {
                        o00o00o1.OooOO0(1);
                    }
                    i4 = 0;
                    i5 = i;
                    i3 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f11958OooO0Oo.OooO00o(iOooO0o);
                        i3 = iOooO0o;
                    }
                    o00o00o1.OooOO0o(iOooO00o - 4, false);
                }
            } else {
                if (((long) ((-128000) & iOooO0o)) == (((long) i3) & (-128000))) {
                    iOooO00o = o00oOoo.OooO00o(iOooO0o);
                    if (iOooO00o != -1) {
                        i4++;
                        if (i4 == 1) {
                            if (i4 == 4) {
                                break;
                                break;
                            }
                        } else {
                            this.f11958OooO0Oo.OooO00o(iOooO0o);
                            i3 = iOooO0o;
                        }
                        o00o00o1.OooOO0o(iOooO00o - 4, false);
                    }
                }
                i = i5 + 1;
                if (i5 == i2) {
                    if (z) {
                        return false;
                    }
                    throw ParserException.OooO00o("Searched too many bytes.", null);
                }
                if (z) {
                    o00o00o1.f39533OooO0o = 0;
                    o00o00o1.OooOO0o(iOooO0oo + i, false);
                } else {
                    o00o00o1.OooOO0(1);
                }
                i4 = 0;
                i5 = i;
                i3 = 0;
            }
        }
        if (z) {
            o00o00o1.OooOO0(iOooO0oo + i5);
        } else {
            o00o00o1.f39533OooO0o = 0;
        }
        this.f11964OooOO0O = i3;
        return true;
    }

    public final boolean OooO0o0(o00O00o0 o00o00o1) throws IOException {
        OooO00o oooO00o = this.f11971OooOOo0;
        if (oooO00o != null) {
            long jOooO0o0 = oooO00o.OooO0o0();
            if (jOooO0o0 != -1 && o00o00o1.OooO0oo() > jOooO0o0 - 4) {
                return true;
            }
        }
        try {
            return !o00o00o1.OooO0Oo(this.f11957OooO0OO.f40591OooO00o, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x025b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0310  */
    /* JADX WARN: Code duplicated, block: B:145:0x0314  */
    /* JADX WARN: Code duplicated, block: B:146:0x0316  */
    /* JADX WARN: Code duplicated, block: B:161:0x037b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0389  */
    /* JADX WARN: Code duplicated, block: B:166:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0429  */
    /* JADX WARN: Code duplicated, block: B:191:0x0435  */
    /* JADX WARN: Code duplicated, block: B:192:0x0437  */
    /* JADX WARN: Code duplicated, block: B:194:0x043e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0440  */
    /* JADX WARN: Code duplicated, block: B:198:0x0465  */
    /* JADX WARN: Code duplicated, block: B:200:0x046b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0480  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        int i;
        Mp3Extractor mp3Extractor;
        int i2;
        OooO00o oooO00o;
        long j;
        o00Oo00 o00oo00;
        o00O0O00 o00o0o02;
        int iOooO00o;
        int i3;
        o00O00o0 o00o00o1;
        int iOooO0o;
        boolean z;
        int i4;
        int iOooO0o2;
        o00O00o0 o00o00o2;
        OooO00o OooO00o2;
        o00O o00o2;
        o00Oo00 o00oo01;
        int iOooOoO0;
        o0000O00 o0000o00;
        OooO00o oooO00o2;
        boolean z2;
        OooO00o OooO00o3;
        long jOooO0OO;
        long jOooO0o0;
        long j2;
        o00Oo00 o00oo02;
        o00O o00o3;
        o00O00o0 o00o00o3;
        int iOooOo0O;
        o00O000o.OooO0o0(this.f11954OooO);
        int i5 = o0O00.f40595OooO00o;
        int i6 = this.f11964OooOO0O;
        o00oOoo.OooO00o oooO00o3 = this.f11958OooO0Oo;
        if (i6 == 0) {
            try {
                OooO0o((o00O00o0) o00o0o01, false);
            } catch (EOFException unused) {
                i = -1;
                mp3Extractor = this;
                i2 = -1;
            }
        }
        OooO00o oooO00o4 = this.f11971OooOOo0;
        o00Oo00 o00oo03 = this.f11957OooO0OO;
        if (oooO00o4 != null) {
            mp3Extractor = this;
            o00oo00 = o00oo03;
            long j3 = mp3Extractor.f11968OooOOOO;
            if (j3 != 0) {
                o00o0o02 = o00o0o01;
                o00O00o0 o00o00o4 = (o00O00o0) o00o0o02;
                long j4 = o00o00o4.f39532OooO0Oo;
                if (j4 < j3) {
                    o00o00o4.OooOO0((int) (j3 - j4));
                }
            }
            if (mp3Extractor.f11969OooOOOo == 0) {
                o00o00o1 = (o00O00o0) o00o0o02;
                o00o00o1.f39533OooO0o = 0;
                if (mp3Extractor.OooO0o0(o00o00o1)) {
                    i2 = -1;
                } else {
                    o00Oo00 o00oo04 = o00oo00;
                    o00oo04.Oooo00O(0);
                    iOooO0o = o00oo04.OooO0o();
                    if (((-128000) & iOooO0o) == (((long) mp3Extractor.f11964OooOO0O) & (-128000))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || o00oOoo.OooO00o(iOooO0o) == -1) {
                        o00o00o1.OooOO0(1);
                        mp3Extractor.f11964OooOO0O = 0;
                    } else {
                        oooO00o3.OooO00o(iOooO0o);
                        if (mp3Extractor.f11967OooOOO0 == -9223372036854775807L) {
                            mp3Extractor.f11967OooOOO0 = mp3Extractor.f11971OooOOo0.OooO00o(o00o00o1.f39532OooO0Oo);
                            long j5 = mp3Extractor.f11956OooO0O0;
                            if (j5 != -9223372036854775807L) {
                                mp3Extractor.f11967OooOOO0 = (j5 - mp3Extractor.f11971OooOOo0.OooO00o(0L)) + mp3Extractor.f11967OooOOO0;
                            }
                        }
                        int i7 = oooO00o3.f39390OooO0OO;
                        mp3Extractor.f11969OooOOOo = i7;
                        OooO00o oooO00o5 = mp3Extractor.f11971OooOOo0;
                        if (oooO00o5 instanceof o0000) {
                            o0000 o0000Var = (o0000) oooO00o5;
                            long j6 = (((mp3Extractor.f11966OooOOO + ((long) oooO00o3.f39394OooO0oO)) * AnimationKt.MillisToNanos) / ((long) oooO00o3.f39391OooO0Oo)) + mp3Extractor.f11967OooOOO0;
                            long j7 = o00o00o1.f39532OooO0Oo + ((long) i7);
                            if (!o0000Var.OooO0O0(j6)) {
                                o0000Var.f39639OooO0O0.OooO00o(j6);
                                o0000Var.f39640OooO0OO.OooO00o(j7);
                            }
                            if (mp3Extractor.f11972OooOOoo && o0000Var.OooO0O0(mp3Extractor.f11973OooOo00)) {
                                mp3Extractor.f11972OooOOoo = false;
                                mp3Extractor.f11963OooOO0 = mp3Extractor.f11954OooO;
                            }
                        }
                        iOooO00o = mp3Extractor.f11963OooOO0.OooO00o(o00o0o02, mp3Extractor.f11969OooOOOo, true);
                        if (iOooO00o == -1) {
                            i2 = -1;
                        } else {
                            i3 = mp3Extractor.f11969OooOOOo - iOooO00o;
                            mp3Extractor.f11969OooOOOo = i3;
                            if (i3 <= 0) {
                                mp3Extractor.f11963OooOO0.OooO0o0(mp3Extractor.f11967OooOOO0 + ((mp3Extractor.f11966OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f39391OooO0Oo)), 1, oooO00o3.f39390OooO0OO, 0, null);
                                mp3Extractor.f11966OooOOO += (long) oooO00o3.f39394OooO0oO;
                                i2 = 0;
                                mp3Extractor.f11969OooOOOo = 0;
                            }
                        }
                    }
                    i2 = 0;
                }
            } else {
                iOooO00o = mp3Extractor.f11963OooOO0.OooO00o(o00o0o02, mp3Extractor.f11969OooOOOo, true);
                if (iOooO00o == -1) {
                    i2 = -1;
                } else {
                    i3 = mp3Extractor.f11969OooOOOo - iOooO00o;
                    mp3Extractor.f11969OooOOOo = i3;
                    if (i3 <= 0) {
                        i2 = 0;
                    } else {
                        mp3Extractor.f11963OooOO0.OooO0o0(mp3Extractor.f11967OooOOO0 + ((mp3Extractor.f11966OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f39391OooO0Oo)), 1, oooO00o3.f39390OooO0OO, 0, null);
                        mp3Extractor.f11966OooOOO += (long) oooO00o3.f39394OooO0oO;
                        i2 = 0;
                        mp3Extractor.f11969OooOOOo = 0;
                    }
                }
            }
            i = -1;
            if (i2 == i) {
                oooO00o = mp3Extractor.f11971OooOOo0;
                if (oooO00o instanceof o0000) {
                    j = ((mp3Extractor.f11966OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f39391OooO0Oo)) + mp3Extractor.f11967OooOOO0;
                    if (oooO00o.OooO() != j) {
                        OooO00o oooO00o6 = mp3Extractor.f11971OooOOo0;
                        ((o0000) oooO00o6).f39641OooO0Oo = j;
                        mp3Extractor.f11962OooO0oo.OooO0O0(oooO00o6);
                    }
                }
            }
            return i2;
        }
        o00Oo00 o00oo05 = new o00Oo00(oooO00o3.f39390OooO0OO);
        o00O00o0 o00o00o5 = (o00O00o0) o00o0o01;
        o00o00o5.OooO0Oo(o00oo05.f40591OooO00o, 0, oooO00o3.f39390OooO0OO, false);
        if ((oooO00o3.f39388OooO00o & 1) != 0) {
            if (oooO00o3.f39393OooO0o0 != 1) {
                i4 = 36;
            } else {
                i4 = 21;
            }
        } else if (oooO00o3.f39393OooO0o0 != 1) {
            i4 = 21;
        } else {
            i4 = 13;
        }
        if (o00oo05.f40593OooO0OO >= i4 + 4) {
            o00oo05.Oooo00O(i4);
            iOooO0o2 = o00oo05.OooO0o();
            if (iOooO0o2 != 1483304551 && iOooO0o2 != 1231971951) {
                if (o00oo05.f40593OooO0OO >= 40) {
                    o00oo05.Oooo00O(36);
                    if (o00oo05.OooO0o() == 1447187017) {
                        iOooO0o2 = 1447187017;
                    } else {
                        iOooO0o2 = 0;
                    }
                } else {
                    iOooO0o2 = 0;
                }
            }
        } else if (o00oo05.f40593OooO0OO >= 40) {
            o00oo05.Oooo00O(36);
            if (o00oo05.OooO0o() == 1447187017) {
                iOooO0o2 = 1447187017;
            } else {
                iOooO0o2 = 0;
            }
        } else {
            iOooO0o2 = 0;
        }
        long j8 = o00o00o5.f39531OooO0OO;
        o00O o00o4 = this.f11960OooO0o0;
        if (iOooO0o2 == 1483304551 || iOooO0o2 == 1231971951) {
            o00o00o2 = o00o00o5;
            long j9 = o00o00o2.f39532OooO0Oo;
            int i8 = oooO00o3.f39394OooO0oO;
            int i9 = oooO00o3.f39391OooO0Oo;
            int iOooO0o3 = o00oo05.OooO0o();
            if ((iOooO0o3 & 1) != 1 || (iOooOoO0 = o00oo05.OooOoO0()) == 0) {
                OooO00o2 = null;
            } else {
                long jOooo0oo = o0O00.Oooo0oo(iOooOoO0, ((long) i8) * AnimationKt.MillisToNanos, i9);
                if ((iOooO0o3 & 6) != 6) {
                    OooO00o2 = new o0000O0(j9, oooO00o3.f39390OooO0OO, jOooo0oo, -1L, null);
                } else {
                    long jOooOo0o = o00oo05.OooOo0o();
                    long[] jArr = new long[100];
                    for (int i10 = 0; i10 < 100; i10++) {
                        jArr[i10] = o00oo05.OooOo0O();
                    }
                    if (j8 != -1) {
                        long j10 = j9 + jOooOo0o;
                        if (j8 != j10) {
                            StringBuilder sbOooO00o = o00O0000.OooO00o("XING data size mismatch: ", j8, ", ");
                            sbOooO00o.append(j10);
                            Log.OooO0o("XingSeeker", sbOooO00o.toString());
                        }
                    }
                    OooO00o2 = new o0000O0(j9, oooO00o3.f39390OooO0OO, jOooo0oo, jOooOo0o, jArr);
                }
            }
            if (OooO00o2 != null) {
                o00o2 = o00o4;
                if (!((o00o2.f39497OooO00o == -1 || o00o2.f39498OooO0O0 == -1) ? false : true)) {
                    o00o00o2.f39533OooO0o = 0;
                    o00o00o2.OooOO0o(i4 + ZegoConstants.RoomError.SessionError, false);
                    o00oo01 = o00oo03;
                    o00o00o2.OooO0Oo(o00oo01.f40591OooO00o, 0, 3, false);
                    o00oo01.Oooo00O(0);
                    int iOooOo = o00oo01.OooOo();
                    int i11 = iOooOo >> 12;
                    int i12 = iOooOo & 4095;
                    if (i11 > 0 || i12 > 0) {
                        o00o2.f39497OooO00o = i11;
                        o00o2.f39498OooO0O0 = i12;
                    }
                }
                o00o00o2.OooOO0(oooO00o3.f39390OooO0OO);
                if (OooO00o2 == null && !OooO00o2.OooO0o() && iOooO0o2 == 1231971951) {
                    mp3Extractor = this;
                    OooO00o2 = mp3Extractor.OooO00o(o00o00o2, false);
                } else {
                    mp3Extractor = this;
                }
            } else {
                o00o2 = o00o4;
            }
            o00oo01 = o00oo03;
            o00o00o2.OooOO0(oooO00o3.f39390OooO0OO);
            if (OooO00o2 == null) {
                mp3Extractor = this;
            } else {
                mp3Extractor = this;
            }
        } else {
            if (iOooO0o2 == 1447187017) {
                long j11 = o00o00o5.f39532OooO0Oo;
                o00oo05.Oooo00o(10);
                int iOooO0o4 = o00oo05.OooO0o();
                if (iOooO0o4 <= 0) {
                    o00oo02 = o00oo03;
                    o00o00o3 = o00o00o5;
                    o00o3 = o00o4;
                } else {
                    int i13 = oooO00o3.f39391OooO0Oo;
                    long jOooo0oo2 = o0O00.Oooo0oo(iOooO0o4, ((long) (i13 >= 32000 ? 1152 : 576)) * AnimationKt.MillisToNanos, i13);
                    int iOooOoOO = o00oo05.OooOoOO();
                    int iOooOoOO2 = o00oo05.OooOoOO();
                    int iOooOoOO3 = o00oo05.OooOoOO();
                    o00oo05.Oooo00o(2);
                    long j12 = ((long) oooO00o3.f39390OooO0OO) + j11;
                    long[] jArr2 = new long[iOooOoOO];
                    long[] jArr3 = new long[iOooOoOO];
                    int i14 = 0;
                    o00o3 = o00o4;
                    long j13 = j11;
                    while (true) {
                        if (i14 >= iOooOoOO) {
                            o00oo02 = o00oo03;
                            long j14 = j8;
                            o00o00o3 = o00o00o5;
                            if (j14 != -1 && j14 != j13) {
                                StringBuilder sbOooO00o2 = o00O0000.OooO00o("VBRI data size mismatch: ", j14, ", ");
                                sbOooO00o2.append(j13);
                                Log.OooO0o("VbriSeeker", sbOooO00o2.toString());
                            }
                            OooO00o2 = new o0000oo(jArr2, jArr3, jOooo0oo2, j13);
                            break;
                        }
                        o00oo02 = o00oo03;
                        long j15 = j8;
                        o00o00o3 = o00o00o5;
                        jArr2[i14] = (((long) i14) * jOooo0oo2) / ((long) iOooOoOO);
                        jArr3[i14] = Math.max(j13, j12);
                        if (iOooOoOO3 == 1) {
                            iOooOo0O = o00oo05.OooOo0O();
                        } else if (iOooOoOO3 == 2) {
                            iOooOo0O = o00oo05.OooOoOO();
                        } else if (iOooOoOO3 == 3) {
                            iOooOo0O = o00oo05.OooOo();
                        } else if (iOooOoOO3 == 4) {
                            iOooOo0O = o00oo05.OooOoO0();
                        }
                        j13 += ((long) iOooOo0O) * ((long) iOooOoOO2);
                        i14++;
                        o00oo03 = o00oo02;
                        j8 = j15;
                        o00o00o5 = o00o00o3;
                    }
                    o00o00o2 = o00o00o3;
                    o00o00o2.OooOO0(oooO00o3.f39390OooO0OO);
                }
                OooO00o2 = null;
                o00o00o2 = o00o00o3;
                o00o00o2.OooOO0(oooO00o3.f39390OooO0OO);
            } else {
                o00oo02 = o00oo03;
                o00o00o2 = o00o00o5;
                o00o3 = o00o4;
                o00o00o2.f39533OooO0o = 0;
                OooO00o2 = null;
            }
            mp3Extractor = this;
            o00o2 = o00o3;
            o00oo01 = o00oo02;
        }
        Metadata metadata = mp3Extractor.f11965OooOO0o;
        long j16 = o00o00o2.f39532OooO0Oo;
        if (metadata == null) {
            o00oo00 = o00oo01;
            o0000o00 = null;
            break;
        }
        Metadata.Entry[] entryArr = metadata.f12530OooO0Oo;
        int length = entryArr.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                o00oo00 = o00oo01;
                o0000o00 = null;
                break;
            }
            Metadata.Entry entry = entryArr[i15];
            if (entry instanceof MlltFrame) {
                MlltFrame mlltFrame = (MlltFrame) entry;
                long jOooO0OO2 = OooO0OO(metadata);
                int length2 = mlltFrame.f12602OooO0oo.length;
                int i16 = length2 + 1;
                long[] jArr4 = new long[i16];
                long[] jArr5 = new long[i16];
                jArr4[0] = j16;
                jArr5[0] = 0;
                int i17 = 1;
                long j17 = 0;
                while (i17 <= length2) {
                    int i18 = i17 - 1;
                    j16 += (long) (mlltFrame.f12599OooO0o + mlltFrame.f12602OooO0oo[i18]);
                    j17 += (long) (mlltFrame.f12601OooO0oO + mlltFrame.f12598OooO[i18]);
                    jArr4[i17] = j16;
                    jArr5[i17] = j17;
                    i17++;
                    length2 = length2;
                    o00oo01 = o00oo01;
                }
                o00oo00 = o00oo01;
                o0000o00 = new o0000O00(jOooO0OO2, jArr4, jArr5);
                break;
            }
            i15++;
        }
        boolean z3 = mp3Extractor.f11970OooOOo;
        int i19 = mp3Extractor.f11955OooO00o;
        if (z3) {
            OooO00o3 = new OooO00o.C0202OooO00o();
        } else {
            if ((i19 & 4) != 0) {
                if (o0000o00 != null) {
                    jOooO0OO = o0000o00.f39650OooO0OO;
                } else {
                    if (OooO00o2 != null) {
                        long jOooO = OooO00o2.OooO();
                        jOooO0o0 = OooO00o2.OooO0o0();
                        j2 = jOooO;
                    } else {
                        jOooO0OO = OooO0OO(mp3Extractor.f11965OooOO0o);
                    }
                    OooO00o2 = new o0000(j2, o00o00o2.f39532OooO0Oo, jOooO0o0);
                }
                j2 = jOooO0OO;
                jOooO0o0 = -1;
                OooO00o2 = new o0000(j2, o00o00o2.f39532OooO0Oo, jOooO0o0);
            } else {
                if (o0000o00 == null) {
                    if (OooO00o2 == null) {
                        oooO00o2 = null;
                    }
                }
                if (oooO00o2 == null && (oooO00o2.OooO0o() || (i19 & 1) == 0)) {
                    OooO00o3 = oooO00o2;
                } else {
                    if ((i19 & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    OooO00o3 = mp3Extractor.OooO00o(o00o00o2, z2);
                }
            }
            oooO00o2 = OooO00o2;
            if (oooO00o2 == null) {
                if ((i19 & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                OooO00o3 = mp3Extractor.OooO00o(o00o00o2, z2);
            } else {
                if ((i19 & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                OooO00o3 = mp3Extractor.OooO00o(o00o00o2, z2);
            }
        }
        mp3Extractor.f11971OooOOo0 = OooO00o3;
        mp3Extractor.f11962OooO0oo.OooO0O0(OooO00o3);
        TrackOutput trackOutput = mp3Extractor.f11963OooOO0;
        OooOo.OooO00o oooO00o7 = new OooOo.OooO00o();
        oooO00o7.f11244OooOO0O = oooO00o3.f39389OooO0O0;
        oooO00o7.f11245OooOO0o = 4096;
        oooO00o7.f11253OooOo = oooO00o3.f39393OooO0o0;
        oooO00o7.f11259OooOoO0 = oooO00o3.f39391OooO0Oo;
        oooO00o7.f11260OooOoOO = o00o2.f39497OooO00o;
        oooO00o7.f11262OooOoo0 = o00o2.f39498OooO0O0;
        oooO00o7.f11234OooO = (i19 & 8) != 0 ? null : mp3Extractor.f11965OooOO0o;
        trackOutput.OooO0OO(new OooOo(oooO00o7));
        mp3Extractor.f11968OooOOOO = o00o00o2.f39532OooO0Oo;
        o00o0o02 = o00o0o01;
        if (mp3Extractor.f11969OooOOOo == 0) {
            o00o00o1 = (o00O00o0) o00o0o02;
            o00o00o1.f39533OooO0o = 0;
            if (mp3Extractor.OooO0o0(o00o00o1)) {
                i2 = -1;
            } else {
                o00Oo00 o00oo06 = o00oo00;
                o00oo06.Oooo00O(0);
                iOooO0o = o00oo06.OooO0o();
                if (((-128000) & iOooO0o) == (((long) mp3Extractor.f11964OooOO0O) & (-128000))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                }
                o00o00o1.OooOO0(1);
                mp3Extractor.f11964OooOO0O = 0;
                i2 = 0;
            }
        } else {
            iOooO00o = mp3Extractor.f11963OooOO0.OooO00o(o00o0o02, mp3Extractor.f11969OooOOOo, true);
            if (iOooO00o == -1) {
                i2 = -1;
            } else {
                i3 = mp3Extractor.f11969OooOOOo - iOooO00o;
                mp3Extractor.f11969OooOOOo = i3;
                if (i3 <= 0) {
                    i2 = 0;
                } else {
                    mp3Extractor.f11963OooOO0.OooO0o0(mp3Extractor.f11967OooOOO0 + ((mp3Extractor.f11966OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f39391OooO0Oo)), 1, oooO00o3.f39390OooO0OO, 0, null);
                    mp3Extractor.f11966OooOOO += (long) oooO00o3.f39394OooO0oO;
                    i2 = 0;
                    mp3Extractor.f11969OooOOOo = 0;
                }
            }
        }
        i = -1;
        if (i2 == i) {
            oooO00o = mp3Extractor.f11971OooOOo0;
            if (oooO00o instanceof o0000) {
                j = ((mp3Extractor.f11966OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f39391OooO0Oo)) + mp3Extractor.f11967OooOOO0;
                if (oooO00o.OooO() != j) {
                    OooO00o oooO00o8 = mp3Extractor.f11971OooOOo0;
                    ((o0000) oooO00o8).f39641OooO0Oo = j;
                    mp3Extractor.f11962OooO0oo.OooO0O0(oooO00o8);
                }
            }
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f11962OooO0oo = o00o0o0;
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(0, 1);
        this.f11954OooO = trackOutputOooOOO;
        this.f11963OooOO0 = trackOutputOooOOO;
        this.f11962OooO0oo.OooO00o();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    public Mp3Extractor(int i) {
        this.f11955OooO00o = 0;
        this.f11956OooO0O0 = -9223372036854775807L;
        this.f11957OooO0OO = new o00Oo00(10);
        this.f11958OooO0Oo = new o00oOoo.OooO00o();
        this.f11960OooO0o0 = new o00O();
        this.f11967OooOOO0 = -9223372036854775807L;
        this.f11959OooO0o = new o00OO000();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f11961OooO0oO = oooO0O0;
        this.f11963OooOO0 = oooO0O0;
    }
}
