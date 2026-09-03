package io.agora.rtc.video;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.mediaio.AgoraSurfaceView;
import io.agora.rtc.mediaio.MediaIO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public class AgoraVideoDebugger {
    public static final boolean DIRECT_OES = false;
    public static final boolean ENABLE_DEBUG = false;
    public static final String TAG = "AgoraVideoDebugger";
    public static final boolean VERBOSE = false;
    public static final boolean VERBOSE_DETAIL = false;
    static DebugViewHolder capturePreviewHolder = null;
    static int droppedTextureFrameCnt = 0;
    static DebugViewHolder i420BufferPreviewHolder = null;
    static DebugViewHolder observerPreviewHolder = null;
    static DebugViewHolder textureBufferPreviewHolder = null;
    static int textureFrameCnt = 0;
    static boolean yuvRender = false;

    public static class DebugViewHolder {
        AgoraSurfaceView agoraSurfaceView;
        boolean applyRotation;
        boolean followSourceDimension;
        boolean mirror;
        boolean isInitialized = false;
        int lastSourceWidth = 0;
        int lastSourceHeight = 0;

        public DebugViewHolder(AgoraSurfaceView agoraSurfaceView, boolean z, boolean z2, boolean z3) {
            this.agoraSurfaceView = agoraSurfaceView;
            this.followSourceDimension = z;
            this.mirror = z2;
            this.applyRotation = z3;
        }

        public void init(EglBase.Context context, MediaIO.BufferType bufferType, MediaIO.PixelFormat pixelFormat) {
            if (this.isInitialized) {
                return;
            }
            this.agoraSurfaceView.init(context);
            this.agoraSurfaceView.setBufferType(bufferType);
            this.agoraSurfaceView.setPixelFormat(pixelFormat);
            this.agoraSurfaceView.setMirror(this.mirror);
            this.agoraSurfaceView.onInitialize();
            this.agoraSurfaceView.onStart();
            this.isInitialized = true;
        }

        public void reset() {
            AgoraSurfaceView agoraSurfaceView = this.agoraSurfaceView;
            if (agoraSurfaceView != null) {
                if (this.isInitialized) {
                    agoraSurfaceView.onStop();
                    this.agoraSurfaceView.onDispose();
                }
                this.agoraSurfaceView = null;
            }
            this.followSourceDimension = false;
            this.mirror = false;
            this.applyRotation = false;
            this.lastSourceWidth = 0;
            this.lastSourceHeight = 0;
            this.isInitialized = false;
        }

        public void setupViewUI(final int i, final int i2, final int i3) {
            if (this.followSourceDimension) {
                if (this.lastSourceWidth == i2 && this.lastSourceHeight == i3) {
                    return;
                }
                this.agoraSurfaceView.post(new Runnable() { // from class: io.agora.rtc.video.AgoraVideoDebugger.DebugViewHolder.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int i4;
                        DebugViewHolder debugViewHolder = DebugViewHolder.this;
                        boolean z = debugViewHolder.applyRotation && ((i4 = i) == 90 || i4 == 270);
                        debugViewHolder.agoraSurfaceView.getLayoutParams().width = z ? i3 : i2;
                        DebugViewHolder.this.agoraSurfaceView.getLayoutParams().height = z ? i2 : i3;
                    }
                });
                this.lastSourceWidth = i2;
                this.lastSourceHeight = i3;
            }
        }
    }

    public static ByteBuffer convertI420ToCompactByteBuffer(VideoFrame.I420Buffer i420Buffer) {
        int width = i420Buffer.getWidth();
        int height = i420Buffer.getHeight();
        int i = (height + 1) / 2;
        int i2 = (width + 1) / 2;
        int i3 = width * height;
        int i4 = i3 + 0;
        int i5 = i2 * i;
        int i6 = i4 + i5;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((i2 * 2 * i) + i3);
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.limit(i4);
        ByteBuffer byteBufferSlice = byteBufferAllocateDirect.slice();
        byteBufferAllocateDirect.position(i4);
        byteBufferAllocateDirect.limit(i6);
        ByteBuffer byteBufferSlice2 = byteBufferAllocateDirect.slice();
        byteBufferAllocateDirect.position(i6);
        byteBufferAllocateDirect.limit(i6 + i5);
        ByteBuffer byteBufferSlice3 = byteBufferAllocateDirect.slice();
        ByteBuffer dataY = i420Buffer.getDataY();
        for (int i7 = 0; i7 < height; i7++) {
            int strideY = i420Buffer.getStrideY() * i7;
            dataY.limit(strideY + width);
            dataY.position(strideY);
            byteBufferSlice.put(dataY.slice());
        }
        ByteBuffer dataU = i420Buffer.getDataU();
        for (int i8 = 0; i8 < i; i8++) {
            int strideU = i420Buffer.getStrideU() * i8;
            dataU.limit(strideU + i2);
            dataU.position(strideU);
            byteBufferSlice2.put(dataU.slice());
        }
        ByteBuffer dataV = i420Buffer.getDataV();
        for (int i9 = 0; i9 < i; i9++) {
            int strideV = i420Buffer.getStrideV() * i9;
            dataV.limit(strideV + i2);
            dataV.position(strideV);
            byteBufferSlice3.put(dataV.slice());
        }
        byteBufferAllocateDirect.position(0);
        return byteBufferAllocateDirect;
    }

    public static byte[] convertNv21ToCompactI420(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 + 1;
        int i5 = i / 2;
        int i6 = i2 / 2;
        int i7 = (i3 * 5) / 4;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i * i8;
            System.arraycopy(bArr, i9, bArr2, i9, i);
        }
        for (int i10 = 0; i10 < i6; i10++) {
            for (int i11 = 0; i11 < i5; i11++) {
                bArr2[(i5 * i10) + i3 + i11] = bArr[(2 * i11) + (i * i10) + i4];
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            for (int i13 = 0; i13 < i5; i13++) {
                bArr2[(i5 * i12) + i7 + i13] = bArr[(2 * i13) + (i * i12) + i3];
            }
        }
        return bArr2;
    }

    public static byte[] convertYv12ToCompactI420(byte[] bArr, int i, int i2) {
        int i3 = ((i + 15) >> 4) << 4;
        int i4 = i3 * i2;
        int i5 = ((i3 >> 1) >> 4) << 4;
        int i6 = ((i5 * i2) >> 1) + i4;
        int i7 = i * i2;
        int i8 = i / 2;
        int i9 = i2 / 2;
        int i10 = (i7 * 5) / 4;
        byte[] bArr2 = new byte[(i7 * 3) / 2];
        for (int i11 = 0; i11 < i2; i11++) {
            System.arraycopy(bArr, i3 * i11, bArr2, i * i11, i);
        }
        for (int i12 = 0; i12 < i9; i12++) {
            System.arraycopy(bArr, (i5 * i12) + i6, bArr2, (i8 * i12) + i7, i8);
        }
        for (int i13 = 0; i13 < i9; i13++) {
            System.arraycopy(bArr, (i5 * i13) + i4, bArr2, (i8 * i13) + i10, i8);
        }
        return bArr2;
    }

    public static AgoraSurfaceView exampleUsage(Activity activity) {
        AgoraSurfaceView agoraSurfaceView = new AgoraSurfaceView(activity);
        ((ViewGroup) activity.findViewById(R.id.content)).addView(agoraSurfaceView, 360, 640);
        agoraSurfaceView.setZOrderOnTop(true);
        setCapturePreview(agoraSurfaceView, false, true, true, false);
        return agoraSurfaceView;
    }

    public static int getAgoraVideoFrameFormat(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES ? 11 : 10;
    }

    public static MediaIO.PixelFormat getMediaIOPixelFormat(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES ? MediaIO.PixelFormat.TEXTURE_OES : MediaIO.PixelFormat.TEXTURE_2D;
    }

    public static void onCaptureVideoFrame(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
    }

    public static void onDropTextureBuffer(long j) {
    }

    public static void onI420Buffer(VideoFrame.I420Buffer i420Buffer, int i, long j) {
    }

    public static void onRawBufferAvailable(VideoCapture videoCapture, byte[] bArr, int i, int i2, int i3, int i4) {
    }

    public static void onTextureAndRawBufferAvailable(VideoCapture videoCapture, VideoFrame.TextureBuffer textureBuffer, int i, long j, byte[] bArr, int i2) {
    }

    public static void onTextureBuffer(VideoFrame.TextureBuffer textureBuffer, int i, long j) {
    }

    public static void onTextureBufferAvailable(VideoCapture videoCapture, EglBase.Context context, VideoFrame.TextureBuffer textureBuffer, int i, long j) {
    }

    public static void rawDataDump(byte[] bArr, FileOutputStream fileOutputStream) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reset() {
    }

    public static void setCapturePreview(AgoraSurfaceView agoraSurfaceView, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public static void setI420BufferPreview(AgoraSurfaceView agoraSurfaceView) {
    }

    public static void setObserverPreview(AgoraSurfaceView agoraSurfaceView) {
    }

    public static void setTextureBufferPreview(AgoraSurfaceView agoraSurfaceView) {
    }

    public static void textureDump(VideoFrame.TextureBuffer textureBuffer, FileOutputStream fileOutputStream) {
        VideoFrame.I420Buffer i420;
        if (textureBuffer == null || fileOutputStream == null || (i420 = textureBuffer.toI420()) == null) {
            return;
        }
        try {
            ByteBuffer byteBufferConvertI420ToCompactByteBuffer = convertI420ToCompactByteBuffer(i420);
            FileChannel channel = fileOutputStream.getChannel();
            channel.write(byteBufferConvertI420ToCompactByteBuffer);
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setCapturePreview(AgoraSurfaceView agoraSurfaceView) {
        setCapturePreview(agoraSurfaceView, true, true, true, false);
    }
}
