package com.qiniu.android.http.request;

import OooO00o.OooO00o;
import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.collect.UploadInfoReporter;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.connectCheck.ConnectChecker;
import com.qiniu.android.http.dns.DnsPrefetcher;
import com.qiniu.android.http.metrics.UploadSingleRequestMetrics;
import com.qiniu.android.http.networkStatus.NetworkStatusManager;
import com.qiniu.android.http.request.handler.CheckCancelHandler;
import com.qiniu.android.http.request.handler.RequestProgressHandler;
import com.qiniu.android.http.request.handler.RequestShouldRetryHandler;
import com.qiniu.android.http.request.httpclient.SystemHttpClient;
import com.qiniu.android.storage.Configuration;
import com.qiniu.android.storage.UpToken;
import com.qiniu.android.storage.UploadOptions;
import com.qiniu.android.utils.LogUtil;
import com.qiniu.android.utils.StringUtils;
import com.qiniu.android.utils.Utils;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class HttpSingleRequest {
    private IRequestClient client;
    private final Configuration config;
    private int currentRetryTime = 0;
    private final UploadRequestInfo requestInfo;
    private ArrayList<UploadSingleRequestMetrics> requestMetricsList;
    private final UploadRequestState requestState;
    private final UpToken token;
    private final UploadOptions uploadOption;

    public interface RequestCompleteHandler {
        void complete(ResponseInfo responseInfo, ArrayList<UploadSingleRequestMetrics> arrayList, JSONObject jSONObject);
    }

    public HttpSingleRequest(Configuration configuration, UploadOptions uploadOptions, UpToken upToken, UploadRequestInfo uploadRequestInfo, UploadRequestState uploadRequestState) {
        this.config = configuration;
        this.uploadOption = uploadOptions;
        this.token = upToken;
        this.requestInfo = uploadRequestInfo;
        this.requestState = uploadRequestState;
    }

    public static /* synthetic */ int access$612(HttpSingleRequest httpSingleRequest, int i) {
        int i2 = httpSingleRequest.currentRetryTime + i;
        httpSingleRequest.currentRetryTime = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void completeAction(IUploadServer iUploadServer, ResponseInfo responseInfo, JSONObject jSONObject, UploadSingleRequestMetrics uploadSingleRequestMetrics, RequestCompleteHandler requestCompleteHandler) {
        if (this.client == null) {
            return;
        }
        this.client = null;
        updateHostNetworkStatus(responseInfo, iUploadServer, uploadSingleRequestMetrics);
        reportRequest(responseInfo, iUploadServer, uploadSingleRequestMetrics);
        if (requestCompleteHandler != null) {
            requestCompleteHandler.complete(responseInfo, this.requestMetricsList, jSONObject);
        }
    }

    private void reportRequest(ResponseInfo responseInfo, IUploadServer iUploadServer, UploadSingleRequestMetrics uploadSingleRequestMetrics) {
        UploadRequestInfo uploadRequestInfo;
        UpToken upToken = this.token;
        if (upToken == null || !upToken.isValid() || (uploadRequestInfo = this.requestInfo) == null || !uploadRequestInfo.shouldReportRequestLog() || uploadSingleRequestMetrics == null) {
            return;
        }
        long jCurrentTimestamp = Utils.currentTimestamp();
        ReportItem reportItem = new ReportItem();
        reportItem.setReport("request", "log_type");
        reportItem.setReport(Long.valueOf(jCurrentTimestamp / 1000), "up_time");
        reportItem.setReport(ReportItem.requestReportStatusCode(responseInfo), ReportItem.RequestKeyStatusCode);
        String str = null;
        reportItem.setReport(responseInfo != null ? responseInfo.reqId : null, ReportItem.RequestKeyRequestId);
        Request request = uploadSingleRequestMetrics.request;
        reportItem.setReport(request != null ? request.host : null, ReportItem.RequestKeyHost);
        reportItem.setReport(uploadSingleRequestMetrics.remoteAddress, ReportItem.RequestKeyRemoteIp);
        reportItem.setReport(uploadSingleRequestMetrics.remotePort, ReportItem.RequestKeyPort);
        reportItem.setReport(this.requestInfo.bucket, "target_bucket");
        reportItem.setReport(this.requestInfo.key, "target_key");
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalElapsedTime()), "total_elapsed_time");
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalDnsTime()), ReportItem.RequestKeyDnsElapsedTime);
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalConnectTime()), ReportItem.RequestKeyConnectElapsedTime);
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalSecureConnectTime()), ReportItem.RequestKeyTLSConnectElapsedTime);
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalRequestTime()), ReportItem.RequestKeyRequestElapsedTime);
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalWaitTime()), ReportItem.RequestKeyWaitElapsedTime);
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalWaitTime()), ReportItem.RequestKeyResponseElapsedTime);
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalResponseTime()), ReportItem.RequestKeyResponseElapsedTime);
        reportItem.setReport(this.requestInfo.fileOffset, ReportItem.RequestKeyFileOffset);
        reportItem.setReport(uploadSingleRequestMetrics.bytesSend(), "bytes_sent");
        reportItem.setReport(Long.valueOf(uploadSingleRequestMetrics.totalBytes()), ReportItem.RequestKeyBytesTotal);
        reportItem.setReport(Utils.getCurrentProcessID(), "pid");
        reportItem.setReport(Utils.getCurrentThreadID(), "tid");
        reportItem.setReport(this.requestInfo.targetRegionId, "target_region_id");
        reportItem.setReport(this.requestInfo.currentRegionId, "current_region_id");
        String strRequestReportErrorType = ReportItem.requestReportErrorType(responseInfo);
        reportItem.setReport(strRequestReportErrorType, "error_type");
        if (responseInfo != null && strRequestReportErrorType != null && (str = responseInfo.error) == null) {
            str = responseInfo.message;
        }
        reportItem.setReport(str, "error_description");
        reportItem.setReport(this.requestInfo.requestType, ReportItem.RequestKeyUpType);
        reportItem.setReport(Utils.systemName(), "os_name");
        reportItem.setReport(Utils.systemVersion(), "os_version");
        reportItem.setReport(Utils.sdkLanguage(), "sdk_name");
        reportItem.setReport(Utils.sdkVerion(), "sdk_version");
        reportItem.setReport(Long.valueOf(jCurrentTimestamp), "client_time");
        reportItem.setReport(Utils.getCurrentNetworkType(), "network_type");
        reportItem.setReport(Utils.getCurrentSignalStrength(), ReportItem.RequestKeySignalStrength);
        reportItem.setReport(iUploadServer.getSource(), ReportItem.RequestKeyPrefetchedDnsSource);
        if (iUploadServer.getIpPrefetchedTime() != null) {
            reportItem.setReport(Long.valueOf(iUploadServer.getIpPrefetchedTime().longValue() - jCurrentTimestamp), ReportItem.RequestKeyPrefetchedBefore);
        }
        reportItem.setReport(DnsPrefetcher.getInstance().lastPrefetchErrorMessage, ReportItem.RequestKeyPrefetchedErrorMessage);
        reportItem.setReport(uploadSingleRequestMetrics.clientName, ReportItem.RequestKeyHttpClient);
        reportItem.setReport(uploadSingleRequestMetrics.clientVersion, ReportItem.RequestKeyHttpClientVersion);
        UploadSingleRequestMetrics uploadSingleRequestMetrics2 = uploadSingleRequestMetrics.connectCheckMetrics;
        if (uploadSingleRequestMetrics2 != null) {
            Locale locale = Locale.ENGLISH;
            String str2 = String.format(locale, "%d", Long.valueOf(uploadSingleRequestMetrics2.totalElapsedTime()));
            ResponseInfo responseInfo2 = uploadSingleRequestMetrics.connectCheckMetrics.response;
            reportItem.setReport(String.format("duration:%s status_code:%s", str2, responseInfo2 != null ? String.format(locale, "%d", Integer.valueOf(responseInfo2.statusCode)) : ""), ReportItem.RequestKeyNetworkMeasuring);
        }
        reportItem.setReport(uploadSingleRequestMetrics.httpVersion, ReportItem.RequestKeyHttpVersion);
        UploadInfoReporter.getInstance().report(reportItem, this.token.token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retryRequest(final Request request, final IUploadServer iUploadServer, final boolean z, final RequestShouldRetryHandler requestShouldRetryHandler, final RequestProgressHandler requestProgressHandler, final RequestCompleteHandler requestCompleteHandler) {
        if (iUploadServer.isHttp3()) {
            this.client = new SystemHttpClient();
        } else {
            this.client = new SystemHttpClient();
        }
        final CheckCancelHandler checkCancelHandler = new CheckCancelHandler() { // from class: com.qiniu.android.http.request.HttpSingleRequest.1
            @Override // com.qiniu.android.http.request.handler.CheckCancelHandler
            public boolean checkCancel() {
                boolean zIsUserCancel = HttpSingleRequest.this.requestState.isUserCancel();
                return (zIsUserCancel || HttpSingleRequest.this.uploadOption.cancellationSignal == null) ? zIsUserCancel : HttpSingleRequest.this.uploadOption.cancellationSignal.isCancelled();
            }
        };
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("key:");
        sbOooO0o0.append(StringUtils.toNonnullString(this.requestInfo.key));
        sbOooO0o0.append(" retry:");
        sbOooO0o0.append(this.currentRetryTime);
        sbOooO0o0.append(" url:");
        sbOooO0o0.append(StringUtils.toNonnullString(request.urlString));
        sbOooO0o0.append(" ip:");
        sbOooO0o0.append(StringUtils.toNonnullString(request.ip));
        LogUtil.i(sbOooO0o0.toString());
        this.client.request(request, z, this.config.proxy, new IRequestClient.RequestClientProgress() { // from class: com.qiniu.android.http.request.HttpSingleRequest.2
            @Override // com.qiniu.android.http.request.IRequestClient.RequestClientProgress
            public void progress(long j, long j2) {
                if (checkCancelHandler.checkCancel()) {
                    HttpSingleRequest.this.requestState.setUserCancel(true);
                    if (HttpSingleRequest.this.client != null) {
                        HttpSingleRequest.this.client.cancel();
                        return;
                    }
                    return;
                }
                RequestProgressHandler requestProgressHandler2 = requestProgressHandler;
                if (requestProgressHandler2 != null) {
                    requestProgressHandler2.progress(j, j2);
                }
            }
        }, new IRequestClient.RequestClientCompleteHandler() { // from class: com.qiniu.android.http.request.HttpSingleRequest.3
            @Override // com.qiniu.android.http.request.IRequestClient.RequestClientCompleteHandler
            public void complete(ResponseInfo responseInfo, UploadSingleRequestMetrics uploadSingleRequestMetrics, JSONObject jSONObject) {
                if (uploadSingleRequestMetrics != null) {
                    HttpSingleRequest.this.requestMetricsList.add(uploadSingleRequestMetrics);
                }
                if (HttpSingleRequest.this.shouldCheckConnect(responseInfo)) {
                    UploadSingleRequestMetrics uploadSingleRequestMetricsCheck = ConnectChecker.check();
                    if (uploadSingleRequestMetrics != null) {
                        uploadSingleRequestMetrics.connectCheckMetrics = uploadSingleRequestMetricsCheck;
                    }
                    if (!ConnectChecker.isConnected(uploadSingleRequestMetricsCheck)) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("check origin statusCode:");
                        sbOooO0o1.append(responseInfo.statusCode);
                        sbOooO0o1.append(" error:");
                        sbOooO0o1.append(responseInfo.error);
                        responseInfo = ResponseInfo.errorInfo(ResponseInfo.NetworkSlow, sbOooO0o1.toString());
                    }
                }
                ResponseInfo responseInfo2 = responseInfo;
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("key:");
                sbOooO0o2.append(StringUtils.toNonnullString(HttpSingleRequest.this.requestInfo.key));
                sbOooO0o2.append(" response:");
                sbOooO0o2.append(StringUtils.toNonnullString(responseInfo2));
                LogUtil.i(sbOooO0o2.toString());
                RequestShouldRetryHandler requestShouldRetryHandler2 = requestShouldRetryHandler;
                if (requestShouldRetryHandler2 == null || !requestShouldRetryHandler2.shouldRetry(responseInfo2, jSONObject) || HttpSingleRequest.this.currentRetryTime >= HttpSingleRequest.this.config.retryMax || !responseInfo2.couldHostRetry()) {
                    HttpSingleRequest.this.completeAction(iUploadServer, responseInfo2, jSONObject, uploadSingleRequestMetrics, requestCompleteHandler);
                    return;
                }
                HttpSingleRequest.access$612(HttpSingleRequest.this, 1);
                try {
                    Thread.sleep(HttpSingleRequest.this.config.retryInterval);
                } catch (InterruptedException unused) {
                }
                HttpSingleRequest.this.retryRequest(request, iUploadServer, z, requestShouldRetryHandler, requestProgressHandler, requestCompleteHandler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldCheckConnect(ResponseInfo responseInfo) {
        int i;
        return responseInfo != null && ((i = responseInfo.statusCode) == -1 || i == -1001 || i == -1003 || i == -1004 || i == -1005 || i == -1009 || responseInfo.isTlsError());
    }

    private void updateHostNetworkStatus(ResponseInfo responseInfo, IUploadServer iUploadServer, UploadSingleRequestMetrics uploadSingleRequestMetrics) {
        if (uploadSingleRequestMetrics == null) {
            return;
        }
        long jLongValue = uploadSingleRequestMetrics.bytesSend().longValue();
        long j = uploadSingleRequestMetrics.totalElapsedTime();
        if (j <= 0 || jLongValue < 1048576) {
            return;
        }
        String networkStatusType = NetworkStatusManager.getNetworkStatusType(iUploadServer.getHost(), iUploadServer.getIp());
        NetworkStatusManager.getInstance().updateNetworkStatus(networkStatusType, (int) ((jLongValue * 1000) / j));
    }

    public void request(Request request, IUploadServer iUploadServer, boolean z, RequestShouldRetryHandler requestShouldRetryHandler, RequestProgressHandler requestProgressHandler, RequestCompleteHandler requestCompleteHandler) {
        this.currentRetryTime = 0;
        this.requestMetricsList = new ArrayList<>();
        retryRequest(request, iUploadServer, z, requestShouldRetryHandler, requestProgressHandler, requestCompleteHandler);
    }
}
