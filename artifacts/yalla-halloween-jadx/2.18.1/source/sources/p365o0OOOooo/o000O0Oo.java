package p365o0OOOooo;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import android.util.Log;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.request.Request;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38579OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, String> f38580OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f38581OooO0OO = new HashMap();

    public o000O0Oo(String str, Map<String, String> map) {
        this.f38579OooO00o = str;
        this.f38580OooO0O0 = map;
    }

    public final String OooO00o(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? next.getValue() : "");
        sb.append(sb2.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("&");
            sbOooO0o0.append(next2.getKey());
            sbOooO0o0.append("=");
            sbOooO0o0.append(next2.getValue() != null ? next2.getValue() : "");
            sb.append(sbOooO0o0.toString());
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return OooO0OO.OooO00o(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = OooOo00.OooO0Oo("&", string);
        }
        return OooOo00.OooO0Oo(str, string);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final o000OO0O OooO0O0() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strOooO00o = OooO00o(this.f38579OooO00o, this.f38580OooO0O0);
            String str = "GET Request URL: " + strOooO00o;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strOooO00o).openConnection();
            try {
                httpsURLConnection.setReadTimeout(ResponseInfo.UnknownError);
                httpsURLConnection.setConnectTimeout(ResponseInfo.UnknownError);
                httpsURLConnection.setRequestMethod(Request.HttpMethodGet);
                for (Map.Entry entry : this.f38581OooO0OO.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new o000OO0O(responseCode, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final o000O0Oo OooO0OO(String str, String str2) {
        this.f38581OooO0OO.put(str, str2);
        return this;
    }
}
