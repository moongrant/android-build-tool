package com.amazonaws.services.s3.internal;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractS3ResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10636OooO00o = LogFactory.OooO00o(S3MetadataResponseHandler.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f10637OooO0O0;

    static {
        HashSet hashSet = new HashSet();
        f10637OooO0O0 = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public boolean OooO0O0() {
        return this instanceof S3ObjectResponseHandler;
    }

    public final AmazonWebServiceResponse<T> OooO0OO(HttpResponse httpResponse) {
        AmazonWebServiceResponse<T> amazonWebServiceResponse = new AmazonWebServiceResponse<>();
        String str = httpResponse.f10399OooO0Oo.get("x-amz-request-id");
        String str2 = httpResponse.f10399OooO0Oo.get("x-amz-id-2");
        String str3 = httpResponse.f10399OooO0Oo.get("X-Amz-Cf-Id");
        HashMap map = new HashMap();
        map.put("AWS_REQUEST_ID", str);
        map.put("HOST_ID", str2);
        map.put("CLOUD_FRONT_ID", str3);
        amazonWebServiceResponse.f10276OooO0O0 = new S3ResponseMetadata(map);
        return amazonWebServiceResponse;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void OooO0Oo(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        for (Map.Entry<String, String> entry : httpResponse.f10399OooO0Oo.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("x-amz-meta-")) {
                objectMetadata.f10866Oooo0o.put(key.substring(11), entry.getValue());
            } else if (f10637OooO0O0.contains(key)) {
                f10636OooO00o.OooO00o(String.format("%s is ignored.", key));
            } else if (key.equalsIgnoreCase("Last-Modified")) {
                try {
                    String value = entry.getValue();
                    Log log = ServiceUtils.f10681OooO00o;
                    objectMetadata.OooOOoo(key, DateUtils.OooO0oO(value));
                } catch (Exception e) {
                    Log log2 = f10636OooO00o;
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to parse last modified date: ");
                    sbOooO0o0.append(entry.getValue());
                    log2.OooO0oO(sbOooO0o0.toString(), e);
                }
            } else if (key.equalsIgnoreCase("Content-Length")) {
                try {
                    objectMetadata.OooOOoo(key, Long.valueOf(Long.parseLong(entry.getValue())));
                } catch (NumberFormatException e2) {
                    Log log3 = f10636OooO00o;
                    StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unable to parse content length: ");
                    sbOooO0o1.append(entry.getValue());
                    log3.OooO0oO(sbOooO0o1.toString(), e2);
                }
            } else if (key.equalsIgnoreCase("ETag")) {
                objectMetadata.OooOOoo(key, ServiceUtils.OooO0OO(entry.getValue()));
            } else if (key.equalsIgnoreCase("Expires")) {
                try {
                    objectMetadata.f10868Oooo0oo = DateUtils.OooO0oO(entry.getValue());
                } catch (Exception e3) {
                    Log log4 = f10636OooO00o;
                    StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Unable to parse http expiration date: ");
                    sbOooO0o2.append(entry.getValue());
                    log4.OooO0oO(sbOooO0o2.toString(), e3);
                }
            } else if (key.equalsIgnoreCase("x-amz-expiration")) {
                new ObjectExpirationHeaderHandler().OooO00o(objectMetadata, httpResponse);
            } else if (key.equalsIgnoreCase("x-amz-restore")) {
                new ObjectRestoreHeaderHandler().OooO00o(objectMetadata, httpResponse);
            } else if (key.equalsIgnoreCase("x-amz-request-charged")) {
                new S3RequesterChargedHeaderHandler();
                objectMetadata.OooO0o(httpResponse.f10399OooO0Oo.get("x-amz-request-charged") != null);
            } else if (key.equalsIgnoreCase("x-amz-mp-parts-count")) {
                try {
                    objectMetadata.OooOOoo(key, Integer.valueOf(Integer.parseInt(entry.getValue())));
                } catch (NumberFormatException e4) {
                    StringBuilder sbOooO0o3 = OooO00o.OooO0o0("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data");
                    sbOooO0o3.append(e4.getMessage());
                    throw new AmazonClientException(sbOooO0o3.toString(), e4);
                }
            } else {
                objectMetadata.OooOOoo(key, entry.getValue());
            }
        }
    }
}
