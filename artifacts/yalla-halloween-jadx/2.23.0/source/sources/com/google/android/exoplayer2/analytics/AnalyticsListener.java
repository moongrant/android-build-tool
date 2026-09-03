package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.common.base.Oooo000;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p206o00o0oOO.o0;
import p226o00oOo00.o0000O00;
import p245o00oo0o.o00O0OO;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface AnalyticsListener {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f11363OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f11364OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oo0o0Oo f11365OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f11366OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f11367OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oo0o0Oo f11368OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f11369OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f11370OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f11371OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f11372OooOO0;

        public OooO00o(long j, oo0o0Oo oo0o0oo, int i, @Nullable OooOOOO.OooO0O0 oooO0O0, long j2, oo0o0Oo oo0o0oo2, int i2, @Nullable OooOOOO.OooO0O0 oooO0O1, long j3, long j4) {
            this.f11364OooO00o = j;
            this.f11365OooO0O0 = oo0o0oo;
            this.f11366OooO0OO = i;
            this.f11367OooO0Oo = oooO0O0;
            this.f11369OooO0o0 = j2;
            this.f11368OooO0o = oo0o0oo2;
            this.f11370OooO0oO = i2;
            this.f11371OooO0oo = oooO0O1;
            this.f11363OooO = j3;
            this.f11372OooOO0 = j4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f11364OooO00o == oooO00o.f11364OooO00o && this.f11366OooO0OO == oooO00o.f11366OooO0OO && this.f11369OooO0o0 == oooO00o.f11369OooO0o0 && this.f11370OooO0oO == oooO00o.f11370OooO0oO && this.f11363OooO == oooO00o.f11363OooO && this.f11372OooOO0 == oooO00o.f11372OooOO0 && Oooo000.OooO00o(this.f11365OooO0O0, oooO00o.f11365OooO0O0) && Oooo000.OooO00o(this.f11367OooO0Oo, oooO00o.f11367OooO0Oo) && Oooo000.OooO00o(this.f11368OooO0o, oooO00o.f11368OooO0o) && Oooo000.OooO00o(this.f11371OooO0oo, oooO00o.f11371OooO0oo);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f11364OooO00o), this.f11365OooO0O0, Integer.valueOf(this.f11366OooO0OO), this.f11367OooO0Oo, Long.valueOf(this.f11369OooO0o0), this.f11368OooO0o, Integer.valueOf(this.f11370OooO0oO), this.f11371OooO0oo, Long.valueOf(this.f11363OooO), Long.valueOf(this.f11372OooOO0)});
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0OO f11373OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<OooO00o> f11374OooO0O0;

        public OooO0O0(o00O0OO o00o0oo2, SparseArray<OooO00o> sparseArray) {
            this.f11373OooO00o = o00o0oo2;
            SparseArray<OooO00o> sparseArray2 = new SparseArray<>(o00o0oo2.OooO0O0());
            for (int i = 0; i < o00o0oo2.OooO0O0(); i++) {
                int iOooO00o = o00o0oo2.OooO00o(i);
                OooO00o oooO00o = sparseArray.get(iOooO00o);
                oooO00o.getClass();
                sparseArray2.append(iOooO00o, oooO00o);
            }
            this.f11374OooO0O0 = sparseArray2;
        }

        public final boolean OooO00o(int i) {
            return this.f11373OooO00o.f40569OooO00o.get(i);
        }
    }

    void OooO0O0(o0 o0Var);

    @Deprecated
    void OooOO0();

    @Deprecated
    void OooOO0O();

    void OooOo();

    void OooOo0();

    @Deprecated
    void OooOo00();

    void OooOo0O();

    void OooOo0o(o0000O00 o0000o00);

    void OooOoO();

    void OooOoO0();

    void OooOoOO();

    void OooOoo();

    void OooOoo0(Player player, OooO0O0 oooO0O0);

    void OooOooO();

    void OooOooo();

    void Oooo();

    void Oooo0();

    void Oooo000();

    @Deprecated
    void Oooo00O();

    void Oooo00o();

    void Oooo0O0();

    void Oooo0OO();

    void Oooo0o();

    void Oooo0o0();

    void Oooo0oO();

    void Oooo0oo();

    void OoooO();

    void OoooO0();

    void OoooO00();

    void OoooO0O();

    @Deprecated
    void OoooOO0();

    @Deprecated
    void OoooOOO();

    void OoooOOo();

    void OoooOo0();

    void OoooOoO();

    void OoooOoo();

    void Ooooo00();

    void Ooooo0o();

    void OooooO0();

    void OooooOO();

    void OooooOo();

    void Oooooo();

    void Oooooo0();

    void OoooooO(OooO00o oooO00o, o0000O00 o0000o00);

    void Ooooooo();

    @Deprecated
    void o000OOo();

    void o000oOoO();

    void o00O0O();

    void o00Oo0();

    @Deprecated
    void o00Ooo();

    void o00o0O(OooO00o oooO00o, int i, long j);

    void o00oO0O();

    void o00oO0o();

    void o00ooo();

    void o0O0O00();

    void o0OO00O();

    void o0OOO0o();

    @Deprecated
    void o0Oo0oo();

    void o0OoOo0();

    void o0ooOO0();

    @Deprecated
    void o0ooOOo();

    void o0ooOoO();

    void onPlayerError(PlaybackException playbackException);

    void onPositionDiscontinuity(int i);

    void onRenderedFirstFrame();

    void onVideoSizeChanged(o0oOOo o0oooo);

    void oo000o();

    void oo0o0Oo();

    @Deprecated
    void ooOO();
}
