package o000O0O;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements p083o000Ooo.OooOO0O, OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f34667OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public SurfaceTexture f34676OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f34668OooO00o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicBoolean f34669OooO0O0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f34670OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f34671OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O000.OooO0O0<Long> f34673OooO0o0 = new o000O000.OooO0O0<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O000.OooO0O0<Projection> f34672OooO0o = new o000O000.OooO0O0<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float[] f34674OooO0oO = new float[16];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f34675OooO0oo = new float[16];

    public final void OooO00o(float[] fArr) {
        Long lOooO00o;
        GLES20.glClear(16384);
        try {
            GlUtil.OooO0O0();
        } catch (GlUtil.GlException e) {
            Log.OooO00o("Failed to draw a frame", e);
        }
        if (this.f34668OooO00o.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f34676OooOO0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                GlUtil.OooO0O0();
            } catch (GlUtil.GlException e2) {
                Log.OooO00o("Failed to draw a frame", e2);
            }
            if (this.f34669OooO0O0.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f34674OooO0oO, 0);
            }
            long timestamp = this.f34676OooOO0.getTimestamp();
            o000O000.OooO0O0<Long> oooO0O0 = this.f34673OooO0o0;
            synchronized (oooO0O0) {
                lOooO00o = oooO0O0.OooO00o(timestamp, false);
            }
            Long l = lOooO00o;
            if (l != null) {
                OooO0O0 oooO0O1 = this.f34671OooO0Oo;
                float[] fArr2 = this.f34674OooO0oO;
                float[] fArrOooO0O0 = oooO0O1.f34679OooO0OO.OooO0O0(l.longValue());
                if (fArrOooO0O0 != null) {
                    float[] fArr3 = oooO0O1.f34678OooO0O0;
                    float f = fArrOooO0O0[0];
                    float f2 = -fArrOooO0O0[1];
                    float f3 = -fArrOooO0O0[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr3, 0);
                    }
                    if (!oooO0O1.f34680OooO0Oo) {
                        OooO0O0.OooO00o(oooO0O1.f34677OooO00o, oooO0O1.f34678OooO0O0);
                        oooO0O1.f34680OooO0Oo = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, oooO0O1.f34677OooO00o, 0, oooO0O1.f34678OooO0O0, 0);
                }
            }
            if (this.f34672OooO0o.OooO0O0(timestamp) != null) {
                this.f34670OooO0OO.getClass();
                throw null;
            }
        }
        Matrix.multiplyMM(this.f34675OooO0oo, 0, fArr, 0, this.f34674OooO0oO, 0);
        this.f34670OooO0OO.getClass();
    }

    public final SurfaceTexture OooO0O0() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.OooO0O0();
            this.f34670OooO0OO.OooO00o();
            GlUtil.OooO0O0();
            if (!(!o000O000.OooO0o.OooO00o(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT))) {
                throw new GlUtil.GlException("No current context");
            }
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.OooO0O0();
            int i = iArr[0];
            GlUtil.OooO00o(36197, i);
            this.f34667OooO = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f34667OooO);
            this.f34676OooOO0 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o000O0O.OooO0o
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    this.f34682OooO0Oo.f34668OooO00o.set(true);
                }
            });
            return this.f34676OooOO0;
        } catch (GlUtil.GlException e) {
            Log.OooO00o("Failed to initialize the renderer", e);
        }
    }
}
