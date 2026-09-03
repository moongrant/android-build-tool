package com.amazonaws.services.s3.internal;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractS3ResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f12394OooO00o = LogFactory.OooO00o(S3MetadataResponseHandler.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashSet f12395OooO0O0;

    static {
        HashSet hashSet = new HashSet();
        f12395OooO0O0 = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    public static AmazonWebServiceResponse OooO0OO(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        Map<String, String> map = httpResponse.f12183OooO0Oo;
        String str = map.get("x-amz-request-id");
        String str2 = map.get("x-amz-id-2");
        String str3 = map.get("X-Amz-Cf-Id");
        HashMap map2 = new HashMap();
        map2.put("AWS_REQUEST_ID", str);
        map2.put("HOST_ID", str2);
        map2.put("CLOUD_FRONT_ID", str3);
        amazonWebServiceResponse.f12056OooO0O0 = new S3ResponseMetadata(map2);
        return amazonWebServiceResponse;
    }

    public static void OooO0Oo(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        Map<String, String> map = httpResponse.f12183OooO0Oo;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("x-amz-meta-")) {
                objectMetadata.f12502OooO0Oo.put(key.substring(11), entry.getValue());
            } else {
                boolean zContains = f12395OooO0O0.contains(key);
                Log log = f12394OooO00o;
                if (zContains) {
                    log.OooO0oO(String.format("%s is ignored.", key));
                } else if (key.equalsIgnoreCase("Last-Modified")) {
                    try {
                        String value = entry.getValue();
                        Log log2 = ServiceUtils.f12431OooO00o;
                        objectMetadata.f12504OooO0o0.put(key, DateUtils.OooO0o0(value));
                    } catch (Exception e) {
                        log.OooOO0O("Unable to parse last modified date: " + entry.getValue(), e);
                    }
                } else if (key.equalsIgnoreCase("Content-Length")) {
                    try {
                        objectMetadata.f12504OooO0o0.put(key, Long.valueOf(Long.parseLong(entry.getValue())));
                    } catch (NumberFormatException e2) {
                        log.OooOO0O("Unable to parse content length: " + entry.getValue(), e2);
                    }
                } else if (key.equalsIgnoreCase("ETag")) {
                    objectMetadata.f12504OooO0o0.put(key, ServiceUtils.OooO00o(entry.getValue()));
                } else if (key.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.f12503OooO0o = DateUtils.OooO0o0(entry.getValue());
                    } catch (Exception e3) {
                        log.OooOO0O("Unable to parse http expiration date: " + entry.getValue(), e3);
                    }
                } else if (key.equalsIgnoreCase("x-amz-expiration")) {
                    new ObjectExpirationHeaderHandler();
                    ObjectExpirationHeaderHandler.OooO0O0(objectMetadata, httpResponse);
                } else if (key.equalsIgnoreCase("x-amz-restore")) {
                    new ObjectRestoreHeaderHandler();
                    ObjectRestoreHeaderHandler.OooO0O0(objectMetadata, httpResponse);
                } else if (key.equalsIgnoreCase("x-amz-request-charged")) {
                    new S3RequesterChargedHeaderHandler();
                    objectMetadata.OooO0oO(map.get("x-amz-request-charged") != null);
                } else if (key.equalsIgnoreCase("x-amz-mp-parts-count")) {
                    try {
                        objectMetadata.f12504OooO0o0.put(key, Integer.valueOf(Integer.parseInt(entry.getValue())));
                    } catch (NumberFormatException e4) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e4.getMessage(), e4);
                    }
                } else {
                    objectMetadata.f12504OooO0o0.put(key, entry.getValue());
                }
            }
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public boolean OooO0O0() {
        return this instanceof S3ObjectResponseHandler;
    }
}
