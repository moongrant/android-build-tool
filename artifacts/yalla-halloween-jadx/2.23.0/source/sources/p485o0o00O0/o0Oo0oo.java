package p485o0o00O0;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.OooO00o;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.trackselection.OooO;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p230o00oOoO0.o0000O0O;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo implements Player.OooO0OO {
    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onAudioAttributesChanged(OooO00o oooO00o) {
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
    public final /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onIsPlayingChanged(boolean z) {
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
        String message = error.getMessage();
        if (message == null || StringsKt.isBlank(message)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(message, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
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
    public final /* synthetic */ void onTrackSelectionParametersChanged(OooO oooO) {
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
