package p143o00OOooo;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.yalla.album.AlbumActivity;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"Range"})
public final class OooOOO {
    public static Uri OooO00o(AlbumActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
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

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String OooO0O0(@Nullable Context context, @Nullable Uri uri) {
        long id;
        String string;
        String string2;
        try {
            Intrinsics.checkNotNull(uri);
            id = ContentUris.parseId(uri);
        } catch (Exception e) {
            e.printStackTrace();
            id = 0;
        }
        if (!((uri == null || (string2 = uri.toString()) == null) ? false : StringsKt__StringsKt.contains(string2, "media/external/images/media", true))) {
            if (((uri == null || (string = uri.toString()) == null) ? false : StringsKt__StringsKt.contains(string, "media/external/video/media", true)) && context != null && id > 0) {
                try {
                    Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_data"}, "_id=? ", new String[]{sb.toString()}, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        return string3;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else if (context != null && id > 0) {
            try {
                Uri uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(id);
                Cursor cursorQuery2 = context.getContentResolver().query(uri3, new String[]{"_data"}, "_id=? ", new String[]{sb2.toString()}, null);
                if (cursorQuery2 != null && cursorQuery2.moveToFirst()) {
                    String string4 = cursorQuery2.getString(cursorQuery2.getColumnIndex("_data"));
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return "";
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Uri OooO0OO(@NotNull Context context, @NotNull String filePath, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (z) {
            try {
                Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_id"}, "_data=? ", new String[]{filePath}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    Uri uri2 = Uri.parse("content://media/external/video/media");
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    return Uri.withAppendedPath(uri2, sb.toString());
                }
                ContentValues contentValues = new ContentValues();
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
                }
                String strSubstring = filePath.substring(StringsKt__StringsKt.lastIndexOf$default(filePath, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                contentValues.put("_display_name", strSubstring);
                return context.getContentResolver().insert(uri, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                Uri uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Cursor cursorQuery2 = context.getContentResolver().query(uri3, new String[]{"_id"}, "_data=? ", new String[]{filePath}, null);
                if (cursorQuery2 != null && cursorQuery2.moveToFirst()) {
                    int i2 = cursorQuery2.getInt(cursorQuery2.getColumnIndex("_id"));
                    Uri uri4 = Uri.parse("content://media/external/images/media");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    return Uri.withAppendedPath(uri4, sb2.toString());
                }
                ContentValues contentValues2 = new ContentValues();
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues2.put("relative_path", Environment.DIRECTORY_PICTURES);
                }
                String strSubstring2 = filePath.substring(StringsKt__StringsKt.lastIndexOf$default(filePath, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                contentValues2.put("_display_name", strSubstring2);
                return context.getContentResolver().insert(uri3, contentValues2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
