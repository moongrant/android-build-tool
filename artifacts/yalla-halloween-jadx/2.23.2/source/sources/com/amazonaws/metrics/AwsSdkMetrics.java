package com.amazonaws.metrics;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSServiceMetrics;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum AwsSdkMetrics {
    ;

    public static final String AWS_CREDENTAIL_PROPERTIES_FILE = "credentialFile";
    public static final String CLOUDWATCH_REGION = "cloudwatchRegion";
    private static final boolean DEFAULT_METRICS_ENABLED;
    private static final String DEFAULT_METRIC_COLLECTOR_FACTORY = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";
    public static final String DEFAULT_METRIC_NAMESPACE = "AWSSDK/Java";
    public static final String EXCLUDE_MACHINE_METRICS = "excludeMachineMetrics";
    public static final String HOST_METRIC_NAME = "hostMetricName";
    public static final String INCLUDE_PER_HOST_METRICS = "includePerHostMetrics";
    public static final String JVM_METRIC_NAME = "jvmMetricName";
    private static final String MBEAN_OBJECT_NAME = "com.amazonaws.management:type=AwsSdkMetrics";
    public static final String METRIC_NAME_SPACE = "metricNameSpace";
    public static final String METRIC_QUEUE_SIZE = "metricQueueSize";
    public static final String QUEUE_POLL_TIMEOUT_MILLI = "getQueuePollTimeoutMilli";
    private static final int QUEUE_POLL_TIMEOUT_MILLI_MINUMUM = 1000;
    private static final MetricRegistry REGISTRY;
    public static final String USE_SINGLE_METRIC_NAMESPACE = "useSingleMetricNamespace";
    private static volatile String credentialFile = null;
    private static volatile AWSCredentialsProvider credentialProvider = null;
    private static boolean dirtyEnabling = false;
    private static volatile String hostMetricName = null;
    private static volatile String jvmMetricName = null;
    private static volatile boolean machineMetricsExcluded = false;
    private static volatile MetricCollector mc = null;
    private static volatile String metricNameSpace = "AWSSDK/Java";
    private static volatile Integer metricQueueSize;
    private static volatile boolean perHostMetricsIncluded;
    private static volatile Long queuePollTimeoutMilli;
    private static volatile Regions region;
    private static volatile boolean singleMetricNamespace;

    public static class MetricRegistry {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f12223OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile Set<MetricType> f12224OooO0O0;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f12223OooO00o = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            this.f12224OooO0O0 = Collections.unmodifiableSet(new HashSet(hashSet));
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z = property != null;
        DEFAULT_METRICS_ENABLED = z;
        if (z) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (String str : property.split(",")) {
                String strTrim = str.trim();
                if (!z2 && EXCLUDE_MACHINE_METRICS.equals(strTrim)) {
                    z2 = true;
                } else if (!z3 && INCLUDE_PER_HOST_METRICS.equals(strTrim)) {
                    z3 = true;
                } else if (z4 || !USE_SINGLE_METRIC_NAMESPACE.equals(strTrim)) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length == 2) {
                        String strTrim2 = strArrSplit[0].trim();
                        String strTrim3 = strArrSplit[1].trim();
                        try {
                            if (AWS_CREDENTAIL_PROPERTIES_FILE.equals(strTrim2)) {
                                final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(strTrim3));
                                synchronized (AwsSdkMetrics.class) {
                                    credentialProvider = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                                        @Override // com.amazonaws.auth.AWSCredentialsProvider
                                        public final AWSCredentials OooO00o() {
                                            return propertiesCredentials;
                                        }
                                    };
                                    credentialFile = strTrim3;
                                }
                            } else if (CLOUDWATCH_REGION.equals(strTrim2)) {
                                region = Regions.OooO00o(strTrim3);
                            } else if (METRIC_QUEUE_SIZE.equals(strTrim2)) {
                                Integer num = new Integer(strTrim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                metricQueueSize = num;
                            } else if (QUEUE_POLL_TIMEOUT_MILLI.equals(strTrim2)) {
                                Long l = new Long(strTrim3);
                                if (l.intValue() < 1000) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                queuePollTimeoutMilli = l;
                            } else if (METRIC_NAME_SPACE.equals(strTrim2)) {
                                metricNameSpace = strTrim3;
                            } else if (JVM_METRIC_NAME.equals(strTrim2)) {
                                jvmMetricName = strTrim3;
                            } else if (HOST_METRIC_NAME.equals(strTrim2)) {
                                hostMetricName = strTrim3;
                            } else {
                                LogFactory.OooO00o(AwsSdkMetrics.class).OooO0oO("Ignoring unrecognized parameter: " + strTrim);
                            }
                        } catch (Exception e) {
                            LogFactory.OooO00o(AwsSdkMetrics.class).OooO00o("Ignoring failure", e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z4 = true;
                }
            }
            machineMetricsExcluded = z2;
            perHostMetricsIncluded = z3;
            singleMetricNamespace = z4;
        }
        REGISTRY = new MetricRegistry();
    }

    public static void OooO00o(List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        MetricRegistry metricRegistry = REGISTRY;
        synchronized (metricRegistry.f12223OooO00o) {
            if (metricRegistry.f12223OooO00o.addAll(list)) {
                metricRegistry.f12224OooO0O0 = Collections.unmodifiableSet(new HashSet(metricRegistry.f12223OooO00o));
            }
        }
    }

    public static synchronized void OooO0O0() {
        if (dirtyEnabling) {
            throw new IllegalStateException("Reentrancy is not allowed");
        }
        dirtyEnabling = true;
        try {
            try {
                ((MetricCollector.Factory) Class.forName(DEFAULT_METRIC_COLLECTOR_FACTORY).newInstance()).OooO00o();
            } catch (Exception e) {
                LogFactory.OooO00o(AwsSdkMetrics.class).OooOO0O("Failed to enable the default metrics", e);
            }
            dirtyEnabling = false;
        } catch (Throwable th) {
            dirtyEnabling = false;
            throw th;
        }
    }

    public static <T extends RequestMetricCollector> T OooO0OO() {
        if (DEFAULT_METRICS_ENABLED) {
            OooO0O0();
        }
        return (T) RequestMetricCollector.f12225OooO00o;
    }
}
