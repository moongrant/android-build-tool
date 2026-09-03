package io.agora.rtc.gl;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import android.opengl.GLES20;
import android.util.Log;
import androidx.appcompat.widget.o00000O0;
import com.facebook.internal.security.CertificateUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class GlShader {
    private static final String TAG = "GlShader";
    private int program;

    public GlShader(String str, String str2) {
        int iCompileShader = compileShader(35633, str);
        int iCompileShader2 = compileShader(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.program = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("glCreateProgram() failed. GLES20 error: ");
            sbOooO0o0.append(GLES20.glGetError());
            throw new RuntimeException(sbOooO0o0.toString());
        }
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
        GLES20.glAttachShader(this.program, iCompileShader2);
        GLES20.glLinkProgram(this.program);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(iCompileShader);
            GLES20.glDeleteShader(iCompileShader2);
            GlUtil.checkNoGLES2Error("Creating GlShader");
        } else {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Could not link program: ");
            sbOooO0o1.append(GLES20.glGetProgramInfoLog(this.program));
            Log.e(TAG, sbOooO0o1.toString());
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
    }

    private static int compileShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("glCreateShader() failed. GLES20 error: ");
            sbOooO0o0.append(GLES20.glGetError());
            throw new RuntimeException(sbOooO0o0.toString());
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            GlUtil.checkNoGLES2Error("compileShader");
            return iGlCreateShader;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("Could not compile shader ", i, CertificateUtil.DELIMITER);
        sbOooO00o.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e(TAG, sbOooO00o.toString());
        throw new RuntimeException(GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (iGlGetAttribLocation >= 0) {
            return iGlGetAttribLocation;
        }
        throw new RuntimeException(OooO0OO.OooO00o("Could not locate '", str, "' in program"));
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (iGlGetUniformLocation >= 0) {
            return iGlGetUniformLocation;
        }
        throw new RuntimeException(OooO0OO.OooO00o("Could not locate uniform '", str, "' in program"));
    }

    public void release() {
        Log.d(TAG, "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }

    public void useProgram() {
        int i = this.program;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        GLES20.glUseProgram(i);
        GlUtil.checkNoGLES2Error("glUseProgram");
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program == -1) {
            throw new RuntimeException("The program has been released");
        }
        int attribLocation = getAttribLocation(str);
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, (Buffer) floatBuffer);
        GlUtil.checkNoGLES2Error("setVertexAttribArray");
    }
}
