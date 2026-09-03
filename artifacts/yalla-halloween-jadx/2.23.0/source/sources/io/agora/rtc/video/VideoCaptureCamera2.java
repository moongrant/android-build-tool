package io.agora.rtc.video;

import OooO0OO.OooO00o;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.o0000O0;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.gl.SurfaceTextureHelper;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import p031OoooO0.o0OoOo0;
import p041Ooooo0o.o00000;
import p046Oooooo0.o0O00o0;
import p082o000OoOo.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(21)
public class VideoCaptureCamera2 extends VideoCapture implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    private static final int DEFAULT_MATCH_FPS = 15;
    private static final float DEFAULT_VALUE = -1.0f;
    private static final String TAG = "CAMERA2";
    private static final boolean VERBOSE = false;
    private static final MeteringRectangle[] ZERO_WEIGHT_3A_REGION = {new MeteringRectangle(0, 0, 0, 0, 0)};
    private static final float ZOOM_UNSUPPORTED_DEFAULT_VALUE = 1.0f;
    private static final double kNanoSecondsToFps = 1.0E-9d;
    private static boolean usingLibyuv = false;
    private int[] distanceArray;
    private boolean faceDistaneEnabled;
    private MeteringRectangle[] mAFAERegions;
    private CameraCaptureSession.CaptureCallback mAfCaptureCallback;
    private int mAntiBandingMode;
    public CameraManager.AvailabilityCallback mAvailabilityCallback;
    private CameraDevice mCameraDevice;
    private CameraState mCameraState;
    private final Object mCameraStateLock;
    private HandlerThread mCameraStateThread;
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;
    private byte[] mCaptureData;
    private int mCaptureFormat;
    private int mCaptureFps;
    private int mCaptureHeight;
    private CameraCaptureSession mCaptureSession;
    private final Object mCaptureSessionLock;
    private int mCaptureWidth;
    private float mCurZoomRatio;
    private int mEdgeEnhanceMode;
    private int mFaceDetectMode;
    private boolean mFaceDetectSupported;
    private ImageReader mImageReader;
    private final Object mImageReaderLock;
    private boolean mIsAutoFaceFocusEnabled;
    private final boolean mIsCameraFacingFront;
    private float mLastZoomRatio;
    private CameraManager mManager;
    private float mMaxZoom;
    private int mNoiseReductionMode;
    private CaptureRequest.Builder mPreviewBuilder;
    private HandlerThread mPreviewThread;
    private Rect mSensorRect;
    private Handler mStateHandler;
    private Surface mTextureOutputSurface;
    private int mVideoStabilityMode;
    private RectF[] rectArray;

    public enum CameraState {
        OPENING,
        STARTED,
        EVICTED,
        STOPPED
    }

    public class CaptureSessionListener extends CameraCaptureSession.StateCallback {
        private CaptureSessionListener() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Logging.e(VideoCaptureCamera2.TAG, "onConfigureFailed");
            if (VideoCaptureCamera2.this.mCameraState != CameraState.EVICTED) {
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
            }
            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
            long j = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
            if (j != 0) {
                videoCaptureCamera2.onCameraError(j, 101);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            VideoCaptureCamera2.this.mCaptureSession = cameraCaptureSession;
            if (VideoCaptureCamera2.this.createCaptureRequest() == 0) {
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STARTED);
                return;
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
            long j = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
            if (j != 0) {
                videoCaptureCamera2.onCameraError(j, 102);
            }
        }
    }

    public class CrStateListener extends CameraDevice.StateCallback {
        private CrStateListener() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            if (VideoCaptureCamera2.this.mCameraState != CameraState.STOPPED) {
                Logging.w(VideoCaptureCamera2.TAG, "camera client is evicted by other application");
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                long j = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
                if (j != 0) {
                    videoCaptureCamera2.onCameraError(j, 6);
                }
                Logging.i(VideoCaptureCamera2.TAG, "Camera device enter state: EVICTED");
                if (VideoCaptureCamera2.this.mCameraDevice != null) {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                    VideoCaptureCamera2.this.mCameraDevice = null;
                }
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.EVICTED);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            if (VideoCaptureCamera2.this.mCameraState == CameraState.EVICTED) {
                return;
            }
            if (VideoCaptureCamera2.this.mCameraDevice != null) {
                VideoCaptureCamera2.this.mCameraDevice.close();
                VideoCaptureCamera2.this.mCameraDevice = null;
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
            Logging.e(VideoCaptureCamera2.TAG, "CameraDevice Error :" + Integer.toString(i));
            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
            long j = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
            if (j != 0) {
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        i2 = 3;
                        if (i != 3) {
                            i2 = 4;
                            if (i != 4) {
                                i2 = 5;
                                if (i != 5) {
                                    i2 = VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown;
                                }
                            }
                        }
                    }
                }
                videoCaptureCamera2.onCameraError(j, i2);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            VideoCaptureCamera2.this.mCameraDevice = cameraDevice;
            if (VideoCaptureCamera2.this.doStartCapture() < 0) {
                VideoCaptureCamera2.this.doStopCapture();
                if (VideoCaptureCamera2.this.mCameraState != CameraState.EVICTED) {
                    VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
                }
                Logging.e(VideoCaptureCamera2.TAG, "Camera startCapture failed!!");
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                long j = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
                if (j != 0) {
                    videoCaptureCamera2.onCameraError(j, 100);
                }
            }
        }
    }

    public class ImageReaderListener implements ImageReader.OnImageAvailableListener {
        private ImageReaderListener() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            synchronized (VideoCaptureCamera2.this.mCameraStateLock) {
                Image imageAcquireLatestImage = null;
                try {
                    try {
                        if (VideoCaptureCamera2.this.mCameraState == CameraState.STARTED && imageReader != null) {
                            if (VideoCaptureCamera2.this.mCaptureData != null && VideoCaptureCamera2.this.mCaptureData.length != 0 && VideoCaptureCamera2.this.mImageReader != null) {
                                synchronized (VideoCaptureCamera2.this.mImageReaderLock) {
                                    if (VideoCaptureCamera2.this.mImageReader != null) {
                                        imageAcquireLatestImage = imageReader.acquireLatestImage();
                                        if (imageAcquireLatestImage == null) {
                                            if (imageAcquireLatestImage != null) {
                                                imageAcquireLatestImage.close();
                                            }
                                            return;
                                        }
                                        if (imageAcquireLatestImage.getFormat() == 35 && imageAcquireLatestImage.getPlanes().length == 3) {
                                            if (imageReader.getWidth() != imageAcquireLatestImage.getWidth() || imageReader.getHeight() != imageAcquireLatestImage.getHeight()) {
                                                throw new IllegalStateException("ImageReader size " + imageReader.getWidth() + "x" + imageReader.getHeight() + " did not match Image size: " + imageAcquireLatestImage.getWidth() + "x" + imageAcquireLatestImage.getHeight());
                                            }
                                            VideoCaptureCamera2.readImageIntoBuffer(imageAcquireLatestImage, VideoCaptureCamera2.this.mCaptureData);
                                            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                                            if (videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid != 0) {
                                                byte[] bArr = videoCaptureCamera2.mCaptureData;
                                                VideoCaptureCamera2 videoCaptureCamera3 = VideoCaptureCamera2.this;
                                                videoCaptureCamera2.onRawBufferAvailable(bArr, videoCaptureCamera3.mExpectedRawBufferSize, videoCaptureCamera3.mCaptureWidth, VideoCaptureCamera2.this.mCaptureHeight, VideoCaptureCamera2.this.mCaptureFormat);
                                            } else {
                                                Logging.w(VideoCaptureCamera2.TAG, "warning mNativeVideoCaptureDeviceAndroid = 0, error");
                                            }
                                        }
                                        Logging.e(VideoCaptureCamera2.TAG, "Unexpected image format: " + imageAcquireLatestImage.getFormat() + "or #planes:" + imageAcquireLatestImage.getPlanes().length);
                                        imageAcquireLatestImage.close();
                                        return;
                                    }
                                    if (imageAcquireLatestImage != null) {
                                        imageAcquireLatestImage.close();
                                    }
                                }
                            }
                        }
                    } catch (IllegalStateException e) {
                        Logging.e(VideoCaptureCamera2.TAG, "acquireLastest Image():", e);
                        if (0 != 0) {
                            imageAcquireLatestImage.close();
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        imageAcquireLatestImage.close();
                    }
                    throw th;
                }
            }
        }
    }

    public static class SafeHandler extends Handler {
        public SafeHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Throwable th) {
                Logging.e(VideoCaptureCamera2.TAG, "handler exception", th);
            }
        }
    }

    public VideoCaptureCamera2(Context context, int i, int i2, EglBase.Context context2, long j) {
        super(context, i, i2, context2, j);
        this.mCameraDevice = null;
        this.mPreviewBuilder = null;
        this.mCaptureSession = null;
        this.mCameraState = CameraState.STOPPED;
        this.mManager = null;
        this.mStateHandler = null;
        this.mCameraStateThread = null;
        this.mPreviewThread = null;
        this.mCameraStateLock = new Object();
        this.mCaptureWidth = -1;
        this.mCaptureHeight = -1;
        this.mCaptureFps = -1;
        this.mCaptureFormat = 35;
        this.mIsAutoFaceFocusEnabled = false;
        this.rectArray = null;
        this.distanceArray = null;
        this.faceDistaneEnabled = false;
        this.mAFAERegions = ZERO_WEIGHT_3A_REGION;
        this.mLastZoomRatio = DEFAULT_VALUE;
        this.mCurZoomRatio = 1.0f;
        this.mMaxZoom = DEFAULT_VALUE;
        this.mSensorRect = null;
        this.mAntiBandingMode = 3;
        this.mNoiseReductionMode = 1;
        this.mEdgeEnhanceMode = 0;
        this.mVideoStabilityMode = 0;
        this.mCaptureSessionLock = new Object();
        this.mImageReader = null;
        this.mImageReaderLock = new Object();
        this.mAvailabilityCallback = new CameraManager.AvailabilityCallback() { // from class: io.agora.rtc.video.VideoCaptureCamera2.1
            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public synchronized void onCameraAvailable(String str) {
                super.onCameraAvailable(str);
                if (VideoCaptureCamera2.this.mCameraState == CameraState.EVICTED) {
                    Logging.i(VideoCaptureCamera2.TAG, "Camera " + str + " available, try start capture again");
                    if (VideoCaptureCamera2.this.tryOpenCamera() == 0) {
                        VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                        long j2 = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
                        if (j2 != 0) {
                            videoCaptureCamera2.onCameraError(j2, 0);
                        }
                    } else {
                        Logging.e(VideoCaptureCamera2.TAG, "start capture failed");
                    }
                }
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public synchronized void onCameraUnavailable(String str) {
                super.onCameraUnavailable(str);
                Logging.e(VideoCaptureCamera2.TAG, "Camera " + str + " unavailable");
            }
        };
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc.video.VideoCaptureCamera2.2
            private long mLastFocusedTs;

            private void notifyCameraFocusAreaChanged(Rect rect, Rect rect2) {
                Rect rectSensorToNormalizedPreview = CoordinatesTransform.sensorToNormalizedPreview(rect2, VideoCaptureCamera2.this.mCaptureWidth, VideoCaptureCamera2.this.mCaptureHeight, rect);
                Logging.d(VideoCaptureCamera2.TAG, "face bound = " + rect2.toString());
                Logging.d(VideoCaptureCamera2.TAG, "rect (-1000, 1000) = " + rectSensorToNormalizedPreview.toString());
                boolean z = VideoCaptureCamera2.this.mId == 1;
                RectF rectFNormalizedFaceRect = CoordinatesTransform.normalizedFaceRect(rectSensorToNormalizedPreview, 0, z);
                Logging.d(VideoCaptureCamera2.TAG, "preview size width = " + VideoCaptureCamera2.this.mCaptureWidth + " height = " + VideoCaptureCamera2.this.mCaptureHeight);
                Logging.d(VideoCaptureCamera2.TAG, "auto face focus left =" + rectFNormalizedFaceRect.left + " top = " + rectFNormalizedFaceRect.top + " right = " + rectFNormalizedFaceRect.right + " bottom = " + rectFNormalizedFaceRect.bottom + "isMirror =" + z);
                float f = rectFNormalizedFaceRect.left;
                float f2 = rectFNormalizedFaceRect.top;
                float fWidth = rectFNormalizedFaceRect.width();
                float fHeight = rectFNormalizedFaceRect.height();
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                long j2 = videoCaptureCamera2.mNativeVideoCaptureDeviceAndroid;
                if (j2 != 0) {
                    videoCaptureCamera2.NotifyCameraFocusAreaChanged(f, f2, fWidth, fHeight, j2);
                }
            }

            private void notifyFaceDetection(Rect rect, Face[] faceArr) {
                VideoCaptureCamera2.this.rectArray = null;
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                int i3 = 0;
                boolean z = videoCaptureCamera2.mId == 1;
                if (faceArr == null || faceArr.length <= 0) {
                    videoCaptureCamera2.rectArray = new RectF[0];
                } else {
                    int length = faceArr.length;
                    videoCaptureCamera2.rectArray = new RectF[length];
                    VideoCaptureCamera2.this.distanceArray = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        VideoCaptureCamera2.this.rectArray[i4] = CoordinatesTransform.normalizedFaceRect(CoordinatesTransform.sensorToNormalizedPreview(faceArr[i4].getBounds(), VideoCaptureCamera2.this.mCaptureWidth, VideoCaptureCamera2.this.mCaptureHeight, rect), 0, z);
                        VideoCaptureCamera2.this.distanceArray[i4] = 5;
                    }
                    i3 = length;
                }
                Logging.d(VideoCaptureCamera2.TAG, "before notify face");
                VideoCaptureCamera2 videoCaptureCamera3 = VideoCaptureCamera2.this;
                videoCaptureCamera3.NotifyFaceDetection(videoCaptureCamera3.mCaptureWidth, VideoCaptureCamera2.this.mCaptureHeight, VideoCaptureCamera2.this.rectArray, i3, VideoCaptureCamera2.this.mNativeVideoCaptureDeviceAndroid);
            }

            private void process(CaptureResult captureResult) {
                Face[] faceArr = (Face[]) captureResult.get(CaptureResult.STATISTICS_FACES);
                if (faceArr == null || faceArr.length <= 0) {
                    VideoCaptureCamera2.this.mAFAERegions = VideoCaptureCamera2.ZERO_WEIGHT_3A_REGION;
                    return;
                }
                if (System.currentTimeMillis() - this.mLastFocusedTs < 3000) {
                    if (faceArr[0].getScore() > 20) {
                        notifyCameraFocusAreaChanged((Rect) captureResult.get(CaptureResult.SCALER_CROP_REGION), faceArr[0].getBounds());
                        return;
                    }
                    return;
                }
                if (faceArr[0].getScore() <= 50) {
                    return;
                }
                VideoCaptureCamera2.this.mAFAERegions = new MeteringRectangle[]{new MeteringRectangle(faceArr[0].getBounds(), 1000)};
                if (VideoCaptureCamera2.this.mPreviewBuilder == null) {
                    return;
                }
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                videoCaptureCamera2.addRegionsToCaptureRequestBuilder(videoCaptureCamera2.mPreviewBuilder);
                if (VideoCaptureCamera2.this.mCameraState != CameraState.STARTED) {
                    return;
                }
                try {
                    Rect rect = (Rect) captureResult.get(CaptureResult.SCALER_CROP_REGION);
                    Logging.d(VideoCaptureCamera2.TAG, "cropRegion = " + rect.toString());
                    Logging.d(VideoCaptureCamera2.TAG, "capture size wxh = " + VideoCaptureCamera2.this.mCaptureWidth + " x " + VideoCaptureCamera2.this.mCaptureHeight);
                    notifyCameraFocusAreaChanged(rect, faceArr[0].getBounds());
                    if (VideoCaptureCamera2.this.mCaptureSession != null) {
                        synchronized (VideoCaptureCamera2.this.mCaptureSessionLock) {
                            try {
                                if (VideoCaptureCamera2.this.mCaptureSession != null) {
                                    VideoCaptureCamera2.this.mCaptureSession.capture(VideoCaptureCamera2.this.mPreviewBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, null);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    VideoCaptureCamera2.this.createCaptureRequest();
                    this.mLastFocusedTs = System.currentTimeMillis();
                } catch (Exception e) {
                    Logging.e(VideoCaptureCamera2.TAG, "capture: " + e);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (VideoCaptureCamera2.this.mIsAutoFaceFocusEnabled && VideoCaptureCamera2.this.isAutoFaceFocusSupported()) {
                    process(totalCaptureResult);
                }
                if (VideoCaptureCamera2.this.faceDistaneEnabled) {
                    notifyFaceDetection((Rect) totalCaptureResult.get(CaptureResult.SCALER_CROP_REGION), (Face[]) totalCaptureResult.get(CaptureResult.STATISTICS_FACES));
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            }
        };
        this.mAfCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc.video.VideoCaptureCamera2.3
            private void process(CaptureResult captureResult) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null || VideoCaptureCamera2.this.mPreviewBuilder == null) {
                    return;
                }
                if (4 == num.intValue() || 5 == num.intValue()) {
                    VideoCaptureCamera2.this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    VideoCaptureCamera2.this.startNormalPreview();
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                process(totalCaptureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                process(captureResult);
            }
        };
        this.mIsCameraFacingFront = isCameraFacingFront(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionsToCaptureRequestBuilder(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.mAFAERegions);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, this.mAFAERegions);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeCameraStateAndNotify(CameraState cameraState) {
        synchronized (this.mCameraStateLock) {
            this.mCameraState = cameraState;
            this.mCameraStateLock.notifyAll();
        }
    }

    private static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static int createCapabilities(int i, Context context) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return -1;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            Logging.e(TAG, "Failed to create capabilities");
            return -1;
        }
        try {
            Logging.i(TAG, "dump configuration map:" + streamConfigurationMap.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(streamConfigurationMap.getOutputSizes(35)));
        if ("SM-G9300".equals(Build.MODEL)) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Size) arrayList.get(i2)).getHeight() >= 720) {
                    arrayList2.add(arrayList.get(i2));
                }
            }
            arrayList = arrayList2;
        }
        String strOooO00o = OooO00o.OooO00o("\"id\":", i, ",");
        String strValueOf = String.valueOf(15);
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Range range : rangeArr) {
                arrayList3.add(range.getUpper());
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                sb.append(((Integer) it.next()) + ",");
            }
            if (arrayList3.size() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            strValueOf = sb.toString();
        }
        String strOooO00o2 = "";
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int width = ((Size) arrayList.get(i3)).getWidth();
            int height = ((Size) arrayList.get(i3)).getHeight();
            if (width >= 240 && height >= 240 && (width >= 320 || height >= 320)) {
                String strOooO00o3 = o0O00o0.OooO00o("{\"w\":", width, ",\"h\":", height, "}");
                strOooO00o2 = !strOooO00o2.isEmpty() ? o0OoOo0.OooO00o(strOooO00o2, ",", strOooO00o3) : strOooO00o3;
            }
        }
        VideoCapture.cacheCapability(i, context, androidx.compose.material.OooO00o.OooO0O0(OooO0o.OooO0OO("{", strOooO00o, "\"resolution\":[", strOooO00o2, "],\"format\":["), "" + VideoCapture.translateToEngineFormat(35), "],\"fps\":[", strValueOf, "]}"), getCaptureName());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int createCaptureRequest() {
        if (this.mPreviewBuilder == null) {
            return -1;
        }
        try {
            if (this.mCaptureSession == null) {
                return 0;
            }
            synchronized (this.mCaptureSessionLock) {
                try {
                    CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        } catch (CameraAccessException e) {
            Logging.e(TAG, "setRepeatingRequest: ", e);
            return -1;
        } catch (IllegalArgumentException e2) {
            Logging.e(TAG, "setRepeatingRequest: ", e2);
            return -2;
        } catch (IllegalStateException e3) {
            Logging.e(TAG, "capture:" + e3);
            return -4;
        } catch (SecurityException e4) {
            Logging.e(TAG, "setRepeatingRequest: ", e4);
            return -3;
        }
    }

    private Rect cropRegionForZoom(float f) {
        int iWidth = this.mSensorRect.width() / 2;
        int iHeight = this.mSensorRect.height() / 2;
        int iWidth2 = (int) ((this.mSensorRect.width() * 0.5f) / f);
        int iHeight2 = (int) ((this.mSensorRect.height() * 0.5f) / f);
        return new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int doStartCapture() {
        Range[] rangeArr;
        if (this.mPreviewThread == null) {
            HandlerThread handlerThread = new HandlerThread("CameraPreview");
            this.mPreviewThread = handlerThread;
            handlerThread.start();
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.mCameraDevice.createCaptureRequest(1);
            this.mPreviewBuilder = builderCreateCaptureRequest;
            if (builderCreateCaptureRequest == null) {
                Logging.e(TAG, "mPreviewBuilder error");
                return -4;
            }
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
            if (cameraCharacteristics != null && (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) != null) {
                if (this.mPQFirst < 1) {
                    Arrays.sort(rangeArr, new Comparator<Range<Integer>>() { // from class: io.agora.rtc.video.VideoCaptureCamera2.4
                        @Override // java.util.Comparator
                        public int compare(Range<Integer> range, Range<Integer> range2) {
                            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getLower()).intValue();
                        }
                    });
                    Logging.i(TAG, "sorted fps Ranges List:" + Arrays.toString(rangeArr));
                    int length = rangeArr.length;
                    for (int i = 0; i < length; i++) {
                        Range range = rangeArr[i];
                        if (((Integer) range.getLower()).intValue() >= Math.max(this.mCaptureFps, 15)) {
                            Logging.i(TAG, "set fps :" + range.toString() + " to camera2::fps first, request:" + this.mCaptureFps);
                            this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                            break;
                        }
                    }
                } else {
                    Arrays.sort(rangeArr, new Comparator<Range<Integer>>() { // from class: io.agora.rtc.video.VideoCaptureCamera2.5
                        @Override // java.util.Comparator
                        public int compare(Range<Integer> range2, Range<Integer> range3) {
                            return ((Integer) range2.getUpper()).intValue() - ((Integer) range3.getUpper()).intValue();
                        }
                    });
                    Logging.i(TAG, "sorted fps Ranges List:" + Arrays.toString(rangeArr));
                    int length2 = rangeArr.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        Range range2 = rangeArr[i2];
                        if (((Integer) range2.getUpper()).intValue() >= this.mCaptureFps) {
                            Logging.i(TAG, "set fps :" + range2.toString() + " to camera2::PQ first, request:" + this.mCaptureFps);
                            this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                            break;
                        }
                    }
                }
            }
            this.mPreviewBuilder.set(CaptureRequest.CONTROL_MODE, 1);
            this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            setFaceDetect(this.mPreviewBuilder, this.mFaceDetectMode);
            ArrayList arrayList = new ArrayList();
            int i3 = this.mCaptureOutputDataType;
            if (i3 == 1 || i3 == 2) {
                SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("Camera2Tex-" + this.mId, this.mShareContext, 8);
                this.mSurfaceTextureHelper = surfaceTextureHelperCreate;
                if (surfaceTextureHelperCreate == null) {
                    Logging.e(TAG, "Failed to create SurfaceTextureHelper, force fallback to raw data type");
                    this.mCaptureOutputDataType = 0;
                } else {
                    surfaceTextureHelperCreate.getSurfaceTexture().setDefaultBufferSize(this.mCaptureWidth, this.mCaptureHeight);
                    this.mSurfaceTextureHelper.startListening(this);
                    this.mEglContext = this.mSurfaceTextureHelper.getEglContext();
                    Surface surface = new Surface(this.mSurfaceTextureHelper.getSurfaceTexture());
                    this.mTextureOutputSurface = surface;
                    this.mPreviewBuilder.addTarget(surface);
                    arrayList.add(this.mTextureOutputSurface);
                    if (this.mCaptureOutputDataType == 2 && this.mTextureAndRawBufferSynchronizer == null) {
                        this.mTextureAndRawBufferSynchronizer = new VideoCapture.TextureAndRawBufferSynchronizer();
                    }
                }
            }
            int i4 = this.mCaptureOutputDataType;
            if (i4 == 0 || i4 == 2) {
                int bitsPerPixel = (ImageFormat.getBitsPerPixel(this.mCaptureFormat) * (this.mCaptureWidth * this.mCaptureHeight)) / 8;
                this.mExpectedRawBufferSize = bitsPerPixel;
                this.mCaptureData = new byte[bitsPerPixel];
                synchronized (this.mImageReaderLock) {
                    this.mImageReader = ImageReader.newInstance(this.mCaptureWidth, this.mCaptureHeight, this.mCaptureFormat, 2);
                    this.mImageReader.setOnImageAvailableListener(new ImageReaderListener(), new Handler(this.mPreviewThread.getLooper()));
                }
                Surface surface2 = this.mImageReader.getSurface();
                this.mPreviewBuilder.addTarget(surface2);
                arrayList.add(surface2);
            }
            try {
                this.mCameraDevice.createCaptureSession(arrayList, new CaptureSessionListener(), null);
                return 0;
            } catch (CameraAccessException e) {
                Logging.e(TAG, "createCaptureSession :", e);
                return -1;
            } catch (IllegalArgumentException e2) {
                Logging.e(TAG, "createCaptureSession :", e2);
                return -2;
            } catch (SecurityException e3) {
                Logging.e(TAG, "createCaptureSession :", e3);
                return -3;
            }
        } catch (CameraAccessException e4) {
            Logging.e(TAG, "createCaptureRequest: ", e4);
            return -1;
        } catch (IllegalArgumentException e5) {
            Logging.e(TAG, "createCaptureRequest: ", e5);
            return -2;
        } catch (SecurityException e6) {
            Logging.e(TAG, "createCaptureRequest ", e6);
            return -3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int doStopCapture() {
        int i;
        Logging.i(TAG, "doStopCapture");
        synchronized (this.mCaptureSessionLock) {
            HandlerThread handlerThread = this.mPreviewThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mPreviewThread = null;
            }
            i = -1;
            try {
                try {
                    CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.abortCaptures();
                        this.mCaptureSession = null;
                    }
                    i = 0;
                } catch (CameraAccessException e) {
                    Logging.e(TAG, "abortCaptures: ", e);
                } catch (IllegalStateException e2) {
                    Logging.e(TAG, "abortCaptures: ", e2);
                }
            } catch (IllegalArgumentException e3) {
                Logging.e(TAG, "abortCaptures: ", e3);
            } catch (Exception e4) {
                Logging.e(TAG, "abortCaptures: ", e4);
            }
        }
        if (this.mImageReader != null) {
            synchronized (this.mImageReaderLock) {
                ImageReader imageReader = this.mImageReader;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(null, null);
                    this.mImageReader.close();
                    this.mImageReader = null;
                }
            }
        }
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
            this.mEglContext = null;
        }
        Surface surface = this.mTextureOutputSurface;
        if (surface != null) {
            surface.release();
            this.mTextureOutputSurface = null;
        }
        CameraDevice cameraDevice = this.mCameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.mCameraDevice = null;
        }
        return i;
    }

    private static CameraCharacteristics getCameraCharacteristics(Context context, int i) {
        if (i != 0 && i != 1 && i != 2) {
            Logging.i(TAG, "getCameraCharacteristics error,  camera id: " + i);
            return null;
        }
        try {
            return ((CameraManager) context.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera)).getCameraCharacteristics(Integer.toString(i));
        } catch (CameraAccessException e) {
            Logging.i(TAG, "getNumberOfCameras: getCameraIdList(): " + e);
            return null;
        } catch (Exception e2) {
            Logging.i(TAG, "getNumberOfCameras: got exception: " + e2);
            return null;
        }
    }

    public static String getCaptureName() {
        return "camera2";
    }

    private int getFrameOrientation() {
        int iCheckOrientation = checkOrientation();
        if (!this.mIsCameraFacingFront) {
            iCheckOrientation = 360 - iCheckOrientation;
        }
        return (getSensorOrientation(this.mId, this.mContext) + iCheckOrientation) % 360;
    }

    public static int getFrontCameraIndex(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera);
        try {
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 0) {
                    Logging.d(TAG, "getFrontCameraIndex str= " + str + ", int = " + Integer.parseInt(str));
                    return Integer.parseInt(str);
                }
            }
        } catch (Exception e) {
            Logging.e(TAG, "getFrontCameraIndex: ", e);
        }
        return 0;
    }

    public static String getName(int i, Context context) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return null;
        }
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        StringBuilder sbOooO00o = o0000O0.OooO00o("camera2 ", i, ", facing ");
        sbOooO00o.append(iIntValue == 0 ? "front" : "back");
        return sbOooO00o.toString();
    }

    public static int getNumberOfCameras(Context context) {
        try {
            int length = ((CameraManager) context.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera)).getCameraIdList().length;
            Logging.i(TAG, "VideoCaptureCamera2 listCount:" + length);
            return length;
        } catch (Exception e) {
            Logging.e(TAG, "getNumberOfCameras: getCameraIdList(): ", e);
            return 0;
        }
    }

    public static int getSensorOrientation(int i, Context context) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return -1;
        }
        return ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    public static boolean isCameraFacingFront(Context context, int i) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return true;
        }
        Integer num = 0;
        return num.equals(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING));
    }

    public static boolean isLegacyDevice(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
            return cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
        } catch (Throwable unused) {
            Logging.w(TAG, "this is a legacy camera device");
            return true;
        }
    }

    private boolean isMeteringAreaAFSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics != null) {
            return ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
        }
        Logging.w(TAG, "warning cameraCharacteristics is null");
        return false;
    }

    private static boolean isSupported(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readImageIntoBuffer(Image image, byte[] bArr) {
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        int i = 1;
        if (usingLibyuv) {
            Image.Plane plane = planes[0];
            Image.Plane plane2 = planes[1];
            if (VideoCapture.ConvertFrameToI420(width, height, plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), planes[2].getBuffer(), plane2.getRowStride(), plane2.getPixelStride(), bArr) == 0) {
                return;
            } else {
                Logging.w(TAG, "readImageIntoBuffer: native convert I420 failed, using java method instead");
            }
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < planes.length) {
            ByteBuffer buffer = planes[i2].getBuffer();
            if (buffer == null) {
                Logging.e(TAG, "plane " + i2 + " buffer is null ");
                return;
            }
            int rowStride = planes[i2].getRowStride();
            int pixelStride = planes[i2].getPixelStride();
            int i4 = i2 == 0 ? width : width / 2;
            int i5 = i2 == 0 ? height : height / 2;
            if (pixelStride == i && rowStride == i4) {
                int i6 = i4 * i5;
                buffer.get(bArr, i3, i6);
                i3 = i6 + i3;
            } else {
                byte[] bArr2 = new byte[rowStride];
                for (int i7 = 0; i7 < i5 - 1; i7++) {
                    buffer.get(bArr2, 0, rowStride);
                    int i8 = 0;
                    while (i8 < i4) {
                        bArr[i3] = bArr2[i8 * pixelStride];
                        i8++;
                        i3++;
                    }
                }
                buffer.get(bArr2, 0, Math.min(rowStride, buffer.remaining()));
                int i9 = 0;
                while (i9 < i4) {
                    bArr[i3] = bArr2[i9 * pixelStride];
                    i9++;
                    i3++;
                }
            }
            i2++;
            i = 1;
        }
    }

    private void setExposureCompensation_l(int i) {
        Logging.i(TAG, "setExposureCompensation:" + i);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            return;
        }
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        Logging.i(TAG, "compensation step=" + rational + ", min=" + iIntValue2 + ", max=" + iIntValue);
        if (i > iIntValue) {
            i = iIntValue;
        }
        if (i >= iIntValue2) {
            iIntValue2 = i;
        }
        if (this.mPreviewThread == null || this.mPreviewBuilder == null || this.mCaptureSession == null) {
            return;
        }
        synchronized (this.mCameraStateLock) {
            if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                Handler handler = new Handler(this.mPreviewThread.getLooper());
                Logging.i(TAG, "bf cur index=" + ((Integer) this.mPreviewBuilder.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue());
                this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(iIntValue2));
                try {
                    this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                    int iIntValue3 = ((Integer) this.mPreviewBuilder.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue();
                    Logging.i(TAG, "af cur index=" + iIntValue3 + ", ev=" + ((iIntValue3 * rational.getNumerator()) / rational.getDenominator()));
                } catch (CameraAccessException e) {
                    e.printStackTrace();
                } catch (IllegalStateException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void setFaceDetect(CaptureRequest.Builder builder, int i) {
        if (this.mFaceDetectSupported) {
            if (this.mIsAutoFaceFocusEnabled || this.faceDistaneEnabled) {
                builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(i));
            }
        }
    }

    private static void setUsingLibyuv(boolean z) {
        usingLibyuv = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startNormalPreview() {
        if (this.mPreviewBuilder == null || this.mPreviewThread == null || this.mCaptureSession == null) {
            return;
        }
        try {
            synchronized (this.mCaptureSessionLock) {
                CaptureRequest.Builder builder = this.mPreviewBuilder;
                if (builder != null && this.mPreviewThread != null && this.mCaptureSession != null) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, new Handler(this.mPreviewThread.getLooper()));
                }
            }
        } catch (CameraAccessException e) {
            Logging.e(TAG, "setRepeatingRequest failed, error message : " + e.getMessage());
        }
    }

    private int toCamera2ABMode(int i) {
        if (i < 0 || i > 3) {
            return 3;
        }
        return i;
    }

    private int toCamera2EdgeEnhanceMode(int i) {
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    private int toCamera2NoiseMode(int i) {
        if (i < 0 || i > 4) {
            return 0;
        }
        return i;
    }

    private int toCamera2VideoStabilityMode(int i) {
        if (i < 0 || i > 1) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int tryOpenCamera() {
        try {
            this.mManager.openCamera(Integer.toString(this.mId), new CrStateListener(), this.mStateHandler);
            return 0;
        } catch (CameraAccessException e) {
            Logging.e(TAG, "allocate: manager.openCamera: ", e);
            return -1;
        } catch (IllegalArgumentException e2) {
            Logging.e(TAG, "allocate: manager.openCamera: ", e2);
            return -2;
        } catch (SecurityException e3) {
            Logging.e(TAG, "allocate: manager.openCamera: ", e3);
            return -3;
        } catch (Exception e4) {
            Logging.e(TAG, "unknown error", e4);
            return -4;
        }
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int UnRegisterNativeHandle() {
        this.mNativeVideoCaptureDeviceAndroid = 0L;
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int allocate() {
        synchronized (this.mCameraStateLock) {
            if (this.mCameraState == CameraState.OPENING) {
                Logging.e(TAG, "allocate() invoked while Camera is busy opening/configuring");
                return -1;
            }
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
            if (cameraCharacteristics == null) {
                return -1;
            }
            if (VideoCapture.fetchCapability(this.mId, this.mContext, getCaptureName()) == null) {
                createCapabilities(this.mId, this.mContext);
            }
            long j = this.mNativeVideoCaptureDeviceAndroid;
            if (j != 0) {
                this.mIsAutoFaceFocusEnabled = isAutoFaceFocusEnabled(j);
                this.faceDistaneEnabled = isFaceDetectionEnabled(this.mNativeVideoCaptureDeviceAndroid);
            }
            this.mCameraNativeOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.mManager = (CameraManager) this.mContext.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera);
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
            int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
            if (iArr.length > 1 && iIntValue > 0) {
                this.mFaceDetectSupported = true;
                int i = 0;
                for (int i2 : iArr) {
                    i += i2;
                }
                if (i % 2 != 0) {
                    this.mFaceDetectMode = 1;
                } else {
                    this.mFaceDetectMode = 2;
                }
            }
            StringBuilder sb = new StringBuilder("allocate() face detection: ");
            OooOOO0.OooO00o(sb, this.mFaceDetectMode, com.zego.zegoavkit2.ZegoConstants.ZegoVideoDataAuxPublishingStream, iIntValue, com.zego.zegoavkit2.ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(this.mFaceDetectSupported);
            Logging.i(TAG, sb.toString());
            if (this.mCameraStateThread == null) {
                HandlerThread handlerThread = new HandlerThread("CameraCallbackThread");
                this.mCameraStateThread = handlerThread;
                handlerThread.start();
                this.mStateHandler = new SafeHandler(this.mCameraStateThread.getLooper());
            }
            this.mManager.registerAvailabilityCallback(this.mAvailabilityCallback, this.mStateHandler);
            return 0;
        }
    }

    @Override // io.agora.rtc.video.VideoCapture
    public void deallocate() {
        CameraManager cameraManager = this.mManager;
        if (cameraManager != null) {
            cameraManager.unregisterAvailabilityCallback(this.mAvailabilityCallback);
            HandlerThread handlerThread = this.mCameraStateThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mCameraStateThread = null;
                this.mStateHandler = null;
            }
        }
    }

    @Override // io.agora.rtc.video.VideoCapture
    public float getMaxZoom() {
        if (this.mMaxZoom <= 0.0f) {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
            if (cameraCharacteristics == null) {
                Logging.w(TAG, "warning cameraCharacteristics is null");
                return DEFAULT_VALUE;
            }
            this.mMaxZoom = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        return this.mMaxZoom;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isAutoFaceFocusSupported() {
        if (!isFocusSupported()) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics != null) {
            return ((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0;
        }
        Logging.w(TAG, "warning cameraCharacteristics is null");
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isExposureSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                Logging.d(TAG, "isExposureSupported AE mode = " + iArr[i]);
                if (1 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isFocusSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                if (1 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isTorchSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // io.agora.rtc.video.VideoCapture
    public boolean isZoomSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics != null) {
            return ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 1.0f;
        }
        Logging.w(TAG, "warning cameraCharacteristics is null");
        return false;
    }

    @Override // io.agora.rtc.gl.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        int frameOrientation = getFrameOrientation();
        if (this.mIsCameraFacingFront) {
            fArr = RendererCommon.multiplyMatrices(fArr, RendererCommon.horizontalFlipMatrix());
        }
        VideoFrame.TextureBuffer textureBufferCreateTextureBuffer = this.mSurfaceTextureHelper.createTextureBuffer(this.mCaptureWidth, this.mCaptureHeight, RendererCommon.convertMatrixToAndroidGraphicsMatrix(RendererCommon.rotateTextureMatrix(fArr, 360 - frameOrientation)));
        onTextureBufferAvailable(textureBufferCreateTextureBuffer, frameOrientation, j);
        textureBufferCreateTextureBuffer.release();
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setAntiBandingMode(int i) {
        this.mAntiBandingMode = toCamera2ABMode(i);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            return -1;
        }
        int i2 = this.mAntiBandingMode;
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
        if (iArr.length > 0) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                        synchronized (this.mCaptureSessionLock) {
                            if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                                Handler handler = new Handler(this.mPreviewThread.getLooper());
                                this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(i2));
                                try {
                                    try {
                                        this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                                        return 0;
                                    } catch (CameraAccessException e) {
                                        e.printStackTrace();
                                    }
                                } catch (IllegalStateException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                    Logging.i(TAG, "AgoraVideo set anti-banding = " + i2);
                    return 0;
                }
            }
        }
        Logging.i(TAG, "not supported anti-banding = " + i2);
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setAutoFaceFocus(boolean z) {
        Object obj;
        boolean z2 = this.mIsAutoFaceFocusEnabled != z;
        this.mIsAutoFaceFocusEnabled = z;
        if (!this.mFaceDetectSupported || !z2) {
            Logging.w(TAG, "face detect no change");
        } else if (this.mPreviewThread != null && this.mPreviewBuilder != null && (obj = this.mCaptureSessionLock) != null) {
            synchronized (obj) {
                if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                    Handler handler = new Handler(this.mPreviewThread.getLooper());
                    if (this.mIsAutoFaceFocusEnabled) {
                        this.mPreviewBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.mFaceDetectMode));
                    } else {
                        if (this.faceDistaneEnabled) {
                            Logging.w(TAG, "face detect did not turn off due to faceDistance on");
                            return 0;
                        }
                        this.mPreviewBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                    }
                    try {
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                        return 0;
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setCaptureFormat(int i, int i2, boolean z) {
        StringBuilder sbOooO00o = o00000.OooO00o("setCaptureFormat: ", i, " type: ", i2, " force texture oes: ");
        sbOooO00o.append(z);
        Logging.i(TAG, sbOooO00o.toString());
        VideoCapture.FORCE_TEXTURE_OES = z;
        this.mCaptureOutputDataType = VideoCapture.translateToCaptureOutputDataType(i2);
        if (VideoCapture.translateToAndroidFormat(i) == this.mCaptureFormat) {
            return 0;
        }
        Logging.e(TAG, "For camera2 api, only YUV_420_888 format are supported");
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setEdgeEnhanceMode(int i) {
        this.mEdgeEnhanceMode = toCamera2EdgeEnhanceMode(i);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            return -1;
        }
        if (isSupported(this.mEdgeEnhanceMode, (int[]) cameraCharacteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES)) && this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                    Handler handler = new Handler(this.mPreviewThread.getLooper());
                    this.mPreviewBuilder.set(CaptureRequest.EDGE_MODE, Integer.valueOf(this.mEdgeEnhanceMode));
                    try {
                        try {
                            Logging.i(TAG, "setEdgeEnhanceMode = " + i);
                            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                            return 0;
                        } catch (CameraAccessException e) {
                            e.printStackTrace();
                        }
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        Logging.e(TAG, "not supported EdgeEnhance Mode = " + i);
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setExposure(float f, float f2, boolean z) {
        double d;
        int i;
        Logging.d(TAG, "setExposure called camera api2");
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            Logging.e(TAG, "set exposure unreasonable inputs");
            return -1;
        }
        CaptureRequest.Builder builder = this.mPreviewBuilder;
        if (builder == null) {
            Logging.d(TAG, "setExposure mPreviewBuilder is null");
            return -1;
        }
        double d2 = f;
        double d3 = f2;
        Rect rect = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect == null) {
            return -1;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        StringBuilder sbOooO00o = o00000.OooO00o("crop width = ", iWidth, " crop height = ", iHeight, " capture width = ");
        sbOooO00o.append(this.mCaptureWidth);
        sbOooO00o.append(" capture height = ");
        sbOooO00o.append(this.mCaptureHeight);
        Logging.d(TAG, sbOooO00o.toString());
        int i2 = this.mCaptureHeight;
        int i3 = iWidth * i2;
        int i4 = this.mCaptureWidth;
        if (i3 > iHeight * i4) {
            int i5 = (i4 * iHeight) / i2;
            i = (int) ((d2 * ((double) i5)) + ((double) ((iWidth - i5) / 2.0f)));
            d = d3 * ((double) iHeight);
        } else {
            int i6 = (i2 * iWidth) / i4;
            d = (d3 * ((double) i6)) + ((double) ((iHeight - i6) / 2.0f));
            i = (int) (d2 * ((double) iWidth));
        }
        int i7 = (int) d;
        Rect rect2 = new Rect();
        double d4 = i;
        double d5 = ((double) iWidth) * 0.05d;
        rect2.left = clamp((int) (d4 - d5), 0, iWidth);
        rect2.right = clamp((int) (d4 + d5), 0, iWidth);
        double d6 = i7;
        double d7 = ((double) iHeight) * 0.05d;
        rect2.top = clamp((int) (d6 - d7), 0, iHeight);
        rect2.bottom = clamp((int) (d6 + d7), 0, iHeight);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        if (this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                if (cameraCaptureSession != null) {
                    try {
                        try {
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), null, null);
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                            return -1;
                        }
                    } catch (CameraAccessException e2) {
                        e2.printStackTrace();
                        return -1;
                    }
                }
            }
        }
        long j = this.mNativeVideoCaptureDeviceAndroid;
        if (j != 0) {
            NotifyCameraExposureAreaChanged(f, f2, 0.0f, 0.0f, j);
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setExposureCompensation(int i) {
        setExposureCompensation_l(i);
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setFaceDetection(boolean z) {
        boolean z2 = this.faceDistaneEnabled != z;
        this.faceDistaneEnabled = z;
        if (!this.mFaceDetectSupported || !z2) {
            Logging.w(TAG, "face detect no change");
        } else if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                    Handler handler = new Handler(this.mPreviewThread.getLooper());
                    if (this.faceDistaneEnabled) {
                        this.mPreviewBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.mFaceDetectMode));
                    } else {
                        if (this.mIsAutoFaceFocusEnabled) {
                            Logging.w(TAG, "face detect did not turn off due to autoFocus on");
                            return 0;
                        }
                        this.mPreviewBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                    }
                    try {
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                        return 0;
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setFocus(float f, float f2, boolean z) {
        Rect rect;
        double d;
        int i;
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            Logging.e(TAG, "set focus unreasonable inputs");
            return -1;
        }
        CaptureRequest.Builder builder = this.mPreviewBuilder;
        if (builder == null) {
            Logging.d(TAG, "setFocus mPreviewBuilder is null");
            return -1;
        }
        double d2 = f;
        double d3 = f2;
        if (builder == null || (rect = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION)) == null) {
            return -1;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        StringBuilder sbOooO00o = o00000.OooO00o("crop width = ", iWidth, " crop height = ", iHeight, " capture width = ");
        sbOooO00o.append(this.mCaptureWidth);
        sbOooO00o.append(" capture height = ");
        sbOooO00o.append(this.mCaptureHeight);
        Logging.d(TAG, sbOooO00o.toString());
        int i2 = this.mCaptureHeight;
        int i3 = iWidth * i2;
        int i4 = this.mCaptureWidth;
        if (i3 > iHeight * i4) {
            int i5 = (i4 * iHeight) / i2;
            i = (int) ((d2 * ((double) i5)) + ((double) ((iWidth - i5) / 2.0f)));
            d = d3 * ((double) iHeight);
        } else {
            int i6 = (i2 * iWidth) / i4;
            d = (d3 * ((double) i6)) + ((double) ((iHeight - i6) / 2.0f));
            i = (int) (d2 * ((double) iWidth));
        }
        int i7 = (int) d;
        Rect rect2 = new Rect();
        double d4 = i;
        double d5 = ((double) iWidth) * 0.05d;
        rect2.left = clamp((int) (d4 - d5), 0, iWidth);
        rect2.right = clamp((int) (d4 + d5), 0, iWidth);
        double d6 = i7;
        double d7 = ((double) iHeight) * 0.05d;
        rect2.top = clamp((int) (d6 - d7), 0, iHeight);
        rect2.bottom = clamp((int) (d6 + d7), 0, iHeight);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        if (this.mPreviewThread != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && this.mCaptureSession != null) {
                    try {
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mAfCaptureCallback, new Handler(this.mPreviewThread.getLooper()));
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                        return -1;
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                        return -1;
                    }
                }
            }
            long j = this.mNativeVideoCaptureDeviceAndroid;
            if (j != 0) {
                NotifyCameraFocusAreaChanged(f, f2, 0.0f, 0.0f, j);
            }
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setNoiseReductionMode(int i) {
        this.mNoiseReductionMode = toCamera2NoiseMode(i);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            return -1;
        }
        if (isSupported(this.mNoiseReductionMode, (int[]) cameraCharacteristics.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES)) && this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                    Handler handler = new Handler(this.mPreviewThread.getLooper());
                    this.mPreviewBuilder.set(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(this.mNoiseReductionMode));
                    try {
                        try {
                            Logging.i(TAG, "setNoiseReductionMode = " + i);
                            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                            return 0;
                        } catch (CameraAccessException e) {
                            e.printStackTrace();
                        }
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        Logging.e(TAG, "not supported NoiseReductionMode = " + i);
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setTorchMode(boolean z) {
        Logging.d(TAG, "setFlashMode isTorchOn " + z);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return -1;
        }
        if (this.mPreviewBuilder == null) {
            return -1;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (!(bool == null ? false : bool.booleanValue())) {
            Logging.w(TAG, "flash is not supported");
        } else if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                    Handler handler = new Handler(this.mPreviewThread.getLooper());
                    if (z) {
                        this.mPreviewBuilder.set(CaptureRequest.FLASH_MODE, 2);
                    } else {
                        this.mPreviewBuilder.set(CaptureRequest.FLASH_MODE, 0);
                    }
                    try {
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), null, handler);
                        return 0;
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setVideoStabilityMode(int i) {
        this.mVideoStabilityMode = toCamera2VideoStabilityMode(i);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            return -1;
        }
        if (isSupported(this.mVideoStabilityMode, (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) && this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
                    Handler handler = new Handler(this.mPreviewThread.getLooper());
                    this.mPreviewBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(this.mVideoStabilityMode));
                    try {
                        try {
                            Logging.i(TAG, "setVideoStabilityMode = " + i);
                            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, handler);
                            return 0;
                        } catch (CameraAccessException e) {
                            e.printStackTrace();
                        }
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        Logging.e(TAG, "not supported VideoStability Mode = " + i);
        return -1;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int setZoom(float f) {
        CaptureRequest.Builder builder;
        Logging.d(TAG, "setCameraZoom api2 called zoomValue =" + f);
        if (this.mPreviewBuilder == null) {
            Logging.d(TAG, "setZoom mPreviewBuilder is null");
            return -1;
        }
        if (this.mSensorRect == null) {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
            if (cameraCharacteristics == null) {
                Logging.w(TAG, "warning cameraCharacteristics is null");
                return -1;
            }
            this.mSensorRect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.mMaxZoom = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        if (Math.abs(this.mMaxZoom - 1.0f) < 0.001f) {
            Logging.w(TAG, "Camera " + this.mId + " does not support camera zoom");
            return -1;
        }
        this.mCurZoomRatio = f;
        if (!(f >= 1.0f && f <= this.mMaxZoom && f != this.mLastZoomRatio)) {
            return -2;
        }
        Rect rectCropRegionForZoom = cropRegionForZoom(f);
        if (this.mPreviewThread != null && this.mPreviewBuilder != null && this.mCaptureSession != null) {
            synchronized (this.mCaptureSessionLock) {
                if (this.mPreviewThread != null && (builder = this.mPreviewBuilder) != null && this.mCaptureSession != null) {
                    builder.set(CaptureRequest.SCALER_CROP_REGION, rectCropRegionForZoom);
                    this.mLastZoomRatio = this.mCurZoomRatio;
                    try {
                        try {
                            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, new Handler(this.mPreviewThread.getLooper()));
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                            return -4;
                        }
                    } catch (CameraAccessException e2) {
                        e2.printStackTrace();
                        return -3;
                    }
                }
            }
        }
        return 0;
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int startCapture(int i, int i2, int i3) {
        CameraState cameraState;
        CameraState cameraState2;
        StringBuilder sbOooO00o = o00000.OooO00o("startCapture, w=", i, ", h=", i2, ", fps=");
        sbOooO00o.append(i3);
        Logging.i(TAG, sbOooO00o.toString());
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        this.mCaptureFps = i3;
        synchronized (this.mCameraStateLock) {
            while (true) {
                try {
                    cameraState = this.mCameraState;
                    cameraState2 = CameraState.STARTED;
                    if (cameraState == cameraState2 || cameraState == CameraState.EVICTED || cameraState == CameraState.STOPPED) {
                        break;
                    }
                    try {
                        this.mCameraStateLock.wait();
                    } catch (InterruptedException e) {
                        Logging.e(TAG, "CaptureStartedEvent: ", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (cameraState == cameraState2) {
                return 0;
            }
            changeCameraStateAndNotify(CameraState.OPENING);
            int iTryOpenCamera = tryOpenCamera();
            if (iTryOpenCamera != 0) {
                changeCameraStateAndNotify(CameraState.STOPPED);
            }
            return iTryOpenCamera;
        }
    }

    @Override // io.agora.rtc.video.VideoCapture
    public int stopCapture() {
        CameraState cameraState;
        synchronized (this.mCameraStateLock) {
            while (true) {
                cameraState = this.mCameraState;
                if (cameraState == CameraState.STARTED || cameraState == CameraState.EVICTED || cameraState == CameraState.STOPPED) {
                    break;
                }
                try {
                    this.mCameraStateLock.wait();
                } catch (InterruptedException e) {
                    Logging.e(TAG, "CaptureStartedEvent: ", e);
                }
            }
            if (cameraState == CameraState.EVICTED) {
                this.mCameraState = CameraState.STOPPED;
            }
            CameraState cameraState2 = this.mCameraState;
            CameraState cameraState3 = CameraState.STOPPED;
            if (cameraState2 == cameraState3) {
                return 0;
            }
            doStopCapture();
            changeCameraStateAndNotify(cameraState3);
            return 0;
        }
    }
}
