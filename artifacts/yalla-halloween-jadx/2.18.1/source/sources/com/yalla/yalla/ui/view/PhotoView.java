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
import com.umeng.analytics.pro.d;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/PhotoView;", "Landroid/view/View;", "", "currentScale", "", "setCurrentScale", "Landroid/graphics/Bitmap;", "getBitmap", "bitmap", "setBitmap", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ObjectAnimatorBinding"})
@RequiresApi(19)
public class PhotoView extends View {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25039o000oOoO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f25040Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Paint f25041Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Bitmap f25042Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final GestureDetector f25043Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f25044OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f25045OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f25046OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f25047OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ScaleGestureDetector f25048OoooOO0;

    public final class OooO00o extends GestureDetector.SimpleOnGestureListener {
        public OooO00o() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
        public final boolean onContextClick(@Nullable MotionEvent motionEvent) {
            return super.onContextClick(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(@Nullable MotionEvent motionEvent) {
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(@Nullable MotionEvent motionEvent) {
            return super.onDoubleTapEvent(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(@Nullable MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(@Nullable MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
            PhotoView photoView = PhotoView.this;
            int i = PhotoView.f25039o000oOoO;
            Objects.requireNonNull(photoView);
            PhotoView photoView2 = PhotoView.this;
            photoView2.f25047OoooO0O -= f;
            photoView2.f25044OoooO -= f2;
            PhotoView.OooO00o(photoView2);
            PhotoView.this.invalidate();
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onShowPress(@Nullable MotionEvent motionEvent) {
            super.onShowPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@Nullable MotionEvent motionEvent) {
            return super.onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
            return super.onSingleTapUp(motionEvent);
        }
    }

    public final class OooO0O0 implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f25050OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f25051OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f25052OooO0OO;

        public OooO0O0() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(@Nullable ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector == null) {
                return false;
            }
            PhotoView photoView = PhotoView.this;
            float fMax = Math.max(Math.min(scaleGestureDetector.getScaleFactor() * this.f25050OooO00o, photoView.f25040Oooo), photoView.f25046OoooO00) / this.f25050OooO00o;
            photoView.f25047OoooO0O = scaleGestureDetector.getFocusX() - ((scaleGestureDetector.getFocusX() - this.f25051OooO0O0) * fMax);
            photoView.f25044OoooO = scaleGestureDetector.getFocusY() - ((scaleGestureDetector.getFocusY() - this.f25052OooO0OO) * fMax);
            photoView.f25045OoooO0 = fMax * this.f25050OooO00o;
            PhotoView.OooO00o(photoView);
            photoView.invalidate();
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(@Nullable ScaleGestureDetector scaleGestureDetector) {
            PhotoView photoView = PhotoView.this;
            this.f25050OooO00o = photoView.f25045OoooO0;
            this.f25051OooO0O0 = photoView.f25047OoooO0O;
            this.f25052OooO0OO = photoView.f25044OoooO;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(@Nullable ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public PhotoView(@Nullable Context context) {
        super(context);
        Paint paint = new Paint();
        this.f25041Oooo0o = paint;
        this.f25040Oooo = 1.0f;
        this.f25046OoooO00 = 1.0f;
        this.f25045OoooO0 = 1.0f;
        paint.setFlags(1);
        new OverScroller(getContext());
        this.f25043Oooo0oo = new GestureDetector(getContext(), new OooO00o());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new OooO0O0());
        this.f25048OoooOO0 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public static final void OooO00o(PhotoView photoView) {
        Bitmap bitmap = photoView.f25042Oooo0oO;
        if (bitmap != null) {
            float fMin = Math.min(photoView.f25047OoooO0O, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            photoView.f25047OoooO0O = fMin;
            photoView.f25047OoooO0O = Math.max(fMin, photoView.getWidth() - (bitmap.getWidth() * photoView.f25045OoooO0));
            float fMax = Math.max(photoView.f25044OoooO, photoView.getHeight() - (bitmap.getHeight() * photoView.f25045OoooO0));
            photoView.f25044OoooO = fMax;
            photoView.f25044OoooO = Math.min(fMax, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    private final void setCurrentScale(float currentScale) {
        this.f25045OoooO0 = currentScale;
        invalidate();
    }

    @Nullable
    /* JADX INFO: renamed from: getBitmap, reason: from getter */
    public final Bitmap getF25042Oooo0oO() {
        return this.f25042Oooo0oO;
    }

    @Override // android.view.View
    public final void onDraw(@Nullable Canvas canvas) {
        Bitmap bitmap;
        if (canvas == null || (bitmap = this.f25042Oooo0oO) == null) {
            return;
        }
        float f = this.f25045OoooO0;
        canvas.scale(f, f, this.f25047OoooO0O, this.f25044OoooO);
        canvas.drawBitmap(bitmap, this.f25047OoooO0O, this.f25044OoooO, this.f25041Oooo0o);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Bitmap bitmap = this.f25042Oooo0oO;
        if (bitmap != null) {
            this.f25046OoooO00 = RangesKt.coerceAtLeast(getWidth() / bitmap.getWidth(), getHeight() / bitmap.getHeight());
            this.f25040Oooo = (bitmap.getWidth() <= getWidth() || bitmap.getHeight() <= getHeight()) ? this.f25046OoooO00 * 2 : 2.0f;
            this.f25047OoooO0O = (-((bitmap.getWidth() * this.f25046OoooO00) - getWidth())) / 2.0f;
            this.f25044OoooO = (-((bitmap.getHeight() * this.f25046OoooO00) - getHeight())) / 2.0f;
            this.f25045OoooO0 = this.f25046OoooO00;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        return !this.f25048OoooOO0.isInProgress() ? this.f25043Oooo0oo.onTouchEvent(motionEvent) : this.f25048OoooOO0.onTouchEvent(motionEvent);
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f25042Oooo0oO = bitmap;
    }

    public PhotoView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f25041Oooo0o = paint;
        this.f25040Oooo = 1.0f;
        this.f25046OoooO00 = 1.0f;
        this.f25045OoooO0 = 1.0f;
        paint.setFlags(1);
        new OverScroller(getContext());
        this.f25043Oooo0oo = new GestureDetector(getContext(), new OooO00o());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new OooO0O0());
        this.f25048OoooOO0 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public PhotoView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f25041Oooo0o = paint;
        this.f25040Oooo = 1.0f;
        this.f25046OoooO00 = 1.0f;
        this.f25045OoooO0 = 1.0f;
        paint.setFlags(1);
        new OverScroller(getContext());
        this.f25043Oooo0oo = new GestureDetector(getContext(), new OooO00o());
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new OooO0O0());
        this.f25048OoooOO0 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }
}
