package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.common.collect.o000000O;
import com.google.common.collect.o0O000Oo;
import com.google.common.collect.o0o0Oo;
import com.google.common.collect.o0oOO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p318o0O0oOo.o000OOo0;
import p319o0O0oOo0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.OooO0OO.OooO0O0 f14698OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicReference<Parameters> f14699OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f14695OooO0Oo = new int[0];

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0oOO<Integer> f14697OooO0o0 = o0oOO.OooO00o(new Comparator() { // from class: o0O0oOo0.o0000O0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int[] iArr = DefaultTrackSelector.f14695OooO0Oo;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0oOO<Integer> f14696OooO0o = o0oOO.OooO00o(o0000O0O.f36760Oooo0oO);

    public static final class OooO implements Comparable<OooO> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f14700Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final boolean f14701Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Parameters f14702Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final boolean f14703Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f14704OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f14705OoooO00;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public OooO(Format format, Parameters parameters, int i, boolean z) {
            boolean z2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            this.f14702Oooo0oO = parameters;
            boolean z3 = true;
            int i9 = -1;
            if (!z || (((i6 = format.f13136Ooooo0o) != -1 && i6 > parameters.f14743OoooO0) || ((i7 = format.f13137OooooO0) != -1 && i7 > parameters.f14744OoooO0O))) {
                z2 = false;
            } else {
                float f = format.f13138OooooOO;
                if ((f == -1.0f || f <= parameters.f14742OoooO) && ((i8 = format.f13125OoooO) == -1 || i8 <= parameters.f14745OoooOO0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f14701Oooo0o = z2;
            if (!z || (((i3 = format.f13136Ooooo0o) != -1 && i3 < parameters.f14760o000oOoO) || ((i4 = format.f13137OooooO0) != -1 && i4 < parameters.f14746OoooOOO))) {
                z3 = false;
            } else {
                float f2 = format.f13138OooooOO;
                if ((f2 != -1.0f && f2 < parameters.f14747OoooOOo) || ((i5 = format.f13125OoooO) != -1 && i5 < parameters.f14748OoooOo0)) {
                    z3 = false;
                }
            }
            this.f14703Oooo0oo = z3;
            this.f14700Oooo = DefaultTrackSelector.OooO0o0(i, false);
            this.f14705OoooO00 = format.f13125OoooO;
            int i10 = format.f13136Ooooo0o;
            if (i10 != -1 && (i2 = format.f13137OooooO0) != -1) {
                i9 = i10 * i2;
            }
            this.f14704OoooO0 = i9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO oooO) {
            Object objOooO0O0 = (this.f14701Oooo0o && this.f14700Oooo) ? DefaultTrackSelector.f14697OooO0o0 : DefaultTrackSelector.f14697OooO0o0.OooO0O0();
            return o000000O.f18412OooO00o.OooO0Oo(this.f14700Oooo, oooO.f14700Oooo).OooO0Oo(this.f14701Oooo0o, oooO.f14701Oooo0o).OooO0Oo(this.f14703Oooo0oo, oooO.f14703Oooo0oo).OooO0OO(Integer.valueOf(this.f14705OoooO00), Integer.valueOf(oooO.f14705OoooO00), this.f14702Oooo0oO.f14767ooOO ? DefaultTrackSelector.f14697OooO0o0.OooO0O0() : DefaultTrackSelector.f14696OooO0o).OooO0OO(Integer.valueOf(this.f14704OoooO0), Integer.valueOf(oooO.f14704OoooO0), objOooO0O0).OooO0OO(Integer.valueOf(this.f14705OoooO00), Integer.valueOf(oooO.f14705OoooO00), objOooO0O0).OooO0o();
        }
    }

    public static final class OooO00o implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f14706Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final boolean f14707Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public final String f14708Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Parameters f14709Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final boolean f14710OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f14711OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f14712OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final int f14713OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final int f14714OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final int f14715OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final int f14716o000oOoO;

        public OooO00o(Format format, Parameters parameters, int i) {
            this.f14709Oooo0oo = parameters;
            this.f14708Oooo0oO = DefaultTrackSelector.OooO0oO(format.f13124Oooo0oo);
            int i2 = 0;
            this.f14706Oooo = DefaultTrackSelector.OooO0o0(i, false);
            this.f14712OoooO00 = DefaultTrackSelector.OooO0OO(format, parameters.f14783Oooo0o, false);
            boolean z = true;
            this.f14710OoooO = (format.f13121Oooo & 1) != 0;
            int i3 = format.f13150o0OoOo0;
            this.f14714OoooOO0 = i3;
            this.f14716o000oOoO = format.f13152ooOO;
            int i4 = format.f13125OoooO;
            this.f14715OoooOOO = i4;
            if ((i4 != -1 && i4 > parameters.f14757Oooooo0) || (i3 != -1 && i3 > parameters.f14755OooooOo)) {
                z = false;
            }
            this.f14707Oooo0o = z;
            String[] strArrOooOo0O = o000OOo0.OooOo0O();
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < strArrOooOo0O.length; i6++) {
                int iOooO0OO = DefaultTrackSelector.OooO0OO(format, strArrOooOo0O[i6], false);
                if (iOooO0OO > 0) {
                    i5 = i6;
                    i2 = iOooO0OO;
                    break;
                }
            }
            this.f14711OoooO0 = i5;
            this.f14713OoooO0O = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO00o oooO00o) {
            Object objOooO0O0 = (this.f14707Oooo0o && this.f14706Oooo) ? DefaultTrackSelector.f14697OooO0o0 : DefaultTrackSelector.f14697OooO0o0.OooO0O0();
            o000000O o000000oOooO0OO = o000000O.f18412OooO00o.OooO0Oo(this.f14706Oooo, oooO00o.f14706Oooo).OooO00o(this.f14712OoooO00, oooO00o.f14712OoooO00).OooO0Oo(this.f14707Oooo0o, oooO00o.f14707Oooo0o).OooO0OO(Integer.valueOf(this.f14715OoooOOO), Integer.valueOf(oooO00o.f14715OoooOOO), this.f14709Oooo0oo.f14767ooOO ? DefaultTrackSelector.f14697OooO0o0.OooO0O0() : DefaultTrackSelector.f14696OooO0o).OooO0Oo(this.f14710OoooO, oooO00o.f14710OoooO).OooO0OO(Integer.valueOf(this.f14711OoooO0), Integer.valueOf(oooO00o.f14711OoooO0), o0O000Oo.f18601Oooo0o).OooO00o(this.f14713OoooO0O, oooO00o.f14713OoooO0O).OooO0OO(Integer.valueOf(this.f14714OoooOO0), Integer.valueOf(oooO00o.f14714OoooOO0), objOooO0O0).OooO0OO(Integer.valueOf(this.f14716o000oOoO), Integer.valueOf(oooO00o.f14716o000oOoO), objOooO0O0);
            Integer numValueOf = Integer.valueOf(this.f14715OoooOOO);
            Integer numValueOf2 = Integer.valueOf(oooO00o.f14715OoooOOO);
            if (!o000OOo0.OooO00o(this.f14708Oooo0oO, oooO00o.f14708Oooo0oO)) {
                objOooO0O0 = DefaultTrackSelector.f14696OooO0o;
            }
            return o000000oOooO0OO.OooO0OO(numValueOf, numValueOf2, objOooO0O0).OooO0o();
        }
    }

    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final boolean f14717Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f14718Oooo0oO;

        public OooO0O0(Format format, int i) {
            this.f14717Oooo0o = (format.f13121Oooo & 1) != 0;
            this.f14718Oooo0oO = DefaultTrackSelector.OooO0o0(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO0O0 oooO0O0) {
            return o000000O.f18412OooO00o.OooO0Oo(this.f14718Oooo0oO, oooO0O0.f14718Oooo0oO).OooO0Oo(this.f14717Oooo0o, oooO0O0.f14717Oooo0o).OooO0o();
        }
    }

    public static final class OooO0o implements Comparable<OooO0o> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f14734Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final boolean f14735Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f14736Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final boolean f14737Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final boolean f14738OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f14739OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f14740OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final int f14741OoooO0O;

        public OooO0o(Format format, Parameters parameters, int i, @Nullable String str) {
            boolean z = false;
            this.f14736Oooo0oO = DefaultTrackSelector.OooO0o0(i, false);
            int i2 = format.f13121Oooo & (~parameters.f14786OoooO00);
            boolean z2 = (i2 & 1) != 0;
            this.f14737Oooo0oo = z2;
            boolean z3 = (i2 & 2) != 0;
            this.f14734Oooo = z3;
            int iOooO0OO = DefaultTrackSelector.OooO0OO(format, parameters.f14784Oooo0oO, parameters.f14782Oooo);
            this.f14740OoooO00 = iOooO0OO;
            int iBitCount = Integer.bitCount(format.f13127OoooO00 & parameters.f14785Oooo0oo);
            this.f14739OoooO0 = iBitCount;
            this.f14738OoooO = (format.f13127OoooO00 & 1088) != 0;
            int iOooO0OO2 = DefaultTrackSelector.OooO0OO(format, str, DefaultTrackSelector.OooO0oO(str) == null);
            this.f14741OoooO0O = iOooO0OO2;
            if (iOooO0OO > 0 || ((parameters.f14784Oooo0oO == null && iBitCount > 0) || z2 || (z3 && iOooO0OO2 > 0))) {
                z = true;
            }
            this.f14735Oooo0o = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO0o oooO0o) {
            o000000O o000000oOooO00o = o000000O.f18412OooO00o.OooO0Oo(this.f14736Oooo0oO, oooO0o.f14736Oooo0oO).OooO00o(this.f14740OoooO00, oooO0o.f14740OoooO00).OooO00o(this.f14739OoooO0, oooO0o.f14739OoooO0).OooO0Oo(this.f14737Oooo0oo, oooO0o.f14737Oooo0oo).OooO0OO(Boolean.valueOf(this.f14734Oooo), Boolean.valueOf(oooO0o.f14734Oooo), this.f14740OoooO00 == 0 ? o0o0Oo.f18676Oooo0o : o0O000Oo.f18601Oooo0o).OooO00o(this.f14741OoooO0O, oooO0o.f14741OoooO0O);
            if (this.f14739OoooO0 == 0) {
                o000000oOooO00o = o000000oOooO00o.OooO0o0(this.f14738OoooO, oooO0o.f14738OoooO);
            }
            return o000000oOooO00o.OooO0o();
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int f14768Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f14769Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int[] f14770Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f14771Oooo0oo;

        public class OooO00o implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            public final SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SelectionOverride[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(Parcel parcel) {
            this.f14769Oooo0o = parcel.readInt();
            int[] iArr = new int[parcel.readByte()];
            this.f14770Oooo0oO = iArr;
            parcel.readIntArray(iArr);
            this.f14771Oooo0oo = parcel.readInt();
            this.f14768Oooo = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.f14769Oooo0o == selectionOverride.f14769Oooo0o && Arrays.equals(this.f14770Oooo0oO, selectionOverride.f14770Oooo0oO) && this.f14771Oooo0oo == selectionOverride.f14771Oooo0oo && this.f14768Oooo == selectionOverride.f14768Oooo;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f14770Oooo0oO) + (this.f14769Oooo0o * 31)) * 31) + this.f14771Oooo0oo) * 31) + this.f14768Oooo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14769Oooo0o);
            parcel.writeInt(this.f14770Oooo0oO.length);
            parcel.writeIntArray(this.f14770Oooo0oO);
            parcel.writeInt(this.f14771Oooo0oo);
            parcel.writeInt(this.f14768Oooo);
        }
    }

    public DefaultTrackSelector(Context context) {
        com.google.android.exoplayer2.trackselection.OooO00o.OooO0OO oooO0OO = new com.google.android.exoplayer2.trackselection.OooO00o.OooO0OO();
        Parcelable.Creator<Parameters> creator = Parameters.CREATOR;
        Parameters parametersOooO0O0 = new OooO0OO(context).OooO0O0();
        this.f14698OooO0O0 = oooO0OO;
        this.f14699OooO0OO = new AtomicReference<>(parametersOooO0O0);
    }

    public static int OooO0OO(Format format, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f13124Oooo0oo)) {
            return 4;
        }
        String strOooO0oO = OooO0oO(str);
        String strOooO0oO2 = OooO0oO(format.f13124Oooo0oo);
        if (strOooO0oO2 == null || strOooO0oO == null) {
            return (z && strOooO0oO2 == null) ? 1 : 0;
        }
        if (strOooO0oO2.startsWith(strOooO0oO) || strOooO0oO.startsWith(strOooO0oO2)) {
            return 3;
        }
        int i = o000OOo0.f36740OooO00o;
        return strOooO0oO2.split("-", 2)[0].equals(strOooO0oO.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    public static List<Integer> OooO0Oo(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        Point point;
        ArrayList arrayList = new ArrayList(trackGroup.f14601Oooo0o);
        for (int i7 = 0; i7 < trackGroup.f14601Oooo0o; i7++) {
            arrayList.add(Integer.valueOf(i7));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i8 = 0;
            int i9 = Integer.MAX_VALUE;
            while (true) {
                if (i8 >= trackGroup.f14601Oooo0o) {
                    break;
                }
                Format format = trackGroup.f14602Oooo0oO[i8];
                int i10 = format.f13136Ooooo0o;
                if (i10 > 0 && (i4 = format.f13137OooooO0) > 0) {
                    if (!z) {
                        i5 = i;
                        i6 = i2;
                    } else if ((i10 > i4) != (i > i2)) {
                        i6 = i;
                        i5 = i2;
                    } else {
                        i5 = i;
                        i6 = i2;
                    }
                    int i11 = i10 * i6;
                    int i12 = i4 * i5;
                    if (i11 >= i12) {
                        int i13 = o000OOo0.f36740OooO00o;
                        point = new Point(i5, ((i12 + i10) - 1) / i10);
                    } else {
                        int i14 = o000OOo0.f36740OooO00o;
                        point = new Point(((i11 + i4) - 1) / i4, i6);
                    }
                    int i15 = format.f13136Ooooo0o;
                    int i16 = format.f13137OooooO0;
                    int i17 = i15 * i16;
                    if (i15 >= ((int) (point.x * 0.98f)) && i16 >= ((int) (point.y * 0.98f)) && i17 < i9) {
                        i9 = i17;
                    }
                }
                i8++;
            }
            if (i9 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Format format2 = trackGroup.f14602Oooo0oO[((Integer) arrayList.get(size)).intValue()];
                    int i18 = format2.f13136Ooooo0o;
                    int i19 = (i18 == -1 || (i3 = format2.f13137OooooO0) == -1) ? -1 : i18 * i3;
                    if (i19 == -1 || i19 > i9) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean OooO0o(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((format.f13127OoooO00 & 16384) != 0 || !OooO0o0(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !o000OOo0.OooO00o(format.f13131OoooOOo, str)) {
            return false;
        }
        int i11 = format.f13136Ooooo0o;
        if (i11 != -1 && (i7 > i11 || i11 > i3)) {
            return false;
        }
        int i12 = format.f13137OooooO0;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        float f = format.f13138OooooOO;
        if (f != -1.0f && (i9 > f || f > i5)) {
            return false;
        }
        int i13 = format.f13125OoooO;
        return i13 == -1 || (i10 <= i13 && i13 <= i6);
    }

    public static boolean OooO0o0(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    @Nullable
    public static String OooO0oO(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final class OooO0OO extends TrackSelectionParameters.OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f14719OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14720OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14721OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f14722OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14723OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f14724OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f14725OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f14726OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f14727OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f14728OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f14729OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f14730OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f14731OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f14732OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final SparseBooleanArray f14733OooOOo0;

        public OooO0OO(Context context) {
            OooO00o(context);
            OooO0OO();
            this.f14732OooOOOo = new SparseArray<>();
            this.f14733OooOOo0 = new SparseBooleanArray();
            Point pointOooOOOO = o000OOo0.OooOOOO(context);
            int i = pointOooOOOO.x;
            int i2 = pointOooOOOO.y;
            this.f14719OooO = i;
            this.f14726OooOO0 = i2;
            this.f14727OooOO0O = true;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.OooO0O0
        public final TrackSelectionParameters.OooO0O0 OooO00o(Context context) {
            super.OooO00o(context);
            return this;
        }

        public final Parameters OooO0O0() {
            return new Parameters(this.f14720OooO0OO, this.f14721OooO0Oo, this.f14723OooO0o0, this.f14722OooO0o, this.f14724OooO0oO, this.f14725OooO0oo, this.f14719OooO, this.f14726OooOO0, this.f14727OooOO0O, this.f14728OooOO0o, this.f14730OooOOO0, this.f14729OooOOO, this.f14787OooO00o, this.f14788OooO0O0, this.f14731OooOOOO, this.f14732OooOOOo, this.f14733OooOOo0);
        }

        public final void OooO0OO() {
            this.f14720OooO0OO = Integer.MAX_VALUE;
            this.f14721OooO0Oo = Integer.MAX_VALUE;
            this.f14723OooO0o0 = Integer.MAX_VALUE;
            this.f14722OooO0o = Integer.MAX_VALUE;
            this.f14724OooO0oO = true;
            this.f14725OooO0oo = true;
            this.f14719OooO = Integer.MAX_VALUE;
            this.f14726OooOO0 = Integer.MAX_VALUE;
            this.f14727OooOO0O = true;
            this.f14728OooOO0o = Integer.MAX_VALUE;
            this.f14730OooOOO0 = Integer.MAX_VALUE;
            this.f14729OooOOO = true;
            this.f14731OooOOOO = true;
        }

        @Deprecated
        public OooO0OO() {
            OooO0OO();
            this.f14732OooOOOo = new SparseArray<>();
            this.f14733OooOOo0 = new SparseBooleanArray();
        }
    }

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final int f14742OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f14743OoooO0;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final int f14744OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final int f14745OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final int f14746OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final int f14747OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final int f14748OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final boolean f14749OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final boolean f14750OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final boolean f14751Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public final int f14752Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public final int f14753OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public final boolean f14754OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public final int f14755OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public final boolean f14756Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public final int f14757Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public final boolean f14758OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public final boolean f14759Ooooooo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final int f14760o000oOoO;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public final boolean f14761o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public final boolean f14762o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public final int f14763o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f14764o00o0O;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public final SparseBooleanArray f14765o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public final boolean f14766o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public final boolean f14767ooOO;

        public class OooO00o implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            public final Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Parameters[] newArray(int i) {
                return new Parameters[i];
            }
        }

        static {
            new OooO0OO().OooO0O0();
            CREATOR = new OooO00o();
        }

        /* JADX WARN: Failed to parse method signature: (IIIIIIIIZZZIIZLjava/lang/String;IIZZZZLjava/lang/String;IZIZZZILandroid/util/SparseArray<Ljava/util/Map<Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$SelectionOverride;>;>;Landroid/util/SparseBooleanArray;)V
        jadx.core.utils.exceptions.JadxRuntimeException: Arguments count limit reached: 28
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:342)
        	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
         */
        public Parameters(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, int i7, int i8, boolean z4, @Nullable String str, int i9, boolean z5, SparseArray sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, i9);
            this.f14743OoooO0 = i;
            this.f14744OoooO0O = i2;
            this.f14742OoooO = i3;
            this.f14745OoooOO0 = i4;
            this.f14760o000oOoO = 0;
            this.f14746OoooOOO = 0;
            this.f14747OoooOOo = 0;
            this.f14748OoooOo0 = 0;
            this.f14749OoooOoO = z;
            this.f14750OoooOoo = false;
            this.f14751Ooooo00 = z2;
            this.f14752Ooooo0o = i5;
            this.f14753OooooO0 = i6;
            this.f14754OooooOO = z3;
            this.f14755OooooOo = i7;
            this.f14757Oooooo0 = i8;
            this.f14756Oooooo = z4;
            this.f14758OoooooO = false;
            this.f14759Ooooooo = false;
            this.f14766o0OoOo0 = false;
            this.f14767ooOO = false;
            this.f14761o00O0O = false;
            this.f14762o00Oo0 = z5;
            this.f14763o00Ooo = 0;
            this.f14764o00o0O = sparseArray;
            this.f14765o00ooo = sparseBooleanArray;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final boolean equals(@Nullable Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            if (super.equals(obj) && this.f14743OoooO0 == parameters.f14743OoooO0 && this.f14744OoooO0O == parameters.f14744OoooO0O && this.f14742OoooO == parameters.f14742OoooO && this.f14745OoooOO0 == parameters.f14745OoooOO0 && this.f14760o000oOoO == parameters.f14760o000oOoO && this.f14746OoooOOO == parameters.f14746OoooOOO && this.f14747OoooOOo == parameters.f14747OoooOOo && this.f14748OoooOo0 == parameters.f14748OoooOo0 && this.f14749OoooOoO == parameters.f14749OoooOoO && this.f14750OoooOoo == parameters.f14750OoooOoo && this.f14751Ooooo00 == parameters.f14751Ooooo00 && this.f14754OooooOO == parameters.f14754OooooOO && this.f14752Ooooo0o == parameters.f14752Ooooo0o && this.f14753OooooO0 == parameters.f14753OooooO0 && this.f14755OooooOo == parameters.f14755OooooOo && this.f14757Oooooo0 == parameters.f14757Oooooo0 && this.f14756Oooooo == parameters.f14756Oooooo && this.f14758OoooooO == parameters.f14758OoooooO && this.f14759Ooooooo == parameters.f14759Ooooooo && this.f14766o0OoOo0 == parameters.f14766o0OoOo0 && this.f14767ooOO == parameters.f14767ooOO && this.f14761o00O0O == parameters.f14761o00O0O && this.f14762o00Oo0 == parameters.f14762o00Oo0 && this.f14763o00Ooo == parameters.f14763o00Ooo) {
                SparseBooleanArray sparseBooleanArray = this.f14765o00ooo;
                SparseBooleanArray sparseBooleanArray2 = parameters.f14765o00ooo;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.f14764o00o0O;
                    SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = parameters.f14764o00o0O;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map<TrackGroupArray, SelectionOverride> mapValueAt = sparseArray.valueAt(i2);
                                    Map<TrackGroupArray, SelectionOverride> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        Iterator<Map.Entry<TrackGroupArray, SelectionOverride>> it = mapValueAt.entrySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z3 = true;
                                                break;
                                            }
                                            Map.Entry<TrackGroupArray, SelectionOverride> next = it.next();
                                            TrackGroupArray key = next.getKey();
                                            if (!mapValueAt2.containsKey(key) || !o000OOo0.OooO00o(next.getValue(), mapValueAt2.get(key))) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        z3 = false;
                                        break;
                                    }
                                    if (z3) {
                                        i2++;
                                    }
                                }
                                z2 = false;
                                break;
                            }
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    break;
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f14743OoooO0) * 31) + this.f14744OoooO0O) * 31) + this.f14742OoooO) * 31) + this.f14745OoooOO0) * 31) + this.f14760o000oOoO) * 31) + this.f14746OoooOOO) * 31) + this.f14747OoooOOo) * 31) + this.f14748OoooOo0) * 31) + (this.f14749OoooOoO ? 1 : 0)) * 31) + (this.f14750OoooOoo ? 1 : 0)) * 31) + (this.f14751Ooooo00 ? 1 : 0)) * 31) + (this.f14754OooooOO ? 1 : 0)) * 31) + this.f14752Ooooo0o) * 31) + this.f14753OooooO0) * 31) + this.f14755OooooOo) * 31) + this.f14757Oooooo0) * 31) + (this.f14756Oooooo ? 1 : 0)) * 31) + (this.f14758OoooooO ? 1 : 0)) * 31) + (this.f14759Ooooooo ? 1 : 0)) * 31) + (this.f14766o0OoOo0 ? 1 : 0)) * 31) + (this.f14767ooOO ? 1 : 0)) * 31) + (this.f14761o00O0O ? 1 : 0)) * 31) + (this.f14762o00Oo0 ? 1 : 0)) * 31) + this.f14763o00Ooo;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f14743OoooO0);
            parcel.writeInt(this.f14744OoooO0O);
            parcel.writeInt(this.f14742OoooO);
            parcel.writeInt(this.f14745OoooOO0);
            parcel.writeInt(this.f14760o000oOoO);
            parcel.writeInt(this.f14746OoooOOO);
            parcel.writeInt(this.f14747OoooOOo);
            parcel.writeInt(this.f14748OoooOo0);
            parcel.writeInt(this.f14749OoooOoO ? 1 : 0);
            parcel.writeInt(this.f14750OoooOoo ? 1 : 0);
            parcel.writeInt(this.f14751Ooooo00 ? 1 : 0);
            parcel.writeInt(this.f14752Ooooo0o);
            parcel.writeInt(this.f14753OooooO0);
            parcel.writeInt(this.f14754OooooOO ? 1 : 0);
            parcel.writeInt(this.f14755OooooOo);
            parcel.writeInt(this.f14757Oooooo0);
            parcel.writeInt(this.f14756Oooooo ? 1 : 0);
            parcel.writeInt(this.f14758OoooooO ? 1 : 0);
            parcel.writeInt(this.f14759Ooooooo ? 1 : 0);
            parcel.writeInt(this.f14766o0OoOo0 ? 1 : 0);
            parcel.writeInt(this.f14767ooOO ? 1 : 0);
            parcel.writeInt(this.f14761o00O0O ? 1 : 0);
            parcel.writeInt(this.f14762o00Oo0 ? 1 : 0);
            parcel.writeInt(this.f14763o00Ooo);
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.f14764o00o0O;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = sparseArray.valueAt(i2);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f14765o00ooo);
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.f14743OoooO0 = parcel.readInt();
            this.f14744OoooO0O = parcel.readInt();
            this.f14742OoooO = parcel.readInt();
            this.f14745OoooOO0 = parcel.readInt();
            this.f14760o000oOoO = parcel.readInt();
            this.f14746OoooOOO = parcel.readInt();
            this.f14747OoooOOo = parcel.readInt();
            this.f14748OoooOo0 = parcel.readInt();
            this.f14749OoooOoO = parcel.readInt() != 0;
            this.f14750OoooOoo = parcel.readInt() != 0;
            this.f14751Ooooo00 = parcel.readInt() != 0;
            this.f14752Ooooo0o = parcel.readInt();
            this.f14753OooooO0 = parcel.readInt();
            this.f14754OooooOO = parcel.readInt() != 0;
            this.f14755OooooOo = parcel.readInt();
            this.f14757Oooooo0 = parcel.readInt();
            this.f14756Oooooo = parcel.readInt() != 0;
            this.f14758OoooooO = parcel.readInt() != 0;
            this.f14759Ooooooo = parcel.readInt() != 0;
            this.f14766o0OoOo0 = parcel.readInt() != 0;
            this.f14767ooOO = parcel.readInt() != 0;
            this.f14761o00O0O = parcel.readInt() != 0;
            this.f14762o00Oo0 = parcel.readInt() != 0;
            this.f14763o00Ooo = parcel.readInt();
            int i = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                HashMap map = new HashMap(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    Objects.requireNonNull(trackGroupArray);
                    map.put(trackGroupArray, (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i3, map);
            }
            this.f14764o00o0O = sparseArray;
            this.f14765o00ooo = parcel.readSparseBooleanArray();
        }
    }
}
