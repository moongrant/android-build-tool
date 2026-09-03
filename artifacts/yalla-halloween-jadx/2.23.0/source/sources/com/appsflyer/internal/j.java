package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    @VisibleForTesting
    public static Intent AFInAppEventParameterName;
    static final int AFInAppEventType = (int) TimeUnit.SECONDS.toMillis(2);
    static String[] AFKeystoreWrapper;
    static String[] AFLogger$LogLevel;

    @VisibleForTesting
    private static j getLevel;
    static volatile boolean values;
    public Map<String, String> AFVersionDeclaration;

    @Nullable
    public List<List<String>> AppsFlyer2dXConversionCallback = new ArrayList();
    public String init;
    public DeepLinkListener valueOf;

    public static j AFInAppEventParameterName() {
        if (getLevel == null) {
            getLevel = new j();
        }
        return getLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean valueOf(String str) {
        if (AFKeystoreWrapper == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o("Validate if link ", str, " belongs to ESP domains: ");
        sbOooO00o.append(Arrays.asList(AFKeystoreWrapper));
        AFLogger.AFKeystoreWrapper(sbOooO00o.toString());
        try {
            return Arrays.asList(AFKeystoreWrapper).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Nullable
    private Uri values(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    public final void AFKeystoreWrapper(Map<String, Object> map, au auVar, Intent intent, Context context) {
        DeepLinkResult.Error error;
        SharedPreferences sharedPreferencesAFInAppEventParameterName = ag.AFInAppEventParameterName(context);
        if (!AFKeystoreWrapper(intent, context, map) && this.valueOf != null) {
            ag.AFInAppEventType();
            if (ag.AFInAppEventType(sharedPreferencesAFInAppEventParameterName, "appsFlyerCount", false) == 0 && !sharedPreferencesAFInAppEventParameterName.getBoolean("ddl_sent", false)) {
                final ao aoVar = new ao(context, auVar);
                AFLogger.valueOf("[DDL] start");
                FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.ao.2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ DeepLinkResult call() throws Exception {
                        Application application = ao.this.values;
                        ao.AFInAppEventType(ao.this);
                        ao.this.AFInAppEventType(application);
                        return ao.AFInAppEventType(ao.this, application);
                    }
                });
                new Thread(futureTask).start();
                try {
                    aoVar.AFKeystoreWrapper((DeepLinkResult) futureTask.get(ao.onDeepLinkingNative, TimeUnit.MILLISECONDS));
                } catch (InterruptedException e) {
                    e = e;
                    AFLogger.AFInAppEventType("[DDL] Error occurred", e);
                    if (e.getCause() instanceof IOException) {
                        error = DeepLinkResult.Error.NETWORK;
                    } else {
                        error = DeepLinkResult.Error.UNEXPECTED;
                    }
                    aoVar.AFKeystoreWrapper(new DeepLinkResult(null, error));
                } catch (ExecutionException e2) {
                    e = e2;
                    AFLogger.AFInAppEventType("[DDL] Error occurred", e);
                    if (e.getCause() instanceof IOException) {
                        error = DeepLinkResult.Error.NETWORK;
                    } else {
                        error = DeepLinkResult.Error.UNEXPECTED;
                    }
                    aoVar.AFKeystoreWrapper(new DeepLinkResult(null, error));
                } catch (TimeoutException unused) {
                    StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
                    sb.append(aoVar.onAppOpenAttributionNative);
                    sb.append(" attempt(s) within ");
                    sb.append(ao.onDeepLinkingNative);
                    sb.append(" milliseconds");
                    AFLogger.valueOf(sb.toString());
                    aoVar.AFKeystoreWrapper(new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT));
                }
            }
        }
        sharedPreferencesAFInAppEventParameterName.edit().putBoolean("ddl_sent", true).apply();
    }

    @Nullable
    @VisibleForTesting
    public static Uri AFInAppEventType(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    private boolean AFKeystoreWrapper(Intent intent, Context context, Map<String, Object> map) {
        String string;
        Uri uriValues;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = AFInAppEventParameterName;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        Bundle extras = intent.getExtras();
        List<List<String>> list = this.AppsFlyer2dXConversionCallback;
        if (list != null && !list.isEmpty() && extras != null) {
            for (List<String> list2 : this.AppsFlyer2dXConversionCallback) {
                if (list2 == null) {
                    uriValues = null;
                } else {
                    Iterator<String> it = list2.iterator();
                    if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                        uriValues = values(string, it);
                    } else {
                        uriValues = null;
                    }
                }
                if (uriValues != null) {
                    StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                    sb.append(list2.toString());
                    AFLogger.valueOf(sb.toString());
                    ag.AFKeystoreWrapper(map).put("payloadKey", this.AppsFlyer2dXConversionCallback);
                    uri = uriValues;
                    break;
                }
            }
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                valueOf(context, map, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.AFInAppEventType(sb2.toString());
            return false;
        }
        if (data2 != null) {
            if (!AFInAppEventParameterName.hasExtra("af_consumed")) {
                AFInAppEventParameterName.putExtra("af_consumed", System.currentTimeMillis());
                valueOf(context, map, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.AFInAppEventType(sb3.toString());
            return false;
        }
        if (uri != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                valueOf(context, map, uri);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            sb4.append(uri.toString());
            sb4.append(" w/af_consumed");
            AFLogger.AFInAppEventType(sb4.toString());
            return false;
        }
        AFLogger.valueOf("No deep link detected");
        return false;
    }

    public final void valueOf(final Context context, final Map<String, Object> map, final Uri uri) {
        if (valueOf(uri.toString())) {
            values = true;
            if (l.AFInAppEventType == null) {
                l.AFInAppEventType = new l();
            }
            l lVar = l.AFInAppEventType;
            if (lVar.AFKeystoreWrapper == null) {
                lVar.AFKeystoreWrapper = Executors.newSingleThreadScheduledExecutor(lVar.valueOf);
            }
            lVar.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.j.3
                private static Map<String, Object> AFInAppEventParameterName(Uri uri2) {
                    HashMap map2 = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri2.toString());
                        AFLogger.valueOf(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri2.toString()).openConnection()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i = j.AFInAppEventType;
                        httpURLConnection.setReadTimeout(i);
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.4.3");
                        int responseCode = httpURLConnection.getResponseCode();
                        map2.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            map2.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.valueOf("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        map2.put("error", th.getLocalizedMessage());
                        AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                    }
                    return map2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String string = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num = null;
                    String str = null;
                    int i = 0;
                    while (i < 5) {
                        Map<String, Object> mapAFInAppEventParameterName = AFInAppEventParameterName(Uri.parse(string));
                        String str2 = (String) mapAFInAppEventParameterName.get("res");
                        Integer num2 = (Integer) mapAFInAppEventParameterName.get(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                        String str3 = (String) mapAFInAppEventParameterName.get("error");
                        if (str2 == null || !j.valueOf(str2)) {
                            str = str3;
                            string = str2;
                            num = num2;
                            break;
                        } else {
                            if (i < 4) {
                                arrayList.add(str2);
                            }
                            i++;
                            str = str3;
                            string = str2;
                            num = num2;
                        }
                    }
                    HashMap map2 = new HashMap();
                    map2.put("res", string != null ? string : "");
                    map2.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
                    if (str != null) {
                        map2.put("error", str);
                    }
                    if (!arrayList.isEmpty()) {
                        map2.put("redirects", arrayList);
                    }
                    map2.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    synchronized (map) {
                        map.put("af_deeplink_r", map2);
                        map.put("af_deeplink", uri.toString());
                    }
                    ag.AFInAppEventType().AFKeystoreWrapper(context, map, string != null ? Uri.parse(string) : uri);
                    j.values = false;
                }
            });
        } else {
            ag.AFInAppEventType().AFKeystoreWrapper(context, map, uri);
        }
        AFInAppEventParameterName = null;
    }
}
