package com.common.support.imagepicker.crop.entites;

import android.graphics.Matrix;
import com.common.support.imagepicker.crop.widget.CropView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/common/support/imagepicker/crop/entites/CropInfo;", "", "()V", "cropRatio", "Lcom/common/support/imagepicker/crop/entites/CropRatioEntity;", "getCropRatio", "()Lcom/common/support/imagepicker/crop/entites/CropRatioEntity;", "setCropRatio", "(Lcom/common/support/imagepicker/crop/entites/CropRatioEntity;)V", "lockedRatio", "getLockedRatio", "setLockedRatio", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "restoreState", "Lcom/common/support/imagepicker/crop/widget/CropView$CropState;", "Lcom/common/support/imagepicker/crop/widget/CropView;", "getRestoreState", "()Lcom/common/support/imagepicker/crop/widget/CropView$CropState;", "setRestoreState", "(Lcom/common/support/imagepicker/crop/widget/CropView$CropState;)V", "toString", "", "crop_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CropInfo {

    @Nullable
    private CropRatioEntity cropRatio;

    @Nullable
    private CropRatioEntity lockedRatio;

    @NotNull
    private final Matrix matrix = new Matrix();

    @Nullable
    private CropView.CropState restoreState;

    @Nullable
    public final CropRatioEntity getCropRatio() {
        return this.cropRatio;
    }

    @Nullable
    public final CropRatioEntity getLockedRatio() {
        return this.lockedRatio;
    }

    @NotNull
    public final Matrix getMatrix() {
        return this.matrix;
    }

    @Nullable
    public final CropView.CropState getRestoreState() {
        return this.restoreState;
    }

    public final void setCropRatio(@Nullable CropRatioEntity cropRatioEntity) {
        this.cropRatio = cropRatioEntity;
    }

    public final void setLockedRatio(@Nullable CropRatioEntity cropRatioEntity) {
        this.lockedRatio = cropRatioEntity;
    }

    public final void setRestoreState(@Nullable CropView.CropState cropState) {
        this.restoreState = cropState;
    }

    @NotNull
    public String toString() {
        return "CropInfo(lockedRatio=" + this.lockedRatio + ", cropRatio=" + this.cropRatio + ", matrix=" + this.matrix + ", restoreState=" + this.restoreState + ")";
    }
}
