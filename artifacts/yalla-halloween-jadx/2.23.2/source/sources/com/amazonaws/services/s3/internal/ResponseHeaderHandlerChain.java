package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseHeaderHandlerChain<T> extends S3XmlResponseHandler<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<HeaderHandler<T>> f12419OooO0o;

    public ResponseHeaderHandlerChain(Unmarshaller<T, InputStream> unmarshaller, HeaderHandler<T>... headerHandlerArr) {
        super(unmarshaller);
        this.f12419OooO0o = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: OooO0o0 */
    public final AmazonWebServiceResponse<T> OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<T> amazonWebServiceResponseOooO00o = super.OooO00o(httpResponse);
        T t = amazonWebServiceResponseOooO00o.f12055OooO00o;
        if (t != null) {
            Iterator<HeaderHandler<T>> it = this.f12419OooO0o.iterator();
            while (it.hasNext()) {
                it.next().OooO00o(t, httpResponse);
            }
        }
        return amazonWebServiceResponseOooO00o;
    }
}
