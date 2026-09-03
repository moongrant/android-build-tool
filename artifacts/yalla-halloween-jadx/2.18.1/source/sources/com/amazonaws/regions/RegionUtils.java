package com.amazonaws.regions;

import OooO00o.OooO00o;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.yalla.support.cloudfilemanager.uploader.AmazonS3Client1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p016OooOoO0.OooOo00;
import p132o00O0ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public class RegionUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static List<Region> f10559OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f10560OooO0O0 = LogFactory.OooO0O0("com.amazonaws.request");

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.amazonaws.regions.Region>] */
    public static Region OooO00o(String str) {
        ?? r1;
        synchronized (RegionUtils.class) {
            if (f10559OooO00o == null) {
                OooO0Oo();
            }
            r1 = f10559OooO00o;
        }
        for (Region region : r1) {
            if (region.f10554OooO00o.equals(str)) {
                return region;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.amazonaws.regions.Region>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static Region OooO0O0(String str) {
        ?? r2;
        String host = OooO0OO(str).getHost();
        synchronized (RegionUtils.class) {
            if (f10559OooO00o == null) {
                OooO0Oo();
            }
            r2 = f10559OooO00o;
        }
        for (Region region : r2) {
            Iterator it = region.f10556OooO0OO.values().iterator();
            while (it.hasNext()) {
                if (OooO0OO((String) it.next()).getHost().equals(host)) {
                    return region;
                }
            }
        }
        throw new IllegalArgumentException(OooOo00.OooO0Oo("No region found with any service for endpoint ", str));
    }

    public static URI OooO0OO(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getHost() != null) {
                return uri;
            }
            return new URI("http://" + str);
        } catch (URISyntaxException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to parse service endpoint: ");
            sbOooO0o0.append(e.getMessage());
            throw new RuntimeException(sbOooO0o0.toString());
        }
    }

    public static synchronized void OooO0Oo() {
        if (System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride") != null) {
            try {
                OooO0o();
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Couldn't find regions override file specified", e);
            }
        }
        if (f10559OooO00o == null) {
            OooO0o0();
        }
        if (f10559OooO00o == null) {
            throw new RuntimeException("Failed to initialize the regions.");
        }
    }

    public static void OooO0o() throws FileNotFoundException {
        String property = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
        Log log = f10560OooO0O0;
        if (log.OooO0OO()) {
            log.OooO00o("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        try {
            f10559OooO00o = (ArrayList) new RegionMetadataParser().OooO0O0(new FileInputStream(new File(property)));
        } catch (Exception e) {
            f10560OooO0O0.OooO0oO("Failed to parse regional endpoints", e);
        }
    }

    public static void OooO0o0() {
        Log log = f10560OooO0O0;
        if (log.OooO0OO()) {
            log.OooO00o("Initializing the regions with default regions");
        }
        ArrayList arrayList = new ArrayList();
        Region regionOooO0O0 = o000OO0O.OooO0O0("af-south-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O0, "autoscaling", "autoscaling.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "dynamodb", "dynamodb.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "ec2", "ec2.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "elasticloadbalancing", "elasticloadbalancing.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "kms", "kms.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "lambda", "lambda.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "logs", "logs.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, AmazonS3Client1.S3_SERVICE_NAME, "s3.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "sns", "sns.af-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O0, "sqs", "sqs.af-south-1.amazonaws.com");
        Region regionOooO0O1 = o000OO0O.OooO0O0("ap-northeast-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O1, "autoscaling", "autoscaling.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "cognito-identity", "cognito-identity.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "cognito-idp", "cognito-idp.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "cognito-sync", "cognito-sync.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "data.iot", "data.iot.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "dynamodb", "dynamodb.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "ec2", "ec2.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "elasticloadbalancing", "elasticloadbalancing.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "firehose", "firehose.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "iot", "iot.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "kinesis", "kinesis.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "kms", "kms.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "lambda", "lambda.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "logs", "logs.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "polly", "polly.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, AmazonS3Client1.S3_SERVICE_NAME, "s3.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "sdb", "sdb.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "sns", "sns.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "sqs", "sqs.ap-northeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O1, "sts", "sts.amazonaws.com");
        Region regionOooO0O2 = o000OO0O.OooO0O0("ap-northeast-2", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O2, "autoscaling", "autoscaling.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "cognito-identity", "cognito-identity.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "cognito-idp", "cognito-idp.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "cognito-sync", "cognito-sync.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "data.iot", "data.iot.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "dynamodb", "dynamodb.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "ec2", "ec2.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "elasticloadbalancing", "elasticloadbalancing.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "iot", "iot.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "kinesis", "kinesis.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "kms", "kms.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "lambda", "lambda.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "logs", "logs.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "polly", "polly.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, AmazonS3Client1.S3_SERVICE_NAME, "s3.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "sns", "sns.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "sqs", "sqs.ap-northeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O2, "sts", "sts.ap-northeast-2.amazonaws.com");
        Region regionOooO0O3 = o000OO0O.OooO0O0("ap-south-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O3, "autoscaling", "autoscaling.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "cognito-identity", "cognito-identity.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "cognito-idp", "cognito-idp.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "cognito-sync", "cognito-sync.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "dynamodb", "dynamodb.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "ec2", "ec2.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "elasticloadbalancing", "elasticloadbalancing.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "kinesis", "kinesis.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "kms", "kms.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "lambda", "lambda.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "logs", "logs.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "polly", "polly.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, AmazonS3Client1.S3_SERVICE_NAME, "s3.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "sns", "sns.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "sqs", "sqs.ap-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O3, "sts", "sts.amazonaws.com");
        Region regionOooO0O4 = o000OO0O.OooO0O0("ap-southeast-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O4, "autoscaling", "autoscaling.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "cognito-identity", "cognito-identity.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "cognito-idp", "cognito-idp.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "cognito-sync", "cognito-sync.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "data.iot", "data.iot.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "dynamodb", "dynamodb.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "ec2", "ec2.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "elasticloadbalancing", "elasticloadbalancing.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "iot", "iot.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "kinesis", "kinesis.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "kms", "kms.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "lambda", "lambda.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "logs", "logs.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "polly", "polly.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, AmazonS3Client1.S3_SERVICE_NAME, "s3.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "sdb", "sdb.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "sns", "sns.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "sqs", "sqs.ap-southeast-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O4, "sts", "sts.amazonaws.com");
        Region regionOooO0O5 = o000OO0O.OooO0O0("ap-southeast-2", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O5, "autoscaling", "autoscaling.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "cognito-identity", "cognito-identity.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "cognito-idp", "cognito-idp.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "cognito-sync", "cognito-sync.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "data.iot", "data.iot.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "dynamodb", "dynamodb.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "ec2", "ec2.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "elasticloadbalancing", "elasticloadbalancing.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "iot", "iot.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "kinesis", "kinesis.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "kms", "kms.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "lambda", "lambda.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "logs", "logs.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "polly", "polly.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, AmazonS3Client1.S3_SERVICE_NAME, "s3.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "sdb", "sdb.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "sns", "sns.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "sqs", "sqs.ap-southeast-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O5, "sts", "sts.amazonaws.com");
        Region regionOooO0O6 = o000OO0O.OooO0O0("ca-central-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O6, "autoscaling", "autoscaling.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "dynamodb", "dynamodb.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "ec2", "ec2.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "elasticloadbalancing", "elasticloadbalancing.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "kinesis", "kinesis.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "kms", "kms.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "lambda", "lambda.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "logs", "logs.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "polly", "polly.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, AmazonS3Client1.S3_SERVICE_NAME, "s3.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "sns", "sns.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "sqs", "sqs.ca-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O6, "sts", "sts.amazonaws.com");
        Region regionOooO0O7 = o000OO0O.OooO0O0("eu-central-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O7, "autoscaling", "autoscaling.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "cognito-identity", "cognito-identity.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "cognito-idp", "cognito-idp.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "cognito-sync", "cognito-sync.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "data.iot", "data.iot.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "dynamodb", "dynamodb.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "ec2", "ec2.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "elasticloadbalancing", "elasticloadbalancing.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "firehose", "firehose.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "iot", "iot.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "kinesis", "kinesis.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "kms", "kms.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "lambda", "lambda.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "logs", "logs.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "polly", "polly.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, AmazonS3Client1.S3_SERVICE_NAME, "s3.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "sns", "sns.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "sqs", "sqs.eu-central-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O7, "sts", "sts.amazonaws.com");
        Region regionOooO0O8 = o000OO0O.OooO0O0("eu-south-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O8, "autoscaling", "autoscaling.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "dynamodb", "dynamodb.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "ec2", "ec2.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "elasticloadbalancing", "elasticloadbalancing.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "lambda", "lambda.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "logs", "logs.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, AmazonS3Client1.S3_SERVICE_NAME, "s3.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "sns", "sns.eu-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O8, "sqs", "sqs.eu-south-1.amazonaws.com");
        Region regionOooO0O9 = o000OO0O.OooO0O0("eu-west-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O9, "autoscaling", "autoscaling.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "cognito-identity", "cognito-identity.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "cognito-idp", "cognito-idp.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "cognito-sync", "cognito-sync.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "data.iot", "data.iot.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "dynamodb", "dynamodb.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "ec2", "ec2.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "elasticloadbalancing", "elasticloadbalancing.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "email", "email.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "firehose", "firehose.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "iot", "iot.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "kinesis", "kinesis.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "kms", "kms.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "lambda", "lambda.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "logs", "logs.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "machinelearning", "machinelearning.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "polly", "polly.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "rekognition", "rekognition.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, AmazonS3Client1.S3_SERVICE_NAME, "s3.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "sdb", "sdb.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "sns", "sns.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "sqs", "sqs.eu-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O9, "sts", "sts.amazonaws.com");
        Region regionOooO0O10 = o000OO0O.OooO0O0("eu-west-2", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O10, "autoscaling", "autoscaling.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "cognito-identity", "cognito-identity.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "cognito-idp", "cognito-idp.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "cognito-sync", "cognito-sync.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "dynamodb", "dynamodb.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "ec2", "ec2.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "elasticloadbalancing", "elasticloadbalancing.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "iot", "iot.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "kinesis", "kinesis.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "kms", "kms.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "lambda", "lambda.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "logs", "logs.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "polly", "polly.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, AmazonS3Client1.S3_SERVICE_NAME, "s3.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "sns", "sns.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "sqs", "sqs.eu-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O10, "sts", "sts.amazonaws.com");
        Region regionOooO0O11 = o000OO0O.OooO0O0("eu-west-3", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O11, "autoscaling", "autoscaling.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "dynamodb", "dynamodb.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "ec2", "ec2.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "elasticloadbalancing", "elasticloadbalancing.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "kinesis", "kinesis.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "kms", "kms.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "lambda", "lambda.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "logs", "logs.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "polly", "polly.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, AmazonS3Client1.S3_SERVICE_NAME, "s3.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "sns", "sns.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "sqs", "sqs.eu-west-3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O11, "sts", "sts.amazonaws.com");
        Region regionOooO0O12 = o000OO0O.OooO0O0("sa-east-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O12, "autoscaling", "autoscaling.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "dynamodb", "dynamodb.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "ec2", "ec2.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "elasticloadbalancing", "elasticloadbalancing.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "kinesis", "kinesis.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "kms", "kms.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "lambda", "lambda.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "logs", "logs.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "polly", "polly.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, AmazonS3Client1.S3_SERVICE_NAME, "s3.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "sdb", "sdb.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "sns", "sns.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "sqs", "sqs.sa-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O12, "sts", "sts.amazonaws.com");
        Region regionOooO0O13 = o000OO0O.OooO0O0("us-east-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O13, "autoscaling", "autoscaling.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "cognito-identity", "cognito-identity.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "cognito-idp", "cognito-idp.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "cognito-sync", "cognito-sync.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "data.iot", "data.iot.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "dynamodb", "dynamodb.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "ec2", "ec2.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "elasticloadbalancing", "elasticloadbalancing.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "email", "email.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "firehose", "firehose.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "iot", "iot.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "kinesis", "kinesis.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "kms", "kms.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "lambda", "lambda.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "logs", "logs.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "machinelearning", "machinelearning.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "mobileanalytics", "mobileanalytics.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "pinpoint", "pinpoint.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "polly", "polly.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "rekognition", "rekognition.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, AmazonS3Client1.S3_SERVICE_NAME, "s3.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "sdb", "sdb.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "sns", "sns.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "sqs", "sqs.us-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O13, "sts", "sts.amazonaws.com");
        Region regionOooO0O14 = o000OO0O.OooO0O0("us-east-2", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O14, "autoscaling", "autoscaling.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "cognito-identity", "cognito-identity.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "cognito-idp", "cognito-idp.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "cognito-sync", "cognito-sync.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "dynamodb", "dynamodb.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "ec2", "ec2.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "elasticloadbalancing", "elasticloadbalancing.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "firehose", "firehose.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "iot", "iot.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "kinesis", "kinesis.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "kms", "kms.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "lambda", "lambda.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "logs", "logs.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "polly", "polly.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, AmazonS3Client1.S3_SERVICE_NAME, "s3.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "sns", "sns.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "sqs", "sqs.us-east-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O14, "sts", "sts.amazonaws.com");
        Region regionOooO0O15 = o000OO0O.OooO0O0("us-west-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O15, "autoscaling", "autoscaling.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "dynamodb", "dynamodb.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "ec2", "ec2.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "elasticloadbalancing", "elasticloadbalancing.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "kinesis", "kinesis.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "kms", "kms.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "lambda", "lambda.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "logs", "logs.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "polly", "polly.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, AmazonS3Client1.S3_SERVICE_NAME, "s3.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "sdb", "sdb.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "sns", "sns.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "sqs", "sqs.us-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O15, "sts", "sts.amazonaws.com");
        Region regionOooO0O16 = o000OO0O.OooO0O0("us-west-2", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O16, "autoscaling", "autoscaling.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "cognito-identity", "cognito-identity.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "cognito-idp", "cognito-idp.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "cognito-sync", "cognito-sync.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "data.iot", "data.iot.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "dynamodb", "dynamodb.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "ec2", "ec2.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "elasticloadbalancing", "elasticloadbalancing.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "email", "email.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "firehose", "firehose.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "iot", "iot.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "kinesis", "kinesis.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "kms", "kms.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "lambda", "lambda.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "logs", "logs.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "polly", "polly.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "rekognition", "rekognition.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, AmazonS3Client1.S3_SERVICE_NAME, "s3.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "sdb", "sdb.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "sns", "sns.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "sqs", "sqs.us-west-2.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O16, "sts", "sts.amazonaws.com");
        Region regionOooO0O17 = o000OO0O.OooO0O0("cn-north-1", "amazonaws.com.cn", arrayList);
        RegionDefaults.OooO00o(regionOooO0O17, "autoscaling", "autoscaling.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "cognito-identity", "cognito-identity.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "dynamodb", "dynamodb.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "ec2", "ec2.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "elasticloadbalancing", "elasticloadbalancing.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "iot", "iot.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "kinesis", "kinesis.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "lambda", "lambda.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "logs", "logs.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, AmazonS3Client1.S3_SERVICE_NAME, "s3.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "sns", "sns.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "sqs", "sqs.cn-north-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O17, "sts", "sts.cn-north-1.amazonaws.com.cn");
        Region regionOooO0O18 = o000OO0O.OooO0O0("cn-northwest-1", "amazonaws.com.cn", arrayList);
        RegionDefaults.OooO00o(regionOooO0O18, "autoscaling", "autoscaling.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "dynamodb", "dynamodb.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "ec2", "ec2.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "elasticloadbalancing", "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "kinesis", "kinesis.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "logs", "logs.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, AmazonS3Client1.S3_SERVICE_NAME, "s3.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "sns", "sns.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "sqs", "sqs.cn-northwest-1.amazonaws.com.cn");
        RegionDefaults.OooO00o(regionOooO0O18, "sts", "sts.amazonaws.com.cn");
        Region regionOooO0O19 = o000OO0O.OooO0O0("us-gov-west-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O19, "autoscaling", "autoscaling.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "dynamodb", "dynamodb.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "ec2", "ec2.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "elasticloadbalancing", "elasticloadbalancing.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "kinesis", "kinesis.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "kms", "kms.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "lambda", "lambda.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "logs", "logs.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "rekognition", "rekognition.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, AmazonS3Client1.S3_SERVICE_NAME, "s3.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "sns", "sns.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "sqs", "sqs.us-gov-west-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O19, "sts", "sts.amazonaws.com");
        Region regionOooO0O20 = o000OO0O.OooO0O0("eu-north-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O20, "autoscaling", "autoscaling.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "dynamodb", "dynamodb.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "ec2", "ec2.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "elasticloadbalancing", "elasticloadbalancing.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "firehose", "firehose.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "iot", "iot.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "kinesis", "kinesis.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "kms", "kms.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "lambda", "lambda.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "logs", "logs.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, AmazonS3Client1.S3_SERVICE_NAME, "s3.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "sns", "sns.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "sqs", "sqs.eu-north-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O20, "sts", "sts.amazonaws.com");
        Region regionOooO0O21 = o000OO0O.OooO0O0("ap-east-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O21, "autoscaling", "autoscaling.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "dynamodb", "dynamodb.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "ec2", "ec2.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "elasticloadbalancing", "elasticloadbalancing.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "firehose", "firehose.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "kinesis", "kinesis.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "kms", "kms.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "lambda", "lambda.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "logs", "logs.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "polly", "polly.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, AmazonS3Client1.S3_SERVICE_NAME, "s3.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "sns", "sns.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "sqs", "sqs.ap-east-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O21, "sts", "sts.amazonaws.com");
        Region regionOooO0O22 = o000OO0O.OooO0O0("me-south-1", "amazonaws.com", arrayList);
        RegionDefaults.OooO00o(regionOooO0O22, "autoscaling", "autoscaling.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "cognito-identity", "cognito-identity.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "cognito-idp", "cognito-idp.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "cognito-sync", "cognito-sync.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "data.iot", "data.iot.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "dynamodb", "dynamodb.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "ec2", "ec2.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "elasticloadbalancing", "elasticloadbalancing.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "firehose", "firehose.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "iot", "iot.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "kinesis", "kinesis.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "kms", "kms.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "lambda", "lambda.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "logs", "logs.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "polly", "polly.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, AmazonS3Client1.S3_SERVICE_NAME, "s3.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "sdb", "sdb.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "sns", "sns.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "sqs", "sqs.me-south-1.amazonaws.com");
        RegionDefaults.OooO00o(regionOooO0O22, "sts", "sts.amazonaws.com");
        f10559OooO00o = arrayList;
    }
}
