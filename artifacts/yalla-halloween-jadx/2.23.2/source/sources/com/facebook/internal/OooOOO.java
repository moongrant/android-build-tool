package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m4134filterExcludeNonBufferFiles$lambda1(file, str);
    }
}
