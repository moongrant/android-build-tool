package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class MetricStorageRegistry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f33386OooO00o = new ConcurrentHashMap();

    public final <I extends MetricStorage> I OooO00o(I i) {
        MetricDescriptor metricDescriptorOooO0OO = i.OooO0OO();
        ConcurrentHashMap concurrentHashMap = this.f33386OooO00o;
        String lowerCase = metricDescriptorOooO0OO.OooO0OO().toLowerCase();
        Object obj = concurrentHashMap.get(lowerCase);
        if (obj == null) {
            concurrentHashMap.put(lowerCase, i);
            obj = i;
        }
        I i2 = (I) obj;
        if (!i2.OooO0OO().equals(metricDescriptorOooO0OO)) {
            throw new DuplicateMetricStorageException(i2.OooO0OO(), metricDescriptorOooO0OO, "Metric with same name and different descriptor already created.");
        }
        if (i.getClass().equals(i2.getClass())) {
            return i2;
        }
        throw new DuplicateMetricStorageException(i2.OooO0OO(), metricDescriptorOooO0OO, "Metric with same name and different instrument already created.");
    }
}
