package com.common.support.imagepicker.mediaedit.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.common.support.imagepicker.crop.widget.BaseMediaCanvasLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/widget/MediaCanvasLayout;", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCanvasLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "mCanvasViewAttacher", "Lcom/common/support/imagepicker/mediaedit/widget/MediaCanvasLayoutAttacher;", "getViewAttacher", "resetViewAttacher", "", "setImage", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MediaCanvasLayout extends BaseMediaCanvasLayout {

    @Nullable
    private Bitmap bitmap;

    @NotNull
    private final MediaCanvasLayoutAttacher mCanvasViewAttacher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MediaCanvasLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getViewAttacher, reason: from getter */
    public final MediaCanvasLayoutAttacher getMCanvasViewAttacher() {
        return this.mCanvasViewAttacher;
    }

    @Override // com.common.support.imagepicker.crop.widget.BaseMediaCanvasLayout
    public void resetViewAttacher() {
        this.mCanvasViewAttacher.reset();
    }

    public final void setImage(@Nullable Bitmap bitmap) {
        resetMatrix();
        resetScaleArea();
        this.bitmap = bitmap;
        getImageView().setImageBitmap(bitmap);
        if (bitmap != null) {
            getImageView().getLayoutParams().width = bitmap.getWidth();
            getImageView().getLayoutParams().height = bitmap.getHeight();
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MediaCanvasLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaCanvasLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MediaCanvasLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCanvasViewAttacher = new MediaCanvasLayoutAttacher(this);
    }
}
