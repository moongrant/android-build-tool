package com.qiniu.android.http.metrics;

import com.qiniu.android.common.ZoneInfo;
import com.qiniu.android.http.request.IUploadRegion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class UploadTaskMetrics {
    private Map<String, UploadRegionRequestMetrics> metricsInfo = new ConcurrentHashMap();
    public ArrayList<IUploadRegion> regions;

    public UploadTaskMetrics(ArrayList<IUploadRegion> arrayList) {
        this.regions = arrayList;
    }

    public void addMetrics(UploadRegionRequestMetrics uploadRegionRequestMetrics) {
        IUploadRegion iUploadRegion;
        if (uploadRegionRequestMetrics == null || (iUploadRegion = uploadRegionRequestMetrics.region) == null || iUploadRegion.getZoneInfo() == null || uploadRegionRequestMetrics.region.getZoneInfo().regionId == null) {
            return;
        }
        String str = uploadRegionRequestMetrics.region.getZoneInfo().regionId;
        UploadRegionRequestMetrics uploadRegionRequestMetrics2 = this.metricsInfo.get(str);
        if (uploadRegionRequestMetrics2 != null) {
            uploadRegionRequestMetrics2.addMetrics(uploadRegionRequestMetrics);
        } else {
            this.metricsInfo.put(str, uploadRegionRequestMetrics);
        }
    }

    public Long bytesSend() {
        Iterator<String> it = this.metricsInfo.keySet().iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            UploadRegionRequestMetrics uploadRegionRequestMetrics = this.metricsInfo.get(it.next());
            if (uploadRegionRequestMetrics != null) {
                jLongValue = uploadRegionRequestMetrics.bytesSend().longValue() + jLongValue;
            }
        }
        return Long.valueOf(jLongValue);
    }

    public Long regionCount() {
        IUploadRegion iUploadRegion;
        Iterator<String> it = this.metricsInfo.keySet().iterator();
        long j = 0;
        while (it.hasNext()) {
            UploadRegionRequestMetrics uploadRegionRequestMetrics = this.metricsInfo.get(it.next());
            if (uploadRegionRequestMetrics != null && (iUploadRegion = uploadRegionRequestMetrics.region) != null && iUploadRegion.getZoneInfo() != null && !uploadRegionRequestMetrics.region.getZoneInfo().regionId.equals(ZoneInfo.EmptyRegionId)) {
                j++;
            }
        }
        return Long.valueOf(j);
    }

    public Long requestCount() {
        Iterator<String> it = this.metricsInfo.keySet().iterator();
        long jIntValue = 0;
        while (it.hasNext()) {
            UploadRegionRequestMetrics uploadRegionRequestMetrics = this.metricsInfo.get(it.next());
            if (uploadRegionRequestMetrics != null) {
                jIntValue += (long) uploadRegionRequestMetrics.requestCount().intValue();
            }
        }
        return Long.valueOf(jIntValue);
    }

    public long totalElapsedTime() {
        Iterator<String> it = this.metricsInfo.keySet().iterator();
        long j = 0;
        while (it.hasNext()) {
            UploadRegionRequestMetrics uploadRegionRequestMetrics = this.metricsInfo.get(it.next());
            if (uploadRegionRequestMetrics != null) {
                j = uploadRegionRequestMetrics.totalElapsedTime() + j;
            }
        }
        return j;
    }
}
