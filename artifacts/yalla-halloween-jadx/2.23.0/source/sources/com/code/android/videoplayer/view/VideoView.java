package com.code.android.videoplayer.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.videoplayer.PlayState;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.o0OOO0o;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOO0;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.upstream.OooO0OO;
import com.google.android.exoplayer2.upstream.OooO0o;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0O00o0;
import p152o00OoO.OooO;
import p152o00OoO.OooOO0O;
import p152o00OoO.OooOOO0;
import p200o00o0o.o00O0000;
import p209o00o0oo0.oo00o;
import p230o00oOoO0.o0000O0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/code/android/videoplayer/view/VideoView;", "Landroid/widget/FrameLayout;", "Lo00OoO/OooO;", "", "volume", "", "setVolume", "Lo00OoO/OooOO0O;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStateChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "YLVideoPlayer_release"}, k = 1, mv = {1, 8, 0})
public final class VideoView extends FrameLayout implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f10415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextureView f10416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f10417OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooOO0O f10418OooO0oO;

    public static final class OooO00o implements Player.OooO0OO {
        public OooO00o() {
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
        public final /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(o00Ooo o00ooo2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPlaybackStateChanged(int i) {
            VideoView videoView = VideoView.this;
            if (i == 3) {
                OooOO0O oooOO0O = videoView.f10418OooO0oO;
                if (oooOO0O != null) {
                    oooOO0O.OooO00o(PlayState.Prepare);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            OooOO0O oooOO0O2 = videoView.f10418OooO0oO;
            if (oooOO0O2 != null) {
                oooOO0O2.OooO00o(PlayState.Stop);
            }
            videoView.f10417OooO0o0.Oooo00O(false);
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPlayerError(@NotNull PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            VideoView videoView = VideoView.this;
            OooOO0O oooOO0O = videoView.f10418OooO0oO;
            if (oooOO0O != null) {
                oooOO0O.OooO00o(PlayState.Stop);
            }
            videoView.f10417OooO0o0.Oooo00O(false);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p152o00OoO.OooO
    public final void OooO00o(@NotNull OooOOO0 videoItem) {
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO;
        OooOOOO oooOO1;
        DefaultDrmSessionManager defaultDrmSessionManagerOooO0O0;
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO2;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        Uri uri = Uri.parse(videoItem.f38120OooO00o);
        o000oOoO o000oooo2 = o000oOoO.f12659OooOO0;
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        oooO0O0.f12704OooO0O0 = uri;
        o000oOoO o000ooooOooO00o = oooO0O0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(o000ooooOooO00o, "fromUri(Uri.parse(videoItem.filePath))");
        int i = videoItem.f38121OooO0O0;
        o000oOoO.OooOO0O oooOO0O = o000ooooOooO00o.f12670OooO0o0;
        if (i == 0) {
            OooO0OO oooO0OO3 = this.f10415OooO0Oo;
            o00O0000 o00o0001 = new o00O0000(new oo00o());
            Object obj = new Object();
            com.google.android.exoplayer2.upstream.OooO oooO = new com.google.android.exoplayer2.upstream.OooO();
            oooOO0O.getClass();
            o000ooooOooO00o.f12670OooO0o0.getClass();
            o000oOoO.OooO oooO2 = o000ooooOooO00o.f12670OooO0o0.f12760OooO0o;
            if (oooO2 == null || o0O00.f40595OooO00o < 18) {
                oooO0OO2 = com.google.android.exoplayer2.drm.OooO0OO.f11774OooO00o;
            } else {
                synchronized (obj) {
                    defaultDrmSessionManagerOooO0O0 = o0O00.OooO00o(oooO2, null) ? null : com.google.android.exoplayer2.drm.OooO00o.OooO0O0(oooO2);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO2 = defaultDrmSessionManagerOooO0O0;
            }
            oooOO1 = new com.google.android.exoplayer2.source.o000oOoO(o000ooooOooO00o, oooO0OO3, o00o0001, oooO0OO2, oooO, ZegoConstants.ErrorMask.RoomServerErrorMask);
            Intrinsics.checkNotNullExpressionValue(oooOO1, "{\n                Progre…(mediaItem)\n            }");
        } else {
            OooO0OO oooO0OO4 = this.f10415OooO0Oo;
            o00O0000 o00o0002 = new o00O0000(new oo00o());
            Object obj2 = new Object();
            com.google.android.exoplayer2.upstream.OooO oooO3 = new com.google.android.exoplayer2.upstream.OooO();
            oooOO0O.getClass();
            o000ooooOooO00o.f12670OooO0o0.getClass();
            o000oOoO.OooO oooO4 = o000ooooOooO00o.f12670OooO0o0.f12760OooO0o;
            if (oooO4 == null || o0O00.f40595OooO00o < 18) {
                oooO0OO = com.google.android.exoplayer2.drm.OooO0OO.f11774OooO00o;
            } else {
                synchronized (obj2) {
                    defaultDrmSessionManagerOooO0O0 = o0O00.OooO00o(oooO4, null) ? null : com.google.android.exoplayer2.drm.OooO00o.OooO0O0(oooO4);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO = defaultDrmSessionManagerOooO0O0;
            }
            oooOO1 = new OooOO0(new com.google.android.exoplayer2.source.o000oOoO(o000ooooOooO00o, oooO0OO4, o00o0002, oooO0OO, oooO3, ZegoConstants.ErrorMask.RoomServerErrorMask), i);
        }
        o0OOO0o o0ooo0o2 = this.f10417OooO0o0;
        o0ooo0o2.Oooo00O(false);
        o0ooo0o2.stop();
        o0ooo0o2.OooOooO(oooOO1);
        o0ooo0o2.OooO0OO();
    }

    @Override // p152o00OoO.OooO
    public final void OooO0O0() {
        TextureView textureView = this.f10416OooO0o;
        if (textureView.getVisibility() != 0) {
            textureView.setVisibility(0);
        }
        this.f10417OooO0o0.Oooo00O(true);
        OooOO0O oooOO0O = this.f10418OooO0oO;
        if (oooOO0O != null) {
            oooOO0O.OooO00o(PlayState.Playing);
        }
    }

    @Override // p152o00OoO.OooO
    public final void pause() {
        this.f10417OooO0o0.Oooo00O(false);
        OooOO0O oooOO0O = this.f10418OooO0oO;
        if (oooOO0O != null) {
            oooOO0O.OooO00o(PlayState.Pause);
        }
    }

    @Override // p152o00OoO.OooO
    public final void release() {
        this.f10417OooO0o0.release();
    }

    @Override // p152o00OoO.OooO
    public void setStateChangedListener(@Nullable OooOO0O listener) {
        this.f10418OooO0oO = listener;
    }

    public void setVolume(float volume) {
        this.f10417OooO0o0.OooOOOo(volume);
    }

    @Override // p152o00OoO.OooO
    public final void stop() {
        this.f10417OooO0o0.stop();
        this.f10416OooO0o.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = o0O00.f40595OooO00o;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String strOooO0O0 = o0O00o0.OooO0O0(o0OoOo0.OooO00o("player/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.19.0");
        OooO0o.OooO00o oooO00o = new OooO0o.OooO00o();
        oooO00o.f14241OooO0O0 = strOooO0O0;
        this.f10415OooO0Oo = new OooO0OO(context, oooO00o);
        com.google.android.exoplayer2.OooOOO0.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.OooOOO0.OooO0O0(context);
        o00O000o.OooO0Oo(!oooO0O0.f11164OooOo00);
        oooO0O0.f11164OooOo00 = true;
        o0OOO0o o0ooo0o2 = new o0OOO0o(oooO0O0);
        Intrinsics.checkNotNullExpressionValue(o0ooo0o2, "Builder(context).build()");
        this.f10417OooO0o0 = o0ooo0o2;
        TextureView textureView = new TextureView(context);
        this.f10416OooO0o = textureView;
        addView(textureView, -1, -1);
        o0ooo0o2.Oooo0o(textureView);
        o0ooo0o2.Ooooo00(new OooO00o());
    }
}
