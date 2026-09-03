package o0OOO0OO;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p339o0OOO0Oo.OooO0o;
import p341o0OOO0o0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f43584OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public FloatBuffer f43586OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f43589OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f43590OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f43591OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f43592OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f43593OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f43594OooOOO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooO00o.InterfaceC0459OooO00o f43597OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public SurfaceTexture f43598OooOOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final OooO0OO f43600OooOo00;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f43585OooO0Oo = 20;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f43587OooO0o0 = {-1.0f, -1.0f, 0.0f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float[] f43588OooO0oO = new float[16];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AtomicBoolean f43595OooOOOO = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AtomicBoolean f43596OooOOOo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ScaleType f43599OooOOoo = ScaleType.ScaleAspectFill;

    public OooO0O0(@NotNull OooO0OO oooO0OO) {
        this.f43600OooOo00 = oooO0OO;
        float[] fArr = new float[16];
        this.f43589OooO0oo = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.f43587OooO0o0.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Intrinsics.checkExpressionValueIsNotNull(floatBufferAsFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
        this.f43586OooO0o = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f43587OooO0o0).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static void OooO0OO(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("VideoRender", str + ": glError " + iGlGetError);
        }
    }

    public static int OooO0o0(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("VideoRender", "Could not compile shader " + i + ':');
        Log.e("VideoRender", GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    @Override // o0OOO0OO.OooO00o
    public final void OooO00o() {
        AtomicBoolean atomicBoolean = this.f43595OooOOOO;
        atomicBoolean.compareAndSet(false, true);
        Log.i("VideoRender", "onFirstFrame:    canDraw = " + atomicBoolean.get());
        this.f43600OooOo00.requestRender();
    }

    @Override // o0OOO0OO.OooO00o
    public final void OooO0O0() {
        AtomicBoolean atomicBoolean = this.f43595OooOOOO;
        atomicBoolean.compareAndSet(true, false);
        Log.i("VideoRender", "onCompletion:   canDraw = " + atomicBoolean.get());
        this.f43600OooOo00.requestRender();
    }

    @Override // o0OOO0OO.OooO00o
    public final void OooO0Oo(@NotNull OooO00o.InterfaceC0459OooO00o interfaceC0459OooO00o) {
        this.f43597OooOOo = interfaceC0459OooO00o;
    }

    @Override // o0OOO0OO.OooO00o
    public final void OooO0o(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float[] fArrOooO0O0;
        float f8 = 0;
        if (f <= f8 || f2 <= f8 || f3 <= f8 || f4 <= f8) {
            return;
        }
        ScaleType scaleType = this.f43599OooOOoo;
        float f9 = f / f2;
        float f10 = f3 / f4;
        float f11 = 0.0f;
        if (f9 > f10) {
            f6 = (1.0f - (f2 / (f / f10))) / 2.0f;
            f5 = 0.0f;
        } else {
            f5 = (1.0f - (f / (f2 * f10))) / 2.0f;
            f6 = 0.0f;
        }
        switch (OooO0o.OooO00o.f43601OooO00o[scaleType.ordinal()]) {
            case 1:
                if (f9 > f10) {
                    f11 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                    f7 = 0.0f;
                } else {
                    f7 = (1.0f - ((f / f10) / f2)) / 2.0f;
                }
                fArrOooO0O0 = OooO0o.OooO0O0(f11, f7, f11, f7);
                break;
            case 2:
                fArrOooO0O0 = OooO0o.OooO00o(f5, f6, f5, f6);
                break;
            case 3:
                fArrOooO0O0 = OooO0o.OooO00o(f5, 0.0f, f5, f6 * 2.0f);
                break;
            case 4:
                fArrOooO0O0 = OooO0o.OooO00o(f5, f6 * 2.0f, f5, 0.0f);
                break;
            case 5:
                fArrOooO0O0 = OooO0o.OooO00o(0.0f, f6, f5 * 2.0f, f6);
                break;
            case 6:
                fArrOooO0O0 = OooO0o.OooO00o(f5 * 2.0f, f6, 0.0f, f6);
                break;
            case 7:
                fArrOooO0O0 = OooO0o.OooO0O0(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                break;
            case 8:
                fArrOooO0O0 = OooO0o.OooO0O0(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                break;
            case 9:
                fArrOooO0O0 = OooO0o.OooO0O0(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                break;
            case 10:
                fArrOooO0O0 = OooO0o.OooO0O0(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                break;
            default:
                fArrOooO0O0 = OooO0o.OooO00o(0.0f, 0.0f, 0.0f, 0.0f);
                break;
        }
        Intrinsics.checkExpressionValueIsNotNull(fArrOooO0O0, "TextureCropUtil.calculat… videoWidth, videoHeight)");
        this.f43587OooO0o0 = fArrOooO0O0;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArrOooO0O0.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Intrinsics.checkExpressionValueIsNotNull(floatBufferAsFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
        this.f43586OooO0o = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f43587OooO0o0).position(0);
    }

    @Override // com.ss.ugc.android.alpha_player.widget.GLTextureView.Oooo000, android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(@NotNull GL10 gl10) {
        boolean zCompareAndSet = this.f43596OooOOOo.compareAndSet(true, false);
        float[] fArr = this.f43589OooO0oo;
        if (zCompareAndSet) {
            try {
                SurfaceTexture surfaceTexture = this.f43598OooOOo0;
                if (surfaceTexture == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                }
                surfaceTexture.updateTexImage();
            } catch (Exception e) {
                e.printStackTrace();
            }
            SurfaceTexture surfaceTexture2 = this.f43598OooOOo0;
            if (surfaceTexture2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
            }
            surfaceTexture2.getTransformMatrix(fArr);
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.f43595OooOOOO.get()) {
            GLES20.glFinish();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f43584OooO);
        OooO0OO("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f43590OooOO0);
        this.f43586OooO0o.position(0);
        GLES20.glVertexAttribPointer(this.f43594OooOOO0, 3, 5126, false, this.f43585OooO0Oo, (Buffer) this.f43586OooO0o);
        OooO0OO("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f43594OooOOO0);
        OooO0OO("glEnableVertexAttribArray aPositionHandle");
        this.f43586OooO0o.position(3);
        GLES20.glVertexAttribPointer(this.f43593OooOOO, 3, 5126, false, this.f43585OooO0Oo, (Buffer) this.f43586OooO0o);
        OooO0OO("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f43593OooOOO);
        OooO0OO("glEnableVertexAttribArray aTextureHandle");
        float[] fArr2 = this.f43588OooO0oO;
        Matrix.setIdentityM(fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f43591OooOO0O, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f43592OooOO0o, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OooO0OO("glDrawArrays");
        GLES20.glFinish();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@NotNull SurfaceTexture surfaceTexture) {
        this.f43596OooOOOo.compareAndSet(false, true);
        this.f43600OooOo00.requestRender();
    }

    @Override // com.ss.ugc.android.alpha_player.widget.GLTextureView.Oooo000, android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(@NotNull GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0074  */
    @Override // com.ss.ugc.android.alpha_player.widget.GLTextureView.Oooo000, android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(@NotNull GL10 gl10, @NotNull EGLConfig eGLConfig) {
        int iGlCreateProgram;
        OooO0OO oooO0OO = this.f43600OooOo00;
        String vertexSource = p339o0OOO0Oo.OooO0OO.OooO00o("vertex.sh", oooO0OO.getView().getResources());
        String fragmentSource = p339o0OOO0Oo.OooO0OO.OooO00o("frag.sh", oooO0OO.getView().getResources());
        Intrinsics.checkExpressionValueIsNotNull(vertexSource, "vertexSource");
        int iOooO0o0 = OooO0o0(35633, vertexSource);
        if (iOooO0o0 == 0) {
            iGlCreateProgram = 0;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(fragmentSource, "fragmentSource");
            int iOooO0o1 = OooO0o0(35632, fragmentSource);
            if (iOooO0o1 != 0) {
                iGlCreateProgram = GLES20.glCreateProgram();
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iOooO0o0);
                    OooO0OO("glAttachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iOooO0o1);
                    OooO0OO("glAttachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        Log.e("VideoRender", "Could not link programID: ");
                        Log.e("VideoRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        iGlCreateProgram = 0;
                    }
                }
            } else {
                iGlCreateProgram = 0;
            }
        }
        this.f43584OooO = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            return;
        }
        this.f43594OooOOO0 = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        OooO0OO("glGetAttribLocation aPosition");
        if (this.f43594OooOOO0 == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.f43593OooOOO = GLES20.glGetAttribLocation(this.f43584OooO, "aTextureCoord");
        OooO0OO("glGetAttribLocation aTextureCoord");
        if (this.f43593OooOOO == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f43591OooOO0O = GLES20.glGetUniformLocation(this.f43584OooO, "uMVPMatrix");
        OooO0OO("glGetUniformLocation uMVPMatrix");
        if (this.f43591OooOO0O == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.f43592OooOO0o = GLES20.glGetUniformLocation(this.f43584OooO, "uSTMatrix");
        OooO0OO("glGetUniformLocation uSTMatrix");
        if (this.f43592OooOO0o == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i = iArr2[0];
        this.f43590OooOO0 = i;
        GLES20.glBindTexture(36197, i);
        OooO0OO("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9728);
        GLES20.glTexParameterf(36197, 10240, 9729);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f43590OooOO0);
        this.f43598OooOOo0 = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(oooO0OO.getMeasuredWidth(), oooO0OO.getMeasuredHeight());
        SurfaceTexture surfaceTexture2 = this.f43598OooOOo0;
        if (surfaceTexture2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
        }
        surfaceTexture2.setOnFrameAvailableListener(this);
        SurfaceTexture surfaceTexture3 = this.f43598OooOOo0;
        if (surfaceTexture3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
        }
        Surface surface = new Surface(surfaceTexture3);
        OooO00o.InterfaceC0459OooO00o interfaceC0459OooO00o = this.f43597OooOOo;
        if (interfaceC0459OooO00o != null) {
            interfaceC0459OooO00o.OooO00o(surface);
        }
        this.f43596OooOOOo.compareAndSet(true, false);
    }

    @Override // o0OOO0OO.OooO00o
    public final void setScaleType(@NotNull ScaleType scaleType) {
        this.f43599OooOOoo = scaleType;
    }
}
