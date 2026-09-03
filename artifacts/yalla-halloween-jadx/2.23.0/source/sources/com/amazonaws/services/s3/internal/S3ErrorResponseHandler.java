package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XpathUtils;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f9331OooO00o = LogFactory.OooO00o(S3ErrorResponseHandler.class);

    public static AmazonS3Exception OooO0OO(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        StringBuilder sb = new StringBuilder();
        int i = httpResponse.f9091OooO0O0;
        sb.append(i);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(httpResponse.f9090OooO00o);
        amazonS3Exception.f8950OooO0o0 = sb.toString();
        amazonS3Exception.f8951OooO0oO = i;
        Map<String, String> map = httpResponse.f9093OooO0Oo;
        amazonS3Exception.f8948OooO0Oo = map.get("x-amz-request-id");
        amazonS3Exception.f9364OooO = map.get("x-amz-id-2");
        map.get("X-Amz-Cf-Id");
        HashMap map2 = new HashMap();
        map2.put("x-amz-bucket-region", map.get("x-amz-bucket-region"));
        amazonS3Exception.f9365OooOO0 = map2;
        return amazonS3Exception;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final AmazonServiceException OooO00o(HttpResponse httpResponse) throws Exception {
        Log log = f9331OooO00o;
        InputStream inputStreamOooO00o = httpResponse.OooO00o();
        String str = httpResponse.f9090OooO00o;
        if (inputStreamOooO00o == null) {
            return OooO0OO(str, httpResponse);
        }
        try {
            int i = IOUtils.f9582OooO0Oo;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStreamOooO00o.read(bArr);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String str2 = new String(byteArray, StringUtils.f9590OooO00o);
                        try {
                            Document documentOooO0O0 = XpathUtils.OooO0O0(str2);
                            String strOooO00o = XpathUtils.OooO00o("Error/Message", documentOooO0O0);
                            String strOooO00o2 = XpathUtils.OooO00o("Error/Code", documentOooO0O0);
                            String strOooO00o3 = XpathUtils.OooO00o("Error/RequestId", documentOooO0O0);
                            String strOooO00o4 = XpathUtils.OooO00o("Error/HostId", documentOooO0O0);
                            AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strOooO00o);
                            amazonS3Exception.f8951OooO0oO = httpResponse.f9091OooO0O0;
                            amazonS3Exception.f8950OooO0o0 = strOooO00o2;
                            amazonS3Exception.f8948OooO0Oo = strOooO00o3;
                            amazonS3Exception.f9364OooO = strOooO00o4;
                            httpResponse.f9093OooO0Oo.get("X-Amz-Cf-Id");
                            return amazonS3Exception;
                        } catch (Exception e) {
                            if (log.OooO0O0()) {
                                log.OooO00o("Failed in parsing the response as XML: ".concat(str2), e);
                            }
                            return OooO0OO(str2, httpResponse);
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e2) {
            if (log.OooO0O0()) {
                log.OooO00o("Failed in reading the error response", e2);
            }
            return OooO0OO(str, httpResponse);
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final boolean OooO0O0() {
        return false;
    }
}
