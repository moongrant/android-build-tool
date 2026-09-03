package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityResultJsonUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.CRC32ChecksumCalculatingInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class JsonResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f9103OooO0O0 = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Unmarshaller<T, JsonUnmarshallerContext> f9104OooO00o;

    public JsonResponseHandler(GetCredentialsForIdentityResultJsonUnmarshaller getCredentialsForIdentityResultJsonUnmarshaller) {
        this.f9104OooO00o = getCredentialsForIdentityResultJsonUnmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        CRC32ChecksumCalculatingInputStream cRC32ChecksumCalculatingInputStream;
        Log log = f9103OooO0O0;
        log.OooOO0("Parsing service response JSON");
        Map<String, String> map = httpResponse.f9093OooO0Oo;
        String str = map.get("x-amz-crc32");
        InputStream gZIPInputStream = httpResponse.f9092OooO0OO;
        if (gZIPInputStream == null) {
            gZIPInputStream = new ByteArrayInputStream("{}".getBytes(StringUtils.f9590OooO00o));
        }
        log.OooO0oO("CRC32Checksum = " + str);
        log.OooO0oO("content encoding = " + map.get("Content-Encoding"));
        boolean zEquals = "gzip".equals(map.get("Content-Encoding"));
        if (str != null) {
            cRC32ChecksumCalculatingInputStream = new CRC32ChecksumCalculatingInputStream(gZIPInputStream);
            gZIPInputStream = cRC32ChecksumCalculatingInputStream;
        } else {
            cRC32ChecksumCalculatingInputStream = null;
        }
        if (zEquals) {
            gZIPInputStream = new GZIPInputStream(gZIPInputStream);
        }
        AwsJsonReader awsJsonReaderOooO00o = JsonUtils.OooO00o(new InputStreamReader(gZIPInputStream, StringUtils.f9590OooO00o));
        try {
            AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
            T tOooO00o = this.f9104OooO00o.OooO00o(new JsonUnmarshallerContext(awsJsonReaderOooO00o));
            if (cRC32ChecksumCalculatingInputStream != null) {
                if (cRC32ChecksumCalculatingInputStream.f9577OooO0Oo.getValue() != Long.parseLong(str)) {
                    throw new CRC32MismatchException();
                }
            }
            amazonWebServiceResponse.f8965OooO00o = tOooO00o;
            HashMap map2 = new HashMap();
            map2.put("AWS_REQUEST_ID", map.get("x-amzn-RequestId"));
            amazonWebServiceResponse.f8966OooO0O0 = new ResponseMetadata(map2);
            log.OooOO0("Done parsing service response");
            try {
                awsJsonReaderOooO00o.close();
            } catch (IOException e) {
                log.OooOO0O("Error closing json parser", e);
            }
            return amazonWebServiceResponse;
        } catch (Throwable th) {
            try {
                awsJsonReaderOooO00o.close();
            } catch (IOException e2) {
                log.OooOO0O("Error closing json parser", e2);
            }
            throw th;
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final boolean OooO0O0() {
        return false;
    }
}
