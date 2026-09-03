package com.qiniu.android.storage;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.net.Uri;
import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.collect.UploadInfoReporter;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.dns.DnsPrefetchTransaction;
import com.qiniu.android.http.metrics.UploadTaskMetrics;
import com.qiniu.android.utils.AsyncRun;
import com.qiniu.android.utils.Utils;
import com.qiniu.android.utils.Wait;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UploadManager {
    private final Configuration config;

    public UploadManager(Recorder recorder) {
        this(recorder, null);
    }

    private boolean checkAndNotifyError(String str, String str2, Object obj, UpCompletionHandler upCompletionHandler) {
        ResponseInfo responseInfoInvalidToken;
        if (upCompletionHandler == null) {
            throw new NullPointerException("complete handler is null");
        }
        if (obj == null) {
            responseInfoInvalidToken = ResponseInfo.zeroSize("no input data");
        } else if ((obj instanceof byte[]) && ((byte[]) obj).length == 0) {
            responseInfoInvalidToken = ResponseInfo.zeroSize("no input data");
        } else if ((obj instanceof File) && ((File) obj).length() == 0) {
            responseInfoInvalidToken = ResponseInfo.zeroSize("file is empty");
        } else if ((obj instanceof UploadSource) && ((UploadSource) obj).getSize() == 0) {
            responseInfoInvalidToken = ResponseInfo.zeroSize("file is empty");
        } else {
            responseInfoInvalidToken = (str2 == null || str2.length() == 0) ? ResponseInfo.invalidToken("no token") : null;
        }
        ResponseInfo responseInfo = responseInfoInvalidToken;
        if (responseInfo == null) {
            return false;
        }
        completeAction(str2, str, responseInfo, responseInfo.response, null, upCompletionHandler);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeAction(String str, final String str2, final ResponseInfo responseInfo, final JSONObject jSONObject, UploadTaskMetrics uploadTaskMetrics, final UpCompletionHandler upCompletionHandler) {
        reportQuality(str2, responseInfo, uploadTaskMetrics, str);
        if (upCompletionHandler != null) {
            final Wait wait = new Wait();
            AsyncRun.runInMain(new Runnable() { // from class: com.qiniu.android.storage.UploadManager.5
                @Override // java.lang.Runnable
                public void run() {
                    upCompletionHandler.complete(str2, responseInfo, jSONObject);
                    wait.stopWait();
                }
            });
            wait.startWait();
        }
    }

    private void putData(byte[] bArr, String str, String str2, final String str3, UploadOptions uploadOptions, final UpCompletionHandler upCompletionHandler) {
        UpToken upToken = UpToken.parse(str3);
        if (upToken == null || !upToken.isValid()) {
            completeAction(str3, str2, ResponseInfo.invalidToken("invalid token"), null, null, upCompletionHandler);
            return;
        }
        DnsPrefetchTransaction.addDnsCheckAndPrefetchTransaction(this.config.zone, upToken);
        AsyncRun.runInBack(new FormUpload(bArr, str2, str, upToken, uploadOptions, this.config, new BaseUpload.UpTaskCompletionHandler() { // from class: com.qiniu.android.storage.UploadManager.3
            @Override // com.qiniu.android.storage.BaseUpload.UpTaskCompletionHandler
            public void complete(ResponseInfo responseInfo, String str4, UploadTaskMetrics uploadTaskMetrics, JSONObject jSONObject) {
                UploadManager.this.completeAction(str3, str4, responseInfo, jSONObject, uploadTaskMetrics, upCompletionHandler);
            }
        }));
    }

    private void putSource(UploadSource uploadSource, String str, final String str2, UploadOptions uploadOptions, final UpCompletionHandler upCompletionHandler) {
        KeyGenerator keyGenerator;
        ResponseInfo responseInfoLocalIOError;
        byte[] bArr;
        if (checkAndNotifyError(str, str2, uploadSource, upCompletionHandler)) {
            return;
        }
        UpToken upToken = UpToken.parse(str2);
        if (upToken == null || !upToken.isValid()) {
            completeAction(str2, str, ResponseInfo.invalidToken("invalid token"), null, null, upCompletionHandler);
            return;
        }
        DnsPrefetchTransaction.addDnsCheckAndPrefetchTransaction(this.config.zone, upToken);
        if (uploadSource.getSize() <= 0 || uploadSource.getSize() > this.config.putThreshold) {
            Configuration configuration = this.config;
            String strGen = (configuration.recorder == null || (keyGenerator = configuration.keyGen) == null) ? str : keyGenerator.gen(str, uploadSource.getId());
            BaseUpload.UpTaskCompletionHandler upTaskCompletionHandler = new BaseUpload.UpTaskCompletionHandler() { // from class: com.qiniu.android.storage.UploadManager.4
                @Override // com.qiniu.android.storage.BaseUpload.UpTaskCompletionHandler
                public void complete(ResponseInfo responseInfo, String str3, UploadTaskMetrics uploadTaskMetrics, JSONObject jSONObject) {
                    UploadManager.this.completeAction(str2, str3, responseInfo, jSONObject, uploadTaskMetrics, upCompletionHandler);
                }
            };
            Configuration configuration2 = this.config;
            if (configuration2.useConcurrentResumeUpload) {
                AsyncRun.runInBack(new ConcurrentResumeUpload(uploadSource, str, upToken, uploadOptions, configuration2, configuration2.recorder, strGen, upTaskCompletionHandler));
                return;
            } else {
                AsyncRun.runInBack(new PartsUpload(uploadSource, str, upToken, uploadOptions, configuration2, configuration2.recorder, strGen, upTaskCompletionHandler));
                return;
            }
        }
        try {
            try {
                byte[] data = uploadSource.readData((int) uploadSource.getSize(), 0L);
                uploadSource.close();
                bArr = data;
                responseInfoLocalIOError = null;
            } catch (IOException e) {
                responseInfoLocalIOError = ResponseInfo.localIOError("get upload file data error:" + e.getMessage());
                uploadSource.close();
                bArr = null;
            }
            if (responseInfoLocalIOError == null) {
                putData(bArr, uploadSource.getFileName(), str, str2, uploadOptions, upCompletionHandler);
            } else {
                completeAction(str2, str, responseInfoLocalIOError, null, null, upCompletionHandler);
            }
        } catch (Throwable th) {
            uploadSource.close();
            throw th;
        }
    }

    private void reportQuality(String str, ResponseInfo responseInfo, UploadTaskMetrics uploadTaskMetrics, String str2) {
        UpToken upToken = UpToken.parse(str2);
        if (upToken == null || !upToken.isValid()) {
            return;
        }
        if (uploadTaskMetrics == null) {
            uploadTaskMetrics = new UploadTaskMetrics(null);
        }
        ReportItem reportItem = new ReportItem();
        reportItem.setReport(ReportItem.LogTypeQuality, "log_type");
        reportItem.setReport(Long.valueOf(Utils.currentTimestamp() / 1000), "up_time");
        reportItem.setReport(ReportItem.qualityResult(responseInfo), ReportItem.QualityKeyResult);
        reportItem.setReport(str, "target_key");
        reportItem.setReport(upToken.bucket, "target_bucket");
        reportItem.setReport(Long.valueOf(uploadTaskMetrics.totalElapsedTime()), "total_elapsed_time");
        reportItem.setReport(uploadTaskMetrics.requestCount(), ReportItem.QualityKeyRequestsCount);
        reportItem.setReport(uploadTaskMetrics.regionCount(), ReportItem.QualityKeyRegionsCount);
        reportItem.setReport(uploadTaskMetrics.bytesSend(), "bytes_sent");
        reportItem.setReport(Utils.systemName(), "os_name");
        reportItem.setReport(Utils.systemVersion(), "os_version");
        reportItem.setReport(Utils.sdkLanguage(), "sdk_name");
        reportItem.setReport(Utils.sdkVerion(), "sdk_version");
        String strRequestReportErrorType = ReportItem.requestReportErrorType(responseInfo);
        reportItem.setReport(strRequestReportErrorType, "error_type");
        if (responseInfo != null && strRequestReportErrorType != null) {
            String str3 = responseInfo.error;
            if (str3 == null) {
                str3 = responseInfo.message;
            }
            reportItem.setReport(str3, "error_description");
        }
        UploadInfoReporter.getInstance().report(reportItem, str2);
    }

    public void put(byte[] bArr, String str, String str2, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (checkAndNotifyError(str, str2, bArr, upCompletionHandler)) {
            return;
        }
        putData(bArr, null, str, str2, uploadOptions, upCompletionHandler);
    }

    public ResponseInfo syncPut(byte[] bArr, String str, String str2, UploadOptions uploadOptions) {
        final Wait wait = new Wait();
        final ArrayList arrayList = new ArrayList();
        UpCompletionHandler upCompletionHandler = new UpCompletionHandler() { // from class: com.qiniu.android.storage.UploadManager.1
            @Override // com.qiniu.android.storage.UpCompletionHandler
            public void complete(String str3, ResponseInfo responseInfo, JSONObject jSONObject) {
                if (responseInfo != null) {
                    arrayList.add(responseInfo);
                }
                wait.stopWait();
            }
        };
        if (!checkAndNotifyError(str, str2, bArr, upCompletionHandler)) {
            putData(bArr, null, str, str2, uploadOptions, upCompletionHandler);
        }
        wait.startWait();
        if (arrayList.size() > 0) {
            return (ResponseInfo) arrayList.get(0);
        }
        return null;
    }

    public UploadManager(Recorder recorder, KeyGenerator keyGenerator) {
        this(new Configuration.Builder().recorder(recorder, keyGenerator).build());
    }

    public UploadManager() {
        this(new Configuration.Builder().build());
    }

    public void put(String str, String str2, String str3, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (checkAndNotifyError(str2, str3, str, upCompletionHandler)) {
            return;
        }
        put(new File(str), str2, str3, upCompletionHandler, uploadOptions);
    }

    public UploadManager(Configuration configuration) {
        this.config = configuration == null ? new Configuration.Builder().build() : configuration;
        DnsPrefetchTransaction.addDnsLocalLoadTransaction();
        DnsPrefetchTransaction.setDnsCheckWhetherCachedValidTransactionAction();
    }

    public void put(File file, String str, String str2, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (checkAndNotifyError(str, str2, file, upCompletionHandler)) {
            return;
        }
        putSource(new UploadSourceFile(file), str, str2, uploadOptions, upCompletionHandler);
    }

    @TargetApi(19)
    public void put(Uri uri, ContentResolver contentResolver, String str, String str2, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (checkAndNotifyError(str, str2, uri, upCompletionHandler)) {
            return;
        }
        putSource(new UploadSourceUri(uri, contentResolver), str, str2, uploadOptions, upCompletionHandler);
    }

    public void put(InputStream inputStream, String str, long j, String str2, String str3, String str4, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (checkAndNotifyError(str3, str4, inputStream, upCompletionHandler)) {
            return;
        }
        UploadSourceStream uploadSourceStream = new UploadSourceStream(inputStream);
        uploadSourceStream.setId(str);
        uploadSourceStream.setSize(j);
        uploadSourceStream.setFileName(str2);
        putSource(uploadSourceStream, str3, str4, uploadOptions, upCompletionHandler);
    }

    public ResponseInfo syncPut(String str, String str2, String str3, UploadOptions uploadOptions) {
        return syncPut(new File(str), str2, str3, uploadOptions);
    }

    public ResponseInfo syncPut(File file, String str, String str2, UploadOptions uploadOptions) {
        return syncPut(new UploadSourceFile(file), str, str2, uploadOptions);
    }

    @TargetApi(19)
    public ResponseInfo syncPut(Uri uri, ContentResolver contentResolver, String str, String str2, UploadOptions uploadOptions) {
        return syncPut(new UploadSourceUri(uri, contentResolver), str, str2, uploadOptions);
    }

    public ResponseInfo syncPut(InputStream inputStream, String str, long j, String str2, String str3, String str4, UploadOptions uploadOptions) {
        UploadSourceStream uploadSourceStream = new UploadSourceStream(inputStream);
        uploadSourceStream.setId(str);
        uploadSourceStream.setSize(j);
        uploadSourceStream.setFileName(str2);
        return syncPut(new UploadSourceStream(inputStream), str3, str4, uploadOptions);
    }

    private ResponseInfo syncPut(UploadSource uploadSource, String str, String str2, UploadOptions uploadOptions) {
        final Wait wait = new Wait();
        final ArrayList arrayList = new ArrayList();
        UpCompletionHandler upCompletionHandler = new UpCompletionHandler() { // from class: com.qiniu.android.storage.UploadManager.2
            @Override // com.qiniu.android.storage.UpCompletionHandler
            public void complete(String str3, ResponseInfo responseInfo, JSONObject jSONObject) {
                if (responseInfo != null) {
                    arrayList.add(responseInfo);
                }
                wait.stopWait();
            }
        };
        if (!checkAndNotifyError(str, str2, uploadSource, upCompletionHandler)) {
            putSource(uploadSource, str, str2, uploadOptions, upCompletionHandler);
        }
        wait.startWait();
        if (arrayList.size() > 0) {
            return (ResponseInfo) arrayList.get(0);
        }
        return null;
    }
}
