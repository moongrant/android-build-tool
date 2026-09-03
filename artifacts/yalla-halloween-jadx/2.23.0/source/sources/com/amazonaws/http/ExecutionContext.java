package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import com.amazonaws.util.AwsHostNameUtils;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutionContext {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AWSRequestMetrics f9081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<RequestHandler2> f9082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AmazonWebServiceClient f9083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AWSCredentials f9084OooO0Oo;

    public ExecutionContext(CopyOnWriteArrayList copyOnWriteArrayList, boolean z, AmazonWebServiceClient amazonWebServiceClient) {
        this.f9082OooO0O0 = copyOnWriteArrayList;
        this.f9081OooO00o = z ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
        this.f9083OooO0OO = amazonWebServiceClient;
    }

    public Signer OooO00o(URI uri) {
        AmazonWebServiceClient amazonWebServiceClient = this.f9083OooO0OO;
        if (amazonWebServiceClient == null) {
            return null;
        }
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String strOooOO0 = amazonWebServiceClient.OooOO0();
        return amazonWebServiceClient.OooO0oo(strOooOO0, AwsHostNameUtils.OooO00o(uri.getHost(), strOooOO0), true);
    }
}
