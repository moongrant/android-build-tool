package p454o0Ooo0;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static SimpleDateFormat f40366OooO00o = new SimpleDateFormat("yyyyMMdd_HHmmssSS");

    public static void OooO00o(Context context, Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        if (uri == null || uri.toString().isEmpty()) {
            return;
        }
        String string = null;
        if (uri.toString().startsWith("content://")) {
            context.getContentResolver().delete(uri, null, null);
            return;
        }
        String scheme = uri.getScheme();
        if (scheme == null || ShareInternalUtility.STAGING_PARAM.equals(scheme)) {
            string = uri.getPath();
        } else if ("content".equals(scheme) && (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) != null) {
            if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
                string = cursorQuery.getString(columnIndex);
            }
            cursorQuery.close();
        }
        File file = new File(string);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c A[PHI: r8
      0x004c: PHI (r8v7 android.database.Cursor) = (r8v6 android.database.Cursor), (r8v8 android.database.Cursor) binds: [B:19:0x004a, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static String OooO0O0(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        IllegalArgumentException e;
        Cursor cursorQuery;
        ?? r7 = 0;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        Log.i("FileUtils", String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", e.getMessage()));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                r7 = context;
                th = th;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public static String OooO0OO(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(CertificateUtil.DELIMITER);
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return OooO0O0(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e) {
                        Log.i("FileUtils", e.getMessage());
                        return null;
                    }
                }
            } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(CertificateUtil.DELIMITER);
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return OooO0O0(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return "com.google.android.apps.photos.content".equals(uri.getAuthority()) ? uri.getLastPathSegment() : OooO0O0(context, uri, null, null);
            }
            if (ShareInternalUtility.STAGING_PARAM.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }
}
