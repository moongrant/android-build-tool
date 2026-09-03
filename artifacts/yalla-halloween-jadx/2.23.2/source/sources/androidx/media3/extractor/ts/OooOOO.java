package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import p080o000OoO.o00;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final double[] f8947OooOOo0 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f8948OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f8949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f8950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f8951OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o000O000 f8952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final p103o000oo00.o000oOoO f8954OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f8956OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f8957OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f8958OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f8959OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f8960OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f8961OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f8962OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f8963OooOOOo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f8953OooO0o = new boolean[4];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f8955OooO0oO = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final byte[] f8964OooO0o0 = {0, 0, 1};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f8965OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8966OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8967OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f8968OooO0Oo = new byte[128];

        public final void OooO00o(int i, int i2, byte[] bArr) {
            if (this.f8965OooO00o) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f8968OooO0Oo;
                int length = bArr2.length;
                int i4 = this.f8966OooO0O0;
                if (length < i4 + i3) {
                    this.f8968OooO0Oo = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f8968OooO0Oo, this.f8966OooO0O0, i3);
                this.f8966OooO0O0 += i3;
            }
        }
    }

    public OooOOO(@Nullable o0ooOOo o0ooooo) {
        this.f8951OooO0OO = o0ooooo;
        if (o0ooooo != null) {
            this.f8954OooO0o0 = new p103o000oo00.o000oOoO(178);
            this.f8952OooO0Oo = new o000O000();
        } else {
            this.f8954OooO0o0 = null;
            this.f8952OooO0Oo = null;
        }
        this.f8959OooOO0o = -9223372036854775807L;
        this.f8960OooOOO = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        p070o000O0o.Oooo0.OooO00o(this.f8953OooO0o);
        OooO00o oooO00o = this.f8955OooO0oO;
        oooO00o.f8965OooO00o = false;
        oooO00o.f8966OooO0O0 = 0;
        oooO00o.f8967OooO0OO = 0;
        p103o000oo00.o000oOoO o000oooo2 = this.f8954OooO0o0;
        if (o000oooo2 != null) {
            o000oooo2.OooO0OO();
        }
        this.f8956OooO0oo = 0L;
        this.f8948OooO = false;
        this.f8959OooOO0o = -9223372036854775807L;
        this.f8960OooOOO = -9223372036854775807L;
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
    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
        OooO00o oooO00o;
        p103o000oo00.o000oOoO o000oooo2;
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
        o000O000 o000o002 = o000o001;
        p080o000OoO.o00Oo0.OooO0o(this.f8950OooO0O0);
        int i7 = o000o002.f34963OooO0O0;
        int i8 = o000o002.f34964OooO0OO;
        byte[] bArr = o000o002.f34962OooO00o;
        int i9 = i8 - i7;
        this.f8956OooO0oo += (long) i9;
        this.f8950OooO0O0.OooO0OO(i9, o000o002);
        while (true) {
            int iOooO0O0 = p070o000O0o.Oooo0.OooO0O0(bArr, i7, i8, this.f8953OooO0o);
            oooO00o = this.f8955OooO0oO;
            o000oooo2 = this.f8954OooO0o0;
            if (iOooO0O0 == i8) {
                break;
            }
            int i10 = iOooO0O0 + 3;
            int i11 = o000o002.f34962OooO00o[i10] & UByte.MAX_VALUE;
            int i12 = iOooO0O0 - i7;
            if (this.f8957OooOO0) {
                i7 = i7;
            } else {
                if (i12 > 0) {
                    oooO00o.OooO00o(i7, iOooO0O0, bArr);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                if (oooO00o.f8965OooO00o) {
                    int i14 = oooO00o.f8966OooO0O0 - i13;
                    oooO00o.f8966OooO0O0 = i14;
                    if (oooO00o.f8967OooO0OO == 0 && i11 == 181) {
                        oooO00o.f8967OooO0OO = i14;
                    } else {
                        oooO00o.f8965OooO00o = false;
                        z3 = true;
                    }
                    if (z3) {
                        String str = this.f8949OooO00o;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(oooO00o.f8968OooO0Oo, oooO00o.f8966OooO0O0);
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
                            androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o();
                            oooO00o2.f6436OooO00o = str;
                            oooO00o2.f6445OooOO0O = "video/mpeg2";
                            oooO00o2.f6450OooOOOo = i2;
                            oooO00o2.f6452OooOOo0 = i3;
                            oooO00o2.f6456OooOo00 = f2;
                            oooO00o2.f6448OooOOO0 = Collections.singletonList(bArrCopyOf);
                            androidx.media3.common.OooOO0 oooOO1 = new androidx.media3.common.OooOO0(oooO00o2);
                            i6 = (bArrCopyOf[7] & 15) - 1;
                            if (i6 >= 0 || i6 >= 8) {
                                i7 = i7;
                                j = 0;
                            } else {
                                double d = f8947OooOOo0[i6];
                                byte b = bArrCopyOf[oooO00o.f8967OooO0OO + 9];
                                int i17 = (b & 96) >> 5;
                                int i18 = b & 31;
                                if (i17 != i18) {
                                    d *= (((double) i17) + 1.0d) / ((double) (i18 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(oooOO1, Long.valueOf(j));
                            this.f8950OooO0O0.OooO0O0((androidx.media3.common.OooOO0) pairCreate.first);
                            this.f8958OooOO0O = ((Long) pairCreate.second).longValue();
                            this.f8957OooOO0 = true;
                        } else {
                            f = i3 * 16;
                            i5 = i2 * 9;
                        }
                        f2 = f / i5;
                        androidx.media3.common.OooOO0.OooO00o oooO00o3 = new androidx.media3.common.OooOO0.OooO00o();
                        oooO00o3.f6436OooO00o = str;
                        oooO00o3.f6445OooOO0O = "video/mpeg2";
                        oooO00o3.f6450OooOOOo = i2;
                        oooO00o3.f6452OooOOo0 = i3;
                        oooO00o3.f6456OooOo00 = f2;
                        oooO00o3.f6448OooOOO0 = Collections.singletonList(bArrCopyOf);
                        androidx.media3.common.OooOO0 oooOO2 = new androidx.media3.common.OooOO0(oooO00o3);
                        i6 = (bArrCopyOf[7] & 15) - 1;
                        if (i6 >= 0) {
                            i7 = i7;
                            j = 0;
                        } else {
                            i7 = i7;
                            j = 0;
                        }
                        Pair pairCreate2 = Pair.create(oooOO2, Long.valueOf(j));
                        this.f8950OooO0O0.OooO0O0((androidx.media3.common.OooOO0) pairCreate2.first);
                        this.f8958OooOO0O = ((Long) pairCreate2.second).longValue();
                        this.f8957OooOO0 = true;
                    } else {
                        i7 = i7;
                    }
                } else if (i11 == 179) {
                    oooO00o.f8965OooO00o = true;
                }
                oooO00o.OooO00o(0, 3, OooO00o.f8964OooO0o0);
                z3 = false;
                if (z3) {
                    String str2 = this.f8949OooO00o;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(oooO00o.f8968OooO0Oo, oooO00o.f8966OooO0O0);
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
                        androidx.media3.common.OooOO0.OooO00o oooO00o4 = new androidx.media3.common.OooOO0.OooO00o();
                        oooO00o4.f6436OooO00o = str2;
                        oooO00o4.f6445OooOO0O = "video/mpeg2";
                        oooO00o4.f6450OooOOOo = i2;
                        oooO00o4.f6452OooOOo0 = i3;
                        oooO00o4.f6456OooOo00 = f2;
                        oooO00o4.f6448OooOOO0 = Collections.singletonList(bArrCopyOf2);
                        androidx.media3.common.OooOO0 oooOO3 = new androidx.media3.common.OooOO0(oooO00o4);
                        i6 = (bArrCopyOf2[7] & 15) - 1;
                        if (i6 >= 0) {
                            i7 = i7;
                            j = 0;
                        } else {
                            i7 = i7;
                            j = 0;
                        }
                        Pair pairCreate3 = Pair.create(oooOO3, Long.valueOf(j));
                        this.f8950OooO0O0.OooO0O0((androidx.media3.common.OooOO0) pairCreate3.first);
                        this.f8958OooOO0O = ((Long) pairCreate3.second).longValue();
                        this.f8957OooOO0 = true;
                    } else {
                        f = i3 * 16;
                        i5 = i2 * 9;
                    }
                    f2 = f / i5;
                    androidx.media3.common.OooOO0.OooO00o oooO00o5 = new androidx.media3.common.OooOO0.OooO00o();
                    oooO00o5.f6436OooO00o = str2;
                    oooO00o5.f6445OooOO0O = "video/mpeg2";
                    oooO00o5.f6450OooOOOo = i2;
                    oooO00o5.f6452OooOOo0 = i3;
                    oooO00o5.f6456OooOo00 = f2;
                    oooO00o5.f6448OooOOO0 = Collections.singletonList(bArrCopyOf2);
                    androidx.media3.common.OooOO0 oooOO4 = new androidx.media3.common.OooOO0(oooO00o5);
                    i6 = (bArrCopyOf2[7] & 15) - 1;
                    if (i6 >= 0) {
                        i7 = i7;
                        j = 0;
                    } else {
                        i7 = i7;
                        j = 0;
                    }
                    Pair pairCreate4 = Pair.create(oooOO4, Long.valueOf(j));
                    this.f8950OooO0O0.OooO0O0((androidx.media3.common.OooOO0) pairCreate4.first);
                    this.f8958OooOO0O = ((Long) pairCreate4.second).longValue();
                    this.f8957OooOO0 = true;
                } else {
                    i7 = i7;
                }
            }
            if (o000oooo2 == null) {
                o000o002 = o000o001;
            } else {
                if (i12 > 0) {
                    o000oooo2.OooO00o(i7, iOooO0O0, bArr);
                    i = 0;
                } else {
                    i = -i12;
                }
                if (o000oooo2.OooO0O0(i)) {
                    int iOooO0o0 = p070o000O0o.Oooo0.OooO0o0(o000oooo2.f35668OooO0o0, o000oooo2.f35667OooO0Oo);
                    int i20 = o00.f34910OooO00o;
                    byte[] bArr2 = o000oooo2.f35667OooO0Oo;
                    o000O000 o000o003 = this.f8952OooO0Oo;
                    o000o003.OooOooo(iOooO0o0, bArr2);
                    this.f8951OooO0OO.OooO00o(this.f8960OooOOO, o000o003);
                }
                if (i11 == 178) {
                    o000o002 = o000o001;
                    if (o000o002.f34962OooO00o[iOooO0O0 + 2] == 1) {
                        o000oooo2.OooO0Oo(i11);
                    }
                } else {
                    o000o002 = o000o001;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i21 = i8 - iOooO0O0;
                if (this.f8963OooOOOo && this.f8957OooOO0) {
                    long j2 = this.f8960OooOOO;
                    if (j2 != -9223372036854775807L) {
                        this.f8950OooO0O0.OooO0o0(j2, this.f8962OooOOOO ? 1 : 0, ((int) (this.f8956OooO0oo - this.f8961OooOOO0)) - i21, i21, null);
                    }
                }
                if (!this.f8948OooO || this.f8963OooOOOo) {
                    this.f8961OooOOO0 = this.f8956OooO0oo - ((long) i21);
                    long j3 = this.f8959OooOO0o;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f8960OooOOO;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f8958OooOO0O : -9223372036854775807L;
                    }
                    this.f8960OooOOO = j3;
                    z = false;
                    this.f8962OooOOOO = false;
                    this.f8959OooOO0o = -9223372036854775807L;
                    z2 = true;
                    this.f8948OooO = true;
                } else {
                    z = false;
                    z2 = true;
                }
                this.f8963OooOOOo = i11 == 0 ? z2 : z;
            } else if (i11 == 184) {
                this.f8962OooOOOO = true;
            }
            i7 = i10;
        }
        if (!this.f8957OooOO0) {
            oooO00o.OooO00o(i7, i8, bArr);
        }
        if (o000oooo2 != null) {
            o000oooo2.OooO00o(i7, i8, bArr);
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f8949OooO00o = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        this.f8950OooO0O0 = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 2);
        o0ooOOo o0ooooo = this.f8951OooO0OO;
        if (o0ooooo != null) {
            o0ooooo.OooO0O0(oooo0, oooO0o);
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        this.f8959OooOO0o = j;
    }
}
