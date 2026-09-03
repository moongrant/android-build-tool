package com.common.support.imagepicker.preview.adapter;

import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/common/support/imagepicker/preview/adapter/PreviewAdapterItemClickListener;", "", "onItemClick", "", "position", "", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "ext", "", "(ILcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;[Ljava/lang/Object;)V", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PreviewAdapterItemClickListener {
    void onItemClick(int position, @NotNull AlbumItemWrapper data, @NotNull Object... ext);
}
