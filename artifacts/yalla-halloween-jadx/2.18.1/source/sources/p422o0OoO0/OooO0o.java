package p422o0OoO0;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.uc.crashsdk.export.LogType;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.NativeConstants;
import org.jetbrains.annotations.NotNull;
import p042Ooooo0o.o000O0O0;
import p425o0OoO0OO.o0Oo0oo;
import p548o0oO0O00.o000O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO0OO {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public FloatBuffer f39817Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f39818OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f39819OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float[] f39820OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f39821OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f39822OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f39823OoooOOO;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public SurfaceTexture f39826OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooO0OO.OooO00o f39827OoooOoo;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f39829Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f39830o000oOoO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f39815Oooo0o = 20;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float[] f39816Oooo0oO = {-1.0f, -1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, -1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, 1.0f, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float[] f39814Oooo = new float[16];

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final AtomicBoolean f39824OoooOOo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final AtomicBoolean f39825OoooOo0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ScaleType f39828Ooooo00 = ScaleType.ScaleAspectFill;

    public OooO0o(@NotNull o0Oo0oo o0oo0oo2) {
        this.f39829Ooooo0o = o0oo0oo2;
        float[] fArr = new float[16];
        this.f39820OoooO00 = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.f39816Oooo0oO.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Intrinsics.checkExpressionValueIsNotNull(floatBufferAsFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
        this.f39817Oooo0oo = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f39816Oooo0oO).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // p422o0OoO0.OooO0OO
    public final void OooO00o() {
        this.f39824OoooOOo.compareAndSet(false, true);
        Log.i("VideoRender", "onFirstFrame:    canDraw = " + this.f39824OoooOOo.get());
        this.f39829Ooooo0o.requestRender();
    }

    @Override // p422o0OoO0.OooO0OO
    public final void OooO0O0() {
        this.f39824OoooOOo.compareAndSet(true, false);
        Log.i("VideoRender", "onCompletion:   canDraw = " + this.f39824OoooOOo.get());
        this.f39829Ooooo0o.requestRender();
    }

    @Override // p422o0OoO0.OooO0OO
    public final void OooO0OO(@NotNull OooO0OO.OooO00o oooO00o) {
        this.f39827OoooOoo = oooO00o;
    }

    @Override // p422o0OoO0.OooO0OO
    public final void OooO0Oo(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float[] fArrOooO0O0;
        float f8 = 0;
        if (f <= f8 || f2 <= f8 || f3 <= f8 || f4 <= f8) {
            return;
        }
        ScaleType scaleType = this.f39828Ooooo00;
        float f9 = f / f2;
        float f10 = f3 / f4;
        float f11 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f9 > f10) {
            f6 = (1.0f - (f2 / (f / f10))) / 2.0f;
            f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            f5 = (1.0f - (f / (f2 * f10))) / 2.0f;
            f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        switch (o000O00O.OooO00o.f44599OooO00o[scaleType.ordinal()]) {
            case 1:
                if (f9 > f10) {
                    f11 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                    f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f7 = (1.0f - ((f / f10) / f2)) / 2.0f;
                }
                fArrOooO0O0 = o000O00O.OooO0O0(f11, f7, f11, f7);
                break;
            case 2:
                fArrOooO0O0 = o000O00O.OooO00o(f5, f6, f5, f6);
                break;
            case 3:
                fArrOooO0O0 = o000O00O.OooO00o(f5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5, f6 * 2.0f);
                break;
            case 4:
                fArrOooO0O0 = o000O00O.OooO00o(f5, f6 * 2.0f, f5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                break;
            case 5:
                fArrOooO0O0 = o000O00O.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f6, f5 * 2.0f, f6);
                break;
            case 6:
                fArrOooO0O0 = o000O00O.OooO00o(f5 * 2.0f, f6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f6);
                break;
            case 7:
                fArrOooO0O0 = o000O00O.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                break;
            case 8:
                fArrOooO0O0 = o000O00O.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                break;
            case 9:
                fArrOooO0O0 = o000O00O.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                break;
            case 10:
                fArrOooO0O0 = o000O00O.OooO0O0(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                break;
            default:
                fArrOooO0O0 = o000O00O.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                break;
        }
        Intrinsics.checkExpressionValueIsNotNull(fArrOooO0O0, "TextureCropUtil.calculat… videoWidth, videoHeight)");
        this.f39816Oooo0oO = fArrOooO0O0;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArrOooO0O0.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Intrinsics.checkExpressionValueIsNotNull(floatBufferAsFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
        this.f39817Oooo0oo = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f39816Oooo0oO).position(0);
    }

    public final int OooO0o(int i, String str) {
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

    public final void OooO0o0(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("VideoRender", str + ": glError " + iGlGetError);
        }
    }

    @Override // com.ss.ugc.android.alpha_player.widget.GLTextureView.Oooo000, android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(@NotNull GL10 gl10) {
        if (this.f39825OoooOo0.compareAndSet(true, false)) {
            try {
                SurfaceTexture surfaceTexture = this.f39826OoooOoO;
                if (surfaceTexture == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                }
                surfaceTexture.updateTexImage();
            } catch (Exception e) {
                e.printStackTrace();
            }
            SurfaceTexture surfaceTexture2 = this.f39826OoooOoO;
            if (surfaceTexture2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
            }
            surfaceTexture2.getTransformMatrix(this.f39820OoooO00);
        }
        GLES20.glClear(LogType.UNEXP_RESTART);
        GLES20.glClearColor(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        if (!this.f39824OoooOOo.get()) {
            GLES20.glFinish();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(NativeConstants.TLS1_1_VERSION, NativeConstants.TLS1_2_VERSION);
        GLES20.glUseProgram(this.f39819OoooO0);
        OooO0o0("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f39821OoooO0O);
        this.f39817Oooo0oo.position(0);
        GLES20.glVertexAttribPointer(this.f39830o000oOoO, 3, 5126, false, this.f39815Oooo0o, (Buffer) this.f39817Oooo0oo);
        OooO0o0("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f39830o000oOoO);
        OooO0o0("glEnableVertexAttribArray aPositionHandle");
        this.f39817Oooo0oo.position(3);
        GLES20.glVertexAttribPointer(this.f39823OoooOOO, 3, 5126, false, this.f39815Oooo0o, (Buffer) this.f39817Oooo0oo);
        OooO0o0("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f39823OoooOOO);
        OooO0o0("glEnableVertexAttribArray aTextureHandle");
        Matrix.setIdentityM(this.f39814Oooo, 0);
        GLES20.glUniformMatrix4fv(this.f39818OoooO, 1, false, this.f39814Oooo, 0);
        GLES20.glUniformMatrix4fv(this.f39822OoooOO0, 1, false, this.f39820OoooO00, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OooO0o0("glDrawArrays");
        GLES20.glFinish();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@NotNull SurfaceTexture surfaceTexture) {
        this.f39825OoooOo0.compareAndSet(false, true);
        this.f39829Ooooo0o.requestRender();
    }

    @Override // com.ss.ugc.android.alpha_player.widget.GLTextureView.Oooo000, android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(@NotNull GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0076  */
    @Override // com.ss.ugc.android.alpha_player.widget.GLTextureView.Oooo000, android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(@NotNull GL10 gl10, @NotNull EGLConfig eGLConfig) {
        int iGlCreateProgram;
        String vertexSource = o000O0O0.OooO0OO("vertex.sh", this.f39829Ooooo0o.getView().getResources());
        String fragmentSource = o000O0O0.OooO0OO("frag.sh", this.f39829Ooooo0o.getView().getResources());
        Intrinsics.checkExpressionValueIsNotNull(vertexSource, "vertexSource");
        int iOooO0o = OooO0o(35633, vertexSource);
        if (iOooO0o == 0) {
            iGlCreateProgram = 0;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(fragmentSource, "fragmentSource");
            int iOooO0o2 = OooO0o(35632, fragmentSource);
            if (iOooO0o2 != 0) {
                iGlCreateProgram = GLES20.glCreateProgram();
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iOooO0o);
                    OooO0o0("glAttachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iOooO0o2);
                    OooO0o0("glAttachShader");
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
        this.f39819OoooO0 = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            return;
        }
        this.f39830o000oOoO = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        OooO0o0("glGetAttribLocation aPosition");
        if (this.f39830o000oOoO == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.f39823OoooOOO = GLES20.glGetAttribLocation(this.f39819OoooO0, "aTextureCoord");
        OooO0o0("glGetAttribLocation aTextureCoord");
        if (this.f39823OoooOOO == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f39818OoooO = GLES20.glGetUniformLocation(this.f39819OoooO0, "uMVPMatrix");
        OooO0o0("glGetUniformLocation uMVPMatrix");
        if (this.f39818OoooO == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.f39822OoooOO0 = GLES20.glGetUniformLocation(this.f39819OoooO0, "uSTMatrix");
        OooO0o0("glGetUniformLocation uSTMatrix");
        if (this.f39822OoooOO0 == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i = iArr2[0];
        this.f39821OoooO0O = i;
        GLES20.glBindTexture(36197, i);
        OooO0o0("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9728);
        GLES20.glTexParameterf(36197, 10240, 9729);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f39821OoooO0O);
        this.f39826OoooOoO = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.f39829Ooooo0o.getMeasuredWidth(), this.f39829Ooooo0o.getMeasuredHeight());
        SurfaceTexture surfaceTexture2 = this.f39826OoooOoO;
        if (surfaceTexture2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
        }
        surfaceTexture2.setOnFrameAvailableListener(this);
        SurfaceTexture surfaceTexture3 = this.f39826OoooOoO;
        if (surfaceTexture3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
        }
        Surface surface = new Surface(surfaceTexture3);
        OooO0OO.OooO00o oooO00o = this.f39827OoooOoo;
        if (oooO00o != null) {
            oooO00o.OooO00o(surface);
        }
        this.f39825OoooOo0.compareAndSet(true, false);
    }

    @Override // p422o0OoO0.OooO0OO
    public final void setScaleType(@NotNull ScaleType scaleType) {
        this.f39828Ooooo00 = scaleType;
    }
}
