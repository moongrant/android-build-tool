package p143o00OOooo;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.fragment.app.FragmentActivity;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    public static final class OooO00o {
        @JvmStatic
        @Nullable
        public static String OooO00o(@NotNull Context context, @Nullable Uri uri) {
            Cursor cursorQuery;
            int columnIndex;
            Intrinsics.checkNotNullParameter(context, "context");
            String string = null;
            if (uri == null) {
                return null;
            }
            String scheme = uri.getScheme();
            if (scheme == null) {
                return uri.getPath();
            }
            if (Intrinsics.areEqual(ShareInternalUtility.STAGING_PARAM, scheme)) {
                return uri.getPath();
            }
            if (!Intrinsics.areEqual("content", scheme) || (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
                return null;
            }
            if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
                string = cursorQuery.getString(columnIndex);
            }
            cursorQuery.close();
            return string;
        }

        @Nullable
        public static Uri OooO0O0(@NotNull FragmentActivity context, @NotNull String imagePath) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Uri uri = Uri.parse("content://media/external/images/media");
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, "bucket_display_name");
            Intrinsics.checkNotNull(cursorQuery);
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                if (Intrinsics.areEqual(imagePath, cursorQuery.getString(cursorQuery.getColumnIndex("_data")))) {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    return Uri.withAppendedPath(uri, sb.toString());
                }
                cursorQuery.moveToNext();
            }
            return null;
        }
    }

    @JvmStatic
    public static final void OooO00o(@NotNull FragmentActivity context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri != null) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (string.length() == 0) {
                return;
            }
            String string2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (StringsKt__StringsJVMKt.startsWith$default(string2, "content://", false, 2, null)) {
                context.getContentResolver().delete(uri, null, null);
                return;
            }
            File file = new File(OooO00o.OooO00o(context, uri));
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }
}
