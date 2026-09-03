package com.common.support.imagepicker.preview.component.image.widget;

import android.graphics.Matrix;
import android.widget.ImageView;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.image.utils.PreviewVibrateUtil;

/* JADX INFO: loaded from: classes2.dex */
class PhotoViewAttacher extends BaseViewAttacher {
    private ImageView mImageView;

    public PhotoViewAttacher(ImageView imageView) {
        super(imageView);
        this.mImageView = imageView;
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public void applyMatrix(Matrix matrix) {
        this.mImageView.setImageMatrix(matrix);
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public int getContentHeight() {
        if (this.mImageView.getDrawable() != null) {
            return this.mImageView.getDrawable().getIntrinsicHeight();
        }
        return 0;
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public int getContentWidth() {
        if (this.mImageView.getDrawable() != null) {
            return this.mImageView.getDrawable().getIntrinsicWidth();
        }
        return 0;
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public void update() {
        if (getContentHeight() > getContentWidth() * 3) {
            setScaleType(ImageView.ScaleType.FIT_START);
        }
        super.update();
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public void vibrateByTouchUp() {
        PreviewVibrateUtil.quickVibrate(PreviewVibrateUtil.VibrateType.SELECTION_CHANGED);
    }
}
