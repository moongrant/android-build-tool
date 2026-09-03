package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.trackselection.OooO0O0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o00000;
import com.google.common.collect.o0O00;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p203o00o0o0o.o0O00O0o;
import p205o00o0oO0.o00O0000;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p241o00oo0O.o000;
import p241o00oo0O.o0000O0O;
import p241o00oo0O.o000O0o;
import p241o00oo0O.o00O000;
import p241o00oo0O.o00oOoo;
import p241o00oo0O.o0O0ooO;
import p244o00oo0Oo.o000O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class MappingTrackSelector extends o00oOoo {

    public static final class MappedTrackInfo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13513OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f13514OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000O0[] f13515OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f13516OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000O0 f13517OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[][][] f13518OooO0o0;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        @VisibleForTesting
        public MappedTrackInfo(int[] iArr, o000O0[] o000o0Arr, int[] iArr2, int[][][] iArr3, o000O0 o000o0) {
            this.f13514OooO0O0 = iArr;
            this.f13515OooO0OO = o000o0Arr;
            this.f13518OooO0o0 = iArr3;
            this.f13516OooO0Oo = iArr2;
            this.f13517OooO0o = o000o0;
            this.f13513OooO00o = iArr.length;
        }
    }

    @Override // p241o00oo0O.o00oOoo
    public final void OooO0OO(@Nullable Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0321  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ad  */
    @Override // p241o00oo0O.o00oOoo
    public final o00O000 OooO0o0(RendererCapabilities[] rendererCapabilitiesArr, o000O0 o000o0, OooOOOO.OooO0O0 oooO0O0, oo0o0Oo oo0o0oo) throws ExoPlaybackException {
        final OooO0O0.OooO0OO oooO0OO;
        o000O0[] o000o0Arr;
        int[] iArr;
        final boolean z;
        final String str;
        o000O0[] o000o0Arr2;
        byte b;
        boolean z2;
        o0O00 o0o00OooOOOo;
        boolean z3;
        boolean z4;
        OooO0o.OooO00o oooO00o;
        OooO0o.OooO00o oooO00o2;
        o000O0[] o000o0Arr3;
        int[] iArr2;
        o000O00O o000o00o2;
        int[] iArr3;
        OooO0O0.OooO oooO;
        int[] iArr4;
        o000O0 o000o1 = o000o0;
        boolean z5 = true;
        int[] iArr5 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        o000O00O[][] o000o00oArr = new o000O00O[length][];
        int[][][] iArr6 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = o000o1.f39866OooO0Oo;
            o000o00oArr[i] = new o000O00O[i2];
            iArr6[i] = new int[i2][];
        }
        int length2 = rendererCapabilitiesArr.length;
        final int[] iArr7 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr7[i3] = rendererCapabilitiesArr[i3].OooOOoo();
        }
        int i4 = 0;
        while (i4 < o000o1.f39866OooO0Oo) {
            o000O00O o000o00oOooO00o = o000o1.OooO00o(i4);
            boolean z6 = o000o00oOooO00o.f39874OooO0o == 5 ? z5 : false;
            int length3 = rendererCapabilitiesArr.length;
            boolean z7 = z5;
            int i5 = 0;
            for (int i6 = 0; i6 < rendererCapabilitiesArr.length; i6++) {
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i6];
                int iMax = 0;
                for (int i7 = 0; i7 < o000o00oOooO00o.f39873OooO0Oo; i7++) {
                    iMax = Math.max(iMax, rendererCapabilities.OooO0OO(o000o00oOooO00o.f39876OooO0oO[i7]) & 7);
                }
                boolean z8 = iArr5[i6] == 0;
                if (iMax > i5 || (iMax == i5 && z6 && !z7 && z8)) {
                    z7 = z8;
                    i5 = iMax;
                    length3 = i6;
                }
            }
            if (length3 == rendererCapabilitiesArr.length) {
                iArr4 = new int[o000o00oOooO00o.f39873OooO0Oo];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr8 = new int[o000o00oOooO00o.f39873OooO0Oo];
                for (int i8 = 0; i8 < o000o00oOooO00o.f39873OooO0Oo; i8++) {
                    iArr8[i8] = rendererCapabilities2.OooO0OO(o000o00oOooO00o.f39876OooO0oO[i8]);
                }
                iArr4 = iArr8;
            }
            int i9 = iArr5[length3];
            o000o00oArr[length3][i9] = o000o00oOooO00o;
            iArr6[length3][i9] = iArr4;
            iArr5[length3] = i9 + 1;
            i4++;
            o000o1 = o000o0;
            z5 = true;
        }
        o000O0[] o000o0Arr4 = new o000O0[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr9 = new int[rendererCapabilitiesArr.length];
        for (int i10 = 0; i10 < rendererCapabilitiesArr.length; i10++) {
            int i11 = iArr5[i10];
            o000o0Arr4[i10] = new o000O0((o000O00O[]) p245o00oo0o.o0O00.Oooo0o0(i11, o000o00oArr[i10]));
            iArr6[i10] = (int[][]) p245o00oo0o.o0O00.Oooo0o0(i11, iArr6[i10]);
            strArr[i10] = rendererCapabilitiesArr[i10].getName();
            iArr9[i10] = ((com.google.android.exoplayer2.OooO0o) rendererCapabilitiesArr[i10]).f11044OooO0o0;
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr9, o000o0Arr4, iArr7, iArr6, new o000O0((o000O00O[]) p245o00oo0o.o0O00.Oooo0o0(iArr5[rendererCapabilitiesArr.length], o000o00oArr[rendererCapabilitiesArr.length])));
        final OooO0O0 oooO0O1 = (OooO0O0) this;
        synchronized (oooO0O1.f13618OooO0OO) {
            try {
                oooO0OO = oooO0O1.f13622OooO0oO;
                if (oooO0OO.f13673o00Oo0 && p245o00oo0o.o0O00.f40595OooO00o >= 32 && (oooO = oooO0O1.f13623OooO0oo) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    o00O000o.OooO0o0(looperMyLooper);
                    if (oooO.f13627OooO0Oo == null && oooO.f13626OooO0OO == null) {
                        oooO.f13627OooO0Oo = new OooO0OO(oooO0O1);
                        Handler handler = new Handler(looperMyLooper);
                        oooO.f13626OooO0OO = handler;
                        oooO.f13624OooO00o.addOnSpatializerStateChangedListener(new o00O0000(handler), oooO.f13627OooO0Oo);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i12 = mappedTrackInfo.f13513OooO00o;
        OooO0o.OooO00o[] oooO00oArr = new OooO0o.OooO00o[i12];
        int i13 = 2;
        Pair pairOooOOOo = OooO0O0.OooOOOo(2, mappedTrackInfo, iArr6, new OooO0O0.OooOO0O.OooO00o() { // from class: o00oo0O.o0000OO0
            /* JADX WARN: Code duplicated, block: B:24:0x003d  */
            @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O.OooO00o
            public final o0O00 OooO00o(int i14, o000O00O o000o00o3, int[] iArr10) {
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                Point point;
                int i20 = iArr7[i14];
                OooO0O0.OooO0OO oooO0OO2 = oooO0OO;
                int i21 = oooO0OO2.f13554OooOO0o;
                int i22 = -1;
                if (i21 == Integer.MAX_VALUE || (i16 = oooO0OO2.f13556OooOOO0) == Integer.MAX_VALUE) {
                    i15 = Integer.MAX_VALUE;
                } else {
                    int i23 = Integer.MAX_VALUE;
                    for (int i24 = 0; i24 < o000o00o3.f39873OooO0Oo; i24++) {
                        OooOo oooOo = o000o00o3.f39876OooO0oO[i24];
                        int i25 = oooOo.f11218OooOo00;
                        if (i25 > 0 && (i17 = oooOo.f11217OooOo0) > 0) {
                            if (!oooO0OO2.f13555OooOOO) {
                                i18 = i21;
                                i19 = i16;
                            } else if ((i25 > i17) != (i21 > i16)) {
                                i19 = i21;
                                i18 = i16;
                            } else {
                                i18 = i21;
                                i19 = i16;
                            }
                            int i26 = i25 * i19;
                            int i27 = i17 * i18;
                            if (i26 >= i27) {
                                int i28 = p245o00oo0o.o0O00.f40595OooO00o;
                                point = new Point(i18, ((i27 + i25) - 1) / i25);
                            } else {
                                int i29 = p245o00oo0o.o0O00.f40595OooO00o;
                                point = new Point(((i26 + i17) - 1) / i17, i19);
                            }
                            int i30 = oooOo.f11218OooOo00;
                            int i31 = i30 * i17;
                            if (i30 >= ((int) (point.x * 0.98f)) && i17 >= ((int) (point.y * 0.98f)) && i31 < i23) {
                                i23 = i31;
                            }
                        }
                    }
                    i15 = i23;
                }
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f19157OooO0o0;
                ImmutableList.OooO00o oooO00o3 = new ImmutableList.OooO00o();
                int i32 = 0;
                while (i32 < o000o00o3.f39873OooO0Oo) {
                    int iOooO0O0 = o000o00o3.f39876OooO0oO[i32].OooO0O0();
                    oooO00o3.OooO0OO(new OooO0O0.OooOOO0(i14, o000o00o3, i32, oooO0OO2, iArr10[i32], i20, i15 == Integer.MAX_VALUE || (iOooO0O0 != i22 && iOooO0O0 <= i15)));
                    i32++;
                    i22 = -1;
                }
                return oooO00o3.OooO0oo();
            }
        }, new o000());
        if (pairOooOOOo != null) {
            oooO00oArr[((Integer) pairOooOOOo.second).intValue()] = (OooO0o.OooO00o) pairOooOOOo.first;
        }
        int i14 = 0;
        while (true) {
            int i15 = mappedTrackInfo.f13513OooO00o;
            o000o0Arr = mappedTrackInfo.f13515OooO0OO;
            iArr = mappedTrackInfo.f13514OooO0O0;
            if (i14 >= i15) {
                z = false;
                break;
            }
            if (2 == iArr[i14] && o000o0Arr[i14].f39866OooO0Oo > 0) {
                z = true;
                break;
            }
            i14++;
        }
        Pair pairOooOOOo2 = OooO0O0.OooOOOo(1, mappedTrackInfo, iArr6, new OooO0O0.OooOO0O.OooO00o() { // from class: o00oo0O.o000O000
            @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O.OooO00o
            public final o0O00 OooO00o(int i16, o000O00O o000o00o3, int[] iArr10) {
                OooO0O0.OooO0OO oooO0OO2 = oooO0OO;
                boolean z9 = z;
                OooO0O0 oooO0O2 = oooO0O1;
                oooO0O2.getClass();
                o000Oo0 o000oo1 = new o000Oo0(oooO0O2);
                ImmutableList.OooO0O0 oooO0O3 = ImmutableList.f19157OooO0o0;
                ImmutableList.OooO00o oooO00o3 = new ImmutableList.OooO00o();
                for (int i17 = 0; i17 < o000o00o3.f39873OooO0Oo; i17++) {
                    oooO00o3.OooO0OO(new OooO0O0.OooO00o(i16, o000o00o3, i17, oooO0OO2, iArr10[i17], z9, o000oo1));
                }
                return oooO00o3.OooO0oo();
            }
        }, new o000O0o());
        if (pairOooOOOo2 != null) {
            oooO00oArr[((Integer) pairOooOOOo2.second).intValue()] = (OooO0o.OooO00o) pairOooOOOo2.first;
        }
        if (pairOooOOOo2 == null) {
            str = null;
        } else {
            OooO0o.OooO00o oooO00o3 = (OooO0o.OooO00o) pairOooOOOo2.first;
            str = oooO00o3.f13732OooO00o.f39876OooO0oO[oooO00o3.f13733OooO0O0[0]].f11202OooO0o;
        }
        int i16 = 3;
        Pair pairOooOOOo3 = OooO0O0.OooOOOo(3, mappedTrackInfo, iArr6, new OooO0O0.OooOO0O.OooO00o() { // from class: o00oo0O.o0000O0
            @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O.OooO00o
            public final o0O00 OooO00o(int i17, o000O00O o000o00o3, int[] iArr10) {
                OooO0O0.OooO0OO oooO0OO2 = oooO0OO;
                String str2 = str;
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f19157OooO0o0;
                ImmutableList.OooO00o oooO00o4 = new ImmutableList.OooO00o();
                for (int i18 = 0; i18 < o000o00o3.f39873OooO0Oo; i18++) {
                    oooO00o4.OooO0OO(new OooO0O0.OooOO0(i17, o000o00o3, i18, oooO0OO2, iArr10[i18], str2));
                }
                return oooO00o4.OooO0oo();
            }
        }, new o0000O0O());
        if (pairOooOOOo3 != null) {
            oooO00oArr[((Integer) pairOooOOOo3.second).intValue()] = (OooO0o.OooO00o) pairOooOOOo3.first;
        }
        int i17 = 0;
        while (i17 < i12) {
            int i18 = iArr[i17];
            if (i18 == i13 || i18 == 1 || i18 == i16) {
                o000o0Arr3 = o000o0Arr;
                iArr2 = iArr;
            } else {
                o000O0 o000o2 = o000o0Arr[i17];
                int[][] iArr10 = iArr6[i17];
                o000O00O o000o00o3 = null;
                int i19 = 0;
                int i20 = 0;
                OooO0O0.C0214OooO0O0 c0214OooO0O0 = null;
                while (i19 < o000o2.f39866OooO0Oo) {
                    o000O00O o000o00oOooO00o2 = o000o2.OooO00o(i19);
                    int[] iArr11 = iArr10[i19];
                    OooO0O0.C0214OooO0O0 c0214OooO0O1 = c0214OooO0O0;
                    int i21 = i20;
                    o000O00O o000o00o4 = o000o00o3;
                    int i22 = 0;
                    while (i22 < o000o00oOooO00o2.f39873OooO0Oo) {
                        o000O0[] o000o0Arr5 = o000o0Arr;
                        if (OooO0O0.OooOO0o(iArr11[i22], oooO0OO.f13674o00Ooo)) {
                            o000o00o2 = o000o00oOooO00o2;
                            OooO0O0.C0214OooO0O0 c0214OooO0O2 = new OooO0O0.C0214OooO0O0(o000o00oOooO00o2.f39876OooO0oO[i22], iArr11[i22]);
                            if (c0214OooO0O1 != null) {
                                iArr3 = iArr;
                                if (o00000.f19395OooO00o.OooO0Oo(c0214OooO0O2.f13647OooO0o0, c0214OooO0O1.f13647OooO0o0).OooO0Oo(c0214OooO0O2.f13646OooO0Oo, c0214OooO0O1.f13646OooO0Oo).OooO0o() > 0) {
                                }
                            } else {
                                iArr3 = iArr;
                            }
                            c0214OooO0O1 = c0214OooO0O2;
                            i21 = i22;
                            o000o00o4 = o000o00o2;
                        } else {
                            o000o00o2 = o000o00oOooO00o2;
                            iArr3 = iArr;
                        }
                        i22++;
                        o000o0Arr = o000o0Arr5;
                        o000o00oOooO00o2 = o000o00o2;
                        iArr = iArr3;
                    }
                    i19++;
                    o000o00o3 = o000o00o4;
                    i20 = i21;
                    c0214OooO0O0 = c0214OooO0O1;
                }
                o000o0Arr3 = o000o0Arr;
                iArr2 = iArr;
                oooO00oArr[i17] = o000o00o3 == null ? null : new OooO0o.OooO00o(0, o000o00o3, new int[]{i20});
            }
            i17++;
            o000o0Arr = o000o0Arr3;
            iArr = iArr2;
            i13 = 2;
            i16 = 3;
        }
        int i23 = mappedTrackInfo.f13513OooO00o;
        HashMap map = new HashMap();
        int i24 = 0;
        while (true) {
            o000o0Arr2 = mappedTrackInfo.f13515OooO0OO;
            if (i24 >= i23) {
                break;
            }
            OooO0O0.OooOO0(o000o0Arr2[i24], oooO0OO, map);
            i24++;
        }
        OooO0O0.OooOO0(mappedTrackInfo.f13517OooO0o, oooO0OO, map);
        int i25 = 0;
        while (true) {
            b = -1;
            if (i25 >= i23) {
                break;
            }
            o0O0ooO o0o0ooo = (o0O0ooO) map.get(Integer.valueOf(mappedTrackInfo.f13514OooO0O0[i25]));
            if (o0o0ooo != null) {
                ImmutableList<Integer> immutableList = o0o0ooo.f40412OooO0o0;
                if (immutableList.isEmpty()) {
                    oooO00o2 = null;
                } else {
                    o000O0 o000o3 = o000o0Arr2[i25];
                    o000O00O o000o00o5 = o0o0ooo.f40411OooO0Oo;
                    int iIndexOf = o000o3.f39868OooO0o0.indexOf(o000o00o5);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        oooO00o2 = new OooO0o.OooO00o(0, o000o00o5, com.google.common.primitives.OooO0o.OooO0Oo(immutableList));
                    } else {
                        oooO00o2 = null;
                    }
                }
                oooO00oArr[i25] = oooO00o2;
            }
            i25++;
        }
        int i26 = mappedTrackInfo.f13513OooO00o;
        for (int i27 = 0; i27 < i26; i27++) {
            o000O0 o000o4 = mappedTrackInfo.f13515OooO0OO[i27];
            Map<o000O0, OooO0O0.OooO0o> map2 = oooO0OO.f13677o00oO0o.get(i27);
            if (map2 != null && map2.containsKey(o000o4)) {
                Map<o000O0, OooO0O0.OooO0o> map3 = oooO0OO.f13677o00oO0o.get(i27);
                OooO0O0.OooO0o oooO0o = map3 != null ? map3.get(o000o4) : null;
                if (oooO0o != null) {
                    int[] iArr12 = oooO0o.f13703OooO0o0;
                    if (iArr12.length != 0) {
                        oooO00o = new OooO0o.OooO00o(oooO0o.f13702OooO0o, o000o4.OooO00o(oooO0o.f13701OooO0Oo), iArr12);
                    } else {
                        oooO00o = null;
                    }
                } else {
                    oooO00o = null;
                }
                oooO00oArr[i27] = oooO00o;
            }
        }
        for (int i28 = 0; i28 < i12; i28++) {
            int i29 = mappedTrackInfo.f13514OooO0O0[i28];
            if (oooO0OO.f13676o00oO0O.get(i28) || oooO0OO.f13570OooOoo.contains(Integer.valueOf(i29))) {
                oooO00oArr[i28] = null;
            }
        }
        OooO0o.OooO0O0 oooO0O2 = oooO0O1.f13621OooO0o0;
        o000O o000o = oooO0O1.f40408OooO0O0;
        o00O000o.OooO0o0(o000o);
        OooO0o[] oooO0oArrOooO00o = ((OooO00o.OooO0O0) oooO0O2).OooO00o(oooO00oArr, o000o);
        o0O00O0o[] o0o00o0oArr = new o0O00O0o[i12];
        for (int i30 = 0; i30 < i12; i30++) {
            o0o00o0oArr[i30] = !(oooO0OO.f13676o00oO0O.get(i30) || oooO0OO.f13570OooOoo.contains(Integer.valueOf(mappedTrackInfo.f13514OooO0O0[i30]))) && (mappedTrackInfo.f13514OooO0O0[i30] == -2 || oooO0oArrOooO00o[i30] != null) ? o0O00O0o.f39280OooO0O0 : null;
        }
        if (oooO0OO.f13675o00o0O) {
            int i31 = -1;
            int i32 = -1;
            int i33 = 0;
            while (true) {
                if (i33 >= mappedTrackInfo.f13513OooO00o) {
                    z3 = true;
                    break;
                }
                int i34 = mappedTrackInfo.f13514OooO0O0[i33];
                OooO0o oooO0o2 = oooO0oArrOooO00o[i33];
                if (i34 == 1 || i34 == 2) {
                    if (oooO0o2 != null) {
                        int[][] iArr13 = iArr6[i33];
                        int iIndexOf2 = mappedTrackInfo.f13515OooO0OO[i33].f39868OooO0o0.indexOf(oooO0o2.OooOO0());
                        if (iIndexOf2 < 0) {
                            iIndexOf2 = -1;
                        }
                        int i35 = 0;
                        while (true) {
                            if (i35 >= oooO0o2.length()) {
                                z4 = true;
                                break;
                            }
                            if ((iArr13[iIndexOf2][oooO0o2.OooO0OO(i35)] & 32) != 32) {
                                z4 = false;
                                break;
                            }
                            i35++;
                        }
                        if (!z4) {
                            continue;
                        } else if (i34 == 1) {
                            if (i32 != -1) {
                                z3 = false;
                                break;
                            }
                            i32 = i33;
                        } else {
                            if (i31 != -1) {
                                z3 = false;
                                break;
                            }
                            i31 = i33;
                        }
                    }
                }
                i33++;
            }
            if (z3 & ((i32 == -1 || i31 == -1) ? false : true)) {
                o0O00O0o o0o00o0o = new o0O00O0o(true);
                o0o00o0oArr[i32] = o0o00o0o;
                o0o00o0oArr[i31] = o0o00o0o;
            }
        }
        Pair pairCreate = Pair.create(o0o00o0oArr, oooO0oArrOooO00o);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) pairCreate.second;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i36 = 0; i36 < trackSelectionArr.length; i36++) {
            TrackSelection trackSelection = trackSelectionArr[i36];
            if (trackSelection != null) {
                o0o00OooOOOo = ImmutableList.OooOOOo(trackSelection);
            } else {
                ImmutableList.OooO0O0 oooO0O3 = ImmutableList.f19157OooO0o0;
                o0o00OooOOOo = o0O00.f19536OooO0oo;
            }
            listArr[i36] = o0o00OooOOOo;
        }
        ImmutableList.OooO00o oooO00o4 = new ImmutableList.OooO00o();
        for (int i37 = 0; i37 < mappedTrackInfo.f13513OooO00o; i37++) {
            o000O0[] o000o0Arr6 = mappedTrackInfo.f13515OooO0OO;
            o000O0 o000o5 = o000o0Arr6[i37];
            List list = listArr[i37];
            int i38 = 0;
            while (i38 < o000o5.f39866OooO0Oo) {
                o000O00O o000o00oOooO00o3 = o000o5.OooO00o(i38);
                int i39 = o000o0Arr6[i37].OooO00o(i38).f39873OooO0Oo;
                int[] iArr14 = new int[i39];
                int i40 = 0;
                for (int i41 = 0; i41 < i39; i41++) {
                    if ((mappedTrackInfo.f13518OooO0o0[i37][i38][i41] & 7) == 4) {
                        iArr14[i40] = i41;
                        i40++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr14, i40);
                int iMin = 16;
                List[] listArr2 = listArr;
                int i42 = 0;
                boolean z9 = false;
                int i43 = 0;
                String str2 = null;
                while (i42 < iArrCopyOf.length) {
                    o000O0 o000o6 = o000o5;
                    String str3 = o000o0Arr6[i37].OooO00o(i38).f39876OooO0oO[iArrCopyOf[i42]].f11211OooOOOO;
                    int i44 = i43 + 1;
                    if (i43 == 0) {
                        str2 = str3;
                    } else {
                        z9 = (!p245o00oo0o.o0O00.OooO00o(str2, str3)) | z9;
                    }
                    iMin = Math.min(iMin, mappedTrackInfo.f13518OooO0o0[i37][i38][i42] & 24);
                    i42++;
                    i43 = i44;
                    o000o5 = o000o6;
                }
                o000O0 o000o7 = o000o5;
                if (z9) {
                    iMin = Math.min(iMin, mappedTrackInfo.f13516OooO0Oo[i37]);
                }
                boolean z10 = iMin != 0;
                int i45 = o000o00oOooO00o3.f39873OooO0Oo;
                int[] iArr15 = new int[i45];
                boolean[] zArr = new boolean[i45];
                for (int i46 = 0; i46 < o000o00oOooO00o3.f39873OooO0Oo; i46++) {
                    iArr15[i46] = mappedTrackInfo.f13518OooO0o0[i37][i38][i46] & 7;
                    int i47 = 0;
                    while (true) {
                        if (i47 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        TrackSelection trackSelection2 = (TrackSelection) list.get(i47);
                        if (trackSelection2.OooOO0().equals(o000o00oOooO00o3) && trackSelection2.OooO(i46) != -1) {
                            z2 = true;
                            break;
                        }
                        i47++;
                    }
                    zArr[i46] = z2;
                }
                oooO00o4.OooO0OO(new o0O0O00.OooO00o(o000o00oOooO00o3, z10, iArr15, zArr));
                i38++;
                o000o5 = o000o7;
                b = -1;
                listArr = listArr2;
            }
        }
        int i48 = 0;
        while (true) {
            o000O0 o000o8 = mappedTrackInfo.f13517OooO0o;
            if (i48 >= o000o8.f39866OooO0Oo) {
                return new o00O000((o0O00O0o[]) pairCreate.first, (OooO0o[]) pairCreate.second, new o0O0O00(oooO00o4.OooO0oo()), mappedTrackInfo);
            }
            o000O00O o000o00oOooO00o4 = o000o8.OooO00o(i48);
            int[] iArr16 = new int[o000o00oOooO00o4.f39873OooO0Oo];
            Arrays.fill(iArr16, 0);
            oooO00o4.OooO0OO(new o0O0O00.OooO00o(o000o00oOooO00o4, false, iArr16, new boolean[o000o00oOooO00o4.f39873OooO0Oo]));
            i48++;
        }
    }
}
