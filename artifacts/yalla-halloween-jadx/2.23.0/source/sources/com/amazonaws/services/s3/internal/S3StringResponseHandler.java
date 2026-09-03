package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler<String> {
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.String] */
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse amazonWebServiceResponseOooO0OO = AbstractS3ResponseHandler.OooO0OO(httpResponse);
        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamOooO00o = httpResponse.OooO00o();
        while (true) {
            int i = inputStreamOooO00o.read(bArr);
            if (i <= 0) {
                amazonWebServiceResponseOooO0OO.f8965OooO00o = sb.toString();
                return amazonWebServiceResponseOooO0OO;
            }
            sb.append(new String(bArr, 0, i, StringUtils.f9590OooO00o));
        }
    }
}
