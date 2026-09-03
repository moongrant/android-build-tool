package com.qiniu.android.http.request;

import com.qiniu.android.http.ProxyConfiguration;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadSingleRequestMetrics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IRequestClient {

    public interface RequestClientCompleteHandler {
        void complete(ResponseInfo responseInfo, UploadSingleRequestMetrics uploadSingleRequestMetrics, JSONObject jSONObject);
    }

    public interface RequestClientProgress {
        void progress(long j, long j2);
    }

    void cancel();

    void request(Request request, boolean z, ProxyConfiguration proxyConfiguration, RequestClientProgress requestClientProgress, RequestClientCompleteHandler requestClientCompleteHandler);
}
