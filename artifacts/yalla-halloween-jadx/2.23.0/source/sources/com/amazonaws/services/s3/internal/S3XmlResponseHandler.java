package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class S3XmlResponseHandler<T> extends AbstractS3ResponseHandler<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f9338OooO0o0 = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Unmarshaller<T, InputStream> f9339OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, String> f9340OooO0Oo;

    public S3XmlResponseHandler(Unmarshaller<T, InputStream> unmarshaller) {
        this.f9339OooO0OO = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceResponse<T> OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<T> amazonWebServiceResponseOooO0OO = AbstractS3ResponseHandler.OooO0OO(httpResponse);
        this.f9340OooO0Oo = httpResponse.f9093OooO0Oo;
        Unmarshaller<T, InputStream> unmarshaller = this.f9339OooO0OO;
        if (unmarshaller != null) {
            Log log = f9338OooO0o0;
            log.OooOO0("Beginning to parse service response XML");
            T tOooO00o = unmarshaller.OooO00o(httpResponse.OooO00o());
            log.OooOO0("Done parsing service response XML");
            amazonWebServiceResponseOooO0OO.f8965OooO00o = tOooO00o;
        }
        return amazonWebServiceResponseOooO0OO;
    }
}
