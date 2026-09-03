package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import p080o000OoO.o00;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float[] f8969OooOO0o = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TrackOutput f8970OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f8971OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0 f8975OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f8977OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f8978OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f8979OooOO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean[] f8973OooO0OO = new boolean[4];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f8974OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f8980OooOO0O = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final p103o000oo00.o000oOoO f8976OooO0o0 = new p103o000oo00.o000oOoO(178);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o000O000 f8972OooO0O0 = new o000O000();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final byte[] f8981OooO0o = {0, 0, 1};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f8982OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8983OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8984OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8985OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public byte[] f8986OooO0o0 = new byte[128];

        public final void OooO00o(int i, int i2, byte[] bArr) {
            if (this.f8982OooO00o) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f8986OooO0o0;
                int length = bArr2.length;
                int i4 = this.f8984OooO0OO;
                if (length < i4 + i3) {
                    this.f8986OooO0o0 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f8986OooO0o0, this.f8984OooO0OO, i3);
                this.f8984OooO0OO += i3;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f8987OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f8988OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f8989OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f8990OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8991OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8992OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f8993OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f8994OooO0oo;

        public OooO0O0(TrackOutput trackOutput) {
            this.f8987OooO00o = trackOutput;
        }

        public final void OooO00o(int i, int i2, byte[] bArr) {
            if (this.f8989OooO0OO) {
                int i3 = this.f8991OooO0o;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f8991OooO0o = (i2 - i) + i3;
                } else {
                    this.f8990OooO0Oo = ((bArr[i4] & 192) >> 6) == 0;
                    this.f8989OooO0OO = false;
                }
            }
        }
    }

    public OooOOOO(@Nullable o0ooOOo o0ooooo) {
        this.f8971OooO00o = o0ooooo;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        p070o000O0o.Oooo0.OooO00o(this.f8973OooO0OO);
        OooO00o oooO00o = this.f8974OooO0Oo;
        oooO00o.f8982OooO00o = false;
        oooO00o.f8984OooO0OO = 0;
        oooO00o.f8983OooO0O0 = 0;
        OooO0O0 oooO0O0 = this.f8975OooO0o;
        if (oooO0O0 != null) {
            oooO0O0.f8988OooO0O0 = false;
            oooO0O0.f8989OooO0OO = false;
            oooO0O0.f8990OooO0Oo = false;
            oooO0O0.f8992OooO0o0 = -1;
        }
        p103o000oo00.o000oOoO o000oooo2 = this.f8976OooO0o0;
        if (o000oooo2 != null) {
            o000oooo2.OooO0OO();
        }
        this.f8977OooO0oO = 0L;
        this.f8980OooOO0O = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0192  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:81:0x019d A[LOOP:1: B:80:0x019b->B:81:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x0220  */
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
        boolean z;
        int i;
        boolean z2;
        o000 o000Var;
        int iOooO0oO;
        float f;
        int iOooO0oO2;
        int i2;
        int i3;
        int iOooO0oO3;
        int iOooO0oO4;
        p080o000OoO.o00Oo0.OooO0o(this.f8975OooO0o);
        p080o000OoO.o00Oo0.OooO0o(this.f8970OooO);
        int i4 = o000o001.f34963OooO0O0;
        int i5 = o000o001.f34964OooO0OO;
        byte[] bArr = o000o001.f34962OooO00o;
        int i6 = i5 - i4;
        this.f8977OooO0oO += (long) i6;
        this.f8970OooO.OooO0OO(i6, o000o001);
        while (true) {
            int iOooO0O0 = p070o000O0o.Oooo0.OooO0O0(bArr, i4, i5, this.f8973OooO0OO);
            OooO00o oooO00o = this.f8974OooO0Oo;
            p103o000oo00.o000oOoO o000oooo2 = this.f8976OooO0o0;
            if (iOooO0O0 == i5) {
                if (!this.f8979OooOO0) {
                    oooO00o.OooO00o(i4, i5, bArr);
                }
                this.f8975OooO0o.OooO00o(i4, i5, bArr);
                if (o000oooo2 != null) {
                    o000oooo2.OooO00o(i4, i5, bArr);
                    return;
                }
                return;
            }
            int i7 = iOooO0O0 + 3;
            int i8 = o000o001.f34962OooO00o[i7] & UByte.MAX_VALUE;
            int i9 = iOooO0O0 - i4;
            if (!this.f8979OooOO0) {
                if (i9 > 0) {
                    oooO00o.OooO00o(i4, iOooO0O0, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = oooO00o.f8983OooO0O0;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i8 == 179 || i8 == 181) {
                                    oooO00o.f8984OooO0OO -= i10;
                                    oooO00o.f8982OooO00o = false;
                                    z2 = true;
                                }
                                if (z2) {
                                    TrackOutput trackOutput = this.f8970OooO;
                                    int i12 = oooO00o.f8985OooO0Oo;
                                    String str = this.f8978OooO0oo;
                                    str.getClass();
                                    byte[] bArrCopyOf = Arrays.copyOf(oooO00o.f8986OooO0o0, oooO00o.f8984OooO0OO);
                                    o000Var = new o000(bArrCopyOf, bArrCopyOf.length);
                                    o000Var.OooOOO(i12);
                                    o000Var.OooOOO(4);
                                    o000Var.OooOO0o();
                                    o000Var.OooOOO0(8);
                                    if (o000Var.OooO0o()) {
                                        o000Var.OooOOO0(4);
                                        o000Var.OooOOO0(3);
                                    }
                                    iOooO0oO = o000Var.OooO0oO(4);
                                    if (iOooO0oO == 15) {
                                        iOooO0oO3 = o000Var.OooO0oO(8);
                                        iOooO0oO4 = o000Var.OooO0oO(8);
                                        if (iOooO0oO4 == 0) {
                                            Log.OooO0o("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        } else {
                                            f = iOooO0oO3 / iOooO0oO4;
                                        }
                                    } else if (iOooO0oO < 7) {
                                        f = f8969OooOO0o[iOooO0oO];
                                    } else {
                                        Log.OooO0o("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    }
                                    if (o000Var.OooO0o()) {
                                        o000Var.OooOOO0(2);
                                        o000Var.OooOOO0(1);
                                        if (o000Var.OooO0o()) {
                                            o000Var.OooOOO0(15);
                                            o000Var.OooOO0o();
                                            o000Var.OooOOO0(15);
                                            o000Var.OooOO0o();
                                            o000Var.OooOOO0(15);
                                            o000Var.OooOO0o();
                                            o000Var.OooOOO0(3);
                                            o000Var.OooOOO0(11);
                                            o000Var.OooOO0o();
                                            o000Var.OooOOO0(15);
                                            o000Var.OooOO0o();
                                        }
                                    }
                                    if (o000Var.OooO0oO(2) != 0) {
                                        Log.OooO0o("H263Reader", "Unhandled video object layer shape");
                                    }
                                    o000Var.OooOO0o();
                                    iOooO0oO2 = o000Var.OooO0oO(16);
                                    o000Var.OooOO0o();
                                    if (o000Var.OooO0o()) {
                                        if (iOooO0oO2 == 0) {
                                            Log.OooO0o("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i3 = 0;
                                            for (i2 = iOooO0oO2 - 1; i2 > 0; i2 >>= 1) {
                                                i3++;
                                            }
                                            o000Var.OooOOO0(i3);
                                        }
                                    }
                                    o000Var.OooOO0o();
                                    int iOooO0oO5 = o000Var.OooO0oO(13);
                                    o000Var.OooOO0o();
                                    int iOooO0oO6 = o000Var.OooO0oO(13);
                                    o000Var.OooOO0o();
                                    o000Var.OooOO0o();
                                    androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o();
                                    oooO00o2.f6436OooO00o = str;
                                    oooO00o2.f6445OooOO0O = "video/mp4v-es";
                                    oooO00o2.f6450OooOOOo = iOooO0oO5;
                                    oooO00o2.f6452OooOOo0 = iOooO0oO6;
                                    oooO00o2.f6456OooOo00 = f;
                                    oooO00o2.f6448OooOOO0 = Collections.singletonList(bArrCopyOf);
                                    trackOutput.OooO0O0(new androidx.media3.common.OooOO0(oooO00o2));
                                    this.f8979OooOO0 = true;
                                }
                            } else if ((i8 & 240) != 32) {
                                Log.OooO0o("H263Reader", "Unexpected start code value");
                                oooO00o.f8982OooO00o = false;
                                oooO00o.f8984OooO0OO = 0;
                                oooO00o.f8983OooO0O0 = 0;
                            } else {
                                oooO00o.f8985OooO0Oo = oooO00o.f8984OooO0OO;
                                oooO00o.f8983OooO0O0 = 4;
                            }
                        } else if (i8 > 31) {
                            Log.OooO0o("H263Reader", "Unexpected start code value");
                            oooO00o.f8982OooO00o = false;
                            oooO00o.f8984OooO0OO = 0;
                            oooO00o.f8983OooO0O0 = 0;
                        } else {
                            oooO00o.f8983OooO0O0 = 3;
                        }
                    } else if (i8 != 181) {
                        Log.OooO0o("H263Reader", "Unexpected start code value");
                        oooO00o.f8982OooO00o = false;
                        oooO00o.f8984OooO0OO = 0;
                        oooO00o.f8983OooO0O0 = 0;
                    } else {
                        oooO00o.f8983OooO0O0 = 2;
                    }
                } else if (i8 == 176) {
                    oooO00o.f8983OooO0O0 = 1;
                    oooO00o.f8982OooO00o = true;
                }
                oooO00o.OooO00o(0, 3, OooO00o.f8981OooO0o);
                z2 = false;
                if (z2) {
                    TrackOutput trackOutput2 = this.f8970OooO;
                    int i13 = oooO00o.f8985OooO0Oo;
                    String str2 = this.f8978OooO0oo;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(oooO00o.f8986OooO0o0, oooO00o.f8984OooO0OO);
                    o000Var = new o000(bArrCopyOf2, bArrCopyOf2.length);
                    o000Var.OooOOO(i13);
                    o000Var.OooOOO(4);
                    o000Var.OooOO0o();
                    o000Var.OooOOO0(8);
                    if (o000Var.OooO0o()) {
                        o000Var.OooOOO0(4);
                        o000Var.OooOOO0(3);
                    }
                    iOooO0oO = o000Var.OooO0oO(4);
                    if (iOooO0oO == 15) {
                        iOooO0oO3 = o000Var.OooO0oO(8);
                        iOooO0oO4 = o000Var.OooO0oO(8);
                        if (iOooO0oO4 == 0) {
                            Log.OooO0o("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iOooO0oO3 / iOooO0oO4;
                        }
                    } else if (iOooO0oO < 7) {
                        f = f8969OooOO0o[iOooO0oO];
                    } else {
                        Log.OooO0o("H263Reader", "Invalid aspect ratio");
                        f = 1.0f;
                    }
                    if (o000Var.OooO0o()) {
                        o000Var.OooOOO0(2);
                        o000Var.OooOOO0(1);
                        if (o000Var.OooO0o()) {
                            o000Var.OooOOO0(15);
                            o000Var.OooOO0o();
                            o000Var.OooOOO0(15);
                            o000Var.OooOO0o();
                            o000Var.OooOOO0(15);
                            o000Var.OooOO0o();
                            o000Var.OooOOO0(3);
                            o000Var.OooOOO0(11);
                            o000Var.OooOO0o();
                            o000Var.OooOOO0(15);
                            o000Var.OooOO0o();
                        }
                    }
                    if (o000Var.OooO0oO(2) != 0) {
                        Log.OooO0o("H263Reader", "Unhandled video object layer shape");
                    }
                    o000Var.OooOO0o();
                    iOooO0oO2 = o000Var.OooO0oO(16);
                    o000Var.OooOO0o();
                    if (o000Var.OooO0o()) {
                        if (iOooO0oO2 == 0) {
                            Log.OooO0o("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i3 = 0;
                            while (i2 > 0) {
                                i3++;
                            }
                            o000Var.OooOOO0(i3);
                        }
                    }
                    o000Var.OooOO0o();
                    int iOooO0oO7 = o000Var.OooO0oO(13);
                    o000Var.OooOO0o();
                    int iOooO0oO8 = o000Var.OooO0oO(13);
                    o000Var.OooOO0o();
                    o000Var.OooOO0o();
                    androidx.media3.common.OooOO0.OooO00o oooO00o3 = new androidx.media3.common.OooOO0.OooO00o();
                    oooO00o3.f6436OooO00o = str2;
                    oooO00o3.f6445OooOO0O = "video/mp4v-es";
                    oooO00o3.f6450OooOOOo = iOooO0oO7;
                    oooO00o3.f6452OooOOo0 = iOooO0oO8;
                    oooO00o3.f6456OooOo00 = f;
                    oooO00o3.f6448OooOOO0 = Collections.singletonList(bArrCopyOf2);
                    trackOutput2.OooO0O0(new androidx.media3.common.OooOO0(oooO00o3));
                    this.f8979OooOO0 = true;
                }
            }
            this.f8975OooO0o.OooO00o(i4, iOooO0O0, bArr);
            if (o000oooo2 == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    o000oooo2.OooO00o(i4, iOooO0O0, bArr);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (o000oooo2.OooO0O0(i)) {
                    int iOooO0o0 = p070o000O0o.Oooo0.OooO0o0(o000oooo2.f35668OooO0o0, o000oooo2.f35667OooO0Oo);
                    int i14 = o00.f34910OooO00o;
                    byte[] bArr2 = o000oooo2.f35667OooO0Oo;
                    o000O000 o000o002 = this.f8972OooO0O0;
                    o000o002.OooOooo(iOooO0o0, bArr2);
                    this.f8971OooO00o.OooO00o(this.f8980OooOO0O, o000o002);
                }
                if (i8 == 178) {
                    z = true;
                    if (o000o001.f34962OooO00o[iOooO0O0 + 2] == 1) {
                        o000oooo2.OooO0Oo(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i5 - iOooO0O0;
            long j = this.f8977OooO0oO - ((long) i15);
            OooO0O0 oooO0O0 = this.f8975OooO0o;
            boolean z3 = this.f8979OooOO0;
            if (oooO0O0.f8992OooO0o0 == 182 && z3 && oooO0O0.f8988OooO0O0) {
                long j2 = oooO0O0.f8994OooO0oo;
                if (j2 != -9223372036854775807L) {
                    oooO0O0.f8987OooO00o.OooO0o0(j2, oooO0O0.f8990OooO0Oo ? 1 : 0, (int) (j - oooO0O0.f8993OooO0oO), i15, null);
                }
            }
            if (oooO0O0.f8992OooO0o0 != 179) {
                oooO0O0.f8993OooO0oO = j;
            }
            OooO0O0 oooO0O1 = this.f8975OooO0o;
            long j3 = this.f8980OooOO0O;
            oooO0O1.f8992OooO0o0 = i8;
            oooO0O1.f8990OooO0Oo = false;
            oooO0O1.f8988OooO0O0 = (i8 == 182 || i8 == 179) ? z : false;
            oooO0O1.f8989OooO0OO = i8 == 182 ? z : false;
            oooO0O1.f8991OooO0o = 0;
            oooO0O1.f8994OooO0oo = j3;
            i4 = i7;
            i5 = i5;
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f8978OooO0oo = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 2);
        this.f8970OooO = trackOutputOooOOOO;
        this.f8975OooO0o = new OooO0O0(trackOutputOooOOOO);
        o0ooOOo o0ooooo = this.f8971OooO00o;
        if (o0ooooo != null) {
            o0ooooo.OooO0O0(oooo0, oooO0o);
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f8980OooOO0O = j;
        }
    }
}
