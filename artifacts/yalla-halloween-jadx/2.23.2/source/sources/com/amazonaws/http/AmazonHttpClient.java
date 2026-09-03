package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public class AmazonHttpClient {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f12166OooO0Oo = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f12167OooO0o0 = LogFactory.OooO00o(AmazonHttpClient.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HttpClient f12168OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ClientConfiguration f12169OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HttpRequestFactory f12170OooO0OO = new HttpRequestFactory();

    public AmazonHttpClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f12169OooO0O0 = clientConfiguration;
        this.f12168OooO00o = urlHttpClient;
    }

    public static void OooO(DefaultRequest defaultRequest, Exception exc) {
        InputStream inputStream = defaultRequest.f12065OooO;
        if (inputStream == null) {
            return;
        }
        if (!inputStream.markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            defaultRequest.f12065OooO.reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    public static String OooO00o(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + ZegoConstants.ZegoVideoDataAuxPublishingStream + str2.trim();
    }

    public static AmazonServiceException OooO0Oo(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        String str = defaultRequest.f12070OooO0o;
        int i = httpResponse.f12181OooO0O0;
        try {
            amazonServiceException = (AmazonServiceException) httpResponseHandler.OooO00o(httpResponse);
            f12166OooO0Oo.OooO0oO("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (i == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.f12042OooO0oo = str;
                amazonServiceException.f12041OooO0oO = 413;
                amazonServiceException.f12040OooO0o0 = "Request entity too large";
            } else {
                String str2 = httpResponse.f12180OooO00o;
                if (i != 503 || !"Service Unavailable".equalsIgnoreCase(str2)) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    }
                    throw new AmazonClientException("Unable to unmarshall error response (" + e.getMessage() + "). Response Code: " + i + ", Response Text: " + str2 + ", Response Headers: " + httpResponse.f12183OooO0Oo, e);
                }
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.f12042OooO0oo = str;
                amazonServiceException.f12041OooO0oO = YallaTeamMessage.JumpId.RoomList_Explore;
                amazonServiceException.f12040OooO0o0 = "Service unavailable";
            }
        }
        amazonServiceException.f12041OooO0oO = i;
        amazonServiceException.f12042OooO0oo = str;
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    public static boolean OooO0o(HttpResponse httpResponse) {
        String str = httpResponse.f12183OooO0Oo.get("Location");
        return (httpResponse.f12181OooO0O0 != 307 || str == null || str.isEmpty()) ? false : true;
    }

    public static Object OooO0o0(HttpResponseHandler httpResponseHandler, HttpResponse httpResponse, ExecutionContext executionContext) throws IOException {
        String str = httpResponse.f12180OooO00o;
        int i = httpResponse.f12181OooO0O0;
        try {
            AWSRequestMetrics aWSRequestMetrics = executionContext.f12171OooO00o;
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            aWSRequestMetrics.OooO0o(field);
            try {
                AmazonWebServiceResponse amazonWebServiceResponse = (AmazonWebServiceResponse) httpResponseHandler.OooO00o(httpResponse);
                aWSRequestMetrics.OooO0O0(field);
                if (amazonWebServiceResponse == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + i + ", Response Text: " + str);
                }
                Log log = f12166OooO0Oo;
                String str2 = null;
                if (log.OooO0O0()) {
                    StringBuilder sb = new StringBuilder("Received successful response: ");
                    sb.append(i);
                    sb.append(", AWS Request ID: ");
                    ResponseMetadata responseMetadata = amazonWebServiceResponse.f12056OooO0O0;
                    sb.append(responseMetadata == null ? null : responseMetadata.f12078OooO00o.get("AWS_REQUEST_ID"));
                    log.OooO0oO(sb.toString());
                }
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.AWSRequestID;
                ResponseMetadata responseMetadata2 = amazonWebServiceResponse.f12056OooO0O0;
                if (responseMetadata2 != null) {
                    str2 = responseMetadata2.f12078OooO00o.get("AWS_REQUEST_ID");
                }
                aWSRequestMetrics.OooO00o(field2, str2);
                return amazonWebServiceResponse.f12055OooO00o;
            } catch (Throwable th) {
                aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new AmazonClientException("Unable to unmarshall response (" + e3.getMessage() + "). Response Code: " + i + ", Response Text: " + str, e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[Catch: RuntimeException -> 0x0056, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0056, blocks: (B:4:0x0011, B:11:0x001f, B:13:0x0031, B:15:0x003c, B:14:0x0036), top: B:23:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[Catch: RuntimeException -> 0x0056, TryCatch #0 {RuntimeException -> 0x0056, blocks: (B:4:0x0011, B:11:0x001f, B:13:0x0031, B:15:0x003c, B:14:0x0036), top: B:23:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[Catch: RuntimeException -> 0x0056, TryCatch #0 {RuntimeException -> 0x0056, blocks: (B:4:0x0011, B:11:0x001f, B:13:0x0031, B:15:0x003c, B:14:0x0036), top: B:23:0x0011 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public static int OooO0oO(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date dateOooO0o0;
        String message;
        int iIndexOf;
        Date date = new Date();
        String time = httpResponse.f12183OooO0Oo.get("Date");
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
                        dateOooO0o0 = DateUtils.OooO0OO("yyyyMMdd'T'HHmmss'Z'", message.substring(iIndexOf2 + 1, iIndexOf));
                    } else {
                        dateOooO0o0 = DateUtils.OooO0o0(time);
                    }
                } catch (RuntimeException e) {
                    e = e;
                    time = 0;
                    f12167OooO0o0.OooOO0O(o00O00OO.OooO00o("Unable to parse clock skew offset from response: ", time), e);
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
                dateOooO0o0 = DateUtils.OooO0OO("yyyyMMdd'T'HHmmss'Z'", message.substring(iIndexOf3 + 1, iIndexOf));
            }
            time = (int) ((date.getTime() - dateOooO0o0.getTime()) / 1000);
            return time;
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public static long OooO0oo(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = (i - 1) - 1;
        long jOooO00o = retryPolicy.f12339OooO0O0.OooO00o(i2);
        Log log = f12167OooO0o0;
        if (log.OooO0O0()) {
            log.OooO0oO("Retriable error detected, will retry in " + jOooO00o + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(jOooO00o);
            return jOooO00o;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    public final Response OooO0O0(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponseHandler httpResponseHandler2, ExecutionContext executionContext) {
        List<RequestHandler2> listEmptyList = executionContext.f12172OooO0O0;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        } else {
            for (RequestHandler2 requestHandler2 : listEmptyList) {
                if (requestHandler2 instanceof CredentialsRequestHandler) {
                    ((CredentialsRequestHandler) requestHandler2).f12164OooO00o = executionContext.f12174OooO0Oo;
                }
                requestHandler2.OooO0OO(defaultRequest);
            }
        }
        AWSRequestMetrics aWSRequestMetrics = executionContext.f12171OooO00o;
        try {
            Response responseOooO0OO = OooO0OO(defaultRequest, httpResponseHandler, httpResponseHandler2, executionContext);
            aWSRequestMetrics.f12659OooO00o.OooO0O0();
            Iterator<RequestHandler2> it = listEmptyList.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0(defaultRequest, responseOooO0OO);
            }
            return responseOooO0OO;
        } catch (AmazonClientException e) {
            Iterator<RequestHandler2> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                it2.next().OooO00o(defaultRequest, e);
            }
            throw e;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final com.amazonaws.Response OooO0OO(com.amazonaws.DefaultRequest r35, com.amazonaws.http.HttpResponseHandler r36, com.amazonaws.http.HttpResponseHandler r37, com.amazonaws.http.ExecutionContext r38) {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.AmazonHttpClient.OooO0OO(com.amazonaws.DefaultRequest, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.ExecutionContext):com.amazonaws.Response");
    }

    public final boolean OooOO0(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        int i3 = this.f12169OooO0O0.f12060OooO0O0;
        if (i3 < 0 || !retryPolicy.f12341OooO0Oo) {
            i3 = retryPolicy.f12340OooO0OO;
        }
        if (i2 >= i3) {
            return false;
        }
        if (inputStream == null || inputStream.markSupported()) {
            return retryPolicy.f12338OooO00o.OooO00o(amazonClientException, i2);
        }
        Log log = f12167OooO0o0;
        if (log.OooO0O0()) {
            log.OooO0oO("Content not repeatable");
        }
        return false;
    }

    public final void finalize() throws Throwable {
        this.f12168OooO00o.getClass();
        super.finalize();
    }
}
