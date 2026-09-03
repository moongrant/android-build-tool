package com.common.support.imagepicker.crop.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.common.support.imagepicker.crop.config.Crop;
import com.common.support.imagepicker.crop.config.MediaCropListener;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u0012H\u0000¢\u0006\u0002\b J\b\u0010!\u001a\u00020\"H&J\r\u0010#\u001a\u00020\"H\u0000¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\"H\u0002J\u0015\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\nH\u0000¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010H\u0000¢\u0006\u0002\b+J\u0012\u0010,\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010.H&J'\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u000202H\u0000¢\u0006\u0002\b3R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/common/support/imagepicker/crop/widget/BaseMediaCropLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCrop", "Lcom/common/support/imagepicker/crop/config/Crop;", "getMCrop", "()Lcom/common/support/imagepicker/crop/config/Crop;", "setMCrop", "(Lcom/common/support/imagepicker/crop/config/Crop;)V", "mCropListener", "Lcom/common/support/imagepicker/crop/config/MediaCropListener;", "mCropView", "Lcom/common/support/imagepicker/crop/widget/CropView;", "getMCropView", "()Lcom/common/support/imagepicker/crop/widget/CropView;", "setMCropView", "(Lcom/common/support/imagepicker/crop/widget/CropView;)V", "mMediaCanvasCrop", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCanvasLayout;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "getCropListener", "getCropListener$crop_release", "getCropView", "getCropView$crop_release", "hide", "", "hideCrop", "hideCrop$crop_release", "init", "setCrop", "crop", "setCrop$crop_release", "setCropListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCropListener$crop_release", "show", "cropInfo", "Lcom/common/support/imagepicker/crop/entites/CropInfo;", "showCrop", "layout", "callBack", "Ljava/lang/Runnable;", "showCrop$crop_release", "crop_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseMediaCropLayout extends FrameLayout {

    @Nullable
    private Crop mCrop;

    @Nullable
    private MediaCropListener mCropListener;
    protected CropView mCropView;

    @Nullable
    private BaseMediaCanvasLayout mMediaCanvasCrop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMediaCropLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void init() {
        if (getChildCount() == 0 || !(getChildAt(0) instanceof CropView)) {
            setMCropView(new CropView(getContext()));
            addView(getMCropView(), 0);
        } else {
            View childAt = getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.common.support.imagepicker.crop.widget.CropView");
            setMCropView((CropView) childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(event);
    }

    @Nullable
    /* JADX INFO: renamed from: getCropListener$crop_release, reason: from getter */
    public final MediaCropListener getMCropListener() {
        return this.mCropListener;
    }

    @NotNull
    public final CropView getCropView$crop_release() {
        return getMCropView();
    }

    @Nullable
    public final Crop getMCrop() {
        return this.mCrop;
    }

    @NotNull
    public final CropView getMCropView() {
        CropView cropView = this.mCropView;
        if (cropView != null) {
            return cropView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCropView");
        return null;
    }

    public abstract void hide();

    public final void hideCrop$crop_release() {
        getMCropView().hide();
        getMCropView().onHide();
        BaseMediaCanvasLayout baseMediaCanvasLayout = this.mMediaCanvasCrop;
        if (baseMediaCanvasLayout != null) {
            baseMediaCanvasLayout.setCropPreviewMatrix(null);
        }
        this.mMediaCanvasCrop = null;
        hide();
    }

    public final void setCrop$crop_release(@NotNull Crop crop) {
        Intrinsics.checkNotNullParameter(crop, "crop");
        this.mCrop = crop;
    }

    public final void setCropListener$crop_release(@NotNull MediaCropListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mCropListener = listener;
    }

    public final void setMCrop(@Nullable Crop crop) {
        this.mCrop = crop;
    }

    public final void setMCropView(@NotNull CropView cropView) {
        Intrinsics.checkNotNullParameter(cropView, "<set-?>");
        this.mCropView = cropView;
    }

    public abstract void show(@Nullable CropInfo cropInfo);

    public final void showCrop$crop_release(@NotNull BaseMediaCanvasLayout layout, @Nullable CropInfo cropInfo, @NotNull Runnable callBack) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.mMediaCanvasCrop = layout;
        layout.resetScaleArea();
        layout.resetViewAttacher();
        getMCropView().setBitmap(layout, cropInfo, null, callBack);
        getMCropView().show();
        getMCropView().onShow();
        show(cropInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMediaCropLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseMediaCropLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMediaCropLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }
}
