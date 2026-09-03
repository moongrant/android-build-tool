package com.common.support.imagepicker.preview.config;

import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.preview.component.image.engine.ImageEngine;
import com.common.support.imagepicker.preview.component.video.engine.VideoEngine;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/common/support/imagepicker/preview/config/Preview;", "", "getDataSource", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "getImageEngine", "Lcom/common/support/imagepicker/preview/component/image/engine/ImageEngine;", "getSingleDataItem", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "getSingleDataSource", "getVideoEngine", "Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "setImageEngine", "engine", "setVideoEngine", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Preview {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static AlbumItem getSingleDataItem(@NotNull Preview preview) {
            throw new UnsupportedOperationException("Please implementation it first.");
        }

        @NotNull
        public static AlbumItemWrapper getSingleDataSource(@NotNull Preview preview) {
            throw new UnsupportedOperationException("Please implementation it first.");
        }
    }

    @NotNull
    List<AlbumItemWrapper> getDataSource();

    @NotNull
    ImageEngine getImageEngine();

    @NotNull
    AlbumItem getSingleDataItem();

    @NotNull
    AlbumItemWrapper getSingleDataSource();

    @NotNull
    VideoEngine getVideoEngine();

    @NotNull
    Preview setImageEngine(@NotNull ImageEngine engine);

    @NotNull
    Preview setVideoEngine(@NotNull VideoEngine engine);
}
