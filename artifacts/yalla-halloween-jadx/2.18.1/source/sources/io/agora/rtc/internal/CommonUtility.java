package io.agora.rtc.internal;

import OooO00o.OooO00o;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import io.agora.rtc.utils.CameraUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
class CommonUtility {
    private static final String PREFIX_URI = "content://";
    private static final String TAG = "CommonUtility";
    private static final int VIDEO_SOURCE_TYPE_CUSTOMIZED = 2;
    private static final int VIDEO_SOURCE_TYPE_DEFAULT = 1;
    private static final int VIDEO_SOURCE_TYPE_EXTERNAL_DEPRECATED = 3;
    private static final int VIDEO_SOURCE_TYPE_NULL = 0;
    private static WeakReference<Application> mApplication;
    private volatile boolean mAccessible;
    private boolean mAudioOnly;
    private long mBridgeHandle;
    private WeakReference<Context> mContext;
    private AgoraPhoneStateListener mPhoneStateListener;
    private ConnectionChangeBroadcastReceiver mConnectionBroadcastReceiver = null;
    private BroadcastReceiver mOrientationObserver = null;
    private PowerConnectionReceiver mPowerConnectionReceiver = null;
    private int mMobileType = -1;
    private int batteryPercentage = KotlinVersion.MAX_COMPONENT_VALUE;
    private int mOrientation = -1;
    private boolean mLocalVideoEnabled = false;
    private int mVideoSourceType = 1;
    private int mSensorOrietation = -1;
    private OrientationEventListener mOrientationListener = null;
    private String localIpv4 = null;
    private String localIpv6 = null;
    private String gatewayIp = null;
    private boolean shouldGetIp = true;

    public class AgoraPhoneStateListener extends PhoneStateListener {
        private SignalStrength mSignalStrenth;
        private boolean phoneStatusNeedResume = false;

        public AgoraPhoneStateListener() {
        }

        private int invokeMethod(String str) {
            Method declaredMethod;
            try {
                SignalStrength signalStrength = this.mSignalStrenth;
                if (signalStrength != null && (declaredMethod = signalStrength.getClass().getDeclaredMethod(str, new Class[0])) != null) {
                    return ((Integer) declaredMethod.invoke(this.mSignalStrenth, new Object[0])).intValue();
                }
            } catch (Exception unused) {
            }
            return 0;
        }

        public int getAsuLevel() {
            if (Build.VERSION.SDK_INT <= 28) {
                return invokeMethod("getAsuLevel");
            }
            return 0;
        }

        public void getCellSignalInfo(RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo) {
            new RtcEngineMessage.MediaNetworkInfo();
            mediaNetworkInfo.snr = -100;
            if (Build.VERSION.SDK_INT > 28) {
                getCellSignalInfoNew(mediaNetworkInfo);
            } else {
                mediaNetworkInfo.rssi = getRssi();
                mediaNetworkInfo.signalLevel = getLevel();
            }
        }

        @TargetApi(29)
        public void getCellSignalInfoNew(RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo) {
            SignalStrength signalStrength;
            mediaNetworkInfo.snr = -100;
            if (Build.VERSION.SDK_INT >= 29 && (signalStrength = this.mSignalStrenth) != null) {
                try {
                    Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getCellSignalStrengths", new Class[0]);
                    if (declaredMethod != null) {
                        try {
                            for (CellSignalStrength cellSignalStrength : (List) declaredMethod.invoke(this.mSignalStrenth, new Object[0])) {
                                if (cellSignalStrength instanceof CellSignalStrengthLte) {
                                    CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) cellSignalStrength;
                                    mediaNetworkInfo.rssi = cellSignalStrengthLte.getDbm();
                                    mediaNetworkInfo.signalLevel = cellSignalStrengthLte.getLevel();
                                    mediaNetworkInfo.snr = cellSignalStrengthLte.getRssnr();
                                    break;
                                }
                                if ((cellSignalStrength instanceof CellSignalStrengthGsm) || (cellSignalStrength instanceof CellSignalStrengthCdma) || (cellSignalStrength instanceof CellSignalStrengthWcdma)) {
                                    mediaNetworkInfo.rssi = cellSignalStrength.getDbm();
                                    mediaNetworkInfo.signalLevel = cellSignalStrength.getLevel();
                                    break;
                                }
                            }
                        } catch (Exception unused) {
                            Logging.e(CommonUtility.TAG, "getCellStrengthNew failed! ");
                        }
                    } else {
                        Logging.e(CommonUtility.TAG, "getCellStrengthNew method is null! ");
                    }
                } catch (NoSuchMethodException unused2) {
                    Logging.e(CommonUtility.TAG, "getCellStrengthNew getDeclareMethod:getCellSignalStrengths failed! ");
                }
            }
            String str = CommonUtility.TAG;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("getCellInfo rssi: ");
            sbOooO0o0.append(mediaNetworkInfo.rssi);
            sbOooO0o0.append(" level: ");
            sbOooO0o0.append(mediaNetworkInfo.signalLevel);
            sbOooO0o0.append(" rssnr: ");
            sbOooO0o0.append(mediaNetworkInfo.snr);
            Logging.i(str, sbOooO0o0.toString());
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getRssi() {
            if (Build.VERSION.SDK_INT <= 28) {
                return invokeMethod("getDbm");
            }
            return 0;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (((Context) CommonUtility.this.mContext.get()) == null || !CommonUtility.this.mAccessible) {
                return;
            }
            super.onCallStateChanged(i, str);
            if (i == 0) {
                if (this.phoneStatusNeedResume) {
                    this.phoneStatusNeedResume = false;
                    Logging.i(CommonUtility.TAG, "system phone call end delay 1000ms");
                    new Handler().postDelayed(new Runnable() { // from class: io.agora.rtc.internal.CommonUtility.AgoraPhoneStateListener.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                CommonUtility.this.onPhoneStateChanged(true, 22, 0);
                            } catch (Exception e) {
                                Logging.e(CommonUtility.TAG, "fail to resume ", e);
                            }
                        }
                    }, 1000L);
                    return;
                }
                return;
            }
            if (i == 1) {
                Logging.i(CommonUtility.TAG, "system phone call ring");
                this.phoneStatusNeedResume = true;
                CommonUtility.this.onPhoneStateChanged(false, 22, 1);
            } else {
                if (i != 2) {
                    return;
                }
                Logging.i(CommonUtility.TAG, "system phone call start");
                this.phoneStatusNeedResume = true;
                CommonUtility.this.onPhoneStateChanged(false, 22, 2);
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (((Context) CommonUtility.this.mContext.get()) == null || !CommonUtility.this.mAccessible) {
                return;
            }
            super.onSignalStrengthsChanged(signalStrength);
            this.mSignalStrenth = signalStrength;
        }
    }

    public static class MobileType {
        public static final int Cdma = 1;
        public static final int Gsm = 0;
        public static final int Lte = 3;
        public static final int Unknown = -1;
        public static final int Wcdma = 2;
    }

    public CommonUtility(Context context, long j, boolean z) {
        this.mAccessible = false;
        this.mPhoneStateListener = null;
        this.mBridgeHandle = 0L;
        this.mAudioOnly = z;
        this.mContext = new WeakReference<>(context);
        this.mBridgeHandle = j;
        try {
            this.mPhoneStateListener = new AgoraPhoneStateListener();
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 288);
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create PhoneStateListener, ", e);
        }
        monitorConnectionEvent(true);
        monitorPowerChange(true);
        monitorOrientationChange(context, true);
        this.mAccessible = true;
        Logging.i(TAG, "[init] done!");
    }

    public static boolean canGetDefaultContext() {
        Looper.myLooper();
        Looper.getMainLooper();
        return true;
    }

    private static boolean checkAccessNetworkState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    private static boolean checkAccessWifiState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkOrientation(int i) {
        if (this.mAudioOnly || i == -1 || !this.mAccessible) {
            return;
        }
        int i2 = 180;
        if (i > 340 || i < 20) {
            nativeNotifyGravityOriChange(this.mBridgeHandle, 270);
            i2 = 0;
        } else if (i > 70 && i < 110) {
            nativeNotifyGravityOriChange(this.mBridgeHandle, 180);
            i2 = 90;
        } else if (i > 160 && i < 200) {
            nativeNotifyGravityOriChange(this.mBridgeHandle, 90);
        } else if (i <= 250 || i >= 290) {
            i2 = -1;
        } else {
            nativeNotifyGravityOriChange(this.mBridgeHandle, 0);
            i2 = 270;
        }
        if (i2 == -1 || i2 == this.mSensorOrietation) {
            return;
        }
        this.mSensorOrietation = i2;
        updateViewOrientation();
    }

    private void checkVoipPermissions(Context context, String str) throws SecurityException {
        if (context == null || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            throw new SecurityException(OooOo00.OooO0Oo(str, " is not granted"));
        }
    }

    private void disableOrientationListener() {
        if (this.mAudioOnly) {
            return;
        }
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            Logging.e(TAG, "[disableOrientationListener] mOrientationListener is null!");
            return;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        Logging.i(TAG, "[disableOrientationListener] done!");
    }

    private RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo(Context context) {
        InetAddress inetAddressIntToInetAddress;
        if (context == null || !this.mAccessible) {
            return null;
        }
        RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo = new RtcEngineMessage.MediaNetworkInfo();
        if (!checkAccessNetworkState(context)) {
            mediaNetworkInfo.ssid = "";
            mediaNetworkInfo.bssid = "";
            mediaNetworkInfo.rssi = 0;
            mediaNetworkInfo.signalLevel = -1;
            mediaNetworkInfo.frequency = 0;
            mediaNetworkInfo.linkspeed = 0;
            return mediaNetworkInfo;
        }
        if (this.shouldGetIp) {
            String localHost = getLocalHost(true);
            if (localHost != null) {
                mediaNetworkInfo.localIp4 = localHost;
            }
            String localHost2 = getLocalHost(false);
            if (localHost2 != null) {
                mediaNetworkInfo.localIp6 = localHost2;
            }
            this.localIpv4 = localHost;
            this.localIpv6 = localHost2;
            this.shouldGetIp = false;
        } else {
            String str = this.localIpv4;
            if (str != null) {
                mediaNetworkInfo.localIp4 = str;
            }
            String str2 = this.localIpv6;
            if (str2 != null) {
                mediaNetworkInfo.localIp6 = str2;
            }
        }
        NetworkInfo networkInfo = Connectivity.getNetworkInfo(context);
        mediaNetworkInfo.networkType = Connectivity.getNetworkType(networkInfo);
        if (networkInfo != null) {
            mediaNetworkInfo.networkSubtype = networkInfo.getSubtype();
        }
        mediaNetworkInfo.dnsList = Connectivity.getDnsList();
        if (mediaNetworkInfo.networkType == 2) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (!checkAccessWifiState(context) || wifiManager == null) {
                mediaNetworkInfo.ssid = "";
                mediaNetworkInfo.bssid = "";
                mediaNetworkInfo.rssi = 0;
                mediaNetworkInfo.signalLevel = -1;
                mediaNetworkInfo.frequency = 0;
                mediaNetworkInfo.linkspeed = 0;
                return mediaNetworkInfo;
            }
            if (TextUtils.isEmpty(this.gatewayIp)) {
                DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                if (dhcpInfo != null && (inetAddressIntToInetAddress = intToInetAddress(dhcpInfo.gateway)) != null) {
                    String hostAddress = inetAddressIntToInetAddress.getHostAddress();
                    this.gatewayIp = hostAddress;
                    mediaNetworkInfo.gatewayIp4 = hostAddress;
                }
            } else {
                mediaNetworkInfo.gatewayIp4 = this.gatewayIp;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                mediaNetworkInfo.ssid = "";
                mediaNetworkInfo.bssid = "";
                int rssi = connectionInfo.getRssi();
                mediaNetworkInfo.rssi = rssi;
                mediaNetworkInfo.signalLevel = WifiManager.calculateSignalLevel(rssi, 5);
                mediaNetworkInfo.linkspeed = connectionInfo.getLinkSpeed();
                int frequency = connectionInfo.getFrequency();
                mediaNetworkInfo.frequency = frequency;
                if (frequency >= 5000) {
                    mediaNetworkInfo.networkSubtype = 101;
                } else if (frequency >= 2400) {
                    mediaNetworkInfo.networkSubtype = 100;
                }
            }
        } else {
            AgoraPhoneStateListener agoraPhoneStateListener = this.mPhoneStateListener;
            if (agoraPhoneStateListener != null) {
                this.gatewayIp = null;
                agoraPhoneStateListener.getCellSignalInfo(mediaNetworkInfo);
            } else {
                this.gatewayIp = null;
            }
        }
        return mediaNetworkInfo;
    }

    private void enableOrientationListener(Context context) {
        if (this.mAudioOnly) {
            return;
        }
        try {
            if (this.mOrientationListener == null) {
                this.mOrientationListener = new OrientationEventListener(context, 3) { // from class: io.agora.rtc.internal.CommonUtility.1
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int i) {
                        if (i == -1) {
                            return;
                        }
                        CommonUtility.this.checkOrientation(i);
                    }
                };
            }
            this.mOrientationListener.enable();
            Logging.i(TAG, "[enableOrientationListener] done!");
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create OrientationEventListener, ", e);
        }
    }

    private static String getAndroidID(Context context) {
        return "";
    }

    public static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        return (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
    }

    private String getAssetsCacheFile(Context context, String str) {
        Logging.i(TAG, "getAssetsCacheFile filePath: " + str);
        boolean zStartsWith = str.startsWith(PREFIX_URI);
        try {
            File file = new File(context.getCacheDir(), "wm_image_cache");
            if (file.exists()) {
                file.delete();
            }
            InputStream fileInputStream = zStartsWith ? new FileInputStream(context.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor()) : context.getAssets().open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return file.getAbsolutePath();
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private AudioManager getAudioManager(Context context) {
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public static byte[] getContextInfo(Context context) {
        if (context == null) {
            return null;
        }
        RtcEngineMessage.PAndroidContextInfo pAndroidContextInfo = new RtcEngineMessage.PAndroidContextInfo();
        pAndroidContextInfo.device = DeviceUtils.buildDeviceId();
        pAndroidContextInfo.deviceInfo = DeviceUtils.getDeviceInfo();
        pAndroidContextInfo.systemInfo = DeviceUtils.getSystemInfo();
        pAndroidContextInfo.configDir = getAppPrivateStorageDir(context);
        pAndroidContextInfo.dataDir = context.getCacheDir().getAbsolutePath();
        pAndroidContextInfo.pluginDir = context.getApplicationInfo().nativeLibraryDir;
        pAndroidContextInfo.androidID = "";
        if (TextUtils.isEmpty(pAndroidContextInfo.device)) {
            pAndroidContextInfo.device = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.deviceInfo)) {
            pAndroidContextInfo.deviceInfo = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.systemInfo)) {
            pAndroidContextInfo.systemInfo = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.configDir)) {
            pAndroidContextInfo.configDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.dataDir)) {
            pAndroidContextInfo.dataDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.pluginDir)) {
            pAndroidContextInfo.pluginDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.androidID)) {
            pAndroidContextInfo.androidID = "";
        }
        return pAndroidContextInfo.marshall();
    }

    public static String getLocalHost(boolean z) {
        try {
            String hostAddress = null;
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.getName().startsWith("usb")) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        if (!inetAddress.isLoopbackAddress()) {
                            if (z && (inetAddress instanceof Inet4Address)) {
                                Inet4Address inet4Address = (Inet4Address) inetAddress;
                                if (hostAddress == null) {
                                    hostAddress = inet4Address.getHostAddress();
                                }
                                if (!inet4Address.isLinkLocalAddress() && !inet4Address.isAnyLocalAddress()) {
                                    return inet4Address.getHostAddress();
                                }
                            }
                            if (!z && (inetAddress instanceof Inet6Address)) {
                                Inet6Address inet6Address = (Inet6Address) inetAddress;
                                if (hostAddress == null) {
                                    hostAddress = inet6Address.getHostAddress();
                                }
                                if (!inet6Address.isLinkLocalAddress() && !inet6Address.isAnyLocalAddress()) {
                                    return inet6Address.getHostAddress();
                                }
                            }
                        }
                    }
                }
            }
            if (hostAddress != null) {
                return hostAddress;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static String[] getLocalHostList() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            for (NetworkInterface networkInterface : list) {
                if (!networkInterface.getName().startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String strInetAddressToIpAddress = inetAddressToIpAddress((InetAddress) it.next(), true);
                        if (strInetAddressToIpAddress != null) {
                            arrayList.add(strInetAddressToIpAddress);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String[] strArr = new String[arrayList.size()];
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                strArr[i] = (String) it2.next();
                i++;
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getRandomUUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    private static String getSystemProperty(String str) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, str);
    }

    private static String inetAddressToIpAddress(InetAddress inetAddress, boolean z) {
        if (inetAddress.isLoopbackAddress()) {
            return null;
        }
        if (z && (inetAddress instanceof Inet4Address)) {
            return ((Inet4Address) inetAddress).getHostAddress();
        }
        if (z || !(inetAddress instanceof Inet6Address) || inetAddress.isLinkLocalAddress()) {
            return null;
        }
        return ((Inet6Address) inetAddress).getHostAddress();
    }

    private static InetAddress intToInetAddress(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    private boolean isSimulatorProperty() {
        int i;
        String systemProperty = "";
        String str = Build.MANUFACTURER;
        try {
            systemProperty = getSystemProperty("ro.hardware");
            i = (systemProperty == null || systemProperty.toLowerCase().equals("intel")) ? 1 : 0;
        } catch (Exception unused) {
            Logging.e(TAG, "get property hardware fail.");
        }
        String str2 = TAG;
        Logging.i(str2, "hardware = " + systemProperty + ", suspectCount = " + i);
        try {
            String property = System.getProperty("os.arch");
            if (property == null || (property.toLowerCase().equals("i686") && !str.toLowerCase().contains("asus"))) {
                i++;
                Logging.i(str2, "arch = " + property + ", suspectCount = " + i);
            }
        } catch (Exception unused2) {
            Logging.e(TAG, "get property arch fail.");
        }
        if (Build.VERSION.SDK_INT > 28) {
            if (systemProperty.toLowerCase().contains("ttvm") || systemProperty.toLowerCase().contains("nox")) {
                i += 10;
            }
            try {
                String systemProperty2 = getSystemProperty("ro.build.flavor");
                if (systemProperty2 == null || systemProperty2.contains("vbox") || systemProperty2.contains("sdk_gphone")) {
                    i++;
                    Logging.i(TAG, "buildFlavor = " + systemProperty2 + ", suspectCount = " + i);
                }
            } catch (Exception unused3) {
                Logging.e(TAG, "get property buildFlavor fail.");
            }
            try {
                String systemProperty3 = getSystemProperty("ro.product.board");
                if (systemProperty3 == null || (systemProperty3.contains("android") | systemProperty3.contains("goldfish"))) {
                    i++;
                    Logging.i(TAG, "productBoard = " + systemProperty3 + ", suspectCount = " + i);
                }
            } catch (Exception unused4) {
                Logging.e(TAG, "get property productBoard fail.");
            }
            try {
                String systemProperty4 = getSystemProperty("ro.board.platform");
                if (systemProperty4 == null || systemProperty4.contains("android")) {
                    i++;
                    Logging.i(TAG, "boardPlatform = " + systemProperty4 + ", suspectCount = " + i);
                }
            } catch (Exception unused5) {
                Logging.e(TAG, "get property boardPlatform fail.");
            }
        }
        return i > 0;
    }

    private void monitorOrientationChange(Context context, boolean z) {
        if (this.mAudioOnly) {
            return;
        }
        if (z) {
            enableOrientationListener(context);
            regiseterBroadcaster(context);
        } else {
            disableOrientationListener();
            unregisterBroadcaster(context);
        }
    }

    private native void nativeAudioRoutingPhoneChanged(long j, boolean z, int i, int i2);

    private native int nativeNotifyGravityOriChange(long j, int i);

    private native int nativeNotifyNetworkChange(long j, byte[] bArr);

    private native int nativeNotifyOrientationChange(long j, int i);

    private void regiseterBroadcaster(Context context) {
        if (this.mAudioOnly || context == null) {
            return;
        }
        this.mOrientationObserver = new BroadcastReceiver() { // from class: io.agora.rtc.internal.CommonUtility.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED") && CommonUtility.this.mAccessible) {
                    CommonUtility.this.updateViewOrientation();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        context.registerReceiver(this.mOrientationObserver, intentFilter);
        Logging.i(TAG, "[regiseterBroadcaster] done!");
    }

    private void unregisterBroadcaster(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (this.mAudioOnly || context == null || (broadcastReceiver = this.mOrientationObserver) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        Logging.i(TAG, "[unregisterBroadcaster] done!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateViewOrientation() {
        if (this.mAudioOnly) {
            return;
        }
        if (this.mContext.get() == null || !this.mAccessible) {
            Logging.e(TAG, "[updateViewOrientation] mContext is null or mAccessible is false!");
            return;
        }
        Display defaultDisplay = ((WindowManager) this.mContext.get().getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay == null) {
            Logging.e(TAG, "[updateViewOrientation] display is null!");
            return;
        }
        int rotation = defaultDisplay.getRotation();
        if (rotation == this.mOrientation) {
            return;
        }
        if (rotation == 0) {
            this.mOrientation = 0;
            nativeNotifyOrientationChange(this.mBridgeHandle, 0);
            return;
        }
        if (rotation == 1) {
            this.mOrientation = 1;
            nativeNotifyOrientationChange(this.mBridgeHandle, 1);
        } else if (rotation == 2) {
            this.mOrientation = 2;
            nativeNotifyOrientationChange(this.mBridgeHandle, 2);
        } else {
            if (rotation != 3) {
                return;
            }
            this.mOrientation = 3;
            nativeNotifyOrientationChange(this.mBridgeHandle, 3);
        }
    }

    public void destroy() {
        this.mAccessible = false;
        Context context = this.mContext.get();
        if (this.mPhoneStateListener != null && context != null) {
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 0);
            this.mPhoneStateListener = null;
        }
        monitorConnectionEvent(false);
        monitorPowerChange(false);
        monitorOrientationChange(context, false);
        this.mContext.clear();
        Logging.i(TAG, "[destroy] done!");
    }

    public int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public int getBatteryLifePercent() {
        return (this.mContext.get() == null || !this.mAccessible) ? KotlinVersion.MAX_COMPONENT_VALUE : this.batteryPercentage;
    }

    public int getFrontCameraIndex(Context context) {
        return DeviceUtils.selectFrontCamera(context);
    }

    public byte[] getNetworkInfo() {
        RtcEngineMessage.MediaNetworkInfo mediaNetworkInfoDoGetNetworkInfo;
        Context context = this.mContext.get();
        if (context == null || !this.mAccessible || (mediaNetworkInfoDoGetNetworkInfo = doGetNetworkInfo(context)) == null) {
            return null;
        }
        return mediaNetworkInfoDoGetNetworkInfo.marshall();
    }

    public int getNetworkType() {
        Context context = this.mContext.get();
        if (context != null && this.mAccessible && checkAccessNetworkState(context)) {
            return Connectivity.getNetworkType(context);
        }
        return -1;
    }

    public int getNumberOfCameras(Context context) {
        return DeviceUtils.getNumberOfCameras(context);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    public int isSimulator() {
        String str;
        boolean zContains;
        int i;
        int i2;
        try {
            str = Build.MANUFACTURER;
            try {
                zContains = str.toLowerCase().contains("netease");
                try {
                    Logging.i(TAG, "manufacturer = " + str);
                    i = zContains;
                } catch (Exception unused) {
                    Logging.e(TAG, "get manufacturer info fail.");
                    i = zContains;
                }
            } catch (Exception unused2) {
                zContains = false;
                Logging.e(TAG, "get manufacturer info fail.");
                i = zContains;
                i2 = i;
                if (isSimulatorProperty()) {
                    i2 = i + 1;
                }
                if (Build.VERSION.SDK_INT <= 28) {
                    return !"".toLowerCase().equals("unknown") ? 1 : 1;
                }
                if ("nokia".equalsIgnoreCase(str)) {
                }
                return 1;
                return 0;
            }
        } catch (Exception unused3) {
            str = "";
        }
        i2 = i;
        if (isSimulatorProperty()) {
            i2 = i + 1;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            if (("nokia".equalsIgnoreCase(str) || (!"Nokia_N1".equalsIgnoreCase(Build.DEVICE) && !"N1".equalsIgnoreCase(Build.MODEL))) && i2 > 0 && !str.toLowerCase().contains("welldo")) {
                return 1;
            }
        } else if ((!"".toLowerCase().equals("unknown") || i2 > 0) && !str.toLowerCase().contains("welldo")) {
        }
        return 0;
    }

    public int isSpeakerphoneEnabled(Context context) {
        if (context == null) {
            return 0;
        }
        return getAudioManager(context).isSpeakerphoneOn() ? 1 : 0;
    }

    public void monitorConnectionEvent(boolean z) {
        ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver;
        ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver2;
        if (!z) {
            try {
                Context context = this.mContext.get();
                if (context != null && (connectionChangeBroadcastReceiver = this.mConnectionBroadcastReceiver) != null) {
                    context.unregisterReceiver(connectionChangeBroadcastReceiver);
                }
            } catch (IllegalArgumentException unused) {
            }
            this.mConnectionBroadcastReceiver = null;
            return;
        }
        if (this.mConnectionBroadcastReceiver == null) {
            try {
                this.mConnectionBroadcastReceiver = new ConnectionChangeBroadcastReceiver(this);
                Context context2 = this.mContext.get();
                if (context2 == null || (connectionChangeBroadcastReceiver2 = this.mConnectionBroadcastReceiver) == null) {
                    return;
                }
                context2.registerReceiver(connectionChangeBroadcastReceiver2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e) {
                Logging.e(TAG, "Unable to create ConnectionChangeBroadcastReceiver, ", e);
            }
        }
    }

    public void monitorPowerChange(boolean z) {
        PowerConnectionReceiver powerConnectionReceiver;
        if (!z) {
            try {
                Context context = this.mContext.get();
                if (context != null && (powerConnectionReceiver = this.mPowerConnectionReceiver) != null) {
                    context.unregisterReceiver(powerConnectionReceiver);
                }
            } catch (IllegalArgumentException unused) {
            }
            this.mPowerConnectionReceiver = null;
            return;
        }
        if (this.mPowerConnectionReceiver == null) {
            try {
                this.mPowerConnectionReceiver = new PowerConnectionReceiver(this);
                Context context2 = this.mContext.get();
                if (context2 == null || this.mPowerConnectionReceiver == null) {
                    return;
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                context2.registerReceiver(this.mPowerConnectionReceiver, intentFilter);
            } catch (Exception e) {
                Logging.e(TAG, "Unable to create PowerConnectionReceiver, ", e);
            }
        }
    }

    public void notifyNetworkChange() {
        if (this.mContext.get() == null || !this.mAccessible) {
            return;
        }
        this.shouldGetIp = true;
        byte[] networkInfo = getNetworkInfo();
        if (networkInfo == null || !this.mAccessible) {
            return;
        }
        nativeNotifyNetworkChange(this.mBridgeHandle, networkInfo);
    }

    public void onPhoneStateChanged(boolean z, int i, int i2) {
        if (this.mBridgeHandle == 0 || !this.mAccessible) {
            return;
        }
        nativeAudioRoutingPhoneChanged(this.mBridgeHandle, z, i, i2);
    }

    public void onPowerChange(int i) {
        if (this.mContext.get() == null || !this.mAccessible) {
            return;
        }
        this.batteryPercentage = i;
    }

    public void updateLocalVideoEnableState(boolean z) {
        Logging.d(TAG, "updateLocalVideoEnableState: " + z);
        this.mLocalVideoEnabled = z;
    }

    public void updateVideoSourceType(int i) {
        Logging.d(TAG, "updateVideoSourceType: " + i);
        this.mVideoSourceType = i;
    }

    private void checkVoipPermissions(Context context) throws SecurityException {
        checkVoipPermissions(context, "android.permission.INTERNET");
        checkVoipPermissions(context, "android.permission.RECORD_AUDIO");
        checkVoipPermissions(context, "android.permission.MODIFY_AUDIO_SETTINGS");
        if (this.mVideoSourceType == 1 && this.mLocalVideoEnabled) {
            CameraUtils.checkCameraPermission(context);
        }
    }

    private int checkVoipPermissions(Context context, int i) {
        if (i == 1) {
            try {
                checkVoipPermissions(context);
                return 0;
            } catch (SecurityException e) {
                Logging.e(TAG, "Do not have enough permission! ", e);
                return -9;
            }
        }
        if (i != 2) {
            return -2;
        }
        try {
            checkVoipPermissions(context, "android.permission.INTERNET");
            return 0;
        } catch (SecurityException unused) {
            Logging.e(TAG, "Do not have Internet permission!");
            return -9;
        }
    }
}
