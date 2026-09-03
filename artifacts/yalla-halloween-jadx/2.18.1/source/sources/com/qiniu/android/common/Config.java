package com.qiniu.android.common;

import com.qiniu.android.utils.ContextGetter;
import com.yalla.yalla.common.model.ShopVehicleListModel;

/* JADX INFO: loaded from: classes2.dex */
public final class Config {
    public static int interval = 0;
    public static boolean isRecord = true;
    public static boolean isUpload = true;
    public static int maxRecordFileSize = 0;
    public static String preQueryHost00 = null;
    public static String preQueryHost01 = null;
    public static String recordDir = null;
    public static final String upLogURL = "uplog.qbox.me";
    public static int uploadThreshold;

    static {
        try {
            recordDir = ContextGetter.applicationContext().getCacheDir().getAbsolutePath();
        } catch (Throwable th) {
            th.fillInStackTrace();
        }
        maxRecordFileSize = 2097152;
        uploadThreshold = 4096;
        interval = 10;
        preQueryHost00 = "uc.qbox.me";
        preQueryHost01 = "api.qiniu.com";
    }

    public static void normal() {
        uploadThreshold = 4096;
        interval = 10;
    }

    public static void quick() {
        uploadThreshold = 1024;
        interval = 2;
    }

    public static void slow() {
        uploadThreshold = 153600;
        interval = ShopVehicleListModel.VehicleTagType_Vip300;
    }
}
