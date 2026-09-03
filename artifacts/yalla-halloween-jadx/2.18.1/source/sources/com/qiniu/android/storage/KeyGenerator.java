package com.qiniu.android.storage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface KeyGenerator {
    @Deprecated
    String gen(String str, File file);

    String gen(String str, String str2);
}
