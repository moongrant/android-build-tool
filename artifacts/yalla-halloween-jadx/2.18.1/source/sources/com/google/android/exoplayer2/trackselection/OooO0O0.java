package com.google.android.exoplayer2.trackselection;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p318o0O0oOo.o00000O;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p319o0O0oOo0.o000;
import p319o0O0oOo0.o0000OO0;
import p466o0OooO0.o000O0Oo;
import p709oo0oOOo.OooO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0O0 extends o0000OO0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14775OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f14776OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TrackGroupArray[] f14777OooO0OO;

        public OooO00o(int[] iArr, TrackGroupArray[] trackGroupArrayArr) {
            this.f14776OooO0O0 = iArr;
            this.f14777OooO0OO = trackGroupArrayArr;
            this.f14775OooO00o = iArr.length;
        }
    }

    @Override // p319o0O0oOo0.o0000OO0
    public final void OooO00o(@Nullable Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0289 A[LOOP:8: B:67:0x0155->B:110:0x0289, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:422:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:481:0x0283 A[SYNTHETIC] */
    @Override // p319o0O0oOo0.o0000OO0
    public final o000 OooO0O0(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray) throws ExoPlaybackException {
        int i;
        OooO0OO[] oooO0OOArr;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        String str;
        DefaultTrackSelector.Parameters parameters;
        Pair pairCreate;
        int[][] iArr;
        TrackGroup trackGroup;
        String str2;
        int[][] iArr2;
        OooO00o oooO00o;
        int i4;
        int i5;
        DefaultTrackSelector.Parameters parameters2;
        String str3;
        OooO0OO.OooO00o oooO00o2;
        Pair pairCreate2;
        int i6;
        int[] iArr3;
        int i7;
        int i8;
        String str4;
        int i9;
        TrackGroup trackGroup2;
        DefaultTrackSelector defaultTrackSelector;
        int i10;
        OooO0OO.OooO00o[] oooO00oArr;
        int i11;
        int[][][] iArr4;
        int[] iArr5;
        DefaultTrackSelector.Parameters parameters3;
        boolean z4;
        OooO00o oooO00o3;
        DefaultTrackSelector.Parameters parameters4;
        TrackGroupArray trackGroupArray2;
        int[][] iArr6;
        OooO0OO.OooO00o oooO00o4;
        List<Integer> list;
        ArrayList arrayList;
        String str5;
        int[] iArrOooO0O0;
        ArrayList arrayList2;
        HashSet hashSet;
        int i12;
        int[] iArr7;
        TrackGroupArray trackGroupArray3 = trackGroupArray;
        int[] iArr8 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr9 = new int[rendererCapabilitiesArr.length + 1][][];
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = trackGroupArray3.f14605Oooo0o;
            trackGroupArr[i14] = new TrackGroup[i15];
            iArr9[i14] = new int[i15][];
        }
        int length2 = rendererCapabilitiesArr.length;
        int[] iArr10 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr10[i16] = rendererCapabilitiesArr[i16].OooOOO();
        }
        int i17 = 0;
        while (i17 < trackGroupArray3.f14605Oooo0o) {
            TrackGroup trackGroup3 = trackGroupArray3.f14606Oooo0oO[i17];
            boolean z5 = o000OO.OooO0o(trackGroup3.f14602Oooo0oO[i13].f13131OoooOOo) == 4;
            int length3 = rendererCapabilitiesArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z6 = true;
            while (i18 < rendererCapabilitiesArr.length) {
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i18];
                int iMax = 0;
                while (i13 < trackGroup3.f14601Oooo0o) {
                    iMax = Math.max(iMax, rendererCapabilities.OooO0OO(trackGroup3.f14602Oooo0oO[i13]) & 7);
                    i13++;
                }
                boolean z7 = iArr8[i18] == 0;
                if (iMax > i19 || (iMax == i19 && z5 && !z6 && z7)) {
                    z6 = z7;
                    i19 = iMax;
                    length3 = i18;
                }
                i18++;
                i13 = 0;
            }
            if (length3 == rendererCapabilitiesArr.length) {
                iArr7 = new int[trackGroup3.f14601Oooo0o];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr11 = new int[trackGroup3.f14601Oooo0o];
                for (int i20 = 0; i20 < trackGroup3.f14601Oooo0o; i20++) {
                    iArr11[i20] = rendererCapabilities2.OooO0OO(trackGroup3.f14602Oooo0oO[i20]);
                }
                iArr7 = iArr11;
            }
            int i21 = iArr8[length3];
            trackGroupArr[length3][i21] = trackGroup3;
            iArr9[length3][i21] = iArr7;
            iArr8[length3] = iArr8[length3] + 1;
            i17++;
            trackGroupArray3 = trackGroupArray;
            i13 = 0;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr12 = new int[rendererCapabilitiesArr.length];
        for (int i22 = 0; i22 < rendererCapabilitiesArr.length; i22++) {
            int i23 = iArr8[i22];
            trackGroupArrayArr[i22] = new TrackGroupArray((TrackGroup[]) o000OOo0.OooOoo(trackGroupArr[i22], i23));
            iArr9[i22] = (int[][]) o000OOo0.OooOoo(iArr9[i22], i23);
            strArr[i22] = rendererCapabilitiesArr[i22].getName();
            iArr12[i22] = ((OooO0o) rendererCapabilitiesArr[i22]).f13201Oooo0o;
        }
        new TrackGroupArray((TrackGroup[]) o000OOo0.OooOoo(trackGroupArr[rendererCapabilitiesArr.length], iArr8[rendererCapabilitiesArr.length]));
        OooO00o oooO00o5 = new OooO00o(iArr12, trackGroupArrayArr);
        DefaultTrackSelector defaultTrackSelector2 = (DefaultTrackSelector) this;
        DefaultTrackSelector.Parameters parameters5 = defaultTrackSelector2.f14699OooO0OO.get();
        int i24 = oooO00o5.f14775OooO00o;
        OooO0OO.OooO00o[] oooO00oArr2 = new OooO0OO.OooO00o[i24];
        OooO00o oooO00o6 = oooO00o5;
        DefaultTrackSelector.Parameters parameters6 = parameters5;
        int i25 = 0;
        boolean z8 = false;
        boolean z9 = false;
        while (i25 < i24) {
            if (2 == oooO00o6.f14776OooO0O0[i25]) {
                if (z9) {
                    defaultTrackSelector = defaultTrackSelector2;
                    i10 = i24;
                    oooO00oArr = oooO00oArr2;
                    i11 = i25;
                    iArr4 = iArr9;
                    z4 = z8;
                    iArr5 = iArr10;
                    parameters3 = parameters5;
                } else {
                    TrackGroupArray trackGroupArray4 = oooO00o6.f14777OooO0OO[i25];
                    int[][] iArr13 = iArr9[i25];
                    int i26 = iArr10[i25];
                    if (parameters6.f14761o00O0O || parameters6.f14767ooOO) {
                        oooO00o3 = oooO00o5;
                        defaultTrackSelector = defaultTrackSelector2;
                        parameters4 = parameters5;
                        i10 = i24;
                        oooO00oArr = oooO00oArr2;
                        i11 = i25;
                        iArr4 = iArr9;
                        z4 = z8;
                        iArr5 = iArr10;
                        trackGroupArray2 = trackGroupArray4;
                        iArr6 = iArr13;
                        oooO00o4 = null;
                        break;
                    }
                    int i27 = parameters6.f14751Ooooo00 ? 24 : 16;
                    boolean z10 = parameters6.f14750OoooOoo && (i26 & i27) != 0;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= trackGroupArray4.f14605Oooo0o) {
                            oooO00o3 = oooO00o5;
                            defaultTrackSelector = defaultTrackSelector2;
                            parameters4 = parameters5;
                            i10 = i24;
                            oooO00oArr = oooO00oArr2;
                            i11 = i25;
                            iArr4 = iArr9;
                            z4 = z8;
                            iArr5 = iArr10;
                            trackGroupArray2 = trackGroupArray4;
                            iArr6 = iArr13;
                            oooO00o4 = null;
                            break;
                        }
                        TrackGroup trackGroup4 = trackGroupArray4.f14606Oooo0oO[i28];
                        int[] iArr14 = iArr13[i28];
                        defaultTrackSelector = defaultTrackSelector2;
                        int i29 = parameters6.f14743OoooO0;
                        iArr5 = iArr10;
                        int i30 = parameters6.f14744OoooO0O;
                        iArr4 = iArr9;
                        int i31 = parameters6.f14742OoooO;
                        i10 = i24;
                        int i32 = parameters6.f14745OoooOO0;
                        z4 = z8;
                        int i33 = parameters6.f14760o000oOoO;
                        oooO00o3 = oooO00o5;
                        int i34 = parameters6.f14746OoooOOO;
                        oooO00oArr = oooO00oArr2;
                        int i35 = parameters6.f14747OoooOOo;
                        i11 = i25;
                        int i36 = parameters6.f14748OoooOo0;
                        iArr6 = iArr13;
                        int i37 = parameters6.f14752Ooooo0o;
                        parameters4 = parameters5;
                        int i38 = parameters6.f14753OooooO0;
                        boolean z11 = parameters6.f14754OooooOO;
                        trackGroupArray2 = trackGroupArray4;
                        int i39 = i28;
                        if (trackGroup4.f14601Oooo0o < 2) {
                            iArrOooO0O0 = DefaultTrackSelector.f14695OooO0Oo;
                        } else {
                            List<Integer> listOooO0Oo = DefaultTrackSelector.OooO0Oo(trackGroup4, i37, i38, z11);
                            ArrayList arrayList3 = (ArrayList) listOooO0Oo;
                            if (arrayList3.size() < 2) {
                                iArrOooO0O0 = DefaultTrackSelector.f14695OooO0Oo;
                            } else {
                                if (z10) {
                                    list = listOooO0Oo;
                                    arrayList = arrayList3;
                                    str5 = null;
                                } else {
                                    HashSet hashSet2 = new HashSet();
                                    int i40 = 0;
                                    int i41 = 0;
                                    str5 = null;
                                    while (i41 < arrayList3.size()) {
                                        List<Integer> list2 = listOooO0Oo;
                                        String str6 = trackGroup4.f14602Oooo0oO[((Integer) arrayList3.get(i41)).intValue()].f13131OoooOOo;
                                        if (hashSet2.add(str6)) {
                                            hashSet = hashSet2;
                                            i12 = i41;
                                            int i42 = 0;
                                            int i43 = 0;
                                            while (i43 < arrayList3.size()) {
                                                int iIntValue = ((Integer) arrayList3.get(i43)).intValue();
                                                ArrayList arrayList4 = arrayList3;
                                                if (DefaultTrackSelector.OooO0o(trackGroup4.f14602Oooo0oO[iIntValue], str6, iArr14[iIntValue], i27, i29, i30, i31, i32, i33, i34, i35, i36)) {
                                                    i42++;
                                                }
                                                i43++;
                                                arrayList3 = arrayList4;
                                            }
                                            arrayList2 = arrayList3;
                                            if (i42 > i40) {
                                                str5 = str6;
                                                i40 = i42;
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                            hashSet = hashSet2;
                                            i12 = i41;
                                        }
                                        i41 = i12 + 1;
                                        listOooO0Oo = list2;
                                        hashSet2 = hashSet;
                                        arrayList3 = arrayList2;
                                    }
                                    list = listOooO0Oo;
                                    arrayList = arrayList3;
                                }
                                int size = arrayList.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    ArrayList arrayList5 = arrayList;
                                    int iIntValue2 = ((Integer) arrayList5.get(size)).intValue();
                                    if (!DefaultTrackSelector.OooO0o(trackGroup4.f14602Oooo0oO[iIntValue2], str5, iArr14[iIntValue2], i27, i29, i30, i31, i32, i33, i34, i35, i36)) {
                                        arrayList5.remove(size);
                                    }
                                    arrayList = arrayList5;
                                }
                                iArrOooO0O0 = arrayList.size() < 2 ? DefaultTrackSelector.f14695OooO0Oo : o0OOOOO.OooO0OO.OooO0O0(list);
                            }
                            if (iArrOooO0O0.length > 0) {
                                oooO00o4 = new OooO0OO.OooO00o(trackGroup4, iArrOooO0O0);
                                break;
                            }
                            i28 = i39 + 1;
                            defaultTrackSelector2 = defaultTrackSelector;
                            iArr10 = iArr5;
                            iArr9 = iArr4;
                            i24 = i10;
                            z8 = z4;
                            oooO00o5 = oooO00o3;
                            oooO00oArr2 = oooO00oArr;
                            i25 = i11;
                            iArr13 = iArr6;
                            parameters5 = parameters4;
                            parameters6 = parameters5;
                            trackGroupArray4 = trackGroupArray2;
                            z10 = z10;
                        }
                        z10 = z10;
                        if (iArrOooO0O0.length > 0) {
                            oooO00o4 = new OooO0OO.OooO00o(trackGroup4, iArrOooO0O0);
                            break;
                        }
                        i28 = i39 + 1;
                        defaultTrackSelector2 = defaultTrackSelector;
                        iArr10 = iArr5;
                        iArr9 = iArr4;
                        i24 = i10;
                        z8 = z4;
                        oooO00o5 = oooO00o3;
                        oooO00oArr2 = oooO00oArr;
                        i25 = i11;
                        iArr13 = iArr6;
                        parameters5 = parameters4;
                        parameters6 = parameters5;
                        trackGroupArray4 = trackGroupArray2;
                        z10 = z10;
                    }
                    if (oooO00o4 == null) {
                        TrackGroupArray trackGroupArray5 = trackGroupArray2;
                        TrackGroup trackGroup5 = null;
                        DefaultTrackSelector.OooO oooO = null;
                        int i44 = 0;
                        int i45 = -1;
                        while (i44 < trackGroupArray5.f14605Oooo0o) {
                            TrackGroup trackGroup6 = trackGroupArray5.f14606Oooo0oO[i44];
                            DefaultTrackSelector.Parameters parameters7 = parameters4;
                            List<Integer> listOooO0Oo2 = DefaultTrackSelector.OooO0Oo(trackGroup6, parameters7.f14752Ooooo0o, parameters7.f14753OooooO0, parameters7.f14754OooooOO);
                            int[] iArr15 = iArr6[i44];
                            for (int i46 = 0; i46 < trackGroup6.f14601Oooo0o; i46++) {
                                Format format = trackGroup6.f14602Oooo0oO[i46];
                                if ((format.f13127OoooO00 & 16384) == 0 && DefaultTrackSelector.OooO0o0(iArr15[i46], parameters7.f14762o00Oo0)) {
                                    DefaultTrackSelector.OooO oooO2 = new DefaultTrackSelector.OooO(format, parameters7, iArr15[i46], ((ArrayList) listOooO0Oo2).contains(Integer.valueOf(i46)));
                                    if ((oooO2.f14701Oooo0o || parameters7.f14749OoooOoO) && (oooO == null || oooO2.compareTo(oooO) > 0)) {
                                        trackGroup5 = trackGroup6;
                                        i45 = i46;
                                        oooO = oooO2;
                                    }
                                }
                            }
                            i44++;
                            parameters4 = parameters7;
                        }
                        parameters3 = parameters4;
                        oooO00o4 = trackGroup5 == null ? null : new OooO0OO.OooO00o(trackGroup5, i45);
                    } else {
                        parameters3 = parameters4;
                    }
                    oooO00oArr[i11] = oooO00o4;
                    z9 = oooO00oArr[i11] != null;
                    parameters6 = parameters3;
                    oooO00o5 = oooO00o3;
                }
                oooO00o6 = oooO00o5;
                z8 = z4 | (oooO00o5.f14777OooO0OO[i11].f14605Oooo0o > 0);
            } else {
                defaultTrackSelector = defaultTrackSelector2;
                i10 = i24;
                oooO00oArr = oooO00oArr2;
                i11 = i25;
                iArr4 = iArr9;
                iArr5 = iArr10;
                parameters3 = parameters5;
            }
            parameters5 = parameters3;
            iArr10 = iArr5;
            iArr9 = iArr4;
            i24 = i10;
            oooO00oArr2 = oooO00oArr;
            i25 = i11 + 1;
            defaultTrackSelector2 = defaultTrackSelector;
        }
        DefaultTrackSelector defaultTrackSelector3 = defaultTrackSelector2;
        DefaultTrackSelector.Parameters parameters8 = parameters5;
        OooO0OO.OooO00o[] oooO00oArr3 = oooO00oArr2;
        int[][][] iArr16 = iArr9;
        boolean z12 = z8;
        int[] iArr17 = iArr10;
        int i47 = i24;
        DefaultTrackSelector.OooO00o oooO00o7 = null;
        int i48 = -1;
        int i49 = 0;
        String str7 = null;
        while (i49 < i47) {
            if (1 == oooO00o6.f14776OooO0O0[i49]) {
                boolean z13 = !z12;
                TrackGroupArray trackGroupArray6 = oooO00o6.f14777OooO0OO[i49];
                int[][] iArr18 = iArr16[i49];
                int i50 = iArr17[i49];
                DefaultTrackSelector.OooO00o oooO00o8 = null;
                int i51 = -1;
                int i52 = -1;
                int i53 = 0;
                while (i53 < trackGroupArray6.f14605Oooo0o) {
                    TrackGroup trackGroup7 = trackGroupArray6.f14606Oooo0oO[i53];
                    int[] iArr19 = iArr18[i53];
                    int i54 = i51;
                    int i55 = i52;
                    int i56 = 0;
                    while (i56 < trackGroup7.f14601Oooo0o) {
                        String str8 = str7;
                        if (DefaultTrackSelector.OooO0o0(iArr19[i56], parameters6.f14762o00Oo0)) {
                            trackGroup2 = trackGroup7;
                            DefaultTrackSelector.OooO00o oooO00o9 = new DefaultTrackSelector.OooO00o(trackGroup7.f14602Oooo0oO[i56], parameters6, iArr19[i56]);
                            if ((oooO00o9.f14707Oooo0o || parameters6.f14756Oooooo) && (oooO00o8 == null || oooO00o9.compareTo(oooO00o8) > 0)) {
                                i55 = i56;
                                oooO00o8 = oooO00o9;
                                i54 = i53;
                            }
                        } else {
                            trackGroup2 = trackGroup7;
                        }
                        i56++;
                        str7 = str8;
                        trackGroup7 = trackGroup2;
                    }
                    i53++;
                    i51 = i54;
                    i52 = i55;
                }
                str3 = str7;
                if (i51 == -1) {
                    oooO00o = oooO00o5;
                    i4 = i49;
                    i5 = i47;
                    parameters2 = parameters8;
                    pairCreate2 = null;
                } else {
                    TrackGroup trackGroup8 = trackGroupArray6.f14606Oooo0oO[i51];
                    if (parameters6.f14761o00O0O || parameters6.f14767ooOO || !z13) {
                        oooO00o = oooO00o5;
                        i4 = i49;
                        i5 = i47;
                        parameters2 = parameters8;
                    } else {
                        int[] iArr20 = iArr18[i51];
                        int i57 = parameters6.f14757Oooooo0;
                        boolean z14 = parameters6.f14758OoooooO;
                        boolean z15 = parameters6.f14759Ooooooo;
                        boolean z16 = parameters6.f14766o0OoOo0;
                        Format format2 = trackGroup8.f14602Oooo0oO[i52];
                        int[] iArr21 = new int[trackGroup8.f14601Oooo0o];
                        oooO00o = oooO00o5;
                        i5 = i47;
                        parameters2 = parameters8;
                        int i58 = 0;
                        int i59 = 0;
                        while (i59 < trackGroup8.f14601Oooo0o) {
                            if (i59 != i52) {
                                Format format3 = trackGroup8.f14602Oooo0oO[i59];
                                i6 = i49;
                                iArr3 = iArr20;
                                if (DefaultTrackSelector.OooO0o0(iArr20[i59], false) && ((i7 = format3.f13125OoooO) == -1 || i7 <= i57) && ((z16 || ((i9 = format3.f13150o0OoOo0) != -1 && i9 == format2.f13150o0OoOo0)) && ((z14 || ((str4 = format3.f13131OoooOOo) != null && TextUtils.equals(str4, format2.f13131OoooOOo))) && (z15 || ((i8 = format3.f13152ooOO) != -1 && i8 == format2.f13152ooOO))))) {
                                }
                                i59++;
                                i49 = i6;
                                iArr20 = iArr3;
                            } else {
                                i6 = i49;
                                iArr3 = iArr20;
                            }
                            iArr21[i58] = i59;
                            i58++;
                            i59++;
                            i49 = i6;
                            iArr20 = iArr3;
                        }
                        i4 = i49;
                        int[] iArrCopyOf = Arrays.copyOf(iArr21, i58);
                        oooO00o2 = iArrCopyOf.length > 1 ? new OooO0OO.OooO00o(trackGroup8, iArrCopyOf) : null;
                        if (oooO00o2 == null) {
                            oooO00o2 = new OooO0OO.OooO00o(trackGroup8, i52);
                        }
                        Objects.requireNonNull(oooO00o8);
                        pairCreate2 = Pair.create(oooO00o2, oooO00o8);
                    }
                    if (oooO00o2 == null) {
                        oooO00o2 = new OooO0OO.OooO00o(trackGroup8, i52);
                    }
                    Objects.requireNonNull(oooO00o8);
                    pairCreate2 = Pair.create(oooO00o2, oooO00o8);
                }
                if (pairCreate2 != null && (oooO00o7 == null || ((DefaultTrackSelector.OooO00o) pairCreate2.second).compareTo(oooO00o7) > 0)) {
                    if (i48 != -1) {
                        oooO00oArr3[i48] = null;
                    }
                    OooO0OO.OooO00o oooO00o10 = (OooO0OO.OooO00o) pairCreate2.first;
                    oooO00oArr3[i4] = oooO00o10;
                    str7 = oooO00o10.f14778OooO00o.f14602Oooo0oO[oooO00o10.f14779OooO0O0[0]].f13124Oooo0oo;
                    i48 = i4;
                    oooO00o7 = (DefaultTrackSelector.OooO00o) pairCreate2.second;
                }
                i49 = i4 + 1;
                i47 = i5;
                oooO00o5 = oooO00o;
                oooO00o6 = oooO00o5;
                parameters8 = parameters2;
                parameters6 = parameters8;
            } else {
                oooO00o = oooO00o5;
                i4 = i49;
                i5 = i47;
                parameters2 = parameters8;
                str3 = str7;
            }
            str7 = str3;
            i49 = i4 + 1;
            i47 = i5;
            oooO00o5 = oooO00o;
            oooO00o6 = oooO00o5;
            parameters8 = parameters2;
            parameters6 = parameters8;
        }
        OooO00o oooO00o11 = oooO00o5;
        int i60 = i47;
        DefaultTrackSelector.Parameters parameters9 = parameters8;
        String str9 = str7;
        int i61 = -1;
        DefaultTrackSelector.OooO0o oooO0o = null;
        int i62 = 0;
        while (true) {
            i = i60;
            if (i62 >= i) {
                break;
            }
            OooO00o oooO00o12 = oooO00o11;
            int i63 = oooO00o12.f14776OooO0O0[i62];
            if (i63 == 1 || i63 == 2) {
                str = str9;
                parameters = parameters9;
            } else if (i63 != 3) {
                TrackGroupArray trackGroupArray7 = oooO00o12.f14777OooO0OO[i62];
                int[][] iArr22 = iArr16[i62];
                TrackGroup trackGroup9 = null;
                DefaultTrackSelector.OooO0O0 oooO0O0 = null;
                int i64 = 0;
                for (int i65 = 0; i65 < trackGroupArray7.f14605Oooo0o; i65++) {
                    TrackGroup trackGroup10 = trackGroupArray7.f14606Oooo0oO[i65];
                    int[] iArr23 = iArr22[i65];
                    int i66 = 0;
                    while (i66 < trackGroup10.f14601Oooo0o) {
                        TrackGroupArray trackGroupArray8 = trackGroupArray7;
                        DefaultTrackSelector.Parameters parameters10 = parameters9;
                        if (DefaultTrackSelector.OooO0o0(iArr23[i66], parameters10.f14762o00Oo0)) {
                            iArr2 = iArr22;
                            DefaultTrackSelector.OooO0O0 oooO0O1 = new DefaultTrackSelector.OooO0O0(trackGroup10.f14602Oooo0oO[i66], iArr23[i66]);
                            if (oooO0O0 == null || oooO0O1.compareTo(oooO0O0) > 0) {
                                trackGroup9 = trackGroup10;
                                i64 = i66;
                                oooO0O0 = oooO0O1;
                            }
                        } else {
                            iArr2 = iArr22;
                        }
                        i66++;
                        parameters9 = parameters10;
                        trackGroupArray7 = trackGroupArray8;
                        iArr22 = iArr2;
                    }
                }
                parameters = parameters9;
                oooO00oArr3[i62] = trackGroup9 == null ? null : new OooO0OO.OooO00o(trackGroup9, i64);
                str = str9;
            } else {
                parameters = parameters9;
                TrackGroupArray trackGroupArray9 = oooO00o12.f14777OooO0OO[i62];
                int[][] iArr24 = iArr16[i62];
                TrackGroup trackGroup11 = null;
                DefaultTrackSelector.OooO0o oooO0o2 = null;
                int i67 = -1;
                for (int i68 = 0; i68 < trackGroupArray9.f14605Oooo0o; i68++) {
                    TrackGroup trackGroup12 = trackGroupArray9.f14606Oooo0oO[i68];
                    int[] iArr25 = iArr24[i68];
                    int i69 = 0;
                    while (i69 < trackGroup12.f14601Oooo0o) {
                        TrackGroupArray trackGroupArray10 = trackGroupArray9;
                        if (DefaultTrackSelector.OooO0o0(iArr25[i69], parameters.f14762o00Oo0)) {
                            iArr = iArr24;
                            trackGroup = trackGroup12;
                            str2 = str9;
                            DefaultTrackSelector.OooO0o oooO0o3 = new DefaultTrackSelector.OooO0o(trackGroup12.f14602Oooo0oO[i69], parameters, iArr25[i69], str2);
                            if (oooO0o3.f14735Oooo0o && (oooO0o2 == null || oooO0o3.compareTo(oooO0o2) > 0)) {
                                i67 = i69;
                                oooO0o2 = oooO0o3;
                                trackGroup11 = trackGroup;
                            }
                        } else {
                            iArr = iArr24;
                            trackGroup = trackGroup12;
                            str2 = str9;
                        }
                        i69++;
                        str9 = str2;
                        trackGroupArray9 = trackGroupArray10;
                        iArr24 = iArr;
                        trackGroup12 = trackGroup;
                    }
                }
                str = str9;
                if (trackGroup11 == null) {
                    pairCreate = null;
                } else {
                    OooO0OO.OooO00o oooO00o13 = new OooO0OO.OooO00o(trackGroup11, i67);
                    Objects.requireNonNull(oooO0o2);
                    pairCreate = Pair.create(oooO00o13, oooO0o2);
                }
                if (pairCreate != null && (oooO0o == null || ((DefaultTrackSelector.OooO0o) pairCreate.second).compareTo(oooO0o) > 0)) {
                    if (i61 != -1) {
                        oooO00oArr3[i61] = null;
                    }
                    oooO00oArr3[i62] = (OooO0OO.OooO00o) pairCreate.first;
                    oooO0o = (DefaultTrackSelector.OooO0o) pairCreate.second;
                    i61 = i62;
                }
            }
            i62++;
            i60 = i;
            oooO00o11 = oooO00o12;
            str9 = str;
            parameters9 = parameters;
        }
        OooO00o oooO00o14 = oooO00o11;
        DefaultTrackSelector.Parameters parameters11 = parameters9;
        for (int i70 = 0; i70 < i; i70++) {
            if (parameters11.f14765o00ooo.get(i70)) {
                oooO00oArr3[i70] = null;
            } else {
                TrackGroupArray trackGroupArray11 = oooO00o14.f14777OooO0OO[i70];
                Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride> map = parameters11.f14764o00o0O.get(i70);
                if (map != null && map.containsKey(trackGroupArray11)) {
                    Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride> map2 = parameters11.f14764o00o0O.get(i70);
                    DefaultTrackSelector.SelectionOverride selectionOverride = map2 != null ? map2.get(trackGroupArray11) : null;
                    oooO00oArr3[i70] = selectionOverride == null ? null : new OooO0OO.OooO00o(trackGroupArray11.f14606Oooo0oO[selectionOverride.f14769Oooo0o], selectionOverride.f14770Oooo0oO, selectionOverride.f14771Oooo0oo, Integer.valueOf(selectionOverride.f14768Oooo));
                }
            }
        }
        OooO0OO.OooO0O0 oooO0O2 = defaultTrackSelector3.f14698OooO0O0;
        OooO oooO3 = defaultTrackSelector3.f36763OooO00o;
        Objects.requireNonNull(oooO3);
        Objects.requireNonNull((com.google.android.exoplayer2.trackselection.OooO00o.OooO0OO) oooO0O2);
        OooO0OO[] oooO0OOArr2 = new OooO0OO[i];
        for (int i71 = 0; i71 < i; i71++) {
            OooO0OO.OooO00o oooO00o15 = oooO00oArr3[i71];
            if (oooO00o15 != null) {
                int[] iArr26 = oooO00o15.f14779OooO0O0;
                if (iArr26.length == 1) {
                    oooO0OOArr2[i71] = new p319o0O0oOo0.o000OO(oooO00o15.f14778OooO00o, iArr26[0], oooO00o15.f14781OooO0Oo);
                    int i72 = oooO00o15.f14778OooO00o.f14602Oooo0oO[oooO00o15.f14779OooO0O0[0]].f13125OoooO;
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i73 = 0; i73 < i; i73++) {
            OooO0OO.OooO00o oooO00o16 = oooO00oArr3[i73];
            if (oooO00o16 != null) {
                int[] iArr27 = oooO00o16.f14779OooO0O0;
                if (iArr27.length > 1) {
                    com.google.android.exoplayer2.trackselection.OooO00o oooO00o17 = new com.google.android.exoplayer2.trackselection.OooO00o(oooO00o16.f14778OooO00o, iArr27, new com.google.android.exoplayer2.trackselection.OooO00o.OooO0O0(oooO3), o00000O.f36668OooO00o);
                    arrayList6.add(oooO00o17);
                    oooO0OOArr2[i73] = oooO00o17;
                }
            }
        }
        if (arrayList6.size() > 1) {
            int size2 = arrayList6.size();
            long[][] jArr = new long[size2][];
            for (int i74 = 0; i74 < arrayList6.size(); i74++) {
                com.google.android.exoplayer2.trackselection.OooO00o oooO00o18 = (com.google.android.exoplayer2.trackselection.OooO00o) arrayList6.get(i74);
                jArr[i74] = new long[oooO00o18.f36766OooO0OO.length];
                int i75 = 0;
                while (true) {
                    int[] iArr28 = oooO00o18.f36766OooO0OO;
                    if (i75 < iArr28.length) {
                        jArr[i74][i75] = oooO00o18.f36767OooO0Oo[(iArr28.length - i75) - 1].f13125OoooO;
                        i75++;
                    }
                }
            }
            double[][] dArr = new double[size2][];
            for (int i76 = 0; i76 < size2; i76++) {
                dArr[i76] = new double[jArr[i76].length];
                int i77 = 0;
                while (i77 < jArr[i76].length) {
                    dArr[i76][i77] = jArr[i76][i77] == -1 ? 0.0d : Math.log(jArr[i76][i77]);
                    i77++;
                    oooO0OOArr2 = oooO0OOArr2;
                }
            }
            oooO0OOArr = oooO0OOArr2;
            double[][] dArr2 = new double[size2][];
            for (int i78 = 0; i78 < size2; i78++) {
                dArr2[i78] = new double[dArr[i78].length - 1];
                if (dArr2[i78].length != 0) {
                    double d = dArr[i78][dArr[i78].length - 1] - dArr[i78][0];
                    int i79 = 0;
                    for (int i80 = -1; i79 < dArr[i78].length + i80; i80 = -1) {
                        int i81 = i79 + 1;
                        dArr2[i78][i79] = d == 0.0d ? 1.0d : (((dArr[i78][i79] + dArr[i78][i81]) * 0.5d) - dArr[i78][0]) / d;
                        i79 = i81;
                    }
                }
            }
            int length4 = 0;
            for (int i82 = 0; i82 < size2; i82++) {
                length4 += dArr2[i82].length;
            }
            int i83 = length4 + 3;
            int i84 = 1;
            long[][][] jArr2 = (long[][][]) Array.newInstance((Class<?>) long.class, size2, i83, 2);
            int[] iArr29 = new int[size2];
            com.google.android.exoplayer2.trackselection.OooO00o.OooOO0(jArr2, 1, jArr, iArr29);
            int i85 = 2;
            while (true) {
                i3 = i83 - 1;
                if (i85 >= i3) {
                    break;
                }
                double d2 = Double.MAX_VALUE;
                int i86 = 0;
                int i87 = 0;
                while (i86 < size2) {
                    if (iArr29[i86] + i84 != dArr[i86].length) {
                        double d3 = dArr2[i86][iArr29[i86]];
                        if (d3 < d2) {
                            i87 = i86;
                            d2 = d3;
                        }
                    }
                    i86++;
                    i84 = 1;
                }
                iArr29[i87] = iArr29[i87] + 1;
                com.google.android.exoplayer2.trackselection.OooO00o.OooOO0(jArr2, i85, jArr, iArr29);
                i85++;
                i84 = 1;
            }
            for (long[][] jArr3 : jArr2) {
                int i88 = i83 - 2;
                jArr3[i3][0] = jArr3[i88][0] * 2;
                jArr3[i3][1] = jArr3[i88][1] * 2;
            }
            for (int i89 = 0; i89 < arrayList6.size(); i89++) {
                com.google.android.exoplayer2.trackselection.OooO00o oooO00o19 = (com.google.android.exoplayer2.trackselection.OooO00o) arrayList6.get(i89);
                long[][] jArr4 = jArr2[i89];
                Objects.requireNonNull((com.google.android.exoplayer2.trackselection.OooO00o.OooO0O0) oooO00o19.f14772OooO0o);
                o00000O0.OooO00o(jArr4.length >= 2);
            }
        } else {
            oooO0OOArr = oooO0OOArr2;
        }
        o000O0Oo[] o000o0ooArr = new o000O0Oo[i];
        for (int i90 = 0; i90 < i; i90++) {
            o000o0ooArr[i90] = !parameters11.f14765o00ooo.get(i90) && (oooO00o14.f14776OooO0O0[i90] == 6 || oooO0OOArr[i90] != null) ? o000O0Oo.f40537OooO0O0 : null;
        }
        int i91 = parameters11.f14763o00Ooo;
        if (i91 != 0) {
            int i92 = 0;
            int i93 = -1;
            int i94 = -1;
            while (true) {
                if (i92 >= oooO00o14.f14775OooO00o) {
                    i2 = -1;
                    z = true;
                    z2 = true;
                    break;
                }
                int i95 = oooO00o14.f14776OooO0O0[i92];
                OooO0OO oooO0OO = oooO0OOArr[i92];
                if (i95 == 1 || i95 == 2) {
                    if (oooO0OO != null) {
                        int[][] iArr30 = iArr16[i92];
                        TrackGroupArray trackGroupArray12 = oooO00o14.f14777OooO0OO[i92];
                        TrackGroup trackGroupOooO00o = oooO0OO.OooO00o();
                        int i96 = 0;
                        while (true) {
                            if (i96 >= trackGroupArray12.f14605Oooo0o) {
                                i96 = -1;
                                break;
                            }
                            if (trackGroupArray12.f14606Oooo0oO[i96] == trackGroupOooO00o) {
                                break;
                            }
                            i96++;
                        }
                        int i97 = 0;
                        while (true) {
                            if (i97 >= oooO0OO.length()) {
                                z3 = true;
                                break;
                            }
                            if ((iArr30[i96][oooO0OO.OooO0oO(i97)] & 32) != 32) {
                                z3 = false;
                                break;
                            }
                            i97++;
                        }
                        if (z3) {
                            z = true;
                            if (i95 == 1) {
                                i2 = -1;
                                if (i93 != -1) {
                                    z2 = false;
                                    break;
                                }
                                i93 = i92;
                            } else {
                                i2 = -1;
                                if (i94 != -1) {
                                    z2 = false;
                                    break;
                                }
                                i94 = i92;
                            }
                        }
                    }
                }
                i92++;
            }
            if (i93 == i2 || i94 == i2) {
                z = false;
            }
            if (z2 & z) {
                o000O0Oo o000o0oo2 = new o000O0Oo(i91);
                o000o0ooArr[i93] = o000o0oo2;
                o000o0ooArr[i94] = o000o0oo2;
            }
        }
        Pair pairCreate3 = Pair.create(o000o0ooArr, oooO0OOArr);
        return new o000((o000O0Oo[]) pairCreate3.first, (OooO0OO[]) pairCreate3.second, oooO00o14);
    }
}
