package com.app.upload;

import android.content.Context;
import com.app.upload.qiniu.QiNiuImageInfoList;
import com.app.upload.qiniu.QiNiuImageInfoSingleAsyncTask;
import com.app.upload.qiniu.QiNiuImageUrlHelper;
import com.app.upload.qiniu.QiNiuUploadList;
import com.app.upload.qiniu.QiNiuUploadSingle;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class Upload {
    private static Context appContext;

    public static File getAndroidData() {
        Context context = appContext;
        if (context != null) {
            return context.getExternalCacheDir();
        }
        return null;
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static QiNiuImageInfoList getImageInfoList() {
        return new QiNiuImageInfoList();
    }

    public static QiNiuImageInfoSingleAsyncTask getImageInfoSingle() {
        return new QiNiuImageInfoSingleAsyncTask();
    }

    public static QiNiuUploadList getUploadList(String str) {
        return new QiNiuUploadList(str);
    }

    public static QiNiuUploadSingle getUploadSingle(String str) {
        return new QiNiuUploadSingle(str);
    }

    public static void init(Context context, String str) {
        init(context, false, str, str);
    }

    public static void init(Context context, boolean z, String str, String str2) {
        appContext = context;
        QiNiuImageUrlHelper.initQiNiuHost(z, str, str2);
    }
}
