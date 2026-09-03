package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f14556OooO00o = new OooO00o();

    public class OooO00o extends o000oOoO {
        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooO0O0(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final OooO0O0 OooO0o(int i, OooO0O0 oooO0O0, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooO0oo() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final Object OooOO0O(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooOOO() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final OooO0OO OooOOO0(int i, OooO0OO oooO0OO, long j) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Object f14557OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Object f14558OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14559OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f14560OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public AdPlaybackState f14561OooO0o = AdPlaybackState.f14608OooO0o0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f14562OooO0o0;

        public final long OooO00o(int i, int i2) {
            AdPlaybackState.OooO00o oooO00o = this.f14561OooO0o.f14611OooO0OO[i];
            if (oooO00o.f14613OooO00o != -1) {
                return oooO00o.f14616OooO0Oo[i2];
            }
            return -9223372036854775807L;
        }

        public final int OooO0O0(long j) {
            AdPlaybackState adPlaybackState = this.f14561OooO0o;
            long j2 = this.f14560OooO0Oo;
            Objects.requireNonNull(adPlaybackState);
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i = 0;
            while (true) {
                long[] jArr = adPlaybackState.f14610OooO0O0;
                if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && adPlaybackState.f14611OooO0OO[i].OooO00o())) {
                    break;
                }
                i++;
            }
            if (i < adPlaybackState.f14610OooO0O0.length) {
                return i;
            }
            return -1;
        }

        public final int OooO0OO(long j) {
            AdPlaybackState adPlaybackState = this.f14561OooO0o;
            long j2 = this.f14560OooO0Oo;
            int length = adPlaybackState.f14610OooO0O0.length - 1;
            while (length >= 0) {
                boolean z = false;
                if (j != Long.MIN_VALUE) {
                    long j3 = adPlaybackState.f14610OooO0O0[length];
                    if (j3 != Long.MIN_VALUE ? j < j3 : !(j2 != -9223372036854775807L && j >= j2)) {
                        z = true;
                    }
                }
                if (!z) {
                    break;
                }
                length--;
            }
            if (length < 0 || !adPlaybackState.f14611OooO0OO[length].OooO00o()) {
                return -1;
            }
            return length;
        }

        public final void OooO0Oo() {
            Objects.requireNonNull(this.f14561OooO0o);
        }

        public final boolean OooO0o(int i, int i2) {
            AdPlaybackState.OooO00o oooO00o = this.f14561OooO0o.f14611OooO0OO[i];
            return (oooO00o.f14613OooO00o == -1 || oooO00o.f14615OooO0OO[i2] == 0) ? false : true;
        }

        public final int OooO0o0(int i) {
            AdPlaybackState.OooO00o oooO00o = this.f14561OooO0o.f14611OooO0OO[i];
            int i2 = 0;
            while (true) {
                int[] iArr = oooO00o.f14615OooO0OO;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0O0.class.equals(obj.getClass())) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return o000OOo0.OooO00o(this.f14557OooO00o, oooO0O0.f14557OooO00o) && o000OOo0.OooO00o(this.f14558OooO0O0, oooO0O0.f14558OooO0O0) && this.f14559OooO0OO == oooO0O0.f14559OooO0OO && this.f14560OooO0Oo == oooO0O0.f14560OooO0Oo && this.f14562OooO0o0 == oooO0O0.f14562OooO0o0 && o000OOo0.OooO00o(this.f14561OooO0o, oooO0O0.f14561OooO0o);
        }

        public final int hashCode() {
            Object obj = this.f14557OooO00o;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f14558OooO0O0;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f14559OooO0OO) * 31;
            long j = this.f14560OooO0Oo;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f14562OooO0o0;
            return this.f14561OooO0o.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooOOO f14563OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final Object f14564OooOOo0 = new Object();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f14565OooO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        @Deprecated
        public Object f14567OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Object f14569OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f14570OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f14571OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f14572OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f14573OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f14574OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f14575OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f14576OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public long f14577OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f14578OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public long f14579OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public long f14580OooOOOo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f14566OooO00o = f14564OooOOo0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooOOO f14568OooO0OO = f14563OooOOo;

        static {
            OooOOO.OooO0O0 oooO0O0 = new OooOOO.OooO0O0();
            oooO0O0.f13272OooO00o = "com.google.android.exoplayer2.Timeline";
            oooO0O0.f13273OooO0O0 = Uri.EMPTY;
            f14563OooOOo = oooO0O0.OooO00o();
        }

        public final long OooO00o() {
            return C.OooO0O0(this.f14577OooOOO);
        }

        public final OooO0OO OooO0O0(@Nullable OooOOO oooOOO, @Nullable Object obj, long j, long j2, long j3, boolean z, boolean z2, boolean z3, long j4, long j5, long j6) {
            OooOOO.OooO oooO;
            this.f14566OooO00o = f14564OooOOo0;
            this.f14568OooO0OO = oooOOO != null ? oooOOO : f14563OooOOo;
            this.f14567OooO0O0 = (oooOOO == null || (oooO = oooOOO.f13260OooO0O0) == null) ? null : oooO.f13270OooO0oo;
            this.f14569OooO0Oo = obj;
            this.f14571OooO0o0 = j;
            this.f14570OooO0o = j2;
            this.f14572OooO0oO = j3;
            this.f14573OooO0oo = z;
            this.f14565OooO = z2;
            this.f14574OooOO0 = z3;
            this.f14577OooOOO = j4;
            this.f14579OooOOOO = j5;
            this.f14576OooOO0o = 0;
            this.f14578OooOOO0 = 0;
            this.f14580OooOOOo = j6;
            this.f14575OooOO0O = false;
            return this;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0OO.class.equals(obj.getClass())) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return o000OOo0.OooO00o(this.f14566OooO00o, oooO0OO.f14566OooO00o) && o000OOo0.OooO00o(this.f14568OooO0OO, oooO0OO.f14568OooO0OO) && o000OOo0.OooO00o(this.f14569OooO0Oo, oooO0OO.f14569OooO0Oo) && this.f14571OooO0o0 == oooO0OO.f14571OooO0o0 && this.f14570OooO0o == oooO0OO.f14570OooO0o && this.f14572OooO0oO == oooO0OO.f14572OooO0oO && this.f14573OooO0oo == oooO0OO.f14573OooO0oo && this.f14565OooO == oooO0OO.f14565OooO && this.f14574OooOO0 == oooO0OO.f14574OooOO0 && this.f14575OooOO0O == oooO0OO.f14575OooOO0O && this.f14577OooOOO == oooO0OO.f14577OooOOO && this.f14579OooOOOO == oooO0OO.f14579OooOOOO && this.f14576OooOO0o == oooO0OO.f14576OooOO0o && this.f14578OooOOO0 == oooO0OO.f14578OooOOO0 && this.f14580OooOOOo == oooO0OO.f14580OooOOOo;
        }

        public final int hashCode() {
            int iHashCode = (this.f14568OooO0OO.hashCode() + ((this.f14566OooO00o.hashCode() + 217) * 31)) * 31;
            Object obj = this.f14569OooO0Oo;
            int iHashCode2 = obj == null ? 0 : obj.hashCode();
            long j = this.f14571OooO0o0;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f14570OooO0o;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f14572OooO0oO;
            int i3 = (((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f14573OooO0oo ? 1 : 0)) * 31) + (this.f14565OooO ? 1 : 0)) * 31) + (this.f14574OooOO0 ? 1 : 0)) * 31) + (this.f14575OooOO0O ? 1 : 0)) * 31;
            long j4 = this.f14577OooOOO;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f14579OooOOOO;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f14576OooOO0o) * 31) + this.f14578OooOOO0) * 31;
            long j6 = this.f14580OooOOOo;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    public final Pair<Object, Long> OooO(OooO0OO oooO0OO, OooO0O0 oooO0O0, int i, long j) {
        Pair<Object, Long> pairOooOO0 = OooOO0(oooO0OO, oooO0O0, i, j, 0L);
        Objects.requireNonNull(pairOooOO0);
        return pairOooOO0;
    }

    public int OooO00o(boolean z) {
        return OooOOOO() ? -1 : 0;
    }

    public abstract int OooO0O0(Object obj);

    public int OooO0OO(boolean z) {
        if (OooOOOO()) {
            return -1;
        }
        return (-1) + OooOOO();
    }

    public final int OooO0Oo(int i, OooO0O0 oooO0O0, OooO0OO oooO0OO, int i2, boolean z) {
        int i3 = OooO0o(i, oooO0O0, false).f14559OooO0OO;
        if (OooOO0o(i3, oooO0OO).f14578OooOOO0 != i) {
            return i + 1;
        }
        int iOooO0o0 = OooO0o0(i3, i2, z);
        if (iOooO0o0 == -1) {
            return -1;
        }
        return OooOO0o(iOooO0o0, oooO0OO).f14576OooOO0o;
    }

    public abstract OooO0O0 OooO0o(int i, OooO0O0 oooO0O0, boolean z);

    public int OooO0o0(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == OooO0OO(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == OooO0OO(z) ? OooO00o(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public OooO0O0 OooO0oO(Object obj, OooO0O0 oooO0O0) {
        return OooO0o(OooO0O0(obj), oooO0O0, true);
    }

    public abstract int OooO0oo();

    @Nullable
    public final Pair<Object, Long> OooOO0(OooO0OO oooO0OO, OooO0O0 oooO0O0, int i, long j, long j2) {
        o00000O0.OooO0OO(i, OooOOO());
        OooOOO0(i, oooO0OO, j2);
        if (j == -9223372036854775807L) {
            j = oooO0OO.f14577OooOOO;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = oooO0OO.f14576OooOO0o;
        long j3 = oooO0OO.f14580OooOOOo + j;
        long j4 = OooO0o(i2, oooO0O0, true).f14560OooO0Oo;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < oooO0OO.f14578OooOOO0) {
            j3 -= j4;
            i2++;
            j4 = OooO0o(i2, oooO0O0, true).f14560OooO0Oo;
        }
        Object obj = oooO0O0.f14558OooO0O0;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(j3));
    }

    public abstract Object OooOO0O(int i);

    public final OooO0OO OooOO0o(int i, OooO0OO oooO0OO) {
        return OooOOO0(i, oooO0OO, 0L);
    }

    public abstract int OooOOO();

    public abstract OooO0OO OooOOO0(int i, OooO0OO oooO0OO, long j);

    public final boolean OooOOOO() {
        return OooOOO() == 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        if (o000oooo2.OooOOO() != OooOOO() || o000oooo2.OooO0oo() != OooO0oo()) {
            return false;
        }
        OooO0OO oooO0OO = new OooO0OO();
        OooO0O0 oooO0O0 = new OooO0O0();
        OooO0OO oooO0OO2 = new OooO0OO();
        OooO0O0 oooO0O1 = new OooO0O0();
        for (int i = 0; i < OooOOO(); i++) {
            if (!OooOO0o(i, oooO0OO).equals(o000oooo2.OooOO0o(i, oooO0OO2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < OooO0oo(); i2++) {
            if (!OooO0o(i2, oooO0O0, true).equals(o000oooo2.OooO0o(i2, oooO0O1, true))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        OooO0OO oooO0OO = new OooO0OO();
        OooO0O0 oooO0O0 = new OooO0O0();
        int iOooOOO = OooOOO() + 217;
        for (int i = 0; i < OooOOO(); i++) {
            iOooOOO = (iOooOOO * 31) + OooOO0o(i, oooO0OO).hashCode();
        }
        int iOooO0oo = OooO0oo() + (iOooOOO * 31);
        for (int i2 = 0; i2 < OooO0oo(); i2++) {
            iOooO0oo = (iOooO0oo * 31) + OooO0o(i2, oooO0O0, true).hashCode();
        }
        return iOooO0oo;
    }
}
