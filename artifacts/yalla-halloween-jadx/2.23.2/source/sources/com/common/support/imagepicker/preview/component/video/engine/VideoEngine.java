package com.common.support.imagepicker.preview.component.video.engine;

import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.player.MediaPlayer;
import com.common.support.imagepicker.player.config.PlayerConfig;
import com.common.support.imagepicker.player.entites.VideoSource;
import com.common.support.imagepicker.preview.component.video.config.VideoControlViewUIChangeListener;
import com.common.support.imagepicker.preview.component.video.config.VideoView;
import com.common.support.imagepicker.preview.component.video.widget.BaseVideoControlView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "", "addMediaPlayerListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/imagepicker/player/MediaPlayer$Listener;", "getDataSource", "Lcom/common/support/imagepicker/player/entites/VideoSource;", "getMediaPlayer", "Lcom/common/support/imagepicker/player/MediaPlayer;", "getPlayerConfig", "Lcom/common/support/imagepicker/player/config/PlayerConfig;", "getVideoControlView", "Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;", "getVideoView", "Lcom/common/support/imagepicker/preview/component/video/config/VideoView;", "onBind", "onUnBind", "setDataSource", "videoView", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "setUIChangeListener", "Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VideoEngine {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void addMediaPlayerListener(@NotNull VideoEngine videoEngine, @NotNull MediaPlayer.Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
        }

        public static void onBind(@NotNull VideoEngine videoEngine) {
        }

        public static void onUnBind(@NotNull VideoEngine videoEngine) {
        }

        public static void setUIChangeListener(@NotNull VideoEngine videoEngine, @NotNull VideoControlViewUIChangeListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
        }
    }

    void addMediaPlayerListener(@NotNull MediaPlayer.Listener listener);

    @NotNull
    VideoSource getDataSource();

    @NotNull
    MediaPlayer getMediaPlayer();

    @Nullable
    PlayerConfig getPlayerConfig();

    @NotNull
    BaseVideoControlView getVideoControlView();

    @NotNull
    VideoView getVideoView();

    void onBind();

    void onUnBind();

    void setDataSource(@NotNull VideoView videoView, @NotNull AlbumItem data);

    void setUIChangeListener(@NotNull VideoControlViewUIChangeListener listener);
}
