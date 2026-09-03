package androidx.media3.extractor.ts;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOo implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f8996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f8997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TrackOutput f8998OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f8999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f9001OooO0o0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f9006OooOO0o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f9000OooO0o = new boolean[3];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p103o000oo00.o000oOoO f9002OooO0oO = new p103o000oo00.o000oOoO(32);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p103o000oo00.o000oOoO f9003OooO0oo = new p103o000oo00.o000oOoO(33);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p103o000oo00.o000oOoO f8995OooO = new p103o000oo00.o000oOoO(34);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p103o000oo00.o000oOoO f9004OooOO0 = new p103o000oo00.o000oOoO(39);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final p103o000oo00.o000oOoO f9005OooOO0O = new p103o000oo00.o000oOoO(40);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f9008OooOOO0 = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000O000 f9007OooOOO = new o000O000();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f9009OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f9010OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f9011OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f9012OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9013OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f9014OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f9015OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f9016OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f9017OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f9018OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f9019OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f9020OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f9021OooOOO0;

        public OooO00o(TrackOutput trackOutput) {
            this.f9010OooO00o = trackOutput;
        }
    }

    public OooOo(o00oO0o o00oo0o2) {
        this.f8996OooO00o = o00oo0o2;
    }

    @RequiresNonNull({"sampleReader"})
    public final void OooO00o(int i, int i2, byte[] bArr) {
        OooO00o oooO00o = this.f8999OooO0Oo;
        if (oooO00o.f9014OooO0o) {
            int i3 = oooO00o.f9013OooO0Oo;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                oooO00o.f9016OooO0oO = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
                oooO00o.f9014OooO0o = false;
            } else {
                oooO00o.f9013OooO0Oo = (i2 - i) + i3;
            }
        }
        if (!this.f9001OooO0o0) {
            this.f9002OooO0oO.OooO00o(i, i2, bArr);
            this.f9003OooO0oo.OooO00o(i, i2, bArr);
            this.f8995OooO.OooO00o(i, i2, bArr);
        }
        this.f9004OooOO0.OooO00o(i, i2, bArr);
        this.f9005OooOO0O.OooO00o(i, i2, bArr);
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f9006OooOO0o = 0L;
        this.f9008OooOOO0 = -9223372036854775807L;
        p070o000O0o.Oooo0.OooO00o(this.f9000OooO0o);
        this.f9002OooO0oO.OooO0OO();
        this.f9003OooO0oo.OooO0OO();
        this.f8995OooO.OooO0OO();
        this.f9004OooOO0.OooO0OO();
        this.f9005OooOO0O.OooO0OO();
        OooO00o oooO00o = this.f8999OooO0Oo;
        if (oooO00o != null) {
            oooO00o.f9014OooO0o = false;
            oooO00o.f9016OooO0oO = false;
            oooO00o.f9017OooO0oo = false;
            oooO00o.f9009OooO = false;
            oooO00o.f9018OooOO0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0229  */
    /* JADX WARN: Code duplicated, block: B:108:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0161  */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x0195  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x020a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0222  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
        int i;
        int i2;
        boolean z;
        p103o000oo00.o000oOoO o000oooo2;
        p103o000oo00.o000oOoO o000oooo3;
        p103o000oo00.o000oOoO o000oooo4;
        p103o000oo00.o000oOoO o000oooo5;
        boolean zOooO0O0;
        o00oO0o o00oo0o2;
        o000O000 o000o002;
        p103o000oo00.o000oOoO o000oooo6;
        OooO00o oooO00o;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        p080o000OoO.o00Oo0.OooO0o(this.f8998OooO0OO);
        int i3 = o00.f34910OooO00o;
        while (true) {
            int i4 = o000o001.f34964OooO0OO;
            int i5 = o000o001.f34963OooO0O0;
            int i6 = i4 - i5;
            if (i6 <= 0) {
                return;
            }
            byte[] bArr = o000o001.f34962OooO00o;
            this.f9006OooOO0o += (long) i6;
            this.f8998OooO0OO.OooO0OO(i6, o000o001);
            while (i5 < i4) {
                int iOooO0O0 = p070o000O0o.Oooo0.OooO0O0(bArr, i5, i4, this.f9000OooO0o);
                if (iOooO0O0 == i4) {
                    OooO00o(i5, i4, bArr);
                    return;
                }
                int i7 = iOooO0O0 + 3;
                int i8 = (bArr[i7] & 126) >> 1;
                int i9 = iOooO0O0 - i5;
                if (i9 > 0) {
                    OooO00o(i5, iOooO0O0, bArr);
                }
                int i10 = i4 - iOooO0O0;
                long j = this.f9006OooOO0o - ((long) i10);
                int i11 = i9 < 0 ? -i9 : 0;
                long j2 = this.f9008OooOOO0;
                OooO00o oooO00o2 = this.f8999OooO0Oo;
                boolean z7 = this.f9001OooO0o0;
                if (oooO00o2.f9018OooOO0 && oooO00o2.f9016OooO0oO) {
                    oooO00o2.f9021OooOOO0 = oooO00o2.f9012OooO0OO;
                    oooO00o2.f9018OooOO0 = false;
                } else {
                    if (oooO00o2.f9017OooO0oo || oooO00o2.f9016OooO0oO) {
                        if (z7 && oooO00o2.f9009OooO) {
                            i2 = i10;
                            long j3 = oooO00o2.f9011OooO0O0;
                            i = i4;
                            int i12 = ((int) (j - j3)) + i2;
                            long j4 = oooO00o2.f9020OooOO0o;
                            if (j4 != -9223372036854775807L) {
                                oooO00o2.f9010OooO00o.OooO0o0(j4, oooO00o2.f9021OooOOO0 ? 1 : 0, (int) (j3 - oooO00o2.f9019OooOO0O), i12, null);
                            }
                        } else {
                            i = i4;
                            i2 = i10;
                        }
                        oooO00o2.f9019OooOO0O = oooO00o2.f9011OooO0O0;
                        oooO00o2.f9020OooOO0o = oooO00o2.f9015OooO0o0;
                        oooO00o2.f9021OooOOO0 = oooO00o2.f9012OooO0OO;
                        oooO00o2.f9009OooO = true;
                    }
                    z = this.f9001OooO0o0;
                    o000oooo2 = this.f8995OooO;
                    o000oooo3 = this.f9003OooO0oo;
                    o000oooo4 = this.f9002OooO0oO;
                    if (!z) {
                        o000oooo4.OooO0O0(i11);
                        o000oooo3.OooO0O0(i11);
                        o000oooo2.OooO0O0(i11);
                        if (!o000oooo4.f35666OooO0OO && o000oooo3.f35666OooO0OO && o000oooo2.f35666OooO0OO) {
                            TrackOutput trackOutput = this.f8998OooO0OO;
                            String str = this.f8997OooO0O0;
                            int i13 = o000oooo4.f35668OooO0o0;
                            byte[] bArr2 = new byte[o000oooo3.f35668OooO0o0 + i13 + o000oooo2.f35668OooO0o0];
                            System.arraycopy(o000oooo4.f35667OooO0Oo, 0, bArr2, 0, i13);
                            System.arraycopy(o000oooo3.f35667OooO0Oo, 0, bArr2, o000oooo4.f35668OooO0o0, o000oooo3.f35668OooO0o0);
                            System.arraycopy(o000oooo2.f35667OooO0Oo, 0, bArr2, o000oooo4.f35668OooO0o0 + o000oooo3.f35668OooO0o0, o000oooo2.f35668OooO0o0);
                            o000O0o.Oooo0.OooO00o oooO00oOooO0OO = p070o000O0o.Oooo0.OooO0OO(3, o000oooo3.f35668OooO0o0, o000oooo3.f35667OooO0Oo);
                            String strOooO0O0 = o0OOO0o.OooO0O0(oooO00oOooO0OO.f34306OooO00o, oooO00oOooO0OO.f34308OooO0OO, oooO00oOooO0OO.f34309OooO0Oo, oooO00oOooO0OO.f34310OooO0o, oooO00oOooO0OO.f34307OooO0O0, oooO00oOooO0OO.f34311OooO0o0);
                            androidx.media3.common.OooOO0.OooO00o oooO00o3 = new androidx.media3.common.OooOO0.OooO00o();
                            oooO00o3.f6436OooO00o = str;
                            oooO00o3.f6445OooOO0O = "video/hevc";
                            oooO00o3.f6443OooO0oo = strOooO0O0;
                            oooO00o3.f6450OooOOOo = oooO00oOooO0OO.f34312OooO0oO;
                            oooO00o3.f6452OooOOo0 = oooO00oOooO0OO.f34313OooO0oo;
                            oooO00o3.f6456OooOo00 = oooO00oOooO0OO.f34305OooO;
                            oooO00o3.f6448OooOOO0 = Collections.singletonList(bArr2);
                            trackOutput.OooO0O0(new androidx.media3.common.OooOO0(oooO00o3));
                            this.f9001OooO0o0 = true;
                        }
                    }
                    o000oooo5 = this.f9004OooOO0;
                    zOooO0O0 = o000oooo5.OooO0O0(i11);
                    o00oo0o2 = this.f8996OooO00o;
                    o000o002 = this.f9007OooOOO;
                    if (zOooO0O0) {
                        o000o002.OooOooo(p070o000O0o.Oooo0.OooO0o0(o000oooo5.f35668OooO0o0, o000oooo5.f35667OooO0Oo), o000oooo5.f35667OooO0Oo);
                        o000o002.Oooo00o(5);
                        androidx.media3.extractor.OooO00o.OooO00o(j2, o000o002, o00oo0o2.f9174OooO0O0);
                    }
                    o000oooo6 = this.f9005OooOO0O;
                    if (o000oooo6.OooO0O0(i11)) {
                        o000o002.OooOooo(p070o000O0o.Oooo0.OooO0o0(o000oooo6.f35668OooO0o0, o000oooo6.f35667OooO0Oo), o000oooo6.f35667OooO0Oo);
                        o000o002.Oooo00o(5);
                        androidx.media3.extractor.OooO00o.OooO00o(j2, o000o002, o00oo0o2.f9174OooO0O0);
                    }
                    long j5 = this.f9008OooOOO0;
                    oooO00o = this.f8999OooO0Oo;
                    boolean z8 = this.f9001OooO0o0;
                    z2 = false;
                    oooO00o.f9016OooO0oO = false;
                    oooO00o.f9017OooO0oo = false;
                    oooO00o.f9015OooO0o0 = j5;
                    oooO00o.f9013OooO0Oo = 0;
                    oooO00o.f9011OooO0O0 = j;
                    if (i8 >= 32 || i8 == 40) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z2 = false;
                    } else {
                        if (oooO00o.f9009OooO || oooO00o.f9018OooOO0) {
                            z2 = false;
                        } else {
                            if (z8) {
                                long j6 = oooO00o.f9020OooOO0o;
                                if (j6 != -9223372036854775807L) {
                                    oooO00o.f9010OooO00o.OooO0o0(j6, oooO00o.f9021OooOOO0 ? 1 : 0, (int) (j - oooO00o.f9019OooOO0O), i2, null);
                                }
                            }
                            oooO00o.f9009OooO = z2;
                        }
                        if (((32 <= i8 || i8 > 35) && i8 != 39) ? z2 : true) {
                            z4 = true;
                            oooO00o.f9017OooO0oo = !oooO00o.f9018OooOO0;
                            oooO00o.f9018OooOO0 = true;
                        }
                        if (i8 >= 16 || i8 > 21) {
                            z5 = z2;
                        } else {
                            z5 = z4;
                        }
                        oooO00o.f9012OooO0OO = z5;
                        if (!z5 || i8 <= 9) {
                            z6 = z4;
                        } else {
                            z6 = z2;
                        }
                        oooO00o.f9014OooO0o = z6;
                        if (!this.f9001OooO0o0) {
                            o000oooo4.OooO0Oo(i8);
                            o000oooo3.OooO0Oo(i8);
                            o000oooo2.OooO0Oo(i8);
                        }
                        o000oooo5.OooO0Oo(i8);
                        o000oooo6.OooO0Oo(i8);
                        i4 = i;
                        bArr = bArr;
                        i5 = i7;
                    }
                    z4 = true;
                    if (i8 >= 16) {
                        z5 = z2;
                    } else {
                        z5 = z2;
                    }
                    oooO00o.f9012OooO0OO = z5;
                    if (z5) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    oooO00o.f9014OooO0o = z6;
                    if (!this.f9001OooO0o0) {
                        o000oooo4.OooO0Oo(i8);
                        o000oooo3.OooO0Oo(i8);
                        o000oooo2.OooO0Oo(i8);
                    }
                    o000oooo5.OooO0Oo(i8);
                    o000oooo6.OooO0Oo(i8);
                    i4 = i;
                    bArr = bArr;
                    i5 = i7;
                }
                i = i4;
                bArr = bArr;
                i7 = i7;
                i2 = i10;
                z = this.f9001OooO0o0;
                o000oooo2 = this.f8995OooO;
                o000oooo3 = this.f9003OooO0oo;
                o000oooo4 = this.f9002OooO0oO;
                if (!z) {
                    o000oooo4.OooO0O0(i11);
                    o000oooo3.OooO0O0(i11);
                    o000oooo2.OooO0O0(i11);
                    if (!o000oooo4.f35666OooO0OO) {
                    }
                }
                o000oooo5 = this.f9004OooOO0;
                zOooO0O0 = o000oooo5.OooO0O0(i11);
                o00oo0o2 = this.f8996OooO00o;
                o000o002 = this.f9007OooOOO;
                if (zOooO0O0) {
                    o000o002.OooOooo(p070o000O0o.Oooo0.OooO0o0(o000oooo5.f35668OooO0o0, o000oooo5.f35667OooO0Oo), o000oooo5.f35667OooO0Oo);
                    o000o002.Oooo00o(5);
                    androidx.media3.extractor.OooO00o.OooO00o(j2, o000o002, o00oo0o2.f9174OooO0O0);
                }
                o000oooo6 = this.f9005OooOO0O;
                if (o000oooo6.OooO0O0(i11)) {
                    o000o002.OooOooo(p070o000O0o.Oooo0.OooO0o0(o000oooo6.f35668OooO0o0, o000oooo6.f35667OooO0Oo), o000oooo6.f35667OooO0Oo);
                    o000o002.Oooo00o(5);
                    androidx.media3.extractor.OooO00o.OooO00o(j2, o000o002, o00oo0o2.f9174OooO0O0);
                }
                long j7 = this.f9008OooOOO0;
                oooO00o = this.f8999OooO0Oo;
                boolean z9 = this.f9001OooO0o0;
                z2 = false;
                oooO00o.f9016OooO0oO = false;
                oooO00o.f9017OooO0oo = false;
                oooO00o.f9015OooO0o0 = j7;
                oooO00o.f9013OooO0Oo = 0;
                oooO00o.f9011OooO0O0 = j;
                if (i8 >= 32) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (oooO00o.f9009OooO) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (((32 <= i8 || i8 > 35) && i8 != 39) ? z2 : true) {
                        z4 = true;
                        oooO00o.f9017OooO0oo = !oooO00o.f9018OooOO0;
                        oooO00o.f9018OooOO0 = true;
                    }
                    if (i8 >= 16) {
                        z5 = z2;
                    } else {
                        z5 = z2;
                    }
                    oooO00o.f9012OooO0OO = z5;
                    if (z5) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    oooO00o.f9014OooO0o = z6;
                    if (!this.f9001OooO0o0) {
                        o000oooo4.OooO0Oo(i8);
                        o000oooo3.OooO0Oo(i8);
                        o000oooo2.OooO0Oo(i8);
                    }
                    o000oooo5.OooO0Oo(i8);
                    o000oooo6.OooO0Oo(i8);
                    i4 = i;
                    bArr = bArr;
                    i5 = i7;
                } else {
                    z2 = false;
                }
                z4 = true;
                if (i8 >= 16) {
                    z5 = z2;
                } else {
                    z5 = z2;
                }
                oooO00o.f9012OooO0OO = z5;
                if (z5) {
                    z6 = z4;
                } else {
                    z6 = z4;
                }
                oooO00o.f9014OooO0o = z6;
                if (!this.f9001OooO0o0) {
                    o000oooo4.OooO0Oo(i8);
                    o000oooo3.OooO0Oo(i8);
                    o000oooo2.OooO0Oo(i8);
                }
                o000oooo5.OooO0Oo(i8);
                o000oooo6.OooO0Oo(i8);
                i4 = i;
                bArr = bArr;
                i5 = i7;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f8997OooO0O0 = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 2);
        this.f8998OooO0OO = trackOutputOooOOOO;
        this.f8999OooO0Oo = new OooO00o(trackOutputOooOOOO);
        this.f8996OooO00o.OooO00o(oooo0, oooO0o);
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f9008OooOOO0 = j;
        }
    }
}
