package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O00o0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOo implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f12229OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f12230OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TrackOutput f12231OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f12232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12234OooO0o0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12239OooOO0o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f12233OooO0o = new boolean[3];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p211o00oO0.Oooo000 f12235OooO0oO = new p211o00oO0.Oooo000(32);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p211o00oO0.Oooo000 f12236OooO0oo = new p211o00oO0.Oooo000(33);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p211o00oO0.Oooo000 f12228OooO = new p211o00oO0.Oooo000(34);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p211o00oO0.Oooo000 f12237OooOO0 = new p211o00oO0.Oooo000(39);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final p211o00oO0.Oooo000 f12238OooOO0O = new p211o00oO0.Oooo000(40);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f12241OooOOO0 = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00Oo00 f12240OooOOO = new o00Oo00();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f12242OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f12243OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f12244OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f12245OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f12246OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f12247OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f12248OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f12249OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f12250OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f12251OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f12252OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f12253OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f12254OooOOO0;

        public OooO00o(TrackOutput trackOutput) {
            this.f12243OooO00o = trackOutput;
        }
    }

    public OooOo(o00oO0o o00oo0o2) {
        this.f12229OooO00o = o00oo0o2;
    }

    @RequiresNonNull({"sampleReader"})
    public final void OooO00o(int i, int i2, byte[] bArr) {
        OooO00o oooO00o = this.f12232OooO0Oo;
        if (oooO00o.f12247OooO0o) {
            int i3 = oooO00o.f12246OooO0Oo;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                oooO00o.f12249OooO0oO = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
                oooO00o.f12247OooO0o = false;
            } else {
                oooO00o.f12246OooO0Oo = (i2 - i) + i3;
            }
        }
        if (!this.f12234OooO0o0) {
            this.f12235OooO0oO.OooO00o(i, i2, bArr);
            this.f12236OooO0oo.OooO00o(i, i2, bArr);
            this.f12228OooO.OooO00o(i, i2, bArr);
        }
        this.f12237OooOO0.OooO00o(i, i2, bArr);
        this.f12238OooOO0O.OooO00o(i, i2, bArr);
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
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        int i;
        int i2;
        boolean z;
        p211o00oO0.Oooo000 oooo000;
        p211o00oO0.Oooo000 oooo001;
        p211o00oO0.Oooo000 oooo002;
        p211o00oO0.Oooo000 oooo003;
        boolean zOooO0O0;
        o00oO0o o00oo0o2;
        o00Oo00 o00oo01;
        p211o00oO0.Oooo000 oooo004;
        OooO00o oooO00o;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        o00O000o.OooO0o0(this.f12231OooO0OO);
        int i3 = o0O00.f40595OooO00o;
        while (true) {
            int i4 = o00oo00.f40593OooO0OO;
            int i5 = o00oo00.f40592OooO0O0;
            int i6 = i4 - i5;
            if (i6 <= 0) {
                return;
            }
            byte[] bArr = o00oo00.f40591OooO00o;
            this.f12239OooOO0o += (long) i6;
            this.f12231OooO0OO.OooO0O0(i6, o00oo00);
            while (i5 < i4) {
                int iOooO0O0 = oo0O.OooO0O0(bArr, i5, i4, this.f12233OooO0o);
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
                long j = this.f12239OooOO0o - ((long) i10);
                int i11 = i9 < 0 ? -i9 : 0;
                long j2 = this.f12241OooOOO0;
                OooO00o oooO00o2 = this.f12232OooO0Oo;
                boolean z7 = this.f12234OooO0o0;
                if (oooO00o2.f12251OooOO0 && oooO00o2.f12249OooO0oO) {
                    oooO00o2.f12254OooOOO0 = oooO00o2.f12245OooO0OO;
                    oooO00o2.f12251OooOO0 = false;
                } else {
                    if (oooO00o2.f12250OooO0oo || oooO00o2.f12249OooO0oO) {
                        if (z7 && oooO00o2.f12242OooO) {
                            i2 = i10;
                            long j3 = oooO00o2.f12244OooO0O0;
                            i = i4;
                            int i12 = ((int) (j - j3)) + i2;
                            long j4 = oooO00o2.f12253OooOO0o;
                            if (j4 != -9223372036854775807L) {
                                oooO00o2.f12243OooO00o.OooO0o0(j4, oooO00o2.f12254OooOOO0 ? 1 : 0, (int) (j3 - oooO00o2.f12252OooOO0O), i12, null);
                            }
                        } else {
                            i = i4;
                            i2 = i10;
                        }
                        oooO00o2.f12252OooOO0O = oooO00o2.f12244OooO0O0;
                        oooO00o2.f12253OooOO0o = oooO00o2.f12248OooO0o0;
                        oooO00o2.f12254OooOOO0 = oooO00o2.f12245OooO0OO;
                        oooO00o2.f12242OooO = true;
                    }
                    z = this.f12234OooO0o0;
                    oooo000 = this.f12228OooO;
                    oooo001 = this.f12236OooO0oo;
                    oooo002 = this.f12235OooO0oO;
                    if (!z) {
                        oooo002.OooO0O0(i11);
                        oooo001.OooO0O0(i11);
                        oooo000.OooO0O0(i11);
                        if (!oooo002.f39599OooO0OO && oooo001.f39599OooO0OO && oooo000.f39599OooO0OO) {
                            TrackOutput trackOutput = this.f12231OooO0OO;
                            String str = this.f12230OooO0O0;
                            int i13 = oooo002.f39601OooO0o0;
                            byte[] bArr2 = new byte[oooo001.f39601OooO0o0 + i13 + oooo000.f39601OooO0o0];
                            System.arraycopy(oooo002.f39600OooO0Oo, 0, bArr2, 0, i13);
                            System.arraycopy(oooo001.f39600OooO0Oo, 0, bArr2, oooo002.f39601OooO0o0, oooo001.f39601OooO0o0);
                            System.arraycopy(oooo000.f39600OooO0Oo, 0, bArr2, oooo002.f39601OooO0o0 + oooo001.f39601OooO0o0, oooo000.f39601OooO0o0);
                            oo0O.OooO00o oooO00oOooO0OO = oo0O.OooO0OO(3, oooo001.f39601OooO0o0, oooo001.f39600OooO0Oo);
                            String strOooO0O0 = o00O00o0.OooO0O0(oooO00oOooO0OO.f40645OooO00o, oooO00oOooO0OO.f40647OooO0OO, oooO00oOooO0OO.f40648OooO0Oo, oooO00oOooO0OO.f40649OooO0o, oooO00oOooO0OO.f40646OooO0O0, oooO00oOooO0OO.f40650OooO0o0);
                            com.google.android.exoplayer2.OooOo.OooO00o oooO00o3 = new com.google.android.exoplayer2.OooOo.OooO00o();
                            oooO00o3.f11235OooO00o = str;
                            oooO00o3.f11244OooOO0O = "video/hevc";
                            oooO00o3.f11242OooO0oo = strOooO0O0;
                            oooO00o3.f11249OooOOOo = oooO00oOooO0OO.f40651OooO0oO;
                            oooO00o3.f11251OooOOo0 = oooO00oOooO0OO.f40652OooO0oo;
                            oooO00o3.f11255OooOo00 = oooO00oOooO0OO.f40644OooO;
                            oooO00o3.f11247OooOOO0 = Collections.singletonList(bArr2);
                            trackOutput.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o3));
                            this.f12234OooO0o0 = true;
                        }
                    }
                    oooo003 = this.f12237OooOO0;
                    zOooO0O0 = oooo003.OooO0O0(i11);
                    o00oo0o2 = this.f12229OooO00o;
                    o00oo01 = this.f12240OooOOO;
                    if (zOooO0O0) {
                        o00oo01.OooOooo(oo0O.OooO0o0(oooo003.f39601OooO0o0, oooo003.f39600OooO0Oo), oooo003.f39600OooO0Oo);
                        o00oo01.Oooo00o(5);
                        com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, o00oo01, o00oo0o2.f12407OooO0O0);
                    }
                    oooo004 = this.f12238OooOO0O;
                    if (oooo004.OooO0O0(i11)) {
                        o00oo01.OooOooo(oo0O.OooO0o0(oooo004.f39601OooO0o0, oooo004.f39600OooO0Oo), oooo004.f39600OooO0Oo);
                        o00oo01.Oooo00o(5);
                        com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, o00oo01, o00oo0o2.f12407OooO0O0);
                    }
                    long j5 = this.f12241OooOOO0;
                    oooO00o = this.f12232OooO0Oo;
                    boolean z8 = this.f12234OooO0o0;
                    z2 = false;
                    oooO00o.f12249OooO0oO = false;
                    oooO00o.f12250OooO0oo = false;
                    oooO00o.f12248OooO0o0 = j5;
                    oooO00o.f12246OooO0Oo = 0;
                    oooO00o.f12244OooO0O0 = j;
                    if (i8 >= 32 || i8 == 40) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z2 = false;
                    } else {
                        if (oooO00o.f12242OooO || oooO00o.f12251OooOO0) {
                            z2 = false;
                        } else {
                            if (z8) {
                                long j6 = oooO00o.f12253OooOO0o;
                                if (j6 != -9223372036854775807L) {
                                    oooO00o.f12243OooO00o.OooO0o0(j6, oooO00o.f12254OooOOO0 ? 1 : 0, (int) (j - oooO00o.f12252OooOO0O), i2, null);
                                }
                            }
                            oooO00o.f12242OooO = z2;
                        }
                        if (((32 <= i8 || i8 > 35) && i8 != 39) ? z2 : true) {
                            z4 = true;
                            oooO00o.f12250OooO0oo = !oooO00o.f12251OooOO0;
                            oooO00o.f12251OooOO0 = true;
                        }
                        if (i8 >= 16 || i8 > 21) {
                            z5 = z2;
                        } else {
                            z5 = z4;
                        }
                        oooO00o.f12245OooO0OO = z5;
                        if (!z5 || i8 <= 9) {
                            z6 = z4;
                        } else {
                            z6 = z2;
                        }
                        oooO00o.f12247OooO0o = z6;
                        if (!this.f12234OooO0o0) {
                            oooo002.OooO0Oo(i8);
                            oooo001.OooO0Oo(i8);
                            oooo000.OooO0Oo(i8);
                        }
                        oooo003.OooO0Oo(i8);
                        oooo004.OooO0Oo(i8);
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
                    oooO00o.f12245OooO0OO = z5;
                    if (z5) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    oooO00o.f12247OooO0o = z6;
                    if (!this.f12234OooO0o0) {
                        oooo002.OooO0Oo(i8);
                        oooo001.OooO0Oo(i8);
                        oooo000.OooO0Oo(i8);
                    }
                    oooo003.OooO0Oo(i8);
                    oooo004.OooO0Oo(i8);
                    i4 = i;
                    bArr = bArr;
                    i5 = i7;
                }
                i = i4;
                bArr = bArr;
                i7 = i7;
                i2 = i10;
                z = this.f12234OooO0o0;
                oooo000 = this.f12228OooO;
                oooo001 = this.f12236OooO0oo;
                oooo002 = this.f12235OooO0oO;
                if (!z) {
                    oooo002.OooO0O0(i11);
                    oooo001.OooO0O0(i11);
                    oooo000.OooO0O0(i11);
                    if (!oooo002.f39599OooO0OO) {
                    }
                }
                oooo003 = this.f12237OooOO0;
                zOooO0O0 = oooo003.OooO0O0(i11);
                o00oo0o2 = this.f12229OooO00o;
                o00oo01 = this.f12240OooOOO;
                if (zOooO0O0) {
                    o00oo01.OooOooo(oo0O.OooO0o0(oooo003.f39601OooO0o0, oooo003.f39600OooO0Oo), oooo003.f39600OooO0Oo);
                    o00oo01.Oooo00o(5);
                    com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, o00oo01, o00oo0o2.f12407OooO0O0);
                }
                oooo004 = this.f12238OooOO0O;
                if (oooo004.OooO0O0(i11)) {
                    o00oo01.OooOooo(oo0O.OooO0o0(oooo004.f39601OooO0o0, oooo004.f39600OooO0Oo), oooo004.f39600OooO0Oo);
                    o00oo01.Oooo00o(5);
                    com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, o00oo01, o00oo0o2.f12407OooO0O0);
                }
                long j7 = this.f12241OooOOO0;
                oooO00o = this.f12232OooO0Oo;
                boolean z9 = this.f12234OooO0o0;
                z2 = false;
                oooO00o.f12249OooO0oO = false;
                oooO00o.f12250OooO0oo = false;
                oooO00o.f12248OooO0o0 = j7;
                oooO00o.f12246OooO0Oo = 0;
                oooO00o.f12244OooO0O0 = j;
                if (i8 >= 32) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (oooO00o.f12242OooO) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (((32 <= i8 || i8 > 35) && i8 != 39) ? z2 : true) {
                        z4 = true;
                        oooO00o.f12250OooO0oo = !oooO00o.f12251OooOO0;
                        oooO00o.f12251OooOO0 = true;
                    }
                    if (i8 >= 16) {
                        z5 = z2;
                    } else {
                        z5 = z2;
                    }
                    oooO00o.f12245OooO0OO = z5;
                    if (z5) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    oooO00o.f12247OooO0o = z6;
                    if (!this.f12234OooO0o0) {
                        oooo002.OooO0Oo(i8);
                        oooo001.OooO0Oo(i8);
                        oooo000.OooO0Oo(i8);
                    }
                    oooo003.OooO0Oo(i8);
                    oooo004.OooO0Oo(i8);
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
                oooO00o.f12245OooO0OO = z5;
                if (z5) {
                    z6 = z4;
                } else {
                    z6 = z4;
                }
                oooO00o.f12247OooO0o = z6;
                if (!this.f12234OooO0o0) {
                    oooo002.OooO0Oo(i8);
                    oooo001.OooO0Oo(i8);
                    oooo000.OooO0Oo(i8);
                }
                oooo003.OooO0Oo(i8);
                oooo004.OooO0Oo(i8);
                i4 = i;
                bArr = bArr;
                i5 = i7;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12239OooOO0o = 0L;
        this.f12241OooOOO0 = -9223372036854775807L;
        oo0O.OooO00o(this.f12233OooO0o);
        this.f12235OooO0oO.OooO0OO();
        this.f12236OooO0oo.OooO0OO();
        this.f12228OooO.OooO0OO();
        this.f12237OooOO0.OooO0OO();
        this.f12238OooOO0O.OooO0OO();
        OooO00o oooO00o = this.f12232OooO0Oo;
        if (oooO00o != null) {
            oooO00o.f12247OooO0o = false;
            oooO00o.f12249OooO0oO = false;
            oooO00o.f12250OooO0oo = false;
            oooO00o.f12242OooO = false;
            oooO00o.f12251OooOO0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12230OooO0O0 = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 2);
        this.f12231OooO0OO = trackOutputOooOOO;
        this.f12232OooO0Oo = new OooO00o(trackOutputOooOOO);
        this.f12229OooO00o.OooO00o(o00o0o0, oooO0o);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12241OooOOO0 = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
