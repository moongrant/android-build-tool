package com.qiniu.android.bigdata.client;

import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.qiniu.android.common.Constants;
import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.http.ProxyConfiguration;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.UrlConverter;
import com.qiniu.android.http.UserAgent;
import com.qiniu.android.http.dns.Dns;
import com.qiniu.android.http.dns.DnsPrefetcher;
import com.qiniu.android.http.dns.IDnsNetworkAddress;
import com.qiniu.android.http.request.httpclient.CountingRequestBody;
import com.qiniu.android.http.request.httpclient.MultipartBody;
import com.qiniu.android.storage.UpCancellationSignal;
import com.qiniu.android.storage.UpToken;
import com.qiniu.android.utils.AsyncRun;
import com.qiniu.android.utils.StringMap;
import com.qiniu.android.utils.StringUtils;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OO0OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O0o;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class Client {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private final UrlConverter converter;
    private o0OoO00O httpClient;

    public static class ResponseTag {
        public long duration;
        public String ip;

        private ResponseTag() {
            this.ip = "";
            this.duration = -1L;
        }
    }

    public Client() {
        this(null, 10, 30, null, null);
    }

    private static JSONObject buildJsonResp(byte[] bArr) throws Exception {
        String str = new String(bArr, Constants.UTF_8);
        return StringUtils.isNullOrEmpty(str) ? new JSONObject() : new JSONObject(str);
    }

    private static ResponseInfo buildResponseInfo(o0O00o00 o0o00o01, String str, long j, UpToken upToken, long j2) {
        String message;
        byte[] bArrOooO00o;
        JSONObject jSONObjectBuildJsonResp;
        int i = o0o00o01.f57850OooO0oO;
        int i2 = o0o00o01.f57850OooO0oO;
        Intrinsics.checkNotNullParameter("X-Reqid", "name");
        String strOooO0OO = o0o00o01.OooO0OO("X-Reqid", null);
        if (strOooO0OO != null) {
            String str2 = strOooO0OO.trim().split(",")[0];
        }
        try {
            bArrOooO00o = o0o00o01.f57852OooOO0.OooO00o();
            message = null;
        } catch (IOException e) {
            message = e.getMessage();
            bArrOooO00o = null;
        }
        if (!ctype(o0o00o01).equals("application/json") || bArrOooO00o == null) {
            message = bArrOooO00o == null ? "null body" : new String(bArrOooO00o);
            jSONObjectBuildJsonResp = null;
        } else {
            try {
                jSONObjectBuildJsonResp = buildJsonResp(bArrOooO00o);
                if (i2 != 200) {
                    try {
                        message = jSONObjectBuildJsonResp.optString("error", new String(bArrOooO00o, Constants.UTF_8));
                    } catch (Exception e2) {
                        e = e2;
                        if (i2 < 300) {
                            message = e.getMessage();
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                jSONObjectBuildJsonResp = null;
            }
        }
        HashMap map = new HashMap();
        o0O000 o0o001 = o0o00o01.f57846OooO;
        int length = o0o001.f57773OooO0Oo.length / 2;
        for (int i3 = 0; i3 < length; i3++) {
            map.put(o0o001.OooO0OO(i3).toLowerCase(), o0o001.OooO0o0(i3));
        }
        return ResponseInfo.create(null, i, map, jSONObjectBuildJsonResp, message);
    }

    private static String ctype(o0O00o00 o0o00o01) {
        o0O000Oo o0o000ooOooO0oO = o0o00o01.f57852OooOO0.OooO0oO();
        if (o0o000ooOooO0oO == null) {
            return "";
        }
        return o0o000ooOooO0oO.f57809OooO0O0 + "/" + o0o000ooOooO0oO.f57810OooO0OO;
    }

    private static long getContentLength(o0O00o00 o0o00o01) {
        try {
            o0oO0Ooo o0oo0ooo2 = o0o00o01.f57847OooO0Oo.f57831OooO0Oo;
            if (o0oo0ooo2 == null) {
                return 0L;
            }
            return o0oo0ooo2.contentLength();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRet(o0O00o00 o0o00o01, String str, long j, UpToken upToken, long j2, final CompletionHandler completionHandler) {
        final ResponseInfo responseInfoBuildResponseInfo = buildResponseInfo(o0o00o01, str, j, upToken, j2);
        AsyncRun.runInMain(new Runnable() { // from class: com.qiniu.android.bigdata.client.Client.3
            @Override // java.lang.Runnable
            public void run() {
                CompletionHandler completionHandler2 = completionHandler;
                ResponseInfo responseInfo = responseInfoBuildResponseInfo;
                completionHandler2.complete(responseInfo, responseInfo.response);
            }
        });
    }

    private ResponseInfo send(final o0O00O0o.OooO00o oooO00o, StringMap stringMap) {
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.7
                @Override // com.qiniu.android.utils.StringMap.Consumer
                public void accept(String str, Object obj) {
                    oooO00o.OooO0Oo(str, obj.toString());
                }
            });
        }
        oooO00o.OooO0Oo("User-Agent", UserAgent.instance().getUa(""));
        System.currentTimeMillis();
        ResponseTag responseTag = new ResponseTag();
        oooO00o.OooO(Object.class, responseTag);
        try {
            return buildResponseInfo(FirebasePerfOkHttpClient.execute(this.httpClient.OooO0O0(oooO00o.OooO0O0())), responseTag.ip, responseTag.duration, null, 0L);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseInfo.create(null, -1, null, null, e.getMessage());
        }
    }

    private static String via(o0O00o00 o0o00o01) {
        String strOooO0OO = o0o00o01.OooO0OO("X-Via", "");
        if (!strOooO0OO.equals("")) {
            return strOooO0OO;
        }
        String strOooO0OO2 = o0o00o01.OooO0OO("X-Px", "");
        if (!strOooO0OO2.equals("")) {
            return strOooO0OO2;
        }
        String strOooO0OO3 = o0o00o01.OooO0OO("Fw-Via", "");
        strOooO0OO3.equals("");
        return strOooO0OO3;
    }

    public void asyncGet(String str, StringMap stringMap, UpToken upToken, CompletionHandler completionHandler) {
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooO0o("GET", null);
        oooO00o.OooOO0(str);
        asyncSend(oooO00o, stringMap, upToken, 0L, completionHandler);
    }

    public void asyncMultipartPost(String str, PostArgs postArgs, UpToken upToken, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        o0oO0Ooo o0oo0oooCreate;
        long length;
        if (postArgs.file != null) {
            o0oo0oooCreate = o0oO0Ooo.create(o0O000Oo.OooO0O0(postArgs.mimeType), postArgs.file);
            length = postArgs.file.length();
        } else {
            o0oo0oooCreate = o0oO0Ooo.create(o0O000Oo.OooO0O0(postArgs.mimeType), postArgs.data);
            length = postArgs.data.length;
        }
        asyncMultipartPost(str, postArgs.params, upToken, length, progressHandler, postArgs.fileName, o0oo0oooCreate, completionHandler, cancellationHandler);
    }

    public void asyncPost(String str, byte[] bArr, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, CompletionHandler completionHandler, UpCancellationSignal upCancellationSignal) {
        asyncPost(str, bArr, 0, bArr.length, stringMap, upToken, j, progressHandler, completionHandler, upCancellationSignal);
    }

    public void asyncSend(final o0O00O0o.OooO00o oooO00o, StringMap stringMap, final UpToken upToken, final long j, final CompletionHandler completionHandler) {
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.4
                @Override // com.qiniu.android.utils.StringMap.Consumer
                public void accept(String str, Object obj) {
                    oooO00o.OooO0Oo(str, obj.toString());
                }
            });
        }
        if (upToken != null) {
            oooO00o.OooO0Oo("User-Agent", UserAgent.instance().getUa(upToken.accessKey));
        } else {
            oooO00o.OooO0Oo("User-Agent", UserAgent.instance().getUa("pandora"));
        }
        ResponseTag responseTag = new ResponseTag();
        o0OoO00O o0ooo00o2 = this.httpClient;
        oooO00o.OooO(Object.class, responseTag);
        FirebasePerfOkHttpClient.enqueue(o0ooo00o2.OooO0O0(oooO00o.OooO0O0()), new o00OOO00() { // from class: com.qiniu.android.bigdata.client.Client.5
            @Override // p641o0ooOO0o.o00OOO00
            public void onFailure(o00OO o00oo2, IOException iOException) {
                int i;
                iOException.printStackTrace();
                String message = iOException.getMessage();
                if (iOException instanceof CancellationHandler.CancellationException) {
                    i = -2;
                } else if (iOException instanceof UnknownHostException) {
                    i = ResponseInfo.UnknownHost;
                } else if (message != null && message.indexOf("Broken pipe") == 0) {
                    i = ResponseInfo.NetworkConnectionLost;
                } else if (iOException instanceof SocketTimeoutException) {
                    i = -1001;
                } else {
                    i = iOException instanceof ConnectException ? ResponseInfo.CannotConnectToHost : -1;
                }
                completionHandler.complete(ResponseInfo.create(null, i, null, null, iOException.getMessage()), null);
            }

            @Override // p641o0ooOO0o.o00OOO00
            public void onResponse(o00OO o00oo2, o0O00o00 o0o00o01) throws IOException {
                o0O00O0o o0o00o0o = o0o00o01.f57847OooO0Oo;
                o0o00o0o.getClass();
                Intrinsics.checkNotNullParameter(Object.class, "type");
                ResponseTag responseTag2 = (ResponseTag) Object.class.cast(o0o00o0o.f57833OooO0o0.get(Object.class));
                Client.onRet(o0o00o01, responseTag2.ip, responseTag2.duration, upToken, j, completionHandler);
            }
        });
    }

    public ResponseInfo syncGet(String str, StringMap stringMap) {
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooO0o("GET", null);
        oooO00o.OooOO0(str);
        return send(oooO00o, stringMap);
    }

    public ResponseInfo syncMultipartPost(String str, PostArgs postArgs, UpToken upToken) {
        o0oO0Ooo o0oo0oooCreate;
        long length;
        if (postArgs.file != null) {
            o0oo0oooCreate = o0oO0Ooo.create(o0O000Oo.OooO0O0(postArgs.mimeType), postArgs.file);
            length = postArgs.file.length();
        } else {
            o0oo0oooCreate = o0oO0Ooo.create(o0O000Oo.OooO0O0(postArgs.mimeType), postArgs.data);
            length = postArgs.data.length;
        }
        return syncMultipartPost(str, postArgs.params, upToken, length, postArgs.fileName, o0oo0oooCreate);
    }

    public ResponseInfo syncSend(final o0O00O0o.OooO00o oooO00o, StringMap stringMap, UpToken upToken, long j) {
        int i;
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.9
                @Override // com.qiniu.android.utils.StringMap.Consumer
                public void accept(String str, Object obj) {
                    oooO00o.OooO0Oo(str, obj.toString());
                }
            });
        }
        oooO00o.OooO0Oo("User-Agent", UserAgent.instance().getUa(upToken.accessKey));
        ResponseTag responseTag = new ResponseTag();
        try {
            oooO00o.OooO(Object.class, responseTag);
            return buildResponseInfo(FirebasePerfOkHttpClient.execute(this.httpClient.OooO0O0(oooO00o.OooO0O0())), responseTag.ip, responseTag.duration, upToken, j);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            if (e instanceof UnknownHostException) {
                i = ResponseInfo.UnknownHost;
            } else if (message != null && message.indexOf("Broken pipe") == 0) {
                i = ResponseInfo.NetworkConnectionLost;
            } else if (e instanceof SocketTimeoutException) {
                i = -1001;
            } else {
                i = e instanceof ConnectException ? ResponseInfo.CannotConnectToHost : -1;
            }
            return ResponseInfo.create(null, i, null, null, e.getMessage());
        }
    }

    public Client(ProxyConfiguration proxyConfiguration, int i, int i2, UrlConverter urlConverter, Dns dns) {
        this.converter = urlConverter;
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        if (proxyConfiguration != null) {
            Proxy proxy = proxyConfiguration.proxy();
            if (!Intrinsics.areEqual(proxy, oooO00o.f57924OooOO0o)) {
                oooO00o.f57940OooOoo = null;
            }
            oooO00o.f57924OooOO0o = proxy;
            if (proxyConfiguration.user != null && proxyConfiguration.password != null) {
                o00OO0OO proxyAuthenticator = proxyConfiguration.authenticator();
                Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
                if (!Intrinsics.areEqual(proxyAuthenticator, oooO00o.f57925OooOOO)) {
                    oooO00o.f57940OooOoo = null;
                }
                Intrinsics.checkNotNullParameter(proxyAuthenticator, "<set-?>");
                oooO00o.f57925OooOOO = proxyAuthenticator;
            }
        }
        o0O0o dns2 = new o0O0o() { // from class: com.qiniu.android.bigdata.client.Client.1
            @Override // p641o0ooOO0o.o0O0o
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                InetAddress byName;
                List<IDnsNetworkAddress> inetAddressByHost = DnsPrefetcher.getInstance().getInetAddressByHost(hostname);
                if (inetAddressByHost != null && inetAddressByHost.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (IDnsNetworkAddress iDnsNetworkAddress : inetAddressByHost) {
                        if (iDnsNetworkAddress.getIpValue() != null && (byName = InetAddress.getByName(iDnsNetworkAddress.getIpValue())) != null) {
                            arrayList.add(byName);
                        }
                    }
                    if (arrayList.size() > 0) {
                        return arrayList;
                    }
                }
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        };
        Intrinsics.checkNotNullParameter(dns2, "dns");
        if (!Intrinsics.areEqual(dns2, oooO00o.f57923OooOO0O)) {
            oooO00o.f57940OooOoo = null;
        }
        Intrinsics.checkNotNullParameter(dns2, "<set-?>");
        oooO00o.f57923OooOO0O = dns2;
        oooO00o.f57917OooO0Oo.add(new o0OoOoOo() { // from class: com.qiniu.android.bigdata.client.Client.2
            @Override // p641o0ooOO0o.o0OoOoOo
            public o0O00o00 intercept(o0OoOoOo.OooO00o oooO00o2) throws IOException {
                String string;
                o0O00O0o o0o00o0oOooO00o = oooO00o2.OooO00o();
                long jCurrentTimeMillis = System.currentTimeMillis();
                o0O00o00 o0o00o00OooO0OO = oooO00o2.OooO0OO(o0o00o0oOooO00o);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                o0o00o0oOooO00o.getClass();
                Intrinsics.checkNotNullParameter(Object.class, "type");
                ResponseTag responseTag = (ResponseTag) Object.class.cast(o0o00o0oOooO00o.f57833OooO0o0.get(Object.class));
                try {
                    Socket socket = oooO00o2.OooO0O0().f59347OooO0Oo;
                    Intrinsics.checkNotNull(socket);
                    string = socket.getRemoteSocketAddress().toString();
                } catch (Exception e) {
                    e.printStackTrace();
                    string = "";
                }
                responseTag.ip = string;
                responseTag.duration = jCurrentTimeMillis2 - jCurrentTimeMillis;
                return o0o00o00OooO0OO;
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0O0(i, timeUnit);
        oooO00o.OooO0OO(i2, timeUnit);
        oooO00o.OooO0o0(0L, timeUnit);
        this.httpClient = new o0OoO00O(oooO00o);
    }

    public void asyncPost(String str, byte[] bArr, int i, int i2, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        o0oO0Ooo o0oo0oooCreate;
        Object obj;
        UrlConverter urlConverter = this.converter;
        String strConvert = urlConverter != null ? urlConverter.convert(str) : str;
        if (bArr == null || bArr.length <= 0) {
            o0oo0oooCreate = o0oO0Ooo.create((o0O000Oo) null, new byte[0]);
        } else {
            Pattern pattern = o0O000Oo.f57807OooO0o0;
            o0O000Oo o0o000ooOooO0O0 = o0O000Oo.OooO00o.OooO0O0("application/octet-stream");
            if (stringMap != null && (obj = stringMap.get("Content-Type")) != null) {
                o0o000ooOooO0O0 = o0O000Oo.OooO00o.OooO0O0(obj.toString());
            }
            o0oo0oooCreate = o0oO0Ooo.create(o0o000ooOooO0O0, bArr, i, i2);
        }
        o0oO0Ooo countingRequestBody = o0oo0oooCreate;
        if (progressHandler != null || cancellationHandler != null) {
            countingRequestBody = new CountingRequestBody(countingRequestBody, progressHandler, j, cancellationHandler);
        }
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooOO0(strConvert);
        oooO00o.OooO0oO(countingRequestBody);
        asyncSend(oooO00o, stringMap, upToken, j, completionHandler);
    }

    private void asyncMultipartPost(String str, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, String str2, o0oO0Ooo o0oo0ooo2, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        UrlConverter urlConverter = this.converter;
        String strConvert = urlConverter != null ? urlConverter.convert(str) : str;
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart(ShareInternalUtility.STAGING_PARAM, str2, o0oo0ooo2);
        stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.6
            @Override // com.qiniu.android.utils.StringMap.Consumer
            public void accept(String str3, Object obj) {
                builder.addFormDataPart(str3, obj.toString());
            }
        });
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        builder.setType(o0O000Oo.OooO00o.OooO0O0("multipart/form-data"));
        o0oO0Ooo o0oo0oooBuild = builder.build();
        if (progressHandler != null || cancellationHandler != null) {
            o0oo0oooBuild = new CountingRequestBody(o0oo0oooBuild, progressHandler, j, cancellationHandler);
        }
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooOO0(strConvert);
        oooO00o.OooO0oO(o0oo0oooBuild);
        asyncSend(oooO00o, null, upToken, j, completionHandler);
    }

    private ResponseInfo syncMultipartPost(String str, StringMap stringMap, UpToken upToken, long j, String str2, o0oO0Ooo o0oo0ooo2) {
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart(ShareInternalUtility.STAGING_PARAM, str2, o0oo0ooo2);
        stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.8
            @Override // com.qiniu.android.utils.StringMap.Consumer
            public void accept(String str3, Object obj) {
                builder.addFormDataPart(str3, obj.toString());
            }
        });
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        builder.setType(o0O000Oo.OooO00o.OooO0O0("multipart/form-data"));
        MultipartBody multipartBodyBuild = builder.build();
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooOO0(str);
        oooO00o.OooO0oO(multipartBodyBuild);
        return syncSend(oooO00o, null, upToken, j);
    }
}
