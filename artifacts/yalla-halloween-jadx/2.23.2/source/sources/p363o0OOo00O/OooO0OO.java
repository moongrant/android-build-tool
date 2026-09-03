package p363o0OOo00O;

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
import androidx.media3.exoplayer.OooO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO0O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Player.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f43010OooO0Oo;

    public OooO0OO(OooO0o oooO0o) {
        this.f43010OooO0Oo = oooO0o;
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
    public final /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onIsPlayingChanged(boolean z) {
        Function1<? super OooOOO, Unit> function1;
        OooO0o oooO0o = this.f43010OooO0Oo;
        if (z) {
            OooOOO.OooO oooO = OooOOO.OooO.f43046OooO00o;
            oooO0o.f43020OooOO0 = oooO;
            Function1<? super OooOOO, Unit> function2 = oooO0o.f43011OooO;
            if (function2 != null) {
                function2.invoke(oooO);
                return;
            }
            return;
        }
        OooOOO.OooO0o oooO0o2 = OooOOO.OooO0o.f43049OooO00o;
        oooO0o.f43020OooOO0 = oooO0o2;
        OooO oooO2 = oooO0o.f43016OooO0o;
        if (oooO0o.f43013OooO0O0.contains(Integer.valueOf(oooO2.Oooo0o()))) {
            return;
        }
        oooO2.o00000();
        if (oooO2.f7179Oooooo0.f34109OooO0o != null || (function1 = oooO0o.f43011OooO) == null) {
            return;
        }
        function1.invoke(oooO0o2);
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
    public final void onPlaybackStateChanged(int i) {
        OooO0o oooO0o = this.f43010OooO0Oo;
        if (i == 1) {
            oooO0o.f43016OooO0o.getCurrentPosition();
            return;
        }
        if (i == 2) {
            Function1<? super OooOOO, Unit> function1 = oooO0o.f43011OooO;
            OooOOO.OooO00o oooO00o = OooOOO.OooO00o.f43047OooO00o;
            if (function1 != null) {
                function1.invoke(oooO00o);
            }
            oooO0o.f43020OooOO0 = oooO00o;
            return;
        }
        if (i == 3) {
            Function1<? super OooOOO, Unit> function2 = oooO0o.f43011OooO;
            OooOOO.OooOO0O oooOO0O = OooOOO.OooOO0O.f43051OooO00o;
            if (function2 != null) {
                function2.invoke(oooOO0O);
            }
            oooO0o.f43020OooOO0 = oooOO0O;
            return;
        }
        if (i != 4) {
            return;
        }
        Function1<? super OooOOO, Unit> function3 = oooO0o.f43011OooO;
        OooOOO.OooO0O0 oooO0O0 = OooOOO.OooO0O0.f43048OooO00o;
        if (function3 != null) {
            function3.invoke(oooO0O0);
        }
        oooO0o.f43020OooOO0 = oooO0O0;
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        OooO0o oooO0o = this.f43010OooO0Oo;
        Function1<? super OooOOO, Unit> function1 = oooO0o.f43011OooO;
        if (function1 != null) {
            function1.invoke(new OooOOO.OooO0OO(error));
        }
        oooO0o.f43020OooOO0 = new OooOOO.OooO0OO(error);
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
    public final void onRenderedFirstFrame() {
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
    public final void onPositionDiscontinuity(@NotNull Player.OooO0o oldPosition, @NotNull Player.OooO0o newPosition, int i) {
        Function1<? super OooOOO, Unit> function1;
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        if (i != 0 || (function1 = this.f43010OooO0Oo.f43011OooO) == null) {
            return;
        }
        function1.invoke(OooOOO.OooOO0.f43050OooO00o);
    }
}
