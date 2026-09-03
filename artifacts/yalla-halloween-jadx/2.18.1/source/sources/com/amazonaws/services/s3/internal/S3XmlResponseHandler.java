package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class S3XmlResponseHandler<T> extends AbstractS3ResponseHandler<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f10675OooO0o0 = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Unmarshaller<T, InputStream> f10676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, String> f10677OooO0Oo;

    public S3XmlResponseHandler(Unmarshaller<T, InputStream> unmarshaller) {
        this.f10676OooO0OO = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceResponse<T> OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<T> amazonWebServiceResponseOooO0OO = OooO0OO(httpResponse);
        this.f10677OooO0Oo = httpResponse.f10399OooO0Oo;
        if (this.f10676OooO0OO != null) {
            Log log = f10675OooO0o0;
            log.OooOO0O("Beginning to parse service response XML");
            T tOooO00o = this.f10676OooO0OO.OooO00o(httpResponse.OooO00o());
            log.OooOO0O("Done parsing service response XML");
            amazonWebServiceResponseOooO0OO.f10275OooO00o = tOooO00o;
        }
        return amazonWebServiceResponseOooO0OO;
    }
}
