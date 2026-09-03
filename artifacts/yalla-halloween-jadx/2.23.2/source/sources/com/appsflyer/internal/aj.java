package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.youth.banner.config.BannerConfig;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aj implements Runnable {
    protected static String AFKeystoreWrapper = null;
    private static long AppsFlyer2dXConversionCallback = 0;
    private static char[] getLevel = null;
    private static int onAppOpenAttributionNative = 1;
    private static int onInstallConversionDataLoadedNative;
    private static String valueOf;
    public final String AFInAppEventParameterName;
    private final ag AFInAppEventType;
    private final Context AFLogger$LogLevel;
    public final String AFVersionDeclaration = UUID.randomUUID().toString();
    public final Map<String, Object> init = AFKeystoreWrapper();
    public String values;

    static {
        AFInAppEventType();
        valueOf = "v2";
        StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(valueOf);
        AFKeystoreWrapper = sb.toString();
        int i = onInstallConversionDataLoadedNative + 39;
        onAppOpenAttributionNative = i % 128;
        int i2 = i % 2;
    }

    public aj(ag agVar, Context context, String str) {
        this.AFInAppEventType = agVar;
        this.AFLogger$LogLevel = context;
        this.AFInAppEventParameterName = str;
    }

    public static void AFInAppEventType() {
        getLevel = new char[]{'A', 2614, 5261, 7843, 10537, 13303, 15758, 18513, 21236, 23717, 26450, 28949};
        AppsFlyer2dXConversionCallback = -6360653961166648752L;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        HashMap map = new HashMap();
        map.put("build_number", "6.4.3");
        map.put("counter", Integer.valueOf(ag.AFInAppEventType(ag.AFInAppEventParameterName(this.AFLogger$LogLevel), "appsFlyerCount", false)));
        map.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        map.put("brand", Build.BRAND);
        map.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        try {
            map.put("app_version_name", this.AFLogger$LogLevel.getPackageManager().getPackageInfo(this.AFLogger$LogLevel.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map.put("app_id", this.AFLogger$LogLevel.getPackageName());
        map.put("platformextension", new an().AFInAppEventParameterName());
        int i = onInstallConversionDataLoadedNative + 125;
        onAppOpenAttributionNative = i % 128;
        if ((i % 2 == 0 ? '0' : 'O') != '0') {
            return map;
        }
        throw null;
    }

    private static String values(int i, char c, int i2) {
        int i3 = onAppOpenAttributionNative + 89;
        onInstallConversionDataLoadedNative = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                return new String(cArr);
            }
            cArr[i5] = (char) ((((long) getLevel[i + i5]) ^ (((long) i5) * AppsFlyer2dXConversionCallback)) ^ ((long) c));
            i5++;
            int i6 = onAppOpenAttributionNative + 7;
            onInstallConversionDataLoadedNative = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        String strAFInAppEventType;
        Throwable th;
        String string = "";
        String strValueOf = valueOf();
        AFLogger.AFKeystoreWrapper("oneLinkUrl: ".concat(String.valueOf(strValueOf)));
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strValueOf).openConnection()));
            httpsURLConnection.setRequestProperty("content-type", "application/json");
            httpsURLConnection.setReadTimeout(BannerConfig.LOOP_TIME);
            httpsURLConnection.setConnectTimeout(BannerConfig.LOOP_TIME);
            httpsURLConnection.setRequestMethod(this.AFInAppEventParameterName);
            valueOf(httpsURLConnection);
            int responseCode = httpsURLConnection.getResponseCode();
            strAFInAppEventType = ag.AFInAppEventType(httpsURLConnection);
            try {
                if (!(responseCode == 200)) {
                    StringBuilder sb = new StringBuilder("Response code = ");
                    sb.append(responseCode);
                    sb.append(" content = ");
                    sb.append(strAFInAppEventType);
                    string = sb.toString();
                    int i = onAppOpenAttributionNative + 21;
                    onInstallConversionDataLoadedNative = i % 128;
                    strValueOf = i % 2;
                } else {
                    AFLogger.AFInAppEventType("Status 200 ok");
                    strValueOf = strValueOf;
                }
            } catch (Throwable th2) {
                th = th2;
                AFLogger.AFKeystoreWrapper("Error while calling ".concat(String.valueOf(strValueOf)), th);
                StringBuilder sb2 = new StringBuilder("Error while calling ");
                sb2.append(strValueOf);
                sb2.append(" stacktrace: ");
                sb2.append(th.toString());
                string = sb2.toString();
            }
        } catch (Throwable th3) {
            strAFInAppEventType = "";
            th = th3;
        }
        if ((TextUtils.isEmpty(string) ? '`' : '0') != '`') {
            AFLogger.AppsFlyer2dXConversionCallback("Connection error: ".concat(String.valueOf(string)));
            values();
            return;
        }
        int i2 = onAppOpenAttributionNative + 55;
        onInstallConversionDataLoadedNative = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.AFInAppEventType("Connection call succeeded: ".concat(String.valueOf(strAFInAppEventType)));
        values(strAFInAppEventType);
    }

    public abstract String valueOf();

    public abstract void valueOf(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    public abstract void values();

    public abstract void values(String str);

    public final void AFInAppEventType(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, valueOf);
        String strJoin = TextUtils.join("\u2063", arrayList.toArray());
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getDevKey());
        sb.append(this.AFVersionDeclaration);
        sb.append(valueOf);
        httpsURLConnection.setRequestProperty(values(ViewConfiguration.getJumpTapTimeout() >> 16, (char) ExpandableListView.getPackedPositionType(0L), 12 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), af.values(strJoin, sb.toString()));
        int i = onAppOpenAttributionNative + 71;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
    }
}
