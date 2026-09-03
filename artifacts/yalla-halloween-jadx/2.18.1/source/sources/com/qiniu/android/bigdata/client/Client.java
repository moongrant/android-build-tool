package com.qiniu.android.bigdata.client;

import com.facebook.share.internal.ShareInternalUtility;
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
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p016OooOoO0.OooOo00;
import p660o0ooo0o0.o00O0OO0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.o0o0Oo;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class Client {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private final UrlConverter converter;
    private o00OO httpClient;

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

    private static ResponseInfo buildResponseInfo(o00OOOO0 o00oooo1, String str, long j, UpToken upToken, long j2) {
        String message;
        byte[] bArrOooO0O0;
        JSONObject jSONObjectBuildJsonResp;
        int i = o00oooo1.f51443OoooO00;
        String strOooO0O0 = o00oooo1.OooO0O0("X-Reqid", null);
        if (strOooO0O0 != null) {
            String str2 = strOooO0O0.trim().split(",")[0];
        }
        try {
            bArrOooO0O0 = o00oooo1.f51441OoooO.OooO0O0();
            message = null;
        } catch (IOException e) {
            message = e.getMessage();
            bArrOooO0O0 = null;
        }
        if (!ctype(o00oooo1).equals("application/json") || bArrOooO0O0 == null) {
            message = bArrOooO0O0 == null ? "null body" : new String(bArrOooO0O0);
            jSONObjectBuildJsonResp = null;
        } else {
            try {
                jSONObjectBuildJsonResp = buildJsonResp(bArrOooO0O0);
                try {
                    if (o00oooo1.f51443OoooO00 != 200) {
                        message = jSONObjectBuildJsonResp.optString("error", new String(bArrOooO0O0, Constants.UTF_8));
                    }
                } catch (Exception e2) {
                    e = e2;
                    if (o00oooo1.f51443OoooO00 < 300) {
                        message = e.getMessage();
                    }
                }
            } catch (Exception e3) {
                e = e3;
                jSONObjectBuildJsonResp = null;
            }
        }
        HashMap map = new HashMap();
        int length = o00oooo1.f51444OoooO0O.f51230Oooo0o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            map.put(o00oooo1.f51444OoooO0O.OooO0O0(i2).toLowerCase(), o00oooo1.f51444OoooO0O.OooO0o0(i2));
        }
        return ResponseInfo.create(null, i, map, jSONObjectBuildJsonResp, message);
    }

    private static String ctype(o00OOOO0 o00oooo1) {
        o00OO0O0 o00oo0o0OooO0o = o00oooo1.f51441OoooO.OooO0o();
        if (o00oo0o0OooO0o == null) {
            return "";
        }
        return o00oo0o0OooO0o.f51403OooO0O0 + "/" + o00oo0o0OooO0o.f51404OooO0OO;
    }

    private static long getContentLength(o00OOOO0 o00oooo1) {
        try {
            o0o0Oo o0o0oo = o00oooo1.f51439Oooo0oO.f51429OooO0o0;
            if (o0o0oo == null) {
                return 0L;
            }
            return o0o0oo.contentLength();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRet(o00OOOO0 o00oooo1, String str, long j, UpToken upToken, long j2, final CompletionHandler completionHandler) {
        final ResponseInfo responseInfoBuildResponseInfo = buildResponseInfo(o00oooo1, str, j, upToken, j2);
        AsyncRun.runInMain(new Runnable() { // from class: com.qiniu.android.bigdata.client.Client.3
            @Override // java.lang.Runnable
            public void run() {
                CompletionHandler completionHandler2 = completionHandler;
                ResponseInfo responseInfo = responseInfoBuildResponseInfo;
                completionHandler2.complete(responseInfo, responseInfo.response);
            }
        });
    }

    private ResponseInfo send(final o00OOO00.OooO00o oooO00o, StringMap stringMap) {
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.7
                @Override // com.qiniu.android.utils.StringMap.Consumer
                public void accept(String str, Object obj) {
                    oooO00o.OooO0o0(str, obj.toString());
                }
            });
        }
        oooO00o.OooO0o0("User-Agent", UserAgent.instance().getUa(""));
        System.currentTimeMillis();
        ResponseTag responseTag = new ResponseTag();
        oooO00o.OooOO0(Object.class, responseTag);
        try {
            return buildResponseInfo(((o00O0OO) this.httpClient.OooO0OO(oooO00o.OooO0O0())).OooO0O0(), responseTag.ip, responseTag.duration, null, 0L);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseInfo.create(null, -1, null, null, e.getMessage());
        }
    }

    private static String via(o00OOOO0 o00oooo1) {
        String strOooO0O0 = o00oooo1.OooO0O0("X-Via", "");
        if (!strOooO0O0.equals("")) {
            return strOooO0O0;
        }
        String strOooO0O1 = o00oooo1.OooO0O0("X-Px", "");
        if (!strOooO0O1.equals("")) {
            return strOooO0O1;
        }
        String strOooO0O2 = o00oooo1.OooO0O0("Fw-Via", "");
        strOooO0O2.equals("");
        return strOooO0O2;
    }

    public void asyncGet(String str, StringMap stringMap, UpToken upToken, CompletionHandler completionHandler) {
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        oooO00o.OooO0Oo();
        oooO00o.OooOO0o(str);
        asyncSend(oooO00o, stringMap, upToken, 0L, completionHandler);
    }

    public void asyncMultipartPost(String str, PostArgs postArgs, UpToken upToken, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        o0o0Oo o0o0ooCreate;
        long length;
        if (postArgs.file != null) {
            o0o0ooCreate = o0o0Oo.create(o00OO0O0.OooO0OO(postArgs.mimeType), postArgs.file);
            length = postArgs.file.length();
        } else {
            o0o0ooCreate = o0o0Oo.create(o00OO0O0.OooO0OO(postArgs.mimeType), postArgs.data);
            length = postArgs.data.length;
        }
        asyncMultipartPost(str, postArgs.params, upToken, length, progressHandler, postArgs.fileName, o0o0ooCreate, completionHandler, cancellationHandler);
    }

    public void asyncPost(String str, byte[] bArr, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, CompletionHandler completionHandler, UpCancellationSignal upCancellationSignal) {
        asyncPost(str, bArr, 0, bArr.length, stringMap, upToken, j, progressHandler, completionHandler, upCancellationSignal);
    }

    public void asyncSend(final o00OOO00.OooO00o oooO00o, StringMap stringMap, final UpToken upToken, final long j, final CompletionHandler completionHandler) {
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.4
                @Override // com.qiniu.android.utils.StringMap.Consumer
                public void accept(String str, Object obj) {
                    oooO00o.OooO0o0(str, obj.toString());
                }
            });
        }
        if (upToken != null) {
            oooO00o.OooO0o0("User-Agent", UserAgent.instance().getUa(upToken.accessKey));
        } else {
            oooO00o.OooO0o0("User-Agent", UserAgent.instance().getUa("pandora"));
        }
        ResponseTag responseTag = new ResponseTag();
        o00OO o00oo2 = this.httpClient;
        oooO00o.OooOO0(Object.class, responseTag);
        ((o00O0OO) o00oo2.OooO0OO(oooO00o.OooO0O0())).OoooO0O(new o00oOoo() { // from class: com.qiniu.android.bigdata.client.Client.5
            @Override // p660o0ooo0o0.o00oOoo
            public void onFailure(o0O0ooO o0o0ooo, IOException iOException) {
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
                    i = ResponseInfo.TimedOut;
                } else {
                    i = iOException instanceof ConnectException ? ResponseInfo.CannotConnectToHost : -1;
                }
                completionHandler.complete(ResponseInfo.create(null, i, null, null, iOException.getMessage()), null);
            }

            @Override // p660o0ooo0o0.o00oOoo
            public void onResponse(o0O0ooO o0o0ooo, o00OOOO0 o00oooo1) throws IOException {
                ResponseTag responseTag2 = (ResponseTag) o00oooo1.f51439Oooo0oO.OooO0OO();
                Client.onRet(o00oooo1, responseTag2.ip, responseTag2.duration, upToken, j, completionHandler);
            }
        });
    }

    public ResponseInfo syncGet(String str, StringMap stringMap) {
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        oooO00o.OooO0Oo();
        oooO00o.OooOO0o(str);
        return send(oooO00o, stringMap);
    }

    public ResponseInfo syncMultipartPost(String str, PostArgs postArgs, UpToken upToken) {
        o0o0Oo o0o0ooCreate;
        long length;
        if (postArgs.file != null) {
            o0o0ooCreate = o0o0Oo.create(o00OO0O0.OooO0OO(postArgs.mimeType), postArgs.file);
            length = postArgs.file.length();
        } else {
            o0o0ooCreate = o0o0Oo.create(o00OO0O0.OooO0OO(postArgs.mimeType), postArgs.data);
            length = postArgs.data.length;
        }
        return syncMultipartPost(str, postArgs.params, upToken, length, postArgs.fileName, o0o0ooCreate);
    }

    public ResponseInfo syncSend(final o00OOO00.OooO00o oooO00o, StringMap stringMap, UpToken upToken, long j) {
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.9
                @Override // com.qiniu.android.utils.StringMap.Consumer
                public void accept(String str, Object obj) {
                    oooO00o.OooO0o0(str, obj.toString());
                }
            });
        }
        oooO00o.OooO0o0("User-Agent", UserAgent.instance().getUa(upToken.accessKey));
        ResponseTag responseTag = new ResponseTag();
        try {
            oooO00o.OooOO0(Object.class, responseTag);
            return buildResponseInfo(((o00O0OO) this.httpClient.OooO0OO(oooO00o.OooO0O0())).OooO0O0(), responseTag.ip, responseTag.duration, upToken, j);
        } catch (Exception e) {
            e.printStackTrace();
            int i = -1;
            String message = e.getMessage();
            if (e instanceof UnknownHostException) {
                i = ResponseInfo.UnknownHost;
            } else if (message != null && message.indexOf("Broken pipe") == 0) {
                i = ResponseInfo.NetworkConnectionLost;
            } else if (e instanceof SocketTimeoutException) {
                i = ResponseInfo.TimedOut;
            } else if (e instanceof ConnectException) {
                i = ResponseInfo.CannotConnectToHost;
            }
            return ResponseInfo.create(null, i, null, null, e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00OO00O>] */
    public Client(ProxyConfiguration proxyConfiguration, int i, int i2, UrlConverter urlConverter, Dns dns) {
        this.converter = urlConverter;
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        if (proxyConfiguration != null) {
            Proxy proxy = proxyConfiguration.proxy();
            if (!Intrinsics.areEqual(proxy, oooO00o.f51362OooOOO0)) {
                oooO00o.f51378OooOooO = null;
            }
            oooO00o.f51362OooOOO0 = proxy;
            if (proxyConfiguration.user != null && proxyConfiguration.password != null) {
                oooO00o.OooO0o(proxyConfiguration.authenticator());
            }
        }
        oooO00o.OooO0Oo(new o00O0OO0() { // from class: com.qiniu.android.bigdata.client.Client.1
            @Override // p660o0ooo0o0.o00O0OO0
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
                    Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(OooOo00.OooO0Oo("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        });
        oooO00o.f51353OooO0Oo.add(new o00OO00O() { // from class: com.qiniu.android.bigdata.client.Client.2
            @Override // p660o0ooo0o0.o00OO00O
            public o00OOOO0 intercept(o00OO00O.OooO00o oooO00o2) throws IOException {
                String string;
                o00OOO00 o00ooo00OooO00o = oooO00o2.OooO00o();
                long jCurrentTimeMillis = System.currentTimeMillis();
                o00OOOO0 o00oooo0OooO0O0 = oooO00o2.OooO0O0(o00ooo00OooO00o);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                ResponseTag responseTag = (ResponseTag) o00ooo00OooO00o.OooO0OO();
                try {
                    string = oooO00o2.OooO0OO().OooO00o().getRemoteSocketAddress().toString();
                } catch (Exception e) {
                    e.printStackTrace();
                    string = "";
                }
                responseTag.ip = string;
                responseTag.duration = jCurrentTimeMillis2 - jCurrentTimeMillis;
                return o00oooo0OooO0O0;
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0OO(i, timeUnit);
        oooO00o.OooO0oO(i2, timeUnit);
        oooO00o.OooO(0L);
        this.httpClient = new o00OO(oooO00o);
    }

    public void asyncPost(String str, byte[] bArr, int i, int i2, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        o0o0Oo o0o0ooCreate;
        Object obj;
        UrlConverter urlConverter = this.converter;
        String strConvert = urlConverter != null ? urlConverter.convert(str) : str;
        if (bArr == null || bArr.length <= 0) {
            o0o0ooCreate = o0o0Oo.create((o00OO0O0) null, new byte[0]);
        } else {
            o00OO0O0 o00oo0o0OooO0O0 = o00OO0O0.f51401OooO0oO.OooO0O0("application/octet-stream");
            if (stringMap != null && (obj = stringMap.get("Content-Type")) != null) {
                o00oo0o0OooO0O0 = o00OO0O0.OooO0OO(obj.toString());
            }
            o0o0ooCreate = o0o0Oo.create(o00oo0o0OooO0O0, bArr, i, i2);
        }
        o0o0Oo countingRequestBody = o0o0ooCreate;
        if (progressHandler != null || cancellationHandler != null) {
            countingRequestBody = new CountingRequestBody(countingRequestBody, progressHandler, j, cancellationHandler);
        }
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        oooO00o.OooOO0o(strConvert);
        oooO00o.OooO0oo(countingRequestBody);
        asyncSend(oooO00o, stringMap, upToken, j, completionHandler);
    }

    private void asyncMultipartPost(String str, StringMap stringMap, UpToken upToken, long j, ProgressHandler progressHandler, String str2, o0o0Oo o0o0oo, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        UrlConverter urlConverter = this.converter;
        String strConvert = urlConverter != null ? urlConverter.convert(str) : str;
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart(ShareInternalUtility.STAGING_PARAM, str2, o0o0oo);
        stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.6
            @Override // com.qiniu.android.utils.StringMap.Consumer
            public void accept(String str3, Object obj) {
                builder.addFormDataPart(str3, obj.toString());
            }
        });
        builder.setType(o00OO0O0.f51401OooO0oO.OooO0O0("multipart/form-data"));
        o0o0Oo o0o0ooBuild = builder.build();
        if (progressHandler != null || cancellationHandler != null) {
            o0o0ooBuild = new CountingRequestBody(o0o0ooBuild, progressHandler, j, cancellationHandler);
        }
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        oooO00o.OooOO0o(strConvert);
        oooO00o.OooO0oo(o0o0ooBuild);
        asyncSend(oooO00o, null, upToken, j, completionHandler);
    }

    private ResponseInfo syncMultipartPost(String str, StringMap stringMap, UpToken upToken, long j, String str2, o0o0Oo o0o0oo) {
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart(ShareInternalUtility.STAGING_PARAM, str2, o0o0oo);
        stringMap.forEach(new StringMap.Consumer() { // from class: com.qiniu.android.bigdata.client.Client.8
            @Override // com.qiniu.android.utils.StringMap.Consumer
            public void accept(String str3, Object obj) {
                builder.addFormDataPart(str3, obj.toString());
            }
        });
        builder.setType(o00OO0O0.f51401OooO0oO.OooO0O0("multipart/form-data"));
        MultipartBody multipartBodyBuild = builder.build();
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        oooO00o.OooOO0o(str);
        oooO00o.OooO0oo(multipartBodyBuild);
        return syncSend(oooO00o, null, upToken, j);
    }
}
