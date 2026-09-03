package io.agora.rtc.video;

import OooO00o.OooO00o;
import OooO0O0.OooO0O0;
import OooO0o.OooO0OO;
import Oooo000.Oooo0;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.o00000O0;
import com.facebook.login.widget.ToolTipPopup;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.gl.SurfaceTextureHelper;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.internal.DeviceUtils;
import io.agora.rtc.internal.Logging;
import io.agora.rtc.utils.ThreadUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.DebugKt;
import o0O0O00.o0ooOOo;
import p042Ooooo0o.o000O0Oo;
import p130o00O0oo.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
public class VideoCaptureCamera extends VideoCapture implements Camera.PreviewCallback, SurfaceTextureHelper.OnTextureFrameAvailableListener {
    private static final int CAMERA_ALLOCATE_TIMEOUT_MS = 6000;
    private static final long CAMERA_OPEN_REQUEST_INTERVAL = 2000;
    private static final int NUM_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "CAMERA1";
    private static final boolean VERBOSE = false;
    private int[] distanceArray;
    private boolean faceDetectEnabled;
    private boolean isCaptureRunning;
    private boolean isCaptureStarted;
    private boolean isFaceDetectionStarted;
    private boolean isSurfaceReady;
    private volatile int mAllocated;
    private String mAntiBandingMode;
    public Camera mCamera;
    private HandlerThread mCameraPreviewHandlerThread;
    private int mCaptureFormat;
    private int mCaptureFps;
    private int mCaptureHeight;
    private ReentrantLock mCaptureLock;
    private int mCaptureWidth;
    private SurfaceTexture mDummySurfaceTexture;
    private boolean mIsAutoFaceFocusEnabled;
    private final boolean mIsCameraFacingFront;
    private Object mObjectLock;
    public ReentrantLock mPreviewBufferLock;
    private Handler mPreviewHandler;
    private RectF[] rectArray;

    public VideoCaptureCamera(Context context, int i, int i2, EglBase.Context context2, long j) {
        super(context, i, i2, context2, j);
        this.mPreviewBufferLock = new ReentrantLock();
        this.mCaptureLock = new ReentrantLock();
        this.isCaptureStarted = false;
        this.isCaptureRunning = false;
        this.isSurfaceReady = false;
        this.isFaceDetectionStarted = false;
        this.mCaptureWidth = -1;
        this.mCaptureHeight = -1;
        this.mCaptureFps = -1;
        this.mCaptureFormat = 17;
        this.mCameraPreviewHandlerThread = null;
        this.mPreviewHandler = null;
        this.mObjectLock = new Object();
        this.mIsAutoFaceFocusEnabled = false;
        this.rectArray = null;
        this.distanceArray = null;
        this.faceDetectEnabled = false;
        this.mAntiBandingMode = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        this.mDummySurfaceTexture = null;
        this.mIsCameraFacingFront = isCameraFacingFront(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int allocate_l() {
        try {
            this.mCamera = Camera.open(this.mId);
            Camera.CameraInfo cameraInfo = getCameraInfo(this.mId);
            if (cameraInfo == null) {
                this.mCamera.release();
                this.mCamera = null;
                return -2;
            }
            if (VideoCapture.fetchCapability(this.mId, this.mContext, getCaptureName()) == null) {
                createCapabilities();
            }
            this.mCameraNativeOrientation = cameraInfo.orientation;
            long j = this.mNativeVideoCaptureDeviceAndroid;
            if (j != 0) {
                this.mIsAutoFaceFocusEnabled = isAutoFaceFocusEnabled(j);
            }
            this.faceDetectEnabled = isFaceDetectionEnabled(this.mNativeVideoCaptureDeviceAndroid);
            return 0;
        } catch (RuntimeException e) {
            Logging.e(TAG, "allocate: Camera.open: ", e);
            return -1;
        }
    }

    private static Rect calculateTapArea(float f, float f2, float f3) {
        int i = (int) ((f * 2000.0f) - 1000.0f);
        int i2 = (int) ((f2 * 2000.0f) - 1000.0f);
        int iIntValue = Float.valueOf(f3 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i - iIntValue, -1000, 1000), clamp(i2 - iIntValue, -1000, 1000), clamp(i + iIntValue, -1000, 1000), clamp(i2 + iIntValue, -1000, 1000));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    private static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deallocate_l() {
        this.mNativeVideoCaptureDeviceAndroid = 0L;
        stopCapture();
        this.mCaptureLock.lock();
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.release();
            this.mCamera = null;
        }
        this.mCaptureLock.unlock();
    }

    public static Camera.CameraInfo getCameraInfo(int i) {
        if (i >= 0 && i <= Camera.getNumberOfCameras() - 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                return cameraInfo;
            } catch (RuntimeException e) {
                Logging.e(TAG, "getCameraInfo: Camera.getCameraInfo: ", e);
            }
        }
        return null;
    }

    public static String getCaptureName() {
        return "camera1";
    }

    private int getFrameOrientation() {
        int iCheckOrientation = checkOrientation();
        if (!this.mIsCameraFacingFront) {
            iCheckOrientation = 360 - iCheckOrientation;
        }
        return (getSensorOrientation(this.mId) + iCheckOrientation) % 360;
    }

    public static int getFrontCameraIndex() {
        try {
            return Camera.getNumberOfCameras() > 1 ? 1 : 0;
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getMaxZoom_l() {
        if (this.mCamera == null) {
            return -1.0f;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        int maxZoom = isZoomSupported(cameraParameters) ? cameraParameters.getMaxZoom() : 0;
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null || zoomRatios.size() <= maxZoom) {
            return -1.0f;
        }
        return zoomRatios.get(maxZoom).intValue() / 100.0f;
    }

    public static String getName(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("camera ", i, ", facing ");
        sbOooO00o.append(cameraInfo.facing == 1 ? "front" : "back");
        return sbOooO00o.toString();
    }

    public static int getNumberOfCameras() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Logging.e(TAG, "camera1 listCount:" + numberOfCameras);
        return numberOfCameras;
    }

    public static int getSensorOrientation(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return -1;
        }
        return cameraInfo.orientation;
    }

    private List<Integer> getZoomRatios() {
        if (this.mCamera == null) {
            return null;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (isZoomSupported(cameraParameters)) {
            return cameraParameters.getZoomRatios();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAutoFaceFocusSupported_l() {
        Camera.Parameters cameraParameters;
        return this.mCamera != null && (cameraParameters = getCameraParameters()) != null && cameraParameters.getMaxNumDetectedFaces() > 0 && cameraParameters.getMaxNumFocusAreas() > 0 && isSupported(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, cameraParameters.getSupportedFocusModes());
    }

    public static boolean isCameraFacingFront(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        return cameraInfo == null || cameraInfo.facing == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExposureSupported_l() {
        Camera.Parameters cameraParameters;
        return (this.mCamera == null || (cameraParameters = getCameraParameters()) == null || cameraParameters.getMaxNumMeteringAreas() <= 0) ? false : true;
    }

    private boolean isFaceDetectedSupported() {
        Camera.Parameters cameraParameters;
        return (this.mCamera == null || (cameraParameters = getCameraParameters()) == null || cameraParameters.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFocusSupported_l() {
        Camera.Parameters cameraParameters;
        return this.mCamera != null && (cameraParameters = getCameraParameters()) != null && cameraParameters.getMaxNumFocusAreas() > 0 && isSupported(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, cameraParameters.getSupportedFocusModes());
    }

    private static boolean isSupported(String str, List<String> list) {
        return list != null && list.indexOf(str) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTorchSupported_l() {
        Camera.Parameters cameraParameters;
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return false;
        }
        return isSupported("torch", cameraParameters.getSupportedFlashModes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isZoomSupported_l() {
        Camera.Parameters cameraParameters;
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return false;
        }
        return cameraParameters.isZoomSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCameraFocusAreaChanged(Rect rect) {
        RectF rectFNormalizedFaceRect = CoordinatesTransform.normalizedFaceRect(rect, 0, this.mId == 1);
        float f = rectFNormalizedFaceRect.left;
        float f2 = rectFNormalizedFaceRect.top;
        float fWidth = rectFNormalizedFaceRect.width();
        float fHeight = rectFNormalizedFaceRect.height();
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("auto face focus left =");
        sbOooO0o0.append(rectFNormalizedFaceRect.left);
        sbOooO0o0.append(" top = ");
        sbOooO0o0.append(rectFNormalizedFaceRect.top);
        sbOooO0o0.append(" right = ");
        sbOooO0o0.append(rectFNormalizedFaceRect.right);
        sbOooO0o0.append(" bottom = ");
        sbOooO0o0.append(rectFNormalizedFaceRect.bottom);
        Logging.d(TAG, sbOooO0o0.toString());
        NotifyCameraFocusAreaChanged(f, f2, fWidth, fHeight, this.mNativeVideoCaptureDeviceAndroid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFaceDetection(Camera.Face[] faceArr) {
        this.rectArray = null;
        int i = 0;
        boolean z = this.mId == 1;
        if (faceArr == null || faceArr.length <= 0) {
            this.rectArray = new RectF[0];
        } else {
            int length = faceArr.length;
            this.rectArray = new RectF[length];
            this.distanceArray = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.rectArray[i2] = CoordinatesTransform.normalizedFaceRect(faceArr[i2].rect, 0, z);
                this.distanceArray[i2] = 5;
            }
            i = length;
        }
        NotifyFaceDetection(this.mCaptureWidth, this.mCaptureHeight, this.rectArray, i, this.mNativeVideoCaptureDeviceAndroid);
    }

    private void setAdvancedCameraParameters(Camera.Parameters parameters) {
        if (isSupported(DebugKt.DEBUG_PROPERTY_VALUE_OFF, parameters.getSupportedFlashModes())) {
            Logging.i(TAG, "AgoraVideo set flash mode = FLASH_MODE_OFF");
            parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        }
        if (isSupported(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, parameters.getSupportedWhiteBalance())) {
            Logging.i(TAG, "AgoraVideo set white blance = WHITE_BALANCE_AUTO");
            parameters.setWhiteBalance(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
        if (isSupported("continuous-video", parameters.getSupportedFocusModes())) {
            Logging.i(TAG, "AgoraVideo set Focus mode = FOCUS_MODE_CONTINUOUS_VIDEO");
            parameters.setFocusMode("continuous-video");
        }
        String str = this.mAntiBandingMode;
        if (isSupported(str, parameters.getSupportedAntibanding())) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AgoraVideo set anti-banding = ");
            sbOooO0o0.append(this.mAntiBandingMode);
            Logging.i(TAG, sbOooO0o0.toString());
            parameters.setAntibanding(str);
        }
        if (isSupported(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, parameters.getSupportedSceneModes())) {
            Logging.i(TAG, "AgoraVideo set sence mode = auto");
            if (parameters.getSceneMode() != DebugKt.DEBUG_PROPERTY_VALUE_AUTO) {
                parameters.setSceneMode(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int setAntiBandingMode_l(int i) {
        Camera.Parameters parameters;
        this.mAntiBandingMode = toCamera1ABMode(i);
        Camera camera = this.mCamera;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return -1;
        }
        String str = this.mAntiBandingMode;
        if (!isSupported(str, parameters.getSupportedAntibanding())) {
            Logging.i(TAG, "not supported anti-banding = " + str);
            return -1;
        }
        Logging.i(TAG, "AgoraVideo set anti-banding = " + str);
        parameters.setAntibanding(str);
        try {
            this.mCamera.setParameters(parameters);
            return 0;
        } catch (Exception e) {
            Logging.e(TAG, "anti banding got exception:" + e);
            return 0;
        }
    }

    private void setDeviceSpecificParameters(Camera.Parameters parameters) throws Throwable {
        String strBuildDeviceId = DeviceUtils.buildDeviceId();
        String cpuName = DeviceUtils.getCpuName();
        String cpuABI = DeviceUtils.getCpuABI();
        int numberOfCPUCores = DeviceUtils.getNumberOfCPUCores();
        int cPUMaxFreqKHz = DeviceUtils.getCPUMaxFreqKHz();
        Logging.i(TAG, "Current Device: " + strBuildDeviceId);
        Logging.i(TAG, "CPU name: " + cpuName + ", with " + numberOfCPUCores + " cores, arch: " + cpuABI + ", max Freq: " + cPUMaxFreqKHz);
        if (strBuildDeviceId.contains("xiaomi/mi note")) {
            Logging.i(TAG, "set MiNote config");
            parameters.set("scene-detect", DebugKt.DEBUG_PROPERTY_VALUE_ON);
            parameters.set("xiaomi-still-beautify-values", "i:3");
            parameters.set("skinToneEnhancement", "enable");
            parameters.set("auto-exposure", "center-weighted");
        }
        if (strBuildDeviceId.contains("oppo/r7c/r7c")) {
            Logging.i(TAG, "set oppo r7c config");
            parameters.set("skinToneEnhancement", 1);
            parameters.set("face-beautify", 100);
            parameters.set("auto-exposure", "center-weighted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureCompensation_l(int i) {
        Camera.Parameters parameters;
        Logging.i(TAG, "setExposureCompensation:" + i);
        Camera camera = this.mCamera;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        Logging.i(TAG, "compensation step=" + exposureCompensationStep + ", min=" + minExposureCompensation + ", max=" + maxExposureCompensation + ", cur index=" + parameters.getExposureCompensation());
        if (i > maxExposureCompensation) {
            i = maxExposureCompensation;
        }
        if (i >= minExposureCompensation) {
            minExposureCompensation = i;
        }
        parameters.setExposureCompensation(minExposureCompensation);
        try {
            this.mCamera.setParameters(parameters);
        } catch (Exception e) {
            Logging.e(TAG, "exposure compensation got exception:" + e);
        }
        int exposureCompensation = parameters.getExposureCompensation();
        Logging.i(TAG, "cur index=" + exposureCompensation + ", ev=" + (exposureCompensationStep * exposureCompensation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int setExposure_l(float f, float f2, boolean z) {
        Logging.d(TAG, "setExposure called camera api1 x = " + f + " y = " + f2);
        if (this.mCamera == null) {
            return -1;
        }
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f > 1.0f || f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f2 > 1.0f) {
            Logging.e(TAG, "set exposure unreasonable inputs");
            return -1;
        }
        Rect rectCalculateTapArea = calculateTapArea(f, f2, 1.5f);
        if (this.mCamera != null) {
            Camera.Parameters cameraParameters = getCameraParameters();
            if (cameraParameters == null) {
                return -1;
            }
            if (cameraParameters.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(rectCalculateTapArea, 800));
                cameraParameters.setMeteringAreas(arrayList);
            } else {
                Logging.i(TAG, "metering areas not supported");
            }
            try {
                this.mCamera.setParameters(cameraParameters);
                this.mCamera.startPreview();
            } catch (Exception e) {
                Logging.e(TAG, "setExposure failed, " + e);
                return -1;
            }
        }
        long j = this.mNativeVideoCaptureDeviceAndroid;
        if (j == 0) {
            return 0;
        }
        NotifyCameraExposureAreaChanged(f, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int setFocus_l(float f, float f2, boolean z) {
        Logging.d(TAG, "setFocus called camera api1");
        if (this.mCamera == null) {
            return -1;
        }
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f > 1.0f || f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f2 > 1.0f) {
            Logging.e(TAG, "set focus unreasonable inputs");
            return -1;
        }
        Rect rectCalculateTapArea = calculateTapArea(f, f2, 1.0f);
        Rect rectCalculateTapArea2 = calculateTapArea(f, f2, 1.5f);
        try {
            this.mCamera.cancelAutoFocus();
        } catch (RuntimeException e) {
            Logging.w(TAG, "Failed to cancle AutoFocus" + e);
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters == null) {
            return -1;
        }
        if (cameraParameters.getMaxNumFocusAreas() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rectCalculateTapArea, 800));
            cameraParameters.setFocusAreas(arrayList);
        } else {
            Logging.i(TAG, "focus areas not supported");
        }
        if (cameraParameters.getMaxNumMeteringAreas() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Camera.Area(rectCalculateTapArea2, 800));
            cameraParameters.setMeteringAreas(arrayList2);
        } else {
            Logging.i(TAG, "metering areas not supported");
        }
        final String focusMode = cameraParameters.getFocusMode();
        if (isSupported("macro", cameraParameters.getSupportedFocusModes())) {
            cameraParameters.setFocusMode("macro");
            synchronized (this.mObjectLock) {
                this.mCamera.setParameters(cameraParameters);
            }
        } else {
            Logging.i("focus", "FOCUS_MODE_MACRO is not supported");
        }
        try {
            this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc.video.VideoCaptureCamera.11
                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z2, Camera camera) {
                    if (VideoCaptureCamera.this.mCamera == null) {
                        return;
                    }
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFocusMode(focusMode);
                    synchronized (VideoCaptureCamera.this.mObjectLock) {
                        camera.setParameters(parameters);
                    }
                }
            });
            long j = this.mNativeVideoCaptureDeviceAndroid;
            if (j == 0) {
                return 0;
            }
            NotifyCameraFocusAreaChanged(f, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j);
            return 0;
        } catch (Exception e2) {
            Logging.w(TAG, "mCamera.autoFocus Exception: " + e2);
            return -1;
        }
    }

    private void setPreviewFrameRateModeFPS(Camera.Parameters parameters, int i) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() <= 0) {
            parameters.setPreviewFrameRate(i);
            return;
        }
        int i2 = 0;
        while (i2 < supportedPreviewFpsRange.size()) {
            if (supportedPreviewFpsRange.get(i2)[0] >= i * 1000) {
                parameters.setPreviewFpsRange(supportedPreviewFpsRange.get(i2)[0], supportedPreviewFpsRange.get(i2)[1]);
                break;
            }
            i2++;
        }
        if (i2 == supportedPreviewFpsRange.size()) {
            int i3 = i2 - 1;
            parameters.setPreviewFpsRange(supportedPreviewFpsRange.get(i3)[0], supportedPreviewFpsRange.get(i3)[1]);
        }
    }

    private void setPreviewFrameRateModePQ(Camera.Parameters parameters, int i) {
        List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.size() == 0) {
            Logging.w(TAG, "setPreviewFrameRate: camera don't supported PQ first.");
            setPreviewFrameRateModeFPS(parameters, i);
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("getSupportedPreviewFrameRates: ");
        sbOooO0o0.append(supportedPreviewFrameRates.toString());
        Logging.w(TAG, sbOooO0o0.toString());
        int iAbs = Math.abs(supportedPreviewFrameRates.get(0).intValue() - i);
        int iIntValue = supportedPreviewFrameRates.get(0).intValue();
        for (Integer num : supportedPreviewFrameRates) {
            int iAbs2 = Math.abs(num.intValue() - i);
            if (iAbs2 < iAbs) {
                iIntValue = num.intValue();
                iAbs = iAbs2;
            }
        }
        parameters.setPreviewFrameRate(iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int setTorchMode_l(boolean z) {
        Camera.Parameters cameraParameters;
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return -2;
        }
        List<String> supportedFlashModes = cameraParameters.getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
            return -1;
        }
        if (z) {
            cameraParameters.setFlashMode("torch");
        } else {
            cameraParameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        }
        this.mCamera.setParameters(cameraParameters);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int setZoom_l(float f) {
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return -1;
        }
        int i = (int) ((f * 100.0f) + 0.5f);
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= zoomRatios.size()) {
                i2 = 0;
                break;
            }
            if (i <= zoomRatios.get(i2).intValue()) {
                break;
            }
            i2++;
        }
        if (this.mCamera != null) {
            Camera.Parameters cameraParameters = getCameraParameters();
            if (isZoomSupported(cameraParameters)) {
                if (i2 > cameraParameters.getMaxZoom()) {
                    Logging.w(TAG, "zoom value is larger than maxZoom value");
                    return -1;
                }
                cameraParameters.setZoom(i2);
                try {
                    this.mCamera.setParameters(cameraParameters);
                } catch (Exception e) {
                    Logging.w(TAG, "setParameters failed, zoomLevel: " + i2 + ", " + e);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int startCapture_l(int i, int i2, int i3) {
        SurfaceTexture surfaceTexture;
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("startCapture, w=", i, ", h=", i2, ", fps=");
        sbOooO0O0.append(i3);
        Logging.i(TAG, sbOooO0O0.toString());
        int iTryStartCapture = -1;
        if (this.mCamera == null) {
            Logging.e(TAG, "startCapture: camera is null!!");
            return -1;
        }
        int i4 = this.mCaptureOutputDataType;
        int i5 = 0;
        if (i4 == 1 || i4 == 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Camera1Tex-");
            sbOooO0o0.append(this.mId);
            SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create(sbOooO0o0.toString(), this.mShareContext, 8);
            this.mSurfaceTextureHelper = surfaceTextureHelperCreate;
            if (surfaceTextureHelperCreate == null) {
                Logging.e(TAG, "Failed to create SurfaceTextureHelper, force fallback to raw data type");
                this.mCaptureOutputDataType = 0;
                surfaceTexture = null;
            } else {
                surfaceTextureHelperCreate.getSurfaceTexture().setDefaultBufferSize(i, i2);
                this.mSurfaceTextureHelper.startListening(this);
                this.mEglContext = this.mSurfaceTextureHelper.getEglContext();
                surfaceTexture = this.mSurfaceTextureHelper.getSurfaceTexture();
                if (this.mCaptureOutputDataType == 2 && this.mTextureAndRawBufferSynchronizer == null) {
                    this.mTextureAndRawBufferSynchronizer = new VideoCapture.TextureAndRawBufferSynchronizer();
                }
            }
        } else {
            surfaceTexture = null;
        }
        if (this.mCaptureOutputDataType == 0) {
            if (this.mDummySurfaceTexture == null) {
                try {
                    this.mDummySurfaceTexture = new SurfaceTexture(42);
                } catch (Surface.OutOfResourcesException unused) {
                    Logging.e(TAG, "failed to create dummy SurfaceTexture!");
                }
            }
            surfaceTexture = this.mDummySurfaceTexture;
        }
        if (surfaceTexture == null) {
            i5 = -1;
        } else {
            this.mCaptureLock.lock();
            try {
                try {
                    this.mCamera.setPreviewTexture(surfaceTexture);
                    this.mCaptureLock.unlock();
                } catch (Throwable th) {
                    this.mCaptureLock.unlock();
                    throw th;
                }
            } catch (Exception unused2) {
                Logging.e(TAG, "failed to set preview texture, invalid surfaceTexture!");
                this.mDummySurfaceTexture = null;
                this.mCaptureLock.unlock();
                i5 = -1;
            }
        }
        if (i5 != 0) {
            return i5;
        }
        this.mCaptureLock.lock();
        this.isCaptureStarted = true;
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        this.mCaptureFps = i3;
        try {
            iTryStartCapture = tryStartCapture(i, i2, i3);
        } catch (Throwable th2) {
            try {
                Logging.e(TAG, "try start capture failed " + th2);
            } finally {
                this.mCaptureLock.unlock();
            }
        }
        return iTryStartCapture;
    }

    private void startFaceDetection() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.rtc.video.VideoCaptureCamera.5
                @Override // java.lang.Runnable
                public void run() {
                    VideoCaptureCamera.this.startFaceDetection_l();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFaceDetection_l() {
        if (this.mCamera == null) {
            return;
        }
        try {
            Logging.i(TAG, "enable face detection");
            this.mCamera.startFaceDetection();
            this.isFaceDetectionStarted = true;
        } catch (Exception e) {
            Logging.e(TAG, "start face detection failed:" + e);
            this.mCamera.stopFaceDetection();
            this.isFaceDetectionStarted = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int stopCapture_l() {
        int i;
        if (!this.isCaptureStarted) {
            Logging.w(TAG, "already stop capture");
            return 0;
        }
        try {
            if (this.isFaceDetectionStarted) {
                stopFaceDetection();
                this.mCamera.setFaceDetectionListener(null);
            }
        } catch (RuntimeException e) {
            Logging.e(TAG, "Failed to stop face detection", e);
        }
        try {
            this.mCamera.cancelAutoFocus();
        } catch (RuntimeException e2) {
            Logging.e(TAG, "Failed to cancle AutoFocus", e2);
        }
        try {
            this.mPreviewBufferLock.lock();
            this.isCaptureRunning = false;
            this.mCamera.stopPreview();
            this.mCamera.setErrorCallback(null);
            AgoraVideoDebugger.reset();
            this.mDroppedTextureBufferCount = 0;
            VideoCapture.TextureAndRawBufferSynchronizer textureAndRawBufferSynchronizer = this.mTextureAndRawBufferSynchronizer;
            if (textureAndRawBufferSynchronizer != null) {
                textureAndRawBufferSynchronizer.reset();
            }
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
                this.mSurfaceTextureHelper.dispose();
                this.mSurfaceTextureHelper = null;
            }
            this.mEglContext = null;
            int i2 = this.mCaptureOutputDataType;
            if (i2 == 0 || i2 == 2) {
                this.mCamera.setPreviewCallbackWithBuffer(null);
            }
            i = 0;
        } catch (RuntimeException e3) {
            Logging.e(TAG, "Failed to stop camera", e3);
            i = -1;
        }
        this.mPreviewBufferLock.unlock();
        if (i == 0) {
            this.isCaptureStarted = false;
        }
        return i;
    }

    private void stopFaceDetection() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.rtc.video.VideoCaptureCamera.6
                @Override // java.lang.Runnable
                public void run() {
                    VideoCaptureCamera.this.stopFaceDetection_l();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopFaceDetection_l() {
        if (this.mCamera == null) {
            return;
        }
        Logging.i(TAG, "disable face detection");
        this.mCamera.stopFaceDetection();
        this.isFaceDetectionStarted = false;
    }

    private String toCamera1ABMode(int i) {
        if (i == 0) {
            return DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        if (i != 1) {
            return i != 2 ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "60hz";
        }
        return "50hz";
    }

    private int tryStartCapture(int i, int i2, int i3) throws Throwable {
        int bitsPerPixel;
        if (this.mCamera == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Camera not initialized %d");
            sbOooO0o0.append(this.mId);
            Logging.e(TAG, sbOooO0o0.toString());
            return -1;
        }
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("tryStartCapture: ", i, "*", i2, ", frameRate: ");
        sbOooO0O0.append(i3);
        sbOooO0O0.append(", isCaptureRunning: ");
        sbOooO0O0.append(this.isCaptureRunning);
        sbOooO0O0.append(", isSurfaceReady: ");
        sbOooO0O0.append(this.isSurfaceReady);
        sbOooO0O0.append(", isCaptureStarted: ");
        sbOooO0O0.append(this.isCaptureStarted);
        sbOooO0O0.append(", outputDataType: ");
        sbOooO0O0.append(this.mCaptureOutputDataType);
        Logging.i(TAG, sbOooO0O0.toString());
        if (this.isCaptureRunning || !this.isCaptureStarted) {
            Logging.w(TAG, "tryStartCapture return");
            return 0;
        }
        Camera.Parameters parameters = this.mCamera.getParameters();
        parameters.setPreviewSize(i, i2);
        parameters.setPreviewFormat(this.mCaptureFormat);
        if (this.mPQFirst < 1) {
            Logging.i(TAG, "camera1::fps first");
            setPreviewFrameRateModeFPS(parameters, i3);
        } else {
            Logging.i(TAG, "camera1::PQ first");
            setPreviewFrameRateModePQ(parameters, i3);
        }
        setAdvancedCameraParameters(parameters);
        setDeviceSpecificParameters(parameters);
        this.mCamera.setParameters(parameters);
        int i4 = this.mCaptureOutputDataType;
        if (i4 == 0 || i4 == 2) {
            bitsPerPixel = ((ImageFormat.getBitsPerPixel(this.mCaptureFormat) * (i * i2)) / 8) + 4096;
            for (int i5 = 0; i5 < 3; i5++) {
                this.mCamera.addCallbackBuffer(new byte[bitsPerPixel]);
            }
            this.mCamera.setPreviewCallbackWithBuffer(this);
        } else {
            bitsPerPixel = 0;
        }
        this.mCamera.setErrorCallback(new Camera.ErrorCallback() { // from class: io.agora.rtc.video.VideoCaptureCamera.2
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i6, Camera camera) {
                Logging.e(VideoCaptureCamera.TAG, "onError: error code " + i6);
                VideoCaptureCamera videoCaptureCamera = VideoCaptureCamera.this;
                if (videoCaptureCamera.mCamera != null) {
                    videoCaptureCamera.stopCapture();
                    VideoCaptureCamera.this.mCaptureLock.lock();
                    try {
                        try {
                            Camera camera2 = VideoCaptureCamera.this.mCamera;
                            if (camera2 != null) {
                                camera2.release();
                                VideoCaptureCamera.this.mCamera = null;
                            }
                        } catch (Exception e) {
                            Logging.e(VideoCaptureCamera.TAG, "Camera release failed, " + e);
                        }
                        VideoCaptureCamera.this.mCaptureLock.unlock();
                    } catch (Throwable th) {
                        VideoCaptureCamera.this.mCaptureLock.unlock();
                        throw th;
                    }
                }
                VideoCaptureCamera videoCaptureCamera2 = VideoCaptureCamera.this;
                long j = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
                if (j != 0) {
                    int i7 = VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown;
                    if (i6 == 2) {
                        i7 = 6;
                    } else if (i6 == 100) {
                        i7 = 5;
                    }
                    videoCaptureCamera2.onCameraError(j, i7);
                }
            }
        });
        this.mCamera.startPreview();
        if (isAutoFaceFocusSupported()) {
            this.mCamera.setFaceDetectionListener(new Camera.FaceDetectionListener() { // from class: io.agora.rtc.video.VideoCaptureCamera.3
                private long mLastFocusedTs;

                @Override // android.hardware.Camera.FaceDetectionListener
                public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                    if (VideoCaptureCamera.this.faceDetectEnabled) {
                        VideoCaptureCamera.this.notifyFaceDetection(faceArr);
                    }
                    if (faceArr == null || faceArr.length == 0 || camera == null || !VideoCaptureCamera.this.mIsAutoFaceFocusEnabled) {
                        return;
                    }
                    if (System.currentTimeMillis() - this.mLastFocusedTs < 3000) {
                        if (faceArr[0].score > 20) {
                            VideoCaptureCamera.this.notifyCameraFocusAreaChanged(faceArr[0].rect);
                            return;
                        }
                        return;
                    }
                    if (faceArr[0].score <= 50) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("face score = ");
                        sbOooO0o1.append(faceArr[0].score);
                        Logging.i(VideoCaptureCamera.TAG, sbOooO0o1.toString());
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(faceArr[0].rect, 1000));
                        if (camera.getParameters().getMaxNumFocusAreas() > 0) {
                            camera.getParameters().setFocusAreas(arrayList);
                        }
                        if (camera.getParameters().getMaxNumMeteringAreas() > 0) {
                            camera.getParameters().setMeteringAreas(arrayList);
                        }
                        VideoCaptureCamera.this.notifyCameraFocusAreaChanged(faceArr[0].rect);
                        camera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc.video.VideoCaptureCamera.3.1
                            @Override // android.hardware.Camera.AutoFocusCallback
                            public void onAutoFocus(boolean z, Camera camera2) {
                                Logging.d(VideoCaptureCamera.TAG, "auto face focus called api1 every 3 seconds");
                                if (camera2 != null) {
                                    try {
                                        camera2.cancelAutoFocus();
                                    } catch (RuntimeException e) {
                                        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Exception in cancelAutoFocus: ");
                                        sbOooO0o2.append(Log.getStackTraceString(e));
                                        Logging.w(VideoCaptureCamera.TAG, sbOooO0o2.toString());
                                    }
                                }
                            }
                        });
                        this.mLastFocusedTs = System.currentTimeMillis();
                    } catch (RuntimeException e) {
                        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Exception in onFaceDetection callback: ");
                        sbOooO0o2.append(Log.getStackTraceString(e));
                        Logging.w(VideoCaptureCamera.TAG, sbOooO0o2.toString());
                    }
                }
            });
            if (this.mIsAutoFaceFocusEnabled || this.faceDetectEnabled) {
                startFaceDetection();
            }
        } else if (isFaceDetectedSupported()) {
            this.mCamera.setFaceDetectionListener(new Camera.FaceDetectionListener() { // from class: io.agora.rtc.video.VideoCaptureCamera.4
                @Override // android.hardware.Camera.FaceDetectionListener
                public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                    if (VideoCaptureCamera.this.faceDetectEnabled) {
                        VideoCaptureCamera.this.notifyFaceDetection(faceArr);
                    }
                }
            });
            if (this.faceDetectEnabled) {
                startFaceDetection();
            }
        }
        this.mPreviewBufferLock.lock();
        this.mExpectedRawBufferSize = bitsPerPixel;
        this.isCaptureRunning = true;
        this.mPreviewBufferLock.unlock();
        Camera.Parameters parameters2 = this.mCamera.getParameters();
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Params: ");
        sbOooO0o1.append(parameters2.flatten());
        Logging.i(TAG, sbOooO0o1.toString());
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int UnRegisterNativeHandle() {
        Logging.d(TAG, "UnRegisterNativeHandle called");
        this.mNativeVideoCaptureDeviceAndroid = 0L;
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int allocate() {
        if (this.mCameraPreviewHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("camera-preview-thread");
            this.mCameraPreviewHandlerThread = handlerThread;
            handlerThread.start();
            if (this.mCameraPreviewHandlerThread != null) {
                this.mPreviewHandler = new Handler(this.mCameraPreviewHandlerThread.getLooper());
            }
        }
        this.mAllocated = -1;
        if (this.mPreviewHandler != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mPreviewHandler.postAtFrontOfQueue(new Runnable() { // from class: io.agora.rtc.video.VideoCaptureCamera.1
                @Override // java.lang.Runnable
                public void run() {
                    VideoCaptureCamera videoCaptureCamera = VideoCaptureCamera.this;
                    videoCaptureCamera.mAllocated = videoCaptureCamera.allocate_l();
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.mAllocated;
    }

    public int createCapabilities() {
        String string;
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters != null) {
            String strOooO00o = o0ooOOo.OooO00o(OooO00o.OooO0o0("\"id\":"), this.mId, ",");
            List<Camera.Size> supportedPreviewSizes = cameraParameters.getSupportedPreviewSizes();
            String strOooO00o2 = "";
            String strOooO00o3 = "";
            for (int i = 0; i < supportedPreviewSizes.size(); i++) {
                int i2 = supportedPreviewSizes.get(i).width;
                int i3 = supportedPreviewSizes.get(i).height;
                if (i2 >= 240 && i3 >= 240 && (i2 >= 320 || i3 >= 320)) {
                    String strOooO00o4 = Oooo0.OooO00o("{\"w\":", i2, ",\"h\":", i3, "}");
                    strOooO00o3 = !strOooO00o3.isEmpty() ? OooO0OO.OooO00o(strOooO00o3, ",", strOooO00o4) : strOooO00o4;
                }
            }
            List<Integer> supportedPreviewFormats = cameraParameters.getSupportedPreviewFormats();
            String[] strArr = Build.SUPPORTED_ABIS;
            boolean z = strArr != null && strArr[0].startsWith("x86");
            if (VideoCapture.isEmulator() || (z && supportedPreviewFormats.size() > 1)) {
                supportedPreviewFormats.remove((Object) 842094169);
            }
            int i4 = 0;
            String strOooO00o5 = "";
            while (i4 < supportedPreviewFormats.size()) {
                int iTranslateToEngineFormat = VideoCapture.translateToEngineFormat(supportedPreviewFormats.get(i4).intValue());
                strOooO00o5 = i4 != supportedPreviewFormats.size() - 1 ? OooO0O0.OooO00o.OooO00o(strOooO00o5, iTranslateToEngineFormat, ",") : android.support.v4.media.OooO00o.OooO00o(strOooO00o5, iTranslateToEngineFormat);
                i4++;
            }
            List<Integer> supportedPreviewFrameRates = cameraParameters.getSupportedPreviewFrameRates();
            int i5 = 0;
            while (i5 < supportedPreviewFrameRates.size()) {
                int iIntValue = supportedPreviewFrameRates.get(i5).intValue();
                strOooO00o2 = i5 != supportedPreviewFrameRates.size() - 1 ? OooO0O0.OooO00o.OooO00o(strOooO00o2, iIntValue, ",") : android.support.v4.media.OooO00o.OooO00o(strOooO00o2, iIntValue);
                i5++;
            }
            StringBuilder sbOooO00o = o00oOoo.OooO00o("{", strOooO00o, "\"resolution\":", "[", strOooO00o3);
            OooO0O0.OooO00o(sbOooO00o, "],", "\"format\":", "[", strOooO00o5);
            OooO0O0.OooO00o(sbOooO00o, "],", "\"fps\":", "[", strOooO00o2);
            sbOooO00o.append("]}");
            string = sbOooO00o.toString();
        } else {
            string = null;
        }
        VideoCapture.cacheCapability(this.mId, this.mContext, string, getCaptureName());
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public void deallocate() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.rtc.video.VideoCaptureCamera.20
                @Override // java.lang.Runnable
                public void run() {
                    VideoCaptureCamera.this.deallocate_l();
                }
            });
        }
        Handler handler2 = this.mPreviewHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.mCameraPreviewHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mCameraPreviewHandlerThread = null;
            this.mPreviewHandler = null;
        }
    }

    public Camera.Parameters getCameraParameters() {
        try {
            return this.mCamera.getParameters();
        } catch (RuntimeException e) {
            Logging.e(TAG, "getCameraParameters: Camera.getParameters: ", e);
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.release();
                this.mCamera = null;
            }
            return null;
        }
    }

    @Override // io.agora.rtc.video.VideoCapture
    public float getMaxZoom() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Float) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Float>() { // from class: io.agora.rtc.video.VideoCaptureCamera.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Float call() {
                    return Float.valueOf(VideoCaptureCamera.this.getMaxZoom_l());
                }
            })).floatValue();
        }
        return -1.0f;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isAutoFaceFocusSupported() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Boolean>() { // from class: io.agora.rtc.video.VideoCaptureCamera.19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(VideoCaptureCamera.this.isAutoFaceFocusSupported_l());
                }
            })).booleanValue();
        }
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isExposureSupported() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Boolean>() { // from class: io.agora.rtc.video.VideoCaptureCamera.17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(VideoCaptureCamera.this.isExposureSupported_l());
                }
            })).booleanValue();
        }
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isFocusSupported() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Boolean>() { // from class: io.agora.rtc.video.VideoCaptureCamera.16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(VideoCaptureCamera.this.isFocusSupported_l());
                }
            })).booleanValue();
        }
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isTorchSupported() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Boolean>() { // from class: io.agora.rtc.video.VideoCaptureCamera.15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(VideoCaptureCamera.this.isTorchSupported_l());
                }
            })).booleanValue();
        }
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isZoomSupported() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Boolean>() { // from class: io.agora.rtc.video.VideoCaptureCamera.18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(VideoCaptureCamera.this.isZoomSupported_l());
                }
            })).booleanValue();
        }
        return false;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        try {
            this.mPreviewBufferLock.lock();
            if (bArr != null && this.isCaptureRunning) {
                int length = bArr.length;
                int i = this.mExpectedRawBufferSize;
                if (length == i && this.mNativeVideoCaptureDeviceAndroid != 0) {
                    onRawBufferAvailable(bArr, i, this.mCaptureWidth, this.mCaptureHeight, this.mCaptureFormat);
                } else if (this.mNativeVideoCaptureDeviceAndroid == 0) {
                    Logging.w(TAG, "warning mNativeVideoCaptureDeviceAndroid = 0, error");
                }
            }
        } finally {
            if (camera != null && this.isCaptureRunning) {
                camera.addCallbackBuffer(bArr);
            }
            this.mPreviewBufferLock.unlock();
        }
    }

    @Override // io.agora.rtc.gl.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        int frameOrientation = getFrameOrientation();
        if (this.mIsCameraFacingFront) {
            fArr = RendererCommon.multiplyMatrices(fArr, RendererCommon.horizontalFlipMatrix());
        }
        VideoFrame.TextureBuffer textureBufferCreateTextureBuffer = this.mSurfaceTextureHelper.createTextureBuffer(this.mCaptureWidth, this.mCaptureHeight, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
        onTextureBufferAvailable(textureBufferCreateTextureBuffer, frameOrientation, j);
        textureBufferCreateTextureBuffer.release();
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setAntiBandingMode(final int i) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.setAntiBandingMode_l(i));
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setAutoFaceFocus(boolean z) {
        Logging.d(TAG, "setAutoFaceFocus: " + z);
        boolean z2 = this.mIsAutoFaceFocusEnabled != z;
        this.mIsAutoFaceFocusEnabled = z;
        if (isAutoFaceFocusSupported() && z2) {
            boolean z3 = this.mIsAutoFaceFocusEnabled;
            if (z3 && !this.isFaceDetectionStarted) {
                startFaceDetection();
            } else if (!z3 && this.isFaceDetectionStarted && !this.faceDetectEnabled) {
                stopFaceDetection();
            }
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setCaptureFormat(int i, int i2, boolean z) {
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("setCaptureFormat: ", i, " type: ", i2, " force texture oes: ");
        sbOooO0O0.append(z);
        Logging.i(TAG, sbOooO0O0.toString());
        VideoCapture.FORCE_TEXTURE_OES = z;
        this.mCaptureOutputDataType = VideoCapture.translateToCaptureOutputDataType(i2);
        int iTranslateToAndroidFormat = VideoCapture.translateToAndroidFormat(i);
        this.mCaptureFormat = iTranslateToAndroidFormat;
        if (iTranslateToAndroidFormat != 0) {
            return 0;
        }
        Logging.e(TAG, "setCaptureFormat failed, unkonwn format: " + i);
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setEdgeEnhanceMode(int i) {
        Logging.e(TAG, "EdgeEnhancement not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setExposure(final float f, final float f2, final boolean z) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.setExposure_l(f, f2, z));
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setExposureCompensation(final int i) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    VideoCaptureCamera.this.setExposureCompensation_l(i);
                    return 0;
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setFaceDetection(boolean z) {
        Logging.d(TAG, "setFaceDetection: " + z);
        boolean z2 = this.faceDetectEnabled != z;
        this.faceDetectEnabled = z;
        if (isFaceDetectedSupported() && z2) {
            boolean z3 = this.faceDetectEnabled;
            if (z3 && !this.isFaceDetectionStarted) {
                startFaceDetection();
            } else if (!z3 && this.isFaceDetectionStarted && !this.mIsAutoFaceFocusEnabled) {
                stopFaceDetection();
            }
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setFocus(final float f, final float f2, final boolean z) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.setFocus_l(f, f2, z));
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setNoiseReductionMode(int i) {
        Logging.e(TAG, "NoiseReduction not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setTorchMode(final boolean z) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.setTorchMode_l(z));
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setVideoStabilityMode(int i) {
        Logging.e(TAG, "VideoStability not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setZoom(final float f) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.setZoom_l(f));
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int startCapture(final int i, final int i2, final int i3) {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.startCapture_l(i, i2, i3));
                }
            })).intValue();
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int stopCapture() {
        Handler handler = this.mPreviewHandler;
        if (handler != null) {
            return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc.video.VideoCaptureCamera.14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(VideoCaptureCamera.this.stopCapture_l());
                }
            })).intValue();
        }
        return -1;
    }

    private boolean isZoomSupported(Camera.Parameters parameters) {
        if (parameters != null) {
            if (parameters.isZoomSupported()) {
                return true;
            }
            Logging.w(TAG, "camera zoom is not supported ");
        }
        return false;
    }
}
