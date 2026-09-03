package com.qiniu.android.collect;

import com.qiniu.android.common.ZoneInfo;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadRegionRequestMetrics;
import com.qiniu.android.http.request.RequestTransaction;
import com.qiniu.android.storage.UpToken;
import com.qiniu.android.utils.AsyncRun;
import com.qiniu.android.utils.LogUtil;
import com.qiniu.android.utils.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public class UploadInfoReporter {
    private static UploadInfoReporter instance = new UploadInfoReporter();
    private String X_Log_Client_Id;
    private RequestTransaction transaction;
    private ReportConfig config = ReportConfig.getInstance();
    private long lastReportTime = 0;
    private File recordDirectory = new File(this.config.recordDirectory);
    private File recorderFile = new File(o0O00o0.OooO0O0(new StringBuilder(), this.config.recordDirectory, "/qiniu.log"));
    private File recorderTempFile = new File(o0O00o0.OooO0O0(new StringBuilder(), this.config.recordDirectory, "/qiniuTemp.log"));
    private boolean isReporting = false;

    private UploadInfoReporter() {
    }

    private boolean checkReportAvailable() {
        ReportConfig reportConfig = this.config;
        if (!reportConfig.isReportEnable) {
            return false;
        }
        if (reportConfig.maxRecordFileSize > reportConfig.uploadThreshold) {
            return true;
        }
        LogUtil.e("maxRecordFileSize must be larger than uploadThreshold");
        return false;
    }

    private void cleanRecorderFile() {
        if (this.recorderFile.exists()) {
            this.recorderFile.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanTempLogFile() {
        if (this.recorderTempFile.exists()) {
            this.recorderTempFile.delete();
        }
    }

    private RequestTransaction createUploadRequestTransaction(String str) {
        UpToken upToken;
        if (this.config == null || (upToken = UpToken.parse(str)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.config.serverURL);
        RequestTransaction requestTransaction = new RequestTransaction(arrayList, ZoneInfo.EmptyRegionId, upToken);
        this.transaction = requestTransaction;
        return requestTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyTransactionResource() {
        this.transaction = null;
    }

    public static UploadInfoReporter getInstance() {
        return instance;
    }

    private byte[] getLogData() throws Throwable {
        RandomAccessFile randomAccessFile;
        File file = this.recorderTempFile;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        byteArray = null;
        byteArray = null;
        RandomAccessFile randomAccessFile2 = null;
        byteArray = null;
        if (file != null && file.length() != 0) {
            int length = (int) this.recorderTempFile.length();
            try {
                randomAccessFile = new RandomAccessFile(this.recorderTempFile, "r");
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
                    byte[] bArr = new byte[length];
                    while (true) {
                        int i = randomAccessFile.read(bArr);
                        if (i < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (FileNotFoundException unused) {
                    if (randomAccessFile != null) {
                    }
                    return byteArray;
                } catch (IOException unused2) {
                    if (randomAccessFile != null) {
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                randomAccessFile = null;
            } catch (IOException unused5) {
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused6) {
            }
        }
        return byteArray;
    }

    private void reportToServer(String str) {
        byte[] logData;
        this.isReporting = true;
        RequestTransaction requestTransactionCreateUploadRequestTransaction = createUploadRequestTransaction(str);
        if (requestTransactionCreateUploadRequestTransaction == null || (logData = getLogData()) == null || logData.length == 0) {
            return;
        }
        requestTransactionCreateUploadRequestTransaction.reportLog(logData, this.X_Log_Client_Id, true, new RequestTransaction.RequestCompleteHandler() { // from class: com.qiniu.android.collect.UploadInfoReporter.2
            @Override // com.qiniu.android.http.request.RequestTransaction.RequestCompleteHandler
            public void complete(ResponseInfo responseInfo, UploadRegionRequestMetrics uploadRegionRequestMetrics, JSONObject jSONObject) {
                Map<String, String> map;
                if (responseInfo.isOK()) {
                    UploadInfoReporter.this.lastReportTime = new Date().getTime();
                    if (UploadInfoReporter.this.X_Log_Client_Id == null && (map = responseInfo.responseHeader) != null && map.get("x-log-client-id") != null) {
                        UploadInfoReporter.this.X_Log_Client_Id = responseInfo.responseHeader.get("x-log-client-id");
                    }
                    UploadInfoReporter.this.cleanTempLogFile();
                }
                UploadInfoReporter.this.isReporting = false;
                UploadInfoReporter.this.destroyTransactionResource();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    public void reportToServerIfNeeded(String str) {
        if (this.isReporting) {
            return;
        }
        long time = new Date().getTime();
        boolean z = true;
        if (!this.recorderTempFile.exists()) {
            long length = this.recorderFile.length();
            ReportConfig reportConfig = this.config;
            if (length <= reportConfig.uploadThreshold) {
                long j = this.lastReportTime;
                if (j != 0 && time - j <= reportConfig.interval * 60) {
                    z = false;
                } else if (!this.recorderFile.renameTo(this.recorderTempFile)) {
                    z = false;
                }
            } else if (!this.recorderFile.renameTo(this.recorderTempFile)) {
                z = false;
            }
        }
        if (!z || this.isReporting) {
            return;
        }
        reportToServer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveReportJsonString(String str) throws Throwable {
        if (this.recordDirectory.exists() || this.recordDirectory.mkdirs()) {
            if (!this.recordDirectory.isDirectory()) {
                LogUtil.e("recordDirectory is not a directory");
                return;
            }
            if (!this.recorderFile.exists()) {
                try {
                    if (!this.recorderFile.createNewFile()) {
                        return;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (this.recorderFile.length() > this.config.maxRecordFileSize) {
                return;
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.recorderFile, true);
                    try {
                        fileOutputStream2.write((str + "\n").getBytes());
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (FileNotFoundException unused) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                            return;
                        }
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                            return;
                        }
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
            } catch (FileNotFoundException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void clean() {
        cleanRecorderFile();
        cleanTempLogFile();
    }

    public synchronized void report(ReportItem reportItem, final String str) {
        if (reportItem == null) {
            return;
        }
        final String json = reportItem.toJson();
        if (checkReportAvailable() && json != null) {
            AsyncRun.runInBack(new Runnable() { // from class: com.qiniu.android.collect.UploadInfoReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.i("up log:" + StringUtils.toNonnullString(json));
                    synchronized (this) {
                        UploadInfoReporter.this.saveReportJsonString(json);
                        UploadInfoReporter.this.reportToServerIfNeeded(str);
                    }
                }
            });
        }
    }
}
