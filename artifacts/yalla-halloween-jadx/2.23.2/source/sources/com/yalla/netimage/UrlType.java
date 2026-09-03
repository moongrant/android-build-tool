package com.yalla.netimage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface UrlType {
    public static final int ASSERTS = 3;
    public static final int BITMAP_BYTE = 6;
    public static final int FILE = 4;
    public static final int FILE_PATH = 5;
    public static final int RAW = 2;
    public static final int RES = 1;
    public static final int URI = 0;
}
