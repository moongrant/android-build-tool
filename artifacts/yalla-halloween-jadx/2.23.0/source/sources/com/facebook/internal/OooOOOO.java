package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m4131filterExcludeBufferFiles$lambda0(file, str);
    }
}
