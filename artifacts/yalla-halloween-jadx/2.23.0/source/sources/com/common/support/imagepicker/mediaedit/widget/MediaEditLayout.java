package com.common.support.imagepicker.mediaedit.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.crop.config.Crop;
import com.common.support.imagepicker.crop.config.MediaCropListener;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.crop.entites.CropRatioEntity;
import com.common.support.imagepicker.crop.widget.BaseMediaCanvasLayout;
import com.common.support.imagepicker.crop.widget.BaseMediaCropLayout;
import com.common.support.imagepicker.crop.widget.CropView;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.common.support.imagepicker.mediaedit.utils.OffScreenRender;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0012\u0018\u0000 =2\u00020\u0001:\u0001=B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\"\u001a\u00020#H\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014J[\u0010/\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001f26\u00100\u001a2\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020+012\f\u00105\u001a\b\u0012\u0004\u0012\u00020+06H\u0000¢\u0006\u0002\b7J\u0012\u00108\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010!H\u0002J\u0017\u0010:\u001a\u00020+2\b\u0010;\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b<R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/widget/MediaEditLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "canvasView", "Lcom/common/support/imagepicker/mediaedit/widget/MediaCanvasLayout;", "imageLoadTask", "Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$LoadTask;", "mCanvasViewAttacher", "Lcom/common/support/imagepicker/mediaedit/widget/MediaCanvasLayoutAttacher;", "mCrop", "Lcom/common/support/imagepicker/crop/config/Crop;", "mMediaCropListener", "com/common/support/imagepicker/mediaedit/widget/MediaEditLayout$mMediaCropListener$1", "Lcom/common/support/imagepicker/mediaedit/widget/MediaEditLayout$mMediaCropListener$1;", "mNoEditImageView", "Landroid/widget/ImageView;", "mNoEditImageViewAttacher", "Lcom/common/support/imagepicker/mediaedit/widget/NoEditImageViewAttacher;", "mOffScreenRender", "Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender;", "getMOffScreenRender", "()Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender;", "mOffScreenRender$delegate", "Lkotlin/Lazy;", "source", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "sourceBitmap", "Landroid/graphics/Bitmap;", "getMediaCanvasCropLayout", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCanvasLayout;", "getMediaCanvasCropLayout$mediaedit_release", "getMediaCropLayout", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCropLayout;", "getMediaCropLayout$mediaedit_release", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "initMediaCrop", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setEditSource", "noEditImageLoad", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "imageView", "imageCallBack", "Lkotlin/Function0;", "setEditSource$mediaedit_release", "setImage", "bitmap", "setupCrop", "crop", "setupCrop$mediaedit_release", "Companion", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MediaEditLayout extends FrameLayout {

    @NotNull
    private static final String TAG = "MediaEditLayout";

    @NotNull
    private final MediaCanvasLayout canvasView;

    @Nullable
    private OffScreenRender.LoadTask imageLoadTask;

    @NotNull
    private final MediaCanvasLayoutAttacher mCanvasViewAttacher;

    @Nullable
    private Crop mCrop;

    @NotNull
    private final MediaEditLayout$mMediaCropListener$1 mMediaCropListener;

    @NotNull
    private final ImageView mNoEditImageView;

    @NotNull
    private final NoEditImageViewAttacher mNoEditImageViewAttacher;

    /* JADX INFO: renamed from: mOffScreenRender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mOffScreenRender;

    @Nullable
    private MediaEditSource source;

    @Nullable
    private Bitmap sourceBitmap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MediaEditLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final OffScreenRender getMOffScreenRender() {
        return (OffScreenRender) this.mOffScreenRender.getValue();
    }

    private final void initMediaCrop() {
        Crop crop = this.mCrop;
        if (crop != null) {
            crop.setCropListener(this.mMediaCropListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImage(Bitmap bitmap) {
        this.canvasView.setImage(bitmap);
    }

    @NotNull
    public final BaseMediaCanvasLayout getMediaCanvasCropLayout$mediaedit_release() {
        return this.canvasView;
    }

    @NotNull
    public final BaseMediaCropLayout getMediaCropLayout$mediaedit_release() {
        if (getChildCount() != 3 || !(getChildAt(getChildCount() - 1) instanceof BaseMediaCropLayout)) {
            throw new IllegalArgumentException("MediaEditLayout requires only one view implementation of the BaseMediaCropLayout");
        }
        View childAt = getChildAt(getChildCount() - 1);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.common.support.imagepicker.crop.widget.BaseMediaCropLayout");
        return (BaseMediaCropLayout) childAt;
    }

    @NotNull
    public final BaseViewAttacher getViewAttacher() {
        MediaEditSource mediaEditSource = this.source;
        boolean z = false;
        if (mediaEditSource != null && mediaEditSource.isEditable()) {
            z = true;
        }
        return z ? this.mCanvasViewAttacher : this.mNoEditImageViewAttacher;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        MediaEditSource mediaEditSource = this.source;
        if (mediaEditSource != null) {
            mediaEditSource.setCanvasWidth(this.canvasView.getMeasuredWidth());
            mediaEditSource.setCanvasHeight(this.canvasView.getMeasuredHeight());
        }
    }

    public final void setEditSource$mediaedit_release(@NotNull MediaEditSource source, @NotNull Function2<? super ImageView, ? super MediaEditSource, Unit> noEditImageLoad, @NotNull final Function0<Unit> imageCallBack) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(noEditImageLoad, "noEditImageLoad");
        Intrinsics.checkNotNullParameter(imageCallBack, "imageCallBack");
        if (Intrinsics.areEqual(this.source, source)) {
            return;
        }
        this.source = source;
        Bitmap bitmap = this.sourceBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.sourceBitmap = null;
        this.mNoEditImageViewAttacher.reset();
        this.mCanvasViewAttacher.reset();
        if (!source.isEditable()) {
            this.mNoEditImageView.setVisibility(0);
            noEditImageLoad.invoke(this.mNoEditImageView, source);
            this.canvasView.setVisibility(8);
        } else {
            this.mNoEditImageView.setVisibility(8);
            this.mNoEditImageView.setImageBitmap(null);
            this.canvasView.setVisibility(0);
            this.imageLoadTask = getMOffScreenRender().decodeBitmap(source.getOriginItem(), new OffScreenRender.Callback() { // from class: com.common.support.imagepicker.mediaedit.widget.MediaEditLayout$setEditSource$1
                @Override // com.common.support.imagepicker.mediaedit.utils.OffScreenRender.Callback
                public void onBitmap(@Nullable Bitmap bitmap2) {
                    StringBuilder sb = new StringBuilder("bitmap loaded, w=");
                    sb.append(bitmap2 != null ? Integer.valueOf(bitmap2.getWidth()) : null);
                    sb.append(", h=");
                    sb.append(bitmap2 != null ? Integer.valueOf(bitmap2.getHeight()) : null);
                    ImagePickerLogUtil.d("MediaEditLayout", sb.toString());
                    this.this$0.imageLoadTask = null;
                    this.this$0.sourceBitmap = bitmap2;
                    MediaEditLayout mediaEditLayout = this.this$0;
                    mediaEditLayout.setImage(mediaEditLayout.sourceBitmap);
                    imageCallBack.invoke();
                }
            });
            this.canvasView.setCropInfo(source.getCrop());
        }
    }

    public final void setupCrop$mediaedit_release(@Nullable Crop crop) {
        this.mCrop = crop;
        initMediaCrop();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MediaEditLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaEditLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.common.support.imagepicker.mediaedit.widget.MediaEditLayout$mMediaCropListener$1] */
    @JvmOverloads
    public MediaEditLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mOffScreenRender = LazyKt.lazy(new Function0<OffScreenRender>() { // from class: com.common.support.imagepicker.mediaedit.widget.MediaEditLayout$mOffScreenRender$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final OffScreenRender invoke() {
                return new OffScreenRender();
            }
        });
        setClipChildren(false);
        NoEditImageView noEditImageView = new NoEditImageView(context, null, 0, 6, null);
        this.mNoEditImageViewAttacher = noEditImageView.getAttacher();
        addView(noEditImageView);
        this.mNoEditImageView = noEditImageView;
        MediaCanvasLayout mediaCanvasLayout = new MediaCanvasLayout(context, null, 0, 6, null);
        this.mCanvasViewAttacher = mediaCanvasLayout.getMCanvasViewAttacher();
        addView(mediaCanvasLayout, new FrameLayout.LayoutParams(-1, -1));
        this.canvasView = mediaCanvasLayout;
        this.mMediaCropListener = new MediaCropListener() { // from class: com.common.support.imagepicker.mediaedit.widget.MediaEditLayout$mMediaCropListener$1
            @Override // com.common.support.imagepicker.crop.config.MediaCropListener
            public void onCancelled() {
                MediaCanvasLayout mediaCanvasLayout2 = this.this$0.canvasView;
                MediaEditSource mediaEditSource = this.this$0.source;
                mediaCanvasLayout2.setCropInfo(mediaEditSource != null ? mediaEditSource.getCrop() : null);
            }

            @Override // com.common.support.imagepicker.crop.config.MediaCropListener
            public void onConfirmed(@Nullable Matrix cropMatrix, @Nullable CropView.CropState state, @Nullable RectF actualRect, @Nullable CropRatioEntity lockedRatio) {
                CropInfo crop;
                MediaEditSource mediaEditSource;
                MediaEditSource mediaEditSource2 = this.this$0.source;
                if ((mediaEditSource2 != null ? mediaEditSource2.getCrop() : null) == null && (mediaEditSource = this.this$0.source) != null) {
                    mediaEditSource.setCrop(new CropInfo());
                }
                MediaEditSource mediaEditSource3 = this.this$0.source;
                if (mediaEditSource3 != null && (crop = mediaEditSource3.getCrop()) != null) {
                    crop.getMatrix().set(cropMatrix);
                    crop.setRestoreState(state);
                    if (actualRect != null) {
                        crop.setCropRatio(new CropRatioEntity((int) actualRect.width(), (int) actualRect.height()));
                    }
                    crop.setLockedRatio(lockedRatio);
                }
                MediaCanvasLayout mediaCanvasLayout2 = this.this$0.canvasView;
                MediaEditSource mediaEditSource4 = this.this$0.source;
                mediaCanvasLayout2.setCropInfo(mediaEditSource4 != null ? mediaEditSource4.getCrop() : null);
            }
        };
    }
}
