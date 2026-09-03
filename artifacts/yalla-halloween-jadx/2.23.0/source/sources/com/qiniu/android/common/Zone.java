package com.qiniu.android.common;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadRegionRequestMetrics;
import com.qiniu.android.storage.UpToken;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Zone {

    public interface QueryHandler {
        void complete(int i, ResponseInfo responseInfo, UploadRegionRequestMetrics uploadRegionRequestMetrics);
    }

    public abstract ZonesInfo getZonesInfo(UpToken upToken);

    public abstract void preQuery(UpToken upToken, QueryHandler queryHandler);
}
