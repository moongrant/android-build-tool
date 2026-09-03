package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AdPlaybackState {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AdPlaybackState f14608OooO0o0 = new AdPlaybackState(new long[0]);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14609OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f14610OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o[] f14611OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f14612OooO0Oo;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14613OooO00o = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f14615OooO0OO = new int[0];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Uri[] f14614OooO0O0 = new Uri[0];

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long[] f14616OooO0Oo = new long[0];

        public final boolean OooO00o() {
            if (this.f14613OooO00o != -1) {
                int i = 0;
                while (true) {
                    int[] iArr = this.f14615OooO0OO;
                    if (i >= iArr.length || iArr[i] == 0 || iArr[i] == 1) {
                        break;
                    }
                    i++;
                }
                if (i >= this.f14613OooO00o) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f14613OooO00o == oooO00o.f14613OooO00o && Arrays.equals(this.f14614OooO0O0, oooO00o.f14614OooO0O0) && Arrays.equals(this.f14615OooO0OO, oooO00o.f14615OooO0OO) && Arrays.equals(this.f14616OooO0Oo, oooO00o.f14616OooO0Oo);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f14616OooO0Oo) + ((Arrays.hashCode(this.f14615OooO0OO) + (((this.f14613OooO00o * 31) + Arrays.hashCode(this.f14614OooO0O0)) * 31)) * 31);
        }
    }

    public AdPlaybackState(long... jArr) {
        int length = jArr.length;
        this.f14609OooO00o = length;
        this.f14610OooO0O0 = Arrays.copyOf(jArr, length);
        this.f14611OooO0OO = new OooO00o[length];
        for (int i = 0; i < length; i++) {
            this.f14611OooO0OO[i] = new OooO00o();
        }
        this.f14612OooO0Oo = -9223372036854775807L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return this.f14609OooO00o == adPlaybackState.f14609OooO00o && this.f14612OooO0Oo == adPlaybackState.f14612OooO0Oo && Arrays.equals(this.f14610OooO0O0, adPlaybackState.f14610OooO0O0) && Arrays.equals(this.f14611OooO0OO, adPlaybackState.f14611OooO0OO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14611OooO0OO) + ((Arrays.hashCode(this.f14610OooO0O0) + (((((this.f14609OooO00o * 31) + ((int) 0)) * 31) + ((int) this.f14612OooO0Oo)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adResumePositionUs=");
        sb.append(0L);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f14611OooO0OO.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f14610OooO0O0[i]);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f14611OooO0OO[i].f14615OooO0OO.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f14611OooO0OO[i].f14615OooO0OO[i2];
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
                sb.append(this.f14611OooO0OO[i].f14616OooO0Oo[i2]);
                sb.append(')');
                if (i2 < this.f14611OooO0OO[i].f14615OooO0OO.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f14611OooO0OO.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
