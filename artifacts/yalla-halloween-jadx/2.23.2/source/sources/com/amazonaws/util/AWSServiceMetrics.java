package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public enum AWSServiceMetrics implements MetricType {
    HttpClientGetConnectionTime;

    private final String serviceName = "HttpClient";
}
