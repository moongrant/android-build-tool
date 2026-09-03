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
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(17)
@Deprecated
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static int f14326OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f14327OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f14328OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f14329OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f14330OooO0o0;

    public static class OooO00o extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public EGLSurfaceTexture f14331OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Error f14332OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Handler f14333OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public RuntimeException f14334OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public PlaceholderSurface f14335OooO0oo;

        public OooO00o() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void OooO00o(int i) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f14331OooO0Oo.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f14331OooO0Oo;
            eGLSurfaceTexture.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.OooO0OO("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr = new int[2];
            GlUtil.OooO0OO("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
            eGLSurfaceTexture.f14316OooO0o = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.f14313OooOO0, 0, eGLConfigArr, 0, 1, iArr2, 0);
            GlUtil.OooO0OO(o0O00.OooOO0o("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f14316OooO0o, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.OooO0OO("eglCreateContext failed", eGLContextEglCreateContext != null);
            eGLSurfaceTexture.f14318OooO0oO = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f14316OooO0o;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.OooO0OO("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.OooO0OO("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            eGLSurfaceTexture.f14319OooO0oo = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = eGLSurfaceTexture.f14317OooO0o0;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.OooO0O0();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            eGLSurfaceTexture.f14314OooO = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f14331OooO0Oo.f14314OooO;
            surfaceTexture2.getClass();
            this.f14335OooO0oo = new PlaceholderSurface(this, surfaceTexture2, i != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0O0() {
            this.f14331OooO0Oo.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f14331OooO0Oo;
            eGLSurfaceTexture.f14315OooO0Oo.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f14314OooO;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f14317OooO0o0, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f14316OooO0o;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f14316OooO0o;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f14319OooO0oo;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f14316OooO0o, eGLSurfaceTexture.f14319OooO0oo);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f14318OooO0oO;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f14316OooO0o, eGLContext);
                }
                if (o0O00.f40595OooO00o >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f14316OooO0o;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f14316OooO0o);
                }
                eGLSurfaceTexture.f14316OooO0o = null;
                eGLSurfaceTexture.f14318OooO0oO = null;
                eGLSurfaceTexture.f14319OooO0oo = null;
                eGLSurfaceTexture.f14314OooO = null;
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
                            Log.OooO0Oo("PlaceholderSurface", "Failed to release placeholder surface", th);
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
                } catch (GlUtil.GlException e) {
                    Log.OooO0Oo("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f14334OooO0oO = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.OooO0Oo("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f14332OooO0o = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.OooO0Oo("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f14334OooO0oO = e3;
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

    public PlaceholderSurface(OooO00o oooO00o, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f14330OooO0o0 = oooO00o;
        this.f14328OooO0Oo = z;
    }

    public static int OooO00o(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = o0O00.f40595OooO00o;
        boolean z = false;
        if (!(i >= 24 && (i >= 26 || !("samsung".equals(o0O00.f40597OooO0OO) || "XT1650".equals(o0O00.f40598OooO0Oo))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z = true;
        }
        return z ? 1 : 2;
    }

    public static synchronized boolean OooO0O0(Context context) {
        if (!f14327OooO0oo) {
            f14326OooO0oO = OooO00o(context);
            f14327OooO0oo = true;
        }
        return f14326OooO0oO != 0;
    }

    public static PlaceholderSurface OooO0OO(Context context, boolean z) {
        boolean z2 = false;
        o00O000o.OooO0Oo(!z || OooO0O0(context));
        OooO00o oooO00o = new OooO00o();
        int i = z ? f14326OooO0oO : 0;
        oooO00o.start();
        Handler handler = new Handler(oooO00o.getLooper(), oooO00o);
        oooO00o.f14333OooO0o0 = handler;
        oooO00o.f14331OooO0Oo = new EGLSurfaceTexture(handler);
        synchronized (oooO00o) {
            oooO00o.f14333OooO0o0.obtainMessage(1, i, 0).sendToTarget();
            while (oooO00o.f14335OooO0oo == null && oooO00o.f14334OooO0oO == null && oooO00o.f14332OooO0o == null) {
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
        RuntimeException runtimeException = oooO00o.f14334OooO0oO;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = oooO00o.f14332OooO0o;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = oooO00o.f14335OooO0oo;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f14330OooO0o0) {
            if (!this.f14329OooO0o) {
                OooO00o oooO00o = this.f14330OooO0o0;
                oooO00o.f14333OooO0o0.getClass();
                oooO00o.f14333OooO0o0.sendEmptyMessage(2);
                this.f14329OooO0o = true;
            }
        }
    }
}
