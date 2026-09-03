package com.common.support.imagepicker.mediaedit.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOOO;
import com.common.support.imagepicker.base.utils.ImagePickerContextUtil;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.mediaedit.widget.MediaCanvasLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.o0OOO0OO;
import p170o00Ooo0o.o000oOoO;
import p174o00OooOo.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0003\u0011\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender;", "", "()V", "renderThread", "Lcom/common/support/imagepicker/mediaedit/utils/DispatchQueue;", "uiHandler", "Landroid/os/Handler;", "cancelRunnable", "", "task", "Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$LoadTask;", "close", "decodeBitmap", "image", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "callback", "Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$Callback;", "Callback", "Companion", "LoadTask", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OffScreenRender {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "OffScreenRender";

    @NotNull
    private final DispatchQueue renderThread = new DispatchQueue(TAG, false, 2, null);

    @NotNull
    private final Handler uiHandler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$Callback;", "", "onBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void onBitmap(@Nullable Bitmap bitmap);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001c\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$Companion;", "", "()V", "TAG", "", "decodeBitmapSync", "Landroid/graphics/Bitmap;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getCropBitmap", "sourceBitmap", "cropInfo", "Lcom/common/support/imagepicker/crop/entites/CropInfo;", "getSourceBitmap", "source", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Bitmap decodeBitmapSync$default(Companion companion, Uri uri, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 1280;
            }
            if ((i3 & 4) != 0) {
                i2 = 1280;
            }
            return companion.decodeBitmapSync(uri, i, i2);
        }

        @Nullable
        public final Bitmap decodeBitmapSync(@NotNull Uri uri, int width, int height) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            try {
                OooOOOO oooOOOOOooO0o = OooO0OO.OooO0oo(ImagePickerContextUtil.INSTANCE.getSAppContext()).OooO0oO().o000oOoO(uri).OooOo0O(width, height).OooO0o();
                oooOOOOOooO0o.getClass();
                o000oOoO o000oooo2 = new o000oOoO();
                oooOOOOOooO0o.OoooO(o000oooo2, o000oooo2, oooOOOOOooO0o, o00O0OO0.f38345OooO0O0);
                Bitmap bitmap = (Bitmap) o000oooo2.get();
                ImagePickerLogUtil.d(OffScreenRender.TAG, "decodeBitmapSync: " + bitmap.getWidth() + ", " + bitmap.getHeight());
                return Bitmap.createBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
                ImagePickerLogUtil.d(OffScreenRender.TAG, "decodeBitmapSync, exception=" + Unit.INSTANCE);
                return null;
            }
        }

        @Nullable
        public final Bitmap getCropBitmap(@Nullable Bitmap sourceBitmap, @Nullable CropInfo cropInfo) {
            if (sourceBitmap == null) {
                return null;
            }
            MediaCanvasLayout mediaCanvasLayout = new MediaCanvasLayout(ImagePickerContextUtil.INSTANCE.getSAppContext(), null, 0, 6, null);
            mediaCanvasLayout.setImage(sourceBitmap);
            mediaCanvasLayout.setCropInfo(cropInfo);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            ImagePickerLogUtil.d(OffScreenRender.TAG, "OffScreenRender: canvas size = " + width + ", " + height);
            mediaCanvasLayout.measure(View.MeasureSpec.makeMeasureSpec(width, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(height, Pow2.MAX_POW2));
            mediaCanvasLayout.layout(0, 0, width, height);
            RectF canvasArea = mediaCanvasLayout.getCanvasArea();
            int iWidth = (int) canvasArea.width();
            int iHeight = (int) canvasArea.height();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Matrix matrix = new Matrix();
            matrix.postTranslate(canvasArea.centerX() - (iWidth / 2), canvasArea.centerY() - (iHeight / 2));
            matrix.invert(matrix);
            canvas.setMatrix(matrix);
            mediaCanvasLayout.draw(canvas);
            sourceBitmap.recycle();
            return bitmapCreateBitmap;
        }

        @Nullable
        public final Bitmap getSourceBitmap(@NotNull AlbumItemWrapper source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return (source.getOriginItem().getWidth() <= 0 || source.getOriginItem().getHeight() <= 0 || source.getOriginItem().getHeight() <= source.getOriginItem().getWidth() * 3) ? decodeBitmapSync$default(this, source.getOriginItem().getContentUri(), 0, 0, 6, null) : decodeBitmapSync(source.getOriginItem().getContentUri(), 1280, 3840);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$LoadTask;", "Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$Callback;", "offScreenRender", "Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender;", "callback", "(Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender;Lcom/common/support/imagepicker/mediaedit/utils/OffScreenRender$Callback;)V", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "cancel", "", "onBitmap", "bitmap", "Landroid/graphics/Bitmap;", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LoadTask implements Callback {

        @Nullable
        private final Callback callback;
        private boolean cancelled;

        @NotNull
        private final OffScreenRender offScreenRender;

        @Nullable
        private Runnable runnable;

        public LoadTask(@NotNull OffScreenRender offScreenRender, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(offScreenRender, "offScreenRender");
            this.offScreenRender = offScreenRender;
            this.callback = callback;
        }

        public final void cancel() {
            this.cancelled = true;
            this.offScreenRender.cancelRunnable(this);
        }

        @Nullable
        public final Runnable getRunnable() {
            return this.runnable;
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.OffScreenRender.Callback
        public void onBitmap(@Nullable Bitmap bitmap) {
            Callback callback;
            if (this.cancelled || (callback = this.callback) == null) {
                return;
            }
            callback.onBitmap(bitmap);
        }

        public final void setRunnable(@Nullable Runnable runnable) {
            this.runnable = runnable;
        }
    }

    public OffScreenRender() {
        ImagePickerLogUtil.d(TAG, "init=" + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decodeBitmap$lambda$1(AlbumItem image, int i, Ref.IntRef targetHeight, OffScreenRender this$0, LoadTask task) {
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(targetHeight, "$targetHeight");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "$task");
        this$0.uiHandler.post(new o0OOO0OO(1, task, INSTANCE.decodeBitmapSync(image.getContentUri(), i, targetHeight.element)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decodeBitmap$lambda$1$lambda$0(LoadTask task, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(task, "$task");
        task.onBitmap(bitmap);
    }

    public final void cancelRunnable(@NotNull LoadTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.renderThread.cancelRunnable(task.getRunnable());
    }

    public final void close() {
        ImagePickerLogUtil.d(TAG, "close: " + this);
        this.renderThread.cleanupQueue();
        this.renderThread.recycle();
    }

    @NotNull
    public final LoadTask decodeBitmap(@NotNull final AlbumItem image, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(image, "image");
        final LoadTask loadTask = new LoadTask(this, callback);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1280;
        if (image.getWidth() > 0 && image.getHeight() > 0 && image.getHeight() > image.getWidth() * 3) {
            intRef.element = 3840;
        }
        loadTask.setRunnable(new Runnable() { // from class: com.common.support.imagepicker.mediaedit.utils.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                OffScreenRender.decodeBitmap$lambda$1(image, 1280, intRef, this, loadTask);
            }
        });
        this.renderThread.postRunnable(loadTask.getRunnable());
        return loadTask;
    }
}
