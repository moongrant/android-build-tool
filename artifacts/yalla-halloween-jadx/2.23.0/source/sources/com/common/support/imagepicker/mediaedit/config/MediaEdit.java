package com.common.support.imagepicker.mediaedit.config;

import android.net.Uri;
import android.widget.ImageView;
import com.common.support.imagepicker.crop.config.Crop;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.common.support.imagepicker.mediaedit.widget.MediaEditLayout;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.config.Preview;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\b\u0002\u0010\u0007\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\b\nH&J\u001c\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJf\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001026\u0010#\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00030$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*H&J@\u0010+\u001a\u00020\u000326\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00030$H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;", "", "beginHandleMedia", "", "mediaList", "", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "onResult", "Lkotlin/Function1;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "Lkotlin/ExtensionFunctionType;", "enterCrop", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getCrop", "Lcom/common/support/imagepicker/crop/config/Crop;", "getEditSource", "getPreview", "Lcom/common/support/imagepicker/preview/config/Preview;", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "saveToAlbum", "Landroid/net/Uri;", "item", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDataSource", "mediaEdit", "Lcom/common/support/imagepicker/mediaedit/widget/MediaEditLayout;", "source", "crop", "noEditImageLoad", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "imageCallBack", "Lkotlin/Function0;", "startCrop", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "editUri", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MediaEdit {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void beginHandleMedia$default(MediaEdit mediaEdit, List list, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginHandleMedia");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            mediaEdit.beginHandleMedia(list, function1);
        }

        public static /* synthetic */ void enterCrop$default(MediaEdit mediaEdit, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterCrop");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 1;
            }
            mediaEdit.enterCrop(i, i2);
        }
    }

    void beginHandleMedia(@NotNull List<MediaEditSource> mediaList, @Nullable Function1<? super List<AlbumItemWrapper>, Unit> onResult);

    void enterCrop(int width, int height);

    @NotNull
    Crop getCrop();

    @NotNull
    MediaEditSource getEditSource();

    @NotNull
    Preview getPreview();

    @NotNull
    BaseViewAttacher getViewAttacher();

    @Nullable
    Object saveToAlbum(@Nullable AlbumItem albumItem, @NotNull Continuation<? super Uri> continuation);

    @Nullable
    Object saveToAlbum(@Nullable List<AlbumItemWrapper> list, @NotNull Continuation<? super List<Uri>> continuation);

    void setDataSource(@NotNull MediaEditLayout mediaEdit, @NotNull MediaEditSource source, @NotNull Crop crop, @NotNull Function2<? super ImageView, ? super MediaEditSource, Unit> noEditImageLoad, @NotNull Function0<Unit> imageCallBack);

    void startCrop(@NotNull Function2<? super Uri, ? super Uri, Unit> onResult);
}
