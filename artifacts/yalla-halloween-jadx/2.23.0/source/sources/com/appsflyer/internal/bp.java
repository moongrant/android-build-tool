package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class bp extends bv {

    @VisibleForTesting
    private static String onDeepLinkingNative;
    private final SharedPreferences onAppOpenAttributionNative;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(ag.AFKeystoreWrapper);
        onDeepLinkingNative = sb.toString();
    }

    public bp(@NonNull Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(onDeepLinkingNative, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
        sb.append(context.getPackageName());
        super(null, sb.toString(), null, null, null, context);
        this.onAppOpenAttributionNative = ag.AFInAppEventParameterName(context);
    }

    public static boolean AFInAppEventType(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return aa.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    private void AFKeystoreWrapper(ac acVar) {
        this.onAppOpenAttributionNative.edit().putString("afUninstallToken", acVar.AFInAppEventType).putLong("afUninstallToken_received_time", acVar.values).putBoolean("afUninstallToken_queued", acVar.AFInAppEventType()).apply();
    }

    public static boolean values(@NonNull SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    @Nullable
    public ac AFInAppEventParameterName() {
        String string;
        String string2;
        String string3 = this.onAppOpenAttributionNative.getString("afUninstallToken", null);
        long j = this.onAppOpenAttributionNative.getLong("afUninstallToken_received_time", 0L);
        boolean z = this.onAppOpenAttributionNative.getBoolean("afUninstallToken_queued", false);
        this.onAppOpenAttributionNative.edit().putBoolean("afUninstallToken_queued", false).apply();
        if (string3 == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            string3 = strArrSplit[strArrSplit.length - 1];
        }
        if (j == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    j = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (string3 != null) {
            return new ac(string3, j, z);
        }
        return null;
    }

    public void valueOf(String str) {
        Application application = this.values;
        final ag agVarAFInAppEventType = ag.AFInAppEventType();
        if (agVarAFInAppEventType.AFKeystoreWrapper()) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (devKey == null) {
            AFLogger.AppsFlyer2dXConversionCallback("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.AFInAppEventParameterName.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.AFInAppEventParameterName.put("app_version_name", packageInfo.versionName);
            this.AFInAppEventParameterName.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            this.AFInAppEventParameterName.put("installDate", ag.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), j));
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Exception while collecting application version info.", th);
        }
        ag.AFKeystoreWrapper(application, (Map<String, ? super String>) this.AFInAppEventParameterName);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            this.AFInAppEventParameterName.put("appUserId", string);
        }
        try {
            this.AFInAppEventParameterName.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            this.AFInAppEventParameterName.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.AFKeystoreWrapper("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            this.AFInAppEventParameterName.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        b.e.a aVarAFKeystoreWrapper = z.AFKeystoreWrapper(application.getContentResolver());
        if (aVarAFKeystoreWrapper != null) {
            this.AFInAppEventParameterName.put("amazon_aid", aVarAFKeystoreWrapper.AFKeystoreWrapper);
            this.AFInAppEventParameterName.put("amazon_aid_limit", String.valueOf(aVarAFKeystoreWrapper.valueOf));
        }
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            this.AFInAppEventParameterName.put("advertiserId", string2);
        }
        this.AFInAppEventParameterName.put("devkey", devKey);
        this.AFInAppEventParameterName.put("uid", al.AFInAppEventParameterName(new WeakReference(application)));
        this.AFInAppEventParameterName.put("af_gcm_token", str);
        this.AFInAppEventParameterName.put("launch_counter", Integer.toString(ag.AFInAppEventType(this.onAppOpenAttributionNative, "appsFlyerCount", false)));
        this.AFInAppEventParameterName.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        String strAFInAppEventType = agVarAFInAppEventType.AFInAppEventType(application);
        if (strAFInAppEventType != null) {
            this.AFInAppEventParameterName.put(AppsFlyerProperties.CHANNEL, strAFInAppEventType);
        }
        new Thread(new Runnable() { // from class: com.appsflyer.internal.bp.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    bp bpVar = bp.this;
                    bpVar.onAppOpenAttribution = agVarAFInAppEventType.isStopped();
                    HttpURLConnection httpURLConnectionAFInAppEventParameterName = new af(bpVar).AFInAppEventParameterName();
                    if (httpURLConnectionAFInAppEventParameterName != null) {
                        if (httpURLConnectionAFInAppEventParameterName.getResponseCode() == 200) {
                            bp.AFInAppEventParameterName(bp.this);
                        }
                        httpURLConnectionAFInAppEventParameterName.disconnect();
                    }
                } catch (Throwable th3) {
                    AFLogger.AFKeystoreWrapper(th3.getMessage(), th3);
                }
            }
        }).start();
    }

    public final void AFInAppEventType(String str) {
        if (str != null) {
            AFLogger.AFInAppEventType("Firebase Refreshed Token = ".concat(str));
            ac acVarAFInAppEventParameterName = AFInAppEventParameterName();
            if (acVarAFInAppEventParameterName == null || !str.equals(acVarAFInAppEventParameterName.AFInAppEventType)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z = ag.valueOf(this.onAppOpenAttributionNative) && (acVarAFInAppEventParameterName == null || jCurrentTimeMillis - acVarAFInAppEventParameterName.values > TimeUnit.SECONDS.toMillis(2L));
                AFKeystoreWrapper(new ac(str, jCurrentTimeMillis, !z));
                if (z) {
                    valueOf(str);
                }
            }
        }
    }

    public static /* synthetic */ void AFInAppEventParameterName(bp bpVar) {
        bpVar.onAppOpenAttributionNative.edit().putBoolean("sentRegisterRequestToAF", true).apply();
        AFLogger.valueOf("Successfully registered for Uninstall Tracking");
    }
}
