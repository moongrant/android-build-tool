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
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o000O000.OooO0o;
import o000O0O.OooO;
import o000O0O.OooOO0;
import p083o000Ooo.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f6314OooOOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO f6315OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0O0> f6316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Sensor f6317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SensorManager f6318OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.spherical.OooO00o f6319OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Handler f6320OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f6321OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Surface f6322OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f6323OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f6324OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f6325OooOOO0;

    @VisibleForTesting
    public final class OooO00o implements GLSurfaceView.Renderer, androidx.media3.exoplayer.video.spherical.OooO0O0.OooO00o, androidx.media3.exoplayer.video.spherical.OooO00o.InterfaceC0141OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float[] f6326OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f6327OooO0Oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float[] f6330OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float[] f6331OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f6332OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f6333OooOO0O;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float[] f6329OooO0o0 = new float[16];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float[] f6328OooO0o = new float[16];

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final float[] f6334OooOO0o = new float[16];

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final float[] f6336OooOOO0 = new float[16];

        public OooO00o(OooO oooO) {
            float[] fArr = new float[16];
            this.f6330OooO0oO = fArr;
            float[] fArr2 = new float[16];
            this.f6331OooO0oo = fArr2;
            float[] fArr3 = new float[16];
            this.f6326OooO = fArr3;
            this.f6327OooO0Oo = oooO;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f6333OooOO0O = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.OooO00o.InterfaceC0141OooO00o
        @BinderThread
        public final synchronized void OooO0OO(float f, float[] fArr) {
            float[] fArr2 = this.f6330OooO0oO;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f6333OooOO0O = f2;
            Matrix.setRotateM(this.f6331OooO0oo, 0, -this.f6332OooOO0, (float) Math.cos(f2), (float) Math.sin(this.f6333OooOO0O), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f6336OooOOO0, 0, this.f6330OooO0oO, 0, this.f6326OooO, 0);
                Matrix.multiplyMM(this.f6334OooOO0o, 0, this.f6331OooO0oo, 0, this.f6336OooOOO0, 0);
            }
            Matrix.multiplyMM(this.f6328OooO0o, 0, this.f6329OooO0o0, 0, this.f6334OooOO0o, 0);
            this.f6327OooO0Oo.OooO00o(this.f6328OooO0o);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f6329OooO0o0, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f6320OooO0oo.post(new OooOO0(0, sphericalGLSurfaceView, this.f6327OooO0Oo.OooO0O0()));
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        boolean z = this.f6323OooOO0o && this.f6325OooOOO0;
        Sensor sensor = this.f6317OooO0o;
        if (sensor == null || z == this.f6324OooOOO) {
            return;
        }
        androidx.media3.exoplayer.video.spherical.OooO00o oooO00o = this.f6319OooO0oO;
        SensorManager sensorManager = this.f6318OooO0o0;
        if (z) {
            sensorManager.registerListener(oooO00o, sensor, 0);
        } else {
            sensorManager.unregisterListener(oooO00o);
        }
        this.f6324OooOOO = z;
    }

    public o000O0O.OooO00o getCameraMotionListener() {
        return this.f6315OooO;
    }

    public OooOO0O getVideoFrameMetadataListener() {
        return this.f6315OooO;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f6322OooOO0O;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6320OooO0oo.post(new o000O0O.OooOO0O(0, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f6325OooOOO0 = false;
        OooO00o();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f6325OooOOO0 = true;
        OooO00o();
    }

    public void setDefaultStereoMode(int i) {
        this.f6315OooO.getClass();
    }

    public void setUseSensorRotation(boolean z) {
        this.f6323OooOO0o = z;
        OooO00o();
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6316OooO0Oo = new CopyOnWriteArrayList<>();
        this.f6320OooO0oo = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f6318OooO0o0 = sensorManager;
        Sensor defaultSensor = OooO0o.f34423OooO00o >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f6317OooO0o = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        OooO oooO = new OooO();
        this.f6315OooO = oooO;
        OooO00o oooO00o = new OooO00o(oooO);
        View.OnTouchListener oooO0O0 = new androidx.media3.exoplayer.video.spherical.OooO0O0(context, oooO00o);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f6319OooO0oO = new androidx.media3.exoplayer.video.spherical.OooO00o(windowManager.getDefaultDisplay(), oooO0O0, oooO00o);
        this.f6323OooOO0o = true;
        setEGLContextClientVersion(2);
        setRenderer(oooO00o);
        setOnTouchListener(oooO0O0);
    }
}
