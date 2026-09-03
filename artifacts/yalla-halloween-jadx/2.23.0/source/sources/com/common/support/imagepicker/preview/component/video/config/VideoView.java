package com.common.support.imagepicker.preview.component.video.config;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.common.support.imagepicker.player.MediaPlayer;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.video.widget.BaseVideoControlView;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u0007H&¨\u0006\u001b"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/config/VideoView;", "", "bindLifecycle", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "enableZoom", "", "getControlView", "Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;", "getPlayer", "Lcom/common/support/imagepicker/player/MediaPlayer;", "getTextureViewBitmap", "Landroid/graphics/Bitmap;", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "setMediaPlayerErrorListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/imagepicker/preview/component/video/config/MediaPlayerErrorListener;", "setShowBottomBar", "show", "setVideoCover", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "setupPlayer", "player", "autoCover", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface VideoView {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void bindLifecycle(@NotNull VideoView videoView, @NotNull LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        }

        public static void enableZoom(@NotNull VideoView videoView, boolean z) {
        }

        @Nullable
        public static Bitmap getTextureViewBitmap(@NotNull VideoView videoView) {
            return null;
        }

        public static void setMediaPlayerErrorListener(@NotNull VideoView videoView, @NotNull MediaPlayerErrorListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
        }

        public static void setShowBottomBar(@NotNull VideoView videoView, boolean z) {
        }

        public static void setVideoCover(@NotNull VideoView videoView, @Nullable Uri uri) {
        }

        public static /* synthetic */ void setupPlayer$default(VideoView videoView, MediaPlayer mediaPlayer, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupPlayer");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            videoView.setupPlayer(mediaPlayer, z);
        }
    }

    void bindLifecycle(@NotNull LifecycleOwner lifecycleOwner);

    void enableZoom(boolean enableZoom);

    @NotNull
    BaseVideoControlView getControlView();

    @Nullable
    MediaPlayer getPlayer();

    @Nullable
    Bitmap getTextureViewBitmap();

    @NotNull
    /* JADX INFO: renamed from: getViewAttacher */
    BaseViewAttacher mo4027getViewAttacher();

    void setMediaPlayerErrorListener(@NotNull MediaPlayerErrorListener listener);

    void setShowBottomBar(boolean show);

    void setVideoCover(@Nullable Uri uri);

    void setupPlayer(@Nullable MediaPlayer player, boolean autoCover);
}
