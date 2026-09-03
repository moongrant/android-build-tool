package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.OooO0O0;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000OOo;
import o000OOoO.o00oO0o;
import o000OOoO.o0OOO0o;
import o000OOoO.oo0o0Oo;
import p028Oooo0oO.o00O0000;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;
import p089o000o00O.o00OOO0;
import p089o000o00O.o00OOO0O;
import p089o000o00O.o00OOOO0;
import p089o000o00O.o00OOOOo;
import p089o000o00O.o00Oo00;
import p089o000o00O.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Mp3Extractor implements Extractor {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final o00OOOO0 f8646OooOo0 = new o00OOOO0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TrackOutput f8647OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f8649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f8650OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo.OooO00o f8651OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f8652OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00oO0o f8653OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f8654OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Oooo0 f8655OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TrackOutput f8656OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8657OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Metadata f8658OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f8659OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f8660OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f8661OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8662OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f8663OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO00o f8664OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f8665OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f8666OooOo00;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    public static long OooO0o0(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iOooO0OO = metadata.OooO0OO();
        for (int i = 0; i < iOooO0OO; i++) {
            Metadata.Entry entryOooO0O0 = metadata.OooO0O0(i);
            if (entryOooO0O0 instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryOooO0O0;
                if (textInformationFrame.f8473OooO0Oo.equals("TLEN")) {
                    return o00.Oooo0OO(Long.parseLong(textInformationFrame.f8484OooO0o.get(0)));
                }
            }
        }
        return -9223372036854775807L;
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
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        int i;
        Mp3Extractor mp3Extractor;
        int i2;
        OooO00o oooO00o;
        long j;
        o000O000 o000o001;
        Oooo000 oooo001;
        int iOooO00o;
        int i3;
        OooOO0O oooOO0O;
        int iOooO0o;
        boolean z;
        int i4;
        int iOooO0o2;
        OooOO0O oooOO0O2;
        OooO00o oooO00oOooO0Oo;
        o00oO0o o00oo0o2;
        o000O000 o000o002;
        int iOooOoO0;
        o0o0Oo o0o0oo;
        OooO00o oooO00o2;
        boolean z2;
        OooO00o oooO00oOooO0Oo2;
        long jOooO0o0;
        long jOooO0o1;
        long j2;
        o000O000 o000o003;
        o00oO0o o00oo0o3;
        OooOO0O oooOO0O3;
        int iOooOo0O;
        o00Oo0.OooO0o(this.f8647OooO);
        int i5 = o00.f34910OooO00o;
        int i6 = this.f8657OooOO0O;
        oo0o0Oo.OooO00o oooO00o3 = this.f8651OooO0Oo;
        if (i6 == 0) {
            try {
                OooO0oo((OooOO0O) oooo000, false);
            } catch (EOFException unused) {
                i = -1;
                mp3Extractor = this;
                i2 = -1;
            }
        }
        OooO00o oooO00o4 = this.f8664OooOOo0;
        o000O000 o000o004 = this.f8650OooO0OO;
        if (oooO00o4 != null) {
            mp3Extractor = this;
            o000o001 = o000o004;
            long j3 = mp3Extractor.f8661OooOOOO;
            if (j3 != 0) {
                oooo001 = oooo000;
                OooOO0O oooOO0O4 = (OooOO0O) oooo001;
                long j4 = oooOO0O4.f34678OooO0Oo;
                if (j4 < j3) {
                    oooOO0O4.OooOO0((int) (j3 - j4));
                }
            }
            if (mp3Extractor.f8662OooOOOo == 0) {
                oooOO0O = (OooOO0O) oooo001;
                oooOO0O.f34679OooO0o = 0;
                if (mp3Extractor.OooO0oO(oooOO0O)) {
                    i2 = -1;
                } else {
                    o000O000 o000o005 = o000o001;
                    o000o005.Oooo00O(0);
                    iOooO0o = o000o005.OooO0o();
                    if (((-128000) & iOooO0o) == (((long) mp3Extractor.f8657OooOO0O) & (-128000))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || oo0o0Oo.OooO00o(iOooO0o) == -1) {
                        oooOO0O.OooOO0(1);
                        mp3Extractor.f8657OooOO0O = 0;
                    } else {
                        oooO00o3.OooO00o(iOooO0o);
                        if (mp3Extractor.f8660OooOOO0 == -9223372036854775807L) {
                            mp3Extractor.f8660OooOOO0 = mp3Extractor.f8664OooOOo0.OooO0oo(oooOO0O.f34678OooO0Oo);
                            long j5 = mp3Extractor.f8649OooO0O0;
                            if (j5 != -9223372036854775807L) {
                                mp3Extractor.f8660OooOOO0 = (j5 - mp3Extractor.f8664OooOOo0.OooO0oo(0L)) + mp3Extractor.f8660OooOOO0;
                            }
                        }
                        int i7 = oooO00o3.f34755OooO0OO;
                        mp3Extractor.f8662OooOOOo = i7;
                        OooO00o oooO00o5 = mp3Extractor.f8664OooOOo0;
                        if (oooO00o5 instanceof o00OOO0O) {
                            o00OOO0O o00ooo0o2 = (o00OOO0O) oooO00o5;
                            long j6 = (((mp3Extractor.f8659OooOOO + ((long) oooO00o3.f34759OooO0oO)) * AnimationKt.MillisToNanos) / ((long) oooO00o3.f34756OooO0Oo)) + mp3Extractor.f8660OooOOO0;
                            long j7 = oooOO0O.f34678OooO0Oo + ((long) i7);
                            if (!o00ooo0o2.OooO00o(j6)) {
                                o00ooo0o2.f35032OooO0O0.OooO00o(j6);
                                o00ooo0o2.f35033OooO0OO.OooO00o(j7);
                            }
                            if (mp3Extractor.f8665OooOOoo && o00ooo0o2.OooO00o(mp3Extractor.f8666OooOo00)) {
                                mp3Extractor.f8665OooOOoo = false;
                                mp3Extractor.f8656OooOO0 = mp3Extractor.f8647OooO;
                            }
                        }
                        iOooO00o = mp3Extractor.f8656OooOO0.OooO00o(oooo001, mp3Extractor.f8662OooOOOo, true);
                        if (iOooO00o == -1) {
                            i2 = -1;
                        } else {
                            i3 = mp3Extractor.f8662OooOOOo - iOooO00o;
                            mp3Extractor.f8662OooOOOo = i3;
                            if (i3 <= 0) {
                                mp3Extractor.f8656OooOO0.OooO0o0(mp3Extractor.f8660OooOOO0 + ((mp3Extractor.f8659OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f34756OooO0Oo)), 1, oooO00o3.f34755OooO0OO, 0, null);
                                mp3Extractor.f8659OooOOO += (long) oooO00o3.f34759OooO0oO;
                                i2 = 0;
                                mp3Extractor.f8662OooOOOo = 0;
                            }
                        }
                    }
                    i2 = 0;
                }
            } else {
                iOooO00o = mp3Extractor.f8656OooOO0.OooO00o(oooo001, mp3Extractor.f8662OooOOOo, true);
                if (iOooO00o == -1) {
                    i2 = -1;
                } else {
                    i3 = mp3Extractor.f8662OooOOOo - iOooO00o;
                    mp3Extractor.f8662OooOOOo = i3;
                    if (i3 <= 0) {
                        i2 = 0;
                    } else {
                        mp3Extractor.f8656OooOO0.OooO0o0(mp3Extractor.f8660OooOOO0 + ((mp3Extractor.f8659OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f34756OooO0Oo)), 1, oooO00o3.f34755OooO0OO, 0, null);
                        mp3Extractor.f8659OooOOO += (long) oooO00o3.f34759OooO0oO;
                        i2 = 0;
                        mp3Extractor.f8662OooOOOo = 0;
                    }
                }
            }
            i = -1;
            if (i2 == i) {
                oooO00o = mp3Extractor.f8664OooOOo0;
                if (oooO00o instanceof o00OOO0O) {
                    j = ((mp3Extractor.f8659OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f34756OooO0Oo)) + mp3Extractor.f8660OooOOO0;
                    if (oooO00o.OooO() != j) {
                        OooO00o oooO00o6 = mp3Extractor.f8664OooOOo0;
                        ((o00OOO0O) oooO00o6).f35034OooO0Oo = j;
                        mp3Extractor.f8655OooO0oo.OooO(oooO00o6);
                    }
                }
            }
            return i2;
        }
        o000O000 o000o006 = new o000O000(oooO00o3.f34755OooO0OO);
        OooOO0O oooOO0O5 = (OooOO0O) oooo000;
        oooOO0O5.OooO0OO(o000o006.f34962OooO00o, 0, oooO00o3.f34755OooO0OO, false);
        if ((oooO00o3.f34753OooO00o & 1) != 0) {
            if (oooO00o3.f34758OooO0o0 != 1) {
                i4 = 36;
            } else {
                i4 = 21;
            }
        } else if (oooO00o3.f34758OooO0o0 != 1) {
            i4 = 21;
        } else {
            i4 = 13;
        }
        if (o000o006.f34964OooO0OO >= i4 + 4) {
            o000o006.Oooo00O(i4);
            iOooO0o2 = o000o006.OooO0o();
            if (iOooO0o2 != 1483304551 && iOooO0o2 != 1231971951) {
                if (o000o006.f34964OooO0OO >= 40) {
                    o000o006.Oooo00O(36);
                    if (o000o006.OooO0o() == 1447187017) {
                        iOooO0o2 = 1447187017;
                    } else {
                        iOooO0o2 = 0;
                    }
                } else {
                    iOooO0o2 = 0;
                }
            }
        } else if (o000o006.f34964OooO0OO >= 40) {
            o000o006.Oooo00O(36);
            if (o000o006.OooO0o() == 1447187017) {
                iOooO0o2 = 1447187017;
            } else {
                iOooO0o2 = 0;
            }
        } else {
            iOooO0o2 = 0;
        }
        long j8 = oooOO0O5.f34677OooO0OO;
        o00oO0o o00oo0o4 = this.f8653OooO0o0;
        if (iOooO0o2 == 1483304551 || iOooO0o2 == 1231971951) {
            oooOO0O2 = oooOO0O5;
            long j9 = oooOO0O2.f34678OooO0Oo;
            int i8 = oooO00o3.f34759OooO0oO;
            int i9 = oooO00o3.f34756OooO0Oo;
            int iOooO0o3 = o000o006.OooO0o();
            if ((iOooO0o3 & 1) != 1 || (iOooOoO0 = o000o006.OooOoO0()) == 0) {
                oooO00oOooO0Oo = null;
            } else {
                long jOooo = o00.Oooo(iOooOoO0, ((long) i8) * AnimationKt.MillisToNanos, i9);
                if ((iOooO0o3 & 6) != 6) {
                    oooO00oOooO0Oo = new o00Oo00(j9, oooO00o3.f34755OooO0OO, jOooo, -1L, null);
                } else {
                    long jOooOo0o = o000o006.OooOo0o();
                    long[] jArr = new long[100];
                    for (int i10 = 0; i10 < 100; i10++) {
                        jArr[i10] = o000o006.OooOo0O();
                    }
                    if (j8 != -1) {
                        long j10 = j9 + jOooOo0o;
                        if (j8 != j10) {
                            StringBuilder sbOooO00o = o00O0000.OooO00o("XING data size mismatch: ", j8, ", ");
                            sbOooO00o.append(j10);
                            Log.OooO0o("XingSeeker", sbOooO00o.toString());
                        }
                    }
                    oooO00oOooO0Oo = new o00Oo00(j9, oooO00o3.f34755OooO0OO, jOooo, jOooOo0o, jArr);
                }
            }
            if (oooO00oOooO0Oo != null) {
                o00oo0o2 = o00oo0o4;
                if (!((o00oo0o2.f34718OooO00o == -1 || o00oo0o2.f34719OooO0O0 == -1) ? false : true)) {
                    oooOO0O2.f34679OooO0o = 0;
                    oooOO0O2.OooOO0o(i4 + ZegoConstants.RoomError.SessionError, false);
                    o000o002 = o000o004;
                    oooOO0O2.OooO0OO(o000o002.f34962OooO00o, 0, 3, false);
                    o000o002.Oooo00O(0);
                    int iOooOo = o000o002.OooOo();
                    int i11 = iOooOo >> 12;
                    int i12 = iOooOo & 4095;
                    if (i11 > 0 || i12 > 0) {
                        o00oo0o2.f34718OooO00o = i11;
                        o00oo0o2.f34719OooO0O0 = i12;
                    }
                }
                oooOO0O2.OooOO0(oooO00o3.f34755OooO0OO);
                if (oooO00oOooO0Oo == null && !oooO00oOooO0Oo.OooO0oO() && iOooO0o2 == 1231971951) {
                    mp3Extractor = this;
                    oooO00oOooO0Oo = mp3Extractor.OooO0Oo(oooOO0O2, false);
                } else {
                    mp3Extractor = this;
                }
            } else {
                o00oo0o2 = o00oo0o4;
            }
            o000o002 = o000o004;
            oooOO0O2.OooOO0(oooO00o3.f34755OooO0OO);
            if (oooO00oOooO0Oo == null) {
                mp3Extractor = this;
            } else {
                mp3Extractor = this;
            }
        } else {
            if (iOooO0o2 == 1447187017) {
                long j11 = oooOO0O5.f34678OooO0Oo;
                o000o006.Oooo00o(10);
                int iOooO0o4 = o000o006.OooO0o();
                if (iOooO0o4 <= 0) {
                    o000o003 = o000o004;
                    oooOO0O3 = oooOO0O5;
                    o00oo0o3 = o00oo0o4;
                } else {
                    int i13 = oooO00o3.f34756OooO0Oo;
                    long jOooo2 = o00.Oooo(iOooO0o4, ((long) (i13 >= 32000 ? 1152 : 576)) * AnimationKt.MillisToNanos, i13);
                    int iOooOoOO = o000o006.OooOoOO();
                    int iOooOoOO2 = o000o006.OooOoOO();
                    int iOooOoOO3 = o000o006.OooOoOO();
                    o000o006.Oooo00o(2);
                    long j12 = ((long) oooO00o3.f34755OooO0OO) + j11;
                    long[] jArr2 = new long[iOooOoOO];
                    long[] jArr3 = new long[iOooOoOO];
                    int i14 = 0;
                    o00oo0o3 = o00oo0o4;
                    long j13 = j11;
                    while (true) {
                        if (i14 >= iOooOoOO) {
                            o000o003 = o000o004;
                            long j14 = j8;
                            oooOO0O3 = oooOO0O5;
                            if (j14 != -1 && j14 != j13) {
                                StringBuilder sbOooO00o2 = o00O0000.OooO00o("VBRI data size mismatch: ", j14, ", ");
                                sbOooO00o2.append(j13);
                                Log.OooO0o("VbriSeeker", sbOooO00o2.toString());
                            }
                            oooO00oOooO0Oo = new o00OOOOo(jArr2, jArr3, jOooo2, j13);
                            break;
                        }
                        o000o003 = o000o004;
                        long j15 = j8;
                        oooOO0O3 = oooOO0O5;
                        jArr2[i14] = (((long) i14) * jOooo2) / ((long) iOooOoOO);
                        jArr3[i14] = Math.max(j13, j12);
                        if (iOooOoOO3 == 1) {
                            iOooOo0O = o000o006.OooOo0O();
                        } else if (iOooOoOO3 == 2) {
                            iOooOo0O = o000o006.OooOoOO();
                        } else if (iOooOoOO3 == 3) {
                            iOooOo0O = o000o006.OooOo();
                        } else if (iOooOoOO3 == 4) {
                            iOooOo0O = o000o006.OooOoO0();
                        }
                        j13 += ((long) iOooOo0O) * ((long) iOooOoOO2);
                        i14++;
                        o000o004 = o000o003;
                        j8 = j15;
                        oooOO0O5 = oooOO0O3;
                    }
                    oooOO0O2 = oooOO0O3;
                    oooOO0O2.OooOO0(oooO00o3.f34755OooO0OO);
                }
                oooO00oOooO0Oo = null;
                oooOO0O2 = oooOO0O3;
                oooOO0O2.OooOO0(oooO00o3.f34755OooO0OO);
            } else {
                o000o003 = o000o004;
                oooOO0O2 = oooOO0O5;
                o00oo0o3 = o00oo0o4;
                oooOO0O2.f34679OooO0o = 0;
                oooO00oOooO0Oo = null;
            }
            mp3Extractor = this;
            o00oo0o2 = o00oo0o3;
            o000o002 = o000o003;
        }
        Metadata metadata = mp3Extractor.f8658OooOO0o;
        long j16 = oooOO0O2.f34678OooO0Oo;
        if (metadata == null) {
            o000o001 = o000o002;
            o0o0oo = null;
            break;
        }
        Metadata.Entry[] entryArr = metadata.f6336OooO0Oo;
        int length = entryArr.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                o000o001 = o000o002;
                o0o0oo = null;
                break;
            }
            Metadata.Entry entry = entryArr[i15];
            if (entry instanceof MlltFrame) {
                MlltFrame mlltFrame = (MlltFrame) entry;
                long jOooO0o2 = OooO0o0(metadata);
                int length2 = mlltFrame.f8481OooO0oo.length;
                int i16 = length2 + 1;
                long[] jArr4 = new long[i16];
                long[] jArr5 = new long[i16];
                jArr4[0] = j16;
                jArr5[0] = 0;
                int i17 = 1;
                long j17 = 0;
                while (i17 <= length2) {
                    int i18 = i17 - 1;
                    j16 += (long) (mlltFrame.f8478OooO0o + mlltFrame.f8481OooO0oo[i18]);
                    j17 += (long) (mlltFrame.f8480OooO0oO + mlltFrame.f8477OooO[i18]);
                    jArr4[i17] = j16;
                    jArr5[i17] = j17;
                    i17++;
                    length2 = length2;
                    o000o002 = o000o002;
                }
                o000o001 = o000o002;
                o0o0oo = new o0o0Oo(jOooO0o2, jArr4, jArr5);
                break;
            }
            i15++;
        }
        boolean z3 = mp3Extractor.f8663OooOOo;
        int i19 = mp3Extractor.f8648OooO00o;
        if (z3) {
            oooO00oOooO0Oo2 = new OooO00o.C0155OooO00o();
        } else {
            if ((i19 & 4) != 0) {
                if (o0o0oo != null) {
                    jOooO0o0 = o0o0oo.f35047OooO0OO;
                } else {
                    if (oooO00oOooO0Oo != null) {
                        long jOooO = oooO00oOooO0Oo.OooO();
                        jOooO0o1 = oooO00oOooO0Oo.OooO0o0();
                        j2 = jOooO;
                    } else {
                        jOooO0o0 = OooO0o0(mp3Extractor.f8658OooOO0o);
                    }
                    oooO00oOooO0Oo = new o00OOO0O(j2, oooOO0O2.f34678OooO0Oo, jOooO0o1);
                }
                j2 = jOooO0o0;
                jOooO0o1 = -1;
                oooO00oOooO0Oo = new o00OOO0O(j2, oooOO0O2.f34678OooO0Oo, jOooO0o1);
            } else {
                if (o0o0oo == null) {
                    if (oooO00oOooO0Oo == null) {
                        oooO00o2 = null;
                    }
                }
                if (oooO00o2 == null && (oooO00o2.OooO0oO() || (i19 & 1) == 0)) {
                    oooO00oOooO0Oo2 = oooO00o2;
                } else {
                    if ((i19 & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    oooO00oOooO0Oo2 = mp3Extractor.OooO0Oo(oooOO0O2, z2);
                }
            }
            oooO00o2 = oooO00oOooO0Oo;
            if (oooO00o2 == null) {
                if ((i19 & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                oooO00oOooO0Oo2 = mp3Extractor.OooO0Oo(oooOO0O2, z2);
            } else {
                if ((i19 & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                oooO00oOooO0Oo2 = mp3Extractor.OooO0Oo(oooOO0O2, z2);
            }
        }
        mp3Extractor.f8664OooOOo0 = oooO00oOooO0Oo2;
        mp3Extractor.f8655OooO0oo.OooO(oooO00oOooO0Oo2);
        TrackOutput trackOutput = mp3Extractor.f8656OooOO0;
        OooOO0.OooO00o oooO00o7 = new OooOO0.OooO00o();
        oooO00o7.f6445OooOO0O = oooO00o3.f34754OooO0O0;
        oooO00o7.f6446OooOO0o = 4096;
        oooO00o7.f6454OooOo = oooO00o3.f34758OooO0o0;
        oooO00o7.f6460OooOoO0 = oooO00o3.f34756OooO0Oo;
        oooO00o7.f6461OooOoOO = o00oo0o2.f34718OooO00o;
        oooO00o7.f6463OooOoo0 = o00oo0o2.f34719OooO0O0;
        oooO00o7.f6435OooO = (i19 & 8) != 0 ? null : mp3Extractor.f8658OooOO0o;
        trackOutput.OooO0O0(new OooOO0(oooO00o7));
        mp3Extractor.f8661OooOOOO = oooOO0O2.f34678OooO0Oo;
        oooo001 = oooo000;
        if (mp3Extractor.f8662OooOOOo == 0) {
            oooOO0O = (OooOO0O) oooo001;
            oooOO0O.f34679OooO0o = 0;
            if (mp3Extractor.OooO0oO(oooOO0O)) {
                i2 = -1;
            } else {
                o000O000 o000o007 = o000o001;
                o000o007.Oooo00O(0);
                iOooO0o = o000o007.OooO0o();
                if (((-128000) & iOooO0o) == (((long) mp3Extractor.f8657OooOO0O) & (-128000))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                }
                oooOO0O.OooOO0(1);
                mp3Extractor.f8657OooOO0O = 0;
                i2 = 0;
            }
        } else {
            iOooO00o = mp3Extractor.f8656OooOO0.OooO00o(oooo001, mp3Extractor.f8662OooOOOo, true);
            if (iOooO00o == -1) {
                i2 = -1;
            } else {
                i3 = mp3Extractor.f8662OooOOOo - iOooO00o;
                mp3Extractor.f8662OooOOOo = i3;
                if (i3 <= 0) {
                    i2 = 0;
                } else {
                    mp3Extractor.f8656OooOO0.OooO0o0(mp3Extractor.f8660OooOOO0 + ((mp3Extractor.f8659OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f34756OooO0Oo)), 1, oooO00o3.f34755OooO0OO, 0, null);
                    mp3Extractor.f8659OooOOO += (long) oooO00o3.f34759OooO0oO;
                    i2 = 0;
                    mp3Extractor.f8662OooOOOo = 0;
                }
            }
        }
        i = -1;
        if (i2 == i) {
            oooO00o = mp3Extractor.f8664OooOOo0;
            if (oooO00o instanceof o00OOO0O) {
                j = ((mp3Extractor.f8659OooOOO * AnimationKt.MillisToNanos) / ((long) oooO00o3.f34756OooO0Oo)) + mp3Extractor.f8660OooOOO0;
                if (oooO00o.OooO() != j) {
                    OooO00o oooO00o8 = mp3Extractor.f8664OooOOo0;
                    ((o00OOO0O) oooO00o8).f35034OooO0Oo = j;
                    mp3Extractor.f8655OooO0oo.OooO(oooO00o8);
                }
            }
        }
        return i2;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f8657OooOO0O = 0;
        this.f8660OooOOO0 = -9223372036854775807L;
        this.f8659OooOOO = 0L;
        this.f8662OooOOOo = 0;
        this.f8666OooOo00 = j2;
        OooO00o oooO00o = this.f8664OooOOo0;
        if (!(oooO00o instanceof o00OOO0O) || ((o00OOO0O) oooO00o).OooO00o(j2)) {
            return;
        }
        this.f8665OooOOoo = true;
        this.f8656OooOO0 = this.f8654OooO0oO;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f8655OooO0oo = oooo0;
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(0, 1);
        this.f8647OooO = trackOutputOooOOOO;
        this.f8656OooOO0 = trackOutputOooOOOO;
        this.f8655OooO0oo.OooOO0O();
    }

    public final o00OOO0 OooO0Oo(OooOO0O oooOO0O, boolean z) throws IOException {
        o000O000 o000o001 = this.f8650OooO0OO;
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 4, false);
        o000o001.Oooo00O(0);
        this.f8651OooO0Oo.OooO00o(o000o001.OooO0o());
        return new o00OOO0(oooOO0O.f34677OooO0OO, oooOO0O.f34678OooO0Oo, this.f8651OooO0Oo, z);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        return OooO0oo((OooOO0O) oooo000, true);
    }

    public final boolean OooO0oO(OooOO0O oooOO0O) throws IOException {
        OooO00o oooO00o = this.f8664OooOOo0;
        if (oooO00o != null) {
            long jOooO0o0 = oooO00o.OooO0o0();
            if (jOooO0o0 != -1 && oooOO0O.OooO0oo() > jOooO0o0 - 4) {
                return true;
            }
        }
        try {
            return !oooOO0O.OooO0OO(this.f8650OooO0OO.f34962OooO00o, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
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
    public final boolean OooO0oo(OooOO0O oooOO0O, boolean z) throws IOException {
        int iOooO0oo;
        int iOooO00o;
        int i;
        int i2 = z ? ShareRequest.THUMB_DATA_SIZE_LIMIT : 131072;
        oooOO0O.f34679OooO0o = 0;
        if (oooOO0O.f34678OooO0Oo == 0) {
            Metadata metadataOooO00o = this.f8652OooO0o.OooO00o(oooOO0O, (this.f8648OooO00o & 8) == 0 ? null : f8646OooOo0);
            this.f8658OooOO0o = metadataOooO00o;
            if (metadataOooO00o != null) {
                this.f8653OooO0o0.OooO0O0(metadataOooO00o);
            }
            iOooO0oo = (int) oooOO0O.OooO0oo();
            if (!z) {
                oooOO0O.OooOO0(iOooO0oo);
            }
        } else {
            iOooO0oo = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (OooO0oO(oooOO0O)) {
                if (i4 > 0) {
                    break;
                }
                throw new EOFException();
            }
            o000O000 o000o001 = this.f8650OooO0OO;
            o000o001.Oooo00O(0);
            int iOooO0o = o000o001.OooO0o();
            if (i3 == 0) {
                iOooO00o = oo0o0Oo.OooO00o(iOooO0o);
                if (iOooO00o != -1) {
                    i = i5 + 1;
                    if (i5 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ParserException.OooO00o("Searched too many bytes.", null);
                    }
                    if (z) {
                        oooOO0O.f34679OooO0o = 0;
                        oooOO0O.OooOO0o(iOooO0oo + i, false);
                    } else {
                        oooOO0O.OooOO0(1);
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
                        this.f8651OooO0Oo.OooO00o(iOooO0o);
                        i3 = iOooO0o;
                    }
                    oooOO0O.OooOO0o(iOooO00o - 4, false);
                }
            } else {
                if (((long) ((-128000) & iOooO0o)) == (((long) i3) & (-128000))) {
                    iOooO00o = oo0o0Oo.OooO00o(iOooO0o);
                    if (iOooO00o != -1) {
                        i4++;
                        if (i4 == 1) {
                            if (i4 == 4) {
                                break;
                                break;
                            }
                        } else {
                            this.f8651OooO0Oo.OooO00o(iOooO0o);
                            i3 = iOooO0o;
                        }
                        oooOO0O.OooOO0o(iOooO00o - 4, false);
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
                    oooOO0O.f34679OooO0o = 0;
                    oooOO0O.OooOO0o(iOooO0oo + i, false);
                } else {
                    oooOO0O.OooOO0(1);
                }
                i4 = 0;
                i5 = i;
                i3 = 0;
            }
        }
        if (z) {
            oooOO0O.OooOO0(iOooO0oo + i5);
        } else {
            oooOO0O.f34679OooO0o = 0;
        }
        this.f8657OooOO0O = i3;
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    public Mp3Extractor(int i) {
        this.f8648OooO00o = 0;
        this.f8649OooO0O0 = -9223372036854775807L;
        this.f8650OooO0OO = new o000O000(10);
        this.f8651OooO0Oo = new oo0o0Oo.OooO00o();
        this.f8653OooO0o0 = new o00oO0o();
        this.f8660OooOOO0 = -9223372036854775807L;
        this.f8652OooO0o = new o0OOO0o();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f8654OooO0oO = oooO0O0;
        this.f8656OooOO0 = oooO0O0;
    }
}
