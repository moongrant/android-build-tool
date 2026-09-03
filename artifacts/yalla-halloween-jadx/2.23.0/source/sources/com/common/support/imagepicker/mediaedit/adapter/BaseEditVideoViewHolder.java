package com.common.support.imagepicker.mediaedit.adapter;

import android.view.View;
import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.common.support.imagepicker.player.config.PlayerConfig;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.video.config.VideoView;
import com.common.support.imagepicker.preview.component.video.engine.VideoEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u0014\u0010\u0016\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditVideoViewHolder;", "Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditViewHolder;", "itemView", "Landroid/view/View;", "mEdit", "Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;", "(Landroid/view/View;Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;)V", "mDataSource", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "getMDataSource", "()Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "setMDataSource", "(Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;)V", "mVideoEngine", "Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "getMVideoEngine", "()Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "bindData", "", "videoView", "Lcom/common/support/imagepicker/preview/component/video/config/VideoView;", "data", "bindDataAfterPlayerInited", "config", "Lcom/common/support/imagepicker/player/config/PlayerConfig;", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseEditVideoViewHolder extends BaseEditViewHolder {

    @NotNull
    private final View itemView;

    @Nullable
    private MediaEditSource mDataSource;

    @NotNull
    private final MediaEdit mEdit;

    @NotNull
    private final VideoEngine mVideoEngine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEditVideoViewHolder(@NotNull View itemView, @NotNull MediaEdit mEdit) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mEdit, "mEdit");
        this.itemView = itemView;
        this.mEdit = mEdit;
        this.mVideoEngine = mEdit.getMPreview().getVideoEngine();
    }

    public static /* synthetic */ void bindDataAfterPlayerInited$default(BaseEditVideoViewHolder baseEditVideoViewHolder, PlayerConfig playerConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindDataAfterPlayerInited");
        }
        if ((i & 1) != 0) {
            playerConfig = null;
        }
        baseEditVideoViewHolder.bindDataAfterPlayerInited(playerConfig);
    }

    public final void bindData(@NotNull VideoView videoView, @NotNull MediaEditSource data) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(data, "data");
        this.mDataSource = data;
        this.mVideoEngine.setDataSource(videoView, data.getOriginItem());
        bindDataAfterPlayerInited(this.mVideoEngine.getMPlayerConfig());
    }

    public abstract void bindDataAfterPlayerInited(@Nullable PlayerConfig config);

    @Nullable
    public final MediaEditSource getMDataSource() {
        return this.mDataSource;
    }

    @NotNull
    public final VideoEngine getMVideoEngine() {
        return this.mVideoEngine;
    }

    @Override // com.common.support.imagepicker.mediaedit.adapter.BaseEditViewHolder
    @NotNull
    public BaseViewAttacher getViewAttacher() {
        return this.mVideoEngine.getVideoView().mo4027getViewAttacher();
    }

    public final void setMDataSource(@Nullable MediaEditSource mediaEditSource) {
        this.mDataSource = mediaEditSource;
    }
}
