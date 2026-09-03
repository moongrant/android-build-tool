package com.qiniu.android.storage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
interface UploadSource {
    public static final long UnknownSourceSize = -1;

    void close();

    boolean couldReloadSource();

    String getFileName();

    String getId();

    long getSize();

    byte[] readData(int i, long j) throws IOException;

    boolean reloadSource();
}
