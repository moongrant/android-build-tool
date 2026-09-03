package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float[] f12202OooOO0o = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TrackOutput f12203OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f12204OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0 f12208OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f12210OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f12211OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f12212OooOO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean[] f12206OooO0OO = new boolean[4];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f12207OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f12213OooOO0O = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final p211o00oO0.Oooo000 f12209OooO0o0 = new p211o00oO0.Oooo000(178);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00Oo00 f12205OooO0O0 = new o00Oo00();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final byte[] f12214OooO0o = {0, 0, 1};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f12215OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f12216OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f12217OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f12218OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public byte[] f12219OooO0o0 = new byte[128];

        public final void OooO00o(int i, int i2, byte[] bArr) {
            if (this.f12215OooO00o) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f12219OooO0o0;
                int length = bArr2.length;
                int i4 = this.f12217OooO0OO;
                if (length < i4 + i3) {
                    this.f12219OooO0o0 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f12219OooO0o0, this.f12217OooO0OO, i3);
                this.f12217OooO0OO += i3;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f12220OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f12221OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f12222OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f12223OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f12224OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f12225OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f12226OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f12227OooO0oo;

        public OooO0O0(TrackOutput trackOutput) {
            this.f12220OooO00o = trackOutput;
        }

        public final void OooO00o(int i, int i2, byte[] bArr) {
            if (this.f12222OooO0OO) {
                int i3 = this.f12224OooO0o;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f12224OooO0o = (i2 - i) + i3;
                } else {
                    this.f12223OooO0Oo = ((bArr[i4] & 192) >> 6) == 0;
                    this.f12222OooO0OO = false;
                }
            }
        }
    }

    public OooOOOO(@Nullable o0ooOOo o0ooooo) {
        this.f12204OooO00o = o0ooooo;
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
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        boolean z;
        int i;
        boolean z2;
        o00OOOOo o00ooooo2;
        int iOooO0oO;
        float f;
        int iOooO0oO2;
        int i2;
        int i3;
        int iOooO0oO3;
        int iOooO0oO4;
        o00O000o.OooO0o0(this.f12208OooO0o);
        o00O000o.OooO0o0(this.f12203OooO);
        int i4 = o00oo00.f40592OooO0O0;
        int i5 = o00oo00.f40593OooO0OO;
        byte[] bArr = o00oo00.f40591OooO00o;
        int i6 = i5 - i4;
        this.f12210OooO0oO += (long) i6;
        this.f12203OooO.OooO0O0(i6, o00oo00);
        while (true) {
            int iOooO0O0 = oo0O.OooO0O0(bArr, i4, i5, this.f12206OooO0OO);
            OooO00o oooO00o = this.f12207OooO0Oo;
            p211o00oO0.Oooo000 oooo000 = this.f12209OooO0o0;
            if (iOooO0O0 == i5) {
                if (!this.f12212OooOO0) {
                    oooO00o.OooO00o(i4, i5, bArr);
                }
                this.f12208OooO0o.OooO00o(i4, i5, bArr);
                if (oooo000 != null) {
                    oooo000.OooO00o(i4, i5, bArr);
                    return;
                }
                return;
            }
            int i7 = iOooO0O0 + 3;
            int i8 = o00oo00.f40591OooO00o[i7] & UByte.MAX_VALUE;
            int i9 = iOooO0O0 - i4;
            if (!this.f12212OooOO0) {
                if (i9 > 0) {
                    oooO00o.OooO00o(i4, iOooO0O0, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = oooO00o.f12216OooO0O0;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i8 == 179 || i8 == 181) {
                                    oooO00o.f12217OooO0OO -= i10;
                                    oooO00o.f12215OooO00o = false;
                                    z2 = true;
                                }
                                if (z2) {
                                    TrackOutput trackOutput = this.f12203OooO;
                                    int i12 = oooO00o.f12218OooO0Oo;
                                    String str = this.f12211OooO0oo;
                                    str.getClass();
                                    byte[] bArrCopyOf = Arrays.copyOf(oooO00o.f12219OooO0o0, oooO00o.f12217OooO0OO);
                                    o00ooooo2 = new o00OOOOo(bArrCopyOf, bArrCopyOf.length);
                                    o00ooooo2.OooOOO(i12);
                                    o00ooooo2.OooOOO(4);
                                    o00ooooo2.OooOO0o();
                                    o00ooooo2.OooOOO0(8);
                                    if (o00ooooo2.OooO0o()) {
                                        o00ooooo2.OooOOO0(4);
                                        o00ooooo2.OooOOO0(3);
                                    }
                                    iOooO0oO = o00ooooo2.OooO0oO(4);
                                    if (iOooO0oO == 15) {
                                        iOooO0oO3 = o00ooooo2.OooO0oO(8);
                                        iOooO0oO4 = o00ooooo2.OooO0oO(8);
                                        if (iOooO0oO4 == 0) {
                                            Log.OooO0o("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        } else {
                                            f = iOooO0oO3 / iOooO0oO4;
                                        }
                                    } else if (iOooO0oO < 7) {
                                        f = f12202OooOO0o[iOooO0oO];
                                    } else {
                                        Log.OooO0o("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    }
                                    if (o00ooooo2.OooO0o()) {
                                        o00ooooo2.OooOOO0(2);
                                        o00ooooo2.OooOOO0(1);
                                        if (o00ooooo2.OooO0o()) {
                                            o00ooooo2.OooOOO0(15);
                                            o00ooooo2.OooOO0o();
                                            o00ooooo2.OooOOO0(15);
                                            o00ooooo2.OooOO0o();
                                            o00ooooo2.OooOOO0(15);
                                            o00ooooo2.OooOO0o();
                                            o00ooooo2.OooOOO0(3);
                                            o00ooooo2.OooOOO0(11);
                                            o00ooooo2.OooOO0o();
                                            o00ooooo2.OooOOO0(15);
                                            o00ooooo2.OooOO0o();
                                        }
                                    }
                                    if (o00ooooo2.OooO0oO(2) != 0) {
                                        Log.OooO0o("H263Reader", "Unhandled video object layer shape");
                                    }
                                    o00ooooo2.OooOO0o();
                                    iOooO0oO2 = o00ooooo2.OooO0oO(16);
                                    o00ooooo2.OooOO0o();
                                    if (o00ooooo2.OooO0o()) {
                                        if (iOooO0oO2 == 0) {
                                            Log.OooO0o("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i3 = 0;
                                            for (i2 = iOooO0oO2 - 1; i2 > 0; i2 >>= 1) {
                                                i3++;
                                            }
                                            o00ooooo2.OooOOO0(i3);
                                        }
                                    }
                                    o00ooooo2.OooOO0o();
                                    int iOooO0oO5 = o00ooooo2.OooO0oO(13);
                                    o00ooooo2.OooOO0o();
                                    int iOooO0oO6 = o00ooooo2.OooO0oO(13);
                                    o00ooooo2.OooOO0o();
                                    o00ooooo2.OooOO0o();
                                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o2 = new com.google.android.exoplayer2.OooOo.OooO00o();
                                    oooO00o2.f11235OooO00o = str;
                                    oooO00o2.f11244OooOO0O = "video/mp4v-es";
                                    oooO00o2.f11249OooOOOo = iOooO0oO5;
                                    oooO00o2.f11251OooOOo0 = iOooO0oO6;
                                    oooO00o2.f11255OooOo00 = f;
                                    oooO00o2.f11247OooOOO0 = Collections.singletonList(bArrCopyOf);
                                    trackOutput.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o2));
                                    this.f12212OooOO0 = true;
                                }
                            } else if ((i8 & 240) != 32) {
                                Log.OooO0o("H263Reader", "Unexpected start code value");
                                oooO00o.f12215OooO00o = false;
                                oooO00o.f12217OooO0OO = 0;
                                oooO00o.f12216OooO0O0 = 0;
                            } else {
                                oooO00o.f12218OooO0Oo = oooO00o.f12217OooO0OO;
                                oooO00o.f12216OooO0O0 = 4;
                            }
                        } else if (i8 > 31) {
                            Log.OooO0o("H263Reader", "Unexpected start code value");
                            oooO00o.f12215OooO00o = false;
                            oooO00o.f12217OooO0OO = 0;
                            oooO00o.f12216OooO0O0 = 0;
                        } else {
                            oooO00o.f12216OooO0O0 = 3;
                        }
                    } else if (i8 != 181) {
                        Log.OooO0o("H263Reader", "Unexpected start code value");
                        oooO00o.f12215OooO00o = false;
                        oooO00o.f12217OooO0OO = 0;
                        oooO00o.f12216OooO0O0 = 0;
                    } else {
                        oooO00o.f12216OooO0O0 = 2;
                    }
                } else if (i8 == 176) {
                    oooO00o.f12216OooO0O0 = 1;
                    oooO00o.f12215OooO00o = true;
                }
                oooO00o.OooO00o(0, 3, OooO00o.f12214OooO0o);
                z2 = false;
                if (z2) {
                    TrackOutput trackOutput2 = this.f12203OooO;
                    int i13 = oooO00o.f12218OooO0Oo;
                    String str2 = this.f12211OooO0oo;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(oooO00o.f12219OooO0o0, oooO00o.f12217OooO0OO);
                    o00ooooo2 = new o00OOOOo(bArrCopyOf2, bArrCopyOf2.length);
                    o00ooooo2.OooOOO(i13);
                    o00ooooo2.OooOOO(4);
                    o00ooooo2.OooOO0o();
                    o00ooooo2.OooOOO0(8);
                    if (o00ooooo2.OooO0o()) {
                        o00ooooo2.OooOOO0(4);
                        o00ooooo2.OooOOO0(3);
                    }
                    iOooO0oO = o00ooooo2.OooO0oO(4);
                    if (iOooO0oO == 15) {
                        iOooO0oO3 = o00ooooo2.OooO0oO(8);
                        iOooO0oO4 = o00ooooo2.OooO0oO(8);
                        if (iOooO0oO4 == 0) {
                            Log.OooO0o("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iOooO0oO3 / iOooO0oO4;
                        }
                    } else if (iOooO0oO < 7) {
                        f = f12202OooOO0o[iOooO0oO];
                    } else {
                        Log.OooO0o("H263Reader", "Invalid aspect ratio");
                        f = 1.0f;
                    }
                    if (o00ooooo2.OooO0o()) {
                        o00ooooo2.OooOOO0(2);
                        o00ooooo2.OooOOO0(1);
                        if (o00ooooo2.OooO0o()) {
                            o00ooooo2.OooOOO0(15);
                            o00ooooo2.OooOO0o();
                            o00ooooo2.OooOOO0(15);
                            o00ooooo2.OooOO0o();
                            o00ooooo2.OooOOO0(15);
                            o00ooooo2.OooOO0o();
                            o00ooooo2.OooOOO0(3);
                            o00ooooo2.OooOOO0(11);
                            o00ooooo2.OooOO0o();
                            o00ooooo2.OooOOO0(15);
                            o00ooooo2.OooOO0o();
                        }
                    }
                    if (o00ooooo2.OooO0oO(2) != 0) {
                        Log.OooO0o("H263Reader", "Unhandled video object layer shape");
                    }
                    o00ooooo2.OooOO0o();
                    iOooO0oO2 = o00ooooo2.OooO0oO(16);
                    o00ooooo2.OooOO0o();
                    if (o00ooooo2.OooO0o()) {
                        if (iOooO0oO2 == 0) {
                            Log.OooO0o("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i3 = 0;
                            while (i2 > 0) {
                                i3++;
                            }
                            o00ooooo2.OooOOO0(i3);
                        }
                    }
                    o00ooooo2.OooOO0o();
                    int iOooO0oO7 = o00ooooo2.OooO0oO(13);
                    o00ooooo2.OooOO0o();
                    int iOooO0oO8 = o00ooooo2.OooO0oO(13);
                    o00ooooo2.OooOO0o();
                    o00ooooo2.OooOO0o();
                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o3 = new com.google.android.exoplayer2.OooOo.OooO00o();
                    oooO00o3.f11235OooO00o = str2;
                    oooO00o3.f11244OooOO0O = "video/mp4v-es";
                    oooO00o3.f11249OooOOOo = iOooO0oO7;
                    oooO00o3.f11251OooOOo0 = iOooO0oO8;
                    oooO00o3.f11255OooOo00 = f;
                    oooO00o3.f11247OooOOO0 = Collections.singletonList(bArrCopyOf2);
                    trackOutput2.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o3));
                    this.f12212OooOO0 = true;
                }
            }
            this.f12208OooO0o.OooO00o(i4, iOooO0O0, bArr);
            if (oooo000 == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    oooo000.OooO00o(i4, iOooO0O0, bArr);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (oooo000.OooO0O0(i)) {
                    int iOooO0o0 = oo0O.OooO0o0(oooo000.f39601OooO0o0, oooo000.f39600OooO0Oo);
                    int i14 = o0O00.f40595OooO00o;
                    byte[] bArr2 = oooo000.f39600OooO0Oo;
                    o00Oo00 o00oo01 = this.f12205OooO0O0;
                    o00oo01.OooOooo(iOooO0o0, bArr2);
                    this.f12204OooO00o.OooO00o(this.f12213OooOO0O, o00oo01);
                }
                if (i8 == 178) {
                    z = true;
                    if (o00oo00.f40591OooO00o[iOooO0O0 + 2] == 1) {
                        oooo000.OooO0Oo(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i5 - iOooO0O0;
            long j = this.f12210OooO0oO - ((long) i15);
            OooO0O0 oooO0O0 = this.f12208OooO0o;
            boolean z3 = this.f12212OooOO0;
            if (oooO0O0.f12225OooO0o0 == 182 && z3 && oooO0O0.f12221OooO0O0) {
                long j2 = oooO0O0.f12227OooO0oo;
                if (j2 != -9223372036854775807L) {
                    oooO0O0.f12220OooO00o.OooO0o0(j2, oooO0O0.f12223OooO0Oo ? 1 : 0, (int) (j - oooO0O0.f12226OooO0oO), i15, null);
                }
            }
            if (oooO0O0.f12225OooO0o0 != 179) {
                oooO0O0.f12226OooO0oO = j;
            }
            OooO0O0 oooO0O1 = this.f12208OooO0o;
            long j3 = this.f12213OooOO0O;
            oooO0O1.f12225OooO0o0 = i8;
            oooO0O1.f12223OooO0Oo = false;
            oooO0O1.f12221OooO0O0 = (i8 == 182 || i8 == 179) ? z : false;
            oooO0O1.f12222OooO0OO = i8 == 182 ? z : false;
            oooO0O1.f12224OooO0o = 0;
            oooO0O1.f12227OooO0oo = j3;
            i4 = i7;
            i5 = i5;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        oo0O.OooO00o(this.f12206OooO0OO);
        OooO00o oooO00o = this.f12207OooO0Oo;
        oooO00o.f12215OooO00o = false;
        oooO00o.f12217OooO0OO = 0;
        oooO00o.f12216OooO0O0 = 0;
        OooO0O0 oooO0O0 = this.f12208OooO0o;
        if (oooO0O0 != null) {
            oooO0O0.f12221OooO0O0 = false;
            oooO0O0.f12222OooO0OO = false;
            oooO0O0.f12223OooO0Oo = false;
            oooO0O0.f12225OooO0o0 = -1;
        }
        p211o00oO0.Oooo000 oooo000 = this.f12209OooO0o0;
        if (oooo000 != null) {
            oooo000.OooO0OO();
        }
        this.f12210OooO0oO = 0L;
        this.f12213OooOO0O = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12211OooO0oo = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 2);
        this.f12203OooO = trackOutputOooOOO;
        this.f12208OooO0o = new OooO0O0(trackOutputOooOOO);
        o0ooOOo o0ooooo = this.f12204OooO00o;
        if (o0ooooo != null) {
            o0ooooo.OooO0O0(o00o0o0, oooO0o);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12213OooOO0O = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
