package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.qiniu.android.http.request.Request;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private String a = "10.0.0.172";
    private int b = 80;
    private Context c;

    public c(Context context) {
        this.c = context;
    }

    private void a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        a.i = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    private void b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            a.h = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            a.k = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        a.i = a.k;
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.b.startsWith("460") || com.umeng.commonsdk.statistics.b.b.startsWith("461")) {
            a.i = a.h;
        }
    }

    private boolean c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.c.getSystemService("connectivity");
            return (!DeviceConfig.checkPermission(this.c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 1 || (extraInfo = activeNetworkInfo.getExtraInfo()) == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) ? false : true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.c, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    public boolean a(byte[] bArr, String str, String str2, String str3) {
        boolean z = false;
        if (bArr != null && str != null) {
            if (SdkVersion.SDK_TYPE == 0) {
                a();
            } else {
                a.h = a.k;
                b();
            }
            String str4 = a.i;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            ?? r13 = str2;
            if (zIsEmpty) {
                r13 = str4;
            }
            OutputStream outputStream = null;
            try {
                try {
                    if (c()) {
                        r13 = (HttpsURLConnection) new URL(r13 + File.separator + str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.a, this.b)));
                    } else {
                        r13 = (HttpsURLConnection) new URL(r13 + File.separator + str).openConnection();
                    }
                    try {
                        r13.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        r13.setSSLSocketFactory(sSLContext.getSocketFactory());
                        r13.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                        r13.setRequestProperty("Msg-Type", "envelope/json");
                        r13.setRequestProperty("Content-Type", ak.aP + str3);
                        r13.setConnectTimeout(30000);
                        r13.setReadTimeout(30000);
                        r13.setRequestMethod(Request.HttpMethodPOST);
                        r13.setDoOutput(true);
                        r13.setDoInput(true);
                        r13.setUseCaches(false);
                        outputStream = r13.getOutputStream();
                        outputStream.write(bArr);
                        outputStream.flush();
                        r13.connect();
                        if (r13.getResponseCode() == 200) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send stateless message success : " + a.i + "/" + str);
                            z = true;
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (SSLHandshakeException e) {
                        e = e;
                        MLog.e("SSLHandshakeException, Failed to send message.", e);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (r13 != 0) {
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        MLog.e("Exception,Failed to send message.", th);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (r13 != 0) {
                        }
                        return z;
                    }
                } catch (Throwable th2) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    if (r13 != 0) {
                        try {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            r13.disconnect();
                            throw th2;
                        } catch (Throwable unused5) {
                            throw th2;
                        }
                    }
                    throw th2;
                }
            } catch (SSLHandshakeException e2) {
                e = e2;
                r13 = 0;
            } catch (Throwable th3) {
                th = th3;
                r13 = 0;
            }
            try {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                r13.disconnect();
            } catch (Throwable unused6) {
            }
            return z;
        }
        ULog.i("walle", "[stateless] sendMessage, envelopeByte == null || path == null ");
        return false;
    }
}
