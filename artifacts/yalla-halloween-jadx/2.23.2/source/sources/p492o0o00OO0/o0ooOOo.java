package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooO00o;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.OooOOOO;
import androidx.media3.common.Oooo0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00O0O;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.o00Ooo;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o000O000.OooO0O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo implements Player.OooO0OO {
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
    public final /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onIsPlayingChanged(boolean z) {
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
        String message = error.getMessage();
        if (message == null || StringsKt.isBlank(message)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(message, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
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
    public final /* synthetic */ void onTimelineChanged(Oooo0 oooo0, int i) {
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
