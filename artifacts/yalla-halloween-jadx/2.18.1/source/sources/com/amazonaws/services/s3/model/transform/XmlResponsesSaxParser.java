package com.amazonaws.services.s3.model.transform;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.AbortIncompleteMultipartUpload;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class XmlResponsesSaxParser {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f11024OooO0O0 = LogFactory.OooO00o(XmlResponsesSaxParser.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public XMLReader f11025OooO00o;

    public static class AccessControlListHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final AccessControlList f11027Oooo0oo = new AccessControlList();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Grantee f11026Oooo = null;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Permission f11028OoooO00 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("AccessControlPolicy", "Owner")) {
                if (str.equals("ID")) {
                    this.f11027Oooo0oo.f10705Oooo0oo.f10872Oooo0oO = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f11027Oooo0oo.f10705Oooo0oo.f10871Oooo0o = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    AccessControlList accessControlList = this.f11027Oooo0oo;
                    Grantee grantee = this.f11026Oooo;
                    Permission permission = this.f11028OoooO00;
                    ((LinkedList) accessControlList.OooO0O0()).add(new Grant(grantee, permission));
                    this.f11026Oooo = null;
                    this.f11028OoooO00 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f11028OoooO00 = Permission.OooO0O0(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOOOO("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f11026Oooo.OooO0Oo(OooOO0O());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f11026Oooo.OooO0Oo(OooOO0O());
                    return;
                }
                if (str.equals("URI")) {
                    this.f11026Oooo = GroupGrantee.OooO0o0(OooOO0O());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f11026Oooo;
                    OooOO0O();
                    Objects.requireNonNull(canonicalGrantee);
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            boolean z;
            if (OooOOOO("AccessControlPolicy")) {
                if (str.equals("Owner")) {
                    this.f11027Oooo0oo.f10705Oooo0oo = new Owner();
                    return;
                }
                return;
            }
            if (OooOOOO("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                Log log = XmlResponsesSaxParser.f11024OooO0O0;
                Charset charset = StringUtils.f11186OooO00o;
                int i = 0;
                while (true) {
                    if (i >= 8) {
                        z = true;
                        break;
                    } else {
                        if (!Character.isWhitespace("xsi:type".charAt(i))) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
                String value = null;
                if (!z && attributes != null) {
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        if (attributes.getQName(i2).trim().equalsIgnoreCase("xsi:type")) {
                            value = attributes.getValue(i2);
                            break;
                        }
                    }
                }
                if ("AmazonCustomerByEmail".equals(value)) {
                    this.f11026Oooo = new EmailAddressGrantee();
                } else if ("CanonicalUser".equals(value)) {
                    this.f11026Oooo = new CanonicalGrantee();
                } else {
                    "Group".equals(value);
                }
            }
        }
    }

    public static class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketAccelerateConfiguration f11029Oooo0oo = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("AccelerateConfiguration") && str.equals("Status")) {
                this.f11029Oooo0oo.f10711OooO00o = OooOO0O();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
        }
    }

    public static class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public CORSRule f11030Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketCrossOriginConfiguration f11031Oooo0oo = new BucketCrossOriginConfiguration(new ArrayList());

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public List<CORSRule.AllowedMethods> f11034OoooO00 = null;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public List<String> f11033OoooO0 = null;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public List<String> f11035OoooO0O = null;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public List<String> f11032OoooO = null;

        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.LinkedList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.CORSRule$AllowedMethods>] */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    CORSRule cORSRule = this.f11030Oooo;
                    cORSRule.f10745OooO0o = this.f11032OoooO;
                    cORSRule.f10742OooO0O0 = this.f11034OoooO00;
                    cORSRule.f10743OooO0OO = this.f11033OoooO0;
                    cORSRule.f10746OooO0o0 = this.f11035OoooO0O;
                    this.f11032OoooO = null;
                    this.f11034OoooO00 = null;
                    this.f11033OoooO0 = null;
                    this.f11035OoooO0O = null;
                    this.f11031Oooo0oo.f10712Oooo0o.add(cORSRule);
                    this.f11030Oooo = null;
                    return;
                }
                return;
            }
            if (OooOOOO("CORSConfiguration", "CORSRule")) {
                if (str.equals("ID")) {
                    this.f11030Oooo.f10741OooO00o = OooOO0O();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f11033OoooO0.add(OooOO0O());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f11034OoooO00.add(CORSRule.AllowedMethods.OooO00o(OooOO0O()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    this.f11030Oooo.f10744OooO0Oo = Integer.parseInt(OooOO0O());
                } else if (str.equals("ExposeHeader")) {
                    this.f11035OoooO0O.add(OooOO0O());
                } else if (str.equals("AllowedHeader")) {
                    this.f11032OoooO.add(OooOO0O());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f11030Oooo = new CORSRule();
                    return;
                }
                return;
            }
            if (OooOOOO("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f11033OoooO0 == null) {
                        this.f11033OoooO0 = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f11034OoooO00 == null) {
                        this.f11034OoooO00 = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f11035OoooO0O == null) {
                        this.f11035OoooO0O = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f11032OoooO == null) {
                    this.f11032OoooO = new LinkedList();
                }
            }
        }
    }

    public static class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public BucketLifecycleConfiguration.Rule f11036Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketLifecycleConfiguration f11037Oooo0oo = new BucketLifecycleConfiguration(new ArrayList());

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public LifecycleFilter f11038OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f11039OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public BucketLifecycleConfiguration.Transition f11040OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public AbortIncompleteMultipartUpload f11041OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public List<LifecycleFilterPredicate> f11042OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public String f11043OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public String f11044o000oOoO;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f11037Oooo0oo.f10713Oooo0o.add(this.f11036Oooo);
                    this.f11036Oooo = null;
                    return;
                }
                return;
            }
            if (OooOOOO("LifecycleConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    this.f11036Oooo.f10717Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("Prefix")) {
                    this.f11036Oooo.f10718Oooo0oO = OooOO0O();
                    return;
                }
                if (str.equals("Status")) {
                    this.f11036Oooo.f10719Oooo0oo = OooOO0O();
                    return;
                }
                if (str.equals("Transition")) {
                    BucketLifecycleConfiguration.Rule rule = this.f11036Oooo;
                    BucketLifecycleConfiguration.Transition transition = this.f11040OoooO00;
                    Objects.requireNonNull(rule);
                    if (transition == null) {
                        throw new IllegalArgumentException("Transition cannot be null.");
                    }
                    if (rule.f10724OoooOO0 == null) {
                        rule.f10724OoooOO0 = new ArrayList();
                    }
                    rule.f10724OoooOO0.add(transition);
                    this.f11040OoooO00 = null;
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f11036Oooo;
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f11039OoooO0;
                    Objects.requireNonNull(rule2);
                    if (noncurrentVersionTransition == null) {
                        throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
                    }
                    if (rule2.f10726o000oOoO == null) {
                        rule2.f10726o000oOoO = new ArrayList();
                    }
                    rule2.f10726o000oOoO.add(noncurrentVersionTransition);
                    this.f11039OoooO0 = null;
                    return;
                }
                if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f11036Oooo.f10725OoooOOO = this.f11041OoooO0O;
                    this.f11041OoooO0O = null;
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f11036Oooo.f10716Oooo = this.f11038OoooO;
                        this.f11038OoooO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f11036Oooo;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f10681OooO00o;
                    rule3.f10720OoooO = DateUtils.OooO0o(strOooOO0O);
                    return;
                }
                if (str.equals("Days")) {
                    this.f11036Oooo.f10722OoooO00 = Integer.parseInt(OooOO0O());
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O())) {
                        this.f11036Oooo.f10721OoooO0 = true;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "Transition")) {
                if (str.equals("StorageClass")) {
                    this.f11040OoooO00.f10729Oooo0oo = OooOO0O();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition2 = this.f11040OoooO00;
                        String strOooOO0O2 = OooOO0O();
                        Log log2 = ServiceUtils.f10681OooO00o;
                        transition2.f10728Oooo0oO = DateUtils.OooO0o(strOooOO0O2);
                        return;
                    }
                    if (str.equals("Days")) {
                        this.f11040OoooO00.f10727Oooo0o = Integer.parseInt(OooOO0O());
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    this.f11036Oooo.f10723OoooO0O = Integer.parseInt(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    this.f11039OoooO0.f10715Oooo0oO = OooOO0O();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        this.f11039OoooO0.f10714Oooo0o = Integer.parseInt(OooOO0O());
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f11041OoooO0O.f10688Oooo0o = Integer.parseInt(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11038OoooO.f10995Oooo0o = new LifecyclePrefixPredicate(OooOO0O());
                    return;
                }
                if (str.equals("Tag")) {
                    this.f11038OoooO.f10995Oooo0o = new LifecycleTagPredicate(new Tag(this.f11044o000oOoO, this.f11043OoooOOO));
                    this.f11044o000oOoO = null;
                    this.f11043OoooOOO = null;
                    return;
                }
                if (str.equals("And")) {
                    this.f11038OoooO.f10995Oooo0o = new LifecycleAndOperator(this.f11042OoooOO0);
                    this.f11042OoooOO0 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    this.f11044o000oOoO = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11043OoooOOO = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    this.f11042OoooOO0.add(new LifecyclePrefixPredicate(OooOO0O()));
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f11042OoooOO0.add(new LifecycleTagPredicate(new Tag(this.f11044o000oOoO, this.f11043OoooOOO)));
                        this.f11044o000oOoO = null;
                        this.f11043OoooOOO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    this.f11044o000oOoO = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f11043OoooOOO = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f11036Oooo = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (!OooOOOO("LifecycleConfiguration", "Rule")) {
                if (OooOOOO("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                    this.f11042OoooOO0 = new ArrayList();
                    return;
                }
                return;
            }
            if (str.equals("Transition")) {
                this.f11040OoooO00 = new BucketLifecycleConfiguration.Transition();
                return;
            }
            if (str.equals("NoncurrentVersionTransition")) {
                this.f11039OoooO0 = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
            } else if (str.equals("AbortIncompleteMultipartUpload")) {
                this.f11041OoooO0O = new AbortIncompleteMultipartUpload();
            } else if (str.equals("Filter")) {
                this.f11038OoooO = new LifecycleFilter();
            }
        }
    }

    public static class BucketLocationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public String f11045Oooo0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooO0O0() && str.equals("LocationConstraint")) {
                String strOooOO0O = OooOO0O();
                if (strOooOO0O.length() == 0) {
                    this.f11045Oooo0oo = null;
                } else {
                    this.f11045Oooo0oo = strOooOO0O;
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
        }
    }

    public static class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketLoggingConfiguration f11046Oooo0oo = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("BucketLoggingStatus", "LoggingEnabled")) {
                if (str.equals("TargetBucket")) {
                    this.f11046Oooo0oo.f10730Oooo0o = OooOO0O();
                } else if (str.equals("TargetPrefix")) {
                    BucketLoggingConfiguration bucketLoggingConfiguration = this.f11046Oooo0oo;
                    String strOooOO0O = OooOO0O();
                    if (strOooOO0O == null) {
                        strOooOO0O = "";
                    }
                    bucketLoggingConfiguration.f10731Oooo0oO = strOooOO0O;
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
        }
    }

    public static class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public String f11047Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketReplicationConfiguration f11048Oooo0oo = new BucketReplicationConfiguration();

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public ReplicationDestinationConfig f11049OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public ReplicationRule f11050OoooO00;

        /* JADX WARN: Type inference failed for: r5v17, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.services.s3.model.ReplicationRule>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("ReplicationConfiguration")) {
                if (!str.equals("Rule")) {
                    if (str.equals("Role")) {
                        this.f11048Oooo0oo.f10733Oooo0o = OooOO0O();
                        return;
                    }
                    return;
                }
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f11048Oooo0oo;
                String str2 = this.f11047Oooo;
                ReplicationRule replicationRule = this.f11050OoooO00;
                Objects.requireNonNull(bucketReplicationConfiguration);
                if (str2 == null || str2.trim().isEmpty()) {
                    throw new IllegalArgumentException("Rule id cannot be null or empty.");
                }
                if (replicationRule == null) {
                    throw new IllegalArgumentException("Replication rule cannot be null");
                }
                bucketReplicationConfiguration.f10734Oooo0oO.put(str2, replicationRule);
                this.f11050OoooO00 = null;
                this.f11047Oooo = null;
                this.f11049OoooO0 = null;
                return;
            }
            if (!OooOOOO("ReplicationConfiguration", "Rule")) {
                if (OooOOOO("ReplicationConfiguration", "Rule", "Destination")) {
                    if (!str.equals("Bucket")) {
                        if (str.equals("StorageClass")) {
                            this.f11049OoooO0.f10884OooO0O0 = OooOO0O();
                            return;
                        }
                        return;
                    }
                    ReplicationDestinationConfig replicationDestinationConfig = this.f11049OoooO0;
                    String strOooOO0O = OooOO0O();
                    Objects.requireNonNull(replicationDestinationConfig);
                    if (strOooOO0O == null) {
                        throw new IllegalArgumentException("Bucket name cannot be null");
                    }
                    replicationDestinationConfig.f10883OooO00o = strOooOO0O;
                    return;
                }
                return;
            }
            if (str.equals("ID")) {
                this.f11047Oooo = OooOO0O();
                return;
            }
            if (str.equals("Prefix")) {
                ReplicationRule replicationRule2 = this.f11050OoooO00;
                String strOooOO0O2 = OooOO0O();
                Objects.requireNonNull(replicationRule2);
                if (strOooOO0O2 == null) {
                    throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                }
                replicationRule2.f10885OooO00o = strOooOO0O2;
                return;
            }
            if (str.equals("Status")) {
                this.f11050OoooO00.f10886OooO0O0 = OooOO0O();
            } else if (str.equals("Destination")) {
                ReplicationRule replicationRule3 = this.f11050OoooO00;
                ReplicationDestinationConfig replicationDestinationConfig2 = this.f11049OoooO0;
                Objects.requireNonNull(replicationRule3);
                if (replicationDestinationConfig2 == null) {
                    throw new IllegalArgumentException("Destination cannot be null in the replication rule");
                }
                replicationRule3.f10887OooO0OO = replicationDestinationConfig2;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ReplicationConfiguration")) {
                if (str.equals("Rule")) {
                    this.f11050OoooO00 = new ReplicationRule();
                }
            } else if (OooOOOO("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f11049OoooO0 = new ReplicationDestinationConfig();
            }
        }
    }

    public static class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Map<String, String> f11051Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketTaggingConfiguration f11052Oooo0oo = new BucketTaggingConfiguration();

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public String f11053OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public String f11054OoooO00;

        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.TagSet>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            String str2;
            if (OooOOOO("Tagging")) {
                if (str.equals("TagSet")) {
                    this.f11052Oooo0oo.f10735Oooo0o.add(new TagSet(this.f11051Oooo));
                    this.f11051Oooo = null;
                    return;
                }
                return;
            }
            if (OooOOOO("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f11054OoooO00;
                    if (str3 != null && (str2 = this.f11053OoooO0) != null) {
                        this.f11051Oooo.put(str3, str2);
                    }
                    this.f11054OoooO00 = null;
                    this.f11053OoooO0 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f11054OoooO00 = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f11053OoooO0 = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("Tagging") && str.equals("TagSet")) {
                this.f11051Oooo = new HashMap();
            }
        }
    }

    public static class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketVersioningConfiguration f11055Oooo0oo = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("VersioningConfiguration")) {
                if (str.equals("Status")) {
                    BucketVersioningConfiguration bucketVersioningConfiguration = this.f11055Oooo0oo;
                    OooOO0O();
                    Objects.requireNonNull(bucketVersioningConfiguration);
                } else if (str.equals("MfaDelete")) {
                    String strOooOO0O = OooOO0O();
                    if (strOooOO0O.equals("Disabled")) {
                        this.f11055Oooo0oo.f10736Oooo0o = Boolean.FALSE;
                    } else if (!strOooOO0O.equals("Enabled")) {
                        this.f11055Oooo0oo.f10736Oooo0o = null;
                    } else {
                        this.f11055Oooo0oo.f10736Oooo0o = Boolean.TRUE;
                    }
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
        }
    }

    public static class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final BucketWebsiteConfiguration f11057Oooo0oo = new BucketWebsiteConfiguration(null);

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public RoutingRuleCondition f11056Oooo = null;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public RedirectRule f11059OoooO00 = null;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public RoutingRule f11058OoooO0 = null;

        /* JADX WARN: Type inference failed for: r9v15, types: [java.util.LinkedList, java.util.List<com.amazonaws.services.s3.model.RoutingRule>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f11057Oooo0oo.f10740Oooo0oo = this.f11059OoooO00;
                    this.f11059OoooO00 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("WebsiteConfiguration", "IndexDocument")) {
                if (str.equals("Suffix")) {
                    this.f11057Oooo0oo.f10738Oooo0o = OooOO0O();
                    return;
                }
                return;
            }
            if (OooOOOO("WebsiteConfiguration", "ErrorDocument")) {
                if (str.equals("Key")) {
                    this.f11057Oooo0oo.f10739Oooo0oO = OooOO0O();
                    return;
                }
                return;
            }
            if (OooOOOO("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f11057Oooo0oo.f10737Oooo.add(this.f11058OoooO0);
                    this.f11058OoooO0 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f11058OoooO0.f10892OooO00o = this.f11056Oooo;
                    this.f11056Oooo = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f11058OoooO0.f10893OooO0O0 = this.f11059OoooO00;
                        this.f11059OoooO00 = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    this.f11056Oooo.f10894OooO00o = OooOO0O();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        this.f11056Oooo.f10895OooO0O0 = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("WebsiteConfiguration", "RedirectAllRequestsTo") || OooOOOO("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    this.f11059OoooO00.f10878OooO00o = OooOO0O();
                    return;
                }
                if (str.equals("HostName")) {
                    this.f11059OoooO00.f10879OooO0O0 = OooOO0O();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    this.f11059OoooO00.f10880OooO0OO = OooOO0O();
                } else if (str.equals("ReplaceKeyWith")) {
                    this.f11059OoooO00.f10881OooO0Oo = OooOO0O();
                } else if (str.equals("HttpRedirectCode")) {
                    this.f11059OoooO00.f10882OooO0o0 = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f11059OoooO00 = new RedirectRule();
                }
            } else if (OooOOOO("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f11058OoooO0 = new RoutingRule();
                }
            } else if (OooOOOO("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f11056Oooo = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f11059OoooO00 = new RedirectRule();
                }
            }
        }
    }

    public static class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public AmazonS3Exception f11060Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public CompleteMultipartUploadResult f11061Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public String f11062OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public String f11063OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public String f11064OoooO0O;

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void OooO00o(String str) {
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void OooO0o(boolean z) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            AmazonS3Exception amazonS3Exception;
            if (OooO0O0()) {
                if (!str.equals("Error") || (amazonS3Exception = this.f11060Oooo) == null) {
                    return;
                }
                amazonS3Exception.f10269Oooo0oO = this.f11064OoooO0O;
                amazonS3Exception.f10268Oooo0o = this.f11062OoooO0;
                amazonS3Exception.f10706OoooO0 = this.f11063OoooO00;
                return;
            }
            if (!OooOOOO("CompleteMultipartUploadResult")) {
                if (OooOOOO("Error")) {
                    if (str.equals("Code")) {
                        this.f11064OoooO0O = OooOO0O();
                        return;
                    }
                    if (str.equals("Message")) {
                        this.f11060Oooo = new AmazonS3Exception(OooOO0O());
                        return;
                    } else if (str.equals("RequestId")) {
                        this.f11062OoooO0 = OooOO0O();
                        return;
                    } else {
                        if (str.equals("HostId")) {
                            this.f11063OoooO00 = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Location")) {
                CompleteMultipartUploadResult completeMultipartUploadResult = this.f11061Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(completeMultipartUploadResult);
                return;
            }
            if (str.equals("Bucket")) {
                CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f11061Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(completeMultipartUploadResult2);
            } else if (str.equals("Key")) {
                CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f11061Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(completeMultipartUploadResult3);
            } else if (str.equals("ETag")) {
                CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f11061Oooo0oo;
                ServiceUtils.OooO0OO(OooOO0O());
                Objects.requireNonNull(completeMultipartUploadResult4);
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooO0O0() && str.equals("CompleteMultipartUploadResult")) {
                this.f11061Oooo0oo = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooOO0o(String str) {
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooOOO(Date date) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        public final ServerSideEncryptionResult OooOOOo() {
            return this.f11061Oooo0oo;
        }
    }

    public static class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final CopyObjectResult f11066Oooo0oo = new CopyObjectResult();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public String f11065Oooo = null;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public String f11068OoooO00 = null;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public String f11067OoooO0 = null;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public String f11069OoooO0O = null;

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void OooO00o(String str) {
            this.f11066Oooo0oo.f10764OoooO0 = str;
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void OooO0o(boolean z) {
            Objects.requireNonNull(this.f11066Oooo0oo);
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("CopyObjectResult") || OooOOOO("CopyPartResult")) {
                if (str.equals("LastModified")) {
                    CopyObjectResult copyObjectResult = this.f11066Oooo0oo;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f10681OooO00o;
                    copyObjectResult.f10765OoooO00 = DateUtils.OooO0o(strOooOO0O);
                    return;
                }
                if (str.equals("ETag")) {
                    this.f11066Oooo0oo.f10763Oooo = ServiceUtils.OooO0OO(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOOOO("Error")) {
                if (str.equals("Code")) {
                    this.f11065Oooo = OooOO0O();
                    return;
                }
                if (str.equals("Message")) {
                    this.f11068OoooO00 = OooOO0O();
                } else if (str.equals("RequestId")) {
                    this.f11067OoooO0 = OooOO0O();
                } else if (str.equals("HostId")) {
                    this.f11069OoooO0O = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (!OooO0O0() || str.equals("CopyObjectResult") || str.equals("CopyPartResult")) {
                return;
            }
            str.equals("Error");
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooOO0o(String str) {
            Objects.requireNonNull(this.f11066Oooo0oo);
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooOOO(Date date) {
            Objects.requireNonNull(this.f11066Oooo0oo);
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        public final ServerSideEncryptionResult OooOOOo() {
            return this.f11066Oooo0oo;
        }
    }

    public static class DeleteObjectsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final DeleteObjectsResponse f11071Oooo0oo = new DeleteObjectsResponse();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public DeleteObjectsResult.DeletedObject f11070Oooo = null;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public MultiObjectDeleteException.DeleteError f11072OoooO00 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f11071Oooo0oo.f10639Oooo0o.add(this.f11070Oooo);
                    this.f11070Oooo = null;
                    return;
                } else {
                    if (str.equals("Error")) {
                        this.f11071Oooo0oo.f10640Oooo0oO.add(this.f11072OoooO00);
                        this.f11072OoooO00 = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("DeleteResult", "Deleted")) {
                if (str.equals("Key")) {
                    DeleteObjectsResult.DeletedObject deletedObject = this.f11070Oooo;
                    OooOO0O();
                    Objects.requireNonNull(deletedObject);
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult.DeletedObject deletedObject2 = this.f11070Oooo;
                    OooOO0O();
                    Objects.requireNonNull(deletedObject2);
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult.DeletedObject deletedObject3 = this.f11070Oooo;
                    OooOO0O().equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    Objects.requireNonNull(deletedObject3);
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult.DeletedObject deletedObject4 = this.f11070Oooo;
                        OooOO0O();
                        Objects.requireNonNull(deletedObject4);
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f11072OoooO00;
                    OooOO0O();
                    Objects.requireNonNull(deleteError);
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f11072OoooO00;
                    OooOO0O();
                    Objects.requireNonNull(deleteError2);
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f11072OoooO00;
                    OooOO0O();
                    Objects.requireNonNull(deleteError3);
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError4 = this.f11072OoooO00;
                    OooOO0O();
                    Objects.requireNonNull(deleteError4);
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f11070Oooo = new DeleteObjectsResult.DeletedObject();
                } else if (str.equals("Error")) {
                    this.f11072OoooO00 = new MultiObjectDeleteException.DeleteError();
                }
            }
        }
    }

    public static class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public AnalyticsFilter f11073Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final AnalyticsConfiguration f11074Oooo0oo = new AnalyticsConfiguration();

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public AnalyticsExportDestination f11075OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public StorageClassAnalysis f11076OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public List<AnalyticsFilterPredicate> f11077OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public StorageClassAnalysisDataExport f11078OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public AnalyticsS3BucketDestination f11079OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public String f11080OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public String f11081o000oOoO;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    this.f11074Oooo0oo.f10965Oooo0o = OooOO0O();
                    return;
                } else if (str.equals("Filter")) {
                    this.f11074Oooo0oo.f10966Oooo0oO = this.f11073Oooo;
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f11074Oooo0oo.f10967Oooo0oo = this.f11076OoooO0;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11073Oooo.f10969Oooo0o = new AnalyticsPrefixPredicate(OooOO0O());
                    return;
                }
                if (str.equals("Tag")) {
                    this.f11073Oooo.f10969Oooo0o = new AnalyticsTagPredicate(new Tag(this.f11081o000oOoO, this.f11080OoooOOO));
                    this.f11081o000oOoO = null;
                    this.f11080OoooOOO = null;
                    return;
                }
                if (str.equals("And")) {
                    this.f11073Oooo.f10969Oooo0o = new AnalyticsAndOperator(this.f11077OoooO00);
                    this.f11077OoooO00 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    this.f11081o000oOoO = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11080OoooOOO = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    this.f11077OoooO00.add(new AnalyticsPrefixPredicate(OooOO0O()));
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f11077OoooO00.add(new AnalyticsTagPredicate(new Tag(this.f11081o000oOoO, this.f11080OoooOOO)));
                        this.f11081o000oOoO = null;
                        this.f11080OoooOOO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    this.f11081o000oOoO = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11080OoooOOO = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f11076OoooO0.f10977Oooo0o = this.f11078OoooO0O;
                    return;
                }
                return;
            }
            if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    this.f11078OoooO0O.f10978Oooo0o = OooOO0O();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f11078OoooO0O.f10979Oooo0oO = this.f11075OoooO;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f11075OoooO.f10968Oooo0o = this.f11079OoooOO0;
                    return;
                }
                return;
            }
            if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    this.f11079OoooOO0.f10973Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    this.f11079OoooOO0.f10974Oooo0oO = OooOO0O();
                } else if (str.equals("Bucket")) {
                    this.f11079OoooOO0.f10975Oooo0oo = OooOO0O();
                } else if (str.equals("Prefix")) {
                    this.f11079OoooOO0.f10972Oooo = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f11073Oooo = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f11076OoooO0 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f11077OoooO00 = new ArrayList();
                }
            } else if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f11078OoooO0O = new StorageClassAnalysisDataExport();
                }
            } else if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f11075OoooO = new AnalyticsExportDestination();
                }
            } else if (OooOOOO("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f11079OoooOO0 = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public InventoryS3BucketDestination f11084OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public InventoryDestination f11085OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public List<String> f11086OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public InventoryFilter f11087OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public InventorySchedule f11088OoooOO0;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final GetBucketInventoryConfigurationResult f11083Oooo0oo = new GetBucketInventoryConfigurationResult();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final InventoryConfiguration f11082Oooo = new InventoryConfiguration();

        /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("InventoryConfiguration")) {
                if (str.equals("Id")) {
                    this.f11082Oooo.f10981Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f11082Oooo.f10982Oooo0oO = this.f11085OoooO0;
                    this.f11085OoooO0 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    this.f11082Oooo.f10983Oooo0oo = Boolean.valueOf(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O()));
                    return;
                }
                if (str.equals("Filter")) {
                    this.f11082Oooo.f10980Oooo = this.f11087OoooO0O;
                    this.f11087OoooO0O = null;
                    return;
                } else if (str.equals("IncludedObjectVersions")) {
                    this.f11082Oooo.f10985OoooO00 = OooOO0O();
                    return;
                } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    this.f11082Oooo.f10986OoooO0O = this.f11088OoooOO0;
                    this.f11088OoooOO0 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f11082Oooo.f10984OoooO0 = this.f11086OoooO00;
                        this.f11086OoooO00 = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f11085OoooO0.f10987Oooo0o = this.f11084OoooO;
                    this.f11084OoooO = null;
                    return;
                }
                return;
            }
            if (OooOOOO("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    this.f11084OoooO.f10991Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("Bucket")) {
                    this.f11084OoooO.f10992Oooo0oO = OooOO0O();
                    return;
                } else if (str.equals("Format")) {
                    this.f11084OoooO.f10993Oooo0oo = OooOO0O();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        this.f11084OoooO.f10990Oooo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11087OoooO0O.f10988Oooo0o = new InventoryPrefixPredicate(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOOOO("InventoryConfiguration", AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                if (str.equals("Frequency")) {
                    this.f11088OoooOO0.f10994Oooo0o = OooOO0O();
                    return;
                }
                return;
            }
            if (OooOOOO("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f11086OoooO00.add(OooOO0O());
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (!OooOOOO("InventoryConfiguration")) {
                if (OooOOOO("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f11084OoooO = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f11085OoooO0 = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f11087OoooO0O = new InventoryFilter();
            } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                this.f11088OoooOO0 = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f11086OoooO00 = new ArrayList();
            }
        }
    }

    public static class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public MetricsFilter f11089Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final MetricsConfiguration f11090Oooo0oo = new MetricsConfiguration();

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public String f11091OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public List<MetricsFilterPredicate> f11092OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public String f11093OoooO0O;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("MetricsConfiguration")) {
                if (str.equals("Id")) {
                    this.f11090Oooo0oo.f10999Oooo0o = OooOO0O();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f11090Oooo0oo.f11000Oooo0oO = this.f11089Oooo;
                        this.f11089Oooo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11089Oooo.f11001Oooo0o = new MetricsPrefixPredicate(OooOO0O());
                    return;
                }
                if (str.equals("Tag")) {
                    this.f11089Oooo.f11001Oooo0o = new MetricsTagPredicate(new Tag(this.f11091OoooO0, this.f11093OoooO0O));
                    this.f11091OoooO0 = null;
                    this.f11093OoooO0O = null;
                    return;
                }
                if (str.equals("And")) {
                    this.f11089Oooo.f11001Oooo0o = new MetricsAndOperator(this.f11092OoooO00);
                    this.f11092OoooO00 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    this.f11091OoooO0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11093OoooO0O = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    this.f11092OoooO00.add(new MetricsPrefixPredicate(OooOO0O()));
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f11092OoooO00.add(new MetricsTagPredicate(new Tag(this.f11091OoooO0, this.f11093OoooO0O)));
                        this.f11091OoooO0 = null;
                        this.f11093OoooO0O = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    this.f11091OoooO0 = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f11093OoooO0O = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f11089Oooo = new MetricsFilter();
                }
            } else if (OooOOOO("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f11092OoooO00 = new ArrayList();
            }
        }
    }

    public static class GetObjectTaggingHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public List<Tag> f11094Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public GetObjectTaggingResult f11095Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public String f11096OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public String f11097OoooO00;

        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.Tag>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("Tagging") && str.equals("TagSet")) {
                this.f11095Oooo0oo = new GetObjectTaggingResult(this.f11094Oooo);
                this.f11094Oooo = null;
            }
            if (OooOOOO("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f11094Oooo.add(new Tag(this.f11096OoooO0, this.f11097OoooO00));
                    this.f11096OoooO0 = null;
                    this.f11097OoooO00 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f11096OoooO0 = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f11097OoooO00 = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("Tagging") && str.equals("TagSet")) {
                this.f11094Oooo = new ArrayList();
            }
        }
    }

    public static class InitiateMultipartUploadHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final InitiateMultipartUploadResult f11098Oooo0oo = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("InitiateMultipartUploadResult")) {
                if (str.equals("Bucket")) {
                    InitiateMultipartUploadResult initiateMultipartUploadResult = this.f11098Oooo0oo;
                    OooOO0O();
                    Objects.requireNonNull(initiateMultipartUploadResult);
                } else if (str.equals("Key")) {
                    InitiateMultipartUploadResult initiateMultipartUploadResult2 = this.f11098Oooo0oo;
                    OooOO0O();
                    Objects.requireNonNull(initiateMultipartUploadResult2);
                } else if (str.equals("UploadId")) {
                    this.f11098Oooo0oo.f10824Oooo = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
        }
    }

    public static class ListAllMyBucketsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final List<Bucket> f11100Oooo0oo = new ArrayList();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Owner f11099Oooo = null;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Bucket f11101OoooO00 = null;

        /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.Bucket>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("ListAllMyBucketsResult", "Owner")) {
                if (str.equals("ID")) {
                    this.f11099Oooo.f10872Oooo0oO = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f11099Oooo.f10871Oooo0o = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f11100Oooo0oo.add(this.f11101OoooO00);
                    this.f11101OoooO00 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f11101OoooO00.f10708Oooo0o = OooOO0O();
                } else if (str.equals("CreationDate")) {
                    this.f11101OoooO00.f10710Oooo0oo = DateUtils.OooO0o(OooOO0O());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f11099Oooo = new Owner();
                }
            } else if (OooOOOO("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f11101OoooO00 = bucket;
                bucket.f10709Oooo0oO = this.f11099Oooo;
            }
        }
    }

    public static class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public AnalyticsConfiguration f11102Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ListBucketAnalyticsConfigurationsResult f11103Oooo0oo = new ListBucketAnalyticsConfigurationsResult();

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public StorageClassAnalysisDataExport f11104OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public List<AnalyticsFilterPredicate> f11105OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public AnalyticsFilter f11106OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public StorageClassAnalysis f11107OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public AnalyticsExportDestination f11108OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public String f11109OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public String f11110OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public AnalyticsS3BucketDestination f11111o000oOoO;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f11103Oooo0oo;
                    if (listBucketAnalyticsConfigurationsResult.f10826Oooo0o == null) {
                        listBucketAnalyticsConfigurationsResult.f10826Oooo0o = new ArrayList();
                    }
                    this.f11103Oooo0oo.f10826Oooo0o.add(this.f11102Oooo);
                    this.f11102Oooo = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult2 = this.f11103Oooo0oo;
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    Objects.requireNonNull(listBucketAnalyticsConfigurationsResult2);
                    return;
                } else if (str.equals("ContinuationToken")) {
                    ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult3 = this.f11103Oooo0oo;
                    OooOO0O();
                    Objects.requireNonNull(listBucketAnalyticsConfigurationsResult3);
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult4 = this.f11103Oooo0oo;
                        OooOO0O();
                        Objects.requireNonNull(listBucketAnalyticsConfigurationsResult4);
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    this.f11102Oooo.f10965Oooo0o = OooOO0O();
                    return;
                } else if (str.equals("Filter")) {
                    this.f11102Oooo.f10966Oooo0oO = this.f11106OoooO00;
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f11102Oooo.f10967Oooo0oo = this.f11107OoooO0O;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11106OoooO00.f10969Oooo0o = new AnalyticsPrefixPredicate(OooOO0O());
                    return;
                }
                if (str.equals("Tag")) {
                    this.f11106OoooO00.f10969Oooo0o = new AnalyticsTagPredicate(new Tag(this.f11109OoooOOO, this.f11110OoooOOo));
                    this.f11109OoooOOO = null;
                    this.f11110OoooOOo = null;
                    return;
                }
                if (str.equals("And")) {
                    this.f11106OoooO00.f10969Oooo0o = new AnalyticsAndOperator(this.f11105OoooO0);
                    this.f11105OoooO0 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    this.f11109OoooOOO = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11110OoooOOo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    this.f11105OoooO0.add(new AnalyticsPrefixPredicate(OooOO0O()));
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f11105OoooO0.add(new AnalyticsTagPredicate(new Tag(this.f11109OoooOOO, this.f11110OoooOOo)));
                        this.f11109OoooOOO = null;
                        this.f11110OoooOOo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    this.f11109OoooOOO = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11110OoooOOo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f11107OoooO0O.f10977Oooo0o = this.f11104OoooO;
                    return;
                }
                return;
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    this.f11104OoooO.f10978Oooo0o = OooOO0O();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f11104OoooO.f10979Oooo0oO = this.f11108OoooOO0;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f11108OoooOO0.f10968Oooo0o = this.f11111o000oOoO;
                    return;
                }
                return;
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    this.f11111o000oOoO.f10973Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    this.f11111o000oOoO.f10974Oooo0oO = OooOO0O();
                } else if (str.equals("Bucket")) {
                    this.f11111o000oOoO.f10975Oooo0oo = OooOO0O();
                } else if (str.equals("Prefix")) {
                    this.f11111o000oOoO.f10972Oooo = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f11102Oooo = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f11106OoooO00 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f11107OoooO0O = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f11105OoooO0 = new ArrayList();
                }
            } else if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f11104OoooO = new StorageClassAnalysisDataExport();
                }
            } else if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f11108OoooOO0 = new AnalyticsExportDestination();
                }
            } else if (OooOOOO("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f11111o000oOoO = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class ListBucketHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f11112Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ObjectListing f11113Oooo0oo = new ObjectListing();

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public S3ObjectSummary f11115OoooO00 = null;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Owner f11114OoooO0 = null;

        public ListBucketHandler(boolean z) {
            this.f11112Oooo = z;
        }

        /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary>] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r7v33, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary>] */
        /* JADX WARN: Type inference failed for: r7v36, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r7v40, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r7v44, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            String str2 = null;
            if (OooO0O0()) {
                if (str.equals("ListBucketResult")) {
                    ObjectListing objectListing = this.f11113Oooo0oo;
                    if (objectListing.f10861OoooO00 && objectListing.f10855Oooo == null) {
                        if (!objectListing.f10856Oooo0o.isEmpty()) {
                            ?? r7 = this.f11113Oooo0oo.f10856Oooo0o;
                            str2 = ((S3ObjectSummary) r7.get(r7.size() - 1)).f10905OooO0O0;
                        } else if (this.f11113Oooo0oo.f10857Oooo0oO.isEmpty()) {
                            XmlResponsesSaxParser.f11024OooO0O0.OooOO0("S3 response indicates truncated results, but contains no object summaries or common prefixes.");
                        } else {
                            ?? r8 = this.f11113Oooo0oo.f10857Oooo0oO;
                            str2 = (String) r8.get(r8.size() - 1);
                        }
                        this.f11113Oooo0oo.f10855Oooo = str2;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!OooOOOO("ListBucketResult")) {
                if (!OooOOOO("ListBucketResult", "Contents")) {
                    if (!OooOOOO("ListBucketResult", "Contents", "Owner")) {
                        if (OooOOOO("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                            this.f11113Oooo0oo.f10857Oooo0oO.add(XmlResponsesSaxParser.OooO0O0(OooOO0O(), this.f11112Oooo));
                            return;
                        }
                        return;
                    }
                    if (str.equals("ID")) {
                        this.f11114OoooO0.f10872Oooo0oO = OooOO0O();
                        return;
                    } else {
                        if (str.equals("DisplayName")) {
                            this.f11114OoooO0.f10871Oooo0o = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                if (str.equals("Key")) {
                    String strOooOO0O = OooOO0O();
                    this.f11115OoooO00.f10905OooO0O0 = XmlResponsesSaxParser.OooO0O0(strOooOO0O, this.f11112Oooo);
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary = this.f11115OoooO00;
                    String strOooOO0O2 = OooOO0O();
                    Log log = ServiceUtils.f10681OooO00o;
                    s3ObjectSummary.f10909OooO0o0 = DateUtils.OooO0o(strOooOO0O2);
                    return;
                }
                if (str.equals("ETag")) {
                    this.f11115OoooO00.f10906OooO0OO = ServiceUtils.OooO0OO(OooOO0O());
                    return;
                }
                if (str.equals("Size")) {
                    this.f11115OoooO00.f10907OooO0Oo = XmlResponsesSaxParser.OooO0Oo(OooOO0O());
                    return;
                } else if (str.equals("StorageClass")) {
                    this.f11115OoooO00.f10908OooO0o = OooOO0O();
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f11115OoooO00.f10910OooO0oO = this.f11114OoooO0;
                        this.f11114OoooO0 = null;
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Name")) {
                this.f11113Oooo0oo.f10858Oooo0oo = OooOO0O();
                Log log2 = XmlResponsesSaxParser.f11024OooO0O0;
                if (log2.OooO0OO()) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Examining listing for bucket: ");
                    sbOooO0o0.append(this.f11113Oooo0oo.f10858Oooo0oo);
                    log2.OooO00o(sbOooO0o0.toString());
                    return;
                }
                return;
            }
            if (str.equals("Prefix")) {
                this.f11113Oooo0oo.f10860OoooO0 = XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11112Oooo);
                return;
            }
            if (str.equals("Marker")) {
                ObjectListing objectListing2 = this.f11113Oooo0oo;
                XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11112Oooo);
                Objects.requireNonNull(objectListing2);
                return;
            }
            if (str.equals("NextMarker")) {
                this.f11113Oooo0oo.f10855Oooo = XmlResponsesSaxParser.OooO0O0(OooOO0O(), this.f11112Oooo);
                return;
            }
            if (str.equals("MaxKeys")) {
                this.f11113Oooo0oo.f10862OoooO0O = XmlResponsesSaxParser.OooO0OO(OooOO0O());
                return;
            }
            if (str.equals("Delimiter")) {
                this.f11113Oooo0oo.f10859OoooO = XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11112Oooo);
                return;
            }
            if (str.equals("EncodingType")) {
                this.f11113Oooo0oo.f10863OoooOO0 = XmlResponsesSaxParser.OooO00o(OooOO0O());
                return;
            }
            if (!str.equals("IsTruncated")) {
                if (str.equals("Contents")) {
                    this.f11113Oooo0oo.f10856Oooo0o.add(this.f11115OoooO00);
                    this.f11115OoooO00 = null;
                    return;
                }
                return;
            }
            String strOooO00o = StringUtils.OooO00o(OooOO0O());
            if (strOooO00o.startsWith("false")) {
                this.f11113Oooo0oo.f10861OoooO00 = false;
            } else {
                if (!strOooO00o.startsWith(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                    throw new IllegalStateException(OooOo00.OooO0Oo("Invalid value for IsTruncated field: ", strOooO00o));
                }
                this.f11113Oooo0oo.f10861OoooO00 = true;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (!OooOOOO("ListBucketResult")) {
                if (OooOOOO("ListBucketResult", "Contents") && str.equals("Owner")) {
                    this.f11114OoooO0 = new Owner();
                    return;
                }
                return;
            }
            if (str.equals("Contents")) {
                S3ObjectSummary s3ObjectSummary = new S3ObjectSummary();
                this.f11115OoooO00 = s3ObjectSummary;
                s3ObjectSummary.f10904OooO00o = this.f11113Oooo0oo.f10858Oooo0oo;
            }
        }
    }

    public static class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public InventoryConfiguration f11116Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ListBucketInventoryConfigurationsResult f11117Oooo0oo = new ListBucketInventoryConfigurationsResult();

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public InventoryS3BucketDestination f11118OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public InventoryDestination f11119OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public List<String> f11120OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public InventoryFilter f11121OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public InventorySchedule f11122OoooOO0;

        /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f11117Oooo0oo;
                    if (listBucketInventoryConfigurationsResult.f10827Oooo0o == null) {
                        listBucketInventoryConfigurationsResult.f10827Oooo0o = new ArrayList();
                    }
                    this.f11117Oooo0oo.f10827Oooo0o.add(this.f11116Oooo);
                    this.f11116Oooo = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult2 = this.f11117Oooo0oo;
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    Objects.requireNonNull(listBucketInventoryConfigurationsResult2);
                    return;
                } else if (str.equals("ContinuationToken")) {
                    ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult3 = this.f11117Oooo0oo;
                    OooOO0O();
                    Objects.requireNonNull(listBucketInventoryConfigurationsResult3);
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult4 = this.f11117Oooo0oo;
                        OooOO0O();
                        Objects.requireNonNull(listBucketInventoryConfigurationsResult4);
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Id")) {
                    this.f11116Oooo.f10981Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f11116Oooo.f10982Oooo0oO = this.f11119OoooO0;
                    this.f11119OoooO0 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    this.f11116Oooo.f10983Oooo0oo = Boolean.valueOf(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O()));
                    return;
                }
                if (str.equals("Filter")) {
                    this.f11116Oooo.f10980Oooo = this.f11121OoooO0O;
                    this.f11121OoooO0O = null;
                    return;
                } else if (str.equals("IncludedObjectVersions")) {
                    this.f11116Oooo.f10985OoooO00 = OooOO0O();
                    return;
                } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    this.f11116Oooo.f10986OoooO0O = this.f11122OoooOO0;
                    this.f11122OoooOO0 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f11116Oooo.f10984OoooO0 = this.f11120OoooO00;
                        this.f11120OoooO00 = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f11119OoooO0.f10987Oooo0o = this.f11118OoooO;
                    this.f11118OoooO = null;
                    return;
                }
                return;
            }
            if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    this.f11118OoooO.f10991Oooo0o = OooOO0O();
                    return;
                }
                if (str.equals("Bucket")) {
                    this.f11118OoooO.f10992Oooo0oO = OooOO0O();
                    return;
                } else if (str.equals("Format")) {
                    this.f11118OoooO.f10993Oooo0oo = OooOO0O();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        this.f11118OoooO.f10990Oooo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11121OoooO0O.f10988Oooo0o = new InventoryPrefixPredicate(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration", AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                if (str.equals("Frequency")) {
                    this.f11122OoooOO0.f10994Oooo0o = OooOO0O();
                    return;
                }
                return;
            }
            if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f11120OoooO00.add(OooOO0O());
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f11116Oooo = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (!OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (OooOOOO("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f11118OoooO = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f11119OoooO0 = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f11121OoooO0O = new InventoryFilter();
            } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                this.f11122OoooOO0 = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f11120OoooO00 = new ArrayList();
            }
        }
    }

    public static class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public MetricsConfiguration f11123Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ListBucketMetricsConfigurationsResult f11124Oooo0oo = new ListBucketMetricsConfigurationsResult();

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public String f11125OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public List<MetricsFilterPredicate> f11126OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public MetricsFilter f11127OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public String f11128OoooO0O;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f11124Oooo0oo;
                    if (listBucketMetricsConfigurationsResult.f10828Oooo0o == null) {
                        listBucketMetricsConfigurationsResult.f10828Oooo0o = new ArrayList();
                    }
                    this.f11124Oooo0oo.f10828Oooo0o.add(this.f11123Oooo);
                    this.f11123Oooo = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult2 = this.f11124Oooo0oo;
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    Objects.requireNonNull(listBucketMetricsConfigurationsResult2);
                    return;
                } else if (str.equals("ContinuationToken")) {
                    ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult3 = this.f11124Oooo0oo;
                    OooOO0O();
                    Objects.requireNonNull(listBucketMetricsConfigurationsResult3);
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult4 = this.f11124Oooo0oo;
                        OooOO0O();
                        Objects.requireNonNull(listBucketMetricsConfigurationsResult4);
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Id")) {
                    this.f11123Oooo.f10999Oooo0o = OooOO0O();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f11123Oooo.f11000Oooo0oO = this.f11127OoooO00;
                        this.f11127OoooO00 = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    this.f11127OoooO00.f11001Oooo0o = new MetricsPrefixPredicate(OooOO0O());
                    return;
                }
                if (str.equals("Tag")) {
                    this.f11127OoooO00.f11001Oooo0o = new MetricsTagPredicate(new Tag(this.f11128OoooO0O, this.f11125OoooO));
                    this.f11128OoooO0O = null;
                    this.f11125OoooO = null;
                    return;
                }
                if (str.equals("And")) {
                    this.f11127OoooO00.f11001Oooo0o = new MetricsAndOperator(this.f11126OoooO0);
                    this.f11126OoooO0 = null;
                    return;
                }
                return;
            }
            if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    this.f11128OoooO0O = OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        this.f11125OoooO = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    this.f11126OoooO0.add(new MetricsPrefixPredicate(OooOO0O()));
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f11126OoooO0.add(new MetricsTagPredicate(new Tag(this.f11128OoooO0O, this.f11125OoooO)));
                        this.f11128OoooO0O = null;
                        this.f11125OoooO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    this.f11128OoooO0O = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f11125OoooO = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    this.f11123Oooo = new MetricsConfiguration();
                }
            } else if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f11127OoooO00 = new MetricsFilter();
                }
            } else if (OooOOOO("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f11126OoooO0 = new ArrayList();
            }
        }
    }

    public static class ListMultipartUploadsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public MultipartUpload f11129Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final MultipartUploadListing f11130Oooo0oo = new MultipartUploadListing();

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Owner f11131OoooO00;

        /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.MultipartUpload>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (!OooOOOO("ListMultipartUploadsResult")) {
                if (OooOOOO("ListMultipartUploadsResult", "CommonPrefixes")) {
                    if (str.equals("Prefix")) {
                        this.f11130Oooo0oo.f10852OooO0O0.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (!OooOOOO("ListMultipartUploadsResult", "Upload")) {
                    if (OooOOOO("ListMultipartUploadsResult", "Upload", "Owner") || OooOOOO("ListMultipartUploadsResult", "Upload", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f11131OoooO00.f10872Oooo0oO = XmlResponsesSaxParser.OooO00o(OooOO0O());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f11131OoooO00.f10871Oooo0o = XmlResponsesSaxParser.OooO00o(OooOO0O());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f11129Oooo;
                    OooOO0O();
                    Objects.requireNonNull(multipartUpload);
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f11129Oooo;
                    OooOO0O();
                    Objects.requireNonNull(multipartUpload2);
                    return;
                }
                if (str.equals("Owner")) {
                    Objects.requireNonNull(this.f11129Oooo);
                    this.f11131OoooO00 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    Objects.requireNonNull(this.f11129Oooo);
                    this.f11131OoooO00 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f11129Oooo;
                    OooOO0O();
                    Objects.requireNonNull(multipartUpload3);
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f11129Oooo;
                        String strOooOO0O = OooOO0O();
                        Log log = ServiceUtils.f10681OooO00o;
                        DateUtils.OooO0o(strOooOO0O);
                        Objects.requireNonNull(multipartUpload4);
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Bucket")) {
                MultipartUploadListing multipartUploadListing = this.f11130Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(multipartUploadListing);
                return;
            }
            if (str.equals("KeyMarker")) {
                MultipartUploadListing multipartUploadListing2 = this.f11130Oooo0oo;
                OooOO0O();
                Log log2 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing2);
                return;
            }
            if (str.equals("Delimiter")) {
                MultipartUploadListing multipartUploadListing3 = this.f11130Oooo0oo;
                OooOO0O();
                Log log3 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing3);
                return;
            }
            if (str.equals("Prefix")) {
                MultipartUploadListing multipartUploadListing4 = this.f11130Oooo0oo;
                OooOO0O();
                Log log4 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing4);
                return;
            }
            if (str.equals("UploadIdMarker")) {
                MultipartUploadListing multipartUploadListing5 = this.f11130Oooo0oo;
                OooOO0O();
                Log log5 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing5);
                return;
            }
            if (str.equals("NextKeyMarker")) {
                MultipartUploadListing multipartUploadListing6 = this.f11130Oooo0oo;
                OooOO0O();
                Log log6 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing6);
                return;
            }
            if (str.equals("NextUploadIdMarker")) {
                MultipartUploadListing multipartUploadListing7 = this.f11130Oooo0oo;
                OooOO0O();
                Log log7 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing7);
                return;
            }
            if (str.equals("MaxUploads")) {
                MultipartUploadListing multipartUploadListing8 = this.f11130Oooo0oo;
                Integer.parseInt(OooOO0O());
                Objects.requireNonNull(multipartUploadListing8);
                return;
            }
            if (str.equals("EncodingType")) {
                MultipartUploadListing multipartUploadListing9 = this.f11130Oooo0oo;
                OooOO0O();
                Log log8 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(multipartUploadListing9);
                return;
            }
            if (str.equals("IsTruncated")) {
                MultipartUploadListing multipartUploadListing10 = this.f11130Oooo0oo;
                Boolean.parseBoolean(OooOO0O());
                Objects.requireNonNull(multipartUploadListing10);
            } else if (str.equals("Upload")) {
                MultipartUploadListing multipartUploadListing11 = this.f11130Oooo0oo;
                if (multipartUploadListing11.f10851OooO00o == null) {
                    multipartUploadListing11.f10851OooO00o = new ArrayList();
                }
                multipartUploadListing11.f10851OooO00o.add(this.f11129Oooo);
                this.f11129Oooo = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f11129Oooo = new MultipartUpload();
                }
            } else if (OooOOOO("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f11131OoooO00 = new Owner();
                }
            }
        }
    }

    public static class ListObjectsV2Handler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f11132Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ListObjectsV2Result f11133Oooo0oo = new ListObjectsV2Result();

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public S3ObjectSummary f11135OoooO00 = null;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Owner f11134OoooO0 = null;

        public ListObjectsV2Handler(boolean z) {
            this.f11132Oooo = z;
        }

        /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary>] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r7v35, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary>] */
        /* JADX WARN: Type inference failed for: r7v40, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            String str2 = null;
            if (OooO0O0()) {
                if (str.equals("ListBucketResult")) {
                    ListObjectsV2Result listObjectsV2Result = this.f11133Oooo0oo;
                    if (listObjectsV2Result.f10841OooO0OO && listObjectsV2Result.f10843OooO0o0 == null) {
                        if (listObjectsV2Result.f10839OooO00o.isEmpty()) {
                            XmlResponsesSaxParser.f11024OooO0O0.OooOO0("S3 response indicates truncated results, but contains no object summaries.");
                        } else {
                            ?? r7 = this.f11133Oooo0oo.f10839OooO00o;
                            str2 = ((S3ObjectSummary) r7.get(r7.size() - 1)).f10905OooO0O0;
                        }
                        this.f11133Oooo0oo.f10843OooO0o0 = str2;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!OooOOOO("ListBucketResult")) {
                if (!OooOOOO("ListBucketResult", "Contents")) {
                    if (!OooOOOO("ListBucketResult", "Contents", "Owner")) {
                        if (OooOOOO("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                            this.f11133Oooo0oo.f10840OooO0O0.add(XmlResponsesSaxParser.OooO0O0(OooOO0O(), this.f11132Oooo));
                            return;
                        }
                        return;
                    }
                    if (str.equals("ID")) {
                        this.f11134OoooO0.f10872Oooo0oO = OooOO0O();
                        return;
                    } else {
                        if (str.equals("DisplayName")) {
                            this.f11134OoooO0.f10871Oooo0o = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                if (str.equals("Key")) {
                    String strOooOO0O = OooOO0O();
                    this.f11135OoooO00.f10905OooO0O0 = XmlResponsesSaxParser.OooO0O0(strOooOO0O, this.f11132Oooo);
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary = this.f11135OoooO00;
                    String strOooOO0O2 = OooOO0O();
                    Log log = ServiceUtils.f10681OooO00o;
                    s3ObjectSummary.f10909OooO0o0 = DateUtils.OooO0o(strOooOO0O2);
                    return;
                }
                if (str.equals("ETag")) {
                    this.f11135OoooO00.f10906OooO0OO = ServiceUtils.OooO0OO(OooOO0O());
                    return;
                }
                if (str.equals("Size")) {
                    this.f11135OoooO00.f10907OooO0Oo = XmlResponsesSaxParser.OooO0Oo(OooOO0O());
                    return;
                } else if (str.equals("StorageClass")) {
                    this.f11135OoooO00.f10908OooO0o = OooOO0O();
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f11135OoooO00.f10910OooO0oO = this.f11134OoooO0;
                        this.f11134OoooO0 = null;
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Name")) {
                this.f11133Oooo0oo.f10842OooO0Oo = OooOO0O();
                Log log2 = XmlResponsesSaxParser.f11024OooO0O0;
                if (log2.OooO0OO()) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Examining listing for bucket: ");
                    sbOooO0o0.append(this.f11133Oooo0oo.f10842OooO0Oo);
                    log2.OooO00o(sbOooO0o0.toString());
                    return;
                }
                return;
            }
            if (str.equals("Prefix")) {
                ListObjectsV2Result listObjectsV2Result2 = this.f11133Oooo0oo;
                XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11132Oooo);
                Objects.requireNonNull(listObjectsV2Result2);
                return;
            }
            if (str.equals("MaxKeys")) {
                ListObjectsV2Result listObjectsV2Result3 = this.f11133Oooo0oo;
                XmlResponsesSaxParser.OooO0OO(OooOO0O());
                Objects.requireNonNull(listObjectsV2Result3);
                return;
            }
            if (str.equals("NextContinuationToken")) {
                this.f11133Oooo0oo.f10843OooO0o0 = OooOO0O();
                return;
            }
            if (str.equals("ContinuationToken")) {
                ListObjectsV2Result listObjectsV2Result4 = this.f11133Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(listObjectsV2Result4);
                return;
            }
            if (str.equals("StartAfter")) {
                ListObjectsV2Result listObjectsV2Result5 = this.f11133Oooo0oo;
                XmlResponsesSaxParser.OooO0O0(OooOO0O(), this.f11132Oooo);
                Objects.requireNonNull(listObjectsV2Result5);
                return;
            }
            if (str.equals("KeyCount")) {
                ListObjectsV2Result listObjectsV2Result6 = this.f11133Oooo0oo;
                XmlResponsesSaxParser.OooO0OO(OooOO0O());
                Objects.requireNonNull(listObjectsV2Result6);
                return;
            }
            if (str.equals("Delimiter")) {
                ListObjectsV2Result listObjectsV2Result7 = this.f11133Oooo0oo;
                XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11132Oooo);
                Objects.requireNonNull(listObjectsV2Result7);
                return;
            }
            if (str.equals("EncodingType")) {
                ListObjectsV2Result listObjectsV2Result8 = this.f11133Oooo0oo;
                OooOO0O();
                Log log3 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(listObjectsV2Result8);
                return;
            }
            if (!str.equals("IsTruncated")) {
                if (str.equals("Contents")) {
                    this.f11133Oooo0oo.f10839OooO00o.add(this.f11135OoooO00);
                    this.f11135OoooO00 = null;
                    return;
                }
                return;
            }
            String strOooO00o = StringUtils.OooO00o(OooOO0O());
            if (strOooO00o.startsWith("false")) {
                this.f11133Oooo0oo.f10841OooO0OO = false;
            } else {
                if (!strOooO00o.startsWith(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                    throw new IllegalStateException(OooOo00.OooO0Oo("Invalid value for IsTruncated field: ", strOooO00o));
                }
                this.f11133Oooo0oo.f10841OooO0OO = true;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (!OooOOOO("ListBucketResult")) {
                if (OooOOOO("ListBucketResult", "Contents") && str.equals("Owner")) {
                    this.f11134OoooO0 = new Owner();
                    return;
                }
                return;
            }
            if (str.equals("Contents")) {
                S3ObjectSummary s3ObjectSummary = new S3ObjectSummary();
                this.f11135OoooO00 = s3ObjectSummary;
                s3ObjectSummary.f10904OooO00o = this.f11133Oooo0oo.f10842OooO0Oo;
            }
        }
    }

    public static class ListPartsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public PartSummary f11136Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final PartListing f11137Oooo0oo = new PartListing();

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Owner f11138OoooO00;

        /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.PartSummary>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (!OooOOOO("ListPartsResult")) {
                if (!OooOOOO("ListPartsResult", "Part")) {
                    if (OooOOOO("ListPartsResult", "Owner") || OooOOOO("ListPartsResult", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f11138OoooO00.f10872Oooo0oO = XmlResponsesSaxParser.OooO00o(OooOO0O());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f11138OoooO00.f10871Oooo0o = XmlResponsesSaxParser.OooO00o(OooOO0O());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f11136Oooo;
                    Integer.parseInt(OooOO0O());
                    Objects.requireNonNull(partSummary);
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f11136Oooo;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f10681OooO00o;
                    DateUtils.OooO0o(strOooOO0O);
                    Objects.requireNonNull(partSummary2);
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f11136Oooo;
                    ServiceUtils.OooO0OO(OooOO0O());
                    Objects.requireNonNull(partSummary3);
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f11136Oooo;
                        Long.parseLong(OooOO0O());
                        Objects.requireNonNull(partSummary4);
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Bucket")) {
                PartListing partListing = this.f11137Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(partListing);
                return;
            }
            if (str.equals("Key")) {
                PartListing partListing2 = this.f11137Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(partListing2);
                return;
            }
            if (str.equals("UploadId")) {
                PartListing partListing3 = this.f11137Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(partListing3);
                return;
            }
            if (str.equals("Owner")) {
                Objects.requireNonNull(this.f11137Oooo0oo);
                this.f11138OoooO00 = null;
                return;
            }
            if (str.equals("Initiator")) {
                Objects.requireNonNull(this.f11137Oooo0oo);
                this.f11138OoooO00 = null;
                return;
            }
            if (str.equals("StorageClass")) {
                PartListing partListing4 = this.f11137Oooo0oo;
                OooOO0O();
                Objects.requireNonNull(partListing4);
                return;
            }
            if (str.equals("PartNumberMarker")) {
                PartListing partListing5 = this.f11137Oooo0oo;
                OooOO0O();
                OooOOOo().intValue();
                Objects.requireNonNull(partListing5);
                return;
            }
            if (str.equals("NextPartNumberMarker")) {
                PartListing partListing6 = this.f11137Oooo0oo;
                OooOO0O();
                OooOOOo().intValue();
                Objects.requireNonNull(partListing6);
                return;
            }
            if (str.equals("MaxParts")) {
                PartListing partListing7 = this.f11137Oooo0oo;
                OooOO0O();
                OooOOOo().intValue();
                Objects.requireNonNull(partListing7);
                return;
            }
            if (str.equals("EncodingType")) {
                PartListing partListing8 = this.f11137Oooo0oo;
                OooOO0O();
                Log log2 = XmlResponsesSaxParser.f11024OooO0O0;
                Objects.requireNonNull(partListing8);
                return;
            }
            if (str.equals("IsTruncated")) {
                PartListing partListing9 = this.f11137Oooo0oo;
                Boolean.parseBoolean(OooOO0O());
                Objects.requireNonNull(partListing9);
            } else if (str.equals("Part")) {
                PartListing partListing10 = this.f11137Oooo0oo;
                if (partListing10.f10875Oooo0o == null) {
                    partListing10.f10875Oooo0o = new ArrayList();
                }
                partListing10.f10875Oooo0o.add(this.f11136Oooo);
                this.f11136Oooo = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (OooOOOO("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f11136Oooo = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f11138OoooO00 = new Owner();
                }
            }
        }

        public final Integer OooOOOo() {
            String strOooO00o = XmlResponsesSaxParser.OooO00o(OooOO0O());
            if (strOooO00o == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(strOooO00o));
        }
    }

    public static class ListVersionsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f11139Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final VersionListing f11140Oooo0oo = new VersionListing();

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Owner f11141OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public S3VersionSummary f11142OoooO00;

        public ListVersionsHandler(boolean z) {
            this.f11139Oooo = z;
        }

        /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.S3VersionSummary>] */
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            String strDecode = null;
            if (OooOOOO("ListVersionsResult")) {
                if (str.equals("Name")) {
                    this.f11140Oooo0oo.f10958OooO0OO = OooOO0O();
                    return;
                }
                if (str.equals("Prefix")) {
                    this.f11140Oooo0oo.f10962OooO0oO = XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11139Oooo);
                    return;
                }
                if (str.equals("KeyMarker")) {
                    VersionListing versionListing = this.f11140Oooo0oo;
                    XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11139Oooo);
                    Objects.requireNonNull(versionListing);
                    return;
                }
                if (str.equals("VersionIdMarker")) {
                    VersionListing versionListing2 = this.f11140Oooo0oo;
                    OooOO0O();
                    Log log = XmlResponsesSaxParser.f11024OooO0O0;
                    Objects.requireNonNull(versionListing2);
                    return;
                }
                if (str.equals("MaxKeys")) {
                    this.f11140Oooo0oo.f10963OooO0oo = Integer.parseInt(OooOO0O());
                    return;
                }
                if (str.equals("Delimiter")) {
                    this.f11140Oooo0oo.f10955OooO = XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11139Oooo);
                    return;
                }
                if (str.equals("EncodingType")) {
                    this.f11140Oooo0oo.f10964OooOO0 = XmlResponsesSaxParser.OooO00o(OooOO0O());
                    return;
                }
                if (str.equals("NextKeyMarker")) {
                    this.f11140Oooo0oo.f10959OooO0Oo = XmlResponsesSaxParser.OooO0O0(XmlResponsesSaxParser.OooO00o(OooOO0O()), this.f11139Oooo);
                    return;
                }
                if (str.equals("NextVersionIdMarker")) {
                    this.f11140Oooo0oo.f10961OooO0o0 = OooOO0O();
                    return;
                } else if (str.equals("IsTruncated")) {
                    this.f11140Oooo0oo.f10960OooO0o = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    return;
                } else {
                    if (str.equals("Version") || str.equals("DeleteMarker")) {
                        this.f11140Oooo0oo.f10956OooO00o.add(this.f11142OoooO00);
                        this.f11142OoooO00 = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOOOO("ListVersionsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    String strOooO00o = XmlResponsesSaxParser.OooO00o(OooOO0O());
                    ?? r0 = this.f11140Oooo0oo.f10957OooO0O0;
                    if (this.f11139Oooo) {
                        Pattern pattern = S3HttpUtils.f10666OooO00o;
                        if (strOooO00o != null) {
                            try {
                                strDecode = URLDecoder.decode(strOooO00o, "UTF-8");
                            } catch (UnsupportedEncodingException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        strOooO00o = strDecode;
                    }
                    r0.add(strOooO00o);
                    return;
                }
                return;
            }
            if (!OooOOOO("ListVersionsResult", "Version") && !OooOOOO("ListVersionsResult", "DeleteMarker")) {
                if (OooOOOO("ListVersionsResult", "Version", "Owner") || OooOOOO("ListVersionsResult", "DeleteMarker", "Owner")) {
                    if (str.equals("ID")) {
                        this.f11141OoooO0.f10872Oooo0oO = OooOO0O();
                        return;
                    } else {
                        if (str.equals("DisplayName")) {
                            this.f11141OoooO0.f10871Oooo0o = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Key")) {
                String strOooOO0O = OooOO0O();
                S3VersionSummary s3VersionSummary = this.f11142OoooO00;
                XmlResponsesSaxParser.OooO0O0(strOooOO0O, this.f11139Oooo);
                Objects.requireNonNull(s3VersionSummary);
                return;
            }
            if (str.equals("VersionId")) {
                S3VersionSummary s3VersionSummary2 = this.f11142OoooO00;
                OooOO0O();
                Objects.requireNonNull(s3VersionSummary2);
                return;
            }
            if (str.equals("IsLatest")) {
                S3VersionSummary s3VersionSummary3 = this.f11142OoooO00;
                ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                Objects.requireNonNull(s3VersionSummary3);
                return;
            }
            if (str.equals("LastModified")) {
                S3VersionSummary s3VersionSummary4 = this.f11142OoooO00;
                String strOooOO0O2 = OooOO0O();
                Log log2 = ServiceUtils.f10681OooO00o;
                DateUtils.OooO0o(strOooOO0O2);
                Objects.requireNonNull(s3VersionSummary4);
                return;
            }
            if (str.equals("ETag")) {
                S3VersionSummary s3VersionSummary5 = this.f11142OoooO00;
                ServiceUtils.OooO0OO(OooOO0O());
                Objects.requireNonNull(s3VersionSummary5);
            } else if (str.equals("Size")) {
                S3VersionSummary s3VersionSummary6 = this.f11142OoooO00;
                Long.parseLong(OooOO0O());
                Objects.requireNonNull(s3VersionSummary6);
            } else if (str.equals("Owner")) {
                Objects.requireNonNull(this.f11142OoooO00);
                this.f11141OoooO0 = null;
            } else if (str.equals("StorageClass")) {
                S3VersionSummary s3VersionSummary7 = this.f11142OoooO00;
                OooOO0O();
                Objects.requireNonNull(s3VersionSummary7);
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
            if (!OooOOOO("ListVersionsResult")) {
                if ((OooOOOO("ListVersionsResult", "Version") || OooOOOO("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                    this.f11141OoooO0 = new Owner();
                    return;
                }
                return;
            }
            if (str.equals("Version")) {
                this.f11142OoooO00 = new S3VersionSummary();
                String str2 = this.f11140Oooo0oo.f10958OooO0OO;
            } else if (str.equals("DeleteMarker")) {
                S3VersionSummary s3VersionSummary = new S3VersionSummary();
                this.f11142OoooO00 = s3VersionSummary;
                String str3 = this.f11140Oooo0oo.f10958OooO0OO;
                Objects.requireNonNull(s3VersionSummary);
            }
        }
    }

    public static class RequestPaymentConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public String f11143Oooo0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0o0(String str) {
            if (OooOOOO("RequestPaymentConfiguration") && str.equals("Payer")) {
                this.f11143Oooo0oo = OooOO0O();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str, Attributes attributes) {
        }
    }

    public XmlResponsesSaxParser() throws AmazonClientException {
        this.f11025OooO00o = null;
        try {
            this.f11025OooO00o = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f11025OooO00o = XMLReaderFactory.createXMLReader();
            } catch (SAXException unused) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader", e);
            }
        }
    }

    public static String OooO00o(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static String OooO0O0(String str, boolean z) {
        if (!z) {
            return str;
        }
        Pattern pattern = S3HttpUtils.f10666OooO00o;
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static int OooO0OO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            f11024OooO0O0.OooO0oo("Unable to parse integer value '" + str + "'", e);
            return -1;
        }
    }

    public static long OooO0Oo(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            f11024OooO0O0.OooO0oo("Unable to parse long value '" + str + "'", e);
            return -1L;
        }
    }

    public final InputStream OooO0o(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        Log log = f11024OooO0O0;
        if (log.OooO0OO()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Sanitizing XML document destined for handler ");
            sbOooO0o0.append(defaultHandler.getClass());
            log.OooO00o(sbOooO0o0.toString());
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            char[] cArr = new char[8192];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i == -1) {
                    bufferedReader.close();
                    return new ByteArrayInputStream(sb.toString().replaceAll("\r", "&#013;").getBytes(StringUtils.f11186OooO00o));
                }
                sb.append(cArr, 0, i);
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (f11024OooO0O0.OooO0Oo()) {
                    f11024OooO0O0.OooO0oo("Unable to close response InputStream after failure sanitizing XML document", e2);
                }
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Failed to sanitize XML document destined for handler ");
            sbOooO0o1.append(defaultHandler.getClass());
            throw new AmazonClientException(sbOooO0o1.toString(), th);
        }
    }

    public final void OooO0o0(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        try {
            Log log = f11024OooO0O0;
            if (log.OooO0OO()) {
                log.OooO00o("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            this.f11025OooO00o.setContentHandler(defaultHandler);
            this.f11025OooO00o.setErrorHandler(defaultHandler);
            this.f11025OooO00o.parse(new InputSource(bufferedReader));
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (f11024OooO0O0.OooO0Oo()) {
                    f11024OooO0O0.OooO0oo("Unable to close response InputStream up after XML parse failure", e2);
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to parse XML document with handler ");
            sbOooO0o0.append(defaultHandler.getClass());
            throw new AmazonClientException(sbOooO0o0.toString(), th);
        }
    }
}
