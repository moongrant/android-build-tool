package com.amazonaws.services.s3.metrics;

import com.amazonaws.metrics.SimpleMetricType;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class S3ServiceMetric extends SimpleMetricType {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final S3ServiceMetric[] f10684Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final AnonymousClass1 f10685Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final AnonymousClass2 f10686Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f10687Oooo0o;

    public static abstract class S3ThroughputMetric extends S3ServiceMetric {
        public S3ThroughputMetric(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazonaws.services.s3.metrics.S3ServiceMetric$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.amazonaws.services.s3.metrics.S3ServiceMetric$2] */
    static {
        ?? r0 = new S3ThroughputMetric(OooO00o("DownloadThroughput")) { // from class: com.amazonaws.services.s3.metrics.S3ServiceMetric.1
        };
        f10685Oooo0oO = r0;
        S3ServiceMetric s3ServiceMetric = new S3ServiceMetric(OooO00o("DownloadByteCount"));
        ?? r2 = new S3ThroughputMetric(OooO00o("UploadThroughput")) { // from class: com.amazonaws.services.s3.metrics.S3ServiceMetric.2
        };
        f10686Oooo0oo = r2;
        f10684Oooo = new S3ServiceMetric[]{r0, s3ServiceMetric, r2, new S3ServiceMetric(OooO00o("UploadByteCount"))};
    }

    public S3ServiceMetric(String str) {
        this.f10687Oooo0o = str;
    }

    public static final String OooO00o(String str) {
        return OooOo00.OooO0Oo("S3", str);
    }

    @Override // com.amazonaws.metrics.MetricType
    public final String name() {
        return this.f10687Oooo0o;
    }
}
