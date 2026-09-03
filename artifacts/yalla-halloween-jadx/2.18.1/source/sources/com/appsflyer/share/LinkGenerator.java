package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.cp;
import com.appsflyer.internal.l;
import com.umeng.analytics.pro.ak;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    private final String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String onAppOpenAttributionNative;
    private final Map<String, String> onAttributionFailureNative = new HashMap();
    private final Map<String, String> onDeepLinkingNative = new HashMap();
    private String onInstallConversionDataLoadedNative;
    private String valueOf;
    private String values;

    public LinkGenerator(String str) {
        this.AFInAppEventParameterName = str;
    }

    private Map<String, String> AFInAppEventParameterName() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onDeepLinkingNative.clear();
        this.onDeepLinkingNative.put("pid", this.AFInAppEventParameterName);
        linkedHashMap.put("pid", valueOf(this.AFInAppEventParameterName, "media source"));
        String str = this.AppsFlyer2dXConversionCallback;
        if (str != null) {
            this.onDeepLinkingNative.put("af_referrer_uid", str);
            linkedHashMap.put("af_referrer_uid", valueOf(this.AppsFlyer2dXConversionCallback, "referrerUID"));
        }
        String str2 = this.valueOf;
        if (str2 != null) {
            this.onDeepLinkingNative.put(AFInAppEventParameterName.AF_CHANNEL, str2);
            linkedHashMap.put(AFInAppEventParameterName.AF_CHANNEL, valueOf(this.valueOf, "channel"));
        }
        String str3 = this.AFLogger$LogLevel;
        if (str3 != null) {
            this.onDeepLinkingNative.put("af_referrer_customer_id", str3);
            linkedHashMap.put("af_referrer_customer_id", valueOf(this.AFLogger$LogLevel, "referrerCustomerId"));
        }
        String str4 = this.values;
        if (str4 != null) {
            this.onDeepLinkingNative.put(ak.aF, str4);
            linkedHashMap.put(ak.aF, valueOf(this.values, "campaign"));
        }
        String str5 = this.init;
        if (str5 != null) {
            this.onDeepLinkingNative.put("af_referrer_name", str5);
            linkedHashMap.put("af_referrer_name", valueOf(this.init, "referrerName"));
        }
        String str6 = this.AFVersionDeclaration;
        if (str6 != null) {
            this.onDeepLinkingNative.put("af_referrer_image_url", str6);
            linkedHashMap.put("af_referrer_image_url", valueOf(this.AFVersionDeclaration, "referrerImageURL"));
        }
        if (this.onInstallConversionDataLoadedNative != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.onInstallConversionDataLoadedNative);
            String str7 = this.getLevel;
            if (str7 != null) {
                this.getLevel = str7.replaceFirst("^[/]", "");
                sb.append(this.onInstallConversionDataLoadedNative.endsWith("/") ? "" : "/");
                sb.append(this.getLevel);
            }
            String string = sb.toString();
            this.onDeepLinkingNative.put("af_dp", string);
            linkedHashMap.put("af_dp", valueOf(string, "deepLink"));
        }
        for (Map.Entry<String, String> entry : this.onAttributionFailureNative.entrySet()) {
            this.onDeepLinkingNative.put(entry.getKey(), entry.getValue());
            linkedHashMap.put(entry.getKey(), valueOf(entry.getValue(), entry.getKey()));
        }
        return linkedHashMap;
    }

    private static String valueOf(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return "";
        } catch (Throwable th) {
            AFLogger.values(th);
            return "";
        }
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAttributionFailureNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAttributionFailureNative.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventType;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(cp.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
        } else {
            sb.append(this.AFInAppEventType);
        }
        if (this.AFKeystoreWrapper != null) {
            sb.append('/');
            sb.append(this.AFKeystoreWrapper);
        }
        sb.append(valueOf(AFInAppEventParameterName()));
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.onAppOpenAttributionNative;
    }

    public String getCampaign() {
        return this.values;
    }

    public String getChannel() {
        return this.valueOf;
    }

    public String getMediaSource() {
        return this.AFInAppEventParameterName;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.onAttributionFailureNative);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onInstallConversionDataLoadedNative = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventType = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFInAppEventType = String.format("https://%s/%s", str2, str);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onAppOpenAttributionNative = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    private static String valueOf(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() == 0) {
                sb.append('?');
            } else {
                sb.append(Typography.amp);
            }
            sb.append(valueOf(entry.getKey(), entry.getKey()));
            sb.append('=');
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        AFInAppEventParameterName();
        String str = this.onAppOpenAttributionNative;
        Map<String, String> map = this.onDeepLinkingNative;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, ag.AFInAppEventType(), context);
        createOneLinkHttpTask.AFInAppEventType = responseListener;
        createOneLinkHttpTask.valueOf = str;
        if (l.AFInAppEventType == null) {
            l.AFInAppEventType = new l();
        }
        l.AFInAppEventType.valueOf().execute(createOneLinkHttpTask);
    }
}
