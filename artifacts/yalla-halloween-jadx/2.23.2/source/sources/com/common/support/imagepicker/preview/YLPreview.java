package com.common.support.imagepicker.preview;

import android.content.Context;
import android.net.Uri;
import com.common.support.imagepicker.base.ImagePicker;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.preview.component.image.engine.ImageEngine;
import com.common.support.imagepicker.preview.component.image.engine.impl.GlideEngine;
import com.common.support.imagepicker.preview.component.video.engine.VideoEngine;
import com.common.support.imagepicker.preview.config.Preview;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/common/support/imagepicker/preview/YLPreview;", "Lcom/common/support/imagepicker/base/ImagePicker;", "Lcom/common/support/imagepicker/preview/config/Preview;", "context", "Landroid/content/Context;", "mSourceData", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "(Landroid/content/Context;Ljava/util/List;)V", "mImageEngine", "Lcom/common/support/imagepicker/preview/component/image/engine/ImageEngine;", "mVideoEngine", "Lcom/common/support/imagepicker/preview/component/video/engine/VideoEngine;", "getDataSource", "getImageEngine", "getSingleDataItem", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "getSingleDataSource", "getVideoEngine", "setImageEngine", "engine", "setVideoEngine", "Companion", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YLPreview extends ImagePicker implements Preview {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Context context;

    @Nullable
    private ImageEngine mImageEngine;

    @NotNull
    private final List<AlbumItemWrapper> mSourceData;

    @Nullable
    private VideoEngine mVideoEngine;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rJ\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\rJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/common/support/imagepicker/preview/YLPreview$Companion;", "", "()V", "create", "Lcom/common/support/imagepicker/preview/config/Preview;", "context", "Landroid/content/Context;", "url", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "itemType", "Lcom/common/support/imagepicker/dataprovider/config/AlbumItemType;", "data", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "createWithImageEngine", "engine", "Lcom/common/support/imagepicker/preview/component/image/engine/ImageEngine;", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Preview create$default(Companion companion, Context context, String str, int i, int i2, AlbumItemType albumItemType, int i3, Object obj) {
            int i4 = (i3 & 4) != 0 ? 0 : i;
            int i5 = (i3 & 8) != 0 ? 0 : i2;
            if ((i3 & 16) != 0) {
                albumItemType = AlbumItemType.IMAGE;
            }
            return companion.create(context, str, i4, i5, albumItemType);
        }

        public static /* synthetic */ Preview createWithImageEngine$default(Companion companion, Context context, List list, ImageEngine imageEngine, int i, Object obj) {
            if ((i & 4) != 0) {
                imageEngine = GlideEngine.INSTANCE;
            }
            return companion.createWithImageEngine(context, list, imageEngine);
        }

        @NotNull
        public final Preview create(@NotNull Context context, @NotNull List<AlbumItemWrapper> data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            return new YLPreview(context, data, null);
        }

        @NotNull
        public final Preview createWithImageEngine(@NotNull Context context, @NotNull List<AlbumItemWrapper> data, @NotNull ImageEngine engine) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(engine, "engine");
            Preview previewCreate = create(context, data);
            previewCreate.setImageEngine(engine);
            return previewCreate;
        }

        @NotNull
        public final Preview create(@NotNull Context context, @NotNull String url, int width, int height, @NotNull AlbumItemType itemType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            AlbumItem.Companion companion = AlbumItem.INSTANCE;
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(url)");
            return create(context, CollectionsKt.listOf(new AlbumItemWrapper(companion.createSimple(uri, 0L, width, height, "", itemType), null, 0, 6, null)));
        }

        public static /* synthetic */ Preview createWithImageEngine$default(Companion companion, Context context, String str, ImageEngine imageEngine, AlbumItemType albumItemType, int i, Object obj) {
            if ((i & 4) != 0) {
                imageEngine = GlideEngine.INSTANCE;
            }
            if ((i & 8) != 0) {
                albumItemType = AlbumItemType.IMAGE;
            }
            return companion.createWithImageEngine(context, str, imageEngine, albumItemType);
        }

        @NotNull
        public final Preview createWithImageEngine(@NotNull Context context, @NotNull String url, @NotNull ImageEngine engine, @NotNull AlbumItemType itemType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(engine, "engine");
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Preview previewCreate$default = create$default(this, context, url, 0, 0, itemType, 12, null);
            previewCreate$default.setImageEngine(engine);
            return previewCreate$default;
        }
    }

    public /* synthetic */ YLPreview(Context context, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list);
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public List<AlbumItemWrapper> getDataSource() {
        return this.mSourceData;
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public ImageEngine getImageEngine() {
        ImageEngine imageEngine = this.mImageEngine;
        if (imageEngine != null) {
            return imageEngine;
        }
        throw new NullPointerException("ImageEngine is null, Please call [setImageEngine] first.");
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public AlbumItem getSingleDataItem() {
        return this.mSourceData.get(0).getOriginItem();
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public AlbumItemWrapper getSingleDataSource() {
        return this.mSourceData.get(0);
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public VideoEngine getVideoEngine() {
        VideoEngine videoEngine = this.mVideoEngine;
        if (videoEngine != null) {
            return videoEngine;
        }
        throw new NullPointerException("VideoEngine is null, Please call [setVideoEngine] first.");
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public Preview setImageEngine(@NotNull ImageEngine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.mImageEngine = engine;
        return this;
    }

    @Override // com.common.support.imagepicker.preview.config.Preview
    @NotNull
    public Preview setVideoEngine(@NotNull VideoEngine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.mVideoEngine = engine;
        return this;
    }

    private YLPreview(Context context, List<AlbumItemWrapper> list) {
        this.context = context;
        this.mSourceData = list;
    }
}
