package com.android.billingclient.api;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0o0Oo {
    public static void OooO00o(int i, String str, int i2) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb = new StringBuilder(str.length() + o0OO00O.OooO00o(strGlGetShaderInfoLog, 10));
            sb.append(strGlGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(str);
            Log.e("GlUtil", sb.toString());
        }
        GLES20.glAttachShader(i2, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        OooO0O0();
    }

    public static void OooO0O0() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            Log.e("GlUtil", strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
        }
    }

    public static FloatBuffer OooO0OO(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
