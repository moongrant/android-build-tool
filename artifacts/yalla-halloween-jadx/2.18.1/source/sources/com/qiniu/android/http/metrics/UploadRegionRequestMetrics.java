package com.qiniu.android.http.metrics;

import com.qiniu.android.http.request.IUploadRegion;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class UploadRegionRequestMetrics {
    private List<UploadSingleRequestMetrics> metricsList = new CopyOnWriteArrayList();
    public final IUploadRegion region;

    public UploadRegionRequestMetrics(IUploadRegion iUploadRegion) {
        this.region = iUploadRegion;
    }

    public void addMetrics(UploadRegionRequestMetrics uploadRegionRequestMetrics) {
        IUploadRegion iUploadRegion;
        IUploadRegion iUploadRegion2;
        List<UploadSingleRequestMetrics> list;
        if (uploadRegionRequestMetrics == null || (iUploadRegion = uploadRegionRequestMetrics.region) == null || iUploadRegion.getZoneInfo() == null || uploadRegionRequestMetrics.region.getZoneInfo().regionId == null || (iUploadRegion2 = this.region) == null || iUploadRegion2.getZoneInfo() == null || this.region.getZoneInfo().regionId == null || (list = uploadRegionRequestMetrics.metricsList) == null || list.size() == 0 || !uploadRegionRequestMetrics.region.getZoneInfo().getRegionId().equals(uploadRegionRequestMetrics.region.getZoneInfo().getRegionId())) {
            return;
        }
        addMetricsList(uploadRegionRequestMetrics.metricsList);
    }

    public void addMetricsList(List<UploadSingleRequestMetrics> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (UploadSingleRequestMetrics uploadSingleRequestMetrics : list) {
            if (uploadSingleRequestMetrics != null) {
                this.metricsList.add(uploadSingleRequestMetrics);
            }
        }
    }

    public Long bytesSend() {
        long jLongValue = 0;
        if (this.metricsList.size() == 0) {
            return 0L;
        }
        for (UploadSingleRequestMetrics uploadSingleRequestMetrics : this.metricsList) {
            if (uploadSingleRequestMetrics != null) {
                jLongValue = uploadSingleRequestMetrics.bytesSend().longValue() + jLongValue;
            }
        }
        return Long.valueOf(jLongValue);
    }

    public Integer requestCount() {
        return Integer.valueOf(this.metricsList.size());
    }

    public long totalElapsedTime() {
        long j = 0;
        if (this.metricsList.size() == 0) {
            return 0L;
        }
        for (UploadSingleRequestMetrics uploadSingleRequestMetrics : this.metricsList) {
            if (uploadSingleRequestMetrics != null) {
                j = uploadSingleRequestMetrics.totalElapsedTime() + j;
            }
        }
        return j;
    }
}
