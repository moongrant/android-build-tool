package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AdPlaybackState {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final AdPlaybackState f6138OooO0oO = new AdPlaybackState(new OooO00o[0]);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f6140OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o[] f6143OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Object f6139OooO00o = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f6141OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f6142OooO0Oo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6144OooO0o0 = 0;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f6145OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f6146OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f6147OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri[] f6148OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long[] f6149OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f6150OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f6151OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f6152OooO0oo;

        static {
            OooO0o.OooO0oO(0);
            OooO0o.OooO0oO(1);
            OooO0o.OooO0oO(2);
            OooO0o.OooO0oO(3);
            OooO0o.OooO0oO(4);
            OooO0o.OooO0oO(5);
            OooO0o.OooO0oO(6);
            OooO0o.OooO0oO(7);
        }

        public OooO00o(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            o000O000.OooO00o.OooO00o(iArr.length == uriArr.length);
            this.f6145OooO00o = j;
            this.f6146OooO0O0 = i;
            this.f6147OooO0OO = i2;
            this.f6150OooO0o0 = iArr;
            this.f6148OooO0Oo = uriArr;
            this.f6149OooO0o = jArr;
            this.f6151OooO0oO = j2;
            this.f6152OooO0oo = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f6145OooO00o == oooO00o.f6145OooO00o && this.f6146OooO0O0 == oooO00o.f6146OooO0O0 && this.f6147OooO0OO == oooO00o.f6147OooO0OO && Arrays.equals(this.f6148OooO0Oo, oooO00o.f6148OooO0Oo) && Arrays.equals(this.f6150OooO0o0, oooO00o.f6150OooO0o0) && Arrays.equals(this.f6149OooO0o, oooO00o.f6149OooO0o) && this.f6151OooO0oO == oooO00o.f6151OooO0oO && this.f6152OooO0oo == oooO00o.f6152OooO0oo;
        }

        public final int hashCode() {
            int i = ((this.f6146OooO0O0 * 31) + this.f6147OooO0OO) * 31;
            long j = this.f6145OooO00o;
            int iHashCode = (Arrays.hashCode(this.f6149OooO0o) + ((Arrays.hashCode(this.f6150OooO0o0) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f6148OooO0Oo)) * 31)) * 31)) * 31;
            long j2 = this.f6151OooO0oO;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f6152OooO0oo ? 1 : 0);
        }
    }

    static {
        OooO00o oooO00o = new OooO00o(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = oooO00o.f6150OooO0o0;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = oooO00o.f6149OooO0o;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        new OooO00o(oooO00o.f6145OooO00o, 0, oooO00o.f6147OooO0OO, iArrCopyOf, (Uri[]) Arrays.copyOf(oooO00o.f6148OooO0Oo, 0), jArrCopyOf, oooO00o.f6151OooO0oO, oooO00o.f6152OooO0oo);
        OooO0o.OooO0oO(1);
        OooO0o.OooO0oO(2);
        OooO0o.OooO0oO(3);
        OooO0o.OooO0oO(4);
    }

    public AdPlaybackState(OooO00o[] oooO00oArr) {
        this.f6140OooO0O0 = oooO00oArr.length + 0;
        this.f6143OooO0o = oooO00oArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return OooO0o.OooO00o(this.f6139OooO00o, adPlaybackState.f6139OooO00o) && this.f6140OooO0O0 == adPlaybackState.f6140OooO0O0 && this.f6141OooO0OO == adPlaybackState.f6141OooO0OO && this.f6142OooO0Oo == adPlaybackState.f6142OooO0Oo && this.f6144OooO0o0 == adPlaybackState.f6144OooO0o0 && Arrays.equals(this.f6143OooO0o, adPlaybackState.f6143OooO0o);
    }

    public final int hashCode() {
        int i = this.f6140OooO0O0 * 31;
        Object obj = this.f6139OooO00o;
        return Arrays.hashCode(this.f6143OooO0o) + ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f6141OooO0OO)) * 31) + ((int) this.f6142OooO0Oo)) * 31) + this.f6144OooO0o0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f6139OooO00o);
        sb.append(", adResumePositionUs=");
        sb.append(this.f6141OooO0OO);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            OooO00o[] oooO00oArr = this.f6143OooO0o;
            if (i >= oooO00oArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(oooO00oArr[i].f6145OooO00o);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < oooO00oArr[i].f6150OooO0o0.length; i2++) {
                sb.append("ad(state=");
                int i3 = oooO00oArr[i].f6150OooO0o0[i2];
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
                sb.append(oooO00oArr[i].f6149OooO0o[i2]);
                sb.append(')');
                if (i2 < oooO00oArr[i].f6150OooO0o0.length - 1) {
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
