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
    public static final Log f9459OooO0O0 = LogFactory.OooO00o(XmlResponsesSaxParser.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final XMLReader f9460OooO00o;

    public static class AccessControlListHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AccessControlList f9461OooO0o = new AccessControlList();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Grantee f9462OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Permission f9463OooO0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            boolean zOooOO0o = OooOO0o("AccessControlPolicy", "Owner");
            AccessControlList accessControlList = this.f9461OooO0o;
            if (zOooOO0o) {
                if (str.equals("ID")) {
                    accessControlList.f9362OooO0o.f9419OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        accessControlList.f9362OooO0o.f9418OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    Grantee grantee = this.f9462OooO0oO;
                    Permission permission = this.f9463OooO0oo;
                    ((LinkedList) accessControlList.OooO00o()).add(new Grant(grantee, permission));
                    this.f9462OooO0oO = null;
                    this.f9463OooO0oo = null;
                    return;
                }
                return;
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f9463OooO0oo = Permission.OooO0O0(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f9462OooO0oO.OooO0OO(OooOO0O());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f9462OooO0oO.OooO0OO(OooOO0O());
                    return;
                }
                if (str.equals("URI")) {
                    this.f9462OooO0oO = GroupGrantee.OooO0Oo(OooOO0O());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f9462OooO0oO;
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
                    this.f9461OooO0o.f9362OooO0o = new Owner();
                    return;
                }
                return;
            }
            if (OooOO0o("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                Log log = XmlResponsesSaxParser.f9459OooO0O0;
                Charset charset = StringUtils.f9590OooO00o;
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
                    this.f9462OooO0oO = new EmailAddressGrantee();
                } else if ("CanonicalUser".equals(value)) {
                    this.f9462OooO0oO = new CanonicalGrantee();
                } else {
                    "Group".equals(value);
                }
            }
        }
    }

    public static class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketAccelerateConfiguration f9464OooO0o = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("AccelerateConfiguration") && str.equals("Status")) {
                OooOO0O();
                this.f9464OooO0o.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CORSRule f9467OooO0oO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketCrossOriginConfiguration f9466OooO0o = new BucketCrossOriginConfiguration(new ArrayList());

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f9468OooO0oo = null;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f9465OooO = null;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public ArrayList f9469OooOO0 = null;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public LinkedList f9470OooOO0O = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    CORSRule cORSRule = this.f9467OooO0oO;
                    cORSRule.f9382OooO0Oo = this.f9470OooOO0O;
                    cORSRule.f9379OooO00o = this.f9468OooO0oo;
                    cORSRule.f9380OooO0O0 = this.f9465OooO;
                    cORSRule.f9381OooO0OO = this.f9469OooOO0;
                    this.f9470OooOO0O = null;
                    this.f9468OooO0oo = null;
                    this.f9465OooO = null;
                    this.f9469OooOO0 = null;
                    this.f9466OooO0o.f9369OooO0Oo.add(cORSRule);
                    this.f9467OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("CORSConfiguration", "CORSRule")) {
                if (str.equals("ID")) {
                    CORSRule cORSRule2 = this.f9467OooO0oO;
                    OooOO0O();
                    cORSRule2.getClass();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f9465OooO.add(OooOO0O());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f9468OooO0oo.add(CORSRule.AllowedMethods.OooO00o(OooOO0O()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    CORSRule cORSRule3 = this.f9467OooO0oO;
                    Integer.parseInt(OooOO0O());
                    cORSRule3.getClass();
                } else if (str.equals("ExposeHeader")) {
                    this.f9469OooOO0.add(OooOO0O());
                } else if (str.equals("AllowedHeader")) {
                    this.f9470OooOO0O.add(OooOO0O());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f9467OooO0oO = new CORSRule();
                    return;
                }
                return;
            }
            if (OooOO0o("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f9465OooO == null) {
                        this.f9465OooO = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f9468OooO0oo == null) {
                        this.f9468OooO0oo = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f9469OooOO0 == null) {
                        this.f9469OooOO0 = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f9470OooOO0O == null) {
                    this.f9470OooOO0O = new LinkedList();
                }
            }
        }
    }

    public static class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f9471OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketLifecycleConfiguration f9472OooO0o = new BucketLifecycleConfiguration(new ArrayList());

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public BucketLifecycleConfiguration.Rule f9473OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public BucketLifecycleConfiguration.Transition f9474OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public AbortIncompleteMultipartUpload f9475OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public LifecycleFilter f9476OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public ArrayList f9477OooOO0o;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f9472OooO0o.f9370OooO0Oo.add(this.f9473OooO0oO);
                    this.f9473OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    BucketLifecycleConfiguration.Rule rule = this.f9473OooO0oO;
                    OooOO0O();
                    rule.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f9473OooO0oO;
                    OooOO0O();
                    rule2.getClass();
                    return;
                }
                if (str.equals("Status")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f9473OooO0oO;
                    OooOO0O();
                    rule3.getClass();
                    return;
                }
                if (str.equals("Transition")) {
                    BucketLifecycleConfiguration.Rule rule4 = this.f9473OooO0oO;
                    BucketLifecycleConfiguration.Transition transition = this.f9474OooO0oo;
                    if (transition == null) {
                        rule4.getClass();
                        throw new IllegalArgumentException("Transition cannot be null.");
                    }
                    if (rule4.f9371OooO0Oo == null) {
                        rule4.f9371OooO0Oo = new ArrayList();
                    }
                    rule4.f9371OooO0Oo.add(transition);
                    this.f9474OooO0oo = null;
                    return;
                }
                if (!str.equals("NoncurrentVersionTransition")) {
                    if (str.equals("AbortIncompleteMultipartUpload")) {
                        this.f9473OooO0oO.getClass();
                        this.f9475OooOO0 = null;
                        return;
                    } else {
                        if (str.equals("Filter")) {
                            this.f9473OooO0oO.getClass();
                            this.f9476OooOO0O = null;
                            return;
                        }
                        return;
                    }
                }
                BucketLifecycleConfiguration.Rule rule5 = this.f9473OooO0oO;
                BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f9471OooO;
                if (noncurrentVersionTransition == null) {
                    rule5.getClass();
                    throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
                }
                if (rule5.f9372OooO0o0 == null) {
                    rule5.f9372OooO0o0 = new ArrayList();
                }
                rule5.f9372OooO0o0.add(noncurrentVersionTransition);
                this.f9471OooO = null;
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule6 = this.f9473OooO0oO;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f9341OooO00o;
                    DateUtils.OooO0Oo(strOooOO0O);
                    rule6.getClass();
                    return;
                }
                if (str.equals("Days")) {
                    BucketLifecycleConfiguration.Rule rule7 = this.f9473OooO0oO;
                    Integer.parseInt(OooOO0O());
                    rule7.getClass();
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O())) {
                        this.f9473OooO0oO.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Transition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.Transition transition2 = this.f9474OooO0oo;
                    OooOO0O();
                    transition2.getClass();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition3 = this.f9474OooO0oo;
                        String strOooOO0O2 = OooOO0O();
                        Log log2 = ServiceUtils.f9341OooO00o;
                        DateUtils.OooO0Oo(strOooOO0O2);
                        transition3.getClass();
                        return;
                    }
                    if (str.equals("Days")) {
                        BucketLifecycleConfiguration.Transition transition4 = this.f9474OooO0oo;
                        Integer.parseInt(OooOO0O());
                        transition4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    BucketLifecycleConfiguration.Rule rule8 = this.f9473OooO0oO;
                    Integer.parseInt(OooOO0O());
                    rule8.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition2 = this.f9471OooO;
                    OooOO0O();
                    noncurrentVersionTransition2.getClass();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition3 = this.f9471OooO;
                        Integer.parseInt(OooOO0O());
                        noncurrentVersionTransition3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f9475OooOO0.f9346OooO0Oo = Integer.parseInt(OooOO0O());
                    return;
                }
                return;
            }
            if (OooOO0o("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    LifecycleFilter lifecycleFilter = this.f9476OooOO0O;
                    OooOO0O();
                    new LifecyclePrefixPredicate();
                    lifecycleFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    LifecycleFilter lifecycleFilter2 = this.f9476OooOO0O;
                    new LifecycleTagPredicate();
                    lifecycleFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        LifecycleFilter lifecycleFilter3 = this.f9476OooOO0O;
                        new LifecycleAndOperator(this.f9477OooOO0o);
                        lifecycleFilter3.getClass();
                        this.f9477OooOO0o = null;
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
                    ArrayList arrayList = this.f9477OooOO0o;
                    OooOO0O();
                    arrayList.add(new LifecyclePrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f9477OooOO0o.add(new LifecycleTagPredicate());
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
                    this.f9473OooO0oO = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (!OooOO0o("LifecycleConfiguration", "Rule")) {
                if (OooOO0o("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                    this.f9477OooOO0o = new ArrayList();
                    return;
                }
                return;
            }
            if (str.equals("Transition")) {
                this.f9474OooO0oo = new BucketLifecycleConfiguration.Transition();
                return;
            }
            if (str.equals("NoncurrentVersionTransition")) {
                this.f9471OooO = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
            } else if (str.equals("AbortIncompleteMultipartUpload")) {
                this.f9475OooOO0 = new AbortIncompleteMultipartUpload();
            } else if (str.equals("Filter")) {
                this.f9476OooOO0O = new LifecycleFilter();
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
        public final BucketLoggingConfiguration f9478OooO0o = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("BucketLoggingStatus", "LoggingEnabled")) {
                boolean zEquals = str.equals("TargetBucket");
                BucketLoggingConfiguration bucketLoggingConfiguration = this.f9478OooO0o;
                if (zEquals) {
                    bucketLoggingConfiguration.f9373OooO0Oo = OooOO0O();
                    return;
                }
                if (str.equals("TargetPrefix")) {
                    String strOooOO0O = OooOO0O();
                    bucketLoggingConfiguration.getClass();
                    if (strOooOO0O == null) {
                        strOooOO0O = "";
                    }
                    bucketLoggingConfiguration.f9374OooO0o0 = strOooOO0O;
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ReplicationDestinationConfig f9479OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketReplicationConfiguration f9480OooO0o = new BucketReplicationConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f9481OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ReplicationRule f9482OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ReplicationConfiguration")) {
                boolean zEquals = str.equals("Rule");
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f9480OooO0o;
                if (!zEquals) {
                    if (str.equals("Role")) {
                        OooOO0O();
                        bucketReplicationConfiguration.getClass();
                        return;
                    }
                    return;
                }
                String str2 = this.f9481OooO0oO;
                ReplicationRule replicationRule = this.f9482OooO0oo;
                bucketReplicationConfiguration.getClass();
                if (str2 == null || str2.trim().isEmpty()) {
                    throw new IllegalArgumentException("Rule id cannot be null or empty.");
                }
                if (replicationRule == null) {
                    throw new IllegalArgumentException("Replication rule cannot be null");
                }
                bucketReplicationConfiguration.f9376OooO0Oo.put(str2, replicationRule);
                this.f9482OooO0oo = null;
                this.f9481OooO0oO = null;
                this.f9479OooO = null;
                return;
            }
            if (!OooOO0o("ReplicationConfiguration", "Rule")) {
                if (OooOO0o("ReplicationConfiguration", "Rule", "Destination")) {
                    if (str.equals("Bucket")) {
                        ReplicationDestinationConfig replicationDestinationConfig = this.f9479OooO;
                        String strOooOO0O = OooOO0O();
                        replicationDestinationConfig.getClass();
                        if (strOooOO0O == null) {
                            throw new IllegalArgumentException("Bucket name cannot be null");
                        }
                        return;
                    }
                    if (str.equals("StorageClass")) {
                        ReplicationDestinationConfig replicationDestinationConfig2 = this.f9479OooO;
                        OooOO0O();
                        replicationDestinationConfig2.getClass();
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("ID")) {
                this.f9481OooO0oO = OooOO0O();
                return;
            }
            if (str.equals("Prefix")) {
                ReplicationRule replicationRule2 = this.f9482OooO0oo;
                String strOooOO0O2 = OooOO0O();
                replicationRule2.getClass();
                if (strOooOO0O2 == null) {
                    throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                }
                return;
            }
            if (str.equals("Status")) {
                ReplicationRule replicationRule3 = this.f9482OooO0oo;
                OooOO0O();
                replicationRule3.getClass();
            } else if (str.equals("Destination")) {
                ReplicationRule replicationRule4 = this.f9482OooO0oo;
                ReplicationDestinationConfig replicationDestinationConfig3 = this.f9479OooO;
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
                    this.f9482OooO0oo = new ReplicationRule();
                }
            } else if (OooOO0o("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f9479OooO = new ReplicationDestinationConfig();
            }
        }
    }

    public static class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f9483OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketTaggingConfiguration f9484OooO0o = new BucketTaggingConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap f9485OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f9486OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            String str2;
            if (OooOO0o("Tagging")) {
                if (str.equals("TagSet")) {
                    this.f9484OooO0o.f9377OooO0Oo.add(new TagSet(this.f9485OooO0oO));
                    this.f9485OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f9486OooO0oo;
                    if (str3 != null && (str2 = this.f9483OooO) != null) {
                        this.f9485OooO0oO.put(str3, str2);
                    }
                    this.f9486OooO0oo = null;
                    this.f9483OooO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f9486OooO0oo = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f9483OooO = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("Tagging") && str.equals("TagSet")) {
                this.f9485OooO0oO = new HashMap();
            }
        }
    }

    public static class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final BucketVersioningConfiguration f9487OooO0o = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("VersioningConfiguration")) {
                boolean zEquals = str.equals("Status");
                BucketVersioningConfiguration bucketVersioningConfiguration = this.f9487OooO0o;
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
        public final BucketWebsiteConfiguration f9489OooO0o = new BucketWebsiteConfiguration(0);

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public RoutingRuleCondition f9490OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public RedirectRule f9491OooO0oo = null;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RoutingRule f9488OooO = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            boolean zOooOO0o = OooOO0o("WebsiteConfiguration");
            BucketWebsiteConfiguration bucketWebsiteConfiguration = this.f9489OooO0o;
            if (zOooOO0o) {
                if (str.equals("RedirectAllRequestsTo")) {
                    bucketWebsiteConfiguration.getClass();
                    this.f9491OooO0oo = null;
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
                    bucketWebsiteConfiguration.f9378OooO0Oo.add(this.f9488OooO);
                    this.f9488OooO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f9488OooO.getClass();
                    this.f9490OooO0oO = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f9488OooO.getClass();
                        this.f9491OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    RoutingRuleCondition routingRuleCondition = this.f9490OooO0oO;
                    OooOO0O();
                    routingRuleCondition.getClass();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        RoutingRuleCondition routingRuleCondition2 = this.f9490OooO0oO;
                        OooOO0O();
                        routingRuleCondition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("WebsiteConfiguration", "RedirectAllRequestsTo") || OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    RedirectRule redirectRule = this.f9491OooO0oo;
                    OooOO0O();
                    redirectRule.getClass();
                    return;
                }
                if (str.equals("HostName")) {
                    RedirectRule redirectRule2 = this.f9491OooO0oo;
                    OooOO0O();
                    redirectRule2.getClass();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    RedirectRule redirectRule3 = this.f9491OooO0oo;
                    OooOO0O();
                    redirectRule3.getClass();
                } else if (str.equals("ReplaceKeyWith")) {
                    RedirectRule redirectRule4 = this.f9491OooO0oo;
                    OooOO0O();
                    redirectRule4.getClass();
                } else if (str.equals("HttpRedirectCode")) {
                    RedirectRule redirectRule5 = this.f9491OooO0oo;
                    OooOO0O();
                    redirectRule5.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f9491OooO0oo = new RedirectRule();
                }
            } else if (OooOO0o("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f9488OooO = new RoutingRule();
                }
            } else if (OooOO0o("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f9490OooO0oO = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f9491OooO0oo = new RedirectRule();
                }
            }
        }
    }

    public static class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f9492OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CompleteMultipartUploadResult f9493OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AmazonS3Exception f9494OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f9495OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public String f9496OooOO0;

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void OooO00o() {
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0Oo(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f9493OooO0o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0o0(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f9493OooO0o;
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
                if (!str.equals("Error") || (amazonS3Exception = this.f9494OooO0oO) == null) {
                    return;
                }
                amazonS3Exception.f8950OooO0o0 = this.f9496OooOO0;
                amazonS3Exception.f8948OooO0Oo = this.f9492OooO;
                amazonS3Exception.f9364OooO = this.f9495OooO0oo;
                return;
            }
            if (!OooOO0o("CompleteMultipartUploadResult")) {
                if (OooOO0o("Error")) {
                    if (str.equals("Code")) {
                        this.f9496OooOO0 = OooOO0O();
                        return;
                    }
                    if (str.equals("Message")) {
                        this.f9494OooO0oO = new AmazonS3Exception(OooOO0O());
                        return;
                    } else if (str.equals("RequestId")) {
                        this.f9492OooO = OooOO0O();
                        return;
                    } else {
                        if (str.equals("HostId")) {
                            this.f9495OooO0oo = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Location")) {
                CompleteMultipartUploadResult completeMultipartUploadResult = this.f9493OooO0o;
                OooOO0O();
                completeMultipartUploadResult.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f9493OooO0o;
                OooOO0O();
                completeMultipartUploadResult2.getClass();
            } else if (str.equals("Key")) {
                CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f9493OooO0o;
                OooOO0O();
                completeMultipartUploadResult3.getClass();
            } else if (str.equals("ETag")) {
                CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f9493OooO0o;
                ServiceUtils.OooO00o(OooOO0O());
                completeMultipartUploadResult4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooO0OO() && str.equals("CompleteMultipartUploadResult")) {
                this.f9493OooO0o = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        public final ServerSideEncryptionResult OooOOO0() {
            return this.f9493OooO0o;
        }
    }

    public static class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final CopyObjectResult f9497OooO0o = new CopyObjectResult();

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        public final void OooO00o() {
            this.f9497OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0Oo(String str) {
            this.f9497OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        public final void OooO0o0(Date date) {
            this.f9497OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        public final void OooO0oO(boolean z) {
            this.f9497OooO0o.getClass();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("CopyObjectResult") || OooOO0o("CopyPartResult")) {
                boolean zEquals = str.equals("LastModified");
                CopyObjectResult copyObjectResult = this.f9497OooO0o;
                if (zEquals) {
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f9341OooO00o;
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
            return this.f9497OooO0o;
        }
    }

    public static class DeleteObjectsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final DeleteObjectsResponse f9498OooO0o = new DeleteObjectsResponse();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public DeleteObjectsResult.DeletedObject f9499OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public MultiObjectDeleteException.DeleteError f9500OooO0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("DeleteResult")) {
                boolean zEquals = str.equals("Deleted");
                DeleteObjectsResponse deleteObjectsResponse = this.f9498OooO0o;
                if (zEquals) {
                    deleteObjectsResponse.f9307OooO0Oo.add(this.f9499OooO0oO);
                    this.f9499OooO0oO = null;
                    return;
                } else {
                    if (str.equals("Error")) {
                        deleteObjectsResponse.f9308OooO0o0.add(this.f9500OooO0oo);
                        this.f9500OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("DeleteResult", "Deleted")) {
                if (str.equals("Key")) {
                    DeleteObjectsResult.DeletedObject deletedObject = this.f9499OooO0oO;
                    OooOO0O();
                    deletedObject.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult.DeletedObject deletedObject2 = this.f9499OooO0oO;
                    OooOO0O();
                    deletedObject2.getClass();
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult.DeletedObject deletedObject3 = this.f9499OooO0oO;
                    OooOO0O().equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    deletedObject3.getClass();
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult.DeletedObject deletedObject4 = this.f9499OooO0oO;
                        OooOO0O();
                        deletedObject4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f9500OooO0oo;
                    OooOO0O();
                    deleteError.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f9500OooO0oo;
                    OooOO0O();
                    deleteError2.getClass();
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f9500OooO0oo;
                    OooOO0O();
                    deleteError3.getClass();
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError4 = this.f9500OooO0oo;
                    OooOO0O();
                    deleteError4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f9499OooO0oO = new DeleteObjectsResult.DeletedObject();
                } else if (str.equals("Error")) {
                    this.f9500OooO0oo = new MultiObjectDeleteException.DeleteError();
                }
            }
        }
    }

    public static class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public StorageClassAnalysis f9501OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AnalyticsConfiguration f9502OooO0o = new AnalyticsConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AnalyticsFilter f9503OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f9504OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public StorageClassAnalysisDataExport f9505OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public AnalyticsExportDestination f9506OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public AnalyticsS3BucketDestination f9507OooOO0o;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("AnalyticsConfiguration")) {
                boolean zEquals = str.equals("Id");
                AnalyticsConfiguration analyticsConfiguration = this.f9502OooO0o;
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
                    AnalyticsFilter analyticsFilter = this.f9503OooO0oO;
                    OooOO0O();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f9503OooO0oO;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f9503OooO0oO;
                        new AnalyticsAndOperator(this.f9504OooO0oo);
                        analyticsFilter3.getClass();
                        this.f9504OooO0oo = null;
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
                    ArrayList arrayList = this.f9504OooO0oo;
                    OooOO0O();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f9504OooO0oo.add(new AnalyticsTagPredicate());
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
                    this.f9501OooO.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f9505OooOO0;
                    OooOO0O();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f9505OooOO0.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f9506OooOO0O.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f9507OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f9507OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f9507OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f9507OooOO0o;
                    OooOO0O();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f9503OooO0oO = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f9501OooO = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f9504OooO0oo = new ArrayList();
                }
            } else if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f9505OooOO0 = new StorageClassAnalysisDataExport();
                }
            } else if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f9506OooOO0O = new AnalyticsExportDestination();
                }
            } else if (OooOO0o("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f9507OooOO0o = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public InventoryFilter f9508OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final InventoryConfiguration f9509OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList f9510OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public InventoryDestination f9511OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public InventoryS3BucketDestination f9512OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public InventorySchedule f9513OooOO0O;

        public GetBucketInventoryConfigurationHandler() {
            new GetBucketInventoryConfigurationResult();
            this.f9509OooO0o = new InventoryConfiguration();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("InventoryConfiguration")) {
                boolean zEquals = str.equals("Id");
                InventoryConfiguration inventoryConfiguration = this.f9509OooO0o;
                if (zEquals) {
                    OooOO0O();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    inventoryConfiguration.getClass();
                    this.f9511OooO0oo = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    inventoryConfiguration.getClass();
                    this.f9508OooO = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    OooOO0O();
                    inventoryConfiguration.getClass();
                    return;
                } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    inventoryConfiguration.getClass();
                    this.f9513OooOO0O = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        inventoryConfiguration.f9454OooO0Oo = this.f9510OooO0oO;
                        this.f9510OooO0oO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f9511OooO0oo.getClass();
                    this.f9512OooOO0 = null;
                    return;
                }
                return;
            }
            if (!OooOO0o("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (OooOO0o("InventoryConfiguration", "Filter")) {
                    if (str.equals("Prefix")) {
                        InventoryFilter inventoryFilter = this.f9508OooO;
                        OooOO0O();
                        new InventoryPrefixPredicate();
                        inventoryFilter.getClass();
                        return;
                    }
                    return;
                }
                if (!OooOO0o("InventoryConfiguration", AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    if (OooOO0o("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                        this.f9510OooO0oO.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f9513OooOO0O;
                    OooOO0O();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (str.equals("AccountId")) {
                InventoryS3BucketDestination inventoryS3BucketDestination = this.f9512OooOO0;
                OooOO0O();
                inventoryS3BucketDestination.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f9512OooOO0;
                OooOO0O();
                inventoryS3BucketDestination2.getClass();
            } else if (str.equals("Format")) {
                InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f9512OooOO0;
                OooOO0O();
                inventoryS3BucketDestination3.getClass();
            } else if (str.equals("Prefix")) {
                InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f9512OooOO0;
                OooOO0O();
                inventoryS3BucketDestination4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (!OooOO0o("InventoryConfiguration")) {
                if (OooOO0o("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f9512OooOO0 = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f9511OooO0oo = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f9508OooO = new InventoryFilter();
            } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                this.f9513OooOO0O = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f9510OooO0oO = new ArrayList();
            }
        }
    }

    public static class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final MetricsConfiguration f9514OooO0o = new MetricsConfiguration();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MetricsFilter f9515OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f9516OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("MetricsConfiguration")) {
                boolean zEquals = str.equals("Id");
                MetricsConfiguration metricsConfiguration = this.f9514OooO0o;
                if (zEquals) {
                    OooOO0O();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        metricsConfiguration.getClass();
                        this.f9515OooO0oO = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f9515OooO0oO;
                    OooOO0O();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f9515OooO0oO;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f9515OooO0oO;
                        new MetricsAndOperator(this.f9516OooO0oo);
                        metricsFilter3.getClass();
                        this.f9516OooO0oo = null;
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
                    ArrayList arrayList = this.f9516OooO0oo;
                    OooOO0O();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f9516OooO0oo.add(new MetricsTagPredicate());
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
                    this.f9515OooO0oO = new MetricsFilter();
                }
            } else if (OooOO0o("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f9516OooO0oo = new ArrayList();
            }
        }
    }

    public static class GetObjectTaggingHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ArrayList f9517OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f9518OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f9519OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("Tagging") && str.equals("TagSet")) {
                this.f9517OooO0o = null;
            }
            if (OooOO0o("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f9517OooO0o.add(new Tag(this.f9519OooO0oo, this.f9518OooO0oO));
                    this.f9519OooO0oo = null;
                    this.f9518OooO0oO = null;
                    return;
                }
                return;
            }
            if (OooOO0o("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f9519OooO0oo = OooOO0O();
                } else if (str.equals("Value")) {
                    this.f9518OooO0oO = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("Tagging") && str.equals("TagSet")) {
                this.f9517OooO0o = new ArrayList();
            }
        }
    }

    public static class InitiateMultipartUploadHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final InitiateMultipartUploadResult f9520OooO0o = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("InitiateMultipartUploadResult")) {
                boolean zEquals = str.equals("Bucket");
                InitiateMultipartUploadResult initiateMultipartUploadResult = this.f9520OooO0o;
                if (zEquals) {
                    OooOO0O();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("Key")) {
                    OooOO0O();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("UploadId")) {
                    initiateMultipartUploadResult.f9405OooO0Oo = OooOO0O();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
        }
    }

    public static class ListAllMyBucketsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ArrayList f9521OooO0o = new ArrayList();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f9522OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Bucket f9523OooO0oo = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListAllMyBucketsResult", "Owner")) {
                if (str.equals("ID")) {
                    this.f9522OooO0oO.f9419OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f9522OooO0oO.f9418OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f9521OooO0o.add(this.f9523OooO0oo);
                    this.f9523OooO0oo = null;
                    return;
                }
                return;
            }
            if (OooOO0o("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f9523OooO0oo.f9366OooO0Oo = OooOO0O();
                } else if (str.equals("CreationDate")) {
                    this.f9523OooO0oo.f9367OooO0o = DateUtils.OooO0Oo(OooOO0O());
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f9522OooO0oO = new Owner();
                }
            } else if (OooOO0o("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f9523OooO0oo = bucket;
                bucket.f9368OooO0o0 = this.f9522OooO0oO;
            }
        }
    }

    public static class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f9524OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ListBucketAnalyticsConfigurationsResult f9525OooO0o = new ListBucketAnalyticsConfigurationsResult();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AnalyticsConfiguration f9526OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public AnalyticsFilter f9527OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public StorageClassAnalysis f9528OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public StorageClassAnalysisDataExport f9529OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public AnalyticsExportDestination f9530OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public AnalyticsS3BucketDestination f9531OooOOO0;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult")) {
                boolean zEquals = str.equals("AnalyticsConfiguration");
                ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f9525OooO0o;
                if (zEquals) {
                    if (listBucketAnalyticsConfigurationsResult.f9406OooO0Oo == null) {
                        listBucketAnalyticsConfigurationsResult.f9406OooO0Oo = new ArrayList();
                    }
                    listBucketAnalyticsConfigurationsResult.f9406OooO0Oo.add(this.f9526OooO0oO);
                    this.f9526OooO0oO = null;
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
                    AnalyticsConfiguration analyticsConfiguration = this.f9526OooO0oO;
                    OooOO0O();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    this.f9526OooO0oO.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f9526OooO0oO.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f9527OooO0oo;
                    OooOO0O();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f9527OooO0oo;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f9527OooO0oo;
                        new AnalyticsAndOperator(this.f9524OooO);
                        analyticsFilter3.getClass();
                        this.f9524OooO = null;
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
                    ArrayList arrayList = this.f9524OooO;
                    OooOO0O();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f9524OooO.add(new AnalyticsTagPredicate());
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
                    this.f9528OooOO0.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f9529OooOO0O;
                    OooOO0O();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f9529OooOO0O.getClass();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f9530OooOO0o.getClass();
                    return;
                }
                return;
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f9531OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f9531OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f9531OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f9531OooOOO0;
                    OooOO0O();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f9526OooO0oO = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f9527OooO0oo = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f9528OooOO0 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f9524OooO = new ArrayList();
                }
            } else if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f9529OooOO0O = new StorageClassAnalysisDataExport();
                }
            } else if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f9530OooOO0o = new AnalyticsExportDestination();
                }
            } else if (OooOO0o("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f9531OooOOO0 = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class ListBucketHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public S3ObjectSummary f9532OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f9533OooO0oO;

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
                    Log log = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("Marker")) {
                    OooOO0O();
                    Log log2 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("NextMarker")) {
                    OooOO0O();
                    Log log3 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.OooO0O0(OooOO0O());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    OooOO0O();
                    Log log4 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    OooOO0O();
                    Log log5 = XmlResponsesSaxParser.f9459OooO0O0;
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
                    this.f9533OooO0oO.f9419OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f9533OooO0oO.f9418OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Key")) {
                String strOooOO0O = OooOO0O();
                S3ObjectSummary s3ObjectSummary = this.f9532OooO0o;
                Log log6 = XmlResponsesSaxParser.f9459OooO0O0;
                s3ObjectSummary.f9431OooO00o = strOooOO0O;
                return;
            }
            if (str.equals("LastModified")) {
                S3ObjectSummary s3ObjectSummary2 = this.f9532OooO0o;
                String strOooOO0O2 = OooOO0O();
                Log log7 = ServiceUtils.f9341OooO00o;
                s3ObjectSummary2.f9434OooO0Oo = DateUtils.OooO0Oo(strOooOO0O2);
                return;
            }
            if (str.equals("ETag")) {
                this.f9532OooO0o.f9432OooO0O0 = ServiceUtils.OooO00o(OooOO0O());
                return;
            }
            if (str.equals("Size")) {
                this.f9532OooO0o.f9433OooO0OO = XmlResponsesSaxParser.OooO0OO(OooOO0O());
            } else if (str.equals("StorageClass")) {
                this.f9532OooO0o.f9436OooO0o0 = OooOO0O();
            } else if (str.equals("Owner")) {
                this.f9532OooO0o.f9435OooO0o = this.f9533OooO0oO;
                this.f9533OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f9532OooO0o = new S3ObjectSummary();
                    throw null;
                }
            } else if (OooOO0o("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f9533OooO0oO = new Owner();
            }
        }
    }

    public static class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public InventoryDestination f9534OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ListBucketInventoryConfigurationsResult f9535OooO0o = new ListBucketInventoryConfigurationsResult();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public InventoryConfiguration f9536OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f9537OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public InventoryFilter f9538OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public InventoryS3BucketDestination f9539OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public InventorySchedule f9540OooOO0o;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListInventoryConfigurationsResult")) {
                boolean zEquals = str.equals("InventoryConfiguration");
                ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f9535OooO0o;
                if (zEquals) {
                    if (listBucketInventoryConfigurationsResult.f9407OooO0Oo == null) {
                        listBucketInventoryConfigurationsResult.f9407OooO0Oo = new ArrayList();
                    }
                    listBucketInventoryConfigurationsResult.f9407OooO0Oo.add(this.f9536OooO0oO);
                    this.f9536OooO0oO = null;
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
                    InventoryConfiguration inventoryConfiguration = this.f9536OooO0oO;
                    OooOO0O();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f9536OooO0oO.getClass();
                    this.f9534OooO = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    InventoryConfiguration inventoryConfiguration2 = this.f9536OooO0oO;
                    ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                    inventoryConfiguration2.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f9536OooO0oO.getClass();
                    this.f9538OooOO0 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    InventoryConfiguration inventoryConfiguration3 = this.f9536OooO0oO;
                    OooOO0O();
                    inventoryConfiguration3.getClass();
                    return;
                } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    this.f9536OooO0oO.getClass();
                    this.f9540OooOO0o = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f9536OooO0oO.f9454OooO0Oo = this.f9537OooO0oo;
                        this.f9537OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f9534OooO.getClass();
                    this.f9539OooOO0O = null;
                    return;
                }
                return;
            }
            if (!OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                    if (str.equals("Prefix")) {
                        InventoryFilter inventoryFilter = this.f9538OooOO0;
                        OooOO0O();
                        new InventoryPrefixPredicate();
                        inventoryFilter.getClass();
                        return;
                    }
                    return;
                }
                if (!OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                    if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                        this.f9537OooO0oo.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f9540OooOO0o;
                    OooOO0O();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (str.equals("AccountId")) {
                InventoryS3BucketDestination inventoryS3BucketDestination = this.f9539OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination.getClass();
                return;
            }
            if (str.equals("Bucket")) {
                InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f9539OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination2.getClass();
            } else if (str.equals("Format")) {
                InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f9539OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination3.getClass();
            } else if (str.equals("Prefix")) {
                InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f9539OooOO0O;
                OooOO0O();
                inventoryS3BucketDestination4.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f9536OooO0oO = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (!OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (OooOO0o("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                    this.f9539OooOO0O = new InventoryS3BucketDestination();
                    return;
                }
                return;
            }
            if (str.equals("Destination")) {
                this.f9534OooO = new InventoryDestination();
                return;
            }
            if (str.equals("Filter")) {
                this.f9538OooOO0 = new InventoryFilter();
            } else if (str.equals(AppEventsConstants.EVENT_NAME_SCHEDULE)) {
                this.f9540OooOO0o = new InventorySchedule();
            } else if (str.equals("OptionalFields")) {
                this.f9537OooO0oo = new ArrayList();
            }
        }
    }

    public static class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f9541OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ListBucketMetricsConfigurationsResult f9542OooO0o = new ListBucketMetricsConfigurationsResult();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MetricsConfiguration f9543OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public MetricsFilter f9544OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListMetricsConfigurationsResult")) {
                boolean zEquals = str.equals("MetricsConfiguration");
                ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f9542OooO0o;
                if (zEquals) {
                    if (listBucketMetricsConfigurationsResult.f9408OooO0Oo == null) {
                        listBucketMetricsConfigurationsResult.f9408OooO0Oo = new ArrayList();
                    }
                    listBucketMetricsConfigurationsResult.f9408OooO0Oo.add(this.f9543OooO0oO);
                    this.f9543OooO0oO = null;
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
                    MetricsConfiguration metricsConfiguration = this.f9543OooO0oO;
                    OooOO0O();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f9543OooO0oO.getClass();
                        this.f9544OooO0oo = null;
                        return;
                    }
                    return;
                }
            }
            if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f9544OooO0oo;
                    OooOO0O();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f9544OooO0oo;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f9544OooO0oo;
                        new MetricsAndOperator(this.f9541OooO);
                        metricsFilter3.getClass();
                        this.f9541OooO = null;
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
                    ArrayList arrayList = this.f9541OooO;
                    OooOO0O();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f9541OooO.add(new MetricsTagPredicate());
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
                    this.f9543OooO0oO = new MetricsConfiguration();
                }
            } else if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f9544OooO0oo = new MetricsFilter();
                }
            } else if (OooOO0o("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f9541OooO = new ArrayList();
            }
        }
    }

    public static class ListMultipartUploadsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final MultipartUploadListing f9545OooO0o = new MultipartUploadListing();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MultipartUpload f9546OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Owner f9547OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            boolean zOooOO0o = OooOO0o("ListMultipartUploadsResult");
            MultipartUploadListing multipartUploadListing = this.f9545OooO0o;
            if (!zOooOO0o) {
                if (OooOO0o("ListMultipartUploadsResult", "CommonPrefixes")) {
                    if (str.equals("Prefix")) {
                        multipartUploadListing.f9410OooO0O0.add(OooOO0O());
                        return;
                    }
                    return;
                }
                if (!OooOO0o("ListMultipartUploadsResult", "Upload")) {
                    if (OooOO0o("ListMultipartUploadsResult", "Upload", "Owner") || OooOO0o("ListMultipartUploadsResult", "Upload", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f9547OooO0oo.f9419OooO0o0 = XmlResponsesSaxParser.OooO00o(OooOO0O());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f9547OooO0oo.f9418OooO0Oo = XmlResponsesSaxParser.OooO00o(OooOO0O());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f9546OooO0oO;
                    OooOO0O();
                    multipartUpload.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f9546OooO0oO;
                    OooOO0O();
                    multipartUpload2.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    this.f9546OooO0oO.getClass();
                    this.f9547OooO0oo = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    this.f9546OooO0oO.getClass();
                    this.f9547OooO0oo = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f9546OooO0oO;
                    OooOO0O();
                    multipartUpload3.getClass();
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f9546OooO0oO;
                        String strOooOO0O = OooOO0O();
                        Log log = ServiceUtils.f9341OooO00o;
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
                Log log2 = XmlResponsesSaxParser.f9459OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("Delimiter")) {
                OooOO0O();
                Log log3 = XmlResponsesSaxParser.f9459OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("Prefix")) {
                OooOO0O();
                Log log4 = XmlResponsesSaxParser.f9459OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("UploadIdMarker")) {
                OooOO0O();
                Log log5 = XmlResponsesSaxParser.f9459OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("NextKeyMarker")) {
                OooOO0O();
                Log log6 = XmlResponsesSaxParser.f9459OooO0O0;
                multipartUploadListing.getClass();
                return;
            }
            if (str.equals("NextUploadIdMarker")) {
                OooOO0O();
                Log log7 = XmlResponsesSaxParser.f9459OooO0O0;
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
                Log log8 = XmlResponsesSaxParser.f9459OooO0O0;
                multipartUploadListing.getClass();
            } else if (str.equals("IsTruncated")) {
                Boolean.parseBoolean(OooOO0O());
                multipartUploadListing.getClass();
            } else if (str.equals("Upload")) {
                if (multipartUploadListing.f9409OooO00o == null) {
                    multipartUploadListing.f9409OooO00o = new ArrayList();
                }
                multipartUploadListing.f9409OooO00o.add(this.f9546OooO0oO);
                this.f9546OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f9546OooO0oO = new MultipartUpload();
                }
            } else if (OooOO0o("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f9547OooO0oo = new Owner();
                }
            }
        }
    }

    public static class ListObjectsV2Handler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public S3ObjectSummary f9548OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f9549OooO0oO;

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
                    Log log = XmlResponsesSaxParser.f9459OooO0O0;
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
                    Log log2 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("KeyCount")) {
                    XmlResponsesSaxParser.OooO0O0(OooOO0O());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    OooOO0O();
                    Log log3 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    OooOO0O();
                    Log log4 = XmlResponsesSaxParser.f9459OooO0O0;
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
                    this.f9549OooO0oO.f9419OooO0o0 = OooOO0O();
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f9549OooO0oO.f9418OooO0Oo = OooOO0O();
                        return;
                    }
                    return;
                }
            }
            if (str.equals("Key")) {
                String strOooOO0O = OooOO0O();
                S3ObjectSummary s3ObjectSummary = this.f9548OooO0o;
                Log log5 = XmlResponsesSaxParser.f9459OooO0O0;
                s3ObjectSummary.f9431OooO00o = strOooOO0O;
                return;
            }
            if (str.equals("LastModified")) {
                S3ObjectSummary s3ObjectSummary2 = this.f9548OooO0o;
                String strOooOO0O2 = OooOO0O();
                Log log6 = ServiceUtils.f9341OooO00o;
                s3ObjectSummary2.f9434OooO0Oo = DateUtils.OooO0Oo(strOooOO0O2);
                return;
            }
            if (str.equals("ETag")) {
                this.f9548OooO0o.f9432OooO0O0 = ServiceUtils.OooO00o(OooOO0O());
                return;
            }
            if (str.equals("Size")) {
                this.f9548OooO0o.f9433OooO0OO = XmlResponsesSaxParser.OooO0OO(OooOO0O());
            } else if (str.equals("StorageClass")) {
                this.f9548OooO0o.f9436OooO0o0 = OooOO0O();
            } else if (str.equals("Owner")) {
                this.f9548OooO0o.f9435OooO0o = this.f9549OooO0oO;
                this.f9549OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f9548OooO0o = new S3ObjectSummary();
                    throw null;
                }
            } else if (OooOO0o("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f9549OooO0oO = new Owner();
            }
        }
    }

    public static class ListPartsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final PartListing f9550OooO0o = new PartListing();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public PartSummary f9551OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Owner f9552OooO0oo;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (!OooOO0o("ListPartsResult")) {
                if (!OooOO0o("ListPartsResult", "Part")) {
                    if (OooOO0o("ListPartsResult", "Owner") || OooOO0o("ListPartsResult", "Initiator")) {
                        if (str.equals("ID")) {
                            this.f9552OooO0oo.f9419OooO0o0 = XmlResponsesSaxParser.OooO00o(OooOO0O());
                            return;
                        } else {
                            if (str.equals("DisplayName")) {
                                this.f9552OooO0oo.f9418OooO0Oo = XmlResponsesSaxParser.OooO00o(OooOO0O());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f9551OooO0oO;
                    Integer.parseInt(OooOO0O());
                    partSummary.getClass();
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f9551OooO0oO;
                    String strOooOO0O = OooOO0O();
                    Log log = ServiceUtils.f9341OooO00o;
                    DateUtils.OooO0Oo(strOooOO0O);
                    partSummary2.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f9551OooO0oO;
                    ServiceUtils.OooO00o(OooOO0O());
                    partSummary3.getClass();
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f9551OooO0oO;
                        Long.parseLong(OooOO0O());
                        partSummary4.getClass();
                        return;
                    }
                    return;
                }
            }
            boolean zEquals = str.equals("Bucket");
            PartListing partListing = this.f9550OooO0o;
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
                this.f9552OooO0oo = null;
                return;
            }
            if (str.equals("Initiator")) {
                partListing.getClass();
                this.f9552OooO0oo = null;
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
                Log log2 = XmlResponsesSaxParser.f9459OooO0O0;
                partListing.getClass();
            } else if (str.equals("IsTruncated")) {
                Boolean.parseBoolean(OooOO0O());
                partListing.getClass();
            } else if (str.equals("Part")) {
                if (partListing.f9422OooO0Oo == null) {
                    partListing.f9422OooO0Oo = new ArrayList();
                }
                partListing.f9422OooO0Oo.add(this.f9551OooO0oO);
                this.f9551OooO0oO = null;
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (OooOO0o("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f9551OooO0oO = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f9552OooO0oo = new Owner();
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
        public S3VersionSummary f9553OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Owner f9554OooO0oO;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooO0oo(String str) {
            if (OooOO0o("ListVersionsResult")) {
                if (str.equals("Name")) {
                    OooOO0O();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    OooOO0O();
                    Log log = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("KeyMarker")) {
                    OooOO0O();
                    Log log2 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("VersionIdMarker")) {
                    OooOO0O();
                    Log log3 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    Integer.parseInt(OooOO0O());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    OooOO0O();
                    Log log4 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    OooOO0O();
                    Log log5 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                if (str.equals("NextKeyMarker")) {
                    OooOO0O();
                    Log log6 = XmlResponsesSaxParser.f9459OooO0O0;
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
                    Log log7 = XmlResponsesSaxParser.f9459OooO0O0;
                    throw null;
                }
                return;
            }
            if (!OooOO0o("ListVersionsResult", "Version") && !OooOO0o("ListVersionsResult", "DeleteMarker")) {
                if (OooOO0o("ListVersionsResult", "Version", "Owner") || OooOO0o("ListVersionsResult", "DeleteMarker", "Owner")) {
                    if (str.equals("ID")) {
                        this.f9554OooO0oO.f9419OooO0o0 = OooOO0O();
                        return;
                    } else {
                        if (str.equals("DisplayName")) {
                            this.f9554OooO0oO.f9418OooO0Oo = OooOO0O();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (str.equals("Key")) {
                OooOO0O();
                S3VersionSummary s3VersionSummary = this.f9553OooO0o;
                Log log8 = XmlResponsesSaxParser.f9459OooO0O0;
                s3VersionSummary.getClass();
                return;
            }
            if (str.equals("VersionId")) {
                S3VersionSummary s3VersionSummary2 = this.f9553OooO0o;
                OooOO0O();
                s3VersionSummary2.getClass();
                return;
            }
            if (str.equals("IsLatest")) {
                S3VersionSummary s3VersionSummary3 = this.f9553OooO0o;
                ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(OooOO0O());
                s3VersionSummary3.getClass();
                return;
            }
            if (str.equals("LastModified")) {
                S3VersionSummary s3VersionSummary4 = this.f9553OooO0o;
                String strOooOO0O = OooOO0O();
                Log log9 = ServiceUtils.f9341OooO00o;
                DateUtils.OooO0Oo(strOooOO0O);
                s3VersionSummary4.getClass();
                return;
            }
            if (str.equals("ETag")) {
                S3VersionSummary s3VersionSummary5 = this.f9553OooO0o;
                ServiceUtils.OooO00o(OooOO0O());
                s3VersionSummary5.getClass();
            } else if (str.equals("Size")) {
                S3VersionSummary s3VersionSummary6 = this.f9553OooO0o;
                Long.parseLong(OooOO0O());
                s3VersionSummary6.getClass();
            } else if (str.equals("Owner")) {
                this.f9553OooO0o.getClass();
                this.f9554OooO0oO = null;
            } else if (str.equals("StorageClass")) {
                S3VersionSummary s3VersionSummary7 = this.f9553OooO0o;
                OooOO0O();
                s3VersionSummary7.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        public final void OooOO0(String str, Attributes attributes) {
            if (!OooOO0o("ListVersionsResult")) {
                if ((OooOO0o("ListVersionsResult", "Version") || OooOO0o("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                    this.f9554OooO0oO = new Owner();
                    return;
                }
                return;
            }
            if (str.equals("Version")) {
                this.f9553OooO0o = new S3VersionSummary();
                throw null;
            }
            if (str.equals("DeleteMarker")) {
                this.f9553OooO0o = new S3VersionSummary();
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
        this.f9460OooO00o = null;
        try {
            this.f9460OooO00o = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f9460OooO00o = XMLReaderFactory.createXMLReader();
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
            f9459OooO0O0.OooO0Oo(o000oOoO.OooO00o("Unable to parse integer value '", str, "'"), e);
        }
    }

    public static long OooO0OO(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            f9459OooO0O0.OooO0Oo(o000oOoO.OooO00o("Unable to parse long value '", str, "'"), e);
            return -1L;
        }
    }

    public final void OooO0Oo(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        XMLReader xMLReader = this.f9460OooO00o;
        Log log = f9459OooO0O0;
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
