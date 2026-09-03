package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p080o000OoO.OooO;
import p083o000Ooo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements OooOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f6287OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f6288OooO0Oo;

    public static final class OooO00o implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final GLSurfaceView f6293OooO0Oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public androidx.media3.common.util.OooO00o f6298OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f6299OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public OooO f6300OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final float[] f6290OooOOO0 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String[] f6289OooOOO = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final FloatBuffer f6291OooOOOO = (FloatBuffer) ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f}).flip();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f6295OooO0o0 = new int[3];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int[] f6294OooO0o = new int[3];

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int[] f6296OooO0oO = new int[3];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int[] f6297OooO0oo = new int[3];

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final AtomicReference<OooO> f6292OooO = new AtomicReference<>();

        public OooO00o(GLSurfaceView gLSurfaceView) {
            this.f6293OooO0Oo = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f6296OooO0oO;
                this.f6297OooO0oo[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            OooO andSet = this.f6292OooO.getAndSet(null);
            if (andSet == null && this.f6300OooOO0o == null) {
                return;
            }
            if (andSet != null) {
                OooO oooO = this.f6300OooOO0o;
                if (oooO != null) {
                    oooO.getClass();
                    throw null;
                }
                this.f6300OooOO0o = andSet;
            }
            this.f6300OooOO0o.getClass();
            GLES20.glUniformMatrix3fv(this.f6299OooOO0O, 1, false, f6290OooOOO0, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f6294OooO0o;
            try {
                androidx.media3.common.util.OooO00o oooO00o = new androidx.media3.common.util.OooO00o("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f6298OooOO0 = oooO00o;
                GLES20.glVertexAttribPointer(oooO00o.OooO0O0("in_pos"), 2, 5126, false, 0, (Buffer) f6291OooOOOO);
                iArr[0] = this.f6298OooOO0.OooO0O0("in_tc_y");
                iArr[1] = this.f6298OooOO0.OooO0O0("in_tc_u");
                iArr[2] = this.f6298OooOO0.OooO0O0("in_tc_v");
                this.f6299OooOO0O = GLES20.glGetUniformLocation(this.f6298OooOO0.f6262OooO00o, "mColorConversion");
                GlUtil.OooO0O0();
                int[] iArr2 = this.f6295OooO0o0;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i = 0; i < 3; i++) {
                        androidx.media3.common.util.OooO00o oooO00o2 = this.f6298OooOO0;
                        GLES20.glUniform1i(GLES20.glGetUniformLocation(oooO00o2.f6262OooO00o, f6289OooOOO[i]), i);
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
    public OooOO0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(OooO oooO) {
        OooO00o oooO00o = this.f6288OooO0Oo;
        if (oooO00o.f6292OooO.getAndSet(oooO) != null) {
            throw null;
        }
        oooO00o.f6293OooO0Oo.requestRender();
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o oooO00o = new OooO00o(this);
        this.f6288OooO0Oo = oooO00o;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(oooO00o);
        setRenderMode(0);
    }
}
