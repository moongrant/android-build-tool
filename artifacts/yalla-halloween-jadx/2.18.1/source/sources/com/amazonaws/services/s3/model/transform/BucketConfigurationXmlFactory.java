package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.services.s3.model.FilterRule;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.S3KeyFilter;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsPredicateVisitor;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePredicateVisitor;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.facebook.internal.ServerProtocol;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class BucketConfigurationXmlFactory {

    public class AnalyticsPredicateVisitorImpl implements AnalyticsPredicateVisitor {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final XmlWriter f11007OooO00o;

        public AnalyticsPredicateVisitorImpl(XmlWriter xmlWriter) {
            this.f11007OooO00o = xmlWriter;
        }

        @Override // com.amazonaws.services.s3.model.analytics.AnalyticsPredicateVisitor
        public final void OooO00o(AnalyticsPrefixPredicate analyticsPrefixPredicate) {
            BucketConfigurationXmlFactory.OooO00o(BucketConfigurationXmlFactory.this, this.f11007OooO00o, analyticsPrefixPredicate.f10971Oooo0o);
        }

        @Override // com.amazonaws.services.s3.model.analytics.AnalyticsPredicateVisitor
        public final void OooO0O0(AnalyticsTagPredicate analyticsTagPredicate) {
            BucketConfigurationXmlFactory.OooO0O0(BucketConfigurationXmlFactory.this, this.f11007OooO00o, analyticsTagPredicate.f10976Oooo0o);
        }

        @Override // com.amazonaws.services.s3.model.analytics.AnalyticsPredicateVisitor
        public final void OooO0OO(AnalyticsAndOperator analyticsAndOperator) {
            this.f11007OooO00o.OooO0Oo("And");
            Iterator it = analyticsAndOperator.OooO0O0().iterator();
            while (it.hasNext()) {
                ((AnalyticsFilterPredicate) it.next()).OooO00o(this);
            }
            this.f11007OooO00o.OooO0O0();
        }
    }

    public class LifecyclePredicateVisitorImpl implements LifecyclePredicateVisitor {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final XmlWriter f11009OooO00o;

        public LifecyclePredicateVisitorImpl(XmlWriter xmlWriter) {
            this.f11009OooO00o = xmlWriter;
        }

        @Override // com.amazonaws.services.s3.model.lifecycle.LifecyclePredicateVisitor
        public final void OooO00o(LifecycleAndOperator lifecycleAndOperator) {
            this.f11009OooO00o.OooO0Oo("And");
            Iterator it = lifecycleAndOperator.OooO0O0().iterator();
            while (it.hasNext()) {
                ((LifecycleFilterPredicate) it.next()).OooO00o(this);
            }
            this.f11009OooO00o.OooO0O0();
        }

        @Override // com.amazonaws.services.s3.model.lifecycle.LifecyclePredicateVisitor
        public final void OooO0O0(LifecyclePrefixPredicate lifecyclePrefixPredicate) {
            BucketConfigurationXmlFactory.OooO00o(BucketConfigurationXmlFactory.this, this.f11009OooO00o, lifecyclePrefixPredicate.f10997Oooo0o);
        }

        @Override // com.amazonaws.services.s3.model.lifecycle.LifecyclePredicateVisitor
        public final void OooO0OO(LifecycleTagPredicate lifecycleTagPredicate) {
            BucketConfigurationXmlFactory.OooO0O0(BucketConfigurationXmlFactory.this, this.f11009OooO00o, lifecycleTagPredicate.f10998Oooo0o);
        }
    }

    public class MetricsPredicateVisitorImpl implements MetricsPredicateVisitor {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final XmlWriter f11011OooO00o;

        public MetricsPredicateVisitorImpl(XmlWriter xmlWriter) {
            this.f11011OooO00o = xmlWriter;
        }

        @Override // com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor
        public final void OooO00o(MetricsTagPredicate metricsTagPredicate) {
            BucketConfigurationXmlFactory.OooO0O0(BucketConfigurationXmlFactory.this, this.f11011OooO00o, metricsTagPredicate.f11004Oooo0o);
        }

        @Override // com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor
        public final void OooO0O0(MetricsAndOperator metricsAndOperator) {
            this.f11011OooO00o.OooO0Oo("And");
            Iterator it = metricsAndOperator.OooO0O0().iterator();
            while (it.hasNext()) {
                ((MetricsFilterPredicate) it.next()).OooO00o(this);
            }
            this.f11011OooO00o.OooO0O0();
        }

        @Override // com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor
        public final void OooO0OO(MetricsPrefixPredicate metricsPrefixPredicate) {
            BucketConfigurationXmlFactory.OooO00o(BucketConfigurationXmlFactory.this, this.f11011OooO00o, metricsPrefixPredicate.f11003Oooo0o);
        }
    }

    public static void OooO00o(BucketConfigurationXmlFactory bucketConfigurationXmlFactory, XmlWriter xmlWriter, String str) {
        bucketConfigurationXmlFactory.OooO0Oo(xmlWriter, "Prefix", str);
    }

    public static void OooO0O0(BucketConfigurationXmlFactory bucketConfigurationXmlFactory, XmlWriter xmlWriter, Tag tag) {
        Objects.requireNonNull(bucketConfigurationXmlFactory);
        if (tag == null) {
            return;
        }
        xmlWriter.OooO0Oo("Tag");
        xmlWriter.OooO0Oo("Key");
        xmlWriter.OooO00o(tag.f10939Oooo0o, xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        xmlWriter.OooO0Oo("Value");
        xmlWriter.OooO00o(tag.f10940Oooo0oO, xmlWriter.f10683OooO0O0);
        xmlWriter.OooO0O0();
        xmlWriter.OooO0O0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void OooO0OO(XmlWriter xmlWriter, NotificationConfiguration notificationConfiguration) {
        for (String str : notificationConfiguration.f10853Oooo0o) {
            xmlWriter.OooO0Oo("Event");
            xmlWriter.OooO00o(str, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
        }
        Filter filter = notificationConfiguration.f10854Oooo0oO;
        if (filter != null) {
            if (filter.f10786Oooo0o == null) {
                throw new AmazonClientException("Cannot have a Filter without any criteria");
            }
            xmlWriter.OooO0Oo("Filter");
            S3KeyFilter s3KeyFilter = filter.f10786Oooo0o;
            if (s3KeyFilter != null) {
                List listUnmodifiableList = Collections.unmodifiableList(s3KeyFilter.f10896Oooo0o);
                if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
                    throw new AmazonClientException("Cannot have an S3KeyFilter without any filter rules");
                }
                xmlWriter.OooO0Oo("S3Key");
                for (FilterRule filterRule : Collections.unmodifiableList(filter.f10786Oooo0o.f10896Oooo0o)) {
                    xmlWriter.OooO0Oo("FilterRule");
                    xmlWriter.OooO0Oo("Name");
                    xmlWriter.OooO00o(filterRule.f10787Oooo0o, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                    xmlWriter.OooO0Oo("Value");
                    xmlWriter.OooO00o(filterRule.f10788Oooo0oO, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                    xmlWriter.OooO0O0();
                }
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
    }

    public final void OooO0Oo(XmlWriter xmlWriter, String str, String str2) {
        if (str2 != null) {
            xmlWriter.OooO0Oo(str);
            xmlWriter.OooO00o(str2, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
        }
    }

    public final byte[] OooO0o(AnalyticsConfiguration analyticsConfiguration) throws AmazonClientException {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("AnalyticsConfiguration");
        OooO0Oo(xmlWriter, "Id", analyticsConfiguration.f10965Oooo0o);
        AnalyticsFilter analyticsFilter = analyticsConfiguration.f10966Oooo0oO;
        if (analyticsFilter != null) {
            xmlWriter.OooO0Oo("Filter");
            AnalyticsFilterPredicate analyticsFilterPredicate = analyticsFilter.f10969Oooo0o;
            if (analyticsFilterPredicate != null) {
                analyticsFilterPredicate.OooO00o(new AnalyticsPredicateVisitorImpl(xmlWriter));
            }
            xmlWriter.OooO0O0();
        }
        StorageClassAnalysis storageClassAnalysis = analyticsConfiguration.f10967Oooo0oo;
        if (storageClassAnalysis != null) {
            xmlWriter.OooO0Oo("StorageClassAnalysis");
            StorageClassAnalysisDataExport storageClassAnalysisDataExport = storageClassAnalysis.f10977Oooo0o;
            if (storageClassAnalysisDataExport != null) {
                xmlWriter.OooO0Oo("DataExport");
                OooO0Oo(xmlWriter, "OutputSchemaVersion", storageClassAnalysisDataExport.f10978Oooo0o);
                AnalyticsExportDestination analyticsExportDestination = storageClassAnalysisDataExport.f10979Oooo0oO;
                if (analyticsExportDestination != null) {
                    xmlWriter.OooO0Oo("Destination");
                    if (analyticsExportDestination.f10968Oooo0o != null) {
                        xmlWriter.OooO0Oo("S3BucketDestination");
                        AnalyticsS3BucketDestination analyticsS3BucketDestination = analyticsExportDestination.f10968Oooo0o;
                        OooO0Oo(xmlWriter, "Format", analyticsS3BucketDestination.f10973Oooo0o);
                        OooO0Oo(xmlWriter, "BucketAccountId", analyticsS3BucketDestination.f10974Oooo0oO);
                        OooO0Oo(xmlWriter, "Bucket", analyticsS3BucketDestination.f10975Oooo0oo);
                        OooO0Oo(xmlWriter, "Prefix", analyticsS3BucketDestination.f10972Oooo);
                        xmlWriter.OooO0O0();
                    }
                    xmlWriter.OooO0O0();
                }
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        return xmlWriter.OooO0OO();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.BucketLifecycleConfiguration$Transition>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.BucketLifecycleConfiguration$NoncurrentVersionTransition>] */
    public final byte[] OooO0o0(BucketLifecycleConfiguration bucketLifecycleConfiguration) throws AmazonClientException {
        StorageClass storageClassOooO00o;
        StorageClass storageClassOooO00o2;
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0Oo("LifecycleConfiguration");
        for (BucketLifecycleConfiguration.Rule rule : bucketLifecycleConfiguration.f10713Oooo0o) {
            xmlWriter.OooO0Oo("Rule");
            if (rule.f10717Oooo0o != null) {
                xmlWriter.OooO0Oo("ID");
                xmlWriter.OooO00o(rule.f10717Oooo0o, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            }
            if (rule.f10716Oooo == null) {
                xmlWriter.OooO0Oo("Prefix");
                String str = rule.f10718Oooo0oO;
                if (str == null) {
                    str = "";
                }
                xmlWriter.OooO00o(str, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
            } else if (rule.f10718Oooo0oO != null) {
                throw new IllegalArgumentException("Prefix cannot be used with Filter. Use LifecyclePrefixPredicate to create a LifecycleFilter");
            }
            xmlWriter.OooO0Oo("Status");
            xmlWriter.OooO00o(rule.f10719Oooo0oo, xmlWriter.f10683OooO0O0);
            xmlWriter.OooO0O0();
            LifecycleFilter lifecycleFilter = rule.f10716Oooo;
            if (lifecycleFilter != null) {
                xmlWriter.OooO0Oo("Filter");
                LifecycleFilterPredicate lifecycleFilterPredicate = lifecycleFilter.f10995Oooo0o;
                if (lifecycleFilterPredicate != null) {
                    lifecycleFilterPredicate.OooO00o(new LifecyclePredicateVisitorImpl(xmlWriter));
                }
                xmlWriter.OooO0O0();
            }
            ?? r2 = rule.f10724OoooOO0;
            if (r2 != 0 && !r2.isEmpty()) {
                for (BucketLifecycleConfiguration.Transition transition : r2) {
                    if (transition != null) {
                        xmlWriter.OooO0Oo("Transition");
                        if (transition.f10728Oooo0oO != null) {
                            xmlWriter.OooO0Oo("Date");
                            Date date = transition.f10728Oooo0oO;
                            Log log = ServiceUtils.f10681OooO00o;
                            xmlWriter.OooO0oO(DateUtils.OooO0O0("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", date));
                            xmlWriter.OooO0O0();
                        }
                        if (transition.f10727Oooo0o != -1) {
                            xmlWriter.OooO0Oo("Days");
                            xmlWriter.OooO0oO(Integer.toString(transition.f10727Oooo0o));
                            xmlWriter.OooO0O0();
                        }
                        xmlWriter.OooO0Oo("StorageClass");
                        try {
                            storageClassOooO00o2 = StorageClass.OooO00o(transition.f10729Oooo0oo);
                        } catch (IllegalArgumentException unused) {
                            storageClassOooO00o2 = null;
                        }
                        xmlWriter.OooO0oO(storageClassOooO00o2.toString());
                        xmlWriter.OooO0O0();
                        xmlWriter.OooO0O0();
                    }
                }
            }
            ?? r3 = rule.f10726o000oOoO;
            if (r3 != 0 && !r3.isEmpty()) {
                for (BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition : r3) {
                    if (noncurrentVersionTransition != null) {
                        xmlWriter.OooO0Oo("NoncurrentVersionTransition");
                        if (noncurrentVersionTransition.f10714Oooo0o != -1) {
                            xmlWriter.OooO0Oo("NoncurrentDays");
                            xmlWriter.OooO0oO(Integer.toString(noncurrentVersionTransition.f10714Oooo0o));
                            xmlWriter.OooO0O0();
                        }
                        xmlWriter.OooO0Oo("StorageClass");
                        try {
                            storageClassOooO00o = StorageClass.OooO00o(noncurrentVersionTransition.f10715Oooo0oO);
                        } catch (IllegalArgumentException unused2) {
                            storageClassOooO00o = null;
                        }
                        xmlWriter.OooO0oO(storageClassOooO00o.toString());
                        xmlWriter.OooO0O0();
                        xmlWriter.OooO0O0();
                    }
                }
            }
            if ((rule.f10722OoooO00 == -1 && rule.f10720OoooO == null && !rule.f10721OoooO0) ? false : true) {
                xmlWriter.OooO0Oo("Expiration");
                if (rule.f10722OoooO00 != -1) {
                    xmlWriter.OooO0Oo("Days");
                    xmlWriter.OooO00o("" + rule.f10722OoooO00, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
                if (rule.f10720OoooO != null) {
                    xmlWriter.OooO0Oo("Date");
                    Date date2 = rule.f10720OoooO;
                    Log log2 = ServiceUtils.f10681OooO00o;
                    xmlWriter.OooO00o(DateUtils.OooO0O0("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", date2), xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
                if (rule.f10721OoooO0) {
                    xmlWriter.OooO0Oo("ExpiredObjectDeleteMarker");
                    xmlWriter.OooO00o(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, xmlWriter.f10683OooO0O0);
                    xmlWriter.OooO0O0();
                }
                xmlWriter.OooO0O0();
            }
            if (rule.f10723OoooO0O != -1) {
                xmlWriter.OooO0Oo("NoncurrentVersionExpiration");
                xmlWriter.OooO0Oo("NoncurrentDays");
                xmlWriter.OooO00o(Integer.toString(rule.f10723OoooO0O), xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0O0();
            }
            if (rule.f10725OoooOOO != null) {
                xmlWriter.OooO0Oo("AbortIncompleteMultipartUpload");
                xmlWriter.OooO0Oo("DaysAfterInitiation");
                xmlWriter.OooO00o(Integer.toString(rule.f10725OoooOOO.f10688Oooo0o), xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0O0();
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        return xmlWriter.OooO0OO();
    }

    public final byte[] OooO0oO(MetricsConfiguration metricsConfiguration) throws AmazonClientException {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0o("MetricsConfiguration");
        OooO0Oo(xmlWriter, "Id", metricsConfiguration.f10999Oooo0o);
        MetricsFilter metricsFilter = metricsConfiguration.f11000Oooo0oO;
        if (metricsFilter != null) {
            xmlWriter.OooO0Oo("Filter");
            MetricsFilterPredicate metricsFilterPredicate = metricsFilter.f11001Oooo0o;
            if (metricsFilterPredicate != null) {
                metricsFilterPredicate.OooO00o(new MetricsPredicateVisitorImpl(xmlWriter));
            }
            xmlWriter.OooO0O0();
        }
        xmlWriter.OooO0O0();
        return xmlWriter.OooO0OO();
    }
}
