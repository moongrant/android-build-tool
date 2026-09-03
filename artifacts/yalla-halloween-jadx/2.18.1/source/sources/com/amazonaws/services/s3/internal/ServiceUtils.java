package com.amazonaws.services.s3.internal;

import OooO00o.OooO00o;
import OooO0o.OooO0o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.Md5Utils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class ServiceUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10681OooO00o = LogFactory.OooO00o(ServiceUtils.class);

    public interface RetryableS3DownloadTask {
        S3Object getS3ObjectStream();

        boolean needIntegrityCheck();
    }

    static {
        new DateUtils();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static URL OooO00o(Request<?> request, boolean z) {
        String strOooO0Oo;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        boolean z2 = true;
        String strOooO00o = S3HttpUtils.OooO00o(defaultRequest.f10286OooO00o, true);
        if (z && strOooO00o.startsWith("/")) {
            strOooO00o = strOooO00o.substring(1);
        }
        String string = defaultRequest.f10291OooO0o0 + ("/" + strOooO00o).replaceAll("(?<=/)/", "%2F");
        for (String str : defaultRequest.f10288OooO0OO.keySet()) {
            if (z2) {
                strOooO0Oo = OooOo00.OooO0Oo(string, "?");
                z2 = false;
            } else {
                strOooO0Oo = OooOo00.OooO0Oo(string, "&");
            }
            String str2 = (String) defaultRequest.f10288OooO0OO.get(str);
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(strOooO0Oo, str, "=");
            sbOooO0OO.append(S3HttpUtils.OooO00o(str2, false));
            string = sbOooO0OO.toString();
        }
        try {
            return new URL(string);
        } catch (MalformedURLException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to convert request to well formed URL: ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }

    public static void OooO0O0(S3Object s3Object, File file, boolean z, boolean z2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArrOooO00o;
        byte[] bArrOooO00o2;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        byte[] bArr = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z2));
                try {
                    byte[] bArr2 = new byte[10240];
                    while (true) {
                        int i = s3Object.f10897Oooo.read(bArr2);
                        if (i > -1) {
                            bufferedOutputStream.write(bArr2, 0, i);
                        } else {
                            try {
                                break;
                            } catch (Exception unused) {
                                f10681OooO00o.OooO00o("Caught exception. Ignoring.");
                            }
                        }
                    }
                    bufferedOutputStream.close();
                    try {
                        s3Object.f10897Oooo.close();
                    } catch (Exception unused2) {
                        f10681OooO00o.OooO00o("Caught exception. Ignoring.");
                    }
                    try {
                        if (s3Object.f10900Oooo0oo.OooOOOo().contains("-")) {
                            bArrOooO00o2 = null;
                        } else {
                            bArrOooO00o = Md5Utils.OooO00o(new FileInputStream(file));
                            try {
                                bArrOooO00o2 = BinaryUtils.OooO00o(s3Object.f10900Oooo0oo.OooOOOo());
                            } catch (Exception e) {
                                e = e;
                                Log log = f10681OooO00o;
                                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to calculate MD5 hash to validate download: ");
                                sbOooO0o0.append(e.getMessage());
                                log.OooO0oO(sbOooO0o0.toString(), e);
                                bArrOooO00o2 = null;
                            }
                            bArr = bArrOooO00o;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bArrOooO00o = null;
                    }
                    if (!z || bArr == null || bArrOooO00o2 == null || Arrays.equals(bArr, bArrOooO00o2)) {
                        return;
                    }
                    StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unable to verify integrity of data download.  Client calculated content hash didn't match hash calculated by Amazon S3.  The data stored in '");
                    sbOooO0o1.append(file.getAbsolutePath());
                    sbOooO0o1.append("' may be corrupt.");
                    throw new AmazonClientException(sbOooO0o1.toString());
                } catch (IOException e3) {
                    e = e3;
                    s3Object.f10897Oooo.OooO00o();
                    throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused3) {
                        f10681OooO00o.OooO00o("Caught exception. Ignoring.");
                    }
                    try {
                        s3Object.f10897Oooo.close();
                        throw th;
                    } catch (Exception unused4) {
                        f10681OooO00o.OooO00o("Caught exception. Ignoring.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    public static String OooO0OO(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("\"")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith("\"") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    public static boolean OooO0Oo(AmazonWebServiceRequest amazonWebServiceRequest, S3ClientOptions s3ClientOptions) {
        if ((s3ClientOptions != null && s3ClientOptions.f10632OooO00o) || System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            if (((GetObjectRequest) amazonWebServiceRequest).OooO0Oo() != null) {
                return true;
            }
        } else if (amazonWebServiceRequest instanceof PutObjectRequest) {
            PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
            ObjectMetadata objectMetadata = putObjectRequest.f10693OoooO;
            if (objectMetadata != null && objectMetadata.OooO0oO() != null) {
                return true;
            }
            SSEAwsKeyManagementParams sSEAwsKeyManagementParams = putObjectRequest.f10700OoooOo0;
            if (sSEAwsKeyManagementParams != null) {
                Objects.requireNonNull(sSEAwsKeyManagementParams);
                if (SSEAlgorithm.KMS.getAlgorithm() != null || putObjectRequest.f10700OoooOo0.f10911Oooo0o != null) {
                    return true;
                }
            }
        } else if (amazonWebServiceRequest instanceof UploadPartRequest) {
            Objects.requireNonNull((UploadPartRequest) amazonWebServiceRequest);
        }
        return false;
    }

    public static boolean OooO0o0(ObjectMetadata objectMetadata, S3ClientOptions s3ClientOptions) {
        if (s3ClientOptions != null && s3ClientOptions.f10632OooO00o) {
            return true;
        }
        if (objectMetadata == null) {
            return false;
        }
        return objectMetadata.OooOOO0() != null || SSEAlgorithm.KMS.toString().equals(objectMetadata.OooO0oO());
    }
}
