package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ak {
    public static ak AFInAppEventType;
    private Map<String, Object> AFKeystoreWrapper;
    private List<String> values = new ArrayList();
    private boolean valueOf = true;
    private String AppsFlyer2dXConversionCallback = "-1";
    public boolean AFInAppEventParameterName = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getLevel = 0;
    private boolean init = false;

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFKeystoreWrapper.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFKeystoreWrapper.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFKeystoreWrapper.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.AFKeystoreWrapper.put("preInstall", str4);
        }
    }

    private boolean getLevel() {
        if (this.AFInAppEventParameterName) {
            return this.valueOf || this.init;
        }
        return false;
    }

    private synchronized void init() {
        this.values = new ArrayList();
        this.getLevel = 0;
    }

    public final synchronized Map<String, Object> AFInAppEventParameterName() {
        this.AFKeystoreWrapper.put("data", this.values);
        init();
        return this.AFKeystoreWrapper;
    }

    public final synchronized void AFKeystoreWrapper(String str) {
        this.AppsFlyer2dXConversionCallback = str;
    }

    public final boolean AFLogger$LogLevel() {
        return this.init;
    }

    public final synchronized void valueOf() {
        valueOf("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.init = false;
        this.valueOf = false;
    }

    public final synchronized void values() {
        this.AFKeystoreWrapper = null;
        AFInAppEventType = null;
    }

    public final synchronized void AFKeystoreWrapper() {
        this.init = true;
        valueOf("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    private synchronized void values(String str, String str2, String str3) {
        try {
            this.AFKeystoreWrapper.put("brand", Build.BRAND);
            this.AFKeystoreWrapper.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            this.AFKeystoreWrapper.put("platform", "Android");
            this.AFKeystoreWrapper.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                this.AFKeystoreWrapper.put("advertiserId", str);
            }
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("imei", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFKeystoreWrapper.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            this.AFKeystoreWrapper.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFKeystoreWrapper.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.AFKeystoreWrapper.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    public static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            strArr[i] = stackTraceElementArr[i].toString();
        }
        return strArr;
    }

    public final synchronized void AFInAppEventType() {
        this.valueOf = false;
        init();
    }

    public final synchronized void valueOf(String str, String str2, String... strArr) {
        String string;
        if (!getLevel() || this.getLevel >= 98304) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strJoin = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb.append(Thread.currentThread().getId());
                sb.append(" _/AppsFlyer_6.4.3 [");
                sb.append(str);
                sb.append("] ");
                sb.append(str2);
                sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb.append(strJoin);
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jCurrentTimeMillis);
                sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb2.append(Thread.currentThread().getId());
                sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb2.append(str2);
                sb2.append("/AppsFlyer_6.4.3 ");
                sb2.append(strJoin);
                string = sb2.toString();
            }
            this.values.add(string);
            this.getLevel += string.length() << 1;
        } catch (Throwable unused) {
        }
    }

    public final synchronized void values(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        if (string != null) {
            try {
                this.AFKeystoreWrapper = n.AFInAppEventParameterName(new JSONObject(string));
            } catch (Throwable unused) {
            }
        } else {
            this.AFKeystoreWrapper = new HashMap();
            ag agVarAFInAppEventType = ag.AFInAppEventType();
            values(appsFlyerProperties.getString("advertiserId"), agVarAFInAppEventType.getLevel, agVarAFInAppEventType.AFLogger$LogLevel);
            StringBuilder sb = new StringBuilder("6.4.3.");
            sb.append(ag.AFInAppEventType);
            valueOf(sb.toString(), appsFlyerProperties.getDevKey(), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i = packageManager.getPackageInfo(str, 0).versionCode;
                AFInAppEventType(str, String.valueOf(i), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFKeystoreWrapper).toString());
        }
        this.AFKeystoreWrapper.put("launch_counter", this.AppsFlyer2dXConversionCallback);
    }
}
