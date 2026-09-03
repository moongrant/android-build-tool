package com.common.support.apm.logger;

import com.common.support.apm.xlog.entity.MetricModel;
import com.common.support.apm.xlog.entity.TraceModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/common/support/apm/logger/OtlpLogger;", "", "writeMetricLog", "", "metricModel", "Lcom/common/support/apm/xlog/entity/MetricModel;", "writeTraceLog", "traceModel", "Lcom/common/support/apm/xlog/entity/TraceModel;", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface OtlpLogger {
    void writeMetricLog(@NotNull MetricModel metricModel);

    void writeTraceLog(@NotNull TraceModel traceModel);
}
