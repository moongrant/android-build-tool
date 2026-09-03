package com.common.support.imagepicker.dataprovider.config;

import android.content.Context;
import android.net.Uri;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J#\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/config/DataProvider;", "", SearchIntents.EXTRA_QUERY, "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumSource;", "context", "Landroid/content/Context;", "mode", "Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;", "allResourceName", "", "saveToAlbum", "Landroid/net/Uri;", "item", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "(Landroid/content/Context;Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DataProvider {
    @NotNull
    List<AlbumSource> query(@NotNull Context context, @NotNull AlbumQueryMode mode);

    @NotNull
    List<AlbumSource> query(@NotNull Context context, @NotNull AlbumQueryMode mode, @NotNull String allResourceName);

    @Nullable
    Object saveToAlbum(@NotNull Context context, @NotNull AlbumItem albumItem, @NotNull Continuation<? super Uri> continuation);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ List query$default(DataProvider dataProvider, Context context, AlbumQueryMode albumQueryMode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            if ((i & 2) != 0) {
                albumQueryMode = AlbumQueryMode.QUERY_ALL;
            }
            return dataProvider.query(context, albumQueryMode);
        }

        public static /* synthetic */ List query$default(DataProvider dataProvider, Context context, AlbumQueryMode albumQueryMode, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            if ((i & 2) != 0) {
                albumQueryMode = AlbumQueryMode.QUERY_ALL;
            }
            return dataProvider.query(context, albumQueryMode, str);
        }
    }
}
