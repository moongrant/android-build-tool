package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, androidx.media3.exoplayer.video.spherical.OooO00o.InterfaceC0154OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f8319OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final GestureDetector f8322OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f8318OooO0Oo = new PointF();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PointF f8320OooO0o0 = new PointF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f8321OooO0oO = 25.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile float f8317OooO = 3.1415927f;

    public interface OooO00o {
    }

    public OooO0o(Context context, SphericalGLSurfaceView.OooO00o oooO00o) {
        this.f8319OooO0o = oooO00o;
        this.f8322OooO0oo = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.OooO00o.InterfaceC0154OooO00o
    @BinderThread
    public final void OooO0OO(float f, float[] fArr) {
        this.f8317OooO = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f8318OooO0Oo.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f8318OooO0Oo.x) / this.f8321OooO0oO;
        float y = motionEvent2.getY();
        PointF pointF = this.f8318OooO0Oo;
        float f3 = (y - pointF.y) / this.f8321OooO0oO;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f8317OooO;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f8320OooO0o0;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        OooO00o oooO00o = this.f8319OooO0o;
        PointF pointF3 = this.f8320OooO0o0;
        SphericalGLSurfaceView.OooO00o oooO00o2 = (SphericalGLSurfaceView.OooO00o) oooO00o;
        synchronized (oooO00o2) {
            float f5 = pointF3.y;
            oooO00o2.f8350OooOO0 = f5;
            Matrix.setRotateM(oooO00o2.f8349OooO0oo, 0, -f5, (float) Math.cos(oooO00o2.f8351OooOO0O), (float) Math.sin(oooO00o2.f8351OooOO0O), 0.0f);
            Matrix.setRotateM(oooO00o2.f8344OooO, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f8322OooO0oo.onTouchEvent(motionEvent);
    }
}
