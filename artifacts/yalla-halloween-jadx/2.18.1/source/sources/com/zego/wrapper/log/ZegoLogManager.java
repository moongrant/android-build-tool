package com.zego.wrapper.log;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ZegoLogManager {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = "ZegoLogManager";
    public static final int TRACE_ALL = 3;
    public static final int TRACE_OFFLINE = 2;
    public static final int TRACE_REALTIME = 1;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private int mLogLevelSaveFile = 3;
    private int mLogLevelSaveList = 3;
    private int mLogLevelLogcat = 3;

    public static class LogManagerHolder {
        private static final ZegoLogManager sInstance = new ZegoLogManager();

        private LogManagerHolder() {
        }
    }

    public static ZegoLogManager getInstance() {
        return LogManagerHolder.sInstance;
    }

    public List<ZegoLogInfo> getLogInfoList() {
        if (ZLog.isEnable()) {
            ZLog.getLogger().setSaveLogToListLevel(this.mLogLevelSaveList);
            return ZLog.getLogger().getLogInfoList();
        }
        Log.e(TAG, "not yet start traceType，please call startTrace method first");
        return null;
    }

    public void setLogLevelLogcat(int i) {
        this.mLogLevelLogcat = i;
    }

    public void setLogLevelSaveFile(int i) {
        this.mLogLevelSaveFile = i;
    }

    public void setLogLevelSaveList(int i) {
        this.mLogLevelSaveList = i;
    }

    public boolean startTrace(Context context, int i) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            Log.e(TAG, "init Log Manager false!! shared storage is not currently available.");
            return false;
        }
        if (ZLog.trace(i, externalFilesDir.getAbsolutePath(), this.mLogLevelSaveFile, this.mLogLevelLogcat)) {
            return true;
        }
        Log.e(TAG, "init Log Manager false!! mkdirs return false");
        return false;
    }
}
