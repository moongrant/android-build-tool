package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final float[] f8302OooO = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final float[] f8303OooOO0 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final float[] f8304OooOO0O = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f8305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f8306OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public androidx.media3.common.util.OooO00o f8307OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8309OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f8310OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8311OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f8312OooO0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8313OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final FloatBuffer f8314OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final FloatBuffer f8315OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8316OooO0Oo;

        public OooO00o(Projection.OooO0O0 oooO0O0) {
            float[] fArr = oooO0O0.f8330OooO0OO;
            this.f8313OooO00o = fArr.length / 3;
            this.f8314OooO0O0 = GlUtil.OooO0Oo(fArr);
            this.f8315OooO0OO = GlUtil.OooO0Oo(oooO0O0.f8331OooO0Oo);
            int i = oooO0O0.f8329OooO0O0;
            if (i == 1) {
                this.f8316OooO0Oo = 5;
            } else if (i != 2) {
                this.f8316OooO0Oo = 4;
            } else {
                this.f8316OooO0Oo = 6;
            }
        }
    }

    public static boolean OooO0O0(Projection projection) {
        Projection.OooO0O0[] oooO0O0Arr = projection.f8323OooO00o.f8327OooO00o;
        if (oooO0O0Arr.length != 1 || oooO0O0Arr[0].f8328OooO00o != 0) {
            return false;
        }
        Projection.OooO0O0[] oooO0O0Arr2 = projection.f8324OooO0O0.f8327OooO00o;
        return oooO0O0Arr2.length == 1 && oooO0O0Arr2[0].f8328OooO00o == 0;
    }

    public final void OooO00o() {
        try {
            androidx.media3.common.util.OooO00o oooO00o = new androidx.media3.common.util.OooO00o("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f8307OooO0OO = oooO00o;
            this.f8308OooO0Oo = GLES20.glGetUniformLocation(oooO00o.f6942OooO00o, "uMvpMatrix");
            this.f8310OooO0o0 = GLES20.glGetUniformLocation(this.f8307OooO0OO.f6942OooO00o, "uTexMatrix");
            this.f8309OooO0o = this.f8307OooO0OO.OooO0O0("aPosition");
            this.f8311OooO0oO = this.f8307OooO0OO.OooO0O0("aTexCoords");
            this.f8312OooO0oo = GLES20.glGetUniformLocation(this.f8307OooO0OO.f6942OooO00o, "uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
