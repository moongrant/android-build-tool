package com.amazonaws.internal.config;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.yalla.support.cloudfilemanager.uploader.AmazonS3Client1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class InternalConfig {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Log f10417OooO0oO = LogFactory.OooO00o(InternalConfig.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SignerConfig f10418OooO00o = new SignerConfig("AWS4SignerType");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, SignerConfig> f10419OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, SignerConfig> f10420OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, SignerConfig> f10421OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<HostRegexToRegionMapping> f10422OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<String, HttpClientConfig> f10423OooO0o0;

    public static class Factory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final InternalConfig f10424OooO00o;

        static {
            try {
                f10424OooO00o = new InternalConfig();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", e2);
            }
        }
    }

    public InternalConfig() {
        HashMap map = new HashMap();
        map.put("eu-central-1", new SignerConfig("AWS4SignerType"));
        map.put("cn-north-1", new SignerConfig("AWS4SignerType"));
        this.f10420OooO0OO = map;
        HashMap map2 = new HashMap();
        map2.put("ec2", new SignerConfig("QueryStringSignerType"));
        map2.put("email", new SignerConfig("AWS3SignerType"));
        map2.put(AmazonS3Client1.S3_SERVICE_NAME, new SignerConfig("S3SignerType"));
        map2.put("sdb", new SignerConfig("QueryStringSignerType"));
        map2.put("runtime.lex", new SignerConfig("AmazonLexV4Signer"));
        map2.put("polly", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f10421OooO0Oo = map2;
        HashMap map3 = new HashMap();
        map3.put("s3/eu-central-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/cn-north-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/us-east-2", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/ca-central-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/ap-south-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/ap-northeast-2", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/eu-west-2", new SignerConfig("AWSS3V4SignerType"));
        this.f10419OooO0O0 = map3;
        HashMap map4 = new HashMap();
        map4.put("AmazonCloudWatchClient", new HttpClientConfig("monitoring"));
        map4.put("AmazonCloudWatchLogsClient", new HttpClientConfig("logs"));
        map4.put("AmazonCognitoIdentityClient", new HttpClientConfig("cognito-identity"));
        map4.put("AmazonCognitoIdentityProviderClient", new HttpClientConfig("cognito-idp"));
        map4.put("AmazonCognitoSyncClient", new HttpClientConfig("cognito-sync"));
        map4.put("AmazonComprehendClient", new HttpClientConfig("comprehend"));
        map4.put("AmazonConnectClient", new HttpClientConfig("connect"));
        map4.put("AmazonKinesisFirehoseClient", new HttpClientConfig("firehose"));
        map4.put("AWSKinesisVideoArchivedMediaClient", new HttpClientConfig("kinesisvideo"));
        map4.put("AWSKinesisVideoSignalingClient", new HttpClientConfig("kinesisvideo"));
        map4.put("AWSIotClient", new HttpClientConfig("execute-api"));
        map4.put("AmazonLexRuntimeClient", new HttpClientConfig("runtime.lex"));
        map4.put("AmazonPinpointClient", new HttpClientConfig("mobiletargeting"));
        map4.put("AmazonPinpointAnalyticsClient", new HttpClientConfig("mobileanalytics"));
        map4.put("AmazonSageMakerRuntimeClient", new HttpClientConfig("sagemaker"));
        map4.put("AmazonSimpleDBClient", new HttpClientConfig("sdb"));
        map4.put("AmazonSimpleEmailServiceClient", new HttpClientConfig("email"));
        map4.put("AWSSecurityTokenServiceClient", new HttpClientConfig("sts"));
        map4.put("AmazonTextractClient", new HttpClientConfig("textract"));
        map4.put("AmazonTranscribeClient", new HttpClientConfig("transcribe"));
        map4.put("AmazonTranslateClient", new HttpClientConfig("translate"));
        this.f10423OooO0o0 = map4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com", "us-gov-west-1"));
        this.f10422OooO0o = arrayList;
    }
}
