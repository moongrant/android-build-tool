package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0o extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, com.google.android.exoplayer2.video.spherical.OooO00o.InterfaceC0217OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f14374OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final GestureDetector f14377OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f14373OooO0Oo = new PointF();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PointF f14375OooO0o0 = new PointF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f14376OooO0oO = 25.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile float f14372OooO = 3.1415927f;

    public interface OooO00o {
    }

    public OooO0o(Context context, SphericalGLSurfaceView.OooO00o oooO00o) {
        this.f14374OooO0o = oooO00o;
        this.f14377OooO0oo = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.OooO00o.InterfaceC0217OooO00o
    @BinderThread
    public final void OooO0OO(float f, float[] fArr) {
        this.f14372OooO = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f14373OooO0Oo.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f14373OooO0Oo.x) / this.f14376OooO0oO;
        float y = motionEvent2.getY();
        PointF pointF = this.f14373OooO0Oo;
        float f3 = (y - pointF.y) / this.f14376OooO0oO;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f14372OooO;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f14375OooO0o0;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        OooO00o oooO00o = this.f14374OooO0o;
        PointF pointF3 = this.f14375OooO0o0;
        SphericalGLSurfaceView.OooO00o oooO00o2 = (SphericalGLSurfaceView.OooO00o) oooO00o;
        synchronized (oooO00o2) {
            float f5 = pointF3.y;
            oooO00o2.f14405OooOO0 = f5;
            Matrix.setRotateM(oooO00o2.f14404OooO0oo, 0, -f5, (float) Math.cos(oooO00o2.f14406OooOO0O), (float) Math.sin(oooO00o2.f14406OooOO0O), 0.0f);
            Matrix.setRotateM(oooO00o2.f14399OooO, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f14377OooO0oo.onTouchEvent(motionEvent);
    }
}
