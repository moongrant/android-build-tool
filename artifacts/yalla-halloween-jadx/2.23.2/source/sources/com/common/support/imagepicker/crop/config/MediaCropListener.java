package com.common.support.imagepicker.crop.config;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.common.support.imagepicker.crop.entites.CropRatioEntity;
import com.common.support.imagepicker.crop.widget.CropView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J4\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, d2 = {"Lcom/common/support/imagepicker/crop/config/MediaCropListener;", "", "onCancelled", "", "onConfirmed", "cropMatrix", "Landroid/graphics/Matrix;", "state", "Lcom/common/support/imagepicker/crop/widget/CropView$CropState;", "Lcom/common/support/imagepicker/crop/widget/CropView;", "actualRect", "Landroid/graphics/RectF;", "lockedRatio", "Lcom/common/support/imagepicker/crop/entites/CropRatioEntity;", "crop_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MediaCropListener {
    void onCancelled();

    void onConfirmed(@Nullable Matrix cropMatrix, @Nullable CropView.CropState state, @Nullable RectF actualRect, @Nullable CropRatioEntity lockedRatio);
}
