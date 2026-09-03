package o000O000;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.umeng.analytics.pro.ak;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f28085OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f28086OooO0O0 = new Object();

    @RequiresApi(24)
    public static class OooO {
        @DoNotInline
        public static Context OooO00o(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @DoNotInline
        public static File OooO0O0(Context context) {
            return context.getDataDir();
        }

        @DoNotInline
        public static boolean OooO0OO(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: o000O000.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(16)
    public static class C0293OooO00o {
        @DoNotInline
        public static void OooO00o(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @DoNotInline
        public static void OooO0O0(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 {
        @DoNotInline
        public static File[] OooO00o(Context context) {
            return context.getExternalCacheDirs();
        }

        @DoNotInline
        public static File[] OooO0O0(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @DoNotInline
        public static File[] OooO0OO(Context context) {
            return context.getObbDirs();
        }
    }

    @RequiresApi(21)
    public static class OooO0OO {
        @DoNotInline
        public static File OooO00o(Context context) {
            return context.getCodeCacheDir();
        }

        @DoNotInline
        public static Drawable OooO0O0(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        public static File OooO0OO(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @RequiresApi(23)
    public static class OooO0o {
        @DoNotInline
        public static int OooO00o(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        public static <T> T OooO0O0(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        public static String OooO0OO(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi(26)
    public static class OooOO0 {
        @DoNotInline
        public static ComponentName OooO00o(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static final class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final HashMap<Class<?>, String> f28087OooO00o;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f28087OooO00o = map;
            if (Build.VERSION.SDK_INT >= 22) {
                map.put(SubscriptionManager.class, "telephony_subscription_service");
                map.put(UsageStatsManager.class, "usagestats");
            }
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, ZegoConstants.DeviceNameType.DeviceNameCamera);
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, "alarm");
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, ak.ac);
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @ColorInt
    public static int OooO0O0(@NonNull Context context, @ColorRes int i) {
        return Build.VERSION.SDK_INT >= 23 ? OooO0o.OooO00o(context, i) : context.getResources().getColor(i);
    }

    @Nullable
    public static <T> T OooO0OO(@NonNull Context context, @NonNull Class<T> cls) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return (T) OooO0o.OooO0O0(context, cls);
        }
        String strOooO0OO = i >= 23 ? OooO0o.OooO0OO(context, cls) : OooOO0O.f28087OooO00o.get(cls);
        if (strOooO0OO != null) {
            return (T) context.getSystemService(strOooO0OO);
        }
        return null;
    }
}
