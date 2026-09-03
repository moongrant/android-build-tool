package com.appsflyer.internal;

import android.app.Application;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.request.Request;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bu implements Runnable {

    @VisibleForTesting
    private static String valueOf = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> values = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final String AFInAppEventParameterName;
    public final ScheduledExecutorService AFInAppEventType;
    private final Application AFKeystoreWrapper;
    private final ag AFLogger$LogLevel;
    private final int AFVersionDeclaration;
    private final AtomicInteger AppsFlyer2dXConversionCallback;

    public bu(ag agVar, Application application, String str) {
        if (l.AFInAppEventType == null) {
            l.AFInAppEventType = new l();
        }
        this.AFInAppEventType = l.AFInAppEventType.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = agVar;
        this.AFKeystoreWrapper = application;
        this.AFInAppEventParameterName = str;
        this.AFVersionDeclaration = 0;
    }

    public static void AFInAppEventType(String str) {
        if (ag.valueOf != null) {
            AFLogger.valueOf("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            ag.valueOf.onConversionDataFail(str);
        }
    }

    public static void valueOf(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.valueOf(sb.toString());
        ag.valueOf.onConversionDataSuccess(map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strConcat;
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            AFLogger.valueOf("[GCD-E05] AppsFlyer dev key is missing");
            AFInAppEventType("AppsFlyer dev key is missing");
            return;
        }
        if (this.AFLogger$LogLevel.isStopped()) {
            AFLogger.valueOf("[GCD-E03] 'isStopTracking' enabled");
            AFInAppEventType("'isStopTracking' enabled");
            return;
        }
        this.AppsFlyer2dXConversionCallback.incrementAndGet();
        HttpURLConnection httpURLConnection = null;
        try {
            Application application = this.AFKeystoreWrapper;
            if (application == null) {
                AFLogger.valueOf("[GCD-E06] Context null");
                AFInAppEventType("Context null");
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                return;
            }
            ag agVar = this.AFLogger$LogLevel;
            String strValues = agVar.values(application, agVar.AFInAppEventType(application));
            if (strValues == null) {
                strConcat = "";
            } else if (values.contains(strValues.toLowerCase())) {
                AFLogger.AppsFlyer2dXConversionCallback(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", strValues));
                strConcat = "";
            } else {
                strConcat = "-".concat(strValues);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
            sb.append(this.AFKeystoreWrapper.getPackageName());
            sb.append(strConcat);
            sb.append("?devkey=");
            sb.append(this.AFInAppEventParameterName);
            sb.append("&device_id=");
            sb.append(al.AFInAppEventParameterName(new WeakReference(this.AFKeystoreWrapper)));
            String string = sb.toString();
            if (ak.AFInAppEventType == null) {
                ak.AFInAppEventType = new ak();
            }
            ak.AFInAppEventType.valueOf("server_request", string, "");
            am.AFInAppEventType("[GCD-B01] URL: ".concat(String.valueOf(string)));
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(string).openConnection();
            try {
                httpURLConnection2.setRequestMethod(Request.HttpMethodGet);
                httpURLConnection2.setConnectTimeout(ResponseInfo.UnknownError);
                httpURLConnection2.setRequestProperty("Connection", "close");
                httpURLConnection2.connect();
                int responseCode = httpURLConnection2.getResponseCode();
                String strAFInAppEventType = ag.AFInAppEventType(httpURLConnection2);
                if (ak.AFInAppEventType == null) {
                    ak.AFInAppEventType = new ak();
                }
                ak.AFInAppEventType.valueOf("server_response", string, String.valueOf(responseCode), strAFInAppEventType);
                if (responseCode == 200 || responseCode == 404) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("net", System.currentTimeMillis() - jCurrentTimeMillis);
                    jSONObject.put("retries", this.AFVersionDeclaration);
                    this.AFLogger$LogLevel.AppsFlyer2dXConversionCallback.AFInAppEventParameterName.edit().putString("gcd", jSONObject.toString()).apply();
                    am.AFInAppEventType("Attribution data: ".concat(String.valueOf(strAFInAppEventType)));
                    if (strAFInAppEventType.length() > 0) {
                        Map<String, Object> mapValues = bn.values(strAFInAppEventType);
                        Boolean bool = (Boolean) mapValues.get("iscache");
                        if (responseCode == 404) {
                            mapValues.remove("error_reason");
                            mapValues.remove(ReportItem.RequestKeyStatusCode);
                            mapValues.put("af_status", "Organic");
                            mapValues.put("af_message", "organic install");
                        }
                        if (bool != null && !bool.booleanValue()) {
                            this.AFLogger$LogLevel.AFInAppEventParameterName(this.AFKeystoreWrapper, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (mapValues.containsKey("af_siteid")) {
                            if (mapValues.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb2.append(mapValues.get(AFInAppEventParameterName.AF_CHANNEL));
                                AFLogger.valueOf(sb2.toString());
                            } else {
                                AFLogger.valueOf(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", mapValues.get("af_siteid")));
                            }
                        }
                        if (mapValues.containsKey("af_siteid")) {
                            StringBuilder sb3 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                            sb3.append(mapValues.get(AFInAppEventParameterName.AF_CHANNEL));
                            AFLogger.valueOf(sb3.toString());
                        }
                        mapValues.put("is_first_launch", Boolean.FALSE);
                        String string2 = new JSONObject(mapValues).toString();
                        if (string2 != null) {
                            ag.valueOf(this.AFKeystoreWrapper, "attributionId", string2);
                        } else {
                            ag.valueOf(this.AFKeystoreWrapper, "attributionId", strAFInAppEventType);
                        }
                        if (ag.valueOf != null && this.AppsFlyer2dXConversionCallback.intValue() <= 1) {
                            try {
                                Map<String, Object> mapValueOf = bn.valueOf(this.AFKeystoreWrapper);
                                if (!ag.AFInAppEventParameterName(this.AFKeystoreWrapper).getBoolean("sixtyDayConversionData", false)) {
                                    mapValueOf.put("is_first_launch", Boolean.TRUE);
                                }
                                mapValues = mapValueOf;
                            } catch (bo e) {
                                AFLogger.AFKeystoreWrapper("Exception while trying to fetch attribution data. ", e);
                            }
                            StringBuilder sb4 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
                            sb4.append(mapValues.toString());
                            AFLogger.valueOf(sb4.toString());
                            ag.valueOf.onConversionDataSuccess(mapValues);
                        }
                    }
                } else if ((responseCode == 403 || responseCode >= 500) && this.AFVersionDeclaration < 2) {
                    bu buVar = new bu(this);
                    ag.AFInAppEventType(buVar.AFInAppEventType, buVar, 10L, TimeUnit.MILLISECONDS);
                } else {
                    AFInAppEventType("Error connection to server: ".concat(String.valueOf(responseCode)));
                }
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                httpURLConnection2.disconnect();
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (this.AFVersionDeclaration < 2) {
                        bu buVar2 = new bu(this);
                        ag.AFInAppEventType(buVar2.AFInAppEventType, buVar2, 10L, TimeUnit.MILLISECONDS);
                    } else {
                        AFInAppEventType(th.getMessage());
                    }
                    AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                    this.AppsFlyer2dXConversionCallback.decrementAndGet();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    this.AppsFlyer2dXConversionCallback.decrementAndGet();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
            this.AFInAppEventType.shutdown();
            AFLogger.valueOf("[GCD-A03] Server retrieving attempt finished");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private bu(bu buVar) {
        if (l.AFInAppEventType == null) {
            l.AFInAppEventType = new l();
        }
        this.AFInAppEventType = l.AFInAppEventType.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = buVar.AFLogger$LogLevel;
        this.AFKeystoreWrapper = buVar.AFKeystoreWrapper;
        this.AFInAppEventParameterName = buVar.AFInAppEventParameterName;
        this.AFVersionDeclaration = buVar.AFVersionDeclaration + 1;
    }
}
