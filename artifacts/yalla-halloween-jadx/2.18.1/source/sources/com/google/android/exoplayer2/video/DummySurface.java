package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.android.billingclient.api.oo0o0Oo;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(17)
public final class DummySurface extends Surface {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static boolean f14900Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static int f14901Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f14902Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f14903Oooo0oO;

    public static class OooO00o extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @Nullable
        public RuntimeException f14904Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public EGLSurfaceTexture f14905Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Handler f14906Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public Error f14907Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @Nullable
        public DummySurface f14908OoooO00;

        public OooO00o() {
            super("ExoPlayer:DummySurface");
        }

        public final void OooO00o(int i) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            Objects.requireNonNull(this.f14905Oooo0o);
            EGLSurfaceTexture eGLSurfaceTexture = this.f14905Oooo0o;
            Objects.requireNonNull(eGLSurfaceTexture);
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (eGLDisplayEglGetDisplay == null) {
                throw new EGLSurfaceTexture.GlException("eglGetDisplay failed");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                throw new EGLSurfaceTexture.GlException("eglInitialize failed");
            }
            eGLSurfaceTexture.f14892Oooo0oo = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.f14888OoooO0O, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!zEglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
                throw new EGLSurfaceTexture.GlException(o000OOo0.OooOO0O("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f14892Oooo0oo, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eGLContextEglCreateContext == null) {
                throw new EGLSurfaceTexture.GlException("eglCreateContext failed");
            }
            eGLSurfaceTexture.f14889Oooo = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f14892Oooo0oo;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eGLSurfaceEglCreatePbufferSurface == null) {
                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed");
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed");
            }
            eGLSurfaceTexture.f14894OoooO00 = eGLSurfaceEglCreatePbufferSurface;
            GLES20.glGenTextures(1, eGLSurfaceTexture.f14891Oooo0oO, 0);
            oo0o0Oo.OooO0O0();
            SurfaceTexture surfaceTexture = new SurfaceTexture(eGLSurfaceTexture.f14891Oooo0oO[0]);
            eGLSurfaceTexture.f14893OoooO0 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f14905Oooo0o.f14893OoooO0;
            Objects.requireNonNull(surfaceTexture2);
            this.f14908OoooO00 = new DummySurface(this, surfaceTexture2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0O0() {
            Objects.requireNonNull(this.f14905Oooo0o);
            EGLSurfaceTexture eGLSurfaceTexture = this.f14905Oooo0o;
            eGLSurfaceTexture.f14890Oooo0o.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f14893OoooO0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f14891Oooo0oO, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f14892Oooo0oo;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f14892Oooo0oo;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f14894OoooO00;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f14892Oooo0oo, eGLSurfaceTexture.f14894OoooO00);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f14889Oooo;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f14892Oooo0oo, eGLContext);
                }
                if (o000OOo0.f36740OooO00o >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f14892Oooo0oo;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f14892Oooo0oo);
                }
                eGLSurfaceTexture.f14892Oooo0oo = null;
                eGLSurfaceTexture.f14889Oooo = null;
                eGLSurfaceTexture.f14894OoooO00 = null;
                eGLSurfaceTexture.f14893OoooO0 = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        OooO0O0();
                    } catch (Throwable th) {
                        try {
                            o0000oo.OooO0O0("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    OooO00o(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    o0000oo.OooO0O0("DummySurface", "Failed to initialize dummy surface", e);
                    this.f14907Oooo0oo = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    o0000oo.OooO0O0("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f14904Oooo = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public DummySurface(OooO00o oooO00o, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f14902Oooo0o = oooO00o;
    }

    public static int OooO00o(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = o000OOo0.f36740OooO00o;
        boolean z = false;
        if (!(i >= 24 && (i >= 26 || !("samsung".equals(o000OOo0.f36742OooO0OO) || "XT1650".equals(o000OOo0.f36743OooO0Oo))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z = true;
        }
        return z ? 1 : 2;
    }

    public static synchronized boolean OooO0O0(Context context) {
        if (!f14900Oooo) {
            f14901Oooo0oo = OooO00o(context);
            f14900Oooo = true;
        }
        return f14901Oooo0oo != 0;
    }

    public static DummySurface OooO0OO(Context context, boolean z) {
        boolean z2 = false;
        o00000O0.OooO0Oo(!z || OooO0O0(context));
        OooO00o oooO00o = new OooO00o();
        int i = z ? f14901Oooo0oo : 0;
        oooO00o.start();
        Handler handler = new Handler(oooO00o.getLooper(), oooO00o);
        oooO00o.f14906Oooo0oO = handler;
        oooO00o.f14905Oooo0o = new EGLSurfaceTexture(handler);
        synchronized (oooO00o) {
            oooO00o.f14906Oooo0oO.obtainMessage(1, i, 0).sendToTarget();
            while (oooO00o.f14908OoooO00 == null && oooO00o.f14904Oooo == null && oooO00o.f14907Oooo0oo == null) {
                try {
                    oooO00o.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = oooO00o.f14904Oooo;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = oooO00o.f14907Oooo0oo;
        if (error != null) {
            throw error;
        }
        DummySurface dummySurface = oooO00o.f14908OoooO00;
        Objects.requireNonNull(dummySurface);
        return dummySurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f14902Oooo0o) {
            if (!this.f14903Oooo0oO) {
                OooO00o oooO00o = this.f14902Oooo0o;
                Objects.requireNonNull(oooO00o.f14906Oooo0oO);
                oooO00o.f14906Oooo0oO.sendEmptyMessage(2);
                this.f14903Oooo0oO = true;
            }
        }
    }
}
