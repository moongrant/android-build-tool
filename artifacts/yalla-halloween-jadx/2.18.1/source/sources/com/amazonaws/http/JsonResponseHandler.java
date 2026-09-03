package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.CRC32ChecksumCalculatingInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;
import com.efs.sdk.base.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class JsonResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f10409OooO0O0 = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Unmarshaller<T, JsonUnmarshallerContext> f10410OooO00o;

    public JsonResponseHandler(Unmarshaller<T, JsonUnmarshallerContext> unmarshaller) {
        this.f10410OooO00o = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object OooO00o(HttpResponse httpResponse) throws Exception {
        Log log = f10409OooO0O0;
        log.OooOO0O("Parsing service response JSON");
        String str = httpResponse.f10399OooO0Oo.get("x-amz-crc32");
        InputStream gZIPInputStream = httpResponse.f10398OooO0OO;
        if (gZIPInputStream == null) {
            gZIPInputStream = new ByteArrayInputStream("{}".getBytes(StringUtils.f11186OooO00o));
        }
        log.OooO00o("CRC32Checksum = " + str);
        log.OooO00o("content encoding = " + httpResponse.f10399OooO0Oo.get("Content-Encoding"));
        boolean zEquals = Constants.CP_GZIP.equals(httpResponse.f10399OooO0Oo.get("Content-Encoding"));
        CRC32ChecksumCalculatingInputStream cRC32ChecksumCalculatingInputStream = null;
        if (str != null) {
            cRC32ChecksumCalculatingInputStream = new CRC32ChecksumCalculatingInputStream(gZIPInputStream);
            gZIPInputStream = cRC32ChecksumCalculatingInputStream;
        }
        if (zEquals) {
            gZIPInputStream = new GZIPInputStream(gZIPInputStream);
        }
        AwsJsonReader awsJsonReaderOooO00o = JsonUtils.OooO00o(new InputStreamReader(gZIPInputStream, StringUtils.f11186OooO00o));
        try {
            AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
            T tOooO00o = this.f10410OooO00o.OooO00o(new JsonUnmarshallerContext(awsJsonReaderOooO00o));
            if (cRC32ChecksumCalculatingInputStream != null) {
                if (cRC32ChecksumCalculatingInputStream.f11174Oooo0o.getValue() != Long.parseLong(str)) {
                    throw new CRC32MismatchException();
                }
            }
            amazonWebServiceResponse.f10275OooO00o = tOooO00o;
            HashMap map = new HashMap();
            map.put("AWS_REQUEST_ID", httpResponse.f10399OooO0Oo.get("x-amzn-RequestId"));
            amazonWebServiceResponse.f10276OooO0O0 = new ResponseMetadata(map);
            log.OooOO0O("Done parsing service response");
            try {
                awsJsonReaderOooO00o.close();
            } catch (IOException e) {
                f10409OooO0O0.OooO0oO("Error closing json parser", e);
            }
            return amazonWebServiceResponse;
        } catch (Throwable th) {
            try {
                awsJsonReaderOooO00o.close();
            } catch (IOException e2) {
                f10409OooO0O0.OooO0oO("Error closing json parser", e2);
            }
            throw th;
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final boolean OooO0O0() {
        return false;
    }
}
