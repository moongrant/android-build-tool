package p179o00o00;

import androidx.camera.core.impl.OooOOOO;
import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressReportingInputStream;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.s3.internal.DigestValidationInputStream;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.MD5DigestCalculatingInputStream;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectIdBuilder;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.util.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p022Oooo00O.o00O00OO;
import p037OoooOo0.o000O0o;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends AmazonWebServiceClient implements AmazonS3 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Map<String, String> f38372OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Log f38373OooOOo0 = LogFactory.OooO00o(OooOO0O.class);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final S3ErrorResponseHandler f38374OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final S3XmlResponseHandler<Void> f38375OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final S3ClientOptions f38376OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile String f38377OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AWSCredentialsProvider f38378OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f38379OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final CompleteMultipartUploadRetryCondition f38380OooOOOo;

    public class OooO00o extends LinkedHashMap<String, String> {
        public OooO00o() {
            super(300, 1.1f, true);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 300;
        }
    }

    static {
        AwsSdkMetrics.OooO00o(Arrays.asList((S3ServiceMetric[]) S3ServiceMetric.f12434OooO0o0.clone()));
        ConcurrentHashMap concurrentHashMap = SignerFactory.f12153OooO00o;
        concurrentHashMap.put("S3SignerType", S3Signer.class);
        concurrentHashMap.put("AWSS3V4SignerType", AWSS3V4Signer.class);
        new BucketConfigurationXmlFactory();
        new RequestPaymentConfigurationXmlFactory();
        f38372OooOOo = Collections.synchronizedMap(new OooO00o());
    }

    @Deprecated
    public OooOO0O() {
        DefaultAWSCredentialsProviderChain defaultAWSCredentialsProviderChain = new DefaultAWSCredentialsProviderChain();
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        super(clientConfiguration, new UrlHttpClient(clientConfiguration));
        this.f38374OooOO0 = new S3ErrorResponseHandler();
        this.f38375OooOO0O = new S3XmlResponseHandler<>(null);
        this.f38376OooOO0o = new S3ClientOptions();
        this.f38379OooOOOO = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        this.f38380OooOOOo = new CompleteMultipartUploadRetryCondition();
        this.f38378OooOOO0 = defaultAWSCredentialsProviderChain;
        OooOo0o("s3.amazonaws.com");
        this.f12050OooO0oO = "s3";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.f12047OooO0Oo.addAll(handlerChainFactory.OooO00o(RequestHandler.class, "/com/amazonaws/services/s3/request.handlers"));
        this.f12047OooO0Oo.addAll(handlerChainFactory.OooO00o(RequestHandler2.class, "/com/amazonaws/services/s3/request.handler2s"));
    }

    public static void OooOOO0(DefaultRequest defaultRequest, String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Log log = ServiceUtils.f12431OooO00o;
        Iterator it = arrayList.iterator();
        String strOooO00o = "";
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, ", ");
            }
            strOooO00o = OooOOOO.OooO00o(strOooO00o, str2);
            z = false;
        }
        defaultRequest.OooO00o(str, strOooO00o);
    }

    @Deprecated
    public static S3Signer OooOOOO(DefaultRequest defaultRequest, String str, String str2) {
        StringBuilder sb = new StringBuilder("/");
        sb.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return new S3Signer(defaultRequest.f12073OooO0oo.toString(), sb.toString());
    }

    public static void OooOOo(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.f12155OooO0O0 = i;
        progressListenerCallbackExecutor.OooO00o(progressEvent);
    }

    public static String OooOo(ObjectTagging objectTagging) {
        List<Tag> list;
        if (objectTagging == null || (list = objectTagging.f12507OooO0Oo) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Tag> it = list.iterator();
        while (it.hasNext()) {
            Tag next = it.next();
            sb.append(S3HttpUtils.OooO00o(next.f12528OooO0Oo, false));
            sb.append('=');
            sb.append(S3HttpUtils.OooO00o(next.f12529OooO0o0, false));
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    public static void OooOo0(DefaultRequest defaultRequest, ObjectMetadata objectMetadata) {
        objectMetadata.getClass();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(objectMetadata.f12504OooO0o0);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(treeMap);
        if (mapUnmodifiableMap.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f12501OooO.equals(mapUnmodifiableMap.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            defaultRequest.OooO00o((String) entry.getKey(), entry.getValue().toString());
        }
        Date dateOooO00o = DateUtils.OooO00o(objectMetadata.f12503OooO0o);
        if (dateOooO00o != null) {
            defaultRequest.OooO00o("Expires", DateUtils.OooO0O0("EEE, dd MMM yyyy HH:mm:ss z").get().format(dateOooO00o));
        }
        Map<String, String> map = objectMetadata.f12502OooO0Oo;
        if (map != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                String key = entry2.getKey();
                String value = entry2.getValue();
                if (key != null) {
                    key = key.trim();
                }
                if (value != null) {
                    value = value.trim();
                }
                if (!"x-amz-tagging".equals(key)) {
                    defaultRequest.OooO00o("x-amz-meta-" + key, value);
                }
            }
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public final CompleteMultipartUploadResult OooO00o(CompleteMultipartUploadRequest completeMultipartUploadRequest) throws AmazonClientException {
        String str = completeMultipartUploadRequest.f12475OooO0oO;
        ValidationUtils.OooO00o(str, "The bucket name parameter must be specified when completing a multipart upload");
        String str2 = completeMultipartUploadRequest.f12476OooO0oo;
        ValidationUtils.OooO00o(str2, "The key parameter must be specified when completing a multipart upload");
        String str3 = completeMultipartUploadRequest.f12474OooO;
        ValidationUtils.OooO00o(str3, "The upload ID parameter must be specified when completing a multipart upload");
        List<PartETag> list = completeMultipartUploadRequest.f12477OooOO0;
        ValidationUtils.OooO00o(list, "The part ETags parameter must be specified when completing a multipart upload");
        int i = 0;
        while (true) {
            DefaultRequest defaultRequestOooOOO = OooOOO(str, str2, completeMultipartUploadRequest, HttpMethodName.POST);
            defaultRequestOooOOO.OooO0O0("uploadId", str3);
            byte[] bArrOooO00o = RequestXmlFactory.OooO00o(list);
            defaultRequestOooOOO.OooO00o("Content-Type", "application/xml");
            defaultRequestOooOOO.OooO00o("Content-Length", String.valueOf(bArrOooO00o.length));
            defaultRequestOooOOO.f12065OooO = new ByteArrayInputStream(bArrOooO00o);
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) OooOo00(defaultRequestOooOOO, new ResponseHeaderHandlerChain(new Unmarshaller<XmlResponsesSaxParser.CompleteMultipartUploadHandler, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                public final XmlResponsesSaxParser.CompleteMultipartUploadHandler OooO00o(InputStream inputStream) throws Exception {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                    xmlResponsesSaxParser.OooO0Oo(completeMultipartUploadHandler2, inputStream);
                    return completeMultipartUploadHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), str, str2);
            CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadHandler.f12584OooO0o;
            if (completeMultipartUploadResult != null) {
                return completeMultipartUploadResult;
            }
            AmazonS3Exception amazonS3Exception = completeMultipartUploadHandler.f12585OooO0oO;
            int i2 = i + 1;
            RetryPolicy retryPolicy = this.f12045OooO0O0.f12061OooO0OO;
            if (!((retryPolicy == null || retryPolicy.f12338OooO00o == null || retryPolicy == PredefinedRetryPolicies.f12331OooO00o) ? false : this.f38380OooOOOo.OooO00o(amazonS3Exception, i))) {
                throw completeMultipartUploadHandler.f12585OooO0oO;
            }
            i = i2;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public final InitiateMultipartUploadResult OooO0O0(InitiateMultipartUploadRequest initiateMultipartUploadRequest) throws AmazonClientException {
        String str = initiateMultipartUploadRequest.f12490OooO0oO;
        ValidationUtils.OooO00o(str, "The bucket name parameter must be specified when initiating a multipart upload");
        String str2 = initiateMultipartUploadRequest.f12491OooO0oo;
        ValidationUtils.OooO00o(str2, "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest defaultRequestOooOOO = OooOOO(str, str2, initiateMultipartUploadRequest, HttpMethodName.POST);
        defaultRequestOooOOO.OooO0O0("uploads", null);
        CannedAccessControlList cannedAccessControlList = initiateMultipartUploadRequest.f12492OooOO0;
        if (cannedAccessControlList != null) {
            defaultRequestOooOOO.OooO00o("x-amz-acl", cannedAccessControlList.toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f12489OooO;
        if (objectMetadata != null) {
            OooOo0(defaultRequestOooOOO, objectMetadata);
        }
        String strOooOo = OooOo(initiateMultipartUploadRequest.f12494OooOO0o);
        if (strOooOo != null) {
            defaultRequestOooOOO.OooO00o("x-amz-tagging", strOooOo);
        }
        SSEAwsKeyManagementParams sSEAwsKeyManagementParams = initiateMultipartUploadRequest.f12493OooOO0O;
        if (sSEAwsKeyManagementParams != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestOooOOO.OooO00o("x-amz-server-side-encryption", algorithm);
            }
            String str3 = sSEAwsKeyManagementParams.f12527OooO0Oo;
            if (str3 != null) {
                defaultRequestOooOOO.OooO00o("x-amz-server-side-encryption-aws-kms-key-id", str3);
            }
        }
        defaultRequestOooOOO.OooO00o("Content-Length", String.valueOf(0));
        defaultRequestOooOOO.f12065OooO = new ByteArrayInputStream(new byte[0]);
        return (InitiateMultipartUploadResult) OooOo00(defaultRequestOooOOO, new ResponseHeaderHandlerChain(new Unmarshaller<InitiateMultipartUploadResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final InitiateMultipartUploadResult OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.OooO0Oo(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.f12611OooO0o;
            }
        }, new ServerSideEncryptionHeaderHandler()), str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0112 A[Catch: AmazonS3Exception -> 0x0131, TryCatch #0 {AmazonS3Exception -> 0x0131, blocks: (B:19:0x0088, B:21:0x00a8, B:22:0x00ba, B:27:0x00c5, B:32:0x00e8, B:34:0x00ee, B:36:0x00f4, B:37:0x00fc, B:40:0x010a, B:46:0x0129, B:41:0x0112, B:45:0x0125, B:44:0x0121), top: B:58:0x0088, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:44:0x0121 A[Catch: AmazonS3Exception -> 0x0131, TryCatch #0 {AmazonS3Exception -> 0x0131, blocks: (B:19:0x0088, B:21:0x00a8, B:22:0x00ba, B:27:0x00c5, B:32:0x00e8, B:34:0x00ee, B:36:0x00f4, B:37:0x00fc, B:40:0x010a, B:46:0x0129, B:41:0x0112, B:45:0x0125, B:44:0x0121), top: B:58:0x0088, inners: #1 }] */
    @Override // com.amazonaws.services.s3.AmazonS3
    public final S3Object OooO0OO(GetObjectRequest getObjectRequest) throws AmazonClientException {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        Long l;
        InputStream lengthCheckInputStream;
        S3ClientOptions s3ClientOptions = this.f38376OooOO0o;
        S3ObjectIdBuilder s3ObjectIdBuilder = getObjectRequest.f12482OooO0oO;
        ValidationUtils.OooO00o(s3ObjectIdBuilder.f12518OooO0Oo, "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.OooO00o(s3ObjectIdBuilder.f12520OooO0o0, "The key parameter must be specified when requesting an object");
        DefaultRequest defaultRequestOooOOO = OooOOO(s3ObjectIdBuilder.f12518OooO0Oo, s3ObjectIdBuilder.f12520OooO0o0, getObjectRequest, HttpMethodName.GET);
        String str = s3ObjectIdBuilder.f12519OooO0o;
        if (str != null) {
            defaultRequestOooOOO.OooO0O0("versionId", str);
        }
        long[] jArr = getObjectRequest.f12483OooO0oo;
        long[] jArr2 = jArr == null ? null : (long[]) jArr.clone();
        long jLongValue = 0;
        boolean z = false;
        if (jArr2 != null) {
            String string = "bytes=" + Long.toString(jArr2[0]) + "-";
            if (jArr2[1] >= 0) {
                StringBuilder sbOooO00o = o0o0Oo.OooO00o(string);
                sbOooO00o.append(Long.toString(jArr2[1]));
                string = sbOooO00o.toString();
            }
            defaultRequestOooOOO.OooO00o("Range", string);
        }
        OooOOO0(defaultRequestOooOOO, "If-Match", getObjectRequest.f12481OooO);
        OooOOO0(defaultRequestOooOOO, "If-None-Match", getObjectRequest.f12484OooOO0);
        ProgressListener progressListener = getObjectRequest.f12485OooOO0O;
        if (progressListener == null) {
            ExecutorService executorService = ProgressListenerCallbackExecutor.f12156OooO0O0;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListener);
        }
        try {
            S3Object s3Object = (S3Object) OooOo00(defaultRequestOooOOO, new S3ObjectResponseHandler(), s3ObjectIdBuilder.f12518OooO0Oo, s3ObjectIdBuilder.f12520OooO0o0);
            s3Object.f12516OooO0o0 = s3ObjectIdBuilder.f12518OooO0Oo;
            s3Object.f12514OooO0Oo = s3ObjectIdBuilder.f12520OooO0o0;
            ServiceClientHolderInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.f12517OooO0oO);
            SdkFilterInputStream sdkFilterInputStream = serviceClientHolderInputStream;
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutor);
                progressReportingInputStream.f12163OooO0oO = true;
                progressReportingInputStream.f12160OooO0Oo = this.f38379OooOOOO * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                OooOOo(progressListenerCallbackExecutor, 2);
                sdkFilterInputStream = progressReportingInputStream;
            }
            boolean zOooO0O0 = ServiceUtils.OooO0O0(getObjectRequest, s3ClientOptions);
            ObjectMetadata objectMetadata = s3Object.f12515OooO0o;
            if (zOooO0O0) {
                l = (Long) objectMetadata.f12504OooO0o0.get("Content-Length");
                if (l == null) {
                    jLongValue = l.longValue();
                }
                lengthCheckInputStream = new LengthCheckInputStream(jLongValue, sdkFilterInputStream, true);
            } else {
                if (objectMetadata != null) {
                    String string2 = SSEAlgorithm.KMS.toString();
                    TreeMap treeMap = objectMetadata.f12504OooO0o0;
                    boolean zEquals = string2.equals((String) treeMap.get("x-amz-server-side-encryption"));
                    if (((String) treeMap.get("x-amz-server-side-encryption-customer-algorithm")) != null || zEquals) {
                        z = true;
                    }
                }
                if (z) {
                    l = (Long) objectMetadata.f12504OooO0o0.get("Content-Length");
                    if (l == null) {
                        jLongValue = l.longValue();
                    }
                    lengthCheckInputStream = new LengthCheckInputStream(jLongValue, sdkFilterInputStream, true);
                } else {
                    String strOooOO0O = objectMetadata.OooOO0O();
                    if (strOooOO0O != null && !strOooOO0O.contains("-")) {
                        lengthCheckInputStream = sdkFilterInputStream;
                        lengthCheckInputStream = sdkFilterInputStream;
                        try {
                            lengthCheckInputStream = new DigestValidationInputStream(sdkFilterInputStream, MessageDigest.getInstance("MD5"), BinaryUtils.OooO00o(objectMetadata.OooOO0O()));
                        } catch (NoSuchAlgorithmException e) {
                            f38373OooOOo0.OooOO0O("No MD5 digest algorithm available. Unable to calculate checksum and verify data integrity.", e);
                            lengthCheckInputStream = sdkFilterInputStream;
                        }
                    }
                }
            }
            lengthCheckInputStream = sdkFilterInputStream;
            lengthCheckInputStream = sdkFilterInputStream;
            lengthCheckInputStream = sdkFilterInputStream;
            s3Object.f12517OooO0oO = new S3ObjectInputStream(lengthCheckInputStream);
            return s3Object;
        } catch (AmazonS3Exception e2) {
            int i = e2.f12041OooO0oO;
            if (i == 412 || i == 304) {
                OooOOo(progressListenerCallbackExecutor, 16);
                return null;
            }
            OooOOo(progressListenerCallbackExecutor, 8);
            throw e2;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public final UploadPartResult OooO0Oo(UploadPartRequest uploadPartRequest) throws AmazonClientException {
        MD5DigestCalculatingInputStream mD5DigestCalculatingInputStream;
        ValidationUtils.OooO00o(uploadPartRequest, "The request parameter must be specified when uploading a part");
        String str = uploadPartRequest.f12537OooO0oo;
        String str2 = uploadPartRequest.f12535OooO;
        String str3 = uploadPartRequest.f12538OooOO0;
        int i = uploadPartRequest.f12539OooOO0O;
        long j = uploadPartRequest.f12540OooOO0o;
        ValidationUtils.OooO00o(str, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.OooO00o(str2, "The key parameter must be specified when uploading a part");
        ValidationUtils.OooO00o(str3, "The upload ID parameter must be specified when uploading a part");
        ValidationUtils.OooO00o(Integer.valueOf(i), "The part number parameter must be specified when uploading a part");
        ValidationUtils.OooO00o(Long.valueOf(j), "The part size parameter must be specified when uploading a part");
        DefaultRequest defaultRequestOooOOO = OooOOO(str, str2, uploadPartRequest, HttpMethodName.PUT);
        defaultRequestOooOOO.OooO0O0("uploadId", str3);
        defaultRequestOooOOO.OooO0O0("partNumber", Integer.toString(i));
        defaultRequestOooOOO.OooO00o("Content-Length", Long.toString(j));
        if (uploadPartRequest.f12542OooOOO0 == null) {
            throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
        }
        try {
            InputStream inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.f12542OooOOO0), uploadPartRequest.f12541OooOOO, j);
            ProgressListenerCallbackExecutor progressListenerCallbackExecutor = null;
            if (ServiceUtils.OooO0O0(uploadPartRequest, this.f38376OooOO0o)) {
                mD5DigestCalculatingInputStream = null;
            } else {
                mD5DigestCalculatingInputStream = new MD5DigestCalculatingInputStream(inputSubstream);
                inputSubstream = mD5DigestCalculatingInputStream;
            }
            ProgressListener progressListener = uploadPartRequest.f12052OooO0Oo;
            if (progressListener == null) {
                ExecutorService executorService = ProgressListenerCallbackExecutor.f12156OooO0O0;
            } else {
                progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListener);
            }
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutor);
                progressReportingInputStream.f12160OooO0Oo = this.f38379OooOOOO * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                OooOOo(progressListenerCallbackExecutor, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                inputSubstream = progressReportingInputStream;
            }
            try {
                try {
                    defaultRequestOooOOO.f12065OooO = inputSubstream;
                    ObjectMetadata objectMetadata = (ObjectMetadata) OooOo00(defaultRequestOooOOO, new S3MetadataResponseHandler(), str, str2);
                    if (objectMetadata != null && mD5DigestCalculatingInputStream != null) {
                        String string = SSEAlgorithm.KMS.toString();
                        TreeMap treeMap = objectMetadata.f12504OooO0o0;
                        if (!(((String) treeMap.get("x-amz-server-side-encryption-customer-algorithm")) != null || string.equals((String) treeMap.get("x-amz-server-side-encryption"))) && !Arrays.equals(mD5DigestCalculatingInputStream.f12406OooO0Oo.digest(), BinaryUtils.OooO00o(objectMetadata.OooOO0O()))) {
                            throw new AmazonClientException("Unable to verify integrity of data upload.  Client calculated content hash didn't match hash calculated by Amazon S3.  You may need to delete the data stored in Amazon S3.");
                        }
                    }
                    OooOOo(progressListenerCallbackExecutor, 2048);
                    UploadPartResult uploadPartResult = new UploadPartResult();
                    String strOooOO0O = objectMetadata.OooOO0O();
                    TreeMap treeMap2 = objectMetadata.f12504OooO0o0;
                    uploadPartResult.f12543OooO0Oo = strOooOO0O;
                    treeMap2.get("x-amz-request-charged");
                    try {
                        inputSubstream.close();
                    } catch (Exception unused) {
                    }
                    return uploadPartResult;
                } catch (AmazonClientException e) {
                    OooOOo(progressListenerCallbackExecutor, 4096);
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    inputSubstream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            throw new IllegalArgumentException("The specified file doesn't exist", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0282  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02be  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0307  */
    @Override // com.amazonaws.services.s3.AmazonS3
    public final PutObjectResult OooO0o(PutObjectRequest putObjectRequest) throws Throwable {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        String str;
        String str2;
        ObjectMetadata objectMetadata;
        Log log;
        LengthCheckInputStream lengthCheckInputStream;
        InputStream inputStream;
        TreeMap treeMap;
        MD5DigestCalculatingInputStream mD5DigestCalculatingInputStream;
        InputStream inputStream2;
        SSEAwsKeyManagementParams sSEAwsKeyManagementParams;
        Throwable th;
        ObjectMetadata objectMetadata2;
        String strOooO0O0;
        String algorithm;
        String str3;
        InputStream inputStream3;
        InputStream inputStream4;
        HashMap map;
        ObjectMetadata objectMetadata3 = putObjectRequest.f12444OooOO0O;
        InputStream inputStream5 = putObjectRequest.f12443OooOO0;
        ProgressListener progressListener = putObjectRequest.f12052OooO0Oo;
        if (progressListener == null) {
            ExecutorService executorService = ProgressListenerCallbackExecutor.f12156OooO0O0;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListener);
        }
        if (objectMetadata3 == null) {
            objectMetadata3 = new ObjectMetadata();
        }
        String str4 = putObjectRequest.f12441OooO0oO;
        ValidationUtils.OooO00o(str4, "The bucket name parameter must be specified when uploading an object");
        String str5 = putObjectRequest.f12442OooO0oo;
        ValidationUtils.OooO00o(str5, "The key parameter must be specified when uploading an object");
        boolean zOooO0O0 = ServiceUtils.OooO0O0(putObjectRequest, this.f38376OooOO0o);
        TreeMap treeMap2 = objectMetadata3.f12504OooO0o0;
        File file = putObjectRequest.f12440OooO;
        InputStream repeatableFileInputStream = inputStream5;
        if (file != null) {
            treeMap2.put("Content-Length", Long.valueOf(file.length()));
            TreeMap treeMap3 = objectMetadata3.f12504OooO0o0;
            boolean z = ((String) treeMap3.get("Content-MD5")) == null;
            if (((String) treeMap3.get("Content-Type")) == null) {
                treeMap3.put("Content-Type", Mimetypes.OooO00o().OooO0O0(file));
            }
            if (z && !zOooO0O0) {
                try {
                    String strOooO00o = Md5Utils.OooO00o(file);
                    if (strOooO00o == null) {
                        treeMap3.remove("Content-MD5");
                    } else {
                        treeMap3.put("Content-MD5", strOooO00o);
                    }
                } catch (Exception e) {
                    throw new AmazonClientException("Unable to calculate MD5 hash: " + e.getMessage(), e);
                }
            }
            try {
                repeatableFileInputStream = new RepeatableFileInputStream(file);
            } catch (FileNotFoundException e2) {
                throw new AmazonClientException("Unable to find file to upload", e2);
            }
        }
        DefaultRequest defaultRequestOooOOO = OooOOO(str4, str5, putObjectRequest, HttpMethodName.PUT);
        AccessControlList accessControlList = putObjectRequest.f12447OooOOO0;
        if (accessControlList != null) {
            HashSet hashSet = accessControlList.f12451OooO0Oo;
            str = "Unable to cleanly close input stream: ";
            if (hashSet != null && accessControlList.f12453OooO0o0 != null) {
                throw new IllegalStateException("Both grant set and grant list cannot be null");
            }
            if (hashSet == null) {
                if (accessControlList.f12453OooO0o0 == null) {
                    accessControlList.f12451OooO0Oo = new HashSet();
                } else {
                    accessControlList.f12451OooO0Oo = new HashSet(accessControlList.f12453OooO0o0);
                    accessControlList.f12453OooO0o0 = null;
                }
            }
            HashSet hashSet2 = accessControlList.f12451OooO0Oo;
            HashMap map2 = new HashMap();
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                Grant grant = (Grant) it.next();
                Iterator it2 = it;
                boolean zContainsKey = map2.containsKey(grant.f12487OooO0O0);
                String str6 = str4;
                Permission permission = grant.f12487OooO0O0;
                if (!zContainsKey) {
                    map2.put(permission, new LinkedList());
                }
                ((Collection) map2.get(permission)).add(grant.f12486OooO00o);
                it = it2;
                str4 = str6;
            }
            str2 = str4;
            Permission[] permissionArrValues = Permission.values();
            int length = permissionArrValues.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                Permission permission2 = permissionArrValues[i];
                if (map2.containsKey(permission2)) {
                    Collection<Grantee> collection = (Collection) map2.get(permission2);
                    StringBuilder sb = new StringBuilder();
                    boolean z2 = false;
                    for (Grantee grantee : collection) {
                        HashMap map3 = map2;
                        if (z2) {
                            sb.append(", ");
                        } else {
                            z2 = true;
                        }
                        sb.append(grantee.OooO0O0());
                        sb.append("=\"");
                        sb.append(grantee.OooO00o());
                        sb.append("\"");
                        map2 = map3;
                    }
                    map = map2;
                    defaultRequestOooOOO.OooO00o(permission2.OooO00o(), sb.toString());
                } else {
                    map = map2;
                }
                i++;
                length = i2;
                permissionArrValues = permissionArrValues;
                map2 = map;
            }
        } else {
            str = "Unable to cleanly close input stream: ";
            str2 = str4;
            CannedAccessControlList cannedAccessControlList = putObjectRequest.f12445OooOO0o;
            if (cannedAccessControlList != null) {
                defaultRequestOooOOO.OooO00o("x-amz-acl", cannedAccessControlList.toString());
            }
        }
        String str7 = putObjectRequest.f12446OooOOO;
        if (str7 != null) {
            defaultRequestOooOOO.OooO00o("x-amz-storage-class", str7);
        }
        String str8 = putObjectRequest.f12448OooOOOO;
        InputStream byteArrayInputStream = repeatableFileInputStream;
        if (str8 != null) {
            defaultRequestOooOOO.OooO00o("x-amz-website-redirect-location", str8);
            if (repeatableFileInputStream == null) {
                byteArrayInputStream = repeatableFileInputStream;
                defaultRequestOooOOO.OooO00o("Content-Length", String.valueOf(0));
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
        }
        byteArrayInputStream = repeatableFileInputStream;
        String strOooOo = OooOo(putObjectRequest.f12450OooOOo0);
        if (strOooOo != null) {
            defaultRequestOooOOO.OooO00o("x-amz-tagging", strOooOo);
        }
        if (putObjectRequest.f12513OooOOo) {
            defaultRequestOooOOO.OooO00o("x-amz-request-payer", "requester");
        }
        Long l = (Long) treeMap2.get("Content-Length");
        long j = 0;
        Log log2 = f38373OooOOo0;
        try {
            try {
                if (l != null) {
                    objectMetadata = objectMetadata3;
                    log = log2;
                    long jLongValue = l.longValue();
                    if (jLongValue >= 0) {
                        lengthCheckInputStream = new LengthCheckInputStream(jLongValue, byteArrayInputStream, false);
                        defaultRequestOooOOO.OooO00o("Content-Length", l.toString());
                    }
                    if (progressListenerCallbackExecutor != null) {
                        inputStream3 = byteArrayInputStream;
                        inputStream = lengthCheckInputStream;
                        ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutor);
                        progressReportingInputStream.f12160OooO0Oo = this.f38379OooOOOO * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        OooOOo(progressListenerCallbackExecutor, 2);
                        inputStream = progressReportingInputStream;
                    }
                    inputStream3 = byteArrayInputStream;
                    inputStream = lengthCheckInputStream;
                    ObjectMetadata objectMetadata4 = objectMetadata;
                    treeMap = objectMetadata4.f12504OooO0o0;
                    if (((String) treeMap.get("Content-MD5")) == null || zOooO0O0) {
                        mD5DigestCalculatingInputStream = null;
                        inputStream2 = inputStream;
                    } else {
                        mD5DigestCalculatingInputStream = new MD5DigestCalculatingInputStream(inputStream);
                        inputStream2 = mD5DigestCalculatingInputStream;
                    }
                    if (((String) treeMap.get("Content-Type")) == null) {
                        treeMap.put("Content-Type", "application/octet-stream");
                    }
                    OooOo0(defaultRequestOooOOO, objectMetadata4);
                    sSEAwsKeyManagementParams = putObjectRequest.f12449OooOOOo;
                    if (sSEAwsKeyManagementParams != null) {
                        algorithm = SSEAlgorithm.KMS.getAlgorithm();
                        if (algorithm != null) {
                            defaultRequestOooOOO.OooO00o("x-amz-server-side-encryption", algorithm);
                        }
                        str3 = sSEAwsKeyManagementParams.f12527OooO0Oo;
                        if (str3 != null) {
                            defaultRequestOooOOO.OooO00o("x-amz-server-side-encryption-aws-kms-key-id", str3);
                        }
                    }
                    defaultRequestOooOOO.f12065OooO = inputStream2;
                    objectMetadata2 = (ObjectMetadata) OooOo00(defaultRequestOooOOO, new S3MetadataResponseHandler(), str2, str5);
                    inputStream2.close();
                    strOooO0O0 = (String) treeMap.get("Content-MD5");
                    if (mD5DigestCalculatingInputStream != null) {
                        strOooO0O0 = Base64.OooO0O0(mD5DigestCalculatingInputStream.f12406OooO0Oo.digest());
                    }
                    if (objectMetadata2 == null && strOooO0O0 != null && !zOooO0O0 && !Arrays.equals(Base64.OooO00o(strOooO0O0), BinaryUtils.OooO00o(objectMetadata2.OooOO0O()))) {
                        OooOOo(progressListenerCallbackExecutor, 8);
                        throw new AmazonClientException("Unable to verify integrity of data upload.  Client calculated content hash didn't match hash calculated by Amazon S3.  You may need to delete the data stored in Amazon S3.");
                    }
                    OooOOo(progressListenerCallbackExecutor, 4);
                    PutObjectResult putObjectResult = new PutObjectResult();
                    TreeMap treeMap4 = objectMetadata2.f12504OooO0o0;
                    DateUtils.OooO00o(objectMetadata2.f12505OooO0oO);
                    objectMetadata2.OooOO0O();
                    treeMap4.get("x-amz-request-charged");
                    return putObjectResult;
                }
                int i3 = -1;
                if (byteArrayInputStream.markSupported()) {
                    byte[] bArr = new byte[8192];
                    byteArrayInputStream.mark(-1);
                    while (true) {
                        try {
                            int i4 = byteArrayInputStream.read(bArr);
                            byte[] bArr2 = bArr;
                            if (i4 == -1) {
                                break;
                            }
                            j += (long) i4;
                            bArr = bArr2;
                            objectMetadata3 = objectMetadata3;
                        } catch (IOException e3) {
                            throw new AmazonClientException("Could not calculate content length.", e3);
                        }
                    }
                    objectMetadata = objectMetadata3;
                    byteArrayInputStream.reset();
                    defaultRequestOooOOO.OooO00o("Content-Length", String.valueOf(j));
                    inputStream4 = byteArrayInputStream;
                } else {
                    log2.OooO("No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors.");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr3 = new byte[262144];
                    while (true) {
                        try {
                            int i5 = byteArrayInputStream.read(bArr3);
                            if (i5 == i3) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, i5);
                            i3 = -1;
                        } catch (IOException e4) {
                            throw new AmazonClientException("Failed to read from inputstream", e4);
                        }
                    }
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    defaultRequestOooOOO.OooO00o("Content-Length", String.valueOf(byteArrayInputStream2.available()));
                    defaultRequestOooOOO.f12067OooO0O0 = true;
                    objectMetadata = objectMetadata3;
                    inputStream4 = byteArrayInputStream2;
                }
                log = log2;
                inputStream3 = inputStream4;
                inputStream2.close();
            } catch (AbortedException unused) {
            } catch (Exception e5) {
                log.OooO00o(str + e5.getMessage(), e5);
            }
            objectMetadata2 = (ObjectMetadata) OooOo00(defaultRequestOooOOO, new S3MetadataResponseHandler(), str2, str5);
            strOooO0O0 = (String) treeMap.get("Content-MD5");
            if (mD5DigestCalculatingInputStream != null) {
                strOooO0O0 = Base64.OooO0O0(mD5DigestCalculatingInputStream.f12406OooO0Oo.digest());
            }
            if (objectMetadata2 == null) {
            }
            OooOOo(progressListenerCallbackExecutor, 4);
            PutObjectResult putObjectResult2 = new PutObjectResult();
            TreeMap treeMap5 = objectMetadata2.f12504OooO0o0;
            DateUtils.OooO00o(objectMetadata2.f12505OooO0oO);
            objectMetadata2.OooOO0O();
            treeMap5.get("x-amz-request-charged");
            return putObjectResult2;
        } catch (AmazonClientException e6) {
            try {
                OooOOo(progressListenerCallbackExecutor, 8);
                throw e6;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                try {
                    inputStream2.close();
                    throw th;
                } catch (AbortedException unused2) {
                    throw th;
                } catch (Exception e7) {
                    log.OooO00o(str + e7.getMessage(), e7);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            th = th;
            inputStream2.close();
            throw th;
        }
        inputStream3 = byteArrayInputStream;
        inputStream = inputStream3;
        if (progressListenerCallbackExecutor != null) {
            inputStream3 = byteArrayInputStream;
            inputStream = lengthCheckInputStream;
            ProgressReportingInputStream progressReportingInputStream2 = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutor);
            progressReportingInputStream2.f12160OooO0Oo = this.f38379OooOOOO * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            OooOOo(progressListenerCallbackExecutor, 2);
            inputStream = progressReportingInputStream2;
        }
        inputStream3 = byteArrayInputStream;
        inputStream = lengthCheckInputStream;
        ObjectMetadata objectMetadata5 = objectMetadata;
        treeMap = objectMetadata5.f12504OooO0o0;
        if (((String) treeMap.get("Content-MD5")) == null) {
            mD5DigestCalculatingInputStream = null;
            inputStream2 = inputStream;
        } else {
            mD5DigestCalculatingInputStream = null;
            inputStream2 = inputStream;
        }
        if (((String) treeMap.get("Content-Type")) == null) {
            treeMap.put("Content-Type", "application/octet-stream");
        }
        OooOo0(defaultRequestOooOOO, objectMetadata5);
        sSEAwsKeyManagementParams = putObjectRequest.f12449OooOOOo;
        if (sSEAwsKeyManagementParams != null) {
            algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestOooOOO.OooO00o("x-amz-server-side-encryption", algorithm);
            }
            str3 = sSEAwsKeyManagementParams.f12527OooO0Oo;
            if (str3 != null) {
                defaultRequestOooOOO.OooO00o("x-amz-server-side-encryption-aws-kms-key-id", str3);
            }
        }
        defaultRequestOooOOO.f12065OooO = inputStream2;
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public final void OooO0o0(AbortMultipartUploadRequest abortMultipartUploadRequest) throws AmazonClientException {
        String str = abortMultipartUploadRequest.f12438OooO0oO;
        ValidationUtils.OooO00o(str, "The bucket name parameter must be specified when aborting a multipart upload");
        String str2 = abortMultipartUploadRequest.f12439OooO0oo;
        ValidationUtils.OooO00o(str2, "The key parameter must be specified when aborting a multipart upload");
        String str3 = abortMultipartUploadRequest.f12437OooO;
        ValidationUtils.OooO00o(str3, "The upload ID parameter must be specified when aborting a multipart upload");
        DefaultRequest defaultRequestOooOOO = OooOOO(str, str2, abortMultipartUploadRequest, HttpMethodName.DELETE);
        defaultRequestOooOOO.OooO0O0("uploadId", str3);
        OooOo00(defaultRequestOooOOO, this.f38375OooOO0O, str, str2);
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    public final void OooOO0O(Region region) {
        super.OooOO0O(region);
        this.f38377OooOOO = region.f12324OooO00o;
    }

    public final DefaultRequest OooOOO(String str, String str2, AmazonWebServiceRequest amazonWebServiceRequest, HttpMethodName httpMethodName) {
        DefaultRequest defaultRequest = new DefaultRequest(amazonWebServiceRequest, "Amazon S3");
        this.f38376OooOO0o.getClass();
        defaultRequest.f12073OooO0oo = httpMethodName;
        OooOo0O(defaultRequest, str, str2, null);
        return defaultRequest;
    }

    public final Signer OooOOOo(DefaultRequest defaultRequest, String str, String str2) {
        this.f38376OooOO0o.getClass();
        URI uri = defaultRequest.f12071OooO0o0;
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String strOooOO0 = OooOO0();
        Signer signerOooO0oo = OooO0oo(strOooOO0, AwsHostNameUtils.OooO00o(uri.getHost(), strOooOO0), true);
        if (signerOooO0oo instanceof AWSS3V4Signer) {
            if (defaultRequest.f12071OooO0o0.getHost().endsWith("s3.amazonaws.com") && this.f38377OooOOO == null) {
                String str3 = this.f38377OooOOO == null ? f38372OooOOo.get(str) : this.f38377OooOOO;
                if (str3 != null) {
                    String str4 = (String) RegionUtils.OooO00o(str3).f12326OooO0OO.get("s3");
                    ClientConfiguration clientConfiguration = this.f12045OooO0O0;
                    if (clientConfiguration == null) {
                        throw new IllegalArgumentException("ClientConfiguration cannot be null");
                    }
                    if (str4 == null) {
                        throw new IllegalArgumentException("endpoint cannot be null");
                    }
                    if (!str4.contains("://")) {
                        str4 = clientConfiguration.f12062OooO0Oo.toString() + "://" + str4;
                    }
                    try {
                        OooOo0O(defaultRequest, str, str2, new URI(str4));
                        AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) signerOooO0oo;
                        aWSS3V4Signer.f12082OooO0O0 = OooOO0();
                        aWSS3V4Signer.f12083OooO0OO = str3;
                        return aWSS3V4Signer;
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                if (defaultRequest.f12072OooO0oO instanceof GeneratePresignedUrlRequest) {
                    return OooOOOO(defaultRequest, str, str2);
                }
            }
        }
        String str5 = this.f38377OooOOO == null ? f38372OooOOo.get(str) : this.f38377OooOOO;
        if (str5 == null) {
            return signerOooO0oo instanceof S3Signer ? OooOOOO(defaultRequest, str, str2) : signerOooO0oo;
        }
        AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
        aWSS3V4Signer2.f12082OooO0O0 = OooOO0();
        aWSS3V4Signer2.f12083OooO0OO = str5;
        return aWSS3V4Signer2;
    }

    public final void OooOOo0(String str) {
        Map<String, String> map = f38372OooOOo;
        String str2 = map.get(str);
        Log log = f38373OooOOo0;
        if (str2 == null) {
            if (log.OooO0O0()) {
                log.OooO0oO("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            str2 = null;
            try {
                HeadBucketRequest headBucketRequest = new HeadBucketRequest();
                HttpMethodName httpMethodName = HttpMethodName.HEAD;
                URI uri = new URI("https://s3-us-west-1.amazonaws.com");
                DefaultRequest defaultRequest = new DefaultRequest(headBucketRequest, "Amazon S3");
                this.f38376OooOO0o.getClass();
                defaultRequest.f12073OooO0oo = httpMethodName;
                OooOo0O(defaultRequest, str, null, uri);
                str2 = ((HeadBucketResult) OooOo00(defaultRequest, new HeadBucketResultHandler(), str, null)).f12488OooO00o;
            } catch (AmazonS3Exception e) {
                Map<String, String> map2 = e.f12455OooOO0;
                if (map2 != null) {
                    str2 = map2.get("x-amz-bucket-region");
                }
            } catch (URISyntaxException unused) {
                log.OooO("Error while creating URI");
            }
            if (str2 == null && log.OooO0O0()) {
                log.OooO0oO("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
            }
            if (str2 != null) {
                map.put(str, str2);
            }
        }
        if (log.OooO0O0()) {
            log.OooO0oO("Region for " + str + " is " + str2);
        }
    }

    public final URL OooOOoo(String str, String str2) {
        String strOooO00o;
        DefaultRequest defaultRequest = new DefaultRequest(null, "Amazon S3");
        OooOo0O(defaultRequest, str, str2, null);
        Log log = ServiceUtils.f12431OooO00o;
        boolean z = true;
        String str3 = defaultRequest.f12071OooO0o0 + ("/" + S3HttpUtils.OooO00o(defaultRequest.f12066OooO00o, true)).replaceAll("(?<=/)/", "%2F");
        LinkedHashMap linkedHashMap = defaultRequest.f12068OooO0OO;
        for (String str4 : linkedHashMap.keySet()) {
            if (z) {
                strOooO00o = OooOOOO.OooO00o(str3, "?");
                z = false;
            } else {
                strOooO00o = OooOOOO.OooO00o(str3, "&");
            }
            str3 = strOooO00o + str4 + "=" + S3HttpUtils.OooO00o((String) linkedHashMap.get(str4), false);
        }
        try {
            return new URL(str3);
        } catch (MalformedURLException e) {
            throw new AmazonClientException("Unable to convert request to well formed URL: " + e.getMessage(), e);
        }
    }

    public final Object OooOo00(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, String str, String str2) {
        Map<String, String> map;
        RequestMetricCollector requestMetricCollector = defaultRequest.f12072OooO0oO.f12053OooO0o;
        this.f12046OooO0OO.getClass();
        AwsSdkMetrics.OooO0OO();
        boolean z = true;
        S3ExecutionContext s3ExecutionContext = new S3ExecutionContext(this.f12047OooO0Oo, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null, this);
        AWSRequestMetrics aWSRequestMetrics = s3ExecutionContext.f12171OooO00o;
        if (defaultRequest.f12075OooOO0O != null) {
            throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
        }
        defaultRequest.f12075OooOO0O = aWSRequestMetrics;
        aWSRequestMetrics.OooO0o(AWSRequestMetrics.Field.ClientExecuteTime);
        try {
            try {
                defaultRequest.f12074OooOO0 = 0;
                if (!defaultRequest.f12069OooO0Oo.containsKey("Content-Type")) {
                    defaultRequest.OooO00o("Content-Type", "application/octet-stream");
                }
                if (str != null) {
                    if (!defaultRequest.f12071OooO0o0.getHost().endsWith("s3.amazonaws.com") || this.f38377OooOOO != null) {
                        z = false;
                    }
                    if (z) {
                        OooOOo0(str);
                    }
                }
                AWSCredentials aWSCredentialsOooO00o = this.f38378OooOOO0.OooO00o();
                s3ExecutionContext.f12422OooO0o0 = OooOOOo(defaultRequest, str, str2);
                s3ExecutionContext.f12174OooO0Oo = aWSCredentialsOooO00o;
                T t = this.f12046OooO0OO.OooO0O0(defaultRequest, abstractS3ResponseHandler, this.f38374OooOO0, s3ExecutionContext).f12077OooO00o;
                OooO(aWSRequestMetrics, defaultRequest, false);
                return t;
            } catch (AmazonS3Exception e) {
                if (e.f12041OooO0oO == 301 && (map = e.f12455OooOO0) != null) {
                    String str3 = map.get("x-amz-bucket-region");
                    f38372OooOOo.put(str, str3);
                    e.f12039OooO0o = "The bucket is in this region: " + str3 + ". Please use this region to retry the request";
                }
                throw e;
            }
        } catch (Throwable th) {
            OooO(aWSRequestMetrics, defaultRequest, false);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public final void OooOo0O(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        boolean z;
        if (uri == null) {
            uri = this.f12044OooO00o;
        }
        this.f38376OooOO0o.getClass();
        boolean z2 = false;
        if (BucketNameUtils.OooO00o(str)) {
            String host = uri.getHost();
            if (host != null) {
                String[] strArrSplit = host.split("\\.");
                if (strArrSplit.length == 4) {
                    int length = strArrSplit.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = true;
                            break;
                        }
                        try {
                            int i2 = Integer.parseInt(strArrSplit[i]);
                            if (i2 < 0 || i2 > 255) {
                                z = false;
                                break;
                            }
                            i++;
                        } catch (NumberFormatException unused) {
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                z2 = true;
            }
        }
        if (z2) {
            f38373OooOOo0.OooO0oO("Using virtual style addressing. Endpoint = " + uri);
            try {
                defaultRequest.f12071OooO0o0 = new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority());
                defaultRequest.f12066OooO00o = (str2 == null || !str2.startsWith("/")) ? str2 : "/".concat(str2);
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(o00O00OO.OooO00o("Invalid bucket name: ", str), e);
            }
        } else {
            f38373OooOOo0.OooO0oO("Using path style addressing. Endpoint = " + uri);
            defaultRequest.f12071OooO0o0 = uri;
            if (str != null) {
                StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, "/");
                sbOooO0O0.append(str2 != null ? str2 : "");
                defaultRequest.f12066OooO00o = sbOooO0O0.toString();
            }
        }
        f38373OooOOo0.OooO0oO("Key: " + str2 + "; Request: " + defaultRequest);
    }

    public final void OooOo0o(String str) {
        URI uriOooOO0o = OooOO0o("s3.amazonaws.com");
        String strOooOO0 = OooOO0();
        Signer signerOooO0oo = OooO0oo(strOooOO0, AwsHostNameUtils.OooO00o(uriOooOO0o.getHost(), strOooOO0), false);
        synchronized (this) {
            this.f12044OooO00o = uriOooOO0o;
            this.f12049OooO0o0 = signerOooO0oo;
        }
    }

    public OooOO0O(CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider, Region region) {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        super(clientConfiguration, new UrlHttpClient(clientConfiguration));
        this.f38374OooOO0 = new S3ErrorResponseHandler();
        this.f38375OooOO0O = new S3XmlResponseHandler<>(null);
        this.f38376OooOO0o = new S3ClientOptions();
        this.f38379OooOOOO = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        this.f38380OooOOOo = new CompleteMultipartUploadRetryCondition();
        this.f38378OooOOO0 = cognitoCachingCredentialsProvider;
        if (region != null) {
            this.f12045OooO0O0 = clientConfiguration;
            this.f12050OooO0oO = "s3";
            OooOo0o("s3.amazonaws.com");
            OooOO0O(region);
            HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
            this.f12047OooO0Oo.addAll(handlerChainFactory.OooO00o(RequestHandler.class, "/com/amazonaws/services/s3/request.handlers"));
            this.f12047OooO0Oo.addAll(handlerChainFactory.OooO00o(RequestHandler2.class, "/com/amazonaws/services/s3/request.handler2s"));
            f38373OooOOo0.OooO0oO("initialized with endpoint = " + this.f12044OooO00o);
            return;
        }
        throw new IllegalArgumentException("Region cannot be null. Region is required to sign the request");
    }
}
