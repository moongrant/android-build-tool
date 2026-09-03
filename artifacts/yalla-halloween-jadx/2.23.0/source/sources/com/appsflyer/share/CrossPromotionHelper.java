package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.cp;
import com.appsflyer.internal.cq;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.qiniu.android.http.ResponseInfo;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    public static class a implements Runnable {
        private final cq AFInAppEventParameterName;
        private final boolean AFInAppEventType;
        private final String valueOf;
        private final WeakReference<Context> values;

        public a(String str, cq cqVar, Context context, boolean z) {
            this.valueOf = str;
            this.AFInAppEventParameterName = cqVar;
            this.values = new WeakReference<>(context);
            this.AFInAppEventType = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            if (this.AFInAppEventType) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.valueOf).openConnection()));
                try {
                    httpURLConnection.setConnectTimeout(ResponseInfo.UnknownError);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                        sb.append(this.valueOf);
                        AFLogger.AFInAppEventParameterName(sb.toString(), false);
                    } else if (responseCode == 301 || responseCode == 302) {
                        StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                        sb2.append(this.valueOf);
                        AFLogger.AFInAppEventParameterName(sb2.toString(), false);
                        if (this.AFInAppEventParameterName != null && this.values.get() != null) {
                            this.AFInAppEventParameterName.AFInAppEventType = httpURLConnection.getHeaderField("Location");
                            cq cqVar = this.AFInAppEventParameterName;
                            Context context = this.values.get();
                            if (cqVar.AFInAppEventType != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cqVar.AFInAppEventType)).setFlags(SQLiteDatabase.CREATE_IF_NECESSARY));
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("call to ");
                        sb3.append(this.valueOf);
                        sb3.append(" failed: ");
                        sb3.append(responseCode);
                        AFLogger.AFInAppEventType(sb3.toString());
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AFLogger.AFInAppEventType(th.getMessage(), th);
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }

    @NonNull
    private static LinkGenerator AFInAppEventType(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventType = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public static void setUrl(Map<String, String> map) {
        byte b;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 120623625 && key.equals("impression")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (key.equals("app")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                cp.AFKeystoreWrapper = value;
            } else if (b == 1) {
                AFInAppEventType = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorAFInAppEventType = AFInAppEventType(context, str, str2, map, String.format(cp.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new a(linkGeneratorAFInAppEventType.generateLink(), new cq(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new a(AFInAppEventType(context, str, str2, map, String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName())).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }
}
