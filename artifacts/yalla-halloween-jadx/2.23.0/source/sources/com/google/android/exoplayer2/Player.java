package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.Cue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p230o00oOoO0.o0000O0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O0OO;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
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

    public static final class OooO00o implements OooO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final String f11342OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f11343OooO0o0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00O0OO f11344OooO0Oo;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.Player$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0197OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final o00O0OO.OooO00o f11345OooO00o = new o00O0OO.OooO00o();

            @CanIgnoreReturnValue
            public final void OooO00o(int i, boolean z) {
                o00O0OO.OooO00o oooO00o = this.f11345OooO00o;
                if (z) {
                    oooO00o.OooO00o(i);
                } else {
                    oooO00o.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            o00O000o.OooO0Oo(!false);
            f11343OooO0o0 = new OooO00o(new o00O0OO(sparseBooleanArray));
            f11342OooO0o = o0O00.Oooo00O(0);
        }

        public OooO00o(o00O0OO o00o0oo2) {
            this.f11344OooO0Oo = o00o0oo2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                return this.f11344OooO0Oo.equals(((OooO00o) obj).f11344OooO0Oo);
            }
            return false;
        }

        public final int hashCode() {
            return this.f11344OooO0Oo.hashCode();
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i = 0;
            while (true) {
                o00O0OO o00o0oo2 = this.f11344OooO0Oo;
                if (i >= o00o0oo2.OooO0O0()) {
                    bundle.putIntegerArrayList(f11342OooO0o, arrayList);
                    return bundle;
                }
                arrayList.add(Integer.valueOf(o00o0oo2.OooO00o(i)));
                i++;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0OO f11346OooO00o;

        public OooO0O0(o00O0OO o00o0oo2) {
            this.f11346OooO00o = o00o0oo2;
        }

        public final boolean OooO00o(int... iArr) {
            o00O0OO o00o0oo2 = this.f11346OooO00o;
            o00o0oo2.getClass();
            for (int i : iArr) {
                if (o00o0oo2.f40569OooO00o.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                return this.f11346OooO00o.equals(((OooO0O0) obj).f11346OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f11346OooO00o.hashCode();
        }
    }

    public interface OooO0OO {
        void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o);

        void onAvailableCommandsChanged(OooO00o oooO00o);

        @Deprecated
        void onCues(List<Cue> list);

        void onCues(o0000O0O o0000o0o2);

        void onDeviceInfoChanged(DeviceInfo deviceInfo);

        void onEvents(Player player, OooO0O0 oooO0O0);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @Deprecated
        void onLoadingChanged(boolean z);

        void onMediaItemTransition(@Nullable o000oOoO o000oooo2, int i);

        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onMetadata(Metadata metadata);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(o00Ooo o00ooo2);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(PlaybackException playbackException);

        void onPlayerErrorChanged(@Nullable PlaybackException playbackException);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i);

        @Deprecated
        void onPositionDiscontinuity(int i);

        void onPositionDiscontinuity(OooO0o oooO0o, OooO0o oooO0o2, int i);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i);

        void onShuffleModeEnabledChanged(boolean z);

        void onSkipSilenceEnabledChanged(boolean z);

        void onSurfaceSizeChanged(int i, int i2);

        void onTimelineChanged(oo0o0Oo oo0o0oo, int i);

        void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.OooO oooO);

        void onTracksChanged(o0O0O00 o0o0o00);

        void onVideoSizeChanged(o0oOOo o0oooo);

        void onVolumeChanged(float f);
    }

    public static final class OooO0o implements OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f11354OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Object f11355OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final o000oOoO f11356OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f11357OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final Object f11358OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f11359OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f11360OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f11361OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f11362OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f11348OooOOO0 = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f11347OooOOO = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f11349OooOOOO = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f11350OooOOOo = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f11352OooOOo0 = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f11351OooOOo = o0O00.Oooo00O(5);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final String f11353OooOOoo = o0O00.Oooo00O(6);

        public OooO0o(@Nullable Object obj, int i, @Nullable o000oOoO o000oooo2, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f11355OooO0Oo = obj;
            this.f11357OooO0o0 = i;
            this.f11356OooO0o = o000oooo2;
            this.f11358OooO0oO = obj2;
            this.f11359OooO0oo = i2;
            this.f11354OooO = j;
            this.f11360OooOO0 = j2;
            this.f11361OooOO0O = i3;
            this.f11362OooOO0o = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f11357OooO0o0 == oooO0o.f11357OooO0o0 && this.f11359OooO0oo == oooO0o.f11359OooO0oo && this.f11354OooO == oooO0o.f11354OooO && this.f11360OooOO0 == oooO0o.f11360OooOO0 && this.f11361OooOO0O == oooO0o.f11361OooOO0O && this.f11362OooOO0o == oooO0o.f11362OooOO0o && com.google.common.base.Oooo000.OooO00o(this.f11355OooO0Oo, oooO0o.f11355OooO0Oo) && com.google.common.base.Oooo000.OooO00o(this.f11358OooO0oO, oooO0o.f11358OooO0oO) && com.google.common.base.Oooo000.OooO00o(this.f11356OooO0o, oooO0o.f11356OooO0o);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f11355OooO0Oo, Integer.valueOf(this.f11357OooO0o0), this.f11356OooO0o, this.f11358OooO0oO, Integer.valueOf(this.f11359OooO0oo), Long.valueOf(this.f11354OooO), Long.valueOf(this.f11360OooOO0), Integer.valueOf(this.f11361OooOO0O), Integer.valueOf(this.f11362OooOO0o)});
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f11348OooOOO0, this.f11357OooO0o0);
            o000oOoO o000oooo2 = this.f11356OooO0o;
            if (o000oooo2 != null) {
                bundle.putBundle(f11347OooOOO, o000oooo2.toBundle());
            }
            bundle.putInt(f11349OooOOOO, this.f11359OooO0oo);
            bundle.putLong(f11350OooOOOo, this.f11354OooO);
            bundle.putLong(f11352OooOOo0, this.f11360OooOO0);
            bundle.putInt(f11351OooOOo, this.f11361OooOO0O);
            bundle.putInt(f11353OooOOoo, this.f11362OooOO0o);
            return bundle;
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

    o0000O0O OooO();

    o00Ooo OooO00o();

    void OooO0O0();

    void OooO0OO();

    boolean OooO0Oo();

    void OooO0o();

    void OooO0o0(o00Ooo o00ooo2);

    void OooO0oO();

    o0O0O00 OooO0oo();

    oo0o0Oo OooOO0();

    Looper OooOO0O();

    com.google.android.exoplayer2.trackselection.OooO OooOO0o();

    boolean OooOOO();

    void OooOOO0();

    long OooOOOO();

    void OooOOOo(@FloatRange(from = 0.0d, to = 1.0d) float f);

    long OooOOo();

    long OooOOo0();

    int OooOOoo();

    void OooOo();

    int OooOo0();

    int OooOo00();

    boolean OooOo0O();

    long OooOo0o();

    long OooOoO();

    void OooOoO0();

    @Deprecated
    void OooOoOO();

    long OooOoo();

    void OooOoo0(@Nullable Surface surface);

    void OooOooo(OooO0OO oooO0OO);

    OooO00o Oooo();

    int Oooo0();

    void Oooo000(@Nullable SurfaceView surfaceView);

    void Oooo00O(boolean z);

    boolean Oooo00o();

    boolean Oooo0O0(int i);

    boolean Oooo0OO();

    void Oooo0o(@Nullable TextureView textureView);

    int Oooo0o0();

    void Oooo0oo(int i, long j);

    int OoooO();

    void OoooO0();

    void OoooO00(boolean z);

    void OoooO0O();

    void OoooOO0(@Nullable TextureView textureView);

    @FloatRange(from = 0.0d, to = 1.0d)
    float OoooOOO();

    com.google.android.exoplayer2.audio.OooO00o OoooOOo();

    boolean OoooOo0();

    int OoooOoO();

    void OoooOoo(long j);

    void Ooooo00(OooO0OO oooO0OO);

    long Ooooo0o();

    boolean OooooO0();

    void OooooOO(com.google.android.exoplayer2.trackselection.OooO oooO);

    @Nullable
    ExoPlaybackException OooooOo();

    void Oooooo(com.google.common.collect.o0O00 o0o01);

    void Oooooo0(int i);

    void OoooooO(@Nullable SurfaceView surfaceView);

    MediaMetadata Ooooooo();

    long getCurrentPosition();

    long getDuration();

    boolean isPlaying();

    o0oOOo o000oOoO();

    boolean o0OoOo0();

    void pause();

    void release();

    void stop();
}
