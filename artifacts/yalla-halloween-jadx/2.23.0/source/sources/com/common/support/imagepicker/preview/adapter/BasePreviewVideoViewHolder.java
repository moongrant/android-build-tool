package com.common.support.imagepicker.preview.adapter;

import android.view.View;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.player.config.PlayerConfig;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.video.config.VideoView;
import com.common.support.imagepicker.preview.component.video.engine.VideoEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/common/support/imagepicker/preview/adapter/BasePreviewVideoViewHolder;", "Lcom/common/support/imagepicker/preview/adapter/BasePreviewViewHolder;", "mVideoEngine", "Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "itemView", "Landroid/view/View;", "(Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;Landroid/view/View;)V", "bindData", "", "videoView", "Lcom/common/support/imagepicker/preview/component/video/config/VideoView;", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "bindDataAfterPlayerInited", "config", "Lcom/common/support/imagepicker/player/config/PlayerConfig;", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BasePreviewVideoViewHolder extends BasePreviewViewHolder {

    @NotNull
    private final VideoEngine mVideoEngine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePreviewVideoViewHolder(@NotNull VideoEngine mVideoEngine, @NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(mVideoEngine, "mVideoEngine");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.mVideoEngine = mVideoEngine;
    }

    public static /* synthetic */ void bindDataAfterPlayerInited$default(BasePreviewVideoViewHolder basePreviewVideoViewHolder, PlayerConfig playerConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindDataAfterPlayerInited");
        }
        if ((i & 1) != 0) {
            playerConfig = null;
        }
        basePreviewVideoViewHolder.bindDataAfterPlayerInited(playerConfig);
    }

    public final void bindData(@NotNull VideoView videoView, @NotNull AlbumItem data) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(data, "data");
        this.mVideoEngine.setDataSource(videoView, data);
        bindDataAfterPlayerInited(this.mVideoEngine.getMPlayerConfig());
    }

    public abstract void bindDataAfterPlayerInited(@Nullable PlayerConfig config);

    @Override // com.common.support.imagepicker.preview.adapter.BasePreviewViewHolder
    @NotNull
    public BaseViewAttacher getViewAttacher() {
        return this.mVideoEngine.getVideoView().mo4027getViewAttacher();
    }
}
