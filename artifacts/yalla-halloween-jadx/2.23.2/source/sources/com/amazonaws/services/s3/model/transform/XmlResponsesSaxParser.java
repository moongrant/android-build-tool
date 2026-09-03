package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
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
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
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
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
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
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public class XmlResponsesSaxParser {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f12550OooO0O0 = LogFactory.OooO00o(XmlResponsesSaxParser.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final XMLReader f12551OooO00o;

    public static class AccessControlListHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AccessControlList f12552OooO0o = new AccessControlList();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Grantee f12553OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Permission f12554OooO0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            boolean zOooOO0o = OooOO0o("AccessControlPolicy", "Owner");
            AccessControlList accessControlList = this.f12552OooO0o;
            if (zOooOO0o) {
                if (str.equals("ID")) {
                    accessControlList.f12452OooO0o.f12509OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        accessControlList.f12452OooO0o.f12508OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    Grantee grantee = this.f12553OooO0oO;
                    Permission permission = this.f12554OooO0oo;
                    ((LinkedList) accessControlList.OooO00o()).add(new Grant(grantee, permission));
                    this.f12553OooO0oO = null;
                    this.f12554OooO0oo = null;
                    return;
                }
                return;
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f12554OooO0oo = Permission.OooO0O0(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f12553OooO0oO.OooO0OO(OooOO0O());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f12553OooO0oO.OooO0OO(OooOO0O());
                    return;
                }
                if (str.equals("URI")) {
                    this.f12553OooO0oO = GroupGrantee.OooO0Oo(OooOO0O());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f12553OooO0oO;
                    OooOO0O();
                    canonicalGrantee.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            boolean z;
            String value;
            if (OooOO0o("AccessControlPolicy")) {
                if (str.equals("Owner")) {
                    this.f12552OooO0o.f12452OooO0o = new Owner();
                    return;
                }
                return;
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                Log log = XmlResponsesSaxParser.f12550OooO0O0;
                Charset charset = StringUtils.f12681OooO00o;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 8) {
                        z = true;
                        break;
                    } else {
                        if (!Character.isWhitespace("xsi:type".charAt(i2))) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z && attributes != null) {
                    while (true) {
                        if (i >= attributes.getLength()) {
                            value = null;
                            break;
                        } else {
                            if (attributes.getQName(i).trim().equalsIgnoreCase("xsi:type")) {
                                value = attributes.getValue(i);
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    value = null;
                    break;
                }
                if ("AmazonCustomerByEmail".equals(value)) {
                    this.f12553OooO0oO = new EmailAddressGrantee();
                } else if ("CanonicalUser".equals(value)) {
                    this.f12553OooO0oO = new CanonicalGrantee();
                } else {
                    "Group".equals(value);
                }
            }
        }
    }

    public static class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketAccelerateConfiguration f12555OooO0o = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("AccelerateConfiguration") && str.equals("Status")) {
                OooOO0O();
                this.f12555OooO0o.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CORSRule f12558OooO0oO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketCrossOriginConfiguration f12557OooO0o = new BucketCrossOriginConfiguration(new ArrayList());

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f12559OooO0oo = null;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f12556OooO = null;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public ArrayList f12560OooOO0 = null;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public LinkedList f12561OooOO0O = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    CORSRule cORSRule = this.f12558OooO0oO;
                    cORSRule.f12472OooO0Oo = this.f12561OooOO0O;
                    cORSRule.f12469OooO00o = this.f12559OooO0oo;
                    cORSRule.f12470OooO0O0 = this.f12556OooO;
                    cORSRule.f12471OooO0OO = this.f12560OooOO0;
                    this.f12561OooOO0O = null;
                    this.f12559OooO0oo = null;
                    this.f12556OooO = null;
                    this.f12560OooOO0 = null;
                    this.f12557OooO0o.f12459OooO0Oo.add(cORSRule);
                    this.f12558OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("CORSConfiguration", "CORSRule")) {
                if (str.equals("ID")) {
                    CORSRule cORSRule2 = this.f12558OooO0oO;
                    OooOO0O();
                    cORSRule2.getClass();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f12556OooO.add(OooOO0O());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f12559OooO0oo.add(CORSRule.AllowedMethods.OooO00o(OooOO0O()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    CORSRule cORSRule3 = this.f12558OooO0oO;
                    Integer.parseInt(OooOO0O());
                    cORSRule3.getClass();
                } else if (str.equals("ExposeHeader")) {
                    this.f12560OooOO0.add(OooOO0O());
                } else if (str.equals("AllowedHeader")) {
                    this.f12561OooOO0O.add(OooOO0O());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f12558OooO0oO = new CORSRule();
                    return;
                }
                return;
            }
            if (OooOO0o("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f12556OooO == null) {
                        this.f12556OooO = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f12559OooO0oo == null) {
                        this.f12559OooO0oo = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f12560OooOO0 == null) {
                        this.f12560OooOO0 = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f12561OooOO0O == null) {
                    this.f12561OooOO0O = new LinkedList();
                }
            }
        }
    }

    public static class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f12562OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketLifecycleConfiguration f12563OooO0o = new BucketLifecycleConfiguration(new ArrayList());

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public BucketLifecycleConfiguration.Rule f12564OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public BucketLifecycleConfiguration.Transition f12565OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public AbortIncompleteMultipartUpload f12566OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public LifecycleFilter f12567OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public ArrayList f12568OooOO0o;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f12563OooO0o.f12460OooO0Oo.add(this.f12564OooO0oO);
                    this.f12564OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    BucketLifecycleConfiguration.Rule rule = this.f12564OooO0oO;
                    OooOO0O();
                    rule.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f12564OooO0oO;
                    OooOO0O();
                    rule2.getClass();
                    return;
                }
                if (str.equals("Status")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f12564OooO0oO;
                    OooOO0O();
                    rule3.getClass();
                    return;
                }
                if (str.equals("Transition")) {
                    BucketLifecycleConfiguration.Rule rule4 = this.f12564OooO0oO;
                    BucketLifecycleConfiguration.Transition transition = this.f12565OooO0oo;
                    if (transition == null) {
                        rule4.getClass();
                        throw new IllegalArgumentException("Transition cannot be null.");
                    }
                    if (rule4.f12461OooO0Oo == null) {
                        rule4.f12461OooO0Oo = new ArrayList();
                    }
                    rule4.f12461OooO0Oo.add(transition);
                    this.f12565OooO0oo = null;
                    return;
                }
                if (!str.equals("NoncurrentVersionTransition")) {
                    if (str.equals("AbortIncompleteMultipartUpload")) {
                        this.f12564OooO0oO.getClass();
                        this.f12566OooOO0 = null;
                        return;
                    } else {
                        if (str.equals("Filter")) {
                            this.f12564OooO0oO.getClass();
                            this.f12567OooOO0O = null;
                            return;
                        }
                        return;
                    }
                }
                BucketLifecycleConfiguration.Rule rule5 = this.f12564OooO0oO;
                BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f12562OooO;
                if (noncurrentVersionTransition == null) {
                    rule5.getClass();
                    throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
                }
                if (rule5.f12462OooO0o0 == null) {
                    rule5.f12462OooO0o0 = new ArrayList();
                }
                rule5.f12462OooO0o0.add(noncurrentVersionTransition);
                this.f12562OooO = null;
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule6 = this.f12564OooO0oO;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f12431OooO00o;
                    DateUtils.OooO0Oo(strOooOO0O);
                    rule6.getClass();
                    return;
                }
                if (str.equals("Days")) {
                    BucketLifecycleConfiguration.Rule rule7 = this.f12564OooO0oO;
                    Integer.parseInt(OooOO0O());
                    rule7.getClass();
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O())) {
                        this.f12564OooO0oO.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Transition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.Transition transition2 = this.f12565OooO0oo;
                    OooOO0O();
                    transition2.getClass();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition3 = this.f12565OooO0oo;
                        String strOooOO0O2 = OooOO0O();
                        Log log2 = ServiceUtils.f12431OooO00o;
                        DateUtils.OooO0Oo(strOooOO0O2);
                        transition3.getClass();
                        return;
                    }
                    if (str.equals("Days")) {
                        BucketLifecycleConfiguration.Transition transition4 = this.f12565OooO0oo;
                        Integer.parseInt(OooOO0O());
                        transition4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    BucketLifecycleConfiguration.Rule rule8 = this.f12564OooO0oO;
                    Integer.parseInt(OooOO0O());
                    rule8.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition2 = this.f12562OooO;
                    OooOO0O();
                    noncurrentVersionTransition2.getClass();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition3 = this.f12562OooO;
                        Integer.parseInt(OooOO0O());
                        noncurrentVersionTransition3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f12566OooOO0.f12436OooO0Oo = Integer.parseInt(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    LifecycleFilter lifecycleFilter = this.f12567OooOO0O;
                    OooOO0O();
                    new LifecyclePrefixPredicate();
                    lifecycleFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    LifecycleFilter lifecycleFilter2 = this.f12567OooOO0O;
                    new LifecycleTagPredicate();
                    lifecycleFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        LifecycleFilter lifecycleFilter3 = this.f12567OooOO0O;
                        new LifecycleAndOperator(this.f12568OooOO0o);
                        lifecycleFilter3.getClass();
                        this.f12568OooOO0o = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f12568OooOO0o;
                    OooOO0O();
                    arrayList.add(new LifecyclePrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f12568OooOO0o.add(new LifecycleTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                } else if (str.equals("Value")) {
                    OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f12564OooO0oO = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (!OooOO0o("LifecycleConfiguration", "Rule")) {
                if (OooOO0o("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                    this.f12568OooOO0o = new ArrayList();
                    return;
                }
                return;
            }
            if (str.equals("Transition")) {
                this.f12565OooO0oo = new BucketLifecycleConfiguration.Transition();
                return;
            }
            if (str.equals("NoncurrentVersionTransition")) {
                this.f12562OooO = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
            } else if (str.equals("AbortIncompleteMultipartUpload")) {
                this.f12566OooOO0 = new AbortIncompleteMultipartUpload();
            } else if (str.equals("Filter")) {
                this.f12567OooOO0O = new LifecycleFilter();
            }
        }
    }

    public static class BucketLocationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooO0OO() && str.equals("LocationConstraint")) {
                OooOO0O().getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketLoggingConfiguration f12569OooO0o = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("BucketLoggingStatus", "LoggingEnabled")) {
                boolean zEquals = str.equals("TargetBucket");
                BucketLoggingConfiguration bucketLoggingConfiguration = this.f12569OooO0o;
                if (zEquals) {
                    bucketLoggingConfiguration.f12463OooO0Oo = OooOO0O();
                    return;
                }
                if (str.equals("TargetPrefix")) {
                    String strOooOO0O = OooOO0O();
                    bucketLoggingConfiguration.getClass();
                    if (strOooOO0O == null) {
                        strOooOO0O = "";
                    }
                    bucketLoggingConfiguration.f12464OooO0o0 = strOooOO0O;
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ReplicationDestinationConfig f12570OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketReplicationConfiguration f12571OooO0o = new BucketReplicationConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f12572OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ReplicationRule f12573OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ReplicationConfiguration")) {
                boolean zEquals = str.equals("Rule");
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f12571OooO0o;
                if (!zEquals) {
                    if (str.equals("Role")) {
                        OooOO0O();
                        bucketReplicationConfiguration.getClass();
                        return;
                    }
                    return;
                }
                String str2 = this.f12572OooO0oO;
                ReplicationRule replicationRule = this.f12573OooO0oo;
                bucketReplicationConfiguration.getClass();
                if (str2 == null || str2.trim().isEmpty()) {
                    throw new IllegalArgumentException("Rule id cannot be null or empty.");
                }
                if (replicationRule == null) {
                    throw new IllegalArgumentException("Replication rule cannot be null");
                }
                bucketReplicationConfiguration.f12466OooO0Oo.put(str2, replicationRule);
                this.f12573OooO0oo = null;
                this.f12572OooO0oO = null;
                this.f12570OooO = null;
                return;
            }
            if (!OooOO0o("ReplicationConfiguration", "Rule")) {
                if (OooOO0o("ReplicationConfiguration", "Rule", "Destination")) {
                    if (str.equals("Bucket")) {
                        ReplicationDestinationConfig replicationDestinationConfig = this.f12570OooO;
                        String strOooOO0O = OooOO0O();
                        replicationDestinationConfig.getClass();
                        if (strOooOO0O == null) {
                            throw new IllegalArgumentException("Bucket name cannot be null");
                        }
                        return;
                    }
                    if (str.equals("StorageClass")) {
                        ReplicationDestinationConfig replicationDestinationConfig2 = this.f12570OooO;
                        OooOO0O();
                        replicationDestinationConfig2.getClass();
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("ID")) {
                this.f12572OooO0oO = OooOO0O();
                return;
            }
            if (str.equals("Prefix")) {
                ReplicationRule replicationRule2 = this.f12573OooO0oo;
                String strOooOO0O2 = OooOO0O();
                replicationRule2.getClass();
                if (strOooOO0O2 == null) {
                    throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                }
                return;
            }
            if (str.equals("Status")) {
                ReplicationRule replicationRule3 = this.f12573OooO0oo;
                OooOO0O();
                replicationRule3.getClass();
            } else if (str.equals("Destination")) {
                ReplicationRule replicationRule4 = this.f12573OooO0oo;
                ReplicationDestinationConfig replicationDestinationConfig3 = this.f12570OooO;
                replicationRule4.getClass();
                if (replicationDestinationConfig3 == null) {
                    throw new IllegalArgumentException("Destination cannot be null in the replication rule");
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ReplicationConfiguration")) {
                if (str.equals("Rule")) {
                    this.f12573OooO0oo = new ReplicationRule();
                }
            } else if (OooOO0o("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f12570OooO = new ReplicationDestinationConfig();
            }
        }
    }

    public static class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f12574OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketTaggingConfiguration f12575OooO0o = new BucketTaggingConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap f12576OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f12577OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            String str2;
            if (OooOO0o("Tagging")) {
                if (str.equals("TagSet")) {
                    this.f12575OooO0o.f12467OooO0Oo.add(new TagSet(this.f12576OooO0oO));
                    this.f12576OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f12577OooO0oo;
                    if (str3 != null && (str2 = this.f12574OooO) != null) {
                        this.f12576OooO0oO.put(str3, str2);
                    }
                    this.f12577OooO0oo = null;
                    this.f12574OooO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f12577OooO0oo = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f12574OooO = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("Tagging") && str.equals("TagSet")) {
                this.f12576OooO0oO = new HashMap();
            }
        }
    }

    public static class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketVersioningConfiguration f12578OooO0o = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("VersioningConfiguration")) {
                boolean zEquals = str.equals("Status");
                BucketVersioningConfiguration bucketVersioningConfiguration = this.f12578OooO0o;
                if (zEquals) {
                    OooOO0O();
                    bucketVersioningConfiguration.getClass();
                } else if (str.equals("MfaDelete")) {
                    String strOooOO0O = OooOO0O();
                    if (strOooOO0O.equals("Disabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else if (strOooOO0O.equals("Enabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else {
                        bucketVersioningConfiguration.getClass();
                    }
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketWebsiteConfiguration f12580OooO0o = new BucketWebsiteConfiguration(0);

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public RoutingRuleCondition f12581OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public RedirectRule f12582OooO0oo = null;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RoutingRule f12579OooO = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            boolean zOooOO0o = OooOO0o("WebsiteConfiguration");
            BucketWebsiteConfiguration bucketWebsiteConfiguration = this.f12580OooO0o;
            if (zOooOO0o) {
                if (str.equals("RedirectAllRequestsTo")) {
                    bucketWebsiteConfiguration.getClass();
                    this.f12582OooO0oo = null;
                    return;
                }
                return;
            }
            if (OooOO0o("WebsiteConfiguration", "IndexDocument")) {
                if (str.equals("Suffix")) {
                    OooOO0O();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("WebsiteConfiguration", "ErrorDocument")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    bucketWebsiteConfiguration.f12468OooO0Oo.add(this.f12579OooO);
                    this.f12579OooO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f12579OooO.getClass();
                    this.f12581OooO0oO = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f12579OooO.getClass();
                        this.f12582OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    RoutingRuleCondition routingRuleCondition = this.f12581OooO0oO;
                    OooOO0O();
                    routingRuleCondition.getClass();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        RoutingRuleCondition routingRuleCondition2 = this.f12581OooO0oO;
                        OooOO0O();
                        routingRuleCondition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("WebsiteConfiguration", "RedirectAllRequestsTo") || OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    RedirectRule redirectRule = this.f12582OooO0oo;
                    OooOO0O();
                    redirectRule.getClass();
                    return;
                }
                if (str.equals("HostName")) {
                    RedirectRule redirectRule2 = this.f12582OooO0oo;
                    OooOO0O();
                    redirectRule2.getClass();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    RedirectRule redirectRule3 = this.f12582OooO0oo;
                    OooOO0O();
                    redirectRule3.getClass();
                } else if (str.equals("ReplaceKeyWith")) {
                    RedirectRule redirectRule4 = this.f12582OooO0oo;
                    OooOO0O();
                    redirectRule4.getClass();
                } else if (str.equals("HttpRedirectCode")) {
                    RedirectRule redirectRule5 = this.f12582OooO0oo;
                    OooOO0O();
                    redirectRule5.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f12582OooO0oo = new RedirectRule();
                }
            } else if (OooOO0o("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f12579OooO = new RoutingRule();
                }
            } else if (OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f12581OooO0oO = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f12582OooO0oo = new RedirectRule();
                }
            }
        }
    }

    public static class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f12583OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CompleteMultipartUploadResult f12584OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AmazonS3Exception f12585OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f12586OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public String f12587OooOO0;

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void OooO00o() {
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0Oo(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f12584OooO0o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0o0(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f12584OooO0o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void OooO0oO(boolean z) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            AmazonS3Exception amazonS3Exception;
            if (OooO0OO()) {
                if (!str.equals("Error") || (amazonS3Exception = this.f12585OooO0oO) == null) {
                    return;
                }
                amazonS3Exception.f12040OooO0o0 = this.f12587OooOO0;
                amazonS3Exception.f12038OooO0Oo = this.f12583OooO;
                amazonS3Exception.f12454OooO = this.f12586OooO0oo;
                return;
            }
            if (!OooOO0o("CompleteMultipartUploadResult")) {
                if (OooOO0o("Error")) {
                    if (str.equals("Code")) {
                        this.f12587OooOO0 = OooOO0O();
                        return;
                    }
                    if (str.equals("Message")) {
                        this.f12585OooO0oO = new AmazonS3Exception(OooOO0O());
                        return;
                    } else if (str.equals("RequestId")) {
                        this.f12583OooO = OooOO0O();
                        return;
                    } else {
                        if (str.equals("HostId")) {
                            this.f12586OooO0oo = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Location")) {
                CompleteMultipartUploadResult completeMultipartUploadResult = this.f12584OooO0o;
                OooOO0O();
                completeMultipartUploadResult.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f12584OooO0o;
                OooOO0O();
                completeMultipartUploadResult2.getClass();
            } else if (str.equals("Key")) {
                CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f12584OooO0o;
                OooOO0O();
                completeMultipartUploadResult3.getClass();
            } else if (str.equals("ETag")) {
                CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f12584OooO0o;
                ServiceUtils.OooO00o(OooOO0O());
                completeMultipartUploadResult4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooO0OO() && str.equals("CompleteMultipartUploadResult")) {
                this.f12584OooO0o = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        public final ServerSideEncryptionResult OooOOO0() {
            return this.f12584OooO0o;
        }
    }

    public static class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final CopyObjectResult f12588OooO0o = new CopyObjectResult();

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void OooO00o() {
            this.f12588OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0Oo(String str) {
            this.f12588OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0o0(Date date) {
            this.f12588OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void OooO0oO(boolean z) {
            this.f12588OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("CopyObjectResult") || OooOO0o("CopyPartResult")) {
                boolean zEquals = str.equals("LastModified");
                CopyObjectResult copyObjectResult = this.f12588OooO0o;
                if (zEquals) {
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f12431OooO00o;
                    DateUtils.OooO0Oo(strOooOO0O);
                    copyObjectResult.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    ServiceUtils.OooO00o(OooOO0O());
                    copyObjectResult.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("Error")) {
                if (str.equals("Code")) {
                    OooOO0O();
                    return;
                }
                if (str.equals("Message")) {
                    OooOO0O();
                } else if (str.equals("RequestId")) {
                    OooOO0O();
                } else if (str.equals("HostId")) {
                    OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (!OooO0OO() || str.equals("CopyObjectResult") || str.equals("CopyPartResult")) {
                return;
            }
            str.equals("Error");
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        public final ServerSideEncryptionResult OooOOO0() {
            return this.f12588OooO0o;
        }
    }

    public static class DeleteObjectsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final DeleteObjectsResponse f12589OooO0o = new DeleteObjectsResponse();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public DeleteObjectsResult.DeletedObject f12590OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public MultiObjectDeleteException.DeleteError f12591OooO0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("DeleteResult")) {
                boolean zEquals = str.equals("Deleted");
                DeleteObjectsResponse deleteObjectsResponse = this.f12589OooO0o;
                if (zEquals) {
                    deleteObjectsResponse.f12397OooO0Oo.add(this.f12590OooO0oO);
                    this.f12590OooO0oO = null;
                    return;
                } else {
                    if (str.equals("Error")) {
                        deleteObjectsResponse.f12398OooO0o0.add(this.f12591OooO0oo);
                        this.f12591OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("DeleteResult", "Deleted")) {
                if (str.equals("Key")) {
                    DeleteObjectsResult.DeletedObject deletedObject = this.f12590OooO0oO;
                    OooOO0O();
                    deletedObject.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult.DeletedObject deletedObject2 = this.f12590OooO0oO;
                    OooOO0O();
                    deletedObject2.getClass();
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult.DeletedObject deletedObject3 = this.f12590OooO0oO;
                    OooOO0O().equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    deletedObject3.getClass();
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult.DeletedObject deletedObject4 = this.f12590OooO0oO;
                        OooOO0O();
                        deletedObject4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f12591OooO0oo;
                    OooOO0O();
                    deleteError.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f12591OooO0oo;
                    OooOO0O();
                    deleteError2.getClass();
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f12591OooO0oo;
                    OooOO0O();
                    deleteError3.getClass();
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError4 = this.f12591OooO0oo;
                    OooOO0O();
                    deleteError4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f12590OooO0oO = new DeleteObjectsResult.DeletedObject();
                } else if (str.equals("Error")) {
                    this.f12591OooO0oo = new MultiObjectDeleteException.DeleteError();
                }
            }
        }
    }

    public static class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public StorageClassAnalysis f12592OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AnalyticsConfiguration f12593OooO0o = new AnalyticsConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AnalyticsFilter f12594OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f12595OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public StorageClassAnalysisDataExport f12596OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public AnalyticsExportDestination f12597OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public AnalyticsS3BucketDestination f12598OooOO0o;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("AnalyticsConfiguration")) {
                boolean zEquals = str.equals("Id");
                AnalyticsConfiguration analyticsConfiguration = this.f12593OooO0o;
                if (zEquals) {
                    OooOO0O();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    analyticsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        analyticsConfiguration.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f12594OooO0oO;
                    OooOO0O();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f12594OooO0oO;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f12594OooO0oO;
                        new AnalyticsAndOperator(this.f12595OooO0oo);
                        analyticsFilter3.getClass();
                        this.f12595OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f12595OooO0oo;
                    OooOO0O();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f12595OooO0oo.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f12592OooO.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f12596OooOO0;
                    OooOO0O();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f12596OooOO0.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f12597OooOO0O.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f12598OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f12598OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f12598OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f12598OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f12594OooO0oO = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f12592OooO = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f12595OooO0oo = new ArrayList();
                }
            } else if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f12596OooOO0 = new StorageClassAnalysisDataExport();
                }
            } else if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f12597OooOO0O = new AnalyticsExportDestination();
                }
            } else if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f12598OooOO0o = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public InventoryFilter f12599OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final InventoryConfiguration f12600OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList f12601OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public InventoryDestination f12602OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public InventoryS3BucketDestination f12603OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public InventorySchedule f12604OooOO0O;

        public GetBucketInventoryConfigurationHandler() {
            new GetBucketInventoryConfigurationResult();
            this.f12600OooO0o = new InventoryConfiguration();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("InventoryConfiguration")) {
                boolean zEquals = str.equals("Id");
                InventoryConfiguration inventoryConfiguration = this.f12600OooO0o;
                if (zEquals) {
                    OooOO0O();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    inventoryConfiguration.getClass();
                    this.f12602OooO0oo = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    inventoryConfiguration.getClass();
                    this.f12599OooO = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    OooOO0O();
                    inventoryConfiguration.getClass();
                    return;
                } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    inventoryConfiguration.getClass();
                    this.f12604OooOO0O = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        inventoryConfiguration.f12545OooO0Oo = this.f12601OooO0oO;
                        this.f12601OooO0oO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f12602OooO0oo.getClass();
                    this.f12603OooOO0 = null;
                    return;
                }
                return;
            }
            if (!OooOO0o("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (OooOO0o("InventoryConfiguration", "Filter")) {
                    if (str.equals("Prefix")) {
                        InventoryFilter inventoryFilter = this.f12599OooO;
                        OooOO0O();
                        new InventoryPrefixPredicate();
                        inventoryFilter.getClass();
                        return;
                    }
                    return;
                }
                if (!OooOO0o("InventoryConfiguration", AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    if (OooOO0o("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                        this.f12601OooO0oO.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f12604OooOO0O;
                    OooOO0O();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (str.equals("AccountId")) {
                InventoryS3BucketDestination inventoryS3BucketDestination = this.f12603OooOO0;
                OooOO0O();
                inventoryS3BucketDestination.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f12603OooOO0;
                OooOO0O();
                inventoryS3BucketDestination2.getClass();
            } else if (str.equals("Format")) {
                InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f12603OooOO0;
                OooOO0O();
                inventoryS3BucketDestination3.getClass();
            } else if (str.equals("Prefix")) {
                InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f12603OooOO0;
                OooOO0O();
                inventoryS3BucketDestination4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (!OooOO0o("InventoryConfiguration")) {
                if (OooOO0o("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f12603OooOO0 = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f12602OooO0oo = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f12599OooO = new InventoryFilter();
            } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                this.f12604OooOO0O = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f12601OooO0oO = new ArrayList();
            }
        }
    }

    public static class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final MetricsConfiguration f12605OooO0o = new MetricsConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MetricsFilter f12606OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f12607OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("MetricsConfiguration")) {
                boolean zEquals = str.equals("Id");
                MetricsConfiguration metricsConfiguration = this.f12605OooO0o;
                if (zEquals) {
                    OooOO0O();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        metricsConfiguration.getClass();
                        this.f12606OooO0oO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f12606OooO0oO;
                    OooOO0O();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f12606OooO0oO;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f12606OooO0oO;
                        new MetricsAndOperator(this.f12607OooO0oo);
                        metricsFilter3.getClass();
                        this.f12607OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f12607OooO0oo;
                    OooOO0O();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f12607OooO0oo.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                } else if (str.equals("Value")) {
                    OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f12606OooO0oO = new MetricsFilter();
                }
            } else if (OooOO0o("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f12607OooO0oo = new ArrayList();
            }
        }
    }

    public static class GetObjectTaggingHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ArrayList f12608OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f12609OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f12610OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("Tagging") && str.equals("TagSet")) {
                this.f12608OooO0o = null;
            }
            if (OooOO0o("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f12608OooO0o.add(new Tag(this.f12610OooO0oo, this.f12609OooO0oO));
                    this.f12610OooO0oo = null;
                    this.f12609OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f12610OooO0oo = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f12609OooO0oO = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("Tagging") && str.equals("TagSet")) {
                this.f12608OooO0o = new ArrayList();
            }
        }
    }

    public static class InitiateMultipartUploadHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final InitiateMultipartUploadResult f12611OooO0o = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("InitiateMultipartUploadResult")) {
                boolean zEquals = str.equals("Bucket");
                InitiateMultipartUploadResult initiateMultipartUploadResult = this.f12611OooO0o;
                if (zEquals) {
                    OooOO0O();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("Key")) {
                    OooOO0O();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("UploadId")) {
                    initiateMultipartUploadResult.f12495OooO0Oo = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class ListAllMyBucketsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ArrayList f12612OooO0o = new ArrayList();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f12613OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Bucket f12614OooO0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListAllMyBucketsResult", "Owner")) {
                if (str.equals("ID")) {
                    this.f12613OooO0oO.f12509OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f12613OooO0oO.f12508OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f12612OooO0o.add(this.f12614OooO0oo);
                    this.f12614OooO0oo = null;
                    return;
                }
                return;
            }
            if (OooOO0o("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f12614OooO0oo.f12456OooO0Oo = OooOO0O();
                } else if (str.equals("CreationDate")) {
                    this.f12614OooO0oo.f12457OooO0o = DateUtils.OooO0Oo(OooOO0O());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f12613OooO0oO = new Owner();
                }
            } else if (OooOO0o("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f12614OooO0oo = bucket;
                bucket.f12458OooO0o0 = this.f12613OooO0oO;
            }
        }
    }

    public static class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f12615OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ListBucketAnalyticsConfigurationsResult f12616OooO0o = new ListBucketAnalyticsConfigurationsResult();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AnalyticsConfiguration f12617OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public AnalyticsFilter f12618OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public StorageClassAnalysis f12619OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public StorageClassAnalysisDataExport f12620OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public AnalyticsExportDestination f12621OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public AnalyticsS3BucketDestination f12622OooOOO0;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult")) {
                boolean zEquals = str.equals("AnalyticsConfiguration");
                ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f12616OooO0o;
                if (zEquals) {
                    if (listBucketAnalyticsConfigurationsResult.f12496OooO0Oo == null) {
                        listBucketAnalyticsConfigurationsResult.f12496OooO0Oo = new ArrayList();
                    }
                    listBucketAnalyticsConfigurationsResult.f12496OooO0Oo.add(this.f12617OooO0oO);
                    this.f12617OooO0oO = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    OooOO0O();
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        OooOO0O();
                        listBucketAnalyticsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    AnalyticsConfiguration analyticsConfiguration = this.f12617OooO0oO;
                    OooOO0O();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    this.f12617OooO0oO.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f12617OooO0oO.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f12618OooO0oo;
                    OooOO0O();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f12618OooO0oo;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f12618OooO0oo;
                        new AnalyticsAndOperator(this.f12615OooO);
                        analyticsFilter3.getClass();
                        this.f12615OooO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f12615OooO;
                    OooOO0O();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f12615OooO.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f12619OooOO0.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f12620OooOO0O;
                    OooOO0O();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f12620OooOO0O.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f12621OooOO0o.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f12622OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f12622OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f12622OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f12622OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f12617OooO0oO = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f12618OooO0oo = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f12619OooOO0 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f12615OooO = new ArrayList();
                }
            } else if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f12620OooOO0O = new StorageClassAnalysisDataExport();
                }
            } else if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f12621OooOO0o = new AnalyticsExportDestination();
                }
            } else if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f12622OooOOO0 = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class ListBucketHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public S3ObjectSummary f12623OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f12624OooO0oO;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooO0OO()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            if (OooOO0o("ListBucketResult")) {
                if (str.equals("Name")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    OooOO0O();
                    Log log = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("Marker")) {
                    OooOO0O();
                    Log log2 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("NextMarker")) {
                    OooOO0O();
                    Log log3 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.OooO0O0(OooOO0O());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    OooOO0O();
                    Log log4 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    OooOO0O();
                    Log log5 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (!str.equals("IsTruncated")) {
                    if (str.equals("Contents")) {
                        throw null;
                    }
                    return;
                } else {
                    String strOooO00o = StringUtils.OooO00o(OooOO0O());
                    if (!strOooO00o.startsWith("false") && !strOooO00o.startsWith(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                        throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strOooO00o));
                    }
                    throw null;
                }
            }
            if (!OooOO0o("ListBucketResult", "Contents")) {
                if (!OooOO0o("ListBucketResult", "Contents", "Owner")) {
                    if (OooOO0o("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                        throw null;
                    }
                    return;
                } else if (str.equals("ID")) {
                    this.f12624OooO0oO.f12509OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f12624OooO0oO.f12508OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Key")) {
                String strOooOO0O = OooOO0O();
                S3ObjectSummary s3ObjectSummary = this.f12623OooO0o;
                Log log6 = XmlResponsesSaxParser.f12550OooO0O0;
                s3ObjectSummary.f12521OooO00o = strOooOO0O;
                return;
            }
            if (str.equals("LastModified")) {
                S3ObjectSummary s3ObjectSummary2 = this.f12623OooO0o;
                String strOooOO0O2 = OooOO0O();
                Log log7 = ServiceUtils.f12431OooO00o;
                s3ObjectSummary2.f12524OooO0Oo = DateUtils.OooO0Oo(strOooOO0O2);
                return;
            }
            if (str.equals("ETag")) {
                this.f12623OooO0o.f12522OooO0O0 = ServiceUtils.OooO00o(OooOO0O());
                return;
            }
            if (str.equals("Size")) {
                this.f12623OooO0o.f12523OooO0OO = XmlResponsesSaxParser.OooO0OO(OooOO0O());
            } else if (str.equals("StorageClass")) {
                this.f12623OooO0o.f12526OooO0o0 = OooOO0O();
            } else if (str.equals("Owner")) {
                this.f12623OooO0o.f12525OooO0o = this.f12624OooO0oO;
                this.f12624OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f12623OooO0o = new S3ObjectSummary();
                    throw null;
                }
            } else if (OooOO0o("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f12624OooO0oO = new Owner();
            }
        }
    }

    public static class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public InventoryDestination f12625OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ListBucketInventoryConfigurationsResult f12626OooO0o = new ListBucketInventoryConfigurationsResult();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public InventoryConfiguration f12627OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f12628OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public InventoryFilter f12629OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public InventoryS3BucketDestination f12630OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public InventorySchedule f12631OooOO0o;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListInventoryConfigurationsResult")) {
                boolean zEquals = str.equals("InventoryConfiguration");
                ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f12626OooO0o;
                if (zEquals) {
                    if (listBucketInventoryConfigurationsResult.f12497OooO0Oo == null) {
                        listBucketInventoryConfigurationsResult.f12497OooO0Oo = new ArrayList();
                    }
                    listBucketInventoryConfigurationsResult.f12497OooO0Oo.add(this.f12627OooO0oO);
                    this.f12627OooO0oO = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    OooOO0O();
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        OooOO0O();
                        listBucketInventoryConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Id")) {
                    InventoryConfiguration inventoryConfiguration = this.f12627OooO0oO;
                    OooOO0O();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f12627OooO0oO.getClass();
                    this.f12625OooO = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    InventoryConfiguration inventoryConfiguration2 = this.f12627OooO0oO;
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    inventoryConfiguration2.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f12627OooO0oO.getClass();
                    this.f12629OooOO0 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    InventoryConfiguration inventoryConfiguration3 = this.f12627OooO0oO;
                    OooOO0O();
                    inventoryConfiguration3.getClass();
                    return;
                } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    this.f12627OooO0oO.getClass();
                    this.f12631OooOO0o = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f12627OooO0oO.f12545OooO0Oo = this.f12628OooO0oo;
                        this.f12628OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f12625OooO.getClass();
                    this.f12630OooOO0O = null;
                    return;
                }
                return;
            }
            if (!OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                    if (str.equals("Prefix")) {
                        InventoryFilter inventoryFilter = this.f12629OooOO0;
                        OooOO0O();
                        new InventoryPrefixPredicate();
                        inventoryFilter.getClass();
                        return;
                    }
                    return;
                }
                if (!OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                        this.f12628OooO0oo.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f12631OooOO0o;
                    OooOO0O();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (str.equals("AccountId")) {
                InventoryS3BucketDestination inventoryS3BucketDestination = this.f12630OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f12630OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination2.getClass();
            } else if (str.equals("Format")) {
                InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f12630OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination3.getClass();
            } else if (str.equals("Prefix")) {
                InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f12630OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f12627OooO0oO = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (!OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f12630OooOO0O = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f12625OooO = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f12629OooOO0 = new InventoryFilter();
            } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                this.f12631OooOO0o = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f12628OooO0oo = new ArrayList();
            }
        }
    }

    public static class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f12632OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ListBucketMetricsConfigurationsResult f12633OooO0o = new ListBucketMetricsConfigurationsResult();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MetricsConfiguration f12634OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public MetricsFilter f12635OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListMetricsConfigurationsResult")) {
                boolean zEquals = str.equals("MetricsConfiguration");
                ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f12633OooO0o;
                if (zEquals) {
                    if (listBucketMetricsConfigurationsResult.f12498OooO0Oo == null) {
                        listBucketMetricsConfigurationsResult.f12498OooO0Oo = new ArrayList();
                    }
                    listBucketMetricsConfigurationsResult.f12498OooO0Oo.add(this.f12634OooO0oO);
                    this.f12634OooO0oO = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    OooOO0O();
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        OooOO0O();
                        listBucketMetricsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Id")) {
                    MetricsConfiguration metricsConfiguration = this.f12634OooO0oO;
                    OooOO0O();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f12634OooO0oO.getClass();
                        this.f12635OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f12635OooO0oo;
                    OooOO0O();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f12635OooO0oo;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f12635OooO0oo;
                        new MetricsAndOperator(this.f12632OooO);
                        metricsFilter3.getClass();
                        this.f12632OooO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                    return;
                } else {
                    if (str.equals("Value")) {
                        OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f12632OooO;
                    OooOO0O();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f12632OooO.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    OooOO0O();
                } else if (str.equals("Value")) {
                    OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    this.f12634OooO0oO = new MetricsConfiguration();
                }
            } else if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f12635OooO0oo = new MetricsFilter();
                }
            } else if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f12632OooO = new ArrayList();
            }
        }
    }

    public static class ListMultipartUploadsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final MultipartUploadListing f12636OooO0o = new MultipartUploadListing();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MultipartUpload f12637OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Owner f12638OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            boolean zOooOO0o = OooOO0o("ListMultipartUploadsResult");
            MultipartUploadListing multipartUploadListing = this.f12636OooO0o;
            if (!zOooOO0o) {
                if (OooOO0o("ListMultipartUploadsResult", "CommonPrefixes")) {
                    if (str.equals("Prefix")) {
                        multipartUploadListing.f12500OooO0O0.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (!OooOO0o("ListMultipartUploadsResult", "Upload")) {
                    if (OooOO0o("ListMultipartUploadsResult", "Upload", "Owner") || OooOO0o("ListMultipartUploadsResult", "Upload", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f12638OooO0oo.f12509OooO0o0 = XmlResponsesSaxParser.OooO00o(OooOO0O());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f12638OooO0oo.f12508OooO0Oo = XmlResponsesSaxParser.OooO00o(OooOO0O());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f12637OooO0oO;
                    OooOO0O();
                    multipartUpload.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f12637OooO0oO;
                    OooOO0O();
                    multipartUpload2.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    this.f12637OooO0oO.getClass();
                    this.f12638OooO0oo = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    this.f12637OooO0oO.getClass();
                    this.f12638OooO0oo = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f12637OooO0oO;
                    OooOO0O();
                    multipartUpload3.getClass();
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f12637OooO0oO;
                        String strOooOO0O = OooOO0O();
                        Log log = ServiceUtils.f12431OooO00o;
                        DateUtils.OooO0Oo(strOooOO0O);
                        multipartUpload4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Bucket")) {
                OooOO0O();
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("KeyMarker")) {
                OooOO0O();
                Log log2 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("Delimiter")) {
                OooOO0O();
                Log log3 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("Prefix")) {
                OooOO0O();
                Log log4 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("UploadIdMarker")) {
                OooOO0O();
                Log log5 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("NextKeyMarker")) {
                OooOO0O();
                Log log6 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("NextUploadIdMarker")) {
                OooOO0O();
                Log log7 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("MaxUploads")) {
                Integer.parseInt(OooOO0O());
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("EncodingType")) {
                OooOO0O();
                Log log8 = XmlResponsesSaxParser.f12550OooO0O0;
                multipartUploadListing.getClass();
            } else if (str.equals("IsTruncated")) {
                Boolean.parseBoolean(OooOO0O());
                multipartUploadListing.getClass();
            } else if (str.equals("Upload")) {
                if (multipartUploadListing.f12499OooO00o == null) {
                    multipartUploadListing.f12499OooO00o = new ArrayList();
                }
                multipartUploadListing.f12499OooO00o.add(this.f12637OooO0oO);
                this.f12637OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f12637OooO0oO = new MultipartUpload();
                }
            } else if (OooOO0o("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f12638OooO0oo = new Owner();
                }
            }
        }
    }

    public static class ListObjectsV2Handler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public S3ObjectSummary f12639OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f12640OooO0oO;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooO0OO()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            if (OooOO0o("ListBucketResult")) {
                if (str.equals("Name")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    OooOO0O();
                    Log log = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.OooO0O0(OooOO0O());
                    throw null;
                }
                if (str.equals("NextContinuationToken")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("ContinuationToken")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("StartAfter")) {
                    OooOO0O();
                    Log log2 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("KeyCount")) {
                    XmlResponsesSaxParser.OooO0O0(OooOO0O());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    OooOO0O();
                    Log log3 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    OooOO0O();
                    Log log4 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (!str.equals("IsTruncated")) {
                    if (str.equals("Contents")) {
                        throw null;
                    }
                    return;
                } else {
                    String strOooO00o = StringUtils.OooO00o(OooOO0O());
                    if (!strOooO00o.startsWith("false") && !strOooO00o.startsWith(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                        throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strOooO00o));
                    }
                    throw null;
                }
            }
            if (!OooOO0o("ListBucketResult", "Contents")) {
                if (!OooOO0o("ListBucketResult", "Contents", "Owner")) {
                    if (OooOO0o("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                        throw null;
                    }
                    return;
                } else if (str.equals("ID")) {
                    this.f12640OooO0oO.f12509OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f12640OooO0oO.f12508OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Key")) {
                String strOooOO0O = OooOO0O();
                S3ObjectSummary s3ObjectSummary = this.f12639OooO0o;
                Log log5 = XmlResponsesSaxParser.f12550OooO0O0;
                s3ObjectSummary.f12521OooO00o = strOooOO0O;
                return;
            }
            if (str.equals("LastModified")) {
                S3ObjectSummary s3ObjectSummary2 = this.f12639OooO0o;
                String strOooOO0O2 = OooOO0O();
                Log log6 = ServiceUtils.f12431OooO00o;
                s3ObjectSummary2.f12524OooO0Oo = DateUtils.OooO0Oo(strOooOO0O2);
                return;
            }
            if (str.equals("ETag")) {
                this.f12639OooO0o.f12522OooO0O0 = ServiceUtils.OooO00o(OooOO0O());
                return;
            }
            if (str.equals("Size")) {
                this.f12639OooO0o.f12523OooO0OO = XmlResponsesSaxParser.OooO0OO(OooOO0O());
            } else if (str.equals("StorageClass")) {
                this.f12639OooO0o.f12526OooO0o0 = OooOO0O();
            } else if (str.equals("Owner")) {
                this.f12639OooO0o.f12525OooO0o = this.f12640OooO0oO;
                this.f12640OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f12639OooO0o = new S3ObjectSummary();
                    throw null;
                }
            } else if (OooOO0o("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f12640OooO0oO = new Owner();
            }
        }
    }

    public static class ListPartsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final PartListing f12641OooO0o = new PartListing();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public PartSummary f12642OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Owner f12643OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (!OooOO0o("ListPartsResult")) {
                if (!OooOO0o("ListPartsResult", "Part")) {
                    if (OooOO0o("ListPartsResult", "Owner") || OooOO0o("ListPartsResult", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f12643OooO0oo.f12509OooO0o0 = XmlResponsesSaxParser.OooO00o(OooOO0O());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f12643OooO0oo.f12508OooO0Oo = XmlResponsesSaxParser.OooO00o(OooOO0O());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f12642OooO0oO;
                    Integer.parseInt(OooOO0O());
                    partSummary.getClass();
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f12642OooO0oO;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f12431OooO00o;
                    DateUtils.OooO0Oo(strOooOO0O);
                    partSummary2.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f12642OooO0oO;
                    ServiceUtils.OooO00o(OooOO0O());
                    partSummary3.getClass();
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f12642OooO0oO;
                        Long.parseLong(OooOO0O());
                        partSummary4.getClass();
                        return;
                    }
                    return;
                }
            }
            boolean zEquals = str.equals("Bucket");
            PartListing partListing = this.f12641OooO0o;
            if (zEquals) {
                OooOO0O();
                partListing.getClass();
                return;
            }
            if (str.equals("Key")) {
                OooOO0O();
                partListing.getClass();
                return;
            }
            if (str.equals("UploadId")) {
                OooOO0O();
                partListing.getClass();
                return;
            }
            if (str.equals("Owner")) {
                partListing.getClass();
                this.f12643OooO0oo = null;
                return;
            }
            if (str.equals("Initiator")) {
                partListing.getClass();
                this.f12643OooO0oo = null;
                return;
            }
            if (str.equals("StorageClass")) {
                OooOO0O();
                partListing.getClass();
                return;
            }
            if (str.equals("PartNumberMarker")) {
                OooOO0O();
                OooOOO0().intValue();
                partListing.getClass();
                return;
            }
            if (str.equals("NextPartNumberMarker")) {
                OooOO0O();
                OooOOO0().intValue();
                partListing.getClass();
                return;
            }
            if (str.equals("MaxParts")) {
                OooOO0O();
                OooOOO0().intValue();
                partListing.getClass();
                return;
            }
            if (str.equals("EncodingType")) {
                OooOO0O();
                Log log2 = XmlResponsesSaxParser.f12550OooO0O0;
                partListing.getClass();
            } else if (str.equals("IsTruncated")) {
                Boolean.parseBoolean(OooOO0O());
                partListing.getClass();
            } else if (str.equals("Part")) {
                if (partListing.f12512OooO0Oo == null) {
                    partListing.f12512OooO0Oo = new ArrayList();
                }
                partListing.f12512OooO0Oo.add(this.f12642OooO0oO);
                this.f12642OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f12642OooO0oO = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f12643OooO0oo = new Owner();
                }
            }
        }

        public final Integer OooOOO0() {
            String strOooO00o = XmlResponsesSaxParser.OooO00o(OooOO0O());
            if (strOooO00o == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(strOooO00o));
        }
    }

    public static class ListVersionsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public S3VersionSummary f12644OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f12645OooO0oO;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListVersionsResult")) {
                if (str.equals("Name")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    OooOO0O();
                    Log log = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("KeyMarker")) {
                    OooOO0O();
                    Log log2 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("VersionIdMarker")) {
                    OooOO0O();
                    Log log3 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    Integer.parseInt(OooOO0O());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    OooOO0O();
                    Log log4 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    OooOO0O();
                    Log log5 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("NextKeyMarker")) {
                    OooOO0O();
                    Log log6 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                if (str.equals("NextVersionIdMarker")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    throw null;
                }
                if (str.equals("Version") || str.equals("DeleteMarker")) {
                    throw null;
                }
                return;
            }
            if (OooOO0o("ListVersionsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    OooOO0O();
                    Log log7 = XmlResponsesSaxParser.f12550OooO0O0;
                    throw null;
                }
                return;
            }
            if (!OooOO0o("ListVersionsResult", "Version") && !OooOO0o("ListVersionsResult", "DeleteMarker")) {
                if (OooOO0o("ListVersionsResult", "Version", "Owner") || OooOO0o("ListVersionsResult", "DeleteMarker", "Owner")) {
                    if (str.equals("ID")) {
                        this.f12645OooO0oO.f12509OooO0o0 = OooOO0O();
                        return;
                    } else {
                        if (str.equals("DisplayName")) {
                            this.f12645OooO0oO.f12508OooO0Oo = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Key")) {
                OooOO0O();
                S3VersionSummary s3VersionSummary = this.f12644OooO0o;
                Log log8 = XmlResponsesSaxParser.f12550OooO0O0;
                s3VersionSummary.getClass();
                return;
            }
            if (str.equals("VersionId")) {
                S3VersionSummary s3VersionSummary2 = this.f12644OooO0o;
                OooOO0O();
                s3VersionSummary2.getClass();
                return;
            }
            if (str.equals("IsLatest")) {
                S3VersionSummary s3VersionSummary3 = this.f12644OooO0o;
                ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                s3VersionSummary3.getClass();
                return;
            }
            if (str.equals("LastModified")) {
                S3VersionSummary s3VersionSummary4 = this.f12644OooO0o;
                String strOooOO0O = OooOO0O();
                Log log9 = ServiceUtils.f12431OooO00o;
                DateUtils.OooO0Oo(strOooOO0O);
                s3VersionSummary4.getClass();
                return;
            }
            if (str.equals("ETag")) {
                S3VersionSummary s3VersionSummary5 = this.f12644OooO0o;
                ServiceUtils.OooO00o(OooOO0O());
                s3VersionSummary5.getClass();
            } else if (str.equals("Size")) {
                S3VersionSummary s3VersionSummary6 = this.f12644OooO0o;
                Long.parseLong(OooOO0O());
                s3VersionSummary6.getClass();
            } else if (str.equals("Owner")) {
                this.f12644OooO0o.getClass();
                this.f12645OooO0oO = null;
            } else if (str.equals("StorageClass")) {
                S3VersionSummary s3VersionSummary7 = this.f12644OooO0o;
                OooOO0O();
                s3VersionSummary7.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (!OooOO0o("ListVersionsResult")) {
                if ((OooOO0o("ListVersionsResult", "Version") || OooOO0o("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                    this.f12645OooO0oO = new Owner();
                    return;
                }
                return;
            }
            if (str.equals("Version")) {
                this.f12644OooO0o = new S3VersionSummary();
                throw null;
            }
            if (str.equals("DeleteMarker")) {
                this.f12644OooO0o = new S3VersionSummary();
                throw null;
            }
        }
    }

    public static class RequestPaymentConfigurationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("RequestPaymentConfiguration") && str.equals("Payer")) {
                OooOO0O();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public XmlResponsesSaxParser() throws AmazonClientException {
        this.f12551OooO00o = null;
        try {
            this.f12551OooO00o = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f12551OooO00o = XMLReaderFactory.createXMLReader();
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

    public static void OooO0O0(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            f12550OooO0O0.OooO0Oo(o000oOoO.OooO0O0("Unable to parse integer value '", str, "'"), e);
        }
    }

    public static long OooO0OO(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            f12550OooO0O0.OooO0Oo(o000oOoO.OooO0O0("Unable to parse long value '", str, "'"), e);
            return -1L;
        }
    }

    public final void OooO0Oo(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        XMLReader xMLReader = this.f12551OooO00o;
        Log log = f12550OooO0O0;
        try {
            if (log.OooO0O0()) {
                log.OooO0oO("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            xMLReader.setContentHandler(defaultHandler);
            xMLReader.setErrorHandler(defaultHandler);
            xMLReader.parse(new InputSource(bufferedReader));
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.OooO0o()) {
                    log.OooO0Oo("Unable to close response InputStream up after XML parse failure", e2);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler " + defaultHandler.getClass(), th);
        }
    }
}
