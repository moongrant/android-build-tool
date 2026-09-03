package androidx.media3.common.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GlUtil {

    public static final class GlException extends Exception {
    }

    public static void OooO00o(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        OooO0O0();
        GLES20.glTexParameteri(i, 10240, 9729);
        OooO0O0();
        GLES20.glTexParameteri(i, 10241, 9729);
        OooO0O0();
        GLES20.glTexParameteri(i, 10242, 33071);
        OooO0O0();
        GLES20.glTexParameteri(i, 10243, 33071);
        OooO0O0();
    }

    public static void OooO0O0() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString());
        }
    }

    public static void OooO0OO(String str, boolean z) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    public static FloatBuffer OooO0Oo(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
