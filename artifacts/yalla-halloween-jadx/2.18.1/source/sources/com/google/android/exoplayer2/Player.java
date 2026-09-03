package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p319o0O0oOo0.o0000O;
import p466o0OooO0.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public interface Player {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    public interface OooO00o {
        void OooO(int i);

        @Deprecated
        void OooO00o();

        @Deprecated
        void OooO0OO();

        void OooO0oO(int i);

        void OooOO0O(o000O00 o000o01);

        void OooOO0o(ExoPlaybackException exoPlaybackException);

        void OooOOO(o000oOoO o000oooo2, int i);

        void OooOOO0(boolean z);

        void OooOOo0(int i);

        void OooOOoo();

        @Deprecated
        void OooOoOO(boolean z, int i);

        void OooOooO(@Nullable OooOOO oooOOO, int i);

        void Oooo0OO(boolean z, int i);

        void Oooo0o0(TrackGroupArray trackGroupArray, o0000O o0000o2);

        void OoooO(boolean z);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    boolean OooO00o();

    long OooO0O0();

    int OooO0OO();

    int OooO0Oo();

    long OooO0o();

    int OooO0o0();

    int OooO0oO();

    o000oOoO OooO0oo();

    long getCurrentPosition();
}
