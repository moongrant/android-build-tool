package com.zego.ve;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public class FileMediaDataSource {
    private static final String TAG = "FileMediaDataSource";
    private int uriFd = -1;

    private int initDataSource(Context context, String str, boolean z) throws FileNotFoundException {
        Log.d(TAG, "initDataSource enter, uri: " + str);
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String str2 = z ? "r" : "rw";
        if (!TextUtils.isEmpty(scheme) && !scheme.equalsIgnoreCase("content") && !scheme.equalsIgnoreCase(ShareInternalUtility.STAGING_PARAM)) {
            Log.e(TAG, "Invalid path:  " + str);
            return -2;
        }
        try {
            this.uriFd = context.getContentResolver().openFileDescriptor(uri, str2).detachFd();
            Log.d(TAG, "Open file: " + uri.getPath() + " successful, get fd " + this.uriFd);
            return this.uriFd;
        } catch (FileNotFoundException e) {
            Log.d(TAG, "Open file: " + uri.getPath() + " failed with exception: " + e.getMessage());
            return -1;
        }
    }
}
