package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final double[] f12180OooOOo0 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f12181OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f12182OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f12183OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f12184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o00Oo00 f12185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final p211o00oO0.Oooo000 f12187OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12189OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f12190OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f12191OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12192OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f12193OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f12194OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f12195OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f12196OooOOOo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f12186OooO0o = new boolean[4];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f12188OooO0oO = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final byte[] f12197OooO0o0 = {0, 0, 1};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f12198OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f12199OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f12200OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f12201OooO0Oo = new byte[128];

        public final void OooO00o(int i, int i2, byte[] bArr) {
            if (this.f12198OooO00o) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f12201OooO0Oo;
                int length = bArr2.length;
                int i4 = this.f12199OooO0O0;
                if (length < i4 + i3) {
                    this.f12201OooO0Oo = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f12201OooO0Oo, this.f12199OooO0O0, i3);
                this.f12199OooO0O0 += i3;
            }
        }
    }

    public OooOOO(@Nullable o0ooOOo o0ooooo) {
        this.f12184OooO0OO = o0ooooo;
        if (o0ooooo != null) {
            this.f12187OooO0o0 = new p211o00oO0.Oooo000(178);
            this.f12185OooO0Oo = new o00Oo00();
        } else {
            this.f12187OooO0o0 = null;
            this.f12185OooO0Oo = null;
        }
        this.f12192OooOO0o = -9223372036854775807L;
        this.f12193OooOOO = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
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
        OooO00o oooO00o;
        p211o00oO0.Oooo000 oooo000;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        float f2;
        int i6;
        long j;
        o00Oo00 o00oo01 = o00oo00;
        o00O000o.OooO0o0(this.f12183OooO0O0);
        int i7 = o00oo01.f40592OooO0O0;
        int i8 = o00oo01.f40593OooO0OO;
        byte[] bArr = o00oo01.f40591OooO00o;
        int i9 = i8 - i7;
        this.f12189OooO0oo += (long) i9;
        this.f12183OooO0O0.OooO0O0(i9, o00oo01);
        while (true) {
            int iOooO0O0 = oo0O.OooO0O0(bArr, i7, i8, this.f12186OooO0o);
            oooO00o = this.f12188OooO0oO;
            oooo000 = this.f12187OooO0o0;
            if (iOooO0O0 == i8) {
                break;
            }
            int i10 = iOooO0O0 + 3;
            int i11 = o00oo01.f40591OooO00o[i10] & UByte.MAX_VALUE;
            int i12 = iOooO0O0 - i7;
            if (this.f12190OooOO0) {
                i7 = i7;
            } else {
                if (i12 > 0) {
                    oooO00o.OooO00o(i7, iOooO0O0, bArr);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                if (oooO00o.f12198OooO00o) {
                    int i14 = oooO00o.f12199OooO0O0 - i13;
                    oooO00o.f12199OooO0O0 = i14;
                    if (oooO00o.f12200OooO0OO == 0 && i11 == 181) {
                        oooO00o.f12200OooO0OO = i14;
                    } else {
                        oooO00o.f12198OooO00o = false;
                        z3 = true;
                    }
                    if (z3) {
                        String str = this.f12182OooO00o;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(oooO00o.f12201OooO0Oo, oooO00o.f12199OooO0O0);
                        int i15 = bArrCopyOf[4] & UByte.MAX_VALUE;
                        int i16 = bArrCopyOf[5] & UByte.MAX_VALUE;
                        i2 = (i15 << 4) | (i16 >> 4);
                        i3 = (bArrCopyOf[6] & UByte.MAX_VALUE) | ((i16 & 15) << 8);
                        i4 = (bArrCopyOf[7] & 240) >> 4;
                        if (i4 != 2) {
                            f = i3 * 4;
                            i5 = i2 * 3;
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i3 * 121;
                                i5 = i2 * 100;
                            }
                            com.google.android.exoplayer2.OooOo.OooO00o oooO00o2 = new com.google.android.exoplayer2.OooOo.OooO00o();
                            oooO00o2.f11235OooO00o = str;
                            oooO00o2.f11244OooOO0O = "video/mpeg2";
                            oooO00o2.f11249OooOOOo = i2;
                            oooO00o2.f11251OooOOo0 = i3;
                            oooO00o2.f11255OooOo00 = f2;
                            oooO00o2.f11247OooOOO0 = Collections.singletonList(bArrCopyOf);
                            com.google.android.exoplayer2.OooOo oooOo = new com.google.android.exoplayer2.OooOo(oooO00o2);
                            i6 = (bArrCopyOf[7] & 15) - 1;
                            if (i6 >= 0 || i6 >= 8) {
                                i7 = i7;
                                j = 0;
                            } else {
                                double d = f12180OooOOo0[i6];
                                byte b = bArrCopyOf[oooO00o.f12200OooO0OO + 9];
                                int i17 = (b & 96) >> 5;
                                int i18 = b & 31;
                                if (i17 != i18) {
                                    d *= (((double) i17) + 1.0d) / ((double) (i18 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(oooOo, Long.valueOf(j));
                            this.f12183OooO0O0.OooO0OO((com.google.android.exoplayer2.OooOo) pairCreate.first);
                            this.f12191OooOO0O = ((Long) pairCreate.second).longValue();
                            this.f12190OooOO0 = true;
                        } else {
                            f = i3 * 16;
                            i5 = i2 * 9;
                        }
                        f2 = f / i5;
                        com.google.android.exoplayer2.OooOo.OooO00o oooO00o3 = new com.google.android.exoplayer2.OooOo.OooO00o();
                        oooO00o3.f11235OooO00o = str;
                        oooO00o3.f11244OooOO0O = "video/mpeg2";
                        oooO00o3.f11249OooOOOo = i2;
                        oooO00o3.f11251OooOOo0 = i3;
                        oooO00o3.f11255OooOo00 = f2;
                        oooO00o3.f11247OooOOO0 = Collections.singletonList(bArrCopyOf);
                        com.google.android.exoplayer2.OooOo oooOo2 = new com.google.android.exoplayer2.OooOo(oooO00o3);
                        i6 = (bArrCopyOf[7] & 15) - 1;
                        if (i6 >= 0) {
                            i7 = i7;
                            j = 0;
                        } else {
                            i7 = i7;
                            j = 0;
                        }
                        Pair pairCreate2 = Pair.create(oooOo2, Long.valueOf(j));
                        this.f12183OooO0O0.OooO0OO((com.google.android.exoplayer2.OooOo) pairCreate2.first);
                        this.f12191OooOO0O = ((Long) pairCreate2.second).longValue();
                        this.f12190OooOO0 = true;
                    } else {
                        i7 = i7;
                    }
                } else if (i11 == 179) {
                    oooO00o.f12198OooO00o = true;
                }
                oooO00o.OooO00o(0, 3, OooO00o.f12197OooO0o0);
                z3 = false;
                if (z3) {
                    String str2 = this.f12182OooO00o;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(oooO00o.f12201OooO0Oo, oooO00o.f12199OooO0O0);
                    int i19 = bArrCopyOf2[4] & UByte.MAX_VALUE;
                    int i110 = bArrCopyOf2[5] & UByte.MAX_VALUE;
                    i2 = (i19 << 4) | (i110 >> 4);
                    i3 = (bArrCopyOf2[6] & UByte.MAX_VALUE) | ((i110 & 15) << 8);
                    i4 = (bArrCopyOf2[7] & 240) >> 4;
                    if (i4 != 2) {
                        f = i3 * 4;
                        i5 = i2 * 3;
                    } else if (i4 != 3) {
                        if (i4 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i3 * 121;
                            i5 = i2 * 100;
                        }
                        com.google.android.exoplayer2.OooOo.OooO00o oooO00o4 = new com.google.android.exoplayer2.OooOo.OooO00o();
                        oooO00o4.f11235OooO00o = str2;
                        oooO00o4.f11244OooOO0O = "video/mpeg2";
                        oooO00o4.f11249OooOOOo = i2;
                        oooO00o4.f11251OooOOo0 = i3;
                        oooO00o4.f11255OooOo00 = f2;
                        oooO00o4.f11247OooOOO0 = Collections.singletonList(bArrCopyOf2);
                        com.google.android.exoplayer2.OooOo oooOo3 = new com.google.android.exoplayer2.OooOo(oooO00o4);
                        i6 = (bArrCopyOf2[7] & 15) - 1;
                        if (i6 >= 0) {
                            i7 = i7;
                            j = 0;
                        } else {
                            i7 = i7;
                            j = 0;
                        }
                        Pair pairCreate3 = Pair.create(oooOo3, Long.valueOf(j));
                        this.f12183OooO0O0.OooO0OO((com.google.android.exoplayer2.OooOo) pairCreate3.first);
                        this.f12191OooOO0O = ((Long) pairCreate3.second).longValue();
                        this.f12190OooOO0 = true;
                    } else {
                        f = i3 * 16;
                        i5 = i2 * 9;
                    }
                    f2 = f / i5;
                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o5 = new com.google.android.exoplayer2.OooOo.OooO00o();
                    oooO00o5.f11235OooO00o = str2;
                    oooO00o5.f11244OooOO0O = "video/mpeg2";
                    oooO00o5.f11249OooOOOo = i2;
                    oooO00o5.f11251OooOOo0 = i3;
                    oooO00o5.f11255OooOo00 = f2;
                    oooO00o5.f11247OooOOO0 = Collections.singletonList(bArrCopyOf2);
                    com.google.android.exoplayer2.OooOo oooOo4 = new com.google.android.exoplayer2.OooOo(oooO00o5);
                    i6 = (bArrCopyOf2[7] & 15) - 1;
                    if (i6 >= 0) {
                        i7 = i7;
                        j = 0;
                    } else {
                        i7 = i7;
                        j = 0;
                    }
                    Pair pairCreate4 = Pair.create(oooOo4, Long.valueOf(j));
                    this.f12183OooO0O0.OooO0OO((com.google.android.exoplayer2.OooOo) pairCreate4.first);
                    this.f12191OooOO0O = ((Long) pairCreate4.second).longValue();
                    this.f12190OooOO0 = true;
                } else {
                    i7 = i7;
                }
            }
            if (oooo000 == null) {
                o00oo01 = o00oo00;
            } else {
                if (i12 > 0) {
                    oooo000.OooO00o(i7, iOooO0O0, bArr);
                    i = 0;
                } else {
                    i = -i12;
                }
                if (oooo000.OooO0O0(i)) {
                    int iOooO0o0 = oo0O.OooO0o0(oooo000.f39601OooO0o0, oooo000.f39600OooO0Oo);
                    int i20 = o0O00.f40595OooO00o;
                    byte[] bArr2 = oooo000.f39600OooO0Oo;
                    o00Oo00 o00oo02 = this.f12185OooO0Oo;
                    o00oo02.OooOooo(iOooO0o0, bArr2);
                    this.f12184OooO0OO.OooO00o(this.f12193OooOOO, o00oo02);
                }
                if (i11 == 178) {
                    o00oo01 = o00oo00;
                    if (o00oo01.f40591OooO00o[iOooO0O0 + 2] == 1) {
                        oooo000.OooO0Oo(i11);
                    }
                } else {
                    o00oo01 = o00oo00;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i21 = i8 - iOooO0O0;
                if (this.f12196OooOOOo && this.f12190OooOO0) {
                    long j2 = this.f12193OooOOO;
                    if (j2 != -9223372036854775807L) {
                        this.f12183OooO0O0.OooO0o0(j2, this.f12195OooOOOO ? 1 : 0, ((int) (this.f12189OooO0oo - this.f12194OooOOO0)) - i21, i21, null);
                    }
                }
                if (!this.f12181OooO || this.f12196OooOOOo) {
                    this.f12194OooOOO0 = this.f12189OooO0oo - ((long) i21);
                    long j3 = this.f12192OooOO0o;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f12193OooOOO;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f12191OooOO0O : -9223372036854775807L;
                    }
                    this.f12193OooOOO = j3;
                    z = false;
                    this.f12195OooOOOO = false;
                    this.f12192OooOO0o = -9223372036854775807L;
                    z2 = true;
                    this.f12181OooO = true;
                } else {
                    z = false;
                    z2 = true;
                }
                this.f12196OooOOOo = i11 == 0 ? z2 : z;
            } else if (i11 == 184) {
                this.f12195OooOOOO = true;
            }
            i7 = i10;
        }
        if (!this.f12190OooOO0) {
            oooO00o.OooO00o(i7, i8, bArr);
        }
        if (oooo000 != null) {
            oooo000.OooO00o(i7, i8, bArr);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        oo0O.OooO00o(this.f12186OooO0o);
        OooO00o oooO00o = this.f12188OooO0oO;
        oooO00o.f12198OooO00o = false;
        oooO00o.f12199OooO0O0 = 0;
        oooO00o.f12200OooO0OO = 0;
        p211o00oO0.Oooo000 oooo000 = this.f12187OooO0o0;
        if (oooo000 != null) {
            oooo000.OooO0OO();
        }
        this.f12189OooO0oo = 0L;
        this.f12181OooO = false;
        this.f12192OooOO0o = -9223372036854775807L;
        this.f12193OooOOO = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12182OooO00o = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        this.f12183OooO0O0 = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 2);
        o0ooOOo o0ooooo = this.f12184OooO0OO;
        if (o0ooooo != null) {
            o0ooooo.OooO0O0(o00o0o0, oooO0o);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        this.f12192OooOO0o = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
