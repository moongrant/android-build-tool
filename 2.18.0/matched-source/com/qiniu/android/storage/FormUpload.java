package com.qiniu.android.storage;

import OooO00o.OooO00o;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadRegionRequestMetrics;
import com.qiniu.android.http.request.RequestTransaction;
import com.qiniu.android.http.request.handler.RequestProgressHandler;
import com.qiniu.android.utils.LogUtil;
import com.qiniu.android.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class FormUpload extends BaseUpload {
    private boolean isAsync;
    private final UpProgress upProgress;
    private RequestTransaction uploadTransaction;

    public FormUpload(byte[] bArr, String str, String str2, UpToken upToken, UploadOptions uploadOptions, Configuration configuration, BaseUpload.UpTaskCompletionHandler upTaskCompletionHandler) {
        super(bArr, str, str2, upToken, uploadOptions, configuration, upTaskCompletionHandler);
        this.isAsync = true;
        this.upProgress = new UpProgress(this.option.progressHandler);
    }

    @Override // com.qiniu.android.storage.BaseUpload
    public void startToUpload() {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("key:");
        sbOooO0O0.append(StringUtils.toNonnullString(this.key));
        sbOooO0O0.append(" form上传");
        LogUtil.i(sbOooO0O0.toString());
        this.uploadTransaction = new RequestTransaction(this.config, this.option, getTargetRegion(), getCurrentRegion(), this.key, this.token);
        this.uploadTransaction.uploadFormData(this.data, this.fileName, this.isAsync, new RequestProgressHandler() { // from class: com.qiniu.android.storage.FormUpload.1
            @Override // com.qiniu.android.http.request.handler.RequestProgressHandler
            public void progress(long j, long j2) {
                FormUpload.this.upProgress.progress(FormUpload.this.key, j, j2);
            }
        }, new RequestTransaction.RequestCompleteHandler() { // from class: com.qiniu.android.storage.FormUpload.2
            @Override // com.qiniu.android.http.request.RequestTransaction.RequestCompleteHandler
            public void complete(ResponseInfo responseInfo, UploadRegionRequestMetrics uploadRegionRequestMetrics, JSONObject jSONObject) {
                FormUpload.this.addRegionRequestMetricsOfOneFlow(uploadRegionRequestMetrics);
                if (!responseInfo.isOK()) {
                    if (FormUpload.this.switchRegionAndUploadIfNeededWithErrorResponse(responseInfo)) {
                        return;
                    }
                    FormUpload.this.completeAction(responseInfo, jSONObject);
                } else {
                    UpProgress upProgress = FormUpload.this.upProgress;
                    FormUpload formUpload = FormUpload.this;
                    upProgress.notifyDone(formUpload.key, formUpload.data.length);
                    FormUpload.this.completeAction(responseInfo, jSONObject);
                }
            }
        });
    }
}
