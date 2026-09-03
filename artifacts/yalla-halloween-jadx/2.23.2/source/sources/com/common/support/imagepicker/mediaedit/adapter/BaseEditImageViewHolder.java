package com.common.support.imagepicker.mediaedit.adapter;

import android.view.View;
import com.common.support.imagepicker.crop.config.Crop;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditImageViewHolder;", "Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditViewHolder;", "itemView", "Landroid/view/View;", "crop", "Lcom/common/support/imagepicker/crop/config/Crop;", "(Landroid/view/View;Lcom/common/support/imagepicker/crop/config/Crop;)V", "getCrop", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseEditImageViewHolder extends BaseEditViewHolder {

    @NotNull
    private final Crop crop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEditImageViewHolder(@NotNull View itemView, @NotNull Crop crop) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(crop, "crop");
        this.crop = crop;
    }

    @NotNull
    public final Crop getCrop() {
        return this.crop;
    }
}
