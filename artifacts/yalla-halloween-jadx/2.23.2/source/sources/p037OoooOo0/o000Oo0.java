package p037OoooOo0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.o0000O0;
import androidx.camera.core.DynamicRange;
import com.facebook.internal.security.CertificateUtil;
import com.google.auto.value.AutoValue;
import io.agora.rtc.gl.EglBase;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import o000OO.OooOOO0;
import p004OooO0oO.o000oOoO;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@WorkerThread
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f1544OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f1545OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f1546OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final FloatBuffer f1547OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final String f1548OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final FloatBuffer f1549OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final o000000O f1550OooOo00;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Thread f1554OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public EGLConfig f1556OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Surface f1559OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f1552OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final HashMap f1553OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public EGLDisplay f1555OooO0Oo = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public EGLContext f1557OooO0o0 = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public EGLSurface f1558OooO0oO = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f1551OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f1560OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f1561OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f1562OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f1563OooOOO0 = -1;

    @AutoValue
    public static abstract class OooO00o {
        @NonNull
        public abstract EGLSurface OooO00o();

        public abstract int OooO0O0();

        public abstract int OooO0OO();
    }

    static {
        Locale locale = Locale.US;
        f1544OooOOO = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f1545OooOOOO = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f1546OooOOOo = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", "vTextureCoord", "sTexture", "sTexture", "vTextureCoord");
        f1548OooOOo0 = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", "sTexture", "vTextureCoord", "sTexture", "vTextureCoord");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f1547OooOOo = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f1549OooOOoo = floatBufferAsFloatBuffer2;
        f1550OooOo00 = new o000000O(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void OooO00o(@NonNull String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, ": EGL error: 0x");
        sbOooO0O0.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    public static void OooO0O0(@NonNull String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, ": GL error 0x");
        sbOooO0O0.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    public static void OooO0o0(int i, @NonNull String str) {
        if (i < 0) {
            throw new IllegalStateException(o000oOoO.OooO0O0("Unable to locate '", str, "' in program"));
        }
    }

    @NonNull
    public static EGLSurface OooOO0(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, @NonNull Surface surface) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        OooO00o("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static int OooOOO0(@NonNull DynamicRange dynamicRange, @NonNull o000O00O o000o00o2) {
        if (o000o00o2 == o000O00O.f1528OooO00o) {
            return OooOOOO(35632, dynamicRange.OooO00o() ? f1548OooOOo0 : f1546OooOOOo);
        }
        try {
            o000o00o2.getClass();
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th);
        }
    }

    public static int OooOOOO(int i, @NonNull String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        OooO0O0("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        o00O0O0.OooO0oo("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Could not compile shader type ", i, CertificateUtil.DELIMITER);
        sbOooO0O0.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    public final void OooO() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        OooO0O0("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        OooO0O0("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        OooO0O0("glTexParameter");
        this.f1551OooO = i;
    }

    public final void OooO0OO() {
        OooOOO0.OooO0o("Method call must be called on the GL thread.", this.f1554OooO0OO == Thread.currentThread());
    }

    public final void OooO0Oo(boolean z) {
        OooOOO0.OooO0o(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == this.f1552OooO00o.get());
    }

    public final void OooO0o(@NonNull DynamicRange dynamicRange) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f1555OooO0Oo = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f1555OooO0Oo, iArr, 0, iArr, 1)) {
            this.f1555OooO0Oo = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        int i = dynamicRange.OooO00o() ? 10 : 8;
        int[] iArr2 = {12324, i, 12323, i, 12322, i, 12321, dynamicRange.OooO00o() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.OooO00o() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, !dynamicRange.OooO00o() ? 1 : 0, 12339, 5, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f1555OooO0Oo, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr3 = new int[3];
        iArr3[0] = 12440;
        iArr3[1] = dynamicRange.OooO00o() ? 3 : 2;
        iArr3[2] = 12344;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f1555OooO0Oo, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr3, 0);
        OooO00o("eglCreateContext");
        this.f1556OooO0o = eGLConfig;
        this.f1557OooO0o0 = eGLContextEglCreateContext;
        int[] iArr4 = new int[1];
        EGL14.eglQueryContext(this.f1555OooO0Oo, eGLContextEglCreateContext, 12440, iArr4, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr4[0]);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    public final void OooO0oO(@NonNull DynamicRange dynamicRange, @NonNull o000O00O o000o00o2) throws Throwable {
        Throwable e;
        int iOooOOO0;
        int iGlCreateProgram;
        int iOooOOOO;
        try {
            iOooOOOO = OooOOOO(35633, dynamicRange.OooO00o() ? f1545OooOOOO : f1544OooOOO);
            try {
                iOooOOO0 = OooOOO0(dynamicRange, o000o00o2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        OooO0O0("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iOooOOOO);
                        OooO0O0("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iOooOOO0);
                        OooO0O0("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f1560OooOO0 = iGlCreateProgram;
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        if (iOooOOOO != -1) {
                            GLES20.glDeleteShader(iOooOOOO);
                        }
                        if (iOooOOO0 != -1) {
                            GLES20.glDeleteShader(iOooOOO0);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e3) {
                        e = e3;
                        if (iOooOOOO != -1) {
                            GLES20.glDeleteShader(iOooOOOO);
                        }
                        if (iOooOOO0 != -1) {
                            GLES20.glDeleteShader(iOooOOO0);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    e = e4;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e5) {
                e = e5;
                iOooOOO0 = -1;
                iGlCreateProgram = -1;
            }
        } catch (IllegalArgumentException | IllegalStateException e6) {
            e = e6;
            iOooOOO0 = -1;
            iGlCreateProgram = -1;
            iOooOOOO = -1;
        }
    }

    public final void OooO0oo() {
        EGLDisplay eGLDisplay = this.f1555OooO0Oo;
        EGLConfig eGLConfig = this.f1556OooO0o;
        Objects.requireNonNull(eGLConfig);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        OooO00o("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f1558OooO0oO = eGLSurfaceEglCreatePbufferSurface;
    }

    @NonNull
    public final String OooOO0O(@NonNull DynamicRange dynamicRange) {
        OooO0Oo(false);
        try {
            OooO0o(dynamicRange);
            OooO0oo();
            OooOOOo(this.f1558OooO0oO);
            String strGlGetString = GLES20.glGetString(7939);
            return strGlGetString != null ? strGlGetString : "";
        } catch (IllegalStateException e) {
            o00O0O0.OooO("OpenGlRenderer", "Failed to get GL extensions: " + e.getMessage(), e);
            return "";
        } finally {
            OooOOo0();
        }
    }

    public final void OooOO0o(@NonNull DynamicRange dynamicRange, @NonNull o000O00O o000o00o2) {
        OooO0Oo(false);
        try {
            if (dynamicRange.OooO00o() && !OooOO0O(dynamicRange).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                dynamicRange = DynamicRange.f3398OooO0Oo;
            }
            OooO0o(dynamicRange);
            OooO0oo();
            OooOOOo(this.f1558OooO0oO);
            OooO0oO(dynamicRange, o000o00o2);
            OooOOO();
            OooO();
            OooOOoo();
            this.f1554OooO0OO = Thread.currentThread();
            this.f1552OooO00o.set(true);
        } catch (IllegalArgumentException | IllegalStateException e) {
            OooOOo0();
            throw e;
        }
    }

    public final void OooOOO() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f1560OooOO0, "aPosition");
        this.f1562OooOO0o = iGlGetAttribLocation;
        OooO0o0(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f1560OooOO0, "aTextureCoord");
        this.f1563OooOOO0 = iGlGetAttribLocation2;
        OooO0o0(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f1560OooOO0, "uTexMatrix");
        this.f1561OooOO0O = iGlGetUniformLocation;
        OooO0o0(iGlGetUniformLocation, "uTexMatrix");
    }

    public final void OooOOOo(@NonNull EGLSurface eGLSurface) {
        this.f1555OooO0Oo.getClass();
        this.f1557OooO0o0.getClass();
        if (!EGL14.eglMakeCurrent(this.f1555OooO0Oo, eGLSurface, eGLSurface, this.f1557OooO0o0)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void OooOOo(@NonNull Surface surface, boolean z) {
        if (this.f1559OooO0oo == surface) {
            this.f1559OooO0oo = null;
            OooOOOo(this.f1558OooO0oO);
        }
        HashMap map = this.f1553OooO0O0;
        o000000O o000000o2 = f1550OooOo00;
        OooO00o oooO00o = z ? (OooO00o) map.remove(surface) : (OooO00o) map.put(surface, o000000o2);
        if (oooO00o == null || oooO00o == o000000o2) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f1555OooO0Oo, oooO00o.OooO00o());
        } catch (RuntimeException e) {
            o00O0O0.OooO("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public final void OooOOo0() {
        int i = this.f1560OooOO0;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.f1560OooOO0 = -1;
        }
        if (!Objects.equals(this.f1555OooO0Oo, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f1555OooO0Oo;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.f1553OooO0O0;
            for (OooO00o oooO00o : map.values()) {
                if (!Objects.equals(oooO00o.OooO00o(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f1555OooO0Oo, oooO00o.OooO00o())) {
                    try {
                        OooO00o("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        o00O0O0.OooO0OO("OpenGlRenderer", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.f1558OooO0oO, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f1555OooO0Oo, this.f1558OooO0oO);
                this.f1558OooO0oO = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f1557OooO0o0, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f1555OooO0Oo, this.f1557OooO0o0);
                this.f1557OooO0o0 = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f1555OooO0Oo);
            this.f1555OooO0Oo = EGL14.EGL_NO_DISPLAY;
        }
        this.f1556OooO0o = null;
        this.f1560OooOO0 = -1;
        this.f1561OooOO0O = -1;
        this.f1562OooOO0o = -1;
        this.f1563OooOOO0 = -1;
        this.f1551OooO = -1;
        this.f1559OooO0oo = null;
        this.f1554OooO0OO = null;
    }

    public final void OooOOoo() {
        GLES20.glUseProgram(this.f1560OooOO0);
        OooO0O0("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f1551OooO);
        GLES20.glEnableVertexAttribArray(this.f1562OooOO0o);
        OooO0O0("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f1562OooOO0o, 2, 5126, false, 0, (Buffer) f1547OooOOo);
        OooO0O0("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f1563OooOOO0);
        OooO0O0("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f1563OooOOO0, 2, 5126, false, 0, (Buffer) f1549OooOOoo);
        OooO0O0("glVertexAttribPointer");
    }
}
