package androidx.media3.exoplayer.trackselection;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.OooOO0;
import androidx.media3.common.Oooo0;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.o0OoOo0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.OooOOOO;
import androidx.media3.exoplayer.trackselection.OooO0O0;
import com.google.common.collect.ImmutableList;
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
import o000O.oo0o0Oo;
import o000O00O.o00OO000;
import o000O0Oo.o0ooOOo;
import p022Oooo00O.o0OoOoOo;
import p074o000OO0o.oo000o;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p425o0OoO0o.o00000;
import p425o0OoO0o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class MappingTrackSelector extends o00000 {

    public static final class MappedTrackInfo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8121OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f8122OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oo0o0Oo[] f8123OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f8124OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oo0o0Oo f8125OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[][][] f8126OooO0o0;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        @VisibleForTesting
        public MappedTrackInfo(int[] iArr, oo0o0Oo[] oo0o0ooArr, int[] iArr2, int[][][] iArr3, oo0o0Oo oo0o0oo) {
            this.f8122OooO0O0 = iArr;
            this.f8123OooO0OO = oo0o0ooArr;
            this.f8126OooO0o0 = iArr3;
            this.f8124OooO0Oo = iArr2;
            this.f8125OooO0o = oo0o0oo;
            this.f8121OooO00o = iArr.length;
        }
    }

    @Override // p425o0OoO0o.o00000
    public final void OooO0OO(@Nullable Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0323  */
    /* JADX WARN: Code duplicated, block: B:199:0x03af  */
    @Override // p425o0OoO0o.o00000
    public final o00000O0 OooO0o0(RendererCapabilities[] rendererCapabilitiesArr, oo0o0Oo oo0o0oo, OooOOOO.OooO0O0 oooO0O0, Oooo0 oooo0) throws ExoPlaybackException {
        final OooO0O0.OooO0OO oooO0OO;
        oo0o0Oo[] oo0o0ooArr;
        int[] iArr;
        final boolean z;
        final String str;
        oo0o0Oo[] oo0o0ooArr2;
        byte b;
        boolean z2;
        o0O00 o0o00OooOOOo;
        boolean z3;
        boolean z4;
        OooO0o.OooO00o oooO00o;
        OooO0o.OooO00o oooO00o2;
        oo0o0Oo[] oo0o0ooArr3;
        int[] iArr2;
        o000oOoO o000oooo2;
        int[] iArr3;
        OooO0O0.OooO oooO;
        int[] iArr4;
        oo0o0Oo oo0o0oo2 = oo0o0oo;
        boolean z5 = true;
        int[] iArr5 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        o000oOoO[][] o000ooooArr = new o000oOoO[length][];
        int[][][] iArr6 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = oo0o0oo2.f33893OooO0Oo;
            o000ooooArr[i] = new o000oOoO[i2];
            iArr6[i] = new int[i2][];
        }
        int length2 = rendererCapabilitiesArr.length;
        final int[] iArr7 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr7[i3] = rendererCapabilitiesArr[i3].OooOOoo();
        }
        int i4 = 0;
        while (i4 < oo0o0oo2.f33893OooO0Oo) {
            o000oOoO o000ooooOooO0OO = oo0o0oo2.OooO0OO(i4);
            boolean z6 = o000ooooOooO0OO.f6766OooO0o == 5 ? z5 : false;
            int length3 = rendererCapabilitiesArr.length;
            boolean z7 = z5;
            int i5 = 0;
            for (int i6 = 0; i6 < rendererCapabilitiesArr.length; i6++) {
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i6];
                int iMax = 0;
                for (int i7 = 0; i7 < o000ooooOooO0OO.f6765OooO0Oo; i7++) {
                    iMax = Math.max(iMax, rendererCapabilities.OooO0OO(o000ooooOooO0OO.f6768OooO0oO[i7]) & 7);
                }
                boolean z8 = iArr5[i6] == 0;
                if (iMax > i5 || (iMax == i5 && z6 && !z7 && z8)) {
                    z7 = z8;
                    i5 = iMax;
                    length3 = i6;
                }
            }
            if (length3 == rendererCapabilitiesArr.length) {
                iArr4 = new int[o000ooooOooO0OO.f6765OooO0Oo];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr8 = new int[o000ooooOooO0OO.f6765OooO0Oo];
                for (int i8 = 0; i8 < o000ooooOooO0OO.f6765OooO0Oo; i8++) {
                    iArr8[i8] = rendererCapabilities2.OooO0OO(o000ooooOooO0OO.f6768OooO0oO[i8]);
                }
                iArr4 = iArr8;
            }
            int i9 = iArr5[length3];
            o000ooooArr[length3][i9] = o000ooooOooO0OO;
            iArr6[length3][i9] = iArr4;
            iArr5[length3] = i9 + 1;
            i4++;
            oo0o0oo2 = oo0o0oo;
            z5 = true;
        }
        oo0o0Oo[] oo0o0ooArr4 = new oo0o0Oo[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr9 = new int[rendererCapabilitiesArr.length];
        for (int i10 = 0; i10 < rendererCapabilitiesArr.length; i10++) {
            int i11 = iArr5[i10];
            oo0o0ooArr4[i10] = new oo0o0Oo((o000oOoO[]) o00.Oooo0o(i11, o000ooooArr[i10]));
            iArr6[i10] = (int[][]) o00.Oooo0o(i11, iArr6[i10]);
            strArr[i10] = rendererCapabilitiesArr[i10].getName();
            iArr9[i10] = ((androidx.media3.exoplayer.OooO0O0) rendererCapabilitiesArr[i10]).f7198OooO0o0;
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr9, oo0o0ooArr4, iArr7, iArr6, new oo0o0Oo((o000oOoO[]) o00.Oooo0o(iArr5[rendererCapabilitiesArr.length], o000ooooArr[rendererCapabilitiesArr.length])));
        final OooO0O0 oooO0O1 = (OooO0O0) this;
        synchronized (oooO0O1.f8134OooO0OO) {
            try {
                oooO0OO = oooO0O1.f8138OooO0oO;
                if (oooO0OO.f8189o00Oo0 && o00.f34910OooO00o >= 32 && (oooO = oooO0O1.f8139OooO0oo) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    o00Oo0.OooO0o(looperMyLooper);
                    if (oooO.f8143OooO0Oo == null && oooO.f8142OooO0OO == null) {
                        oooO.f8143OooO0Oo = new OooO0OO(oooO0O1);
                        Handler handler = new Handler(looperMyLooper);
                        oooO.f8142OooO0OO = handler;
                        oooO.f8140OooO00o.addOnSpatializerStateChangedListener(new o0ooOOo(handler), oooO.f8143OooO0Oo);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i12 = mappedTrackInfo.f8121OooO00o;
        OooO0o.OooO00o[] oooO00oArr = new OooO0o.OooO00o[i12];
        int i13 = 2;
        Pair pairOooOOOo = OooO0O0.OooOOOo(2, mappedTrackInfo, iArr6, new OooO0O0.OooOO0O.OooO00o() { // from class: o0OoO0o.o000oOoO
            /* JADX WARN: Code duplicated, block: B:24:0x003d  */
            @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O.OooO00o
            public final o0O00 OooO00o(int i14, androidx.media3.common.o000oOoO o000oooo3, int[] iArr10) {
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                Point point;
                int i20 = iArr7[i14];
                OooO0O0.OooO0OO oooO0OO2 = oooO0OO;
                int i21 = oooO0OO2.f6805OooOO0o;
                int i22 = -1;
                if (i21 == Integer.MAX_VALUE || (i16 = oooO0OO2.f6807OooOOO0) == Integer.MAX_VALUE) {
                    i15 = Integer.MAX_VALUE;
                } else {
                    int i23 = Integer.MAX_VALUE;
                    for (int i24 = 0; i24 < o000oooo3.f6765OooO0Oo; i24++) {
                        OooOO0 oooOO1 = o000oooo3.f6768OooO0oO[i24];
                        int i25 = oooOO1.f6419OooOo00;
                        if (i25 > 0 && (i17 = oooOO1.f6418OooOo0) > 0) {
                            if (!oooO0OO2.f6806OooOOO) {
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
                                int i28 = o00.f34910OooO00o;
                                point = new Point(i18, ((i27 + i25) - 1) / i25);
                            } else {
                                int i29 = o00.f34910OooO00o;
                                point = new Point(((i26 + i17) - 1) / i17, i19);
                            }
                            int i30 = oooOO1.f6419OooOo00;
                            int i31 = i30 * i17;
                            if (i30 >= ((int) (point.x * 0.98f)) && i17 >= ((int) (point.y * 0.98f)) && i31 < i23) {
                                i23 = i31;
                            }
                        }
                    }
                    i15 = i23;
                }
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18681OooO0o0;
                ImmutableList.OooO00o oooO00o3 = new ImmutableList.OooO00o();
                int i32 = 0;
                while (i32 < o000oooo3.f6765OooO0Oo) {
                    int iOooO0Oo = o000oooo3.f6768OooO0oO[i32].OooO0Oo();
                    oooO00o3.OooO0OO(new OooO0O0.OooOOO0(i14, o000oooo3, i32, oooO0OO2, iArr10[i32], i20, i15 == Integer.MAX_VALUE || (iOooO0Oo != i22 && iOooO0Oo <= i15)));
                    i32++;
                    i22 = -1;
                }
                return oooO00o3.OooO0oo();
            }
        }, new o0OoOoOo(1));
        if (pairOooOOOo != null) {
            oooO00oArr[((Integer) pairOooOOOo.second).intValue()] = (OooO0o.OooO00o) pairOooOOOo.first;
        }
        int i14 = 0;
        while (true) {
            int i15 = mappedTrackInfo.f8121OooO00o;
            oo0o0ooArr = mappedTrackInfo.f8123OooO0OO;
            iArr = mappedTrackInfo.f8122OooO0O0;
            if (i14 >= i15) {
                z = false;
                break;
            }
            if (2 == iArr[i14] && oo0o0ooArr[i14].f33893OooO0Oo > 0) {
                z = true;
                break;
            }
            i14++;
        }
        Pair pairOooOOOo2 = OooO0O0.OooOOOo(1, mappedTrackInfo, iArr6, new OooO0O0.OooOO0O.OooO00o() { // from class: o0OoO0o.Oooo000
            @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O.OooO00o
            public final o0O00 OooO00o(int i16, o000oOoO o000oooo3, int[] iArr10) {
                OooO0O0.OooO0OO oooO0OO2 = oooO0OO;
                boolean z9 = z;
                OooO0O0 oooO0O2 = oooO0O1;
                oooO0O2.getClass();
                o00Ooo o00ooo2 = new o00Ooo(oooO0O2);
                ImmutableList.OooO0O0 oooO0O3 = ImmutableList.f18681OooO0o0;
                ImmutableList.OooO00o oooO00o3 = new ImmutableList.OooO00o();
                for (int i17 = 0; i17 < o000oooo3.f6765OooO0Oo; i17++) {
                    oooO00o3.OooO0OO(new OooO0O0.OooO00o(i16, o000oooo3, i17, oooO0OO2, iArr10[i17], z9, o00ooo2));
                }
                return oooO00o3.OooO0oo();
            }
        }, new p425o0OoO0o.Oooo0());
        if (pairOooOOOo2 != null) {
            oooO00oArr[((Integer) pairOooOOOo2.second).intValue()] = (OooO0o.OooO00o) pairOooOOOo2.first;
        }
        if (pairOooOOOo2 == null) {
            str = null;
        } else {
            OooO0o.OooO00o oooO00o3 = (OooO0o.OooO00o) pairOooOOOo2.first;
            str = oooO00o3.f8248OooO00o.f6768OooO0oO[oooO00o3.f8249OooO0O0[0]].f6403OooO0o;
        }
        int i16 = 3;
        Pair pairOooOOOo3 = OooO0O0.OooOOOo(3, mappedTrackInfo, iArr6, new OooO0O0.OooOO0O.OooO00o() { // from class: o0OoO0o.o0OoOo0
            @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O.OooO00o
            public final o0O00 OooO00o(int i17, o000oOoO o000oooo3, int[] iArr10) {
                OooO0O0.OooO0OO oooO0OO2 = oooO0OO;
                String str2 = str;
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18681OooO0o0;
                ImmutableList.OooO00o oooO00o4 = new ImmutableList.OooO00o();
                for (int i18 = 0; i18 < o000oooo3.f6765OooO0Oo; i18++) {
                    oooO00o4.OooO0OO(new OooO0O0.OooOO0(i17, o000oooo3, i18, oooO0OO2, iArr10[i18], str2));
                }
                return oooO00o4.OooO0oo();
            }
        }, new androidx.compose.ui.node.OooO0o(1));
        if (pairOooOOOo3 != null) {
            oooO00oArr[((Integer) pairOooOOOo3.second).intValue()] = (OooO0o.OooO00o) pairOooOOOo3.first;
        }
        int i17 = 0;
        while (i17 < i12) {
            int i18 = iArr[i17];
            if (i18 == i13 || i18 == 1 || i18 == i16) {
                oo0o0ooArr3 = oo0o0ooArr;
                iArr2 = iArr;
            } else {
                oo0o0Oo oo0o0oo3 = oo0o0ooArr[i17];
                int[][] iArr10 = iArr6[i17];
                o000oOoO o000oooo3 = null;
                int i19 = 0;
                int i20 = 0;
                OooO0O0.C0153OooO0O0 c0153OooO0O0 = null;
                while (i19 < oo0o0oo3.f33893OooO0Oo) {
                    o000oOoO o000ooooOooO0OO2 = oo0o0oo3.OooO0OO(i19);
                    int[] iArr11 = iArr10[i19];
                    OooO0O0.C0153OooO0O0 c0153OooO0O1 = c0153OooO0O0;
                    int i21 = i20;
                    o000oOoO o000oooo4 = o000oooo3;
                    int i22 = 0;
                    while (i22 < o000ooooOooO0OO2.f6765OooO0Oo) {
                        oo0o0Oo[] oo0o0ooArr5 = oo0o0ooArr;
                        if (OooO0O0.OooOO0o(iArr11[i22], oooO0OO.f8190o00Ooo)) {
                            o000oooo2 = o000ooooOooO0OO2;
                            OooO0O0.C0153OooO0O0 c0153OooO0O2 = new OooO0O0.C0153OooO0O0(o000ooooOooO0OO2.f6768OooO0oO[i22], iArr11[i22]);
                            if (c0153OooO0O1 != null) {
                                iArr3 = iArr;
                                if (com.google.common.collect.o00000.f18919OooO00o.OooO0Oo(c0153OooO0O2.f8163OooO0o0, c0153OooO0O1.f8163OooO0o0).OooO0Oo(c0153OooO0O2.f8162OooO0Oo, c0153OooO0O1.f8162OooO0Oo).OooO0o() > 0) {
                                }
                            } else {
                                iArr3 = iArr;
                            }
                            c0153OooO0O1 = c0153OooO0O2;
                            i21 = i22;
                            o000oooo4 = o000oooo2;
                        } else {
                            o000oooo2 = o000ooooOooO0OO2;
                            iArr3 = iArr;
                        }
                        i22++;
                        oo0o0ooArr = oo0o0ooArr5;
                        o000ooooOooO0OO2 = o000oooo2;
                        iArr = iArr3;
                    }
                    i19++;
                    o000oooo3 = o000oooo4;
                    i20 = i21;
                    c0153OooO0O0 = c0153OooO0O1;
                }
                oo0o0ooArr3 = oo0o0ooArr;
                iArr2 = iArr;
                oooO00oArr[i17] = o000oooo3 == null ? null : new OooO0o.OooO00o(0, o000oooo3, new int[]{i20});
            }
            i17++;
            oo0o0ooArr = oo0o0ooArr3;
            iArr = iArr2;
            i13 = 2;
            i16 = 3;
        }
        int i23 = mappedTrackInfo.f8121OooO00o;
        HashMap map = new HashMap();
        int i24 = 0;
        while (true) {
            oo0o0ooArr2 = mappedTrackInfo.f8123OooO0OO;
            if (i24 >= i23) {
                break;
            }
            OooO0O0.OooOO0(oo0o0ooArr2[i24], oooO0OO, map);
            i24++;
        }
        OooO0O0.OooOO0(mappedTrackInfo.f8125OooO0o, oooO0OO, map);
        int i25 = 0;
        while (true) {
            b = -1;
            if (i25 >= i23) {
                break;
            }
            o0OoOo0 o0oooo1 = (o0OoOo0) map.get(Integer.valueOf(mappedTrackInfo.f8122OooO0O0[i25]));
            if (o0oooo1 != null) {
                ImmutableList<Integer> immutableList = o0oooo1.f6877OooO0o0;
                if (immutableList.isEmpty()) {
                    oooO00o2 = null;
                } else {
                    oo0o0Oo oo0o0oo4 = oo0o0ooArr2[i25];
                    o000oOoO o000oooo5 = o0oooo1.f6876OooO0Oo;
                    int iIndexOf = oo0o0oo4.f33895OooO0o0.indexOf(o000oooo5);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        oooO00o2 = new OooO0o.OooO00o(0, o000oooo5, com.google.common.primitives.OooO0OO.OooO0Oo(immutableList));
                    } else {
                        oooO00o2 = null;
                    }
                }
                oooO00oArr[i25] = oooO00o2;
            }
            i25++;
        }
        int i26 = mappedTrackInfo.f8121OooO00o;
        for (int i27 = 0; i27 < i26; i27++) {
            oo0o0Oo oo0o0oo5 = mappedTrackInfo.f8123OooO0OO[i27];
            Map<oo0o0Oo, OooO0O0.OooO0o> map2 = oooO0OO.f8193o00oO0o.get(i27);
            if (map2 != null && map2.containsKey(oo0o0oo5)) {
                Map<oo0o0Oo, OooO0O0.OooO0o> map3 = oooO0OO.f8193o00oO0o.get(i27);
                OooO0O0.OooO0o oooO0o = map3 != null ? map3.get(oo0o0oo5) : null;
                if (oooO0o != null) {
                    int[] iArr12 = oooO0o.f8219OooO0o0;
                    if (iArr12.length != 0) {
                        oooO00o = new OooO0o.OooO00o(oooO0o.f8218OooO0o, oo0o0oo5.OooO0OO(oooO0o.f8217OooO0Oo), iArr12);
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
            int i29 = mappedTrackInfo.f8122OooO0O0[i28];
            if (oooO0OO.f8192o00oO0O.get(i28) || oooO0OO.f6821OooOoo.contains(Integer.valueOf(i29))) {
                oooO00oArr[i28] = null;
            }
        }
        OooO0o.OooO0O0 oooO0O2 = oooO0O1.f8137OooO0o0;
        oo000o oo000oVar = oooO0O1.f46753OooO0O0;
        o00Oo0.OooO0o(oo000oVar);
        OooO0o[] oooO0oArrOooO00o = ((OooO00o.OooO0O0) oooO0O2).OooO00o(oooO00oArr, oo000oVar);
        o00OO000[] o00oo000Arr = new o00OO000[i12];
        for (int i30 = 0; i30 < i12; i30++) {
            o00oo000Arr[i30] = !(oooO0OO.f8192o00oO0O.get(i30) || oooO0OO.f6821OooOoo.contains(Integer.valueOf(mappedTrackInfo.f8122OooO0O0[i30]))) && (mappedTrackInfo.f8122OooO0O0[i30] == -2 || oooO0oArrOooO00o[i30] != null) ? o00OO000.f34127OooO0O0 : null;
        }
        if (oooO0OO.f8191o00o0O) {
            int i31 = -1;
            int i32 = -1;
            int i33 = 0;
            while (true) {
                if (i33 >= mappedTrackInfo.f8121OooO00o) {
                    z3 = true;
                    break;
                }
                int i34 = mappedTrackInfo.f8122OooO0O0[i33];
                OooO0o oooO0o2 = oooO0oArrOooO00o[i33];
                if (i34 == 1 || i34 == 2) {
                    if (oooO0o2 != null) {
                        int[][] iArr13 = iArr6[i33];
                        int iIndexOf2 = mappedTrackInfo.f8123OooO0OO[i33].f33895OooO0o0.indexOf(oooO0o2.OooO0oo());
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
                o00OO000 o00oo001 = new o00OO000(true);
                o00oo000Arr[i32] = o00oo001;
                o00oo000Arr[i31] = o00oo001;
            }
        }
        Pair pairCreate = Pair.create(o00oo000Arr, oooO0oArrOooO00o);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) pairCreate.second;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i36 = 0; i36 < trackSelectionArr.length; i36++) {
            TrackSelection trackSelection = trackSelectionArr[i36];
            if (trackSelection != null) {
                o0o00OooOOOo = ImmutableList.OooOOOo(trackSelection);
            } else {
                ImmutableList.OooO0O0 oooO0O3 = ImmutableList.f18681OooO0o0;
                o0o00OooOOOo = o0O00.f19060OooO0oo;
            }
            listArr[i36] = o0o00OooOOOo;
        }
        ImmutableList.OooO00o oooO00o4 = new ImmutableList.OooO00o();
        for (int i37 = 0; i37 < mappedTrackInfo.f8121OooO00o; i37++) {
            oo0o0Oo[] oo0o0ooArr6 = mappedTrackInfo.f8123OooO0OO;
            oo0o0Oo oo0o0oo6 = oo0o0ooArr6[i37];
            List list = listArr[i37];
            int i38 = 0;
            while (i38 < oo0o0oo6.f33893OooO0Oo) {
                o000oOoO o000ooooOooO0OO3 = oo0o0oo6.OooO0OO(i38);
                int i39 = oo0o0ooArr6[i37].OooO0OO(i38).f6765OooO0Oo;
                int[] iArr14 = new int[i39];
                int i40 = 0;
                for (int i41 = 0; i41 < i39; i41++) {
                    if ((mappedTrackInfo.f8126OooO0o0[i37][i38][i41] & 7) == 4) {
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
                    oo0o0Oo oo0o0oo7 = oo0o0oo6;
                    String str3 = oo0o0ooArr6[i37].OooO0OO(i38).f6768OooO0oO[iArrCopyOf[i42]].f6412OooOOOO;
                    int i44 = i43 + 1;
                    if (i43 == 0) {
                        str2 = str3;
                    } else {
                        z9 = (!o00.OooO00o(str2, str3)) | z9;
                    }
                    iMin = Math.min(iMin, mappedTrackInfo.f8126OooO0o0[i37][i38][i42] & 24);
                    i42++;
                    i43 = i44;
                    oo0o0oo6 = oo0o0oo7;
                }
                oo0o0Oo oo0o0oo8 = oo0o0oo6;
                if (z9) {
                    iMin = Math.min(iMin, mappedTrackInfo.f8124OooO0Oo[i37]);
                }
                boolean z10 = iMin != 0;
                int i45 = o000ooooOooO0OO3.f6765OooO0Oo;
                int[] iArr15 = new int[i45];
                boolean[] zArr = new boolean[i45];
                for (int i46 = 0; i46 < o000ooooOooO0OO3.f6765OooO0Oo; i46++) {
                    iArr15[i46] = mappedTrackInfo.f8126OooO0o0[i37][i38][i46] & 7;
                    int i47 = 0;
                    while (true) {
                        if (i47 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        TrackSelection trackSelection2 = (TrackSelection) list.get(i47);
                        if (trackSelection2.OooO0oo().equals(o000ooooOooO0OO3) && trackSelection2.OooO0oO(i46) != -1) {
                            z2 = true;
                            break;
                        }
                        i47++;
                    }
                    zArr[i46] = z2;
                }
                oooO00o4.OooO0OO(new androidx.media3.common.o00Oo0.OooO00o(o000ooooOooO0OO3, z10, iArr15, zArr));
                i38++;
                oo0o0oo6 = oo0o0oo8;
                b = -1;
                listArr = listArr2;
            }
        }
        int i48 = 0;
        while (true) {
            oo0o0Oo oo0o0oo9 = mappedTrackInfo.f8125OooO0o;
            if (i48 >= oo0o0oo9.f33893OooO0Oo) {
                return new o00000O0((o00OO000[]) pairCreate.first, (OooO0o[]) pairCreate.second, new androidx.media3.common.o00Oo0(oooO00o4.OooO0oo()), mappedTrackInfo);
            }
            o000oOoO o000ooooOooO0OO4 = oo0o0oo9.OooO0OO(i48);
            int[] iArr16 = new int[o000ooooOooO0OO4.f6765OooO0Oo];
            Arrays.fill(iArr16, 0);
            oooO00o4.OooO0OO(new androidx.media3.common.o00Oo0.OooO00o(o000ooooOooO0OO4, false, iArr16, new boolean[o000ooooOooO0OO4.f6765OooO0Oo]));
            i48++;
        }
    }
}
