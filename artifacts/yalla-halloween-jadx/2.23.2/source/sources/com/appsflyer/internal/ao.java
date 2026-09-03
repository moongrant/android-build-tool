package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ao extends bv {
    private static String onConversionDataFail = "https://%sdlsdk.%s/v1.0/android/";
    public static long onDeepLinkingNative;
    private final JSONObject AppsFlyerConversionListener;
    public int onAppOpenAttributionNative;
    private boolean onAttributionFailure;
    private final List<cj> onConversionDataSuccess;
    private int onDeepLinking;
    private int onResponseError;
    private final au onResponseErrorNative;
    private final CountDownLatch onResponseNative;

    /* JADX INFO: renamed from: com.appsflyer.internal.ao$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[cj.e.values().length];
            values = iArr;
            try {
                iArr[cj.e.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[cj.e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ao(Context context, au auVar) {
        super(null, onConversionDataFail, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onConversionDataSuccess = new ArrayList();
        this.onResponseNative = new CountDownLatch(1);
        this.AppsFlyerConversionListener = new JSONObject();
        this.onResponseErrorNative = auVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(cj cjVar) {
        if (AFKeystoreWrapper(cjVar)) {
            this.onConversionDataSuccess.add(cjVar);
            this.onResponseNative.countDown();
            AFLogger.valueOf("[DDL] Added non-organic ".concat(cjVar.getClass().getSimpleName()));
        } else {
            int i = this.onDeepLinking + 1;
            this.onDeepLinking = i;
            if (i == this.onResponseError) {
                this.onResponseNative.countDown();
            }
        }
    }

    public final void AFKeystoreWrapper(DeepLinkResult deepLinkResult) {
        try {
            this.AppsFlyerConversionListener.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, deepLinkResult.getStatus().toString());
            this.AppsFlyerConversionListener.put("timeout_value", onDeepLinkingNative);
        } catch (JSONException unused) {
        }
        au auVar = this.onResponseErrorNative;
        auVar.AFInAppEventParameterName.edit().putString("ddl", this.AppsFlyerConversionListener.toString()).apply();
        aq.AFKeystoreWrapper(deepLinkResult);
    }

    private boolean AFInAppEventParameterName() {
        List list = (List) this.AFInAppEventParameterName.get("referrers");
        return (list != null ? list.size() : 0) < this.onResponseError && !this.AFInAppEventParameterName.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0122  */
    public void AFInAppEventType(Context context) {
        HashMap map;
        String[] strArr;
        this.onAppOpenAttributionNative++;
        StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onAppOpenAttributionNative);
        AFLogger.valueOf(sb.toString());
        if (this.onAppOpenAttributionNative == 1) {
            ag agVarAFInAppEventType = ag.AFInAppEventType();
            this.AFInAppEventParameterName.put("is_first", Boolean.valueOf(ag.valueOf(context)));
            Map<String, Object> map2 = this.AFInAppEventParameterName;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            map2.put("lang", sb2.toString());
            this.AFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventParameterName.put("type", Build.MODEL);
            this.AFInAppEventParameterName.put("request_id", agVarAFInAppEventType.getAppsFlyerUID(context));
            o oVar = agVarAFInAppEventType.onDeepLinkingNative;
            if (oVar != null && (strArr = oVar.AFInAppEventType) != null) {
                this.AFInAppEventParameterName.put("sharing_filter", strArr);
            }
            Map<String, Object> mapAFInAppEventType = AFInAppEventType(z.AFKeystoreWrapper(context, new HashMap()));
            Map<String, Object> mapAFInAppEventType2 = AFInAppEventType(z.AFInAppEventParameterName(context));
            if (mapAFInAppEventType != null) {
                this.AFInAppEventParameterName.put("gaid", mapAFInAppEventType);
            }
            if (mapAFInAppEventType2 != null) {
                this.AFInAppEventParameterName.put("oaid", mapAFInAppEventType2);
            }
        }
        Map<String, Object> map3 = this.AFInAppEventParameterName;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long jCurrentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map3.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        this.AFInAppEventParameterName.put("request_count", Integer.valueOf(this.onAppOpenAttributionNative));
        ArrayList arrayList = new ArrayList();
        for (cj cjVar : this.onConversionDataSuccess) {
            if (cjVar.AFKeystoreWrapper == cj.e.FINISHED) {
                map = new HashMap();
                String str = (String) cjVar.AFInAppEventParameterName.get("referrer");
                if (str != null) {
                    map.put("source", (String) cjVar.AFInAppEventParameterName.get("source"));
                    map.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
                } else {
                    map = null;
                }
            } else {
                map = null;
            }
            if (map != null) {
                arrayList.add(map);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventParameterName.put("referrers", arrayList);
        }
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        Uri.Builder builderAppendPath = Uri.parse(String.format(this.onInstallConversionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName())).buildUpon().appendPath(context.getPackageName());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.AFInAppEventParameterName.get("timestamp"));
        sb3.append(devKey);
        AFKeystoreWrapper(builderAppendPath.appendQueryParameter("af_sig", af.values(sb3.toString(), devKey)).appendQueryParameter("sdk_version", ag.values).build().toString());
    }

    private static boolean AFKeystoreWrapper(cj cjVar) {
        Long l = (Long) cjVar.AFInAppEventParameterName.get("click_ts");
        return l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    @Nullable
    private Map<String, Object> AFInAppEventType(final b.e.a aVar) {
        Boolean bool;
        boolean z = false;
        if (aVar != null && aVar.AFKeystoreWrapper != null && ((bool = aVar.valueOf) == null || !bool.booleanValue())) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.ao.1
                {
                    put("type", "unhashed");
                    put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.AFKeystoreWrapper);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ void AFInAppEventType(ao aoVar) {
        ArrayList<cj> arrayList = new ArrayList();
        for (cj cjVar : ag.AFInAppEventType().init) {
            if (cjVar != null && cjVar.AFKeystoreWrapper != cj.e.NOT_STARTED) {
                arrayList.add(cjVar);
            }
        }
        aoVar.onResponseError = arrayList.size();
        for (final cj cjVar2 : arrayList) {
            int i = AnonymousClass5.values[cjVar2.AFKeystoreWrapper.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(cjVar2.AFInAppEventParameterName.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.valueOf(sb.toString());
                aoVar.valueOf(cjVar2);
            } else if (i == 2) {
                cjVar2.addObserver(new Observer() { // from class: com.appsflyer.internal.ao.4
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb2 = new StringBuilder("[DDL] ");
                        sb2.append(cjVar2.AFInAppEventParameterName.get("source"));
                        sb2.append(" referrer collected via observer");
                        AFLogger.valueOf(sb2.toString());
                        ao.this.valueOf((cj) observable);
                    }
                });
            }
        }
    }

    public static /* synthetic */ DeepLinkResult AFInAppEventType(ao aoVar, Context context) throws JSONException, InterruptedException, IOException {
        DeepLink deepLinkAFKeystoreWrapper;
        while (true) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aoVar.onAppOpenAttributionNative == 1) {
                aoVar.AppsFlyerConversionListener.put("from_fg", jCurrentTimeMillis - aoVar.onResponseErrorNative.AFInAppEventParameterName.getLong("fg_ts", 0L));
            }
            HttpURLConnection httpURLConnectionAFInAppEventParameterName = new af(aoVar).AFInAppEventParameterName();
            JSONArray jSONArrayOptJSONArray = aoVar.AppsFlyerConversionListener.optJSONArray("net");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            jSONArrayOptJSONArray.put(aoVar.onAppOpenAttributionNative - 1, jCurrentTimeMillis2 - jCurrentTimeMillis);
            aoVar.AppsFlyerConversionListener.put("net", jSONArrayOptJSONArray);
            if (httpURLConnectionAFInAppEventParameterName.getResponseCode() == 200) {
                ag.AFInAppEventType();
                JSONObject jSONObject = new JSONObject(ag.AFInAppEventType(httpURLConnectionAFInAppEventParameterName));
                aoVar.onAttributionFailure = jSONObject.optBoolean("is_second_ping", true);
                if (jSONObject.optBoolean("found")) {
                    deepLinkAFKeystoreWrapper = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                    deepLinkAFKeystoreWrapper.AFInAppEventParameterName.put("is_deferred", true);
                } else {
                    deepLinkAFKeystoreWrapper = null;
                }
                if (deepLinkAFKeystoreWrapper != null) {
                    return new DeepLinkResult(deepLinkAFKeystoreWrapper, null);
                }
                if (aoVar.onAppOpenAttributionNative <= 1 && aoVar.AFInAppEventParameterName() && aoVar.onAttributionFailure) {
                    AFLogger.valueOf("[DDL] Waiting for referrers...");
                    aoVar.onResponseNative.await();
                    aoVar.AppsFlyerConversionListener.put("rfr_wait", System.currentTimeMillis() - jCurrentTimeMillis2);
                    if (aoVar.onDeepLinking == aoVar.onResponseError) {
                        return new DeepLinkResult(null, null);
                    }
                    aoVar.AFInAppEventType(context);
                } else {
                    return new DeepLinkResult(null, null);
                }
            } else {
                StringBuilder sb = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb.append(httpURLConnectionAFInAppEventParameterName.getResponseCode());
                AFLogger.valueOf(sb.toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
    }
}
