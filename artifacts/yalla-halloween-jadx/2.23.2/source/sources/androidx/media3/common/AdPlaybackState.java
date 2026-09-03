package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.o00O;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.ULong;
import p069o0000ooO.o0OO00O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AdPlaybackState implements OooO0OO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final AdPlaybackState f6176OooOO0 = new AdPlaybackState(null, new OooO00o[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f6177OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f6178OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f6179OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f6180OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f6181OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final o0OO00O f6182OooOOOo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o[] f6183OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Object f6184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f6185OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6186OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f6187OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f6188OooO0oo;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long[] f6198OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f6199OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f6200OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f6201OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Uri[] f6202OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int[] f6203OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f6204OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f6205OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6189OooOO0o = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6191OooOOO0 = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6190OooOOO = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f6192OooOOOO = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f6193OooOOOo = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f6195OooOOo0 = o00.Oooo00o(5);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f6194OooOOo = o00.Oooo00o(6);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final String f6196OooOOoo = o00.Oooo00o(7);

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public static final o00O f6197OooOo00 = new o00O();

        public OooO00o(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            p080o000OoO.o00Oo0.OooO00o(iArr.length == uriArr.length);
            this.f6199OooO0Oo = j;
            this.f6201OooO0o0 = i;
            this.f6200OooO0o = i2;
            this.f6203OooO0oo = iArr;
            this.f6202OooO0oO = uriArr;
            this.f6198OooO = jArr;
            this.f6204OooOO0 = j2;
            this.f6205OooOO0O = z;
        }

        public final int OooO0OO(@IntRange(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f6203OooO0oo;
                if (i3 >= iArr.length || this.f6205OooOO0O || (i2 = iArr[i3]) == 0 || i2 == 1) {
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
            return this.f6199OooO0Oo == oooO00o.f6199OooO0Oo && this.f6201OooO0o0 == oooO00o.f6201OooO0o0 && this.f6200OooO0o == oooO00o.f6200OooO0o && Arrays.equals(this.f6202OooO0oO, oooO00o.f6202OooO0oO) && Arrays.equals(this.f6203OooO0oo, oooO00o.f6203OooO0oo) && Arrays.equals(this.f6198OooO, oooO00o.f6198OooO) && this.f6204OooOO0 == oooO00o.f6204OooOO0 && this.f6205OooOO0O == oooO00o.f6205OooOO0O;
        }

        public final int hashCode() {
            int i = ((this.f6201OooO0o0 * 31) + this.f6200OooO0o) * 31;
            long j = this.f6199OooO0Oo;
            int iHashCode = (Arrays.hashCode(this.f6198OooO) + ((Arrays.hashCode(this.f6203OooO0oo) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f6202OooO0oO)) * 31)) * 31)) * 31;
            long j2 = this.f6204OooOO0;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f6205OooOO0O ? 1 : 0);
        }

        @Override // androidx.media3.common.OooO0OO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f6189OooOO0o, this.f6199OooO0Oo);
            bundle.putInt(f6191OooOOO0, this.f6201OooO0o0);
            bundle.putInt(f6196OooOOoo, this.f6200OooO0o);
            bundle.putParcelableArrayList(f6190OooOOO, new ArrayList<>(Arrays.asList(this.f6202OooO0oO)));
            bundle.putIntArray(f6192OooOOOO, this.f6203OooO0oo);
            bundle.putLongArray(f6193OooOOOo, this.f6198OooO);
            bundle.putLong(f6195OooOOo0, this.f6204OooOO0);
            bundle.putBoolean(f6194OooOOo, this.f6205OooOO0O);
            return bundle;
        }
    }

    static {
        OooO00o oooO00o = new OooO00o(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = oooO00o.f6203OooO0oo;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = oooO00o.f6198OooO;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f6177OooOO0O = new OooO00o(oooO00o.f6199OooO0Oo, 0, oooO00o.f6200OooO0o, iArrCopyOf, (Uri[]) Arrays.copyOf(oooO00o.f6202OooO0oO, 0), jArrCopyOf, oooO00o.f6204OooOO0, oooO00o.f6205OooOO0O);
        f6178OooOO0o = o00.Oooo00o(1);
        f6180OooOOO0 = o00.Oooo00o(2);
        f6179OooOOO = o00.Oooo00o(3);
        f6181OooOOOO = o00.Oooo00o(4);
        f6182OooOOOo = new o0OO00O();
    }

    public AdPlaybackState(@Nullable Object obj, OooO00o[] oooO00oArr, long j, long j2, int i) {
        this.f6184OooO0Oo = obj;
        this.f6185OooO0o = j;
        this.f6187OooO0oO = j2;
        this.f6186OooO0o0 = oooO00oArr.length + i;
        this.f6183OooO = oooO00oArr;
        this.f6188OooO0oo = i;
    }

    public final OooO00o OooO0OO(@IntRange(from = ULong.MIN_VALUE) int i) {
        int i2 = this.f6188OooO0oo;
        return i < i2 ? f6177OooOO0O : this.f6183OooO[i - i2];
    }

    public final boolean OooO0Oo(int i) {
        if (i == this.f6186OooO0o0 - 1) {
            OooO00o oooO00oOooO0OO = OooO0OO(i);
            if (oooO00oOooO0OO.f6205OooOO0O && oooO00oOooO0OO.f6199OooO0Oo == Long.MIN_VALUE && oooO00oOooO0OO.f6201OooO0o0 == -1) {
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
        return o00.OooO00o(this.f6184OooO0Oo, adPlaybackState.f6184OooO0Oo) && this.f6186OooO0o0 == adPlaybackState.f6186OooO0o0 && this.f6185OooO0o == adPlaybackState.f6185OooO0o && this.f6187OooO0oO == adPlaybackState.f6187OooO0oO && this.f6188OooO0oo == adPlaybackState.f6188OooO0oo && Arrays.equals(this.f6183OooO, adPlaybackState.f6183OooO);
    }

    public final int hashCode() {
        int i = this.f6186OooO0o0 * 31;
        Object obj = this.f6184OooO0Oo;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f6185OooO0o)) * 31) + ((int) this.f6187OooO0oO)) * 31) + this.f6188OooO0oo) * 31) + Arrays.hashCode(this.f6183OooO);
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (OooO00o oooO00o : this.f6183OooO) {
            arrayList.add(oooO00o.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f6178OooOO0o, arrayList);
        }
        long j = this.f6185OooO0o;
        if (j != 0) {
            bundle.putLong(f6180OooOOO0, j);
        }
        long j2 = this.f6187OooO0oO;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(f6179OooOOO, j2);
        }
        int i = this.f6188OooO0oo;
        if (i != 0) {
            bundle.putInt(f6181OooOOOO, i);
        }
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f6184OooO0Oo);
        sb.append(", adResumePositionUs=");
        sb.append(this.f6185OooO0o);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            OooO00o[] oooO00oArr = this.f6183OooO;
            if (i >= oooO00oArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(oooO00oArr[i].f6199OooO0Oo);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < oooO00oArr[i].f6203OooO0oo.length; i2++) {
                sb.append("ad(state=");
                int i3 = oooO00oArr[i].f6203OooO0oo[i2];
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
                sb.append(oooO00oArr[i].f6198OooO[i2]);
                sb.append(')');
                if (i2 < oooO00oArr[i].f6203OooO0oo.length - 1) {
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
