package com.qiniu.android.http.request.httpclient;

import com.app.base.interfaceType.FeedbackType;
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
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.json.JSONObject;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O00O;
import p660o0ooo0o0.o00O0OO0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.oOO00O;
import p660o0ooo0o0.oo0O;
import p660o0ooo0o0.oo0o0O0;
import p660o0ooo0o0.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public class SystemHttpClient implements IRequestClient {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private static oOO00O pool;
    private o0O0ooO call;
    private IRequestClient.RequestClientCompleteHandler completeHandler;
    private Request currentRequest;
    private boolean hasHandleComplete = false;
    private o00OO httpClient;
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

    private oo0o0O0 createEventLister() {
        return new oo0o0O0() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.5
            @Override // p660o0ooo0o0.oo0o0O0
            public void callEnd(o0O0ooO o0o0ooo) {
                SystemHttpClient.this.metrics.endDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void callFailed(o0O0ooO o0o0ooo, IOException iOException) {
                SystemHttpClient.this.metrics.endDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void callStart(o0O0ooO o0o0ooo) {
                SystemHttpClient.this.metrics.startDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void connectEnd(o0O0ooO o0o0ooo, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
                SystemHttpClient.this.metrics.secureConnectionEndDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void connectFailed(o0O0ooO o0o0ooo, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
                SystemHttpClient.this.metrics.connectEndDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void connectStart(o0O0ooO o0o0ooo, InetSocketAddress inetSocketAddress, Proxy proxy) {
                SystemHttpClient.this.metrics.connectStartDate = new Date();
                if (inetSocketAddress == null || inetSocketAddress.getAddress() == null) {
                    return;
                }
                SystemHttpClient.this.metrics.remoteAddress = inetSocketAddress.getAddress().getHostAddress();
                SystemHttpClient.this.metrics.remotePort = Integer.valueOf(inetSocketAddress.getPort());
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void connectionAcquired(o0O0ooO o0o0ooo, o00O00O o00o00o2) {
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void connectionReleased(o0O0ooO o0o0ooo, o00O00O o00o00o2) {
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void dnsEnd(o0O0ooO o0o0ooo, String str, List<InetAddress> list) {
                SystemHttpClient.this.metrics.domainLookupEndDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void dnsStart(o0O0ooO o0o0ooo, String str) {
                SystemHttpClient.this.metrics.domainLookupStartDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void requestBodyEnd(o0O0ooO o0o0ooo, long j) {
                SystemHttpClient.this.metrics.requestEndDate = new Date();
                SystemHttpClient.this.metrics.countOfRequestBodyBytesSent = j;
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void requestBodyStart(o0O0ooO o0o0ooo) {
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void requestFailed(o0O0ooO o0o0ooo, IOException iOException) {
                SystemHttpClient.this.metrics.requestEndDate = new Date();
                SystemHttpClient.this.metrics.countOfRequestBodyBytesSent = 0L;
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void requestHeadersEnd(o0O0ooO o0o0ooo, o00OOO00 o00ooo01) {
                SystemHttpClient.this.metrics.countOfRequestHeaderBytesSent = o00ooo01.f51427OooO0Oo.toString().length();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void requestHeadersStart(o0O0ooO o0o0ooo) {
                SystemHttpClient.this.metrics.requestStartDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void responseBodyEnd(o0O0ooO o0o0ooo, long j) {
                SystemHttpClient.this.metrics.responseEndDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void responseBodyStart(o0O0ooO o0o0ooo) {
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void responseFailed(o0O0ooO o0o0ooo, IOException iOException) {
                SystemHttpClient.this.metrics.responseEndDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void responseHeadersEnd(o0O0ooO o0o0ooo, o00OOOO0 o00oooo1) {
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void responseHeadersStart(o0O0ooO o0o0ooo) {
                SystemHttpClient.this.metrics.responseStartDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void secureConnectEnd(o0O0ooO o0o0ooo, oo0oOO0 oo0ooo0) {
                SystemHttpClient.this.metrics.secureConnectionStartDate = new Date();
            }

            @Override // p660o0ooo0o0.oo0o0O0
            public void secureConnectStart(o0O0ooO o0o0ooo) {
                SystemHttpClient.this.metrics.connectEndDate = new Date();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00OO00O>] */
    private o00OO createHttpClient(ProxyConfiguration proxyConfiguration) {
        if (this.currentRequest == null) {
            return null;
        }
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
        oooO00o.OooO0o0(createEventLister());
        oooO00o.OooO0Oo(new o00O0OO0() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.2
            @Override // p660o0ooo0o0.o00O0OO0
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                if (SystemHttpClient.this.currentRequest.getInetAddress() == null || !str.equals(SystemHttpClient.this.currentRequest.host)) {
                    return new SystemDns().lookupInetAddress(str);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(SystemHttpClient.this.currentRequest.getInetAddress());
                return arrayList;
            }
        });
        oOO00O connectionPool = getConnectPool();
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        oooO00o.f51351OooO0O0 = connectionPool;
        oooO00o.f51353OooO0Oo.add(new o00OO00O() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.3
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
        long j = this.currentRequest.timeout;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0OO(j, timeUnit);
        oooO00o.OooO0oO(this.currentRequest.timeout, timeUnit);
        oooO00o.OooO(60L);
        return new o00OO(oooO00o);
    }

    private o00OOO00.OooO00o createRequestBuilder(final IRequestClient.RequestClientProgress requestClientProgress) {
        ByteBody byteBody;
        Request request = this.currentRequest;
        if (request == null) {
            return null;
        }
        Map<String, String> toHeaders = request.allHeaders;
        o00O.OooO0O0 oooO0O0 = o00O.f51229Oooo0oO;
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        String[] strArr = new String[toHeaders.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
            String string = StringsKt.trim((CharSequence) key).toString();
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
            String string2 = StringsKt.trim((CharSequence) value).toString();
            oooO0O0.OooO00o(string);
            oooO0O0.OooO0O0(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        o00O o00o2 = new o00O(strArr);
        if (this.currentRequest.httpMethod.equals(Request.HttpMethodHEAD) || this.currentRequest.httpMethod.equals(Request.HttpMethodGet)) {
            o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
            oooO00o.OooO0Oo();
            oooO00o.OooOO0o(this.currentRequest.urlString);
            for (String str : this.currentRequest.allHeaders.keySet()) {
                oooO00o.OooO0o0(str, this.currentRequest.allHeaders.get(str));
            }
            return oooO00o;
        }
        if (!this.currentRequest.httpMethod.equals(Request.HttpMethodPOST) && !this.currentRequest.httpMethod.equals(Request.HttpMethodPUT)) {
            return null;
        }
        o00OOO00.OooO00o oooO00o2 = new o00OOO00.OooO00o();
        oooO00o2.OooOO0o(this.currentRequest.urlString);
        oooO00o2.OooO0o(o00o2);
        if (this.currentRequest.httpBody.length > 0) {
            o00OO0O0.OooO00o oooO00o3 = o00OO0O0.f51401OooO0oO;
            o00OO0O0 o00oo0o0OooO0O0 = oooO00o3.OooO0O0("application/octet-stream");
            String str2 = this.currentRequest.allHeaders.get("Content-Type");
            if (str2 != null) {
                o00oo0o0OooO0O0 = oooO00o3.OooO0O0(str2);
            }
            byteBody = new ByteBody(o00oo0o0OooO0O0, this.currentRequest.httpBody);
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
        if (this.currentRequest.httpMethod.equals(Request.HttpMethodPOST)) {
            oooO00o2.OooO0oo(body);
        } else if (this.currentRequest.httpMethod.equals(Request.HttpMethodPUT)) {
            Intrinsics.checkNotNullParameter(body, "body");
            oooO00o2.OooO0oO(Request.HttpMethodPUT, body);
        }
        return oooO00o2;
    }

    private static synchronized oOO00O getConnectPool() {
        if (pool == null) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            pool = new oOO00O(10L);
        }
        return pool;
    }

    private static String getOkHttpVersion() {
        try {
            try {
                try {
                    int i = oo0O.f51481OooO00o;
                    return oo0O.class.getField("VERSION").get(oo0O.class) + "";
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
            return ResponseInfo.TimedOut;
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
    public void handleResponse(Request request, o00OOOO0 o00oooo1, IRequestClient.RequestClientCompleteHandler requestClientCompleteHandler) {
        String message;
        byte[] bArrOooO0O0;
        synchronized (this) {
            if (this.hasHandleComplete) {
                return;
            }
            this.hasHandleComplete = true;
            int i = o00oooo1.f51443OoooO00;
            HashMap map = new HashMap();
            int length = o00oooo1.f51444OoooO0O.f51230Oooo0o.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(o00oooo1.f51444OoooO0O.OooO0O0(i2).toLowerCase(), o00oooo1.f51444OoooO0O.OooO0o0(i2));
            }
            JSONObject jSONObjectBuildJsonResp = null;
            try {
                bArrOooO0O0 = o00oooo1.f51441OoooO.OooO0O0();
                message = null;
            } catch (Exception e) {
                message = e.getMessage();
                bArrOooO0O0 = null;
            }
            if (bArrOooO0O0 == null) {
                message = o00oooo1.f51437Oooo;
            } else if (responseContentType(o00oooo1) != "application/json") {
                String str = new String(bArrOooO0O0);
                if (str.length() > 0) {
                    try {
                        jSONObjectBuildJsonResp = new JSONObject(str);
                    } catch (Exception unused) {
                    }
                }
            } else {
                try {
                    jSONObjectBuildJsonResp = buildJsonResp(bArrOooO0O0);
                } catch (Exception e2) {
                    message = e2.getMessage();
                    i = -1015;
                }
            }
            ResponseInfo responseInfoCreate = ResponseInfo.create(request, i, map, jSONObjectBuildJsonResp, message);
            UploadSingleRequestMetrics uploadSingleRequestMetrics = this.metrics;
            uploadSingleRequestMetrics.response = responseInfoCreate;
            uploadSingleRequestMetrics.request = request;
            Protocol protocol = o00oooo1.f51440Oooo0oo;
            if (protocol == Protocol.HTTP_1_0) {
                uploadSingleRequestMetrics.httpVersion = "1.0";
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

    private static String responseContentType(o00OOOO0 o00oooo1) {
        o00OO0O0 o00oo0o0OooO0o = o00oooo1.f51441OoooO.OooO0o();
        if (o00oo0o0OooO0o == null) {
            return "";
        }
        return o00oo0o0OooO0o.f51403OooO0O0 + "/" + o00oo0o0OooO0o.f51404OooO0OO;
    }

    @Override // com.qiniu.android.http.request.IRequestClient
    public synchronized void cancel() {
        o0O0ooO o0o0ooo = this.call;
        if (o0o0ooo != null && !o0o0ooo.OooO0oo()) {
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
        o00OOO00.OooO00o oooO00oCreateRequestBuilder = createRequestBuilder(requestClientProgress);
        if (oooO00oCreateRequestBuilder == null) {
            ResponseInfo responseInfoInvalidArgument = ResponseInfo.invalidArgument("invalid http request");
            handleError(request, responseInfoInvalidArgument.statusCode, responseInfoInvalidArgument.message, requestClientCompleteHandler);
            return;
        }
        ResponseTag responseTag = new ResponseTag();
        o00OO o00oo2 = this.httpClient;
        oooO00oCreateRequestBuilder.OooOO0(Object.class, responseTag);
        o0O0ooO o0o0oooOooO0OO = o00oo2.OooO0OO(oooO00oCreateRequestBuilder.OooO0O0());
        this.call = o0o0oooOooO0OO;
        if (z) {
            o0o0oooOooO0OO.OoooO0O(new o00oOoo() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.1
                @Override // p660o0ooo0o0.o00oOoo
                public void onFailure(o0O0ooO o0o0ooo, IOException iOException) {
                    iOException.printStackTrace();
                    String message = iOException.getMessage();
                    int statusCodeByException = SystemHttpClient.this.getStatusCodeByException(iOException);
                    if (o0o0ooo.OooO0oo()) {
                        statusCodeByException = -2;
                        message = "user cancelled";
                    }
                    SystemHttpClient systemHttpClient = SystemHttpClient.this;
                    systemHttpClient.handleError(systemHttpClient.currentRequest, statusCodeByException, message, SystemHttpClient.this.completeHandler);
                }

                @Override // p660o0ooo0o0.o00oOoo
                public void onResponse(o0O0ooO o0o0ooo, final o00OOOO0 o00oooo1) throws IOException {
                    AsyncRun.runInBack(new Runnable() { // from class: com.qiniu.android.http.request.httpclient.SystemHttpClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SystemHttpClient systemHttpClient = SystemHttpClient.this;
                            systemHttpClient.handleResponse(systemHttpClient.currentRequest, o00oooo1, SystemHttpClient.this.completeHandler);
                        }
                    });
                }
            });
            return;
        }
        try {
            handleResponse(request, o0o0oooOooO0OO.OooO0O0(), requestClientCompleteHandler);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            int statusCodeByException = getStatusCodeByException(e);
            if (this.call.OooO0oo()) {
                statusCodeByException = -2;
                message = "user cancelled";
            }
            handleError(request, statusCodeByException, message, requestClientCompleteHandler);
        }
    }
}
