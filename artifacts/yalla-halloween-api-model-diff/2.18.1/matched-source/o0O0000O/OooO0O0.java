package o0O0000O;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.LocaleList;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35037OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Integer[] f35038OooO0O0;

    public OooO0O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35037OooO00o = context;
        this.f35038OooO0O0 = new Integer[]{80, 1234, 1314, 3389, 5037, 5555, 5556, 5557, 5585, 6666, 7555, 8000, 8700, 8888, 8600, 8659, 9090, 9999, 21503, 23946, 27042, 27043, 54001, 58544, 62001};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) {
        String str;
        Locale locale;
        NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(model, "model");
        Integer[] numArr = this.f35038OooO0O0;
        ArrayList arrayList = new ArrayList();
        int length = numArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            Integer num = numArr[i];
            try {
                new Socket(InetAddress.getByName("127.0.0.1"), num.intValue());
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                arrayList.add(num);
            }
            i++;
        }
        model.f35028OooOO0o = arrayList;
        Intent intentRegisterReceiver = this.f35037OooO00o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        model.f35030OooOOO0 = intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("plugged", -1) == 2;
        model.f35027OooOO0O = this.f35037OooO00o.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        Object systemService = this.f35037OooO00o.getSystemService(ak.ac);
        model.f35026OooOO0 = systemService instanceof SensorManager ? ((SensorManager) systemService).getSensorList(-1).size() : -1;
        Object systemService2 = this.f35037OooO00o.getSystemService(ak.ac);
        model.f35029OooOOO = (systemService2 instanceof SensorManager) && ((SensorManager) systemService2).getDefaultSensor(5) != null;
        Object systemService3 = this.f35037OooO00o.getSystemService("connectivity");
        if (!(systemService3 instanceof ConnectivityManager) || (activeNetworkInfo = ((ConnectivityManager) systemService3).getActiveNetworkInfo()) == null) {
            str = "NO";
        } else if (activeNetworkInfo.getType() == 1) {
            str = "WIFI";
        } else if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    str = "2G";
                    break;
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
                    str = "3G";
                    break;
                case 13:
                case 18:
                    str = "4G";
                    break;
                case 19:
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (StringsKt.OooO(subtypeName, "TD-SCDMA") || StringsKt.OooO(subtypeName, "WCDMA") || StringsKt.OooO(subtypeName, "CDMA2000")) {
                        str = "3G";
                    } else {
                        str = "UNKNOWN";
                    }
                    break;
                case 20:
                    str = "5G";
                    break;
            }
        } else {
            str = "UNKNOWN";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "timezone.id");
        Intrinsics.checkNotNullParameter(id, "<set-?>");
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "{\n                Locale…lt().get(0)\n            }");
        } else {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "{\n                Locale…etDefault()\n            }");
        }
        Intrinsics.checkNotNullParameter(locale.getLanguage() + '-' + ((Object) locale.getCountry()), "<set-?>");
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        Intrinsics.checkNotNullParameter(DEVICE, "<set-?>");
    }
}
