package com.common.support.imagepicker.preview.component.image.engine;

import android.widget.ImageView;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001H&J$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001H&J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001H&¨\u0006\f"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/engine/ImageEngine;", "", "loadGif", "", "imageView", "Landroid/widget/ImageView;", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "param", "loadImage", "loadResource", "loadVideo", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ImageEngine {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void loadGif$default(ImageEngine imageEngine, ImageView imageView, AlbumItem albumItem, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadGif");
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            imageEngine.loadGif(imageView, albumItem, obj);
        }

        public static /* synthetic */ void loadImage$default(ImageEngine imageEngine, ImageView imageView, AlbumItem albumItem, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            imageEngine.loadImage(imageView, albumItem, obj);
        }

        public static /* synthetic */ void loadResource$default(ImageEngine imageEngine, ImageView imageView, AlbumItem albumItem, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadResource");
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            imageEngine.loadResource(imageView, albumItem, obj);
        }

        public static /* synthetic */ void loadVideo$default(ImageEngine imageEngine, ImageView imageView, AlbumItem albumItem, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadVideo");
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            imageEngine.loadVideo(imageView, albumItem, obj);
        }
    }

    void loadGif(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param);

    void loadImage(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param);

    void loadResource(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param);

    void loadVideo(@NotNull ImageView imageView, @NotNull AlbumItem data, @Nullable Object param);
}
