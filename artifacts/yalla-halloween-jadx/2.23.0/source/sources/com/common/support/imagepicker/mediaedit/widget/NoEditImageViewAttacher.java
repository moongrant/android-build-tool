package com.common.support.imagepicker.mediaedit.widget;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/widget/NoEditImageViewAttacher;", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "imageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "applyMatrix", "", "matrix", "Landroid/graphics/Matrix;", "getContentHeight", "", "getContentWidth", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NoEditImageViewAttacher extends BaseViewAttacher {

    @NotNull
    private final ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoEditImageViewAttacher(@NotNull ImageView imageView) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.imageView = imageView;
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public void applyMatrix(@Nullable Matrix matrix) {
        this.imageView.setImageMatrix(matrix);
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public int getContentHeight() {
        Drawable drawable = this.imageView.getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
    public int getContentWidth() {
        Drawable drawable = this.imageView.getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }
}
