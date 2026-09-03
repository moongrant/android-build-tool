package com.qiniu.android.http.connectCheck;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadSingleRequestMetrics;
import com.qiniu.android.http.request.IRequestClient;
import com.qiniu.android.http.request.Request;
import com.qiniu.android.http.request.httpclient.SystemHttpClient;
import com.qiniu.android.storage.GlobalConfiguration;
import com.qiniu.android.utils.LogUtil;
import com.qiniu.android.utils.SingleFlight;
import com.qiniu.android.utils.Wait;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectChecker {
    private static SingleFlight<UploadSingleRequestMetrics> singleFlight = new SingleFlight<>();

    public interface CheckCompleteHandler {
        void complete(UploadSingleRequestMetrics uploadSingleRequestMetrics);
    }

    public static class CheckResult {
        private UploadSingleRequestMetrics metrics;

        private CheckResult() {
        }
    }

    public static class CheckStatus {
        private int completeCount;
        private boolean isCompleted;
        private boolean isConnected;
        private int totalCount;

        private CheckStatus() {
            this.totalCount = 0;
            this.completeCount = 0;
            this.isCompleted = false;
            this.isConnected = false;
        }

        public static /* synthetic */ int access$512(CheckStatus checkStatus, int i) {
            int i2 = checkStatus.completeCount + i;
            checkStatus.completeCount = i2;
            return i2;
        }
    }

    public static UploadSingleRequestMetrics check() {
        final CheckResult checkResult = new CheckResult();
        final Wait wait = new Wait();
        check(new CheckCompleteHandler() { // from class: com.qiniu.android.http.connectCheck.ConnectChecker.1
            @Override // com.qiniu.android.http.connectCheck.ConnectChecker.CheckCompleteHandler
            public void complete(UploadSingleRequestMetrics uploadSingleRequestMetrics) {
                checkResult.metrics = uploadSingleRequestMetrics;
                wait.stopWait();
            }
        });
        wait.startWait();
        return checkResult.metrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkAllHosts(final CheckCompleteHandler checkCompleteHandler) {
        String[] strArr = GlobalConfiguration.getInstance().connectCheckURLStrings;
        if (strArr == null) {
            checkCompleteHandler.complete(null);
            return;
        }
        String[] strArr2 = (String[]) strArr.clone();
        final CheckStatus checkStatus = new CheckStatus();
        checkStatus.totalCount = strArr2.length;
        checkStatus.completeCount = 0;
        checkStatus.isCompleted = false;
        for (String str : strArr2) {
            checkHost(str, new CheckCompleteHandler() { // from class: com.qiniu.android.http.connectCheck.ConnectChecker.4
                @Override // com.qiniu.android.http.connectCheck.ConnectChecker.CheckCompleteHandler
                public void complete(UploadSingleRequestMetrics uploadSingleRequestMetrics) {
                    boolean zIsConnected = ConnectChecker.isConnected(uploadSingleRequestMetrics);
                    synchronized (checkStatus) {
                        CheckStatus.access$512(checkStatus, 1);
                    }
                    if (zIsConnected) {
                        checkStatus.isConnected = true;
                    }
                    if (!zIsConnected && checkStatus.completeCount != checkStatus.totalCount) {
                        LogUtil.i("== check all hosts not completed totalCount:" + checkStatus.totalCount + " completeCount:" + checkStatus.completeCount);
                        return;
                    }
                    synchronized (checkStatus) {
                        if (checkStatus.isCompleted) {
                            LogUtil.i("== check all hosts has completed totalCount:" + checkStatus.totalCount + " completeCount:" + checkStatus.completeCount);
                            return;
                        }
                        LogUtil.i("== check all hosts completed totalCount:" + checkStatus.totalCount + " completeCount:" + checkStatus.completeCount);
                        checkStatus.isCompleted = true;
                        checkCompleteHandler.complete(uploadSingleRequestMetrics);
                    }
                }
            });
        }
    }

    private static void checkHost(final String str, final CheckCompleteHandler checkCompleteHandler) {
        Request request = new Request(str, "HEAD", null, null, GlobalConfiguration.getInstance().connectCheckTimeout);
        SystemHttpClient systemHttpClient = new SystemHttpClient();
        LogUtil.i("== checkHost:" + str);
        systemHttpClient.request(request, true, null, null, new IRequestClient.RequestClientCompleteHandler() { // from class: com.qiniu.android.http.connectCheck.ConnectChecker.5
            @Override // com.qiniu.android.http.request.IRequestClient.RequestClientCompleteHandler
            public void complete(ResponseInfo responseInfo, UploadSingleRequestMetrics uploadSingleRequestMetrics, JSONObject jSONObject) {
                LogUtil.i("== checkHost:" + str + " responseInfo:" + responseInfo);
                checkCompleteHandler.complete(uploadSingleRequestMetrics);
            }
        });
    }

    public static boolean isConnected(UploadSingleRequestMetrics uploadSingleRequestMetrics) {
        ResponseInfo responseInfo;
        return (uploadSingleRequestMetrics == null || (responseInfo = uploadSingleRequestMetrics.response) == null || responseInfo.statusCode <= 99) ? false : true;
    }

    private static void check(final CheckCompleteHandler checkCompleteHandler) {
        try {
            singleFlight.perform("connect_check", new SingleFlight.ActionHandler<UploadSingleRequestMetrics>() { // from class: com.qiniu.android.http.connectCheck.ConnectChecker.2
                @Override // com.qiniu.android.utils.SingleFlight.ActionHandler
                public void action(final SingleFlight.CompleteHandler<UploadSingleRequestMetrics> completeHandler) throws Exception {
                    ConnectChecker.checkAllHosts(new CheckCompleteHandler() { // from class: com.qiniu.android.http.connectCheck.ConnectChecker.2.1
                        @Override // com.qiniu.android.http.connectCheck.ConnectChecker.CheckCompleteHandler
                        public void complete(UploadSingleRequestMetrics uploadSingleRequestMetrics) {
                            completeHandler.complete(uploadSingleRequestMetrics);
                        }
                    });
                }
            }, new SingleFlight.CompleteHandler<UploadSingleRequestMetrics>() { // from class: com.qiniu.android.http.connectCheck.ConnectChecker.3
                @Override // com.qiniu.android.utils.SingleFlight.CompleteHandler
                public void complete(UploadSingleRequestMetrics uploadSingleRequestMetrics) {
                    checkCompleteHandler.complete(uploadSingleRequestMetrics);
                }
            });
        } catch (Exception unused) {
            checkCompleteHandler.complete(null);
        }
    }
}
