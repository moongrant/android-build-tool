package com.amazonaws.services.s3.metrics;

import com.amazonaws.metrics.SimpleMetricType;

/* JADX INFO: loaded from: classes2.dex */
public class S3ServiceMetric extends SimpleMetricType {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final S3ServiceMetric[] f9344OooO0o0 = {new AnonymousClass1(OooO00o("DownloadThroughput")), new S3ServiceMetric(OooO00o("DownloadByteCount")), new AnonymousClass2(OooO00o("UploadThroughput")), new S3ServiceMetric(OooO00o("UploadByteCount"))};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f9345OooO0Oo;

    /* JADX INFO: renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$1, reason: invalid class name */
    public static class AnonymousClass1 extends S3ThroughputMetric {
    }

    /* JADX INFO: renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$2, reason: invalid class name */
    public static class AnonymousClass2 extends S3ThroughputMetric {
    }

    public static abstract class S3ThroughputMetric extends S3ServiceMetric {
    }

    public S3ServiceMetric(String str) {
        this.f9345OooO0Oo = str;
    }

    public static final String OooO00o(String str) {
        return "S3".concat(str);
    }

    @Override // com.amazonaws.metrics.MetricType
    public final String name() {
        return this.f9345OooO0Oo;
    }
}
