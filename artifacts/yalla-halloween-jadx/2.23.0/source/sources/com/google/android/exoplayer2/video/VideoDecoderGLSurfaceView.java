package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p206o00o0oOO.o0O000;
import p247o00oo0oO.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements oo0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f14336OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f14337OooO0Oo;

    public static final class OooO00o implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final GLSurfaceView f14342OooO0Oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public com.google.android.exoplayer2.util.OooO00o f14347OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f14348OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public o0O000 f14349OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final float[] f14339OooOOO0 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String[] f14338OooOOO = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final FloatBuffer f14340OooOOOO = GlUtil.OooO0Oo(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f14344OooO0o0 = new int[3];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int[] f14343OooO0o = new int[3];

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int[] f14345OooO0oO = new int[3];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int[] f14346OooO0oo = new int[3];

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final AtomicReference<o0O000> f14341OooO = new AtomicReference<>();

        public OooO00o(GLSurfaceView gLSurfaceView) {
            this.f14342OooO0Oo = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f14345OooO0oO;
                this.f14346OooO0oo[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            o0O000 andSet = this.f14341OooO.getAndSet(null);
            if (andSet == null && this.f14349OooOO0o == null) {
                return;
            }
            if (andSet != null) {
                o0O000 o0o001 = this.f14349OooOO0o;
                if (o0o001 != null) {
                    o0o001.getClass();
                    throw null;
                }
                this.f14349OooOO0o = andSet;
            }
            this.f14349OooOO0o.getClass();
            GLES20.glUniformMatrix3fv(this.f14348OooOO0O, 1, false, f14339OooOOO0, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f14343OooO0o;
            try {
                com.google.android.exoplayer2.util.OooO00o oooO00o = new com.google.android.exoplayer2.util.OooO00o("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f14347OooOO0 = oooO00o;
                GLES20.glVertexAttribPointer(oooO00o.OooO0O0("in_pos"), 2, 5126, false, 0, (Buffer) f14340OooOOOO);
                iArr[0] = this.f14347OooOO0.OooO0O0("in_tc_y");
                iArr[1] = this.f14347OooOO0.OooO0O0("in_tc_u");
                iArr[2] = this.f14347OooOO0.OooO0O0("in_tc_v");
                this.f14348OooOO0O = GLES20.glGetUniformLocation(this.f14347OooOO0.f14321OooO00o, "mColorConversion");
                GlUtil.OooO0O0();
                int[] iArr2 = this.f14344OooO0o0;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i = 0; i < 3; i++) {
                        com.google.android.exoplayer2.util.OooO00o oooO00o2 = this.f14347OooOO0;
                        GLES20.glUniform1i(GLES20.glGetUniformLocation(oooO00o2.f14321OooO00o, f14338OooOOO[i]), i);
                        GLES20.glActiveTexture(33984 + i);
                        GlUtil.OooO00o(3553, iArr2[i]);
                    }
                    GlUtil.OooO0O0();
                } catch (GlUtil.GlException e) {
                    Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
                }
                GlUtil.OooO0O0();
            } catch (GlUtil.GlException e2) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e2);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public oo0O getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(o0O000 o0o001) {
        OooO00o oooO00o = this.f14337OooO0Oo;
        if (oooO00o.f14341OooO.getAndSet(o0o001) != null) {
            throw null;
        }
        oooO00o.f14342OooO0Oo.requestRender();
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o oooO00o = new OooO00o(this);
        this.f14337OooO0Oo = oooO00o;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(oooO00o);
        setRenderMode(0);
    }
}
