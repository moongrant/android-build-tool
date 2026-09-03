package androidx.media3.common;

import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public interface Player {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    public static final class OooO00o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final String f6700OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f6701OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.o000oOoO f6702OooO0oO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f6703OooO0Oo;

        /* JADX INFO: renamed from: androidx.media3.common.Player$OooO00o$OooO00o, reason: collision with other inner class name */
        @UnstableApi
        public static final class C0140OooO00o {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final int[] f6704OooO0O0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final OooO.OooO00o f6705OooO00o = new OooO.OooO00o();

            @CanIgnoreReturnValue
            public final void OooO00o(int i, boolean z) {
                OooO.OooO00o oooO00o = this.f6705OooO00o;
                if (z) {
                    oooO00o.OooO00o(i);
                } else {
                    oooO00o.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            p080o000OoO.o00Oo0.OooO0Oo(!false);
            f6701OooO0o0 = new OooO00o(new OooO(sparseBooleanArray));
            f6700OooO0o = o00.Oooo00o(0);
            f6702OooO0oO = new androidx.compose.animation.o000oOoO();
        }

        public OooO00o(OooO oooO) {
            this.f6703OooO0Oo = oooO;
        }

        public final boolean OooO0OO(int i) {
            return this.f6703OooO0Oo.f6338OooO00o.get(i);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                return this.f6703OooO0Oo.equals(((OooO00o) obj).f6703OooO0Oo);
            }
            return false;
        }

        public final int hashCode() {
            return this.f6703OooO0Oo.hashCode();
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i = 0;
            while (true) {
                OooO oooO = this.f6703OooO0Oo;
                if (i >= oooO.OooO0OO()) {
                    bundle.putIntegerArrayList(f6700OooO0o, arrayList);
                    return bundle;
                }
                arrayList.add(Integer.valueOf(oooO.OooO0O0(i)));
                i++;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO f6706OooO00o;

        @UnstableApi
        public OooO0O0(OooO oooO) {
            this.f6706OooO00o = oooO;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                return this.f6706OooO00o.equals(((OooO0O0) obj).f6706OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f6706OooO00o.hashCode();
        }
    }

    public interface OooO0OO {
        void onAudioAttributesChanged(androidx.media3.common.OooO00o oooO00o);

        void onAvailableCommandsChanged(OooO00o oooO00o);

        @UnstableApi
        @Deprecated
        void onCues(List<Cue> list);

        void onCues(o000O000.OooO0O0 oooO0O0);

        void onDeviceInfoChanged(DeviceInfo deviceInfo);

        void onDeviceVolumeChanged(int i, boolean z);

        void onEvents(Player player, OooO0O0 oooO0O0);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @UnstableApi
        @Deprecated
        void onLoadingChanged(boolean z);

        void onMaxSeekToPreviousPositionChanged(long j);

        void onMediaItemTransition(@Nullable OooOOO0 oooOOO0, int i);

        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        @UnstableApi
        void onMetadata(Metadata metadata);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(OooOOOO oooOOOO);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(PlaybackException playbackException);

        void onPlayerErrorChanged(@Nullable PlaybackException playbackException);

        @UnstableApi
        @Deprecated
        void onPlayerStateChanged(boolean z, int i);

        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata);

        @UnstableApi
        @Deprecated
        void onPositionDiscontinuity(int i);

        void onPositionDiscontinuity(OooO0o oooO0o, OooO0o oooO0o2, int i);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i);

        void onSeekBackIncrementChanged(long j);

        void onSeekForwardIncrementChanged(long j);

        void onShuffleModeEnabledChanged(boolean z);

        void onSkipSilenceEnabledChanged(boolean z);

        void onSurfaceSizeChanged(int i, int i2);

        void onTimelineChanged(Oooo0 oooo0, int i);

        void onTrackSelectionParametersChanged(o00O0O o00o0o2);

        void onTracksChanged(o00Oo0 o00oo1);

        void onVideoSizeChanged(o00Ooo o00ooo2);

        void onVolumeChanged(float f);
    }

    public static final class OooO0o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f6715OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Object f6716OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        @UnstableApi
        public final OooOOO0 f6717OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f6718OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final Object f6719OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f6720OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f6721OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f6722OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f6723OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6708OooOOO0 = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6707OooOOO = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f6709OooOOOO = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f6710OooOOOo = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f6712OooOOo0 = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f6711OooOOo = o00.Oooo00o(5);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final String f6713OooOOoo = o00.Oooo00o(6);

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.o0OoOo0 f6714OooOo00 = new androidx.compose.animation.o0OoOo0();

        @UnstableApi
        public OooO0o(@Nullable Object obj, int i, @Nullable OooOOO0 oooOOO0, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f6716OooO0Oo = obj;
            this.f6718OooO0o0 = i;
            this.f6717OooO0o = oooOOO0;
            this.f6719OooO0oO = obj2;
            this.f6720OooO0oo = i2;
            this.f6715OooO = j;
            this.f6721OooOO0 = j2;
            this.f6722OooOO0O = i3;
            this.f6723OooOO0o = i4;
        }

        @UnstableApi
        public final Bundle OooO0OO(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putInt(f6708OooOOO0, z2 ? this.f6718OooO0o0 : 0);
            OooOOO0 oooOOO0 = this.f6717OooO0o;
            if (oooOOO0 != null && z) {
                bundle.putBundle(f6707OooOOO, oooOOO0.toBundle());
            }
            bundle.putInt(f6709OooOOOO, z2 ? this.f6720OooO0oo : 0);
            bundle.putLong(f6710OooOOOo, z ? this.f6715OooO : 0L);
            bundle.putLong(f6712OooOOo0, z ? this.f6721OooOO0 : 0L);
            bundle.putInt(f6711OooOOo, z ? this.f6722OooOO0O : -1);
            bundle.putInt(f6713OooOOoo, z ? this.f6723OooOO0o : -1);
            return bundle;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f6718OooO0o0 == oooO0o.f6718OooO0o0 && this.f6720OooO0oo == oooO0o.f6720OooO0oo && this.f6715OooO == oooO0o.f6715OooO && this.f6721OooOO0 == oooO0o.f6721OooOO0 && this.f6722OooOO0O == oooO0o.f6722OooOO0O && this.f6723OooOO0o == oooO0o.f6723OooOO0o && com.google.common.base.Oooo0.OooO00o(this.f6716OooO0Oo, oooO0o.f6716OooO0Oo) && com.google.common.base.Oooo0.OooO00o(this.f6719OooO0oO, oooO0o.f6719OooO0oO) && com.google.common.base.Oooo0.OooO00o(this.f6717OooO0o, oooO0o.f6717OooO0o);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6716OooO0Oo, Integer.valueOf(this.f6718OooO0o0), this.f6717OooO0o, this.f6719OooO0oO, Integer.valueOf(this.f6720OooO0oo), Long.valueOf(this.f6715OooO), Long.valueOf(this.f6721OooOO0), Integer.valueOf(this.f6722OooOO0O), Integer.valueOf(this.f6723OooOO0o)});
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            return OooO0OO(true, true);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    void OooO(@Nullable SurfaceView surfaceView);

    void OooO00o(OooOOOO oooOOOO);

    OooOOOO OooO0O0();

    void OooO0Oo();

    boolean OooO0o();

    void OooO0o0();

    long OooO0oO();

    void OooO0oo();

    void OooOO0();

    @Nullable
    PlaybackException OooOO0O();

    o00Oo0 OooOO0o();

    o000O000.OooO0O0 OooOOO();

    boolean OooOOO0();

    void OooOOOO(OooO0OO oooO0OO);

    int OooOOOo();

    boolean OooOOo();

    boolean OooOOo0(int i);

    void OooOOoo(OooO0OO oooO0OO);

    void OooOo();

    Oooo0 OooOo0();

    int OooOo00();

    Looper OooOo0O();

    o00O0O OooOo0o();

    void OooOoO(int i, long j);

    void OooOoO0(@Nullable TextureView textureView);

    boolean OooOoOO();

    long OooOoo();

    void OooOoo0(boolean z);

    int OooOooO();

    void OooOooo(@Nullable TextureView textureView);

    void Oooo(o00O0O o00o0o2);

    void Oooo0(long j);

    o00Ooo Oooo000();

    boolean Oooo00O();

    int Oooo00o();

    long Oooo0O0();

    long Oooo0OO();

    int Oooo0o();

    boolean Oooo0o0();

    int Oooo0oO();

    void Oooo0oo(int i);

    long OoooO();

    int OoooO0();

    void OoooO00(@Nullable SurfaceView surfaceView);

    boolean OoooO0O();

    void OoooOO0();

    MediaMetadata OoooOOO();

    long OoooOOo();

    boolean OoooOo0();

    long getCurrentPosition();

    boolean isPlaying();

    void o000oOoO();

    void pause();

    void release();
}
