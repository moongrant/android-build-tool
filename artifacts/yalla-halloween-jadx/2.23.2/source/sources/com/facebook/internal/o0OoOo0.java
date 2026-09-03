package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OoOo0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return Utility.m4141refreshBestGuessNumberOfCPUCores$lambda4(file, str);
    }
}
