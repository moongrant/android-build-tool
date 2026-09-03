package com.common.support.imagepicker.preview.adapter;

import android.view.View;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.image.config.PreviewView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/common/support/imagepicker/preview/adapter/BasePreviewImageViewHolder;", "Lcom/common/support/imagepicker/preview/adapter/BasePreviewViewHolder;", "previewView", "Lcom/common/support/imagepicker/preview/component/image/config/PreviewView;", "(Lcom/common/support/imagepicker/preview/component/image/config/PreviewView;)V", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BasePreviewImageViewHolder extends BasePreviewViewHolder {

    @NotNull
    private final PreviewView previewView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasePreviewImageViewHolder(@NotNull PreviewView previewView) {
        super((View) previewView);
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    @Override // com.common.support.imagepicker.preview.adapter.BasePreviewViewHolder
    @NotNull
    public BaseViewAttacher getViewAttacher() {
        return this.previewView.getViewAttacher();
    }
}
