package p320o0O0oOoO;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.android.billingclient.api.oo0o0Oo;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO implements GLSurfaceView.Renderer, o00O0OOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f36800Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f36805OoooO0;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public VideoDecoderOutputBuffer f36808OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final float[] f36799o000oOoO = {1.164f, 1.164f, 1.164f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -0.392f, 2.017f, 1.596f, -0.813f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final float[] f36795OoooOOO = {1.164f, 1.164f, 1.164f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -0.213f, 2.112f, 1.793f, -0.533f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final float[] f36796OoooOOo = {1.168f, 1.168f, 1.168f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -0.188f, 2.148f, 1.683f, -0.652f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final String[] f36797OoooOo0 = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final FloatBuffer f36798OoooOoO = oo0o0Oo.OooO0OO(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int[] f36801Oooo0o = new int[3];

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final AtomicReference<VideoDecoderOutputBuffer> f36802Oooo0oO = new AtomicReference<>();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public FloatBuffer[] f36803Oooo0oo = new FloatBuffer[3];

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int[] f36806OoooO00 = new int[3];

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int[] f36807OoooO0O = new int[3];

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int[] f36804OoooO = new int[3];

    public o00O0OO() {
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f36807OoooO0O;
            this.f36804OoooO[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer andSet = this.f36802Oooo0oO.getAndSet(null);
        if (andSet == null && this.f36808OoooOO0 == null) {
            return;
        }
        if (andSet != null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f36808OoooOO0;
            if (videoDecoderOutputBuffer != null) {
                videoDecoderOutputBuffer.release();
            }
            this.f36808OoooOO0 = andSet;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.f36808OoooOO0;
        Objects.requireNonNull(videoDecoderOutputBuffer2);
        float[] fArr = f36795OoooOOO;
        int i = videoDecoderOutputBuffer2.colorspace;
        if (i == 1) {
            fArr = f36799o000oOoO;
        } else if (i == 3) {
            fArr = f36796OoooOOo;
        }
        GLES20.glUniformMatrix3fv(this.f36805OoooO0, 1, false, fArr, 0);
        int[] iArr = videoDecoderOutputBuffer2.yuvStrides;
        Objects.requireNonNull(iArr);
        ByteBuffer[] byteBufferArr = videoDecoderOutputBuffer2.yuvPlanes;
        Objects.requireNonNull(byteBufferArr);
        int i2 = 0;
        while (i2 < 3) {
            int i3 = i2 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
            GLES20.glActiveTexture(33984 + i2);
            GLES20.glBindTexture(3553, this.f36801Oooo0o[i2]);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
            i2++;
        }
        int i4 = (iArr[0] + 1) / 2;
        int[] iArr2 = {videoDecoderOutputBuffer2.width, i4, i4};
        for (int i5 = 0; i5 < 3; i5++) {
            if (this.f36807OoooO0O[i5] != iArr2[i5] || this.f36804OoooO[i5] != iArr[i5]) {
                o00000O0.OooO0Oo(iArr[i5] != 0);
                float f = iArr2[i5] / iArr[i5];
                this.f36803Oooo0oo[i5] = oo0o0Oo.OooO0OO(new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 1.0f});
                GLES20.glVertexAttribPointer(this.f36806OoooO00[i5], 2, 5126, false, 0, (Buffer) this.f36803Oooo0oo[i5]);
                this.f36807OoooO0O[i5] = iArr2[i5];
                this.f36804OoooO[i5] = iArr[i5];
            }
        }
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
        oo0o0Oo.OooO0O0();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        oo0o0Oo.OooO0O0();
        oo0o0Oo.OooO00o(35633, "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", iGlCreateProgram);
        oo0o0Oo.OooO00o(35632, "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n", iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            Log.e("GlUtil", strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
        }
        oo0o0Oo.OooO0O0();
        this.f36800Oooo = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f36800Oooo, "in_pos");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) f36798OoooOoO);
        this.f36806OoooO00[0] = GLES20.glGetAttribLocation(this.f36800Oooo, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f36806OoooO00[0]);
        this.f36806OoooO00[1] = GLES20.glGetAttribLocation(this.f36800Oooo, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f36806OoooO00[1]);
        this.f36806OoooO00[2] = GLES20.glGetAttribLocation(this.f36800Oooo, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f36806OoooO00[2]);
        oo0o0Oo.OooO0O0();
        this.f36805OoooO0 = GLES20.glGetUniformLocation(this.f36800Oooo, "mColorConversion");
        oo0o0Oo.OooO0O0();
        GLES20.glGenTextures(3, this.f36801Oooo0o, 0);
        for (int i = 0; i < 3; i++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f36800Oooo, f36797OoooOo0[i]), i);
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.f36801Oooo0o[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        oo0o0Oo.OooO0O0();
        oo0o0Oo.OooO0O0();
    }
}
