package com.common.support.atd.detectors;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.atd.utils.UtilsKt;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/common/support/atd/detectors/DeviceDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ports", "", "", "[Ljava/lang/Integer;", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "getLanguage", "", "getNetType", "getSensorNumber", "getTimeZone", "hasLightSensor", "", "hasSim", "isPortBusy", ReportItem.RequestKeyHost, ReportItem.RequestKeyPort, "isSupportCameraFlash", "isUsbCharging", "netType", "networkInfo", "Landroid/net/NetworkInfo;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceDetector extends AbstractDetector {

    @NotNull
    private final Context context;

    @NotNull
    private final Integer[] ports;

    public DeviceDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.ports = new Integer[]{80, 1234, 1314, 3389, 5037, 5555, 5556, 5557, 5585, 6666, 7555, 8000, 8700, 8888, 8600, 8659, 9090, 9999, 21503, 23946, 27042, 27043, 54001, 58544, 62001};
    }

    private final String getLanguage() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "{\n        LocaleList.getDefault().get(0)\n      }");
        } else {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "{\n        Locale.getDefault()\n      }");
        }
        return locale.getLanguage() + '-' + locale.getCountry();
    }

    private final String getNetType(Context context) {
        Object systemService = context.getSystemService("connectivity");
        return systemService instanceof ConnectivityManager ? netType(((ConnectivityManager) systemService).getActiveNetworkInfo()) : "NO";
    }

    private final int getSensorNumber(Context context) {
        Object systemService = context.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            return ((SensorManager) systemService).getSensorList(-1).size();
        }
        return -1;
    }

    private final String getTimeZone() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "timezone.id");
        return id;
    }

    private final boolean hasLightSensor(Context context) {
        Object systemService = context.getSystemService("sensor");
        return (systemService instanceof SensorManager) && ((SensorManager) systemService).getDefaultSensor(5) != null;
    }

    private final boolean hasSim(Context context, SecModel sailfishSecModel) {
        int simState;
        Object systemService = context.getSystemService("phone");
        return ((systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null) == null || (simState = ((TelephonyManager) systemService).getSimState()) == 0 || simState == 1) ? false : true;
    }

    private final boolean isPortBusy(String host, int port) {
        try {
            new Socket(InetAddress.getByName(host), port);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isPortBusy$default(DeviceDetector deviceDetector, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "127.0.0.1";
        }
        return deviceDetector.isPortBusy(str, i);
    }

    private final boolean isSupportCameraFlash(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    private final boolean isUsbCharging(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("plugged", -1) == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0042 A[RETURN, SYNTHETIC] */
    private final String netType(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return "NO";
        }
        if (networkInfo.getType() == 1) {
            return "WIFI";
        }
        if (networkInfo.getType() == 0) {
            switch (networkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return "3G";
                case 13:
                case 18:
                    return "4G";
                case 19:
                default:
                    String subtypeName = networkInfo.getSubtypeName();
                    if (StringsKt.OooOO0o(subtypeName, "TD-SCDMA") || StringsKt.OooOO0o(subtypeName, "WCDMA") || StringsKt.OooOO0o(subtypeName, "CDMA2000")) {
                        return "3G";
                    }
                    break;
                case 20:
                    return "5G";
            }
        }
        return "UNKNOWN";
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        Integer[] numArr = this.ports;
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArr) {
            if (isPortBusy$default(this, null, num.intValue(), 1, null)) {
                arrayList.add(num);
            }
        }
        sailfishSecModel.setAttachPort(arrayList);
        sailfishSecModel.setUsb(isUsbCharging(this.context));
        sailfishSecModel.setHasFlash(isSupportCameraFlash(this.context));
        sailfishSecModel.setSensor(getSensorNumber(this.context));
        sailfishSecModel.setLightSensor(hasLightSensor(this.context));
        sailfishSecModel.setNetworkType(getNetType(this.context));
        sailfishSecModel.setTimeZone(getTimeZone());
        sailfishSecModel.setLanguage(getLanguage());
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        sailfishSecModel.setDevice(DEVICE);
        sailfishSecModel.setHasSim(sailfishSecModel.getEmulator() ? false : hasSim(this.context, sailfishSecModel));
        resultForApi.setA3(sailfishSecModel.getAttachPort());
        resultForApi.setA8(sailfishSecModel.getSensor());
        resultForApi.setA15(UtilsKt.toInt(sailfishSecModel.getHasSim()));
        resultForApi.setA19(sailfishSecModel.getDevice());
        resultForApi.setA21("Android " + Build.VERSION.RELEASE + " | SDK " + Build.VERSION.SDK_INT);
    }
}
