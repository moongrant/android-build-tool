package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.qiniu.android.collect.ReportItem;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements Runnable {
    private static String AFInAppEventType = null;
    private static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    private WeakReference<Context> AFInAppEventParameterName;
    private String AFLogger$LogLevel;
    private Map<String, String> AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String valueOf;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(ag.values);
        sb.append("/androidevent?buildnumber=6.4.3&app_id=");
        AFInAppEventType = sb.toString();
    }

    public ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFInAppEventParameterName = new WeakReference<>(context);
        this.values = str;
        this.valueOf = str2;
        this.AFLogger$LogLevel = str4;
        this.AppsFlyer2dXConversionCallback = str5;
        this.getLevel = str6;
        this.AFVersionDeclaration = map;
        this.init = str3;
    }

    private static HttpURLConnection AFInAppEventType(@NonNull by byVar) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(byVar.onInstallConversionFailureNative);
        AFLogger.valueOf(sb.toString());
        byVar.onAppOpenAttribution = AppsFlyerLib.getInstance().isStopped();
        return new af(byVar).AFInAppEventParameterName();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.values;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            Context context = this.AFInAppEventParameterName.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.valueOf);
            map.put("sig-data", this.AFLogger$LogLevel);
            map.put("signature", this.init);
            final HashMap map2 = new HashMap(map);
            new Thread(new Runnable() { // from class: com.appsflyer.internal.ad.1
                @Override // java.lang.Runnable
                public final void run() {
                    ad adVar = ad.this;
                    ad.valueOf(adVar, map2, adVar.AFVersionDeclaration, ad.this.AFInAppEventParameterName);
                }
            }).start();
            map.put("dev_key", this.values);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                map.put("advertiserId", string);
            }
            String string2 = new JSONObject(map).toString();
            String str2 = String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName());
            if (ak.AFInAppEventType == null) {
                ak.AFInAppEventType = new ak();
            }
            ak.AFInAppEventType.valueOf("server_request", str2, string2);
            HttpURLConnection httpURLConnectionAFInAppEventType = AFInAppEventType((by) new ce().AFInAppEventType(map).AFKeystoreWrapper(str2));
            int responseCode = httpURLConnectionAFInAppEventType != null ? httpURLConnectionAFInAppEventType.getResponseCode() : -1;
            ag.AFInAppEventType();
            String strAFInAppEventType = ag.AFInAppEventType(httpURLConnectionAFInAppEventType);
            if (ak.AFInAppEventType == null) {
                ak.AFInAppEventType = new ak();
            }
            ak.AFInAppEventType.valueOf("server_response", str2, String.valueOf(responseCode), strAFInAppEventType);
            JSONObject jSONObject = new JSONObject(strAFInAppEventType);
            jSONObject.put("code", responseCode);
            if (responseCode == 200) {
                StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                sb.append(jSONObject.toString());
                AFLogger.AFInAppEventType(sb.toString());
                valueOf(jSONObject.optBoolean(ReportItem.QualityKeyResult), this.AFLogger$LogLevel, this.AppsFlyer2dXConversionCallback, this.getLevel, jSONObject.toString());
            } else {
                AFLogger.AFInAppEventType("Failed Validate request");
                valueOf(false, this.AFLogger$LogLevel, this.AppsFlyer2dXConversionCallback, this.getLevel, jSONObject.toString());
            }
            if (httpURLConnectionAFInAppEventType != null) {
                httpURLConnectionAFInAppEventType.disconnect();
            }
        } catch (Throwable th) {
            try {
                if (ag.AFInAppEventParameterName != null) {
                    AFLogger.AFKeystoreWrapper("Failed Validate request + ex", th);
                    valueOf(false, this.AFLogger$LogLevel, this.AppsFlyer2dXConversionCallback, this.getLevel, th.getMessage());
                }
                AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    private static void valueOf(boolean z, String str, String str2, String str3, String str4) {
        if (ag.AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(str2);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(str3);
            AFLogger.valueOf(sb.toString());
            if (z) {
                AFLogger.valueOf("Validate in app purchase success: ".concat(String.valueOf(str4)));
                ag.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.valueOf("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = ag.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public static /* synthetic */ void valueOf(ad adVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            ab.AFKeystoreWrapper((Context) weakReference.get()).valueOf();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
            sb.append(((Context) weakReference.get()).getPackageName());
            String string = sb.toString();
            String string2 = ag.AFInAppEventParameterName((Context) weakReference.get()).getString("referrer", "");
            f cfVar = new cf((Context) weakReference.get());
            cfVar.init = adVar.values;
            cfVar.AFVersionDeclaration = string2;
            ag agVarAFInAppEventType = ag.AFInAppEventType();
            Map<String, Object> mapValues = agVarAFInAppEventType.values(cfVar);
            mapValues.put("price", adVar.AppsFlyer2dXConversionCallback);
            mapValues.put("currency", adVar.getLevel);
            mapValues.put("receipt_data", map);
            if (map2 != null) {
                mapValues.put("extra_prms", map2);
            }
            mapValues.putAll(agVarAFInAppEventType.AFInAppEventParameterName());
            String string3 = new JSONObject(mapValues).toString();
            if (ak.AFInAppEventType == null) {
                ak.AFInAppEventType = new ak();
            }
            ak.AFInAppEventType.valueOf("server_request", string, string3);
            HttpURLConnection httpURLConnectionAFInAppEventType = null;
            try {
                httpURLConnectionAFInAppEventType = AFInAppEventType((by) cfVar.AFInAppEventType(mapValues).AFKeystoreWrapper(string));
                int responseCode = httpURLConnectionAFInAppEventType != null ? httpURLConnectionAFInAppEventType.getResponseCode() : -1;
                String strAFInAppEventType = ag.AFInAppEventType(httpURLConnectionAFInAppEventType);
                if (ak.AFInAppEventType == null) {
                    ak.AFInAppEventType = new ak();
                }
                ak.AFInAppEventType.valueOf("server_response", string, String.valueOf(responseCode), strAFInAppEventType);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(responseCode);
                sb2.append(": ");
                sb2.append(new JSONObject(strAFInAppEventType).toString());
                AFLogger.AFInAppEventType(sb2.toString());
                if (httpURLConnectionAFInAppEventType != null) {
                    httpURLConnectionAFInAppEventType.disconnect();
                }
            } catch (Throwable th) {
                try {
                    AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                } finally {
                    if (httpURLConnectionAFInAppEventType != null) {
                        httpURLConnectionAFInAppEventType.disconnect();
                    }
                }
            }
        }
    }
}
