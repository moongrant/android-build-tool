package com.yalla.support.cloudfilemanager.uploader;

import OooO00o.OooO00o;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.Presigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressReportingInputStream;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
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
import com.amazonaws.services.s3.internal.S3QueryStringSigner;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketPolicy;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CloudFunctionConfiguration;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketPolicyRequest;
import com.amazonaws.services.s3.model.DeleteBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectTaggingRequest;
import com.amazonaws.services.s3.model.DeleteObjectTaggingResult;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteVersionRequest;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.GenericBucketRequest;
import com.amazonaws.services.s3.model.GetBucketAccelerateConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketAclRequest;
import com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketLocationRequest;
import com.amazonaws.services.s3.model.GetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketMetricsConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketPolicyRequest;
import com.amazonaws.services.s3.model.GetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.GetObjectAclRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GetObjectTaggingRequest;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;
import com.amazonaws.services.s3.model.GetRequestPaymentConfigurationRequest;
import com.amazonaws.services.s3.model.GetS3AccountOwnerRequest;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.LambdaConfiguration;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsRequest;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsRequest;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketsRequest;
import com.amazonaws.services.s3.model.ListMultipartUploadsRequest;
import com.amazonaws.services.s3.model.ListNextBatchOfObjectsRequest;
import com.amazonaws.services.s3.model.ListNextBatchOfVersionsRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.MultiFactorAuthentication;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.QueueConfiguration;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RequestPaymentConfiguration;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.RestoreObjectRequest;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3AccelerateUnsupported;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectIdBuilder;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.SSECustomerKey;
import com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketAclRequest;
import com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketInventoryConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketMetricsConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketPolicyRequest;
import com.amazonaws.services.s3.model.SetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.SetObjectAclRequest;
import com.amazonaws.services.s3.model.SetObjectTaggingRequest;
import com.amazonaws.services.s3.model.SetObjectTaggingResult;
import com.amazonaws.services.s3.model.SetRequestPaymentConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryFilterPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.transform.AclXmlFactory;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.BucketNotificationConfigurationStaxUnmarshaller;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.Unmarshallers$CopyObjectUnmarshaller;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.ValidationUtils;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.appevents.AppEventsConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import javax.net.ssl.SSLProtocolException;
import org.conscrypt.EvpMdRef;
import p016OooOoO0.OooOo00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public class AmazonS3Client1 extends AmazonWebServiceClient implements AmazonS3 {
    private static final int BUCKET_REGION_CACHE_SIZE = 300;
    public static final String S3_SERVICE_NAME = "s3";
    private static final String S3_SIGNER = "S3SignerType";
    private static final String S3_V4_SIGNER = "AWSS3V4SignerType";
    private static final BucketConfigurationXmlFactory bucketConfigurationXmlFactory;
    private static final Map<String, String> bucketRegionCache;
    private static Log log = LogFactory.OooO00o(AmazonS3Client1.class);
    private static final RequestPaymentConfigurationXmlFactory requestPaymentConfigurationXmlFactory;
    private final AWSCredentialsProvider awsCredentialsProvider;
    public S3ClientOptions clientOptions;
    public volatile String clientRegion;
    private final CompleteMultipartUploadRetryCondition completeMultipartUploadRetryCondition;
    private final S3ErrorResponseHandler errorResponseHandler;
    private int notificationThreshold;
    private final S3XmlResponseHandler<Void> voidResponseHandler;

    static {
        AwsSdkMetrics.OooO00o(Arrays.asList((S3ServiceMetric[]) S3ServiceMetric.f10684Oooo.clone()));
        SignerFactory.OooO0O0(S3_SIGNER, S3Signer.class);
        SignerFactory.OooO0O0(S3_V4_SIGNER, AWSS3V4Signer.class);
        bucketConfigurationXmlFactory = new BucketConfigurationXmlFactory();
        requestPaymentConfigurationXmlFactory = new RequestPaymentConfigurationXmlFactory();
        bucketRegionCache = Collections.synchronizedMap(new LinkedHashMap<String, String>(300, 1.1f, true) { // from class: com.yalla.support.cloudfilemanager.uploader.AmazonS3Client1.1
            private static final long serialVersionUID = 23453;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                return size() > 300;
            }
        });
    }

    @Deprecated
    public AmazonS3Client1() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    private static void addAclHeaders(Request<? extends AmazonWebServiceRequest> request, AccessControlList accessControlList) {
        Set<Grant> setOooO00o = accessControlList.OooO00o();
        HashMap map = new HashMap();
        for (Grant grant : setOooO00o) {
            if (!map.containsKey(grant.f10815OooO0O0)) {
                map.put(grant.f10815OooO0O0, new LinkedList());
            }
            ((Collection) map.get(grant.f10815OooO0O0)).add(grant.f10814OooO00o);
        }
        for (Permission permission : Permission.values()) {
            if (map.containsKey(permission)) {
                Collection<Grantee> collection = (Collection) map.get(permission);
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                for (Grantee grantee : collection) {
                    if (z) {
                        sb.append(", ");
                    } else {
                        z = true;
                    }
                    sb.append(grantee.OooO0O0());
                    sb.append("=");
                    sb.append("\"");
                    sb.append(grantee.OooO00o());
                    sb.append("\"");
                }
                ((DefaultRequest) request).OooO00o(permission.OooO00o(), sb.toString());
            }
        }
    }

    private static void addDateHeader(Request<?> request, String str, Date date) {
        if (date != null) {
            Log log2 = ServiceUtils.f10681OooO00o;
            ((DefaultRequest) request).OooO00o(str, DateUtils.OooO0OO(date));
        }
    }

    private static void addHeaderIfNotNull(Request<?> request, String str, String str2) {
        if (str2 != null) {
            ((DefaultRequest) request).OooO00o(str, str2);
        }
    }

    private static void addParameterIfNotNull(Request<?> request, String str, Integer num) {
        if (num != null) {
            addParameterIfNotNull(request, str, num.toString());
        }
    }

    private void addPartNumberIfNotNull(Request<?> request, Integer num) {
        if (num != null) {
            ((DefaultRequest) request).OooO0O0("partNumber", num.toString());
        }
    }

    private static void addResponseHeaderParameters(Request<?> request, ResponseHeaderOverrides responseHeaderOverrides) {
    }

    private static void addStringListHeader(Request<?> request, String str, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Log log2 = ServiceUtils.f10681OooO00o;
        boolean z = true;
        String strOooO0Oo = "";
        for (String str2 : list) {
            if (!z) {
                strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, ", ");
            }
            strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, str2);
            z = false;
        }
        ((DefaultRequest) request).OooO00o(str, strOooO0Oo);
    }

    private <T> void beforeRequest(Request<T> request) {
        List<RequestHandler2> list = this.requestHandler2s;
        if (list != null) {
            Iterator<RequestHandler2> it = list.iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo(request);
            }
        }
    }

    private long calculateContentLength(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        inputStream.mark(-1);
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    inputStream.reset();
                    return j;
                }
                j += (long) i;
            } catch (IOException e) {
                throw new AmazonClientException("Could not calculate content length.", e);
            }
        }
    }

    private URI convertToVirtualHostEndpoint(URI uri, String str) {
        try {
            return new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(OooOo00.OooO0Oo("Invalid bucket name: ", str), e);
        }
    }

    @Deprecated
    private S3Signer createSigV2Signer(Request<?> request, String str, String str2) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("/");
        sbOooO0o0.append(str != null ? OooOo00.OooO0Oo(str, "/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sbOooO0o0.append(str2);
        return new S3Signer(((DefaultRequest) request).f10293OooO0oo.toString(), sbOooO0o0.toString());
    }

    private String fetchRegionFromCache(String str) {
        Map<String, String> map = bucketRegionCache;
        String bucketRegionViaHeadRequest = map.get(str);
        if (bucketRegionViaHeadRequest == null) {
            if (log.OooO0OO()) {
                log.OooO00o("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            bucketRegionViaHeadRequest = getBucketRegionViaHeadRequest(str);
            if (bucketRegionViaHeadRequest != null) {
                map.put(str, bucketRegionViaHeadRequest);
            }
        }
        if (log.OooO0OO()) {
            log.OooO00o("Region for " + str + " is " + bucketRegionViaHeadRequest);
        }
        return bucketRegionViaHeadRequest;
    }

    private void fireProgressEvent(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.f10370OooO0O0 = i;
        progressListenerCallbackExecutor.OooO00o(progressEvent);
    }

    private AccessControlList getAcl(String str, String str2, String str3, boolean z, AmazonWebServiceRequest amazonWebServiceRequest) {
        if (amazonWebServiceRequest == null) {
            amazonWebServiceRequest = new GenericBucketRequest(str);
        }
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, amazonWebServiceRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("acl", null);
        if (str3 != null) {
            defaultRequest.OooO0O0("versionId", str3);
        }
        populateRequesterPaysHeader(defaultRequest, z);
        return (AccessControlList) invoke(defaultRequest, new Unmarshaller<AccessControlList, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$AccessControlListUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final AccessControlList OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.AccessControlListHandler accessControlListHandler = new XmlResponsesSaxParser.AccessControlListHandler();
                xmlResponsesSaxParser.OooO0o0(accessControlListHandler, inputStream);
                return accessControlListHandler.f11027Oooo0oo;
            }
        }, str, str2);
    }

    public static Map<String, String> getBucketRegionCache() {
        return bucketRegionCache;
    }

    private String getBucketRegionViaHeadRequest(String str) {
        String str2 = null;
        try {
            str2 = ((HeadBucketResult) invoke(createRequest(str, null, new HeadBucketRequest(str), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, (String) null)).f10817OooO00o;
        } catch (AmazonS3Exception e) {
            Map<String, String> map = e.f10707OoooO0O;
            if (map != null) {
                str2 = map.get("x-amz-bucket-region");
            }
        } catch (URISyntaxException unused) {
            log.OooO("Error while creating URI");
        }
        if (str2 == null && log.OooO0OO()) {
            log.OooO00o("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
        }
        return str2;
    }

    private RequestPaymentConfiguration getBucketRequestPayment(GetRequestPaymentConfigurationRequest getRequestPaymentConfigurationRequest) {
        String str = getRequestPaymentConfigurationRequest.f10813Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified while getting the Request Payment Configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getRequestPaymentConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("requestPayment", null);
        defaultRequest.OooO00o("Content-Type", "application/xml");
        return (RequestPaymentConfiguration) invoke(defaultRequest, new Unmarshaller<RequestPaymentConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$RequestPaymentConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final RequestPaymentConfiguration OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.RequestPaymentConfigurationHandler requestPaymentConfigurationHandler = new XmlResponsesSaxParser.RequestPaymentConfigurationHandler();
                xmlResponsesSaxParser.OooO0o0(requestPaymentConfigurationHandler, inputStream);
                return new RequestPaymentConfiguration(RequestPaymentConfiguration.Payer.valueOf(requestPaymentConfigurationHandler.f11143Oooo0oo));
            }
        }, str, (String) null);
    }

    private String getHostStyleResourcePath(String str) {
        return (str == null || !str.startsWith("/")) ? str : OooOo00.OooO0Oo("/", str);
    }

    private String getPathStyleResourcePath(String str, String str2) {
        StringBuilder sbOooO00o = Oooo0.OooO00o(str, "/");
        if (str2 == null) {
            str2 = "";
        }
        sbOooO00o.append(str2);
        return sbOooO00o.toString();
    }

    private String getSignerRegion() {
        String signerRegionOverride = getSignerRegionOverride();
        return signerRegionOverride == null ? this.clientRegion : signerRegionOverride;
    }

    @Deprecated
    private void init() {
        setEndpoint("s3.amazonaws.com");
        this.endpointPrefix = S3_SERVICE_NAME;
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.OooO0OO("/com/amazonaws/services/s3/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.OooO0O0("/com/amazonaws/services/s3/request.handler2s"));
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, InputStream> unmarshaller, String str, String str2) {
        return (X) invoke(request, new S3XmlResponseHandler(unmarshaller), str, str2);
    }

    private boolean isSignerOverridden() {
        ClientConfiguration clientConfiguration = this.clientConfiguration;
        if (clientConfiguration == null) {
            return false;
        }
        Objects.requireNonNull(clientConfiguration);
        return false;
    }

    private boolean isStandardEndpoint(URI uri) {
        return uri.getHost().endsWith("s3.amazonaws.com");
    }

    public static boolean isValidIpV4Address(String str) {
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 4) {
            return false;
        }
        for (String str2 : strArrSplit) {
            try {
                int i = Integer.parseInt(str2);
                if (i < 0 || i > 255) {
                    return false;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return true;
    }

    private boolean noExplicitRegionProvided(Request<?> request) {
        return isStandardEndpoint(((DefaultRequest) request).f10291OooO0o0) && getSignerRegion() == null;
    }

    public static void populateRequestMetadata(Request<?> request, ObjectMetadata objectMetadata) {
        Objects.requireNonNull(objectMetadata);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(objectMetadata.f10867Oooo0oO);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(treeMap);
        if (mapUnmodifiableMap.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f10864OoooO0.equals(mapUnmodifiableMap.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            ((DefaultRequest) request).OooO00o((String) entry.getKey(), entry.getValue().toString());
        }
        Date dateOooO00o = DateUtils.OooO00o(objectMetadata.f10868Oooo0oo);
        if (dateOooO00o != null) {
            ((DefaultRequest) request).OooO00o("Expires", DateUtils.OooO0OO(dateOooO00o));
        }
        Map<String, String> map = objectMetadata.f10866Oooo0o;
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
                    ((DefaultRequest) request).OooO00o(OooOo00.OooO0Oo("x-amz-meta-", key), value);
                }
            }
        }
    }

    private void populateRequestWithCopyObjectParameters(Request<? extends AmazonWebServiceRequest> request, CopyObjectRequest copyObjectRequest) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("/");
        sbOooO0o0.append(copyObjectRequest.f10754Oooo);
        sbOooO0o0.append("/");
        sbOooO0o0.append(copyObjectRequest.f10757OoooO00);
        String string = sbOooO0o0.toString();
        if (copyObjectRequest.f10756OoooO0 != null) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(string, "?versionId=");
            sbOooO00o.append(copyObjectRequest.f10756OoooO0);
            string = sbOooO00o.toString();
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO00o("x-amz-copy-source", string);
        addDateHeader(defaultRequest, "x-amz-copy-source-if-modified-since", null);
        addDateHeader(defaultRequest, "x-amz-copy-source-if-unmodified-since", null);
        addStringListHeader(defaultRequest, "x-amz-copy-source-if-match", copyObjectRequest.f10762o000oOoO);
        addStringListHeader(defaultRequest, "x-amz-copy-source-if-none-match", copyObjectRequest.f10760OoooOOO);
        String str = copyObjectRequest.f10759OoooOO0;
        if (str != null) {
            defaultRequest.OooO00o("x-amz-storage-class", str);
        }
        String str2 = copyObjectRequest.f10761OoooOOo;
        if (str2 != null) {
            defaultRequest.OooO00o("x-amz-website-redirect-location", str2);
        }
        populateRequesterPaysHeader(defaultRequest, false);
        populateSourceSSE_C(defaultRequest, null);
        populateSSE_C(defaultRequest, null);
    }

    private void populateRequestWithCopyPartParameters(Request<?> request, CopyPartRequest copyPartRequest) {
        Objects.requireNonNull(copyPartRequest);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO00o("x-amz-copy-source", "/null/null");
        addDateHeader(defaultRequest, "x-amz-copy-source-if-modified-since", null);
        addDateHeader(defaultRequest, "x-amz-copy-source-if-unmodified-since", null);
        addStringListHeader(defaultRequest, "x-amz-copy-source-if-match", copyPartRequest.f10766Oooo);
        addStringListHeader(defaultRequest, "x-amz-copy-source-if-none-match", copyPartRequest.f10767OoooO00);
        populateSourceSSE_C(defaultRequest, null);
        populateSSE_C(defaultRequest, null);
    }

    private void populateRequestWithMfaDetails(Request<?> request, MultiFactorAuthentication multiFactorAuthentication) {
    }

    public static void populateRequesterPaysHeader(Request<?> request, boolean z) {
        if (z) {
            ((DefaultRequest) request).OooO00o("x-amz-request-payer", "requester");
        }
    }

    private static void populateSSE_C(Request<?> request, SSECustomerKey sSECustomerKey) {
    }

    private static void populateSSE_KMS(Request<?> request, SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        if (sSEAwsKeyManagementParams != null) {
            addHeaderIfNotNull(request, "x-amz-server-side-encryption", SSEAlgorithm.KMS.getAlgorithm());
            addHeaderIfNotNull(request, "x-amz-server-side-encryption-aws-kms-key-id", sSEAwsKeyManagementParams.f10911Oooo0o);
        }
    }

    private static void populateSourceSSE_C(Request<?> request, SSECustomerKey sSECustomerKey) {
    }

    private void setAWSS3V4SignerWithServiceNameAndRegion(AWSS3V4Signer aWSS3V4Signer, String str) {
        aWSS3V4Signer.f10302OooO0O0 = getServiceNameIntern();
        aWSS3V4Signer.f10303OooO0OO = str;
    }

    private void setAcl(String str, String str2, String str3, CannedAccessControlList cannedAccessControlList, boolean z, AmazonWebServiceRequest amazonWebServiceRequest) {
        if (amazonWebServiceRequest == null) {
            amazonWebServiceRequest = new GenericBucketRequest(str);
        }
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, amazonWebServiceRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("acl", null);
        defaultRequest.OooO00o("x-amz-acl", cannedAccessControlList.toString());
        if (str3 != null) {
            defaultRequest.OooO0O0("versionId", str3);
        }
        populateRequesterPaysHeader(defaultRequest, z);
        invoke(defaultRequest, this.voidResponseHandler, str, str2);
    }

    private void setBucketAcl0(String str, AccessControlList accessControlList, RequestMetricCollector requestMetricCollector) {
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting a bucket's ACL");
        ValidationUtils.OooO0O0(accessControlList, "The ACL parameter must be specified when setting a bucket's ACL");
        GenericBucketRequest genericBucketRequest = new GenericBucketRequest(str);
        genericBucketRequest.f10274Oooo0oo = requestMetricCollector;
        setAcl(str, (String) null, (String) null, accessControlList, false, (AmazonWebServiceRequest) genericBucketRequest);
    }

    private void setBucketRequestPayment(SetRequestPaymentConfigurationRequest setRequestPaymentConfigurationRequest) {
        String str = setRequestPaymentConfigurationRequest.f10937Oooo;
        RequestPaymentConfiguration requestPaymentConfiguration = setRequestPaymentConfigurationRequest.f10938OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified while setting the Requester Pays.");
        ValidationUtils.OooO0O0(requestPaymentConfiguration, "The request payment configuration parameter must be specified when setting the Requester Pays.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setRequestPaymentConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("requestPayment", null);
        defaultRequest.OooO00o("Content-Type", "application/xml");
        Objects.requireNonNull(requestPaymentConfigurationXmlFactory);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("RequestPaymentConfiguration");
        RequestPaymentConfiguration.Payer payer = requestPaymentConfiguration.f10888OooO00o;
        if (payer != null) {
            xmlWriter.OooO0Oo("Payer");
            xmlWriter.OooO0oO(payer.toString());
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    private void setContent(Request<?> request, byte[] bArr, String str, boolean z) {
        ((DefaultRequest) request).f10285OooO = new ByteArrayInputStream(bArr);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO00o("Content-Length", Integer.toString(bArr.length));
        defaultRequest.OooO00o("Content-Type", str);
        if (z) {
            try {
                defaultRequest.OooO00o("Content-MD5", Base64.OooO0O0(Md5Utils.OooO0O0(bArr)));
            } catch (Exception e) {
                throw new AmazonClientException("Couldn't compute md5 sum", e);
            }
        }
    }

    private void setZeroContentLength(Request<?> request) {
        ((DefaultRequest) request).OooO00o("Content-Length", String.valueOf(0));
    }

    private boolean shouldRetryCompleteMultipartUpload(AmazonWebServiceRequest amazonWebServiceRequest, AmazonS3Exception amazonS3Exception, int i) {
        RetryPolicy retryPolicy = this.clientConfiguration.f10281OooO0OO;
        if (retryPolicy == null || retryPolicy.f10568OooO00o == null || retryPolicy == PredefinedRetryPolicies.f10561OooO00o) {
            return false;
        }
        return this.completeMultipartUploadRetryCondition.OooO00o(amazonS3Exception, i);
    }

    private boolean shouldUseVirtualAddressing(URI uri, String str) {
        return (this.clientOptions.f10633OooO0O0 || !BucketNameUtils.OooO0O0(str, false) || isValidIpV4Address(uri.getHost())) ? false : true;
    }

    private ByteArrayInputStream toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[262144];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (IOException e) {
                throw new AmazonClientException("Failed to read from inputstream", e);
            }
        }
    }

    private String urlEncodeTags(ObjectTagging objectTagging) {
        if (objectTagging == null || objectTagging.f10870Oooo0o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Tag> it = objectTagging.f10870Oooo0o.iterator();
        while (it.hasNext()) {
            Tag next = it.next();
            sb.append(S3HttpUtils.OooO00o(next.f10939Oooo0o, false));
            sb.append('=');
            sb.append(S3HttpUtils.OooO00o(next.f10940Oooo0oO, false));
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public void abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(abortMultipartUploadRequest, "The request parameter must be specified when aborting a multipart upload");
        ValidationUtils.OooO0O0(abortMultipartUploadRequest.f10689Oooo, "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.OooO0O0(abortMultipartUploadRequest.f10691OoooO00, "The key parameter must be specified when aborting a multipart upload");
        ValidationUtils.OooO0O0(abortMultipartUploadRequest.f10690OoooO0, "The upload ID parameter must be specified when aborting a multipart upload");
        String str = abortMultipartUploadRequest.f10689Oooo;
        String str2 = abortMultipartUploadRequest.f10691OoooO00;
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, abortMultipartUploadRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("uploadId", abortMultipartUploadRequest.f10690OoooO0);
        populateRequesterPaysHeader(defaultRequest, false);
        invoke(defaultRequest, this.voidResponseHandler, str, str2);
    }

    public void changeObjectStorageClass(String str, String str2, StorageClass storageClass) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucketName parameter must be specified when changing an object's storage class");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when changing an object's storage class");
        ValidationUtils.OooO0O0(storageClass, "The newStorageClass parameter must be specified when changing an object's storage class");
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, str, str2);
        copyObjectRequest.f10759OoooOO0 = storageClass.toString();
        copyObject(copyObjectRequest);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(completeMultipartUploadRequest, "The request parameter must be specified when completing a multipart upload");
        String str = completeMultipartUploadRequest.f10750Oooo;
        String str2 = completeMultipartUploadRequest.f10752OoooO00;
        String str3 = completeMultipartUploadRequest.f10751OoooO0;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when completing a multipart upload");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when completing a multipart upload");
        ValidationUtils.OooO0O0(str3, "The upload ID parameter must be specified when completing a multipart upload");
        ValidationUtils.OooO0O0(completeMultipartUploadRequest.f10753OoooO0O, "The part ETags parameter must be specified when completing a multipart upload");
        int i = 0;
        while (true) {
            DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, completeMultipartUploadRequest, HttpMethodName.POST);
            defaultRequest.OooO0O0("uploadId", str3);
            populateRequesterPaysHeader(defaultRequest, false);
            byte[] bArrOooO00o = RequestXmlFactory.OooO00o(completeMultipartUploadRequest.f10753OoooO0O);
            defaultRequest.OooO00o("Content-Type", "application/xml");
            defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO00o.length));
            defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO00o);
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) invoke(defaultRequest, new ResponseHeaderHandlerChain(new Unmarshaller<XmlResponsesSaxParser.CompleteMultipartUploadHandler, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                public final XmlResponsesSaxParser.CompleteMultipartUploadHandler OooO00o(InputStream inputStream) throws Exception {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                    xmlResponsesSaxParser.OooO0o0(completeMultipartUploadHandler2, inputStream);
                    return completeMultipartUploadHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), str, str2);
            CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadHandler.f11061Oooo0oo;
            if (completeMultipartUploadResult != null) {
                return completeMultipartUploadResult;
            }
            int i2 = i + 1;
            if (!shouldRetryCompleteMultipartUpload(completeMultipartUploadRequest, completeMultipartUploadHandler.f11060Oooo, i)) {
                throw completeMultipartUploadHandler.f11060Oooo;
            }
            i = i2;
        }
    }

    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(copyObjectRequest.f10754Oooo, "The source bucket name must be specified when copying an object");
        ValidationUtils.OooO0O0(copyObjectRequest.f10757OoooO00, "The source object key must be specified when copying an object");
        ValidationUtils.OooO0O0(copyObjectRequest.f10758OoooO0O, "The destination bucket name must be specified when copying an object");
        ValidationUtils.OooO0O0(copyObjectRequest.f10755OoooO, "The destination object key must be specified when copying an object");
        String str = copyObjectRequest.f10755OoooO;
        String str2 = copyObjectRequest.f10758OoooO0O;
        Request<? extends AmazonWebServiceRequest> requestCreateRequest = createRequest(str2, str, copyObjectRequest, HttpMethodName.PUT);
        populateRequestWithCopyObjectParameters(requestCreateRequest, copyObjectRequest);
        populateSSE_KMS(requestCreateRequest, null);
        setZeroContentLength(requestCreateRequest);
        try {
            XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = (XmlResponsesSaxParser.CopyObjectResultHandler) invoke(requestCreateRequest, new ResponseHeaderHandlerChain(new Unmarshallers$CopyObjectUnmarshaller(), new ServerSideEncryptionHeaderHandler(), new S3VersionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3RequesterChargedHeaderHandler()), str2, str);
            String str3 = copyObjectResultHandler.f11065Oooo;
            if (str3 == null) {
                CopyObjectResult copyObjectResult = new CopyObjectResult();
                CopyObjectResult copyObjectResult2 = copyObjectResultHandler.f11066Oooo0oo;
                copyObjectResult.f10763Oooo = copyObjectResult2.f10763Oooo;
                copyObjectResult.f10765OoooO00 = copyObjectResult2.f10765OoooO00;
                copyObjectResult.f10764OoooO0 = copyObjectResult2.f10764OoooO0;
                copyObjectResult.f10678Oooo0o = copyObjectResultHandler.OooO0oO();
                copyObjectResult.f10679Oooo0oO = copyObjectResultHandler.OooOOO0();
                copyObjectResult.f10680Oooo0oo = copyObjectResultHandler.OooOO0();
                Objects.requireNonNull(copyObjectResultHandler.f11066Oooo0oo);
                return copyObjectResult;
            }
            String str4 = copyObjectResultHandler.f11068OoooO00;
            String str5 = copyObjectResultHandler.f11067OoooO0;
            String str6 = copyObjectResultHandler.f11069OoooO0O;
            AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str4);
            amazonS3Exception.f10269Oooo0oO = str3;
            amazonS3Exception.f10268Oooo0o = str5;
            amazonS3Exception.f10706OoooO0 = str6;
            amazonS3Exception.f10271OoooO00 = ((DefaultRequest) requestCreateRequest).f10290OooO0o;
            amazonS3Exception.f10267Oooo = 200;
            throw amazonS3Exception;
        } catch (AmazonS3Exception e) {
            if (e.f10267Oooo == 412) {
                return null;
            }
            throw e;
        }
    }

    public CopyPartResult copyPart(CopyPartRequest copyPartRequest) {
        Objects.requireNonNull(copyPartRequest);
        ValidationUtils.OooO0O0(null, "The source bucket name must be specified when copying a part");
        ValidationUtils.OooO0O0(null, "The source object key must be specified when copying a part");
        ValidationUtils.OooO0O0(null, "The destination bucket name must be specified when copying a part");
        ValidationUtils.OooO0O0(null, "The upload id must be specified when copying a part");
        ValidationUtils.OooO0O0(null, "The destination object key must be specified when copying a part");
        ValidationUtils.OooO0O0(0, "The part number must be specified when copying a part");
        Request<?> requestCreateRequest = createRequest(null, null, copyPartRequest, HttpMethodName.PUT);
        populateRequestWithCopyPartParameters(requestCreateRequest, copyPartRequest);
        DefaultRequest defaultRequest = (DefaultRequest) requestCreateRequest;
        defaultRequest.OooO0O0("uploadId", null);
        defaultRequest.OooO0O0("partNumber", Integer.toString(0));
        setZeroContentLength(defaultRequest);
        try {
            XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = (XmlResponsesSaxParser.CopyObjectResultHandler) invoke(defaultRequest, new ResponseHeaderHandlerChain(new Unmarshallers$CopyObjectUnmarshaller(), new ServerSideEncryptionHeaderHandler(), new S3VersionHeaderHandler()), (String) null, (String) null);
            String str = copyObjectResultHandler.f11065Oooo;
            if (str == null) {
                CopyPartResult copyPartResult = new CopyPartResult();
                CopyObjectResult copyObjectResult = copyObjectResultHandler.f11066Oooo0oo;
                String str2 = copyObjectResult.f10763Oooo;
                Date date = copyObjectResult.f10765OoooO00;
                String str3 = copyObjectResult.f10764OoooO0;
                copyPartResult.f10678Oooo0o = copyObjectResultHandler.OooO0oO();
                copyPartResult.f10679Oooo0oO = copyObjectResultHandler.OooOOO0();
                copyPartResult.f10680Oooo0oo = copyObjectResultHandler.OooOO0();
                return copyPartResult;
            }
            String str4 = copyObjectResultHandler.f11068OoooO00;
            String str5 = copyObjectResultHandler.f11067OoooO0;
            String str6 = copyObjectResultHandler.f11069OoooO0O;
            AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str4);
            amazonS3Exception.f10269Oooo0oO = str;
            amazonS3Exception.f10268Oooo0o = str5;
            amazonS3Exception.f10706OoooO0 = str6;
            amazonS3Exception.f10271OoooO00 = defaultRequest.f10290OooO0o;
            amazonS3Exception.f10267Oooo = 200;
            throw amazonS3Exception;
        } catch (AmazonS3Exception e) {
            if (e.f10267Oooo == 412) {
                return null;
            }
            throw e;
        }
    }

    public Bucket createBucket(String str) throws AmazonClientException {
        return createBucket(new CreateBucketRequest(str));
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    public final ExecutionContext createExecutionContext(AmazonWebServiceRequest amazonWebServiceRequest) {
        return new S3ExecutionContext(this.requestHandler2s, isRequestMetricsEnabled(amazonWebServiceRequest) || AmazonWebServiceClient.isProfilingEnabled(), this);
    }

    public <X extends AmazonWebServiceRequest> Request<X> createRequest(String str, String str2, X x, HttpMethodName httpMethodName) {
        return createRequest(str, str2, x, httpMethodName, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public Signer createSigner(Request<?> request, String str, String str2) {
        String signerRegionOverride;
        Signer signerByURI = getSignerByURI(this.clientOptions.f10634OooO0OO ? this.endpoint : ((DefaultRequest) request).f10291OooO0o0);
        if (!isSignerOverridden()) {
            if ((signerByURI instanceof AWSS3V4Signer) && noExplicitRegionProvided(request)) {
                String str3 = this.clientRegion == null ? bucketRegionCache.get(str) : this.clientRegion;
                if (str3 != null) {
                    resolveRequestEndpoint(request, str, str2, RuntimeHttpUtils.OooO00o((String) RegionUtils.OooO00o(str3).f10556OooO0OO.get(S3_SERVICE_NAME), this.clientConfiguration));
                    AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) signerByURI;
                    setAWSS3V4SignerWithServiceNameAndRegion(aWSS3V4Signer, str3);
                    return aWSS3V4Signer;
                }
                if (((DefaultRequest) request).f10292OooO0oO instanceof GeneratePresignedUrlRequest) {
                    return createSigV2Signer(request, str, str2);
                }
            }
            if (getSignerRegionOverride() == null) {
                signerRegionOverride = this.clientRegion == null ? bucketRegionCache.get(str) : this.clientRegion;
            } else {
                signerRegionOverride = getSignerRegionOverride();
            }
            if (signerRegionOverride != null) {
                AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
                setAWSS3V4SignerWithServiceNameAndRegion(aWSS3V4Signer2, signerRegionOverride);
                return aWSS3V4Signer2;
            }
        }
        return signerByURI instanceof S3Signer ? createSigV2Signer(request, str, str2) : signerByURI;
    }

    public void deleteBucket(String str) throws AmazonClientException {
        deleteBucket(new DeleteBucketRequest(str));
    }

    public DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(String str, String str2) throws AmazonClientException {
        return deleteBucketAnalyticsConfiguration(new DeleteBucketAnalyticsConfigurationRequest(str, str2));
    }

    public void deleteBucketCrossOriginConfiguration(String str) {
        deleteBucketCrossOriginConfiguration(new DeleteBucketCrossOriginConfigurationRequest(str));
    }

    public DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(String str, String str2) throws AmazonClientException {
        return deleteBucketInventoryConfiguration(new DeleteBucketInventoryConfigurationRequest(str, str2));
    }

    public void deleteBucketLifecycleConfiguration(String str) {
        deleteBucketLifecycleConfiguration(new DeleteBucketLifecycleConfigurationRequest(str));
    }

    public DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(String str, String str2) throws AmazonClientException {
        return deleteBucketMetricsConfiguration(new DeleteBucketMetricsConfigurationRequest(str, str2));
    }

    public void deleteBucketPolicy(String str) throws AmazonClientException {
        deleteBucketPolicy(new DeleteBucketPolicyRequest(str));
    }

    public void deleteBucketReplicationConfiguration(DeleteBucketReplicationConfigurationRequest deleteBucketReplicationConfigurationRequest) throws AmazonClientException {
        String str = deleteBucketReplicationConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when deleting replication configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketReplicationConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("replication", null);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public void deleteBucketTaggingConfiguration(String str) {
        deleteBucketTaggingConfiguration(new DeleteBucketTaggingConfigurationRequest(str));
    }

    public void deleteBucketWebsiteConfiguration(DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest) throws AmazonClientException {
        String str = deleteBucketWebsiteConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when deleting a bucket's website configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketWebsiteConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("website", null);
        defaultRequest.OooO00o("Content-Type", "application/xml");
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public void deleteObject(String str, String str2) throws AmazonClientException {
        deleteObject(new DeleteObjectRequest(str, str2));
    }

    public DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest) {
        ValidationUtils.OooO0O0(deleteObjectTaggingRequest, "The request parameter must be specified when delete the object tags");
        ValidationUtils.OooO0OO(null, "BucketName");
        throw null;
    }

    public DeleteObjectsResult deleteObjects(DeleteObjectsRequest deleteObjectsRequest) {
        throw null;
    }

    public void deleteVersion(String str, String str2, String str3) throws AmazonClientException {
        deleteVersion(new DeleteVersionRequest(str, str2, str3));
    }

    public void disableRequesterPays(String str) {
        setBucketRequestPayment(new SetRequestPaymentConfigurationRequest(str, new RequestPaymentConfiguration(RequestPaymentConfiguration.Payer.BucketOwner)));
    }

    public boolean doesBucketExist(String str) throws AmazonClientException {
        try {
            headBucket(new HeadBucketRequest(str));
            return true;
        } catch (AmazonServiceException e) {
            int i = e.f10267Oooo;
            if (i == 301 || i == 403) {
                return true;
            }
            if (i == 404) {
                return false;
            }
            throw e;
        }
    }

    public boolean doesObjectExist(String str, String str2) throws AmazonClientException {
        try {
            getObjectMetadata(str, str2);
            return true;
        } catch (AmazonS3Exception e) {
            if (e.f10267Oooo == 404) {
                return false;
            }
            throw e;
        }
    }

    public void enableRequesterPays(String str) {
        setBucketRequestPayment(new SetRequestPaymentConfigurationRequest(str, new RequestPaymentConfiguration(RequestPaymentConfiguration.Payer.Requester)));
    }

    public URL generatePresignedUrl(String str, String str2, Date date) throws AmazonClientException {
        return generatePresignedUrl(str, str2, date, HttpMethod.GET);
    }

    public BucketAccelerateConfiguration getBucketAccelerateConfiguration(String str) throws AmazonClientException {
        return getBucketAccelerateConfiguration(new GetBucketAccelerateConfigurationRequest(str));
    }

    public AccessControlList getBucketAcl(String str) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when requesting a bucket's ACL");
        return getAcl(str, null, null, false, null);
    }

    public GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(String str, String str2) throws AmazonClientException {
        return getBucketAnalyticsConfiguration(new GetBucketAnalyticsConfigurationRequest(str, str2));
    }

    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(String str) {
        return getBucketCrossOriginConfiguration(new GetBucketCrossOriginConfigurationRequest(str));
    }

    public GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(String str, String str2) throws AmazonClientException {
        return getBucketInventoryConfiguration(new GetBucketInventoryConfigurationRequest(str, str2));
    }

    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(String str) {
        return getBucketLifecycleConfiguration(new GetBucketLifecycleConfigurationRequest(str));
    }

    public String getBucketLocation(GetBucketLocationRequest getBucketLocationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketLocationRequest, "The request parameter must be specified when requesting a bucket's location");
        String str = getBucketLocationRequest.f10799Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when requesting a bucket's location");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketLocationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("location", null);
        return (String) invoke(defaultRequest, new Unmarshaller<String, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketLocationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final String OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.BucketLocationHandler bucketLocationHandler = new XmlResponsesSaxParser.BucketLocationHandler();
                xmlResponsesSaxParser.OooO0o0(bucketLocationHandler, inputStream);
                String str2 = bucketLocationHandler.f11045Oooo0oo;
                return str2 == null ? "US" : str2;
            }
        }, str, (String) null);
    }

    public BucketLoggingConfiguration getBucketLoggingConfiguration(String str) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when requesting a bucket's logging status");
        return getBucketLoggingConfiguration(new GetBucketLoggingConfigurationRequest(str));
    }

    public GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(String str, String str2) throws AmazonClientException {
        return getBucketMetricsConfiguration(new GetBucketMetricsConfigurationRequest(str, str2));
    }

    public BucketNotificationConfiguration getBucketNotificationConfiguration(GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest) throws AmazonClientException {
        String str = getBucketNotificationConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket request must specify a bucket name when querying notification configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketNotificationConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("notification", null);
        return (BucketNotificationConfiguration) invoke(defaultRequest, BucketNotificationConfigurationStaxUnmarshaller.f11013OooO00o, str, (String) null);
    }

    public BucketPolicy getBucketPolicy(String str) throws AmazonClientException {
        return getBucketPolicy(new GetBucketPolicyRequest(str));
    }

    public BucketReplicationConfiguration getBucketReplicationConfiguration(String str) throws AmazonClientException {
        return getBucketReplicationConfiguration(new GetBucketReplicationConfigurationRequest(str));
    }

    public BucketTaggingConfiguration getBucketTaggingConfiguration(String str) {
        return getBucketTaggingConfiguration(new GetBucketTaggingConfigurationRequest(str));
    }

    public BucketVersioningConfiguration getBucketVersioningConfiguration(String str) throws AmazonClientException {
        return getBucketVersioningConfiguration(new GetBucketVersioningConfigurationRequest(str));
    }

    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest) throws AmazonClientException {
        String str = getBucketWebsiteConfigurationRequest.f10803Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when requesting a bucket's website configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketWebsiteConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("website", null);
        defaultRequest.OooO00o("Content-Type", "application/xml");
        try {
            return (BucketWebsiteConfiguration) invoke(defaultRequest, new Unmarshaller<BucketWebsiteConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketWebsiteConfigurationUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                public final BucketWebsiteConfiguration OooO00o(InputStream inputStream) throws Exception {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.BucketWebsiteConfigurationHandler bucketWebsiteConfigurationHandler = new XmlResponsesSaxParser.BucketWebsiteConfigurationHandler();
                    xmlResponsesSaxParser.OooO0o0(bucketWebsiteConfigurationHandler, inputStream);
                    return bucketWebsiteConfigurationHandler.f11057Oooo0oo;
                }
            }, str, (String) null);
        } catch (AmazonServiceException e) {
            if (e.f10267Oooo == 404) {
                return null;
            }
            throw e;
        }
    }

    public S3ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        Objects.requireNonNull(this.client);
        return null;
    }

    public S3Object getObject(String str, String str2) throws AmazonClientException {
        return getObject(new GetObjectRequest(str, str2));
    }

    public AccessControlList getObjectAcl(String str, String str2) throws AmazonClientException {
        return getObjectAcl(new GetObjectAclRequest(str, str2));
    }

    public String getObjectAsString(String str, String str2) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "Bucket name must be provided");
        ValidationUtils.OooO0O0(str2, "Object key must be provided");
        try {
            return IOUtils.OooO00o(getObject(str, str2).f10897Oooo);
        } catch (IOException unused) {
            throw new AmazonClientException("Error streaming content from S3 during download");
        }
    }

    public ObjectMetadata getObjectMetadata(String str, String str2) throws AmazonClientException {
        return getObjectMetadata(new GetObjectMetadataRequest(str, str2));
    }

    public GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest) {
        ValidationUtils.OooO0O0(getObjectTaggingRequest, "The request parameter must be specified when getting the object tags");
        ValidationUtils.OooO0OO(null, "BucketName");
        throw null;
    }

    public Region getRegion() {
        String authority = this.endpoint.getAuthority();
        if ("s3.amazonaws.com".equals(authority)) {
            return Region.US_Standard;
        }
        Matcher matcher = Region.S3_REGIONAL_ENDPOINT_PATTERN.matcher(authority);
        if (matcher.matches()) {
            return Region.OooO00o(matcher.group(1));
        }
        throw new IllegalStateException("S3 client with invalid S3 endpoint configured");
    }

    public String getRegionName() {
        String authority = this.endpoint.getAuthority();
        if ("s3.amazonaws.com".equals(authority)) {
            return "us-east-1";
        }
        Matcher matcher = Region.S3_REGIONAL_ENDPOINT_PATTERN.matcher(authority);
        try {
            matcher.matches();
            return RegionUtils.OooO00o(matcher.group(1)).f10554OooO00o;
        } catch (Exception e) {
            throw new IllegalStateException("No valid region has been specified. Unable to return region name", e);
        }
    }

    public String getResourceUrl(String str, String str2) {
        try {
            return getUrl(str, str2).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public Owner getS3AccountOwner() throws AmazonClientException {
        return getS3AccountOwner(new GetS3AccountOwnerRequest());
    }

    public URL getUrl(String str, String str2) {
        DefaultRequest defaultRequest = new DefaultRequest(null, "Amazon S3");
        resolveRequestEndpoint(defaultRequest, str, str2);
        return ServiceUtils.OooO00o(defaultRequest, false);
    }

    public HeadBucketResult headBucket(HeadBucketRequest headBucketRequest) throws AmazonClientException {
        String str = headBucketRequest.f10816Oooo;
        ValidationUtils.OooO0O0(str, "The bucketName parameter must be specified.");
        return (HeadBucketResult) invoke(createRequest(str, null, headBucketRequest, HttpMethodName.HEAD), new HeadBucketResultHandler(), str, (String) null);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest initiateMultipartUploadRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(initiateMultipartUploadRequest, "The request parameter must be specified when initiating a multipart upload");
        ValidationUtils.OooO0O0(initiateMultipartUploadRequest.f10818Oooo, "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.OooO0O0(initiateMultipartUploadRequest.f10821OoooO00, "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(initiateMultipartUploadRequest.f10818Oooo, initiateMultipartUploadRequest.f10821OoooO00, initiateMultipartUploadRequest, HttpMethodName.POST);
        defaultRequest.OooO0O0("uploads", null);
        CannedAccessControlList cannedAccessControlList = initiateMultipartUploadRequest.f10822OoooO0O;
        if (cannedAccessControlList != null) {
            defaultRequest.OooO00o("x-amz-acl", cannedAccessControlList.toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f10820OoooO0;
        if (objectMetadata != null) {
            populateRequestMetadata(defaultRequest, objectMetadata);
        }
        addHeaderIfNotNull(defaultRequest, "x-amz-tagging", urlEncodeTags(initiateMultipartUploadRequest.f10823OoooOO0));
        populateRequesterPaysHeader(defaultRequest, false);
        populateSSE_C(defaultRequest, null);
        populateSSE_KMS(defaultRequest, initiateMultipartUploadRequest.f10819OoooO);
        setZeroContentLength(defaultRequest);
        defaultRequest.f10285OooO = new ByteArrayInputStream(new byte[0]);
        return (InitiateMultipartUploadResult) invoke(defaultRequest, new ResponseHeaderHandlerChain(new Unmarshaller<InitiateMultipartUploadResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final InitiateMultipartUploadResult OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.OooO0o0(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.f11098Oooo0oo;
            }
        }, new ServerSideEncryptionHeaderHandler()), initiateMultipartUploadRequest.f10818Oooo, initiateMultipartUploadRequest.f10821OoooO00);
    }

    public boolean isRequesterPaysEnabled(String str) {
        return getBucketRequestPayment(new GetRequestPaymentConfigurationRequest(str)).f10888OooO00o == RequestPaymentConfiguration.Payer.Requester;
    }

    public ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurations(ListBucketAnalyticsConfigurationsRequest listBucketAnalyticsConfigurationsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(listBucketAnalyticsConfigurationsRequest, "The request cannot be null");
        ValidationUtils.OooO0OO(null, "BucketName");
        throw null;
    }

    public ListBucketInventoryConfigurationsResult listBucketInventoryConfigurations(ListBucketInventoryConfigurationsRequest listBucketInventoryConfigurationsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(listBucketInventoryConfigurationsRequest, "The request cannot be null");
        ValidationUtils.OooO0OO(null, "BucketName");
        throw null;
    }

    public ListBucketMetricsConfigurationsResult listBucketMetricsConfigurations(ListBucketMetricsConfigurationsRequest listBucketMetricsConfigurationsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(listBucketMetricsConfigurationsRequest, "The request cannot be null");
        ValidationUtils.OooO0OO(null, "BucketName");
        throw null;
    }

    public List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest) throws AmazonClientException {
        return (List) invoke(createRequest(null, null, listBucketsRequest, HttpMethodName.GET), new Unmarshaller<List<Bucket>, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketsUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final List<Bucket> OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.ListAllMyBucketsHandler listAllMyBucketsHandler = new XmlResponsesSaxParser.ListAllMyBucketsHandler();
                xmlResponsesSaxParser.OooO0o0(listAllMyBucketsHandler, xmlResponsesSaxParser.OooO0o(listAllMyBucketsHandler, inputStream));
                return listAllMyBucketsHandler.f11100Oooo0oo;
            }
        }, (String) null, (String) null);
    }

    public MultipartUploadListing listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(null, "The request parameter must be specified when listing multipart uploads");
        throw null;
    }

    public ObjectListing listNextBatchOfObjects(ListNextBatchOfObjectsRequest listNextBatchOfObjectsRequest) throws AmazonClientException {
        ObjectListing objectListing = listNextBatchOfObjectsRequest.f10829Oooo;
        if (objectListing.f10861OoooO00) {
            ListObjectsRequest listObjectsRequest = new ListObjectsRequest(objectListing.f10858Oooo0oo, objectListing.f10860OoooO0, objectListing.f10855Oooo, objectListing.f10859OoooO, Integer.valueOf(objectListing.f10862OoooO0O));
            listObjectsRequest.f10836OoooOO0 = listNextBatchOfObjectsRequest.f10829Oooo.f10863OoooOO0;
            return listObjects(listObjectsRequest);
        }
        ObjectListing objectListing2 = new ObjectListing();
        objectListing2.f10858Oooo0oo = objectListing.f10858Oooo0oo;
        objectListing2.f10859OoooO = objectListing.f10859OoooO;
        objectListing2.f10862OoooO0O = objectListing.f10862OoooO0O;
        objectListing2.f10860OoooO0 = objectListing.f10860OoooO0;
        objectListing2.f10863OoooOO0 = objectListing.f10863OoooOO0;
        objectListing2.f10861OoooO00 = false;
        return objectListing2;
    }

    public VersionListing listNextBatchOfVersions(VersionListing versionListing) throws AmazonClientException {
        return listNextBatchOfVersions(new ListNextBatchOfVersionsRequest(versionListing));
    }

    public ObjectListing listObjects(ListObjectsRequest listObjectsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(listObjectsRequest.f10831Oooo, "The bucket name parameter must be specified when listing objects in a bucket");
        final boolean zEquals = "url".equals(listObjectsRequest.f10836OoooOO0);
        Request requestCreateRequest = createRequest(listObjectsRequest.f10831Oooo, null, listObjectsRequest, HttpMethodName.GET);
        addParameterIfNotNull((Request<?>) requestCreateRequest, "prefix", listObjectsRequest.f10834OoooO00);
        addParameterIfNotNull((Request<?>) requestCreateRequest, "delimiter", listObjectsRequest.f10835OoooO0O);
        addParameterIfNotNull((Request<?>) requestCreateRequest, "marker", listObjectsRequest.f10833OoooO0);
        addParameterIfNotNull((Request<?>) requestCreateRequest, "encoding-type", listObjectsRequest.f10836OoooOO0);
        populateRequesterPaysHeader(requestCreateRequest, false);
        Integer num = listObjectsRequest.f10832OoooO;
        if (num != null && num.intValue() >= 0) {
            ((DefaultRequest) requestCreateRequest).OooO0O0("max-keys", listObjectsRequest.f10832OoooO.toString());
        }
        return (ObjectListing) invoke(requestCreateRequest, new Unmarshaller<ObjectListing, InputStream>(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsUnmarshaller

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final boolean f11021OooO00o;

            {
                this.f11021OooO00o = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            public final ObjectListing OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.ListBucketHandler listBucketHandler = new XmlResponsesSaxParser.ListBucketHandler(this.f11021OooO00o);
                xmlResponsesSaxParser.OooO0o0(listBucketHandler, xmlResponsesSaxParser.OooO0o(listBucketHandler, inputStream));
                return listBucketHandler.f11113Oooo0oo;
            }
        }, listObjectsRequest.f10831Oooo, (String) null);
    }

    public ListObjectsV2Result listObjectsV2(ListObjectsV2Request listObjectsV2Request) throws AmazonClientException {
        ValidationUtils.OooO0O0(listObjectsV2Request.f10837Oooo, "The bucket name parameter must be specified when listing objects in a bucket");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(listObjectsV2Request.f10837Oooo, null, listObjectsV2Request, HttpMethodName.GET);
        defaultRequest.OooO0O0("list-type", FeedbackType.Suggestions);
        addParameterIfNotNull(defaultRequest, "start-after", (String) null);
        addParameterIfNotNull(defaultRequest, "continuation-token", (String) null);
        addParameterIfNotNull(defaultRequest, "delimiter", (String) null);
        addParameterIfNotNull(defaultRequest, "max-keys", (Integer) null);
        addParameterIfNotNull(defaultRequest, "prefix", listObjectsV2Request.f10838OoooO00);
        addParameterIfNotNull(defaultRequest, "encoding-type", (String) null);
        defaultRequest.OooO0O0("fetch-owner", Boolean.toString(false));
        populateRequesterPaysHeader(defaultRequest, false);
        final boolean zEquals = "url".equals(null);
        return (ListObjectsV2Result) invoke(defaultRequest, new Unmarshaller<ListObjectsV2Result, InputStream>(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsV2Unmarshaller

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final boolean f11022OooO00o;

            {
                this.f11022OooO00o = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            public final ListObjectsV2Result OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.ListObjectsV2Handler listObjectsV2Handler = new XmlResponsesSaxParser.ListObjectsV2Handler(this.f11022OooO00o);
                xmlResponsesSaxParser.OooO0o0(listObjectsV2Handler, xmlResponsesSaxParser.OooO0o(listObjectsV2Handler, inputStream));
                return listObjectsV2Handler.f11133Oooo0oo;
            }
        }, listObjectsV2Request.f10837Oooo, (String) null);
    }

    public PartListing listParts(ListPartsRequest listPartsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(null, "The request parameter must be specified when listing parts");
        throw null;
    }

    public VersionListing listVersions(ListVersionsRequest listVersionsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(listVersionsRequest.f10844Oooo, "The bucket name parameter must be specified when listing versions in a bucket");
        final boolean zEquals = "url".equals(listVersionsRequest.f10850o000oOoO);
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(listVersionsRequest.f10844Oooo, null, listVersionsRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("versions", null);
        addParameterIfNotNull(defaultRequest, "prefix", listVersionsRequest.f10847OoooO00);
        addParameterIfNotNull(defaultRequest, "delimiter", listVersionsRequest.f10845OoooO);
        addParameterIfNotNull(defaultRequest, "key-marker", listVersionsRequest.f10846OoooO0);
        addParameterIfNotNull(defaultRequest, "version-id-marker", listVersionsRequest.f10848OoooO0O);
        addParameterIfNotNull(defaultRequest, "encoding-type", listVersionsRequest.f10850o000oOoO);
        Integer num = listVersionsRequest.f10849OoooOO0;
        if (num != null && num.intValue() >= 0) {
            defaultRequest.OooO0O0("max-keys", listVersionsRequest.f10849OoooOO0.toString());
        }
        return (VersionListing) invoke(defaultRequest, new Unmarshaller<VersionListing, InputStream>(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$VersionListUnmarshaller

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final boolean f11023OooO00o;

            {
                this.f11023OooO00o = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            public final VersionListing OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.ListVersionsHandler listVersionsHandler = new XmlResponsesSaxParser.ListVersionsHandler(this.f11023OooO00o);
                xmlResponsesSaxParser.OooO0o0(listVersionsHandler, xmlResponsesSaxParser.OooO0o(listVersionsHandler, inputStream));
                return listVersionsHandler.f11140Oooo0oo;
            }
        }, listVersionsRequest.f10844Oooo, (String) null);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public <T> void presignRequest(Request<T> request, HttpMethod httpMethod, String str, String str2, Date date, String str3) {
        beforeRequest(request);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("/");
        sbOooO0o0.append(str != null ? OooOo00.OooO0Oo(str, "/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sbOooO0o0.append(str2);
        sbOooO0o0.append(str3 != null ? OooOo00.OooO0Oo("?", str3) : "");
        String strReplaceAll = sbOooO0o0.toString().replaceAll("(?<=/)/", "%2F");
        AWSCredentials aWSCredentialsOooO00o = this.awsCredentialsProvider.OooO00o();
        AmazonWebServiceRequest amazonWebServiceRequest = ((DefaultRequest) request).f10292OooO0oO;
        new S3QueryStringSigner(httpMethod.toString(), strReplaceAll, date).OooO0O0(request, aWSCredentialsOooO00o);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (defaultRequest.f10289OooO0Oo.containsKey("x-amz-security-token")) {
            defaultRequest.OooO0O0("x-amz-security-token", (String) defaultRequest.f10289OooO0Oo.get("x-amz-security-token"));
            defaultRequest.f10289OooO0Oo.remove("x-amz-security-token");
        }
    }

    public PutObjectResult putObject(String str, String str2, File file) throws AmazonClientException {
        PutObjectRequest putObjectRequest = new PutObjectRequest(str, str2, file);
        putObjectRequest.f10693OoooO = new ObjectMetadata();
        return putObject(putObjectRequest);
    }

    public void resolveRequestEndpoint(Request<?> request, String str, String str2) {
        resolveRequestEndpoint(request, str, str2, null);
    }

    public void restoreObject(RestoreObjectRequest restoreObjectRequest) throws AmazonServiceException {
        String str = restoreObjectRequest.f10891OoooO00;
        String str2 = restoreObjectRequest.f10890OoooO0;
        int i = restoreObjectRequest.f10889Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when copying a glacier object");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when copying a glacier object");
        if (i == -1) {
            throw new IllegalArgumentException("The expiration in days parameter must be specified when copying a glacier object");
        }
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, restoreObjectRequest, HttpMethodName.POST);
        defaultRequest.OooO0O0("restore", null);
        populateRequesterPaysHeader(defaultRequest, false);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0Oo("RestoreRequest");
        xmlWriter.OooO0Oo("Days");
        xmlWriter.OooO00o(Integer.toString(restoreObjectRequest.f10889Oooo), xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        try {
            defaultRequest.OooO00o("Content-MD5", Base64.OooO0O0(Md5Utils.OooO0O0(bArrOooO0OO)));
            invoke(defaultRequest, this.voidResponseHandler, str, str2);
        } catch (Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }
    }

    public void setBucketAccelerateConfiguration(String str, BucketAccelerateConfiguration bucketAccelerateConfiguration) throws AmazonClientException {
        setBucketAccelerateConfiguration(new SetBucketAccelerateConfigurationRequest(str, bucketAccelerateConfiguration));
    }

    public void setBucketAcl(String str, AccessControlList accessControlList) throws AmazonClientException {
        setBucketAcl0(str, accessControlList, (RequestMetricCollector) null);
    }

    public SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(String str, AnalyticsConfiguration analyticsConfiguration) throws AmazonClientException {
        return setBucketAnalyticsConfiguration(new SetBucketAnalyticsConfigurationRequest(str, analyticsConfiguration));
    }

    public void setBucketCrossOriginConfiguration(String str, BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {
        setBucketCrossOriginConfiguration(new SetBucketCrossOriginConfigurationRequest(str, bucketCrossOriginConfiguration));
    }

    public SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(String str, InventoryConfiguration inventoryConfiguration) throws AmazonClientException {
        return setBucketInventoryConfiguration(new SetBucketInventoryConfigurationRequest(str, inventoryConfiguration));
    }

    public void setBucketLifecycleConfiguration(String str, BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        setBucketLifecycleConfiguration(new SetBucketLifecycleConfigurationRequest(str, bucketLifecycleConfiguration));
    }

    public void setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(null, "The set bucket logging configuration request object must be specified when enabling server access logging");
        throw null;
    }

    public SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(String str, MetricsConfiguration metricsConfiguration) throws AmazonClientException {
        return setBucketMetricsConfiguration(new SetBucketMetricsConfigurationRequest(str, metricsConfiguration));
    }

    public void setBucketNotificationConfiguration(String str, BucketNotificationConfiguration bucketNotificationConfiguration) throws AmazonClientException {
        setBucketNotificationConfiguration(new SetBucketNotificationConfigurationRequest(str, bucketNotificationConfiguration));
    }

    public void setBucketPolicy(String str, String str2) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucket name must be specified when setting a bucket policy");
        ValidationUtils.OooO0O0(str2, "The policy text must be specified when setting a bucket policy");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, new GenericBucketRequest(str), HttpMethodName.PUT);
        defaultRequest.OooO0O0("policy", null);
        Log log2 = ServiceUtils.f10681OooO00o;
        byte[] bytes = str2.getBytes(StringUtils.f11186OooO00o);
        defaultRequest.OooO00o("Content-Length", String.valueOf(bytes.length));
        defaultRequest.f10285OooO = new ByteArrayInputStream(bytes);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public void setBucketReplicationConfiguration(String str, BucketReplicationConfiguration bucketReplicationConfiguration) throws AmazonClientException {
        setBucketReplicationConfiguration(new SetBucketReplicationConfigurationRequest(str, bucketReplicationConfiguration));
    }

    public void setBucketTaggingConfiguration(String str, BucketTaggingConfiguration bucketTaggingConfiguration) {
        setBucketTaggingConfiguration(new SetBucketTaggingConfigurationRequest(str, bucketTaggingConfiguration));
    }

    public void setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(null, "The SetBucketVersioningConfigurationRequest object must be specified when setting versioning configuration");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.LinkedList, java.util.List<com.amazonaws.services.s3.model.RoutingRule>] */
    public void setBucketWebsiteConfiguration(SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest) throws AmazonClientException {
        String str = setBucketWebsiteConfigurationRequest.f10930Oooo;
        BucketWebsiteConfiguration bucketWebsiteConfiguration = setBucketWebsiteConfigurationRequest.f10931OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting a bucket's website configuration");
        ValidationUtils.OooO0O0(bucketWebsiteConfiguration, "The bucket website configuration parameter must be specified when setting a bucket's website configuration");
        if (bucketWebsiteConfiguration.f10740Oooo0oo == null) {
            ValidationUtils.OooO0O0(bucketWebsiteConfiguration.f10738Oooo0o, "The bucket website configuration parameter must specify the index document suffix when setting a bucket's website configuration");
        }
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketWebsiteConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("website", null);
        defaultRequest.OooO00o("Content-Type", "application/xml");
        Objects.requireNonNull(bucketConfigurationXmlFactory);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("WebsiteConfiguration");
        if (bucketWebsiteConfiguration.f10738Oooo0o != null) {
            xmlWriter.OooO0Oo("IndexDocument");
            xmlWriter.OooO0Oo("Suffix");
            xmlWriter.OooO00o(bucketWebsiteConfiguration.f10738Oooo0o, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            xmlWriter.OooO0O0();
        }
        if (bucketWebsiteConfiguration.f10739Oooo0oO != null) {
            xmlWriter.OooO0Oo("ErrorDocument");
            xmlWriter.OooO0Oo("Key");
            xmlWriter.OooO00o(bucketWebsiteConfiguration.f10739Oooo0oO, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            xmlWriter.OooO0O0();
        }
        RedirectRule redirectRule = bucketWebsiteConfiguration.f10740Oooo0oo;
        if (redirectRule != null) {
            xmlWriter.OooO0Oo("RedirectAllRequestsTo");
            if (redirectRule.f10878OooO00o != null) {
                xmlWriter.OooO0Oo("Protocol");
                xmlWriter.OooO00o(redirectRule.f10878OooO00o, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            if (redirectRule.f10879OooO0O0 != null) {
                xmlWriter.OooO0Oo("HostName");
                xmlWriter.OooO00o(redirectRule.f10879OooO0O0, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            if (redirectRule.f10880OooO0OO != null) {
                xmlWriter.OooO0Oo("ReplaceKeyPrefixWith");
                xmlWriter.OooO00o(redirectRule.f10880OooO0OO, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            if (redirectRule.f10881OooO0Oo != null) {
                xmlWriter.OooO0Oo("ReplaceKeyWith");
                xmlWriter.OooO00o(redirectRule.f10881OooO0Oo, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        ?? r4 = bucketWebsiteConfiguration.f10737Oooo;
        if (r4 != 0 && r4.size() > 0) {
            xmlWriter.OooO0Oo("RoutingRules");
            for (RoutingRule routingRule : bucketWebsiteConfiguration.f10737Oooo) {
                xmlWriter.OooO0Oo("RoutingRule");
                RoutingRuleCondition routingRuleCondition = routingRule.f10892OooO00o;
                if (routingRuleCondition != null) {
                    xmlWriter.OooO0Oo("Condition");
                    xmlWriter.OooO0Oo("KeyPrefixEquals");
                    String str2 = routingRuleCondition.f10894OooO00o;
                    if (str2 != null) {
                        xmlWriter.OooO0oO(str2);
                    }
                    xmlWriter.OooO0O0();
                    if (routingRuleCondition.f10895OooO0O0 != null) {
                        xmlWriter.OooO0Oo("HttpErrorCodeReturnedEquals ");
                        xmlWriter.OooO00o(routingRuleCondition.f10895OooO0O0, xmlWriter.f10683OooO0O0);
                        xmlWriter.OooO0O0();
                    }
                    xmlWriter.OooO0O0();
                }
                xmlWriter.OooO0Oo("Redirect");
                RedirectRule redirectRule2 = routingRule.f10893OooO0O0;
                if (redirectRule2 != null) {
                    if (redirectRule2.f10878OooO00o != null) {
                        xmlWriter.OooO0Oo("Protocol");
                        xmlWriter.OooO00o(redirectRule2.f10878OooO00o, xmlWriter.f10683OooO0O0);
                        xmlWriter.OooO0O0();
                    }
                    if (redirectRule2.f10879OooO0O0 != null) {
                        xmlWriter.OooO0Oo("HostName");
                        xmlWriter.OooO00o(redirectRule2.f10879OooO0O0, xmlWriter.f10683OooO0O0);
                        xmlWriter.OooO0O0();
                    }
                    if (redirectRule2.f10880OooO0OO != null) {
                        xmlWriter.OooO0Oo("ReplaceKeyPrefixWith");
                        xmlWriter.OooO00o(redirectRule2.f10880OooO0OO, xmlWriter.f10683OooO0O0);
                        xmlWriter.OooO0O0();
                    }
                    if (redirectRule2.f10881OooO0Oo != null) {
                        xmlWriter.OooO0Oo("ReplaceKeyWith");
                        xmlWriter.OooO00o(redirectRule2.f10881OooO0Oo, xmlWriter.f10683OooO0O0);
                        xmlWriter.OooO0O0();
                    }
                    if (redirectRule2.f10882OooO0o0 != null) {
                        xmlWriter.OooO0Oo("HttpRedirectCode");
                        xmlWriter.OooO00o(redirectRule2.f10882OooO0o0, xmlWriter.f10683OooO0O0);
                        xmlWriter.OooO0O0();
                    }
                }
                xmlWriter.OooO0O0();
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    public void setEndpoint(String str) {
        if (str.endsWith("s3-accelerate.amazonaws.com")) {
            throw new IllegalStateException("To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
        }
        super.setEndpoint(str);
        if (str.endsWith("s3.amazonaws.com")) {
            return;
        }
        this.clientRegion = AwsHostNameUtils.OooO00o(this.endpoint.getHost(), S3_SERVICE_NAME);
    }

    public void setNotificationThreshold(int i) {
        this.notificationThreshold = i;
    }

    public void setObjectAcl(String str, String str2, AccessControlList accessControlList) throws AmazonClientException {
        setObjectAcl(str, str2, (String) null, accessControlList);
    }

    public void setObjectRedirectLocation(String str, String str2, String str3) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucketName parameter must be specified when changing an object's storage class");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when changing an object's storage class");
        ValidationUtils.OooO0O0(str3, "The newStorageClass parameter must be specified when changing an object's storage class");
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, str, str2);
        copyObjectRequest.f10761OoooOOo = str3;
        copyObject(copyObjectRequest);
    }

    public SetObjectTaggingResult setObjectTagging(SetObjectTaggingRequest setObjectTaggingRequest) {
        ValidationUtils.OooO0O0(setObjectTaggingRequest, "The request parameter must be specified setting the object tags");
        ValidationUtils.OooO0OO(null, "BucketName");
        throw null;
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    public void setRegion(com.amazonaws.regions.Region region) {
        super.setRegion(region);
        this.clientRegion = region.f10554OooO00o;
    }

    public void setS3ClientOptions(S3ClientOptions s3ClientOptions) {
        this.clientOptions = new S3ClientOptions(s3ClientOptions);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(uploadPartRequest, "The request parameter must be specified when uploading a part");
        String str = uploadPartRequest.f10949OoooO00;
        String str2 = uploadPartRequest.f10948OoooO0;
        String str3 = uploadPartRequest.f10950OoooO0O;
        int i = uploadPartRequest.f10947OoooO;
        long j = uploadPartRequest.f10951OoooOO0;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when uploading a part");
        ValidationUtils.OooO0O0(str3, "The upload ID parameter must be specified when uploading a part");
        ValidationUtils.OooO0O0(Integer.valueOf(i), "The part number parameter must be specified when uploading a part");
        ValidationUtils.OooO0O0(Long.valueOf(j), "The part size parameter must be specified when uploading a part");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, uploadPartRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("uploadId", str3);
        defaultRequest.OooO0O0("partNumber", Integer.toString(i));
        MD5DigestCalculatingInputStream mD5DigestCalculatingInputStream = null;
        addHeaderIfNotNull(defaultRequest, "Content-MD5", null);
        defaultRequest.OooO00o("Content-Length", Long.toString(j));
        populateRequesterPaysHeader(defaultRequest, false);
        populateSSE_C(defaultRequest, null);
        if (uploadPartRequest.f10953o000oOoO == null) {
            throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
        }
        try {
            InputStream inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.f10953o000oOoO), uploadPartRequest.f10952OoooOOO, j);
            if (!ServiceUtils.OooO0Oo(uploadPartRequest, this.clientOptions)) {
                mD5DigestCalculatingInputStream = new MD5DigestCalculatingInputStream(inputSubstream);
                inputSubstream = mD5DigestCalculatingInputStream;
            }
            ProgressListenerCallbackExecutor progressListenerCallbackExecutorOooO0O0 = ProgressListenerCallbackExecutor.OooO0O0(uploadPartRequest.f10272Oooo0o);
            if (progressListenerCallbackExecutorOooO0O0 != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutorOooO0O0);
                progressReportingInputStream.f10376Oooo0o = this.notificationThreshold * 1024;
                fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 1024);
                inputSubstream = progressReportingInputStream;
            }
            try {
                try {
                    defaultRequest.f10285OooO = inputSubstream;
                    ObjectMetadata objectMetadata = (ObjectMetadata) invoke(defaultRequest, new S3MetadataResponseHandler(), str, str2);
                    if (objectMetadata != null && mD5DigestCalculatingInputStream != null && !ServiceUtils.OooO0o0(objectMetadata, this.clientOptions) && !Arrays.equals(mD5DigestCalculatingInputStream.f10649Oooo0o.digest(), BinaryUtils.OooO00o(objectMetadata.OooOOOo()))) {
                        throw new AmazonClientException("Unable to verify integrity of data upload.  Client calculated content hash didn't match hash calculated by Amazon S3.  You may need to delete the data stored in Amazon S3.");
                    }
                    fireProgressEvent(progressListenerCallbackExecutorOooO0O0, RecyclerView.oo0o0Oo.FLAG_MOVED);
                    UploadPartResult uploadPartResult = new UploadPartResult();
                    uploadPartResult.f10954Oooo = objectMetadata.OooOOOo();
                    uploadPartResult.f10678Oooo0o = objectMetadata.OooO0oO();
                    uploadPartResult.f10679Oooo0oO = objectMetadata.OooOOO0();
                    uploadPartResult.f10680Oooo0oo = objectMetadata.OooOO0();
                    objectMetadata.f10867Oooo0oO.get("x-amz-request-charged");
                    try {
                        inputSubstream.close();
                    } catch (Exception unused) {
                    }
                    return uploadPartResult;
                } catch (AmazonClientException e) {
                    fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 4096);
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

    @Deprecated
    public AmazonS3Client1(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    private static void addParameterIfNotNull(Request<?> request, String str, String str2) {
        if (str2 != null) {
            ((DefaultRequest) request).OooO0O0(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> httpResponseHandler, String str, String str2) {
        Map<String, String> map;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        AmazonWebServiceRequest amazonWebServiceRequest = defaultRequest.f10292OooO0oO;
        ExecutionContext executionContextCreateExecutionContext = createExecutionContext(amazonWebServiceRequest);
        AWSRequestMetrics aWSRequestMetrics = executionContextCreateExecutionContext.f10387OooO00o;
        defaultRequest.OooO0OO(aWSRequestMetrics);
        aWSRequestMetrics.OooO0o(AWSRequestMetrics.Field.ClientExecuteTime);
        Response<?> responseOooO0O0 = null;
        try {
            try {
                ((DefaultRequest) request).f10294OooOO0 = this.timeOffset;
                if (!((DefaultRequest) request).f10289OooO0Oo.containsKey("Content-Type")) {
                    defaultRequest.OooO00o("Content-Type", "application/octet-stream");
                }
                if (str != null && !(((DefaultRequest) request).f10292OooO0oO instanceof CreateBucketRequest) && noExplicitRegionProvided(request)) {
                    fetchRegionFromCache(str);
                }
                AWSCredentials aWSCredentialsOooO00o = this.awsCredentialsProvider.OooO00o();
                Objects.requireNonNull(amazonWebServiceRequest);
                executionContextCreateExecutionContext.OooO0O0(createSigner(request, str, str2));
                executionContextCreateExecutionContext.f10390OooO0Oo = aWSCredentialsOooO00o;
                responseOooO0O0 = this.client.OooO0O0(request, httpResponseHandler, this.errorResponseHandler, executionContextCreateExecutionContext);
                X x = (X) responseOooO0O0.f10297OooO00o;
                endClientExecution(aWSRequestMetrics, request, responseOooO0O0);
                return x;
            } catch (AmazonS3Exception e) {
                if (e.f10267Oooo == 301 && (map = e.f10707OoooO0O) != null) {
                    String str3 = map.get("x-amz-bucket-region");
                    bucketRegionCache.put(str, str3);
                    e.f10270Oooo0oo = "The bucket is in this region: " + str3 + ". Please use this region to retry the request";
                }
                throw e;
            }
        } catch (Throwable th) {
            endClientExecution(aWSRequestMetrics, request, responseOooO0O0);
            throw th;
        }
    }

    public Bucket createBucket(String str, Region region) throws AmazonClientException {
        return createBucket(new CreateBucketRequest(str, region));
    }

    public <X extends AmazonWebServiceRequest> Request<X> createRequest(String str, String str2, X x, HttpMethodName httpMethodName, URI uri) {
        DefaultRequest defaultRequest = new DefaultRequest(x, "Amazon S3");
        S3ClientOptions s3ClientOptions = this.clientOptions;
        if (s3ClientOptions.f10634OooO0OO && !(defaultRequest.f10292OooO0oO instanceof S3AccelerateUnsupported)) {
            uri = s3ClientOptions.f10635OooO0Oo ? RuntimeHttpUtils.OooO00o("s3-accelerate.dualstack.amazonaws.com", this.clientConfiguration) : RuntimeHttpUtils.OooO00o("s3-accelerate.amazonaws.com", this.clientConfiguration);
        }
        defaultRequest.f10293OooO0oo = httpMethodName;
        resolveRequestEndpoint(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    public void deleteBucket(DeleteBucketRequest deleteBucketRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteBucketRequest, "The DeleteBucketRequest parameter must be specified when deleting a bucket");
        String str = deleteBucketRequest.f10777Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when deleting a bucket");
        invoke(createRequest(str, null, deleteBucketRequest, HttpMethodName.DELETE), this.voidResponseHandler, str, (String) null);
        bucketRegionCache.remove(str);
    }

    public DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteBucketAnalyticsConfigurationRequest, "The request cannot be null");
        String str = deleteBucketAnalyticsConfigurationRequest.f10770Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        String str2 = deleteBucketAnalyticsConfigurationRequest.f10771OoooO00;
        ValidationUtils.OooO0OO(str2, "Analytics Id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketAnalyticsConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("analytics", null);
        defaultRequest.OooO0O0("id", str2);
        return (DeleteBucketAnalyticsConfigurationResult) invoke(defaultRequest, new Unmarshaller<DeleteBucketAnalyticsConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteBucketAnalyticsConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final DeleteBucketAnalyticsConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                return new DeleteBucketAnalyticsConfigurationResult();
            }
        }, str, (String) null);
    }

    public void deleteBucketCrossOriginConfiguration(DeleteBucketCrossOriginConfigurationRequest deleteBucketCrossOriginConfigurationRequest) {
        ValidationUtils.OooO0O0(deleteBucketCrossOriginConfigurationRequest, "The delete bucket cross origin configuration request object must be specified.");
        String str = deleteBucketCrossOriginConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when deleting bucket cross origin configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketCrossOriginConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("cors", null);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(DeleteBucketInventoryConfigurationRequest deleteBucketInventoryConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteBucketInventoryConfigurationRequest, "The request cannot be null");
        String str = deleteBucketInventoryConfigurationRequest.f10772Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        String str2 = deleteBucketInventoryConfigurationRequest.f10773OoooO00;
        ValidationUtils.OooO0OO(str2, "Inventory id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketInventoryConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("inventory", null);
        defaultRequest.OooO0O0("id", str2);
        return (DeleteBucketInventoryConfigurationResult) invoke(defaultRequest, new Unmarshaller<DeleteBucketInventoryConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteBucketInventoryConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final DeleteBucketInventoryConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                return new DeleteBucketInventoryConfigurationResult();
            }
        }, str, (String) null);
    }

    public void deleteBucketLifecycleConfiguration(DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest) {
        ValidationUtils.OooO0O0(deleteBucketLifecycleConfigurationRequest, "The delete bucket lifecycle configuration request object must be specified.");
        String str = deleteBucketLifecycleConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when deleting bucket lifecycle configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketLifecycleConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("lifecycle", null);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(DeleteBucketMetricsConfigurationRequest deleteBucketMetricsConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteBucketMetricsConfigurationRequest, "The request cannot be null");
        String str = deleteBucketMetricsConfigurationRequest.f10774Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        String str2 = deleteBucketMetricsConfigurationRequest.f10775OoooO00;
        ValidationUtils.OooO0OO(str2, "Metrics Id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketMetricsConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("metrics", null);
        defaultRequest.OooO0O0("id", str2);
        return (DeleteBucketMetricsConfigurationResult) invoke(defaultRequest, new Unmarshaller<DeleteBucketMetricsConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteBucketMetricsConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final DeleteBucketMetricsConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                return new DeleteBucketMetricsConfigurationResult();
            }
        }, str, (String) null);
    }

    public void deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteBucketPolicyRequest, "The request object must be specified when deleting a bucket policy");
        String str = deleteBucketPolicyRequest.f10776Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name must be specified when deleting a bucket policy");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketPolicyRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("policy", null);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public void deleteBucketTaggingConfiguration(DeleteBucketTaggingConfigurationRequest deleteBucketTaggingConfigurationRequest) {
        ValidationUtils.OooO0O0(deleteBucketTaggingConfigurationRequest, "The delete bucket tagging configuration request object must be specified.");
        String str = deleteBucketTaggingConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when deleting bucket tagging configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, deleteBucketTaggingConfigurationRequest, HttpMethodName.DELETE);
        defaultRequest.OooO0O0("tagging", null);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public void deleteObject(DeleteObjectRequest deleteObjectRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteObjectRequest, "The delete object request must be specified when deleting an object");
        ValidationUtils.OooO0O0(deleteObjectRequest.f10778Oooo, "The bucket name must be specified when deleting an object");
        ValidationUtils.OooO0O0(deleteObjectRequest.f10779OoooO00, "The key must be specified when deleting an object");
        invoke(createRequest(deleteObjectRequest.f10778Oooo, deleteObjectRequest.f10779OoooO00, deleteObjectRequest, HttpMethodName.DELETE), this.voidResponseHandler, deleteObjectRequest.f10778Oooo, deleteObjectRequest.f10779OoooO00);
    }

    public void deleteVersion(DeleteVersionRequest deleteVersionRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(deleteVersionRequest, "The delete version request object must be specified when deleting a version");
        String str = deleteVersionRequest.f10780Oooo;
        String str2 = deleteVersionRequest.f10782OoooO00;
        String str3 = deleteVersionRequest.f10781OoooO0;
        ValidationUtils.OooO0O0(str, "The bucket name must be specified when deleting a version");
        ValidationUtils.OooO0O0(str2, "The key must be specified when deleting a version");
        ValidationUtils.OooO0O0(str3, "The version ID must be specified when deleting a version");
        Request requestCreateRequest = createRequest(str, str2, deleteVersionRequest, HttpMethodName.DELETE);
        ((DefaultRequest) requestCreateRequest).OooO0O0("versionId", str3);
        invoke(requestCreateRequest, this.voidResponseHandler, str, str2);
    }

    public URL generatePresignedUrl(String str, String str2, Date date, HttpMethod httpMethod) throws AmazonClientException {
        GeneratePresignedUrlRequest generatePresignedUrlRequest = new GeneratePresignedUrlRequest(str, str2, httpMethod);
        generatePresignedUrlRequest.f10793OoooO0O = date;
        return generatePresignedUrl(generatePresignedUrlRequest);
    }

    public BucketAccelerateConfiguration getBucketAccelerateConfiguration(GetBucketAccelerateConfigurationRequest getBucketAccelerateConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketAccelerateConfigurationRequest, "getBucketAccelerateConfigurationRequest must be specified.");
        String str = getBucketAccelerateConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when querying accelerate configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketAccelerateConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("accelerate", null);
        return (BucketAccelerateConfiguration) invoke(defaultRequest, new Unmarshaller<BucketAccelerateConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketAccelerateConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final BucketAccelerateConfiguration OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.BucketAccelerateConfigurationHandler bucketAccelerateConfigurationHandler = new XmlResponsesSaxParser.BucketAccelerateConfigurationHandler();
                xmlResponsesSaxParser.OooO0o0(bucketAccelerateConfigurationHandler, inputStream);
                return bucketAccelerateConfigurationHandler.f11029Oooo0oo;
            }
        }, str, (String) null);
    }

    public GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(GetBucketAnalyticsConfigurationRequest getBucketAnalyticsConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketAnalyticsConfigurationRequest, "The request cannot be null");
        String str = getBucketAnalyticsConfigurationRequest.f10795Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        String str2 = getBucketAnalyticsConfigurationRequest.f10796OoooO00;
        ValidationUtils.OooO0OO(str2, "Analytics Id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketAnalyticsConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("analytics", null);
        defaultRequest.OooO0O0("id", str2);
        return (GetBucketAnalyticsConfigurationResult) invoke(defaultRequest, new Unmarshaller<GetBucketAnalyticsConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$GetBucketAnalyticsConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final GetBucketAnalyticsConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                new XmlResponsesSaxParser().OooO0o0(new XmlResponsesSaxParser.GetBucketAnalyticsConfigurationHandler(), inputStream);
                return new GetBucketAnalyticsConfigurationResult();
            }
        }, str, (String) null);
    }

    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(GetBucketCrossOriginConfigurationRequest getBucketCrossOriginConfigurationRequest) {
        ValidationUtils.OooO0O0(getBucketCrossOriginConfigurationRequest, "The request object parameter getBucketCrossOriginConfigurationRequest must be specified.");
        String str = getBucketCrossOriginConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name must be specified when retrieving the bucket cross origin configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketCrossOriginConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("cors", null);
        try {
            return (BucketCrossOriginConfiguration) invoke(defaultRequest, new Unmarshaller<BucketCrossOriginConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketCrossOriginConfigurationUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                public final BucketCrossOriginConfiguration OooO00o(InputStream inputStream) throws Exception {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.BucketCrossOriginConfigurationHandler bucketCrossOriginConfigurationHandler = new XmlResponsesSaxParser.BucketCrossOriginConfigurationHandler();
                    xmlResponsesSaxParser.OooO0o0(bucketCrossOriginConfigurationHandler, inputStream);
                    return bucketCrossOriginConfigurationHandler.f11031Oooo0oo;
                }
            }, str, (String) null);
        } catch (AmazonServiceException e) {
            if (e.f10267Oooo == 404) {
                return null;
            }
            throw e;
        }
    }

    public GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketInventoryConfigurationRequest, "The request cannot be null");
        String str = getBucketInventoryConfigurationRequest.f10797Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        String str2 = getBucketInventoryConfigurationRequest.f10798OoooO00;
        ValidationUtils.OooO0OO(str2, "Inventory id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketInventoryConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("inventory", null);
        defaultRequest.OooO0O0("id", str2);
        return (GetBucketInventoryConfigurationResult) invoke(defaultRequest, new Unmarshaller<GetBucketInventoryConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$GetBucketInventoryConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final GetBucketInventoryConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.GetBucketInventoryConfigurationHandler getBucketInventoryConfigurationHandler = new XmlResponsesSaxParser.GetBucketInventoryConfigurationHandler();
                xmlResponsesSaxParser.OooO0o0(getBucketInventoryConfigurationHandler, inputStream);
                GetBucketInventoryConfigurationResult getBucketInventoryConfigurationResult = getBucketInventoryConfigurationHandler.f11083Oooo0oo;
                Objects.requireNonNull(getBucketInventoryConfigurationResult);
                return getBucketInventoryConfigurationResult;
            }
        }, str, (String) null);
    }

    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) {
        ValidationUtils.OooO0O0(getBucketLifecycleConfigurationRequest, "The request object pamameter getBucketLifecycleConfigurationRequest must be specified.");
        String str = getBucketLifecycleConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name must be specifed when retrieving the bucket lifecycle configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketLifecycleConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("lifecycle", null);
        try {
            return (BucketLifecycleConfiguration) invoke(defaultRequest, new Unmarshaller<BucketLifecycleConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketLifecycleConfigurationUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                public final BucketLifecycleConfiguration OooO00o(InputStream inputStream) throws Exception {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.BucketLifecycleConfigurationHandler bucketLifecycleConfigurationHandler = new XmlResponsesSaxParser.BucketLifecycleConfigurationHandler();
                    xmlResponsesSaxParser.OooO0o0(bucketLifecycleConfigurationHandler, inputStream);
                    return bucketLifecycleConfigurationHandler.f11037Oooo0oo;
                }
            }, str, (String) null);
        } catch (AmazonServiceException e) {
            if (e.f10267Oooo == 404) {
                return null;
            }
            throw e;
        }
    }

    public GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(GetBucketMetricsConfigurationRequest getBucketMetricsConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketMetricsConfigurationRequest, "The request cannot be null");
        String str = getBucketMetricsConfigurationRequest.f10800Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        String str2 = getBucketMetricsConfigurationRequest.f10801OoooO00;
        ValidationUtils.OooO0OO(str2, "Metrics Id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketMetricsConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("metrics", null);
        defaultRequest.OooO0O0("id", str2);
        return (GetBucketMetricsConfigurationResult) invoke(defaultRequest, new Unmarshaller<GetBucketMetricsConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$GetBucketMetricsConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final GetBucketMetricsConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                new XmlResponsesSaxParser().OooO0o0(new XmlResponsesSaxParser.GetBucketMetricsConfigurationHandler(), inputStream);
                return new GetBucketMetricsConfigurationResult();
            }
        }, str, (String) null);
    }

    public BucketPolicy getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketPolicyRequest, "The request object must be specified when getting a bucket policy");
        String str = getBucketPolicyRequest.f10802Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name must be specified when getting a bucket policy");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketPolicyRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("policy", null);
        BucketPolicy bucketPolicy = new BucketPolicy();
        try {
            return bucketPolicy;
        } catch (AmazonServiceException e) {
            if (e.OooO0O0().equals("NoSuchBucketPolicy")) {
                return bucketPolicy;
            }
            throw e;
        }
    }

    public BucketReplicationConfiguration getBucketReplicationConfiguration(GetBucketReplicationConfigurationRequest getBucketReplicationConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketReplicationConfigurationRequest, "The bucket request parameter must be specified when retrieving replication configuration");
        String str = getBucketReplicationConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket request must specify a bucket name when retrieving replication configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketReplicationConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("replication", null);
        return (BucketReplicationConfiguration) invoke(defaultRequest, new Unmarshaller<BucketReplicationConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketReplicationConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final BucketReplicationConfiguration OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.BucketReplicationConfigurationHandler bucketReplicationConfigurationHandler = new XmlResponsesSaxParser.BucketReplicationConfigurationHandler();
                xmlResponsesSaxParser.OooO0o0(bucketReplicationConfigurationHandler, inputStream);
                return bucketReplicationConfigurationHandler.f11048Oooo0oo;
            }
        }, str, (String) null);
    }

    public BucketTaggingConfiguration getBucketTaggingConfiguration(GetBucketTaggingConfigurationRequest getBucketTaggingConfigurationRequest) {
        ValidationUtils.OooO0O0(getBucketTaggingConfigurationRequest, "The request object parameter getBucketTaggingConfigurationRequest must be specifed.");
        String str = getBucketTaggingConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name must be specified when retrieving the bucket tagging configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketTaggingConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("tagging", null);
        try {
            return (BucketTaggingConfiguration) invoke(defaultRequest, new Unmarshaller<BucketTaggingConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketTaggingConfigurationUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                public final BucketTaggingConfiguration OooO00o(InputStream inputStream) throws Exception {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.BucketTaggingConfigurationHandler bucketTaggingConfigurationHandler = new XmlResponsesSaxParser.BucketTaggingConfigurationHandler();
                    xmlResponsesSaxParser.OooO0o0(bucketTaggingConfigurationHandler, inputStream);
                    return bucketTaggingConfigurationHandler.f11052Oooo0oo;
                }
            }, str, (String) null);
        } catch (AmazonServiceException e) {
            if (e.f10267Oooo == 404) {
                return null;
            }
            throw e;
        }
    }

    public BucketVersioningConfiguration getBucketVersioningConfiguration(GetBucketVersioningConfigurationRequest getBucketVersioningConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketVersioningConfigurationRequest, "The request object parameter getBucketVersioningConfigurationRequest must be specified.");
        String str = getBucketVersioningConfigurationRequest.f10794Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when querying versioning configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, getBucketVersioningConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("versioning", null);
        return (BucketVersioningConfiguration) invoke(defaultRequest, new Unmarshaller<BucketVersioningConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketVersioningConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final BucketVersioningConfiguration OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.BucketVersioningConfigurationHandler bucketVersioningConfigurationHandler = new XmlResponsesSaxParser.BucketVersioningConfigurationHandler();
                xmlResponsesSaxParser.OooO0o0(bucketVersioningConfigurationHandler, inputStream);
                return bucketVersioningConfigurationHandler.f11055Oooo0oo;
            }
        }, str, (String) null);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    public S3Object getObject(GetObjectRequest getObjectRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getObjectRequest, "The GetObjectRequest parameter must be specified when requesting an object");
        ValidationUtils.OooO0O0(getObjectRequest.f10807Oooo.f10901Oooo0o, "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.OooO0O0(getObjectRequest.f10807Oooo.f10902Oooo0oO, "The key parameter must be specified when requesting an object");
        S3ObjectIdBuilder s3ObjectIdBuilder = getObjectRequest.f10807Oooo;
        Request requestCreateRequest = createRequest(s3ObjectIdBuilder.f10901Oooo0o, s3ObjectIdBuilder.f10902Oooo0oO, getObjectRequest, HttpMethodName.GET);
        String str = getObjectRequest.f10807Oooo.f10903Oooo0oo;
        if (str != null) {
            ((DefaultRequest) requestCreateRequest).OooO0O0("versionId", str);
        }
        long[] jArrOooO0Oo = getObjectRequest.OooO0Oo();
        long jLongValue = 0;
        if (jArrOooO0Oo != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("bytes=");
            sbOooO0o0.append(Long.toString(jArrOooO0Oo[0]));
            sbOooO0o0.append("-");
            String string = sbOooO0o0.toString();
            if (jArrOooO0Oo[1] >= 0) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0(string);
                sbOooO0o1.append(Long.toString(jArrOooO0Oo[1]));
                string = sbOooO0o1.toString();
            }
            ((DefaultRequest) requestCreateRequest).OooO00o("Range", string);
        }
        populateRequesterPaysHeader(requestCreateRequest, false);
        addResponseHeaderParameters(requestCreateRequest, null);
        addDateHeader(requestCreateRequest, "If-Modified-Since", null);
        addDateHeader(requestCreateRequest, "If-Unmodified-Since", null);
        addStringListHeader(requestCreateRequest, "If-Match", getObjectRequest.f10809OoooO0);
        addStringListHeader(requestCreateRequest, "If-None-Match", getObjectRequest.f10811OoooO0O);
        populateSSE_C(requestCreateRequest, null);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutorOooO0O0 = ProgressListenerCallbackExecutor.OooO0O0(getObjectRequest.f10808OoooO);
        try {
            S3ObjectResponseHandler s3ObjectResponseHandler = new S3ObjectResponseHandler();
            S3ObjectIdBuilder s3ObjectIdBuilder2 = getObjectRequest.f10807Oooo;
            S3Object s3Object = (S3Object) invoke(requestCreateRequest, s3ObjectResponseHandler, s3ObjectIdBuilder2.f10901Oooo0o, s3ObjectIdBuilder2.f10902Oooo0oO);
            S3ObjectIdBuilder s3ObjectIdBuilder3 = getObjectRequest.f10807Oooo;
            s3Object.f10899Oooo0oO = s3ObjectIdBuilder3.f10901Oooo0o;
            s3Object.f10898Oooo0o = s3ObjectIdBuilder3.f10902Oooo0oO;
            FilterInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.f10897Oooo);
            if (progressListenerCallbackExecutorOooO0O0 != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutorOooO0O0);
                progressReportingInputStream.f10375Oooo = true;
                progressReportingInputStream.f10376Oooo0o = this.notificationThreshold * 1024;
                fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 2);
                serviceClientHolderInputStream = progressReportingInputStream;
            }
            if (ServiceUtils.OooO0Oo(getObjectRequest, this.clientOptions) || ServiceUtils.OooO0o0(s3Object.f10900Oooo0oo, this.clientOptions)) {
                Long l = (Long) s3Object.f10900Oooo0oo.f10867Oooo0oO.get("Content-Length");
                if (l != null) {
                    jLongValue = l.longValue();
                }
                serviceClientHolderInputStream = new LengthCheckInputStream(serviceClientHolderInputStream, jLongValue, true);
            } else {
                String strOooOOOo = s3Object.f10900Oooo0oo.OooOOOo();
                if (strOooOOOo != null && !strOooOOOo.contains("-")) {
                    try {
                        serviceClientHolderInputStream = new DigestValidationInputStream(serviceClientHolderInputStream, MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME), BinaryUtils.OooO00o(s3Object.f10900Oooo0oo.OooOOOo()));
                    } catch (NoSuchAlgorithmException e) {
                        log.OooO0oO("No MD5 digest algorithm available. Unable to calculate checksum and verify data integrity.", e);
                    }
                }
            }
            s3Object.f10897Oooo = new S3ObjectInputStream(serviceClientHolderInputStream);
            return s3Object;
        } catch (AmazonS3Exception e2) {
            int i = e2.f10267Oooo;
            if (i == 412 || i == 304) {
                fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 16);
                return null;
            }
            fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 8);
            throw e2;
        }
    }

    public AccessControlList getObjectAcl(String str, String str2, String str3) throws AmazonClientException {
        return getObjectAcl(new GetObjectAclRequest(str, str2, str3));
    }

    public ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getObjectMetadataRequest, "The GetObjectMetadataRequest parameter must be specified when requesting an object's metadata");
        String str = getObjectMetadataRequest.f10805Oooo;
        String str2 = getObjectMetadataRequest.f10806OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when requesting an object's metadata");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when requesting an object's metadata");
        Request<?> requestCreateRequest = createRequest(str, str2, getObjectMetadataRequest, HttpMethodName.HEAD);
        populateRequesterPaysHeader(requestCreateRequest, false);
        addPartNumberIfNotNull(requestCreateRequest, null);
        populateSSE_C(requestCreateRequest, null);
        return (ObjectMetadata) invoke(requestCreateRequest, new S3MetadataResponseHandler(), str, str2);
    }

    public Owner getS3AccountOwner(GetS3AccountOwnerRequest getS3AccountOwnerRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getS3AccountOwnerRequest, "The request object parameter getS3AccountOwnerRequest must be specified.");
        return (Owner) invoke(createRequest(null, null, new ListBucketsRequest(), HttpMethodName.GET), new Unmarshaller<Owner, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListBucketsOwnerUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final Owner OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.ListAllMyBucketsHandler listAllMyBucketsHandler = new XmlResponsesSaxParser.ListAllMyBucketsHandler();
                xmlResponsesSaxParser.OooO0o0(listAllMyBucketsHandler, xmlResponsesSaxParser.OooO0o(listAllMyBucketsHandler, inputStream));
                return listAllMyBucketsHandler.f11099Oooo;
            }
        }, (String) null, (String) null);
    }

    public VersionListing listNextBatchOfVersions(ListNextBatchOfVersionsRequest listNextBatchOfVersionsRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(listNextBatchOfVersionsRequest, "The request object parameter must be specified when listing the next batch of versions in a bucket");
        VersionListing versionListing = listNextBatchOfVersionsRequest.f10830Oooo;
        if (versionListing.f10960OooO0o) {
            ListVersionsRequest listVersionsRequest = new ListVersionsRequest(versionListing.f10958OooO0OO, versionListing.f10962OooO0oO, versionListing.f10959OooO0Oo, versionListing.f10961OooO0o0, versionListing.f10955OooO, Integer.valueOf(versionListing.f10963OooO0oo));
            listVersionsRequest.f10850o000oOoO = listNextBatchOfVersionsRequest.f10830Oooo.f10964OooOO0;
            return listVersions(listVersionsRequest);
        }
        VersionListing versionListing2 = new VersionListing();
        versionListing2.f10958OooO0OO = versionListing.f10958OooO0OO;
        versionListing2.f10955OooO = versionListing.f10955OooO;
        versionListing2.f10963OooO0oo = versionListing.f10963OooO0oo;
        versionListing2.f10962OooO0oO = versionListing.f10962OooO0oO;
        versionListing2.f10964OooOO0 = versionListing.f10964OooOO0;
        versionListing2.f10960OooO0o = false;
        return versionListing2;
    }

    public void resolveRequestEndpoint(Request<?> request, String str, String str2, URI uri) {
        if (uri == null) {
            uri = this.endpoint;
        }
        if (shouldUseVirtualAddressing(uri, str)) {
            log.OooO00o("Using virtual style addressing. Endpoint = " + uri);
            ((DefaultRequest) request).f10291OooO0o0 = convertToVirtualHostEndpoint(uri, str);
            ((DefaultRequest) request).f10286OooO00o = getHostStyleResourcePath(str2);
        } else {
            log.OooO00o("Using path style addressing. Endpoint = " + uri);
            ((DefaultRequest) request).f10291OooO0o0 = uri;
            if (str != null) {
                ((DefaultRequest) request).f10286OooO00o = getPathStyleResourcePath(str, str2);
            }
        }
        log.OooO00o("Key: " + str2 + "; Request: " + request);
    }

    public void setBucketAccelerateConfiguration(SetBucketAccelerateConfigurationRequest setBucketAccelerateConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(setBucketAccelerateConfigurationRequest, "setBucketAccelerateConfigurationRequest must be specified");
        String str = setBucketAccelerateConfigurationRequest.f10912Oooo;
        BucketAccelerateConfiguration bucketAccelerateConfiguration = setBucketAccelerateConfigurationRequest.f10913OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting accelerate configuration.");
        ValidationUtils.OooO0O0(bucketAccelerateConfiguration, "The bucket accelerate configuration parameter must be specified.");
        ValidationUtils.OooO0O0(bucketAccelerateConfiguration.f10711OooO00o, "The status parameter must be specified when updating bucket accelerate configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketAccelerateConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("accelerate", null);
        Objects.requireNonNull(bucketConfigurationXmlFactory);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("AccelerateConfiguration");
        xmlWriter.OooO0Oo("Status");
        xmlWriter.OooO00o(bucketAccelerateConfiguration.f10711OooO00o, xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    public void setBucketAcl(String str, AccessControlList accessControlList, RequestMetricCollector requestMetricCollector) {
        setBucketAcl0(str, accessControlList, requestMetricCollector);
    }

    public SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(SetBucketAnalyticsConfigurationRequest setBucketAnalyticsConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(setBucketAnalyticsConfigurationRequest, "The request cannot be null");
        String str = setBucketAnalyticsConfigurationRequest.f10914Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        AnalyticsConfiguration analyticsConfiguration = setBucketAnalyticsConfigurationRequest.f10915OoooO00;
        ValidationUtils.OooO00o(analyticsConfiguration, "Analytics Configuration");
        String str2 = analyticsConfiguration.f10965Oooo0o;
        ValidationUtils.OooO00o(str2, "Analytics Id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketAnalyticsConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("analytics", null);
        defaultRequest.OooO0O0("id", str2);
        byte[] bArrOooO0o = bucketConfigurationXmlFactory.OooO0o(analyticsConfiguration);
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0o.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0o);
        return (SetBucketAnalyticsConfigurationResult) invoke(defaultRequest, new Unmarshaller<SetBucketAnalyticsConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$SetBucketAnalyticsConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final SetBucketAnalyticsConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                return new SetBucketAnalyticsConfigurationResult();
            }
        }, str, (String) null);
    }

    public void setBucketCrossOriginConfiguration(SetBucketCrossOriginConfigurationRequest setBucketCrossOriginConfigurationRequest) {
        ValidationUtils.OooO0O0(setBucketCrossOriginConfigurationRequest, "The set bucket cross origin configuration request object must be specified.");
        String str = setBucketCrossOriginConfigurationRequest.f10916Oooo;
        BucketCrossOriginConfiguration bucketCrossOriginConfiguration = setBucketCrossOriginConfigurationRequest.f10917OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting bucket cross origin configuration.");
        ValidationUtils.OooO0O0(bucketCrossOriginConfiguration, "The cross origin configuration parameter must be specified when setting bucket cross origin configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketCrossOriginConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("cors", null);
        new BucketConfigurationXmlFactory();
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("CORSConfiguration");
        for (CORSRule cORSRule : bucketCrossOriginConfiguration.f10712Oooo0o) {
            xmlWriter.OooO0Oo("CORSRule");
            if (cORSRule.f10741OooO00o != null) {
                xmlWriter.OooO0Oo("ID");
                xmlWriter.OooO00o(cORSRule.f10741OooO00o, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            List<String> list = cORSRule.f10743OooO0OO;
            if (list != null) {
                for (String str2 : list) {
                    xmlWriter.OooO0Oo("AllowedOrigin");
                    xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
            }
            List<CORSRule.AllowedMethods> list2 = cORSRule.f10742OooO0O0;
            if (list2 != null) {
                for (CORSRule.AllowedMethods allowedMethods : list2) {
                    xmlWriter.OooO0Oo("AllowedMethod");
                    xmlWriter.OooO00o(allowedMethods.toString(), xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
            }
            if (cORSRule.f10744OooO0Oo != 0) {
                xmlWriter.OooO0Oo("MaxAgeSeconds");
                xmlWriter.OooO00o(Integer.toString(cORSRule.f10744OooO0Oo), xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            List<String> list3 = cORSRule.f10746OooO0o0;
            if (list3 != null) {
                for (String str3 : list3) {
                    xmlWriter.OooO0Oo("ExposeHeader");
                    xmlWriter.OooO00o(str3, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
            }
            List<String> list4 = cORSRule.f10745OooO0o;
            if (list4 != null) {
                for (String str4 : list4) {
                    xmlWriter.OooO0Oo("AllowedHeader");
                    xmlWriter.OooO00o(str4, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        try {
            defaultRequest.OooO00o("Content-MD5", Base64.OooO0O0(Md5Utils.OooO0O0(bArrOooO0OO)));
            invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
        } catch (Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }
    }

    public SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(SetBucketInventoryConfigurationRequest setBucketInventoryConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(setBucketInventoryConfigurationRequest, "The request cannot be null");
        String str = setBucketInventoryConfigurationRequest.f10918Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        InventoryConfiguration inventoryConfiguration = setBucketInventoryConfigurationRequest.f10919OoooO00;
        ValidationUtils.OooO00o(inventoryConfiguration, "InventoryConfiguration");
        String str2 = inventoryConfiguration.f10981Oooo0o;
        ValidationUtils.OooO00o(str2, "Inventory id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketInventoryConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("inventory", null);
        defaultRequest.OooO0O0("id", str2);
        BucketConfigurationXmlFactory bucketConfigurationXmlFactory2 = bucketConfigurationXmlFactory;
        Objects.requireNonNull(bucketConfigurationXmlFactory2);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("InventoryConfiguration");
        xmlWriter.OooO0Oo("Id");
        xmlWriter.OooO00o(inventoryConfiguration.f10981Oooo0o, xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        xmlWriter.OooO0Oo("IsEnabled");
        xmlWriter.OooO00o(String.valueOf(inventoryConfiguration.f10983Oooo0oo), xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        xmlWriter.OooO0Oo("IncludedObjectVersions");
        xmlWriter.OooO00o(inventoryConfiguration.f10985OoooO00, xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        InventoryDestination inventoryDestination = inventoryConfiguration.f10982Oooo0oO;
        if (inventoryDestination != null) {
            xmlWriter.OooO0Oo("Destination");
            InventoryS3BucketDestination inventoryS3BucketDestination = inventoryDestination.f10987Oooo0o;
            if (inventoryS3BucketDestination != null) {
                xmlWriter.OooO0Oo("S3BucketDestination");
                bucketConfigurationXmlFactory2.OooO0Oo(xmlWriter, "AccountId", inventoryS3BucketDestination.f10991Oooo0o);
                bucketConfigurationXmlFactory2.OooO0Oo(xmlWriter, "Bucket", inventoryS3BucketDestination.f10992Oooo0oO);
                bucketConfigurationXmlFactory2.OooO0Oo(xmlWriter, "Prefix", inventoryS3BucketDestination.f10990Oooo);
                bucketConfigurationXmlFactory2.OooO0Oo(xmlWriter, "Format", inventoryS3BucketDestination.f10993Oooo0oo);
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        InventoryFilter inventoryFilter = inventoryConfiguration.f10980Oooo;
        if (inventoryFilter != null) {
            xmlWriter.OooO0Oo("Filter");
            InventoryFilterPredicate inventoryFilterPredicate = inventoryFilter.f10988Oooo0o;
            if (inventoryFilterPredicate != null && (inventoryFilterPredicate instanceof InventoryPrefixPredicate)) {
                bucketConfigurationXmlFactory2.OooO0Oo(xmlWriter, "Prefix", ((InventoryPrefixPredicate) inventoryFilterPredicate).f10989Oooo0o);
            }
            xmlWriter.OooO0O0();
        }
        InventorySchedule inventorySchedule = inventoryConfiguration.f10986OoooO0O;
        if (inventorySchedule != null) {
            xmlWriter.OooO0Oo(AppEventsConstants.EVENT_NAME_SCHEDULE);
            bucketConfigurationXmlFactory2.OooO0Oo(xmlWriter, "Frequency", inventorySchedule.f10994Oooo0o);
            xmlWriter.OooO0O0();
        }
        List<String> list = inventoryConfiguration.f10984OoooO0;
        if (!(list == null || list.isEmpty())) {
            xmlWriter.OooO0Oo("OptionalFields");
            for (String str3 : list) {
                xmlWriter.OooO0Oo("Field");
                xmlWriter.OooO00o(str3, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        return (SetBucketInventoryConfigurationResult) invoke(defaultRequest, new Unmarshaller<SetBucketInventoryConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$SetBucketInventoryConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final SetBucketInventoryConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                return new SetBucketInventoryConfigurationResult();
            }
        }, str, (String) null);
    }

    public void setBucketLifecycleConfiguration(SetBucketLifecycleConfigurationRequest setBucketLifecycleConfigurationRequest) {
        ValidationUtils.OooO0O0(setBucketLifecycleConfigurationRequest, "The set bucket lifecycle configuration request object must be specified.");
        String str = setBucketLifecycleConfigurationRequest.f10920Oooo;
        BucketLifecycleConfiguration bucketLifecycleConfiguration = setBucketLifecycleConfigurationRequest.f10921OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting bucket lifecycle configuration.");
        ValidationUtils.OooO0O0(bucketLifecycleConfiguration, "The lifecycle configuration parameter must be specified when setting bucket lifecycle configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketLifecycleConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("lifecycle", null);
        byte[] bArrOooO0o0 = new BucketConfigurationXmlFactory().OooO0o0(bucketLifecycleConfiguration);
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0o0.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0o0);
        try {
            defaultRequest.OooO00o("Content-MD5", Base64.OooO0O0(Md5Utils.OooO0O0(bArrOooO0o0)));
            invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
        } catch (Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }
    }

    public SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(SetBucketMetricsConfigurationRequest setBucketMetricsConfigurationRequest) throws AmazonClientException {
        new SetBucketMetricsConfigurationRequest();
        ValidationUtils.OooO0O0(setBucketMetricsConfigurationRequest, "The request cannot be null");
        String str = setBucketMetricsConfigurationRequest.f10922Oooo;
        ValidationUtils.OooO0OO(str, "BucketName");
        MetricsConfiguration metricsConfiguration = setBucketMetricsConfigurationRequest.f10923OoooO00;
        ValidationUtils.OooO00o(metricsConfiguration, "Metrics Configuration");
        String str2 = metricsConfiguration.f10999Oooo0o;
        ValidationUtils.OooO00o(str2, "Metrics Id");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketMetricsConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("metrics", null);
        defaultRequest.OooO0O0("id", str2);
        byte[] bArrOooO0oO = bucketConfigurationXmlFactory.OooO0oO(metricsConfiguration);
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0oO.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0oO);
        return (SetBucketMetricsConfigurationResult) invoke(defaultRequest, new Unmarshaller<SetBucketMetricsConfigurationResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$SetBucketMetricsConfigurationUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final SetBucketMetricsConfigurationResult OooO00o(InputStream inputStream) throws Exception {
                return new SetBucketMetricsConfigurationResult();
            }
        }, str, (String) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.services.s3.model.NotificationConfiguration>] */
    public void setBucketNotificationConfiguration(SetBucketNotificationConfigurationRequest setBucketNotificationConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(setBucketNotificationConfigurationRequest, "The set bucket notification configuration request object must be specified.");
        String str = setBucketNotificationConfigurationRequest.f10925OoooO00;
        BucketNotificationConfiguration bucketNotificationConfiguration = setBucketNotificationConfigurationRequest.f10924Oooo;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting bucket notification configuration.");
        ValidationUtils.OooO0O0(bucketNotificationConfiguration, "The notification configuration parameter must be specified when setting bucket notification configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketNotificationConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("notification", null);
        BucketConfigurationXmlFactory bucketConfigurationXmlFactory2 = bucketConfigurationXmlFactory;
        Objects.requireNonNull(bucketConfigurationXmlFactory2);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("NotificationConfiguration");
        for (Map.Entry entry : bucketNotificationConfiguration.f10732Oooo0o.entrySet()) {
            String str2 = (String) entry.getKey();
            NotificationConfiguration notificationConfiguration = (NotificationConfiguration) entry.getValue();
            if (notificationConfiguration instanceof BucketNotificationConfiguration.TopicConfiguration) {
                xmlWriter.OooO0Oo("TopicConfiguration");
                xmlWriter.OooO0Oo("Id");
                xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("Topic");
                xmlWriter.OooO00o(((BucketNotificationConfiguration.TopicConfiguration) notificationConfiguration).f10942Oooo0oo, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                bucketConfigurationXmlFactory2.OooO0OO(xmlWriter, notificationConfiguration);
                xmlWriter.OooO0O0();
            } else if (notificationConfiguration instanceof QueueConfiguration) {
                xmlWriter.OooO0Oo("QueueConfiguration");
                xmlWriter.OooO0Oo("Id");
                xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("Queue");
                xmlWriter.OooO00o(((QueueConfiguration) notificationConfiguration).f10877Oooo0oo, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                bucketConfigurationXmlFactory2.OooO0OO(xmlWriter, notificationConfiguration);
                xmlWriter.OooO0O0();
            } else if (notificationConfiguration instanceof CloudFunctionConfiguration) {
                xmlWriter.OooO0Oo("CloudFunctionConfiguration");
                xmlWriter.OooO0Oo("Id");
                xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("InvocationRole");
                CloudFunctionConfiguration cloudFunctionConfiguration = (CloudFunctionConfiguration) notificationConfiguration;
                xmlWriter.OooO00o(cloudFunctionConfiguration.f10749Oooo0oo, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("CloudFunction");
                xmlWriter.OooO00o(cloudFunctionConfiguration.f10748Oooo, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                bucketConfigurationXmlFactory2.OooO0OO(xmlWriter, notificationConfiguration);
                xmlWriter.OooO0O0();
            } else if (notificationConfiguration instanceof LambdaConfiguration) {
                xmlWriter.OooO0Oo("CloudFunctionConfiguration");
                xmlWriter.OooO0Oo("Id");
                xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("CloudFunction");
                xmlWriter.OooO00o(((LambdaConfiguration) notificationConfiguration).f10825Oooo0oo, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                bucketConfigurationXmlFactory2.OooO0OO(xmlWriter, notificationConfiguration);
                xmlWriter.OooO0O0();
            }
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.services.s3.model.ReplicationRule>] */
    public void setBucketReplicationConfiguration(SetBucketReplicationConfigurationRequest setBucketReplicationConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(setBucketReplicationConfigurationRequest, "The set bucket replication configuration request object must be specified.");
        String str = setBucketReplicationConfigurationRequest.f10926Oooo;
        BucketReplicationConfiguration bucketReplicationConfiguration = setBucketReplicationConfigurationRequest.f10927OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting replication configuration.");
        ValidationUtils.OooO0O0(bucketReplicationConfiguration, "The replication configuration parameter must be specified when setting replication configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketReplicationConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("replication", null);
        Objects.requireNonNull(bucketConfigurationXmlFactory);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0Oo("ReplicationConfiguration");
        ?? r4 = bucketReplicationConfiguration.f10734Oooo0oO;
        String str2 = bucketReplicationConfiguration.f10733Oooo0o;
        xmlWriter.OooO0Oo("Role");
        xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        for (Map.Entry entry : r4.entrySet()) {
            String str3 = (String) entry.getKey();
            ReplicationRule replicationRule = (ReplicationRule) entry.getValue();
            xmlWriter.OooO0Oo("Rule");
            xmlWriter.OooO0Oo("ID");
            xmlWriter.OooO00o(str3, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            xmlWriter.OooO0Oo("Prefix");
            xmlWriter.OooO00o(replicationRule.f10885OooO00o, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            xmlWriter.OooO0Oo("Status");
            xmlWriter.OooO00o(replicationRule.f10886OooO0O0, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            ReplicationDestinationConfig replicationDestinationConfig = replicationRule.f10887OooO0OO;
            xmlWriter.OooO0Oo("Destination");
            xmlWriter.OooO0Oo("Bucket");
            xmlWriter.OooO00o(replicationDestinationConfig.f10883OooO00o, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            if (replicationDestinationConfig.f10884OooO0O0 != null) {
                xmlWriter.OooO0Oo("StorageClass");
                xmlWriter.OooO00o(replicationDestinationConfig.f10884OooO0O0, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        try {
            defaultRequest.OooO00o("Content-MD5", Base64.OooO0O0(Md5Utils.OooO0O0(bArrOooO0OO)));
            invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Not able to compute MD5 of the replication rule configuration. Exception Message : ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.TagSet>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public void setBucketTaggingConfiguration(SetBucketTaggingConfigurationRequest setBucketTaggingConfigurationRequest) {
        ValidationUtils.OooO0O0(setBucketTaggingConfigurationRequest, "The set bucket tagging configuration request object must be specified.");
        String str = setBucketTaggingConfigurationRequest.f10928Oooo;
        BucketTaggingConfiguration bucketTaggingConfiguration = setBucketTaggingConfigurationRequest.f10929OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting bucket tagging configuration.");
        ValidationUtils.OooO0O0(bucketTaggingConfiguration, "The tagging configuration parameter must be specified when setting bucket tagging configuration.");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, null, setBucketTaggingConfigurationRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("tagging", null);
        new BucketConfigurationXmlFactory();
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0Oo("Tagging");
        for (TagSet tagSet : bucketTaggingConfiguration.f10735Oooo0o) {
            xmlWriter.OooO0Oo("TagSet");
            for (String str2 : tagSet.f10941OooO00o.keySet()) {
                xmlWriter.OooO0Oo("Tag");
                xmlWriter.OooO0Oo("Key");
                xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("Value");
                xmlWriter.OooO00o((String) tagSet.f10941OooO00o.get(str2), xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        byte[] bArrOooO0OO = xmlWriter.OooO0OO();
        defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
        defaultRequest.OooO00o("Content-Type", "application/xml");
        defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        try {
            defaultRequest.OooO00o("Content-MD5", Base64.OooO0O0(Md5Utils.OooO0O0(bArrOooO0OO)));
            invoke(defaultRequest, this.voidResponseHandler, str, (String) null);
        } catch (Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }
    }

    public void setObjectAcl(String str, String str2, CannedAccessControlList cannedAccessControlList) throws AmazonClientException {
        setObjectAcl(str, str2, (String) null, cannedAccessControlList);
    }

    @Deprecated
    public AmazonS3Client1(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public Bucket createBucket(String str, String str2) throws AmazonClientException {
        return createBucket(new CreateBucketRequest(str, str2));
    }

    public AccessControlList getBucketAcl(GetBucketAclRequest getBucketAclRequest) throws AmazonClientException {
        throw null;
    }

    public BucketLoggingConfiguration getBucketLoggingConfiguration(GetBucketLoggingConfigurationRequest getBucketLoggingConfigurationRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getBucketLoggingConfigurationRequest, "The bucket logging configuration");
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(getBucketLoggingConfigurationRequest.f10794Oooo, null, getBucketLoggingConfigurationRequest, HttpMethodName.GET);
        defaultRequest.OooO0O0("logging", null);
        return (BucketLoggingConfiguration) invoke(defaultRequest, new Unmarshaller<BucketLoggingConfiguration, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$BucketLoggingConfigurationnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final BucketLoggingConfiguration OooO00o(InputStream inputStream) throws Exception {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.BucketLoggingConfigurationHandler bucketLoggingConfigurationHandler = new XmlResponsesSaxParser.BucketLoggingConfigurationHandler();
                xmlResponsesSaxParser.OooO0o0(bucketLoggingConfigurationHandler, inputStream);
                return bucketLoggingConfigurationHandler.f11046Oooo0oo;
            }
        }, getBucketLoggingConfigurationRequest.f10794Oooo, (String) null);
    }

    public AccessControlList getObjectAcl(GetObjectAclRequest getObjectAclRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(getObjectAclRequest, "The request parameter must be specified when requesting an object's ACL");
        ValidationUtils.OooO0O0(getObjectAclRequest.f10804Oooo.f10901Oooo0o, "The bucket name parameter must be specified when requesting an object's ACL");
        ValidationUtils.OooO0O0(getObjectAclRequest.f10804Oooo.f10902Oooo0oO, "The key parameter must be specified when requesting an object's ACL");
        S3ObjectIdBuilder s3ObjectIdBuilder = getObjectAclRequest.f10804Oooo;
        return getAcl(s3ObjectIdBuilder.f10901Oooo0o, s3ObjectIdBuilder.f10902Oooo0oO, s3ObjectIdBuilder.f10903Oooo0oo, false, getObjectAclRequest);
    }

    public List<Bucket> listBuckets() throws AmazonClientException {
        return listBuckets(new ListBucketsRequest());
    }

    public void setBucketAcl(SetBucketAclRequest setBucketAclRequest) throws AmazonClientException {
        throw null;
    }

    public void setObjectAcl(String str, String str2, String str3, AccessControlList accessControlList) throws AmazonClientException {
        setObjectAcl(new SetObjectAclRequest(str, str2, str3, accessControlList));
    }

    @Deprecated
    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public Bucket createBucket(CreateBucketRequest createBucketRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(createBucketRequest, "The CreateBucketRequest parameter must be specified when creating a bucket");
        String str = createBucketRequest.f10768Oooo;
        String str2 = createBucketRequest.f10769OoooO00;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when creating a bucket");
        String strTrim = str.trim();
        BucketNameUtils.OooO0O0(strTrim, true);
        Request requestCreateRequest = createRequest(strTrim, null, createBucketRequest, HttpMethodName.PUT);
        if (!this.endpoint.getHost().equals("s3.amazonaws.com") && (str2 == null || str2.isEmpty())) {
            try {
                str2 = RegionUtils.OooO0O0(this.endpoint.getHost()).f10554OooO00o;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str2 != null && !StringUtils.OooO0O0(str2).equals(Region.US_Standard.toString())) {
            XmlWriter xmlWriter = new XmlWriter();
            xmlWriter.OooO0o("CreateBucketConfiguration");
            xmlWriter.OooO0Oo("LocationConstraint");
            xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            xmlWriter.OooO0O0();
            byte[] bArrOooO0OO = xmlWriter.OooO0OO();
            DefaultRequest defaultRequest = (DefaultRequest) requestCreateRequest;
            defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
            defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
        }
        invoke(requestCreateRequest, this.voidResponseHandler, strTrim, (String) null);
        return new Bucket(strTrim);
    }

    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) throws AmazonClientException {
        return putObject(new PutObjectRequest(str, str2, inputStream, objectMetadata));
    }

    public void setBucketAcl(String str, CannedAccessControlList cannedAccessControlList) throws AmazonClientException {
        setBucketAcl0(str, cannedAccessControlList, (RequestMetricCollector) null);
    }

    public void setObjectAcl(String str, String str2, String str3, AccessControlList accessControlList, RequestMetricCollector requestMetricCollector) throws AmazonClientException {
        SetObjectAclRequest setObjectAclRequest = new SetObjectAclRequest(str, str2, str3, accessControlList);
        setObjectAclRequest.f10274Oooo0oo = requestMetricCollector;
        setObjectAcl(setObjectAclRequest);
    }

    @Deprecated
    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public URL generatePresignedUrl(GeneratePresignedUrlRequest generatePresignedUrlRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(generatePresignedUrlRequest, "The request parameter must be specified when generating a pre-signed URL");
        String str = generatePresignedUrlRequest.f10792OoooO00;
        String str2 = generatePresignedUrlRequest.f10791OoooO0;
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when generating a pre-signed URL");
        ValidationUtils.OooO0O0(generatePresignedUrlRequest.f10789Oooo, "The HTTP method request parameter must be specified when generating a pre-signed URL");
        if (generatePresignedUrlRequest.f10793OoooO0O == null) {
            generatePresignedUrlRequest.f10793OoooO0O = new Date(System.currentTimeMillis() + 900000);
        }
        Request<?> requestCreateRequest = createRequest(str, str2, generatePresignedUrlRequest, HttpMethodName.valueOf(generatePresignedUrlRequest.f10789Oooo.toString()));
        addParameterIfNotNull(requestCreateRequest, "versionId", (String) null);
        for (Map.Entry entry : generatePresignedUrlRequest.f10790OoooO.entrySet()) {
            ((DefaultRequest) requestCreateRequest).OooO0O0((String) entry.getKey(), (String) entry.getValue());
        }
        populateSSE_C(requestCreateRequest, null);
        addHeaderIfNotNull(requestCreateRequest, "x-amz-server-side-encryption", null);
        addHeaderIfNotNull(requestCreateRequest, "x-amz-server-side-encryption-aws-kms-key-id", null);
        addResponseHeaderParameters(requestCreateRequest, null);
        Signer signerCreateSigner = createSigner(requestCreateRequest, str, str2);
        if (signerCreateSigner instanceof Presigner) {
            ((Presigner) signerCreateSigner).OooO0Oo(requestCreateRequest, this.awsCredentialsProvider.OooO00o(), generatePresignedUrlRequest.f10793OoooO0O);
        } else {
            presignRequest(requestCreateRequest, generatePresignedUrlRequest.f10789Oooo, str, str2, generatePresignedUrlRequest.f10793OoooO0O, null);
        }
        return ServiceUtils.OooO00o(requestCreateRequest, true);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x022f */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ca  */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        throw r0;
     */
    @Override // com.amazonaws.services.s3.AmazonS3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PutObjectResult putObject(PutObjectRequest putObjectRequest) throws AmazonClientException {
        InputStream lengthCheckInputStream;
        InputStream inputStream;
        MD5DigestCalculatingInputStream mD5DigestCalculatingInputStream;
        InputStream inputStream2;
        ObjectMetadata objectMetadata;
        String strOooOOOO;
        InputStream inputStream3;
        ValidationUtils.OooO0O0(putObjectRequest, "The PutObjectRequest parameter must be specified when uploading an object");
        String str = putObjectRequest.f10692Oooo;
        String str2 = putObjectRequest.f10695OoooO00;
        ObjectMetadata objectMetadata2 = putObjectRequest.f10693OoooO;
        InputStream inputStream4 = putObjectRequest.f10696OoooO0O;
        ProgressListenerCallbackExecutor progressListenerCallbackExecutorOooO0O0 = ProgressListenerCallbackExecutor.OooO0O0(putObjectRequest.f10272Oooo0o);
        if (objectMetadata2 == null) {
            objectMetadata2 = new ObjectMetadata();
        }
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when uploading an object");
        ValidationUtils.OooO0O0(str2, "The key parameter must be specified when uploading an object");
        boolean zOooO0Oo = ServiceUtils.OooO0Oo(putObjectRequest, this.clientOptions);
        File file = putObjectRequest.f10694OoooO0;
        InputStream repeatableFileInputStream = inputStream4;
        if (file != null) {
            objectMetadata2.OooOOo0(file.length());
            boolean z = objectMetadata2.OooOOOO() == null;
            if (((String) objectMetadata2.f10867Oooo0oO.get("Content-Type")) == null) {
                objectMetadata2.OooOOo(Mimetypes.OooO00o().OooO0O0(file));
            }
            if (z && !zOooO0Oo) {
                try {
                    String strOooO0O0 = Base64.OooO0O0(Md5Utils.OooO00o(new FileInputStream(file)));
                    if (strOooO0O0 == null) {
                        objectMetadata2.f10867Oooo0oO.remove("Content-MD5");
                    } else {
                        objectMetadata2.f10867Oooo0oO.put("Content-MD5", strOooO0O0);
                    }
                } catch (Exception e) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to calculate MD5 hash: ");
                    sbOooO0o0.append(e.getMessage());
                    throw new AmazonClientException(sbOooO0o0.toString(), e);
                }
            }
            try {
                repeatableFileInputStream = new RepeatableFileInputStream(file);
            } catch (FileNotFoundException e2) {
                throw new AmazonClientException("Unable to find file to upload", e2);
            }
        }
        Request requestCreateRequest = createRequest(str, str2, putObjectRequest, HttpMethodName.PUT);
        AccessControlList accessControlList = putObjectRequest.f10702o000oOoO;
        if (accessControlList != null) {
            addAclHeaders(requestCreateRequest, accessControlList);
        } else {
            CannedAccessControlList cannedAccessControlList = putObjectRequest.f10697OoooOO0;
            if (cannedAccessControlList != null) {
                ((DefaultRequest) requestCreateRequest).OooO00o("x-amz-acl", cannedAccessControlList.toString());
            }
        }
        String str3 = putObjectRequest.f10698OoooOOO;
        if (str3 != null) {
            ((DefaultRequest) requestCreateRequest).OooO00o("x-amz-storage-class", str3);
        }
        String str4 = putObjectRequest.f10699OoooOOo;
        InputStream byteArrayInputStream = repeatableFileInputStream;
        if (str4 != null) {
            DefaultRequest defaultRequest = (DefaultRequest) requestCreateRequest;
            defaultRequest.OooO00o("x-amz-website-redirect-location", str4);
            if (repeatableFileInputStream == null) {
                byteArrayInputStream = repeatableFileInputStream;
                setZeroContentLength(defaultRequest);
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
        }
        byteArrayInputStream = repeatableFileInputStream;
        addHeaderIfNotNull(requestCreateRequest, "x-amz-tagging", urlEncodeTags(putObjectRequest.f10701OoooOoO));
        populateRequesterPaysHeader(requestCreateRequest, putObjectRequest.f10876OoooOoo);
        populateSSE_C(requestCreateRequest, null);
        Long l = (Long) objectMetadata2.f10867Oooo0oO.get("Content-Length");
        try {
            try {
                if (l == null) {
                    if (!byteArrayInputStream.markSupported()) {
                        log.OooO("No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors.");
                        ByteArrayInputStream byteArray = toByteArray(byteArrayInputStream);
                        DefaultRequest defaultRequest2 = (DefaultRequest) requestCreateRequest;
                        defaultRequest2.OooO00o("Content-Length", String.valueOf(byteArray.available()));
                        defaultRequest2.f10287OooO0O0 = true;
                        inputStream3 = byteArray;
                    } else {
                        ((DefaultRequest) requestCreateRequest).OooO00o("Content-Length", String.valueOf(calculateContentLength(byteArrayInputStream)));
                        inputStream3 = byteArrayInputStream;
                    }
                } else {
                    long jLongValue = l.longValue();
                    if (jLongValue >= 0) {
                        lengthCheckInputStream = new LengthCheckInputStream(byteArrayInputStream, jLongValue, false);
                        ((DefaultRequest) requestCreateRequest).OooO00o("Content-Length", l.toString());
                    }
                    if (progressListenerCallbackExecutorOooO0O0 != null) {
                        inputStream3 = byteArrayInputStream;
                        inputStream = lengthCheckInputStream;
                        ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutorOooO0O0);
                        progressReportingInputStream.f10376Oooo0o = this.notificationThreshold * 1024;
                        fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 2);
                        inputStream = progressReportingInputStream;
                    }
                    inputStream3 = byteArrayInputStream;
                    inputStream = lengthCheckInputStream;
                    if (objectMetadata2.OooOOOO() == null || zOooO0Oo) {
                        mD5DigestCalculatingInputStream = null;
                        inputStream2 = inputStream;
                    } else {
                        mD5DigestCalculatingInputStream = new MD5DigestCalculatingInputStream(inputStream);
                        inputStream2 = mD5DigestCalculatingInputStream;
                    }
                    if (((String) objectMetadata2.f10867Oooo0oO.get("Content-Type")) == null) {
                        objectMetadata2.OooOOo("application/octet-stream");
                    }
                    populateRequestMetadata(requestCreateRequest, objectMetadata2);
                    populateSSE_KMS(requestCreateRequest, putObjectRequest.f10700OoooOo0);
                    ((DefaultRequest) requestCreateRequest).f10285OooO = inputStream2;
                    objectMetadata = (ObjectMetadata) invoke(requestCreateRequest, new S3MetadataResponseHandler(), str, str2);
                    inputStream2.close();
                    strOooOOOO = objectMetadata2.OooOOOO();
                    if (mD5DigestCalculatingInputStream != null) {
                        strOooOOOO = Base64.OooO0O0(mD5DigestCalculatingInputStream.f10649Oooo0o.digest());
                    }
                    if (objectMetadata == null && strOooOOOO != null && !zOooO0Oo && !Arrays.equals(Base64.OooO00o(strOooOOOO), BinaryUtils.OooO00o(objectMetadata.OooOOOo()))) {
                        fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 8);
                        throw new AmazonClientException("Unable to verify integrity of data upload.  Client calculated content hash didn't match hash calculated by Amazon S3.  You may need to delete the data stored in Amazon S3.");
                    }
                    fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 4);
                    PutObjectResult putObjectResult = new PutObjectResult();
                    putObjectResult.f10678Oooo0o = objectMetadata.OooO0oO();
                    putObjectResult.f10679Oooo0oO = objectMetadata.OooOOO0();
                    putObjectResult.f10680Oooo0oo = objectMetadata.OooOO0();
                    DateUtils.OooO00o(objectMetadata.f10865Oooo);
                    objectMetadata.OooOOOo();
                    objectMetadata.f10867Oooo0oO.get("x-amz-request-charged");
                    return putObjectResult;
                }
                inputStream2.close();
            } catch (AbortedException unused) {
            } catch (Exception e3) {
                Log log2 = log;
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unable to cleanly close input stream: ");
                sbOooO0o1.append(e3.getMessage());
                log2.OooO0O0(sbOooO0o1.toString(), e3);
            }
            objectMetadata = (ObjectMetadata) invoke(requestCreateRequest, new S3MetadataResponseHandler(), str, str2);
            strOooOOOO = objectMetadata2.OooOOOO();
            if (mD5DigestCalculatingInputStream != null) {
                strOooOOOO = Base64.OooO0O0(mD5DigestCalculatingInputStream.f10649Oooo0o.digest());
            }
            if (objectMetadata == null) {
            }
            fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 4);
            PutObjectResult putObjectResult2 = new PutObjectResult();
            putObjectResult2.f10678Oooo0o = objectMetadata.OooO0oO();
            putObjectResult2.f10679Oooo0oO = objectMetadata.OooOOO0();
            putObjectResult2.f10680Oooo0oo = objectMetadata.OooOO0();
            DateUtils.OooO00o(objectMetadata.f10865Oooo);
            objectMetadata.OooOOOo();
            objectMetadata.f10867Oooo0oO.get("x-amz-request-charged");
            return putObjectResult2;
        } catch (AmazonClientException e4) {
            fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 8);
            throw e4;
        }
        inputStream3 = byteArrayInputStream;
        inputStream = inputStream3;
        if (progressListenerCallbackExecutorOooO0O0 != null) {
            inputStream3 = byteArrayInputStream;
            inputStream = lengthCheckInputStream;
            ProgressReportingInputStream progressReportingInputStream2 = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutorOooO0O0);
            progressReportingInputStream2.f10376Oooo0o = this.notificationThreshold * 1024;
            fireProgressEvent(progressListenerCallbackExecutorOooO0O0, 2);
            inputStream = progressReportingInputStream2;
        }
        inputStream3 = byteArrayInputStream;
        inputStream = lengthCheckInputStream;
        if (objectMetadata2.OooOOOO() == null) {
            mD5DigestCalculatingInputStream = null;
            inputStream2 = inputStream;
        } else {
            mD5DigestCalculatingInputStream = null;
            inputStream2 = inputStream;
        }
        if (((String) objectMetadata2.f10867Oooo0oO.get("Content-Type")) == null) {
            objectMetadata2.OooOOo("application/octet-stream");
        }
        populateRequestMetadata(requestCreateRequest, objectMetadata2);
        populateSSE_KMS(requestCreateRequest, putObjectRequest.f10700OoooOo0);
        ((DefaultRequest) requestCreateRequest).f10285OooO = inputStream2;
    }

    public void setBucketAcl(String str, CannedAccessControlList cannedAccessControlList, RequestMetricCollector requestMetricCollector) throws AmazonClientException {
        setBucketAcl0(str, cannedAccessControlList, requestMetricCollector);
    }

    @Deprecated
    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, new UrlHttpClient(clientConfiguration), requestMetricCollector);
        this.errorResponseHandler = new S3ErrorResponseHandler();
        this.voidResponseHandler = new S3XmlResponseHandler<>(null);
        this.clientOptions = new S3ClientOptions();
        this.notificationThreshold = 1024;
        this.completeMultipartUploadRetryCondition = new CompleteMultipartUploadRetryCondition();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    private void init(com.amazonaws.regions.Region region, ClientConfiguration clientConfiguration) {
        if (this.awsCredentialsProvider == null) {
            throw new IllegalArgumentException("Credentials cannot be null. Credentials is required to sign the request");
        }
        if (region != null) {
            this.clientConfiguration = clientConfiguration;
            this.endpointPrefix = S3_SERVICE_NAME;
            setEndpoint("s3.amazonaws.com");
            setRegion(region);
            HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
            this.requestHandler2s.addAll(handlerChainFactory.OooO0OO("/com/amazonaws/services/s3/request.handlers"));
            this.requestHandler2s.addAll(handlerChainFactory.OooO0O0("/com/amazonaws/services/s3/request.handler2s"));
            Log log2 = log;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("initialized with endpoint = ");
            sbOooO0o0.append(this.endpoint);
            log2.OooO00o(sbOooO0o0.toString());
            return;
        }
        throw new IllegalArgumentException("Region cannot be null. Region is required to sign the request");
    }

    private void setBucketAcl0(String str, CannedAccessControlList cannedAccessControlList, RequestMetricCollector requestMetricCollector) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when setting a bucket's ACL");
        ValidationUtils.OooO0O0(cannedAccessControlList, "The ACL parameter must be specified when setting a bucket's ACL");
        GenericBucketRequest genericBucketRequest = new GenericBucketRequest(str);
        genericBucketRequest.f10274Oooo0oo = requestMetricCollector;
        setAcl(str, (String) null, (String) null, cannedAccessControlList, false, (AmazonWebServiceRequest) genericBucketRequest);
    }

    public void deleteBucketReplicationConfiguration(String str) throws AmazonClientException {
        deleteBucketReplicationConfiguration(new DeleteBucketReplicationConfigurationRequest(str));
    }

    public void deleteBucketWebsiteConfiguration(String str) throws AmazonClientException {
        deleteBucketWebsiteConfiguration(new DeleteBucketWebsiteConfigurationRequest(str));
    }

    public String getBucketLocation(String str) throws AmazonClientException {
        return getBucketLocation(new GetBucketLocationRequest(str));
    }

    public BucketNotificationConfiguration getBucketNotificationConfiguration(String str) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "The bucket name parameter must be specified when querying notification configuration");
        return getBucketNotificationConfiguration(new GetBucketNotificationConfigurationRequest(str));
    }

    public void setObjectAcl(String str, String str2, String str3, CannedAccessControlList cannedAccessControlList) throws AmazonClientException {
        setObjectAcl(new SetObjectAclRequest(str, str2, str3, cannedAccessControlList));
    }

    private void setAcl(String str, String str2, String str3, AccessControlList accessControlList, boolean z, AmazonWebServiceRequest amazonWebServiceRequest) {
        if (amazonWebServiceRequest == null) {
            amazonWebServiceRequest = new GenericBucketRequest(str);
        }
        DefaultRequest defaultRequest = (DefaultRequest) createRequest(str, str2, amazonWebServiceRequest, HttpMethodName.PUT);
        defaultRequest.OooO0O0("acl", null);
        if (str3 != null) {
            defaultRequest.OooO0O0("versionId", str3);
        }
        populateRequesterPaysHeader(defaultRequest, z);
        new AclXmlFactory();
        Owner owner = accessControlList.f10705Oooo0oo;
        if (owner != null) {
            XmlWriter xmlWriter = new XmlWriter();
            xmlWriter.OooO0o("AccessControlPolicy");
            xmlWriter.OooO0Oo("Owner");
            if (owner.f10872Oooo0oO != null) {
                xmlWriter.OooO0Oo("ID");
                xmlWriter.OooO00o(owner.f10872Oooo0oO, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            if (owner.f10871Oooo0o != null) {
                xmlWriter.OooO0Oo("DisplayName");
                xmlWriter.OooO00o(owner.f10871Oooo0o, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
            xmlWriter.OooO0Oo("AccessControlList");
            for (Grant grant : (HashSet) accessControlList.OooO00o()) {
                xmlWriter.OooO0Oo("Grant");
                Grantee grantee = grant.f10814OooO00o;
                if (grantee instanceof CanonicalGrantee) {
                    xmlWriter.OooO0o0(new String[]{"xmlns:xsi", "xsi:type"}, new String[]{"http://www.w3.org/2001/XMLSchema-instance", "CanonicalUser"});
                    xmlWriter.OooO0Oo("ID");
                    xmlWriter.OooO00o(((CanonicalGrantee) grantee).f10747Oooo0o, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                    xmlWriter.OooO0O0();
                } else if (grantee instanceof EmailAddressGrantee) {
                    xmlWriter.OooO0o0(new String[]{"xmlns:xsi", "xsi:type"}, new String[]{"http://www.w3.org/2001/XMLSchema-instance", "AmazonCustomerByEmail"});
                    xmlWriter.OooO0Oo("EmailAddress");
                    xmlWriter.OooO00o(((EmailAddressGrantee) grantee).f10783Oooo0o, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                    xmlWriter.OooO0O0();
                } else if (grantee instanceof GroupGrantee) {
                    xmlWriter.OooO0o0(new String[]{"xmlns:xsi", "xsi:type"}, new String[]{"http://www.w3.org/2001/XMLSchema-instance", "Group"});
                    xmlWriter.OooO0Oo("URI");
                    xmlWriter.OooO00o(((GroupGrantee) grantee).OooO00o(), xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                    xmlWriter.OooO0O0();
                } else {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unknown Grantee type: ");
                    sbOooO0o0.append(grantee.getClass().getName());
                    throw new AmazonClientException(sbOooO0o0.toString());
                }
                xmlWriter.OooO0Oo("Permission");
                xmlWriter.OooO00o(grant.f10815OooO0O0.toString(), xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
            xmlWriter.OooO0O0();
            byte[] bArrOooO0OO = xmlWriter.OooO0OO();
            defaultRequest.OooO00o("Content-Type", "application/xml");
            defaultRequest.OooO00o("Content-Length", String.valueOf(bArrOooO0OO.length));
            defaultRequest.f10285OooO = new ByteArrayInputStream(bArrOooO0OO);
            invoke(defaultRequest, this.voidResponseHandler, str, str2);
            return;
        }
        throw new AmazonClientException("Invalid AccessControlList: missing an S3Owner");
    }

    public void setObjectAcl(String str, String str2, String str3, CannedAccessControlList cannedAccessControlList, RequestMetricCollector requestMetricCollector) {
        SetObjectAclRequest setObjectAclRequest = new SetObjectAclRequest(str, str2, str3, cannedAccessControlList);
        setObjectAclRequest.f10274Oooo0oo = requestMetricCollector;
        setObjectAcl(setObjectAclRequest);
    }

    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(String str) throws AmazonClientException {
        return getBucketWebsiteConfiguration(new GetBucketWebsiteConfigurationRequest(str));
    }

    public void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(null, "The request object must be specified when setting a bucket policy");
        throw null;
    }

    public void setObjectAcl(SetObjectAclRequest setObjectAclRequest) throws AmazonClientException {
        ValidationUtils.OooO0O0(setObjectAclRequest, "The request must not be null.");
        ValidationUtils.OooO0O0(setObjectAclRequest.f10932Oooo, "The bucket name parameter must be specified when setting an object's ACL");
        ValidationUtils.OooO0O0(setObjectAclRequest.f10935OoooO00, "The key parameter must be specified when setting an object's ACL");
        AccessControlList accessControlList = setObjectAclRequest.f10936OoooO0O;
        if (accessControlList != null && setObjectAclRequest.f10933OoooO != null) {
            throw new IllegalArgumentException("Only one of the ACL and CannedACL parameters can be specified, not both.");
        }
        if (accessControlList != null) {
            setAcl(setObjectAclRequest.f10932Oooo, setObjectAclRequest.f10935OoooO00, setObjectAclRequest.f10934OoooO0, accessControlList, false, (AmazonWebServiceRequest) setObjectAclRequest);
            return;
        }
        CannedAccessControlList cannedAccessControlList = setObjectAclRequest.f10933OoooO;
        if (cannedAccessControlList != null) {
            setAcl(setObjectAclRequest.f10932Oooo, setObjectAclRequest.f10935OoooO00, setObjectAclRequest.f10934OoooO0, cannedAccessControlList, false, (AmazonWebServiceRequest) setObjectAclRequest);
            return;
        }
        throw new IllegalArgumentException("At least one of the ACL and CannedACL parameters should be specified");
    }

    @Deprecated
    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(clientConfiguration, httpClient);
        this.errorResponseHandler = new S3ErrorResponseHandler();
        this.voidResponseHandler = new S3XmlResponseHandler<>(null);
        this.clientOptions = new S3ClientOptions();
        this.notificationThreshold = 1024;
        this.completeMultipartUploadRetryCondition = new CompleteMultipartUploadRetryCondition();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public ListObjectsV2Result listObjectsV2(String str) throws AmazonClientException {
        ListObjectsV2Request listObjectsV2Request = new ListObjectsV2Request();
        listObjectsV2Request.f10837Oooo = str;
        return listObjectsV2(listObjectsV2Request);
    }

    @Deprecated
    public AmazonS3Client1(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AmazonS3Client1(AWSCredentials aWSCredentials, com.amazonaws.regions.Region region) {
        this(aWSCredentials, region, new ClientConfiguration());
    }

    public ListObjectsV2Result listObjectsV2(String str, String str2) throws AmazonClientException {
        ListObjectsV2Request listObjectsV2Request = new ListObjectsV2Request();
        listObjectsV2Request.f10837Oooo = str;
        listObjectsV2Request.f10838OoooO00 = str2;
        return listObjectsV2(listObjectsV2Request);
    }

    public AmazonS3Client1(AWSCredentials aWSCredentials, com.amazonaws.regions.Region region, ClientConfiguration clientConfiguration) {
        this(aWSCredentials, region, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    public ObjectListing listObjects(String str) throws AmazonClientException {
        return listObjects(new ListObjectsRequest(str, null, null, null, null));
    }

    public AmazonS3Client1(AWSCredentials aWSCredentials, com.amazonaws.regions.Region region, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this(new StaticCredentialsProvider(aWSCredentials), region, clientConfiguration, httpClient);
    }

    public ObjectListing listNextBatchOfObjects(ObjectListing objectListing) throws AmazonClientException {
        ValidationUtils.OooO0O0(objectListing, "The previous object listing parameter must be specified when listing the next batch of objects in a bucket");
        return listNextBatchOfObjects(new ListNextBatchOfObjectsRequest(objectListing));
    }

    public ObjectListing listObjects(String str, String str2) throws AmazonClientException {
        return listObjects(new ListObjectsRequest(str, str2, null, null, null));
    }

    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider, com.amazonaws.regions.Region region) {
        this(aWSCredentialsProvider, region, new ClientConfiguration());
    }

    public VersionListing listVersions(String str, String str2) throws AmazonClientException {
        return listVersions(new ListVersionsRequest(str, str2, null, null, null, null));
    }

    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider, com.amazonaws.regions.Region region, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, region, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    public VersionListing listVersions(String str, String str2, String str3, String str4, String str5, Integer num) throws AmazonClientException {
        ListVersionsRequest listVersionsRequest = new ListVersionsRequest();
        listVersionsRequest.f10844Oooo = str;
        listVersionsRequest.f10847OoooO00 = str2;
        listVersionsRequest.f10845OoooO = str5;
        listVersionsRequest.f10846OoooO0 = str3;
        listVersionsRequest.f10848OoooO0O = str4;
        listVersionsRequest.f10849OoooOO0 = num;
        return listVersions(listVersionsRequest);
    }

    public AmazonS3Client1(AWSCredentialsProvider aWSCredentialsProvider, com.amazonaws.regions.Region region, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(clientConfiguration, httpClient);
        this.errorResponseHandler = new S3ErrorResponseHandler();
        this.voidResponseHandler = new S3XmlResponseHandler<>(null);
        this.clientOptions = new S3ClientOptions();
        this.notificationThreshold = 1024;
        this.completeMultipartUploadRetryCondition = new CompleteMultipartUploadRetryCondition();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init(region, clientConfiguration);
    }

    public void restoreObject(String str, String str2, int i) throws AmazonServiceException {
        restoreObject(new RestoreObjectRequest(str, str2, i));
    }

    public AmazonS3Client1(ClientConfiguration clientConfiguration, com.amazonaws.regions.Region region) {
        this(new DefaultAWSCredentialsProviderChain(), region, clientConfiguration);
    }

    public CopyObjectResult copyObject(String str, String str2, String str3, String str4) throws AmazonClientException {
        return copyObject(new CopyObjectRequest(str, str2, str3, str4));
    }

    public ObjectMetadata getObject(final GetObjectRequest getObjectRequest, File file) throws AmazonClientException {
        S3Object s3ObjectStream;
        boolean z;
        ValidationUtils.OooO0O0(file, "The destination file parameter must be specified when downloading an object directly to a file");
        boolean z2 = getObjectRequest.OooO0Oo() != null && getObjectRequest.OooO0Oo()[0] > 0;
        ServiceUtils.RetryableS3DownloadTask retryableS3DownloadTask = new ServiceUtils.RetryableS3DownloadTask() { // from class: com.yalla.support.cloudfilemanager.uploader.AmazonS3Client1.2
            @Override // com.amazonaws.services.s3.internal.ServiceUtils.RetryableS3DownloadTask
            public S3Object getS3ObjectStream() {
                return AmazonS3Client1.this.getObject(getObjectRequest);
            }

            @Override // com.amazonaws.services.s3.internal.ServiceUtils.RetryableS3DownloadTask
            public boolean needIntegrityCheck() {
                return !ServiceUtils.OooO0Oo(getObjectRequest, AmazonS3Client1.this.clientOptions);
            }
        };
        Log log2 = ServiceUtils.f10681OooO00o;
        boolean z3 = false;
        do {
            s3ObjectStream = retryableS3DownloadTask.getS3ObjectStream();
            if (s3ObjectStream == null) {
                s3ObjectStream = null;
                break;
            }
            try {
                try {
                    ServiceUtils.OooO0O0(s3ObjectStream, file, retryableS3DownloadTask.needIntegrityCheck(), z2);
                    s3ObjectStream.f10897Oooo.OooO00o();
                    z = false;
                } catch (AmazonClientException e) {
                    if (e.OooO00o()) {
                        if ((e.getCause() instanceof SocketException) || (e.getCause() instanceof SSLProtocolException)) {
                            throw e;
                        }
                        if (!z3) {
                            ServiceUtils.f10681OooO00o.OooOO0o("Retry the download of object " + s3ObjectStream.f10898Oooo0o + " (bucket " + s3ObjectStream.f10899Oooo0oO + ")", e);
                            s3ObjectStream.f10897Oooo.OooO00o();
                            z3 = true;
                            z = true;
                        } else {
                            throw e;
                        }
                    } else {
                        throw e;
                    }
                }
            } catch (Throwable th) {
                s3ObjectStream.f10897Oooo.OooO00o();
                throw th;
            }
        } while (z);
        if (s3ObjectStream == null) {
            return null;
        }
        return s3ObjectStream.f10900Oooo0oo;
    }

    public void setBucketWebsiteConfiguration(String str, BucketWebsiteConfiguration bucketWebsiteConfiguration) throws AmazonClientException {
        setBucketWebsiteConfiguration(new SetBucketWebsiteConfigurationRequest(str, bucketWebsiteConfiguration));
    }

    public PutObjectResult putObject(String str, String str2, String str3) throws AmazonClientException {
        ValidationUtils.OooO0O0(str, "Bucket name must be provided");
        ValidationUtils.OooO0O0(str2, "Object key must be provided");
        ValidationUtils.OooO0O0(str3, "String content must be provided");
        byte[] bytes = str3.getBytes(StringUtils.f11186OooO00o);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.OooOOo("text/plain");
        objectMetadata.OooOOo0(bytes.length);
        return putObject(new PutObjectRequest(str, str2, byteArrayInputStream, objectMetadata));
    }
}
