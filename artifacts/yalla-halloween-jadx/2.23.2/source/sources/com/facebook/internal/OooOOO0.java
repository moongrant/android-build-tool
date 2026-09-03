package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m4133filterExcludeBufferFiles$lambda0(file, str);
    }
}
