package com.zego.ve;

import OooO00o.OooO00o;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Open file: ");
            sbOooO0o0.append(uri.getPath());
            sbOooO0o0.append(" successful, get fd ");
            sbOooO0o0.append(this.uriFd);
            Log.d(TAG, sbOooO0o0.toString());
            return this.uriFd;
        } catch (FileNotFoundException e) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Open file: ");
            sbOooO0o1.append(uri.getPath());
            sbOooO0o1.append(" failed with exception: ");
            sbOooO0o1.append(e.getMessage());
            Log.d(TAG, sbOooO0o1.toString());
            return -1;
        }
    }
}
