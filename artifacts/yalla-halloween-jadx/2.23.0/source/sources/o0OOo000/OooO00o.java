package o0OOo000;

import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p230o00oOoO0.o0000O0O;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements Player.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f43835OooO0Oo;

    public OooO00o(OooO0O0 oooO0O0) {
        this.f43835OooO0Oo = oooO0O0;
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
    public final /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onIsPlayingChanged(boolean z) {
        Function1<? super OooOO0O, Unit> function1;
        OooO0O0 oooO0O0 = this.f43835OooO0Oo;
        if (z) {
            OooOO0O.OooO oooO = OooOO0O.OooO.f43851OooO00o;
            oooO0O0.f43845OooOO0 = oooO;
            Function1<? super OooOO0O, Unit> function2 = oooO0O0.f43836OooO;
            if (function2 != null) {
                function2.invoke(oooO);
                return;
            }
            return;
        }
        OooOO0O.OooO0o oooO0o = OooOO0O.OooO0o.f43854OooO00o;
        oooO0O0.f43845OooOO0 = oooO0o;
        com.google.android.exoplayer2.OooOOO oooOOO = oooO0O0.f43841OooO0o;
        if (oooO0O0.f43838OooO0O0.contains(Integer.valueOf(oooOOO.OooOOoo()))) {
            return;
        }
        oooOOO.o0000Ooo();
        if (oooOOO.f11133Oooooo.f39266OooO0o != null || (function1 = oooO0O0.f43836OooO) == null) {
            return;
        }
        function1.invoke(oooO0o);
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
    public final void onPlaybackStateChanged(int i) {
        OooO0O0 oooO0O0 = this.f43835OooO0Oo;
        if (i == 1) {
            oooO0O0.f43841OooO0o.getCurrentPosition();
            return;
        }
        if (i == 2) {
            Function1<? super OooOO0O, Unit> function1 = oooO0O0.f43836OooO;
            OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.f43852OooO00o;
            if (function1 != null) {
                function1.invoke(oooO00o);
            }
            oooO0O0.f43845OooOO0 = oooO00o;
            return;
        }
        if (i == 3) {
            Function1<? super OooOO0O, Unit> function2 = oooO0O0.f43836OooO;
            OooOO0O.C0461OooOO0O c0461OooOO0O = OooOO0O.C0461OooOO0O.f43856OooO00o;
            if (function2 != null) {
                function2.invoke(c0461OooOO0O);
            }
            oooO0O0.f43845OooOO0 = c0461OooOO0O;
            return;
        }
        if (i != 4) {
            return;
        }
        Function1<? super OooOO0O, Unit> function3 = oooO0O0.f43836OooO;
        OooOO0O.OooO0O0 oooO0O1 = OooOO0O.OooO0O0.f43853OooO00o;
        if (function3 != null) {
            function3.invoke(oooO0O1);
        }
        oooO0O0.f43845OooOO0 = oooO0O1;
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        OooO0O0 oooO0O0 = this.f43835OooO0Oo;
        Function1<? super OooOO0O, Unit> function1 = oooO0O0.f43836OooO;
        if (function1 != null) {
            function1.invoke(new OooOO0O.OooO0OO((ExoPlaybackException) error));
        }
        oooO0O0.f43845OooOO0 = new OooOO0O.OooO0OO((ExoPlaybackException) error);
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
    public final void onRenderedFirstFrame() {
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
    public final void onPositionDiscontinuity(@NotNull Player.OooO0o oldPosition, @NotNull Player.OooO0o newPosition, int i) {
        Function1<? super OooOO0O, Unit> function1;
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        if (i != 0 || (function1 = this.f43835OooO0Oo.f43836OooO) == null) {
            return;
        }
        function1.invoke(OooOO0O.OooOO0.f43855OooO00o);
    }
}
