package io.agora.rtc.gl;

import android.opengl.GLES20;
import io.agora.rtc.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class YuvConverter {
    private static final String OES_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String RGB_FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String VERTEX_SHADER = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n";
    private int coeffsLoc;
    private long nativeHanlder;
    private boolean released;
    private GlShader shader;
    private VideoFrame.TextureBuffer.Type shaderTextureType;
    private int texMatrixLoc;
    private final GlTextureFrameBuffer textureFrameBuffer;
    private final ThreadUtils.ThreadChecker threadChecker;
    private int xUnitLoc;
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    /* JADX INFO: renamed from: io.agora.rtc.gl.YuvConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.released = false;
        this.nativeHanlder = 0L;
        threadChecker.checkIsOnValidThread();
        this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
    }

    private native long GPUFBOInit(int i, int i2);

    private native int GPUFBOReadFrame(long j, byte[] bArr, int i, int i2);

    private native void GPUFBORelease(long j);

    private native void GPUFBOResetFirstInit(long j);

    private native boolean GPUFBOValid();

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        String str;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        int i = AnonymousClass1.$SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i == 1) {
            str = OES_FRAGMENT_SHADER;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unsupported texture type.");
            }
            str = RGB_FRAGMENT_SHADER;
        }
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader(VERTEX_SHADER, str);
        this.shader = glShader2;
        glShader2.useProgram();
        this.texMatrixLoc = this.shader.getUniformLocation("texMatrix");
        this.xUnitLoc = this.shader.getUniformLocation("xUnit");
        this.coeffsLoc = this.shader.getUniformLocation("coeffs");
        GLES20.glUniform1i(this.shader.getUniformLocation("tex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        this.shader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((height + i2 + 1) * i);
        convert(byteBufferAllocateDirect, width, height, i, textureBuffer.getTextureId(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), textureBuffer.getType());
        int i3 = (i * height) + 0;
        int i4 = (i / 2) + i3;
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.limit(i3);
        ByteBuffer byteBufferSlice = byteBufferAllocateDirect.slice();
        byteBufferAllocateDirect.position(i3);
        int i5 = i2 * i;
        byteBufferAllocateDirect.limit(i3 + i5);
        ByteBuffer byteBufferSlice2 = byteBufferAllocateDirect.slice();
        byteBufferAllocateDirect.position(i4);
        byteBufferAllocateDirect.limit(i4 + i5);
        return JavaI420Buffer.wrap(width, height, byteBufferSlice, i, byteBufferSlice2, i, byteBufferAllocateDirect.slice(), i, null);
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        this.textureFrameBuffer.release();
        if (GPUFBOValid()) {
            GPUFBORelease(this.nativeHanlder);
        }
    }

    @Deprecated
    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        convert(byteBuffer, i, i2, i3, i4, fArr, VideoFrame.TextureBuffer.Type.OES);
    }

    private void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, VideoFrame.TextureBuffer.Type type) {
        int iGPUFBOReadFrame;
        int i5;
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (type != this.shaderTextureType) {
                initShader(type);
            }
            this.shader.useProgram();
            if (i3 % 8 != 0) {
                throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
            }
            if (i3 >= i) {
                int i6 = (i + 3) / 4;
                int i7 = (i + 7) / 8;
                int i8 = (i2 + 1) / 2;
                int i9 = i2 + i8;
                if (byteBuffer.capacity() >= i3 * i9) {
                    float[] fArrMultiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                    int i10 = i3 / 4;
                    this.textureFrameBuffer.setSize(i10, i9);
                    GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
                    GlUtil.checkNoGLES2Error("glBindFramebuffer");
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(type.getGlTarget(), i4);
                    GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, fArrMultiplyMatrices, 0);
                    GLES20.glViewport(0, 0, i6, i2);
                    float f = i;
                    GLES20.glUniform2f(this.xUnitLoc, fArrMultiplyMatrices[0] / f, fArrMultiplyMatrices[1] / f);
                    GLES20.glUniform4f(this.coeffsLoc, 0.299f, 0.587f, 0.114f, 0.0f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(0, i2, i7, i8);
                    GLES20.glUniform2f(this.xUnitLoc, (fArrMultiplyMatrices[0] * 2.0f) / f, (fArrMultiplyMatrices[1] * 2.0f) / f);
                    GLES20.glUniform4f(this.coeffsLoc, -0.169f, -0.331f, 0.499f, 0.5f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(i3 / 8, i2, i7, i8);
                    GLES20.glUniform4f(this.coeffsLoc, 0.499f, -0.418f, -0.0813f, 0.5f);
                    GLES20.glDrawArrays(5, 0, 4);
                    if (GPUFBOValid()) {
                        if (this.nativeHanlder == 0) {
                            this.nativeHanlder = GPUFBOInit(i10, i9);
                        }
                        iGPUFBOReadFrame = GPUFBOReadFrame(this.nativeHanlder, byteBuffer.array(), i10, i9);
                    } else {
                        iGPUFBOReadFrame = -1;
                    }
                    if (iGPUFBOReadFrame != 0) {
                        i5 = 36160;
                        GLES20.glReadPixels(0, 0, i10, i9, 6408, 5121, byteBuffer);
                    } else {
                        i5 = 36160;
                    }
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(i5, r14);
                    GLES20.glBindTexture(3553, r14);
                    GLES20.glBindTexture(type.getGlTarget(), 0);
                    return;
                }
                throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
            }
            throw new IllegalArgumentException("Invalid stride, must >= width");
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }
}
