package com.common.support.imagepicker.preview.component.image.engine.impl;

import android.widget.ImageView;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.preview.component.image.engine.ImageEngine;
import com.common.support.imagepicker.preview.component.image.entities.ImageParamEntity;
import com.common.support.imagepicker.preview.component.image.utils.GlideExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/engine/impl/GlideEngine;", "Lcom/common/support/imagepicker/preview/component/image/engine/ImageEngine;", "()V", "loadGif", "", "imageView", "Landroid/widget/ImageView;", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "param", "", "loadImage", "loadResource", "loadVideo", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlideEngine implements ImageEngine {

    @NotNull
    public static final GlideEngine INSTANCE = new GlideEngine();

    private GlideEngine() {
    }

    @Override // com.common.support.imagepicker.preview.component.image.engine.ImageEngine
    public void loadGif(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageParamEntity imageParamEntity = (ImageParamEntity) param;
        GlideExtensionsKt.loadGif(imageView, data.getContentUri(), imageParamEntity != null ? imageParamEntity.getError() : null, imageParamEntity != null ? imageParamEntity.getPlaceHolder() : null, imageParamEntity != null ? imageParamEntity.getRadius() : 0, data.getWidth(), data.getHeight());
    }

    @Override // com.common.support.imagepicker.preview.component.image.engine.ImageEngine
    public void loadImage(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageParamEntity imageParamEntity = (ImageParamEntity) param;
        GlideExtensionsKt.loadImg(imageView, data.getContentUri(), imageParamEntity != null ? imageParamEntity.getError() : null, imageParamEntity != null ? imageParamEntity.getPlaceHolder() : null, imageParamEntity != null ? imageParamEntity.getRadius() : 0, data.getWidth(), data.getHeight());
    }

    @Override // com.common.support.imagepicker.preview.component.image.engine.ImageEngine
    public void loadResource(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isVideo()) {
            loadVideo(imageView, data, param);
        } else if (data.isGif()) {
            loadGif(imageView, data, param);
        } else {
            loadImage(imageView, data, param);
        }
    }

    @Override // com.common.support.imagepicker.preview.component.image.engine.ImageEngine
    public void loadVideo(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageParamEntity imageParamEntity = (ImageParamEntity) param;
        GlideExtensionsKt.loadVideo(imageView, data.getContentUri(), imageParamEntity != null ? imageParamEntity.getError() : null, imageParamEntity != null ? imageParamEntity.getPlaceHolder() : null, imageParamEntity != null ? imageParamEntity.getRadius() : 0, data.getWidth(), data.getHeight(), imageParamEntity != null ? imageParamEntity.getFrame() : 0L);
    }
}
