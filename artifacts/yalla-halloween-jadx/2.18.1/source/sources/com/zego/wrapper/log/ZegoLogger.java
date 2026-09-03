package com.zego.wrapper.log;

import android.util.Log;
import com.zego.zegoliveroom.ZegoLiveRoom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class ZegoLogger {
    private static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int TRACE_ALL = 3;
    public static final int TRACE_OFFLINE = 2;
    public static final int TRACE_REAL_TIME = 1;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private int traceType = 1;
    private int levelToSaveLogToFile = 3;
    private boolean isSaveLogToList = false;
    private int levelToSaveLogToList = 3;
    private int levelToLogcat = 3;
    private final Object mLogLock = new Object();
    private String logFileName = null;
    private List<ZegoLogInfo> logInfoList = new LinkedList();

    private ZegoLogger() {
    }

    private synchronized void addLogInfo(ZegoLogInfo zegoLogInfo) {
        if (this.isSaveLogToList && zegoLogInfo.getLogLevel() >= this.levelToSaveLogToList) {
            if (this.logInfoList.size() >= 1000) {
                this.logInfoList.remove(0);
            }
            this.logInfoList.add(zegoLogInfo);
        }
    }

    public static ZegoLogger getLogger() {
        return new ZegoLogger();
    }

    private String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private synchronized void printlnLogInfo(ZegoLogInfo zegoLogInfo) {
        if ((this.traceType & 2) > 0 && zegoLogInfo.getLogLevel() >= this.levelToSaveLogToFile) {
            ZegoLiveRoom._logPrint(0, "%1$s - %2$s - %3$s", zegoLogInfo.getLogLevelEmoji(), zegoLogInfo.getLogTag(), zegoLogInfo.getLogMsg());
        }
    }

    public int d(String str, String str2) {
        int iD = ((this.traceType & 1) <= 0 || 3 < this.levelToLogcat) ? 0 : Log.d(str, str2);
        ZegoLogInfo zegoLogInfo = new ZegoLogInfo(3, str, str2);
        printlnLogInfo(zegoLogInfo);
        addLogInfo(zegoLogInfo);
        return iD;
    }

    public int e(String str, String str2) {
        int iE = ((this.traceType & 1) <= 0 || 6 < this.levelToLogcat) ? 0 : Log.e(str, str2);
        ZegoLogInfo zegoLogInfo = new ZegoLogInfo(6, str, str2);
        printlnLogInfo(zegoLogInfo);
        addLogInfo(zegoLogInfo);
        return iE;
    }

    public List<ZegoLogInfo> getLogInfoList() {
        return this.logInfoList;
    }

    public int i(String str, String str2) {
        int i = ((this.traceType & 1) <= 0 || 4 < this.levelToLogcat) ? 0 : Log.i(str, str2);
        ZegoLogInfo zegoLogInfo = new ZegoLogInfo(4, str, str2);
        printlnLogInfo(zegoLogInfo);
        addLogInfo(zegoLogInfo);
        return i;
    }

    public void setSaveLogToListLevel(int i) {
        this.isSaveLogToList = true;
        if (this.levelToSaveLogToList == i) {
            return;
        }
        this.levelToSaveLogToList = i;
        this.logInfoList.clear();
    }

    public boolean trace(int i, String str, int i2, int i3) {
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("param traceLevel invalid");
        }
        int i4 = i & 2;
        if (i4 != 0 && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("offline traceType levelToSaveLogToFile should with valid logPath");
        }
        if (i4 != 0) {
            this.logFileName = str;
            this.levelToSaveLogToFile = i2;
        }
        if ((i & 1) != 0) {
            this.levelToLogcat = i3;
        }
        this.traceType = i;
        return true;
    }

    public int v(String str, String str2) {
        int iV = ((this.traceType & 1) <= 0 || 2 < this.levelToLogcat) ? 0 : Log.v(str, str2);
        ZegoLogInfo zegoLogInfo = new ZegoLogInfo(2, str, str2);
        printlnLogInfo(zegoLogInfo);
        addLogInfo(zegoLogInfo);
        return iV;
    }

    public int w(String str, String str2) {
        int iW = ((this.traceType & 1) <= 0 || 5 < this.levelToLogcat) ? 0 : Log.w(str, str2);
        ZegoLogInfo zegoLogInfo = new ZegoLogInfo(5, str, str2);
        printlnLogInfo(zegoLogInfo);
        addLogInfo(zegoLogInfo);
        return iW;
    }

    public int d(String str, Throwable th) {
        return d(str, getStackTraceString(th));
    }

    public int e(String str, Throwable th) {
        return e(str, getStackTraceString(th));
    }

    public int i(String str, Throwable th) {
        return i(str, getStackTraceString(th));
    }

    public int v(String str, Throwable th) {
        return v(str, getStackTraceString(th));
    }

    public int w(String str, Throwable th) {
        return w(str, getStackTraceString(th));
    }
}
