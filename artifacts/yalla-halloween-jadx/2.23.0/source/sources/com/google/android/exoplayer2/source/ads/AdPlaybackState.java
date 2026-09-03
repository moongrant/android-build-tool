package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.facebook.appevents.OooOOOO;
import com.facebook.appevents.OooOo00;
import com.google.android.exoplayer2.OooO;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.ULong;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AdPlaybackState implements OooO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final AdPlaybackState f13125OooOO0 = new AdPlaybackState(null, new OooO00o[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f13126OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f13127OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f13128OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f13129OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f13130OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooOOOO f13131OooOOOo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o[] f13132OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Object f13133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f13134OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f13135OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f13136OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f13137OooO0oo;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class OooO00o implements OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long[] f13147OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f13148OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13149OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13150OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Uri[] f13151OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int[] f13152OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f13153OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f13154OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f13138OooOO0o = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f13140OooOOO0 = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f13139OooOOO = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f13141OooOOOO = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f13142OooOOOo = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f13144OooOOo0 = o0O00.Oooo00O(5);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f13143OooOOo = o0O00.Oooo00O(6);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final String f13145OooOOoo = o0O00.Oooo00O(7);

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public static final OooOo00 f13146OooOo00 = new OooOo00();

        public OooO00o(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            o00O000o.OooO00o(iArr.length == uriArr.length);
            this.f13148OooO0Oo = j;
            this.f13150OooO0o0 = i;
            this.f13149OooO0o = i2;
            this.f13152OooO0oo = iArr;
            this.f13151OooO0oO = uriArr;
            this.f13147OooO = jArr;
            this.f13153OooOO0 = j2;
            this.f13154OooOO0O = z;
        }

        public final int OooO00o(@IntRange(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f13152OooO0oo;
                if (i3 >= iArr.length || this.f13154OooOO0O || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f13148OooO0Oo == oooO00o.f13148OooO0Oo && this.f13150OooO0o0 == oooO00o.f13150OooO0o0 && this.f13149OooO0o == oooO00o.f13149OooO0o && Arrays.equals(this.f13151OooO0oO, oooO00o.f13151OooO0oO) && Arrays.equals(this.f13152OooO0oo, oooO00o.f13152OooO0oo) && Arrays.equals(this.f13147OooO, oooO00o.f13147OooO) && this.f13153OooOO0 == oooO00o.f13153OooOO0 && this.f13154OooOO0O == oooO00o.f13154OooOO0O;
        }

        public final int hashCode() {
            int i = ((this.f13150OooO0o0 * 31) + this.f13149OooO0o) * 31;
            long j = this.f13148OooO0Oo;
            int iHashCode = (Arrays.hashCode(this.f13147OooO) + ((Arrays.hashCode(this.f13152OooO0oo) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f13151OooO0oO)) * 31)) * 31)) * 31;
            long j2 = this.f13153OooOO0;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f13154OooOO0O ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f13138OooOO0o, this.f13148OooO0Oo);
            bundle.putInt(f13140OooOOO0, this.f13150OooO0o0);
            bundle.putInt(f13145OooOOoo, this.f13149OooO0o);
            bundle.putParcelableArrayList(f13139OooOOO, new ArrayList<>(Arrays.asList(this.f13151OooO0oO)));
            bundle.putIntArray(f13141OooOOOO, this.f13152OooO0oo);
            bundle.putLongArray(f13142OooOOOo, this.f13147OooO);
            bundle.putLong(f13144OooOOo0, this.f13153OooOO0);
            bundle.putBoolean(f13143OooOOo, this.f13154OooOO0O);
            return bundle;
        }
    }

    static {
        OooO00o oooO00o = new OooO00o(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = oooO00o.f13152OooO0oo;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = oooO00o.f13147OooO;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f13126OooOO0O = new OooO00o(oooO00o.f13148OooO0Oo, 0, oooO00o.f13149OooO0o, iArrCopyOf, (Uri[]) Arrays.copyOf(oooO00o.f13151OooO0oO, 0), jArrCopyOf, oooO00o.f13153OooOO0, oooO00o.f13154OooOO0O);
        f13127OooOO0o = o0O00.Oooo00O(1);
        f13129OooOOO0 = o0O00.Oooo00O(2);
        f13128OooOOO = o0O00.Oooo00O(3);
        f13130OooOOOO = o0O00.Oooo00O(4);
        f13131OooOOOo = new OooOOOO();
    }

    public AdPlaybackState(@Nullable Object obj, OooO00o[] oooO00oArr, long j, long j2, int i) {
        this.f13133OooO0Oo = obj;
        this.f13134OooO0o = j;
        this.f13136OooO0oO = j2;
        this.f13135OooO0o0 = oooO00oArr.length + i;
        this.f13132OooO = oooO00oArr;
        this.f13137OooO0oo = i;
    }

    public final OooO00o OooO00o(@IntRange(from = ULong.MIN_VALUE) int i) {
        int i2 = this.f13137OooO0oo;
        return i < i2 ? f13126OooOO0O : this.f13132OooO[i - i2];
    }

    public final boolean OooO0O0(int i) {
        if (i == this.f13135OooO0o0 - 1) {
            OooO00o OooO00o2 = OooO00o(i);
            if (OooO00o2.f13154OooOO0O && OooO00o2.f13148OooO0Oo == Long.MIN_VALUE && OooO00o2.f13150OooO0o0 == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return o0O00.OooO00o(this.f13133OooO0Oo, adPlaybackState.f13133OooO0Oo) && this.f13135OooO0o0 == adPlaybackState.f13135OooO0o0 && this.f13134OooO0o == adPlaybackState.f13134OooO0o && this.f13136OooO0oO == adPlaybackState.f13136OooO0oO && this.f13137OooO0oo == adPlaybackState.f13137OooO0oo && Arrays.equals(this.f13132OooO, adPlaybackState.f13132OooO);
    }

    public final int hashCode() {
        int i = this.f13135OooO0o0 * 31;
        Object obj = this.f13133OooO0Oo;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f13134OooO0o)) * 31) + ((int) this.f13136OooO0oO)) * 31) + this.f13137OooO0oo) * 31) + Arrays.hashCode(this.f13132OooO);
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (OooO00o oooO00o : this.f13132OooO) {
            arrayList.add(oooO00o.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f13127OooOO0o, arrayList);
        }
        long j = this.f13134OooO0o;
        if (j != 0) {
            bundle.putLong(f13129OooOOO0, j);
        }
        long j2 = this.f13136OooO0oO;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(f13128OooOOO, j2);
        }
        int i = this.f13137OooO0oo;
        if (i != 0) {
            bundle.putInt(f13130OooOOOO, i);
        }
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f13133OooO0Oo);
        sb.append(", adResumePositionUs=");
        sb.append(this.f13134OooO0o);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            OooO00o[] oooO00oArr = this.f13132OooO;
            if (i >= oooO00oArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(oooO00oArr[i].f13148OooO0Oo);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < oooO00oArr[i].f13152OooO0oo.length; i2++) {
                sb.append("ad(state=");
                int i3 = oooO00oArr[i].f13152OooO0oo[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(oooO00oArr[i].f13147OooO[i2]);
                sb.append(')');
                if (i2 < oooO00oArr[i].f13152OooO0oo.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < oooO00oArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
