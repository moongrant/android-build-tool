package androidx.media3.exoplayer.video.spherical;

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
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o000OOO.OooOO0O;
import o000OOo0.OooO;
import p023Oooo00o.oO00O0o0;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f8332OooOOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO f8333OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0O0> f8334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Sensor f8335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SensorManager f8336OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.spherical.OooO00o f8337OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Handler f8338OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f8339OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Surface f8340OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f8341OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f8342OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f8343OooOOO0;

    @VisibleForTesting
    public final class OooO00o implements GLSurfaceView.Renderer, OooO0o.OooO00o, androidx.media3.exoplayer.video.spherical.OooO00o.InterfaceC0154OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float[] f8344OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f8345OooO0Oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float[] f8348OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float[] f8349OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f8350OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f8351OooOO0O;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float[] f8347OooO0o0 = new float[16];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float[] f8346OooO0o = new float[16];

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final float[] f8352OooOO0o = new float[16];

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final float[] f8354OooOOO0 = new float[16];

        public OooO00o(OooO oooO) {
            float[] fArr = new float[16];
            this.f8348OooO0oO = fArr;
            float[] fArr2 = new float[16];
            this.f8349OooO0oo = fArr2;
            float[] fArr3 = new float[16];
            this.f8344OooO = fArr3;
            this.f8345OooO0Oo = oooO;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f8351OooOO0O = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.OooO00o.InterfaceC0154OooO00o
        @BinderThread
        public final synchronized void OooO0OO(float f, float[] fArr) {
            float[] fArr2 = this.f8348OooO0oO;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f8351OooOO0O = f2;
            Matrix.setRotateM(this.f8349OooO0oo, 0, -this.f8350OooOO0, (float) Math.cos(f2), (float) Math.sin(this.f8351OooOO0O), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f8354OooOOO0, 0, this.f8348OooO0oO, 0, this.f8344OooO, 0);
                Matrix.multiplyMM(this.f8352OooOO0o, 0, this.f8349OooO0oo, 0, this.f8354OooOOO0, 0);
            }
            Matrix.multiplyMM(this.f8346OooO0o, 0, this.f8347OooO0o0, 0, this.f8352OooOO0o, 0);
            this.f8345OooO0Oo.OooO0Oo(this.f8346OooO0o);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f8347OooO0o0, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f8338OooO0oo.post(new oO00O0o0(2, sphericalGLSurfaceView, this.f8345OooO0Oo.OooO0o0()));
        }
    }

    public interface OooO0O0 {
        void OooOOO0(Surface surface);

        void OooOo0O();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        boolean z = this.f8341OooOO0o && this.f8343OooOOO0;
        Sensor sensor = this.f8335OooO0o;
        if (sensor == null || z == this.f8342OooOOO) {
            return;
        }
        androidx.media3.exoplayer.video.spherical.OooO00o oooO00o = this.f8337OooO0oO;
        SensorManager sensorManager = this.f8336OooO0o0;
        if (z) {
            sensorManager.registerListener(oooO00o, sensor, 0);
        } else {
            sensorManager.unregisterListener(oooO00o);
        }
        this.f8342OooOOO = z;
    }

    public o000OOo0.OooO00o getCameraMotionListener() {
        return this.f8333OooO;
    }

    public OooOO0O getVideoFrameMetadataListener() {
        return this.f8333OooO;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f8340OooOO0O;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8338OooO0oo.post(new Runnable() { // from class: o000OOo0.OooOO0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView sphericalGLSurfaceView = this.f34619OooO0Oo;
                Surface surface = sphericalGLSurfaceView.f8340OooOO0O;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.OooO0O0> it = sphericalGLSurfaceView.f8334OooO0Oo.iterator();
                    while (it.hasNext()) {
                        it.next().OooOo0O();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f8339OooOO0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f8339OooOO0 = null;
                sphericalGLSurfaceView.f8340OooOO0O = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f8343OooOOO0 = false;
        OooO00o();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f8343OooOOO0 = true;
        OooO00o();
    }

    public void setDefaultStereoMode(int i) {
        this.f8333OooO.f34605OooOOO = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f8341OooOO0o = z;
        OooO00o();
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8334OooO0Oo = new CopyOnWriteArrayList<>();
        this.f8338OooO0oo = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f8336OooO0o0 = sensorManager;
        Sensor defaultSensor = o00.f34910OooO00o >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f8335OooO0o = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        OooO oooO = new OooO();
        this.f8333OooO = oooO;
        OooO00o oooO00o = new OooO00o(oooO);
        View.OnTouchListener oooO0o = new OooO0o(context, oooO00o);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f8337OooO0oO = new androidx.media3.exoplayer.video.spherical.OooO00o(windowManager.getDefaultDisplay(), oooO0o, oooO00o);
        this.f8341OooOO0o = true;
        setEGLContextClientVersion(2);
        setRenderer(oooO00o);
        setOnTouchListener(oooO0o);
    }
}
