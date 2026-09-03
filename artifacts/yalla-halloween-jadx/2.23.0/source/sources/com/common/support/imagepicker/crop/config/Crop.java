package com.common.support.imagepicker.crop.config;

import android.graphics.Matrix;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.crop.widget.BaseMediaCanvasLayout;
import com.common.support.imagepicker.crop.widget.BaseMediaCropLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0003H&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH&¨\u0006 "}, d2 = {"Lcom/common/support/imagepicker/crop/config/Crop;", "", "cancel", "", "confirm", "enableCrop", "enable", "", "enterCrop", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "exitCrop", "getMediaCrop", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCropLayout;", "selectRatioMode", "Landroid/graphics/Matrix;", "w", "h", "selectResetMode", "selectRotateMode", "setCropInfo", "cropInfo", "Lcom/common/support/imagepicker/crop/entites/CropInfo;", "setCropListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/imagepicker/crop/config/MediaCropListener;", "setInitedInMediaEdit", "setupMediaCanvasAndCrop", "canvasLayout", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCanvasLayout;", "cropLayout", "crop_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Crop {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Matrix selectRatioMode(@NotNull Crop crop, int i, int i2) {
            return null;
        }

        public static void selectResetMode(@NotNull Crop crop) {
        }

        @Nullable
        public static Matrix selectRotateMode(@NotNull Crop crop) {
            return null;
        }
    }

    void cancel();

    void confirm();

    void enableCrop(boolean enable);

    void enterCrop(int width, int height);

    void exitCrop();

    @Nullable
    BaseMediaCropLayout getMediaCrop();

    @Nullable
    Matrix selectRatioMode(int w, int h);

    void selectResetMode();

    @Nullable
    Matrix selectRotateMode();

    void setCropInfo(@Nullable CropInfo cropInfo);

    void setCropListener(@NotNull MediaCropListener listener);

    void setInitedInMediaEdit();

    void setupMediaCanvasAndCrop(@NotNull BaseMediaCanvasLayout canvasLayout, @NotNull BaseMediaCropLayout cropLayout);
}
