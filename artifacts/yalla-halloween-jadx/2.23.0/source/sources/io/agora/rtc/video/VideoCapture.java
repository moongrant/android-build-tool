package io.agora.rtc.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.qiniu.android.common.Constants;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.SurfaceTextureHelper;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.internal.ATrace;
import io.agora.rtc.internal.Logging;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public abstract class VideoCapture {
    public static boolean FORCE_TEXTURE_OES = false;
    protected static final int MAX_BUFFER_CNT = 8;
    private static final String TAG = "VideoCapture";
    public static final int kCaptureFpsDefault = 0;
    public static final int kCaptureFpsLowPower = 1;
    public static final int kCaptureFpsUnknown = -1;
    private static final int kVideoI420 = 0;
    private static final int kVideoNV12 = 11;
    private static final int kVideoNV21 = 12;
    private static final int kVideoUnknown = 99;
    private static final int kVideoYUY2 = 2;
    private static final int kVideoYV12 = 1;
    protected int mCameraNativeOrientation;
    protected final Context mContext;
    protected EglBase.Context mEglContext;
    protected final int mId;
    protected long mNativeVideoCaptureDeviceAndroid;
    protected int mPQFirst;
    protected final EglBase.Context mShareContext;
    protected SurfaceTextureHelper mSurfaceTextureHelper;

    @CaptureOutputDataType
    protected int mCaptureOutputDataType = 0;
    protected int mExpectedRawBufferSize = 0;
    protected TextureAndRawBufferSynchronizer mTextureAndRawBufferSynchronizer = null;
    protected int mDroppedTextureBufferCount = 0;
    private int mLastRotation = -1;

    public @interface CaptureOutputDataType {
        public static final int CAPTURE_OUTPUT_RAW = 0;
        public static final int CAPTURE_OUTPUT_TEXTURE = 1;
        public static final int CAPTURE_OUTPUT_TEXTURE_AND_RAW = 2;
    }

    public static class RawBuffer {
        byte[] data;
        int length;

        public RawBuffer(byte[] bArr, int i) {
            this.data = bArr;
            this.length = i;
        }
    }

    public static class TexBuffer {
        int rotation;
        VideoFrame.TextureBuffer textureBuffer;
        long timestampNs;

        public TexBuffer(VideoFrame.TextureBuffer textureBuffer, int i, long j) {
            this.textureBuffer = textureBuffer;
            this.rotation = i;
            this.timestampNs = j;
        }
    }

    public class TextureAndRawBufferSynchronizer {
        Queue<RawBuffer> rawBufferQueue = new LinkedList();
        Queue<TexBuffer> texBufferQueue = new LinkedList();
        int pendingRemoveRawBufferCount = 0;

        public TextureAndRawBufferSynchronizer() {
        }

        private void checkAndResetIfNeeded() {
            if (this.texBufferQueue.size() > 16 || this.rawBufferQueue.size() > 16) {
                Logging.e(VideoCapture.TAG, (this.texBufferQueue.size() > 16 ? "raw" : "texture").concat(" buffer stall, something is broken!"));
                reset();
            }
        }

        public void onDropTextureBuffer(long j) {
            if (this.rawBufferQueue.poll() == null) {
                this.pendingRemoveRawBufferCount++;
            }
        }

        public void onRawBufferAvailable(byte[] bArr, int i) {
            checkAndResetIfNeeded();
            int i2 = this.pendingRemoveRawBufferCount;
            if (i2 > 0) {
                this.pendingRemoveRawBufferCount = i2 - 1;
                return;
            }
            TexBuffer texBufferPoll = this.texBufferQueue.poll();
            if (texBufferPoll == null) {
                this.rawBufferQueue.offer(new RawBuffer(Arrays.copyOf(bArr, i), i));
            } else {
                VideoCapture.this.onTextureAndRawBufferAvailable(texBufferPoll.textureBuffer, texBufferPoll.rotation, texBufferPoll.timestampNs, bArr, i);
                texBufferPoll.textureBuffer.release();
            }
        }

        public void onTextureBufferAvailable(VideoFrame.TextureBuffer textureBuffer, int i, long j) {
            checkAndResetIfNeeded();
            RawBuffer rawBufferPoll = this.rawBufferQueue.poll();
            if (rawBufferPoll != null) {
                VideoCapture.this.onTextureAndRawBufferAvailable(textureBuffer, i, j, rawBufferPoll.data, rawBufferPoll.length);
            } else {
                textureBuffer.retain();
                this.texBufferQueue.offer(new TexBuffer(textureBuffer, i, j));
            }
        }

        public void reset() {
            Logging.i(VideoCapture.TAG, "TextureAndRawBufferSynchronizer reset");
            this.rawBufferQueue.clear();
            Iterator<TexBuffer> it = this.texBufferQueue.iterator();
            while (it.hasNext()) {
                it.next().textureBuffer.release();
            }
            this.texBufferQueue.clear();
            this.pendingRemoveRawBufferCount = 0;
        }
    }

    public @interface VideoCaptureEvent {
        public static final int kCameraErrorCameraDevice = 4;
        public static final int kCameraErrorCameraDisabled = 3;
        public static final int kCameraErrorCameraInUse = 1;
        public static final int kCameraErrorCameraService = 5;
        public static final int kCameraErrorConfigureInitiation = 100;
        public static final int kCameraErrorConfigureRequest = 102;
        public static final int kCameraErrorConfigureSession = 101;
        public static final int kCameraErrorDeviceNotFound = 7;
        public static final int kCameraErrorDisconnected = 6;
        public static final int kCameraErrorMaxCamerasInUse = 2;
        public static final int kCameraErrorNoPermission = 8;
        public static final int kCameraErrorRuntimeUnknown = 901;
        public static final int kVideoCaptureEventNone = 0;
    }

    public VideoCapture(Context context, int i, int i2, EglBase.Context context2, long j) {
        this.mNativeVideoCaptureDeviceAndroid = j;
        this.mContext = context;
        this.mId = i;
        this.mPQFirst = i2;
        this.mShareContext = context2;
    }

    public static native int ConvertFrameToI420(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i4, int i5, byte[] bArr);

    private native void ProvideCameraTexture(VideoFrame.TextureBuffer textureBuffer, int i, long j, long j2);

    private native void ProvideCameraTextureAndRaw(VideoFrame.TextureBuffer textureBuffer, int i, long j, byte[] bArr, int i2, long j2);

    public static void cacheCapability(int i, Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("CamCaps2", 0).edit();
        editorEdit.putString("Cam_" + i, str);
        editorEdit.putString("CaptureName", str2);
        editorEdit.commit();
    }

    public static boolean checkVideoPermission(Context context) {
        return context != null && context.checkCallingOrSelfPermission("android.permission.CAMERA") == 0;
    }

    public static void clearCapabilityCache(Context context) {
        context.getSharedPreferences("CamCaps2", 0).edit().clear().commit();
    }

    public static String fetchCapability(int i, Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("CamCaps2", 0);
        String string = sharedPreferences.getString("CaptureName", null);
        if (string != null && string.equals(str)) {
            return sharedPreferences.getString("Cam_" + i, null);
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.commit();
        return null;
    }

    public static boolean isEmulator() {
        String str;
        String str2 = Build.MANUFACTURER;
        if ("nokia".equalsIgnoreCase(str2) && ("Nokia_N1".equalsIgnoreCase(Build.DEVICE) || "N1".equalsIgnoreCase(Build.MODEL))) {
            return false;
        }
        String str3 = Build.FINGERPRINT;
        if (str3 != null && (str3.startsWith("generic") || str3.toLowerCase().contains("vbox") || str3.toLowerCase().contains("test-keys"))) {
            return true;
        }
        String str4 = Build.MODEL;
        if (str4 != null && (str4.contains("google_sdk") || str4.contains("Emulator") || str4.contains("Android SDK built for x86") || str4.equalsIgnoreCase("MuMu"))) {
            return true;
        }
        if (str2 != null && str2.contains("Genymotion")) {
            return true;
        }
        String str5 = Build.BRAND;
        if ((str5 != null && str5.startsWith("generic") && (str = Build.DEVICE) != null && str.startsWith("generic")) || "google_sdk".equalsIgnoreCase(Build.PRODUCT)) {
            return true;
        }
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), Constants.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer.append(line);
            }
            bufferedReader.close();
            String lowerCase = stringBuffer.toString().toLowerCase();
            return lowerCase.contains("intel") || lowerCase.contains("amd");
        } catch (IOException | Exception unused) {
            return false;
        }
    }

    public static int translateToAndroidFormat(int i) {
        if (i == 0) {
            return 35;
        }
        if (i == 1) {
            return 842094169;
        }
        if (i != 2) {
            return i != 12 ? 0 : 17;
        }
        return 20;
    }

    @CaptureOutputDataType
    public static int translateToCaptureOutputDataType(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int translateToEngineFormat(int i) {
        if (i == 17) {
            return 12;
        }
        if (i == 20) {
            return 2;
        }
        if (i != 35) {
            return i != 842094169 ? 99 : 1;
        }
        return 0;
    }

    public native void NotifyCameraExposureAreaChanged(float f, float f2, float f3, float f4, long j);

    public native void NotifyCameraFocusAreaChanged(float f, float f2, float f3, float f4, long j);

    public native void NotifyFaceDetection(int i, int i2, RectF[] rectFArr, long j, long j2);

    public native void ProvideCameraFrame(byte[] bArr, int i, long j);

    public abstract int UnRegisterNativeHandle();

    public abstract int allocate();

    public int checkOrientation() {
        Display defaultDisplay;
        Context context = this.mContext;
        if (context == null || context.getSystemService("window") == null || (defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay()) == null) {
            return this.mLastRotation;
        }
        try {
            return defaultDisplay.getRotation();
        } catch (RuntimeException unused) {
            Logging.e("VideoCapture", "video capture checkOrientation display getRotation throwout exception");
            return this.mLastRotation;
        }
    }

    public abstract void deallocate();

    public abstract float getMaxZoom();

    public native boolean isAutoFaceFocusEnabled(long j);

    public abstract boolean isAutoFaceFocusSupported();

    public abstract boolean isExposureSupported();

    public native boolean isFaceDetectionEnabled(long j);

    public abstract boolean isFocusSupported();

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public native void onCameraError(long j, @VideoCaptureEvent int i);

    public void onRawBufferAvailable(byte[] bArr, int i, int i2, int i3, int i4) {
        AgoraVideoDebugger.onRawBufferAvailable(this, bArr, i, i2, i3, i4);
        int i5 = this.mCaptureOutputDataType;
        if (i5 == 0) {
            ProvideCameraFrame(bArr, i, this.mNativeVideoCaptureDeviceAndroid);
        } else if (i5 == 2) {
            this.mTextureAndRawBufferSynchronizer.onRawBufferAvailable(bArr, i);
        }
    }

    public void onTextureAndRawBufferAvailable(VideoFrame.TextureBuffer textureBuffer, int i, long j, byte[] bArr, int i2) {
        AgoraVideoDebugger.onTextureAndRawBufferAvailable(this, textureBuffer, i, j, bArr, i2);
        ProvideCameraTextureAndRaw(textureBuffer, i, j, bArr, i2, this.mNativeVideoCaptureDeviceAndroid);
    }

    public void onTextureBufferAvailable(VideoFrame.TextureBuffer textureBuffer, int i, long j) {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            textureBuffer = null;
        } else if (!FORCE_TEXTURE_OES) {
            textureBuffer = surfaceTextureHelper.textureCopy(textureBuffer);
        }
        if (textureBuffer == null) {
            int i2 = this.mDroppedTextureBufferCount + 1;
            this.mDroppedTextureBufferCount = i2;
            if (i2 % 50 == 1) {
                Logging.w(TAG, "Dropped texture buffer count: " + this.mDroppedTextureBufferCount);
            }
            if (this.mCaptureOutputDataType == 2) {
                this.mTextureAndRawBufferSynchronizer.onDropTextureBuffer(j);
            }
            AgoraVideoDebugger.onDropTextureBuffer(j);
            return;
        }
        ATrace.beginSection("onTextureBufferAvailable");
        AgoraVideoDebugger.onTextureBufferAvailable(this, this.mEglContext, textureBuffer, i, j);
        int i3 = this.mCaptureOutputDataType;
        if (i3 == 1) {
            ProvideCameraTexture(textureBuffer, i, j, this.mNativeVideoCaptureDeviceAndroid);
        } else if (i3 == 2) {
            this.mTextureAndRawBufferSynchronizer.onTextureBufferAvailable(textureBuffer, i, j);
        }
        ATrace.endSection();
        textureBuffer.release();
    }

    public abstract int setAntiBandingMode(int i);

    public abstract int setAutoFaceFocus(boolean z);

    public abstract int setCaptureFormat(int i, int i2, boolean z);

    public abstract int setEdgeEnhanceMode(int i);

    public abstract int setExposure(float f, float f2, boolean z);

    public abstract int setExposureCompensation(int i);

    public abstract int setFaceDetection(boolean z);

    public abstract int setFocus(float f, float f2, boolean z);

    public abstract int setNoiseReductionMode(int i);

    public abstract int setTorchMode(boolean z);

    public abstract int setVideoStabilityMode(int i);

    public abstract int setZoom(float f);

    public abstract int startCapture(int i, int i2, int i3);

    public abstract int stopCapture();
}
