package com.amazonaws.http;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.Response;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class AmazonHttpClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HttpClient f10383OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ClientConfiguration f10384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RequestMetricCollector f10385OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HttpRequestFactory f10386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f10382OooO0o0 = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Log f10381OooO0o = LogFactory.OooO00o(AmazonHttpClient.class);

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        UrlHttpClient urlHttpClient = new UrlHttpClient(clientConfiguration);
        this.f10386OooO0Oo = new HttpRequestFactory();
        this.f10384OooO0O0 = clientConfiguration;
        this.f10383OooO00o = urlHttpClient;
        this.f10385OooO0OO = requestMetricCollector;
    }

    public static String OooO00o(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + ZegoConstants.ZegoVideoDataAuxPublishingStream + str2.trim();
    }

    public static boolean OooO0o(HttpResponse httpResponse) {
        int i = httpResponse.f10397OooO0O0;
        String str = httpResponse.f10399OooO0Oo.get("Location");
        return (i != 307 || str == null || str.isEmpty()) ? false : true;
    }

    public final void OooO(Request<?> request, Exception exc) {
        InputStream inputStream = ((DefaultRequest) request).f10285OooO;
        if (inputStream == null) {
            return;
        }
        if (!inputStream.markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            ((DefaultRequest) request).f10285OooO.reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    public final <T> Response<T> OooO0O0(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) throws Throwable {
        List<RequestHandler2> listEmptyList = executionContext.f10388OooO0O0;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        } else {
            for (RequestHandler2 requestHandler2 : listEmptyList) {
                if (requestHandler2 instanceof CredentialsRequestHandler) {
                    ((CredentialsRequestHandler) requestHandler2).f10379OooO00o = executionContext.f10390OooO0Oo;
                }
                requestHandler2.OooO0Oo(request);
            }
        }
        AWSRequestMetrics aWSRequestMetrics = executionContext.f10387OooO00o;
        try {
            Response<T> responseOooO0OO = OooO0OO(request, httpResponseHandler, httpResponseHandler2, executionContext);
            aWSRequestMetrics.f11165OooO00o.OooO0O0();
            Iterator<RequestHandler2> it = listEmptyList.iterator();
            while (it.hasNext()) {
                it.next().OooO0OO(request, responseOooO0OO);
            }
            return responseOooO0OO;
        } catch (AmazonClientException e) {
            Iterator<RequestHandler2> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                it2.next().OooO0O0(request, e);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0214 A[Catch: IOException -> 0x035e, all -> 0x036c, Error -> 0x0372, RuntimeException -> 0x0378, TRY_ENTER, TRY_LEAVE, TryCatch #31 {IOException -> 0x035e, Error -> 0x0372, RuntimeException -> 0x0378, all -> 0x036c, blocks: (B:75:0x01c0, B:101:0x0214), top: B:291:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ff A[Catch: Error -> 0x032b, RuntimeException -> 0x032e, IOException -> 0x0331, all -> 0x046c, TryCatch #11 {all -> 0x046c, blocks: (B:212:0x03e3, B:215:0x03ed, B:216:0x0403, B:218:0x0444, B:229:0x046b, B:139:0x02f9, B:141:0x02ff, B:143:0x0305, B:144:0x030e, B:154:0x032a), top: B:253:0x03e3 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0305 A[Catch: Error -> 0x032b, RuntimeException -> 0x032e, IOException -> 0x0331, all -> 0x046c, TryCatch #11 {all -> 0x046c, blocks: (B:212:0x03e3, B:215:0x03ed, B:216:0x0403, B:218:0x0444, B:229:0x046b, B:139:0x02f9, B:141:0x02ff, B:143:0x0305, B:144:0x030e, B:154:0x032a), top: B:253:0x03e3 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0318 A[Catch: IOException -> 0x031c, TRY_LEAVE, TryCatch #44 {IOException -> 0x031c, blocks: (B:147:0x0314, B:149:0x0318), top: B:283:0x0314 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x032a A[Catch: Error -> 0x032b, RuntimeException -> 0x032e, IOException -> 0x0331, all -> 0x046c, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x046c, blocks: (B:212:0x03e3, B:215:0x03ed, B:216:0x0403, B:218:0x0444, B:229:0x046b, B:139:0x02f9, B:141:0x02ff, B:143:0x0305, B:144:0x030e, B:154:0x032a), top: B:253:0x03e3 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03ed A[Catch: all -> 0x046c, TRY_ENTER, TryCatch #11 {all -> 0x046c, blocks: (B:212:0x03e3, B:215:0x03ed, B:216:0x0403, B:218:0x0444, B:229:0x046b, B:139:0x02f9, B:141:0x02ff, B:143:0x0305, B:144:0x030e, B:154:0x032a), top: B:253:0x03e3 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0444 A[Catch: all -> 0x046c, TRY_LEAVE, TryCatch #11 {all -> 0x046c, blocks: (B:212:0x03e3, B:215:0x03ed, B:216:0x0403, B:218:0x0444, B:229:0x046b, B:139:0x02f9, B:141:0x02ff, B:143:0x0305, B:144:0x030e, B:154:0x032a), top: B:253:0x03e3 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x044f A[Catch: IOException -> 0x0453, TRY_LEAVE, TryCatch #28 {IOException -> 0x0453, blocks: (B:221:0x044b, B:223:0x044f), top: B:270:0x044b }] */
    /* JADX WARN: Code duplicated, block: B:233:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180 A[Catch: Error -> 0x0113, RuntimeException -> 0x0117, IOException -> 0x0176, all -> 0x03be, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0176, blocks: (B:56:0x0162, B:58:0x016a, B:60:0x016f, B:61:0x0175, B:66:0x0180), top: B:247:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f2 A[Catch: IOException -> 0x01f6, TRY_LEAVE, TryCatch #3 {IOException -> 0x01f6, blocks: (B:85:0x01ee, B:87:0x01f2), top: B:245:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX WARN: Instruction removed from duplicated block: B:215:0x03ed, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0180, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.amazonaws.logging.Log] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.util.EnumMap, java.util.Map<com.amazonaws.RequestClientOptions$Marker, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.amazonaws.http.AmazonHttpClient] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.amazonaws.logging.Log] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.amazonaws.http.ExecutionContext] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <T> Response<T> OooO0OO(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) throws Throwable {
        String strOooO00o;
        ?? r9;
        Throwable th;
        String str;
        LinkedHashMap linkedHashMap;
        HashMap map;
        HttpRequest httpRequest;
        long j;
        Object obj;
        HttpResponse httpResponse;
        HttpRequest httpRequest2;
        Log log;
        AmazonClientException amazonClientException;
        InputStream inputStream;
        Signer signerOooO00o;
        Object obj2;
        String str2;
        Log log2;
        HttpRequest httpRequestOooO00o;
        Object obj3;
        int i;
        boolean z;
        Object obj4;
        InputStream inputStream2;
        int i2;
        Object obj5;
        Object obj6;
        AmazonServiceException amazonServiceException;
        InputStream inputStream3;
        Object obj7;
        AmazonServiceException amazonServiceExceptionOooO0Oo;
        RequestClientOptions requestClientOptions;
        ExecutionContext executionContext2 = executionContext;
        AWSRequestMetrics aWSRequestMetrics = executionContext2.f10387OooO00o;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.ServiceName, defaultRequest.f10290OooO0o);
        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.ServiceEndpoint, defaultRequest.f10291OooO0o0);
        String str3 = ClientConfiguration.f10277OooO0oO;
        AmazonWebServiceRequest amazonWebServiceRequest = defaultRequest.f10292OooO0oO;
        if (amazonWebServiceRequest == null || (requestClientOptions = amazonWebServiceRequest.f10273Oooo0oO) == null) {
            strOooO00o = str3;
        } else {
            String str4 = (String) requestClientOptions.f10296OooO00o.get(RequestClientOptions.Marker.USER_AGENT);
            if (str4 != null) {
                strOooO00o = OooO00o(str3, str4);
            } else {
                strOooO00o = str3;
            }
        }
        if (!str3.equals(this.f10384OooO0O0.f10279OooO00o)) {
            strOooO00o = OooO00o(strOooO00o, this.f10384OooO0O0.f10279OooO00o);
        }
        Objects.requireNonNull(this.f10384OooO0O0);
        defaultRequest.OooO00o("User-Agent", strOooO00o);
        defaultRequest.OooO00o("aws-sdk-invocation-id", UUID.randomUUID().toString());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(defaultRequest.f10288OooO0OO);
        HashMap map2 = new HashMap(defaultRequest.f10289OooO0Oo);
        InputStream inputStream4 = defaultRequest.f10285OooO;
        if (inputStream4 != null && inputStream4.markSupported()) {
            inputStream4.mark(-1);
        }
        AWSCredentials aWSCredentials = executionContext2.f10390OooO0Oo;
        long j2 = 0;
        int i3 = 0;
        HttpResponse httpResponseOooO00o = null;
        AmazonClientException amazonClientException2 = null;
        HttpRequest httpRequest3 = null;
        URI uriCreate = null;
        Signer signer = null;
        boolean zOooO0O0 = false;
        ?? r10 = executionContext2;
        while (true) {
            HttpRequest httpRequest4 = httpRequest3;
            int i4 = i3 + 1;
            long jOooO0oo = j2;
            aWSRequestMetrics.OooO0o0(AWSRequestMetrics.Field.RequestCount, i4);
            if (i4 > 1) {
                defaultRequest.f10288OooO0OO.clear();
                defaultRequest.f10288OooO0OO.putAll(linkedHashMap2);
                defaultRequest.f10289OooO0Oo.clear();
                defaultRequest.f10289OooO0Oo.putAll(map2);
                defaultRequest.f10285OooO = inputStream4;
            }
            if (uriCreate != null && defaultRequest.f10291OooO0o0 == null && defaultRequest.f10286OooO00o == null) {
                defaultRequest.f10291OooO0o0 = URI.create(uriCreate.getScheme() + "://" + uriCreate.getAuthority());
                defaultRequest.f10286OooO00o = uriCreate.getPath();
            }
            String str5 = "Cannot close the response content.";
            try {
                if (i4 > 1) {
                    try {
                        try {
                            try {
                                AWSRequestMetrics.Field field = AWSRequestMetrics.Field.RetryPauseTime;
                                aWSRequestMetrics.OooO0o(field);
                                try {
                                    jOooO0oo = OooO0oo(((DefaultRequest) request).f10292OooO0oO, amazonClientException2, i4, this.f10384OooO0O0.f10281OooO0OO);
                                    aWSRequestMetrics.OooO0O0(field);
                                    InputStream inputStream5 = ((DefaultRequest) request).f10285OooO;
                                    if (inputStream5 != null && inputStream5.markSupported()) {
                                        inputStream5.reset();
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    map = map2;
                                    j = jOooO0oo;
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(i4 - 1);
                                        sb.append("/");
                                        sb.append(j);
                                        defaultRequest.OooO00o("aws-sdk-retry", sb.toString());
                                        if (signer == null) {
                                            try {
                                                signerOooO00o = r10.OooO00o(((DefaultRequest) request).f10291OooO0o0);
                                            } catch (IOException e) {
                                                e = e;
                                                obj2 = "Cannot close the response content.";
                                                i4 = i4;
                                                httpRequest2 = httpRequest4;
                                                obj = null;
                                                httpResponse = httpResponseOooO00o;
                                                r10 = obj2;
                                                log = f10381OooO0o;
                                                if (log.OooO0OO()) {
                                                    log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                                                }
                                                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.Exception;
                                                aWSRequestMetrics.OooO0OO(field2);
                                                aWSRequestMetrics.OooO00o(field2, e);
                                                aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                                                amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                                    throw amazonClientException;
                                                }
                                                OooO(request, e);
                                                if (!zOooO0O0) {
                                                    try {
                                                        inputStream = httpResponse.f10398OooO0OO;
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                    } catch (IOException e2) {
                                                        f10381OooO0o.OooO0oO(r10, e2);
                                                    }
                                                }
                                                httpResponseOooO00o = httpResponse;
                                                httpRequest3 = httpRequest2;
                                                amazonClientException2 = amazonClientException;
                                                j2 = j;
                                                r10 = executionContext;
                                                i3 = i4;
                                                defaultRequest = defaultRequest;
                                                linkedHashMap2 = linkedHashMap;
                                                map2 = map;
                                            }
                                        } else {
                                            signerOooO00o = signer;
                                        }
                                        if (signerOooO00o != null && aWSCredentials != null) {
                                            try {
                                                AWSRequestMetrics.Field field3 = AWSRequestMetrics.Field.RequestSigningTime;
                                                aWSRequestMetrics.OooO0o(field3);
                                                try {
                                                    signerOooO00o.OooO0O0(request, aWSCredentials);
                                                    aWSRequestMetrics.OooO0O0(field3);
                                                } catch (Throwable th2) {
                                                    aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.RequestSigningTime);
                                                    throw th2;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                signer = signerOooO00o;
                                                obj2 = "Cannot close the response content.";
                                                i4 = i4;
                                                httpRequest2 = httpRequest4;
                                                obj = null;
                                            }
                                        }
                                        try {
                                            log2 = f10382OooO0o0;
                                            if (log2.OooO0OO()) {
                                                log2.OooO00o("Sending Request: " + request.toString());
                                            }
                                            httpRequestOooO00o = this.f10386OooO0Oo.OooO00o(request, this.f10384OooO0O0);
                                            try {
                                                AWSRequestMetrics.Field field4 = AWSRequestMetrics.Field.HttpRequestTime;
                                                aWSRequestMetrics.OooO0o(field4);
                                                try {
                                                    httpResponseOooO00o = ((UrlHttpClient) this.f10383OooO00o).OooO00o(httpRequestOooO00o);
                                                    try {
                                                        aWSRequestMetrics.OooO0O0(field4);
                                                        i = httpResponseOooO00o.f10397OooO0O0;
                                                        if (i >= 200 || i >= 300) {
                                                            z = false;
                                                        } else {
                                                            z = true;
                                                        }
                                                        if (z) {
                                                            try {
                                                                aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(i));
                                                                zOooO0O0 = httpResponseHandler.OooO0O0();
                                                                Response<T> response = new Response<>(OooO0o0(httpResponseHandler, httpResponseOooO00o, r10));
                                                                if (!zOooO0O0) {
                                                                    try {
                                                                        inputStream2 = httpResponseOooO00o.f10398OooO0OO;
                                                                        if (inputStream2 != null) {
                                                                            inputStream2.close();
                                                                        }
                                                                    } catch (IOException e4) {
                                                                        f10381OooO0o.OooO0oO("Cannot close the response content.", e4);
                                                                    }
                                                                }
                                                                return response;
                                                            } catch (Error e5) {
                                                                e = e5;
                                                                obj4 = "Cannot close the response content.";
                                                                AWSRequestMetrics.Field field5 = AWSRequestMetrics.Field.Exception;
                                                                aWSRequestMetrics.OooO0OO(field5);
                                                                aWSRequestMetrics.OooO00o(field5, e);
                                                                throw e;
                                                            } catch (RuntimeException e6) {
                                                                e = e6;
                                                                obj4 = "Cannot close the response content.";
                                                                AWSRequestMetrics.Field field6 = AWSRequestMetrics.Field.Exception;
                                                                aWSRequestMetrics.OooO0OO(field6);
                                                                aWSRequestMetrics.OooO00o(field6, e);
                                                                throw e;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                obj4 = "Cannot close the response content.";
                                                                th = th;
                                                                r9 = obj4;
                                                                if (zOooO0O0) {
                                                                    throw th;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (OooO0o(httpResponseOooO00o)) {
                                                            try {
                                                                try {
                                                                    String str6 = httpResponseOooO00o.f10399OooO0Oo.get("Location");
                                                                    Log log3 = f10381OooO0o;
                                                                    obj4 = "Cannot close the response content.";
                                                                    try {
                                                                        try {
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            i2 = i4;
                                                                            try {
                                                                                sb2.append("Redirecting to: ");
                                                                                sb2.append(str6);
                                                                                log3.OooO00o(sb2.toString());
                                                                                uriCreate = URI.create(str6);
                                                                                try {
                                                                                    ((DefaultRequest) request).f10291OooO0o0 = null;
                                                                                    ((DefaultRequest) request).f10286OooO00o = null;
                                                                                    aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(httpResponseOooO00o.f10397OooO0O0));
                                                                                    aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.RedirectLocation, str6);
                                                                                    obj5 = null;
                                                                                    try {
                                                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, null);
                                                                                        httpRequestOooO00o = httpRequestOooO00o;
                                                                                        j = j;
                                                                                        obj6 = obj4;
                                                                                        i4 = i2;
                                                                                        signerOooO00o = signerOooO00o;
                                                                                        defaultRequest = defaultRequest;
                                                                                        httpResponse = httpResponseOooO00o;
                                                                                        amazonServiceException = null;
                                                                                    } catch (IOException e7) {
                                                                                        e = e7;
                                                                                        signer = signerOooO00o;
                                                                                        obj2 = obj4;
                                                                                        i4 = i2;
                                                                                        httpRequest2 = httpRequestOooO00o;
                                                                                        obj = obj5;
                                                                                        httpResponse = httpResponseOooO00o;
                                                                                        r10 = obj2;
                                                                                        log = f10381OooO0o;
                                                                                        if (log.OooO0OO()) {
                                                                                            log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                                                                                        }
                                                                                        AWSRequestMetrics.Field field7 = AWSRequestMetrics.Field.Exception;
                                                                                        aWSRequestMetrics.OooO0OO(field7);
                                                                                        aWSRequestMetrics.OooO00o(field7, e);
                                                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                                                                                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                                                        if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                                                                            throw amazonClientException;
                                                                                        }
                                                                                        OooO(request, e);
                                                                                        if (!zOooO0O0) {
                                                                                            inputStream = httpResponse.f10398OooO0OO;
                                                                                            if (inputStream != null) {
                                                                                                inputStream.close();
                                                                                            }
                                                                                        }
                                                                                        httpResponseOooO00o = httpResponse;
                                                                                        httpRequest3 = httpRequest2;
                                                                                        amazonClientException2 = amazonClientException;
                                                                                    }
                                                                                } catch (IOException e8) {
                                                                                    e = e8;
                                                                                    obj5 = null;
                                                                                }
                                                                            } catch (IOException e9) {
                                                                                e = e9;
                                                                                obj5 = null;
                                                                            }
                                                                        } catch (IOException e10) {
                                                                            e = e10;
                                                                            i2 = i4;
                                                                        }
                                                                    } catch (Error e11) {
                                                                        e = e11;
                                                                        AWSRequestMetrics.Field field8 = AWSRequestMetrics.Field.Exception;
                                                                        aWSRequestMetrics.OooO0OO(field8);
                                                                        aWSRequestMetrics.OooO00o(field8, e);
                                                                        throw e;
                                                                    } catch (RuntimeException e12) {
                                                                        e = e12;
                                                                        AWSRequestMetrics.Field field9 = AWSRequestMetrics.Field.Exception;
                                                                        aWSRequestMetrics.OooO0OO(field9);
                                                                        aWSRequestMetrics.OooO00o(field9, e);
                                                                        throw e;
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        th = th;
                                                                        r9 = obj4;
                                                                        if (zOooO0O0) {
                                                                            throw th;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (IOException e13) {
                                                                    e = e13;
                                                                    obj4 = "Cannot close the response content.";
                                                                    i2 = i4;
                                                                }
                                                            } catch (IOException e14) {
                                                                e = e14;
                                                                obj4 = "Cannot close the response content.";
                                                            }
                                                        } else {
                                                            obj7 = "Cannot close the response content.";
                                                            i4 = i4;
                                                            try {
                                                                try {
                                                                    zOooO0O0 = httpResponseHandler2.OooO0O0();
                                                                    amazonServiceExceptionOooO0Oo = OooO0Oo(request, httpResponseHandler2, httpResponseOooO00o);
                                                                    try {
                                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, amazonServiceExceptionOooO0Oo.f10268Oooo0o);
                                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSErrorCode, amazonServiceExceptionOooO0Oo.OooO0O0());
                                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(amazonServiceExceptionOooO0Oo.f10267Oooo));
                                                                        obj3 = obj7;
                                                                        httpRequestOooO00o = httpRequestOooO00o;
                                                                        defaultRequest = defaultRequest;
                                                                        i4 = i4;
                                                                        httpResponse = httpResponseOooO00o;
                                                                        j = j;
                                                                        obj = null;
                                                                        signerOooO00o = signerOooO00o;
                                                                        try {
                                                                            if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequestOooO00o.f10394OooO0Oo, amazonServiceExceptionOooO0Oo, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                                                                throw amazonServiceExceptionOooO0Oo;
                                                                            }
                                                                            if (RetryUtils.OooO00o(amazonServiceExceptionOooO0Oo)) {
                                                                                SDKGlobalConfiguration.f10299OooO00o.set(OooO0oO(httpResponse, amazonServiceExceptionOooO0Oo));
                                                                            }
                                                                            OooO(request, amazonServiceExceptionOooO0Oo);
                                                                            amazonServiceException = amazonServiceExceptionOooO0Oo;
                                                                            obj6 = obj3;
                                                                        } catch (IOException e15) {
                                                                            e = e15;
                                                                            httpRequest2 = httpRequestOooO00o;
                                                                            signer = signerOooO00o;
                                                                            r10 = obj3;
                                                                            log = f10381OooO0o;
                                                                            if (log.OooO0OO()) {
                                                                                log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                                                                            }
                                                                            AWSRequestMetrics.Field field10 = AWSRequestMetrics.Field.Exception;
                                                                            aWSRequestMetrics.OooO0OO(field10);
                                                                            aWSRequestMetrics.OooO00o(field10, e);
                                                                            aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                                                                            amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                                            if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                                                                throw amazonClientException;
                                                                            }
                                                                            OooO(request, e);
                                                                            if (!zOooO0O0) {
                                                                                inputStream = httpResponse.f10398OooO0OO;
                                                                                if (inputStream != null) {
                                                                                    inputStream.close();
                                                                                }
                                                                            }
                                                                            httpResponseOooO00o = httpResponse;
                                                                            httpRequest3 = httpRequest2;
                                                                            amazonClientException2 = amazonClientException;
                                                                        } catch (Error e16) {
                                                                            e = e16;
                                                                            AWSRequestMetrics.Field field11 = AWSRequestMetrics.Field.Exception;
                                                                            aWSRequestMetrics.OooO0OO(field11);
                                                                            aWSRequestMetrics.OooO00o(field11, e);
                                                                            throw e;
                                                                        } catch (RuntimeException e17) {
                                                                            e = e17;
                                                                            AWSRequestMetrics.Field field12 = AWSRequestMetrics.Field.Exception;
                                                                            aWSRequestMetrics.OooO0OO(field12);
                                                                            aWSRequestMetrics.OooO00o(field12, e);
                                                                            throw e;
                                                                        }
                                                                    } catch (IOException e18) {
                                                                        e = e18;
                                                                        obj = null;
                                                                        obj3 = obj7;
                                                                        httpResponse = httpResponseOooO00o;
                                                                        httpRequest2 = httpRequestOooO00o;
                                                                        signer = signerOooO00o;
                                                                        r10 = obj3;
                                                                        log = f10381OooO0o;
                                                                        if (log.OooO0OO()) {
                                                                            log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                                                                        }
                                                                        AWSRequestMetrics.Field field13 = AWSRequestMetrics.Field.Exception;
                                                                        aWSRequestMetrics.OooO0OO(field13);
                                                                        aWSRequestMetrics.OooO00o(field13, e);
                                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                                                                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                                        if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                                                            throw amazonClientException;
                                                                        }
                                                                        OooO(request, e);
                                                                        if (!zOooO0O0) {
                                                                            inputStream = httpResponse.f10398OooO0OO;
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                        }
                                                                        httpResponseOooO00o = httpResponse;
                                                                        httpRequest3 = httpRequest2;
                                                                        amazonClientException2 = amazonClientException;
                                                                        j2 = j;
                                                                        r10 = executionContext;
                                                                        i3 = i4;
                                                                        defaultRequest = defaultRequest;
                                                                        linkedHashMap2 = linkedHashMap;
                                                                        map2 = map;
                                                                    }
                                                                } catch (IOException e19) {
                                                                    e = e19;
                                                                    obj = null;
                                                                }
                                                            } catch (Error e20) {
                                                                e = e20;
                                                                httpResponse = httpResponseOooO00o;
                                                            } catch (RuntimeException e21) {
                                                                e = e21;
                                                                httpResponse = httpResponseOooO00o;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                httpResponse = httpResponseOooO00o;
                                                                r10 = obj7;
                                                                httpResponseOooO00o = httpResponse;
                                                                th = th;
                                                                r9 = r10;
                                                                if (zOooO0O0) {
                                                                    throw th;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (!zOooO0O0) {
                                                            try {
                                                                inputStream3 = httpResponse.f10398OooO0OO;
                                                                if (inputStream3 != null) {
                                                                    inputStream3.close();
                                                                }
                                                            } catch (IOException e22) {
                                                                f10381OooO0o.OooO0oO(obj6, e22);
                                                            }
                                                        }
                                                        amazonClientException2 = amazonServiceException;
                                                        httpResponseOooO00o = httpResponse;
                                                        httpRequest3 = httpRequestOooO00o;
                                                        signer = signerOooO00o;
                                                        j2 = j;
                                                        r10 = executionContext;
                                                        i3 = i4;
                                                        defaultRequest = defaultRequest;
                                                        linkedHashMap2 = linkedHashMap;
                                                        map2 = map;
                                                        e = e13;
                                                        obj4 = "Cannot close the response content.";
                                                        i2 = i4;
                                                        obj5 = null;
                                                        signer = signerOooO00o;
                                                        obj2 = obj4;
                                                        i4 = i2;
                                                        httpRequest2 = httpRequestOooO00o;
                                                        obj = obj5;
                                                    } catch (IOException e23) {
                                                        e = e23;
                                                        obj3 = "Cannot close the response content.";
                                                        httpRequestOooO00o = httpRequestOooO00o;
                                                        i4 = i4;
                                                        j = j;
                                                        obj = null;
                                                    } catch (Error e24) {
                                                        e = e24;
                                                        httpResponse = httpResponseOooO00o;
                                                    } catch (RuntimeException e25) {
                                                        e = e25;
                                                        httpResponse = httpResponseOooO00o;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        r10 = "Cannot close the response content.";
                                                        httpResponse = httpResponseOooO00o;
                                                    }
                                                } catch (Throwable th7) {
                                                    obj = null;
                                                    try {
                                                        aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.HttpRequestTime);
                                                        throw th7;
                                                    } catch (IOException e26) {
                                                        e = e26;
                                                        httpRequest = httpRequestOooO00o;
                                                        str2 = str5;
                                                        signer = signerOooO00o;
                                                        str = str2;
                                                        httpResponse = httpResponseOooO00o;
                                                        httpRequest2 = httpRequest;
                                                        r10 = str;
                                                        log = f10381OooO0o;
                                                        if (log.OooO0OO()) {
                                                            log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                                                        }
                                                        AWSRequestMetrics.Field field14 = AWSRequestMetrics.Field.Exception;
                                                        aWSRequestMetrics.OooO0OO(field14);
                                                        aWSRequestMetrics.OooO00o(field14, e);
                                                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                                                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                        if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                                            throw amazonClientException;
                                                        }
                                                        OooO(request, e);
                                                        if (!zOooO0O0) {
                                                            inputStream = httpResponse.f10398OooO0OO;
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                        }
                                                        httpResponseOooO00o = httpResponse;
                                                        httpRequest3 = httpRequest2;
                                                        amazonClientException2 = amazonClientException;
                                                        j2 = j;
                                                        r10 = executionContext;
                                                        i3 = i4;
                                                        defaultRequest = defaultRequest;
                                                        linkedHashMap2 = linkedHashMap;
                                                        map2 = map;
                                                    } catch (Error e27) {
                                                        e = e27;
                                                        AWSRequestMetrics.Field field15 = AWSRequestMetrics.Field.Exception;
                                                        aWSRequestMetrics.OooO0OO(field15);
                                                        aWSRequestMetrics.OooO00o(field15, e);
                                                        throw e;
                                                    } catch (RuntimeException e28) {
                                                        e = e28;
                                                        AWSRequestMetrics.Field field16 = AWSRequestMetrics.Field.Exception;
                                                        aWSRequestMetrics.OooO0OO(field16);
                                                        aWSRequestMetrics.OooO00o(field16, e);
                                                        throw e;
                                                    }
                                                }
                                            } catch (IOException e29) {
                                                e = e29;
                                                obj = null;
                                            }
                                        } catch (IOException e30) {
                                            e = e30;
                                            str2 = "Cannot close the response content.";
                                            i4 = i4;
                                            signerOooO00o = signerOooO00o;
                                            defaultRequest = defaultRequest;
                                            j = j;
                                            obj = null;
                                            httpRequest = httpRequest4;
                                        }
                                        httpResponse = httpResponseOooO00o;
                                        r10 = obj2;
                                    } catch (IOException e31) {
                                        e = e31;
                                        str = "Cannot close the response content.";
                                        i4 = i4;
                                        defaultRequest = defaultRequest;
                                        j = j;
                                        obj = null;
                                        httpRequest = httpRequest4;
                                    }
                                } catch (Throwable th8) {
                                    aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.RetryPauseTime);
                                    throw th8;
                                }
                            } catch (IOException e32) {
                                e = e32;
                                str = "Cannot close the response content.";
                                i4 = i4;
                                linkedHashMap = linkedHashMap2;
                                map = map2;
                                httpRequest = httpRequest4;
                                j = jOooO0oo;
                                obj = null;
                                defaultRequest = defaultRequest;
                                httpResponse = httpResponseOooO00o;
                                httpRequest2 = httpRequest;
                                r10 = str;
                                log = f10381OooO0o;
                                if (log.OooO0OO()) {
                                    log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                                }
                                AWSRequestMetrics.Field field17 = AWSRequestMetrics.Field.Exception;
                                aWSRequestMetrics.OooO0OO(field17);
                                aWSRequestMetrics.OooO00o(field17, e);
                                aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                                amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                    throw amazonClientException;
                                }
                                OooO(request, e);
                                if (!zOooO0O0) {
                                    inputStream = httpResponse.f10398OooO0OO;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                }
                                httpResponseOooO00o = httpResponse;
                                httpRequest3 = httpRequest2;
                                amazonClientException2 = amazonClientException;
                                j2 = j;
                                r10 = executionContext;
                                i3 = i4;
                                defaultRequest = defaultRequest;
                                linkedHashMap2 = linkedHashMap;
                                map2 = map;
                            }
                            if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                                throw amazonClientException;
                            }
                            OooO(request, e);
                            if (!zOooO0O0 && httpResponse != null) {
                                inputStream = httpResponse.f10398OooO0OO;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            }
                            httpResponseOooO00o = httpResponse;
                            httpRequest3 = httpRequest2;
                            amazonClientException2 = amazonClientException;
                            j2 = j;
                            r10 = executionContext;
                            i3 = i4;
                            defaultRequest = defaultRequest;
                            linkedHashMap2 = linkedHashMap;
                            map2 = map;
                        } catch (Error e33) {
                            e = e33;
                            AWSRequestMetrics.Field field18 = AWSRequestMetrics.Field.Exception;
                            aWSRequestMetrics.OooO0OO(field18);
                            aWSRequestMetrics.OooO00o(field18, e);
                            throw e;
                        } catch (RuntimeException e34) {
                            e = e34;
                            AWSRequestMetrics.Field field19 = AWSRequestMetrics.Field.Exception;
                            aWSRequestMetrics.OooO0OO(field19);
                            aWSRequestMetrics.OooO00o(field19, e);
                            throw e;
                        } catch (Throwable th9) {
                            th = th9;
                            r10 = "Cannot close the response content.";
                            th = th;
                            r9 = r10;
                        }
                        log = f10381OooO0o;
                        if (log.OooO0OO()) {
                            log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                        }
                        AWSRequestMetrics.Field field110 = AWSRequestMetrics.Field.Exception;
                        aWSRequestMetrics.OooO0OO(field110);
                        aWSRequestMetrics.OooO00o(field110, e);
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                    } catch (Throwable th10) {
                        th = th10;
                        httpResponseOooO00o = httpResponse;
                        th = th;
                        r9 = r10;
                        if (zOooO0O0) {
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    linkedHashMap = linkedHashMap2;
                    map = map2;
                    j = jOooO0oo;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i4 - 1);
                    sb3.append("/");
                    sb3.append(j);
                    defaultRequest.OooO00o("aws-sdk-retry", sb3.toString());
                    if (signer == null) {
                        signerOooO00o = r10.OooO00o(((DefaultRequest) request).f10291OooO0o0);
                    } else {
                        signerOooO00o = signer;
                    }
                    if (signerOooO00o != null) {
                        AWSRequestMetrics.Field field20 = AWSRequestMetrics.Field.RequestSigningTime;
                        aWSRequestMetrics.OooO0o(field20);
                        signerOooO00o.OooO0O0(request, aWSCredentials);
                        aWSRequestMetrics.OooO0O0(field20);
                    }
                    log2 = f10382OooO0o0;
                    if (log2.OooO0OO()) {
                        log2.OooO00o("Sending Request: " + request.toString());
                    }
                    httpRequestOooO00o = this.f10386OooO0Oo.OooO00o(request, this.f10384OooO0O0);
                    AWSRequestMetrics.Field field21 = AWSRequestMetrics.Field.HttpRequestTime;
                    aWSRequestMetrics.OooO0o(field21);
                    httpResponseOooO00o = ((UrlHttpClient) this.f10383OooO00o).OooO00o(httpRequestOooO00o);
                    aWSRequestMetrics.OooO0O0(field21);
                    i = httpResponseOooO00o.f10397OooO0O0;
                    if (i >= 200) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(i));
                        zOooO0O0 = httpResponseHandler.OooO0O0();
                        Response<T> response2 = new Response<>(OooO0o0(httpResponseHandler, httpResponseOooO00o, r10));
                        if (!zOooO0O0) {
                            inputStream2 = httpResponseOooO00o.f10398OooO0OO;
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        }
                        return response2;
                    }
                    if (OooO0o(httpResponseOooO00o)) {
                        String str7 = httpResponseOooO00o.f10399OooO0Oo.get("Location");
                        Log log4 = f10381OooO0o;
                        obj4 = "Cannot close the response content.";
                        StringBuilder sb4 = new StringBuilder();
                        i2 = i4;
                        sb4.append("Redirecting to: ");
                        sb4.append(str7);
                        log4.OooO00o(sb4.toString());
                        uriCreate = URI.create(str7);
                        ((DefaultRequest) request).f10291OooO0o0 = null;
                        ((DefaultRequest) request).f10286OooO00o = null;
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(httpResponseOooO00o.f10397OooO0O0));
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.RedirectLocation, str7);
                        obj5 = null;
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, null);
                        httpRequestOooO00o = httpRequestOooO00o;
                        j = j;
                        obj6 = obj4;
                        i4 = i2;
                        signerOooO00o = signerOooO00o;
                        defaultRequest = defaultRequest;
                        httpResponse = httpResponseOooO00o;
                        amazonServiceException = null;
                    } else {
                        obj7 = "Cannot close the response content.";
                        i4 = i4;
                        zOooO0O0 = httpResponseHandler2.OooO0O0();
                        amazonServiceExceptionOooO0Oo = OooO0Oo(request, httpResponseHandler2, httpResponseOooO00o);
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, amazonServiceExceptionOooO0Oo.f10268Oooo0o);
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSErrorCode, amazonServiceExceptionOooO0Oo.OooO0O0());
                        aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(amazonServiceExceptionOooO0Oo.f10267Oooo));
                        obj3 = obj7;
                        httpRequestOooO00o = httpRequestOooO00o;
                        defaultRequest = defaultRequest;
                        i4 = i4;
                        httpResponse = httpResponseOooO00o;
                        j = j;
                        obj = null;
                        signerOooO00o = signerOooO00o;
                        if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequestOooO00o.f10394OooO0Oo, amazonServiceExceptionOooO0Oo, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                            throw amazonServiceExceptionOooO0Oo;
                        }
                        if (RetryUtils.OooO00o(amazonServiceExceptionOooO0Oo)) {
                            SDKGlobalConfiguration.f10299OooO00o.set(OooO0oO(httpResponse, amazonServiceExceptionOooO0Oo));
                        }
                        OooO(request, amazonServiceExceptionOooO0Oo);
                        amazonServiceException = amazonServiceExceptionOooO0Oo;
                        obj6 = obj3;
                    }
                    if (!zOooO0O0) {
                        inputStream3 = httpResponse.f10398OooO0OO;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                    }
                    amazonClientException2 = amazonServiceException;
                    httpResponseOooO00o = httpResponse;
                    httpRequest3 = httpRequestOooO00o;
                    signer = signerOooO00o;
                    j2 = j;
                    r10 = executionContext;
                    i3 = i4;
                    defaultRequest = defaultRequest;
                    linkedHashMap2 = linkedHashMap;
                    map2 = map;
                    e = e13;
                    obj4 = "Cannot close the response content.";
                    i2 = i4;
                    obj5 = null;
                    signer = signerOooO00o;
                    obj2 = obj4;
                    i4 = i2;
                    httpRequest2 = httpRequestOooO00o;
                    obj = obj5;
                    httpResponse = httpResponseOooO00o;
                    r10 = obj2;
                    log = f10381OooO0o;
                    if (log.OooO0OO()) {
                        log.OooO0O0("Unable to execute HTTP request: " + e.getMessage(), e);
                    }
                    AWSRequestMetrics.Field field111 = AWSRequestMetrics.Field.Exception;
                    aWSRequestMetrics.OooO0OO(field111);
                    aWSRequestMetrics.OooO00o(field111, e);
                    aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, obj);
                    amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                    if (OooOO0(((DefaultRequest) request).f10292OooO0oO, httpRequest2.f10394OooO0Oo, amazonClientException, i4, this.f10384OooO0O0.f10281OooO0OO)) {
                        throw amazonClientException;
                    }
                    OooO(request, e);
                    if (!zOooO0O0) {
                        inputStream = httpResponse.f10398OooO0OO;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                    httpResponseOooO00o = httpResponse;
                    httpRequest3 = httpRequest2;
                    amazonClientException2 = amazonClientException;
                    j2 = j;
                    r10 = executionContext;
                    i3 = i4;
                    defaultRequest = defaultRequest;
                    linkedHashMap2 = linkedHashMap;
                    map2 = map;
                }
            } catch (Throwable th11) {
                th = th11;
            }
            if (zOooO0O0 || httpResponseOooO00o == null) {
                throw th;
            }
            try {
                InputStream inputStream6 = httpResponseOooO00o.f10398OooO0OO;
                if (inputStream6 == null) {
                    throw th;
                }
                inputStream6.close();
                throw th;
            } catch (IOException e35) {
                f10381OooO0o.OooO0oO(r9, e35);
                throw th;
            }
        }
    }

    public final AmazonServiceException OooO0Oo(Request<?> request, HttpResponseHandler<AmazonServiceException> httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int i = httpResponse.f10397OooO0O0;
        try {
            amazonServiceException = httpResponseHandler.OooO00o(httpResponse);
            f10382OooO0o0.OooO00o("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (i == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.f10271OoooO00 = ((DefaultRequest) request).f10290OooO0o;
                amazonServiceException.f10267Oooo = 413;
                amazonServiceException.f10269Oooo0oO = "Request entity too large";
            } else {
                if (i != 503 || !"Service Unavailable".equalsIgnoreCase(httpResponse.f10396OooO00o)) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    }
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to unmarshall error response (");
                    sbOooO0o0.append(e.getMessage());
                    sbOooO0o0.append("). Response Code: ");
                    sbOooO0o0.append(i);
                    sbOooO0o0.append(", Response Text: ");
                    sbOooO0o0.append(httpResponse.f10396OooO00o);
                    sbOooO0o0.append(", Response Headers: ");
                    sbOooO0o0.append(httpResponse.f10399OooO0Oo);
                    throw new AmazonClientException(sbOooO0o0.toString(), e);
                }
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.f10271OoooO00 = ((DefaultRequest) request).f10290OooO0o;
                amazonServiceException.f10267Oooo = 503;
                amazonServiceException.f10269Oooo0oO = "Service unavailable";
            }
        }
        amazonServiceException.f10267Oooo = i;
        amazonServiceException.f10271OoooO00 = ((DefaultRequest) request).f10290OooO0o;
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    public final Object OooO0o0(HttpResponseHandler httpResponseHandler, HttpResponse httpResponse, ExecutionContext executionContext) throws IOException {
        try {
            AWSRequestMetrics aWSRequestMetrics = executionContext.f10387OooO00o;
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            aWSRequestMetrics.OooO0o(field);
            try {
                AmazonWebServiceResponse amazonWebServiceResponse = (AmazonWebServiceResponse) httpResponseHandler.OooO00o(httpResponse);
                aWSRequestMetrics.OooO0O0(field);
                if (amazonWebServiceResponse == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.f10397OooO0O0 + ", Response Text: " + httpResponse.f10396OooO00o);
                }
                Log log = f10382OooO0o0;
                if (log.OooO0OO()) {
                    log.OooO00o("Received successful response: " + httpResponse.f10397OooO0O0 + ", AWS Request ID: " + amazonWebServiceResponse.OooO00o());
                }
                aWSRequestMetrics.OooO00o(AWSRequestMetrics.Field.AWSRequestID, amazonWebServiceResponse.OooO00o());
                return amazonWebServiceResponse.f10275OooO00o;
            } catch (Throwable th) {
                aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to unmarshall response (");
            sbOooO0o0.append(e3.getMessage());
            sbOooO0o0.append("). Response Code: ");
            sbOooO0o0.append(httpResponse.f10397OooO0O0);
            sbOooO0o0.append(", Response Text: ");
            sbOooO0o0.append(httpResponse.f10396OooO00o);
            throw new AmazonClientException(sbOooO0o0.toString(), e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[Catch: RuntimeException -> 0x0056, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0056, blocks: (B:4:0x0011, B:11:0x001f, B:13:0x0031, B:15:0x003c, B:14:0x0036), top: B:23:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[Catch: RuntimeException -> 0x0056, TryCatch #0 {RuntimeException -> 0x0056, blocks: (B:4:0x0011, B:11:0x001f, B:13:0x0031, B:15:0x003c, B:14:0x0036), top: B:23:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[Catch: RuntimeException -> 0x0056, TryCatch #0 {RuntimeException -> 0x0056, blocks: (B:4:0x0011, B:11:0x001f, B:13:0x0031, B:15:0x003c, B:14:0x0036), top: B:23:0x0011 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public final int OooO0oO(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date dateOooO0oO;
        String message;
        int iIndexOf;
        Date date = new Date();
        String time = httpResponse.f10399OooO0Oo.get("Date");
        try {
            if (time != 0) {
                try {
                    if (time.isEmpty()) {
                        message = amazonServiceException.getMessage();
                        int iIndexOf2 = message.indexOf("(");
                        if (message.contains(" + 15")) {
                            iIndexOf = message.indexOf(" + 15");
                        } else {
                            iIndexOf = message.indexOf(" - 15");
                        }
                        dateOooO0oO = DateUtils.OooO0o0("yyyyMMdd'T'HHmmss'Z'", message.substring(iIndexOf2 + 1, iIndexOf));
                    } else {
                        dateOooO0oO = DateUtils.OooO0oO(time);
                    }
                } catch (RuntimeException e) {
                    e = e;
                    time = 0;
                    f10381OooO0o.OooO0oO("Unable to parse clock skew offset from response: " + time, e);
                    return 0;
                }
            } else {
                message = amazonServiceException.getMessage();
                int iIndexOf3 = message.indexOf("(");
                if (message.contains(" + 15")) {
                    iIndexOf = message.indexOf(" + 15");
                } else {
                    iIndexOf = message.indexOf(" - 15");
                }
                dateOooO0oO = DateUtils.OooO0o0("yyyyMMdd'T'HHmmss'Z'", message.substring(iIndexOf3 + 1, iIndexOf));
            }
            time = (int) ((date.getTime() - dateOooO0oO.getTime()) / 1000);
            return time;
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public final long OooO0oo(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = (i - 1) - 1;
        long jOooO00o = retryPolicy.f10569OooO0O0.OooO00o(i2);
        Log log = f10381OooO0o;
        if (log.OooO0OO()) {
            log.OooO00o("Retriable error detected, will retry in " + jOooO00o + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(jOooO00o);
            return jOooO00o;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    public final boolean OooOO0(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        int i3 = this.f10384OooO0O0.f10280OooO0O0;
        if (i3 < 0 || !retryPolicy.f10571OooO0Oo) {
            i3 = retryPolicy.f10570OooO0OO;
        }
        if (i2 >= i3) {
            return false;
        }
        if (inputStream == null || inputStream.markSupported()) {
            return retryPolicy.f10568OooO00o.OooO00o(amazonClientException, i2);
        }
        Log log = f10381OooO0o;
        if (log.OooO0OO()) {
            log.OooO00o("Content not repeatable");
        }
        return false;
    }

    public final void OooOO0O() {
        Objects.requireNonNull(this.f10383OooO00o);
    }

    public final void finalize() throws Throwable {
        OooOO0O();
        super.finalize();
    }

    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.f10386OooO0Oo = new HttpRequestFactory();
        this.f10384OooO0O0 = clientConfiguration;
        this.f10383OooO00o = httpClient;
        this.f10385OooO0OO = null;
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient, RequestMetricCollector requestMetricCollector) {
        this.f10386OooO0Oo = new HttpRequestFactory();
        this.f10384OooO0O0 = clientConfiguration;
        this.f10383OooO00o = httpClient;
        this.f10385OooO0OO = requestMetricCollector;
    }
}
