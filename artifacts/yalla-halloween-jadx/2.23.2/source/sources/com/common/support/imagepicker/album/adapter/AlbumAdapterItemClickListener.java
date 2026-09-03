package com.common.support.imagepicker.album.adapter;

import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/common/support/imagepicker/album/adapter/AlbumAdapterItemClickListener;", "", "onMultiModeItemClick", "", "adapterPosition", "", "source", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "onSingleModeItemClick", "openCamera", "album_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AlbumAdapterItemClickListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onMultiModeItemClick(@NotNull AlbumAdapterItemClickListener albumAdapterItemClickListener, int i, @NotNull AlbumItemWrapper source) {
            Intrinsics.checkNotNullParameter(source, "source");
        }
    }

    void onMultiModeItemClick(int adapterPosition, @NotNull AlbumItemWrapper source);

    void onSingleModeItemClick(int adapterPosition, @NotNull AlbumItemWrapper source);

    void openCamera();
}
