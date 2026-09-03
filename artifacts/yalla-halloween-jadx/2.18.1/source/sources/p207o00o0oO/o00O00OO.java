package p207o00o0oO;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.umeng.analytics.pro.ao;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO {
    public static Uri OooO00o(Context context, String str) {
        Uri uri = Uri.parse("content://media/external/images/media");
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, "bucket_display_name");
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            if (str.equals(cursorQuery.getString(cursorQuery.getColumnIndex("_data")))) {
                return Uri.withAppendedPath(uri, "" + cursorQuery.getInt(cursorQuery.getColumnIndex(ao.d)));
            }
            cursorQuery.moveToNext();
        }
        return null;
    }
}
