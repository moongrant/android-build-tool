package com.common.support.apm.xlog;

/* JADX INFO: loaded from: classes2.dex */
class Xlog {
    public static final int APPENDER_MODE_ASYNC = 0;
    public static final int APPENDER_MODE_SYNC = 1;
    public static final int COMPRESS_LEVEL1 = 1;
    public static final int COMPRESS_LEVEL2 = 2;
    public static final int COMPRESS_LEVEL3 = 3;
    public static final int COMPRESS_LEVEL4 = 4;
    public static final int COMPRESS_LEVEL5 = 5;
    public static final int COMPRESS_LEVEL6 = 6;
    public static final int COMPRESS_LEVEL7 = 7;
    public static final int COMPRESS_LEVEL8 = 8;
    public static final int COMPRESS_LEVEL9 = 9;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_MODE = 1;

    public static class XLogConfig {
        public String cachedir;
        public String logdir;
        public String nameprefix;
        public int mode = 0;
        public String pubkey = "";
        public int compressmode = 0;
        public int compresslevel = 0;
        public int cachedays = 0;
        public long filesize = 0;
        public long filealivetime = 0;
    }

    private static native void appenderOpen(XLogConfig xLogConfig);

    public static void loadLib() {
        System.loadLibrary("c++_shared");
        System.loadLibrary("marsxlog");
    }

    public static void open(XLogConfig xLogConfig) {
        appenderOpen(xLogConfig);
    }

    public native void appenderClose();

    public native boolean appenderFlush(boolean z);

    public native String logFileExt();

    public native void logWrite(byte[] bArr);

    public native void setAppenderMode(int i);

    public native boolean setMaxAliveTime(long j);

    public native boolean setMaxFileSize(long j);

    public static void open(String str, String str2, String str3) {
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.mode = 0;
        xLogConfig.logdir = str;
        xLogConfig.nameprefix = str2;
        xLogConfig.pubkey = str3;
        xLogConfig.compressmode = 1;
        xLogConfig.compresslevel = 7;
        xLogConfig.cachedir = "";
        xLogConfig.cachedays = 0;
        xLogConfig.filesize = XlogWriter.DEFAULT_MAX_FILE_SIZE;
        xLogConfig.filealivetime = XlogWriter.DEFAULT_MAX_ALIVE_TIME;
        open(xLogConfig);
    }
}
