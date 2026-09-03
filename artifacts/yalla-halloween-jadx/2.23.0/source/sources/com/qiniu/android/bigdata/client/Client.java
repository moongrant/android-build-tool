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
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO000;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oOO00O;
import p634o0ooO0oO.oo00o;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class Client {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private final UrlConverter converter;
    private o00OOOO0 httpClient;

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

    private static ResponseInfo buildResponseInfo(o0oOOo o0oooo, String str, long j, UpToken upToken, long j2) {
        String message;
        byte[] bArrOooO00o;
        JSONObject jSONObjectBuildJsonResp;
        int i = o0oooo.f57345OooO0oO;
        int i2 = o0oooo.f57345OooO0oO;
        Intrinsics.checkNotNullParameter("X-Reqid", "name");
        String strOooO0OO = o0oooo.OooO0OO("X-Reqid", null);
        if (strOooO0OO != null) {
            String str2 = strOooO0OO.trim().split(",")[0];
        }
        try {
            bArrOooO00o = o0oooo.f57347OooOO0.OooO00o();
            message = null;
        } catch (IOException e) {
            message = e.getMessage();
            bArrOooO00o = null;
        }
        if (!ctype(o0oooo).equals("application/json") || bArrOooO00o == null) {
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
        oo0O oo0o = o0oooo.f57341OooO;
        int length = oo0o.f57369OooO0Oo.length / 2;
        for (int i3 = 0; i3 < length; i3++) {
            map.put(oo0o.OooO0OO(i3).toLowerCase(), oo0o.OooO0o0(i3));
        }
        return ResponseInfo.create(null, i, map, jSONObjectBuildJsonResp, message);
    }

    private static String ctype(o0oOOo o0oooo) {
        o00OOO0 o00ooo0OooO0oO = o0oooo.f57347OooOO0.OooO0oO();
        if (o00ooo0OooO0oO == null) {
            return "";
        }
        return o00ooo0OooO0oO.f57236OooO0O0 + "/" + o00ooo0OooO0oO.f57237OooO0OO;
    }

    private static long getContentLength(o0oOOo o0oooo) {
        try {
            oo00oO oo00oo = o0oooo.f57342OooO0Oo.f57316OooO0Oo;
            if (oo00oo == null) {
                return 0L;
            }
            return oo00oo.contentLength();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRet(o0oOOo o0oooo, String str, long j, UpToken upToken, long j2, final CompletionHandler completionHandler) {
        final ResponseInfo responseInfoBuildResponseInfo = buildResponseInfo(o0oooo, str, j, upToken, j2);
        AsyncRun.runInMain(new Runnable() { // from class: com.qiniu.android.bigdata.client.Client.3
            @Override // java.lang.Runnable
            public void run() {
                CompletionHandler completionHandler2 = completionHandler;
                ResponseInfo responseInfo = responseInfoBuildResponseInfo;
                completionHandler2.complete(responseInfo, responseInfo.response);
            }
        });
    }

    private ResponseInfo send(final o00OOOOo.OooO00o oooO00o, StringMap stringMap) {
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

    private static String via(o0oOOo o0oooo) {
        String strOooO0OO = o0oooo.OooO0OO("X-Via", "");
        if (!strOooO0OO.equals("")) {
            return strOooO0OO;
        }
        String strOooO0OO2 = o0oooo.OooO0OO("X-Px", "");
        if (!strOooO0OO2.equals("")) {
            return strOooO0OO2;
        }
        String strOooO0OO3 = o0oooo.OooO0OO("Fw-Via", "");
        strOooO0OO3.equals("");
        return strOooO0OO3;
    }

    public void asyncGet(String str, StringMap stringMap, UpToken upToken, CompletionHandler completionHandler) {
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooO0o("GET", null);
        oooO00o.OooOO0(str);
        asyncSend(oooO00o, stringMap, upToken, 0L, completionHandler);
    }

    public void asyncMultipartPost(String str, PostArgs postArgs, UpToken upToken, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        oo00oO oo00ooCreate;
        long length;
        if (postArgs.file != null) {
            oo00ooCreate = oo00oO.create(o00OOO0.OooO0O0(postArgs.mimeType), postArgs.file);
            length = postArgs.file.length();
        } else {
            oo00ooCreate = oo00oO.create(o00OOO0.OooO0O0(postArgs.mimeType), postArgs.data);
            length = postArgs.data.length;
        }
        asyncMultipartPost(str, postArgs.params, upToken, length, progressHandler, postArgs.fileName, oo00ooCreate, completionHandler, cancellationHandler);
    }

    public void asyncPost(String str, byte[] bArr, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, CompletionHandler completionHandler, UpCancellationSignal upCancellationSignal) {
        asyncPost(str, bArr, 0, bArr.length, stringMap, upToken, j, progressHandler, completionHandler, upCancellationSignal);
    }

    public void asyncSend(final o00OOOOo.OooO00o oooO00o, StringMap stringMap, final UpToken upToken, final long j, final CompletionHandler completionHandler) {
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
        o00OOOO0 o00oooo1 = this.httpClient;
        oooO00o.OooO(Object.class, responseTag);
        FirebasePerfOkHttpClient.enqueue(o00oooo1.OooO0O0(oooO00o.OooO0O0()), new oo00o() { // from class: com.qiniu.android.bigdata.client.Client.5
            @Override // p634o0ooO0oO.oo00o
            public void onFailure(o00O00o0 o00o00o1, IOException iOException) {
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

            @Override // p634o0ooO0oO.oo00o
            public void onResponse(o00O00o0 o00o00o1, o0oOOo o0oooo) throws IOException {
                o00OOOOo o00ooooo2 = o0oooo.f57342OooO0Oo;
                o00ooooo2.getClass();
                Intrinsics.checkNotNullParameter(Object.class, "type");
                ResponseTag responseTag2 = (ResponseTag) Object.class.cast(o00ooooo2.f57318OooO0o0.get(Object.class));
                Client.onRet(o0oooo, responseTag2.ip, responseTag2.duration, upToken, j, completionHandler);
            }
        });
    }

    public ResponseInfo syncGet(String str, StringMap stringMap) {
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooO0o("GET", null);
        oooO00o.OooOO0(str);
        return send(oooO00o, stringMap);
    }

    public ResponseInfo syncMultipartPost(String str, PostArgs postArgs, UpToken upToken) {
        oo00oO oo00ooCreate;
        long length;
        if (postArgs.file != null) {
            oo00ooCreate = oo00oO.create(o00OOO0.OooO0O0(postArgs.mimeType), postArgs.file);
            length = postArgs.file.length();
        } else {
            oo00ooCreate = oo00oO.create(o00OOO0.OooO0O0(postArgs.mimeType), postArgs.data);
            length = postArgs.data.length;
        }
        return syncMultipartPost(str, postArgs.params, upToken, length, postArgs.fileName, oo00ooCreate);
    }

    public ResponseInfo syncSend(final o00OOOOo.OooO00o oooO00o, StringMap stringMap, UpToken upToken, long j) {
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
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        if (proxyConfiguration != null) {
            Proxy proxy = proxyConfiguration.proxy();
            if (!Intrinsics.areEqual(proxy, oooO00o.f57295OooOO0o)) {
                oooO00o.f57311OooOoo = null;
            }
            oooO00o.f57295OooOO0o = proxy;
            if (proxyConfiguration.user != null && proxyConfiguration.password != null) {
                oOO00O proxyAuthenticator = proxyConfiguration.authenticator();
                Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
                if (!Intrinsics.areEqual(proxyAuthenticator, oooO00o.f57296OooOOO)) {
                    oooO00o.f57311OooOoo = null;
                }
                Intrinsics.checkNotNullParameter(proxyAuthenticator, "<set-?>");
                oooO00o.f57296OooOOO = proxyAuthenticator;
            }
        }
        o00OO000 dns2 = new o00OO000() { // from class: com.qiniu.android.bigdata.client.Client.1
            @Override // p634o0ooO0oO.o00OO000
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
        if (!Intrinsics.areEqual(dns2, oooO00o.f57294OooOO0O)) {
            oooO00o.f57311OooOoo = null;
        }
        Intrinsics.checkNotNullParameter(dns2, "<set-?>");
        oooO00o.f57294OooOO0O = dns2;
        oooO00o.f57288OooO0Oo.add(new o00OOO00() { // from class: com.qiniu.android.bigdata.client.Client.2
            @Override // p634o0ooO0oO.o00OOO00
            public o0oOOo intercept(o00OOO00.OooO00o oooO00o2) throws IOException {
                String string;
                o00OOOOo o00oooooOooO00o = oooO00o2.OooO00o();
                long jCurrentTimeMillis = System.currentTimeMillis();
                o0oOOo o0ooooOooO0O0 = oooO00o2.OooO0O0(o00oooooOooO00o);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                o00oooooOooO00o.getClass();
                Intrinsics.checkNotNullParameter(Object.class, "type");
                ResponseTag responseTag = (ResponseTag) Object.class.cast(o00oooooOooO00o.f57318OooO0o0.get(Object.class));
                try {
                    Socket socket = oooO00o2.OooO0OO().f59619OooO0Oo;
                    Intrinsics.checkNotNull(socket);
                    string = socket.getRemoteSocketAddress().toString();
                } catch (Exception e) {
                    e.printStackTrace();
                    string = "";
                }
                responseTag.ip = string;
                responseTag.duration = jCurrentTimeMillis2 - jCurrentTimeMillis;
                return o0ooooOooO0O0;
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0OO(i, timeUnit);
        oooO00o.OooO0Oo(i2, timeUnit);
        oooO00o.OooO0o(0L, timeUnit);
        this.httpClient = new o00OOOO0(oooO00o);
    }

    public void asyncPost(String str, byte[] bArr, int i, int i2, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        oo00oO oo00ooCreate;
        Object obj;
        UrlConverter urlConverter = this.converter;
        String strConvert = urlConverter != null ? urlConverter.convert(str) : str;
        if (bArr == null || bArr.length <= 0) {
            oo00ooCreate = oo00oO.create((o00OOO0) null, new byte[0]);
        } else {
            Pattern pattern = o00OOO0.f57234OooO0o0;
            o00OOO0 o00ooo0OooO0O0 = o00OOO0.OooO00o.OooO0O0("application/octet-stream");
            if (stringMap != null && (obj = stringMap.get("Content-Type")) != null) {
                o00ooo0OooO0O0 = o00OOO0.OooO00o.OooO0O0(obj.toString());
            }
            oo00ooCreate = oo00oO.create(o00ooo0OooO0O0, bArr, i, i2);
        }
        oo00oO countingRequestBody = oo00ooCreate;
        if (progressHandler != null || cancellationHandler != null) {
            countingRequestBody = new CountingRequestBody(countingRequestBody, progressHandler, j, cancellationHandler);
        }
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooOO0(strConvert);
        oooO00o.OooO0oO(countingRequestBody);
        asyncSend(oooO00o, stringMap, upToken, j, completionHandler);
    }

    private void asyncMultipartPost(String str, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, String str2, oo00oO oo00oo, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        UrlConverter urlConverter = this.converter;
        String strConvert = urlConverter != null ? urlConverter.convert(str) : str;
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart(ShareInternalUtility.STAGING_PARAM, str2, oo00oo);
        stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.6
            @Override // com.qiniu.android.utils.StringMap.Consumer
            public void accept(String str3, Object obj) {
                builder.addFormDataPart(str3, obj.toString());
            }
        });
        Pattern pattern = o00OOO0.f57234OooO0o0;
        builder.setType(o00OOO0.OooO00o.OooO0O0("multipart/form-data"));
        oo00oO oo00ooBuild = builder.build();
        if (progressHandler != null || cancellationHandler != null) {
            oo00ooBuild = new CountingRequestBody(oo00ooBuild, progressHandler, j, cancellationHandler);
        }
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooOO0(strConvert);
        oooO00o.OooO0oO(oo00ooBuild);
        asyncSend(oooO00o, null, upToken, j, completionHandler);
    }

    private ResponseInfo syncMultipartPost(String str, StringMap stringMap, UpToken upToken, long j, String str2, oo00oO oo00oo) {
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart(ShareInternalUtility.STAGING_PARAM, str2, oo00oo);
        stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.8
            @Override // com.qiniu.android.utils.StringMap.Consumer
            public void accept(String str3, Object obj) {
                builder.addFormDataPart(str3, obj.toString());
            }
        });
        Pattern pattern = o00OOO0.f57234OooO0o0;
        builder.setType(o00OOO0.OooO00o.OooO0O0("multipart/form-data"));
        MultipartBody multipartBodyBuild = builder.build();
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooOO0(str);
        oooO00o.OooO0oO(multipartBodyBuild);
        return syncSend(oooO00o, null, upToken, j);
    }
}
