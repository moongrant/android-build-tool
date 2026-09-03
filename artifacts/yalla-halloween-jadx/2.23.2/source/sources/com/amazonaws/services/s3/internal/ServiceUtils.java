package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.DateUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f12431OooO00o = LogFactory.OooO00o(ServiceUtils.class);

    static {
        new DateUtils();
    }

    public static String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("\"")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith("\"") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    public static boolean OooO0O0(AmazonWebServiceRequest amazonWebServiceRequest, S3ClientOptions s3ClientOptions) {
        if (System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            long[] jArr = ((GetObjectRequest) amazonWebServiceRequest).f12483OooO0oo;
            return (jArr == null ? null : (long[]) jArr.clone()) != null;
        }
        if (!(amazonWebServiceRequest instanceof PutObjectRequest)) {
            if (!(amazonWebServiceRequest instanceof UploadPartRequest)) {
                return false;
            }
            ((UploadPartRequest) amazonWebServiceRequest).getClass();
            return false;
        }
        PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
        ObjectMetadata objectMetadata = putObjectRequest.f12444OooOO0O;
        if (objectMetadata != null && ((String) objectMetadata.f12504OooO0o0.get("x-amz-server-side-encryption")) != null) {
            return true;
        }
        if (putObjectRequest.f12449OooOOOo != null) {
            return (SSEAlgorithm.KMS.getAlgorithm() == null && putObjectRequest.f12449OooOOOo.f12527OooO0Oo == null) ? false : true;
        }
        return false;
    }
}
