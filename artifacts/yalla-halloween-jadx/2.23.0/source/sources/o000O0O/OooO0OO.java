package o000O0O;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public androidx.media3.common.util.OooO00o f34681OooO00o;

    public final void OooO00o() {
        try {
            androidx.media3.common.util.OooO00o oooO00o = new androidx.media3.common.util.OooO00o("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f34681OooO00o = oooO00o;
            GLES20.glGetUniformLocation(oooO00o.f6262OooO00o, "uMvpMatrix");
            GLES20.glGetUniformLocation(this.f34681OooO00o.f6262OooO00o, "uTexMatrix");
            this.f34681OooO00o.OooO0O0("aPosition");
            this.f34681OooO00o.OooO0O0("aTexCoords");
            GLES20.glGetUniformLocation(this.f34681OooO00o.f6262OooO00o, "uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
