package p363o0OOo00O;

import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooO00o;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.OooOOOO;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00O0O;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.o00Ooo;
import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO0O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements Player.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerView f43068OooO0Oo;

    public Oooo0(VideoPlayerView videoPlayerView) {
        this.f43068OooO0Oo = videoPlayerView;
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onAudioAttributesChanged(OooO00o oooO00o) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onEvents(@NotNull Player player, @NotNull Player.OooO0O0 events) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.f6706OooO00o.OooO00o(4, 5, 7, 13, 17)) {
            VideoPlayerView videoPlayerView = this.f43068OooO0Oo;
            if (videoPlayerView.getProgressUpdateListener() == null || !player.isPlaying()) {
                return;
            }
            videoPlayerView.OooO00o();
        }
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onIsPlayingChanged(boolean z) {
        if (z) {
            return;
        }
        VideoPlayerView videoPlayerView = this.f43068OooO0Oo;
        videoPlayerView.removeCallbacks(videoPlayerView.f22073OooO0o);
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onMediaItemTransition(OooOOO0 oooOOO0, int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlaybackParametersChanged(OooOOOO oooOOOO) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        VideoPlayerView videoPlayerView = this.f43068OooO0Oo;
        videoPlayerView.removeCallbacks(videoPlayerView.f22073OooO0o);
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onTimelineChanged(androidx.media3.common.Oooo0 oooo0, int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onTrackSelectionParametersChanged(o00O0O o00o0o2) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onTracksChanged(o00Oo0 o00oo1) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onVideoSizeChanged(o00Ooo o00ooo2) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onCues(OooO0O0 oooO0O0) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
    }
}
