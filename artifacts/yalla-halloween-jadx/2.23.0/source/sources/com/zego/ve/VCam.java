package com.zego.ve;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.internal.NativeProtocol;
import com.google.logging.type.LogSeverity;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import p082o000OoOo.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public class VCam implements Handler.Callback {
    private static final int EXPOSURE_MODE_AUTO = 0;
    private static final int EXPOSURE_MODE_AUTO_EXPOSURE = 4;
    private static final int EXPOSURE_MODE_CONTINUOUS_AUTO_EXPOSURE = 5;
    private static final int EXPOSURE_MODE_CUSTOM = 1;
    private static final int FOCUS_MODE_AUTO = 0;
    private static final int FOCUS_MODE_AUTO_FOCUS = 8;
    private static final int FOCUS_MODE_CONTINUOUS_AUTO_FOCUS = 9;
    private static final int FOCUS_MODE_CONTINUOUS_PICTURE = 6;
    private static final int FOCUS_MODE_CONTINUOUS_VIDEO = 5;
    private static final int FOCUS_MODE_EDOF = 4;
    private static final int FOCUS_MODE_FIXED = 3;
    private static final int FOCUS_MODE_INFINITY = 1;
    private static final int FOCUS_MODE_MACRO = 2;
    private static final int MESSAGE_EXPOSURE_LOCK = 0;
    private static final int SCENE_MODE_ACTION = 3;
    private static final int SCENE_MODE_LOW_LIGHT = 1;
    private static final int SCENE_MODE_NIGHT = 2;
    private static final int SCENE_MODE_NONE = 0;
    private static final int SCENE_MODE_PORTRAIT = 4;
    private static final String TAG = "vcap";
    private long mThis = 0;
    private Context mContext = null;
    private CameraAvailabilityCallback mCameraAvailabilityCallback = null;
    private Camera mCam = null;
    private Camera.CameraInfo mCamInfo = null;
    int mWidth = 640;
    int mHeight = 480;
    int mFrameRate = 15;
    boolean mNeedHack = false;
    int mFocusMode = -1;
    int mExposureMode = -1;
    float mExposureCompensation = 0.0f;
    float mFocusPointX = 0.0f;
    float mFocusPointY = 0.0f;
    float mExposurePointX = 0.0f;
    float mExposurePointY = 0.0f;
    int mFrontCameraId = -1;
    int mBackCameraId = -1;
    int mUseCameraId = -1;
    int mFPSMode = 0;
    boolean mUseFaceDetection = false;
    boolean mIsFocusing = false;
    int mAreaSize = 0;
    private Matrix matrix = new Matrix();
    int mSceneMode = 0;
    private boolean mTryDefault = true;
    boolean mLowLightBoost = false;
    Camera.Parameters mParams = null;
    private Handler mHandler = null;
    private int mExposureGeneration = 0;

    private String GetCameraString(int i) {
        return i == this.mFrontCameraId ? "front camera" : "back camera";
    }

    private Rect calculateArea(float f, float f2) {
        int i = this.mAreaSize;
        float f3 = (i / this.mWidth) * 2.0f;
        float f4 = (i / this.mHeight) * 2.0f;
        float fClamp2 = clamp2(f - (f3 / 2.0f), -1.0f, 1.0f - f3);
        float fClamp3 = clamp2(f2 - (f4 / 2.0f), -1.0f, 1.0f - f4);
        return new Rect(clamp((int) (fClamp2 * 1000.0f), -1000, 1000), clamp((int) (fClamp3 * 1000.0f), -1000, 1000), clamp((int) ((fClamp2 + f3) * 1000.0f), -1000, 1000), clamp((int) ((fClamp3 + f4) * 1000.0f), -1000, 1000));
    }

    public static int clamp(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    public static float clamp2(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    private boolean isSupportCameraAvailabilityCallback() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onCameraAvailable(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onCameraUnavailable(long j);

    @TargetApi(21)
    private void registerCameraAvailabilityCallback() {
        Context context = this.mContext;
        if (context != null) {
            try {
                CameraManager cameraManager = (CameraManager) context.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera);
                CameraAvailabilityCallback cameraAvailabilityCallback = new CameraAvailabilityCallback(this.mThis, new CameraAvailabilityCallback.Listener() { // from class: com.zego.ve.VCam.1
                    @Override // com.zego.ve.CameraAvailabilityCallback.Listener
                    public void onCameraAvailable(long j, String str) {
                        Log.i(VCam.TAG, "trace interruption this: " + VCam.this + ", cameraId: " + str + " available, mUseCameraId: " + VCam.this.mUseCameraId);
                        VCam.onCameraAvailable(j);
                    }

                    @Override // com.zego.ve.CameraAvailabilityCallback.Listener
                    public void onCameraUnavailable(long j, String str) {
                        Log.i(VCam.TAG, "trace interruption this: " + VCam.this + ", cameraId: " + str + " unavailable, mUseCameraId: " + VCam.this.mUseCameraId);
                        VCam.onCameraUnavailable(j);
                    }
                });
                this.mCameraAvailabilityCallback = cameraAvailabilityCallback;
                cameraManager.registerAvailabilityCallback(cameraAvailabilityCallback, (Handler) null);
            } catch (Throwable th) {
                Log.e(TAG, "registerCameraAvailabilityCallback failed, " + th);
            }
        }
    }

    @TargetApi(21)
    private void unregisterCameraAvailabilityCallback() {
        if (this.mContext != null) {
            try {
                this.mCameraAvailabilityCallback.uninit();
                ((CameraManager) this.mContext.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera)).unregisterAvailabilityCallback(this.mCameraAvailabilityCallback);
                this.mCameraAvailabilityCallback = null;
            } catch (Throwable th) {
                Log.e(TAG, "unregisterCameraAvailabilityCallback failed, " + th);
            }
        }
    }

    public boolean checkPermission() {
        return PermissionChecker.checkSelfPermission(this.mContext, "android.permission.CAMERA");
    }

    public int closeTorch() {
        boolean z;
        if (this.mCam == null) {
            return -1;
        }
        String flashMode = this.mParams.getFlashMode();
        if (!this.mParams.getSupportedFlashModes().contains(DebugKt.DEBUG_PROPERTY_VALUE_OFF) || flashMode.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            z = false;
        } else {
            try {
                this.mParams.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            } catch (Exception e) {
                android.util.Log.e(TAG, "vcap: set flash mode failed");
                e.printStackTrace();
            }
            z = true;
        }
        if (!z) {
            android.util.Log.i(TAG, "vcap: flash mode left unset");
            return 0;
        }
        try {
            this.mCam.setParameters(this.mParams);
        } catch (Exception e2) {
            android.util.Log.e(TAG, "vcap: set flash mode -- set camera parameters error with exception");
            e2.printStackTrace();
        }
        return 0;
    }

    public int createCam(int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        if (i == -1) {
            android.util.Log.e(TAG, "vcap: invalid camera id");
            return -1;
        }
        this.mSceneMode = i2;
        this.mLowLightBoost = z;
        android.util.Log.i(TAG, "vcap -- board: " + Build.BOARD + " device: " + Build.DEVICE + " manufacturer: " + Build.MANUFACTURER + " brand: " + Build.BRAND + " model: " + Build.MODEL + " product: " + Build.PRODUCT + " sdk: " + Build.VERSION.SDK_INT + " cameraid:" + i);
        if (this.mCam != null) {
            return 0;
        }
        this.mCamInfo = new Camera.CameraInfo();
        try {
            this.mCam = Camera.open(i);
            Camera.getCameraInfo(i, this.mCamInfo);
        } catch (RuntimeException e) {
            Log.e(TAG, "trace interruption open " + GetCameraString(i) + " failed, " + e);
            this.mCam = null;
        }
        this.mUseCameraId = i;
        if (this.mCam == null) {
            if (!this.mTryDefault) {
                android.util.Log.e(TAG, "vcap: no camera found");
                return -1;
            }
            android.util.Log.w(TAG, "vcap: no camera found, try default");
            try {
                this.mCam = Camera.open();
            } catch (RuntimeException e2) {
                Log.e(TAG, "trace interruption open " + GetCameraString(this.mBackCameraId) + " failed, " + e2);
                this.mCam = null;
            }
            if (this.mCam == null) {
                android.util.Log.e(TAG, "vcap: no camera found");
                return -1;
            }
            Camera.getCameraInfo(this.mBackCameraId, this.mCamInfo);
            this.mUseCameraId = this.mBackCameraId;
        }
        Camera.Parameters parameters = this.mCam.getParameters();
        this.mParams = parameters;
        Camera.Size preferredPreviewSizeForVideo = parameters.getPreferredPreviewSizeForVideo();
        boolean z3 = this.mWidth >= 720 && this.mSceneMode != 0;
        List<Camera.Size> supportedVideoSizes = this.mParams.getSupportedVideoSizes();
        if (supportedVideoSizes == null) {
            supportedVideoSizes = this.mParams.getSupportedPreviewSizes();
        }
        if (supportedVideoSizes != null) {
            i4 = 0;
            i5 = 0;
            for (Camera.Size size : supportedVideoSizes) {
                android.util.Log.i(TAG, "vcap: support size -- " + size.width + "x" + size.height);
                int i8 = size.width;
                int i9 = size.height;
                if (i8 * i9 > i4 * i5 && (i8 * 3 == i9 * 4 || i8 * 9 == i9 * 16)) {
                    i5 = i9;
                    i4 = i8;
                }
            }
            i3 = 0;
            i6 = 0;
            for (Camera.Size size2 : supportedVideoSizes) {
                int i10 = size2.width;
                if (i10 % 16 == 0) {
                    int i11 = size2.height;
                    if (i11 % 16 == 0 && (!z3 || preferredPreviewSizeForVideo.height * i10 == preferredPreviewSizeForVideo.width * i11)) {
                        int i12 = this.mWidth;
                        if (i10 < i12 || i11 < (i7 = this.mHeight)) {
                            if (i10 < i12) {
                                int i13 = this.mHeight;
                                if (i11 >= i13 && (i3 < i12 || i6 < i13)) {
                                    if ((i3 < i12 && i6 < i13) || ((i6 >= i13 && i10 > i3) || i10 * i11 > i3 * i6)) {
                                        i6 = i11;
                                        i3 = i10;
                                    }
                                }
                            } else if (i3 < i12 || i6 < this.mHeight) {
                                if ((i3 < i12 && i6 < this.mHeight) || ((i3 >= i12 && i11 > i6) || i10 * i11 > i3 * i6)) {
                                    i6 = i11;
                                    i3 = i10;
                                }
                            }
                        } else if (i3 < i12 || i6 < i7 || i10 * i11 < i3 * i6) {
                            i6 = i11;
                            i3 = i10;
                        }
                    }
                }
            }
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (i3 * i6 != 0) {
            this.mParams.setPreviewSize(i3, i6);
            this.mWidth = i3;
            this.mHeight = i6;
        } else if (i4 * i5 != 0) {
            this.mParams.setPreviewSize(i4, i5);
            this.mWidth = i4;
            this.mHeight = i5;
        } else {
            this.mParams.setPreviewSize(320, 240);
            this.mWidth = 320;
            this.mHeight = 240;
        }
        if (Build.MANUFACTURER.equals("Xiaomi")) {
            Build.MODEL.equals("MI 4LTE");
        }
        if (this.mNeedHack) {
            android.util.Log.i(TAG, "vcap: use prefer preview size");
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && preferredPreviewSizeForVideo != null) {
            this.mParams.setPreviewSize(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
            this.mWidth = preferredPreviewSizeForVideo.width;
            this.mHeight = preferredPreviewSizeForVideo.height;
        }
        StringBuilder sb = new StringBuilder("vcap: preview size -- perferred:");
        sb.append(preferredPreviewSizeForVideo == null ? 0 : preferredPreviewSizeForVideo.width);
        sb.append("x");
        OooOOO0.OooO00o(sb, preferredPreviewSizeForVideo == null ? 0 : preferredPreviewSizeForVideo.height, ", candidate:", i3, "x");
        sb.append(i6);
        sb.append(", preview:");
        sb.append(this.mWidth);
        sb.append("x");
        sb.append(this.mHeight);
        android.util.Log.i(TAG, sb.toString());
        if (this.mFPSMode != 0) {
            updateRate(this.mFrameRate, this.mParams);
        }
        this.mParams.setRecordingHint(z3);
        try {
            this.mCam.setParameters(this.mParams);
            Camera.Parameters parameters2 = this.mCam.getParameters();
            this.mParams = parameters2;
            this.mWidth = parameters2.getPreviewSize().width;
            this.mHeight = this.mParams.getPreviewSize().height;
            this.mAreaSize = this.mWidth / 10;
            if (isSupportCameraAvailabilityCallback()) {
                registerCameraAvailabilityCallback();
            }
            return 0;
        } catch (Exception e3) {
            android.util.Log.e(TAG, "vcap: set camera parameters error with exception width:" + this.mParams.getPreviewSize().width + " height:" + this.mParams.getPreviewSize().height + ".");
            e3.printStackTrace();
            this.mCam.release();
            this.mCam = null;
            if (this.mNeedHack) {
                return -1;
            }
            this.mNeedHack = true;
            return createCam(i, this.mSceneMode, this.mLowLightBoost);
        }
    }

    public int doSetExposureCompensation(float f, Camera.Parameters parameters) {
        int minExposureCompensation = (int) ((f < 0.0f ? parameters.getMinExposureCompensation() * (-1) : parameters.getMaxExposureCompensation()) * f);
        try {
            parameters.setExposureCompensation(minExposureCompensation);
            android.util.Log.i(TAG, "vcap: set exposure compensation " + minExposureCompensation);
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set exposure compensation failed");
            e.printStackTrace();
            return -1;
        }
    }

    public int doSetExposureMode(int i, Camera.Parameters parameters) {
        if (i == -1) {
            return 0;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            android.util.Log.e(TAG, "vcap: auto exposure lock not supported");
            return -1;
        }
        this.mExposureGeneration++;
        try {
            if (i == 0 || i == 5 || i == 4) {
                parameters.setAutoExposureLock(false);
            } else if (i == 1) {
                parameters.setAutoExposureLock(true);
            }
            android.util.Log.e(TAG, "vcap: set exposure mode " + i);
            if (i == 4) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                messageObtain.obj = Integer.valueOf(this.mExposureGeneration);
                this.mHandler.sendMessageDelayed(messageObtain, 200L);
            }
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set exposure mode failed");
            e.printStackTrace();
        }
        doSetExposureCompensation(this.mExposureCompensation, parameters);
        return 0;
    }

    public int doSetExposurePoint(float f, float f2, Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() == 0) {
            android.util.Log.i(TAG, "vcap: set exposure areas not supported");
            return -1;
        }
        Rect rectCalculateArea = calculateArea(f, f2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rectCalculateArea, LogSeverity.EMERGENCY_VALUE));
        try {
            parameters.setMeteringAreas(arrayList);
            android.util.Log.i(TAG, "vcap: set exposure area " + rectCalculateArea.toString());
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set exposure areas failed");
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    public int doSetFocusMode(int i, Camera.Parameters parameters) {
        String str;
        boolean z;
        if (i == 0) {
            str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        } else if (i == 1) {
            str = "infinity";
        } else if (i == 2) {
            str = "macro";
        } else if (i == 3) {
            str = "fixed";
        } else if (i == 4) {
            str = "edof";
        } else if (i == 5) {
            str = "continuous-video";
        } else if (i != 8) {
            str = "continuous-picture";
        } else {
            str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            if (supportedFocusModes.contains(str)) {
                try {
                    parameters.setFocusMode(str);
                    Log.i(TAG, "vcap: set focus mode ".concat(str));
                } catch (Exception e) {
                    Log.e(TAG, "vcap: set focus mode failed");
                    e.printStackTrace();
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = supportedFocusModes.get(0);
                try {
                    parameters.setFocusMode(str);
                    android.util.Log.i(TAG, "vcap: fallback focus mode " + str);
                } catch (Exception e2) {
                    android.util.Log.e(TAG, "vcap: fallback focus mode failed");
                    e2.printStackTrace();
                }
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            return (str == DebugKt.DEBUG_PROPERTY_VALUE_AUTO || str == "macro") ? 1 : 0;
        }
        Log.i(TAG, "vcap: focus mode left unset");
        return -1;
    }

    public int doSetFocusPoint(float f, float f2, Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() == 0) {
            android.util.Log.i(TAG, "vcap: set focus areas not supported");
            return -1;
        }
        Rect rectCalculateArea = calculateArea(f, f2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rectCalculateArea, LogSeverity.EMERGENCY_VALUE));
        try {
            parameters.setFocusAreas(arrayList);
            android.util.Log.i(TAG, "vcap: set focus area " + rectCalculateArea.toString());
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set focus areas failed");
            e.printStackTrace();
            return -1;
        }
    }

    public void enumerateCamera() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            int i2 = cameraInfo.facing;
            if (i2 == 0 && this.mBackCameraId == -1) {
                this.mBackCameraId = i;
            }
            if (i2 == 1 && this.mFrontCameraId == -1) {
                this.mFrontCameraId = i;
            }
        }
        Log.i(TAG, "trace interruption enumerateCamera this: " + this + ", mFrontCameraId: " + this.mFrontCameraId + ", mBackCameraId: " + this.mBackCameraId);
    }

    public int getBackCameraId() {
        return this.mBackCameraId;
    }

    public int getFramerate() {
        return this.mFrameRate;
    }

    public int getFront() {
        Camera.CameraInfo cameraInfo = this.mCamInfo;
        return (cameraInfo == null || cameraInfo.facing != 1) ? 0 : 1;
    }

    public int getFrontCameraId() {
        return this.mFrontCameraId;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getMaxZoomRatio() {
        if (this.mCam == null || !this.mParams.isZoomSupported()) {
            return 100;
        }
        List<Integer> zoomRatios = this.mParams.getZoomRatios();
        if (zoomRatios.size() == 0) {
            return 100;
        }
        return zoomRatios.get(this.mParams.getMaxZoom()).intValue();
    }

    public int getOrientation() {
        Camera.CameraInfo cameraInfo = this.mCamInfo;
        if (cameraInfo != null) {
            return cameraInfo.orientation;
        }
        return 0;
    }

    public int getWidth() {
        return this.mWidth;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0 && ((Integer) message.obj).intValue() == this.mExposureGeneration) {
            doSetExposureMode(1, this.mParams);
            try {
                this.mCam.setParameters(this.mParams);
            } catch (Exception e) {
                android.util.Log.e(TAG, "vcap: set exposure point -- set camera parameters error with exception");
                e.printStackTrace();
            }
        }
        return true;
    }

    public void init() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.myLooper(), this);
        }
    }

    public boolean isFocusSupported() {
        Camera.Parameters parameters = this.mParams;
        if (parameters == null) {
            return false;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        boolean z = supportedFocusModes != null && (supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) || supportedFocusModes.contains("continuous-video") || supportedFocusModes.contains("continuous-picture"));
        if (z) {
            return this.mParams.getMaxNumFocusAreas() > 0;
        }
        return z;
    }

    public boolean isSamsung() {
        return "samsung".equals(Build.MANUFACTURER.toLowerCase());
    }

    public int openTorch() {
        boolean z;
        if (this.mCam == null) {
            return -1;
        }
        String flashMode = this.mParams.getFlashMode();
        if (!this.mParams.getSupportedFlashModes().contains("torch") || flashMode.equals("torch")) {
            z = false;
        } else {
            try {
                this.mParams.setFlashMode("torch");
            } catch (Exception e) {
                android.util.Log.e(TAG, "vcap: set flash mode failed");
                e.printStackTrace();
            }
            z = true;
        }
        if (!z) {
            android.util.Log.i(TAG, "vcap: vcap: flash mode left unset");
            return 0;
        }
        try {
            this.mCam.setParameters(this.mParams);
        } catch (Exception e2) {
            android.util.Log.e(TAG, "vcap: set flash mode -- set camera parameters error with exception");
            e2.printStackTrace();
        }
        return 0;
    }

    public int releaseCam() {
        if (isSupportCameraAvailabilityCallback()) {
            unregisterCameraAvailabilityCallback();
        }
        Camera camera = this.mCam;
        if (camera != null) {
            camera.release();
            this.mCam = null;
        }
        this.mCamInfo = null;
        this.mParams = null;
        this.mUseCameraId = -1;
        return 0;
    }

    public int setContext(long j, Context context, boolean z) {
        this.mThis = j;
        this.mContext = context;
        this.mTryDefault = z;
        return 0;
    }

    public int setExposureCompensation(float f) {
        this.mExposureCompensation = f;
        if (this.mCam == null || doSetExposureCompensation(f, this.mParams) != 0) {
            return -1;
        }
        try {
            this.mCam.setParameters(this.mParams);
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set exposure compensation -- set camera parameters error with exception");
            e.printStackTrace();
            return -1;
        }
    }

    public int setExposureMode(int i) {
        if (i == -1) {
            i = 0;
        }
        this.mExposureMode = i;
        if (this.mCam == null || doSetExposureMode(i, this.mParams) != 0) {
            return -1;
        }
        try {
            this.mCam.setParameters(this.mParams);
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set exposure mode -- set camera parameters error with exception");
            e.printStackTrace();
            return -1;
        }
    }

    public int setExposurePoint(float f, float f2) {
        this.mExposurePointX = f;
        this.mExposurePointY = f2;
        if (this.mCam == null || this.mUseFaceDetection) {
            android.util.Log.e(TAG, "vcap: set exposure point -- skip");
            return -1;
        }
        doSetExposurePoint(f, f2, this.mParams);
        try {
            this.mCam.setParameters(this.mParams);
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set exposure point -- set camera parameters error with exception");
            e.printStackTrace();
            return -1;
        }
    }

    public int setFocusMode(int i) {
        this.mFocusMode = i;
        Camera camera = this.mCam;
        if (camera == null) {
            return -1;
        }
        camera.cancelAutoFocus();
        int iDoSetFocusMode = doSetFocusMode(this.mFocusMode, this.mParams);
        if (iDoSetFocusMode >= 0) {
            if (!this.mUseFaceDetection) {
                doSetFocusPoint(this.mFocusPointX, this.mFocusPointY, this.mParams);
            }
        } else if (this.mParams.getMaxNumFocusAreas() > 0) {
            this.mParams.setFocusAreas(null);
        }
        try {
            this.mCam.setParameters(this.mParams);
            if (iDoSetFocusMode <= 0) {
                return 0;
            }
            this.mIsFocusing = true;
            this.mCam.autoFocus(new Camera.AutoFocusCallback() { // from class: com.zego.ve.VCam.3
                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z, Camera camera2) {
                    android.util.Log.e(VCam.TAG, "vcap: set focus success:" + z);
                    VCam.this.mIsFocusing = false;
                }
            });
            return 0;
        } catch (Exception e) {
            android.util.Log.e(TAG, "vcap: set focus mode -- set camera parameters error with exception");
            e.printStackTrace();
            return -1;
        }
    }

    public int setFocusPoint(float f, float f2) {
        this.mFocusPointX = f;
        this.mFocusPointY = f2;
        if (this.mCam == null || this.mUseFaceDetection || this.mIsFocusing) {
            return -1;
        }
        setFocusMode(this.mFocusMode);
        return 0;
    }

    public int setRate(int i, int i2) {
        this.mFPSMode = i2;
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            i = 30;
        }
        this.mFrameRate = i;
        if (this.mCam != null) {
            updateRate(i, this.mParams);
            try {
                this.mCam.setParameters(this.mParams);
            } catch (Exception e) {
                android.util.Log.i(TAG, "vcap: update fps -- set camera parameters error with exception");
                e.printStackTrace();
            }
        }
        return 0;
    }

    public int setSize(int i, int i2) {
        if (i < i2) {
            this.mWidth = i2;
            this.mHeight = i;
        } else {
            this.mWidth = i;
            this.mHeight = i2;
        }
        this.mNeedHack = false;
        return 0;
    }

    public int setSurfaceTexture(SurfaceTexture surfaceTexture) {
        Camera camera = this.mCam;
        if (camera == null) {
            return -1;
        }
        try {
            camera.setPreviewTexture(surfaceTexture);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void setZoomFactor(float f) {
        int i;
        if (this.mCam != null && this.mParams.isZoomSupported()) {
            List<Integer> zoomRatios = this.mParams.getZoomRatios();
            if (zoomRatios.size() == 0) {
                return;
            }
            int i2 = (int) (f * 100.0f);
            if (i2 == 100) {
                i = 0;
                break;
            }
            i = 1;
            while (true) {
                if (i >= zoomRatios.size()) {
                    i = 0;
                    break;
                } else if (zoomRatios.get(i).intValue() >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            this.mParams.setZoom(i);
            try {
                this.mCam.setParameters(this.mParams);
            } catch (Exception e) {
                android.util.Log.e(TAG, "vcap: set zoom failed");
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    public int startCam(boolean z) {
        List<String> supportedSceneModes;
        boolean z2;
        boolean z3 = getFront() > 0;
        this.mUseFaceDetection = z3 && z && this.mParams.getMaxNumDetectedFaces() > 0;
        if (this.mSceneMode != 0 && (supportedSceneModes = this.mParams.getSupportedSceneModes()) != null) {
            int i = this.mSceneMode;
            String str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            String str2 = "night";
            if (1 == i) {
                if (supportedSceneModes.contains("party")) {
                    str2 = "party";
                } else if (!supportedSceneModes.contains("night")) {
                    str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
            } else if (2 == i) {
                if (!supportedSceneModes.contains("night")) {
                    str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
            } else if (z3 && 4 == i) {
                str2 = "portrait";
                if (!supportedSceneModes.contains("portrait")) {
                    str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
            } else if (z3 || 3 != i) {
                str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            } else {
                str2 = NativeProtocol.WEB_DIALOG_ACTION;
                if (!supportedSceneModes.contains(NativeProtocol.WEB_DIALOG_ACTION)) {
                    str2 = "sports";
                    if (!supportedSceneModes.contains("sports")) {
                        str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    }
                }
            }
            try {
                this.mParams.setSceneMode(str2);
                Log.i(TAG, "vcap: set scene mode ".concat(str2));
                z2 = true;
                str = str2;
            } catch (Exception e) {
                Log.e(TAG, "vcap: set scene mode failed");
                e.printStackTrace();
                z2 = false;
            }
            if (!z2 && supportedSceneModes.contains(str)) {
                try {
                    this.mParams.setSceneMode(str);
                    Log.i(TAG, "vcap: set scene mode ".concat(str));
                } catch (Exception e2) {
                    Log.e(TAG, "vcap: set scene mode failed");
                    e2.printStackTrace();
                }
            }
        }
        this.mIsFocusing = false;
        this.mCam.startPreview();
        this.mCam.cancelAutoFocus();
        if (this.mUseFaceDetection) {
            this.mCam.startFaceDetection();
        }
        int iDoSetFocusMode = doSetFocusMode(this.mFocusMode, this.mParams);
        if (iDoSetFocusMode >= 0) {
            if (!this.mUseFaceDetection) {
                doSetFocusPoint(this.mFocusPointX, this.mFocusPointY, this.mParams);
            }
        } else if (this.mParams.getMaxNumFocusAreas() > 0) {
            this.mParams.setFocusAreas(null);
        }
        if (doSetExposureMode(this.mExposureMode, this.mParams) == 0 && !this.mUseFaceDetection) {
            doSetExposurePoint(this.mExposurePointX, this.mExposurePointY, this.mParams);
        }
        try {
            this.mCam.setParameters(this.mParams);
        } catch (Exception e3) {
            android.util.Log.e(TAG, "vcap: set focus & exposure failed");
            e3.printStackTrace();
        }
        if (iDoSetFocusMode > 0) {
            this.mIsFocusing = true;
            this.mCam.autoFocus(new Camera.AutoFocusCallback() { // from class: com.zego.ve.VCam.2
                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z4, Camera camera) {
                    android.util.Log.e(VCam.TAG, "vcap: set focus success:" + z4);
                    VCam.this.mIsFocusing = false;
                }
            });
        }
        return 0;
    }

    public int stopCam() {
        this.mExposureGeneration++;
        Camera camera = this.mCam;
        if (camera == null) {
            return 0;
        }
        if (this.mUseFaceDetection) {
            camera.stopFaceDetection();
        }
        this.mCam.stopPreview();
        try {
            this.mCam.setPreviewTexture(null);
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void uninit() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(this);
            this.mHandler = null;
        }
    }

    public int updateRate(int i, Camera.Parameters parameters) {
        int i2;
        int i3;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            int i4 = this.mFrameRate * 1000;
            if (this.mLowLightBoost) {
                i2 = 0;
                i3 = 0;
                for (int[] iArr : supportedPreviewFpsRange) {
                    int i5 = iArr[1];
                    if (i5 >= i4) {
                        if (i2 < i4 || i5 < i2 || (i5 == i2 && iArr[0] < i3)) {
                            i3 = iArr[0];
                            i2 = i5;
                        }
                    } else if (i5 > i2 || (i5 == i2 && iArr[0] < i3)) {
                        i3 = iArr[0];
                        i2 = i5;
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
                for (int[] iArr2 : supportedPreviewFpsRange) {
                    int i6 = iArr2[1];
                    if (i6 >= i4) {
                        if (i2 < i4 || i6 < i2 || (i6 == i2 && iArr2[0] > i3)) {
                            i3 = iArr2[0];
                            i2 = i6;
                        }
                    } else if (i6 > i2 || (i6 == i2 && iArr2[0] > i3)) {
                        i3 = iArr2[0];
                        i2 = i6;
                    }
                }
            }
            if (i2 != 0) {
                parameters.setPreviewFpsRange(i3, i2);
            }
        }
        int[] iArr3 = new int[2];
        parameters.getPreviewFpsRange(iArr3);
        int i7 = iArr3[0];
        int i8 = iArr3[1];
        if (i7 == i8) {
            this.mFrameRate = i7 / 1000;
        } else {
            this.mFrameRate = (i8 / 2) / 1000;
        }
        Log.i(TAG, "real fps:| " + iArr3[0] + "|" + iArr3[1] + "|");
        return 0;
    }
}
