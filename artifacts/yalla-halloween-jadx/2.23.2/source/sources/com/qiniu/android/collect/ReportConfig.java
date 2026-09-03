package com.qiniu.android.collect;

import com.qiniu.android.common.Config;
import com.qiniu.android.utils.Utils;

/* JADX INFO: loaded from: classes3.dex */
public class ReportConfig {
    private static ReportConfig instance = new ReportConfig();
    public long maxRecordFileSize;
    public final String recordDirectory;
    public final int timeoutInterval;
    public long uploadThreshold;
    public boolean isReportEnable = Config.isRecord;
    public long interval = 10;
    public final String serverURL = Config.upLogURL;

    private ReportConfig() {
        String str = Config.recordDir;
        if (str != null) {
            this.recordDirectory = str;
        } else {
            this.recordDirectory = Utils.sdkDirectory() + "/report";
        }
        this.maxRecordFileSize = Config.maxRecordFileSize;
        this.uploadThreshold = Config.uploadThreshold;
        this.timeoutInterval = Config.interval;
    }

    public static ReportConfig getInstance() {
        return instance;
    }
}
