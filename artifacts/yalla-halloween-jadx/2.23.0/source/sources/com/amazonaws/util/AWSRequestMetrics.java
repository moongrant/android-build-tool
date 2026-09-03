package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AWSRequestMetrics {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TimingInfo f9568OooO00o;

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
        this.f9568OooO00o = new TimingInfo(System.nanoTime(), null);
    }

    public void OooO00o(Field field, Serializable serializable) {
    }

    public void OooO0O0(Field field) {
    }

    public void OooO0OO(Field field) {
    }

    public void OooO0Oo() {
    }

    public void OooO0o(Field field) {
    }

    public void OooO0o0(Field field, long j) {
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.f9568OooO00o = timingInfo;
    }
}
