package com.common.support.imagepicker.crop;

import android.content.Context;
import android.graphics.Matrix;
import com.common.support.imagepicker.base.ImagePicker;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.crop.YLCrop;
import com.common.support.imagepicker.crop.config.Crop;
import com.common.support.imagepicker.crop.config.CropConfig;
import com.common.support.imagepicker.crop.config.MediaCropListener;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.crop.entites.CropRatioEntity;
import com.common.support.imagepicker.crop.widget.BaseMediaCanvasLayout;
import com.common.support.imagepicker.crop.widget.BaseMediaCropLayout;
import com.common.support.imagepicker.crop.widget.CropView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/common/support/imagepicker/crop/YLCrop;", "Lcom/common/support/imagepicker/base/ImagePicker;", "Lcom/common/support/imagepicker/crop/config/Crop;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lockedRatio", "Lcom/common/support/imagepicker/crop/entites/CropRatioEntity;", "mCropInfo", "Lcom/common/support/imagepicker/crop/entites/CropInfo;", "mCropView", "Lcom/common/support/imagepicker/crop/widget/CropView;", "mEnableCrop", "", "mInitedInMediaEdit", "mMediaCanvasCrop", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCanvasLayout;", "mMediaCrop", "Lcom/common/support/imagepicker/crop/widget/BaseMediaCropLayout;", "applyCropRatio", "Landroid/graphics/Matrix;", "ratio", "cancel", "", "checkCropSupported", "checkInitedInMediaEdit", "confirm", "enableCrop", "enable", "enterCrop", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "exitCrop", "getMediaCrop", "selectRatioMode", "w", "h", "selectResetMode", "selectRotateMode", "setCropInfo", "cropInfo", "setCropListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/imagepicker/crop/config/MediaCropListener;", "setInitedInMediaEdit", "setupMediaCanvasAndCrop", "canvasLayout", "cropLayout", "Companion", "crop_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YLCrop extends ImagePicker implements Crop {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "YLCrop";

    @Nullable
    private static CropConfig mCropConfig;

    @NotNull
    private final Context context;

    @Nullable
    private CropRatioEntity lockedRatio;

    @Nullable
    private CropInfo mCropInfo;

    @Nullable
    private CropView mCropView;
    private boolean mEnableCrop;
    private boolean mInitedInMediaEdit;

    @Nullable
    private BaseMediaCanvasLayout mMediaCanvasCrop;

    @Nullable
    private BaseMediaCropLayout mMediaCrop;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/common/support/imagepicker/crop/YLCrop$Companion;", "", "()V", "TAG", "", "mCropConfig", "Lcom/common/support/imagepicker/crop/config/CropConfig;", "getMCropConfig", "()Lcom/common/support/imagepicker/crop/config/CropConfig;", "setMCropConfig", "(Lcom/common/support/imagepicker/crop/config/CropConfig;)V", "create", "Lcom/common/support/imagepicker/crop/config/Crop;", "context", "Landroid/content/Context;", "cropConfig", "crop_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Crop create$default(Companion companion, Context context, CropConfig cropConfig, int i, Object obj) {
            if ((i & 2) != 0) {
                cropConfig = null;
            }
            return companion.create(context, cropConfig);
        }

        @NotNull
        public final Crop create(@NotNull Context context, @Nullable CropConfig cropConfig) {
            Intrinsics.checkNotNullParameter(context, "context");
            setMCropConfig(cropConfig);
            return new YLCrop(context, null);
        }

        @Nullable
        public final CropConfig getMCropConfig() {
            return YLCrop.mCropConfig;
        }

        public final void setMCropConfig(@Nullable CropConfig cropConfig) {
            YLCrop.mCropConfig = cropConfig;
        }
    }

    public /* synthetic */ YLCrop(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 == r2.getWidth()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Matrix applyCropRatio(CropRatioEntity ratio) {
        CropRatioEntity cropRatioEntity = this.lockedRatio;
        if (cropRatioEntity != null) {
            if (!Intrinsics.areEqual(ratio, cropRatioEntity)) {
                int width = ratio.getWidth();
                CropRatioEntity cropRatioEntity2 = this.lockedRatio;
                Intrinsics.checkNotNull(cropRatioEntity2);
                if (width == cropRatioEntity2.getHeight()) {
                    int height = ratio.getHeight();
                    CropRatioEntity cropRatioEntity3 = this.lockedRatio;
                    Intrinsics.checkNotNull(cropRatioEntity3);
                }
            }
            return null;
        }
        CropView cropView = this.mCropView;
        if (cropView != null) {
            cropView.changeLockRatio(ratio.getWidth() / ratio.getHeight());
        }
        this.lockedRatio = ratio;
        CropView cropView2 = this.mCropView;
        if (cropView2 != null) {
            return cropView2.previewMatrix;
        }
        return null;
    }

    private final boolean checkCropSupported() {
        checkInitedInMediaEdit();
        if (this.mEnableCrop) {
            return true;
        }
        ImagePickerLogUtil.INSTANCE.w(TAG, "current media resource can't crop!");
        return false;
    }

    private final void checkInitedInMediaEdit() {
        if (!this.mInitedInMediaEdit) {
            throw new IllegalStateException("Please init Crop in MediaEdit Component");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enterCrop$lambda$1$lambda$0(YLCrop this$0, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectRatioMode(i, i2);
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void cancel() {
        MediaCropListener mCropListener;
        if (checkCropSupported()) {
            BaseMediaCropLayout baseMediaCropLayout = this.mMediaCrop;
            if (baseMediaCropLayout != null) {
                baseMediaCropLayout.hideCrop$crop_release();
            }
            BaseMediaCropLayout baseMediaCropLayout2 = this.mMediaCrop;
            if (baseMediaCropLayout2 == null || (mCropListener = baseMediaCropLayout2.getMCropListener()) == null) {
                return;
            }
            mCropListener.onCancelled();
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void confirm() {
        MediaCropListener mCropListener;
        if (checkCropSupported()) {
            CropView cropView = this.mCropView;
            if ((cropView == null || cropView.animating) ? false : true) {
                if ((cropView == null || cropView.touching) ? false : true) {
                    BaseMediaCropLayout baseMediaCropLayout = this.mMediaCrop;
                    if (baseMediaCropLayout != null) {
                        baseMediaCropLayout.hideCrop$crop_release();
                    }
                    BaseMediaCropLayout baseMediaCropLayout2 = this.mMediaCrop;
                    if (baseMediaCropLayout2 == null || (mCropListener = baseMediaCropLayout2.getMCropListener()) == null) {
                        return;
                    }
                    CropView cropView2 = this.mCropView;
                    mCropListener.onConfirmed(cropView2 != null ? cropView2.cropMatrix : null, cropView2 != null ? cropView2.state : null, cropView2 != null ? cropView2.getActualRect() : null, this.lockedRatio);
                }
            }
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void enableCrop(boolean enable) {
        checkInitedInMediaEdit();
        this.mEnableCrop = enable;
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void enterCrop(final int width, final int height) {
        BaseMediaCropLayout baseMediaCropLayout;
        if (checkCropSupported()) {
            BaseMediaCanvasLayout baseMediaCanvasLayout = this.mMediaCanvasCrop;
            Unit unit = null;
            if (baseMediaCanvasLayout != null && (baseMediaCropLayout = this.mMediaCrop) != null) {
                baseMediaCropLayout.showCrop$crop_release(baseMediaCanvasLayout, this.mCropInfo, new Runnable() { // from class: o00oO00O.o0Oo0oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        YLCrop.enterCrop$lambda$1$lambda$0(this.f39647OooO0Oo, width, height);
                    }
                });
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                throw new IllegalArgumentException("Please call [setupMediaCanvasCrop] first");
            }
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void exitCrop() {
        BaseMediaCropLayout baseMediaCropLayout;
        if (checkCropSupported() && (baseMediaCropLayout = this.mMediaCrop) != null) {
            baseMediaCropLayout.hideCrop$crop_release();
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    @Nullable
    public BaseMediaCropLayout getMediaCrop() {
        if (checkCropSupported()) {
            return this.mMediaCrop;
        }
        return null;
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    @Nullable
    public Matrix selectRatioMode(int w, int h) {
        if (checkCropSupported()) {
            return applyCropRatio(new CropRatioEntity(w, h));
        }
        return null;
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void selectResetMode() {
        if (checkCropSupported()) {
            CropView cropView = this.mCropView;
            if (cropView != null) {
                cropView.reset();
            }
            this.lockedRatio = null;
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    @Nullable
    public Matrix selectRotateMode() {
        if (!checkCropSupported()) {
            return null;
        }
        CropView cropView = this.mCropView;
        if (cropView != null) {
            cropView.rotate90Degrees();
        }
        CropRatioEntity cropRatioEntity = this.lockedRatio;
        if (cropRatioEntity != null) {
            Intrinsics.checkNotNull(cropRatioEntity);
            int height = cropRatioEntity.getHeight();
            CropRatioEntity cropRatioEntity2 = this.lockedRatio;
            Intrinsics.checkNotNull(cropRatioEntity2);
            this.lockedRatio = new CropRatioEntity(height, cropRatioEntity2.getWidth());
        }
        CropView cropView2 = this.mCropView;
        if (cropView2 != null) {
            return cropView2.previewMatrix;
        }
        return null;
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void setCropInfo(@Nullable CropInfo cropInfo) {
        if (checkCropSupported()) {
            this.mCropInfo = cropInfo;
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void setCropListener(@NotNull MediaCropListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BaseMediaCropLayout baseMediaCropLayout = this.mMediaCrop;
        if (baseMediaCropLayout != null) {
            baseMediaCropLayout.setCropListener$crop_release(listener);
        }
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void setInitedInMediaEdit() {
        this.mInitedInMediaEdit = true;
    }

    @Override // com.common.support.imagepicker.crop.config.Crop
    public void setupMediaCanvasAndCrop(@NotNull BaseMediaCanvasLayout canvasLayout, @NotNull BaseMediaCropLayout cropLayout) {
        Intrinsics.checkNotNullParameter(canvasLayout, "canvasLayout");
        Intrinsics.checkNotNullParameter(cropLayout, "cropLayout");
        if (checkCropSupported()) {
            this.mMediaCanvasCrop = canvasLayout;
            this.mMediaCrop = cropLayout;
            this.mCropView = cropLayout.getCropView$crop_release();
            cropLayout.setCrop$crop_release(this);
        }
    }

    private YLCrop(Context context) {
        this.context = context;
        this.mEnableCrop = true;
    }
}
