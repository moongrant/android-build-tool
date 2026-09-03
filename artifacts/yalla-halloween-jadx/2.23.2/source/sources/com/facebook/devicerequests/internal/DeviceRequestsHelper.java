package com.facebook.devicerequests.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o0OO000o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0003J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0017\u001a\u00020\u0004H\u0007J\u001e\u0010\u0017\u001a\u00020\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/devicerequests/internal/DeviceRequestsHelper;", "", "()V", "DEVICE_INFO_DEVICE", "", "DEVICE_INFO_MODEL", "DEVICE_INFO_PARAM", "DEVICE_TARGET_USER_ID", "SDK_FLAVOR", "SDK_HEADER", "SERVICE_TYPE", "TAG", "deviceRequestsListeners", "Ljava/util/HashMap;", "Landroid/net/nsd/NsdManager$RegistrationListener;", "Lkotlin/collections/HashMap;", "cleanUpAdvertisementService", "", "userCode", "cleanUpAdvertisementServiceImpl", "generateQRCode", "Landroid/graphics/Bitmap;", "url", "getDeviceInfo", "deviceInfo", "", "isAvailable", "", "startAdvertisementService", "startAdvertisementServiceImpl", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@AutoHandleExceptions
public final class DeviceRequestsHelper {

    @NotNull
    public static final String DEVICE_INFO_DEVICE = "device";

    @NotNull
    public static final String DEVICE_INFO_MODEL = "model";

    @NotNull
    public static final String DEVICE_INFO_PARAM = "device_info";

    @NotNull
    public static final String DEVICE_TARGET_USER_ID = "target_user_id";

    @NotNull
    public static final String SDK_FLAVOR = "android";

    @NotNull
    public static final String SDK_HEADER = "fbsdk";

    @NotNull
    public static final String SERVICE_TYPE = "_fb._tcp.";

    @NotNull
    public static final DeviceRequestsHelper INSTANCE = new DeviceRequestsHelper();

    @Nullable
    private static final String TAG = DeviceRequestsHelper.class.getCanonicalName();

    @NotNull
    private static final HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap<>();

    private DeviceRequestsHelper() {
    }

    @JvmStatic
    public static final void cleanUpAdvertisementService(@Nullable String userCode) {
        INSTANCE.cleanUpAdvertisementServiceImpl(userCode);
    }

    @TargetApi(16)
    private final void cleanUpAdvertisementServiceImpl(String userCode) {
        NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(userCode);
        if (registrationListener != null) {
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            try {
                ((NsdManager) systemService).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, e);
            }
            deviceRequestsListeners.remove(userCode);
        }
    }

    @JvmStatic
    @Nullable
    public static final Bitmap generateQRCode(@Nullable String url) {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, 2);
        try {
            OooO0O0 oooO0O0OooO00o = new o0O.OooO0O0().OooO00o(url, BarcodeFormat.QR_CODE, enumMap);
            int i = oooO0O0OooO00o.f42265OooO0o0;
            int i2 = oooO0O0OooO00o.f42263OooO0Oo;
            int[] iArr = new int[i * i2];
            if (i > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    int i5 = i3 * i2;
                    if (i2 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            iArr[i5 + i6] = oooO0O0OooO00o.OooO0O0(i6, i3) ? -16777216 : -1;
                            if (i7 >= i2) {
                                break;
                            }
                            i6 = i7;
                        }
                    }
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                return bitmapCreateBitmap;
            } catch (WriterException unused) {
                return bitmapCreateBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getDeviceInfo(@Nullable Map<String, String> deviceInfo) {
        if (deviceInfo == null) {
            deviceInfo = new HashMap<>();
        }
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        deviceInfo.put(DEVICE_INFO_DEVICE, DEVICE);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        deviceInfo.put(DEVICE_INFO_MODEL, MODEL);
        String string = new JSONObject(deviceInfo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    @JvmStatic
    public static final boolean isAvailable() {
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery != null && appSettingsWithoutQuery.getSmartLoginOptions().contains(SmartLoginOption.Enabled);
    }

    @JvmStatic
    public static final boolean startAdvertisementService(@Nullable String userCode) {
        if (isAvailable()) {
            return INSTANCE.startAdvertisementServiceImpl(userCode);
        }
        return false;
    }

    @TargetApi(16)
    private final boolean startAdvertisementServiceImpl(final String userCode) {
        HashMap<String, NsdManager.RegistrationListener> map = deviceRequestsListeners;
        if (map.containsKey(userCode)) {
            return true;
        }
        final String str = "fbsdk_" + Intrinsics.stringPlus("android-", StringsKt__StringsJVMKt.replace$default(FacebookSdk.getSdkVersion(), '.', '|', false, 4, (Object) null)) + '_' + ((Object) userCode);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType(SERVICE_TYPE);
        nsdServiceInfo.setServiceName(str);
        nsdServiceInfo.setPort(80);
        Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        }
        NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: com.facebook.devicerequests.internal.DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1
            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onRegistrationFailed(@NotNull NsdServiceInfo serviceInfo, int errorCode) {
                Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
                DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
                DeviceRequestsHelper.cleanUpAdvertisementService(userCode);
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onServiceRegistered(@NotNull NsdServiceInfo NsdServiceInfo) {
                Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
                if (Intrinsics.areEqual(str, NsdServiceInfo.getServiceName())) {
                    return;
                }
                DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
                DeviceRequestsHelper.cleanUpAdvertisementService(userCode);
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onServiceUnregistered(@NotNull NsdServiceInfo serviceInfo) {
                Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onUnregistrationFailed(@NotNull NsdServiceInfo serviceInfo, int errorCode) {
                Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            }
        };
        map.put(userCode, registrationListener);
        ((NsdManager) systemService).registerService(nsdServiceInfo, 1, registrationListener);
        return true;
    }

    @JvmStatic
    @NotNull
    public static final String getDeviceInfo() {
        return getDeviceInfo(null);
    }
}
