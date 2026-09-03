package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler<String> {
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.String] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<String> amazonWebServiceResponseOooO0OO = OooO0OO(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamOooO00o = httpResponse.OooO00o();
        while (true) {
            int i = inputStreamOooO00o.read(bArr);
            if (i <= 0) {
                amazonWebServiceResponseOooO0OO.f10275OooO00o = sb.toString();
                return amazonWebServiceResponseOooO0OO;
            }
            sb.append(new String(bArr, 0, i, StringUtils.f11186OooO00o));
        }
    }
}
