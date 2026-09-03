package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.google.firebase.remoteconfig.RemoteConfigConstants$ResponseFieldKey;
import com.qiniu.android.common.Constants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051o00000o0.OooOOO0;
import p318o0O0oOoo.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Pattern f20046OooO0oo = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f20047OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20048OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f20049OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f20050OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f20051OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f20052OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f20053OooO0oO;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f20047OooO00o = context;
        this.f20048OooO0O0 = str;
        this.f20049OooO0OO = str2;
        Matcher matcher = f20046OooO0oo.matcher(str);
        this.f20050OooO0Oo = matcher.matches() ? matcher.group(1) : null;
        this.f20052OooO0o0 = str3;
        this.f20051OooO0o = j;
        this.f20053OooO0oO = j2;
    }

    public static JSONObject OooO0OO(URLConnection uRLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), Constants.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void OooO0Oo(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject OooO00o(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map2.put(RemoteConfigConstants$RequestFieldKey.INSTANCE_ID, str);
        map2.put(RemoteConfigConstants$RequestFieldKey.INSTANCE_ID_TOKEN, str2);
        map2.put(RemoteConfigConstants$RequestFieldKey.APP_ID, this.f20048OooO0O0);
        Context context = this.f20047OooO00o;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put(RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map2.put(RemoteConfigConstants$RequestFieldKey.LANGUAGE_CODE, locale.toLanguageTag());
        map2.put(RemoteConfigConstants$RequestFieldKey.PLATFORM_VERSION, Integer.toString(i));
        map2.put(RemoteConfigConstants$RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put(RemoteConfigConstants$RequestFieldKey.APP_VERSION, packageInfo.versionName);
                map2.put(RemoteConfigConstants$RequestFieldKey.APP_BUILD, Long.toString(i >= 28 ? OooOOO0.OooO0O0(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, context.getPackageName());
        map2.put(RemoteConfigConstants$RequestFieldKey.SDK_VERSION, "21.4.0");
        map2.put(RemoteConfigConstants$RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
        if (l != null) {
            long jLongValue = l.longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map2.put(RemoteConfigConstants$RequestFieldKey.FIRST_OPEN_TIME, simpleDateFormat.format(Long.valueOf(jLongValue)));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection OooO0O0() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f20050OooO0Oo, this.f20052OooO0o0)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    @Keep
    public ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws FirebaseRemoteConfigException {
        String strBytesToStringUppercase;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        boolean z;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f20051OooO0o));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f20053OooO0oO));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f20049OooO0OO);
        Context context = this.f20047OooO00o;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                OooO0Oo(httpURLConnection, OooO00o(str, str2, map, l).toString().getBytes(Constants.UTF_8));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectOooO0OO = OooO0OO(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                try {
                    Date date2 = o00O0.f41971OooO0oO;
                    JSONObject jSONObject3 = new JSONObject();
                    Date date3 = o00O0.f41971OooO0oO;
                    JSONArray jSONArray2 = new JSONArray();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject = jSONObjectOooO0OO.getJSONObject(RemoteConfigConstants$ResponseFieldKey.ENTRIES);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            jSONObject3 = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused3) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectOooO0OO.getJSONArray(RemoteConfigConstants$ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
                    } catch (JSONException unused4) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            jSONArray2 = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused5) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectOooO0OO.getJSONObject(RemoteConfigConstants$ResponseFieldKey.PERSONALIZATION_METADATA);
                    } catch (JSONException unused6) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            jSONObject4 = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused7) {
                        }
                    }
                    String string = jSONObjectOooO0OO.has(RemoteConfigConstants$ResponseFieldKey.TEMPLATE_VERSION_NUMBER) ? jSONObjectOooO0OO.getString(RemoteConfigConstants$ResponseFieldKey.TEMPLATE_VERSION_NUMBER) : null;
                    o00O0 o00o1 = new o00O0(jSONObject3, date, jSONArray2, jSONObject4, string != null ? Long.parseLong(string) : 0L);
                    try {
                        z = !jSONObjectOooO0OO.get("state").equals("NO_CHANGE");
                    } catch (JSONException unused8) {
                        z = true;
                    }
                    return !z ? new ConfigFetchHandler.FetchResponse(1, o00o1, null) : new ConfigFetchHandler.FetchResponse(0, o00o1, headerField);
                } catch (JSONException e2) {
                    throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
                }
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused9) {
                }
                throw th;
            }
        } catch (IOException | JSONException e3) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e3);
        }
    }
}
