package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.OooO;
import androidx.media3.common.Oooo0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00Ooo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.OooOOOO;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o000O.Oooo000;
import o000O00O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsListener {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface EventFlags {
    }

    @UnstableApi
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f7329OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f7330OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Oooo0 f7331OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7332OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f7333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Oooo0 f7334OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f7335OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f7336OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f7337OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f7338OooOO0;

        public OooO00o(long j, Oooo0 oooo0, int i, @Nullable OooOOOO.OooO0O0 oooO0O0, long j2, Oooo0 oooo1, int i2, @Nullable OooOOOO.OooO0O0 oooO0O1, long j3, long j4) {
            this.f7330OooO00o = j;
            this.f7331OooO0O0 = oooo0;
            this.f7332OooO0OO = i;
            this.f7333OooO0Oo = oooO0O0;
            this.f7335OooO0o0 = j2;
            this.f7334OooO0o = oooo1;
            this.f7336OooO0oO = i2;
            this.f7337OooO0oo = oooO0O1;
            this.f7329OooO = j3;
            this.f7338OooOO0 = j4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f7330OooO00o == oooO00o.f7330OooO00o && this.f7332OooO0OO == oooO00o.f7332OooO0OO && this.f7335OooO0o0 == oooO00o.f7335OooO0o0 && this.f7336OooO0oO == oooO00o.f7336OooO0oO && this.f7329OooO == oooO00o.f7329OooO && this.f7338OooOO0 == oooO00o.f7338OooOO0 && com.google.common.base.Oooo0.OooO00o(this.f7331OooO0O0, oooO00o.f7331OooO0O0) && com.google.common.base.Oooo0.OooO00o(this.f7333OooO0Oo, oooO00o.f7333OooO0Oo) && com.google.common.base.Oooo0.OooO00o(this.f7334OooO0o, oooO00o.f7334OooO0o) && com.google.common.base.Oooo0.OooO00o(this.f7337OooO0oo, oooO00o.f7337OooO0oo);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f7330OooO00o), this.f7331OooO0O0, Integer.valueOf(this.f7332OooO0OO), this.f7333OooO0Oo, Long.valueOf(this.f7335OooO0o0), this.f7334OooO0o, Integer.valueOf(this.f7336OooO0oO), this.f7337OooO0oo, Long.valueOf(this.f7329OooO), Long.valueOf(this.f7338OooOO0)});
        }
    }

    @UnstableApi
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO f7339OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<OooO00o> f7340OooO0O0;

        public OooO0O0(OooO oooO, SparseArray<OooO00o> sparseArray) {
            this.f7339OooO00o = oooO;
            SparseArray<OooO00o> sparseArray2 = new SparseArray<>(oooO.OooO0OO());
            for (int i = 0; i < oooO.OooO0OO(); i++) {
                int iOooO0O0 = oooO.OooO0O0(i);
                OooO00o oooO00o = sparseArray.get(iOooO0O0);
                oooO00o.getClass();
                sparseArray2.append(iOooO0O0, oooO00o);
            }
            this.f7340OooO0O0 = sparseArray2;
        }

        public final boolean OooO00o(int i) {
            return this.f7339OooO00o.f6338OooO00o.get(i);
        }
    }

    @UnstableApi
    void OooO00o(OooOo oooOo);

    @UnstableApi
    @Deprecated
    void OooOO0O();

    @UnstableApi
    @Deprecated
    void OooOOO0();

    @UnstableApi
    @Deprecated
    void OooOOoo();

    @UnstableApi
    void OooOo();

    @UnstableApi
    void OooOo0();

    @UnstableApi
    void OooOo00();

    @UnstableApi
    void OooOo0O();

    @UnstableApi
    void OooOo0o();

    @UnstableApi
    void OooOoO();

    @UnstableApi
    void OooOoO0();

    @UnstableApi
    void OooOoOO();

    @UnstableApi
    void OooOoo();

    @UnstableApi
    void OooOoo0();

    @UnstableApi
    void OooOooO();

    @UnstableApi
    void OooOooo();

    @UnstableApi
    void Oooo();

    @UnstableApi
    void Oooo0();

    @UnstableApi
    @Deprecated
    void Oooo000();

    @UnstableApi
    void Oooo00O();

    @UnstableApi
    void Oooo00o();

    @UnstableApi
    void Oooo0O0();

    @UnstableApi
    void Oooo0OO();

    @UnstableApi
    void Oooo0o();

    @UnstableApi
    void Oooo0o0();

    @UnstableApi
    void Oooo0oO();

    @UnstableApi
    void Oooo0oo();

    @UnstableApi
    @Deprecated
    void OoooO();

    @UnstableApi
    void OoooO0();

    @UnstableApi
    void OoooO00();

    @UnstableApi
    void OoooO0O();

    @UnstableApi
    void OoooOO0();

    @UnstableApi
    void OoooOOO();

    @UnstableApi
    void OoooOOo();

    @UnstableApi
    void OoooOo0();

    @UnstableApi
    void OoooOoO();

    @UnstableApi
    void OoooOoo();

    @UnstableApi
    void Ooooo00();

    @UnstableApi
    void Ooooo0o();

    @UnstableApi
    void OooooO0();

    @UnstableApi
    void OooooOO(OooO00o oooO00o, Oooo000 oooo000);

    @UnstableApi
    void OooooOo();

    @UnstableApi
    void Oooooo();

    @UnstableApi
    void Oooooo0();

    @UnstableApi
    void OoooooO();

    @UnstableApi
    void Ooooooo();

    @UnstableApi
    void o000000();

    @UnstableApi
    @Deprecated
    void o000000O();

    @UnstableApi
    void o000000o(OooO00o oooO00o, int i, long j);

    @UnstableApi
    void o000OOo();

    @UnstableApi
    @Deprecated
    void o000oOoO();

    @UnstableApi
    void o00O0O();

    @UnstableApi
    @Deprecated
    void o00Oo0();

    @UnstableApi
    void o00Ooo();

    @UnstableApi
    void o00o0O();

    @UnstableApi
    void o00oO0O();

    @UnstableApi
    void o00oO0o();

    @UnstableApi
    void o00ooo();

    @UnstableApi
    void o0O0O00();

    @UnstableApi
    void o0OO00O(Player player, OooO0O0 oooO0O0);

    @UnstableApi
    void o0OOO0o();

    @UnstableApi
    @Deprecated
    void o0Oo0oo();

    @UnstableApi
    @Deprecated
    void o0OoOo0();

    @UnstableApi
    @Deprecated
    void o0ooOO0();

    @UnstableApi
    void o0ooOOo();

    @UnstableApi
    void o0ooOoO(Oooo000 oooo000);

    @UnstableApi
    void onPlayerError(PlaybackException playbackException);

    @UnstableApi
    void onPositionDiscontinuity(int i);

    @UnstableApi
    void onRenderedFirstFrame();

    @UnstableApi
    void onVideoSizeChanged(o00Ooo o00ooo2);

    @UnstableApi
    void oo000o();

    @UnstableApi
    void oo0o0Oo();

    @UnstableApi
    void ooOO();
}
