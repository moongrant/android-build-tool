package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final float[] f14357OooO = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final float[] f14358OooOO0 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final float[] f14359OooOO0O = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f14360OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f14361OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public com.google.android.exoplayer2.util.OooO00o f14362OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14363OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14364OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14365OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14366OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14367OooO0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14368OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final FloatBuffer f14369OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final FloatBuffer f14370OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f14371OooO0Oo;

        public OooO00o(Projection.OooO0O0 oooO0O0) {
            float[] fArr = oooO0O0.f14385OooO0OO;
            this.f14368OooO00o = fArr.length / 3;
            this.f14369OooO0O0 = GlUtil.OooO0Oo(fArr);
            this.f14370OooO0OO = GlUtil.OooO0Oo(oooO0O0.f14386OooO0Oo);
            int i = oooO0O0.f14384OooO0O0;
            if (i == 1) {
                this.f14371OooO0Oo = 5;
            } else if (i != 2) {
                this.f14371OooO0Oo = 4;
            } else {
                this.f14371OooO0Oo = 6;
            }
        }
    }

    public static boolean OooO0O0(Projection projection) {
        Projection.OooO0O0[] oooO0O0Arr = projection.f14378OooO00o.f14382OooO00o;
        if (oooO0O0Arr.length != 1 || oooO0O0Arr[0].f14383OooO00o != 0) {
            return false;
        }
        Projection.OooO0O0[] oooO0O0Arr2 = projection.f14379OooO0O0.f14382OooO00o;
        return oooO0O0Arr2.length == 1 && oooO0O0Arr2[0].f14383OooO00o == 0;
    }

    public final void OooO00o() {
        try {
            com.google.android.exoplayer2.util.OooO00o oooO00o = new com.google.android.exoplayer2.util.OooO00o("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f14362OooO0OO = oooO00o;
            this.f14363OooO0Oo = GLES20.glGetUniformLocation(oooO00o.f14321OooO00o, "uMvpMatrix");
            this.f14365OooO0o0 = GLES20.glGetUniformLocation(this.f14362OooO0OO.f14321OooO00o, "uTexMatrix");
            this.f14364OooO0o = this.f14362OooO0OO.OooO0O0("aPosition");
            this.f14366OooO0oO = this.f14362OooO0OO.OooO0O0("aTexCoords");
            this.f14367OooO0oo = GLES20.glGetUniformLocation(this.f14362OooO0OO.f14321OooO00o, "uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
