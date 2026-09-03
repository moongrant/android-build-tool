package io.agora.rtc.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.internal.security.CertificateUtil;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.internal.Logging;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class VideoCaptureFactory {
    private static final int ANDROID_CAMERA1 = 0;
    private static final int ANDROID_CAMERA2 = 1;
    private static final int ANDROID_CAMERA_NOT_DEFINE = -1;
    private static final String TAG = "CAM-FACTORY";

    public static void cacheLowPowerFlag(Context context, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("CamCapsLowPower", 0).edit();
        editorEdit.putInt("Cam_LowPower", i);
        editorEdit.commit();
    }

    public static VideoCapture createVideoCapture(Context context, int i, int i2, boolean z, int i3, int i4, EglBase.Context context2, long j) {
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("createVideoCapture id: ", i, " select: ", i2, " fallback: ");
        sbOooO0O0.append(z);
        sbOooO0O0.append(" pqFirst: ");
        sbOooO0O0.append(i3);
        sbOooO0O0.append(" lowPowerFlag: ");
        sbOooO0O0.append(i4);
        Logging.i(TAG, sbOooO0O0.toString());
        if (i4 != fetchLowPowerFlag(context)) {
            cacheLowPowerFlag(context, i4);
            VideoCapture.clearCapabilityCache(context);
        }
        if (useCamera2(i, context, i2, z)) {
            Logging.d(TAG, "create CAMERA2, id:" + i);
            return new VideoCaptureCamera2(context, i, i3, context2, j);
        }
        Logging.d(TAG, "create CAMERA1, id:" + i);
        return new VideoCaptureCamera(context, i, i3, context2, j);
    }

    public static int fetchLowPowerFlag(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("CamCapsLowPower", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("Cam_LowPower", -1);
        }
        return 0;
    }

    public static String getCapabilities(int i, Context context, int i2, boolean z) {
        String strFetchCapability = useCamera2(i, context, i2, z) ? VideoCapture.fetchCapability(i, context, VideoCaptureCamera2.getCaptureName()) : VideoCapture.fetchCapability(i, context, VideoCaptureCamera.getCaptureName());
        if (strFetchCapability == null) {
            Logging.e(TAG, "Capability hasn't been created");
        } else {
            printCameraInfo(strFetchCapability);
        }
        return strFetchCapability;
    }

    public static String getDeviceName(int i, Context context, int i2, boolean z) {
        return useCamera2(i, context, i2, z) ? VideoCaptureCamera2.getName(i, context) : VideoCaptureCamera.getName(i);
    }

    public static int getDeviceOrientation(int i, Context context, int i2, boolean z) {
        return useCamera2(i, context, i2, z) ? VideoCaptureCamera2.getSensorOrientation(i, context) : VideoCaptureCamera.getSensorOrientation(i);
    }

    public static int getFrontCameraIndex(Context context) {
        int frontCameraIndex = isCamera2Available() ? VideoCaptureCamera2.getFrontCameraIndex(context) : VideoCaptureCamera.getFrontCameraIndex();
        Logging.i(TAG, "getFrontCameraIndex  = " + frontCameraIndex);
        return frontCameraIndex;
    }

    public static int getNumberOfCameras(Context context) {
        if (Build.VERSION.SDK_INT >= 23 || context.getPackageManager().checkPermission("android.permission.CAMERA", context.getPackageName()) == 0) {
            int numberOfCameras = isCamera2Available() ? VideoCaptureCamera2.getNumberOfCameras(context) : 0;
            return numberOfCameras == 0 ? VideoCaptureCamera.getNumberOfCameras() : numberOfCameras;
        }
        Logging.e(TAG, "Missing android.permission.CAMERA permission, no system camera available");
        return 0;
    }

    public static boolean isCamera2Available() {
        String str = Build.DEVICE;
        if ("ocean".equalsIgnoreCase(str) && "oe106".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        if ("trident".equalsIgnoreCase(str) && "de106".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        if (("shark".equalsIgnoreCase(str) && "skr-a0".equalsIgnoreCase(Build.MODEL)) || "hnnem-h".equalsIgnoreCase(str)) {
            return false;
        }
        if ((!"on7xelte".equals(str) || !"SM-G610F".equals(Build.MODEL)) && !"m2c".equals(str)) {
            String str2 = Build.MODEL;
            if (!"M578CA".equals(str2)) {
                String str3 = Build.MANUFACTURER;
                if ("samsung".equalsIgnoreCase(str3) && str2 != null && (str2.contains("SM-G930") || str2.contains("SM-G935") || str2.contains("SM-G950") || str2.contains("SM-G955") || "SC-02H".equals(str2) || "SCV33".equals(str2) || "SC-02J".equals(str2) || "SCV36".equals(str2) || "SM-G892A".equals(str2) || "SM-G892U".equals(str2) || "SC-03J".equals(str2) || "SCV35".equals(str2))) {
                    return false;
                }
                return !"oneplus".equalsIgnoreCase(str3) || str2.contains("ONEPLUS A6");
            }
        }
        return false;
    }

    public static int printCameraInfo(String str) {
        int length = (str.length() / 150) + 1;
        for (int i = 0; i < length; i++) {
            try {
                String str2 = "lines = " + length + CertificateUtil.DELIMITER;
                Logging.d("CameraInfo", i == length - 1 ? str2 + str.substring(i * 150, str.length()) : str2 + str.substring(i * 150, (i + 1) * 150));
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private static boolean useCamera2(int i, Context context, int i2, boolean z) {
        if (!isCamera2Available()) {
            return false;
        }
        if (i2 == 1 || i2 == 0) {
            return i2 == 1;
        }
        return (VideoCaptureCamera2.isLegacyDevice(context, i) || z) ? false : true;
    }
}
