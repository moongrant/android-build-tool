package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExecutionContext {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AWSRequestMetrics f10387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<RequestHandler2> f10388OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AmazonWebServiceClient f10389OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AWSCredentials f10390OooO0Oo;

    public ExecutionContext(List<RequestHandler2> list, boolean z, AmazonWebServiceClient amazonWebServiceClient) {
        this.f10388OooO0O0 = list;
        this.f10387OooO00o = z ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
        this.f10389OooO0OO = amazonWebServiceClient;
    }

    public Signer OooO00o(URI uri) {
        AmazonWebServiceClient amazonWebServiceClient = this.f10389OooO0OO;
        if (amazonWebServiceClient == null) {
            return null;
        }
        return amazonWebServiceClient.getSignerByURI(uri);
    }

    public void OooO0O0(Signer signer) {
    }
}
