package o0OOo000;

import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p230o00oOoO0.o0000O0O;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 implements Player.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerView f43868OooO0Oo;

    public OooOo00(VideoPlayerView videoPlayerView) {
        this.f43868OooO0Oo = videoPlayerView;
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onEvents(@NotNull Player player, @NotNull Player.OooO0O0 events) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.OooO00o(4, 5, 7, 13, 17)) {
            VideoPlayerView videoPlayerView = this.f43868OooO0Oo;
            if (videoPlayerView.getProgressUpdateListener() == null || !player.isPlaying()) {
                return;
            }
            videoPlayerView.OooO00o();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onIsPlayingChanged(boolean z) {
        if (z) {
            return;
        }
        VideoPlayerView videoPlayerView = this.f43868OooO0Oo;
        videoPlayerView.removeCallbacks(videoPlayerView.f22546OooO0o);
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onMediaItemTransition(o000oOoO o000oooo2, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlaybackParametersChanged(o00Ooo o00ooo2) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        VideoPlayerView videoPlayerView = this.f43868OooO0Oo;
        videoPlayerView.removeCallbacks(videoPlayerView.f22546OooO0o);
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onTimelineChanged(oo0o0Oo oo0o0oo, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.OooO oooO) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onTracksChanged(o0O0O00 o0o0o00) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onVideoSizeChanged(o0oOOo o0oooo) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onCues(o0000O0O o0000o0o2) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
    }
}
