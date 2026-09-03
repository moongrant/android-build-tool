package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
import p302o0O0o00.o00;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000O;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float[] f14132OooOO0o = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TrackOutput f14133OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f14134OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0 f14138OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f14140OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f14141OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f14142OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f14143OooOO0O;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean[] f14136OooO0OO = new boolean[4];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f14137OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00 f14139OooO0o0 = new o00(178);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o000 f14135OooO0O0 = new o000();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final byte[] f14144OooO0o = {0, 0, 1};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f14145OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14146OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14147OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14148OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public byte[] f14149OooO0o0 = new byte[128];

        public final void OooO00o(byte[] bArr, int i, int i2) {
            if (this.f14145OooO00o) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f14149OooO0o0;
                int length = bArr2.length;
                int i4 = this.f14147OooO0OO;
                if (length < i4 + i3) {
                    this.f14149OooO0o0 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f14149OooO0o0, this.f14147OooO0OO, i3);
                this.f14147OooO0OO += i3;
            }
        }

        public final void OooO0O0() {
            this.f14145OooO00o = false;
            this.f14147OooO0OO = 0;
            this.f14146OooO0O0 = 0;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f14150OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f14151OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f14152OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f14153OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f14154OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14155OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f14156OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f14157OooO0oo;

        public OooO0O0(TrackOutput trackOutput) {
            this.f14150OooO00o = trackOutput;
        }

        public final void OooO00o(byte[] bArr, int i, int i2) {
            if (this.f14152OooO0OO) {
                int i3 = this.f14154OooO0o;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f14154OooO0o = (i2 - i) + i3;
                } else {
                    this.f14153OooO0Oo = ((bArr[i4] & 192) >> 6) == 0;
                    this.f14152OooO0OO = false;
                }
            }
        }
    }

    public OooOOOO(@Nullable o0ooOOo o0ooooo2) {
        this.f14134OooO00o = o0ooooo2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0188  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193 A[LOOP:1: B:77:0x0191->B:78:0x0193, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226  */
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
        o0000OO0 o0000oo1;
        int iOooO0oO;
        float[] fArr;
        float f;
        int iOooO0oO2;
        int i3;
        int i4;
        int iOooO0oO3;
        int iOooO0oO4;
        o00000O0.OooO0o(this.f14138OooO0o);
        o00000O0.OooO0o(this.f14133OooO);
        int i5 = o000Var.f36662OooO0O0;
        int i6 = o000Var.f36663OooO0OO;
        byte[] bArr = o000Var.f36661OooO00o;
        int i7 = i6 - i5;
        this.f14140OooO0oO += (long) i7;
        this.f14133OooO.OooO0OO(o000Var, i7);
        while (true) {
            int iOooO0O0 = o0000O.OooO0O0(bArr, i5, i6, this.f14136OooO0OO);
            if (iOooO0O0 == i6) {
                if (!this.f14142OooOO0) {
                    this.f14137OooO0Oo.OooO00o(bArr, i5, i6);
                }
                this.f14138OooO0o.OooO00o(bArr, i5, i6);
                o00 o00Var = this.f14139OooO0o0;
                if (o00Var != null) {
                    o00Var.OooO00o(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i8 = iOooO0O0 + 3;
            int i9 = o000Var.f36661OooO00o[i8] & UByte.MAX_VALUE;
            int i10 = iOooO0O0 - i5;
            if (this.f14142OooOO0) {
                i = i8;
            } else {
                if (i10 > 0) {
                    this.f14137OooO0Oo.OooO00o(bArr, i5, iOooO0O0);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                OooO00o oooO00o = this.f14137OooO0Oo;
                int i12 = oooO00o.f14146OooO0O0;
                if (i12 != 0) {
                    i = i8;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i9 == 179 || i9 == 181) {
                                    oooO00o.f14147OooO0OO -= i11;
                                    oooO00o.f14145OooO00o = false;
                                    z = true;
                                }
                                if (z) {
                                    TrackOutput trackOutput = this.f14133OooO;
                                    OooO00o oooO00o2 = this.f14137OooO0Oo;
                                    int i13 = oooO00o2.f14148OooO0Oo;
                                    String str = this.f14141OooO0oo;
                                    Objects.requireNonNull(str);
                                    byte[] bArrCopyOf = Arrays.copyOf(oooO00o2.f14149OooO0o0, oooO00o2.f14147OooO0OO);
                                    o0000oo1 = new o0000OO0(bArrCopyOf, bArrCopyOf.length);
                                    o0000oo1.OooOOO(i13);
                                    o0000oo1.OooOOO(4);
                                    o0000oo1.OooOO0o();
                                    o0000oo1.OooOOO0(8);
                                    if (o0000oo1.OooO0o()) {
                                        o0000oo1.OooOOO0(4);
                                        o0000oo1.OooOOO0(3);
                                    }
                                    iOooO0oO = o0000oo1.OooO0oO(4);
                                    if (iOooO0oO == 15) {
                                        iOooO0oO3 = o0000oo1.OooO0oO(8);
                                        iOooO0oO4 = o0000oo1.OooO0oO(8);
                                        if (iOooO0oO4 == 0) {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        } else {
                                            f = iOooO0oO3 / iOooO0oO4;
                                        }
                                    } else {
                                        fArr = f14132OooOO0o;
                                        if (iOooO0oO < 7) {
                                            f = fArr[iOooO0oO];
                                        } else {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        }
                                    }
                                    if (o0000oo1.OooO0o()) {
                                        o0000oo1.OooOOO0(2);
                                        o0000oo1.OooOOO0(1);
                                        if (o0000oo1.OooO0o()) {
                                            o0000oo1.OooOOO0(15);
                                            o0000oo1.OooOO0o();
                                            o0000oo1.OooOOO0(15);
                                            o0000oo1.OooOO0o();
                                            o0000oo1.OooOOO0(15);
                                            o0000oo1.OooOO0o();
                                            o0000oo1.OooOOO0(3);
                                            o0000oo1.OooOOO0(11);
                                            o0000oo1.OooOO0o();
                                            o0000oo1.OooOOO0(15);
                                            o0000oo1.OooOO0o();
                                        }
                                    }
                                    if (o0000oo1.OooO0oO(2) != 0) {
                                        Log.w("H263Reader", "Unhandled video object layer shape");
                                    }
                                    o0000oo1.OooOO0o();
                                    iOooO0oO2 = o0000oo1.OooO0oO(16);
                                    o0000oo1.OooOO0o();
                                    if (o0000oo1.OooO0o()) {
                                        if (iOooO0oO2 == 0) {
                                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i4 = 0;
                                            for (i3 = iOooO0oO2 - 1; i3 > 0; i3 >>= 1) {
                                                i4++;
                                            }
                                            o0000oo1.OooOOO0(i4);
                                        }
                                    }
                                    o0000oo1.OooOO0o();
                                    int iOooO0oO5 = o0000oo1.OooO0oO(13);
                                    o0000oo1.OooOO0o();
                                    int iOooO0oO6 = o0000oo1.OooO0oO(13);
                                    o0000oo1.OooOO0o();
                                    o0000oo1.OooOO0o();
                                    Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                                    oooO0O0.f13154OooO00o = str;
                                    oooO0O0.f13163OooOO0O = "video/mp4v-es";
                                    oooO0O0.f13168OooOOOo = iOooO0oO5;
                                    oooO0O0.f13170OooOOo0 = iOooO0oO6;
                                    oooO0O0.f13174OooOo00 = f;
                                    oooO0O0.f13166OooOOO0 = Collections.singletonList(bArrCopyOf);
                                    trackOutput.OooO0o0(new Format(oooO0O0));
                                    this.f14142OooOO0 = true;
                                }
                            } else if ((i9 & 240) != 32) {
                                Log.w("H263Reader", "Unexpected start code value");
                                oooO00o.OooO0O0();
                            } else {
                                oooO00o.f14148OooO0Oo = oooO00o.f14147OooO0OO;
                                oooO00o.f14146OooO0O0 = 4;
                            }
                        } else if (i9 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            oooO00o.OooO0O0();
                        } else {
                            oooO00o.f14146OooO0O0 = 3;
                        }
                    } else if (i9 != 181) {
                        Log.w("H263Reader", "Unexpected start code value");
                        oooO00o.OooO0O0();
                    } else {
                        oooO00o.f14146OooO0O0 = 2;
                    }
                } else {
                    i = i8;
                    if (i9 == 176) {
                        oooO00o.f14146OooO0O0 = 1;
                        oooO00o.f14145OooO00o = true;
                    }
                }
                oooO00o.OooO00o(OooO00o.f14144OooO0o, 0, 3);
                z = false;
                if (z) {
                    TrackOutput trackOutput2 = this.f14133OooO;
                    OooO00o oooO00o3 = this.f14137OooO0Oo;
                    int i14 = oooO00o3.f14148OooO0Oo;
                    String str2 = this.f14141OooO0oo;
                    Objects.requireNonNull(str2);
                    byte[] bArrCopyOf2 = Arrays.copyOf(oooO00o3.f14149OooO0o0, oooO00o3.f14147OooO0OO);
                    o0000oo1 = new o0000OO0(bArrCopyOf2, bArrCopyOf2.length);
                    o0000oo1.OooOOO(i14);
                    o0000oo1.OooOOO(4);
                    o0000oo1.OooOO0o();
                    o0000oo1.OooOOO0(8);
                    if (o0000oo1.OooO0o()) {
                        o0000oo1.OooOOO0(4);
                        o0000oo1.OooOOO0(3);
                    }
                    iOooO0oO = o0000oo1.OooO0oO(4);
                    if (iOooO0oO == 15) {
                        iOooO0oO3 = o0000oo1.OooO0oO(8);
                        iOooO0oO4 = o0000oo1.OooO0oO(8);
                        if (iOooO0oO4 == 0) {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iOooO0oO3 / iOooO0oO4;
                        }
                    } else {
                        fArr = f14132OooOO0o;
                        if (iOooO0oO < 7) {
                            f = fArr[iOooO0oO];
                        } else {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        }
                    }
                    if (o0000oo1.OooO0o()) {
                        o0000oo1.OooOOO0(2);
                        o0000oo1.OooOOO0(1);
                        if (o0000oo1.OooO0o()) {
                            o0000oo1.OooOOO0(15);
                            o0000oo1.OooOO0o();
                            o0000oo1.OooOOO0(15);
                            o0000oo1.OooOO0o();
                            o0000oo1.OooOOO0(15);
                            o0000oo1.OooOO0o();
                            o0000oo1.OooOOO0(3);
                            o0000oo1.OooOOO0(11);
                            o0000oo1.OooOO0o();
                            o0000oo1.OooOOO0(15);
                            o0000oo1.OooOO0o();
                        }
                    }
                    if (o0000oo1.OooO0oO(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    o0000oo1.OooOO0o();
                    iOooO0oO2 = o0000oo1.OooO0oO(16);
                    o0000oo1.OooOO0o();
                    if (o0000oo1.OooO0o()) {
                        if (iOooO0oO2 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i4 = 0;
                            while (i3 > 0) {
                                i4++;
                            }
                            o0000oo1.OooOOO0(i4);
                        }
                    }
                    o0000oo1.OooOO0o();
                    int iOooO0oO7 = o0000oo1.OooO0oO(13);
                    o0000oo1.OooOO0o();
                    int iOooO0oO8 = o0000oo1.OooO0oO(13);
                    o0000oo1.OooOO0o();
                    o0000oo1.OooOO0o();
                    Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
                    oooO0O1.f13154OooO00o = str2;
                    oooO0O1.f13163OooOO0O = "video/mp4v-es";
                    oooO0O1.f13168OooOOOo = iOooO0oO7;
                    oooO0O1.f13170OooOOo0 = iOooO0oO8;
                    oooO0O1.f13174OooOo00 = f;
                    oooO0O1.f13166OooOOO0 = Collections.singletonList(bArrCopyOf2);
                    trackOutput2.OooO0o0(new Format(oooO0O1));
                    this.f14142OooOO0 = true;
                }
            }
            this.f14138OooO0o.OooO00o(bArr, i5, iOooO0O0);
            o00 o00Var2 = this.f14139OooO0o0;
            if (o00Var2 != null) {
                if (i10 > 0) {
                    o00Var2.OooO00o(bArr, i5, iOooO0O0);
                    i2 = 0;
                } else {
                    i2 = -i10;
                }
                if (this.f14139OooO0o0.OooO0O0(i2)) {
                    o00 o00Var3 = this.f14139OooO0o0;
                    int iOooO0o0 = o0000O.OooO0o0(o00Var3.f36071OooO0Oo, o00Var3.f36072OooO0o0);
                    o000 o000Var2 = this.f14135OooO0O0;
                    int i15 = o000OOo0.f36740OooO00o;
                    o000Var2.OooOoO0(this.f14139OooO0o0.f36071OooO0Oo, iOooO0o0);
                    this.f14134OooO00o.OooO00o(this.f14143OooOO0O, this.f14135OooO0O0);
                }
                if (i9 == 178) {
                    if (o000Var.f36661OooO00o[iOooO0O0 + 2] == 1) {
                        this.f14139OooO0o0.OooO0Oo(i9);
                    }
                }
            }
            int i16 = i6 - iOooO0O0;
            long j = this.f14140OooO0oO - ((long) i16);
            OooO0O0 oooO0O2 = this.f14138OooO0o;
            boolean z2 = this.f14142OooOO0;
            if (oooO0O2.f14155OooO0o0 == 182 && z2 && oooO0O2.f14151OooO0O0) {
                oooO0O2.f14150OooO00o.OooO0Oo(oooO0O2.f14157OooO0oo, oooO0O2.f14153OooO0Oo ? 1 : 0, (int) (j - oooO0O2.f14156OooO0oO), i16, null);
            }
            if (oooO0O2.f14155OooO0o0 != 179) {
                oooO0O2.f14156OooO0oO = j;
            }
            OooO0O0 oooO0O3 = this.f14138OooO0o;
            long j2 = this.f14143OooOO0O;
            oooO0O3.f14155OooO0o0 = i9;
            oooO0O3.f14153OooO0Oo = false;
            oooO0O3.f14151OooO0O0 = i9 == 182 || i9 == 179;
            oooO0O3.f14152OooO0OO = i9 == 182;
            oooO0O3.f14154OooO0o = 0;
            oooO0O3.f14157OooO0oo = j2;
            i5 = i;
            i6 = i6;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        o0000O.OooO00o(this.f14136OooO0OO);
        this.f14137OooO0Oo.OooO0O0();
        OooO0O0 oooO0O0 = this.f14138OooO0o;
        if (oooO0O0 != null) {
            oooO0O0.f14151OooO0O0 = false;
            oooO0O0.f14152OooO0OO = false;
            oooO0O0.f14153OooO0Oo = false;
            oooO0O0.f14155OooO0o0 = -1;
        }
        o00 o00Var = this.f14139OooO0o0;
        if (o00Var != null) {
            o00Var.OooO0OO();
        }
        this.f14140OooO0oO = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14143OooOO0O = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14141OooO0oo = oooO0o.OooO0O0();
        TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0o.OooO0OO());
        this.f14133OooO = trackOutputOooO00o;
        this.f14138OooO0o = new OooO0O0(trackOutputOooO00o);
        o0ooOOo o0ooooo2 = this.f14134OooO00o;
        if (o0ooooo2 != null) {
            o0ooooo2.OooO0O0(o0oooo1, oooO0o);
        }
    }
}
