package androidx.media3.common.util;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f6942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C0141OooO00o[] f6943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0[] f6944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f6945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f6946OooO0o0;

    /* JADX INFO: renamed from: androidx.media3.common.util.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0141OooO00o {
        public C0141OooO00o(String str) {
        }
    }

    public static final class OooO0O0 {
        public OooO0O0(String str) {
        }
    }

    public OooO00o(String str, String str2) throws GlUtil.GlException {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f6942OooO00o = iGlCreateProgram;
        GlUtil.OooO0O0();
        OooO00o(iGlCreateProgram, 35633, str);
        OooO00o(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i = 1;
        GlUtil.OooO0OO("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f6945OooO0Oo = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f6943OooO0O0 = new C0141OooO00o[iArr2[0]];
        int i2 = 0;
        while (i2 < iArr2[0]) {
            int i3 = this.f6942OooO00o;
            int[] iArr3 = new int[i];
            GLES20.glGetProgramiv(i3, 35722, iArr3, 0);
            int i4 = iArr3[0];
            byte[] bArr3 = new byte[i4];
            GLES20.glGetActiveAttrib(i3, i2, i4, new int[i], 0, new int[i], 0, new int[i], 0, bArr3, 0);
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    bArr2 = bArr3;
                    i5 = i4;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i5] == 0) {
                        break;
                    }
                    i5++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i5);
            GLES20.glGetAttribLocation(i3, str3);
            C0141OooO00o c0141OooO00o = new C0141OooO00o(str3);
            this.f6943OooO0O0[i2] = c0141OooO00o;
            this.f6945OooO0Oo.put(str3, c0141OooO00o);
            i2++;
            i = 1;
        }
        this.f6946OooO0o0 = new HashMap();
        int i6 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f6942OooO00o, 35718, iArr4, 0);
        this.f6944OooO0OO = new OooO0O0[iArr4[0]];
        int i7 = 0;
        while (i7 < iArr4[0]) {
            int i8 = this.f6942OooO00o;
            int[] iArr5 = new int[i6];
            GLES20.glGetProgramiv(i8, 35719, iArr5, 0);
            int i9 = iArr5[0];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[i6], 0, new int[i6], 0, new int[i6], 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            String str4 = new String(bArr, 0, i10);
            GLES20.glGetUniformLocation(i8, str4);
            OooO0O0 oooO0O0 = new OooO0O0(str4);
            this.f6944OooO0OO[i7] = oooO0O0;
            this.f6946OooO0o0.put(str4, oooO0O0);
            i7++;
            i6 = 1;
        }
        GlUtil.OooO0O0();
    }

    public static void OooO00o(int i, int i2, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.OooO0OO(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.OooO0O0();
    }

    public final int OooO0O0(String str) throws GlUtil.GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f6942OooO00o, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GlUtil.OooO0O0();
        return iGlGetAttribLocation;
    }
}
