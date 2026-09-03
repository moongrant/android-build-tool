package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.umeng.analytics.pro.bz;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
import p302o0O0o00.o00;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final double[] f14110OooOOo0 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14111OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f14112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f14113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f14114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o000 f14115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00 f14117OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14119OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f14120OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f14121OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f14122OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f14123OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f14124OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14125OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14126OooOOOo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f14116OooO0o = new boolean[4];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f14118OooO0oO = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final byte[] f14127OooO0o0 = {0, 0, 1};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f14128OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14129OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14130OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f14131OooO0Oo = new byte[128];

        public final void OooO00o(byte[] bArr, int i, int i2) {
            if (this.f14128OooO00o) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f14131OooO0Oo;
                int length = bArr2.length;
                int i4 = this.f14129OooO0O0;
                if (length < i4 + i3) {
                    this.f14131OooO0Oo = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f14131OooO0Oo, this.f14129OooO0O0, i3);
                this.f14129OooO0O0 += i3;
            }
        }
    }

    public OooOOO(@Nullable o0ooOOo o0ooooo2) {
        this.f14114OooO0OO = o0ooooo2;
        if (o0ooooo2 != null) {
            this.f14117OooO0o0 = new o00(178);
            this.f14115OooO0Oo = new o000();
        } else {
            this.f14117OooO0o0 = null;
            this.f14115OooO0Oo = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
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
    public final void OooO00o(o000 o000Var) {
        int i;
        int i2;
        boolean z;
        OooO00o oooO00o;
        byte[] bArrCopyOf;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        float f2;
        int i7;
        long j;
        double[] dArr;
        double d;
        int i8;
        int i9;
        o00000O0.OooO0o(this.f14113OooO0O0);
        int i10 = o000Var.f36662OooO0O0;
        int i11 = o000Var.f36663OooO0OO;
        byte[] bArr = o000Var.f36661OooO00o;
        int i12 = i11 - i10;
        this.f14119OooO0oo += (long) i12;
        this.f14113OooO0O0.OooO0OO(o000Var, i12);
        while (true) {
            int iOooO0O0 = o0000O.OooO0O0(bArr, i10, i11, this.f14116OooO0o);
            if (iOooO0O0 == i11) {
                break;
            }
            int i13 = iOooO0O0 + 3;
            int i14 = o000Var.f36661OooO00o[i13] & UByte.MAX_VALUE;
            int i15 = iOooO0O0 - i10;
            if (this.f14120OooOO0) {
                i14 = i14;
                i13 = i13;
            } else {
                if (i15 > 0) {
                    this.f14118OooO0oO.OooO00o(bArr, i10, iOooO0O0);
                }
                int i16 = i15 < 0 ? -i15 : 0;
                OooO00o oooO00o2 = this.f14118OooO0oO;
                if (oooO00o2.f14128OooO00o) {
                    int i17 = oooO00o2.f14129OooO0O0 - i16;
                    oooO00o2.f14129OooO0O0 = i17;
                    if (oooO00o2.f14130OooO0OO == 0 && i14 == 181) {
                        oooO00o2.f14130OooO0OO = i17;
                    } else {
                        oooO00o2.f14128OooO00o = false;
                        z = true;
                    }
                    if (z) {
                        oooO00o = this.f14118OooO0oO;
                        String str = this.f14112OooO00o;
                        Objects.requireNonNull(str);
                        bArrCopyOf = Arrays.copyOf(oooO00o.f14131OooO0Oo, oooO00o.f14129OooO0O0);
                        int i18 = bArrCopyOf[4] & UByte.MAX_VALUE;
                        int i19 = bArrCopyOf[5] & UByte.MAX_VALUE;
                        i3 = (i18 << 4) | (i19 >> 4);
                        i4 = (bArrCopyOf[6] & UByte.MAX_VALUE) | ((i19 & 15) << 8);
                        i5 = (bArrCopyOf[7] & 240) >> 4;
                        if (i5 != 2) {
                            f = i4 * 4;
                            i6 = i3 * 3;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i4 * 121;
                                i6 = i3 * 100;
                            }
                            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                            oooO0O0.f13154OooO00o = str;
                            oooO0O0.f13163OooOO0O = "video/mpeg2";
                            oooO0O0.f13168OooOOOo = i3;
                            oooO0O0.f13170OooOOo0 = i4;
                            oooO0O0.f13174OooOo00 = f2;
                            oooO0O0.f13166OooOOO0 = Collections.singletonList(bArrCopyOf);
                            Format format = new Format(oooO0O0);
                            i7 = (bArrCopyOf[7] & bz.m) - 1;
                            if (i7 >= 0) {
                                dArr = f14110OooOOo0;
                                if (i7 < 8) {
                                    d = dArr[i7];
                                    int i20 = oooO00o.f14130OooO0OO + 9;
                                    i8 = (bArrCopyOf[i20] & 96) >> 5;
                                    i9 = bArrCopyOf[i20] & 31;
                                    if (i8 != i9) {
                                        d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                                    }
                                    j = (long) (1000000.0d / d);
                                } else {
                                    i14 = i14;
                                    i13 = i13;
                                    j = 0;
                                }
                            } else {
                                i14 = i14;
                                i13 = i13;
                                j = 0;
                            }
                            Pair pairCreate = Pair.create(format, Long.valueOf(j));
                            this.f14113OooO0O0.OooO0o0((Format) pairCreate.first);
                            this.f14121OooOO0O = ((Long) pairCreate.second).longValue();
                            this.f14120OooOO0 = true;
                        } else {
                            f = i4 * 16;
                            i6 = i3 * 9;
                        }
                        f2 = f / i6;
                        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
                        oooO0O1.f13154OooO00o = str;
                        oooO0O1.f13163OooOO0O = "video/mpeg2";
                        oooO0O1.f13168OooOOOo = i3;
                        oooO0O1.f13170OooOOo0 = i4;
                        oooO0O1.f13174OooOo00 = f2;
                        oooO0O1.f13166OooOOO0 = Collections.singletonList(bArrCopyOf);
                        Format format2 = new Format(oooO0O1);
                        i7 = (bArrCopyOf[7] & bz.m) - 1;
                        if (i7 >= 0) {
                            dArr = f14110OooOOo0;
                            if (i7 < 8) {
                                d = dArr[i7];
                                int i21 = oooO00o.f14130OooO0OO + 9;
                                i8 = (bArrCopyOf[i21] & 96) >> 5;
                                i9 = bArrCopyOf[i21] & 31;
                                if (i8 != i9) {
                                    d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            } else {
                                i14 = i14;
                                i13 = i13;
                                j = 0;
                            }
                        } else {
                            i14 = i14;
                            i13 = i13;
                            j = 0;
                        }
                        Pair pairCreate2 = Pair.create(format2, Long.valueOf(j));
                        this.f14113OooO0O0.OooO0o0((Format) pairCreate2.first);
                        this.f14121OooOO0O = ((Long) pairCreate2.second).longValue();
                        this.f14120OooOO0 = true;
                    } else {
                        i14 = i14;
                        i13 = i13;
                    }
                } else if (i14 == 179) {
                    oooO00o2.f14128OooO00o = true;
                }
                oooO00o2.OooO00o(OooO00o.f14127OooO0o0, 0, 3);
                z = false;
                if (z) {
                    oooO00o = this.f14118OooO0oO;
                    String str2 = this.f14112OooO00o;
                    Objects.requireNonNull(str2);
                    bArrCopyOf = Arrays.copyOf(oooO00o.f14131OooO0Oo, oooO00o.f14129OooO0O0);
                    int i110 = bArrCopyOf[4] & UByte.MAX_VALUE;
                    int i111 = bArrCopyOf[5] & UByte.MAX_VALUE;
                    i3 = (i110 << 4) | (i111 >> 4);
                    i4 = (bArrCopyOf[6] & UByte.MAX_VALUE) | ((i111 & 15) << 8);
                    i5 = (bArrCopyOf[7] & 240) >> 4;
                    if (i5 != 2) {
                        f = i4 * 4;
                        i6 = i3 * 3;
                    } else if (i5 != 3) {
                        if (i5 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i4 * 121;
                            i6 = i3 * 100;
                        }
                        Format.OooO0O0 oooO0O2 = new Format.OooO0O0();
                        oooO0O2.f13154OooO00o = str2;
                        oooO0O2.f13163OooOO0O = "video/mpeg2";
                        oooO0O2.f13168OooOOOo = i3;
                        oooO0O2.f13170OooOOo0 = i4;
                        oooO0O2.f13174OooOo00 = f2;
                        oooO0O2.f13166OooOOO0 = Collections.singletonList(bArrCopyOf);
                        Format format3 = new Format(oooO0O2);
                        i7 = (bArrCopyOf[7] & bz.m) - 1;
                        if (i7 >= 0) {
                            dArr = f14110OooOOo0;
                            if (i7 < 8) {
                                d = dArr[i7];
                                int i22 = oooO00o.f14130OooO0OO + 9;
                                i8 = (bArrCopyOf[i22] & 96) >> 5;
                                i9 = bArrCopyOf[i22] & 31;
                                if (i8 != i9) {
                                    d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            } else {
                                i14 = i14;
                                i13 = i13;
                                j = 0;
                            }
                        } else {
                            i14 = i14;
                            i13 = i13;
                            j = 0;
                        }
                        Pair pairCreate3 = Pair.create(format3, Long.valueOf(j));
                        this.f14113OooO0O0.OooO0o0((Format) pairCreate3.first);
                        this.f14121OooOO0O = ((Long) pairCreate3.second).longValue();
                        this.f14120OooOO0 = true;
                    } else {
                        f = i4 * 16;
                        i6 = i3 * 9;
                    }
                    f2 = f / i6;
                    Format.OooO0O0 oooO0O3 = new Format.OooO0O0();
                    oooO0O3.f13154OooO00o = str2;
                    oooO0O3.f13163OooOO0O = "video/mpeg2";
                    oooO0O3.f13168OooOOOo = i3;
                    oooO0O3.f13170OooOOo0 = i4;
                    oooO0O3.f13174OooOo00 = f2;
                    oooO0O3.f13166OooOOO0 = Collections.singletonList(bArrCopyOf);
                    Format format4 = new Format(oooO0O3);
                    i7 = (bArrCopyOf[7] & bz.m) - 1;
                    if (i7 >= 0) {
                        dArr = f14110OooOOo0;
                        if (i7 < 8) {
                            d = dArr[i7];
                            int i23 = oooO00o.f14130OooO0OO + 9;
                            i8 = (bArrCopyOf[i23] & 96) >> 5;
                            i9 = bArrCopyOf[i23] & 31;
                            if (i8 != i9) {
                                d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        } else {
                            i14 = i14;
                            i13 = i13;
                            j = 0;
                        }
                    } else {
                        i14 = i14;
                        i13 = i13;
                        j = 0;
                    }
                    Pair pairCreate4 = Pair.create(format4, Long.valueOf(j));
                    this.f14113OooO0O0.OooO0o0((Format) pairCreate4.first);
                    this.f14121OooOO0O = ((Long) pairCreate4.second).longValue();
                    this.f14120OooOO0 = true;
                } else {
                    i14 = i14;
                    i13 = i13;
                }
            }
            o00 o00Var = this.f14117OooO0o0;
            if (o00Var != null) {
                if (i15 > 0) {
                    o00Var.OooO00o(bArr, i10, iOooO0O0);
                    i2 = 0;
                } else {
                    i2 = -i15;
                }
                if (this.f14117OooO0o0.OooO0O0(i2)) {
                    o00 o00Var2 = this.f14117OooO0o0;
                    int iOooO0o0 = o0000O.OooO0o0(o00Var2.f36071OooO0Oo, o00Var2.f36072OooO0o0);
                    o000 o000Var2 = this.f14115OooO0Oo;
                    int i24 = o000OOo0.f36740OooO00o;
                    o000Var2.OooOoO0(this.f14117OooO0o0.f36071OooO0Oo, iOooO0o0);
                    this.f14114OooO0OO.OooO00o(this.f14123OooOOO, this.f14115OooO0Oo);
                }
                i = i14;
                if (i == 178 && o000Var.f36661OooO00o[iOooO0O0 + 2] == 1) {
                    this.f14117OooO0o0.OooO0Oo(i);
                }
            } else {
                i = i14;
            }
            if (i == 0 || i == 179) {
                int i25 = i11 - iOooO0O0;
                if (this.f14111OooO && this.f14126OooOOOo && this.f14120OooOO0) {
                    this.f14113OooO0O0.OooO0Oo(this.f14123OooOOO, this.f14125OooOOOO ? 1 : 0, ((int) (this.f14119OooO0oo - this.f14124OooOOO0)) - i25, i25, null);
                }
                boolean z2 = this.f14111OooO;
                if (!z2 || this.f14126OooOOOo) {
                    this.f14124OooOOO0 = this.f14119OooO0oo - ((long) i25);
                    long j2 = this.f14122OooOO0o;
                    if (j2 == -9223372036854775807L) {
                        j2 = z2 ? this.f14123OooOOO + this.f14121OooOO0O : 0L;
                    }
                    this.f14123OooOOO = j2;
                    this.f14125OooOOOO = false;
                    this.f14122OooOO0o = -9223372036854775807L;
                    this.f14111OooO = true;
                }
                this.f14126OooOOOo = i == 0;
            } else if (i == 184) {
                this.f14125OooOOOO = true;
            }
            i10 = i13;
        }
        if (!this.f14120OooOO0) {
            this.f14118OooO0oO.OooO00o(bArr, i10, i11);
        }
        o00 o00Var3 = this.f14117OooO0o0;
        if (o00Var3 != null) {
            o00Var3.OooO00o(bArr, i10, i11);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        o0000O.OooO00o(this.f14116OooO0o);
        OooO00o oooO00o = this.f14118OooO0oO;
        oooO00o.f14128OooO00o = false;
        oooO00o.f14129OooO0O0 = 0;
        oooO00o.f14130OooO0OO = 0;
        o00 o00Var = this.f14117OooO0o0;
        if (o00Var != null) {
            o00Var.OooO0OO();
        }
        this.f14119OooO0oo = 0L;
        this.f14111OooO = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14122OooOO0o = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14112OooO00o = oooO0o.OooO0O0();
        this.f14113OooO0O0 = o0oooo1.OooO00o(oooO0o.OooO0OO());
        o0ooOOo o0ooooo2 = this.f14114OooO0OO;
        if (o0ooooo2 != null) {
            o0ooooo2.OooO0O0(o0oooo1, oooO0o);
        }
    }
}
