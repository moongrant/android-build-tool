package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/PhotoView;", "Landroid/view/View;", "", "currentScale", "", "setCurrentScale", "Landroid/graphics/Bitmap;", "getBitmap", "bitmap", "setBitmap", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ObjectAnimatorBinding"})
@RequiresApi(19)
public class PhotoView extends View {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f29985OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f29986OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Paint f29987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final GestureDetector f29988OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Bitmap f29989OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f29990OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f29991OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f29992OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f29993OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ScaleGestureDetector f29994OooOO0o;

    public final class OooO00o extends GestureDetector.SimpleOnGestureListener {
        public OooO00o() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
        public final boolean onContextClick(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return super.onContextClick(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return super.onDoubleTap(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return super.onDoubleTapEvent(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            return super.onFling(motionEvent, e2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            super.onLongPress(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            int i = PhotoView.f29985OooOOO0;
            PhotoView photoView = PhotoView.this;
            photoView.getClass();
            photoView.f29992OooOO0 -= f;
            photoView.f29993OooOO0O -= f2;
            PhotoView.OooO00o(photoView);
            photoView.invalidate();
            return super.onScroll(motionEvent, e2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onShowPress(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            super.onShowPress(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return super.onSingleTapConfirmed(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return super.onSingleTapUp(e);
        }
    }

    public final class OooO0O0 implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f29996OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f29997OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f29998OooO0OO;

        public OooO0O0() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            float scaleFactor = detector.getScaleFactor() * this.f29996OooO00o;
            PhotoView photoView = PhotoView.this;
            float fMax = Math.max(Math.min(scaleFactor, photoView.f29990OooO0oO), photoView.f29991OooO0oo) / this.f29996OooO00o;
            photoView.f29992OooOO0 = detector.getFocusX() - ((detector.getFocusX() - this.f29997OooO0O0) * fMax);
            photoView.f29993OooOO0O = detector.getFocusY() - ((detector.getFocusY() - this.f29998OooO0OO) * fMax);
            photoView.f29986OooO = fMax * this.f29996OooO00o;
            PhotoView.OooO00o(photoView);
            photoView.invalidate();
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            PhotoView photoView = PhotoView.this;
            this.f29996OooO00o = photoView.f29986OooO;
            this.f29997OooO0O0 = photoView.f29992OooOO0;
            this.f29998OooO0OO = photoView.f29993OooOO0O;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
        }
    }

    public PhotoView(@Nullable Context context) {
        super(context);
        Paint paint = new Paint();
        this.f29987OooO0Oo = paint;
        this.f29990OooO0oO = 1.0f;
        this.f29991OooO0oo = 1.0f;
        this.f29986OooO = 1.0f;
        paint.setFlags(1);
        new OverScroller(getContext());
        this.f29988OooO0o = new GestureDetector(getContext(), new OooO00o());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new OooO0O0());
        this.f29994OooOO0o = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public static final void OooO00o(PhotoView photoView) {
        Bitmap bitmap = photoView.f29989OooO0o0;
        if (bitmap != null) {
            float fMin = Math.min(photoView.f29992OooOO0, 0.0f);
            photoView.f29992OooOO0 = fMin;
            photoView.f29992OooOO0 = Math.max(fMin, photoView.getWidth() - (bitmap.getWidth() * photoView.f29986OooO));
            float fMax = Math.max(photoView.f29993OooOO0O, photoView.getHeight() - (bitmap.getHeight() * photoView.f29986OooO));
            photoView.f29993OooOO0O = fMax;
            photoView.f29993OooOO0O = Math.min(fMax, 0.0f);
        }
    }

    private final void setCurrentScale(float currentScale) {
        this.f29986OooO = currentScale;
        invalidate();
    }

    @Nullable
    /* JADX INFO: renamed from: getBitmap, reason: from getter */
    public final Bitmap getF29989OooO0o0() {
        return this.f29989OooO0o0;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f29989OooO0o0;
        if (bitmap != null) {
            float f = this.f29986OooO;
            canvas.scale(f, f, this.f29992OooOO0, this.f29993OooOO0O);
            canvas.drawBitmap(bitmap, this.f29992OooOO0, this.f29993OooOO0O, this.f29987OooO0Oo);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Bitmap bitmap = this.f29989OooO0o0;
        if (bitmap != null) {
            this.f29991OooO0oo = RangesKt.coerceAtLeast(getWidth() / bitmap.getWidth(), getHeight() / bitmap.getHeight());
            this.f29990OooO0oO = (bitmap.getWidth() <= getWidth() || bitmap.getHeight() <= getHeight()) ? this.f29991OooO0oo * 2 : 2.0f;
            this.f29992OooOO0 = (-((bitmap.getWidth() * this.f29991OooO0oo) - getWidth())) / 2.0f;
            this.f29993OooOO0O = (-((bitmap.getHeight() * this.f29991OooO0oo) - getHeight())) / 2.0f;
            this.f29986OooO = this.f29991OooO0oo;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ScaleGestureDetector scaleGestureDetector = this.f29994OooOO0o;
        return !scaleGestureDetector.isInProgress() ? this.f29988OooO0o.onTouchEvent(event) : scaleGestureDetector.onTouchEvent(event);
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f29989OooO0o0 = bitmap;
    }

    public PhotoView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f29987OooO0Oo = paint;
        this.f29990OooO0oO = 1.0f;
        this.f29991OooO0oo = 1.0f;
        this.f29986OooO = 1.0f;
        paint.setFlags(1);
        new OverScroller(getContext());
        this.f29988OooO0o = new GestureDetector(getContext(), new OooO00o());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new OooO0O0());
        this.f29994OooOO0o = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public PhotoView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f29987OooO0Oo = paint;
        this.f29990OooO0oO = 1.0f;
        this.f29991OooO0oo = 1.0f;
        this.f29986OooO = 1.0f;
        paint.setFlags(1);
        new OverScroller(getContext());
        this.f29988OooO0o = new GestureDetector(getContext(), new OooO00o());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new OooO0O0());
        this.f29994OooOO0o = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }
}
