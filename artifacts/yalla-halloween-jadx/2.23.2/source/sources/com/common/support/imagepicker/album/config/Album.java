package com.common.support.imagepicker.album.config;

import com.common.support.imagepicker.album.entities.AlbumConfig;
import com.common.support.imagepicker.base.config.Permission;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J$\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r`\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0016J'\u0010\u0011\u001a\u00020\u00122\u001d\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\rH&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H&J\u0016\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H&J:\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\u001fH&¨\u0006$"}, d2 = {"Lcom/common/support/imagepicker/album/config/Album;", "Lcom/common/support/imagepicker/base/config/Permission;", "getAlbumDataByBucketId", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumSource;", "getConfig", "Lcom/common/support/imagepicker/album/entities/AlbumConfig;", "getMultiSelectedCount", "", "id", "", "getMultiSelectedData", "Ljava/util/LinkedHashMap;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "Lkotlin/collections/LinkedHashMap;", "isMultiModeItemSelected", "", "loadData", "", "resultCallback", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "putOrRemoveMultiSelectData", "data", "setConfig", "config", "setInitMultiSelectedData", "list", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "setMediaCategoryName", "unknownCategoryName", "", "allMediaCategoryName", "allImageCategoryName", "allStaticImageCategoryName", "allVideoCategoryName", "album_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Album extends Permission<Album> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isMultiModeItemSelected(@NotNull Album album, long j) {
            return false;
        }
    }

    @NotNull
    List<AlbumSource> getAlbumDataByBucketId();

    @NotNull
    AlbumConfig getConfig();

    int getMultiSelectedCount(long id);

    @NotNull
    LinkedHashMap<Long, AlbumItemWrapper> getMultiSelectedData();

    boolean isMultiModeItemSelected(long id);

    void loadData(@NotNull Function1<? super List<AlbumSource>, Unit> resultCallback);

    void putOrRemoveMultiSelectData(@NotNull AlbumItemWrapper data);

    @NotNull
    Album setConfig(@NotNull AlbumConfig config);

    void setInitMultiSelectedData(@NotNull List<? extends AlbumItem> list);

    @NotNull
    Album setMediaCategoryName(@Nullable String unknownCategoryName, @Nullable String allMediaCategoryName, @Nullable String allImageCategoryName, @Nullable String allStaticImageCategoryName, @Nullable String allVideoCategoryName);
}
