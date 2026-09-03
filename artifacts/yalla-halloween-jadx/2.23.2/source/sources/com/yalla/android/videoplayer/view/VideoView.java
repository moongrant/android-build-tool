package com.yalla.android.videoplayer.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.camera.core.impl.o000OOo0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.OooOOOO;
import androidx.media3.common.Oooo0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00O0O;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.o00Ooo;
import androidx.media3.datasource.OooO0OO;
import androidx.media3.exoplayer.OooO;
import androidx.media3.exoplayer.OooO0o;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.source.o000oOoO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.android.videoplayer.PlayState;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO0O0;
import o000OOoO.OooOOO;
import o0OOo000.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0oOO;
import p080o000OoO.o00;
import p204o00o0o0O.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/yalla/android/videoplayer/view/VideoView;", "Landroid/widget/FrameLayout;", "Lo0OOo000/OooO00o;", "", "volume", "", "setVolume", "Lo00o0o0O/o0000O;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStateChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "YLVideoPlayer_release"}, k = 1, mv = {1, 9, 0})
public final class VideoView extends FrameLayout implements o0OOo000.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f22076OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextureView f22077OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO f22078OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0000O f22079OooO0oO;

    public static final class OooO00o implements Player.OooO0OO {
        public OooO00o() {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onAudioAttributesChanged(androidx.media3.common.OooO00o oooO00o) {
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
        public final /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(OooOOOO oooOOOO) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onPlaybackStateChanged(int i) {
            VideoView videoView = VideoView.this;
            if (i == 3) {
                o0000O o0000o2 = videoView.f22079OooO0oO;
                if (o0000o2 != null) {
                    o0000o2.OooO00o(PlayState.Prepare);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            o0000O o0000o3 = videoView.f22079OooO0oO;
            if (o0000o3 != null) {
                o0000o3.OooO00o(PlayState.Stop);
            }
            videoView.f22078OooO0o0.o0OOO0o(false);
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onPlayerError(@NotNull PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            VideoView videoView = VideoView.this;
            o0000O o0000o2 = videoView.f22079OooO0oO;
            if (o0000o2 != null) {
                o0000o2.OooO00o(PlayState.Stop);
            }
            videoView.f22078OooO0o0.o0OOO0o(false);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // o0OOo000.OooO00o
    public final void OooO00o(@NotNull OooOO0 videoItem) {
        androidx.media3.exoplayer.drm.OooO0OO oooO0OO;
        androidx.media3.exoplayer.source.OooOOOO oooOO1;
        DefaultDrmSessionManager defaultDrmSessionManagerOooO0O0;
        androidx.media3.exoplayer.drm.OooO0OO oooO0OO2;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        Uri uri = Uri.parse(videoItem.f43007OooO00o);
        OooOOO0 oooOOO0 = OooOOO0.f6475OooOO0;
        OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0();
        oooO0O0.f6520OooO0O0 = uri;
        OooOOO0 oooOOO0OooO00o = oooO0O0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooOOO0OooO00o, "fromUri(...)");
        int i = videoItem.f43008OooO0O0;
        OooOOO0.OooOO0O oooOO0O = oooOOO0OooO00o.f6486OooO0o0;
        if (i == 0) {
            OooO0OO oooO0OO3 = this.f22076OooO0Oo;
            o000OOo0 o000ooo1 = new o000OOo0(new OooOOO());
            Object obj = new Object();
            androidx.media3.exoplayer.upstream.OooO00o oooO00o = new androidx.media3.exoplayer.upstream.OooO00o();
            oooOO0O.getClass();
            oooOOO0OooO00o.f6486OooO0o0.getClass();
            OooOOO0.OooO oooO = oooOOO0OooO00o.f6486OooO0o0.f6576OooO0o;
            if (oooO == null || o00.f34910OooO00o < 18) {
                oooO0OO2 = androidx.media3.exoplayer.drm.OooO0OO.f7644OooO00o;
            } else {
                synchronized (obj) {
                    defaultDrmSessionManagerOooO0O0 = o00.OooO00o(oooO, null) ? null : androidx.media3.exoplayer.drm.OooO00o.OooO0O0(oooO);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO2 = defaultDrmSessionManagerOooO0O0;
            }
            oooOO1 = new o000oOoO(oooOOO0OooO00o, oooO0OO3, o000ooo1, oooO0OO2, oooO00o, ZegoConstants.ErrorMask.RoomServerErrorMask);
            Intrinsics.checkNotNull(oooOO1);
        } else {
            OooO0OO oooO0OO4 = this.f22076OooO0Oo;
            o000OOo0 o000ooo2 = new o000OOo0(new OooOOO());
            Object obj2 = new Object();
            androidx.media3.exoplayer.upstream.OooO00o oooO00o2 = new androidx.media3.exoplayer.upstream.OooO00o();
            oooOO0O.getClass();
            oooOOO0OooO00o.f6486OooO0o0.getClass();
            OooOOO0.OooO oooO2 = oooOOO0OooO00o.f6486OooO0o0.f6576OooO0o;
            if (oooO2 == null || o00.f34910OooO00o < 18) {
                oooO0OO = androidx.media3.exoplayer.drm.OooO0OO.f7644OooO00o;
            } else {
                synchronized (obj2) {
                    defaultDrmSessionManagerOooO0O0 = o00.OooO00o(oooO2, null) ? null : androidx.media3.exoplayer.drm.OooO00o.OooO0O0(oooO2);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO = defaultDrmSessionManagerOooO0O0;
            }
            oooOO1 = new androidx.media3.exoplayer.source.OooOO0(new o000oOoO(oooOOO0OooO00o, oooO0OO4, o000ooo2, oooO0OO, oooO00o2, ZegoConstants.ErrorMask.RoomServerErrorMask), i);
        }
        OooO oooO3 = this.f22078OooO0o0;
        oooO3.o0OOO0o(false);
        oooO3.oo0o0Oo();
        oooO3.o0ooOO0(oooOO1);
        oooO3.OooO0o0();
    }

    @Override // o0OOo000.OooO00o
    public final void OooO0Oo() {
        TextureView textureView = this.f22077OooO0o;
        if (textureView.getVisibility() != 0) {
            textureView.setVisibility(0);
        }
        this.f22078OooO0o0.OooO0Oo();
        o0000O o0000o2 = this.f22079OooO0oO;
        if (o0000o2 != null) {
            o0000o2.OooO00o(PlayState.Playing);
        }
    }

    @Override // o0OOo000.OooO00o
    public final void pause() {
        this.f22078OooO0o0.pause();
        o0000O o0000o2 = this.f22079OooO0oO;
        if (o0000o2 != null) {
            o0000o2.OooO00o(PlayState.Pause);
        }
    }

    @Override // o0OOo000.OooO00o
    public final void release() {
        this.f22078OooO0o0.release();
    }

    @Override // o0OOo000.OooO00o
    public void setStateChangedListener(@Nullable o0000O listener) {
        this.f22079OooO0oO = listener;
    }

    public void setVolume(float volume) {
        this.f22078OooO0o0.o0OO00O(volume);
    }

    @Override // o0OOo000.OooO00o
    public final void stop() {
        this.f22078OooO0o0.oo0o0Oo();
        this.f22077OooO0o.setVisibility(8);
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
        int i2 = o00.f34910OooO00o;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        this.f22076OooO0Oo = new OooO0OO(context, o0oOO.OooO0O0(o0OoOo0.OooO0O0("player/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.1.1"));
        OooO oooOOooO00o = new OooO0o.OooO0O0(context).OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooOOooO00o, "build(...)");
        this.f22078OooO0o0 = oooOOooO00o;
        TextureView textureView = new TextureView(context);
        this.f22077OooO0o = textureView;
        addView(textureView, -1, -1);
        oooOOooO00o.OooOoO0(textureView);
        oooOOooO00o.f7132OooOO0o.OooO00o(new OooO00o());
    }
}
