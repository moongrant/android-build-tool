package com.common.support.apm.xlog.entity;

import com.common.support.sailfish_commons.logmodels.BaseModel;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/common/support/apm/xlog/entity/MetricModel;", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", "metrics", "", "Lio/opentelemetry/sdk/metrics/data/MetricData;", "(Ljava/util/Collection;)V", "getMetrics", "()Ljava/util/Collection;", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MetricModel extends BaseModel {

    @NotNull
    private final Collection<MetricData> metrics;

    /* JADX WARN: Multi-variable type inference failed */
    public MetricModel(@NotNull Collection<? extends MetricData> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
    }

    @NotNull
    public final Collection<MetricData> getMetrics() {
        return this.metrics;
    }
}
