package com.common.support.imagepicker.preview.component.video.engine.impl;

import android.net.Uri;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.player.MediaPlayer;
import com.common.support.imagepicker.player.config.PlayerConfig;
import com.common.support.imagepicker.player.entites.VideoSource;
import com.common.support.imagepicker.preview.component.video.config.VideoControlViewUIChangeListener;
import com.common.support.imagepicker.preview.component.video.config.VideoView;
import com.common.support.imagepicker.preview.component.video.engine.VideoEngine;
import com.common.support.imagepicker.preview.component.video.widget.BaseVideoControlView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/engine/impl/VideoEngineImpl;", "Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "mMediaPlayer", "Lcom/common/support/imagepicker/player/MediaPlayer;", "mPlayerConfig", "Lcom/common/support/imagepicker/player/config/PlayerConfig;", "(Lcom/common/support/imagepicker/player/MediaPlayer;Lcom/common/support/imagepicker/player/config/PlayerConfig;)V", "mMediaPlayerListener", "Lcom/common/support/imagepicker/player/MediaPlayer$Listener;", "mUIChangeListener", "Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;", "mVideoControlView", "Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;", "mVideoView", "Lcom/common/support/imagepicker/preview/component/video/config/VideoView;", "mViewSource", "Lcom/common/support/imagepicker/player/entites/VideoSource;", "addMediaPlayerListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getDataSource", "getMediaPlayer", "getPlayerConfig", "getVideoControlView", "getVideoSource", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "getVideoView", "onBind", "onUnBind", "setDataSource", "videoView", "setUIChangeListener", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoEngineImpl implements VideoEngine {

    @NotNull
    private final MediaPlayer mMediaPlayer;

    @Nullable
    private MediaPlayer.Listener mMediaPlayerListener;

    @Nullable
    private final PlayerConfig mPlayerConfig;

    @Nullable
    private VideoControlViewUIChangeListener mUIChangeListener;

    @Nullable
    private BaseVideoControlView mVideoControlView;

    @Nullable
    private VideoView mVideoView;

    @NotNull
    private final VideoSource mViewSource;

    public VideoEngineImpl(@NotNull MediaPlayer mMediaPlayer, @Nullable PlayerConfig playerConfig) {
        Intrinsics.checkNotNullParameter(mMediaPlayer, "mMediaPlayer");
        this.mMediaPlayer = mMediaPlayer;
        this.mPlayerConfig = playerConfig;
        this.mViewSource = new VideoSource((Uri) null, 0, 0, 0L, (Uri) null, 31, (DefaultConstructorMarker) null);
    }

    private final VideoSource getVideoSource(AlbumItem data) {
        this.mViewSource.clear();
        VideoSource videoSource = this.mViewSource;
        videoSource.setContentUri(data.getContentUri());
        videoSource.setWidth(data.getWidth());
        videoSource.setHeight(data.getHeight());
        videoSource.setDuration(data.getDuration());
        videoSource.setThumbnailUri(data.getThumbnail());
        return videoSource;
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    public void addMediaPlayerListener(@NotNull MediaPlayer.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mMediaPlayerListener = listener;
        this.mMediaPlayer.addListener(listener);
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    @NotNull
    /* JADX INFO: renamed from: getDataSource, reason: from getter */
    public VideoSource getMViewSource() {
        return this.mViewSource;
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    @NotNull
    /* JADX INFO: renamed from: getMediaPlayer, reason: from getter */
    public MediaPlayer getMMediaPlayer() {
        return this.mMediaPlayer;
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    @Nullable
    /* JADX INFO: renamed from: getPlayerConfig, reason: from getter */
    public PlayerConfig getMPlayerConfig() {
        return this.mPlayerConfig;
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    @NotNull
    public BaseVideoControlView getVideoControlView() {
        BaseVideoControlView baseVideoControlView = this.mVideoControlView;
        if (baseVideoControlView != null) {
            return baseVideoControlView;
        }
        throw new IllegalArgumentException("Please [setDataSource] first.");
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    @NotNull
    public VideoView getVideoView() {
        VideoView videoView = this.mVideoView;
        if (videoView != null) {
            return videoView;
        }
        throw new IllegalArgumentException("Please [setDataSource] first.");
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    public void onBind() {
        BaseVideoControlView controlView;
        VideoView videoView = this.mVideoView;
        if (videoView != null && (controlView = videoView.getControlView()) != null) {
            controlView.setUIChangeListener$preview_release(this.mUIChangeListener);
        }
        MediaPlayer.Listener listener = this.mMediaPlayerListener;
        if (listener != null) {
            this.mMediaPlayer.addListener(listener);
        }
        this.mMediaPlayer.play();
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    public void onUnBind() {
        BaseVideoControlView controlView;
        VideoView videoView = this.mVideoView;
        if (videoView != null) {
            VideoView.DefaultImpls.setupPlayer$default(videoView, null, false, 2, null);
        }
        VideoView videoView2 = this.mVideoView;
        if (videoView2 != null && (controlView = videoView2.getControlView()) != null) {
            controlView.setUIChangeListener$preview_release(null);
        }
        MediaPlayer.Listener listener = this.mMediaPlayerListener;
        if (listener != null) {
            this.mMediaPlayer.removeListener(listener);
        }
        this.mMediaPlayer.release();
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    public void setDataSource(@NotNull VideoView videoView, @NotNull AlbumItem data) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(data, "data");
        this.mVideoView = videoView;
        this.mVideoControlView = videoView.getControlView();
        this.mMediaPlayer.preparePlayer(getVideoSource(data), this.mPlayerConfig);
        VideoView.DefaultImpls.setupPlayer$default(videoView, this.mMediaPlayer, false, 2, null);
    }

    @Override // com.common.support.imagepicker.preview.component.video.engine.VideoEngine
    public void setUIChangeListener(@NotNull VideoControlViewUIChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mUIChangeListener = listener;
    }

    public /* synthetic */ VideoEngineImpl(MediaPlayer mediaPlayer, PlayerConfig playerConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaPlayer, (i & 2) != 0 ? null : playerConfig);
    }
}
