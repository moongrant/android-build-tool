package p586o0oOooOo;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class q {
    @Nullable
    public static BitmapFactory.Options OooO00o(@NotNull Context mContext, @NotNull String imagePath) {
        Uri uriOooO0O0;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            if (Build.VERSION.SDK_INT < 29 || (uriOooO0O0 = OooO0O0(mContext, imagePath)) == null) {
                BitmapFactory.decodeFile(imagePath, options);
            } else {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mContext.getContentResolver().openFileDescriptor(uriOooO0O0, "r");
                Intrinsics.checkNotNull(parcelFileDescriptorOpenFileDescriptor);
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return options;
    }

    @Nullable
    public static Uri OooO0O0(@NotNull Context context, @NotNull String imagePath) {
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

    @Nullable
    public static String OooO0OO(@Nullable Bitmap bitmap, @Nullable File file) {
        if (bitmap == null) {
            return null;
        }
        int iHashCode = bitmap.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(iHashCode);
        String tempPicName = sb.toString();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(tempPicName, "tempPicName");
        return OooO0Oo(bitmap, file, tempPicName);
    }

    @Nullable
    public static String OooO0Oo(@NotNull Bitmap bitmap, @Nullable File file, @NotNull String tempPicName) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(tempPicName, "tempPicName");
        try {
            if (!StringsKt.OooO0o(tempPicName, ".")) {
                tempPicName = tempPicName + ".jpg";
            }
            File file2 = new File(file, tempPicName);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
