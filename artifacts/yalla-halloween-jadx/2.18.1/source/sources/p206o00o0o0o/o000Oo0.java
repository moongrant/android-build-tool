package p206o00o0o0o;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.umeng.analytics.pro.ao;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 {
    public static Uri OooO00o(Context context) {
        try {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            ContentValues contentValues = new ContentValues();
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            }
            contentValues.put("_display_name", System.currentTimeMillis() + ".jpg");
            return context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO0O0(Context context, Uri uri) {
        long id;
        try {
            id = ContentUris.parseId(uri);
        } catch (Exception e) {
            e.printStackTrace();
            id = 0;
        }
        if (context == null || id <= 0) {
            return "";
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_data"}, "_id=? ", new String[]{id + ""}, null);
            return (cursorQuery == null || !cursorQuery.moveToFirst()) ? "" : cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static Uri OooO0OO(Context context, String str) {
        try {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{ao.d}, "_data=? ", new String[]{str}, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                }
                contentValues.put("_display_name", str.substring(str.lastIndexOf("/") + 1));
                return context.getContentResolver().insert(uri, contentValues);
            }
            int i = cursorQuery.getInt(cursorQuery.getColumnIndex(ao.d));
            return Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
