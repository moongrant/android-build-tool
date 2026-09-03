package com.qiniu.android.http.request.httpclient;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.jeremyliao.liveeventbus.BuildConfig;
import com.qiniu.android.common.Constants;
import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.http.ProxyConfiguration;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.dns.SystemDns;
import com.qiniu.android.http.metrics.UploadSingleRequestMetrics;
import com.qiniu.android.http.request.IRequestClient;
import com.qiniu.android.http.request.Request;
import com.qiniu.android.utils.AsyncRun;
import com.qiniu.android.utils.StringUtils;
import com.yalla.yalla.data.constant.FeedbackType;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.json.JSONObject;
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OO0OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o00OOOO0;
import p641o0ooOO0o.o00OOOOo;
import p641o0ooOO0o.o0O00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O0000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O0o;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0OoOoOo;
import p648o0ooOoo.oO000Oo;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public class SystemHttpClient implements IRequestClient {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private static o00OOOOo pool;
    private o00OO call;
    private IRequestClient.RequestClientCompleteHandler completeHandler;
    private Request currentRequest;
    private boolean hasHandleComplete = false;
    private o0OoO00O httpClient;
    private UploadSingleRequestMetrics metrics;
    private IRequestClient.RequestClientProgress requestProgress;

    public static class ResponseTag {
        public long duration;
        public String ip;

        private ResponseTag() {
            this.ip = "";
            this.duration = -1L;
        }
    }

    private static JSONObject buildJsonResp(byte[] bArr) throws Exception {
        String str = new String(bArr, Constants.UTF_8);
        return StringUtils.isNullOrEmpty(str) ? new JSONObject() : new JSONObject(str);
    }

    private o0 createEventLister() {
        return new o0() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.5
            @Override // p641o0ooOO0o.o0
            public void callEnd(o00OO o00oo2) {
                SystemHttpClient.this.metrics.endDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void callFailed(o00OO o00oo2, IOException iOException) {
                SystemHttpClient.this.metrics.endDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void callStart(o00OO o00oo2) {
                SystemHttpClient.this.metrics.startDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void connectEnd(o00OO o00oo2, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
                SystemHttpClient.this.metrics.secureConnectionEndDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void connectFailed(o00OO o00oo2, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
                SystemHttpClient.this.metrics.connectEndDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void connectStart(o00OO o00oo2, InetSocketAddress inetSocketAddress, Proxy proxy) {
                SystemHttpClient.this.metrics.connectStartDate = new Date();
                if (inetSocketAddress == null || inetSocketAddress.getAddress() == null) {
                    return;
                }
                SystemHttpClient.this.metrics.remoteAddress = inetSocketAddress.getAddress().getHostAddress();
                SystemHttpClient.this.metrics.remotePort = Integer.valueOf(inetSocketAddress.getPort());
            }

            @Override // p641o0ooOO0o.o0
            public void connectionAcquired(o00OO o00oo2, o00OOOO0 o00oooo1) {
            }

            @Override // p641o0ooOO0o.o0
            public void connectionReleased(o00OO o00oo2, o00OOOO0 o00oooo1) {
            }

            @Override // p641o0ooOO0o.o0
            public void dnsEnd(o00OO o00oo2, String str, List<InetAddress> list) {
                SystemHttpClient.this.metrics.domainLookupEndDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void dnsStart(o00OO o00oo2, String str) {
                SystemHttpClient.this.metrics.domainLookupStartDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void requestBodyEnd(o00OO o00oo2, long j) {
                SystemHttpClient.this.metrics.requestEndDate = new Date();
                SystemHttpClient.this.metrics.countOfRequestBodyBytesSent = j;
            }

            @Override // p641o0ooOO0o.o0
            public void requestBodyStart(o00OO o00oo2) {
            }

            @Override // p641o0ooOO0o.o0
            public void requestFailed(o00OO o00oo2, IOException iOException) {
                SystemHttpClient.this.metrics.requestEndDate = new Date();
                SystemHttpClient.this.metrics.countOfRequestBodyBytesSent = 0L;
            }

            @Override // p641o0ooOO0o.o0
            public void requestHeadersEnd(o00OO o00oo2, o0O00O0o o0o00o0o) {
                SystemHttpClient.this.metrics.countOfRequestHeaderBytesSent = o0o00o0o.f57830OooO0OO.toString().length();
            }

            @Override // p641o0ooOO0o.o0
            public void requestHeadersStart(o00OO o00oo2) {
                SystemHttpClient.this.metrics.requestStartDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void responseBodyEnd(o00OO o00oo2, long j) {
                SystemHttpClient.this.metrics.responseEndDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void responseBodyStart(o00OO o00oo2) {
            }

            @Override // p641o0ooOO0o.o0
            public void responseFailed(o00OO o00oo2, IOException iOException) {
                SystemHttpClient.this.metrics.responseEndDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void responseHeadersEnd(o00OO o00oo2, o0O00o00 o0o00o01) {
            }

            @Override // p641o0ooOO0o.o0
            public void responseHeadersStart(o00OO o00oo2) {
                SystemHttpClient.this.metrics.responseStartDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void secureConnectEnd(o00OO o00oo2, o0O0000O o0o0000o2) {
                SystemHttpClient.this.metrics.secureConnectionStartDate = new Date();
            }

            @Override // p641o0ooOO0o.o0
            public void secureConnectStart(o00OO o00oo2) {
                SystemHttpClient.this.metrics.connectEndDate = new Date();
            }
        };
    }

    private o0OoO00O createHttpClient(ProxyConfiguration proxyConfiguration) {
        if (this.currentRequest == null) {
            return null;
        }
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
        o0 eventListener = createEventLister();
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = oO000o00.f58124OooO00o;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        oO000Oo oo000oo = new oO000Oo(eventListener);
        Intrinsics.checkNotNullParameter(oo000oo, "<set-?>");
        oooO00o.f57919OooO0o0 = oo000oo;
        o0O0o dns = new o0O0o() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.2
            @Override // p641o0ooOO0o.o0O0o
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                if (SystemHttpClient.this.currentRequest.getInetAddress() == null || !str.equals(SystemHttpClient.this.currentRequest.host)) {
                    return new SystemDns().lookupInetAddress(str);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(SystemHttpClient.this.currentRequest.getInetAddress());
                return arrayList;
            }
        };
        Intrinsics.checkNotNullParameter(dns, "dns");
        if (!Intrinsics.areEqual(dns, oooO00o.f57923OooOO0O)) {
            oooO00o.f57940OooOoo = null;
        }
        Intrinsics.checkNotNullParameter(dns, "<set-?>");
        oooO00o.f57923OooOO0O = dns;
        o00OOOOo connectionPool = getConnectPool();
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(connectionPool, "<set-?>");
        oooO00o.f57915OooO0O0 = connectionPool;
        oooO00o.f57917OooO0Oo.add(new o0OoOoOo() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.3
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
        long j = this.currentRequest.timeout;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0O0(j, timeUnit);
        oooO00o.OooO0OO(this.currentRequest.timeout, timeUnit);
        oooO00o.OooO0o0(60L, timeUnit);
        return new o0OoO00O(oooO00o);
    }

    private o0O00O0o.OooO00o createRequestBuilder(final IRequestClient.RequestClientProgress requestClientProgress) {
        ByteBody byteBody;
        Request request = this.currentRequest;
        if (request == null) {
            return null;
        }
        Map<String, String> map = request.allHeaders;
        Intrinsics.checkNotNullParameter(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = StringsKt.trim((CharSequence) key).toString();
            String string2 = StringsKt.trim((CharSequence) value).toString();
            o0O000.OooO0O0.OooO00o(string);
            o0O000.OooO0O0.OooO0O0(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        o0O000 o0o001 = new o0O000(strArr);
        if (this.currentRequest.httpMethod.equals("HEAD") || this.currentRequest.httpMethod.equals("GET")) {
            o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
            oooO00o.OooO0o("GET", null);
            oooO00o.OooOO0(this.currentRequest.urlString);
            for (String str : this.currentRequest.allHeaders.keySet()) {
                oooO00o.OooO0Oo(str, this.currentRequest.allHeaders.get(str));
            }
            return oooO00o;
        }
        if (!this.currentRequest.httpMethod.equals("POST") && !this.currentRequest.httpMethod.equals("PUT")) {
            return null;
        }
        o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o();
        oooO00o2.OooOO0(this.currentRequest.urlString);
        oooO00o2.OooO0o0(o0o001);
        if (this.currentRequest.httpBody.length > 0) {
            Pattern pattern = o0O000Oo.f57807OooO0o0;
            o0O000Oo o0o000ooOooO0O0 = o0O000Oo.OooO00o.OooO0O0("application/octet-stream");
            String str2 = this.currentRequest.allHeaders.get("Content-Type");
            if (str2 != null) {
                o0o000ooOooO0O0 = o0O000Oo.OooO00o.OooO0O0(str2);
            }
            byteBody = new ByteBody(o0o000ooOooO0O0, this.currentRequest.httpBody);
        } else {
            byteBody = new ByteBody(null, new byte[0]);
        }
        CountingRequestBody body = new CountingRequestBody(byteBody, new ProgressHandler() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.4
            @Override // com.qiniu.android.http.ProgressHandler
            public void onProgress(long j, long j2) {
                IRequestClient.RequestClientProgress requestClientProgress2 = requestClientProgress;
                if (requestClientProgress2 != null) {
                    requestClientProgress2.progress(j, j2);
                }
            }
        }, this.currentRequest.httpBody.length, null);
        if (this.currentRequest.httpMethod.equals("POST")) {
            oooO00o2.OooO0oO(body);
        } else if (this.currentRequest.httpMethod.equals("PUT")) {
            Intrinsics.checkNotNullParameter(body, "body");
            oooO00o2.OooO0o("PUT", body);
        }
        return oooO00o2;
    }

    private static synchronized o00OOOOo getConnectPool() {
        if (pool == null) {
            pool = new o00OOOOo(10L, TimeUnit.MINUTES);
        }
        return pool;
    }

    private static String getOkHttpVersion() {
        try {
            try {
                try {
                    int i = o0O00.f57772OooO00o;
                    return o0O00.class.getField("VERSION").get(o0O00.class) + "";
                } catch (Exception unused) {
                    return "";
                }
            } catch (Exception unused2) {
                Class<?> cls = Class.forName("okhttp3.internal.Version");
                return (cls.getMethod("userAgent", new Class[0]).invoke(cls, new Object[0]) + "").replace("okhttp/", "");
            }
        } catch (Exception unused3) {
            Class<?> cls2 = Class.forName("okhttp3.internal.Version");
            return (cls2.getField("userAgent").get(cls2) + "").replace("okhttp/", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getStatusCodeByException(Exception exc) {
        String message = exc.getMessage();
        if ((message != null && message.contains("Canceled")) || (exc instanceof CancellationHandler.CancellationException)) {
            return -2;
        }
        if (exc instanceof UnknownHostException) {
            return ResponseInfo.UnknownHost;
        }
        if (message != null && message.indexOf("Broken pipe") == 0) {
            return ResponseInfo.NetworkConnectionLost;
        }
        if (exc instanceof SocketTimeoutException) {
            return -1001;
        }
        if (exc instanceof ConnectException) {
            return ResponseInfo.CannotConnectToHost;
        }
        if (exc instanceof ProtocolException) {
            return 100;
        }
        if (exc instanceof SSLException) {
            return ResponseInfo.NetworkSSLError;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(Request request, int i, String str, IRequestClient.RequestClientCompleteHandler requestClientCompleteHandler) {
        synchronized (this) {
            if (this.hasHandleComplete) {
                return;
            }
            this.hasHandleComplete = true;
            ResponseInfo responseInfoCreate = ResponseInfo.create(request, i, null, null, str);
            UploadSingleRequestMetrics uploadSingleRequestMetrics = this.metrics;
            uploadSingleRequestMetrics.response = responseInfoCreate;
            uploadSingleRequestMetrics.request = request;
            requestClientCompleteHandler.complete(responseInfoCreate, uploadSingleRequestMetrics, responseInfoCreate.response);
            releaseResource();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResponse(Request request, o0O00o00 o0o00o01, IRequestClient.RequestClientCompleteHandler requestClientCompleteHandler) {
        String message;
        byte[] bArrOooO00o;
        synchronized (this) {
            if (this.hasHandleComplete) {
                return;
            }
            this.hasHandleComplete = true;
            int i = o0o00o01.f57850OooO0oO;
            HashMap map = new HashMap();
            int length = o0o00o01.f57846OooO.f57773OooO0Oo.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(o0o00o01.f57846OooO.OooO0OO(i2).toLowerCase(), o0o00o01.f57846OooO.OooO0o0(i2));
            }
            JSONObject jSONObjectBuildJsonResp = null;
            try {
                bArrOooO00o = o0o00o01.f57852OooOO0.OooO00o();
                message = null;
            } catch (Exception e) {
                message = e.getMessage();
                bArrOooO00o = null;
            }
            if (bArrOooO00o == null) {
                message = o0o00o01.f57848OooO0o;
            } else if (responseContentType(o0o00o01) != "application/json") {
                String str = new String(bArrOooO00o);
                if (str.length() > 0) {
                    try {
                        jSONObjectBuildJsonResp = new JSONObject(str);
                    } catch (Exception unused) {
                    }
                }
            } else {
                try {
                    jSONObjectBuildJsonResp = buildJsonResp(bArrOooO00o);
                } catch (Exception e2) {
                    message = e2.getMessage();
                    i = -1015;
                }
            }
            ResponseInfo responseInfoCreate = ResponseInfo.create(request, i, map, jSONObjectBuildJsonResp, message);
            UploadSingleRequestMetrics uploadSingleRequestMetrics = this.metrics;
            uploadSingleRequestMetrics.response = responseInfoCreate;
            uploadSingleRequestMetrics.request = request;
            Protocol protocol = o0o00o01.f57849OooO0o0;
            if (protocol == Protocol.HTTP_1_0) {
                uploadSingleRequestMetrics.httpVersion = BuildConfig.VERSION_NAME;
            } else if (protocol == Protocol.HTTP_1_1) {
                uploadSingleRequestMetrics.httpVersion = "1.1";
            } else if (protocol == Protocol.HTTP_2) {
                uploadSingleRequestMetrics.httpVersion = FeedbackType.Suggestions;
            }
            requestClientCompleteHandler.complete(responseInfoCreate, uploadSingleRequestMetrics, responseInfoCreate.response);
            releaseResource();
        }
    }

    private void releaseResource() {
        this.currentRequest = null;
        this.requestProgress = null;
        this.completeHandler = null;
        this.metrics = null;
        this.httpClient = null;
        this.call = null;
    }

    private static String responseContentType(o0O00o00 o0o00o01) {
        o0O000Oo o0o000ooOooO0oO = o0o00o01.f57852OooOO0.OooO0oO();
        if (o0o000ooOooO0oO == null) {
            return "";
        }
        return o0o000ooOooO0oO.f57809OooO0O0 + "/" + o0o000ooOooO0oO.f57810OooO0OO;
    }

    @Override // com.qiniu.android.http.request.IRequestClient
    public synchronized void cancel() {
        o00OO o00oo2 = this.call;
        if (o00oo2 != null && !o00oo2.isCanceled()) {
            this.call.cancel();
        }
    }

    @Override // com.qiniu.android.http.request.IRequestClient
    public void request(Request request, boolean z, ProxyConfiguration proxyConfiguration, IRequestClient.RequestClientProgress requestClientProgress, IRequestClient.RequestClientCompleteHandler requestClientCompleteHandler) {
        UploadSingleRequestMetrics uploadSingleRequestMetrics = new UploadSingleRequestMetrics();
        this.metrics = uploadSingleRequestMetrics;
        uploadSingleRequestMetrics.clientName = "okhttp";
        uploadSingleRequestMetrics.clientVersion = getOkHttpVersion();
        if (request != null) {
            this.metrics.remoteAddress = request.ip;
        }
        this.metrics.setRequest(request);
        this.currentRequest = request;
        this.httpClient = createHttpClient(proxyConfiguration);
        this.requestProgress = requestClientProgress;
        this.completeHandler = requestClientCompleteHandler;
        o0O00O0o.OooO00o oooO00oCreateRequestBuilder = createRequestBuilder(requestClientProgress);
        if (oooO00oCreateRequestBuilder == null) {
            ResponseInfo responseInfoInvalidArgument = ResponseInfo.invalidArgument("invalid http request");
            handleError(request, responseInfoInvalidArgument.statusCode, responseInfoInvalidArgument.message, requestClientCompleteHandler);
            return;
        }
        ResponseTag responseTag = new ResponseTag();
        o0OoO00O o0ooo00o2 = this.httpClient;
        oooO00oCreateRequestBuilder.OooO(Object.class, responseTag);
        o0000O0 o0000o0OooO0O0 = o0ooo00o2.OooO0O0(oooO00oCreateRequestBuilder.OooO0O0());
        this.call = o0000o0OooO0O0;
        if (z) {
            FirebasePerfOkHttpClient.enqueue(o0000o0OooO0O0, new o00OOO00() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.1
                @Override // p641o0ooOO0o.o00OOO00
                public void onFailure(o00OO o00oo2, IOException iOException) {
                    iOException.printStackTrace();
                    String message = iOException.getMessage();
                    int statusCodeByException = SystemHttpClient.this.getStatusCodeByException(iOException);
                    if (o00oo2.isCanceled()) {
                        statusCodeByException = -2;
                        message = "user cancelled";
                    }
                    SystemHttpClient systemHttpClient = SystemHttpClient.this;
                    systemHttpClient.handleError(systemHttpClient.currentRequest, statusCodeByException, message, SystemHttpClient.this.completeHandler);
                }

                @Override // p641o0ooOO0o.o00OOO00
                public void onResponse(o00OO o00oo2, final o0O00o00 o0o00o01) throws IOException {
                    AsyncRun.runInBack(new Runnable() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SystemHttpClient systemHttpClient = SystemHttpClient.this;
                            systemHttpClient.handleResponse(systemHttpClient.currentRequest, o0o00o01, SystemHttpClient.this.completeHandler);
                        }
                    });
                }
            });
            return;
        }
        try {
            handleResponse(request, FirebasePerfOkHttpClient.execute(o0000o0OooO0O0), requestClientCompleteHandler);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            int statusCodeByException = getStatusCodeByException(e);
            if (this.call.isCanceled()) {
                statusCodeByException = -2;
                message = "user cancelled";
            }
            handleError(request, statusCodeByException, message, requestClientCompleteHandler);
        }
    }
}
