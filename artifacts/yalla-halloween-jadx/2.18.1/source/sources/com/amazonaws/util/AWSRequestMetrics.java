package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetrics {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TimingInfo f11165OooO00o;

    public enum Field implements MetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    public AWSRequestMetrics() {
        System.currentTimeMillis();
        this.f11165OooO00o = new TimingInfo(System.nanoTime(), null);
    }

    public void OooO00o(MetricType metricType, Object obj) {
    }

    public void OooO0O0(MetricType metricType) {
    }

    public void OooO0OO(MetricType metricType) {
    }

    public void OooO0Oo() {
    }

    public void OooO0o(MetricType metricType) {
    }

    public void OooO0o0(MetricType metricType, long j) {
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.f11165OooO00o = timingInfo;
    }
}
