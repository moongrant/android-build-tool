package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o0O0o.OooO;
import p028Oooo0oO.o00O00;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o00OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f14387OooOOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO f14388OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0O0> f14389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Sensor f14390OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SensorManager f14391OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final com.google.android.exoplayer2.video.spherical.OooO00o f14392OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Handler f14393OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f14394OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Surface f14395OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14396OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f14397OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f14398OooOOO0;

    @VisibleForTesting
    public final class OooO00o implements GLSurfaceView.Renderer, OooO0o.OooO00o, com.google.android.exoplayer2.video.spherical.OooO00o.InterfaceC0217OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float[] f14399OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f14400OooO0Oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float[] f14403OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float[] f14404OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f14405OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f14406OooOO0O;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float[] f14402OooO0o0 = new float[16];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float[] f14401OooO0o = new float[16];

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final float[] f14407OooOO0o = new float[16];

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final float[] f14409OooOOO0 = new float[16];

        public OooO00o(OooO oooO) {
            float[] fArr = new float[16];
            this.f14403OooO0oO = fArr;
            float[] fArr2 = new float[16];
            this.f14404OooO0oo = fArr2;
            float[] fArr3 = new float[16];
            this.f14399OooO = fArr3;
            this.f14400OooO0Oo = oooO;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f14406OooOO0O = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.OooO00o.InterfaceC0217OooO00o
        @BinderThread
        public final synchronized void OooO0OO(float f, float[] fArr) {
            float[] fArr2 = this.f14403OooO0oO;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f14406OooOO0O = f2;
            Matrix.setRotateM(this.f14404OooO0oo, 0, -this.f14405OooOO0, (float) Math.cos(f2), (float) Math.sin(this.f14406OooOO0O), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f14409OooOOO0, 0, this.f14403OooO0oO, 0, this.f14399OooO, 0);
                Matrix.multiplyMM(this.f14407OooOO0o, 0, this.f14404OooO0oo, 0, this.f14409OooOOO0, 0);
            }
            Matrix.multiplyMM(this.f14401OooO0o, 0, this.f14402OooO0o0, 0, this.f14407OooOO0o, 0);
            this.f14400OooO0Oo.OooO0O0(this.f14401OooO0o);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f14402OooO0o0, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f14393OooO0oo.post(new o00O00(1, sphericalGLSurfaceView, this.f14400OooO0Oo.OooO0Oo()));
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooOO0O(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        boolean z = this.f14396OooOO0o && this.f14398OooOOO0;
        Sensor sensor = this.f14390OooO0o;
        if (sensor == null || z == this.f14397OooOOO) {
            return;
        }
        com.google.android.exoplayer2.video.spherical.OooO00o oooO00o = this.f14392OooO0oO;
        SensorManager sensorManager = this.f14391OooO0o0;
        if (z) {
            sensorManager.registerListener(oooO00o, sensor, 0);
        } else {
            sensorManager.unregisterListener(oooO00o);
        }
        this.f14397OooOOO = z;
    }

    public o0O0o.OooO00o getCameraMotionListener() {
        return this.f14388OooO;
    }

    public o00OO getVideoFrameMetadataListener() {
        return this.f14388OooO;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f14395OooOO0O;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14393OooO0oo.post(new Runnable() { // from class: o0O0o.OooOO0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView sphericalGLSurfaceView = this.f42372OooO0Oo;
                Surface surface = sphericalGLSurfaceView.f14395OooOO0O;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.OooO0O0> it = sphericalGLSurfaceView.f14389OooO0Oo.iterator();
                    while (it.hasNext()) {
                        it.next().OooO00o();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f14394OooOO0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f14394OooOO0 = null;
                sphericalGLSurfaceView.f14395OooOO0O = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f14398OooOOO0 = false;
        OooO00o();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f14398OooOOO0 = true;
        OooO00o();
    }

    public void setDefaultStereoMode(int i) {
        this.f14388OooO.f42358OooOOO = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f14396OooOO0o = z;
        OooO00o();
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14389OooO0Oo = new CopyOnWriteArrayList<>();
        this.f14393OooO0oo = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14391OooO0o0 = sensorManager;
        Sensor defaultSensor = o0O00.f40595OooO00o >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f14390OooO0o = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        OooO oooO = new OooO();
        this.f14388OooO = oooO;
        OooO00o oooO00o = new OooO00o(oooO);
        View.OnTouchListener oooO0o = new OooO0o(context, oooO00o);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f14392OooO0oO = new com.google.android.exoplayer2.video.spherical.OooO00o(windowManager.getDefaultDisplay(), oooO0o, oooO00o);
        this.f14396OooOO0o = true;
        setEGLContextClientVersion(2);
        setRenderer(oooO00o);
        setOnTouchListener(oooO0o);
    }
}
