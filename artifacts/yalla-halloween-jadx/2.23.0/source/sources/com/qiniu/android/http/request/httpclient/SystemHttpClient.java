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
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00O0O0O;
import p634o0ooO0oO.o00O0OO0;
import p634o0ooO0oO.o00OO000;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OO0OO;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0o0Oo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oOO00O;
import p634o0ooO0oO.oo00o;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000Oo;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public class SystemHttpClient implements IRequestClient {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private static o00O0OO0 pool;
    private o00O00o0 call;
    private IRequestClient.RequestClientCompleteHandler completeHandler;
    private Request currentRequest;
    private boolean hasHandleComplete = false;
    private o00OOOO0 httpClient;
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

    private o00OO00O createEventLister() {
        return new o00OO00O() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.5
            @Override // p634o0ooO0oO.o00OO00O
            public void callEnd(o00O00o0 o00o00o1) {
                SystemHttpClient.this.metrics.endDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void callFailed(o00O00o0 o00o00o1, IOException iOException) {
                SystemHttpClient.this.metrics.endDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void callStart(o00O00o0 o00o00o1) {
                SystemHttpClient.this.metrics.startDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void connectEnd(o00O00o0 o00o00o1, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
                SystemHttpClient.this.metrics.secureConnectionEndDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void connectFailed(o00O00o0 o00o00o1, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
                SystemHttpClient.this.metrics.connectEndDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void connectStart(o00O00o0 o00o00o1, InetSocketAddress inetSocketAddress, Proxy proxy) {
                SystemHttpClient.this.metrics.connectStartDate = new Date();
                if (inetSocketAddress == null || inetSocketAddress.getAddress() == null) {
                    return;
                }
                SystemHttpClient.this.metrics.remoteAddress = inetSocketAddress.getAddress().getHostAddress();
                SystemHttpClient.this.metrics.remotePort = Integer.valueOf(inetSocketAddress.getPort());
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void connectionAcquired(o00O00o0 o00o00o1, o00O0O0O o00o0o0o2) {
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void connectionReleased(o00O00o0 o00o00o1, o00O0O0O o00o0o0o2) {
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void dnsEnd(o00O00o0 o00o00o1, String str, List<InetAddress> list) {
                SystemHttpClient.this.metrics.domainLookupEndDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void dnsStart(o00O00o0 o00o00o1, String str) {
                SystemHttpClient.this.metrics.domainLookupStartDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void requestBodyEnd(o00O00o0 o00o00o1, long j) {
                SystemHttpClient.this.metrics.requestEndDate = new Date();
                SystemHttpClient.this.metrics.countOfRequestBodyBytesSent = j;
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void requestBodyStart(o00O00o0 o00o00o1) {
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void requestFailed(o00O00o0 o00o00o1, IOException iOException) {
                SystemHttpClient.this.metrics.requestEndDate = new Date();
                SystemHttpClient.this.metrics.countOfRequestBodyBytesSent = 0L;
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void requestHeadersEnd(o00O00o0 o00o00o1, o00OOOOo o00ooooo2) {
                SystemHttpClient.this.metrics.countOfRequestHeaderBytesSent = o00ooooo2.f57315OooO0OO.toString().length();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void requestHeadersStart(o00O00o0 o00o00o1) {
                SystemHttpClient.this.metrics.requestStartDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void responseBodyEnd(o00O00o0 o00o00o1, long j) {
                SystemHttpClient.this.metrics.responseEndDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void responseBodyStart(o00O00o0 o00o00o1) {
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void responseFailed(o00O00o0 o00o00o1, IOException iOException) {
                SystemHttpClient.this.metrics.responseEndDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void responseHeadersEnd(o00O00o0 o00o00o1, o0oOOo o0oooo) {
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void responseHeadersStart(o00O00o0 o00o00o1) {
                SystemHttpClient.this.metrics.responseStartDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void secureConnectEnd(o00O00o0 o00o00o1, o00OO0OO o00oo0oo) {
                SystemHttpClient.this.metrics.secureConnectionStartDate = new Date();
            }

            @Override // p634o0ooO0oO.o00OO00O
            public void secureConnectStart(o00O00o0 o00o00o1) {
                SystemHttpClient.this.metrics.connectEndDate = new Date();
            }
        };
    }

    private o00OOOO0 createHttpClient(ProxyConfiguration proxyConfiguration) {
        if (this.currentRequest == null) {
            return null;
        }
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
        o00OO00O eventListener = createEventLister();
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = o0O000o0.f57386OooO00o;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        o0O000Oo o0o000oo2 = new o0O000Oo(eventListener);
        Intrinsics.checkNotNullParameter(o0o000oo2, "<set-?>");
        oooO00o.f57290OooO0o0 = o0o000oo2;
        o00OO000 dns = new o00OO000() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.2
            @Override // p634o0ooO0oO.o00OO000
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
        if (!Intrinsics.areEqual(dns, oooO00o.f57294OooOO0O)) {
            oooO00o.f57311OooOoo = null;
        }
        Intrinsics.checkNotNullParameter(dns, "<set-?>");
        oooO00o.f57294OooOO0O = dns;
        o00O0OO0 connectionPool = getConnectPool();
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(connectionPool, "<set-?>");
        oooO00o.f57286OooO0O0 = connectionPool;
        oooO00o.f57288OooO0Oo.add(new o00OOO00() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.3
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
        long j = this.currentRequest.timeout;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0OO(j, timeUnit);
        oooO00o.OooO0Oo(this.currentRequest.timeout, timeUnit);
        oooO00o.OooO0o(60L, timeUnit);
        return new o00OOOO0(oooO00o);
    }

    private o00OOOOo.OooO00o createRequestBuilder(final IRequestClient.RequestClientProgress requestClientProgress) {
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
            oo0O.OooO0O0.OooO00o(string);
            oo0O.OooO0O0.OooO0O0(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        oo0O oo0o = new oo0O(strArr);
        if (this.currentRequest.httpMethod.equals("HEAD") || this.currentRequest.httpMethod.equals("GET")) {
            o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
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
        o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o();
        oooO00o2.OooOO0(this.currentRequest.urlString);
        oooO00o2.OooO0o0(oo0o);
        if (this.currentRequest.httpBody.length > 0) {
            Pattern pattern = o00OOO0.f57234OooO0o0;
            o00OOO0 o00ooo0OooO0O0 = o00OOO0.OooO00o.OooO0O0("application/octet-stream");
            String str2 = this.currentRequest.allHeaders.get("Content-Type");
            if (str2 != null) {
                o00ooo0OooO0O0 = o00OOO0.OooO00o.OooO0O0(str2);
            }
            byteBody = new ByteBody(o00ooo0OooO0O0, this.currentRequest.httpBody);
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

    private static synchronized o00O0OO0 getConnectPool() {
        if (pool == null) {
            pool = new o00O0OO0(10L, TimeUnit.MINUTES);
        }
        return pool;
    }

    private static String getOkHttpVersion() {
        try {
            try {
                try {
                    int i = o0o0Oo.f57338OooO00o;
                    return o0o0Oo.class.getField("VERSION").get(o0o0Oo.class) + "";
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
    public void handleResponse(Request request, o0oOOo o0oooo, IRequestClient.RequestClientCompleteHandler requestClientCompleteHandler) {
        String message;
        byte[] bArrOooO00o;
        synchronized (this) {
            if (this.hasHandleComplete) {
                return;
            }
            this.hasHandleComplete = true;
            int i = o0oooo.f57345OooO0oO;
            HashMap map = new HashMap();
            int length = o0oooo.f57341OooO.f57369OooO0Oo.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(o0oooo.f57341OooO.OooO0OO(i2).toLowerCase(), o0oooo.f57341OooO.OooO0o0(i2));
            }
            JSONObject jSONObjectBuildJsonResp = null;
            try {
                bArrOooO00o = o0oooo.f57347OooOO0.OooO00o();
                message = null;
            } catch (Exception e) {
                message = e.getMessage();
                bArrOooO00o = null;
            }
            if (bArrOooO00o == null) {
                message = o0oooo.f57343OooO0o;
            } else if (responseContentType(o0oooo) != "application/json") {
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
            Protocol protocol = o0oooo.f57344OooO0o0;
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

    private static String responseContentType(o0oOOo o0oooo) {
        o00OOO0 o00ooo0OooO0oO = o0oooo.f57347OooOO0.OooO0oO();
        if (o00ooo0OooO0oO == null) {
            return "";
        }
        return o00ooo0OooO0oO.f57236OooO0O0 + "/" + o00ooo0OooO0oO.f57237OooO0OO;
    }

    @Override // com.qiniu.android.http.request.IRequestClient
    public synchronized void cancel() {
        o00O00o0 o00o00o1 = this.call;
        if (o00o00o1 != null && !o00o00o1.isCanceled()) {
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
        o00OOOOo.OooO00o oooO00oCreateRequestBuilder = createRequestBuilder(requestClientProgress);
        if (oooO00oCreateRequestBuilder == null) {
            ResponseInfo responseInfoInvalidArgument = ResponseInfo.invalidArgument("invalid http request");
            handleError(request, responseInfoInvalidArgument.statusCode, responseInfoInvalidArgument.message, requestClientCompleteHandler);
            return;
        }
        ResponseTag responseTag = new ResponseTag();
        o00OOOO0 o00oooo1 = this.httpClient;
        oooO00oCreateRequestBuilder.OooO(Object.class, responseTag);
        oO0Oo0oo oo0oo0ooOooO0O0 = o00oooo1.OooO0O0(oooO00oCreateRequestBuilder.OooO0O0());
        this.call = oo0oo0ooOooO0O0;
        if (z) {
            FirebasePerfOkHttpClient.enqueue(oo0oo0ooOooO0O0, new oo00o() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.1
                @Override // p634o0ooO0oO.oo00o
                public void onFailure(o00O00o0 o00o00o1, IOException iOException) {
                    iOException.printStackTrace();
                    String message = iOException.getMessage();
                    int statusCodeByException = SystemHttpClient.this.getStatusCodeByException(iOException);
                    if (o00o00o1.isCanceled()) {
                        statusCodeByException = -2;
                        message = "user cancelled";
                    }
                    SystemHttpClient systemHttpClient = SystemHttpClient.this;
                    systemHttpClient.handleError(systemHttpClient.currentRequest, statusCodeByException, message, SystemHttpClient.this.completeHandler);
                }

                @Override // p634o0ooO0oO.oo00o
                public void onResponse(o00O00o0 o00o00o1, final o0oOOo o0oooo) throws IOException {
                    AsyncRun.runInBack(new Runnable() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SystemHttpClient systemHttpClient = SystemHttpClient.this;
                            systemHttpClient.handleResponse(systemHttpClient.currentRequest, o0oooo, SystemHttpClient.this.completeHandler);
                        }
                    });
                }
            });
            return;
        }
        try {
            handleResponse(request, FirebasePerfOkHttpClient.execute(oo0oo0ooOooO0O0), requestClientCompleteHandler);
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
