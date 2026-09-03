package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10664OooO00o = LogFactory.OooO00o(S3ErrorResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    public final AmazonServiceException OooO00o(HttpResponse httpResponse) throws Exception {
        InputStream inputStreamOooO00o = httpResponse.OooO00o();
        if (inputStreamOooO00o == null) {
            return OooO0OO(httpResponse.f10396OooO00o, httpResponse);
        }
        try {
            String strOooO00o = IOUtils.OooO00o(inputStreamOooO00o);
            try {
                Document documentOooO0O0 = XpathUtils.OooO0O0(strOooO00o);
                String strOooO00o2 = XpathUtils.OooO00o("Error/Message", documentOooO0O0);
                String strOooO00o3 = XpathUtils.OooO00o("Error/Code", documentOooO0O0);
                String strOooO00o4 = XpathUtils.OooO00o("Error/RequestId", documentOooO0O0);
                String strOooO00o5 = XpathUtils.OooO00o("Error/HostId", documentOooO0O0);
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strOooO00o2);
                amazonS3Exception.f10267Oooo = httpResponse.f10397OooO0O0;
                amazonS3Exception.f10269Oooo0oO = strOooO00o3;
                amazonS3Exception.f10268Oooo0o = strOooO00o4;
                amazonS3Exception.f10706OoooO0 = strOooO00o5;
                httpResponse.f10399OooO0Oo.get("X-Amz-Cf-Id");
                return amazonS3Exception;
            } catch (Exception e) {
                Log log = f10664OooO00o;
                if (log.OooO0OO()) {
                    log.OooO0O0("Failed in parsing the response as XML: " + strOooO00o, e);
                }
                return OooO0OO(strOooO00o, httpResponse);
            }
        } catch (IOException e2) {
            if (f10664OooO00o.OooO0OO()) {
                f10664OooO00o.OooO0O0("Failed in reading the error response", e2);
            }
            return OooO0OO(httpResponse.f10396OooO00o, httpResponse);
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final boolean OooO0O0() {
        return false;
    }

    public final AmazonS3Exception OooO0OO(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        int i = httpResponse.f10397OooO0O0;
        amazonS3Exception.f10269Oooo0oO = i + ZegoConstants.ZegoVideoDataAuxPublishingStream + httpResponse.f10396OooO00o;
        amazonS3Exception.f10267Oooo = i;
        Map<String, String> map = httpResponse.f10399OooO0Oo;
        amazonS3Exception.f10268Oooo0o = map.get("x-amz-request-id");
        amazonS3Exception.f10706OoooO0 = map.get("x-amz-id-2");
        map.get("X-Amz-Cf-Id");
        HashMap map2 = new HashMap();
        map2.put("x-amz-bucket-region", map.get("x-amz-bucket-region"));
        amazonS3Exception.f10707OoooO0O = map2;
        return amazonS3Exception;
    }
}
