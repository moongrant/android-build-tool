package com.common.support.imagepicker.mediaedit.entities;

import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.crop.entites.CropRatioEntity;
import com.common.support.imagepicker.crop.entites.VideoCropInfo;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\u0018\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "", "itemWrapper", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;)V", "canvasHeight", "", "getCanvasHeight", "()I", "setCanvasHeight", "(I)V", "canvasWidth", "getCanvasWidth", "setCanvasWidth", "crop", "Lcom/common/support/imagepicker/crop/entites/CropInfo;", "getCrop", "()Lcom/common/support/imagepicker/crop/entites/CropInfo;", "setCrop", "(Lcom/common/support/imagepicker/crop/entites/CropInfo;)V", "getItemWrapper", "()Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "originItem", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "getOriginItem", "()Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "setOriginItem", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;)V", "source", "getSource", "setSource", "videoCrop", "Lcom/common/support/imagepicker/crop/entites/VideoCropInfo;", "getVideoCrop", "()Lcom/common/support/imagepicker/crop/entites/VideoCropInfo;", "setVideoCrop", "(Lcom/common/support/imagepicker/crop/entites/VideoCropInfo;)V", "isEditable", "", "isEdited", "needCrop", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaEditSource {
    private int canvasHeight;
    private int canvasWidth;

    @Nullable
    private CropInfo crop;

    @NotNull
    private final AlbumItemWrapper itemWrapper;

    @NotNull
    private AlbumItem originItem;
    private int source;

    @Nullable
    private VideoCropInfo videoCrop;

    public MediaEditSource(@NotNull AlbumItemWrapper itemWrapper) {
        Intrinsics.checkNotNullParameter(itemWrapper, "itemWrapper");
        this.itemWrapper = itemWrapper;
        this.originItem = itemWrapper.getOriginItem();
        this.source = itemWrapper.getSource();
    }

    private final boolean needCrop(int width, int height) {
        CropInfo cropInfo = this.crop;
        if ((cropInfo != null ? cropInfo.getCropRatio() : null) == null) {
            return false;
        }
        CropInfo cropInfo2 = this.crop;
        CropRatioEntity cropRatio = cropInfo2 != null ? cropInfo2.getCropRatio() : null;
        Intrinsics.checkNotNull(cropRatio);
        return width <= 0 || height <= 0 || cropRatio.getWidth() * height != cropRatio.getHeight() * width;
    }

    public final int getCanvasHeight() {
        return this.canvasHeight;
    }

    public final int getCanvasWidth() {
        return this.canvasWidth;
    }

    @Nullable
    public final CropInfo getCrop() {
        return this.crop;
    }

    @NotNull
    public final AlbumItemWrapper getItemWrapper() {
        return this.itemWrapper;
    }

    @NotNull
    public final AlbumItem getOriginItem() {
        return this.originItem;
    }

    public final int getSource() {
        return this.source;
    }

    @Nullable
    public final VideoCropInfo getVideoCrop() {
        return this.videoCrop;
    }

    public final boolean isEditable() {
        return this.itemWrapper.isEditable();
    }

    public final boolean isEdited() {
        return needCrop(this.originItem.getWidth(), this.originItem.getHeight());
    }

    public final void setCanvasHeight(int i) {
        this.canvasHeight = i;
    }

    public final void setCanvasWidth(int i) {
        this.canvasWidth = i;
    }

    public final void setCrop(@Nullable CropInfo cropInfo) {
        this.crop = cropInfo;
    }

    public final void setOriginItem(@NotNull AlbumItem albumItem) {
        Intrinsics.checkNotNullParameter(albumItem, "<set-?>");
        this.originItem = albumItem;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setVideoCrop(@Nullable VideoCropInfo videoCropInfo) {
        this.videoCrop = videoCropInfo;
    }
}
