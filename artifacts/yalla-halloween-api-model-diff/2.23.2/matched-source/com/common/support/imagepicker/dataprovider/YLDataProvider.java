package com.common.support.imagepicker.dataprovider;

import android.content.Context;
import android.net.Uri;
import com.common.support.imagepicker.dataprovider.config.AlbumQueryMode;
import com.common.support.imagepicker.dataprovider.config.DataProvider;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.common.support.imagepicker.dataprovider.provider.MediaProvider;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J#\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/YLDataProvider;", "Lcom/common/support/imagepicker/dataprovider/config/DataProvider;", "()V", SearchIntents.EXTRA_QUERY, "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumSource;", "context", "Landroid/content/Context;", "mode", "Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;", "allResourceName", "", "saveToAlbum", "Landroid/net/Uri;", "item", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "(Landroid/content/Context;Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YLDataProvider implements DataProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlbumQueryMode.values().length];
            try {
                iArr[AlbumQueryMode.QUERY_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlbumQueryMode.QUERY_IMAGES_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlbumQueryMode.QUERY_STATIC_IMAGES_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlbumQueryMode.QUERY_VIDEO_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.common.support.imagepicker.dataprovider.config.DataProvider
    @NotNull
    public List<AlbumSource> query(@NotNull Context context, @NotNull AlbumQueryMode mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return MediaProvider.INSTANCE.query(context, mode);
    }

    @Override // com.common.support.imagepicker.dataprovider.config.DataProvider
    @Nullable
    public Object saveToAlbum(@NotNull Context context, @NotNull AlbumItem albumItem, @NotNull Continuation<? super Uri> continuation) {
        return MediaProvider.INSTANCE.saveToAlbum(context, albumItem, continuation);
    }

    @Override // com.common.support.imagepicker.dataprovider.config.DataProvider
    @NotNull
    public List<AlbumSource> query(@NotNull Context context, @NotNull AlbumQueryMode mode, @NotNull String allResourceName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(allResourceName, "allResourceName");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            AlbumQueryMode.INSTANCE.setAllMediaCategoryName$dataprovider_release(allResourceName);
        } else if (i == 2) {
            AlbumQueryMode.INSTANCE.setAllImageCategoryName$dataprovider_release(allResourceName);
        } else if (i == 3) {
            AlbumQueryMode.INSTANCE.setAllStaticImageCategoryName$dataprovider_release(allResourceName);
        } else if (i == 4) {
            AlbumQueryMode.INSTANCE.setAllVideoCategoryName$dataprovider_release(allResourceName);
        }
        return MediaProvider.INSTANCE.query(context, mode);
    }
}
