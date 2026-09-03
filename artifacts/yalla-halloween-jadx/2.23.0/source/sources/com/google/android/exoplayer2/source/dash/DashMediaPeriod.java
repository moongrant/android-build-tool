package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.OooOOO;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO;
import com.google.android.exoplayer2.source.o00Oo0;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.primitives.OooO0o;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p022Oooo00O.OooOO0;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o0O00OO;
import p226o00oOo00.o00000OO;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p226o00oOo00.o000OOo;
import p226o00oOo00.o0O0O00;
import p227o00oOo0O.OooOo00;
import p227o00oOo0O.o0OoOo0;
import p228o00oOo0o.o00O0O;
import p228o00oOo0o.o00Ooo;
import p228o00oOo0o.o00oO0o;
import p228o00oOo0o.o0OOO0o;
import p228o00oOo0o.o0ooOOo;
import p228o00oOo0o.oo0o0Oo;
import p235o00oOooO.o00OO0OO;
import p235o00oOooO.oo0o0O0;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o00O0OO0;
import p244o00oo0Oo.oo00o;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaPeriod implements OooOOO, o00Oo0.OooO00o<o00OO0OO<OooO00o>>, o00OO0OO.OooO0O0<OooO00o> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOo00 f13158OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f13159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o00O0OO0 f13160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o.InterfaceC0210OooO00o f13161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0OO f13162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f13163OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f13164OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final oo00o f13165OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000OO0O f13166OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final TrackGroupInfo[] f13167OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000O0 f13168OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o000OOo f13169OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooO0OO f13170OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.OooOo00.OooO00o f13171OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0O0.OooO00o f13173OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o0O0O00 f13174OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f13175OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o0O0OOO0 f13176OooOo00;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f13179OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public o00Ooo f13180OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public List<o0ooOOo> f13181OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final Pattern f13157OooOoo0 = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final Pattern f13156OooOoo = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00OO0OO<OooO00o>[] f13177OooOo0O = new o00OO0OO[0];

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0OoOo0[] f13178OooOo0o = new o0OoOo0[0];

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final IdentityHashMap<o00OO0OO<OooO00o>, OooO0OO.C0212OooO0OO> f13172OooOOo0 = new IdentityHashMap<>();

    public static final class TrackGroupInfo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f13182OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13183OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13184OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13185OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13186OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13187OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f13188OooO0oO;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        public TrackGroupInfo(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f13183OooO0O0 = i;
            this.f13182OooO00o = iArr;
            this.f13184OooO0OO = i2;
            this.f13187OooO0o0 = i3;
            this.f13186OooO0o = i4;
            this.f13188OooO0oO = i5;
            this.f13185OooO0Oo = i6;
        }
    }

    public DashMediaPeriod(int i, o00Ooo o00ooo2, OooOo00 oooOo00, int i2, OooO00o.InterfaceC0210OooO00o interfaceC0210OooO00o, @Nullable o00O0OO0 o00o0oo1, com.google.android.exoplayer2.drm.OooO0OO oooO0OO, com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, LoadErrorHandlingPolicy loadErrorHandlingPolicy, com.google.android.exoplayer2.source.OooOo00.OooO00o oooO00o2, long j, oo00o oo00oVar, o000OO0O o000oo0o2, o000OOo o000ooo2, DashMediaSource.OooO0OO oooO0OO2, o0O0OOO0 o0o0ooo0) {
        int i3;
        int i4;
        boolean z;
        OooOo[] oooOoArrOooO0o;
        o00oO0o o00oo0o2;
        o00oO0o o00oo0o3;
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO3 = oooO0OO;
        this.f13159OooO0Oo = i;
        this.f13180OooOoO0 = o00ooo2;
        this.f13158OooO = oooOo00;
        this.f13179OooOoO = i2;
        this.f13161OooO0o0 = interfaceC0210OooO00o;
        this.f13160OooO0o = o00o0oo1;
        this.f13162OooO0oO = oooO0OO3;
        this.f13173OooOOoo = oooO00o;
        this.f13163OooO0oo = loadErrorHandlingPolicy;
        this.f13171OooOOo = oooO00o2;
        this.f13164OooOO0 = j;
        this.f13165OooOO0O = oo00oVar;
        this.f13166OooOO0o = o000oo0o2;
        this.f13169OooOOOO = o000ooo2;
        this.f13176OooOo00 = o0o0ooo0;
        this.f13170OooOOOo = new OooO0OO(o00ooo2, oooO0OO2, o000oo0o2);
        int i5 = 0;
        o00OO0OO<OooO00o>[] o00oo0ooArr = this.f13177OooOo0O;
        o000ooo2.getClass();
        this.f13174OooOo = new o0O0O00(o00oo0ooArr);
        o0OOO0o o0ooo0oOooO0O0 = o00ooo2.OooO0O0(i2);
        List<o0ooOOo> list = o0ooo0oOooO0O0.f39979OooO0Oo;
        this.f13181OooOoOO = list;
        List<o00O0O> list2 = o0ooo0oOooO0O0.f39978OooO0OO;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(list2.get(i6).f39929OooO00o, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i5 < size) {
            o00O0O o00o0o2 = list2.get(i5);
            List<o00oO0o> list3 = o00o0o2.f39934OooO0o0;
            while (true) {
                if (i7 >= list3.size()) {
                    o00oo0o2 = null;
                    break;
                }
                o00oo0o2 = list3.get(i7);
                if ("http://dashif.org/guidelines/trickmode".equals(o00oo0o2.f39952OooO00o)) {
                    break;
                } else {
                    i7++;
                }
            }
            List<o00oO0o> list4 = o00o0o2.f39933OooO0o;
            if (o00oo0o2 == null) {
                int i8 = 0;
                while (true) {
                    if (i8 >= list4.size()) {
                        o00oo0o2 = null;
                        break;
                    }
                    o00oo0o2 = list4.get(i8);
                    if ("http://dashif.org/guidelines/trickmode".equals(o00oo0o2.f39952OooO00o)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int iMin = (o00oo0o2 == null || (iMin = sparseIntArray.get(Integer.parseInt(o00oo0o2.f39953OooO0O0), -1)) == -1) ? i5 : iMin;
            if (iMin == i5) {
                int i9 = 0;
                while (true) {
                    if (i9 >= list4.size()) {
                        o00oo0o3 = null;
                        break;
                    }
                    o00oO0o o00oo0o4 = list4.get(i9);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(o00oo0o4.f39952OooO00o)) {
                        o00oo0o3 = o00oo0o4;
                        break;
                    }
                    i9++;
                }
                if (o00oo0o3 != null) {
                    int i10 = o0O00.f40595OooO00o;
                    for (String str : o00oo0o3.f39953OooO0O0.split(",", -1)) {
                        int i11 = sparseIntArray.get(Integer.parseInt(str), -1);
                        if (i11 != -1) {
                            iMin = Math.min(iMin, i11);
                        }
                    }
                }
            }
            if (iMin != i5) {
                List list5 = (List) sparseArray.get(i5);
                List list6 = (List) sparseArray.get(iMin);
                list6.addAll(list5);
                sparseArray.put(i5, list6);
                arrayList.remove(list5);
            }
            i5++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrOooO0Oo = OooO0o.OooO0Oo((Collection) arrayList.get(i12));
            iArr[i12] = iArrOooO0Oo;
            Arrays.sort(iArrOooO0Oo);
        }
        boolean[] zArr = new boolean[size2];
        OooOo[][] oooOoArr = new OooOo[size2][];
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            int[] iArr2 = iArr[i14];
            int length = iArr2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    z = false;
                    break;
                }
                List<oo0o0Oo> list7 = list2.get(iArr2[i15]).f39931OooO0OO;
                for (int i16 = 0; i16 < list7.size(); i16++) {
                    if (!list7.get(i16).f40006OooO0Oo.isEmpty()) {
                        z = true;
                        break;
                    }
                }
                i15++;
            }
            if (z) {
                zArr[i14] = true;
                i13++;
            }
            int[] iArr3 = iArr[i14];
            int length2 = iArr3.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    oooOoArrOooO0o = new OooOo[0];
                    break;
                }
                int i18 = iArr3[i17];
                o00O0O o00o0o3 = list2.get(i18);
                List<o00oO0o> list8 = list2.get(i18).f39932OooO0Oo;
                int i19 = 0;
                int[] iArr4 = iArr3;
                while (i19 < list8.size()) {
                    o00oO0o o00oo0o5 = list8.get(i19);
                    int i20 = length2;
                    List<o00oO0o> list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(o00oo0o5.f39952OooO00o)) {
                        OooOo.OooO00o oooO00o3 = new OooOo.OooO00o();
                        oooO00o3.f11244OooOO0O = "application/cea-608";
                        oooO00o3.f11235OooO00o = OooOO0.OooO0O0(new StringBuilder(), o00o0o3.f39929OooO00o, ":cea608");
                        oooOoArrOooO0o = OooO0o(o00oo0o5, f13157OooOoo0, new OooOo(oooO00o3));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(o00oo0o5.f39952OooO00o)) {
                        OooOo.OooO00o oooO00o4 = new OooOo.OooO00o();
                        oooO00o4.f11244OooOO0O = "application/cea-708";
                        oooO00o4.f11235OooO00o = OooOO0.OooO0O0(new StringBuilder(), o00o0o3.f39929OooO00o, ":cea708");
                        oooOoArrOooO0o = OooO0o(o00oo0o5, f13156OooOoo, new OooOo(oooO00o4));
                        break;
                    }
                    i19++;
                    length2 = i20;
                    list8 = list9;
                }
                i17++;
                iArr3 = iArr4;
            }
            oooOoArr[i14] = oooOoArrOooO0o;
            if (oooOoArrOooO0o.length != 0) {
                i13++;
            }
        }
        int size3 = list.size() + i13 + size2;
        o000O00O[] o000o00oArr = new o000O00O[size3];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[size3];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr5 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i23 = size2;
            int i24 = 0;
            while (i24 < length3) {
                arrayList3.addAll(list2.get(iArr5[i24]).f39931OooO0OO);
                i24++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            OooOo[] oooOoArr2 = new OooOo[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size4;
                OooOo oooOo = ((oo0o0Oo) arrayList3.get(i25)).f40003OooO00o;
                ArrayList arrayList4 = arrayList3;
                int iOooO00o = oooO0OO3.OooO00o(oooOo);
                OooOo.OooO00o OooO00o2 = oooOo.OooO00o();
                OooO00o2.f11265Oooo000 = iOooO00o;
                oooOoArr2[i25] = OooO00o2.OooO00o();
                i25++;
                size4 = i26;
                arrayList3 = arrayList4;
            }
            o00O0O o00o0o4 = list2.get(iArr5[0]);
            int i27 = o00o0o4.f39929OooO00o;
            String string = i27 != -1 ? Integer.toString(i27) : android.support.v4.media.OooO00o.OooO00o("unset:", i21);
            int i28 = i22 + 1;
            if (zArr[i21]) {
                i3 = i28;
                i28++;
            } else {
                i3 = -1;
            }
            List<o00O0O> list10 = list2;
            if (oooOoArr[i21].length != 0) {
                int i29 = i28;
                i28++;
                i4 = i29;
            } else {
                i4 = -1;
            }
            o000o00oArr[i22] = new o000O00O(string, oooOoArr2);
            trackGroupInfoArr[i22] = new TrackGroupInfo(iArr5, o00o0o4.f39930OooO0O0, 0, i22, i3, i4, -1);
            int i30 = -1;
            int i31 = i3;
            if (i31 != -1) {
                String strOooO00o = OooOOOO.OooO00o(string, ":emsg");
                OooOo.OooO00o oooO00o5 = new OooOo.OooO00o();
                oooO00o5.f11235OooO00o = strOooO00o;
                oooO00o5.f11244OooOO0O = "application/x-emsg";
                o000o00oArr[i31] = new o000O00O(strOooO00o, new OooOo(oooO00o5));
                trackGroupInfoArr[i31] = new TrackGroupInfo(iArr5, 5, 1, i22, -1, -1, -1);
                i30 = -1;
            }
            if (i4 != i30) {
                o000o00oArr[i4] = new o000O00O(OooOOOO.OooO00o(string, ":cc"), oooOoArr[i21]);
                trackGroupInfoArr[i4] = new TrackGroupInfo(iArr5, 3, 1, i22, -1, -1, -1);
            }
            i21++;
            size2 = i23;
            oooO0OO3 = oooO0OO;
            i22 = i28;
            iArr = iArr6;
            list2 = list10;
            zArr = zArr;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            o0ooOOo o0ooooo = list.get(i32);
            OooOo.OooO00o oooO00o6 = new OooOo.OooO00o();
            oooO00o6.f11235OooO00o = o0ooooo.OooO00o();
            oooO00o6.f11244OooOO0O = "application/x-emsg";
            o000o00oArr[i22] = new o000O00O(o0ooooo.OooO00o() + CertificateUtil.DELIMITER + i32, new OooOo(oooO00o6));
            trackGroupInfoArr[i22] = new TrackGroupInfo(new int[0], 5, 2, -1, -1, -1, i32);
            i32++;
            i22++;
        }
        Pair pairCreate = Pair.create(new o000O0(o000o00oArr), trackGroupInfoArr);
        this.f13168OooOOO0 = (o000O0) pairCreate.first;
        this.f13167OooOOO = (TrackGroupInfo[]) pairCreate.second;
    }

    public static OooOo[] OooO0o(o00oO0o o00oo0o2, Pattern pattern, OooOo oooOo) {
        String str = o00oo0o2.f39953OooO0O0;
        if (str == null) {
            return new OooOo[]{oooOo};
        }
        int i = o0O00.f40595OooO00o;
        String[] strArrSplit = str.split(";", -1);
        OooOo[] oooOoArr = new OooOo[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new OooOo[]{oooOo};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo);
            oooO00o.f11235OooO00o = oooOo.f11201OooO0Oo + CertificateUtil.DELIMITER + i3;
            oooO00o.f11261OooOoo = i3;
            oooO00o.f11237OooO0OO = matcher.group(2);
            oooOoArr[i2] = new OooOo(oooO00o);
        }
        return oooOoArr;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0.OooO00o
    public final void OooO00o(o00Oo0 o00oo1) {
        this.f13175OooOo0.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        for (o00OO0OO<OooO00o> o00oo0oo : this.f13177OooOo0O) {
            if (o00oo0oo.f40264OooO0Oo == 2) {
                return o00oo0oo.f40268OooO0oo.OooO0OO(j, o0o00oo2);
            }
        }
        return j;
    }

    public final int OooO0Oo(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        TrackGroupInfo[] trackGroupInfoArr = this.f13167OooOOO;
        int i3 = trackGroupInfoArr[i2].f13187OooO0o0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && trackGroupInfoArr[i5].f13184OooO0OO == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        return this.f13174OooOo.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0oO(long j) {
        oo0o0O0 oo0o0o0;
        boolean zOooOo;
        for (o00OO0OO<OooO00o> o00oo0oo : this.f13177OooOo0O) {
            o00oo0oo.f40283OooOo0o = j;
            if (o00oo0oo.OooOoO0()) {
                o00oo0oo.f40282OooOo0O = j;
            } else {
                int i = 0;
                while (true) {
                    if (i < o00oo0oo.f40272OooOOO.size()) {
                        oo0o0o0 = o00oo0oo.f40272OooOOO.get(i);
                        long j2 = oo0o0o0.f40259OooO0oO;
                        if (j2 == j && oo0o0o0.f40301OooOO0O == -9223372036854775807L) {
                            break;
                        }
                        if (j2 <= j) {
                            i++;
                        }
                    }
                    oo0o0o0 = null;
                    break;
                }
                if (oo0o0o0 != null) {
                    com.google.android.exoplayer2.source.o00O0O o00o0o2 = o00oo0oo.f40275OooOOOo;
                    int iOooO0o0 = oo0o0o0.OooO0o0(0);
                    synchronized (o00o0o2) {
                        o00o0o2.OooOo0O();
                        int i2 = o00o0o2.f13317OooOOo0;
                        if (iOooO0o0 < i2 || iOooO0o0 > o00o0o2.f13315OooOOOo + i2) {
                            zOooOo = false;
                        } else {
                            o00o0o2.f13321OooOo00 = Long.MIN_VALUE;
                            o00o0o2.f13318OooOOoo = iOooO0o0 - i2;
                            zOooOo = true;
                        }
                    }
                } else {
                    zOooOo = o00oo0oo.f40275OooOOOo.OooOo(j, j < o00oo0oo.OooO0o0());
                }
                if (zOooOo) {
                    com.google.android.exoplayer2.source.o00O0O o00o0o3 = o00oo0oo.f40275OooOOOo;
                    o00oo0oo.f40279OooOo = o00oo0oo.OooOoOO(o00o0o3.f13317OooOOo0 + o00o0o3.f13318OooOOoo, 0);
                    for (com.google.android.exoplayer2.source.o00O0O o00o0o4 : o00oo0oo.f40277OooOOo0) {
                        o00o0o4.OooOo(j, true);
                    }
                } else {
                    o00oo0oo.f40282OooOo0O = j;
                    o00oo0oo.f40284OooOoO = false;
                    o00oo0oo.f40272OooOOO.clear();
                    o00oo0oo.f40279OooOo = 0;
                    if (o00oo0oo.f40271OooOO0o.OooO0O0()) {
                        o00oo0oo.f40275OooOOOo.OooO0oo();
                        for (com.google.android.exoplayer2.source.o00O0O o00o0o5 : o00oo0oo.f40277OooOOo0) {
                            o00o0o5.OooO0oo();
                        }
                        Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = o00oo0oo.f40271OooOO0o.f14195OooO0O0;
                        o00O000o.OooO0o0(oooO0OO);
                        oooO0OO.OooO00o(false);
                    } else {
                        o00oo0oo.f40271OooOO0o.f14196OooO0OO = null;
                        o00oo0oo.f40275OooOOOo.OooOo0(false);
                        for (com.google.android.exoplayer2.source.o00O0O o00o0o6 : o00oo0oo.f40277OooOOo0) {
                            o00o0o6.OooOo0(false);
                        }
                    }
                }
            }
        }
        for (o0OoOo0 o0oooo0 : this.f13178OooOo0o) {
            o0oooo0.OooO0OO(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        return this.f13174OooOo.OooO0oo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
        this.f13175OooOo0 = oooO00o;
        oooO00o.OooO0O0(this);
    }

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
    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int i;
        o000O00O o000o00o2;
        boolean z;
        int i2;
        o000O00O o000o00o3;
        int[] iArr;
        o000O00O o000o00oOooO00o;
        int i3;
        o000O00O o000o00oOooO00o2;
        int i4;
        OooO0OO.C0212OooO0OO c0212OooO0OO;
        com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr2 = oooO0oArr;
        int[] iArr2 = new int[oooO0oArr2.length];
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= oooO0oArr2.length) {
                break;
            }
            com.google.android.exoplayer2.trackselection.OooO0o oooO0o = oooO0oArr2[i5];
            if (oooO0o != null) {
                int iIndexOf = this.f13168OooOOO0.f39868OooO0o0.indexOf(oooO0o.OooOO0());
                iArr2[i5] = iIndexOf >= 0 ? iIndexOf : -1;
            } else {
                iArr2[i5] = -1;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            o000o00o2 = null;
            if (i6 >= oooO0oArr2.length) {
                break;
            }
            if (oooO0oArr2[i6] == null || !zArr[i6]) {
                SampleStream sampleStream = sampleStreamArr[i6];
                if (sampleStream instanceof o00OO0OO) {
                    o00OO0OO o00oo0oo = (o00OO0OO) sampleStream;
                    o00oo0oo.f40280OooOo0 = this;
                    com.google.android.exoplayer2.source.o00O0O o00o0o2 = o00oo0oo.f40275OooOOOo;
                    o00o0o2.OooO0oo();
                    DrmSession drmSession = o00o0o2.f13308OooO0oo;
                    if (drmSession != null) {
                        drmSession.OooO0O0(o00o0o2.f13306OooO0o0);
                        o00o0o2.f13308OooO0oo = null;
                        o00o0o2.f13307OooO0oO = null;
                    }
                    for (com.google.android.exoplayer2.source.o00O0O o00o0o3 : o00oo0oo.f40277OooOOo0) {
                        o00o0o3.OooO0oo();
                        DrmSession drmSession2 = o00o0o3.f13308OooO0oo;
                        if (drmSession2 != null) {
                            drmSession2.OooO0O0(o00o0o3.f13306OooO0o0);
                            o00o0o3.f13308OooO0oo = null;
                            o00o0o3.f13307OooO0oO = null;
                        }
                    }
                    o00oo0oo.f40271OooOO0o.OooO0OO(o00oo0oo);
                } else if (sampleStream instanceof o00OO0OO.OooO00o) {
                    o00OO0OO.OooO00o oooO00o = (o00OO0OO.OooO00o) sampleStream;
                    o00OO0OO o00oo0oo2 = o00OO0OO.this;
                    boolean[] zArr3 = o00oo0oo2.f40267OooO0oO;
                    int i7 = oooO00o.f40287OooO0o;
                    o00O000o.OooO0Oo(zArr3[i7]);
                    o00oo0oo2.f40267OooO0oO[i7] = false;
                }
                sampleStreamArr[i6] = null;
            }
            i6++;
        }
        int i8 = 0;
        while (true) {
            z = true;
            boolean z2 = true;
            if (i8 >= oooO0oArr2.length) {
                break;
            }
            SampleStream sampleStream2 = sampleStreamArr[i8];
            if ((sampleStream2 instanceof o00000OO) || (sampleStream2 instanceof o00OO0OO.OooO00o)) {
                int iOooO0Oo = OooO0Oo(i8, iArr2);
                if (iOooO0Oo == -1) {
                    z2 = sampleStreamArr[i8] instanceof o00000OO;
                } else {
                    SampleStream sampleStream3 = sampleStreamArr[i8];
                    if (!(sampleStream3 instanceof o00OO0OO.OooO00o) || ((o00OO0OO.OooO00o) sampleStream3).f40286OooO0Oo != sampleStreamArr[iOooO0Oo]) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    SampleStream sampleStream4 = sampleStreamArr[i8];
                    if (sampleStream4 instanceof o00OO0OO.OooO00o) {
                        o00OO0OO.OooO00o oooO00o2 = (o00OO0OO.OooO00o) sampleStream4;
                        o00OO0OO o00oo0oo3 = o00OO0OO.this;
                        boolean[] zArr4 = o00oo0oo3.f40267OooO0oO;
                        int i9 = oooO00o2.f40287OooO0o;
                        o00O000o.OooO0Oo(zArr4[i9]);
                        o00oo0oo3.f40267OooO0oO[i9] = false;
                    }
                    sampleStreamArr[i8] = null;
                }
            }
            i8++;
        }
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int i10 = 0;
        while (i10 < oooO0oArr2.length) {
            com.google.android.exoplayer2.trackselection.OooO0o oooO0o2 = oooO0oArr2[i10];
            if (oooO0o2 == null) {
                i2 = i10;
                o000o00o3 = o000o00o2;
                iArr = iArr2;
            } else {
                SampleStream sampleStream5 = sampleStreamArr2[i10];
                if (sampleStream5 == null) {
                    zArr2[i10] = z;
                    TrackGroupInfo trackGroupInfo = this.f13167OooOOO[iArr2[i10]];
                    int i11 = trackGroupInfo.f13184OooO0OO;
                    if (i11 == 0) {
                        int i12 = trackGroupInfo.f13186OooO0o;
                        boolean z3 = i12 != i ? z ? 1 : 0 : false;
                        if (z3) {
                            o000o00oOooO00o = this.f13168OooOOO0.OooO00o(i12);
                            i3 = z ? 1 : 0;
                        } else {
                            o000o00oOooO00o = o000o00o2;
                            i3 = 0;
                        }
                        int i13 = trackGroupInfo.f13188OooO0oO;
                        Object[] objArr = i13 != i ? z ? 1 : 0 : null;
                        if (objArr != null) {
                            o000o00oOooO00o2 = this.f13168OooOOO0.OooO00o(i13);
                            i3 += o000o00oOooO00o2.f39873OooO0Oo;
                        } else {
                            o000o00oOooO00o2 = o000o00o2;
                        }
                        OooOo[] oooOoArr = new OooOo[i3];
                        int[] iArr3 = new int[i3];
                        if (z3) {
                            oooOoArr[0] = o000o00oOooO00o.f39876OooO0oO[0];
                            iArr3[0] = 5;
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (objArr != null) {
                            for (int i14 = 0; i14 < o000o00oOooO00o2.f39873OooO0Oo; i14++) {
                                OooOo oooOo = o000o00oOooO00o2.f39876OooO0oO[i14];
                                oooOoArr[i4] = oooOo;
                                iArr3[i4] = 3;
                                arrayList.add(oooOo);
                                i4 += z ? 1 : 0;
                            }
                        }
                        if (this.f13180OooOoO0.f39943OooO0Oo && z3) {
                            OooO0OO oooO0OO = this.f13170OooOOOo;
                            c0212OooO0OO = oooO0OO.new C0212OooO0OO(oooO0OO.f13268OooO0Oo);
                        } else {
                            c0212OooO0OO = null;
                        }
                        iArr = iArr2;
                        i2 = i10;
                        o000o00o3 = null;
                        OooO0OO.C0212OooO0OO c0212OooO0OO2 = c0212OooO0OO;
                        o00OO0OO<OooO00o> o00oo0oo4 = new o00OO0OO<>(trackGroupInfo.f13183OooO0O0, iArr3, oooOoArr, this.f13161OooO0o0.OooO00o(this.f13165OooOO0O, this.f13180OooOoO0, this.f13158OooO, this.f13179OooOoO, trackGroupInfo.f13182OooO00o, oooO0o2, trackGroupInfo.f13183OooO0O0, this.f13164OooOO0, z3, arrayList, c0212OooO0OO, this.f13160OooO0o, this.f13176OooOo00), this, this.f13166OooOO0o, j, this.f13162OooO0oO, this.f13173OooOOoo, this.f13163OooO0oo, this.f13171OooOOo);
                        synchronized (this) {
                            this.f13172OooOOo0.put(o00oo0oo4, c0212OooO0OO2);
                        }
                        sampleStreamArr[i2] = o00oo0oo4;
                        sampleStreamArr2 = sampleStreamArr;
                    } else {
                        i2 = i10;
                        o000o00o3 = o000o00o2;
                        iArr = iArr2;
                        if (i11 == 2) {
                            sampleStreamArr2[i2] = new o0OoOo0(this.f13181OooOoOO.get(trackGroupInfo.f13185OooO0Oo), oooO0o2.OooOO0().f39876OooO0oO[0], this.f13180OooOoO0.f39943OooO0Oo);
                        }
                    }
                } else {
                    i2 = i10;
                    o000o00o3 = o000o00o2;
                    iArr = iArr2;
                    if (sampleStream5 instanceof o00OO0OO) {
                        ((OooO00o) ((o00OO0OO) sampleStream5).f40268OooO0oo).OooO0o(oooO0o2);
                    }
                }
            }
            i10 = i2 + 1;
            oooO0oArr2 = oooO0oArr;
            o000o00o2 = o000o00o3;
            iArr2 = iArr;
            z = true;
            i = -1;
        }
        int[] iArr4 = iArr2;
        int i15 = 0;
        while (i15 < oooO0oArr.length) {
            if (sampleStreamArr2[i15] == null && oooO0oArr[i15] != null) {
                TrackGroupInfo trackGroupInfo2 = this.f13167OooOOO[iArr4[i15]];
                if (trackGroupInfo2.f13184OooO0OO == 1) {
                    iArr4 = iArr4;
                    int iOooO0Oo2 = OooO0Oo(i15, iArr4);
                    if (iOooO0Oo2 == -1) {
                        sampleStreamArr2[i15] = new o00000OO();
                    } else {
                        o00OO0OO o00oo0oo5 = (o00OO0OO) sampleStreamArr2[iOooO0Oo2];
                        int i16 = trackGroupInfo2.f13183OooO0O0;
                        int i17 = 0;
                        while (true) {
                            com.google.android.exoplayer2.source.o00O0O[] o00o0oArr = o00oo0oo5.f40277OooOOo0;
                            if (i17 >= o00o0oArr.length) {
                                throw new IllegalStateException();
                            }
                            if (o00oo0oo5.f40266OooO0o0[i17] == i16) {
                                boolean[] zArr5 = o00oo0oo5.f40267OooO0oO;
                                o00O000o.OooO0Oo(!zArr5[i17]);
                                zArr5[i17] = true;
                                o00o0oArr[i17].OooOo(j, true);
                                sampleStreamArr2[i15] = new o00OO0OO.OooO00o(o00oo0oo5, o00o0oArr[i17], i17);
                                break;
                            }
                            i17++;
                        }
                    }
                }
                i15++;
                iArr4 = iArr4;
            }
            i15++;
            iArr4 = iArr4;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (SampleStream sampleStream6 : sampleStreamArr2) {
            if (sampleStream6 instanceof o00OO0OO) {
                arrayList2.add((o00OO0OO) sampleStream6);
            } else if (sampleStream6 instanceof o0OoOo0) {
                arrayList3.add((o0OoOo0) sampleStream6);
            }
        }
        o00OO0OO<OooO00o>[] o00oo0ooArr = new o00OO0OO[arrayList2.size()];
        this.f13177OooOo0O = o00oo0ooArr;
        arrayList2.toArray(o00oo0ooArr);
        o0OoOo0[] o0oooo0Arr = new o0OoOo0[arrayList3.size()];
        this.f13178OooOo0o = o0oooo0Arr;
        arrayList3.toArray(o0oooo0Arr);
        o000OOo o000ooo2 = this.f13169OooOOOO;
        o00OO0OO<OooO00o>[] o00oo0ooArr2 = this.f13177OooOo0O;
        o000ooo2.getClass();
        this.f13174OooOo = new o0O0O00(o00oo0ooArr2);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOOOO() throws IOException {
        this.f13165OooOO0O.OooO00o();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final o000O0 OooOOo() {
        return this.f13168OooOOO0;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        return this.f13174OooOo.OooOOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        return this.f13174OooOo.OooOOoo();
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
        this.f13174OooOo.OooOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOo00(long j, boolean z) {
        long j2;
        for (o00OO0OO<OooO00o> o00oo0oo : this.f13177OooOo0O) {
            if (!o00oo0oo.OooOoO0()) {
                com.google.android.exoplayer2.source.o00O0O o00o0o2 = o00oo0oo.f40275OooOOOo;
                int i = o00o0o2.f13317OooOOo0;
                o00o0o2.OooO0oO(j, z, true);
                com.google.android.exoplayer2.source.o00O0O o00o0o3 = o00oo0oo.f40275OooOOOo;
                int i2 = o00o0o3.f13317OooOOo0;
                if (i2 > i) {
                    synchronized (o00o0o3) {
                        j2 = o00o0o3.f13315OooOOOo == 0 ? Long.MIN_VALUE : o00o0o3.f13312OooOOO[o00o0o3.f13316OooOOo];
                    }
                    int i3 = 0;
                    while (true) {
                        com.google.android.exoplayer2.source.o00O0O[] o00o0oArr = o00oo0oo.f40277OooOOo0;
                        if (i3 >= o00o0oArr.length) {
                            break;
                        }
                        o00o0oArr[i3].OooO0oO(j2, z, o00oo0oo.f40267OooO0oO[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(o00oo0oo.OooOoOO(i2, 0), o00oo0oo.f40279OooOo);
                if (iMin > 0) {
                    ArrayList<oo0o0O0> arrayList = o00oo0oo.f40272OooOOO;
                    int i4 = o0O00.f40595OooO00o;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    o00oo0oo.f40279OooOo -= iMin;
                } else {
                    continue;
                }
            }
        }
    }
}
