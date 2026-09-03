package com.zego.zegoavkit2.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class ZegoLogUtil {
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public static String getLogPath(Context context) {
        String externalStorageState;
        File file;
        File filesDir;
        File externalFilesDir;
        if (context == null) {
            return null;
        }
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Exception e) {
            e.printStackTrace();
            externalStorageState = null;
        }
        if (!"mounted".equals(externalStorageState) || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            file = null;
        } else {
            String absolutePath = externalFilesDir.getAbsolutePath();
            if (TextUtils.isEmpty(absolutePath)) {
                file = null;
            } else {
                file = new File(absolutePath);
            }
        }
        if (file == null && (filesDir = context.getFilesDir()) != null) {
            String absolutePath2 = filesDir.getAbsolutePath();
            if (!TextUtils.isEmpty(absolutePath2)) {
                file = new File(absolutePath2);
            }
        }
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
            if (!file.exists()) {
                return null;
            }
        }
        return file.getAbsolutePath().toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public static String getTemporaryFolder(Context context) {
        File file;
        File cacheDir;
        File externalCacheDir;
        if (context == null) {
            return null;
        }
        if (!Environment.getExternalStorageState().equals("mounted") || (externalCacheDir = context.getExternalCacheDir()) == null) {
            file = null;
        } else {
            String absolutePath = externalCacheDir.getAbsolutePath();
            if (TextUtils.isEmpty(absolutePath)) {
                file = null;
            } else {
                file = new File(absolutePath);
            }
        }
        if (file == null && (cacheDir = context.getCacheDir()) != null) {
            String absolutePath2 = cacheDir.getAbsolutePath();
            if (!TextUtils.isEmpty(absolutePath2)) {
                file = new File(absolutePath2);
            }
        }
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
            if (!file.exists()) {
                return null;
            }
        }
        return file.getAbsolutePath().toString();
    }
}
